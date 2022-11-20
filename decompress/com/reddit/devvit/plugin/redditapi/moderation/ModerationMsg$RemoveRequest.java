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

public final class ModerationMsg$RemoveRequest extends GeneratedMessageLite<ModerationMsg$RemoveRequest, a> implements d1
{
    private static final ModerationMsg$RemoveRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<ModerationMsg$RemoveRequest> PARSER;
    public static final int SPAM_FIELD_NUMBER = 2;
    private String id_;
    private boolean spam_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$RemoveRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$RemoveRequest()));
    }
    
    private ModerationMsg$RemoveRequest() {
        this.id_ = "";
    }
    
    public static ModerationMsg$RemoveRequest access$6600() {
        return ModerationMsg$RemoveRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$6700(final ModerationMsg$RemoveRequest moderationMsg$RemoveRequest, final String id) {
        moderationMsg$RemoveRequest.setId(id);
    }
    
    public static void access$6800(final ModerationMsg$RemoveRequest moderationMsg$RemoveRequest) {
        moderationMsg$RemoveRequest.clearId();
    }
    
    public static void access$6900(final ModerationMsg$RemoveRequest moderationMsg$RemoveRequest, final ByteString idBytes) {
        moderationMsg$RemoveRequest.setIdBytes(idBytes);
    }
    
    public static void access$7000(final ModerationMsg$RemoveRequest moderationMsg$RemoveRequest, final boolean spam) {
        moderationMsg$RemoveRequest.setSpam(spam);
    }
    
    public static void access$7100(final ModerationMsg$RemoveRequest moderationMsg$RemoveRequest) {
        moderationMsg$RemoveRequest.clearSpam();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearSpam() {
        this.spam_ = false;
    }
    
    public static ModerationMsg$RemoveRequest getDefaultInstance() {
        return ModerationMsg$RemoveRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$RemoveRequest moderationMsg$RemoveRequest) {
        return (a)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$RemoveRequest);
    }
    
    public static ModerationMsg$RemoveRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$RemoveRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$RemoveRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$RemoveRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$RemoveRequest> parser() {
        return (n1<ModerationMsg$RemoveRequest>)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setSpam(final boolean spam_) {
        this.spam_ = spam_;
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
                final n1<ModerationMsg$RemoveRequest> parser;
                if ((parser = ModerationMsg$RemoveRequest.PARSER) == null) {
                    synchronized (ModerationMsg$RemoveRequest.class) {
                        if (ModerationMsg$RemoveRequest.PARSER == null) {
                            ModerationMsg$RemoveRequest.PARSER = (n1<ModerationMsg$RemoveRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$RemoveRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$RemoveRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[] { "id_", "spam_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$RemoveRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public boolean getSpam() {
        return this.spam_;
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$RemoveRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$RemoveRequest.access$6600());
        }
    }
}
