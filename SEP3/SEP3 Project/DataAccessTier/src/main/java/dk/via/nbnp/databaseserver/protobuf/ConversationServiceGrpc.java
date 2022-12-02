package dk.via.nbnp.databaseserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: conversation.proto")
public final class ConversationServiceGrpc {

  private ConversationServiceGrpc() {}

  public static final String SERVICE_NAME = "ConversationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getCreateConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createConversation",
      requestType = dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getCreateConversationMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation> getCreateConversationMethod;
    if ((getCreateConversationMethod = ConversationServiceGrpc.getCreateConversationMethod) == null) {
      synchronized (ConversationServiceGrpc.class) {
        if ((getCreateConversationMethod = ConversationServiceGrpc.getCreateConversationMethod) == null) {
          ConversationServiceGrpc.getCreateConversationMethod = getCreateConversationMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Conversation.getDefaultInstance()))
              .setSchemaDescriptor(new ConversationServiceMethodDescriptorSupplier("createConversation"))
              .build();
        }
      }
    }
    return getCreateConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getGetConversationsByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConversationsByUser",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getGetConversationsByUserMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation> getGetConversationsByUserMethod;
    if ((getGetConversationsByUserMethod = ConversationServiceGrpc.getGetConversationsByUserMethod) == null) {
      synchronized (ConversationServiceGrpc.class) {
        if ((getGetConversationsByUserMethod = ConversationServiceGrpc.getGetConversationsByUserMethod) == null) {
          ConversationServiceGrpc.getGetConversationsByUserMethod = getGetConversationsByUserMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getConversationsByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Conversation.getDefaultInstance()))
              .setSchemaDescriptor(new ConversationServiceMethodDescriptorSupplier("getConversationsByUser"))
              .build();
        }
      }
    }
    return getGetConversationsByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getGetConversationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConversationById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getGetConversationByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation> getGetConversationByIdMethod;
    if ((getGetConversationByIdMethod = ConversationServiceGrpc.getGetConversationByIdMethod) == null) {
      synchronized (ConversationServiceGrpc.class) {
        if ((getGetConversationByIdMethod = ConversationServiceGrpc.getGetConversationByIdMethod) == null) {
          ConversationServiceGrpc.getGetConversationByIdMethod = getGetConversationByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getConversationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Conversation.getDefaultInstance()))
              .setSchemaDescriptor(new ConversationServiceMethodDescriptorSupplier("getConversationById"))
              .build();
        }
      }
    }
    return getGetConversationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getDeleteConversationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteConversationById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
      dk.via.nbnp.databaseserver.protobuf.Conversation> getDeleteConversationByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation> getDeleteConversationByIdMethod;
    if ((getDeleteConversationByIdMethod = ConversationServiceGrpc.getDeleteConversationByIdMethod) == null) {
      synchronized (ConversationServiceGrpc.class) {
        if ((getDeleteConversationByIdMethod = ConversationServiceGrpc.getDeleteConversationByIdMethod) == null) {
          ConversationServiceGrpc.getDeleteConversationByIdMethod = getDeleteConversationByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO, dk.via.nbnp.databaseserver.protobuf.Conversation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteConversationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Conversation.getDefaultInstance()))
              .setSchemaDescriptor(new ConversationServiceMethodDescriptorSupplier("deleteConversationById"))
              .build();
        }
      }
    }
    return getDeleteConversationByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversationServiceStub>() {
        @java.lang.Override
        public ConversationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversationServiceStub(channel, callOptions);
        }
      };
    return ConversationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversationServiceBlockingStub>() {
        @java.lang.Override
        public ConversationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversationServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversationServiceFutureStub>() {
        @java.lang.Override
        public ConversationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversationServiceFutureStub(channel, callOptions);
        }
      };
    return ConversationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConversationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createConversation(dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConversationMethod(), responseObserver);
    }

    /**
     */
    public void getConversationsByUser(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConversationsByUserMethod(), responseObserver);
    }

    /**
     */
    public void getConversationById(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConversationByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteConversationById(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConversationByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO,
                dk.via.nbnp.databaseserver.protobuf.Conversation>(
                  this, METHODID_CREATE_CONVERSATION)))
          .addMethod(
            getGetConversationsByUserMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
                dk.via.nbnp.databaseserver.protobuf.Conversation>(
                  this, METHODID_GET_CONVERSATIONS_BY_USER)))
          .addMethod(
            getGetConversationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
                dk.via.nbnp.databaseserver.protobuf.Conversation>(
                  this, METHODID_GET_CONVERSATION_BY_ID)))
          .addMethod(
            getDeleteConversationByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO,
                dk.via.nbnp.databaseserver.protobuf.Conversation>(
                  this, METHODID_DELETE_CONVERSATION_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ConversationServiceStub extends io.grpc.stub.AbstractAsyncStub<ConversationServiceStub> {
    private ConversationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createConversation(dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConversationsByUser(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetConversationsByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConversationById(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConversationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteConversationById(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConversationByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConversationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConversationServiceBlockingStub> {
    private ConversationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Conversation createConversation(dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConversationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.nbnp.databaseserver.protobuf.Conversation> getConversationsByUser(
        dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetConversationsByUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Conversation getConversationById(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConversationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Conversation deleteConversationById(dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConversationByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConversationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConversationServiceFutureStub> {
    private ConversationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Conversation> createConversation(
        dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Conversation> getConversationById(
        dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConversationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Conversation> deleteConversationById(
        dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConversationByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONVERSATION = 0;
  private static final int METHODID_GET_CONVERSATIONS_BY_USER = 1;
  private static final int METHODID_GET_CONVERSATION_BY_ID = 2;
  private static final int METHODID_DELETE_CONVERSATION_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CONVERSATION:
          serviceImpl.createConversation((dk.via.nbnp.databaseserver.protobuf.CreateConversationDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation>) responseObserver);
          break;
        case METHODID_GET_CONVERSATIONS_BY_USER:
          serviceImpl.getConversationsByUser((dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation>) responseObserver);
          break;
        case METHODID_GET_CONVERSATION_BY_ID:
          serviceImpl.getConversationById((dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation>) responseObserver);
          break;
        case METHODID_DELETE_CONVERSATION_BY_ID:
          serviceImpl.deleteConversationById((dk.via.nbnp.databaseserver.protobuf.SearchConversationDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Conversation>) responseObserver);
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

  private static abstract class ConversationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.ConversationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversationService");
    }
  }

  private static final class ConversationServiceFileDescriptorSupplier
      extends ConversationServiceBaseDescriptorSupplier {
    ConversationServiceFileDescriptorSupplier() {}
  }

  private static final class ConversationServiceMethodDescriptorSupplier
      extends ConversationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversationServiceFileDescriptorSupplier())
              .addMethod(getCreateConversationMethod())
              .addMethod(getGetConversationsByUserMethod())
              .addMethod(getGetConversationByIdMethod())
              .addMethod(getDeleteConversationByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
