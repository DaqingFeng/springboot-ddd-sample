package com.aida.util.rabbitmq;

import com.aida.utils.StringUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/**
 * Created by fengdaqing on 2018/2/12.
 */
public class RabbitmqConsumer extends RabbitmqBase {

    public RabbitmqConsumer(String connectStr) throws URISyntaxException, IOException, TimeoutException, NoSuchAlgorithmException, KeyManagementException {
        super(connectStr);
    }

    public void Receive(Function<String, String> received) throws IOException, TimeoutException {
        if (StringUtil.isEmpty(this.RouteKey)) {
            this.RouteKey = this.QueueName;
        }
        if (Connfactory != null) {
            Connection conn = Connfactory.newConnection();
            Channel channel = conn.createChannel();
            channel.basicQos(1);
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                        throws IOException {
                    String message = new String(body, "UTF-8");
                    if (received != null) {
                        received.apply(message);
                    }
                }
            };
            channel.basicConsume(this.QueueName, true, consumer);
        }
    }
}
