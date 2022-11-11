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

public final class FlairMsg$FlairCsvRequest extends GeneratedMessageLite<FlairMsg$FlairCsvRequest, a> implements d1
{
    private static final FlairMsg$FlairCsvRequest DEFAULT_INSTANCE;
    public static final int FLAIR_CSV_FIELD_NUMBER = 2;
    private static volatile n1<FlairMsg$FlairCsvRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String flairCsv_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairCsvRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairCsvRequest()));
    }
    
    private FlairMsg$FlairCsvRequest() {
        this.subreddit_ = "";
        this.flairCsv_ = "";
    }
    
    public static /* synthetic */ FlairMsg$FlairCsvRequest access$7100() {
        return FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE;
    }
    
    private void clearFlairCsv() {
        this.flairCsv_ = getDefaultInstance().getFlairCsv();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$FlairCsvRequest getDefaultInstance() {
        return FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairCsvRequest flairMsg$FlairCsvRequest) {
        return (a)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairCsvRequest);
    }
    
    public static FlairMsg$FlairCsvRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairCsvRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairCsvRequest> parser() {
        return (n1<FlairMsg$FlairCsvRequest>)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairCsv(final String flairCsv_) {
        flairCsv_.getClass();
        this.flairCsv_ = flairCsv_;
    }
    
    private void setFlairCsvBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairCsv_ = byteString.toStringUtf8();
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
                final n1<FlairMsg$FlairCsvRequest> parser;
                if ((parser = FlairMsg$FlairCsvRequest.PARSER) == null) {
                    synchronized (FlairMsg$FlairCsvRequest.class) {
                        if (FlairMsg$FlairCsvRequest.PARSER == null) {
                            FlairMsg$FlairCsvRequest.PARSER = (n1<FlairMsg$FlairCsvRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairCsvRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "subreddit_", "flairCsv_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairCsvRequest();
            }
        }
    }
    
    public String getFlairCsv() {
        return this.flairCsv_;
    }
    
    public ByteString getFlairCsvBytes() {
        return ByteString.copyFromUtf8(this.flairCsv_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairCsvRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairCsvRequest.access$7100());
        }
    }
}
