// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

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

public final class SubredditsMsg$SubredditAboutEditRequest extends GeneratedMessageLite<SubredditsMsg$SubredditAboutEditRequest, a> implements d1
{
    public static final int CREATED_FIELD_NUMBER = 1;
    private static final SubredditsMsg$SubredditAboutEditRequest DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 2;
    private static volatile n1<SubredditsMsg$SubredditAboutEditRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 3;
    private String created_;
    private String location_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditAboutEditRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditAboutEditRequest()));
    }
    
    private SubredditsMsg$SubredditAboutEditRequest() {
        this.created_ = "";
        this.location_ = "";
        this.subreddit_ = "";
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest access$27600() {
        return SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$27700(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest, final String created) {
        subredditsMsg$SubredditAboutEditRequest.setCreated(created);
    }
    
    public static void access$27800(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest) {
        subredditsMsg$SubredditAboutEditRequest.clearCreated();
    }
    
    public static void access$27900(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest, final ByteString createdBytes) {
        subredditsMsg$SubredditAboutEditRequest.setCreatedBytes(createdBytes);
    }
    
    public static void access$28000(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest, final String location) {
        subredditsMsg$SubredditAboutEditRequest.setLocation(location);
    }
    
    public static void access$28100(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest) {
        subredditsMsg$SubredditAboutEditRequest.clearLocation();
    }
    
    public static void access$28200(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest, final ByteString locationBytes) {
        subredditsMsg$SubredditAboutEditRequest.setLocationBytes(locationBytes);
    }
    
    public static void access$28300(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest, final String subreddit) {
        subredditsMsg$SubredditAboutEditRequest.setSubreddit(subreddit);
    }
    
    public static void access$28400(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest) {
        subredditsMsg$SubredditAboutEditRequest.clearSubreddit();
    }
    
    public static void access$28500(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest, final ByteString subredditBytes) {
        subredditsMsg$SubredditAboutEditRequest.setSubredditBytes(subredditBytes);
    }
    
    private void clearCreated() {
        this.created_ = getDefaultInstance().getCreated();
    }
    
    private void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest getDefaultInstance() {
        return SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditAboutEditRequest subredditsMsg$SubredditAboutEditRequest) {
        return (a)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditAboutEditRequest);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditAboutEditRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditAboutEditRequest> parser() {
        return (n1<SubredditsMsg$SubredditAboutEditRequest>)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setCreated(final String created_) {
        created_.getClass();
        this.created_ = created_;
    }
    
    private void setCreatedBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.created_ = byteString.toStringUtf8();
    }
    
    private void setLocation(final String location_) {
        location_.getClass();
        this.location_ = location_;
    }
    
    private void setLocationBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.location_ = byteString.toStringUtf8();
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
        switch (h90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<SubredditsMsg$SubredditAboutEditRequest> parser;
                if ((parser = SubredditsMsg$SubredditAboutEditRequest.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditAboutEditRequest.class) {
                        if (SubredditsMsg$SubredditAboutEditRequest.PARSER == null) {
                            SubredditsMsg$SubredditAboutEditRequest.PARSER = (n1<SubredditsMsg$SubredditAboutEditRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditAboutEditRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[] { "created_", "location_", "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditAboutEditRequest();
            }
        }
    }
    
    public String getCreated() {
        return this.created_;
    }
    
    public ByteString getCreatedBytes() {
        return ByteString.copyFromUtf8(this.created_);
    }
    
    public String getLocation() {
        return this.location_;
    }
    
    public ByteString getLocationBytes() {
        return ByteString.copyFromUtf8(this.location_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditAboutEditRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditRequest.access$27600());
        }
    }
}
