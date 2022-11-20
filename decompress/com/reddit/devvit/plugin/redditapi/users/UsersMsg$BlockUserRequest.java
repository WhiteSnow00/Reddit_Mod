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

public final class UsersMsg$BlockUserRequest extends GeneratedMessageLite<UsersMsg$BlockUserRequest, a> implements d1
{
    public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
    private static final UsersMsg$BlockUserRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile n1<UsersMsg$BlockUserRequest> PARSER;
    private String accountId_;
    private String name_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$BlockUserRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$BlockUserRequest()));
    }
    
    private UsersMsg$BlockUserRequest() {
        this.accountId_ = "";
        this.name_ = "";
    }
    
    public static void access$1000(final UsersMsg$BlockUserRequest usersMsg$BlockUserRequest) {
        usersMsg$BlockUserRequest.clearAccountId();
    }
    
    public static void access$1100(final UsersMsg$BlockUserRequest usersMsg$BlockUserRequest, final ByteString accountIdBytes) {
        usersMsg$BlockUserRequest.setAccountIdBytes(accountIdBytes);
    }
    
    public static void access$1200(final UsersMsg$BlockUserRequest usersMsg$BlockUserRequest, final String name) {
        usersMsg$BlockUserRequest.setName(name);
    }
    
    public static void access$1300(final UsersMsg$BlockUserRequest usersMsg$BlockUserRequest) {
        usersMsg$BlockUserRequest.clearName();
    }
    
    public static void access$1400(final UsersMsg$BlockUserRequest usersMsg$BlockUserRequest, final ByteString nameBytes) {
        usersMsg$BlockUserRequest.setNameBytes(nameBytes);
    }
    
    public static UsersMsg$BlockUserRequest access$800() {
        return UsersMsg$BlockUserRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$900(final UsersMsg$BlockUserRequest usersMsg$BlockUserRequest, final String accountId) {
        usersMsg$BlockUserRequest.setAccountId(accountId);
    }
    
    private void clearAccountId() {
        this.accountId_ = getDefaultInstance().getAccountId();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    public static UsersMsg$BlockUserRequest getDefaultInstance() {
        return UsersMsg$BlockUserRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$BlockUserRequest usersMsg$BlockUserRequest) {
        return (a)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$BlockUserRequest);
    }
    
    public static UsersMsg$BlockUserRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$BlockUserRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$BlockUserRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$BlockUserRequest> parser() {
        return (n1<UsersMsg$BlockUserRequest>)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAccountId(final String accountId_) {
        accountId_.getClass();
        this.accountId_ = accountId_;
    }
    
    private void setAccountIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.accountId_ = byteString.toStringUtf8();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
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
                final n1<UsersMsg$BlockUserRequest> parser;
                if ((parser = UsersMsg$BlockUserRequest.PARSER) == null) {
                    synchronized (UsersMsg$BlockUserRequest.class) {
                        if (UsersMsg$BlockUserRequest.PARSER == null) {
                            UsersMsg$BlockUserRequest.PARSER = (n1<UsersMsg$BlockUserRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$BlockUserRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$BlockUserRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "accountId_", "name_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$BlockUserRequest();
            }
        }
    }
    
    public String getAccountId() {
        return this.accountId_;
    }
    
    public ByteString getAccountIdBytes() {
        return ByteString.copyFromUtf8(this.accountId_);
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$BlockUserRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$BlockUserRequest.access$800());
        }
    }
}
