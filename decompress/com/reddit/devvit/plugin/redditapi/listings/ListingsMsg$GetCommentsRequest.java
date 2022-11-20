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

public final class ListingsMsg$GetCommentsRequest extends GeneratedMessageLite<ListingsMsg$GetCommentsRequest, a> implements d1
{
    public static final int COMMENT_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final ListingsMsg$GetCommentsRequest DEFAULT_INSTANCE;
    public static final int DEPTH_FIELD_NUMBER = 4;
    public static final int LIMIT_FIELD_NUMBER = 5;
    private static volatile n1<ListingsMsg$GetCommentsRequest> PARSER;
    public static final int SHOWEDITS_FIELD_NUMBER = 6;
    public static final int SHOWMEDIA_FIELD_NUMBER = 7;
    public static final int SHOWMORE_FIELD_NUMBER = 8;
    public static final int SHOWTITLE_FIELD_NUMBER = 9;
    public static final int SORT_FIELD_NUMBER = 10;
    public static final int SR_DETAIL_FIELD_NUMBER = 11;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int THEME_FIELD_NUMBER = 12;
    public static final int THREADED_FIELD_NUMBER = 13;
    public static final int TRUNCATE_FIELD_NUMBER = 14;
    private String comment_;
    private long context_;
    private long depth_;
    private long limit_;
    private boolean showedits_;
    private boolean showmedia_;
    private boolean showmore_;
    private boolean showtitle_;
    private String sort_;
    private boolean srDetail_;
    private String subreddit_;
    private String theme_;
    private boolean threaded_;
    private long truncate_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetCommentsRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetCommentsRequest()));
    }
    
    private ListingsMsg$GetCommentsRequest() {
        this.subreddit_ = "";
        this.comment_ = "";
        this.sort_ = "";
        this.theme_ = "";
    }
    
    public static ListingsMsg$GetCommentsRequest access$4300() {
        return ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$4400(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final String subreddit) {
        listingsMsg$GetCommentsRequest.setSubreddit(subreddit);
    }
    
    public static void access$4500(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearSubreddit();
    }
    
    public static void access$4600(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final ByteString subredditBytes) {
        listingsMsg$GetCommentsRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$4700(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final String comment) {
        listingsMsg$GetCommentsRequest.setComment(comment);
    }
    
    public static void access$4800(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearComment();
    }
    
    public static void access$4900(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final ByteString commentBytes) {
        listingsMsg$GetCommentsRequest.setCommentBytes(commentBytes);
    }
    
    public static void access$5000(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final long context) {
        listingsMsg$GetCommentsRequest.setContext(context);
    }
    
    public static void access$5100(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearContext();
    }
    
    public static void access$5200(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final long depth) {
        listingsMsg$GetCommentsRequest.setDepth(depth);
    }
    
    public static void access$5300(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearDepth();
    }
    
    public static void access$5400(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final long limit) {
        listingsMsg$GetCommentsRequest.setLimit(limit);
    }
    
    public static void access$5500(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearLimit();
    }
    
    public static void access$5600(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final boolean showedits) {
        listingsMsg$GetCommentsRequest.setShowedits(showedits);
    }
    
    public static void access$5700(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearShowedits();
    }
    
    public static void access$5800(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final boolean showmedia) {
        listingsMsg$GetCommentsRequest.setShowmedia(showmedia);
    }
    
    public static void access$5900(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearShowmedia();
    }
    
    public static void access$6000(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final boolean showmore) {
        listingsMsg$GetCommentsRequest.setShowmore(showmore);
    }
    
    public static void access$6100(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearShowmore();
    }
    
    public static void access$6200(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final boolean showtitle) {
        listingsMsg$GetCommentsRequest.setShowtitle(showtitle);
    }
    
    public static void access$6300(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearShowtitle();
    }
    
    public static void access$6400(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final String sort) {
        listingsMsg$GetCommentsRequest.setSort(sort);
    }
    
    public static void access$6500(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearSort();
    }
    
    public static void access$6600(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final ByteString sortBytes) {
        listingsMsg$GetCommentsRequest.setSortBytes(sortBytes);
    }
    
    public static void access$6700(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final boolean srDetail) {
        listingsMsg$GetCommentsRequest.setSrDetail(srDetail);
    }
    
    public static void access$6800(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearSrDetail();
    }
    
    public static void access$6900(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final String theme) {
        listingsMsg$GetCommentsRequest.setTheme(theme);
    }
    
    public static void access$7000(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearTheme();
    }
    
    public static void access$7100(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final ByteString themeBytes) {
        listingsMsg$GetCommentsRequest.setThemeBytes(themeBytes);
    }
    
    public static void access$7200(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final boolean threaded) {
        listingsMsg$GetCommentsRequest.setThreaded(threaded);
    }
    
    public static void access$7300(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearThreaded();
    }
    
    public static void access$7400(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest, final long truncate) {
        listingsMsg$GetCommentsRequest.setTruncate(truncate);
    }
    
    public static void access$7500(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        listingsMsg$GetCommentsRequest.clearTruncate();
    }
    
    private void clearComment() {
        this.comment_ = getDefaultInstance().getComment();
    }
    
    private void clearContext() {
        this.context_ = 0L;
    }
    
    private void clearDepth() {
        this.depth_ = 0L;
    }
    
    private void clearLimit() {
        this.limit_ = 0L;
    }
    
    private void clearShowedits() {
        this.showedits_ = false;
    }
    
    private void clearShowmedia() {
        this.showmedia_ = false;
    }
    
    private void clearShowmore() {
        this.showmore_ = false;
    }
    
    private void clearShowtitle() {
        this.showtitle_ = false;
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
    
    private void clearTheme() {
        this.theme_ = getDefaultInstance().getTheme();
    }
    
    private void clearThreaded() {
        this.threaded_ = false;
    }
    
    private void clearTruncate() {
        this.truncate_ = 0L;
    }
    
    public static ListingsMsg$GetCommentsRequest getDefaultInstance() {
        return ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetCommentsRequest listingsMsg$GetCommentsRequest) {
        return (a)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetCommentsRequest);
    }
    
    public static ListingsMsg$GetCommentsRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetCommentsRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetCommentsRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetCommentsRequest> parser() {
        return (n1<ListingsMsg$GetCommentsRequest>)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setComment(final String comment_) {
        comment_.getClass();
        this.comment_ = comment_;
    }
    
    private void setCommentBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.comment_ = byteString.toStringUtf8();
    }
    
    private void setContext(final long context_) {
        this.context_ = context_;
    }
    
    private void setDepth(final long depth_) {
        this.depth_ = depth_;
    }
    
    private void setLimit(final long limit_) {
        this.limit_ = limit_;
    }
    
    private void setShowedits(final boolean showedits_) {
        this.showedits_ = showedits_;
    }
    
    private void setShowmedia(final boolean showmedia_) {
        this.showmedia_ = showmedia_;
    }
    
    private void setShowmore(final boolean showmore_) {
        this.showmore_ = showmore_;
    }
    
    private void setShowtitle(final boolean showtitle_) {
        this.showtitle_ = showtitle_;
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
    
    private void setTheme(final String theme_) {
        theme_.getClass();
        this.theme_ = theme_;
    }
    
    private void setThemeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.theme_ = byteString.toStringUtf8();
    }
    
    private void setThreaded(final boolean threaded_) {
        this.threaded_ = threaded_;
    }
    
    private void setTruncate(final long truncate_) {
        this.truncate_ = truncate_;
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
                final n1<ListingsMsg$GetCommentsRequest> parser;
                if ((parser = ListingsMsg$GetCommentsRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetCommentsRequest.class) {
                        if (ListingsMsg$GetCommentsRequest.PARSER == null) {
                            ListingsMsg$GetCommentsRequest.PARSER = (n1<ListingsMsg$GetCommentsRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetCommentsRequest.DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0208\u000b\u0007\f\u0208\r\u0007\u000e\u0002", new Object[] { "subreddit_", "comment_", "context_", "depth_", "limit_", "showedits_", "showmedia_", "showmore_", "showtitle_", "sort_", "srDetail_", "theme_", "threaded_", "truncate_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetCommentsRequest();
            }
        }
    }
    
    public String getComment() {
        return this.comment_;
    }
    
    public ByteString getCommentBytes() {
        return ByteString.copyFromUtf8(this.comment_);
    }
    
    public long getContext() {
        return this.context_;
    }
    
    public long getDepth() {
        return this.depth_;
    }
    
    public long getLimit() {
        return this.limit_;
    }
    
    public boolean getShowedits() {
        return this.showedits_;
    }
    
    public boolean getShowmedia() {
        return this.showmedia_;
    }
    
    public boolean getShowmore() {
        return this.showmore_;
    }
    
    public boolean getShowtitle() {
        return this.showtitle_;
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
    
    public String getTheme() {
        return this.theme_;
    }
    
    public ByteString getThemeBytes() {
        return ByteString.copyFromUtf8(this.theme_);
    }
    
    public boolean getThreaded() {
        return this.threaded_;
    }
    
    public long getTruncate() {
        return this.truncate_;
    }
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetCommentsRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetCommentsRequest.access$4300());
        }
    }
}
