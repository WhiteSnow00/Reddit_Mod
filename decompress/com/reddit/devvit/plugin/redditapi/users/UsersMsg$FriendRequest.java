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

public final class UsersMsg$FriendRequest extends GeneratedMessageLite<UsersMsg$FriendRequest, a> implements d1
{
    public static final int BAN_CONTEXT_FIELD_NUMBER = 1;
    public static final int BAN_MESSAGE_FIELD_NUMBER = 2;
    public static final int BAN_REASON_FIELD_NUMBER = 3;
    private static final UsersMsg$FriendRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 5;
    public static final int NOTE_FIELD_NUMBER = 6;
    private static volatile n1<UsersMsg$FriendRequest> PARSER;
    public static final int PERMISSIONS_FIELD_NUMBER = 7;
    public static final int SUBREDDIT_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 8;
    private String banContext_;
    private String banMessage_;
    private String banReason_;
    private int duration_;
    private String name_;
    private String note_;
    private String permissions_;
    private String subreddit_;
    private String type_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$FriendRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$FriendRequest()));
    }
    
    private UsersMsg$FriendRequest() {
        this.banContext_ = "";
        this.banMessage_ = "";
        this.banReason_ = "";
        this.name_ = "";
        this.note_ = "";
        this.permissions_ = "";
        this.type_ = "";
        this.subreddit_ = "";
    }
    
    public static UsersMsg$FriendRequest access$1600() {
        return UsersMsg$FriendRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$1700(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String banContext) {
        usersMsg$FriendRequest.setBanContext(banContext);
    }
    
    public static void access$1800(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearBanContext();
    }
    
    public static void access$1900(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString banContextBytes) {
        usersMsg$FriendRequest.setBanContextBytes(banContextBytes);
    }
    
    public static void access$2000(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String banMessage) {
        usersMsg$FriendRequest.setBanMessage(banMessage);
    }
    
    public static void access$2100(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearBanMessage();
    }
    
    public static void access$2200(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString banMessageBytes) {
        usersMsg$FriendRequest.setBanMessageBytes(banMessageBytes);
    }
    
    public static void access$2300(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String banReason) {
        usersMsg$FriendRequest.setBanReason(banReason);
    }
    
    public static void access$2400(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearBanReason();
    }
    
    public static void access$2500(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString banReasonBytes) {
        usersMsg$FriendRequest.setBanReasonBytes(banReasonBytes);
    }
    
    public static void access$2600(final UsersMsg$FriendRequest usersMsg$FriendRequest, final int duration) {
        usersMsg$FriendRequest.setDuration(duration);
    }
    
    public static void access$2700(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearDuration();
    }
    
    public static void access$2800(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String name) {
        usersMsg$FriendRequest.setName(name);
    }
    
    public static void access$2900(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearName();
    }
    
    public static void access$3000(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString nameBytes) {
        usersMsg$FriendRequest.setNameBytes(nameBytes);
    }
    
    public static void access$3100(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String note) {
        usersMsg$FriendRequest.setNote(note);
    }
    
    public static void access$3200(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearNote();
    }
    
    public static void access$3300(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString noteBytes) {
        usersMsg$FriendRequest.setNoteBytes(noteBytes);
    }
    
    public static void access$3400(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String permissions) {
        usersMsg$FriendRequest.setPermissions(permissions);
    }
    
    public static void access$3500(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearPermissions();
    }
    
    public static void access$3600(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString permissionsBytes) {
        usersMsg$FriendRequest.setPermissionsBytes(permissionsBytes);
    }
    
    public static void access$3700(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String type) {
        usersMsg$FriendRequest.setType(type);
    }
    
    public static void access$3800(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearType();
    }
    
    public static void access$3900(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString typeBytes) {
        usersMsg$FriendRequest.setTypeBytes(typeBytes);
    }
    
    public static void access$4000(final UsersMsg$FriendRequest usersMsg$FriendRequest, final String subreddit) {
        usersMsg$FriendRequest.setSubreddit(subreddit);
    }
    
    public static void access$4100(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        usersMsg$FriendRequest.clearSubreddit();
    }
    
    public static void access$4200(final UsersMsg$FriendRequest usersMsg$FriendRequest, final ByteString subredditBytes) {
        usersMsg$FriendRequest.setSubredditBytes(subredditBytes);
    }
    
    private void clearBanContext() {
        this.banContext_ = getDefaultInstance().getBanContext();
    }
    
    private void clearBanMessage() {
        this.banMessage_ = getDefaultInstance().getBanMessage();
    }
    
    private void clearBanReason() {
        this.banReason_ = getDefaultInstance().getBanReason();
    }
    
    private void clearDuration() {
        this.duration_ = 0;
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearNote() {
        this.note_ = getDefaultInstance().getNote();
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
    
    public static UsersMsg$FriendRequest getDefaultInstance() {
        return UsersMsg$FriendRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$FriendRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$FriendRequest usersMsg$FriendRequest) {
        return (a)UsersMsg$FriendRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$FriendRequest);
    }
    
    public static UsersMsg$FriendRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$FriendRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$FriendRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$FriendRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$FriendRequest> parser() {
        return (n1<UsersMsg$FriendRequest>)UsersMsg$FriendRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setBanContext(final String banContext_) {
        banContext_.getClass();
        this.banContext_ = banContext_;
    }
    
    private void setBanContextBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.banContext_ = byteString.toStringUtf8();
    }
    
    private void setBanMessage(final String banMessage_) {
        banMessage_.getClass();
        this.banMessage_ = banMessage_;
    }
    
    private void setBanMessageBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.banMessage_ = byteString.toStringUtf8();
    }
    
    private void setBanReason(final String banReason_) {
        banReason_.getClass();
        this.banReason_ = banReason_;
    }
    
    private void setBanReasonBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.banReason_ = byteString.toStringUtf8();
    }
    
    private void setDuration(final int duration_) {
        this.duration_ = duration_;
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
                final n1<UsersMsg$FriendRequest> parser;
                if ((parser = UsersMsg$FriendRequest.PARSER) == null) {
                    synchronized (UsersMsg$FriendRequest.class) {
                        if (UsersMsg$FriendRequest.PARSER == null) {
                            UsersMsg$FriendRequest.PARSER = (n1<UsersMsg$FriendRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$FriendRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$FriendRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$FriendRequest.DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208", new Object[] { "banContext_", "banMessage_", "banReason_", "duration_", "name_", "note_", "permissions_", "type_", "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$FriendRequest();
            }
        }
    }
    
    public String getBanContext() {
        return this.banContext_;
    }
    
    public ByteString getBanContextBytes() {
        return ByteString.copyFromUtf8(this.banContext_);
    }
    
    public String getBanMessage() {
        return this.banMessage_;
    }
    
    public ByteString getBanMessageBytes() {
        return ByteString.copyFromUtf8(this.banMessage_);
    }
    
    public String getBanReason() {
        return this.banReason_;
    }
    
    public ByteString getBanReasonBytes() {
        return ByteString.copyFromUtf8(this.banReason_);
    }
    
    public int getDuration() {
        return this.duration_;
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
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$FriendRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$FriendRequest.access$1600());
        }
    }
}
