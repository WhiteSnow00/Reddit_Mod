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

public final class ModerationMsg$AboutLocationRequest extends GeneratedMessageLite<ModerationMsg$AboutLocationRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 1;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final ModerationMsg$AboutLocationRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int LOCATION_FIELD_NUMBER = 5;
    public static final int ONLY_FIELD_NUMBER = 6;
    private static volatile n1<ModerationMsg$AboutLocationRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 7;
    public static final int SR_DETAIL_FIELD_NUMBER = 8;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String location_;
    private String only_;
    private String show_;
    private boolean srDetail_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$AboutLocationRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$AboutLocationRequest()));
    }
    
    private ModerationMsg$AboutLocationRequest() {
        this.after_ = "";
        this.before_ = "";
        this.location_ = "";
        this.only_ = "";
        this.show_ = "";
    }
    
    public static ModerationMsg$AboutLocationRequest access$2300() {
        return ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$2400(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final String after) {
        moderationMsg$AboutLocationRequest.setAfter(after);
    }
    
    public static void access$2500(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearAfter();
    }
    
    public static void access$2600(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final ByteString afterBytes) {
        moderationMsg$AboutLocationRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$2700(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final String before) {
        moderationMsg$AboutLocationRequest.setBefore(before);
    }
    
    public static void access$2800(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearBefore();
    }
    
    public static void access$2900(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final ByteString beforeBytes) {
        moderationMsg$AboutLocationRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$3000(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final long count) {
        moderationMsg$AboutLocationRequest.setCount(count);
    }
    
    public static void access$3100(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearCount();
    }
    
    public static void access$3200(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final long limit) {
        moderationMsg$AboutLocationRequest.setLimit(limit);
    }
    
    public static void access$3300(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearLimit();
    }
    
    public static void access$3400(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final String location) {
        moderationMsg$AboutLocationRequest.setLocation(location);
    }
    
    public static void access$3500(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearLocation();
    }
    
    public static void access$3600(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final ByteString locationBytes) {
        moderationMsg$AboutLocationRequest.setLocationBytes(locationBytes);
    }
    
    public static void access$3700(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final String only) {
        moderationMsg$AboutLocationRequest.setOnly(only);
    }
    
    public static void access$3800(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearOnly();
    }
    
    public static void access$3900(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final ByteString onlyBytes) {
        moderationMsg$AboutLocationRequest.setOnlyBytes(onlyBytes);
    }
    
    public static void access$4000(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final String show) {
        moderationMsg$AboutLocationRequest.setShow(show);
    }
    
    public static void access$4100(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearShow();
    }
    
    public static void access$4200(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final ByteString showBytes) {
        moderationMsg$AboutLocationRequest.setShowBytes(showBytes);
    }
    
    public static void access$4300(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest, final boolean srDetail) {
        moderationMsg$AboutLocationRequest.setSrDetail(srDetail);
    }
    
    public static void access$4400(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        moderationMsg$AboutLocationRequest.clearSrDetail();
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
    
    private void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }
    
    private void clearOnly() {
        this.only_ = getDefaultInstance().getOnly();
    }
    
    private void clearShow() {
        this.show_ = getDefaultInstance().getShow();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    public static ModerationMsg$AboutLocationRequest getDefaultInstance() {
        return ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$AboutLocationRequest moderationMsg$AboutLocationRequest) {
        return (a)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$AboutLocationRequest);
    }
    
    public static ModerationMsg$AboutLocationRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AboutLocationRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$AboutLocationRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLocationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$AboutLocationRequest> parser() {
        return (n1<ModerationMsg$AboutLocationRequest>)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE.getParserForType();
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
    
    private void setLocation(final String location_) {
        location_.getClass();
        this.location_ = location_;
    }
    
    private void setLocationBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.location_ = byteString.toStringUtf8();
    }
    
    private void setOnly(final String only_) {
        only_.getClass();
        this.only_ = only_;
    }
    
    private void setOnlyBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.only_ = byteString.toStringUtf8();
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
                final n1<ModerationMsg$AboutLocationRequest> parser;
                if ((parser = ModerationMsg$AboutLocationRequest.PARSER) == null) {
                    synchronized (ModerationMsg$AboutLocationRequest.class) {
                        if (ModerationMsg$AboutLocationRequest.PARSER == null) {
                            ModerationMsg$AboutLocationRequest.PARSER = (n1<ModerationMsg$AboutLocationRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$AboutLocationRequest.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0208\b\u0007", new Object[] { "after_", "before_", "count_", "limit_", "location_", "only_", "show_", "srDetail_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$AboutLocationRequest();
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
    
    public String getLocation() {
        return this.location_;
    }
    
    public ByteString getLocationBytes() {
        return ByteString.copyFromUtf8(this.location_);
    }
    
    public String getOnly() {
        return this.only_;
    }
    
    public ByteString getOnlyBytes() {
        return ByteString.copyFromUtf8(this.only_);
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
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$AboutLocationRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$AboutLocationRequest.access$2300());
        }
    }
}
