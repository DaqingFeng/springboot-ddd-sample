package aida.aida.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by fengdaqing on 2018/1/31.
 */

public class AppRunableTest {

    @Test
    public void TestRunable() {
        List<Double> arraylst = new ArrayList();
        arraylst.add(10.0);
        arraylst.add(11.1);
        Iterator<Double> it = arraylst.iterator();
        while (it.hasNext()) {
            double i = it.next();
            System.out.print(i);
            it.remove();
        }

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        List<ScheduledFuture> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            Integer number = random.nextInt(10);
            List<Integer> excuteList = new ArrayList<>();
            for (int itemindex = 0; itemindex < number; itemindex++) {
                excuteList.add(itemindex);
            }
            FactorialRunable calculator = new FactorialRunable(excuteList);
            ScheduledFuture result = executor.schedule(calculator, 5, TimeUnit.SECONDS);
            resultList.add(result);
        }

        while (true) {
            boolean isOk = true;
            Integer index = 0;
            do {
                ScheduledFuture future = resultList.get(index);
                if (!future.isDone() && !future.isCancelled()) {
                    isOk = false;
                }
                index++;
            } while (index < resultList.size());

            if (isOk) {
                System.out.println("Finished  Job!");
                break;
            }
        }
        System.out.println("Hello World!");
    }
}
