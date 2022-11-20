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

public final class UsersMsg$GenericUsersRequest extends GeneratedMessageLite<UsersMsg$GenericUsersRequest, a> implements d1
{
    private static final UsersMsg$GenericUsersRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<UsersMsg$GenericUsersRequest> PARSER;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private String id_;
    private String username_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$GenericUsersRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$GenericUsersRequest()));
    }
    
    private UsersMsg$GenericUsersRequest() {
        this.id_ = "";
        this.username_ = "";
    }
    
    public static UsersMsg$GenericUsersRequest access$000() {
        return UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$100(final UsersMsg$GenericUsersRequest usersMsg$GenericUsersRequest, final String id) {
        usersMsg$GenericUsersRequest.setId(id);
    }
    
    public static void access$200(final UsersMsg$GenericUsersRequest usersMsg$GenericUsersRequest) {
        usersMsg$GenericUsersRequest.clearId();
    }
    
    public static void access$300(final UsersMsg$GenericUsersRequest usersMsg$GenericUsersRequest, final ByteString idBytes) {
        usersMsg$GenericUsersRequest.setIdBytes(idBytes);
    }
    
    public static void access$400(final UsersMsg$GenericUsersRequest usersMsg$GenericUsersRequest, final String username) {
        usersMsg$GenericUsersRequest.setUsername(username);
    }
    
    public static void access$500(final UsersMsg$GenericUsersRequest usersMsg$GenericUsersRequest) {
        usersMsg$GenericUsersRequest.clearUsername();
    }
    
    public static void access$600(final UsersMsg$GenericUsersRequest usersMsg$GenericUsersRequest, final ByteString usernameBytes) {
        usersMsg$GenericUsersRequest.setUsernameBytes(usernameBytes);
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }
    
    public static UsersMsg$GenericUsersRequest getDefaultInstance() {
        return UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$GenericUsersRequest usersMsg$GenericUsersRequest) {
        return (a)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$GenericUsersRequest);
    }
    
    public static UsersMsg$GenericUsersRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$GenericUsersRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$GenericUsersRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$GenericUsersRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$GenericUsersRequest> parser() {
        return (n1<UsersMsg$GenericUsersRequest>)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
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
                final n1<UsersMsg$GenericUsersRequest> parser;
                if ((parser = UsersMsg$GenericUsersRequest.PARSER) == null) {
                    synchronized (UsersMsg$GenericUsersRequest.class) {
                        if (UsersMsg$GenericUsersRequest.PARSER == null) {
                            UsersMsg$GenericUsersRequest.PARSER = (n1<UsersMsg$GenericUsersRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$GenericUsersRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "id_", "username_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$GenericUsersRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public String getUsername() {
        return this.username_;
    }
    
    public ByteString getUsernameBytes() {
        return ByteString.copyFromUtf8(this.username_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$GenericUsersRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$GenericUsersRequest.access$000());
        }
    }
}
