// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.users;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.x1;
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
import t5.w;
import p1.h;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.StringValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class UsersMsg$GeneralFriendResponse extends GeneratedMessageLite<UsersMsg$GeneralFriendResponse, a> implements d1
{
    public static final int DATE_FIELD_NUMBER = 1;
    private static final UsersMsg$GeneralFriendResponse DEFAULT_INSTANCE;
    public static final int EXPLANATION_FIELD_NUMBER = 6;
    public static final int FIELDS_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile n1<UsersMsg$GeneralFriendResponse> PARSER;
    public static final int REASON_FIELD_NUMBER = 8;
    public static final int REL_ID_FIELD_NUMBER = 2;
    private Int64Value date_;
    private StringValue explanation_;
    private Internal$j<StringValue> fields_;
    private StringValue id_;
    private StringValue message_;
    private StringValue name_;
    private StringValue reason_;
    private StringValue relId_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$GeneralFriendResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$GeneralFriendResponse()));
    }
    
    private UsersMsg$GeneralFriendResponse() {
        this.fields_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static UsersMsg$GeneralFriendResponse access$14000() {
        return UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$14100(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final Int64Value date) {
        usersMsg$GeneralFriendResponse.setDate(date);
    }
    
    public static void access$14200(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final Int64Value int64Value) {
        usersMsg$GeneralFriendResponse.mergeDate(int64Value);
    }
    
    public static void access$14300(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearDate();
    }
    
    public static void access$14400(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue relId) {
        usersMsg$GeneralFriendResponse.setRelId(relId);
    }
    
    public static void access$14500(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.mergeRelId(stringValue);
    }
    
    public static void access$14600(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearRelId();
    }
    
    public static void access$14700(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue name) {
        usersMsg$GeneralFriendResponse.setName(name);
    }
    
    public static void access$14800(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.mergeName(stringValue);
    }
    
    public static void access$14900(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearName();
    }
    
    public static void access$15000(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue id) {
        usersMsg$GeneralFriendResponse.setId(id);
    }
    
    public static void access$15100(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.mergeId(stringValue);
    }
    
    public static void access$15200(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearId();
    }
    
    public static void access$15300(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final int n, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.setFields(n, stringValue);
    }
    
    public static void access$15400(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.addFields(stringValue);
    }
    
    public static void access$15500(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final int n, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.addFields(n, stringValue);
    }
    
    public static void access$15600(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final Iterable iterable) {
        usersMsg$GeneralFriendResponse.addAllFields(iterable);
    }
    
    public static void access$15700(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearFields();
    }
    
    public static void access$15800(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final int n) {
        usersMsg$GeneralFriendResponse.removeFields(n);
    }
    
    public static void access$15900(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue explanation) {
        usersMsg$GeneralFriendResponse.setExplanation(explanation);
    }
    
    public static void access$16000(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.mergeExplanation(stringValue);
    }
    
    public static void access$16100(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearExplanation();
    }
    
    public static void access$16200(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue message) {
        usersMsg$GeneralFriendResponse.setMessage(message);
    }
    
    public static void access$16300(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.mergeMessage(stringValue);
    }
    
    public static void access$16400(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearMessage();
    }
    
    public static void access$16500(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue reason) {
        usersMsg$GeneralFriendResponse.setReason(reason);
    }
    
    public static void access$16600(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse, final StringValue stringValue) {
        usersMsg$GeneralFriendResponse.mergeReason(stringValue);
    }
    
    public static void access$16700(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        usersMsg$GeneralFriendResponse.clearReason();
    }
    
    private void addAllFields(final Iterable<? extends StringValue> iterable) {
        this.ensureFieldsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.fields_);
    }
    
    private void addFields(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureFieldsIsMutable();
        ((List<StringValue>)this.fields_).add(n, stringValue);
    }
    
    private void addFields(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureFieldsIsMutable();
        ((List<StringValue>)this.fields_).add(stringValue);
    }
    
    private void clearDate() {
        this.date_ = null;
    }
    
    private void clearExplanation() {
        this.explanation_ = null;
    }
    
    private void clearFields() {
        this.fields_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearId() {
        this.id_ = null;
    }
    
    private void clearMessage() {
        this.message_ = null;
    }
    
    private void clearName() {
        this.name_ = null;
    }
    
    private void clearReason() {
        this.reason_ = null;
    }
    
    private void clearRelId() {
        this.relId_ = null;
    }
    
    private void ensureFieldsIsMutable() {
        final Internal$j<StringValue> fields_ = this.fields_;
        if (!fields_.E0()) {
            this.fields_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)fields_);
        }
    }
    
    public static UsersMsg$GeneralFriendResponse getDefaultInstance() {
        return UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE;
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
    
    private void mergeExplanation(final StringValue explanation_) {
        explanation_.getClass();
        final StringValue explanation_2 = this.explanation_;
        if (explanation_2 != null && explanation_2 != StringValue.getDefaultInstance()) {
            this.explanation_ = (StringValue)w.e(this.explanation_, explanation_);
        }
        else {
            this.explanation_ = explanation_;
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
    
    private void mergeMessage(final StringValue message_) {
        message_.getClass();
        final StringValue message_2 = this.message_;
        if (message_2 != null && message_2 != StringValue.getDefaultInstance()) {
            this.message_ = (StringValue)w.e(this.message_, message_);
        }
        else {
            this.message_ = message_;
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
    
    private void mergeReason(final StringValue reason_) {
        reason_.getClass();
        final StringValue reason_2 = this.reason_;
        if (reason_2 != null && reason_2 != StringValue.getDefaultInstance()) {
            this.reason_ = (StringValue)w.e(this.reason_, reason_);
        }
        else {
            this.reason_ = reason_;
        }
    }
    
    private void mergeRelId(final StringValue relId_) {
        relId_.getClass();
        final StringValue relId_2 = this.relId_;
        if (relId_2 != null && relId_2 != StringValue.getDefaultInstance()) {
            this.relId_ = (StringValue)w.e(this.relId_, relId_);
        }
        else {
            this.relId_ = relId_;
        }
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$GeneralFriendResponse usersMsg$GeneralFriendResponse) {
        return (a)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$GeneralFriendResponse);
    }
    
    public static UsersMsg$GeneralFriendResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$GeneralFriendResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final l l) throws IOException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$GeneralFriendResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$GeneralFriendResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$GeneralFriendResponse> parser() {
        return (n1<UsersMsg$GeneralFriendResponse>)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeFields(final int n) {
        this.ensureFieldsIsMutable();
        this.fields_.remove(n);
    }
    
    private void setDate(final Int64Value date_) {
        date_.getClass();
        this.date_ = date_;
    }
    
    private void setExplanation(final StringValue explanation_) {
        explanation_.getClass();
        this.explanation_ = explanation_;
    }
    
    private void setFields(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureFieldsIsMutable();
        ((List<StringValue>)this.fields_).set(n, stringValue);
    }
    
    private void setId(final StringValue id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setMessage(final StringValue message_) {
        message_.getClass();
        this.message_ = message_;
    }
    
    private void setName(final StringValue name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setReason(final StringValue reason_) {
        reason_.getClass();
        this.reason_ = reason_;
    }
    
    private void setRelId(final StringValue relId_) {
        relId_.getClass();
        this.relId_ = relId_;
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
                final n1<UsersMsg$GeneralFriendResponse> parser;
                if ((parser = UsersMsg$GeneralFriendResponse.PARSER) == null) {
                    synchronized (UsersMsg$GeneralFriendResponse.class) {
                        if (UsersMsg$GeneralFriendResponse.PARSER == null) {
                            UsersMsg$GeneralFriendResponse.PARSER = (n1<UsersMsg$GeneralFriendResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$GeneralFriendResponse.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0006\t\u0007\t\b\t", new Object[] { "date_", "relId_", "name_", "id_", "fields_", StringValue.class, "explanation_", "message_", "reason_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$GeneralFriendResponse();
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
    
    public StringValue getExplanation() {
        StringValue stringValue;
        if ((stringValue = this.explanation_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getFields(final int n) {
        return ((List<StringValue>)this.fields_).get(n);
    }
    
    public int getFieldsCount() {
        return ((List)this.fields_).size();
    }
    
    public List<StringValue> getFieldsList() {
        return (List<StringValue>)this.fields_;
    }
    
    public x1 getFieldsOrBuilder(final int n) {
        return ((List<x1>)this.fields_).get(n);
    }
    
    public List<? extends x1> getFieldsOrBuilderList() {
        return (List<? extends x1>)this.fields_;
    }
    
    public StringValue getId() {
        StringValue stringValue;
        if ((stringValue = this.id_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getMessage() {
        StringValue stringValue;
        if ((stringValue = this.message_) == null) {
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
    
    public StringValue getReason() {
        StringValue stringValue;
        if ((stringValue = this.reason_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getRelId() {
        StringValue stringValue;
        if ((stringValue = this.relId_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasDate() {
        return this.date_ != null;
    }
    
    public boolean hasExplanation() {
        return this.explanation_ != null;
    }
    
    public boolean hasId() {
        return this.id_ != null;
    }
    
    public boolean hasMessage() {
        return this.message_ != null;
    }
    
    public boolean hasName() {
        return this.name_ != null;
    }
    
    public boolean hasReason() {
        return this.reason_ != null;
    }
    
    public boolean hasRelId() {
        return this.relId_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$GeneralFriendResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$GeneralFriendResponse.access$14000());
        }
    }
}
