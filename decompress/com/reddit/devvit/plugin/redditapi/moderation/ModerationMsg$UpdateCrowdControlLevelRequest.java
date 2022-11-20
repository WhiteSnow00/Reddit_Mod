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

public final class ModerationMsg$UpdateCrowdControlLevelRequest extends GeneratedMessageLite<ModerationMsg$UpdateCrowdControlLevelRequest, a> implements d1
{
    private static final ModerationMsg$UpdateCrowdControlLevelRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile n1<ModerationMsg$UpdateCrowdControlLevelRequest> PARSER;
    private String id_;
    private int level_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$UpdateCrowdControlLevelRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$UpdateCrowdControlLevelRequest()));
    }
    
    private ModerationMsg$UpdateCrowdControlLevelRequest() {
        this.id_ = "";
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest access$8100() {
        return ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$8200(final ModerationMsg$UpdateCrowdControlLevelRequest moderationMsg$UpdateCrowdControlLevelRequest, final String id) {
        moderationMsg$UpdateCrowdControlLevelRequest.setId(id);
    }
    
    public static void access$8300(final ModerationMsg$UpdateCrowdControlLevelRequest moderationMsg$UpdateCrowdControlLevelRequest) {
        moderationMsg$UpdateCrowdControlLevelRequest.clearId();
    }
    
    public static void access$8400(final ModerationMsg$UpdateCrowdControlLevelRequest moderationMsg$UpdateCrowdControlLevelRequest, final ByteString idBytes) {
        moderationMsg$UpdateCrowdControlLevelRequest.setIdBytes(idBytes);
    }
    
    public static void access$8500(final ModerationMsg$UpdateCrowdControlLevelRequest moderationMsg$UpdateCrowdControlLevelRequest, final int level) {
        moderationMsg$UpdateCrowdControlLevelRequest.setLevel(level);
    }
    
    public static void access$8600(final ModerationMsg$UpdateCrowdControlLevelRequest moderationMsg$UpdateCrowdControlLevelRequest) {
        moderationMsg$UpdateCrowdControlLevelRequest.clearLevel();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearLevel() {
        this.level_ = 0;
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest getDefaultInstance() {
        return ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$UpdateCrowdControlLevelRequest moderationMsg$UpdateCrowdControlLevelRequest) {
        return (a)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$UpdateCrowdControlLevelRequest);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$UpdateCrowdControlLevelRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$UpdateCrowdControlLevelRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$UpdateCrowdControlLevelRequest> parser() {
        return (n1<ModerationMsg$UpdateCrowdControlLevelRequest>)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setLevel(final int level_) {
        this.level_ = level_;
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
                final n1<ModerationMsg$UpdateCrowdControlLevelRequest> parser;
                if ((parser = ModerationMsg$UpdateCrowdControlLevelRequest.PARSER) == null) {
                    synchronized (ModerationMsg$UpdateCrowdControlLevelRequest.class) {
                        if (ModerationMsg$UpdateCrowdControlLevelRequest.PARSER == null) {
                            ModerationMsg$UpdateCrowdControlLevelRequest.PARSER = (n1<ModerationMsg$UpdateCrowdControlLevelRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$UpdateCrowdControlLevelRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0004", new Object[] { "id_", "level_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$UpdateCrowdControlLevelRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public int getLevel() {
        return this.level_;
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$UpdateCrowdControlLevelRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$UpdateCrowdControlLevelRequest.access$8100());
        }
    }
}
