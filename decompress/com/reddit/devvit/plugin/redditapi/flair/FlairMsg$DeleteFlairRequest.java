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

public final class FlairMsg$DeleteFlairRequest extends GeneratedMessageLite<FlairMsg$DeleteFlairRequest, a> implements d1
{
    private static final FlairMsg$DeleteFlairRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile n1<FlairMsg$DeleteFlairRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String name_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$DeleteFlairRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$DeleteFlairRequest()));
    }
    
    private FlairMsg$DeleteFlairRequest() {
        this.subreddit_ = "";
        this.name_ = "";
    }
    
    public static /* synthetic */ FlairMsg$DeleteFlairRequest access$800() {
        return FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE;
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$DeleteFlairRequest getDefaultInstance() {
        return FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$DeleteFlairRequest flairMsg$DeleteFlairRequest) {
        return (a)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$DeleteFlairRequest);
    }
    
    public static FlairMsg$DeleteFlairRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$DeleteFlairRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$DeleteFlairRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$DeleteFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$DeleteFlairRequest> parser() {
        return (n1<FlairMsg$DeleteFlairRequest>)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
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
                final n1<FlairMsg$DeleteFlairRequest> parser;
                if ((parser = FlairMsg$DeleteFlairRequest.PARSER) == null) {
                    synchronized (FlairMsg$DeleteFlairRequest.class) {
                        if (FlairMsg$DeleteFlairRequest.PARSER == null) {
                            FlairMsg$DeleteFlairRequest.PARSER = (n1<FlairMsg$DeleteFlairRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$DeleteFlairRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "subreddit_", "name_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$DeleteFlairRequest();
            }
        }
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$DeleteFlairRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$DeleteFlairRequest.access$800());
        }
    }
}
