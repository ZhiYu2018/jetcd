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
public final class LeaseGrpc {

  private LeaseGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Lease";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseGrantRequest,
      io.etcd.jetcd.api.LeaseGrantResponse> getLeaseGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseGrant",
      requestType = io.etcd.jetcd.api.LeaseGrantRequest.class,
      responseType = io.etcd.jetcd.api.LeaseGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseGrantRequest,
      io.etcd.jetcd.api.LeaseGrantResponse> getLeaseGrantMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseGrantRequest, io.etcd.jetcd.api.LeaseGrantResponse> getLeaseGrantMethod;
    if ((getLeaseGrantMethod = LeaseGrpc.getLeaseGrantMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseGrantMethod = LeaseGrpc.getLeaseGrantMethod) == null) {
          LeaseGrpc.getLeaseGrantMethod = getLeaseGrantMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.LeaseGrantRequest, io.etcd.jetcd.api.LeaseGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseGrant"))
              .build();
        }
      }
    }
    return getLeaseGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseRevokeRequest,
      io.etcd.jetcd.api.LeaseRevokeResponse> getLeaseRevokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseRevoke",
      requestType = io.etcd.jetcd.api.LeaseRevokeRequest.class,
      responseType = io.etcd.jetcd.api.LeaseRevokeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseRevokeRequest,
      io.etcd.jetcd.api.LeaseRevokeResponse> getLeaseRevokeMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseRevokeRequest, io.etcd.jetcd.api.LeaseRevokeResponse> getLeaseRevokeMethod;
    if ((getLeaseRevokeMethod = LeaseGrpc.getLeaseRevokeMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseRevokeMethod = LeaseGrpc.getLeaseRevokeMethod) == null) {
          LeaseGrpc.getLeaseRevokeMethod = getLeaseRevokeMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.LeaseRevokeRequest, io.etcd.jetcd.api.LeaseRevokeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseRevoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseRevokeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseRevokeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseRevoke"))
              .build();
        }
      }
    }
    return getLeaseRevokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseKeepAliveRequest,
      io.etcd.jetcd.api.LeaseKeepAliveResponse> getLeaseKeepAliveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseKeepAlive",
      requestType = io.etcd.jetcd.api.LeaseKeepAliveRequest.class,
      responseType = io.etcd.jetcd.api.LeaseKeepAliveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseKeepAliveRequest,
      io.etcd.jetcd.api.LeaseKeepAliveResponse> getLeaseKeepAliveMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseKeepAliveRequest, io.etcd.jetcd.api.LeaseKeepAliveResponse> getLeaseKeepAliveMethod;
    if ((getLeaseKeepAliveMethod = LeaseGrpc.getLeaseKeepAliveMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseKeepAliveMethod = LeaseGrpc.getLeaseKeepAliveMethod) == null) {
          LeaseGrpc.getLeaseKeepAliveMethod = getLeaseKeepAliveMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.LeaseKeepAliveRequest, io.etcd.jetcd.api.LeaseKeepAliveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseKeepAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseKeepAliveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseKeepAliveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseKeepAlive"))
              .build();
        }
      }
    }
    return getLeaseKeepAliveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseTimeToLiveRequest,
      io.etcd.jetcd.api.LeaseTimeToLiveResponse> getLeaseTimeToLiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseTimeToLive",
      requestType = io.etcd.jetcd.api.LeaseTimeToLiveRequest.class,
      responseType = io.etcd.jetcd.api.LeaseTimeToLiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseTimeToLiveRequest,
      io.etcd.jetcd.api.LeaseTimeToLiveResponse> getLeaseTimeToLiveMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.LeaseTimeToLiveRequest, io.etcd.jetcd.api.LeaseTimeToLiveResponse> getLeaseTimeToLiveMethod;
    if ((getLeaseTimeToLiveMethod = LeaseGrpc.getLeaseTimeToLiveMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseTimeToLiveMethod = LeaseGrpc.getLeaseTimeToLiveMethod) == null) {
          LeaseGrpc.getLeaseTimeToLiveMethod = getLeaseTimeToLiveMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.LeaseTimeToLiveRequest, io.etcd.jetcd.api.LeaseTimeToLiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseTimeToLive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseTimeToLiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.LeaseTimeToLiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseTimeToLive"))
              .build();
        }
      }
    }
    return getLeaseTimeToLiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaseStub newStub(io.grpc.Channel channel) {
    return new LeaseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LeaseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LeaseFutureStub(channel);
  }

  /**
   */
  public static abstract class LeaseImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    public void leaseGrant(io.etcd.jetcd.api.LeaseGrantRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseGrantResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaseGrantMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    public void leaseRevoke(io.etcd.jetcd.api.LeaseRevokeRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseRevokeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaseRevokeMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeaseKeepAlive keeps the lease alive by streaming keep alive requests from the client
     * to the server and streaming keep alive responses from the server to the client.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseKeepAliveRequest> leaseKeepAlive(
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseKeepAliveResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLeaseKeepAliveMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    public void leaseTimeToLive(io.etcd.jetcd.api.LeaseTimeToLiveRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseTimeToLiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaseTimeToLiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLeaseGrantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.LeaseGrantRequest,
                io.etcd.jetcd.api.LeaseGrantResponse>(
                  this, METHODID_LEASE_GRANT)))
          .addMethod(
            getLeaseRevokeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.LeaseRevokeRequest,
                io.etcd.jetcd.api.LeaseRevokeResponse>(
                  this, METHODID_LEASE_REVOKE)))
          .addMethod(
            getLeaseKeepAliveMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.etcd.jetcd.api.LeaseKeepAliveRequest,
                io.etcd.jetcd.api.LeaseKeepAliveResponse>(
                  this, METHODID_LEASE_KEEP_ALIVE)))
          .addMethod(
            getLeaseTimeToLiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.LeaseTimeToLiveRequest,
                io.etcd.jetcd.api.LeaseTimeToLiveResponse>(
                  this, METHODID_LEASE_TIME_TO_LIVE)))
          .build();
    }
  }

  /**
   */
  public static final class LeaseStub extends io.grpc.stub.AbstractStub<LeaseStub> {
    private LeaseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LeaseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LeaseStub(channel, callOptions);
    }

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    public void leaseGrant(io.etcd.jetcd.api.LeaseGrantRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseGrantResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaseGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    public void leaseRevoke(io.etcd.jetcd.api.LeaseRevokeRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseRevokeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaseRevokeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LeaseKeepAlive keeps the lease alive by streaming keep alive requests from the client
     * to the server and streaming keep alive responses from the server to the client.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseKeepAliveRequest> leaseKeepAlive(
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseKeepAliveResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLeaseKeepAliveMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    public void leaseTimeToLive(io.etcd.jetcd.api.LeaseTimeToLiveRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseTimeToLiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaseTimeToLiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LeaseBlockingStub extends io.grpc.stub.AbstractStub<LeaseBlockingStub> {
    private LeaseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LeaseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LeaseBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    public io.etcd.jetcd.api.LeaseGrantResponse leaseGrant(io.etcd.jetcd.api.LeaseGrantRequest request) {
      return blockingUnaryCall(
          getChannel(), getLeaseGrantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    public io.etcd.jetcd.api.LeaseRevokeResponse leaseRevoke(io.etcd.jetcd.api.LeaseRevokeRequest request) {
      return blockingUnaryCall(
          getChannel(), getLeaseRevokeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    public io.etcd.jetcd.api.LeaseTimeToLiveResponse leaseTimeToLive(io.etcd.jetcd.api.LeaseTimeToLiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getLeaseTimeToLiveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LeaseFutureStub extends io.grpc.stub.AbstractStub<LeaseFutureStub> {
    private LeaseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LeaseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LeaseFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.LeaseGrantResponse> leaseGrant(
        io.etcd.jetcd.api.LeaseGrantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaseGrantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.LeaseRevokeResponse> leaseRevoke(
        io.etcd.jetcd.api.LeaseRevokeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaseRevokeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.LeaseTimeToLiveResponse> leaseTimeToLive(
        io.etcd.jetcd.api.LeaseTimeToLiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaseTimeToLiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LEASE_GRANT = 0;
  private static final int METHODID_LEASE_REVOKE = 1;
  private static final int METHODID_LEASE_TIME_TO_LIVE = 2;
  private static final int METHODID_LEASE_KEEP_ALIVE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LeaseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LEASE_GRANT:
          serviceImpl.leaseGrant((io.etcd.jetcd.api.LeaseGrantRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseGrantResponse>) responseObserver);
          break;
        case METHODID_LEASE_REVOKE:
          serviceImpl.leaseRevoke((io.etcd.jetcd.api.LeaseRevokeRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseRevokeResponse>) responseObserver);
          break;
        case METHODID_LEASE_TIME_TO_LIVE:
          serviceImpl.leaseTimeToLive((io.etcd.jetcd.api.LeaseTimeToLiveRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseTimeToLiveResponse>) responseObserver);
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
        case METHODID_LEASE_KEEP_ALIVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.leaseKeepAlive(
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.LeaseKeepAliveResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LeaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.etcd.jetcd.api.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lease");
    }
  }

  private static final class LeaseFileDescriptorSupplier
      extends LeaseBaseDescriptorSupplier {
    LeaseFileDescriptorSupplier() {}
  }

  private static final class LeaseMethodDescriptorSupplier
      extends LeaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaseMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaseFileDescriptorSupplier())
              .addMethod(getLeaseGrantMethod())
              .addMethod(getLeaseRevokeMethod())
              .addMethod(getLeaseKeepAliveMethod())
              .addMethod(getLeaseTimeToLiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
