package com.kafka_example.kafkaconsumer.Kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "wikimedia_topic",groupId = "myGroup")
    public void consumer(String eventMessage){
        System.out.println(eventMessage);
    }

}

