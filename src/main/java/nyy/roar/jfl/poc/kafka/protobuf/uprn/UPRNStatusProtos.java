// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SfUPRNStatusResponse.proto

package nyy.roar.jfl.poc.kafka.protobuf.uprn;

public final class UPRNStatusProtos {
  private UPRNStatusProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_statusChange_StatusEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_statusChange_StatusEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_statusChange_Payload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_statusChange_Payload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SfUPRNStatusResponse.proto\022\014statusChan" +
      "ge\032\037google/protobuf/timestamp.proto\"\234\001\n\013" +
      "StatusEvent\022\027\n\017message_type__c\030\001 \001(\t\022)\n\n" +
      "payload__c\030\002 \001(\0132\025.statusChange.Payload\022" +
      "1\n\revent_date__c\030\003 \001(\0132\032.google.protobuf" +
      ".Timestamp\022\026\n\016test_string__c\030\004 \001(\t\"\276\004\n\007P" +
      "ayload\022\014\n\004uprn\030\001 \001(\t\0224\n\nuprnStatus\030\002 \001(\016" +
      "2 .statusChange.Payload.UPRNStatus\022)\n\005da" +
      "te1\030\003 \001(\0132\032.google.protobuf.Timestamp\"\303\003" +
      "\n\nUPRNStatus\022\021\n\rSTART_ORDER_A\020\000\022\021\n\rSTART" +
      "_ORDER_B\020\001\022\021\n\rSTART_ORDER_C\020\002\022\'\n#REGISTE" +
      "R_INTEREST_COMMITTED_BUILD_A\020\003\022\'\n#REGIST" +
      "ER_INTEREST_COMMITTED_BUILD_B\020\004\022\'\n#REGIS" +
      "TER_INTEREST_COMMITTED_BUILD_C\020\005\022%\n!REGI" +
      "STER_INTEREST_COMMITTED_BUILD\020\006\022(\n$REGIS" +
      "TER_INTEREST_CONSTRUCTION_DELAY\020\007\022\026\n\022INV" +
      "ITED_TO_CALL_IN\020\010\022&\n\"REGISTER_INTEREST_L" +
      "IMITED_CAPACITY\020\t\022&\n\"REGISTER_INTEREST_O" +
      "NPLAN_WITH_DATE\020\n\022)\n%REGISTER_INTEREST_O" +
      "NPLAN_WITHOUT_DATE\020\013\022\035\n\031REGISTER_INTERES" +
      "T_OFFPLAN\020\014B:\n$nyy.roar.jfl.poc.kafka.pr" +
      "otobuf.uprnB\020UPRNStatusProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_statusChange_StatusEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_statusChange_StatusEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_statusChange_StatusEvent_descriptor,
        new java.lang.String[] { "MessageTypeC", "PayloadC", "EventDateC", "TestStringC", });
    internal_static_statusChange_Payload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_statusChange_Payload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_statusChange_Payload_descriptor,
        new java.lang.String[] { "Uprn", "UprnStatus", "Date1", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
