/*
 * Copyright (c) 2022. Nowyoyo Ltd
 */

package nyy.roar.jfl.poc.protobuf;

import com.google.protobuf.Message;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;

import java.util.Map;

public class CustomDeserializer<T extends Message> extends KafkaProtobufDeserializer<T> {

  public CustomDeserializer() {
  }

  public CustomDeserializer(SchemaRegistryClient client) {
    super(client);
  }

  public CustomDeserializer(SchemaRegistryClient client, Map<String, ?> props) {
    super(client, props, null);
  }

  @Override
  public T deserialize(String s, byte[] bytes) {
    try {
      return deserialize(bytes);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}
