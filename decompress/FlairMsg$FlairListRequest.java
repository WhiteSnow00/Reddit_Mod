// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

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

public final class FlairMsg$FlairListRequest extends GeneratedMessageLite<FlairMsg$FlairListRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 2;
    public static final int BEFORE_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 4;
    private static final FlairMsg$FlairListRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile n1<FlairMsg$FlairListRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 7;
    public static final int SR_DETAIL_FIELD_NUMBER = 8;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String name_;
    private String show_;
    private boolean srDetail_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairListRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairListRequest()));
    }
    
    private FlairMsg$FlairListRequest() {
        this.subreddit_ = "";
        this.after_ = "";
        this.before_ = "";
        this.name_ = "";
        this.show_ = "";
    }
    
    public static /* synthetic */ FlairMsg$FlairListRequest access$7900() {
        return FlairMsg$FlairListRequest.DEFAULT_INSTANCE;
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
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearShow() {
        this.show_ = getDefaultInstance().getShow();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$FlairListRequest getDefaultInstance() {
        return FlairMsg$FlairListRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairListRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairListRequest flairMsg$FlairListRequest) {
        return (a)FlairMsg$FlairListRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairListRequest);
    }
    
    public static FlairMsg$FlairListRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairListRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairListRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairListRequest> parser() {
        return (n1<FlairMsg$FlairListRequest>)FlairMsg$FlairListRequest.DEFAULT_INSTANCE.getParserForType();
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
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
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
    
    private void setSubreddit(final String subreddit_) {
        subreddit_.getClass();
        this.subreddit_ = subreddit_;
    }
    
    private void setSubredditBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.subreddit_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (a90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<FlairMsg$FlairListRequest> parser;
                if ((parser = FlairMsg$FlairListRequest.PARSER) == null) {
                    synchronized (FlairMsg$FlairListRequest.class) {
                        if (FlairMsg$FlairListRequest.PARSER == null) {
                            FlairMsg$FlairListRequest.PARSER = (n1<FlairMsg$FlairListRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairListRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairListRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairListRequest.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0002\u0006\u0208\u0007\u0208\b\u0007", new Object[] { "subreddit_", "after_", "before_", "count_", "limit_", "name_", "show_", "srDetail_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairListRequest();
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
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
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
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairListRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairListRequest.access$7900());
        }
    }
}
