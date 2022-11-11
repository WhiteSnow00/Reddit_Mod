// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

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

public final class LinksandcommentsMsg$BasicIdRequest extends GeneratedMessageLite<LinksandcommentsMsg$BasicIdRequest, a> implements d1
{
    private static final LinksandcommentsMsg$BasicIdRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<LinksandcommentsMsg$BasicIdRequest> PARSER;
    private String id_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$BasicIdRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$BasicIdRequest()));
    }
    
    private LinksandcommentsMsg$BasicIdRequest() {
        this.id_ = "";
    }
    
    public static /* synthetic */ LinksandcommentsMsg$BasicIdRequest access$3400() {
        return LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE;
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    public static LinksandcommentsMsg$BasicIdRequest getDefaultInstance() {
        return LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$BasicIdRequest linksandcommentsMsg$BasicIdRequest) {
        return (a)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$BasicIdRequest);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$BasicIdRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$BasicIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$BasicIdRequest> parser() {
        return (n1<LinksandcommentsMsg$BasicIdRequest>)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE.getParserForType();
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
        switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<LinksandcommentsMsg$BasicIdRequest> parser;
                if ((parser = LinksandcommentsMsg$BasicIdRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$BasicIdRequest.class) {
                        if (LinksandcommentsMsg$BasicIdRequest.PARSER == null) {
                            LinksandcommentsMsg$BasicIdRequest.PARSER = (n1<LinksandcommentsMsg$BasicIdRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$BasicIdRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "id_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$BasicIdRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$BasicIdRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$BasicIdRequest.access$3400());
        }
    }
}
