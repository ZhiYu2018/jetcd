// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.etcd.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.DeleteRangeRequest}
 */
public  final class DeleteRangeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.DeleteRangeRequest)
    DeleteRangeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRangeRequest.newBuilder() to construct.
  private DeleteRangeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRangeRequest() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    rangeEnd_ = com.google.protobuf.ByteString.EMPTY;
    prevKv_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteRangeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            key_ = input.readBytes();
            break;
          }
          case 18: {

            rangeEnd_ = input.readBytes();
            break;
          }
          case 24: {

            prevKv_ = input.readBool();
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
    return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_DeleteRangeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_DeleteRangeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.etcd.jetcd.api.DeleteRangeRequest.class, io.etcd.jetcd.api.DeleteRangeRequest.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * key is the first key to delete in the range.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int RANGE_END_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString rangeEnd_;
  /**
   * <pre>
   * range_end is the key following the last key to delete for the range [key, range_end).
   * If range_end is not given, the range is defined to contain only the key argument.
   * If range_end is one bit larger than the given key, then the range is all the keys
   * with the prefix (the given key).
   * If range_end is '&#92;0', the range is all keys greater than or equal to the key argument.
   * </pre>
   *
   * <code>bytes range_end = 2;</code>
   */
  public com.google.protobuf.ByteString getRangeEnd() {
    return rangeEnd_;
  }

  public static final int PREV_KV_FIELD_NUMBER = 3;
  private boolean prevKv_;
  /**
   * <pre>
   * If prev_kv is set, etcd gets the previous key-value pairs before deleting it.
   * The previous key-value pairs will be returned in the delete response.
   * </pre>
   *
   * <code>bool prev_kv = 3;</code>
   */
  public boolean getPrevKv() {
    return prevKv_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (!rangeEnd_.isEmpty()) {
      output.writeBytes(2, rangeEnd_);
    }
    if (prevKv_ != false) {
      output.writeBool(3, prevKv_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (!rangeEnd_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, rangeEnd_);
    }
    if (prevKv_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, prevKv_);
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
    if (!(obj instanceof io.etcd.jetcd.api.DeleteRangeRequest)) {
      return super.equals(obj);
    }
    io.etcd.jetcd.api.DeleteRangeRequest other = (io.etcd.jetcd.api.DeleteRangeRequest) obj;

    boolean result = true;
    result = result && getKey()
        .equals(other.getKey());
    result = result && getRangeEnd()
        .equals(other.getRangeEnd());
    result = result && (getPrevKv()
        == other.getPrevKv());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + RANGE_END_FIELD_NUMBER;
    hash = (53 * hash) + getRangeEnd().hashCode();
    hash = (37 * hash) + PREV_KV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPrevKv());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.etcd.jetcd.api.DeleteRangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.etcd.jetcd.api.DeleteRangeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code etcdserverpb.DeleteRangeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.DeleteRangeRequest)
      io.etcd.jetcd.api.DeleteRangeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_DeleteRangeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_DeleteRangeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.etcd.jetcd.api.DeleteRangeRequest.class, io.etcd.jetcd.api.DeleteRangeRequest.Builder.class);
    }

    // Construct using io.etcd.jetcd.api.DeleteRangeRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      key_ = com.google.protobuf.ByteString.EMPTY;

      rangeEnd_ = com.google.protobuf.ByteString.EMPTY;

      prevKv_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_DeleteRangeRequest_descriptor;
    }

    public io.etcd.jetcd.api.DeleteRangeRequest getDefaultInstanceForType() {
      return io.etcd.jetcd.api.DeleteRangeRequest.getDefaultInstance();
    }

    public io.etcd.jetcd.api.DeleteRangeRequest build() {
      io.etcd.jetcd.api.DeleteRangeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.etcd.jetcd.api.DeleteRangeRequest buildPartial() {
      io.etcd.jetcd.api.DeleteRangeRequest result = new io.etcd.jetcd.api.DeleteRangeRequest(this);
      result.key_ = key_;
      result.rangeEnd_ = rangeEnd_;
      result.prevKv_ = prevKv_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.etcd.jetcd.api.DeleteRangeRequest) {
        return mergeFrom((io.etcd.jetcd.api.DeleteRangeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.etcd.jetcd.api.DeleteRangeRequest other) {
      if (other == io.etcd.jetcd.api.DeleteRangeRequest.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getRangeEnd() != com.google.protobuf.ByteString.EMPTY) {
        setRangeEnd(other.getRangeEnd());
      }
      if (other.getPrevKv() != false) {
        setPrevKv(other.getPrevKv());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.etcd.jetcd.api.DeleteRangeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.etcd.jetcd.api.DeleteRangeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * key is the first key to delete in the range.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * key is the first key to delete in the range.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key is the first key to delete in the range.
     * </pre>
     *
     * <code>bytes key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString rangeEnd_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * range_end is the key following the last key to delete for the range [key, range_end).
     * If range_end is not given, the range is defined to contain only the key argument.
     * If range_end is one bit larger than the given key, then the range is all the keys
     * with the prefix (the given key).
     * If range_end is '&#92;0', the range is all keys greater than or equal to the key argument.
     * </pre>
     *
     * <code>bytes range_end = 2;</code>
     */
    public com.google.protobuf.ByteString getRangeEnd() {
      return rangeEnd_;
    }
    /**
     * <pre>
     * range_end is the key following the last key to delete for the range [key, range_end).
     * If range_end is not given, the range is defined to contain only the key argument.
     * If range_end is one bit larger than the given key, then the range is all the keys
     * with the prefix (the given key).
     * If range_end is '&#92;0', the range is all keys greater than or equal to the key argument.
     * </pre>
     *
     * <code>bytes range_end = 2;</code>
     */
    public Builder setRangeEnd(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rangeEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * range_end is the key following the last key to delete for the range [key, range_end).
     * If range_end is not given, the range is defined to contain only the key argument.
     * If range_end is one bit larger than the given key, then the range is all the keys
     * with the prefix (the given key).
     * If range_end is '&#92;0', the range is all keys greater than or equal to the key argument.
     * </pre>
     *
     * <code>bytes range_end = 2;</code>
     */
    public Builder clearRangeEnd() {
      
      rangeEnd_ = getDefaultInstance().getRangeEnd();
      onChanged();
      return this;
    }

    private boolean prevKv_ ;
    /**
     * <pre>
     * If prev_kv is set, etcd gets the previous key-value pairs before deleting it.
     * The previous key-value pairs will be returned in the delete response.
     * </pre>
     *
     * <code>bool prev_kv = 3;</code>
     */
    public boolean getPrevKv() {
      return prevKv_;
    }
    /**
     * <pre>
     * If prev_kv is set, etcd gets the previous key-value pairs before deleting it.
     * The previous key-value pairs will be returned in the delete response.
     * </pre>
     *
     * <code>bool prev_kv = 3;</code>
     */
    public Builder setPrevKv(boolean value) {
      
      prevKv_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If prev_kv is set, etcd gets the previous key-value pairs before deleting it.
     * The previous key-value pairs will be returned in the delete response.
     * </pre>
     *
     * <code>bool prev_kv = 3;</code>
     */
    public Builder clearPrevKv() {
      
      prevKv_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.DeleteRangeRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.DeleteRangeRequest)
  private static final io.etcd.jetcd.api.DeleteRangeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.etcd.jetcd.api.DeleteRangeRequest();
  }

  public static io.etcd.jetcd.api.DeleteRangeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRangeRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRangeRequest>() {
    public DeleteRangeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteRangeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteRangeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRangeRequest> getParserForType() {
    return PARSER;
  }

  public io.etcd.jetcd.api.DeleteRangeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

