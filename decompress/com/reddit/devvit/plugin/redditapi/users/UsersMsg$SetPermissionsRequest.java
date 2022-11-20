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

public final class UsersMsg$SetPermissionsRequest extends GeneratedMessageLite<UsersMsg$SetPermissionsRequest, a> implements d1
{
    private static final UsersMsg$SetPermissionsRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile n1<UsersMsg$SetPermissionsRequest> PARSER;
    public static final int PERMISSIONS_FIELD_NUMBER = 3;
    public static final int SUBREDDIT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    private String name_;
    private String permissions_;
    private String subreddit_;
    private String type_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$SetPermissionsRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$SetPermissionsRequest()));
    }
    
    private UsersMsg$SetPermissionsRequest() {
        this.name_ = "";
        this.subreddit_ = "";
        this.permissions_ = "";
        this.type_ = "";
    }
    
    public static UsersMsg$SetPermissionsRequest access$5500() {
        return UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$5600(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final String name) {
        usersMsg$SetPermissionsRequest.setName(name);
    }
    
    public static void access$5700(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest) {
        usersMsg$SetPermissionsRequest.clearName();
    }
    
    public static void access$5800(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final ByteString nameBytes) {
        usersMsg$SetPermissionsRequest.setNameBytes(nameBytes);
    }
    
    public static void access$5900(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final String subreddit) {
        usersMsg$SetPermissionsRequest.setSubreddit(subreddit);
    }
    
    public static void access$6000(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest) {
        usersMsg$SetPermissionsRequest.clearSubreddit();
    }
    
    public static void access$6100(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final ByteString subredditBytes) {
        usersMsg$SetPermissionsRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$6200(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final String permissions) {
        usersMsg$SetPermissionsRequest.setPermissions(permissions);
    }
    
    public static void access$6300(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest) {
        usersMsg$SetPermissionsRequest.clearPermissions();
    }
    
    public static void access$6400(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final ByteString permissionsBytes) {
        usersMsg$SetPermissionsRequest.setPermissionsBytes(permissionsBytes);
    }
    
    public static void access$6500(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final String type) {
        usersMsg$SetPermissionsRequest.setType(type);
    }
    
    public static void access$6600(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest) {
        usersMsg$SetPermissionsRequest.clearType();
    }
    
    public static void access$6700(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest, final ByteString typeBytes) {
        usersMsg$SetPermissionsRequest.setTypeBytes(typeBytes);
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearPermissions() {
        this.permissions_ = getDefaultInstance().getPermissions();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearType() {
        this.type_ = getDefaultInstance().getType();
    }
    
    public static UsersMsg$SetPermissionsRequest getDefaultInstance() {
        return UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$SetPermissionsRequest usersMsg$SetPermissionsRequest) {
        return (a)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$SetPermissionsRequest);
    }
    
    public static UsersMsg$SetPermissionsRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$SetPermissionsRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$SetPermissionsRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$SetPermissionsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$SetPermissionsRequest> parser() {
        return (n1<UsersMsg$SetPermissionsRequest>)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }
    
    private void setPermissions(final String permissions_) {
        permissions_.getClass();
        this.permissions_ = permissions_;
    }
    
    private void setPermissionsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.permissions_ = byteString.toStringUtf8();
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
                final n1<UsersMsg$SetPermissionsRequest> parser;
                if ((parser = UsersMsg$SetPermissionsRequest.PARSER) == null) {
                    synchronized (UsersMsg$SetPermissionsRequest.class) {
                        if (UsersMsg$SetPermissionsRequest.PARSER == null) {
                            UsersMsg$SetPermissionsRequest.PARSER = (n1<UsersMsg$SetPermissionsRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$SetPermissionsRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[] { "name_", "subreddit_", "permissions_", "type_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$SetPermissionsRequest();
            }
        }
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public String getPermissions() {
        return this.permissions_;
    }
    
    public ByteString getPermissionsBytes() {
        return ByteString.copyFromUtf8(this.permissions_);
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
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$SetPermissionsRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$SetPermissionsRequest.access$5500());
        }
    }
}
