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

public final class ListingsMsg$GetRandomRequest extends GeneratedMessageLite<ListingsMsg$GetRandomRequest, a> implements d1
{
    private static final ListingsMsg$GetRandomRequest DEFAULT_INSTANCE;
    private static volatile n1<ListingsMsg$GetRandomRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetRandomRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetRandomRequest()));
    }
    
    private ListingsMsg$GetRandomRequest() {
        this.subreddit_ = "";
    }
    
    public static ListingsMsg$GetRandomRequest access$20700() {
        return ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$20800(final ListingsMsg$GetRandomRequest listingsMsg$GetRandomRequest, final String subreddit) {
        listingsMsg$GetRandomRequest.setSubreddit(subreddit);
    }
    
    public static void access$20900(final ListingsMsg$GetRandomRequest listingsMsg$GetRandomRequest) {
        listingsMsg$GetRandomRequest.clearSubreddit();
    }
    
    public static void access$21000(final ListingsMsg$GetRandomRequest listingsMsg$GetRandomRequest, final ByteString subredditBytes) {
        listingsMsg$GetRandomRequest.setSubredditBytes(subredditBytes);
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static ListingsMsg$GetRandomRequest getDefaultInstance() {
        return ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetRandomRequest listingsMsg$GetRandomRequest) {
        return (a)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetRandomRequest);
    }
    
    public static ListingsMsg$GetRandomRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetRandomRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetRandomRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetRandomRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetRandomRequest> parser() {
        return (n1<ListingsMsg$GetRandomRequest>)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE.getParserForType();
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
                final n1<ListingsMsg$GetRandomRequest> parser;
                if ((parser = ListingsMsg$GetRandomRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetRandomRequest.class) {
                        if (ListingsMsg$GetRandomRequest.PARSER == null) {
                            ListingsMsg$GetRandomRequest.PARSER = (n1<ListingsMsg$GetRandomRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetRandomRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetRandomRequest();
            }
        }
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetRandomRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetRandomRequest.access$20700());
        }
    }
}
