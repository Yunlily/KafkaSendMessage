package com.insight.yunly.kafka;


//Test Kafka Java API

public class KafkaClientApp {

    public static void main(String[] args){
        new KafkaProducer(KafkaProperties.TOPIC).start();
    }

}
