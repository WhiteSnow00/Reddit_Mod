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

public final class ModnotesMsg$RecentNotesRequest extends GeneratedMessageLite<ModnotesMsg$RecentNotesRequest, a> implements d1
{
    private static final ModnotesMsg$RecentNotesRequest DEFAULT_INSTANCE;
    private static volatile n1<ModnotesMsg$RecentNotesRequest> PARSER;
    public static final int SUBREDDITS_FIELD_NUMBER = 1;
    public static final int USERS_FIELD_NUMBER = 2;
    private String subreddits_;
    private String users_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$RecentNotesRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$RecentNotesRequest()));
    }
    
    private ModnotesMsg$RecentNotesRequest() {
        this.subreddits_ = "";
        this.users_ = "";
    }
    
    public static ModnotesMsg$RecentNotesRequest access$4400() {
        return ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$4500(final ModnotesMsg$RecentNotesRequest modnotesMsg$RecentNotesRequest, final String subreddits) {
        modnotesMsg$RecentNotesRequest.setSubreddits(subreddits);
    }
    
    public static void access$4600(final ModnotesMsg$RecentNotesRequest modnotesMsg$RecentNotesRequest) {
        modnotesMsg$RecentNotesRequest.clearSubreddits();
    }
    
    public static void access$4700(final ModnotesMsg$RecentNotesRequest modnotesMsg$RecentNotesRequest, final ByteString subredditsBytes) {
        modnotesMsg$RecentNotesRequest.setSubredditsBytes(subredditsBytes);
    }
    
    public static void access$4800(final ModnotesMsg$RecentNotesRequest modnotesMsg$RecentNotesRequest, final String users) {
        modnotesMsg$RecentNotesRequest.setUsers(users);
    }
    
    public static void access$4900(final ModnotesMsg$RecentNotesRequest modnotesMsg$RecentNotesRequest) {
        modnotesMsg$RecentNotesRequest.clearUsers();
    }
    
    public static void access$5000(final ModnotesMsg$RecentNotesRequest modnotesMsg$RecentNotesRequest, final ByteString usersBytes) {
        modnotesMsg$RecentNotesRequest.setUsersBytes(usersBytes);
    }
    
    private void clearSubreddits() {
        this.subreddits_ = getDefaultInstance().getSubreddits();
    }
    
    private void clearUsers() {
        this.users_ = getDefaultInstance().getUsers();
    }
    
    public static ModnotesMsg$RecentNotesRequest getDefaultInstance() {
        return ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$RecentNotesRequest modnotesMsg$RecentNotesRequest) {
        return (a)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$RecentNotesRequest);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final l l) throws IOException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$RecentNotesRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$RecentNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$RecentNotesRequest> parser() {
        return (n1<ModnotesMsg$RecentNotesRequest>)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setSubreddits(final String subreddits_) {
        subreddits_.getClass();
        this.subreddits_ = subreddits_;
    }
    
    private void setSubredditsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.subreddits_ = byteString.toStringUtf8();
    }
    
    private void setUsers(final String users_) {
        users_.getClass();
        this.users_ = users_;
    }
    
    private void setUsersBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.users_ = byteString.toStringUtf8();
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
                final n1<ModnotesMsg$RecentNotesRequest> parser;
                if ((parser = ModnotesMsg$RecentNotesRequest.PARSER) == null) {
                    synchronized (ModnotesMsg$RecentNotesRequest.class) {
                        if (ModnotesMsg$RecentNotesRequest.PARSER == null) {
                            ModnotesMsg$RecentNotesRequest.PARSER = (n1<ModnotesMsg$RecentNotesRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$RecentNotesRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "subreddits_", "users_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$RecentNotesRequest();
            }
        }
    }
    
    public String getSubreddits() {
        return this.subreddits_;
    }
    
    public ByteString getSubredditsBytes() {
        return ByteString.copyFromUtf8(this.subreddits_);
    }
    
    public String getUsers() {
        return this.users_;
    }
    
    public ByteString getUsersBytes() {
        return ByteString.copyFromUtf8(this.users_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$RecentNotesRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$RecentNotesRequest.access$4400());
        }
    }
}
