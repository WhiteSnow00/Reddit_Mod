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

public final class ListingsMsg$GetBestRequest extends GeneratedMessageLite<ListingsMsg$GetBestRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 1;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final ListingsMsg$GetBestRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    private static volatile n1<ListingsMsg$GetBestRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 5;
    public static final int SR_DETAIL_FIELD_NUMBER = 6;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String show_;
    private boolean srDetail_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetBestRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetBestRequest()));
    }
    
    private ListingsMsg$GetBestRequest() {
        this.after_ = "";
        this.before_ = "";
        this.show_ = "";
    }
    
    public static ListingsMsg$GetBestRequest access$000() {
        return ListingsMsg$GetBestRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$100(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final String after) {
        listingsMsg$GetBestRequest.setAfter(after);
    }
    
    public static void access$1000(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest) {
        listingsMsg$GetBestRequest.clearLimit();
    }
    
    public static void access$1100(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final String show) {
        listingsMsg$GetBestRequest.setShow(show);
    }
    
    public static void access$1200(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest) {
        listingsMsg$GetBestRequest.clearShow();
    }
    
    public static void access$1300(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final ByteString showBytes) {
        listingsMsg$GetBestRequest.setShowBytes(showBytes);
    }
    
    public static void access$1400(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final boolean srDetail) {
        listingsMsg$GetBestRequest.setSrDetail(srDetail);
    }
    
    public static void access$1500(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest) {
        listingsMsg$GetBestRequest.clearSrDetail();
    }
    
    public static void access$200(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest) {
        listingsMsg$GetBestRequest.clearAfter();
    }
    
    public static void access$300(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final ByteString afterBytes) {
        listingsMsg$GetBestRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$400(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final String before) {
        listingsMsg$GetBestRequest.setBefore(before);
    }
    
    public static void access$500(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest) {
        listingsMsg$GetBestRequest.clearBefore();
    }
    
    public static void access$600(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final ByteString beforeBytes) {
        listingsMsg$GetBestRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$700(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final long count) {
        listingsMsg$GetBestRequest.setCount(count);
    }
    
    public static void access$800(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest) {
        listingsMsg$GetBestRequest.clearCount();
    }
    
    public static void access$900(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest, final long limit) {
        listingsMsg$GetBestRequest.setLimit(limit);
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
    
    public static ListingsMsg$GetBestRequest getDefaultInstance() {
        return ListingsMsg$GetBestRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetBestRequest listingsMsg$GetBestRequest) {
        return (a)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetBestRequest);
    }
    
    public static ListingsMsg$GetBestRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetBestRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetBestRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetBestRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetBestRequest> parser() {
        return (n1<ListingsMsg$GetBestRequest>)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE.getParserForType();
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
                final n1<ListingsMsg$GetBestRequest> parser;
                if ((parser = ListingsMsg$GetBestRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetBestRequest.class) {
                        if (ListingsMsg$GetBestRequest.PARSER == null) {
                            ListingsMsg$GetBestRequest.PARSER = (n1<ListingsMsg$GetBestRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetBestRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetBestRequest.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0007", new Object[] { "after_", "before_", "count_", "limit_", "show_", "srDetail_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetBestRequest();
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
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetBestRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetBestRequest.access$000());
        }
    }
}
