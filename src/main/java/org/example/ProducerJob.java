package org.example;

import org.apache.kafka.clients.producer.ProducerConfig;


import java.util.Properties;
public class ProducerJob {
    private static Properties prop = new Properties();
    ProducerJob(Parser parser){
        prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, parser.getBroker());
        prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer");
        prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer");
    }
    public static Properties getProp(){
        return prop;
    }
    public static String dataProvider(int recordSize){
        String input = "";
        for (int i=0;i<recordSize;i++){
            input+='a';
        }
        return input;
    }
}
