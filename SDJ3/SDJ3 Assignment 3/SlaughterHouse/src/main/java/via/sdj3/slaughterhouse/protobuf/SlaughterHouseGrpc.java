package via.sdj3.slaughterhouse.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlaughterHouse.proto")
public final class SlaughterHouseGrpc {

  private SlaughterHouseGrpc() {}

  public static final String SERVICE_NAME = "SlaughterHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.Package,
      via.sdj3.slaughterhouse.protobuf.RegistrationNumbers> getRetrieveRegNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveRegNumber",
      requestType = via.sdj3.slaughterhouse.protobuf.Package.class,
      responseType = via.sdj3.slaughterhouse.protobuf.RegistrationNumbers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.Package,
      via.sdj3.slaughterhouse.protobuf.RegistrationNumbers> getRetrieveRegNumberMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.Package, via.sdj3.slaughterhouse.protobuf.RegistrationNumbers> getRetrieveRegNumberMethod;
    if ((getRetrieveRegNumberMethod = SlaughterHouseGrpc.getRetrieveRegNumberMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getRetrieveRegNumberMethod = SlaughterHouseGrpc.getRetrieveRegNumberMethod) == null) {
          SlaughterHouseGrpc.getRetrieveRegNumberMethod = getRetrieveRegNumberMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse.protobuf.Package, via.sdj3.slaughterhouse.protobuf.RegistrationNumbers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "retrieveRegNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.Package.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.RegistrationNumbers.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("retrieveRegNumber"))
              .build();
        }
      }
    }
    return getRetrieveRegNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.Animal,
      via.sdj3.slaughterhouse.protobuf.Packages> getRetrievePackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrievePackage",
      requestType = via.sdj3.slaughterhouse.protobuf.Animal.class,
      responseType = via.sdj3.slaughterhouse.protobuf.Packages.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.Animal,
      via.sdj3.slaughterhouse.protobuf.Packages> getRetrievePackageMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhouse.protobuf.Animal, via.sdj3.slaughterhouse.protobuf.Packages> getRetrievePackageMethod;
    if ((getRetrievePackageMethod = SlaughterHouseGrpc.getRetrievePackageMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getRetrievePackageMethod = SlaughterHouseGrpc.getRetrievePackageMethod) == null) {
          SlaughterHouseGrpc.getRetrievePackageMethod = getRetrievePackageMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhouse.protobuf.Animal, via.sdj3.slaughterhouse.protobuf.Packages>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "retrievePackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.Animal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhouse.protobuf.Packages.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("retrievePackage"))
              .build();
        }
      }
    }
    return getRetrievePackageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterHouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub>() {
        @java.lang.Override
        public SlaughterHouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseStub(channel, callOptions);
        }
      };
    return SlaughterHouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterHouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub>() {
        @java.lang.Override
        public SlaughterHouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterHouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterHouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub>() {
        @java.lang.Override
        public SlaughterHouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterHouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterHouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void retrieveRegNumber(via.sdj3.slaughterhouse.protobuf.Package request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.RegistrationNumbers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveRegNumberMethod(), responseObserver);
    }

    /**
     */
    public void retrievePackage(via.sdj3.slaughterhouse.protobuf.Animal request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.Packages> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrievePackageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRetrieveRegNumberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse.protobuf.Package,
                via.sdj3.slaughterhouse.protobuf.RegistrationNumbers>(
                  this, METHODID_RETRIEVE_REG_NUMBER)))
          .addMethod(
            getRetrievePackageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhouse.protobuf.Animal,
                via.sdj3.slaughterhouse.protobuf.Packages>(
                  this, METHODID_RETRIEVE_PACKAGE)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterHouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterHouseStub> {
    private SlaughterHouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseStub(channel, callOptions);
    }

    /**
     */
    public void retrieveRegNumber(via.sdj3.slaughterhouse.protobuf.Package request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.RegistrationNumbers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveRegNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrievePackage(via.sdj3.slaughterhouse.protobuf.Animal request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.Packages> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrievePackageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterHouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterHouseBlockingStub> {
    private SlaughterHouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.slaughterhouse.protobuf.RegistrationNumbers retrieveRegNumber(via.sdj3.slaughterhouse.protobuf.Package request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveRegNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.slaughterhouse.protobuf.Packages retrievePackage(via.sdj3.slaughterhouse.protobuf.Animal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrievePackageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterHouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterHouseFutureStub> {
    private SlaughterHouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhouse.protobuf.RegistrationNumbers> retrieveRegNumber(
        via.sdj3.slaughterhouse.protobuf.Package request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveRegNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhouse.protobuf.Packages> retrievePackage(
        via.sdj3.slaughterhouse.protobuf.Animal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrievePackageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE_REG_NUMBER = 0;
  private static final int METHODID_RETRIEVE_PACKAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterHouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterHouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETRIEVE_REG_NUMBER:
          serviceImpl.retrieveRegNumber((via.sdj3.slaughterhouse.protobuf.Package) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.RegistrationNumbers>) responseObserver);
          break;
        case METHODID_RETRIEVE_PACKAGE:
          serviceImpl.retrievePackage((via.sdj3.slaughterhouse.protobuf.Animal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhouse.protobuf.Packages>) responseObserver);
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

  private static abstract class SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterHouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaughterhouse.protobuf.SlaughterHouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterHouse");
    }
  }

  private static final class SlaughterHouseFileDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier {
    SlaughterHouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterHouseMethodDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterHouseMethodDescriptorSupplier(String methodName) {
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
      synchronized (SlaughterHouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterHouseFileDescriptorSupplier())
              .addMethod(getRetrieveRegNumberMethod())
              .addMethod(getRetrievePackageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
