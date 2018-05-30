package aida.aida.test;

import java.util.concurrent.BlockingQueue;

/**
 * Created by fengdaqing on 2018/2/1.
 */
public class MessageExcute implements Runnable {

    private BlockingQueue<Message> queue;

    public MessageExcute(BlockingQueue<Message> messageQueue) {
        queue = messageQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                while (!queue.isEmpty()) {
                    try {
                        Message msg = queue.take();
                        System.out.println(msg.getContent());
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
