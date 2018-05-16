package aida.aida.test;

import com.aida.util.rabbitmq.RabbitmqConsumer;
import com.aida.util.rabbitmq.RabbitmqProducer;


/**
 * Hello world!
 */
public class AppRabbitmq {

    public static String rqGetMessage(String message) {
        System.out.println(message);
        return message;
    }

    static void rqProducer() {
        try {
            RabbitmqProducer producer = new RabbitmqProducer("amqp://sc:Yiguo%40sc@172.17.7.207:5672/sc");
            producer.setExchange("ex_commodity");
            producer.setQueueName("queue_stock_test");
            producer.SendMessage("Hello World");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void rqComsumer() {
        try {
            RabbitmqConsumer producer = new RabbitmqConsumer("amqp://sc:Yiguo%40sc@172.17.7.207:5672/sc");
            producer.setExchange("ex_commodity");
            producer.setQueueName("queue_stock_test");
            producer.Receive(AppRabbitmq::rqGetMessage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void GenronateMessage() {
        for (Integer i = 0; i < 50; i++) {
            rqProducer();
        }
    }

    public static void main(String[] args) {
        GenronateMessage();
    }
}
