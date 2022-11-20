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

public final class ListingsMsg$GetDuplicatesRequest extends GeneratedMessageLite<ListingsMsg$GetDuplicatesRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 3;
    public static final int ARTICLE_FIELD_NUMBER = 1;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 7;
    public static final int CROSSPOSTS_ONLY_FIELD_NUMBER = 8;
    private static final ListingsMsg$GetDuplicatesRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    private static volatile n1<ListingsMsg$GetDuplicatesRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 9;
    public static final int SORT_FIELD_NUMBER = 5;
    public static final int SR_DETAIL_FIELD_NUMBER = 10;
    public static final int SR_FIELD_NUMBER = 6;
    private String after_;
    private String article_;
    private String before_;
    private long count_;
    private boolean crosspostsOnly_;
    private long limit_;
    private String show_;
    private String sort_;
    private boolean srDetail_;
    private String sr_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetDuplicatesRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetDuplicatesRequest()));
    }
    
    private ListingsMsg$GetDuplicatesRequest() {
        this.article_ = "";
        this.before_ = "";
        this.after_ = "";
        this.sort_ = "";
        this.sr_ = "";
        this.show_ = "";
    }
    
    public static ListingsMsg$GetDuplicatesRequest access$11600() {
        return ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$11700(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final String article) {
        listingsMsg$GetDuplicatesRequest.setArticle(article);
    }
    
    public static void access$11800(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearArticle();
    }
    
    public static void access$11900(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final ByteString articleBytes) {
        listingsMsg$GetDuplicatesRequest.setArticleBytes(articleBytes);
    }
    
    public static void access$12000(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final String before) {
        listingsMsg$GetDuplicatesRequest.setBefore(before);
    }
    
    public static void access$12100(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearBefore();
    }
    
    public static void access$12200(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final ByteString beforeBytes) {
        listingsMsg$GetDuplicatesRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$12300(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final String after) {
        listingsMsg$GetDuplicatesRequest.setAfter(after);
    }
    
    public static void access$12400(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearAfter();
    }
    
    public static void access$12500(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final ByteString afterBytes) {
        listingsMsg$GetDuplicatesRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$12600(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final long limit) {
        listingsMsg$GetDuplicatesRequest.setLimit(limit);
    }
    
    public static void access$12700(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearLimit();
    }
    
    public static void access$12800(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final String sort) {
        listingsMsg$GetDuplicatesRequest.setSort(sort);
    }
    
    public static void access$12900(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearSort();
    }
    
    public static void access$13000(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final ByteString sortBytes) {
        listingsMsg$GetDuplicatesRequest.setSortBytes(sortBytes);
    }
    
    public static void access$13100(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final String sr) {
        listingsMsg$GetDuplicatesRequest.setSr(sr);
    }
    
    public static void access$13200(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearSr();
    }
    
    public static void access$13300(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final ByteString srBytes) {
        listingsMsg$GetDuplicatesRequest.setSrBytes(srBytes);
    }
    
    public static void access$13400(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final long count) {
        listingsMsg$GetDuplicatesRequest.setCount(count);
    }
    
    public static void access$13500(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearCount();
    }
    
    public static void access$13600(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final boolean crosspostsOnly) {
        listingsMsg$GetDuplicatesRequest.setCrosspostsOnly(crosspostsOnly);
    }
    
    public static void access$13700(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearCrosspostsOnly();
    }
    
    public static void access$13800(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final String show) {
        listingsMsg$GetDuplicatesRequest.setShow(show);
    }
    
    public static void access$13900(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearShow();
    }
    
    public static void access$14000(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final ByteString showBytes) {
        listingsMsg$GetDuplicatesRequest.setShowBytes(showBytes);
    }
    
    public static void access$14100(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest, final boolean srDetail) {
        listingsMsg$GetDuplicatesRequest.setSrDetail(srDetail);
    }
    
    public static void access$14200(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        listingsMsg$GetDuplicatesRequest.clearSrDetail();
    }
    
    private void clearAfter() {
        this.after_ = getDefaultInstance().getAfter();
    }
    
    private void clearArticle() {
        this.article_ = getDefaultInstance().getArticle();
    }
    
    private void clearBefore() {
        this.before_ = getDefaultInstance().getBefore();
    }
    
    private void clearCount() {
        this.count_ = 0L;
    }
    
    private void clearCrosspostsOnly() {
        this.crosspostsOnly_ = false;
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
    
    private void clearSr() {
        this.sr_ = getDefaultInstance().getSr();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    public static ListingsMsg$GetDuplicatesRequest getDefaultInstance() {
        return ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetDuplicatesRequest listingsMsg$GetDuplicatesRequest) {
        return (a)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetDuplicatesRequest);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetDuplicatesRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetDuplicatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetDuplicatesRequest> parser() {
        return (n1<ListingsMsg$GetDuplicatesRequest>)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAfter(final String after_) {
        after_.getClass();
        this.after_ = after_;
    }
    
    private void setAfterBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.after_ = byteString.toStringUtf8();
    }
    
    private void setArticle(final String article_) {
        article_.getClass();
        this.article_ = article_;
    }
    
    private void setArticleBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.article_ = byteString.toStringUtf8();
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
    
    private void setCrosspostsOnly(final boolean crosspostsOnly_) {
        this.crosspostsOnly_ = crosspostsOnly_;
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
    
    private void setSr(final String sr_) {
        sr_.getClass();
        this.sr_ = sr_;
    }
    
    private void setSrBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.sr_ = byteString.toStringUtf8();
    }
    
    private void setSrDetail(final boolean srDetail_) {
        this.srDetail_ = srDetail_;
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
                final n1<ListingsMsg$GetDuplicatesRequest> parser;
                if ((parser = ListingsMsg$GetDuplicatesRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetDuplicatesRequest.class) {
                        if (ListingsMsg$GetDuplicatesRequest.PARSER == null) {
                            ListingsMsg$GetDuplicatesRequest.PARSER = (n1<ListingsMsg$GetDuplicatesRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetDuplicatesRequest.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0002\b\u0007\t\u0208\n\u0007", new Object[] { "article_", "before_", "after_", "limit_", "sort_", "sr_", "count_", "crosspostsOnly_", "show_", "srDetail_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetDuplicatesRequest();
            }
        }
    }
    
    public String getAfter() {
        return this.after_;
    }
    
    public ByteString getAfterBytes() {
        return ByteString.copyFromUtf8(this.after_);
    }
    
    public String getArticle() {
        return this.article_;
    }
    
    public ByteString getArticleBytes() {
        return ByteString.copyFromUtf8(this.article_);
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
    
    public boolean getCrosspostsOnly() {
        return this.crosspostsOnly_;
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
    
    public String getSr() {
        return this.sr_;
    }
    
    public ByteString getSrBytes() {
        return ByteString.copyFromUtf8(this.sr_);
    }
    
    public boolean getSrDetail() {
        return this.srDetail_;
    }
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetDuplicatesRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetDuplicatesRequest.access$11600());
        }
    }
}
