package aida.aida.test;

import com.aida.utils.MemoryCache;
import org.junit.Test;

import java.lang.ref.SoftReference;

/**
 * Created by fengdaqing on 2018/6/15.
 */
public class AppMemoryCache {
    @Test
    public void TestCache() throws Exception {
        MemoryCache.Set("daqing", 32);
        SoftReference<Integer> sfage = MemoryCache.Get("daqing");
        Integer age = sfage.get();
        Thread.sleep(3000);
        SoftReference<Integer> sfage1 = MemoryCache.Get("daqing");
        Integer age1 = sfage.get();
        Thread.sleep(6000);
    }
}
