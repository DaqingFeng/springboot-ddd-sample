package com.aida.util.rabbitmq;

import com.aida.utils.StringUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

/**
 * Created by fengdaqing on 2018/2/12.
 */
public class RabbitmqProducer extends RabbitmqBase {

    public RabbitmqProducer(String connStr) throws URISyntaxException, IOException, TimeoutException, NoSuchAlgorithmException, KeyManagementException {
        super(connStr);
    }

    public boolean SendMessage(String message) throws TimeoutException, IOException {
        boolean sendResult = false;
        if (StringUtil.isEmpty(this.RouteKey)) {
            this.RouteKey = this.QueueName;
        }
        try {
            if (Connfactory != null) {
                Connection conn = Connfactory.newConnection();
                Channel channel = conn.createChannel();
                channel.exchangeDeclare(this.Exchange, BuiltinExchangeType.DIRECT, true);
                channel.queueDeclare(this.QueueName, true, false, false, null);
                channel.queueBind(this.QueueName, this.Exchange, this.RouteKey);
                channel.basicPublish(this.Exchange, this.RouteKey, null, message.getBytes());
                channel.close();
                conn.close();
                sendResult = true;
            }
        } catch (TimeoutException ex) {
            throw ex;
        } catch (IOException ex) {
            throw ex;
        }
        return sendResult;
    }
}
