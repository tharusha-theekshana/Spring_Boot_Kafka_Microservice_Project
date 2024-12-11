package com.kafka_example.kafkaconsumer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "wiki_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WikiMediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String wikiEventData;
}
