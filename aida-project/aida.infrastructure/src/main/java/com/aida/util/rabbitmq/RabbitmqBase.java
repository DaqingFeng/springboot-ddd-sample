package com.aida.util.rabbitmq;

import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

/**
 * Created by fengdaqing on 2018/2/12.
 */
public class RabbitmqBase {

    protected ConnectionFactory Connfactory;

    protected String Connection;

    protected String Exchange;

    protected String QueueName;

    protected String RouteKey;

    public String getConnection() {
        return Connection;
    }

    public void setConnection(String connection) {
        Connection = connection;
    }

    public String getRouteKey() {
        return RouteKey;
    }

    public void setRouteKey(String routeKey) {
        RouteKey = routeKey;
    }


    public String getExchange() {
        return Exchange;
    }

    public void setExchange(String exchange) {
        Exchange = exchange;
    }

    public String getQueueName() {
        return QueueName;
    }

    public void setQueueName(String queueName) {
        QueueName = queueName;
    }

    public ConnectionFactory getConnfactory() {
        return Connfactory;
    }

    public RabbitmqBase() {

    }

    public RabbitmqBase(String connString) throws NoSuchAlgorithmException,
            KeyManagementException,
            URISyntaxException, IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setAutomaticRecoveryEnabled(false);
        factory.setUri(connString);
        Connfactory = factory;
    }

    public RabbitmqBase(String connString, String exchange, String queue)
            throws URISyntaxException, IOException, TimeoutException, NoSuchAlgorithmException, KeyManagementException {
        this(connString);
        this.Exchange = exchange;
        this.QueueName = queue;
    }

    public RabbitmqBase(String connString, String exchange, String queue, String routeKey)
            throws URISyntaxException, IOException, TimeoutException, NoSuchAlgorithmException, KeyManagementException {
        this(connString);
        this.Exchange = exchange;
        this.QueueName = queue;
        this.RouteKey = routeKey;
    }


}
