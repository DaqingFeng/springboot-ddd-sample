package aida.aida.test;

import java.util.concurrent.BlockingQueue;

/**
 * Created by fengdaqing on 2018/2/1.
 */
public class MessageContainer implements  Runnable {

    private BlockingQueue<Message>  queue;
    public  MessageContainer(BlockingQueue<Message>  messageQueue)
    {
        queue=messageQueue;
    }
    
    @Override
    public void run() {
        //produce messages
        for(int i=0; i<3; i++){
            Message msg = new Message(""+i);
            try {
                queue.put(msg);
                System.out.println("Produced "+msg.getContent());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //adding exit message
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
