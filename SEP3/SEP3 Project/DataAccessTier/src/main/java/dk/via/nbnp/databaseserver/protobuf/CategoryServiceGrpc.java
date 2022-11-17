package dk.via.nbnp.databaseserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: category.proto")
public final class CategoryServiceGrpc {

  private CategoryServiceGrpc() {}

  public static final String SERVICE_NAME = "CategoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.Empty,
      dk.via.nbnp.databaseserver.protobuf.Category> getGetCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCategories",
      requestType = dk.via.nbnp.databaseserver.protobuf.Empty.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Category.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.Empty,
      dk.via.nbnp.databaseserver.protobuf.Category> getGetCategoriesMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.Empty, dk.via.nbnp.databaseserver.protobuf.Category> getGetCategoriesMethod;
    if ((getGetCategoriesMethod = CategoryServiceGrpc.getGetCategoriesMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getGetCategoriesMethod = CategoryServiceGrpc.getGetCategoriesMethod) == null) {
          CategoryServiceGrpc.getGetCategoriesMethod = getGetCategoriesMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.Empty, dk.via.nbnp.databaseserver.protobuf.Category>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Category.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("getCategories"))
              .build();
        }
      }
    }
    return getGetCategoriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub>() {
        @java.lang.Override
        public CategoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceStub(channel, callOptions);
        }
      };
    return CategoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub>() {
        @java.lang.Override
        public CategoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceBlockingStub(channel, callOptions);
        }
      };
    return CategoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub>() {
        @java.lang.Override
        public CategoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceFutureStub(channel, callOptions);
        }
      };
    return CategoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CategoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCategories(dk.via.nbnp.databaseserver.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Category> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCategoriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.Empty,
                dk.via.nbnp.databaseserver.protobuf.Category>(
                  this, METHODID_GET_CATEGORIES)))
          .build();
    }
  }

  /**
   */
  public static final class CategoryServiceStub extends io.grpc.stub.AbstractAsyncStub<CategoryServiceStub> {
    private CategoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCategories(dk.via.nbnp.databaseserver.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Category> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetCategoriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CategoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CategoryServiceBlockingStub> {
    private CategoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<dk.via.nbnp.databaseserver.protobuf.Category> getCategories(
        dk.via.nbnp.databaseserver.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetCategoriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CategoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CategoryServiceFutureStub> {
    private CategoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_CATEGORIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CategoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CATEGORIES:
          serviceImpl.getCategories((dk.via.nbnp.databaseserver.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Category>) responseObserver);
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

  private static abstract class CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.CategoryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoryService");
    }
  }

  private static final class CategoryServiceFileDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier {
    CategoryServiceFileDescriptorSupplier() {}
  }

  private static final class CategoryServiceMethodDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CategoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CategoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoryServiceFileDescriptorSupplier())
              .addMethod(getGetCategoriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
