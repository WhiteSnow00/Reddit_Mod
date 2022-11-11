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

public final class UsersMsg$UsernameAvailableRequest extends GeneratedMessageLite<UsersMsg$UsernameAvailableRequest, a> implements d1
{
    private static final UsersMsg$UsernameAvailableRequest DEFAULT_INSTANCE;
    private static volatile n1<UsersMsg$UsernameAvailableRequest> PARSER;
    public static final int USER_FIELD_NUMBER = 1;
    private String user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UsernameAvailableRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UsernameAvailableRequest()));
    }
    
    private UsersMsg$UsernameAvailableRequest() {
        this.user_ = "";
    }
    
    public static /* synthetic */ UsersMsg$UsernameAvailableRequest access$8800() {
        return UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE;
    }
    
    private void clearUser() {
        this.user_ = getDefaultInstance().getUser();
    }
    
    public static UsersMsg$UsernameAvailableRequest getDefaultInstance() {
        return UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UsernameAvailableRequest usersMsg$UsernameAvailableRequest) {
        return (a)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UsernameAvailableRequest);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UsernameAvailableRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UsernameAvailableRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UsernameAvailableRequest> parser() {
        return (n1<UsersMsg$UsernameAvailableRequest>)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE.getParserForType();
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
                final n1<UsersMsg$UsernameAvailableRequest> parser;
                if ((parser = UsersMsg$UsernameAvailableRequest.PARSER) == null) {
                    synchronized (UsersMsg$UsernameAvailableRequest.class) {
                        if (UsersMsg$UsernameAvailableRequest.PARSER == null) {
                            UsersMsg$UsernameAvailableRequest.PARSER = (n1<UsersMsg$UsernameAvailableRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UsernameAvailableRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "user_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UsernameAvailableRequest();
            }
        }
    }
    
    public String getUser() {
        return this.user_;
    }
    
    public ByteString getUserBytes() {
        return ByteString.copyFromUtf8(this.user_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UsernameAvailableRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UsernameAvailableRequest.access$8800());
        }
    }
}
