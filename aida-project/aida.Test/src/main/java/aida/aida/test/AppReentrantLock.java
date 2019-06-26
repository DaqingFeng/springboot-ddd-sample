package aida.aida.test;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by fengdaqing on 2018/5/31.
 */
public class AppReentrantLock {
    private final ReentrantLock lock = new ReentrantLock(false   );
    private int count = 0;
    private static Object locks = new Object();

    @Test
    public void ReentrantLock() {
        StartJob();
    }

    public void StartJob() {
        Thread t1 = new Thread(() -> {
            while (count < 50) {
                getCount();
            }
        });


        Thread t2 = new Thread(() -> {
            while (count < 50) {
                getCount();
            }
        });

        t1.start();
        t2.start();
    }

    public int getCount() {
        // synchronized(locks ) {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " gets Count: " + count);
            return count++;
        } finally {
            lock.unlock();
        }
        //}
    }
}
