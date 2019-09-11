// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.etcd.jetcd.api;

public interface DeleteRangeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.DeleteRangeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  io.etcd.jetcd.api.ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  io.etcd.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * deleted is the number of keys deleted by the delete range request.
   * </pre>
   *
   * <code>int64 deleted = 2;</code>
   */
  long getDeleted();

  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pairs will be returned.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue prev_kvs = 3;</code>
   */
  java.util.List<io.etcd.jetcd.api.KeyValue> 
      getPrevKvsList();
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pairs will be returned.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue prev_kvs = 3;</code>
   */
  io.etcd.jetcd.api.KeyValue getPrevKvs(int index);
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pairs will be returned.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue prev_kvs = 3;</code>
   */
  int getPrevKvsCount();
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pairs will be returned.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue prev_kvs = 3;</code>
   */
  java.util.List<? extends io.etcd.jetcd.api.KeyValueOrBuilder> 
      getPrevKvsOrBuilderList();
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pairs will be returned.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue prev_kvs = 3;</code>
   */
  io.etcd.jetcd.api.KeyValueOrBuilder getPrevKvsOrBuilder(
      int index);
}
