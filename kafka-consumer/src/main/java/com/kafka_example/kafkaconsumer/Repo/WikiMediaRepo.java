package com.kafka_example.kafkaconsumer.Repo;

import com.kafka_example.kafkaconsumer.Entity.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiMediaRepo extends JpaRepository<WikiMediaData,Long> {
}
