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

public final class ModerationMsg$StylesheetRequest extends GeneratedMessageLite<ModerationMsg$StylesheetRequest, a> implements d1
{
    private static final ModerationMsg$StylesheetRequest DEFAULT_INSTANCE;
    private static volatile n1<ModerationMsg$StylesheetRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$StylesheetRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$StylesheetRequest()));
    }
    
    private ModerationMsg$StylesheetRequest() {
        this.subreddit_ = "";
    }
    
    public static ModerationMsg$StylesheetRequest access$8800() {
        return ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$8900(final ModerationMsg$StylesheetRequest moderationMsg$StylesheetRequest, final String subreddit) {
        moderationMsg$StylesheetRequest.setSubreddit(subreddit);
    }
    
    public static void access$9000(final ModerationMsg$StylesheetRequest moderationMsg$StylesheetRequest) {
        moderationMsg$StylesheetRequest.clearSubreddit();
    }
    
    public static void access$9100(final ModerationMsg$StylesheetRequest moderationMsg$StylesheetRequest, final ByteString subredditBytes) {
        moderationMsg$StylesheetRequest.setSubredditBytes(subredditBytes);
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static ModerationMsg$StylesheetRequest getDefaultInstance() {
        return ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$StylesheetRequest moderationMsg$StylesheetRequest) {
        return (a)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$StylesheetRequest);
    }
    
    public static ModerationMsg$StylesheetRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$StylesheetRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final l l) throws IOException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$StylesheetRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$StylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$StylesheetRequest> parser() {
        return (n1<ModerationMsg$StylesheetRequest>)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE.getParserForType();
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
                final n1<ModerationMsg$StylesheetRequest> parser;
                if ((parser = ModerationMsg$StylesheetRequest.PARSER) == null) {
                    synchronized (ModerationMsg$StylesheetRequest.class) {
                        if (ModerationMsg$StylesheetRequest.PARSER == null) {
                            ModerationMsg$StylesheetRequest.PARSER = (n1<ModerationMsg$StylesheetRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$StylesheetRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$StylesheetRequest();
            }
        }
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$StylesheetRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$StylesheetRequest.access$8800());
        }
    }
}
