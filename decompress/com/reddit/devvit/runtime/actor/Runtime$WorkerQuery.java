// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime.actor;

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

public final class Runtime$WorkerQuery extends GeneratedMessageLite<Runtime$WorkerQuery, a> implements d1
{
    private static final Runtime$WorkerQuery DEFAULT_INSTANCE;
    public static final int HOSTNAME_FIELD_NUMBER = 1;
    private static volatile n1<Runtime$WorkerQuery> PARSER;
    private String hostname_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Runtime$WorkerQuery.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Runtime$WorkerQuery()));
    }
    
    private Runtime$WorkerQuery() {
        this.hostname_ = "";
    }
    
    public static /* synthetic */ Runtime$WorkerQuery access$000() {
        return Runtime$WorkerQuery.DEFAULT_INSTANCE;
    }
    
    private void clearHostname() {
        this.hostname_ = getDefaultInstance().getHostname();
    }
    
    public static Runtime$WorkerQuery getDefaultInstance() {
        return Runtime$WorkerQuery.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Runtime$WorkerQuery.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Runtime$WorkerQuery runtime$WorkerQuery) {
        return (a)Runtime$WorkerQuery.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)runtime$WorkerQuery);
    }
    
    public static Runtime$WorkerQuery parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Runtime$WorkerQuery parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Runtime$WorkerQuery parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, byteString);
    }
    
    public static Runtime$WorkerQuery parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Runtime$WorkerQuery parseFrom(final l l) throws IOException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, l);
    }
    
    public static Runtime$WorkerQuery parseFrom(final l l, final d0 d0) throws IOException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Runtime$WorkerQuery parseFrom(final InputStream inputStream) throws IOException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Runtime$WorkerQuery parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Runtime$WorkerQuery parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Runtime$WorkerQuery parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Runtime$WorkerQuery parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, array);
    }
    
    public static Runtime$WorkerQuery parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Runtime$WorkerQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Runtime$WorkerQuery> parser() {
        return (n1<Runtime$WorkerQuery>)Runtime$WorkerQuery.DEFAULT_INSTANCE.getParserForType();
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
        switch (n90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<Runtime$WorkerQuery> parser;
                if ((parser = Runtime$WorkerQuery.PARSER) == null) {
                    synchronized (Runtime$WorkerQuery.class) {
                        if (Runtime$WorkerQuery.PARSER == null) {
                            Runtime$WorkerQuery.PARSER = (n1<Runtime$WorkerQuery>)new GeneratedMessageLite$c((GeneratedMessageLite)Runtime$WorkerQuery.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Runtime$WorkerQuery.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Runtime$WorkerQuery.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "hostname_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Runtime$WorkerQuery();
            }
        }
    }
    
    public String getHostname() {
        return this.hostname_;
    }
    
    public ByteString getHostnameBytes() {
        return ByteString.copyFromUtf8(this.hostname_);
    }
    
    public static final class a extends GeneratedMessageLite$b<Runtime$WorkerQuery, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Runtime$WorkerQuery.access$000());
        }
    }
}
