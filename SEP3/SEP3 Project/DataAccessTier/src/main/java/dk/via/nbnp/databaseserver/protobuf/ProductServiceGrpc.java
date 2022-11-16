package dk.via.nbnp.databaseserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchProductDTO,
      dk.via.nbnp.databaseserver.protobuf.Product> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProduct",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchProductDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchProductDTO,
      dk.via.nbnp.databaseserver.protobuf.Product> getGetProductMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchProductDTO, dk.via.nbnp.databaseserver.protobuf.Product> getGetProductMethod;
    if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
          ProductServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchProductDTO, dk.via.nbnp.databaseserver.protobuf.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchProductDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO,
      dk.via.nbnp.databaseserver.protobuf.Product> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProduct",
      requestType = dk.via.nbnp.databaseserver.protobuf.CreateProductDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO,
      dk.via.nbnp.databaseserver.protobuf.Product> getCreateProductMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO, dk.via.nbnp.databaseserver.protobuf.Product> getCreateProductMethod;
    if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
          ProductServiceGrpc.getCreateProductMethod = getCreateProductMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO, dk.via.nbnp.databaseserver.protobuf.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.CreateProductDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("createProduct"))
              .build();
        }
      }
    }
    return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO,
      dk.via.nbnp.databaseserver.protobuf.Product> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProduct",
      requestType = dk.via.nbnp.databaseserver.protobuf.CreateProductDTO.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO,
      dk.via.nbnp.databaseserver.protobuf.Product> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO, dk.via.nbnp.databaseserver.protobuf.Product> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
          ProductServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.CreateProductDTO, dk.via.nbnp.databaseserver.protobuf.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.CreateProductDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("updateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProduct(dk.via.nbnp.databaseserver.protobuf.SearchProductDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    public void createProduct(dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchProductDTO,
                dk.via.nbnp.databaseserver.protobuf.Product>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getCreateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.CreateProductDTO,
                dk.via.nbnp.databaseserver.protobuf.Product>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.CreateProductDTO,
                dk.via.nbnp.databaseserver.protobuf.Product>(
                  this, METHODID_UPDATE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProduct(dk.via.nbnp.databaseserver.protobuf.SearchProductDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProduct(dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Product getProduct(dk.via.nbnp.databaseserver.protobuf.SearchProductDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Product createProduct(dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Product updateProduct(dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Product> getProduct(
        dk.via.nbnp.databaseserver.protobuf.SearchProductDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Product> createProduct(
        dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Product> updateProduct(
        dk.via.nbnp.databaseserver.protobuf.CreateProductDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT = 0;
  private static final int METHODID_CREATE_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((dk.via.nbnp.databaseserver.protobuf.SearchProductDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((dk.via.nbnp.databaseserver.protobuf.CreateProductDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((dk.via.nbnp.databaseserver.protobuf.CreateProductDTO) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Product>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetProductMethod())
              .addMethod(getCreateProductMethod())
              .addMethod(getUpdateProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}