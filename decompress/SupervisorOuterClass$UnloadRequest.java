// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime.actor;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import n90.b;
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

public final class SupervisorOuterClass$UnloadRequest extends GeneratedMessageLite<SupervisorOuterClass$UnloadRequest, a> implements d1
{
    private static final SupervisorOuterClass$UnloadRequest DEFAULT_INSTANCE;
    public static final int FORCE_FIELD_NUMBER = 1;
    public static final int HOSTNAME_FIELD_NUMBER = 2;
    private static volatile n1<SupervisorOuterClass$UnloadRequest> PARSER;
    private boolean force_;
    private String hostname_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SupervisorOuterClass$UnloadRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SupervisorOuterClass$UnloadRequest()));
    }
    
    private SupervisorOuterClass$UnloadRequest() {
        this.hostname_ = "";
    }
    
    public static /* synthetic */ SupervisorOuterClass$UnloadRequest access$000() {
        return SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE;
    }
    
    private void clearForce() {
        this.force_ = false;
    }
    
    private void clearHostname() {
        this.hostname_ = getDefaultInstance().getHostname();
    }
    
    public static SupervisorOuterClass$UnloadRequest getDefaultInstance() {
        return SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SupervisorOuterClass$UnloadRequest supervisorOuterClass$UnloadRequest) {
        return (a)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)supervisorOuterClass$UnloadRequest);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final l l) throws IOException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SupervisorOuterClass$UnloadRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SupervisorOuterClass$UnloadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SupervisorOuterClass$UnloadRequest> parser() {
        return (n1<SupervisorOuterClass$UnloadRequest>)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setForce(final boolean force_) {
        this.force_ = force_;
    }
    
    private void setHostname(final String hostname_) {
        hostname_.getClass();
        this.hostname_ = hostname_;
    }
    
    private void setHostnameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.hostname_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (b.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<SupervisorOuterClass$UnloadRequest> parser;
                if ((parser = SupervisorOuterClass$UnloadRequest.PARSER) == null) {
                    synchronized (SupervisorOuterClass$UnloadRequest.class) {
                        if (SupervisorOuterClass$UnloadRequest.PARSER == null) {
                            SupervisorOuterClass$UnloadRequest.PARSER = (n1<SupervisorOuterClass$UnloadRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SupervisorOuterClass$UnloadRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0208", new Object[] { "force_", "hostname_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SupervisorOuterClass$UnloadRequest();
            }
        }
    }
    
    public boolean getForce() {
        return this.force_;
    }
    
    public String getHostname() {
        return this.hostname_;
    }
    
    public ByteString getHostnameBytes() {
        return ByteString.copyFromUtf8(this.hostname_);
    }
    
    public static final class a extends GeneratedMessageLite$b<SupervisorOuterClass$UnloadRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SupervisorOuterClass$UnloadRequest.access$000());
        }
    }
}
