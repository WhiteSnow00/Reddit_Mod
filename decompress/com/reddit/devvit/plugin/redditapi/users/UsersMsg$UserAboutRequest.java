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

public final class UsersMsg$UserAboutRequest extends GeneratedMessageLite<UsersMsg$UserAboutRequest, a> implements d1
{
    private static final UsersMsg$UserAboutRequest DEFAULT_INSTANCE;
    private static volatile n1<UsersMsg$UserAboutRequest> PARSER;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UserAboutRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UserAboutRequest()));
    }
    
    private UsersMsg$UserAboutRequest() {
        this.username_ = "";
    }
    
    public static UsersMsg$UserAboutRequest access$10100() {
        return UsersMsg$UserAboutRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$10200(final UsersMsg$UserAboutRequest usersMsg$UserAboutRequest, final String username) {
        usersMsg$UserAboutRequest.setUsername(username);
    }
    
    public static void access$10300(final UsersMsg$UserAboutRequest usersMsg$UserAboutRequest) {
        usersMsg$UserAboutRequest.clearUsername();
    }
    
    public static void access$10400(final UsersMsg$UserAboutRequest usersMsg$UserAboutRequest, final ByteString usernameBytes) {
        usersMsg$UserAboutRequest.setUsernameBytes(usernameBytes);
    }
    
    private void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }
    
    public static UsersMsg$UserAboutRequest getDefaultInstance() {
        return UsersMsg$UserAboutRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UserAboutRequest usersMsg$UserAboutRequest) {
        return (a)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UserAboutRequest);
    }
    
    public static UsersMsg$UserAboutRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserAboutRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UserAboutRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UserAboutRequest> parser() {
        return (n1<UsersMsg$UserAboutRequest>)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setUsername(final String username_) {
        username_.getClass();
        this.username_ = username_;
    }
    
    private void setUsernameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.username_ = byteString.toStringUtf8();
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
                final n1<UsersMsg$UserAboutRequest> parser;
                if ((parser = UsersMsg$UserAboutRequest.PARSER) == null) {
                    synchronized (UsersMsg$UserAboutRequest.class) {
                        if (UsersMsg$UserAboutRequest.PARSER == null) {
                            UsersMsg$UserAboutRequest.PARSER = (n1<UsersMsg$UserAboutRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UserAboutRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UserAboutRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "username_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UserAboutRequest();
            }
        }
    }
    
    public String getUsername() {
        return this.username_;
    }
    
    public ByteString getUsernameBytes() {
        return ByteString.copyFromUtf8(this.username_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UserAboutRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UserAboutRequest.access$10100());
        }
    }
}
