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

public final class UsersMsg$UserDataByAccountIdsRequest extends GeneratedMessageLite<UsersMsg$UserDataByAccountIdsRequest, a> implements d1
{
    private static final UsersMsg$UserDataByAccountIdsRequest DEFAULT_INSTANCE;
    public static final int IDS_FIELD_NUMBER = 1;
    private static volatile n1<UsersMsg$UserDataByAccountIdsRequest> PARSER;
    private String ids_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UserDataByAccountIdsRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UserDataByAccountIdsRequest()));
    }
    
    private UsersMsg$UserDataByAccountIdsRequest() {
        this.ids_ = "";
    }
    
    public static /* synthetic */ UsersMsg$UserDataByAccountIdsRequest access$8300() {
        return UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE;
    }
    
    private void clearIds() {
        this.ids_ = getDefaultInstance().getIds();
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest getDefaultInstance() {
        return UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UserDataByAccountIdsRequest usersMsg$UserDataByAccountIdsRequest) {
        return (a)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UserDataByAccountIdsRequest);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UserDataByAccountIdsRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UserDataByAccountIdsRequest> parser() {
        return (n1<UsersMsg$UserDataByAccountIdsRequest>)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setIds(final String ids_) {
        ids_.getClass();
        this.ids_ = ids_;
    }
    
    private void setIdsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ids_ = byteString.toStringUtf8();
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
                final n1<UsersMsg$UserDataByAccountIdsRequest> parser;
                if ((parser = UsersMsg$UserDataByAccountIdsRequest.PARSER) == null) {
                    synchronized (UsersMsg$UserDataByAccountIdsRequest.class) {
                        if (UsersMsg$UserDataByAccountIdsRequest.PARSER == null) {
                            UsersMsg$UserDataByAccountIdsRequest.PARSER = (n1<UsersMsg$UserDataByAccountIdsRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UserDataByAccountIdsRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "ids_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UserDataByAccountIdsRequest();
            }
        }
    }
    
    public String getIds() {
        return this.ids_;
    }
    
    public ByteString getIdsBytes() {
        return ByteString.copyFromUtf8(this.ids_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UserDataByAccountIdsRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsRequest.access$8300());
        }
    }
}
