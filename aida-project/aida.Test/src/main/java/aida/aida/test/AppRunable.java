package aida.aida.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by fengdaqing on 2018/1/31.
 */
public class AppRunable {
    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        List<ScheduledFuture> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            Integer number = random.nextInt(10);
            List<Integer> excuteList = new ArrayList<>();
            for (int itemindex = 0; itemindex < number; itemindex++) {
                excuteList.add(itemindex);
            }
            FactoriaRunable calculator = new FactoriaRunable(excuteList);
            ScheduledFuture result = executor.schedule(calculator, 0, TimeUnit.SECONDS);
            resultList.add(result);
        }

        while (true) {
            boolean isOk = true;
            Integer index=0;
            do   {
                ScheduledFuture  future= resultList.get(index);
                if (!future.isDone() && !future.isCancelled()) {
                    isOk = false;
                }
                index++;
            } while (index<resultList.size());

            if (isOk) {
                System.out.println("Finished  Job!");
                break;
            }
        }
        System.out.println("Hello World!");
    }
}
