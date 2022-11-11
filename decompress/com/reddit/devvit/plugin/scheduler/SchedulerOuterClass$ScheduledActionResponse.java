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

public final class SchedulerOuterClass$ScheduledActionResponse extends GeneratedMessageLite<SchedulerOuterClass$ScheduledActionResponse, a> implements d1
{
    private static final SchedulerOuterClass$ScheduledActionResponse DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<SchedulerOuterClass$ScheduledActionResponse> PARSER;
    private String id_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SchedulerOuterClass$ScheduledActionResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SchedulerOuterClass$ScheduledActionResponse()));
    }
    
    private SchedulerOuterClass$ScheduledActionResponse() {
        this.id_ = "";
    }
    
    public static /* synthetic */ SchedulerOuterClass$ScheduledActionResponse access$1200() {
        return SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE;
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse getDefaultInstance() {
        return SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SchedulerOuterClass$ScheduledActionResponse schedulerOuterClass$ScheduledActionResponse) {
        return (a)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)schedulerOuterClass$ScheduledActionResponse);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final l l) throws IOException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SchedulerOuterClass$ScheduledActionResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SchedulerOuterClass$ScheduledActionResponse> parser() {
        return (n1<SchedulerOuterClass$ScheduledActionResponse>)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE.getParserForType();
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
                final n1<SchedulerOuterClass$ScheduledActionResponse> parser;
                if ((parser = SchedulerOuterClass$ScheduledActionResponse.PARSER) == null) {
                    synchronized (SchedulerOuterClass$ScheduledActionResponse.class) {
                        if (SchedulerOuterClass$ScheduledActionResponse.PARSER == null) {
                            SchedulerOuterClass$ScheduledActionResponse.PARSER = (n1<SchedulerOuterClass$ScheduledActionResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SchedulerOuterClass$ScheduledActionResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "id_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SchedulerOuterClass$ScheduledActionResponse();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public static final class a extends GeneratedMessageLite$b<SchedulerOuterClass$ScheduledActionResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionResponse.access$1200());
        }
    }
}
