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

public final class UsersMsg$ReportUserRequest extends GeneratedMessageLite<UsersMsg$ReportUserRequest, a> implements d1
{
    private static final UsersMsg$ReportUserRequest DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    private static volatile n1<UsersMsg$ReportUserRequest> PARSER;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int USER_FIELD_NUMBER = 3;
    private String details_;
    private String reason_;
    private String user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$ReportUserRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$ReportUserRequest()));
    }
    
    private UsersMsg$ReportUserRequest() {
        this.details_ = "";
        this.reason_ = "";
        this.user_ = "";
    }
    
    public static UsersMsg$ReportUserRequest access$4400() {
        return UsersMsg$ReportUserRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$4500(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest, final String details) {
        usersMsg$ReportUserRequest.setDetails(details);
    }
    
    public static void access$4600(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest) {
        usersMsg$ReportUserRequest.clearDetails();
    }
    
    public static void access$4700(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest, final ByteString detailsBytes) {
        usersMsg$ReportUserRequest.setDetailsBytes(detailsBytes);
    }
    
    public static void access$4800(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest, final String reason) {
        usersMsg$ReportUserRequest.setReason(reason);
    }
    
    public static void access$4900(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest) {
        usersMsg$ReportUserRequest.clearReason();
    }
    
    public static void access$5000(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest, final ByteString reasonBytes) {
        usersMsg$ReportUserRequest.setReasonBytes(reasonBytes);
    }
    
    public static void access$5100(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest, final String user) {
        usersMsg$ReportUserRequest.setUser(user);
    }
    
    public static void access$5200(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest) {
        usersMsg$ReportUserRequest.clearUser();
    }
    
    public static void access$5300(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest, final ByteString userBytes) {
        usersMsg$ReportUserRequest.setUserBytes(userBytes);
    }
    
    private void clearDetails() {
        this.details_ = getDefaultInstance().getDetails();
    }
    
    private void clearReason() {
        this.reason_ = getDefaultInstance().getReason();
    }
    
    private void clearUser() {
        this.user_ = getDefaultInstance().getUser();
    }
    
    public static UsersMsg$ReportUserRequest getDefaultInstance() {
        return UsersMsg$ReportUserRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$ReportUserRequest usersMsg$ReportUserRequest) {
        return (a)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$ReportUserRequest);
    }
    
    public static UsersMsg$ReportUserRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$ReportUserRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$ReportUserRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$ReportUserRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$ReportUserRequest> parser() {
        return (n1<UsersMsg$ReportUserRequest>)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setDetails(final String details_) {
        details_.getClass();
        this.details_ = details_;
    }
    
    private void setDetailsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.details_ = byteString.toStringUtf8();
    }
    
    private void setReason(final String reason_) {
        reason_.getClass();
        this.reason_ = reason_;
    }
    
    private void setReasonBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.reason_ = byteString.toStringUtf8();
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
                final n1<UsersMsg$ReportUserRequest> parser;
                if ((parser = UsersMsg$ReportUserRequest.PARSER) == null) {
                    synchronized (UsersMsg$ReportUserRequest.class) {
                        if (UsersMsg$ReportUserRequest.PARSER == null) {
                            UsersMsg$ReportUserRequest.PARSER = (n1<UsersMsg$ReportUserRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$ReportUserRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$ReportUserRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[] { "details_", "reason_", "user_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$ReportUserRequest();
            }
        }
    }
    
    public String getDetails() {
        return this.details_;
    }
    
    public ByteString getDetailsBytes() {
        return ByteString.copyFromUtf8(this.details_);
    }
    
    public String getReason() {
        return this.reason_;
    }
    
    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.reason_);
    }
    
    public String getUser() {
        return this.user_;
    }
    
    public ByteString getUserBytes() {
        return ByteString.copyFromUtf8(this.user_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$ReportUserRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$ReportUserRequest.access$4400());
        }
    }
}
