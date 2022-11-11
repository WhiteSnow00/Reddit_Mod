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

public final class UsersMsg$UpdateFriendRelationshipRequest extends GeneratedMessageLite<UsersMsg$UpdateFriendRelationshipRequest, a> implements d1
{
    private static final UsersMsg$UpdateFriendRelationshipRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NOTE_FIELD_NUMBER = 2;
    private static volatile n1<UsersMsg$UpdateFriendRelationshipRequest> PARSER;
    private String name_;
    private String note_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UpdateFriendRelationshipRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UpdateFriendRelationshipRequest()));
    }
    
    private UsersMsg$UpdateFriendRelationshipRequest() {
        this.name_ = "";
        this.note_ = "";
    }
    
    public static /* synthetic */ UsersMsg$UpdateFriendRelationshipRequest access$9300() {
        return UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE;
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearNote() {
        this.note_ = getDefaultInstance().getNote();
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest getDefaultInstance() {
        return UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UpdateFriendRelationshipRequest usersMsg$UpdateFriendRelationshipRequest) {
        return (a)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UpdateFriendRelationshipRequest);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UpdateFriendRelationshipRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UpdateFriendRelationshipRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UpdateFriendRelationshipRequest> parser() {
        return (n1<UsersMsg$UpdateFriendRelationshipRequest>)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }
    
    private void setNote(final String note_) {
        note_.getClass();
        this.note_ = note_;
    }
    
    private void setNoteBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.note_ = byteString.toStringUtf8();
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
                final n1<UsersMsg$UpdateFriendRelationshipRequest> parser;
                if ((parser = UsersMsg$UpdateFriendRelationshipRequest.PARSER) == null) {
                    synchronized (UsersMsg$UpdateFriendRelationshipRequest.class) {
                        if (UsersMsg$UpdateFriendRelationshipRequest.PARSER == null) {
                            UsersMsg$UpdateFriendRelationshipRequest.PARSER = (n1<UsersMsg$UpdateFriendRelationshipRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UpdateFriendRelationshipRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "name_", "note_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UpdateFriendRelationshipRequest();
            }
        }
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public String getNote() {
        return this.note_;
    }
    
    public ByteString getNoteBytes() {
        return ByteString.copyFromUtf8(this.note_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UpdateFriendRelationshipRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UpdateFriendRelationshipRequest.access$9300());
        }
    }
}
