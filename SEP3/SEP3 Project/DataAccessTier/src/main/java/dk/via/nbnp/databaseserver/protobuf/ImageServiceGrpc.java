package dk.via.nbnp.databaseserver.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: image.proto")
public final class ImageServiceGrpc {

  private ImageServiceGrpc() {}

  public static final String SERVICE_NAME = "ImageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.UploadImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getUploadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImage",
      requestType = dk.via.nbnp.databaseserver.protobuf.UploadImageDto.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.UploadImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getUploadImageMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.UploadImageDto, dk.via.nbnp.databaseserver.protobuf.Image> getUploadImageMethod;
    if ((getUploadImageMethod = ImageServiceGrpc.getUploadImageMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getUploadImageMethod = ImageServiceGrpc.getUploadImageMethod) == null) {
          ImageServiceGrpc.getUploadImageMethod = getUploadImageMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.UploadImageDto, dk.via.nbnp.databaseserver.protobuf.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.UploadImageDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Image.getDefaultInstance()))
              .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("UploadImage"))
              .build();
        }
      }
    }
    return getUploadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getGetImageByItemIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageByItemId",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchImageDto.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getGetImageByItemIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto, dk.via.nbnp.databaseserver.protobuf.Image> getGetImageByItemIdMethod;
    if ((getGetImageByItemIdMethod = ImageServiceGrpc.getGetImageByItemIdMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getGetImageByItemIdMethod = ImageServiceGrpc.getGetImageByItemIdMethod) == null) {
          ImageServiceGrpc.getGetImageByItemIdMethod = getGetImageByItemIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchImageDto, dk.via.nbnp.databaseserver.protobuf.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImageByItemId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchImageDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Image.getDefaultInstance()))
              .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("GetImageByItemId"))
              .build();
        }
      }
    }
    return getGetImageByItemIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getGetImageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchImageDto.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getGetImageByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto, dk.via.nbnp.databaseserver.protobuf.Image> getGetImageByIdMethod;
    if ((getGetImageByIdMethod = ImageServiceGrpc.getGetImageByIdMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getGetImageByIdMethod = ImageServiceGrpc.getGetImageByIdMethod) == null) {
          ImageServiceGrpc.getGetImageByIdMethod = getGetImageByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchImageDto, dk.via.nbnp.databaseserver.protobuf.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchImageDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Image.getDefaultInstance()))
              .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("GetImageById"))
              .build();
        }
      }
    }
    return getGetImageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getDeleteImageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImageById",
      requestType = dk.via.nbnp.databaseserver.protobuf.SearchImageDto.class,
      responseType = dk.via.nbnp.databaseserver.protobuf.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
      dk.via.nbnp.databaseserver.protobuf.Image> getDeleteImageByIdMethod() {
    io.grpc.MethodDescriptor<dk.via.nbnp.databaseserver.protobuf.SearchImageDto, dk.via.nbnp.databaseserver.protobuf.Image> getDeleteImageByIdMethod;
    if ((getDeleteImageByIdMethod = ImageServiceGrpc.getDeleteImageByIdMethod) == null) {
      synchronized (ImageServiceGrpc.class) {
        if ((getDeleteImageByIdMethod = ImageServiceGrpc.getDeleteImageByIdMethod) == null) {
          ImageServiceGrpc.getDeleteImageByIdMethod = getDeleteImageByIdMethod =
              io.grpc.MethodDescriptor.<dk.via.nbnp.databaseserver.protobuf.SearchImageDto, dk.via.nbnp.databaseserver.protobuf.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteImageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.SearchImageDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.nbnp.databaseserver.protobuf.Image.getDefaultInstance()))
              .setSchemaDescriptor(new ImageServiceMethodDescriptorSupplier("DeleteImageById"))
              .build();
        }
      }
    }
    return getDeleteImageByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageServiceStub>() {
        @java.lang.Override
        public ImageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageServiceStub(channel, callOptions);
        }
      };
    return ImageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageServiceBlockingStub>() {
        @java.lang.Override
        public ImageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageServiceBlockingStub(channel, callOptions);
        }
      };
    return ImageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageServiceFutureStub>() {
        @java.lang.Override
        public ImageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageServiceFutureStub(channel, callOptions);
        }
      };
    return ImageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ImageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void uploadImage(dk.via.nbnp.databaseserver.protobuf.UploadImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadImageMethod(), responseObserver);
    }

    /**
     */
    public void getImageByItemId(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageByItemIdMethod(), responseObserver);
    }

    /**
     */
    public void getImageById(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteImageById(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteImageByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.UploadImageDto,
                dk.via.nbnp.databaseserver.protobuf.Image>(
                  this, METHODID_UPLOAD_IMAGE)))
          .addMethod(
            getGetImageByItemIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
                dk.via.nbnp.databaseserver.protobuf.Image>(
                  this, METHODID_GET_IMAGE_BY_ITEM_ID)))
          .addMethod(
            getGetImageByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
                dk.via.nbnp.databaseserver.protobuf.Image>(
                  this, METHODID_GET_IMAGE_BY_ID)))
          .addMethod(
            getDeleteImageByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.nbnp.databaseserver.protobuf.SearchImageDto,
                dk.via.nbnp.databaseserver.protobuf.Image>(
                  this, METHODID_DELETE_IMAGE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ImageServiceStub extends io.grpc.stub.AbstractAsyncStub<ImageServiceStub> {
    private ImageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageServiceStub(channel, callOptions);
    }

    /**
     */
    public void uploadImage(dk.via.nbnp.databaseserver.protobuf.UploadImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImageByItemId(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetImageByItemIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImageById(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteImageById(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request,
        io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteImageByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImageServiceBlockingStub> {
    private ImageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Image uploadImage(dk.via.nbnp.databaseserver.protobuf.UploadImageDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dk.via.nbnp.databaseserver.protobuf.Image> getImageByItemId(
        dk.via.nbnp.databaseserver.protobuf.SearchImageDto request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetImageByItemIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Image getImageById(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.nbnp.databaseserver.protobuf.Image deleteImageById(dk.via.nbnp.databaseserver.protobuf.SearchImageDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteImageByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ImageServiceFutureStub> {
    private ImageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Image> uploadImage(
        dk.via.nbnp.databaseserver.protobuf.UploadImageDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Image> getImageById(
        dk.via.nbnp.databaseserver.protobuf.SearchImageDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.nbnp.databaseserver.protobuf.Image> deleteImageById(
        dk.via.nbnp.databaseserver.protobuf.SearchImageDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteImageByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_IMAGE = 0;
  private static final int METHODID_GET_IMAGE_BY_ITEM_ID = 1;
  private static final int METHODID_GET_IMAGE_BY_ID = 2;
  private static final int METHODID_DELETE_IMAGE_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_IMAGE:
          serviceImpl.uploadImage((dk.via.nbnp.databaseserver.protobuf.UploadImageDto) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image>) responseObserver);
          break;
        case METHODID_GET_IMAGE_BY_ITEM_ID:
          serviceImpl.getImageByItemId((dk.via.nbnp.databaseserver.protobuf.SearchImageDto) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image>) responseObserver);
          break;
        case METHODID_GET_IMAGE_BY_ID:
          serviceImpl.getImageById((dk.via.nbnp.databaseserver.protobuf.SearchImageDto) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image>) responseObserver);
          break;
        case METHODID_DELETE_IMAGE_BY_ID:
          serviceImpl.deleteImageById((dk.via.nbnp.databaseserver.protobuf.SearchImageDto) request,
              (io.grpc.stub.StreamObserver<dk.via.nbnp.databaseserver.protobuf.Image>) responseObserver);
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

  private static abstract class ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.nbnp.databaseserver.protobuf.ImageOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageService");
    }
  }

  private static final class ImageServiceFileDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier {
    ImageServiceFileDescriptorSupplier() {}
  }

  private static final class ImageServiceMethodDescriptorSupplier
      extends ImageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageServiceFileDescriptorSupplier())
              .addMethod(getUploadImageMethod())
              .addMethod(getGetImageByItemIdMethod())
              .addMethod(getGetImageByIdMethod())
              .addMethod(getDeleteImageByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
