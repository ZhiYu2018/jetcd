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
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthEnableRequest,
      io.etcd.jetcd.api.AuthEnableResponse> getAuthEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthEnable",
      requestType = io.etcd.jetcd.api.AuthEnableRequest.class,
      responseType = io.etcd.jetcd.api.AuthEnableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthEnableRequest,
      io.etcd.jetcd.api.AuthEnableResponse> getAuthEnableMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthEnableRequest, io.etcd.jetcd.api.AuthEnableResponse> getAuthEnableMethod;
    if ((getAuthEnableMethod = AuthGrpc.getAuthEnableMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthEnableMethod = AuthGrpc.getAuthEnableMethod) == null) {
          AuthGrpc.getAuthEnableMethod = getAuthEnableMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthEnableRequest, io.etcd.jetcd.api.AuthEnableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthEnable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthEnableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthEnableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("AuthEnable"))
              .build();
        }
      }
    }
    return getAuthEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthDisableRequest,
      io.etcd.jetcd.api.AuthDisableResponse> getAuthDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthDisable",
      requestType = io.etcd.jetcd.api.AuthDisableRequest.class,
      responseType = io.etcd.jetcd.api.AuthDisableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthDisableRequest,
      io.etcd.jetcd.api.AuthDisableResponse> getAuthDisableMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthDisableRequest, io.etcd.jetcd.api.AuthDisableResponse> getAuthDisableMethod;
    if ((getAuthDisableMethod = AuthGrpc.getAuthDisableMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthDisableMethod = AuthGrpc.getAuthDisableMethod) == null) {
          AuthGrpc.getAuthDisableMethod = getAuthDisableMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthDisableRequest, io.etcd.jetcd.api.AuthDisableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthDisable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthDisableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthDisableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("AuthDisable"))
              .build();
        }
      }
    }
    return getAuthDisableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthenticateRequest,
      io.etcd.jetcd.api.AuthenticateResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = io.etcd.jetcd.api.AuthenticateRequest.class,
      responseType = io.etcd.jetcd.api.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthenticateRequest,
      io.etcd.jetcd.api.AuthenticateResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthenticateRequest, io.etcd.jetcd.api.AuthenticateResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
          AuthGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthenticateRequest, io.etcd.jetcd.api.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Authenticate"))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserAddRequest,
      io.etcd.jetcd.api.AuthUserAddResponse> getUserAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserAdd",
      requestType = io.etcd.jetcd.api.AuthUserAddRequest.class,
      responseType = io.etcd.jetcd.api.AuthUserAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserAddRequest,
      io.etcd.jetcd.api.AuthUserAddResponse> getUserAddMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserAddRequest, io.etcd.jetcd.api.AuthUserAddResponse> getUserAddMethod;
    if ((getUserAddMethod = AuthGrpc.getUserAddMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserAddMethod = AuthGrpc.getUserAddMethod) == null) {
          AuthGrpc.getUserAddMethod = getUserAddMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthUserAddRequest, io.etcd.jetcd.api.AuthUserAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserAddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserAdd"))
              .build();
        }
      }
    }
    return getUserAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserGetRequest,
      io.etcd.jetcd.api.AuthUserGetResponse> getUserGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGet",
      requestType = io.etcd.jetcd.api.AuthUserGetRequest.class,
      responseType = io.etcd.jetcd.api.AuthUserGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserGetRequest,
      io.etcd.jetcd.api.AuthUserGetResponse> getUserGetMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserGetRequest, io.etcd.jetcd.api.AuthUserGetResponse> getUserGetMethod;
    if ((getUserGetMethod = AuthGrpc.getUserGetMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserGetMethod = AuthGrpc.getUserGetMethod) == null) {
          AuthGrpc.getUserGetMethod = getUserGetMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthUserGetRequest, io.etcd.jetcd.api.AuthUserGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserGet"))
              .build();
        }
      }
    }
    return getUserGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserListRequest,
      io.etcd.jetcd.api.AuthUserListResponse> getUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserList",
      requestType = io.etcd.jetcd.api.AuthUserListRequest.class,
      responseType = io.etcd.jetcd.api.AuthUserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserListRequest,
      io.etcd.jetcd.api.AuthUserListResponse> getUserListMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserListRequest, io.etcd.jetcd.api.AuthUserListResponse> getUserListMethod;
    if ((getUserListMethod = AuthGrpc.getUserListMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserListMethod = AuthGrpc.getUserListMethod) == null) {
          AuthGrpc.getUserListMethod = getUserListMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthUserListRequest, io.etcd.jetcd.api.AuthUserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserList"))
              .build();
        }
      }
    }
    return getUserListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserDeleteRequest,
      io.etcd.jetcd.api.AuthUserDeleteResponse> getUserDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserDelete",
      requestType = io.etcd.jetcd.api.AuthUserDeleteRequest.class,
      responseType = io.etcd.jetcd.api.AuthUserDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserDeleteRequest,
      io.etcd.jetcd.api.AuthUserDeleteResponse> getUserDeleteMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserDeleteRequest, io.etcd.jetcd.api.AuthUserDeleteResponse> getUserDeleteMethod;
    if ((getUserDeleteMethod = AuthGrpc.getUserDeleteMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserDeleteMethod = AuthGrpc.getUserDeleteMethod) == null) {
          AuthGrpc.getUserDeleteMethod = getUserDeleteMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthUserDeleteRequest, io.etcd.jetcd.api.AuthUserDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserDelete"))
              .build();
        }
      }
    }
    return getUserDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserChangePasswordRequest,
      io.etcd.jetcd.api.AuthUserChangePasswordResponse> getUserChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserChangePassword",
      requestType = io.etcd.jetcd.api.AuthUserChangePasswordRequest.class,
      responseType = io.etcd.jetcd.api.AuthUserChangePasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserChangePasswordRequest,
      io.etcd.jetcd.api.AuthUserChangePasswordResponse> getUserChangePasswordMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserChangePasswordRequest, io.etcd.jetcd.api.AuthUserChangePasswordResponse> getUserChangePasswordMethod;
    if ((getUserChangePasswordMethod = AuthGrpc.getUserChangePasswordMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserChangePasswordMethod = AuthGrpc.getUserChangePasswordMethod) == null) {
          AuthGrpc.getUserChangePasswordMethod = getUserChangePasswordMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthUserChangePasswordRequest, io.etcd.jetcd.api.AuthUserChangePasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserChangePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserChangePasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserChangePassword"))
              .build();
        }
      }
    }
    return getUserChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserGrantRoleRequest,
      io.etcd.jetcd.api.AuthUserGrantRoleResponse> getUserGrantRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGrantRole",
      requestType = io.etcd.jetcd.api.AuthUserGrantRoleRequest.class,
      responseType = io.etcd.jetcd.api.AuthUserGrantRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserGrantRoleRequest,
      io.etcd.jetcd.api.AuthUserGrantRoleResponse> getUserGrantRoleMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserGrantRoleRequest, io.etcd.jetcd.api.AuthUserGrantRoleResponse> getUserGrantRoleMethod;
    if ((getUserGrantRoleMethod = AuthGrpc.getUserGrantRoleMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserGrantRoleMethod = AuthGrpc.getUserGrantRoleMethod) == null) {
          AuthGrpc.getUserGrantRoleMethod = getUserGrantRoleMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthUserGrantRoleRequest, io.etcd.jetcd.api.AuthUserGrantRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGrantRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserGrantRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserGrantRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserGrantRole"))
              .build();
        }
      }
    }
    return getUserGrantRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserRevokeRoleRequest,
      io.etcd.jetcd.api.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserRevokeRole",
      requestType = io.etcd.jetcd.api.AuthUserRevokeRoleRequest.class,
      responseType = io.etcd.jetcd.api.AuthUserRevokeRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserRevokeRoleRequest,
      io.etcd.jetcd.api.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthUserRevokeRoleRequest, io.etcd.jetcd.api.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod;
    if ((getUserRevokeRoleMethod = AuthGrpc.getUserRevokeRoleMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserRevokeRoleMethod = AuthGrpc.getUserRevokeRoleMethod) == null) {
          AuthGrpc.getUserRevokeRoleMethod = getUserRevokeRoleMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthUserRevokeRoleRequest, io.etcd.jetcd.api.AuthUserRevokeRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserRevokeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserRevokeRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthUserRevokeRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserRevokeRole"))
              .build();
        }
      }
    }
    return getUserRevokeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleAddRequest,
      io.etcd.jetcd.api.AuthRoleAddResponse> getRoleAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleAdd",
      requestType = io.etcd.jetcd.api.AuthRoleAddRequest.class,
      responseType = io.etcd.jetcd.api.AuthRoleAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleAddRequest,
      io.etcd.jetcd.api.AuthRoleAddResponse> getRoleAddMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleAddRequest, io.etcd.jetcd.api.AuthRoleAddResponse> getRoleAddMethod;
    if ((getRoleAddMethod = AuthGrpc.getRoleAddMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleAddMethod = AuthGrpc.getRoleAddMethod) == null) {
          AuthGrpc.getRoleAddMethod = getRoleAddMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthRoleAddRequest, io.etcd.jetcd.api.AuthRoleAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleAddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleAdd"))
              .build();
        }
      }
    }
    return getRoleAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleGetRequest,
      io.etcd.jetcd.api.AuthRoleGetResponse> getRoleGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleGet",
      requestType = io.etcd.jetcd.api.AuthRoleGetRequest.class,
      responseType = io.etcd.jetcd.api.AuthRoleGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleGetRequest,
      io.etcd.jetcd.api.AuthRoleGetResponse> getRoleGetMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleGetRequest, io.etcd.jetcd.api.AuthRoleGetResponse> getRoleGetMethod;
    if ((getRoleGetMethod = AuthGrpc.getRoleGetMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleGetMethod = AuthGrpc.getRoleGetMethod) == null) {
          AuthGrpc.getRoleGetMethod = getRoleGetMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthRoleGetRequest, io.etcd.jetcd.api.AuthRoleGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleGet"))
              .build();
        }
      }
    }
    return getRoleGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleListRequest,
      io.etcd.jetcd.api.AuthRoleListResponse> getRoleListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleList",
      requestType = io.etcd.jetcd.api.AuthRoleListRequest.class,
      responseType = io.etcd.jetcd.api.AuthRoleListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleListRequest,
      io.etcd.jetcd.api.AuthRoleListResponse> getRoleListMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleListRequest, io.etcd.jetcd.api.AuthRoleListResponse> getRoleListMethod;
    if ((getRoleListMethod = AuthGrpc.getRoleListMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleListMethod = AuthGrpc.getRoleListMethod) == null) {
          AuthGrpc.getRoleListMethod = getRoleListMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthRoleListRequest, io.etcd.jetcd.api.AuthRoleListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleList"))
              .build();
        }
      }
    }
    return getRoleListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleDeleteRequest,
      io.etcd.jetcd.api.AuthRoleDeleteResponse> getRoleDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleDelete",
      requestType = io.etcd.jetcd.api.AuthRoleDeleteRequest.class,
      responseType = io.etcd.jetcd.api.AuthRoleDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleDeleteRequest,
      io.etcd.jetcd.api.AuthRoleDeleteResponse> getRoleDeleteMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleDeleteRequest, io.etcd.jetcd.api.AuthRoleDeleteResponse> getRoleDeleteMethod;
    if ((getRoleDeleteMethod = AuthGrpc.getRoleDeleteMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleDeleteMethod = AuthGrpc.getRoleDeleteMethod) == null) {
          AuthGrpc.getRoleDeleteMethod = getRoleDeleteMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthRoleDeleteRequest, io.etcd.jetcd.api.AuthRoleDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleDelete"))
              .build();
        }
      }
    }
    return getRoleDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleGrantPermissionRequest,
      io.etcd.jetcd.api.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleGrantPermission",
      requestType = io.etcd.jetcd.api.AuthRoleGrantPermissionRequest.class,
      responseType = io.etcd.jetcd.api.AuthRoleGrantPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleGrantPermissionRequest,
      io.etcd.jetcd.api.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleGrantPermissionRequest, io.etcd.jetcd.api.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod;
    if ((getRoleGrantPermissionMethod = AuthGrpc.getRoleGrantPermissionMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleGrantPermissionMethod = AuthGrpc.getRoleGrantPermissionMethod) == null) {
          AuthGrpc.getRoleGrantPermissionMethod = getRoleGrantPermissionMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthRoleGrantPermissionRequest, io.etcd.jetcd.api.AuthRoleGrantPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleGrantPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleGrantPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleGrantPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleGrantPermission"))
              .build();
        }
      }
    }
    return getRoleGrantPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleRevokePermissionRequest,
      io.etcd.jetcd.api.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleRevokePermission",
      requestType = io.etcd.jetcd.api.AuthRoleRevokePermissionRequest.class,
      responseType = io.etcd.jetcd.api.AuthRoleRevokePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleRevokePermissionRequest,
      io.etcd.jetcd.api.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod() {
    io.grpc.MethodDescriptor<io.etcd.jetcd.api.AuthRoleRevokePermissionRequest, io.etcd.jetcd.api.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod;
    if ((getRoleRevokePermissionMethod = AuthGrpc.getRoleRevokePermissionMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleRevokePermissionMethod = AuthGrpc.getRoleRevokePermissionMethod) == null) {
          AuthGrpc.getRoleRevokePermissionMethod = getRoleRevokePermissionMethod =
              io.grpc.MethodDescriptor.<io.etcd.jetcd.api.AuthRoleRevokePermissionRequest, io.etcd.jetcd.api.AuthRoleRevokePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleRevokePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleRevokePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.etcd.jetcd.api.AuthRoleRevokePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleRevokePermission"))
              .build();
        }
      }
    }
    return getRoleRevokePermissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    return new AuthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public void authEnable(io.etcd.jetcd.api.AuthEnableRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthEnableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthEnableMethod(), responseObserver);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public void authDisable(io.etcd.jetcd.api.AuthDisableRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthDisableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthDisableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public void authenticate(io.etcd.jetcd.api.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public void userAdd(io.etcd.jetcd.api.AuthUserAddRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public void userGet(io.etcd.jetcd.api.AuthUserGetRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public void userList(io.etcd.jetcd.api.AuthUserListRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserListMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public void userDelete(io.etcd.jetcd.api.AuthUserDeleteRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public void userChangePassword(io.etcd.jetcd.api.AuthUserChangePasswordRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserChangePasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserChangePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public void userGrantRole(io.etcd.jetcd.api.AuthUserGrantRoleRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserGrantRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGrantRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public void userRevokeRole(io.etcd.jetcd.api.AuthUserRevokeRoleRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserRevokeRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserRevokeRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public void roleAdd(io.etcd.jetcd.api.AuthRoleAddRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public void roleGet(io.etcd.jetcd.api.AuthRoleGetRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public void roleList(io.etcd.jetcd.api.AuthRoleListRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleListMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public void roleDelete(io.etcd.jetcd.api.AuthRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public void roleGrantPermission(io.etcd.jetcd.api.AuthRoleGrantPermissionRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleGrantPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleGrantPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public void roleRevokePermission(io.etcd.jetcd.api.AuthRoleRevokePermissionRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleRevokePermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleRevokePermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthEnableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthEnableRequest,
                io.etcd.jetcd.api.AuthEnableResponse>(
                  this, METHODID_AUTH_ENABLE)))
          .addMethod(
            getAuthDisableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthDisableRequest,
                io.etcd.jetcd.api.AuthDisableResponse>(
                  this, METHODID_AUTH_DISABLE)))
          .addMethod(
            getAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthenticateRequest,
                io.etcd.jetcd.api.AuthenticateResponse>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            getUserAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthUserAddRequest,
                io.etcd.jetcd.api.AuthUserAddResponse>(
                  this, METHODID_USER_ADD)))
          .addMethod(
            getUserGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthUserGetRequest,
                io.etcd.jetcd.api.AuthUserGetResponse>(
                  this, METHODID_USER_GET)))
          .addMethod(
            getUserListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthUserListRequest,
                io.etcd.jetcd.api.AuthUserListResponse>(
                  this, METHODID_USER_LIST)))
          .addMethod(
            getUserDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthUserDeleteRequest,
                io.etcd.jetcd.api.AuthUserDeleteResponse>(
                  this, METHODID_USER_DELETE)))
          .addMethod(
            getUserChangePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthUserChangePasswordRequest,
                io.etcd.jetcd.api.AuthUserChangePasswordResponse>(
                  this, METHODID_USER_CHANGE_PASSWORD)))
          .addMethod(
            getUserGrantRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthUserGrantRoleRequest,
                io.etcd.jetcd.api.AuthUserGrantRoleResponse>(
                  this, METHODID_USER_GRANT_ROLE)))
          .addMethod(
            getUserRevokeRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthUserRevokeRoleRequest,
                io.etcd.jetcd.api.AuthUserRevokeRoleResponse>(
                  this, METHODID_USER_REVOKE_ROLE)))
          .addMethod(
            getRoleAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthRoleAddRequest,
                io.etcd.jetcd.api.AuthRoleAddResponse>(
                  this, METHODID_ROLE_ADD)))
          .addMethod(
            getRoleGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthRoleGetRequest,
                io.etcd.jetcd.api.AuthRoleGetResponse>(
                  this, METHODID_ROLE_GET)))
          .addMethod(
            getRoleListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthRoleListRequest,
                io.etcd.jetcd.api.AuthRoleListResponse>(
                  this, METHODID_ROLE_LIST)))
          .addMethod(
            getRoleDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthRoleDeleteRequest,
                io.etcd.jetcd.api.AuthRoleDeleteResponse>(
                  this, METHODID_ROLE_DELETE)))
          .addMethod(
            getRoleGrantPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthRoleGrantPermissionRequest,
                io.etcd.jetcd.api.AuthRoleGrantPermissionResponse>(
                  this, METHODID_ROLE_GRANT_PERMISSION)))
          .addMethod(
            getRoleRevokePermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.etcd.jetcd.api.AuthRoleRevokePermissionRequest,
                io.etcd.jetcd.api.AuthRoleRevokePermissionResponse>(
                  this, METHODID_ROLE_REVOKE_PERMISSION)))
          .build();
    }
  }

  /**
   */
  public static final class AuthStub extends io.grpc.stub.AbstractStub<AuthStub> {
    private AuthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public void authEnable(io.etcd.jetcd.api.AuthEnableRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthEnableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public void authDisable(io.etcd.jetcd.api.AuthDisableRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthDisableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthDisableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public void authenticate(io.etcd.jetcd.api.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public void userAdd(io.etcd.jetcd.api.AuthUserAddRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public void userGet(io.etcd.jetcd.api.AuthUserGetRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public void userList(io.etcd.jetcd.api.AuthUserListRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public void userDelete(io.etcd.jetcd.api.AuthUserDeleteRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public void userChangePassword(io.etcd.jetcd.api.AuthUserChangePasswordRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserChangePasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public void userGrantRole(io.etcd.jetcd.api.AuthUserGrantRoleRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserGrantRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGrantRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public void userRevokeRole(io.etcd.jetcd.api.AuthUserRevokeRoleRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserRevokeRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserRevokeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public void roleAdd(io.etcd.jetcd.api.AuthRoleAddRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public void roleGet(io.etcd.jetcd.api.AuthRoleGetRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public void roleList(io.etcd.jetcd.api.AuthRoleListRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public void roleDelete(io.etcd.jetcd.api.AuthRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public void roleGrantPermission(io.etcd.jetcd.api.AuthRoleGrantPermissionRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleGrantPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleGrantPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public void roleRevokePermission(io.etcd.jetcd.api.AuthRoleRevokePermissionRequest request,
        io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleRevokePermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleRevokePermissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractStub<AuthBlockingStub> {
    private AuthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthEnableResponse authEnable(io.etcd.jetcd.api.AuthEnableRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthEnableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthDisableResponse authDisable(io.etcd.jetcd.api.AuthDisableRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthDisableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthenticateResponse authenticate(io.etcd.jetcd.api.AuthenticateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthUserAddResponse userAdd(io.etcd.jetcd.api.AuthUserAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthUserGetResponse userGet(io.etcd.jetcd.api.AuthUserGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthUserListResponse userList(io.etcd.jetcd.api.AuthUserListRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthUserDeleteResponse userDelete(io.etcd.jetcd.api.AuthUserDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthUserChangePasswordResponse userChangePassword(io.etcd.jetcd.api.AuthUserChangePasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthUserGrantRoleResponse userGrantRole(io.etcd.jetcd.api.AuthUserGrantRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGrantRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthUserRevokeRoleResponse userRevokeRole(io.etcd.jetcd.api.AuthUserRevokeRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserRevokeRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthRoleAddResponse roleAdd(io.etcd.jetcd.api.AuthRoleAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthRoleGetResponse roleGet(io.etcd.jetcd.api.AuthRoleGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthRoleListResponse roleList(io.etcd.jetcd.api.AuthRoleListRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthRoleDeleteResponse roleDelete(io.etcd.jetcd.api.AuthRoleDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthRoleGrantPermissionResponse roleGrantPermission(io.etcd.jetcd.api.AuthRoleGrantPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleGrantPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public io.etcd.jetcd.api.AuthRoleRevokePermissionResponse roleRevokePermission(io.etcd.jetcd.api.AuthRoleRevokePermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleRevokePermissionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractStub<AuthFutureStub> {
    private AuthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthEnableResponse> authEnable(
        io.etcd.jetcd.api.AuthEnableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthEnableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthDisableResponse> authDisable(
        io.etcd.jetcd.api.AuthDisableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthDisableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthenticateResponse> authenticate(
        io.etcd.jetcd.api.AuthenticateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthUserAddResponse> userAdd(
        io.etcd.jetcd.api.AuthUserAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthUserGetResponse> userGet(
        io.etcd.jetcd.api.AuthUserGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthUserListResponse> userList(
        io.etcd.jetcd.api.AuthUserListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthUserDeleteResponse> userDelete(
        io.etcd.jetcd.api.AuthUserDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthUserChangePasswordResponse> userChangePassword(
        io.etcd.jetcd.api.AuthUserChangePasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthUserGrantRoleResponse> userGrantRole(
        io.etcd.jetcd.api.AuthUserGrantRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGrantRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthUserRevokeRoleResponse> userRevokeRole(
        io.etcd.jetcd.api.AuthUserRevokeRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserRevokeRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthRoleAddResponse> roleAdd(
        io.etcd.jetcd.api.AuthRoleAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthRoleGetResponse> roleGet(
        io.etcd.jetcd.api.AuthRoleGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthRoleListResponse> roleList(
        io.etcd.jetcd.api.AuthRoleListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthRoleDeleteResponse> roleDelete(
        io.etcd.jetcd.api.AuthRoleDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthRoleGrantPermissionResponse> roleGrantPermission(
        io.etcd.jetcd.api.AuthRoleGrantPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleGrantPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.etcd.jetcd.api.AuthRoleRevokePermissionResponse> roleRevokePermission(
        io.etcd.jetcd.api.AuthRoleRevokePermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleRevokePermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH_ENABLE = 0;
  private static final int METHODID_AUTH_DISABLE = 1;
  private static final int METHODID_AUTHENTICATE = 2;
  private static final int METHODID_USER_ADD = 3;
  private static final int METHODID_USER_GET = 4;
  private static final int METHODID_USER_LIST = 5;
  private static final int METHODID_USER_DELETE = 6;
  private static final int METHODID_USER_CHANGE_PASSWORD = 7;
  private static final int METHODID_USER_GRANT_ROLE = 8;
  private static final int METHODID_USER_REVOKE_ROLE = 9;
  private static final int METHODID_ROLE_ADD = 10;
  private static final int METHODID_ROLE_GET = 11;
  private static final int METHODID_ROLE_LIST = 12;
  private static final int METHODID_ROLE_DELETE = 13;
  private static final int METHODID_ROLE_GRANT_PERMISSION = 14;
  private static final int METHODID_ROLE_REVOKE_PERMISSION = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTH_ENABLE:
          serviceImpl.authEnable((io.etcd.jetcd.api.AuthEnableRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthEnableResponse>) responseObserver);
          break;
        case METHODID_AUTH_DISABLE:
          serviceImpl.authDisable((io.etcd.jetcd.api.AuthDisableRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthDisableResponse>) responseObserver);
          break;
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((io.etcd.jetcd.api.AuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_USER_ADD:
          serviceImpl.userAdd((io.etcd.jetcd.api.AuthUserAddRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserAddResponse>) responseObserver);
          break;
        case METHODID_USER_GET:
          serviceImpl.userGet((io.etcd.jetcd.api.AuthUserGetRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserGetResponse>) responseObserver);
          break;
        case METHODID_USER_LIST:
          serviceImpl.userList((io.etcd.jetcd.api.AuthUserListRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserListResponse>) responseObserver);
          break;
        case METHODID_USER_DELETE:
          serviceImpl.userDelete((io.etcd.jetcd.api.AuthUserDeleteRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserDeleteResponse>) responseObserver);
          break;
        case METHODID_USER_CHANGE_PASSWORD:
          serviceImpl.userChangePassword((io.etcd.jetcd.api.AuthUserChangePasswordRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserChangePasswordResponse>) responseObserver);
          break;
        case METHODID_USER_GRANT_ROLE:
          serviceImpl.userGrantRole((io.etcd.jetcd.api.AuthUserGrantRoleRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserGrantRoleResponse>) responseObserver);
          break;
        case METHODID_USER_REVOKE_ROLE:
          serviceImpl.userRevokeRole((io.etcd.jetcd.api.AuthUserRevokeRoleRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthUserRevokeRoleResponse>) responseObserver);
          break;
        case METHODID_ROLE_ADD:
          serviceImpl.roleAdd((io.etcd.jetcd.api.AuthRoleAddRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleAddResponse>) responseObserver);
          break;
        case METHODID_ROLE_GET:
          serviceImpl.roleGet((io.etcd.jetcd.api.AuthRoleGetRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleGetResponse>) responseObserver);
          break;
        case METHODID_ROLE_LIST:
          serviceImpl.roleList((io.etcd.jetcd.api.AuthRoleListRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleListResponse>) responseObserver);
          break;
        case METHODID_ROLE_DELETE:
          serviceImpl.roleDelete((io.etcd.jetcd.api.AuthRoleDeleteRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleDeleteResponse>) responseObserver);
          break;
        case METHODID_ROLE_GRANT_PERMISSION:
          serviceImpl.roleGrantPermission((io.etcd.jetcd.api.AuthRoleGrantPermissionRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleGrantPermissionResponse>) responseObserver);
          break;
        case METHODID_ROLE_REVOKE_PERMISSION:
          serviceImpl.roleRevokePermission((io.etcd.jetcd.api.AuthRoleRevokePermissionRequest) request,
              (io.grpc.stub.StreamObserver<io.etcd.jetcd.api.AuthRoleRevokePermissionResponse>) responseObserver);
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

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.etcd.jetcd.api.JetcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getAuthEnableMethod())
              .addMethod(getAuthDisableMethod())
              .addMethod(getAuthenticateMethod())
              .addMethod(getUserAddMethod())
              .addMethod(getUserGetMethod())
              .addMethod(getUserListMethod())
              .addMethod(getUserDeleteMethod())
              .addMethod(getUserChangePasswordMethod())
              .addMethod(getUserGrantRoleMethod())
              .addMethod(getUserRevokeRoleMethod())
              .addMethod(getRoleAddMethod())
              .addMethod(getRoleGetMethod())
              .addMethod(getRoleListMethod())
              .addMethod(getRoleDeleteMethod())
              .addMethod(getRoleGrantPermissionMethod())
              .addMethod(getRoleRevokePermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
