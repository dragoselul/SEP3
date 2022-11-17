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

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getItems",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemsMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getGetItemsMethod;
    if ((getGetItemsMethod = ItemServiceGrpc.getGetItemsMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemsMethod = ItemServiceGrpc.getGetItemsMethod) == null) {
          ItemServiceGrpc.getGetItemsMethod = getGetItemsMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("getItems"))
              .build();
        }
      }
    }
    return getGetItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemsByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getItemsByOwner",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemsByOwnerMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getGetItemsByOwnerMethod;
    if ((getGetItemsByOwnerMethod = ItemServiceGrpc.getGetItemsByOwnerMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemsByOwnerMethod = ItemServiceGrpc.getGetItemsByOwnerMethod) == null) {
          ItemServiceGrpc.getGetItemsByOwnerMethod = getGetItemsByOwnerMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getItemsByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("getItemsByOwner"))
              .build();
        }
      }
    }
    return getGetItemsByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getItemById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getGetItemByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getGetItemByIdMethod;
    if ((getGetItemByIdMethod = ItemServiceGrpc.getGetItemByIdMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getGetItemByIdMethod = ItemServiceGrpc.getGetItemByIdMethod) == null) {
          ItemServiceGrpc.getGetItemByIdMethod = getGetItemByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getItemById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchItemDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("getItemById"))
              .build();
        }
      }
    }
    return getGetItemByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getUpdateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateItem",
      requestType = dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO,
      dk.via.nbnp.databaseserver.protobuf.Item> getUpdateItemMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO, dk.via.nbnp.databaseserver.protobuf.Item> getUpdateItemMethod;
    if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
          ItemServiceGrpc.getUpdateItemMethod = getUpdateItemMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO, dk.via.nbnp.databaseserver.protobuf.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO.getDefaultInstance()))
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
    public void createItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateItemMethod(), responseObserver);
    }

    /**
     */
    public void getItems(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemsMethod(), responseObserver);
    }

    /**
     */
    public void getItemsByOwner(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemsByOwnerMethod(), responseObserver);
    }

    /**
     */
    public void getItemById(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateItem(dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO request,
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
            getCreateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.CreateItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_CREATE_ITEM)))
          .addMethod(
            getGetItemsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_GET_ITEMS)))
          .addMethod(
            getGetItemsByOwnerMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_GET_ITEMS_BY_OWNER)))
          .addMethod(
            getGetItemByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchItemDTO,
                dk.via.nbnp.databaseserver.protobuf.Item>(
                  this, METHODID_GET_ITEM_BY_ID)))
          .addMethod(
            getUpdateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO,
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
    public void createItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItems(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemsByOwner(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetItemsByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemById(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItem(dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO request,
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
    public dk.via.nbnp.databaseserver.protobuf.Item createItem(dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.nbnp.databaseserver.protobuf.Item> getItems(
        dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.nbnp.databaseserver.protobuf.Item> getItemsByOwner(
        dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetItemsByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Item getItemById(dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Item updateItem(dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO request) {
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
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Item> createItem(
        dk.via.nbnp.databaseserver.protobuf.CreateItemDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Item> getItemById(
        dk.via.nbnp.databaseserver.protobuf.SearchItemDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Item> updateItem(
        dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO request) {
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

  private static final int METHODID_CREATE_ITEM = 0;
  private static final int METHODID_GET_ITEMS = 1;
  private static final int METHODID_GET_ITEMS_BY_OWNER = 2;
  private static final int METHODID_GET_ITEM_BY_ID = 3;
  private static final int METHODID_UPDATE_ITEM = 4;
  private static final int METHODID_DELETE_ITEM = 5;

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
        case METHODID_CREATE_ITEM:
          serviceImpl.createItem((dk.via.nbnp.databaseserver.protobuf.CreateItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
          break;
        case METHODID_GET_ITEMS:
          serviceImpl.getItems((dk.via.nbnp.databaseserver.protobuf.SearchItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
          break;
        case METHODID_GET_ITEMS_BY_OWNER:
          serviceImpl.getItemsByOwner((dk.via.nbnp.databaseserver.protobuf.SearchItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
          break;
        case METHODID_GET_ITEM_BY_ID:
          serviceImpl.getItemById((dk.via.nbnp.databaseserver.protobuf.SearchItemDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Item>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM:
          serviceImpl.updateItem((dk.via.nbnp.databaseserver.protobuf.UpdateItemDTO) request,
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
              .addMethod(getCreateItemMethod())
              .addMethod(getGetItemsMethod())
              .addMethod(getGetItemsByOwnerMethod())
              .addMethod(getGetItemByIdMethod())
              .addMethod(getUpdateItemMethod())
              .addMethod(getDeleteItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
