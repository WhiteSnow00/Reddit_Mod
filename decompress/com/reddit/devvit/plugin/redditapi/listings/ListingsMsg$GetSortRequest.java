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

public final class ListingsMsg$GetSortRequest extends GeneratedMessageLite<ListingsMsg$GetSortRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 3;
    public static final int BEFORE_FIELD_NUMBER = 4;
    public static final int COUNT_FIELD_NUMBER = 6;
    private static final ListingsMsg$GetSortRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 5;
    private static volatile n1<ListingsMsg$GetSortRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 7;
    public static final int SORT_FIELD_NUMBER = 2;
    public static final int SR_DETAIL_FIELD_NUMBER = 8;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int T_FIELD_NUMBER = 9;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String show_;
    private String sort_;
    private boolean srDetail_;
    private String subreddit_;
    private String t_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetSortRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetSortRequest()));
    }
    
    private ListingsMsg$GetSortRequest() {
        this.subreddit_ = "";
        this.sort_ = "";
        this.after_ = "";
        this.before_ = "";
        this.show_ = "";
        this.t_ = "";
    }
    
    public static ListingsMsg$GetSortRequest access$1700() {
        return ListingsMsg$GetSortRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$1800(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final String subreddit) {
        listingsMsg$GetSortRequest.setSubreddit(subreddit);
    }
    
    public static void access$1900(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearSubreddit();
    }
    
    public static void access$2000(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final ByteString subredditBytes) {
        listingsMsg$GetSortRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$2100(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final String sort) {
        listingsMsg$GetSortRequest.setSort(sort);
    }
    
    public static void access$2200(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearSort();
    }
    
    public static void access$2300(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final ByteString sortBytes) {
        listingsMsg$GetSortRequest.setSortBytes(sortBytes);
    }
    
    public static void access$2400(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final String after) {
        listingsMsg$GetSortRequest.setAfter(after);
    }
    
    public static void access$2500(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearAfter();
    }
    
    public static void access$2600(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final ByteString afterBytes) {
        listingsMsg$GetSortRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$2700(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final String before) {
        listingsMsg$GetSortRequest.setBefore(before);
    }
    
    public static void access$2800(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearBefore();
    }
    
    public static void access$2900(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final ByteString beforeBytes) {
        listingsMsg$GetSortRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$3000(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final long limit) {
        listingsMsg$GetSortRequest.setLimit(limit);
    }
    
    public static void access$3100(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearLimit();
    }
    
    public static void access$3200(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final long count) {
        listingsMsg$GetSortRequest.setCount(count);
    }
    
    public static void access$3300(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearCount();
    }
    
    public static void access$3400(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final String show) {
        listingsMsg$GetSortRequest.setShow(show);
    }
    
    public static void access$3500(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearShow();
    }
    
    public static void access$3600(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final ByteString showBytes) {
        listingsMsg$GetSortRequest.setShowBytes(showBytes);
    }
    
    public static void access$3700(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final boolean srDetail) {
        listingsMsg$GetSortRequest.setSrDetail(srDetail);
    }
    
    public static void access$3800(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearSrDetail();
    }
    
    public static void access$3900(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final String t) {
        listingsMsg$GetSortRequest.setT(t);
    }
    
    public static void access$4000(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        listingsMsg$GetSortRequest.clearT();
    }
    
    public static void access$4100(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest, final ByteString tBytes) {
        listingsMsg$GetSortRequest.setTBytes(tBytes);
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
    
    private void clearSort() {
        this.sort_ = getDefaultInstance().getSort();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearT() {
        this.t_ = getDefaultInstance().getT();
    }
    
    public static ListingsMsg$GetSortRequest getDefaultInstance() {
        return ListingsMsg$GetSortRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetSortRequest listingsMsg$GetSortRequest) {
        return (a)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetSortRequest);
    }
    
    public static ListingsMsg$GetSortRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetSortRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetSortRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetSortRequest> parser() {
        return (n1<ListingsMsg$GetSortRequest>)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE.getParserForType();
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
    
    private void setSort(final String sort_) {
        sort_.getClass();
        this.sort_ = sort_;
    }
    
    private void setSortBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.sort_ = byteString.toStringUtf8();
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
    
    private void setT(final String t_) {
        t_.getClass();
        this.t_ = t_;
    }
    
    private void setTBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.t_ = byteString.toStringUtf8();
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
                final n1<ListingsMsg$GetSortRequest> parser;
                if ((parser = ListingsMsg$GetSortRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetSortRequest.class) {
                        if (ListingsMsg$GetSortRequest.PARSER == null) {
                            ListingsMsg$GetSortRequest.PARSER = (n1<ListingsMsg$GetSortRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetSortRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetSortRequest.DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0002\u0007\u0208\b\u0007\t\u0208", new Object[] { "subreddit_", "sort_", "after_", "before_", "limit_", "count_", "show_", "srDetail_", "t_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetSortRequest();
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
    
    public String getSort() {
        return this.sort_;
    }
    
    public ByteString getSortBytes() {
        return ByteString.copyFromUtf8(this.sort_);
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
    
    public String getT() {
        return this.t_;
    }
    
    public ByteString getTBytes() {
        return ByteString.copyFromUtf8(this.t_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetSortRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetSortRequest.access$1700());
        }
    }
}
