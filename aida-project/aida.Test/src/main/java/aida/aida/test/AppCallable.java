package aida.aida.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by fengdaqing on 2018/1/31.
 */
public class AppCallable {

    @Test
    public void  callAbleTest() {
        ExecutorService service = Executors.newFixedThreadPool(4);
        List<Future> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            Integer number = random.nextInt(10);
            FactorialCalculator calculator = new FactorialCalculator(number);
            Future result = service.submit(calculator);
            resultList.add(result);
        }

        for (Future future : resultList) {
            try {
                Object rst = future.get();
                if (rst instanceof Integer) {
                    System.out.println("Is Integer");
                }
                System.out.println(String.format("Calculate! %s", rst));
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        boolean isFinished = true;
        //shut down the executor service no
        System.out.println("Hello World!");
    }
}
