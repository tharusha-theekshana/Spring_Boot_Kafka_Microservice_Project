package com.kafka_example.kafkaconsumer.Kafka;

import com.kafka_example.kafkaconsumer.Entity.WikiMediaData;
import com.kafka_example.kafkaconsumer.Repo.WikiMediaRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @Autowired
    private WikiMediaRepo wikiMediaRepo;

    @KafkaListener(topics = "wikimedia_topic",groupId = "myGroup")
    public void consumer(String eventMessage){
        System.out.println(eventMessage);

        WikiMediaData wikiMediaData = new WikiMediaData();
        wikiMediaData.setWikiEventData(eventMessage);

        wikiMediaRepo.save(wikiMediaData);
    }

}

