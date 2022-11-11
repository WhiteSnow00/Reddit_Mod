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

public final class FlairMsg$LinkFlairRequest extends GeneratedMessageLite<FlairMsg$LinkFlairRequest, a> implements d1
{
    private static final FlairMsg$LinkFlairRequest DEFAULT_INSTANCE;
    private static volatile n1<FlairMsg$LinkFlairRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$LinkFlairRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$LinkFlairRequest()));
    }
    
    private FlairMsg$LinkFlairRequest() {
        this.subreddit_ = "";
    }
    
    public static /* synthetic */ FlairMsg$LinkFlairRequest access$14900() {
        return FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$LinkFlairRequest getDefaultInstance() {
        return FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$LinkFlairRequest flairMsg$LinkFlairRequest) {
        return (a)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$LinkFlairRequest);
    }
    
    public static FlairMsg$LinkFlairRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$LinkFlairRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$LinkFlairRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$LinkFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$LinkFlairRequest> parser() {
        return (n1<FlairMsg$LinkFlairRequest>)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE.getParserForType();
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
                final n1<FlairMsg$LinkFlairRequest> parser;
                if ((parser = FlairMsg$LinkFlairRequest.PARSER) == null) {
                    synchronized (FlairMsg$LinkFlairRequest.class) {
                        if (FlairMsg$LinkFlairRequest.PARSER == null) {
                            FlairMsg$LinkFlairRequest.PARSER = (n1<FlairMsg$LinkFlairRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$LinkFlairRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$LinkFlairRequest();
            }
        }
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$LinkFlairRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$LinkFlairRequest.access$14900());
        }
    }
}
