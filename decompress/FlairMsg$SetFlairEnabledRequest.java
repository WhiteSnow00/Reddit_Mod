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

public final class FlairMsg$SetFlairEnabledRequest extends GeneratedMessageLite<FlairMsg$SetFlairEnabledRequest, a> implements d1
{
    private static final FlairMsg$SetFlairEnabledRequest DEFAULT_INSTANCE;
    public static final int FLAIR_ENABLED_FIELD_NUMBER = 2;
    private static volatile n1<FlairMsg$SetFlairEnabledRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private boolean flairEnabled_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$SetFlairEnabledRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$SetFlairEnabledRequest()));
    }
    
    private FlairMsg$SetFlairEnabledRequest() {
        this.subreddit_ = "";
    }
    
    public static /* synthetic */ FlairMsg$SetFlairEnabledRequest access$18300() {
        return FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE;
    }
    
    private void clearFlairEnabled() {
        this.flairEnabled_ = false;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$SetFlairEnabledRequest getDefaultInstance() {
        return FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$SetFlairEnabledRequest flairMsg$SetFlairEnabledRequest) {
        return (a)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$SetFlairEnabledRequest);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$SetFlairEnabledRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$SetFlairEnabledRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$SetFlairEnabledRequest> parser() {
        return (n1<FlairMsg$SetFlairEnabledRequest>)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairEnabled(final boolean flairEnabled_) {
        this.flairEnabled_ = flairEnabled_;
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
                final n1<FlairMsg$SetFlairEnabledRequest> parser;
                if ((parser = FlairMsg$SetFlairEnabledRequest.PARSER) == null) {
                    synchronized (FlairMsg$SetFlairEnabledRequest.class) {
                        if (FlairMsg$SetFlairEnabledRequest.PARSER == null) {
                            FlairMsg$SetFlairEnabledRequest.PARSER = (n1<FlairMsg$SetFlairEnabledRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$SetFlairEnabledRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[] { "subreddit_", "flairEnabled_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$SetFlairEnabledRequest();
            }
        }
    }
    
    public boolean getFlairEnabled() {
        return this.flairEnabled_;
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$SetFlairEnabledRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$SetFlairEnabledRequest.access$18300());
        }
    }
}
