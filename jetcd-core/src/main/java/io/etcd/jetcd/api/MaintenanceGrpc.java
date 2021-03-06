package io.etcd.jetcd.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: rpc.proto")
public final class MaintenanceGrpc {

  private MaintenanceGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Maintenance";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AlarmRequest,
      io.etcd.jetcd.api.AlarmResponse> getAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Alarm",
      requestType = io.etcd.jetcd.api.AlarmRequest.class,
      responseType = io.etcd.jetcd.api.AlarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AlarmRequest,
      io.etcd.jetcd.api.AlarmResponse> getAlarmMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AlarmRequest, io.etcd.jetcd.api.AlarmResponse> getAlarmMethod;
    if ((getAlarmMethod = MaintenanceGrpc.getAlarmMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getAlarmMethod = MaintenanceGrpc.getAlarmMethod) == null) {
          MaintenanceGrpc.getAlarmMethod = getAlarmMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AlarmRequest, io.etcd.jetcd.api.AlarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Alarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AlarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AlarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Alarm"))
              .build();
        }
      }
    }
    return getAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.StatusRequest,
      io.etcd.jetcd.api.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = io.etcd.jetcd.api.StatusRequest.class,
      responseType = io.etcd.jetcd.api.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.StatusRequest,
      io.etcd.jetcd.api.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.StatusRequest, io.etcd.jetcd.api.StatusResponse> getStatusMethod;
    if ((getStatusMethod = MaintenanceGrpc.getStatusMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getStatusMethod = MaintenanceGrpc.getStatusMethod) == null) {
          MaintenanceGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.StatusRequest, io.etcd.jetcd.api.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.DefragmentRequest,
      io.etcd.jetcd.api.DefragmentResponse> getDefragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Defragment",
      requestType = io.etcd.jetcd.api.DefragmentRequest.class,
      responseType = io.etcd.jetcd.api.DefragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.DefragmentRequest,
      io.etcd.jetcd.api.DefragmentResponse> getDefragmentMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.DefragmentRequest, io.etcd.jetcd.api.DefragmentResponse> getDefragmentMethod;
    if ((getDefragmentMethod = MaintenanceGrpc.getDefragmentMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getDefragmentMethod = MaintenanceGrpc.getDefragmentMethod) == null) {
          MaintenanceGrpc.getDefragmentMethod = getDefragmentMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.DefragmentRequest, io.etcd.jetcd.api.DefragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Defragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.DefragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.DefragmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Defragment"))
              .build();
        }
      }
    }
    return getDefragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.HashRequest,
      io.etcd.jetcd.api.HashResponse> getHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hash",
      requestType = io.etcd.jetcd.api.HashRequest.class,
      responseType = io.etcd.jetcd.api.HashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.HashRequest,
      io.etcd.jetcd.api.HashResponse> getHashMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.HashRequest, io.etcd.jetcd.api.HashResponse> getHashMethod;
    if ((getHashMethod = MaintenanceGrpc.getHashMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getHashMethod = MaintenanceGrpc.getHashMethod) == null) {
          MaintenanceGrpc.getHashMethod = getHashMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.HashRequest, io.etcd.jetcd.api.HashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.HashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.HashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Hash"))
              .build();
        }
      }
    }
    return getHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.HashKVRequest,
      io.etcd.jetcd.api.HashKVResponse> getHashKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HashKV",
      requestType = io.etcd.jetcd.api.HashKVRequest.class,
      responseType = io.etcd.jetcd.api.HashKVResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.HashKVRequest,
      io.etcd.jetcd.api.HashKVResponse> getHashKVMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.HashKVRequest, io.etcd.jetcd.api.HashKVResponse> getHashKVMethod;
    if ((getHashKVMethod = MaintenanceGrpc.getHashKVMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getHashKVMethod = MaintenanceGrpc.getHashKVMethod) == null) {
          MaintenanceGrpc.getHashKVMethod = getHashKVMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.HashKVRequest, io.etcd.jetcd.api.HashKVResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HashKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.HashKVRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.HashKVResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("HashKV"))
              .build();
        }
      }
    }
    return getHashKVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.SnapshotRequest,
      io.etcd.jetcd.api.SnapshotResponse> getSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Snapshot",
      requestType = io.etcd.jetcd.api.SnapshotRequest.class,
      responseType = io.etcd.jetcd.api.SnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.SnapshotRequest,
      io.etcd.jetcd.api.SnapshotResponse> getSnapshotMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.SnapshotRequest, io.etcd.jetcd.api.SnapshotResponse> getSnapshotMethod;
    if ((getSnapshotMethod = MaintenanceGrpc.getSnapshotMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getSnapshotMethod = MaintenanceGrpc.getSnapshotMethod) == null) {
          MaintenanceGrpc.getSnapshotMethod = getSnapshotMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.SnapshotRequest, io.etcd.jetcd.api.SnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Snapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.SnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.SnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Snapshot"))
              .build();
        }
      }
    }
    return getSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.MoveLeaderRequest,
      io.etcd.jetcd.api.MoveLeaderResponse> getMoveLeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveLeader",
      requestType = io.etcd.jetcd.api.MoveLeaderRequest.class,
      responseType = io.etcd.jetcd.api.MoveLeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.MoveLeaderRequest,
      io.etcd.jetcd.api.MoveLeaderResponse> getMoveLeaderMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.MoveLeaderRequest, io.etcd.jetcd.api.MoveLeaderResponse> getMoveLeaderMethod;
    if ((getMoveLeaderMethod = MaintenanceGrpc.getMoveLeaderMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getMoveLeaderMethod = MaintenanceGrpc.getMoveLeaderMethod) == null) {
          MaintenanceGrpc.getMoveLeaderMethod = getMoveLeaderMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.MoveLeaderRequest, io.etcd.jetcd.api.MoveLeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveLeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.MoveLeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.MoveLeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("MoveLeader"))
              .build();
        }
      }
    }
    return getMoveLeaderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MaintenanceStub newStub(io.grpc.Channel channel) {
    return new MaintenanceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MaintenanceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MaintenanceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MaintenanceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MaintenanceFutureStub(channel);
  }

  /**
   */
  public static abstract class MaintenanceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public void alarm(io.etcd.jetcd.api.AlarmRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AlarmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public void status(io.etcd.jetcd.api.StatusRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public void defragment(io.etcd.jetcd.api.DefragmentRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.DefragmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDefragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public void hash(io.etcd.jetcd.api.HashRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.HashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public void hashKV(io.etcd.jetcd.api.HashKVRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.HashKVResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHashKVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    public void snapshot(io.etcd.jetcd.api.SnapshotRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.SnapshotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public void moveLeader(io.etcd.jetcd.api.MoveLeaderRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.MoveLeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveLeaderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AlarmRequest,
                io.etcd.jetcd.api.AlarmResponse>(
                  this, METHODID_ALARM)))
          .addMethod(
            getStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.StatusRequest,
                io.etcd.jetcd.api.StatusResponse>(
                  this, METHODID_STATUS)))
          .addMethod(
            getDefragmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.DefragmentRequest,
                io.etcd.jetcd.api.DefragmentResponse>(
                  this, METHODID_DEFRAGMENT)))
          .addMethod(
            getHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.HashRequest,
                io.etcd.jetcd.api.HashResponse>(
                  this, METHODID_HASH)))
          .addMethod(
            getHashKVMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.HashKVRequest,
                io.etcd.jetcd.api.HashKVResponse>(
                  this, METHODID_HASH_KV)))
          .addMethod(
            getSnapshotMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.etcd.jetcd.api.SnapshotRequest,
                io.etcd.jetcd.api.SnapshotResponse>(
                  this, METHODID_SNAPSHOT)))
          .addMethod(
            getMoveLeaderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.MoveLeaderRequest,
                io.etcd.jetcd.api.MoveLeaderResponse>(
                  this, METHODID_MOVE_LEADER)))
          .build();
    }
  }

  /**
   */
  public static final class MaintenanceStub extends io.grpc.stub.AbstractStub<MaintenanceStub> {
    private MaintenanceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MaintenanceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MaintenanceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public void alarm(io.etcd.jetcd.api.AlarmRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AlarmResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public void status(io.etcd.jetcd.api.StatusRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public void defragment(io.etcd.jetcd.api.DefragmentRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.DefragmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDefragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public void hash(io.etcd.jetcd.api.HashRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.HashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public void hashKV(io.etcd.jetcd.api.HashKVRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.HashKVResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHashKVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    public void snapshot(io.etcd.jetcd.api.SnapshotRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.SnapshotResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public void moveLeader(io.etcd.jetcd.api.MoveLeaderRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.MoveLeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveLeaderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MaintenanceBlockingStub extends io.grpc.stub.AbstractStub<MaintenanceBlockingStub> {
    private MaintenanceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MaintenanceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MaintenanceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public io.etcd.jetcd.api.AlarmResponse alarm(io.etcd.jetcd.api.AlarmRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public io.etcd.jetcd.api.StatusResponse status(io.etcd.jetcd.api.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public io.etcd.jetcd.api.DefragmentResponse defragment(io.etcd.jetcd.api.DefragmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDefragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public io.etcd.jetcd.api.HashResponse hash(io.etcd.jetcd.api.HashRequest request) {
      return blockingUnaryCall(
          getChannel(), getHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public io.etcd.jetcd.api.HashKVResponse hashKV(io.etcd.jetcd.api.HashKVRequest request) {
      return blockingUnaryCall(
          getChannel(), getHashKVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    public java.util.Iterator<io.etcd.jetcd.api.SnapshotResponse> snapshot(
        io.etcd.jetcd.api.SnapshotRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public io.etcd.jetcd.api.MoveLeaderResponse moveLeader(io.etcd.jetcd.api.MoveLeaderRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveLeaderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MaintenanceFutureStub extends io.grpc.stub.AbstractStub<MaintenanceFutureStub> {
    private MaintenanceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MaintenanceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MaintenanceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AlarmResponse> alarm(
        io.etcd.jetcd.api.AlarmRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.StatusResponse> status(
        io.etcd.jetcd.api.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.DefragmentResponse> defragment(
        io.etcd.jetcd.api.DefragmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDefragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.HashResponse> hash(
        io.etcd.jetcd.api.HashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.HashKVResponse> hashKV(
        io.etcd.jetcd.api.HashKVRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHashKVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.MoveLeaderResponse> moveLeader(
        io.etcd.jetcd.api.MoveLeaderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveLeaderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALARM = 0;
  private static final int METHODID_STATUS = 1;
  private static final int METHODID_DEFRAGMENT = 2;
  private static final int METHODID_HASH = 3;
  private static final int METHODID_HASH_KV = 4;
  private static final int METHODID_SNAPSHOT = 5;
  private static final int METHODID_MOVE_LEADER = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MaintenanceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MaintenanceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALARM:
          serviceImpl.alarm((io.etcd.jetcd.api.AlarmRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AlarmResponse>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((io.etcd.jetcd.api.StatusRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.StatusResponse>) responseObserver);
          break;
        case METHODID_DEFRAGMENT:
          serviceImpl.defragment((io.etcd.jetcd.api.DefragmentRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.DefragmentResponse>) responseObserver);
          break;
        case METHODID_HASH:
          serviceImpl.hash((io.etcd.jetcd.api.HashRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.HashResponse>) responseObserver);
          break;
        case METHODID_HASH_KV:
          serviceImpl.hashKV((io.etcd.jetcd.api.HashKVRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.HashKVResponse>) responseObserver);
          break;
        case METHODID_SNAPSHOT:
          serviceImpl.snapshot((io.etcd.jetcd.api.SnapshotRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.SnapshotResponse>) responseObserver);
          break;
        case METHODID_MOVE_LEADER:
          serviceImpl.moveLeader((io.etcd.jetcd.api.MoveLeaderRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.MoveLeaderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MaintenanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MaintenanceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.etcd.jetcd.api.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Maintenance");
    }
  }

  private static final class MaintenanceFileDescriptorSupplier
      extends MaintenanceBaseDescriptorSupplier {
    MaintenanceFileDescriptorSupplier() {}
  }

  private static final class MaintenanceMethodDescriptorSupplier
      extends MaintenanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MaintenanceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MaintenanceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MaintenanceFileDescriptorSupplier())
              .addMethod(getAlarmMethod())
              .addMethod(getStatusMethod())
              .addMethod(getDefragmentMethod())
              .addMethod(getHashMethod())
              .addMethod(getHashKVMethod())
              .addMethod(getSnapshotMethod())
              .addMethod(getMoveLeaderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
