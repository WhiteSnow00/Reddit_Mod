// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairTemplateOrderRequest extends GeneratedMessageLite<FlairMsg$FlairTemplateOrderRequest, a> implements d1
{
    private static final FlairMsg$FlairTemplateOrderRequest DEFAULT_INSTANCE;
    public static final int FLAIR_TYPE_FIELD_NUMBER = 2;
    public static final int ORDER_FIELD_NUMBER = 3;
    private static volatile n1<FlairMsg$FlairTemplateOrderRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String flairType_;
    private Internal$j<String> order_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairTemplateOrderRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairTemplateOrderRequest()));
    }
    
    private FlairMsg$FlairTemplateOrderRequest() {
        this.subreddit_ = "";
        this.flairType_ = "";
        this.order_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ FlairMsg$FlairTemplateOrderRequest access$4100() {
        return FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE;
    }
    
    private void addAllOrder(final Iterable<String> iterable) {
        this.ensureOrderIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.order_);
    }
    
    private void addOrder(final String s) {
        s.getClass();
        this.ensureOrderIsMutable();
        ((List<String>)this.order_).add(s);
    }
    
    private void addOrderBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureOrderIsMutable();
        ((List<String>)this.order_).add(byteString.toStringUtf8());
    }
    
    private void clearFlairType() {
        this.flairType_ = getDefaultInstance().getFlairType();
    }
    
    private void clearOrder() {
        this.order_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void ensureOrderIsMutable() {
        final Internal$j<String> order_ = this.order_;
        if (!order_.E0()) {
            this.order_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)order_);
        }
    }
    
    public static FlairMsg$FlairTemplateOrderRequest getDefaultInstance() {
        return FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairTemplateOrderRequest flairMsg$FlairTemplateOrderRequest) {
        return (a)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairTemplateOrderRequest);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairTemplateOrderRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateOrderRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairTemplateOrderRequest> parser() {
        return (n1<FlairMsg$FlairTemplateOrderRequest>)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairType(final String flairType_) {
        flairType_.getClass();
        this.flairType_ = flairType_;
    }
    
    private void setFlairTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairType_ = byteString.toStringUtf8();
    }
    
    private void setOrder(final int n, final String s) {
        s.getClass();
        this.ensureOrderIsMutable();
        ((List<String>)this.order_).set(n, s);
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
                final n1<FlairMsg$FlairTemplateOrderRequest> parser;
                if ((parser = FlairMsg$FlairTemplateOrderRequest.PARSER) == null) {
                    synchronized (FlairMsg$FlairTemplateOrderRequest.class) {
                        if (FlairMsg$FlairTemplateOrderRequest.PARSER == null) {
                            FlairMsg$FlairTemplateOrderRequest.PARSER = (n1<FlairMsg$FlairTemplateOrderRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairTemplateOrderRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u021a", new Object[] { "subreddit_", "flairType_", "order_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairTemplateOrderRequest();
            }
        }
    }
    
    public String getFlairType() {
        return this.flairType_;
    }
    
    public ByteString getFlairTypeBytes() {
        return ByteString.copyFromUtf8(this.flairType_);
    }
    
    public String getOrder(final int n) {
        return ((List<String>)this.order_).get(n);
    }
    
    public ByteString getOrderBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.order_).get(n));
    }
    
    public int getOrderCount() {
        return ((List)this.order_).size();
    }
    
    public List<String> getOrderList() {
        return (List<String>)this.order_;
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairTemplateOrderRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairTemplateOrderRequest.access$4100());
        }
    }
}
