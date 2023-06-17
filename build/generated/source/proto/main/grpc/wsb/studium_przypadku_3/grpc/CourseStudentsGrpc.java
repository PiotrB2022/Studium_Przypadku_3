package wsb.studium_przypadku_3.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: worldwords.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CourseStudentsGrpc {

  private CourseStudentsGrpc() {}

  public static final String SERVICE_NAME = "CourseStudents";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getAddMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent, wsb.studium_przypadku_3.grpc.Worldwords.Student> getAddMethod;
    if ((getAddMethod = CourseStudentsGrpc.getAddMethod) == null) {
      synchronized (CourseStudentsGrpc.class) {
        if ((getAddMethod = CourseStudentsGrpc.getAddMethod) == null) {
          CourseStudentsGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new CourseStudentsMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getDeleteMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent, wsb.studium_przypadku_3.grpc.Worldwords.Student> getDeleteMethod;
    if ((getDeleteMethod = CourseStudentsGrpc.getDeleteMethod) == null) {
      synchronized (CourseStudentsGrpc.class) {
        if ((getDeleteMethod = CourseStudentsGrpc.getDeleteMethod) == null) {
          CourseStudentsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new CourseStudentsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.CourseID.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getListMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.CourseID, wsb.studium_przypadku_3.grpc.Worldwords.Student> getListMethod;
    if ((getListMethod = CourseStudentsGrpc.getListMethod) == null) {
      synchronized (CourseStudentsGrpc.class) {
        if ((getListMethod = CourseStudentsGrpc.getListMethod) == null) {
          CourseStudentsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.CourseID, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.CourseID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new CourseStudentsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CourseStudentsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseStudentsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseStudentsStub>() {
        @java.lang.Override
        public CourseStudentsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseStudentsStub(channel, callOptions);
        }
      };
    return CourseStudentsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CourseStudentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseStudentsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseStudentsBlockingStub>() {
        @java.lang.Override
        public CourseStudentsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseStudentsBlockingStub(channel, callOptions);
        }
      };
    return CourseStudentsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CourseStudentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseStudentsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseStudentsFutureStub>() {
        @java.lang.Override
        public CourseStudentsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseStudentsFutureStub(channel, callOptions);
        }
      };
    return CourseStudentsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * zapis studenta na kurs
     * </pre>
     */
    default void add(wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * wypisanie studenta z kursu
     * </pre>
     */
    default void delete(wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * uzyskanie listy uczestnikow kursu
     * </pre>
     */
    default void list(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CourseStudents.
   */
  public static abstract class CourseStudentsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CourseStudentsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CourseStudents.
   */
  public static final class CourseStudentsStub
      extends io.grpc.stub.AbstractAsyncStub<CourseStudentsStub> {
    private CourseStudentsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseStudentsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseStudentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * zapis studenta na kurs
     * </pre>
     */
    public void add(wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * wypisanie studenta z kursu
     * </pre>
     */
    public void delete(wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * uzyskanie listy uczestnikow kursu
     * </pre>
     */
    public void list(wsb.studium_przypadku_3.grpc.Worldwords.CourseID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CourseStudents.
   */
  public static final class CourseStudentsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CourseStudentsBlockingStub> {
    private CourseStudentsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseStudentsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseStudentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * zapis studenta na kurs
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Student add(wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * wypisanie studenta z kursu
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Student delete(wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * uzyskanie listy uczestnikow kursu
     * </pre>
     */
    public java.util.Iterator<wsb.studium_przypadku_3.grpc.Worldwords.Student> list(
        wsb.studium_przypadku_3.grpc.Worldwords.CourseID request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CourseStudents.
   */
  public static final class CourseStudentsFutureStub
      extends io.grpc.stub.AbstractFutureStub<CourseStudentsFutureStub> {
    private CourseStudentsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseStudentsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseStudentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * zapis studenta na kurs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Student> add(
        wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * wypisanie studenta z kursu
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Student> delete(
        wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_LIST = 2;

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
          serviceImpl.add((wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((wsb.studium_przypadku_3.grpc.Worldwords.CourseID) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student>) responseObserver);
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
              wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_ADD)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.CourseStudent,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_DELETE)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.CourseID,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_LIST)))
        .build();
  }

  private static abstract class CourseStudentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CourseStudentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return wsb.studium_przypadku_3.grpc.Worldwords.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CourseStudents");
    }
  }

  private static final class CourseStudentsFileDescriptorSupplier
      extends CourseStudentsBaseDescriptorSupplier {
    CourseStudentsFileDescriptorSupplier() {}
  }

  private static final class CourseStudentsMethodDescriptorSupplier
      extends CourseStudentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CourseStudentsMethodDescriptorSupplier(String methodName) {
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
      synchronized (CourseStudentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CourseStudentsFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
