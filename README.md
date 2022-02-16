# To create a new message

```bash
mvn compile exec:java -Dexec.mainClass=nyy.roar.jfl.poc.protobuf.StatusProtoKafkaWrite

```

# To read messages
```bash
mvn compile exec:java -Dexec.mainClass=nyy.roar.jfl.poc.protobuf.StatusProtoKafkaRead
```

# Changing .proto

If a change of schema is performed, the domain classes must be regenerated. this can be done with

```bash
protoc --java_out=...../src/main/java SfUPRNStatusResponse.proto
```

