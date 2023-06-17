package wsb.studium_przypadku_3.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: worldwords.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CoursesGrpc {

  private CoursesGrpc() {}

  public static final String SERVICE_NAME = "Courses";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Course,
      wsb.studium_przypadku_3.grpc.Worldwords.Empty> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.Course.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Course,
      wsb.studium_przypadku_3.grpc.Worldwords.Empty> getAddMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Course, wsb.studium_przypadku_3.grpc.Worldwords.Empty> getAddMethod;
    if ((getAddMethod = CoursesGrpc.getAddMethod) == null) {
      synchronized (CoursesGrpc.class) {
        if ((getAddMethod = CoursesGrpc.getAddMethod) == null) {
          CoursesGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.Course, wsb.studium_przypadku_3.grpc.Worldwords.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Course.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CoursesMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Description",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.CourseID.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Course.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getDescriptionMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID, wsb.studium_przypadku_3.grpc.Worldwords.Course> getDescriptionMethod;
    if ((getDescriptionMethod = CoursesGrpc.getDescriptionMethod) == null) {
      synchronized (CoursesGrpc.class) {
        if ((getDescriptionMethod = CoursesGrpc.getDescriptionMethod) == null) {
          CoursesGrpc.getDescriptionMethod = getDescriptionMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.CourseID, wsb.studium_przypadku_3.grpc.Worldwords.Course>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Description"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.CourseID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Course.getDefaultInstance()))
              .setSchemaDescriptor(new CoursesMethodDescriptorSupplier("Description"))
              .build();
        }
      }
    }
    return getDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Course,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.Course.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Course.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Course,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getUpdateMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Course, wsb.studium_przypadku_3.grpc.Worldwords.Course> getUpdateMethod;
    if ((getUpdateMethod = CoursesGrpc.getUpdateMethod) == null) {
      synchronized (CoursesGrpc.class) {
        if ((getUpdateMethod = CoursesGrpc.getUpdateMethod) == null) {
          CoursesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.Course, wsb.studium_przypadku_3.grpc.Worldwords.Course>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Course.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Course.getDefaultInstance()))
              .setSchemaDescriptor(new CoursesMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.CourseID.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Course.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getDeleteMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID, wsb.studium_przypadku_3.grpc.Worldwords.Course> getDeleteMethod;
    if ((getDeleteMethod = CoursesGrpc.getDeleteMethod) == null) {
      synchronized (CoursesGrpc.class) {
        if ((getDeleteMethod = CoursesGrpc.getDeleteMethod) == null) {
          CoursesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.CourseID, wsb.studium_przypadku_3.grpc.Worldwords.Course>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.CourseID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Course.getDefaultInstance()))
              .setSchemaDescriptor(new CoursesMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Empty,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.Empty.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Course.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Empty,
      wsb.studium_przypadku_3.grpc.Worldwords.Course> getListMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Empty, wsb.studium_przypadku_3.grpc.Worldwords.Course> getListMethod;
    if ((getListMethod = CoursesGrpc.getListMethod) == null) {
      synchronized (CoursesGrpc.class) {
        if ((getListMethod = CoursesGrpc.getListMethod) == null) {
          CoursesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.Empty, wsb.studium_przypadku_3.grpc.Worldwords.Course>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Course.getDefaultInstance()))
              .setSchemaDescriptor(new CoursesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoursesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoursesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoursesStub>() {
        @java.lang.Override
        public CoursesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoursesStub(channel, callOptions);
        }
      };
    return CoursesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoursesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoursesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoursesBlockingStub>() {
        @java.lang.Override
        public CoursesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoursesBlockingStub(channel, callOptions);
        }
      };
    return CoursesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoursesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoursesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoursesFutureStub>() {
        @java.lang.Override
        public CoursesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoursesFutureStub(channel, callOptions);
        }
      };
    return CoursesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * dodanie kursu
     * </pre>
     */
    default void add(wsb.studium_przypadku_3.grpc.Worldwords.Course request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * uzyskanie informacji o kursie
     * </pre>
     */
    default void description(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * aktualizacja kursu
     * </pre>
     */
    default void update(wsb.studium_przypadku_3.grpc.Worldwords.Course request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * kasowanie kursu
     * </pre>
     */
    default void delete(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * uzyskanie listy kursów
     * </pre>
     */
    default void list(wsb.studium_przypadku_3.grpc.Worldwords.Empty request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Courses.
   */
  public static abstract class CoursesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CoursesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Courses.
   */
  public static final class CoursesStub
      extends io.grpc.stub.AbstractAsyncStub<CoursesStub> {
    private CoursesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoursesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoursesStub(channel, callOptions);
    }

    /**
     * <pre>
     * dodanie kursu
     * </pre>
     */
    public void add(wsb.studium_przypadku_3.grpc.Worldwords.Course request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * uzyskanie informacji o kursie
     * </pre>
     */
    public void description(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * aktualizacja kursu
     * </pre>
     */
    public void update(wsb.studium_przypadku_3.grpc.Worldwords.Course request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * kasowanie kursu
     * </pre>
     */
    public void delete(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * uzyskanie listy kursów
     * </pre>
     */
    public void list(wsb.studium_przypadku_3.grpc.Worldwords.Empty request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Courses.
   */
  public static final class CoursesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CoursesBlockingStub> {
    private CoursesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoursesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoursesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * dodanie kursu
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Empty add(wsb.studium_przypadku_3.grpc.Worldwords.Course request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * uzyskanie informacji o kursie
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Course description(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * aktualizacja kursu
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Course update(wsb.studium_przypadku_3.grpc.Worldwords.Course request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * kasowanie kursu
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Course delete(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * uzyskanie listy kursów
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Course list(wsb.studium_przypadku_3.grpc.Worldwords.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Courses.
   */
  public static final class CoursesFutureStub
      extends io.grpc.stub.AbstractFutureStub<CoursesFutureStub> {
    private CoursesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoursesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoursesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * dodanie kursu
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Empty> add(
        wsb.studium_przypadku_3.grpc.Worldwords.Course request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * uzyskanie informacji o kursie
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Course> description(
        wsb.studium_przypadku_3.grpc.Worldwords.CourseID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * aktualizacja kursu
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Course> update(
        wsb.studium_przypadku_3.grpc.Worldwords.Course request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * kasowanie kursu
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Course> delete(
        wsb.studium_przypadku_3.grpc.Worldwords.CourseID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * uzyskanie listy kursów
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Course> list(
        wsb.studium_przypadku_3.grpc.Worldwords.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DESCRIPTION = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((wsb.studium_przypadku_3.grpc.Worldwords.Course) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Empty>) responseObserver);
          break;
        case METHODID_DESCRIPTION:
          serviceImpl.description((wsb.studium_przypadku_3.grpc.Worldwords.CourseID) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((wsb.studium_przypadku_3.grpc.Worldwords.Course) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((wsb.studium_przypadku_3.grpc.Worldwords.CourseID) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((wsb.studium_przypadku_3.grpc.Worldwords.Empty) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Course>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.Course,
              wsb.studium_przypadku_3.grpc.Worldwords.Empty>(
                service, METHODID_ADD)))
        .addMethod(
          getDescriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
              wsb.studium_przypadku_3.grpc.Worldwords.Course>(
                service, METHODID_DESCRIPTION)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.Course,
              wsb.studium_przypadku_3.grpc.Worldwords.Course>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
              wsb.studium_przypadku_3.grpc.Worldwords.Course>(
                service, METHODID_DELETE)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.Empty,
              wsb.studium_przypadku_3.grpc.Worldwords.Course>(
                service, METHODID_LIST)))
        .build();
  }

  private static abstract class CoursesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoursesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return wsb.studium_przypadku_3.grpc.Worldwords.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Courses");
    }
  }

  private static final class CoursesFileDescriptorSupplier
      extends CoursesBaseDescriptorSupplier {
    CoursesFileDescriptorSupplier() {}
  }

  private static final class CoursesMethodDescriptorSupplier
      extends CoursesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoursesMethodDescriptorSupplier(String methodName) {
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
      synchronized (CoursesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoursesFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getDescriptionMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
