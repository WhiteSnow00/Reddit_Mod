// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.scheduler;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.a;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SchedulerOuterClass$CancelActionRequest extends GeneratedMessageLite<SchedulerOuterClass$CancelActionRequest, a> implements d1
{
    private static final SchedulerOuterClass$CancelActionRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<SchedulerOuterClass$CancelActionRequest> PARSER;
    private String id_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SchedulerOuterClass$CancelActionRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SchedulerOuterClass$CancelActionRequest()));
    }
    
    private SchedulerOuterClass$CancelActionRequest() {
        this.id_ = "";
    }
    
    public static /* synthetic */ SchedulerOuterClass$CancelActionRequest access$1700() {
        return SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE;
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    public static SchedulerOuterClass$CancelActionRequest getDefaultInstance() {
        return SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SchedulerOuterClass$CancelActionRequest schedulerOuterClass$CancelActionRequest) {
        return (a)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)schedulerOuterClass$CancelActionRequest);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final l l) throws IOException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SchedulerOuterClass$CancelActionRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$CancelActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SchedulerOuterClass$CancelActionRequest> parser() {
        return (n1<SchedulerOuterClass$CancelActionRequest>)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (j90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return 1;
            }
            case 5: {
                final n1<SchedulerOuterClass$CancelActionRequest> parser;
                if ((parser = SchedulerOuterClass$CancelActionRequest.PARSER) == null) {
                    synchronized (SchedulerOuterClass$CancelActionRequest.class) {
                        if (SchedulerOuterClass$CancelActionRequest.PARSER == null) {
                            SchedulerOuterClass$CancelActionRequest.PARSER = (n1<SchedulerOuterClass$CancelActionRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SchedulerOuterClass$CancelActionRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "id_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SchedulerOuterClass$CancelActionRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public static final class a extends GeneratedMessageLite$b<SchedulerOuterClass$CancelActionRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SchedulerOuterClass$CancelActionRequest.access$1700());
        }
    }
}
