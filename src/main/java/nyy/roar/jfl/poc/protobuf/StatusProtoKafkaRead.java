/*
 * Copyright (c) 2022. Nowyoyo Ltd
 */

package nyy.roar.jfl.poc.protobuf;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Properties;

public class StatusProtoKafkaRead {

  public static void main(String[] args) {
    final Properties props = new Properties();
    final String groupId = "github-x-sf-08";


    String topic = "jfl_protobuf_test";
    props.put("bootstrap.servers", "pkc-41wq6.eu-west-2.aws.confluent.cloud:9092");
    props.put("security.protocol", "SASL_SSL");
    props.put("sasl.jaas.config", "org.apache.kafka.common.security.plain.PlainLoginModule   required username='ZTYYYORHH3FQBEFB'   password='WZ49sMZ99+VGLC1LniulKkAebuWPHuP6QuVygZjenNWUbTwIAEONPtOn+0AuK9kl';");
    props.put("sasl.mechanism", "PLAIN");


    props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
    props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, CustomDeserializer.class);
    props.put(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE, StatusEvent.class);
    props.put("schema.registry.url", "https://psrc-o268o.eu-central-1.aws.confluent.cloud");
    props.put("basic.auth.credentials.source", "USER_INFO");
    props.put("basic.auth.user.info", "4LTH6SQJSIFBHEAW:WyxY07N1vMvEAQVUGZ4B8OvO5OgNsAoKhTMGQwUwTswZlsNX6FpysQvToJhJKZMP");

    props.put("auto.register.schemas", false);

    try (KafkaConsumer<String, StatusEvent> consumer = new KafkaConsumer<>(props)) {

      consumer.subscribe(Collections.singletonList(topic));

      ConsumerRecords<String, StatusEvent> records = consumer.poll(Duration.of(2000, ChronoUnit.MILLIS));
      while (!records.isEmpty()) {

        records.forEach(record -> {
          StatusEvent statusEvent = record.value();
          if (statusEvent != null ) {
            System.out.println("Offset "+ record.offset() + " :  Received Record with UPRN " + statusEvent.getPayloadC().getUprn());
          }
        });

        consumer.commitAsync();
        records = consumer.poll(Duration.of(2000, ChronoUnit.MILLIS));

      }

    }

  }

}
