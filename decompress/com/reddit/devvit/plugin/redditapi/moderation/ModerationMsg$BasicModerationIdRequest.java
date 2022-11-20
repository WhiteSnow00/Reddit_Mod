// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.moderation;

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

public final class ModerationMsg$BasicModerationIdRequest extends GeneratedMessageLite<ModerationMsg$BasicModerationIdRequest, a> implements d1
{
    private static final ModerationMsg$BasicModerationIdRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<ModerationMsg$BasicModerationIdRequest> PARSER;
    private String id_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$BasicModerationIdRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$BasicModerationIdRequest()));
    }
    
    private ModerationMsg$BasicModerationIdRequest() {
        this.id_ = "";
    }
    
    public static ModerationMsg$BasicModerationIdRequest access$5100() {
        return ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$5200(final ModerationMsg$BasicModerationIdRequest moderationMsg$BasicModerationIdRequest, final String id) {
        moderationMsg$BasicModerationIdRequest.setId(id);
    }
    
    public static void access$5300(final ModerationMsg$BasicModerationIdRequest moderationMsg$BasicModerationIdRequest) {
        moderationMsg$BasicModerationIdRequest.clearId();
    }
    
    public static void access$5400(final ModerationMsg$BasicModerationIdRequest moderationMsg$BasicModerationIdRequest, final ByteString idBytes) {
        moderationMsg$BasicModerationIdRequest.setIdBytes(idBytes);
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    public static ModerationMsg$BasicModerationIdRequest getDefaultInstance() {
        return ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$BasicModerationIdRequest moderationMsg$BasicModerationIdRequest) {
        return (a)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$BasicModerationIdRequest);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$BasicModerationIdRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$BasicModerationIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$BasicModerationIdRequest> parser() {
        return (n1<ModerationMsg$BasicModerationIdRequest>)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE.getParserForType();
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
        switch (d90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ModerationMsg$BasicModerationIdRequest> parser;
                if ((parser = ModerationMsg$BasicModerationIdRequest.PARSER) == null) {
                    synchronized (ModerationMsg$BasicModerationIdRequest.class) {
                        if (ModerationMsg$BasicModerationIdRequest.PARSER == null) {
                            ModerationMsg$BasicModerationIdRequest.PARSER = (n1<ModerationMsg$BasicModerationIdRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$BasicModerationIdRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "id_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$BasicModerationIdRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$BasicModerationIdRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$BasicModerationIdRequest.access$5100());
        }
    }
}
