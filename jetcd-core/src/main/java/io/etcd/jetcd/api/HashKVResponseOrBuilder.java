// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package io.etcd.jetcd.api;

public interface HashKVResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.HashKVResponse)
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
   * hash is the hash value computed from the responding member's MVCC keys up to a given revision.
   * </pre>
   *
   * <code>uint32 hash = 2;</code>
   */
  int getHash();

  /**
   * <pre>
   * compact_revision is the compacted revision of key-value store when hash begins.
   * </pre>
   *
   * <code>int64 compact_revision = 3;</code>
   */
  long getCompactRevision();
}
