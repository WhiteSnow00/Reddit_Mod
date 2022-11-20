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

public final class ListingsMsg$GetCommentsArticleRequest extends GeneratedMessageLite<ListingsMsg$GetCommentsArticleRequest, a> implements d1
{
    public static final int ARTICLE_FIELD_NUMBER = 1;
    public static final int COMMENT_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final ListingsMsg$GetCommentsArticleRequest DEFAULT_INSTANCE;
    public static final int DEPTH_FIELD_NUMBER = 4;
    public static final int LIMIT_FIELD_NUMBER = 5;
    private static volatile n1<ListingsMsg$GetCommentsArticleRequest> PARSER;
    public static final int SHOWEDITS_FIELD_NUMBER = 6;
    public static final int SHOWMEDIA_FIELD_NUMBER = 7;
    public static final int SHOWMORE_FIELD_NUMBER = 8;
    public static final int SHOWTITLE_FIELD_NUMBER = 9;
    public static final int SORT_FIELD_NUMBER = 10;
    public static final int SR_DETAIL_FIELD_NUMBER = 11;
    public static final int THEME_FIELD_NUMBER = 12;
    public static final int THREADED_FIELD_NUMBER = 13;
    public static final int TRUNCATE_FIELD_NUMBER = 14;
    private String article_;
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
    private String theme_;
    private boolean threaded_;
    private long truncate_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetCommentsArticleRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetCommentsArticleRequest()));
    }
    
    private ListingsMsg$GetCommentsArticleRequest() {
        this.article_ = "";
        this.comment_ = "";
        this.sort_ = "";
        this.theme_ = "";
    }
    
    public static void access$10000(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final ByteString sortBytes) {
        listingsMsg$GetCommentsArticleRequest.setSortBytes(sortBytes);
    }
    
    public static void access$10100(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final boolean srDetail) {
        listingsMsg$GetCommentsArticleRequest.setSrDetail(srDetail);
    }
    
    public static void access$10200(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearSrDetail();
    }
    
    public static void access$10300(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final String theme) {
        listingsMsg$GetCommentsArticleRequest.setTheme(theme);
    }
    
    public static void access$10400(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearTheme();
    }
    
    public static void access$10500(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final ByteString themeBytes) {
        listingsMsg$GetCommentsArticleRequest.setThemeBytes(themeBytes);
    }
    
    public static void access$10600(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final boolean threaded) {
        listingsMsg$GetCommentsArticleRequest.setThreaded(threaded);
    }
    
    public static void access$10700(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearThreaded();
    }
    
    public static void access$10800(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final long truncate) {
        listingsMsg$GetCommentsArticleRequest.setTruncate(truncate);
    }
    
    public static void access$10900(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearTruncate();
    }
    
    public static ListingsMsg$GetCommentsArticleRequest access$7700() {
        return ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$7800(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final String article) {
        listingsMsg$GetCommentsArticleRequest.setArticle(article);
    }
    
    public static void access$7900(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearArticle();
    }
    
    public static void access$8000(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final ByteString articleBytes) {
        listingsMsg$GetCommentsArticleRequest.setArticleBytes(articleBytes);
    }
    
    public static void access$8100(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final String comment) {
        listingsMsg$GetCommentsArticleRequest.setComment(comment);
    }
    
    public static void access$8200(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearComment();
    }
    
    public static void access$8300(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final ByteString commentBytes) {
        listingsMsg$GetCommentsArticleRequest.setCommentBytes(commentBytes);
    }
    
    public static void access$8400(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final long context) {
        listingsMsg$GetCommentsArticleRequest.setContext(context);
    }
    
    public static void access$8500(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearContext();
    }
    
    public static void access$8600(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final long depth) {
        listingsMsg$GetCommentsArticleRequest.setDepth(depth);
    }
    
    public static void access$8700(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearDepth();
    }
    
    public static void access$8800(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final long limit) {
        listingsMsg$GetCommentsArticleRequest.setLimit(limit);
    }
    
    public static void access$8900(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearLimit();
    }
    
    public static void access$9000(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final boolean showedits) {
        listingsMsg$GetCommentsArticleRequest.setShowedits(showedits);
    }
    
    public static void access$9100(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearShowedits();
    }
    
    public static void access$9200(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final boolean showmedia) {
        listingsMsg$GetCommentsArticleRequest.setShowmedia(showmedia);
    }
    
    public static void access$9300(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearShowmedia();
    }
    
    public static void access$9400(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final boolean showmore) {
        listingsMsg$GetCommentsArticleRequest.setShowmore(showmore);
    }
    
    public static void access$9500(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearShowmore();
    }
    
    public static void access$9600(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final boolean showtitle) {
        listingsMsg$GetCommentsArticleRequest.setShowtitle(showtitle);
    }
    
    public static void access$9700(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearShowtitle();
    }
    
    public static void access$9800(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest, final String sort) {
        listingsMsg$GetCommentsArticleRequest.setSort(sort);
    }
    
    public static void access$9900(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        listingsMsg$GetCommentsArticleRequest.clearSort();
    }
    
    private void clearArticle() {
        this.article_ = getDefaultInstance().getArticle();
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
    
    private void clearTheme() {
        this.theme_ = getDefaultInstance().getTheme();
    }
    
    private void clearThreaded() {
        this.threaded_ = false;
    }
    
    private void clearTruncate() {
        this.truncate_ = 0L;
    }
    
    public static ListingsMsg$GetCommentsArticleRequest getDefaultInstance() {
        return ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetCommentsArticleRequest listingsMsg$GetCommentsArticleRequest) {
        return (a)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetCommentsArticleRequest);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetCommentsArticleRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetCommentsArticleRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetCommentsArticleRequest> parser() {
        return (n1<ListingsMsg$GetCommentsArticleRequest>)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setArticle(final String article_) {
        article_.getClass();
        this.article_ = article_;
    }
    
    private void setArticleBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.article_ = byteString.toStringUtf8();
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
                final n1<ListingsMsg$GetCommentsArticleRequest> parser;
                if ((parser = ListingsMsg$GetCommentsArticleRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetCommentsArticleRequest.class) {
                        if (ListingsMsg$GetCommentsArticleRequest.PARSER == null) {
                            ListingsMsg$GetCommentsArticleRequest.PARSER = (n1<ListingsMsg$GetCommentsArticleRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetCommentsArticleRequest.DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0208\u000b\u0007\f\u0208\r\u0007\u000e\u0002", new Object[] { "article_", "comment_", "context_", "depth_", "limit_", "showedits_", "showmedia_", "showmore_", "showtitle_", "sort_", "srDetail_", "theme_", "threaded_", "truncate_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetCommentsArticleRequest();
            }
        }
    }
    
    public String getArticle() {
        return this.article_;
    }
    
    public ByteString getArticleBytes() {
        return ByteString.copyFromUtf8(this.article_);
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
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetCommentsArticleRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetCommentsArticleRequest.access$7700());
        }
    }
}
