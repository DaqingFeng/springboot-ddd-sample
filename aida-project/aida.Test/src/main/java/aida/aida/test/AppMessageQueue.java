package aida.aida.test;


import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;


/**
 * Created by fengdaqing on 2018/2/1.
 */
public class AppMessageQueue {

    @Test
    public void TestQueue() {
        LinkedBlockingQueue<Message> blockqueue = new LinkedBlockingQueue<Message>();
        MessageContainer producer = new MessageContainer(blockqueue);
        producer.run();

        MessageExcute excute = new MessageExcute(blockqueue);
        excute.run();

    }
}
