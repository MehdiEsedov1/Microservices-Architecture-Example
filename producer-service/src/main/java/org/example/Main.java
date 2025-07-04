package org.example;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Properties props = new Properties();
        props.put("bootstrap.servers", "kafka:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        while (true) {
            ProducerRecord<String, String> record = new ProducerRecord<>("demo-topic", "Hello from Java Producer");
            producer.send(record);
            System.out.println("Sent message");
            Thread.sleep(1000);
        }
    }
}
