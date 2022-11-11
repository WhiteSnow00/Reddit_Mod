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

public final class FlairMsg$FlairConfigRequest extends GeneratedMessageLite<FlairMsg$FlairConfigRequest, a> implements d1
{
    private static final FlairMsg$FlairConfigRequest DEFAULT_INSTANCE;
    public static final int FLAIR_ENABLED_FIELD_NUMBER = 2;
    public static final int FLAIR_POSITION_FIELD_NUMBER = 3;
    public static final int FLAIR_SELF_ASSIGN_ENABLED_FIELD_NUMBER = 4;
    public static final int LINK_FLAIR_POSITION_FIELD_NUMBER = 5;
    public static final int LINK_FLAIR_SELF_ASSIGN_ENABLED_FIELD_NUMBER = 6;
    private static volatile n1<FlairMsg$FlairConfigRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private boolean flairEnabled_;
    private String flairPosition_;
    private boolean flairSelfAssignEnabled_;
    private String linkFlairPosition_;
    private boolean linkFlairSelfAssignEnabled_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairConfigRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairConfigRequest()));
    }
    
    private FlairMsg$FlairConfigRequest() {
        this.subreddit_ = "";
        this.flairPosition_ = "";
        this.linkFlairPosition_ = "";
    }
    
    public static /* synthetic */ FlairMsg$FlairConfigRequest access$5400() {
        return FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE;
    }
    
    private void clearFlairEnabled() {
        this.flairEnabled_ = false;
    }
    
    private void clearFlairPosition() {
        this.flairPosition_ = getDefaultInstance().getFlairPosition();
    }
    
    private void clearFlairSelfAssignEnabled() {
        this.flairSelfAssignEnabled_ = false;
    }
    
    private void clearLinkFlairPosition() {
        this.linkFlairPosition_ = getDefaultInstance().getLinkFlairPosition();
    }
    
    private void clearLinkFlairSelfAssignEnabled() {
        this.linkFlairSelfAssignEnabled_ = false;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static FlairMsg$FlairConfigRequest getDefaultInstance() {
        return FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairConfigRequest flairMsg$FlairConfigRequest) {
        return (a)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairConfigRequest);
    }
    
    public static FlairMsg$FlairConfigRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairConfigRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairConfigRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairConfigRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairConfigRequest> parser() {
        return (n1<FlairMsg$FlairConfigRequest>)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairEnabled(final boolean flairEnabled_) {
        this.flairEnabled_ = flairEnabled_;
    }
    
    private void setFlairPosition(final String flairPosition_) {
        flairPosition_.getClass();
        this.flairPosition_ = flairPosition_;
    }
    
    private void setFlairPositionBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairPosition_ = byteString.toStringUtf8();
    }
    
    private void setFlairSelfAssignEnabled(final boolean flairSelfAssignEnabled_) {
        this.flairSelfAssignEnabled_ = flairSelfAssignEnabled_;
    }
    
    private void setLinkFlairPosition(final String linkFlairPosition_) {
        linkFlairPosition_.getClass();
        this.linkFlairPosition_ = linkFlairPosition_;
    }
    
    private void setLinkFlairPositionBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.linkFlairPosition_ = byteString.toStringUtf8();
    }
    
    private void setLinkFlairSelfAssignEnabled(final boolean linkFlairSelfAssignEnabled_) {
        this.linkFlairSelfAssignEnabled_ = linkFlairSelfAssignEnabled_;
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
                final n1<FlairMsg$FlairConfigRequest> parser;
                if ((parser = FlairMsg$FlairConfigRequest.PARSER) == null) {
                    synchronized (FlairMsg$FlairConfigRequest.class) {
                        if (FlairMsg$FlairConfigRequest.PARSER == null) {
                            FlairMsg$FlairConfigRequest.PARSER = (n1<FlairMsg$FlairConfigRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairConfigRequest.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0007\u0003\u0208\u0004\u0007\u0005\u0208\u0006\u0007", new Object[] { "subreddit_", "flairEnabled_", "flairPosition_", "flairSelfAssignEnabled_", "linkFlairPosition_", "linkFlairSelfAssignEnabled_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairConfigRequest();
            }
        }
    }
    
    public boolean getFlairEnabled() {
        return this.flairEnabled_;
    }
    
    public String getFlairPosition() {
        return this.flairPosition_;
    }
    
    public ByteString getFlairPositionBytes() {
        return ByteString.copyFromUtf8(this.flairPosition_);
    }
    
    public boolean getFlairSelfAssignEnabled() {
        return this.flairSelfAssignEnabled_;
    }
    
    public String getLinkFlairPosition() {
        return this.linkFlairPosition_;
    }
    
    public ByteString getLinkFlairPositionBytes() {
        return ByteString.copyFromUtf8(this.linkFlairPosition_);
    }
    
    public boolean getLinkFlairSelfAssignEnabled() {
        return this.linkFlairSelfAssignEnabled_;
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairConfigRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairConfigRequest.access$5400());
        }
    }
}
