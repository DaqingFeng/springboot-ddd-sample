package aida.aida.test;

import org.junit.Test;

import java.util.concurrent.DelayQueue;

/**
 * Created by fengdaqing on 2018/6/5.
 */
public class AppDelayQueue {
    @Test
    public void DelayQueue() {
        try {
            DelayQueue<DelayQueuePaper> delayQueue = new DelayQueue<DelayQueuePaper>();
            delayQueue.add(new DelayQueuePaper(2000, "Hello"));
            delayQueue.add(new DelayQueuePaper(5000, "World"));
            while (true) {
                DelayQueuePaper item = delayQueue.take();
                System.out.println(item.GetMessageBody());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
