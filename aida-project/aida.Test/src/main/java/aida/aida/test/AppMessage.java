package aida.aida.test;


import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


/**
 * Created by fengdaqing on 2018/2/1.
 */
public class AppMessage {

    @Test
    public void TestQueue() {
        try {
            BlockingQueue<Message> blockqueue = new ArrayBlockingQueue<Message>(5000);
            MessageContainer producer = new MessageContainer(blockqueue);
            producer.run();
            Thread.sleep(1000);
            MessageExcute excute = new MessageExcute(blockqueue);
            excute.run();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
