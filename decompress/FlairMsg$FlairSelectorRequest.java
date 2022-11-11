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

public final class FlairMsg$FlairSelectorRequest extends GeneratedMessageLite<FlairMsg$FlairSelectorRequest, a> implements d1
{
    private static final FlairMsg$FlairSelectorRequest DEFAULT_INSTANCE;
    public static final int IS_NEWLINK_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile n1<FlairMsg$FlairSelectorRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private boolean isNewlink_;
    private String link_;
    private String name_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairSelectorRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairSelectorRequest()));
    }
    
    private FlairMsg$FlairSelectorRequest() {
        this.subreddit_ = "";
        this.link_ = "";
        this.name_ = "";
    }
    
    public static /* synthetic */ FlairMsg$FlairSelectorRequest access$10200() {
        return FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE;
    }
    
    private void clearIsNewlink() {
        this.isNewlink_ = false;
    }
    
    private void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$FlairSelectorRequest getDefaultInstance() {
        return FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairSelectorRequest flairMsg$FlairSelectorRequest) {
        return (a)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairSelectorRequest);
    }
    
    public static FlairMsg$FlairSelectorRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairSelectorRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairSelectorRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairSelectorRequest> parser() {
        return (n1<FlairMsg$FlairSelectorRequest>)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setIsNewlink(final boolean isNewlink_) {
        this.isNewlink_ = isNewlink_;
    }
    
    private void setLink(final String link_) {
        link_.getClass();
        this.link_ = link_;
    }
    
    private void setLinkBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
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
                final n1<FlairMsg$FlairSelectorRequest> parser;
                if ((parser = FlairMsg$FlairSelectorRequest.PARSER) == null) {
                    synchronized (FlairMsg$FlairSelectorRequest.class) {
                        if (FlairMsg$FlairSelectorRequest.PARSER == null) {
                            FlairMsg$FlairSelectorRequest.PARSER = (n1<FlairMsg$FlairSelectorRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairSelectorRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0007\u0003\u0208\u0004\u0208", new Object[] { "subreddit_", "isNewlink_", "link_", "name_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairSelectorRequest();
            }
        }
    }
    
    public boolean getIsNewlink() {
        return this.isNewlink_;
    }
    
    public String getLink() {
        return this.link_;
    }
    
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
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
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairSelectorRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairSelectorRequest.access$10200());
        }
    }
}
