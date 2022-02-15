// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SfUPRNStatusResponse.proto

package nyy.roar.jfl.poc.kafka.protobuf.uprn;

/**
 * Protobuf type {@code statusChange.StatusEvent}
 */
public final class StatusEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:statusChange.StatusEvent)
    StatusEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatusEvent.newBuilder() to construct.
  private StatusEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatusEvent() {
    messageTypeC_ = "";
    testStringC_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatusEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StatusEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            messageTypeC_ = s;
            break;
          }
          case 18: {
            nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.Builder subBuilder = null;
            if (payloadC_ != null) {
              subBuilder = payloadC_.toBuilder();
            }
            payloadC_ = input.readMessage(nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(payloadC_);
              payloadC_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (eventDateC_ != null) {
              subBuilder = eventDateC_.toBuilder();
            }
            eventDateC_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(eventDateC_);
              eventDateC_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            testStringC_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return nyy.roar.jfl.poc.kafka.protobuf.uprn.UPRNStatusProtos.internal_static_statusChange_StatusEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return nyy.roar.jfl.poc.kafka.protobuf.uprn.UPRNStatusProtos.internal_static_statusChange_StatusEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent.class, nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent.Builder.class);
  }

  public static final int MESSAGE_TYPE__C_FIELD_NUMBER = 1;
  private volatile java.lang.Object messageTypeC_;
  /**
   * <code>string message_type__c = 1;</code>
   * @return The messageTypeC.
   */
  @java.lang.Override
  public java.lang.String getMessageTypeC() {
    java.lang.Object ref = messageTypeC_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageTypeC_ = s;
      return s;
    }
  }
  /**
   * <code>string message_type__c = 1;</code>
   * @return The bytes for messageTypeC.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageTypeCBytes() {
    java.lang.Object ref = messageTypeC_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageTypeC_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD__C_FIELD_NUMBER = 2;
  private nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload payloadC_;
  /**
   * <code>.statusChange.Payload payload__c = 2;</code>
   * @return Whether the payloadC field is set.
   */
  @java.lang.Override
  public boolean hasPayloadC() {
    return payloadC_ != null;
  }
  /**
   * <code>.statusChange.Payload payload__c = 2;</code>
   * @return The payloadC.
   */
  @java.lang.Override
  public nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload getPayloadC() {
    return payloadC_ == null ? nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.getDefaultInstance() : payloadC_;
  }
  /**
   * <code>.statusChange.Payload payload__c = 2;</code>
   */
  @java.lang.Override
  public nyy.roar.jfl.poc.kafka.protobuf.uprn.PayloadOrBuilder getPayloadCOrBuilder() {
    return getPayloadC();
  }

  public static final int EVENT_DATE__C_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp eventDateC_;
  /**
   * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
   * @return Whether the eventDateC field is set.
   */
  @java.lang.Override
  public boolean hasEventDateC() {
    return eventDateC_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
   * @return The eventDateC.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEventDateC() {
    return eventDateC_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : eventDateC_;
  }
  /**
   * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEventDateCOrBuilder() {
    return getEventDateC();
  }

  public static final int TEST_STRING__C_FIELD_NUMBER = 4;
  private volatile java.lang.Object testStringC_;
  /**
   * <code>string test_string__c = 4;</code>
   * @return The testStringC.
   */
  @java.lang.Override
  public java.lang.String getTestStringC() {
    java.lang.Object ref = testStringC_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testStringC_ = s;
      return s;
    }
  }
  /**
   * <code>string test_string__c = 4;</code>
   * @return The bytes for testStringC.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTestStringCBytes() {
    java.lang.Object ref = testStringC_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      testStringC_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageTypeC_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageTypeC_);
    }
    if (payloadC_ != null) {
      output.writeMessage(2, getPayloadC());
    }
    if (eventDateC_ != null) {
      output.writeMessage(3, getEventDateC());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testStringC_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, testStringC_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageTypeC_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, messageTypeC_);
    }
    if (payloadC_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPayloadC());
    }
    if (eventDateC_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEventDateC());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(testStringC_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, testStringC_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent)) {
      return super.equals(obj);
    }
    nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent other = (nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent) obj;

    if (!getMessageTypeC()
        .equals(other.getMessageTypeC())) return false;
    if (hasPayloadC() != other.hasPayloadC()) return false;
    if (hasPayloadC()) {
      if (!getPayloadC()
          .equals(other.getPayloadC())) return false;
    }
    if (hasEventDateC() != other.hasEventDateC()) return false;
    if (hasEventDateC()) {
      if (!getEventDateC()
          .equals(other.getEventDateC())) return false;
    }
    if (!getTestStringC()
        .equals(other.getTestStringC())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_TYPE__C_FIELD_NUMBER;
    hash = (53 * hash) + getMessageTypeC().hashCode();
    if (hasPayloadC()) {
      hash = (37 * hash) + PAYLOAD__C_FIELD_NUMBER;
      hash = (53 * hash) + getPayloadC().hashCode();
    }
    if (hasEventDateC()) {
      hash = (37 * hash) + EVENT_DATE__C_FIELD_NUMBER;
      hash = (53 * hash) + getEventDateC().hashCode();
    }
    hash = (37 * hash) + TEST_STRING__C_FIELD_NUMBER;
    hash = (53 * hash) + getTestStringC().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code statusChange.StatusEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:statusChange.StatusEvent)
      nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return nyy.roar.jfl.poc.kafka.protobuf.uprn.UPRNStatusProtos.internal_static_statusChange_StatusEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return nyy.roar.jfl.poc.kafka.protobuf.uprn.UPRNStatusProtos.internal_static_statusChange_StatusEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent.class, nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent.Builder.class);
    }

    // Construct using nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      messageTypeC_ = "";

      if (payloadCBuilder_ == null) {
        payloadC_ = null;
      } else {
        payloadC_ = null;
        payloadCBuilder_ = null;
      }
      if (eventDateCBuilder_ == null) {
        eventDateC_ = null;
      } else {
        eventDateC_ = null;
        eventDateCBuilder_ = null;
      }
      testStringC_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return nyy.roar.jfl.poc.kafka.protobuf.uprn.UPRNStatusProtos.internal_static_statusChange_StatusEvent_descriptor;
    }

    @java.lang.Override
    public nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent getDefaultInstanceForType() {
      return nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent.getDefaultInstance();
    }

    @java.lang.Override
    public nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent build() {
      nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent buildPartial() {
      nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent result = new nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent(this);
      result.messageTypeC_ = messageTypeC_;
      if (payloadCBuilder_ == null) {
        result.payloadC_ = payloadC_;
      } else {
        result.payloadC_ = payloadCBuilder_.build();
      }
      if (eventDateCBuilder_ == null) {
        result.eventDateC_ = eventDateC_;
      } else {
        result.eventDateC_ = eventDateCBuilder_.build();
      }
      result.testStringC_ = testStringC_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent) {
        return mergeFrom((nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent other) {
      if (other == nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent.getDefaultInstance()) return this;
      if (!other.getMessageTypeC().isEmpty()) {
        messageTypeC_ = other.messageTypeC_;
        onChanged();
      }
      if (other.hasPayloadC()) {
        mergePayloadC(other.getPayloadC());
      }
      if (other.hasEventDateC()) {
        mergeEventDateC(other.getEventDateC());
      }
      if (!other.getTestStringC().isEmpty()) {
        testStringC_ = other.testStringC_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object messageTypeC_ = "";
    /**
     * <code>string message_type__c = 1;</code>
     * @return The messageTypeC.
     */
    public java.lang.String getMessageTypeC() {
      java.lang.Object ref = messageTypeC_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageTypeC_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message_type__c = 1;</code>
     * @return The bytes for messageTypeC.
     */
    public com.google.protobuf.ByteString
        getMessageTypeCBytes() {
      java.lang.Object ref = messageTypeC_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageTypeC_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message_type__c = 1;</code>
     * @param value The messageTypeC to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTypeC(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageTypeC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message_type__c = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageTypeC() {
      
      messageTypeC_ = getDefaultInstance().getMessageTypeC();
      onChanged();
      return this;
    }
    /**
     * <code>string message_type__c = 1;</code>
     * @param value The bytes for messageTypeC to set.
     * @return This builder for chaining.
     */
    public Builder setMessageTypeCBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageTypeC_ = value;
      onChanged();
      return this;
    }

    private nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload payloadC_;
    private com.google.protobuf.SingleFieldBuilderV3<
        nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload, nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.Builder, nyy.roar.jfl.poc.kafka.protobuf.uprn.PayloadOrBuilder> payloadCBuilder_;
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     * @return Whether the payloadC field is set.
     */
    public boolean hasPayloadC() {
      return payloadCBuilder_ != null || payloadC_ != null;
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     * @return The payloadC.
     */
    public nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload getPayloadC() {
      if (payloadCBuilder_ == null) {
        return payloadC_ == null ? nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.getDefaultInstance() : payloadC_;
      } else {
        return payloadCBuilder_.getMessage();
      }
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     */
    public Builder setPayloadC(nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload value) {
      if (payloadCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payloadC_ = value;
        onChanged();
      } else {
        payloadCBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     */
    public Builder setPayloadC(
        nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.Builder builderForValue) {
      if (payloadCBuilder_ == null) {
        payloadC_ = builderForValue.build();
        onChanged();
      } else {
        payloadCBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     */
    public Builder mergePayloadC(nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload value) {
      if (payloadCBuilder_ == null) {
        if (payloadC_ != null) {
          payloadC_ =
            nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.newBuilder(payloadC_).mergeFrom(value).buildPartial();
        } else {
          payloadC_ = value;
        }
        onChanged();
      } else {
        payloadCBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     */
    public Builder clearPayloadC() {
      if (payloadCBuilder_ == null) {
        payloadC_ = null;
        onChanged();
      } else {
        payloadC_ = null;
        payloadCBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     */
    public nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.Builder getPayloadCBuilder() {
      
      onChanged();
      return getPayloadCFieldBuilder().getBuilder();
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     */
    public nyy.roar.jfl.poc.kafka.protobuf.uprn.PayloadOrBuilder getPayloadCOrBuilder() {
      if (payloadCBuilder_ != null) {
        return payloadCBuilder_.getMessageOrBuilder();
      } else {
        return payloadC_ == null ?
            nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.getDefaultInstance() : payloadC_;
      }
    }
    /**
     * <code>.statusChange.Payload payload__c = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload, nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.Builder, nyy.roar.jfl.poc.kafka.protobuf.uprn.PayloadOrBuilder> 
        getPayloadCFieldBuilder() {
      if (payloadCBuilder_ == null) {
        payloadCBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload, nyy.roar.jfl.poc.kafka.protobuf.uprn.Payload.Builder, nyy.roar.jfl.poc.kafka.protobuf.uprn.PayloadOrBuilder>(
                getPayloadC(),
                getParentForChildren(),
                isClean());
        payloadC_ = null;
      }
      return payloadCBuilder_;
    }

    private com.google.protobuf.Timestamp eventDateC_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> eventDateCBuilder_;
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     * @return Whether the eventDateC field is set.
     */
    public boolean hasEventDateC() {
      return eventDateCBuilder_ != null || eventDateC_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     * @return The eventDateC.
     */
    public com.google.protobuf.Timestamp getEventDateC() {
      if (eventDateCBuilder_ == null) {
        return eventDateC_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : eventDateC_;
      } else {
        return eventDateCBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     */
    public Builder setEventDateC(com.google.protobuf.Timestamp value) {
      if (eventDateCBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eventDateC_ = value;
        onChanged();
      } else {
        eventDateCBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     */
    public Builder setEventDateC(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (eventDateCBuilder_ == null) {
        eventDateC_ = builderForValue.build();
        onChanged();
      } else {
        eventDateCBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     */
    public Builder mergeEventDateC(com.google.protobuf.Timestamp value) {
      if (eventDateCBuilder_ == null) {
        if (eventDateC_ != null) {
          eventDateC_ =
            com.google.protobuf.Timestamp.newBuilder(eventDateC_).mergeFrom(value).buildPartial();
        } else {
          eventDateC_ = value;
        }
        onChanged();
      } else {
        eventDateCBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     */
    public Builder clearEventDateC() {
      if (eventDateCBuilder_ == null) {
        eventDateC_ = null;
        onChanged();
      } else {
        eventDateC_ = null;
        eventDateCBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEventDateCBuilder() {
      
      onChanged();
      return getEventDateCFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEventDateCOrBuilder() {
      if (eventDateCBuilder_ != null) {
        return eventDateCBuilder_.getMessageOrBuilder();
      } else {
        return eventDateC_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : eventDateC_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp event_date__c = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEventDateCFieldBuilder() {
      if (eventDateCBuilder_ == null) {
        eventDateCBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEventDateC(),
                getParentForChildren(),
                isClean());
        eventDateC_ = null;
      }
      return eventDateCBuilder_;
    }

    private java.lang.Object testStringC_ = "";
    /**
     * <code>string test_string__c = 4;</code>
     * @return The testStringC.
     */
    public java.lang.String getTestStringC() {
      java.lang.Object ref = testStringC_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testStringC_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string test_string__c = 4;</code>
     * @return The bytes for testStringC.
     */
    public com.google.protobuf.ByteString
        getTestStringCBytes() {
      java.lang.Object ref = testStringC_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testStringC_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string test_string__c = 4;</code>
     * @param value The testStringC to set.
     * @return This builder for chaining.
     */
    public Builder setTestStringC(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      testStringC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string test_string__c = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTestStringC() {
      
      testStringC_ = getDefaultInstance().getTestStringC();
      onChanged();
      return this;
    }
    /**
     * <code>string test_string__c = 4;</code>
     * @param value The bytes for testStringC to set.
     * @return This builder for chaining.
     */
    public Builder setTestStringCBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      testStringC_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:statusChange.StatusEvent)
  }

  // @@protoc_insertion_point(class_scope:statusChange.StatusEvent)
  private static final nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent();
  }

  public static nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusEvent>
      PARSER = new com.google.protobuf.AbstractParser<StatusEvent>() {
    @java.lang.Override
    public StatusEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StatusEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StatusEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public nyy.roar.jfl.poc.kafka.protobuf.uprn.StatusEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
