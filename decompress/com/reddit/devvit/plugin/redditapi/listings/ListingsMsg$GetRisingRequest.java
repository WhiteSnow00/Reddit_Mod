// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.listings;

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

public final class ListingsMsg$GetRisingRequest extends GeneratedMessageLite<ListingsMsg$GetRisingRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 2;
    public static final int BEFORE_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 4;
    private static final ListingsMsg$GetRisingRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 5;
    private static volatile n1<ListingsMsg$GetRisingRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 6;
    public static final int SR_DETAIL_FIELD_NUMBER = 7;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String show_;
    private boolean srDetail_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetRisingRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetRisingRequest()));
    }
    
    private ListingsMsg$GetRisingRequest() {
        this.subreddit_ = "";
        this.after_ = "";
        this.before_ = "";
        this.show_ = "";
    }
    
    public static ListingsMsg$GetRisingRequest access$18700() {
        return ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$18800(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final String subreddit) {
        listingsMsg$GetRisingRequest.setSubreddit(subreddit);
    }
    
    public static void access$18900(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        listingsMsg$GetRisingRequest.clearSubreddit();
    }
    
    public static void access$19000(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final ByteString subredditBytes) {
        listingsMsg$GetRisingRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$19100(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final String after) {
        listingsMsg$GetRisingRequest.setAfter(after);
    }
    
    public static void access$19200(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        listingsMsg$GetRisingRequest.clearAfter();
    }
    
    public static void access$19300(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final ByteString afterBytes) {
        listingsMsg$GetRisingRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$19400(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final String before) {
        listingsMsg$GetRisingRequest.setBefore(before);
    }
    
    public static void access$19500(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        listingsMsg$GetRisingRequest.clearBefore();
    }
    
    public static void access$19600(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final ByteString beforeBytes) {
        listingsMsg$GetRisingRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$19700(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final long count) {
        listingsMsg$GetRisingRequest.setCount(count);
    }
    
    public static void access$19800(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        listingsMsg$GetRisingRequest.clearCount();
    }
    
    public static void access$19900(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final long limit) {
        listingsMsg$GetRisingRequest.setLimit(limit);
    }
    
    public static void access$20000(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        listingsMsg$GetRisingRequest.clearLimit();
    }
    
    public static void access$20100(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final String show) {
        listingsMsg$GetRisingRequest.setShow(show);
    }
    
    public static void access$20200(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        listingsMsg$GetRisingRequest.clearShow();
    }
    
    public static void access$20300(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final ByteString showBytes) {
        listingsMsg$GetRisingRequest.setShowBytes(showBytes);
    }
    
    public static void access$20400(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest, final boolean srDetail) {
        listingsMsg$GetRisingRequest.setSrDetail(srDetail);
    }
    
    public static void access$20500(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        listingsMsg$GetRisingRequest.clearSrDetail();
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
    
    private void clearShow() {
        this.show_ = getDefaultInstance().getShow();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static ListingsMsg$GetRisingRequest getDefaultInstance() {
        return ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetRisingRequest listingsMsg$GetRisingRequest) {
        return (a)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetRisingRequest);
    }
    
    public static ListingsMsg$GetRisingRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetRisingRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetRisingRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRisingRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetRisingRequest> parser() {
        return (n1<ListingsMsg$GetRisingRequest>)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE.getParserForType();
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
        switch (c90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ListingsMsg$GetRisingRequest> parser;
                if ((parser = ListingsMsg$GetRisingRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetRisingRequest.class) {
                        if (ListingsMsg$GetRisingRequest.PARSER == null) {
                            ListingsMsg$GetRisingRequest.PARSER = (n1<ListingsMsg$GetRisingRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetRisingRequest.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0002\u0006\u0208\u0007\u0007", new Object[] { "subreddit_", "after_", "before_", "count_", "limit_", "show_", "srDetail_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetRisingRequest();
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
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetRisingRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetRisingRequest.access$18700());
        }
    }
}
