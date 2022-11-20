// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.modnotes;

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

public final class ModnotesMsg$GetNotesRequest extends GeneratedMessageLite<ModnotesMsg$GetNotesRequest, a> implements d1
{
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final ModnotesMsg$GetNotesRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 3;
    public static final int LIMIT_FIELD_NUMBER = 4;
    private static volatile n1<ModnotesMsg$GetNotesRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int USER_FIELD_NUMBER = 5;
    private String before_;
    private String filter_;
    private long limit_;
    private String subreddit_;
    private String user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$GetNotesRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$GetNotesRequest()));
    }
    
    private ModnotesMsg$GetNotesRequest() {
        this.subreddit_ = "";
        this.before_ = "";
        this.filter_ = "";
        this.user_ = "";
    }
    
    public static ModnotesMsg$GetNotesRequest access$1100() {
        return ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$1200(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final String subreddit) {
        modnotesMsg$GetNotesRequest.setSubreddit(subreddit);
    }
    
    public static void access$1300(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest) {
        modnotesMsg$GetNotesRequest.clearSubreddit();
    }
    
    public static void access$1400(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final ByteString subredditBytes) {
        modnotesMsg$GetNotesRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$1500(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final String before) {
        modnotesMsg$GetNotesRequest.setBefore(before);
    }
    
    public static void access$1600(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest) {
        modnotesMsg$GetNotesRequest.clearBefore();
    }
    
    public static void access$1700(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final ByteString beforeBytes) {
        modnotesMsg$GetNotesRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$1800(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final String filter) {
        modnotesMsg$GetNotesRequest.setFilter(filter);
    }
    
    public static void access$1900(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest) {
        modnotesMsg$GetNotesRequest.clearFilter();
    }
    
    public static void access$2000(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final ByteString filterBytes) {
        modnotesMsg$GetNotesRequest.setFilterBytes(filterBytes);
    }
    
    public static void access$2100(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final long limit) {
        modnotesMsg$GetNotesRequest.setLimit(limit);
    }
    
    public static void access$2200(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest) {
        modnotesMsg$GetNotesRequest.clearLimit();
    }
    
    public static void access$2300(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final String user) {
        modnotesMsg$GetNotesRequest.setUser(user);
    }
    
    public static void access$2400(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest) {
        modnotesMsg$GetNotesRequest.clearUser();
    }
    
    public static void access$2500(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest, final ByteString userBytes) {
        modnotesMsg$GetNotesRequest.setUserBytes(userBytes);
    }
    
    private void clearBefore() {
        this.before_ = getDefaultInstance().getBefore();
    }
    
    private void clearFilter() {
        this.filter_ = getDefaultInstance().getFilter();
    }
    
    private void clearLimit() {
        this.limit_ = 0L;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearUser() {
        this.user_ = getDefaultInstance().getUser();
    }
    
    public static ModnotesMsg$GetNotesRequest getDefaultInstance() {
        return ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$GetNotesRequest modnotesMsg$GetNotesRequest) {
        return (a)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$GetNotesRequest);
    }
    
    public static ModnotesMsg$GetNotesRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$GetNotesRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final l l) throws IOException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$GetNotesRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$GetNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$GetNotesRequest> parser() {
        return (n1<ModnotesMsg$GetNotesRequest>)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setBefore(final String before_) {
        before_.getClass();
        this.before_ = before_;
    }
    
    private void setBeforeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.before_ = byteString.toStringUtf8();
    }
    
    private void setFilter(final String filter_) {
        filter_.getClass();
        this.filter_ = filter_;
    }
    
    private void setFilterBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.filter_ = byteString.toStringUtf8();
    }
    
    private void setLimit(final long limit_) {
        this.limit_ = limit_;
    }
    
    private void setSubreddit(final String subreddit_) {
        subreddit_.getClass();
        this.subreddit_ = subreddit_;
    }
    
    private void setSubredditBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.subreddit_ = byteString.toStringUtf8();
    }
    
    private void setUser(final String user_) {
        user_.getClass();
        this.user_ = user_;
    }
    
    private void setUserBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.user_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (e90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ModnotesMsg$GetNotesRequest> parser;
                if ((parser = ModnotesMsg$GetNotesRequest.PARSER) == null) {
                    synchronized (ModnotesMsg$GetNotesRequest.class) {
                        if (ModnotesMsg$GetNotesRequest.PARSER == null) {
                            ModnotesMsg$GetNotesRequest.PARSER = (n1<ModnotesMsg$GetNotesRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$GetNotesRequest.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0208", new Object[] { "subreddit_", "before_", "filter_", "limit_", "user_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$GetNotesRequest();
            }
        }
    }
    
    public String getBefore() {
        return this.before_;
    }
    
    public ByteString getBeforeBytes() {
        return ByteString.copyFromUtf8(this.before_);
    }
    
    public String getFilter() {
        return this.filter_;
    }
    
    public ByteString getFilterBytes() {
        return ByteString.copyFromUtf8(this.filter_);
    }
    
    public long getLimit() {
        return this.limit_;
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public String getUser() {
        return this.user_;
    }
    
    public ByteString getUserBytes() {
        return ByteString.copyFromUtf8(this.user_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$GetNotesRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$GetNotesRequest.access$1100());
        }
    }
}
