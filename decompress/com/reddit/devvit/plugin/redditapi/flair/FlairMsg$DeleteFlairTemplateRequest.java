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

public final class FlairMsg$DeleteFlairTemplateRequest extends GeneratedMessageLite<FlairMsg$DeleteFlairTemplateRequest, a> implements d1
{
    private static final FlairMsg$DeleteFlairTemplateRequest DEFAULT_INSTANCE;
    public static final int FLAIR_TEMPLATE_ID_FIELD_NUMBER = 2;
    private static volatile n1<FlairMsg$DeleteFlairTemplateRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String flairTemplateId_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$DeleteFlairTemplateRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$DeleteFlairTemplateRequest()));
    }
    
    private FlairMsg$DeleteFlairTemplateRequest() {
        this.subreddit_ = "";
        this.flairTemplateId_ = "";
    }
    
    public static /* synthetic */ FlairMsg$DeleteFlairTemplateRequest access$1600() {
        return FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE;
    }
    
    private void clearFlairTemplateId() {
        this.flairTemplateId_ = getDefaultInstance().getFlairTemplateId();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest getDefaultInstance() {
        return FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$DeleteFlairTemplateRequest flairMsg$DeleteFlairTemplateRequest) {
        return (a)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$DeleteFlairTemplateRequest);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$DeleteFlairTemplateRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$DeleteFlairTemplateRequest> parser() {
        return (n1<FlairMsg$DeleteFlairTemplateRequest>)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairTemplateId(final String flairTemplateId_) {
        flairTemplateId_.getClass();
        this.flairTemplateId_ = flairTemplateId_;
    }
    
    private void setFlairTemplateIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairTemplateId_ = byteString.toStringUtf8();
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
                final n1<FlairMsg$DeleteFlairTemplateRequest> parser;
                if ((parser = FlairMsg$DeleteFlairTemplateRequest.PARSER) == null) {
                    synchronized (FlairMsg$DeleteFlairTemplateRequest.class) {
                        if (FlairMsg$DeleteFlairTemplateRequest.PARSER == null) {
                            FlairMsg$DeleteFlairTemplateRequest.PARSER = (n1<FlairMsg$DeleteFlairTemplateRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$DeleteFlairTemplateRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "subreddit_", "flairTemplateId_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$DeleteFlairTemplateRequest();
            }
        }
    }
    
    public String getFlairTemplateId() {
        return this.flairTemplateId_;
    }
    
    public ByteString getFlairTemplateIdBytes() {
        return ByteString.copyFromUtf8(this.flairTemplateId_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$DeleteFlairTemplateRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$DeleteFlairTemplateRequest.access$1600());
        }
    }
}
