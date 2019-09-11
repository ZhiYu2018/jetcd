// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.etcd.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.RangeResponse}
 */
public  final class RangeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.RangeResponse)
    RangeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RangeResponse.newBuilder() to construct.
  private RangeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RangeResponse() {
    kvs_ = java.util.Collections.emptyList();
    more_ = false;
    count_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RangeResponse(
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
            io.etcd.jetcd.api.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(io.etcd.jetcd.api.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              kvs_ = new java.util.ArrayList<io.etcd.jetcd.api.KeyValue>();
              mutable_bitField0_ |= 0x00000002;
            }
            kvs_.add(
                input.readMessage(io.etcd.jetcd.api.KeyValue.parser(), extensionRegistry));
            break;
          }
          case 24: {

            more_ = input.readBool();
            break;
          }
          case 32: {

            count_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        kvs_ = java.util.Collections.unmodifiableList(kvs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_RangeResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_RangeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.etcd.jetcd.api.RangeResponse.class, io.etcd.jetcd.api.RangeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private io.etcd.jetcd.api.ResponseHeader header_;
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public io.etcd.jetcd.api.ResponseHeader getHeader() {
    return header_ == null ? io.etcd.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public io.etcd.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int KVS_FIELD_NUMBER = 2;
  private java.util.List<io.etcd.jetcd.api.KeyValue> kvs_;
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  public java.util.List<io.etcd.jetcd.api.KeyValue> getKvsList() {
    return kvs_;
  }
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  public java.util.List<? extends io.etcd.jetcd.api.KeyValueOrBuilder> 
      getKvsOrBuilderList() {
    return kvs_;
  }
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  public int getKvsCount() {
    return kvs_.size();
  }
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  public io.etcd.jetcd.api.KeyValue getKvs(int index) {
    return kvs_.get(index);
  }
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  public io.etcd.jetcd.api.KeyValueOrBuilder getKvsOrBuilder(
      int index) {
    return kvs_.get(index);
  }

  public static final int MORE_FIELD_NUMBER = 3;
  private boolean more_;
  /**
   * <pre>
   * more indicates if there are more keys to return in the requested range.
   * </pre>
   *
   * <code>bool more = 3;</code>
   */
  public boolean getMore() {
    return more_;
  }

  public static final int COUNT_FIELD_NUMBER = 4;
  private long count_;
  /**
   * <pre>
   * count is set to the number of keys within the range when requested.
   * </pre>
   *
   * <code>int64 count = 4;</code>
   */
  public long getCount() {
    return count_;
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < kvs_.size(); i++) {
      output.writeMessage(2, kvs_.get(i));
    }
    if (more_ != false) {
      output.writeBool(3, more_);
    }
    if (count_ != 0L) {
      output.writeInt64(4, count_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < kvs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, kvs_.get(i));
    }
    if (more_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, more_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, count_);
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
    if (!(obj instanceof io.etcd.jetcd.api.RangeResponse)) {
      return super.equals(obj);
    }
    io.etcd.jetcd.api.RangeResponse other = (io.etcd.jetcd.api.RangeResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getKvsList()
        .equals(other.getKvsList());
    result = result && (getMore()
        == other.getMore());
    result = result && (getCount()
        == other.getCount());
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getKvsCount() > 0) {
      hash = (37 * hash) + KVS_FIELD_NUMBER;
      hash = (53 * hash) + getKvsList().hashCode();
    }
    hash = (37 * hash) + MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMore());
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.etcd.jetcd.api.RangeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.etcd.jetcd.api.RangeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.etcd.jetcd.api.RangeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.etcd.jetcd.api.RangeResponse parseFrom(
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
  public static Builder newBuilder(io.etcd.jetcd.api.RangeResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.RangeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.RangeResponse)
      io.etcd.jetcd.api.RangeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_RangeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_RangeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.etcd.jetcd.api.RangeResponse.class, io.etcd.jetcd.api.RangeResponse.Builder.class);
    }

    // Construct using io.etcd.jetcd.api.RangeResponse.newBuilder()
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
        getKvsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        kvsBuilder_.clear();
      }
      more_ = false;

      count_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.etcd.jetcd.api.JetcdProto.internal_static_etcdserverpb_RangeResponse_descriptor;
    }

    public io.etcd.jetcd.api.RangeResponse getDefaultInstanceForType() {
      return io.etcd.jetcd.api.RangeResponse.getDefaultInstance();
    }

    public io.etcd.jetcd.api.RangeResponse build() {
      io.etcd.jetcd.api.RangeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.etcd.jetcd.api.RangeResponse buildPartial() {
      io.etcd.jetcd.api.RangeResponse result = new io.etcd.jetcd.api.RangeResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (kvsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          kvs_ = java.util.Collections.unmodifiableList(kvs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.kvs_ = kvs_;
      } else {
        result.kvs_ = kvsBuilder_.build();
      }
      result.more_ = more_;
      result.count_ = count_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.etcd.jetcd.api.RangeResponse) {
        return mergeFrom((io.etcd.jetcd.api.RangeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.etcd.jetcd.api.RangeResponse other) {
      if (other == io.etcd.jetcd.api.RangeResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (kvsBuilder_ == null) {
        if (!other.kvs_.isEmpty()) {
          if (kvs_.isEmpty()) {
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureKvsIsMutable();
            kvs_.addAll(other.kvs_);
          }
          onChanged();
        }
      } else {
        if (!other.kvs_.isEmpty()) {
          if (kvsBuilder_.isEmpty()) {
            kvsBuilder_.dispose();
            kvsBuilder_ = null;
            kvs_ = other.kvs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            kvsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKvsFieldBuilder() : null;
          } else {
            kvsBuilder_.addAllMessages(other.kvs_);
          }
        }
      }
      if (other.getMore() != false) {
        setMore(other.getMore());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
      io.etcd.jetcd.api.RangeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.etcd.jetcd.api.RangeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.etcd.jetcd.api.ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.etcd.jetcd.api.ResponseHeader, io.etcd.jetcd.api.ResponseHeader.Builder, io.etcd.jetcd.api.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public io.etcd.jetcd.api.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? io.etcd.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(io.etcd.jetcd.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        io.etcd.jetcd.api.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(io.etcd.jetcd.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            io.etcd.jetcd.api.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public io.etcd.jetcd.api.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public io.etcd.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            io.etcd.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.etcd.jetcd.api.ResponseHeader, io.etcd.jetcd.api.ResponseHeader.Builder, io.etcd.jetcd.api.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.etcd.jetcd.api.ResponseHeader, io.etcd.jetcd.api.ResponseHeader.Builder, io.etcd.jetcd.api.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<io.etcd.jetcd.api.KeyValue> kvs_ =
      java.util.Collections.emptyList();
    private void ensureKvsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        kvs_ = new java.util.ArrayList<io.etcd.jetcd.api.KeyValue>(kvs_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.etcd.jetcd.api.KeyValue, io.etcd.jetcd.api.KeyValue.Builder, io.etcd.jetcd.api.KeyValueOrBuilder> kvsBuilder_;

    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public java.util.List<io.etcd.jetcd.api.KeyValue> getKvsList() {
      if (kvsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(kvs_);
      } else {
        return kvsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public int getKvsCount() {
      if (kvsBuilder_ == null) {
        return kvs_.size();
      } else {
        return kvsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public io.etcd.jetcd.api.KeyValue getKvs(int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);
      } else {
        return kvsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder setKvs(
        int index, io.etcd.jetcd.api.KeyValue value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.set(index, value);
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder setKvs(
        int index, io.etcd.jetcd.api.KeyValue.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.set(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder addKvs(io.etcd.jetcd.api.KeyValue value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder addKvs(
        int index, io.etcd.jetcd.api.KeyValue value) {
      if (kvsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKvsIsMutable();
        kvs_.add(index, value);
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder addKvs(
        io.etcd.jetcd.api.KeyValue.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder addKvs(
        int index, io.etcd.jetcd.api.KeyValue.Builder builderForValue) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.add(index, builderForValue.build());
        onChanged();
      } else {
        kvsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder addAllKvs(
        java.lang.Iterable<? extends io.etcd.jetcd.api.KeyValue> values) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kvs_);
        onChanged();
      } else {
        kvsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder clearKvs() {
      if (kvsBuilder_ == null) {
        kvs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        kvsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public Builder removeKvs(int index) {
      if (kvsBuilder_ == null) {
        ensureKvsIsMutable();
        kvs_.remove(index);
        onChanged();
      } else {
        kvsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public io.etcd.jetcd.api.KeyValue.Builder getKvsBuilder(
        int index) {
      return getKvsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public io.etcd.jetcd.api.KeyValueOrBuilder getKvsOrBuilder(
        int index) {
      if (kvsBuilder_ == null) {
        return kvs_.get(index);  } else {
        return kvsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public java.util.List<? extends io.etcd.jetcd.api.KeyValueOrBuilder> 
         getKvsOrBuilderList() {
      if (kvsBuilder_ != null) {
        return kvsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(kvs_);
      }
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public io.etcd.jetcd.api.KeyValue.Builder addKvsBuilder() {
      return getKvsFieldBuilder().addBuilder(
          io.etcd.jetcd.api.KeyValue.getDefaultInstance());
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public io.etcd.jetcd.api.KeyValue.Builder addKvsBuilder(
        int index) {
      return getKvsFieldBuilder().addBuilder(
          index, io.etcd.jetcd.api.KeyValue.getDefaultInstance());
    }
    /**
     * <pre>
     * kvs is the list of key-value pairs matched by the range request.
     * kvs is empty when count is requested.
     * </pre>
     *
     * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
     */
    public java.util.List<io.etcd.jetcd.api.KeyValue.Builder> 
         getKvsBuilderList() {
      return getKvsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.etcd.jetcd.api.KeyValue, io.etcd.jetcd.api.KeyValue.Builder, io.etcd.jetcd.api.KeyValueOrBuilder> 
        getKvsFieldBuilder() {
      if (kvsBuilder_ == null) {
        kvsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.etcd.jetcd.api.KeyValue, io.etcd.jetcd.api.KeyValue.Builder, io.etcd.jetcd.api.KeyValueOrBuilder>(
                kvs_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        kvs_ = null;
      }
      return kvsBuilder_;
    }

    private boolean more_ ;
    /**
     * <pre>
     * more indicates if there are more keys to return in the requested range.
     * </pre>
     *
     * <code>bool more = 3;</code>
     */
    public boolean getMore() {
      return more_;
    }
    /**
     * <pre>
     * more indicates if there are more keys to return in the requested range.
     * </pre>
     *
     * <code>bool more = 3;</code>
     */
    public Builder setMore(boolean value) {
      
      more_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * more indicates if there are more keys to return in the requested range.
     * </pre>
     *
     * <code>bool more = 3;</code>
     */
    public Builder clearMore() {
      
      more_ = false;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <pre>
     * count is set to the number of keys within the range when requested.
     * </pre>
     *
     * <code>int64 count = 4;</code>
     */
    public long getCount() {
      return count_;
    }
    /**
     * <pre>
     * count is set to the number of keys within the range when requested.
     * </pre>
     *
     * <code>int64 count = 4;</code>
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * count is set to the number of keys within the range when requested.
     * </pre>
     *
     * <code>int64 count = 4;</code>
     */
    public Builder clearCount() {
      
      count_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.RangeResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.RangeResponse)
  private static final io.etcd.jetcd.api.RangeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.etcd.jetcd.api.RangeResponse();
  }

  public static io.etcd.jetcd.api.RangeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RangeResponse>
      PARSER = new com.google.protobuf.AbstractParser<RangeResponse>() {
    public RangeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RangeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RangeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RangeResponse> getParserForType() {
    return PARSER;
  }

  public io.etcd.jetcd.api.RangeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
