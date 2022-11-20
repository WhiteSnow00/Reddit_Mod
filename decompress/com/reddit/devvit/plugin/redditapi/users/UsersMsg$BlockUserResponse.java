// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.users;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import i90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import t5.w;
import p1.h;
import com.google.protobuf.StringValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class UsersMsg$BlockUserResponse extends GeneratedMessageLite<UsersMsg$BlockUserResponse, a> implements d1
{
    public static final int DATE_FIELD_NUMBER = 1;
    private static final UsersMsg$BlockUserResponse DEFAULT_INSTANCE;
    public static final int ICON_IMG_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile n1<UsersMsg$BlockUserResponse> PARSER;
    private Int64Value date_;
    private StringValue iconImg_;
    private StringValue id_;
    private StringValue name_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$BlockUserResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$BlockUserResponse()));
    }
    
    private UsersMsg$BlockUserResponse() {
    }
    
    public static UsersMsg$BlockUserResponse access$16900() {
        return UsersMsg$BlockUserResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$17000(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final Int64Value date) {
        usersMsg$BlockUserResponse.setDate(date);
    }
    
    public static void access$17100(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final Int64Value int64Value) {
        usersMsg$BlockUserResponse.mergeDate(int64Value);
    }
    
    public static void access$17200(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse) {
        usersMsg$BlockUserResponse.clearDate();
    }
    
    public static void access$17300(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final StringValue iconImg) {
        usersMsg$BlockUserResponse.setIconImg(iconImg);
    }
    
    public static void access$17400(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final StringValue stringValue) {
        usersMsg$BlockUserResponse.mergeIconImg(stringValue);
    }
    
    public static void access$17500(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse) {
        usersMsg$BlockUserResponse.clearIconImg();
    }
    
    public static void access$17600(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final StringValue id) {
        usersMsg$BlockUserResponse.setId(id);
    }
    
    public static void access$17700(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final StringValue stringValue) {
        usersMsg$BlockUserResponse.mergeId(stringValue);
    }
    
    public static void access$17800(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse) {
        usersMsg$BlockUserResponse.clearId();
    }
    
    public static void access$17900(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final StringValue name) {
        usersMsg$BlockUserResponse.setName(name);
    }
    
    public static void access$18000(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse, final StringValue stringValue) {
        usersMsg$BlockUserResponse.mergeName(stringValue);
    }
    
    public static void access$18100(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse) {
        usersMsg$BlockUserResponse.clearName();
    }
    
    private void clearDate() {
        this.date_ = null;
    }
    
    private void clearIconImg() {
        this.iconImg_ = null;
    }
    
    private void clearId() {
        this.id_ = null;
    }
    
    private void clearName() {
        this.name_ = null;
    }
    
    public static UsersMsg$BlockUserResponse getDefaultInstance() {
        return UsersMsg$BlockUserResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeDate(final Int64Value date_) {
        date_.getClass();
        final Int64Value date_2 = this.date_;
        if (date_2 != null && date_2 != Int64Value.getDefaultInstance()) {
            this.date_ = (Int64Value)h.b(this.date_, date_);
        }
        else {
            this.date_ = date_;
        }
    }
    
    private void mergeIconImg(final StringValue iconImg_) {
        iconImg_.getClass();
        final StringValue iconImg_2 = this.iconImg_;
        if (iconImg_2 != null && iconImg_2 != StringValue.getDefaultInstance()) {
            this.iconImg_ = (StringValue)w.e(this.iconImg_, iconImg_);
        }
        else {
            this.iconImg_ = iconImg_;
        }
    }
    
    private void mergeId(final StringValue id_) {
        id_.getClass();
        final StringValue id_2 = this.id_;
        if (id_2 != null && id_2 != StringValue.getDefaultInstance()) {
            this.id_ = (StringValue)w.e(this.id_, id_);
        }
        else {
            this.id_ = id_;
        }
    }
    
    private void mergeName(final StringValue name_) {
        name_.getClass();
        final StringValue name_2 = this.name_;
        if (name_2 != null && name_2 != StringValue.getDefaultInstance()) {
            this.name_ = (StringValue)w.e(this.name_, name_);
        }
        else {
            this.name_ = name_;
        }
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$BlockUserResponse usersMsg$BlockUserResponse) {
        return (a)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$BlockUserResponse);
    }
    
    public static UsersMsg$BlockUserResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$BlockUserResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final l l) throws IOException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$BlockUserResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$BlockUserResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$BlockUserResponse> parser() {
        return (n1<UsersMsg$BlockUserResponse>)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setDate(final Int64Value date_) {
        date_.getClass();
        this.date_ = date_;
    }
    
    private void setIconImg(final StringValue iconImg_) {
        iconImg_.getClass();
        this.iconImg_ = iconImg_;
    }
    
    private void setId(final StringValue id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setName(final StringValue name_) {
        name_.getClass();
        this.name_ = name_;
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
                final n1<UsersMsg$BlockUserResponse> parser;
                if ((parser = UsersMsg$BlockUserResponse.PARSER) == null) {
                    synchronized (UsersMsg$BlockUserResponse.class) {
                        if (UsersMsg$BlockUserResponse.PARSER == null) {
                            UsersMsg$BlockUserResponse.PARSER = (n1<UsersMsg$BlockUserResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$BlockUserResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$BlockUserResponse.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[] { "date_", "iconImg_", "id_", "name_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$BlockUserResponse();
            }
        }
    }
    
    public Int64Value getDate() {
        Int64Value int64Value;
        if ((int64Value = this.date_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public StringValue getIconImg() {
        StringValue stringValue;
        if ((stringValue = this.iconImg_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getId() {
        StringValue stringValue;
        if ((stringValue = this.id_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getName() {
        StringValue stringValue;
        if ((stringValue = this.name_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasDate() {
        return this.date_ != null;
    }
    
    public boolean hasIconImg() {
        return this.iconImg_ != null;
    }
    
    public boolean hasId() {
        return this.id_ != null;
    }
    
    public boolean hasName() {
        return this.name_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$BlockUserResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$BlockUserResponse.access$16900());
        }
    }
}
