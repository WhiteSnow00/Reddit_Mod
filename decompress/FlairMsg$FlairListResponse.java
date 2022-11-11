// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
import a90.e;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairListResponse extends GeneratedMessageLite<FlairMsg$FlairListResponse, a> implements d1
{
    private static final FlairMsg$FlairListResponse DEFAULT_INSTANCE;
    private static volatile n1<FlairMsg$FlairListResponse> PARSER;
    public static final int USERS_FIELD_NUMBER = 1;
    private Internal$j<FlairMsg$UserFlair> users_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairListResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairListResponse()));
    }
    
    private FlairMsg$FlairListResponse() {
        this.users_ = (Internal$j<FlairMsg$UserFlair>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ FlairMsg$FlairListResponse access$27700() {
        return FlairMsg$FlairListResponse.DEFAULT_INSTANCE;
    }
    
    private void addAllUsers(final Iterable<? extends FlairMsg$UserFlair> iterable) {
        this.ensureUsersIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.users_);
    }
    
    private void addUsers(final int n, final FlairMsg$UserFlair flairMsg$UserFlair) {
        flairMsg$UserFlair.getClass();
        this.ensureUsersIsMutable();
        ((List<FlairMsg$UserFlair>)this.users_).add(n, flairMsg$UserFlair);
    }
    
    private void addUsers(final FlairMsg$UserFlair flairMsg$UserFlair) {
        flairMsg$UserFlair.getClass();
        this.ensureUsersIsMutable();
        ((List<FlairMsg$UserFlair>)this.users_).add(flairMsg$UserFlair);
    }
    
    private void clearUsers() {
        this.users_ = (Internal$j<FlairMsg$UserFlair>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureUsersIsMutable() {
        final Internal$j<FlairMsg$UserFlair> users_ = this.users_;
        if (!users_.E0()) {
            this.users_ = (Internal$j<FlairMsg$UserFlair>)GeneratedMessageLite.mutableCopy((Internal$j)users_);
        }
    }
    
    public static FlairMsg$FlairListResponse getDefaultInstance() {
        return FlairMsg$FlairListResponse.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairListResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairListResponse flairMsg$FlairListResponse) {
        return (a)FlairMsg$FlairListResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairListResponse);
    }
    
    public static FlairMsg$FlairListResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairListResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairListResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairListResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairListResponse> parser() {
        return (n1<FlairMsg$FlairListResponse>)FlairMsg$FlairListResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeUsers(final int n) {
        this.ensureUsersIsMutable();
        this.users_.remove(n);
    }
    
    private void setUsers(final int n, final FlairMsg$UserFlair flairMsg$UserFlair) {
        flairMsg$UserFlair.getClass();
        this.ensureUsersIsMutable();
        ((List<FlairMsg$UserFlair>)this.users_).set(n, flairMsg$UserFlair);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (a90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<FlairMsg$FlairListResponse> parser;
                if ((parser = FlairMsg$FlairListResponse.PARSER) == null) {
                    synchronized (FlairMsg$FlairListResponse.class) {
                        if (FlairMsg$FlairListResponse.PARSER == null) {
                            FlairMsg$FlairListResponse.PARSER = (n1<FlairMsg$FlairListResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairListResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairListResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairListResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "users_", FlairMsg$UserFlair.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairListResponse();
            }
        }
    }
    
    public FlairMsg$UserFlair getUsers(final int n) {
        return ((List<FlairMsg$UserFlair>)this.users_).get(n);
    }
    
    public int getUsersCount() {
        return ((List)this.users_).size();
    }
    
    public List<FlairMsg$UserFlair> getUsersList() {
        return (List<FlairMsg$UserFlair>)this.users_;
    }
    
    public e getUsersOrBuilder(final int n) {
        return ((List<e>)this.users_).get(n);
    }
    
    public List<? extends e> getUsersOrBuilderList() {
        return (List<? extends e>)this.users_;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairListResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairListResponse.access$27700());
        }
    }
}
