// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.moderation;

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

public final class ModerationMsg$AcceptModeratorInviteRequest extends GeneratedMessageLite<ModerationMsg$AcceptModeratorInviteRequest, a> implements d1
{
    private static final ModerationMsg$AcceptModeratorInviteRequest DEFAULT_INSTANCE;
    private static volatile n1<ModerationMsg$AcceptModeratorInviteRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$AcceptModeratorInviteRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$AcceptModeratorInviteRequest()));
    }
    
    private ModerationMsg$AcceptModeratorInviteRequest() {
        this.subreddit_ = "";
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest access$4600() {
        return ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$4700(final ModerationMsg$AcceptModeratorInviteRequest moderationMsg$AcceptModeratorInviteRequest, final String subreddit) {
        moderationMsg$AcceptModeratorInviteRequest.setSubreddit(subreddit);
    }
    
    public static void access$4800(final ModerationMsg$AcceptModeratorInviteRequest moderationMsg$AcceptModeratorInviteRequest) {
        moderationMsg$AcceptModeratorInviteRequest.clearSubreddit();
    }
    
    public static void access$4900(final ModerationMsg$AcceptModeratorInviteRequest moderationMsg$AcceptModeratorInviteRequest, final ByteString subredditBytes) {
        moderationMsg$AcceptModeratorInviteRequest.setSubredditBytes(subredditBytes);
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest getDefaultInstance() {
        return ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$AcceptModeratorInviteRequest moderationMsg$AcceptModeratorInviteRequest) {
        return (a)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$AcceptModeratorInviteRequest);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$AcceptModeratorInviteRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AcceptModeratorInviteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$AcceptModeratorInviteRequest> parser() {
        return (n1<ModerationMsg$AcceptModeratorInviteRequest>)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE.getParserForType();
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
        switch (d90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ModerationMsg$AcceptModeratorInviteRequest> parser;
                if ((parser = ModerationMsg$AcceptModeratorInviteRequest.PARSER) == null) {
                    synchronized (ModerationMsg$AcceptModeratorInviteRequest.class) {
                        if (ModerationMsg$AcceptModeratorInviteRequest.PARSER == null) {
                            ModerationMsg$AcceptModeratorInviteRequest.PARSER = (n1<ModerationMsg$AcceptModeratorInviteRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$AcceptModeratorInviteRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$AcceptModeratorInviteRequest();
            }
        }
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$AcceptModeratorInviteRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$AcceptModeratorInviteRequest.access$4600());
        }
    }
}
