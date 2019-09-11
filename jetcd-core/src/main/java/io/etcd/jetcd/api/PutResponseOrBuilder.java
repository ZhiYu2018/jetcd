// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.etcd.jetcd.api;

public interface PutResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.PutResponse)
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
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   */
  boolean hasPrevKv();
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   */
  io.etcd.jetcd.api.KeyValue getPrevKv();
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   */
  io.etcd.jetcd.api.KeyValueOrBuilder getPrevKvOrBuilder();
}
