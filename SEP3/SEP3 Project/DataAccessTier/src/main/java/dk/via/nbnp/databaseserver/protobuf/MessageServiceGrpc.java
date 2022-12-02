package dk.via.nbnp.databaseserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: message.proto")
public final class MessageServiceGrpc {

  private MessageServiceGrpc() {}

  public static final String SERVICE_NAME = "MessageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getCreateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createMessage",
      requestType = dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getCreateMessageMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message> getCreateMessageMethod;
    if ((getCreateMessageMethod = MessageServiceGrpc.getCreateMessageMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getCreateMessageMethod = MessageServiceGrpc.getCreateMessageMethod) == null) {
          MessageServiceGrpc.getCreateMessageMethod = getCreateMessageMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("createMessage"))
              .build();
        }
      }
    }
    return getCreateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getGetMessageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMessageById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getGetMessageByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message> getGetMessageByIdMethod;
    if ((getGetMessageByIdMethod = MessageServiceGrpc.getGetMessageByIdMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getGetMessageByIdMethod = MessageServiceGrpc.getGetMessageByIdMethod) == null) {
          MessageServiceGrpc.getGetMessageByIdMethod = getGetMessageByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMessageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("getMessageById"))
              .build();
        }
      }
    }
    return getGetMessageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getGetMessagesByConversationIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMessagesByConversationId",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getGetMessagesByConversationIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message> getGetMessagesByConversationIdMethod;
    if ((getGetMessagesByConversationIdMethod = MessageServiceGrpc.getGetMessagesByConversationIdMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getGetMessagesByConversationIdMethod = MessageServiceGrpc.getGetMessagesByConversationIdMethod) == null) {
          MessageServiceGrpc.getGetMessagesByConversationIdMethod = getGetMessagesByConversationIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMessagesByConversationId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("getMessagesByConversationId"))
              .build();
        }
      }
    }
    return getGetMessagesByConversationIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getDeleteMessageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMessageById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
      dk.via.nbnp.databaseserver.protobuf.Message> getDeleteMessageByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message> getDeleteMessageByIdMethod;
    if ((getDeleteMessageByIdMethod = MessageServiceGrpc.getDeleteMessageByIdMethod) == null) {
      synchronized (MessageServiceGrpc.class) {
        if ((getDeleteMessageByIdMethod = MessageServiceGrpc.getDeleteMessageByIdMethod) == null) {
          MessageServiceGrpc.getDeleteMessageByIdMethod = getDeleteMessageByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO, dk.via.nbnp.databaseserver.protobuf.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMessageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessageServiceMethodDescriptorSupplier("deleteMessageById"))
              .build();
        }
      }
    }
    return getDeleteMessageByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceStub>() {
        @java.lang.Override
        public MessageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceStub(channel, callOptions);
        }
      };
    return MessageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceBlockingStub>() {
        @java.lang.Override
        public MessageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceBlockingStub(channel, callOptions);
        }
      };
    return MessageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageServiceFutureStub>() {
        @java.lang.Override
        public MessageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageServiceFutureStub(channel, callOptions);
        }
      };
    return MessageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MessageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createMessage(dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMessageMethod(), responseObserver);
    }

    /**
     */
    public void getMessageById(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessageByIdMethod(), responseObserver);
    }

    /**
     */
    public void getMessagesByConversationId(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessagesByConversationIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteMessageById(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO,
                dk.via.nbnp.databaseserver.protobuf.Message>(
                  this, METHODID_CREATE_MESSAGE)))
          .addMethod(
            getGetMessageByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
                dk.via.nbnp.databaseserver.protobuf.Message>(
                  this, METHODID_GET_MESSAGE_BY_ID)))
          .addMethod(
            getGetMessagesByConversationIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
                dk.via.nbnp.databaseserver.protobuf.Message>(
                  this, METHODID_GET_MESSAGES_BY_CONVERSATION_ID)))
          .addMethod(
            getDeleteMessageByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO,
                dk.via.nbnp.databaseserver.protobuf.Message>(
                  this, METHODID_DELETE_MESSAGE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class MessageServiceStub extends io.grpc.stub.AbstractAsyncStub<MessageServiceStub> {
    private MessageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMessage(dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessageById(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMessageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessagesByConversationId(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMessagesByConversationIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMessageById(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessageServiceBlockingStub> {
    private MessageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Message createMessage(dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Message getMessageById(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMessageByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.nbnp.databaseserver.protobuf.Message> getMessagesByConversationId(
        dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMessagesByConversationIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Message deleteMessageById(dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MessageServiceFutureStub> {
    private MessageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Message> createMessage(
        dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Message> getMessageById(
        dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMessageByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Message> deleteMessageById(
        dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MESSAGE = 0;
  private static final int METHODID_GET_MESSAGE_BY_ID = 1;
  private static final int METHODID_GET_MESSAGES_BY_CONVERSATION_ID = 2;
  private static final int METHODID_DELETE_MESSAGE_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MESSAGE:
          serviceImpl.createMessage((dk.via.nbnp.databaseserver.protobuf.CreateMessageDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_BY_ID:
          serviceImpl.getMessageById((dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message>) responseObserver);
          break;
        case METHODID_GET_MESSAGES_BY_CONVERSATION_ID:
          serviceImpl.getMessagesByConversationId((dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE_BY_ID:
          serviceImpl.deleteMessageById((dk.via.nbnp.databaseserver.protobuf.SearchMessageDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Message>) responseObserver);
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

  private static abstract class MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageService");
    }
  }

  private static final class MessageServiceFileDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier {
    MessageServiceFileDescriptorSupplier() {}
  }

  private static final class MessageServiceMethodDescriptorSupplier
      extends MessageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageServiceFileDescriptorSupplier())
              .addMethod(getCreateMessageMethod())
              .addMethod(getGetMessageByIdMethod())
              .addMethod(getGetMessagesByConversationIdMethod())
              .addMethod(getDeleteMessageByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
