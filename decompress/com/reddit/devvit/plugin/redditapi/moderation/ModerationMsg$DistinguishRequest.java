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

public final class ModerationMsg$DistinguishRequest extends GeneratedMessageLite<ModerationMsg$DistinguishRequest, a> implements d1
{
    private static final ModerationMsg$DistinguishRequest DEFAULT_INSTANCE;
    public static final int HOW_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile n1<ModerationMsg$DistinguishRequest> PARSER;
    public static final int STICKY_FIELD_NUMBER = 3;
    private String how_;
    private String id_;
    private boolean sticky_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$DistinguishRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$DistinguishRequest()));
    }
    
    private ModerationMsg$DistinguishRequest() {
        this.how_ = "";
        this.id_ = "";
    }
    
    public static ModerationMsg$DistinguishRequest access$5600() {
        return ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$5700(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest, final String how) {
        moderationMsg$DistinguishRequest.setHow(how);
    }
    
    public static void access$5800(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest) {
        moderationMsg$DistinguishRequest.clearHow();
    }
    
    public static void access$5900(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest, final ByteString howBytes) {
        moderationMsg$DistinguishRequest.setHowBytes(howBytes);
    }
    
    public static void access$6000(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest, final String id) {
        moderationMsg$DistinguishRequest.setId(id);
    }
    
    public static void access$6100(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest) {
        moderationMsg$DistinguishRequest.clearId();
    }
    
    public static void access$6200(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest, final ByteString idBytes) {
        moderationMsg$DistinguishRequest.setIdBytes(idBytes);
    }
    
    public static void access$6300(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest, final boolean sticky) {
        moderationMsg$DistinguishRequest.setSticky(sticky);
    }
    
    public static void access$6400(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest) {
        moderationMsg$DistinguishRequest.clearSticky();
    }
    
    private void clearHow() {
        this.how_ = getDefaultInstance().getHow();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearSticky() {
        this.sticky_ = false;
    }
    
    public static ModerationMsg$DistinguishRequest getDefaultInstance() {
        return ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$DistinguishRequest moderationMsg$DistinguishRequest) {
        return (a)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$DistinguishRequest);
    }
    
    public static ModerationMsg$DistinguishRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$DistinguishRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$DistinguishRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$DistinguishRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$DistinguishRequest> parser() {
        return (n1<ModerationMsg$DistinguishRequest>)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setHow(final String how_) {
        how_.getClass();
        this.how_ = how_;
    }
    
    private void setHowBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.how_ = byteString.toStringUtf8();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setSticky(final boolean sticky_) {
        this.sticky_ = sticky_;
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
                final n1<ModerationMsg$DistinguishRequest> parser;
                if ((parser = ModerationMsg$DistinguishRequest.PARSER) == null) {
                    synchronized (ModerationMsg$DistinguishRequest.class) {
                        if (ModerationMsg$DistinguishRequest.PARSER == null) {
                            ModerationMsg$DistinguishRequest.PARSER = (n1<ModerationMsg$DistinguishRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$DistinguishRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007", new Object[] { "how_", "id_", "sticky_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$DistinguishRequest();
            }
        }
    }
    
    public String getHow() {
        return this.how_;
    }
    
    public ByteString getHowBytes() {
        return ByteString.copyFromUtf8(this.how_);
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public boolean getSticky() {
        return this.sticky_;
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$DistinguishRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$DistinguishRequest.access$5600());
        }
    }
}
