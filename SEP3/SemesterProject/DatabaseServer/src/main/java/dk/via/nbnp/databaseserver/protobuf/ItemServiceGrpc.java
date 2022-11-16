package dk.via.nbnp.databaseserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: item.proto")
public final class ItemServiceGrpc {

  private ItemServiceGrpc() {}

  public static final String SERVICE_NAME = "ItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getItem",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getGetItemMethod;
    if ((getGetItemMethod = ItemServiceGrpc.getGetItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemMethod = ItemServiceGrpc.getGetItemMethod) == null) {
          ItemServiceGrpc.getGetItemMethod = getGetItemMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("getItem"))
              .build();
        }
      }
    }
    return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getCreateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createItem",
      requestType = dk.via.nbnp.databaseserver.protobuf.CreateItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getCreateItemMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getCreateItemMethod;
    if ((getCreateItemMethod = ItemServiceGrpc.getCreateItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getCreateItemMethod = ItemServiceGrpc.getCreateItemMethod) == null) {
          ItemServiceGrpc.getCreateItemMethod = getCreateItemMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.CreateItemDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("createItem"))
              .build();
        }
      }
    }
    return getCreateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getUpdateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateItem",
      requestType = dk.via.nbnp.databaseserver.protobuf.CreateItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getUpdateItemMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getUpdateItemMethod;
    if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
          ItemServiceGrpc.getUpdateItemMethod = getUpdateItemMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.CreateItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.CreateItemDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("updateItem"))
              .build();
        }
      }
    }
    return getUpdateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getDeleteItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteItem",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getDeleteItemMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getDeleteItemMethod;
    if ((getDeleteItemMethod = ItemServiceGrpc.getDeleteItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getDeleteItemMethod = ItemServiceGrpc.getDeleteItemMethod) == null) {
          ItemServiceGrpc.getDeleteItemMethod = getDeleteItemMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("deleteItem"))
              .build();
        }
      }
    }
    return getDeleteItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceStub>() {
        @java.lang.Override
        public ItemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceStub(channel, callOptions);
        }
      };
    return ItemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceBlockingStub>() {
        @java.lang.Override
        public ItemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceFutureStub>() {
        @java.lang.Override
        public ItemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceFutureStub(channel, callOptions);
        }
      };
    return ItemServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ItemServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getItem(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     */
    public void createItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateItemMethod(), responseObserver);
    }

    /**
     */
    public void updateItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateItemMethod(), responseObserver);
    }

    /**
     */
    public void deleteItem(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getCreateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.CreateItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_CREATE_ITEM)))
          .addMethod(
            getUpdateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.CreateItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_UPDATE_ITEM)))
          .addMethod(
            getDeleteItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_DELETE_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class ItemServiceStub extends io.grpc.stub.AbstractAsyncStub<ItemServiceStub> {
    private ItemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceStub(channel, callOptions);
    }

    /**
     */
    public void getItem(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteItem(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ItemServiceBlockingStub> {
    private ItemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Item getItem(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Item createItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Item updateItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Item deleteItem(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ItemServiceFutureStub> {
    private ItemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Item> getItem(
        dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Item> createItem(
        dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Item> updateItem(
        dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Item> deleteItem(
        dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ITEM = 0;
  private static final int METHODID_CREATE_ITEM = 1;
  private static final int METHODID_UPDATE_ITEM = 2;
  private static final int METHODID_DELETE_ITEM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ITEM:
          serviceImpl.getItem((dk.via.nbnp.databaseserver.protobuf.SearchItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
          break;
        case METHODID_CREATE_ITEM:
          serviceImpl.createItem((dk.via.nbnp.databaseserver.protobuf.CreateItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM:
          serviceImpl.updateItem((dk.via.nbnp.databaseserver.protobuf.CreateItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
          break;
        case METHODID_DELETE_ITEM:
          serviceImpl.deleteItem((dk.via.nbnp.databaseserver.protobuf.SearchItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
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

  private static abstract class ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.ItemOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemService");
    }
  }

  private static final class ItemServiceFileDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier {
    ItemServiceFileDescriptorSupplier() {}
  }

  private static final class ItemServiceMethodDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemServiceFileDescriptorSupplier())
              .addMethod(getGetItemMethod())
              .addMethod(getCreateItemMethod())
              .addMethod(getUpdateItemMethod())
              .addMethod(getDeleteItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
