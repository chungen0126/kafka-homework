package org.example;

import org.apache.kafka.clients.producer.*;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args){
        Parser parser = new Parser(args);
        ProducerJob pJob  = new ProducerJob(parser);
        String data = pJob.dataProvider(Parser.getRecordSize());
        Producer<String, String> producer = new KafkaProducer<>(pJob.getProp());
        for (int i = 0; i< Parser.getRecords(); i++){
            String key = String.format("key-%06d", i);
            String value = String.format("value-%06d", i);
            value+=data;
            producer.send(new ProducerRecord<>(parser.getTopic(), key, value));
        }
        producer.close();
    }
}
