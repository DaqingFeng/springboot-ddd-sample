package com.aida.console;

import com.aida.util.rabbitmq.RabbitmqConsumer;
import com.aida.util.rabbitmq.RabbitmqProducer;

/**
 * Created by fengdaqing on 2018/2/24.
 */
public class App {
    public static String GetMessage(String message) {
        System.out.println(String.format("Received message : %s", message));
        return message;
    }

      static void Producer() {
        try {
            RabbitmqProducer producer = new RabbitmqProducer("amqp://sc:Yiguo%40sc@172.17.7.207:5672/sc");
            producer.setExchange("ex_commodity");
            producer.setQueueName("queue_stock_test");
            producer.SendMessage("Hello World");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

      static void Comsumer() {
        try {
            RabbitmqConsumer producer = new RabbitmqConsumer("amqp://sc:Yiguo%40sc@172.17.7.207:5672/sc");
            producer.setExchange("ex_commodity");
            producer.setQueueName("queue_stock_test");
            producer.Receive(App::GetMessage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Begin the Consumer");
        Comsumer();
    }
}
