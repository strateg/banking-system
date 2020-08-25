package eu.dmpr.modularbank.bankingsystem.reportservice;

import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {

    //@RabbitListener(queues="${rabbitmq.queueName}")
    public void listen(byte[] message) {
        String msg = new String(message);
        System.out.println("Received a new notification...");
        System.out.println(new String(message));
    }
}
