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

public final class ListingsMsg$GetHotRequest extends GeneratedMessageLite<ListingsMsg$GetHotRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 3;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final ListingsMsg$GetHotRequest DEFAULT_INSTANCE;
    public static final int G_FIELD_NUMBER = 8;
    public static final int LIMIT_FIELD_NUMBER = 4;
    private static volatile n1<ListingsMsg$GetHotRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 6;
    public static final int SR_DETAIL_FIELD_NUMBER = 7;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String after_;
    private String before_;
    private long count_;
    private String g_;
    private long limit_;
    private String show_;
    private boolean srDetail_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetHotRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetHotRequest()));
    }
    
    private ListingsMsg$GetHotRequest() {
        this.subreddit_ = "";
        this.before_ = "";
        this.after_ = "";
        this.show_ = "";
        this.g_ = "";
    }
    
    public static ListingsMsg$GetHotRequest access$14400() {
        return ListingsMsg$GetHotRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$14500(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final String subreddit) {
        listingsMsg$GetHotRequest.setSubreddit(subreddit);
    }
    
    public static void access$14600(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearSubreddit();
    }
    
    public static void access$14700(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final ByteString subredditBytes) {
        listingsMsg$GetHotRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$14800(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final String before) {
        listingsMsg$GetHotRequest.setBefore(before);
    }
    
    public static void access$14900(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearBefore();
    }
    
    public static void access$15000(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final ByteString beforeBytes) {
        listingsMsg$GetHotRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$15100(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final String after) {
        listingsMsg$GetHotRequest.setAfter(after);
    }
    
    public static void access$15200(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearAfter();
    }
    
    public static void access$15300(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final ByteString afterBytes) {
        listingsMsg$GetHotRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$15400(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final long limit) {
        listingsMsg$GetHotRequest.setLimit(limit);
    }
    
    public static void access$15500(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearLimit();
    }
    
    public static void access$15600(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final long count) {
        listingsMsg$GetHotRequest.setCount(count);
    }
    
    public static void access$15700(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearCount();
    }
    
    public static void access$15800(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final String show) {
        listingsMsg$GetHotRequest.setShow(show);
    }
    
    public static void access$15900(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearShow();
    }
    
    public static void access$16000(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final ByteString showBytes) {
        listingsMsg$GetHotRequest.setShowBytes(showBytes);
    }
    
    public static void access$16100(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final boolean srDetail) {
        listingsMsg$GetHotRequest.setSrDetail(srDetail);
    }
    
    public static void access$16200(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearSrDetail();
    }
    
    public static void access$16300(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final String g) {
        listingsMsg$GetHotRequest.setG(g);
    }
    
    public static void access$16400(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        listingsMsg$GetHotRequest.clearG();
    }
    
    public static void access$16500(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest, final ByteString gBytes) {
        listingsMsg$GetHotRequest.setGBytes(gBytes);
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
    
    private void clearG() {
        this.g_ = getDefaultInstance().getG();
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
    
    public static ListingsMsg$GetHotRequest getDefaultInstance() {
        return ListingsMsg$GetHotRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetHotRequest listingsMsg$GetHotRequest) {
        return (a)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetHotRequest);
    }
    
    public static ListingsMsg$GetHotRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetHotRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetHotRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetHotRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetHotRequest> parser() {
        return (n1<ListingsMsg$GetHotRequest>)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE.getParserForType();
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
    
    private void setG(final String g_) {
        g_.getClass();
        this.g_ = g_;
    }
    
    private void setGBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.g_ = byteString.toStringUtf8();
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
                final n1<ListingsMsg$GetHotRequest> parser;
                if ((parser = ListingsMsg$GetHotRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetHotRequest.class) {
                        if (ListingsMsg$GetHotRequest.PARSER == null) {
                            ListingsMsg$GetHotRequest.PARSER = (n1<ListingsMsg$GetHotRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetHotRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetHotRequest.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0002\u0006\u0208\u0007\u0007\b\u0208", new Object[] { "subreddit_", "before_", "after_", "limit_", "count_", "show_", "srDetail_", "g_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetHotRequest();
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
    
    public String getG() {
        return this.g_;
    }
    
    public ByteString getGBytes() {
        return ByteString.copyFromUtf8(this.g_);
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
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetHotRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetHotRequest.access$14400());
        }
    }
}
