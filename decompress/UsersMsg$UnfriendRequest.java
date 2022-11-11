// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.users;

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

public final class UsersMsg$UnfriendRequest extends GeneratedMessageLite<UsersMsg$UnfriendRequest, a> implements d1
{
    private static final UsersMsg$UnfriendRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile n1<UsersMsg$UnfriendRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 3;
    private String id_;
    private String name_;
    private String subreddit_;
    private String type_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UnfriendRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UnfriendRequest()));
    }
    
    private UsersMsg$UnfriendRequest() {
        this.id_ = "";
        this.name_ = "";
        this.type_ = "";
        this.subreddit_ = "";
    }
    
    public static /* synthetic */ UsersMsg$UnfriendRequest access$6900() {
        return UsersMsg$UnfriendRequest.DEFAULT_INSTANCE;
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearType() {
        this.type_ = getDefaultInstance().getType();
    }
    
    public static UsersMsg$UnfriendRequest getDefaultInstance() {
        return UsersMsg$UnfriendRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UnfriendRequest usersMsg$UnfriendRequest) {
        return (a)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UnfriendRequest);
    }
    
    public static UsersMsg$UnfriendRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UnfriendRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UnfriendRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UnfriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UnfriendRequest> parser() {
        return (n1<UsersMsg$UnfriendRequest>)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
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
    
    private void setType(final String type_) {
        type_.getClass();
        this.type_ = type_;
    }
    
    private void setTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (i90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<UsersMsg$UnfriendRequest> parser;
                if ((parser = UsersMsg$UnfriendRequest.PARSER) == null) {
                    synchronized (UsersMsg$UnfriendRequest.class) {
                        if (UsersMsg$UnfriendRequest.PARSER == null) {
                            UsersMsg$UnfriendRequest.PARSER = (n1<UsersMsg$UnfriendRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UnfriendRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UnfriendRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[] { "id_", "name_", "type_", "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UnfriendRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
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
    
    public String getType() {
        return this.type_;
    }
    
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UnfriendRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UnfriendRequest.access$6900());
        }
    }
}
