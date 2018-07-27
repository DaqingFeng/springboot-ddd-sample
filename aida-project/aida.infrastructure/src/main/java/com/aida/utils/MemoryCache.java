package com.aida.utils;

import org.springframework.util.StringUtils;

import java.lang.ref.SoftReference;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by fengdaqing on 2018/6/15.
 */
public class MemoryCache {

    public static long Default_Expire_Seconds = 5;

    private static final ReentrantLock lock = new ReentrantLock();

    private static ConcurrentHashMap<String, CachedItem> cache = new ConcurrentHashMap<>();

    public static void Set(String key, Object value) throws Exception {
        Set(key, value, Default_Expire_Seconds);
    }

    public static void Set(String key, Object value, long expireMinutes) throws Exception {
        if (StringUtils.isEmpty(key)) {
            throw new NoSuchFieldException("key");
        }
        long timegap = Default_Expire_Seconds;
        if (expireMinutes > 0) {
            timegap = expireMinutes;
        }
        LocalDateTime currentDateTime = LocalDateTime.now().plusSeconds(timegap);
        cache.putIfAbsent(key, new CachedItem(new SoftReference(value), currentDateTime));
        StartMaintenance();
    }

    public static <T> T Get(String key) {
        T result = null;
        CachedItem item = cache.get(key);
        if (item != null && item.getUpdated().compareTo(LocalDateTime.now()) > 0) {
            Object obj = item.getData();
            if (obj != null) {
                result = (T) obj;
            }
        }
        return result;
    }

    private static Timer timer;
    private static Object locks = new Object();

    private static void StartMaintenance() {
        if (timer == null) {
            synchronized (locks) {
                if (timer == null) {
                    timer = new Timer("maintenanceMemoryCache");
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            ExcuteMaintenance();
                        }
                    }, 1000, 1000);
                }
            }
        }
    }

    private static void ExcuteMaintenance() {
        try {
            lock.lock();
            List<String> keys = new ArrayList<>();
            cache.forEach((k, v) -> {
                if (LocalDateTime.now().compareTo(v.getUpdated()) > 0) {
                    keys.add(k);
                }
            });
            for (String key : keys) {
                cache.remove(key);
            }
        } finally {
            lock.unlock();
        }
    }
}

class CachedItem {

    private LocalDateTime updated;

    private Object data;

    public LocalDateTime getUpdated() {
        return updated;
    }

    public Object getData() {
        return data;
    }

    public CachedItem(Object data, LocalDateTime updated) {
        this.updated = updated;
        this.data = data;
    }
}