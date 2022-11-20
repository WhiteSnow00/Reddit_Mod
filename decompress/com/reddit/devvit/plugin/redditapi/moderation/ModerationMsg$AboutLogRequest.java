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

public final class ModerationMsg$AboutLogRequest extends GeneratedMessageLite<ModerationMsg$AboutLogRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 1;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final ModerationMsg$AboutLogRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int MOD_FIELD_NUMBER = 6;
    private static volatile n1<ModerationMsg$AboutLogRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 5;
    public static final int SR_DETAIL_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 8;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String mod_;
    private String show_;
    private boolean srDetail_;
    private String type_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$AboutLogRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$AboutLogRequest()));
    }
    
    private ModerationMsg$AboutLogRequest() {
        this.after_ = "";
        this.before_ = "";
        this.show_ = "";
        this.mod_ = "";
        this.type_ = "";
    }
    
    public static ModerationMsg$AboutLogRequest access$000() {
        return ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$100(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final String after) {
        moderationMsg$AboutLogRequest.setAfter(after);
    }
    
    public static void access$1000(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearLimit();
    }
    
    public static void access$1100(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final String show) {
        moderationMsg$AboutLogRequest.setShow(show);
    }
    
    public static void access$1200(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearShow();
    }
    
    public static void access$1300(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final ByteString showBytes) {
        moderationMsg$AboutLogRequest.setShowBytes(showBytes);
    }
    
    public static void access$1400(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final String mod) {
        moderationMsg$AboutLogRequest.setMod(mod);
    }
    
    public static void access$1500(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearMod();
    }
    
    public static void access$1600(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final ByteString modBytes) {
        moderationMsg$AboutLogRequest.setModBytes(modBytes);
    }
    
    public static void access$1700(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final boolean srDetail) {
        moderationMsg$AboutLogRequest.setSrDetail(srDetail);
    }
    
    public static void access$1800(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearSrDetail();
    }
    
    public static void access$1900(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final String type) {
        moderationMsg$AboutLogRequest.setType(type);
    }
    
    public static void access$200(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearAfter();
    }
    
    public static void access$2000(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearType();
    }
    
    public static void access$2100(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final ByteString typeBytes) {
        moderationMsg$AboutLogRequest.setTypeBytes(typeBytes);
    }
    
    public static void access$300(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final ByteString afterBytes) {
        moderationMsg$AboutLogRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$400(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final String before) {
        moderationMsg$AboutLogRequest.setBefore(before);
    }
    
    public static void access$500(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearBefore();
    }
    
    public static void access$600(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final ByteString beforeBytes) {
        moderationMsg$AboutLogRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$700(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final long count) {
        moderationMsg$AboutLogRequest.setCount(count);
    }
    
    public static void access$800(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        moderationMsg$AboutLogRequest.clearCount();
    }
    
    public static void access$900(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest, final long limit) {
        moderationMsg$AboutLogRequest.setLimit(limit);
    }
    
    private void clearAfter() {
        this.after_ = getDefaultInstance().getAfter();
    }
    
    private void clearBefore() {
        this.before_ = getDefaultInstance().getBefore();
    }
    
    private void clearCount() {
        this.count_ = 0L;
    }
    
    private void clearLimit() {
        this.limit_ = 0L;
    }
    
    private void clearMod() {
        this.mod_ = getDefaultInstance().getMod();
    }
    
    private void clearShow() {
        this.show_ = getDefaultInstance().getShow();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    private void clearType() {
        this.type_ = getDefaultInstance().getType();
    }
    
    public static ModerationMsg$AboutLogRequest getDefaultInstance() {
        return ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$AboutLogRequest moderationMsg$AboutLogRequest) {
        return (a)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$AboutLogRequest);
    }
    
    public static ModerationMsg$AboutLogRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AboutLogRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$AboutLogRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$AboutLogRequest> parser() {
        return (n1<ModerationMsg$AboutLogRequest>)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAfter(final String after_) {
        after_.getClass();
        this.after_ = after_;
    }
    
    private void setAfterBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.after_ = byteString.toStringUtf8();
    }
    
    private void setBefore(final String before_) {
        before_.getClass();
        this.before_ = before_;
    }
    
    private void setBeforeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.before_ = byteString.toStringUtf8();
    }
    
    private void setCount(final long count_) {
        this.count_ = count_;
    }
    
    private void setLimit(final long limit_) {
        this.limit_ = limit_;
    }
    
    private void setMod(final String mod_) {
        mod_.getClass();
        this.mod_ = mod_;
    }
    
    private void setModBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.mod_ = byteString.toStringUtf8();
    }
    
    private void setShow(final String show_) {
        show_.getClass();
        this.show_ = show_;
    }
    
    private void setShowBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.show_ = byteString.toStringUtf8();
    }
    
    private void setSrDetail(final boolean srDetail_) {
        this.srDetail_ = srDetail_;
    }
    
    private void setType(final String type_) {
        type_.getClass();
        this.type_ = type_;
    }
    
    private void setTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
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
                final n1<ModerationMsg$AboutLogRequest> parser;
                if ((parser = ModerationMsg$AboutLogRequest.PARSER) == null) {
                    synchronized (ModerationMsg$AboutLogRequest.class) {
                        if (ModerationMsg$AboutLogRequest.PARSER == null) {
                            ModerationMsg$AboutLogRequest.PARSER = (n1<ModerationMsg$AboutLogRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$AboutLogRequest.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0007\b\u0208", new Object[] { "after_", "before_", "count_", "limit_", "show_", "mod_", "srDetail_", "type_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$AboutLogRequest();
            }
        }
    }
    
    public String getAfter() {
        return this.after_;
    }
    
    public ByteString getAfterBytes() {
        return ByteString.copyFromUtf8(this.after_);
    }
    
    public String getBefore() {
        return this.before_;
    }
    
    public ByteString getBeforeBytes() {
        return ByteString.copyFromUtf8(this.before_);
    }
    
    public long getCount() {
        return this.count_;
    }
    
    public long getLimit() {
        return this.limit_;
    }
    
    public String getMod() {
        return this.mod_;
    }
    
    public ByteString getModBytes() {
        return ByteString.copyFromUtf8(this.mod_);
    }
    
    public String getShow() {
        return this.show_;
    }
    
    public ByteString getShowBytes() {
        return ByteString.copyFromUtf8(this.show_);
    }
    
    public boolean getSrDetail() {
        return this.srDetail_;
    }
    
    public String getType() {
        return this.type_;
    }
    
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$AboutLogRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$AboutLogRequest.access$000());
        }
    }
}
