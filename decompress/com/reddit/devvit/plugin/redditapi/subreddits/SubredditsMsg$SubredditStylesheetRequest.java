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

public final class SubredditsMsg$SubredditStylesheetRequest extends GeneratedMessageLite<SubredditsMsg$SubredditStylesheetRequest, a> implements d1
{
    private static final SubredditsMsg$SubredditStylesheetRequest DEFAULT_INSTANCE;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile n1<SubredditsMsg$SubredditStylesheetRequest> PARSER;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int STYLESHEET_CONTENTS_FIELD_NUMBER = 3;
    public static final int SUBREDDIT_FIELD_NUMBER = 4;
    private String op_;
    private String reason_;
    private String stylesheetContents_;
    private String subreddit_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditStylesheetRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditStylesheetRequest()));
    }
    
    private SubredditsMsg$SubredditStylesheetRequest() {
        this.op_ = "";
        this.reason_ = "";
        this.stylesheetContents_ = "";
        this.subreddit_ = "";
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest access$22700() {
        return SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$22800(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final String op) {
        subredditsMsg$SubredditStylesheetRequest.setOp(op);
    }
    
    public static void access$22900(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest) {
        subredditsMsg$SubredditStylesheetRequest.clearOp();
    }
    
    public static void access$23000(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final ByteString opBytes) {
        subredditsMsg$SubredditStylesheetRequest.setOpBytes(opBytes);
    }
    
    public static void access$23100(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final String reason) {
        subredditsMsg$SubredditStylesheetRequest.setReason(reason);
    }
    
    public static void access$23200(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest) {
        subredditsMsg$SubredditStylesheetRequest.clearReason();
    }
    
    public static void access$23300(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final ByteString reasonBytes) {
        subredditsMsg$SubredditStylesheetRequest.setReasonBytes(reasonBytes);
    }
    
    public static void access$23400(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final String stylesheetContents) {
        subredditsMsg$SubredditStylesheetRequest.setStylesheetContents(stylesheetContents);
    }
    
    public static void access$23500(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest) {
        subredditsMsg$SubredditStylesheetRequest.clearStylesheetContents();
    }
    
    public static void access$23600(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final ByteString stylesheetContentsBytes) {
        subredditsMsg$SubredditStylesheetRequest.setStylesheetContentsBytes(stylesheetContentsBytes);
    }
    
    public static void access$23700(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final String subreddit) {
        subredditsMsg$SubredditStylesheetRequest.setSubreddit(subreddit);
    }
    
    public static void access$23800(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest) {
        subredditsMsg$SubredditStylesheetRequest.clearSubreddit();
    }
    
    public static void access$23900(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest, final ByteString subredditBytes) {
        subredditsMsg$SubredditStylesheetRequest.setSubredditBytes(subredditBytes);
    }
    
    private void clearOp() {
        this.op_ = getDefaultInstance().getOp();
    }
    
    private void clearReason() {
        this.reason_ = getDefaultInstance().getReason();
    }
    
    private void clearStylesheetContents() {
        this.stylesheetContents_ = getDefaultInstance().getStylesheetContents();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest getDefaultInstance() {
        return SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditStylesheetRequest subredditsMsg$SubredditStylesheetRequest) {
        return (a)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditStylesheetRequest);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditStylesheetRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditStylesheetRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditStylesheetRequest> parser() {
        return (n1<SubredditsMsg$SubredditStylesheetRequest>)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setOp(final String op_) {
        op_.getClass();
        this.op_ = op_;
    }
    
    private void setOpBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.op_ = byteString.toStringUtf8();
    }
    
    private void setReason(final String reason_) {
        reason_.getClass();
        this.reason_ = reason_;
    }
    
    private void setReasonBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.reason_ = byteString.toStringUtf8();
    }
    
    private void setStylesheetContents(final String stylesheetContents_) {
        stylesheetContents_.getClass();
        this.stylesheetContents_ = stylesheetContents_;
    }
    
    private void setStylesheetContentsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.stylesheetContents_ = byteString.toStringUtf8();
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
                final n1<SubredditsMsg$SubredditStylesheetRequest> parser;
                if ((parser = SubredditsMsg$SubredditStylesheetRequest.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditStylesheetRequest.class) {
                        if (SubredditsMsg$SubredditStylesheetRequest.PARSER == null) {
                            SubredditsMsg$SubredditStylesheetRequest.PARSER = (n1<SubredditsMsg$SubredditStylesheetRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditStylesheetRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[] { "op_", "reason_", "stylesheetContents_", "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditStylesheetRequest();
            }
        }
    }
    
    public String getOp() {
        return this.op_;
    }
    
    public ByteString getOpBytes() {
        return ByteString.copyFromUtf8(this.op_);
    }
    
    public String getReason() {
        return this.reason_;
    }
    
    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.reason_);
    }
    
    public String getStylesheetContents() {
        return this.stylesheetContents_;
    }
    
    public ByteString getStylesheetContentsBytes() {
        return ByteString.copyFromUtf8(this.stylesheetContents_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditStylesheetRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditStylesheetRequest.access$22700());
        }
    }
}
