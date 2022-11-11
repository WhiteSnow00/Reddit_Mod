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

public final class FlairMsg$ClearFlairTemplatesRequest extends GeneratedMessageLite<FlairMsg$ClearFlairTemplatesRequest, a> implements d1
{
    private static final FlairMsg$ClearFlairTemplatesRequest DEFAULT_INSTANCE;
    public static final int FLAIR_TYPE_FIELD_NUMBER = 2;
    private static volatile n1<FlairMsg$ClearFlairTemplatesRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String flairType_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$ClearFlairTemplatesRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$ClearFlairTemplatesRequest()));
    }
    
    private FlairMsg$ClearFlairTemplatesRequest() {
        this.subreddit_ = "";
        this.flairType_ = "";
    }
    
    public static /* synthetic */ FlairMsg$ClearFlairTemplatesRequest access$000() {
        return FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE;
    }
    
    private void clearFlairType() {
        this.flairType_ = getDefaultInstance().getFlairType();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest getDefaultInstance() {
        return FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$ClearFlairTemplatesRequest flairMsg$ClearFlairTemplatesRequest) {
        return (a)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$ClearFlairTemplatesRequest);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$ClearFlairTemplatesRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$ClearFlairTemplatesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$ClearFlairTemplatesRequest> parser() {
        return (n1<FlairMsg$ClearFlairTemplatesRequest>)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairType(final String flairType_) {
        flairType_.getClass();
        this.flairType_ = flairType_;
    }
    
    private void setFlairTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairType_ = byteString.toStringUtf8();
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
                final n1<FlairMsg$ClearFlairTemplatesRequest> parser;
                if ((parser = FlairMsg$ClearFlairTemplatesRequest.PARSER) == null) {
                    synchronized (FlairMsg$ClearFlairTemplatesRequest.class) {
                        if (FlairMsg$ClearFlairTemplatesRequest.PARSER == null) {
                            FlairMsg$ClearFlairTemplatesRequest.PARSER = (n1<FlairMsg$ClearFlairTemplatesRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$ClearFlairTemplatesRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "subreddit_", "flairType_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$ClearFlairTemplatesRequest();
            }
        }
    }
    
    public String getFlairType() {
        return this.flairType_;
    }
    
    public ByteString getFlairTypeBytes() {
        return ByteString.copyFromUtf8(this.flairType_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$ClearFlairTemplatesRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$ClearFlairTemplatesRequest.access$000());
        }
    }
}
