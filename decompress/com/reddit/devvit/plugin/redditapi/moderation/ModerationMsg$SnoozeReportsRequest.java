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

public final class ModerationMsg$SnoozeReportsRequest extends GeneratedMessageLite<ModerationMsg$SnoozeReportsRequest, a> implements d1
{
    private static final ModerationMsg$SnoozeReportsRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<ModerationMsg$SnoozeReportsRequest> PARSER;
    public static final int REASON_FIELD_NUMBER = 2;
    private String id_;
    private String reason_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$SnoozeReportsRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$SnoozeReportsRequest()));
    }
    
    private ModerationMsg$SnoozeReportsRequest() {
        this.id_ = "";
        this.reason_ = "";
    }
    
    public static ModerationMsg$SnoozeReportsRequest access$7300() {
        return ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$7400(final ModerationMsg$SnoozeReportsRequest moderationMsg$SnoozeReportsRequest, final String id) {
        moderationMsg$SnoozeReportsRequest.setId(id);
    }
    
    public static void access$7500(final ModerationMsg$SnoozeReportsRequest moderationMsg$SnoozeReportsRequest) {
        moderationMsg$SnoozeReportsRequest.clearId();
    }
    
    public static void access$7600(final ModerationMsg$SnoozeReportsRequest moderationMsg$SnoozeReportsRequest, final ByteString idBytes) {
        moderationMsg$SnoozeReportsRequest.setIdBytes(idBytes);
    }
    
    public static void access$7700(final ModerationMsg$SnoozeReportsRequest moderationMsg$SnoozeReportsRequest, final String reason) {
        moderationMsg$SnoozeReportsRequest.setReason(reason);
    }
    
    public static void access$7800(final ModerationMsg$SnoozeReportsRequest moderationMsg$SnoozeReportsRequest) {
        moderationMsg$SnoozeReportsRequest.clearReason();
    }
    
    public static void access$7900(final ModerationMsg$SnoozeReportsRequest moderationMsg$SnoozeReportsRequest, final ByteString reasonBytes) {
        moderationMsg$SnoozeReportsRequest.setReasonBytes(reasonBytes);
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearReason() {
        this.reason_ = getDefaultInstance().getReason();
    }
    
    public static ModerationMsg$SnoozeReportsRequest getDefaultInstance() {
        return ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$SnoozeReportsRequest moderationMsg$SnoozeReportsRequest) {
        return (a)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$SnoozeReportsRequest);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$SnoozeReportsRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$SnoozeReportsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$SnoozeReportsRequest> parser() {
        return (n1<ModerationMsg$SnoozeReportsRequest>)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setReason(final String reason_) {
        reason_.getClass();
        this.reason_ = reason_;
    }
    
    private void setReasonBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.reason_ = byteString.toStringUtf8();
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
                final n1<ModerationMsg$SnoozeReportsRequest> parser;
                if ((parser = ModerationMsg$SnoozeReportsRequest.PARSER) == null) {
                    synchronized (ModerationMsg$SnoozeReportsRequest.class) {
                        if (ModerationMsg$SnoozeReportsRequest.PARSER == null) {
                            ModerationMsg$SnoozeReportsRequest.PARSER = (n1<ModerationMsg$SnoozeReportsRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$SnoozeReportsRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "id_", "reason_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$SnoozeReportsRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public String getReason() {
        return this.reason_;
    }
    
    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.reason_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$SnoozeReportsRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$SnoozeReportsRequest.access$7300());
        }
    }
}
