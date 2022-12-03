package dk.via.nbnp.databaseserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: notification.proto")
public final class NotificationServiceGrpc {

  private NotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "NotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
      dk.via.nbnp.databaseserver.protobuf.Notification> getGetNotificationsByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNotificationsByUser",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Notification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
      dk.via.nbnp.databaseserver.protobuf.Notification> getGetNotificationsByUserMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO, dk.via.nbnp.databaseserver.protobuf.Notification> getGetNotificationsByUserMethod;
    if ((getGetNotificationsByUserMethod = NotificationServiceGrpc.getGetNotificationsByUserMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetNotificationsByUserMethod = NotificationServiceGrpc.getGetNotificationsByUserMethod) == null) {
          NotificationServiceGrpc.getGetNotificationsByUserMethod = getGetNotificationsByUserMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO, dk.via.nbnp.databaseserver.protobuf.Notification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getNotificationsByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Notification.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("getNotificationsByUser"))
              .build();
        }
      }
    }
    return getGetNotificationsByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
      dk.via.nbnp.databaseserver.protobuf.Empty> getDeleteNotificationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteNotificationById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
      dk.via.nbnp.databaseserver.protobuf.Empty> getDeleteNotificationByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO, dk.via.nbnp.databaseserver.protobuf.Empty> getDeleteNotificationByIdMethod;
    if ((getDeleteNotificationByIdMethod = NotificationServiceGrpc.getDeleteNotificationByIdMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getDeleteNotificationByIdMethod = NotificationServiceGrpc.getDeleteNotificationByIdMethod) == null) {
          NotificationServiceGrpc.getDeleteNotificationByIdMethod = getDeleteNotificationByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO, dk.via.nbnp.databaseserver.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteNotificationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("deleteNotificationById"))
              .build();
        }
      }
    }
    return getDeleteNotificationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
      dk.via.nbnp.databaseserver.protobuf.Empty> getDeleteNotificationsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteNotificationsByUserId",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
      dk.via.nbnp.databaseserver.protobuf.Empty> getDeleteNotificationsByUserIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO, dk.via.nbnp.databaseserver.protobuf.Empty> getDeleteNotificationsByUserIdMethod;
    if ((getDeleteNotificationsByUserIdMethod = NotificationServiceGrpc.getDeleteNotificationsByUserIdMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getDeleteNotificationsByUserIdMethod = NotificationServiceGrpc.getDeleteNotificationsByUserIdMethod) == null) {
          NotificationServiceGrpc.getDeleteNotificationsByUserIdMethod = getDeleteNotificationsByUserIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO, dk.via.nbnp.databaseserver.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteNotificationsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("deleteNotificationsByUserId"))
              .build();
        }
      }
    }
    return getDeleteNotificationsByUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceStub>() {
        @java.lang.Override
        public NotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceStub(channel, callOptions);
        }
      };
    return NotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceBlockingStub>() {
        @java.lang.Override
        public NotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return NotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceFutureStub>() {
        @java.lang.Override
        public NotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceFutureStub(channel, callOptions);
        }
      };
    return NotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NotificationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNotificationsByUser(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Notification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationsByUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotificationById(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotificationsByUserId(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationsByUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNotificationsByUserMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
                dk.via.nbnp.databaseserver.protobuf.Notification>(
                  this, METHODID_GET_NOTIFICATIONS_BY_USER)))
          .addMethod(
            getDeleteNotificationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
                dk.via.nbnp.databaseserver.protobuf.Empty>(
                  this, METHODID_DELETE_NOTIFICATION_BY_ID)))
          .addMethod(
            getDeleteNotificationsByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO,
                dk.via.nbnp.databaseserver.protobuf.Empty>(
                  this, METHODID_DELETE_NOTIFICATIONS_BY_USER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationServiceStub extends io.grpc.stub.AbstractAsyncStub<NotificationServiceStub> {
    private NotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNotificationsByUser(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Notification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetNotificationsByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotificationById(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotificationsByUserId(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NotificationServiceBlockingStub> {
    private NotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<dk.via.nbnp.databaseserver.protobuf.Notification> getNotificationsByUser(
        dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetNotificationsByUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Empty deleteNotificationById(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Empty deleteNotificationsByUserId(dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationsByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NotificationServiceFutureStub> {
    private NotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Empty> deleteNotificationById(
        dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Empty> deleteNotificationsByUserId(
        dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationsByUserIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NOTIFICATIONS_BY_USER = 0;
  private static final int METHODID_DELETE_NOTIFICATION_BY_ID = 1;
  private static final int METHODID_DELETE_NOTIFICATIONS_BY_USER_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NOTIFICATIONS_BY_USER:
          serviceImpl.getNotificationsByUser((dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Notification>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATION_BY_ID:
          serviceImpl.deleteNotificationById((dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATIONS_BY_USER_ID:
          serviceImpl.deleteNotificationsByUserId((dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Empty>) responseObserver);
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

  private static abstract class NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.NotificationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationService");
    }
  }

  private static final class NotificationServiceFileDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier {
    NotificationServiceFileDescriptorSupplier() {}
  }

  private static final class NotificationServiceMethodDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationServiceFileDescriptorSupplier())
              .addMethod(getGetNotificationsByUserMethod())
              .addMethod(getDeleteNotificationByIdMethod())
              .addMethod(getDeleteNotificationsByUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
