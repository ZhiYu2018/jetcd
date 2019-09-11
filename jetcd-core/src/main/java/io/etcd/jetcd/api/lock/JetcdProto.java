// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lock.proto

package io.etcd.jetcd.api.lock;

public final class JetcdProto {
  private JetcdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v3lockpb_LockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v3lockpb_LockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v3lockpb_LockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v3lockpb_LockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v3lockpb_UnlockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v3lockpb_UnlockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v3lockpb_UnlockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v3lockpb_UnlockResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nlock.proto\022\010v3lockpb\032\trpc.proto\"*\n\013Loc" +
      "kRequest\022\014\n\004name\030\001 \001(\014\022\r\n\005lease\030\002 \001(\003\"I\n" +
      "\014LockResponse\022,\n\006header\030\001 \001(\0132\034.etcdserv" +
      "erpb.ResponseHeader\022\013\n\003key\030\002 \001(\014\"\034\n\rUnlo" +
      "ckRequest\022\013\n\003key\030\001 \001(\014\">\n\016UnlockResponse" +
      "\022,\n\006header\030\001 \001(\0132\034.etcdserverpb.Response" +
      "Header2~\n\004Lock\0227\n\004Lock\022\025.v3lockpb.LockRe" +
      "quest\032\026.v3lockpb.LockResponse\"\000\022=\n\006Unloc" +
      "k\022\027.v3lockpb.UnlockRequest\032\030.v3lockpb.Un" +
      "lockResponse\"\000B.\n\026io.etcd.jetcd.api.lock" +
      "B\nJetcdProtoP\001\242\002\005Jetcdb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.etcd.jetcd.api.JetcdProto.getDescriptor(),
        }, assigner);
    internal_static_v3lockpb_LockRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v3lockpb_LockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v3lockpb_LockRequest_descriptor,
        new java.lang.String[] { "Name", "Lease", });
    internal_static_v3lockpb_LockResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v3lockpb_LockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v3lockpb_LockResponse_descriptor,
        new java.lang.String[] { "Header", "Key", });
    internal_static_v3lockpb_UnlockRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v3lockpb_UnlockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v3lockpb_UnlockRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_v3lockpb_UnlockResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_v3lockpb_UnlockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v3lockpb_UnlockResponse_descriptor,
        new java.lang.String[] { "Header", });
    io.etcd.jetcd.api.JetcdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}