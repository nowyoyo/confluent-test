/*
 * Copyright (c) 2022. Nowyoyo Ltd
 */

package nyy.roar.jfl.poc.protobuf;

import com.google.protobuf.Timestamp;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload;
import nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class StatusProtoKafkaWrite {

  public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
    final Properties props = new Properties();

    String topic = "jfl_protobuf_test";
    props.put("bootstrap.servers","pkc-41wq6.eu-west-2.aws.confluent.cloud:9092");
    props.put("security.protocol","SASL_SSL");
    props.put("sasl.jaas.config","org.apache.kafka.common.security.plain.PlainLoginModule   required username='ZTYYYORHH3FQBEFB'   password='WZ49sMZ99+VGLC1LniulKkAebuWPHuP6QuVygZjenNWUbTwIAEONPtOn+0AuK9kl';");
    props.put("sasl.mechanism","PLAIN");

    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProtobufSerializer.class);
    props.put("schema.registry.url", "https://psrc-o268o.eu-central-1.aws.confluent.cloud");
    props.put("basic.auth.credentials.source", "USER_INFO");
    props.put("basic.auth.user.info", "4LTH6SQJSIFBHEAW:WyxY07N1vMvEAQVUGZ4B8OvO5OgNsAoKhTMGQwUwTswZlsNX6FpysQvToJhJKZMP");

    props.put("auto.register.schemas", true);

    final Producer<String, StatusEvent> producer = new KafkaProducer<>(props);

    StatusEvent.Builder statusEvent = StatusEvent.newBuilder()
            .setMessageTypeC("UPDATE_UPRN")
            .setEventDateC(toGoogleTimestampUTC(LocalDateTime.now()))
            .setTestStringC("Test123")
            .setPayloadC(Payload.newBuilder()
                    .setUprnStatus(Payload.UPRNStatus.REGISTER_INTEREST_COMMITTED_BUILD_B)
                    .setUprn("123123123")
                    .setDate1(toGoogleTimestampUTC(LocalDate.now().plusMonths(3))).build()
            );

    RecordMetadata meta = producer.send(new ProducerRecord<>(topic, statusEvent.getPayloadC().getUprn(), statusEvent.build())).get();


    System.out.println("Created at Offset "+ meta.offset());

    producer.close();
    System.exit(0);
  }


  protected static Timestamp toGoogleTimestampUTC(final LocalDate localDate) {
    return toGoogleTimestampUTC(localDate.atTime(0, 0));
  }

  protected static Timestamp toGoogleTimestampUTC(final LocalDateTime localDateTime) {
    return Timestamp.newBuilder()
            .setSeconds(localDateTime.toEpochSecond(ZoneOffset.UTC))
            .setNanos(localDateTime.getNano())
            .build();
  }

}
