package wsb.studium_przypadku_3.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: worldwords.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentsGrpc {

  private StudentsGrpc() {}

  public static final String SERVICE_NAME = "Students";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.StudentFull.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getAddMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull, wsb.studium_przypadku_3.grpc.Worldwords.Student> getAddMethod;
    if ((getAddMethod = StudentsGrpc.getAddMethod) == null) {
      synchronized (StudentsGrpc.class) {
        if ((getAddMethod = StudentsGrpc.getAddMethod) == null) {
          StudentsGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.StudentFull.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentsMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.SID.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getDeleteMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID, wsb.studium_przypadku_3.grpc.Worldwords.Student> getDeleteMethod;
    if ((getDeleteMethod = StudentsGrpc.getDeleteMethod) == null) {
      synchronized (StudentsGrpc.class) {
        if ((getDeleteMethod = StudentsGrpc.getDeleteMethod) == null) {
          StudentsGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.SID, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.SID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentsMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.StudentFull.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getUpdateMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull, wsb.studium_przypadku_3.grpc.Worldwords.Student> getUpdateMethod;
    if ((getUpdateMethod = StudentsGrpc.getUpdateMethod) == null) {
      synchronized (StudentsGrpc.class) {
        if ((getUpdateMethod = StudentsGrpc.getUpdateMethod) == null) {
          StudentsGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.StudentFull.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentsMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.SID.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getInfoMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID, wsb.studium_przypadku_3.grpc.Worldwords.Student> getInfoMethod;
    if ((getInfoMethod = StudentsGrpc.getInfoMethod) == null) {
      synchronized (StudentsGrpc.class) {
        if ((getInfoMethod = StudentsGrpc.getInfoMethod) == null) {
          StudentsGrpc.getInfoMethod = getInfoMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.SID, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.SID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentsMethodDescriptorSupplier("Info"))
              .build();
        }
      }
    }
    return getInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID,
      wsb.studium_przypadku_3.grpc.Worldwords.StudentFull> getFullInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullInfo",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.SID.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.StudentFull.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID,
      wsb.studium_przypadku_3.grpc.Worldwords.StudentFull> getFullInfoMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.SID, wsb.studium_przypadku_3.grpc.Worldwords.StudentFull> getFullInfoMethod;
    if ((getFullInfoMethod = StudentsGrpc.getFullInfoMethod) == null) {
      synchronized (StudentsGrpc.class) {
        if ((getFullInfoMethod = StudentsGrpc.getFullInfoMethod) == null) {
          StudentsGrpc.getFullInfoMethod = getFullInfoMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.SID, wsb.studium_przypadku_3.grpc.Worldwords.StudentFull>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FullInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.SID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.StudentFull.getDefaultInstance()))
              .setSchemaDescriptor(new StudentsMethodDescriptorSupplier("FullInfo"))
              .build();
        }
      }
    }
    return getFullInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Empty,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = wsb.studium_przypadku_3.grpc.Worldwords.Empty.class,
      responseType = wsb.studium_przypadku_3.grpc.Worldwords.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Empty,
      wsb.studium_przypadku_3.grpc.Worldwords.Student> getListMethod() {
    io.grpc.MethodDescriptor<wsb.studium_przypadku_3.grpc.Worldwords.Empty, wsb.studium_przypadku_3.grpc.Worldwords.Student> getListMethod;
    if ((getListMethod = StudentsGrpc.getListMethod) == null) {
      synchronized (StudentsGrpc.class) {
        if ((getListMethod = StudentsGrpc.getListMethod) == null) {
          StudentsGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<wsb.studium_przypadku_3.grpc.Worldwords.Empty, wsb.studium_przypadku_3.grpc.Worldwords.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wsb.studium_przypadku_3.grpc.Worldwords.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentsMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentsStub>() {
        @java.lang.Override
        public StudentsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentsStub(channel, callOptions);
        }
      };
    return StudentsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentsBlockingStub>() {
        @java.lang.Override
        public StudentsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentsBlockingStub(channel, callOptions);
        }
      };
    return StudentsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentsFutureStub>() {
        @java.lang.Override
        public StudentsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentsFutureStub(channel, callOptions);
        }
      };
    return StudentsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * dodanie studenta
     * </pre>
     */
    default void add(wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * usuniecie studenta
     * </pre>
     */
    default void delete(wsb.studium_przypadku_3.grpc.Worldwords.SID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * zmiana danych studenta
     * </pre>
     */
    default void update(wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * uzyskanie danych studenta
     * </pre>
     */
    default void info(wsb.studium_przypadku_3.grpc.Worldwords.SID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * uzyskanie pelnych danych studenta
     * </pre>
     */
    default void fullInfo(wsb.studium_przypadku_3.grpc.Worldwords.SID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFullInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * uzyskanie listy studentow
     * </pre>
     */
    default void list(wsb.studium_przypadku_3.grpc.Worldwords.Empty request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Students.
   */
  public static abstract class StudentsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Students.
   */
  public static final class StudentsStub
      extends io.grpc.stub.AbstractAsyncStub<StudentsStub> {
    private StudentsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * dodanie studenta
     * </pre>
     */
    public void add(wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * usuniecie studenta
     * </pre>
     */
    public void delete(wsb.studium_przypadku_3.grpc.Worldwords.SID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * zmiana danych studenta
     * </pre>
     */
    public void update(wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * uzyskanie danych studenta
     * </pre>
     */
    public void info(wsb.studium_przypadku_3.grpc.Worldwords.SID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * uzyskanie pelnych danych studenta
     * </pre>
     */
    public void fullInfo(wsb.studium_przypadku_3.grpc.Worldwords.SID request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFullInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * uzyskanie listy studentow
     * </pre>
     */
    public void list(wsb.studium_przypadku_3.grpc.Worldwords.Empty request,
        io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Students.
   */
  public static final class StudentsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentsBlockingStub> {
    private StudentsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * dodanie studenta
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Student add(wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * usuniecie studenta
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Student delete(wsb.studium_przypadku_3.grpc.Worldwords.SID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * zmiana danych studenta
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Student update(wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * uzyskanie danych studenta
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.Student info(wsb.studium_przypadku_3.grpc.Worldwords.SID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * uzyskanie pelnych danych studenta
     * </pre>
     */
    public wsb.studium_przypadku_3.grpc.Worldwords.StudentFull fullInfo(wsb.studium_przypadku_3.grpc.Worldwords.SID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFullInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * uzyskanie listy studentow
     * </pre>
     */
    public java.util.Iterator<wsb.studium_przypadku_3.grpc.Worldwords.Student> list(
        wsb.studium_przypadku_3.grpc.Worldwords.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Students.
   */
  public static final class StudentsFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentsFutureStub> {
    private StudentsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * dodanie studenta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Student> add(
        wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * usuniecie studenta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Student> delete(
        wsb.studium_przypadku_3.grpc.Worldwords.SID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * zmiana danych studenta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Student> update(
        wsb.studium_przypadku_3.grpc.Worldwords.StudentFull request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * uzyskanie danych studenta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.Student> info(
        wsb.studium_przypadku_3.grpc.Worldwords.SID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * uzyskanie pelnych danych studenta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull> fullInfo(
        wsb.studium_przypadku_3.grpc.Worldwords.SID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFullInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_INFO = 3;
  private static final int METHODID_FULL_INFO = 4;
  private static final int METHODID_LIST = 5;

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
          serviceImpl.add((wsb.studium_przypadku_3.grpc.Worldwords.StudentFull) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((wsb.studium_przypadku_3.grpc.Worldwords.SID) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((wsb.studium_przypadku_3.grpc.Worldwords.StudentFull) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((wsb.studium_przypadku_3.grpc.Worldwords.SID) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.Student>) responseObserver);
          break;
        case METHODID_FULL_INFO:
          serviceImpl.fullInfo((wsb.studium_przypadku_3.grpc.Worldwords.SID) request,
              (io.grpc.stub.StreamObserver<wsb.studium_przypadku_3.grpc.Worldwords.StudentFull>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((wsb.studium_przypadku_3.grpc.Worldwords.Empty) request,
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
              wsb.studium_przypadku_3.grpc.Worldwords.StudentFull,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_ADD)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.SID,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_DELETE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.StudentFull,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_UPDATE)))
        .addMethod(
          getInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.SID,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_INFO)))
        .addMethod(
          getFullInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.SID,
              wsb.studium_przypadku_3.grpc.Worldwords.StudentFull>(
                service, METHODID_FULL_INFO)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              wsb.studium_przypadku_3.grpc.Worldwords.Empty,
              wsb.studium_przypadku_3.grpc.Worldwords.Student>(
                service, METHODID_LIST)))
        .build();
  }

  private static abstract class StudentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return wsb.studium_przypadku_3.grpc.Worldwords.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Students");
    }
  }

  private static final class StudentsFileDescriptorSupplier
      extends StudentsBaseDescriptorSupplier {
    StudentsFileDescriptorSupplier() {}
  }

  private static final class StudentsMethodDescriptorSupplier
      extends StudentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentsMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentsFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getInfoMethod())
              .addMethod(getFullInfoMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
