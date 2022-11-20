// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.modnotes;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.d1;
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
import com.google.protobuf.StringValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.n1;
import com.google.protobuf.GeneratedMessageLite;

public final class ModnotesMsg$ModNoteObject extends GeneratedMessageLite<ModnotesMsg$ModNoteObject, a> implements com.reddit.devvit.plugin.redditapi.modnotes.a
{
    public static final int CREATED_AT_FIELD_NUMBER = 10;
    public static final int CURSOR_FIELD_NUMBER = 11;
    private static final ModnotesMsg$ModNoteObject DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 8;
    public static final int MOD_ACTION_DATA_FIELD_NUMBER = 3;
    public static final int OPERATOR_FIELD_NUMBER = 7;
    public static final int OPERATOR_ID_FIELD_NUMBER = 2;
    private static volatile n1<ModnotesMsg$ModNoteObject> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 5;
    public static final int SUBREDDIT_ID_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 12;
    public static final int USER_FIELD_NUMBER = 6;
    public static final int USER_ID_FIELD_NUMBER = 9;
    public static final int USER_NOTE_DATA_FIELD_NUMBER = 4;
    private Int64Value createdAt_;
    private StringValue cursor_;
    private StringValue id_;
    private ModActionData modActionData_;
    private StringValue operatorId_;
    private StringValue operator_;
    private StringValue subredditId_;
    private StringValue subreddit_;
    private StringValue type_;
    private StringValue userId_;
    private UserNoteData userNoteData_;
    private StringValue user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$ModNoteObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$ModNoteObject()));
    }
    
    private ModnotesMsg$ModNoteObject() {
    }
    
    public static void access$10000(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue subredditId) {
        modnotesMsg$ModNoteObject.setSubredditId(subredditId);
    }
    
    public static void access$10100(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeSubredditId(stringValue);
    }
    
    public static void access$10200(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearSubredditId();
    }
    
    public static void access$10300(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue operatorId) {
        modnotesMsg$ModNoteObject.setOperatorId(operatorId);
    }
    
    public static void access$10400(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeOperatorId(stringValue);
    }
    
    public static void access$10500(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearOperatorId();
    }
    
    public static void access$10600(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final ModActionData modActionData) {
        modnotesMsg$ModNoteObject.setModActionData(modActionData);
    }
    
    public static void access$10700(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final ModActionData modActionData) {
        modnotesMsg$ModNoteObject.mergeModActionData(modActionData);
    }
    
    public static void access$10800(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearModActionData();
    }
    
    public static void access$10900(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final UserNoteData userNoteData) {
        modnotesMsg$ModNoteObject.setUserNoteData(userNoteData);
    }
    
    public static void access$11000(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final UserNoteData userNoteData) {
        modnotesMsg$ModNoteObject.mergeUserNoteData(userNoteData);
    }
    
    public static void access$11100(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearUserNoteData();
    }
    
    public static void access$11200(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue subreddit) {
        modnotesMsg$ModNoteObject.setSubreddit(subreddit);
    }
    
    public static void access$11300(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeSubreddit(stringValue);
    }
    
    public static void access$11400(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearSubreddit();
    }
    
    public static void access$11500(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue user) {
        modnotesMsg$ModNoteObject.setUser(user);
    }
    
    public static void access$11600(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeUser(stringValue);
    }
    
    public static void access$11700(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearUser();
    }
    
    public static void access$11800(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue operator) {
        modnotesMsg$ModNoteObject.setOperator(operator);
    }
    
    public static void access$11900(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeOperator(stringValue);
    }
    
    public static void access$12000(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearOperator();
    }
    
    public static void access$12100(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue id) {
        modnotesMsg$ModNoteObject.setId(id);
    }
    
    public static void access$12200(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeId(stringValue);
    }
    
    public static void access$12300(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearId();
    }
    
    public static void access$12400(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue userId) {
        modnotesMsg$ModNoteObject.setUserId(userId);
    }
    
    public static void access$12500(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeUserId(stringValue);
    }
    
    public static void access$12600(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearUserId();
    }
    
    public static void access$12700(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final Int64Value createdAt) {
        modnotesMsg$ModNoteObject.setCreatedAt(createdAt);
    }
    
    public static void access$12800(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final Int64Value int64Value) {
        modnotesMsg$ModNoteObject.mergeCreatedAt(int64Value);
    }
    
    public static void access$12900(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearCreatedAt();
    }
    
    public static void access$13000(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue cursor) {
        modnotesMsg$ModNoteObject.setCursor(cursor);
    }
    
    public static void access$13100(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeCursor(stringValue);
    }
    
    public static void access$13200(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearCursor();
    }
    
    public static void access$13300(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue type) {
        modnotesMsg$ModNoteObject.setType(type);
    }
    
    public static void access$13400(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject, final StringValue stringValue) {
        modnotesMsg$ModNoteObject.mergeType(stringValue);
    }
    
    public static void access$13500(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.clearType();
    }
    
    public static ModnotesMsg$ModNoteObject access$9900() {
        return ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE;
    }
    
    private void clearCreatedAt() {
        this.createdAt_ = null;
    }
    
    private void clearCursor() {
        this.cursor_ = null;
    }
    
    private void clearId() {
        this.id_ = null;
    }
    
    private void clearModActionData() {
        this.modActionData_ = null;
    }
    
    private void clearOperator() {
        this.operator_ = null;
    }
    
    private void clearOperatorId() {
        this.operatorId_ = null;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = null;
    }
    
    private void clearSubredditId() {
        this.subredditId_ = null;
    }
    
    private void clearType() {
        this.type_ = null;
    }
    
    private void clearUser() {
        this.user_ = null;
    }
    
    private void clearUserId() {
        this.userId_ = null;
    }
    
    private void clearUserNoteData() {
        this.userNoteData_ = null;
    }
    
    public static ModnotesMsg$ModNoteObject getDefaultInstance() {
        return ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE;
    }
    
    private void mergeCreatedAt(final Int64Value createdAt_) {
        createdAt_.getClass();
        final Int64Value createdAt_2 = this.createdAt_;
        if (createdAt_2 != null && createdAt_2 != Int64Value.getDefaultInstance()) {
            this.createdAt_ = (Int64Value)h.b(this.createdAt_, createdAt_);
        }
        else {
            this.createdAt_ = createdAt_;
        }
    }
    
    private void mergeCursor(final StringValue cursor_) {
        cursor_.getClass();
        final StringValue cursor_2 = this.cursor_;
        if (cursor_2 != null && cursor_2 != StringValue.getDefaultInstance()) {
            this.cursor_ = (StringValue)w.e(this.cursor_, cursor_);
        }
        else {
            this.cursor_ = cursor_;
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
    
    private void mergeModActionData(final ModActionData modActionData_) {
        modActionData_.getClass();
        final ModActionData modActionData_2 = this.modActionData_;
        if (modActionData_2 != null && modActionData_2 != ModActionData.getDefaultInstance()) {
            final ModActionData.a builder = ModActionData.newBuilder(this.modActionData_);
            builder.h((GeneratedMessageLite)modActionData_);
            this.modActionData_ = (ModActionData)builder.c();
        }
        else {
            this.modActionData_ = modActionData_;
        }
    }
    
    private void mergeOperator(final StringValue operator_) {
        operator_.getClass();
        final StringValue operator_2 = this.operator_;
        if (operator_2 != null && operator_2 != StringValue.getDefaultInstance()) {
            this.operator_ = (StringValue)w.e(this.operator_, operator_);
        }
        else {
            this.operator_ = operator_;
        }
    }
    
    private void mergeOperatorId(final StringValue operatorId_) {
        operatorId_.getClass();
        final StringValue operatorId_2 = this.operatorId_;
        if (operatorId_2 != null && operatorId_2 != StringValue.getDefaultInstance()) {
            this.operatorId_ = (StringValue)w.e(this.operatorId_, operatorId_);
        }
        else {
            this.operatorId_ = operatorId_;
        }
    }
    
    private void mergeSubreddit(final StringValue subreddit_) {
        subreddit_.getClass();
        final StringValue subreddit_2 = this.subreddit_;
        if (subreddit_2 != null && subreddit_2 != StringValue.getDefaultInstance()) {
            this.subreddit_ = (StringValue)w.e(this.subreddit_, subreddit_);
        }
        else {
            this.subreddit_ = subreddit_;
        }
    }
    
    private void mergeSubredditId(final StringValue subredditId_) {
        subredditId_.getClass();
        final StringValue subredditId_2 = this.subredditId_;
        if (subredditId_2 != null && subredditId_2 != StringValue.getDefaultInstance()) {
            this.subredditId_ = (StringValue)w.e(this.subredditId_, subredditId_);
        }
        else {
            this.subredditId_ = subredditId_;
        }
    }
    
    private void mergeType(final StringValue type_) {
        type_.getClass();
        final StringValue type_2 = this.type_;
        if (type_2 != null && type_2 != StringValue.getDefaultInstance()) {
            this.type_ = (StringValue)w.e(this.type_, type_);
        }
        else {
            this.type_ = type_;
        }
    }
    
    private void mergeUser(final StringValue user_) {
        user_.getClass();
        final StringValue user_2 = this.user_;
        if (user_2 != null && user_2 != StringValue.getDefaultInstance()) {
            this.user_ = (StringValue)w.e(this.user_, user_);
        }
        else {
            this.user_ = user_;
        }
    }
    
    private void mergeUserId(final StringValue userId_) {
        userId_.getClass();
        final StringValue userId_2 = this.userId_;
        if (userId_2 != null && userId_2 != StringValue.getDefaultInstance()) {
            this.userId_ = (StringValue)w.e(this.userId_, userId_);
        }
        else {
            this.userId_ = userId_;
        }
    }
    
    private void mergeUserNoteData(final UserNoteData userNoteData_) {
        userNoteData_.getClass();
        final UserNoteData userNoteData_2 = this.userNoteData_;
        if (userNoteData_2 != null && userNoteData_2 != UserNoteData.getDefaultInstance()) {
            final UserNoteData.a builder = UserNoteData.newBuilder(this.userNoteData_);
            builder.h((GeneratedMessageLite)userNoteData_);
            this.userNoteData_ = (UserNoteData)builder.c();
        }
        else {
            this.userNoteData_ = userNoteData_;
        }
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        return (a)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$ModNoteObject);
    }
    
    public static ModnotesMsg$ModNoteObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$ModNoteObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final l l) throws IOException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$ModNoteObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNoteObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$ModNoteObject> parser() {
        return (n1<ModnotesMsg$ModNoteObject>)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setCreatedAt(final Int64Value createdAt_) {
        createdAt_.getClass();
        this.createdAt_ = createdAt_;
    }
    
    private void setCursor(final StringValue cursor_) {
        cursor_.getClass();
        this.cursor_ = cursor_;
    }
    
    private void setId(final StringValue id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setModActionData(final ModActionData modActionData_) {
        modActionData_.getClass();
        this.modActionData_ = modActionData_;
    }
    
    private void setOperator(final StringValue operator_) {
        operator_.getClass();
        this.operator_ = operator_;
    }
    
    private void setOperatorId(final StringValue operatorId_) {
        operatorId_.getClass();
        this.operatorId_ = operatorId_;
    }
    
    private void setSubreddit(final StringValue subreddit_) {
        subreddit_.getClass();
        this.subreddit_ = subreddit_;
    }
    
    private void setSubredditId(final StringValue subredditId_) {
        subredditId_.getClass();
        this.subredditId_ = subredditId_;
    }
    
    private void setType(final StringValue type_) {
        type_.getClass();
        this.type_ = type_;
    }
    
    private void setUser(final StringValue user_) {
        user_.getClass();
        this.user_ = user_;
    }
    
    private void setUserId(final StringValue userId_) {
        userId_.getClass();
        this.userId_ = userId_;
    }
    
    private void setUserNoteData(final UserNoteData userNoteData_) {
        userNoteData_.getClass();
        this.userNoteData_ = userNoteData_;
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
                final n1<ModnotesMsg$ModNoteObject> parser;
                if ((parser = ModnotesMsg$ModNoteObject.PARSER) == null) {
                    synchronized (ModnotesMsg$ModNoteObject.class) {
                        if (ModnotesMsg$ModNoteObject.PARSER == null) {
                            ModnotesMsg$ModNoteObject.PARSER = (n1<ModnotesMsg$ModNoteObject>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$ModNoteObject.DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t", new Object[] { "subredditId_", "operatorId_", "modActionData_", "userNoteData_", "subreddit_", "user_", "operator_", "id_", "userId_", "createdAt_", "cursor_", "type_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$ModNoteObject();
            }
        }
    }
    
    public Int64Value getCreatedAt() {
        Int64Value int64Value;
        if ((int64Value = this.createdAt_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public StringValue getCursor() {
        StringValue stringValue;
        if ((stringValue = this.cursor_) == null) {
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
    
    public ModActionData getModActionData() {
        ModActionData modActionData;
        if ((modActionData = this.modActionData_) == null) {
            modActionData = ModActionData.getDefaultInstance();
        }
        return modActionData;
    }
    
    public StringValue getOperator() {
        StringValue stringValue;
        if ((stringValue = this.operator_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getOperatorId() {
        StringValue stringValue;
        if ((stringValue = this.operatorId_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getSubreddit() {
        StringValue stringValue;
        if ((stringValue = this.subreddit_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getSubredditId() {
        StringValue stringValue;
        if ((stringValue = this.subredditId_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getType() {
        StringValue stringValue;
        if ((stringValue = this.type_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getUser() {
        StringValue stringValue;
        if ((stringValue = this.user_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getUserId() {
        StringValue stringValue;
        if ((stringValue = this.userId_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public UserNoteData getUserNoteData() {
        UserNoteData userNoteData;
        if ((userNoteData = this.userNoteData_) == null) {
            userNoteData = UserNoteData.getDefaultInstance();
        }
        return userNoteData;
    }
    
    public boolean hasCreatedAt() {
        return this.createdAt_ != null;
    }
    
    public boolean hasCursor() {
        return this.cursor_ != null;
    }
    
    public boolean hasId() {
        return this.id_ != null;
    }
    
    public boolean hasModActionData() {
        return this.modActionData_ != null;
    }
    
    public boolean hasOperator() {
        return this.operator_ != null;
    }
    
    public boolean hasOperatorId() {
        return this.operatorId_ != null;
    }
    
    public boolean hasSubreddit() {
        return this.subreddit_ != null;
    }
    
    public boolean hasSubredditId() {
        return this.subredditId_ != null;
    }
    
    public boolean hasType() {
        return this.type_ != null;
    }
    
    public boolean hasUser() {
        return this.user_ != null;
    }
    
    public boolean hasUserId() {
        return this.userId_ != null;
    }
    
    public boolean hasUserNoteData() {
        return this.userNoteData_ != null;
    }
    
    public static final class ModActionData extends GeneratedMessageLite<ModActionData, a> implements d1
    {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final ModActionData DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 4;
        public static final int DETAILS_FIELD_NUMBER = 3;
        private static volatile n1<ModActionData> PARSER;
        public static final int REDDIT_ID_FIELD_NUMBER = 2;
        private StringValue action_;
        private StringValue description_;
        private StringValue details_;
        private StringValue redditId_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)ModActionData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModActionData()));
        }
        
        private ModActionData() {
        }
        
        public static ModActionData access$7400() {
            return ModActionData.DEFAULT_INSTANCE;
        }
        
        public static void access$7500(final ModActionData modActionData, final StringValue action) {
            modActionData.setAction(action);
        }
        
        public static void access$7600(final ModActionData modActionData, final StringValue stringValue) {
            modActionData.mergeAction(stringValue);
        }
        
        public static void access$7700(final ModActionData modActionData) {
            modActionData.clearAction();
        }
        
        public static void access$7800(final ModActionData modActionData, final StringValue redditId) {
            modActionData.setRedditId(redditId);
        }
        
        public static void access$7900(final ModActionData modActionData, final StringValue stringValue) {
            modActionData.mergeRedditId(stringValue);
        }
        
        public static void access$8000(final ModActionData modActionData) {
            modActionData.clearRedditId();
        }
        
        public static void access$8100(final ModActionData modActionData, final StringValue details) {
            modActionData.setDetails(details);
        }
        
        public static void access$8200(final ModActionData modActionData, final StringValue stringValue) {
            modActionData.mergeDetails(stringValue);
        }
        
        public static void access$8300(final ModActionData modActionData) {
            modActionData.clearDetails();
        }
        
        public static void access$8400(final ModActionData modActionData, final StringValue description) {
            modActionData.setDescription(description);
        }
        
        public static void access$8500(final ModActionData modActionData, final StringValue stringValue) {
            modActionData.mergeDescription(stringValue);
        }
        
        public static void access$8600(final ModActionData modActionData) {
            modActionData.clearDescription();
        }
        
        private void clearAction() {
            this.action_ = null;
        }
        
        private void clearDescription() {
            this.description_ = null;
        }
        
        private void clearDetails() {
            this.details_ = null;
        }
        
        private void clearRedditId() {
            this.redditId_ = null;
        }
        
        public static ModActionData getDefaultInstance() {
            return ModActionData.DEFAULT_INSTANCE;
        }
        
        private void mergeAction(final StringValue action_) {
            action_.getClass();
            final StringValue action_2 = this.action_;
            if (action_2 != null && action_2 != StringValue.getDefaultInstance()) {
                this.action_ = (StringValue)w.e(this.action_, action_);
            }
            else {
                this.action_ = action_;
            }
        }
        
        private void mergeDescription(final StringValue description_) {
            description_.getClass();
            final StringValue description_2 = this.description_;
            if (description_2 != null && description_2 != StringValue.getDefaultInstance()) {
                this.description_ = (StringValue)w.e(this.description_, description_);
            }
            else {
                this.description_ = description_;
            }
        }
        
        private void mergeDetails(final StringValue details_) {
            details_.getClass();
            final StringValue details_2 = this.details_;
            if (details_2 != null && details_2 != StringValue.getDefaultInstance()) {
                this.details_ = (StringValue)w.e(this.details_, details_);
            }
            else {
                this.details_ = details_;
            }
        }
        
        private void mergeRedditId(final StringValue redditId_) {
            redditId_.getClass();
            final StringValue redditId_2 = this.redditId_;
            if (redditId_2 != null && redditId_2 != StringValue.getDefaultInstance()) {
                this.redditId_ = (StringValue)w.e(this.redditId_, redditId_);
            }
            else {
                this.redditId_ = redditId_;
            }
        }
        
        public static a newBuilder() {
            return (a)ModActionData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final ModActionData modActionData) {
            return (a)ModActionData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modActionData);
        }
        
        public static ModActionData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (ModActionData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static ModActionData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (ModActionData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static ModActionData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, byteString);
        }
        
        public static ModActionData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static ModActionData parseFrom(final l l) throws IOException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, l);
        }
        
        public static ModActionData parseFrom(final l l, final d0 d0) throws IOException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static ModActionData parseFrom(final InputStream inputStream) throws IOException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static ModActionData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static ModActionData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static ModActionData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static ModActionData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, array);
        }
        
        public static ModActionData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (ModActionData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<ModActionData> parser() {
            return (n1<ModActionData>)ModActionData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setAction(final StringValue action_) {
            action_.getClass();
            this.action_ = action_;
        }
        
        private void setDescription(final StringValue description_) {
            description_.getClass();
            this.description_ = description_;
        }
        
        private void setDetails(final StringValue details_) {
            details_.getClass();
            this.details_ = details_;
        }
        
        private void setRedditId(final StringValue redditId_) {
            redditId_.getClass();
            this.redditId_ = redditId_;
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
                    final n1<ModActionData> parser;
                    if ((parser = ModActionData.PARSER) == null) {
                        synchronized (ModActionData.class) {
                            if (ModActionData.PARSER == null) {
                                ModActionData.PARSER = (n1<ModActionData>)new GeneratedMessageLite$c((GeneratedMessageLite)ModActionData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return ModActionData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)ModActionData.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[] { "action_", "redditId_", "details_", "description_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new ModActionData();
                }
            }
        }
        
        public StringValue getAction() {
            StringValue stringValue;
            if ((stringValue = this.action_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getDescription() {
            StringValue stringValue;
            if ((stringValue = this.description_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getDetails() {
            StringValue stringValue;
            if ((stringValue = this.details_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getRedditId() {
            StringValue stringValue;
            if ((stringValue = this.redditId_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasAction() {
            return this.action_ != null;
        }
        
        public boolean hasDescription() {
            return this.description_ != null;
        }
        
        public boolean hasDetails() {
            return this.details_ != null;
        }
        
        public boolean hasRedditId() {
            return this.redditId_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<ModActionData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)ModActionData.access$7400());
            }
        }
    }
    
    public static final class UserNoteData extends GeneratedMessageLite<UserNoteData, a> implements d1
    {
        private static final UserNoteData DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 3;
        public static final int NOTE_FIELD_NUMBER = 1;
        private static volatile n1<UserNoteData> PARSER;
        public static final int REDDIT_ID_FIELD_NUMBER = 2;
        private StringValue label_;
        private StringValue note_;
        private StringValue redditId_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)UserNoteData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UserNoteData()));
        }
        
        private UserNoteData() {
        }
        
        public static UserNoteData access$8800() {
            return UserNoteData.DEFAULT_INSTANCE;
        }
        
        public static void access$8900(final UserNoteData userNoteData, final StringValue note) {
            userNoteData.setNote(note);
        }
        
        public static void access$9000(final UserNoteData userNoteData, final StringValue stringValue) {
            userNoteData.mergeNote(stringValue);
        }
        
        public static void access$9100(final UserNoteData userNoteData) {
            userNoteData.clearNote();
        }
        
        public static void access$9200(final UserNoteData userNoteData, final StringValue redditId) {
            userNoteData.setRedditId(redditId);
        }
        
        public static void access$9300(final UserNoteData userNoteData, final StringValue stringValue) {
            userNoteData.mergeRedditId(stringValue);
        }
        
        public static void access$9400(final UserNoteData userNoteData) {
            userNoteData.clearRedditId();
        }
        
        public static void access$9500(final UserNoteData userNoteData, final StringValue label) {
            userNoteData.setLabel(label);
        }
        
        public static void access$9600(final UserNoteData userNoteData, final StringValue stringValue) {
            userNoteData.mergeLabel(stringValue);
        }
        
        public static void access$9700(final UserNoteData userNoteData) {
            userNoteData.clearLabel();
        }
        
        private void clearLabel() {
            this.label_ = null;
        }
        
        private void clearNote() {
            this.note_ = null;
        }
        
        private void clearRedditId() {
            this.redditId_ = null;
        }
        
        public static UserNoteData getDefaultInstance() {
            return UserNoteData.DEFAULT_INSTANCE;
        }
        
        private void mergeLabel(final StringValue label_) {
            label_.getClass();
            final StringValue label_2 = this.label_;
            if (label_2 != null && label_2 != StringValue.getDefaultInstance()) {
                this.label_ = (StringValue)w.e(this.label_, label_);
            }
            else {
                this.label_ = label_;
            }
        }
        
        private void mergeNote(final StringValue note_) {
            note_.getClass();
            final StringValue note_2 = this.note_;
            if (note_2 != null && note_2 != StringValue.getDefaultInstance()) {
                this.note_ = (StringValue)w.e(this.note_, note_);
            }
            else {
                this.note_ = note_;
            }
        }
        
        private void mergeRedditId(final StringValue redditId_) {
            redditId_.getClass();
            final StringValue redditId_2 = this.redditId_;
            if (redditId_2 != null && redditId_2 != StringValue.getDefaultInstance()) {
                this.redditId_ = (StringValue)w.e(this.redditId_, redditId_);
            }
            else {
                this.redditId_ = redditId_;
            }
        }
        
        public static a newBuilder() {
            return (a)UserNoteData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final UserNoteData userNoteData) {
            return (a)UserNoteData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)userNoteData);
        }
        
        public static UserNoteData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (UserNoteData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserNoteData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserNoteData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserNoteData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, byteString);
        }
        
        public static UserNoteData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static UserNoteData parseFrom(final l l) throws IOException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, l);
        }
        
        public static UserNoteData parseFrom(final l l, final d0 d0) throws IOException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static UserNoteData parseFrom(final InputStream inputStream) throws IOException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserNoteData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserNoteData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static UserNoteData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static UserNoteData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, array);
        }
        
        public static UserNoteData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (UserNoteData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<UserNoteData> parser() {
            return (n1<UserNoteData>)UserNoteData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setLabel(final StringValue label_) {
            label_.getClass();
            this.label_ = label_;
        }
        
        private void setNote(final StringValue note_) {
            note_.getClass();
            this.note_ = note_;
        }
        
        private void setRedditId(final StringValue redditId_) {
            redditId_.getClass();
            this.redditId_ = redditId_;
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
                    final n1<UserNoteData> parser;
                    if ((parser = UserNoteData.PARSER) == null) {
                        synchronized (UserNoteData.class) {
                            if (UserNoteData.PARSER == null) {
                                UserNoteData.PARSER = (n1<UserNoteData>)new GeneratedMessageLite$c((GeneratedMessageLite)UserNoteData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return UserNoteData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)UserNoteData.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[] { "note_", "redditId_", "label_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new UserNoteData();
                }
            }
        }
        
        public StringValue getLabel() {
            StringValue stringValue;
            if ((stringValue = this.label_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getNote() {
            StringValue stringValue;
            if ((stringValue = this.note_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getRedditId() {
            StringValue stringValue;
            if ((stringValue = this.redditId_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasLabel() {
            return this.label_ != null;
        }
        
        public boolean hasNote() {
            return this.note_ != null;
        }
        
        public boolean hasRedditId() {
            return this.redditId_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<UserNoteData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)UserNoteData.access$8800());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$ModNoteObject, a> implements com.reddit.devvit.plugin.redditapi.modnotes.a
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$ModNoteObject.access$9900());
        }
    }
}
