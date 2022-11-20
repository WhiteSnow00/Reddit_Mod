// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.newmodmail;

import java.util.HashMap;
import java.util.AbstractMap;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.w0;
import com.google.protobuf.GeneratedMessageLite$b;
import java.util.Collections;
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
import java.util.List;
import com.google.protobuf.a;
import java.util.Map;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Internal$j;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class NewmodmailMsg$ApproveConversationResponse extends GeneratedMessageLite<NewmodmailMsg$ApproveConversationResponse, a> implements d1
{
    public static final int CONVERSATIONS_FIELD_NUMBER = 1;
    private static final NewmodmailMsg$ApproveConversationResponse DEFAULT_INSTANCE;
    public static final int EXPLANATION_FIELD_NUMBER = 8;
    public static final int FIELDS_FIELD_NUMBER = 5;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    public static final int MESSAGE_FIELD_NUMBER = 7;
    public static final int MOD_ACTIONS_FIELD_NUMBER = 4;
    private static volatile n1<NewmodmailMsg$ApproveConversationResponse> PARSER;
    public static final int REASON_FIELD_NUMBER = 6;
    public static final int USER_FIELD_NUMBER = 3;
    private NewmodmailMsg$ConversationData conversations_;
    private StringValue explanation_;
    private Internal$j<StringValue> fields_;
    private StringValue message_;
    private MapFieldLite<String, NewmodmailMsg$MessageData> messages_;
    private MapFieldLite<String, NewmodmailMsg$ModActionData> modActions_;
    private StringValue reason_;
    private NewmodmailMsg$ConversationUserData user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)NewmodmailMsg$ApproveConversationResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new NewmodmailMsg$ApproveConversationResponse()));
    }
    
    private NewmodmailMsg$ApproveConversationResponse() {
        this.messages_ = (MapFieldLite<String, NewmodmailMsg$MessageData>)MapFieldLite.emptyMapField();
        this.modActions_ = (MapFieldLite<String, NewmodmailMsg$ModActionData>)MapFieldLite.emptyMapField();
        this.fields_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static NewmodmailMsg$ApproveConversationResponse access$41100() {
        return NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$41200(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final NewmodmailMsg$ConversationData conversations) {
        newmodmailMsg$ApproveConversationResponse.setConversations(conversations);
    }
    
    public static void access$41300(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final NewmodmailMsg$ConversationData newmodmailMsg$ConversationData) {
        newmodmailMsg$ApproveConversationResponse.mergeConversations(newmodmailMsg$ConversationData);
    }
    
    public static void access$41400(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        newmodmailMsg$ApproveConversationResponse.clearConversations();
    }
    
    public static Map access$41500(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        return newmodmailMsg$ApproveConversationResponse.getMutableMessagesMap();
    }
    
    public static void access$41600(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final NewmodmailMsg$ConversationUserData user) {
        newmodmailMsg$ApproveConversationResponse.setUser(user);
    }
    
    public static void access$41700(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final NewmodmailMsg$ConversationUserData newmodmailMsg$ConversationUserData) {
        newmodmailMsg$ApproveConversationResponse.mergeUser(newmodmailMsg$ConversationUserData);
    }
    
    public static void access$41800(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        newmodmailMsg$ApproveConversationResponse.clearUser();
    }
    
    public static Map access$41900(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        return newmodmailMsg$ApproveConversationResponse.getMutableModActionsMap();
    }
    
    public static void access$42000(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final int n, final StringValue stringValue) {
        newmodmailMsg$ApproveConversationResponse.setFields(n, stringValue);
    }
    
    public static void access$42100(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final StringValue stringValue) {
        newmodmailMsg$ApproveConversationResponse.addFields(stringValue);
    }
    
    public static void access$42200(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final int n, final StringValue stringValue) {
        newmodmailMsg$ApproveConversationResponse.addFields(n, stringValue);
    }
    
    public static void access$42300(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final Iterable iterable) {
        newmodmailMsg$ApproveConversationResponse.addAllFields(iterable);
    }
    
    public static void access$42400(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        newmodmailMsg$ApproveConversationResponse.clearFields();
    }
    
    public static void access$42500(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final int n) {
        newmodmailMsg$ApproveConversationResponse.removeFields(n);
    }
    
    public static void access$42600(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final StringValue reason) {
        newmodmailMsg$ApproveConversationResponse.setReason(reason);
    }
    
    public static void access$42700(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final StringValue stringValue) {
        newmodmailMsg$ApproveConversationResponse.mergeReason(stringValue);
    }
    
    public static void access$42800(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        newmodmailMsg$ApproveConversationResponse.clearReason();
    }
    
    public static void access$42900(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final StringValue message) {
        newmodmailMsg$ApproveConversationResponse.setMessage(message);
    }
    
    public static void access$43000(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final StringValue stringValue) {
        newmodmailMsg$ApproveConversationResponse.mergeMessage(stringValue);
    }
    
    public static void access$43100(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        newmodmailMsg$ApproveConversationResponse.clearMessage();
    }
    
    public static void access$43200(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final StringValue explanation) {
        newmodmailMsg$ApproveConversationResponse.setExplanation(explanation);
    }
    
    public static void access$43300(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse, final StringValue stringValue) {
        newmodmailMsg$ApproveConversationResponse.mergeExplanation(stringValue);
    }
    
    public static void access$43400(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        newmodmailMsg$ApproveConversationResponse.clearExplanation();
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
    
    private void clearConversations() {
        this.conversations_ = null;
    }
    
    private void clearExplanation() {
        this.explanation_ = null;
    }
    
    private void clearFields() {
        this.fields_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearMessage() {
        this.message_ = null;
    }
    
    private void clearReason() {
        this.reason_ = null;
    }
    
    private void clearUser() {
        this.user_ = null;
    }
    
    private void ensureFieldsIsMutable() {
        final Internal$j<StringValue> fields_ = this.fields_;
        if (!fields_.E0()) {
            this.fields_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)fields_);
        }
    }
    
    public static NewmodmailMsg$ApproveConversationResponse getDefaultInstance() {
        return NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE;
    }
    
    private Map<String, NewmodmailMsg$MessageData> getMutableMessagesMap() {
        return (Map<String, NewmodmailMsg$MessageData>)this.internalGetMutableMessages();
    }
    
    private Map<String, NewmodmailMsg$ModActionData> getMutableModActionsMap() {
        return (Map<String, NewmodmailMsg$ModActionData>)this.internalGetMutableModActions();
    }
    
    private MapFieldLite<String, NewmodmailMsg$MessageData> internalGetMessages() {
        return this.messages_;
    }
    
    private MapFieldLite<String, NewmodmailMsg$ModActionData> internalGetModActions() {
        return this.modActions_;
    }
    
    private MapFieldLite<String, NewmodmailMsg$MessageData> internalGetMutableMessages() {
        if (!this.messages_.isMutable()) {
            this.messages_ = (MapFieldLite<String, NewmodmailMsg$MessageData>)this.messages_.mutableCopy();
        }
        return this.messages_;
    }
    
    private MapFieldLite<String, NewmodmailMsg$ModActionData> internalGetMutableModActions() {
        if (!this.modActions_.isMutable()) {
            this.modActions_ = (MapFieldLite<String, NewmodmailMsg$ModActionData>)this.modActions_.mutableCopy();
        }
        return this.modActions_;
    }
    
    private void mergeConversations(final NewmodmailMsg$ConversationData conversations_) {
        conversations_.getClass();
        final NewmodmailMsg$ConversationData conversations_2 = this.conversations_;
        if (conversations_2 != null && conversations_2 != NewmodmailMsg$ConversationData.getDefaultInstance()) {
            final NewmodmailMsg$ConversationData$a builder = NewmodmailMsg$ConversationData.newBuilder(this.conversations_);
            ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)conversations_);
            this.conversations_ = (NewmodmailMsg$ConversationData)((GeneratedMessageLite$b)builder).c();
        }
        else {
            this.conversations_ = conversations_;
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
    
    private void mergeUser(final NewmodmailMsg$ConversationUserData user_) {
        user_.getClass();
        final NewmodmailMsg$ConversationUserData user_2 = this.user_;
        if (user_2 != null && user_2 != NewmodmailMsg$ConversationUserData.getDefaultInstance()) {
            final NewmodmailMsg$ConversationUserData$a builder = NewmodmailMsg$ConversationUserData.newBuilder(this.user_);
            ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)user_);
            this.user_ = (NewmodmailMsg$ConversationUserData)((GeneratedMessageLite$b)builder).c();
        }
        else {
            this.user_ = user_;
        }
    }
    
    public static a newBuilder() {
        return (a)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final NewmodmailMsg$ApproveConversationResponse newmodmailMsg$ApproveConversationResponse) {
        return (a)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)newmodmailMsg$ApproveConversationResponse);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final l l) throws IOException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, l);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, array);
    }
    
    public static NewmodmailMsg$ApproveConversationResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ApproveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<NewmodmailMsg$ApproveConversationResponse> parser() {
        return (n1<NewmodmailMsg$ApproveConversationResponse>)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeFields(final int n) {
        this.ensureFieldsIsMutable();
        this.fields_.remove(n);
    }
    
    private void setConversations(final NewmodmailMsg$ConversationData conversations_) {
        conversations_.getClass();
        this.conversations_ = conversations_;
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
    
    private void setMessage(final StringValue message_) {
        message_.getClass();
        this.message_ = message_;
    }
    
    private void setReason(final StringValue reason_) {
        reason_.getClass();
        this.reason_ = reason_;
    }
    
    private void setUser(final NewmodmailMsg$ConversationUserData user_) {
        user_.getClass();
        this.user_ = user_;
    }
    
    public boolean containsMessages(final String s) {
        s.getClass();
        return ((AbstractMap)this.internalGetMessages()).containsKey(s);
    }
    
    public boolean containsModActions(final String s) {
        s.getClass();
        return ((AbstractMap)this.internalGetModActions()).containsKey(s);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (f90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<NewmodmailMsg$ApproveConversationResponse> parser;
                if ((parser = NewmodmailMsg$ApproveConversationResponse.PARSER) == null) {
                    synchronized (NewmodmailMsg$ApproveConversationResponse.class) {
                        if (NewmodmailMsg$ApproveConversationResponse.PARSER == null) {
                            NewmodmailMsg$ApproveConversationResponse.PARSER = (n1<NewmodmailMsg$ApproveConversationResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)NewmodmailMsg$ApproveConversationResponse.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0002\u0001\u0000\u0001\t\u00022\u0003\t\u00042\u0005\u001b\u0006\t\u0007\t\b\t", new Object[] { "conversations_", "messages_", b.a, "user_", "modActions_", c.a, "fields_", StringValue.class, "reason_", "message_", "explanation_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new NewmodmailMsg$ApproveConversationResponse();
            }
        }
    }
    
    public NewmodmailMsg$ConversationData getConversations() {
        NewmodmailMsg$ConversationData newmodmailMsg$ConversationData;
        if ((newmodmailMsg$ConversationData = this.conversations_) == null) {
            newmodmailMsg$ConversationData = NewmodmailMsg$ConversationData.getDefaultInstance();
        }
        return newmodmailMsg$ConversationData;
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
    
    public StringValue getMessage() {
        StringValue stringValue;
        if ((stringValue = this.message_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    @Deprecated
    public Map<String, NewmodmailMsg$MessageData> getMessages() {
        return this.getMessagesMap();
    }
    
    public int getMessagesCount() {
        return ((AbstractMap)this.internalGetMessages()).size();
    }
    
    public Map<String, NewmodmailMsg$MessageData> getMessagesMap() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends NewmodmailMsg$MessageData>)this.internalGetMessages());
    }
    
    public NewmodmailMsg$MessageData getMessagesOrDefault(final String s, NewmodmailMsg$MessageData newmodmailMsg$MessageData) {
        s.getClass();
        final MapFieldLite<String, NewmodmailMsg$MessageData> internalGetMessages = this.internalGetMessages();
        if (((HashMap)internalGetMessages).containsKey(s)) {
            newmodmailMsg$MessageData = internalGetMessages.get((Object)s);
        }
        return newmodmailMsg$MessageData;
    }
    
    public NewmodmailMsg$MessageData getMessagesOrThrow(final String s) {
        s.getClass();
        final MapFieldLite<String, NewmodmailMsg$MessageData> internalGetMessages = this.internalGetMessages();
        if (((HashMap)internalGetMessages).containsKey(s)) {
            return internalGetMessages.get((Object)s);
        }
        throw new IllegalArgumentException();
    }
    
    @Deprecated
    public Map<String, NewmodmailMsg$ModActionData> getModActions() {
        return this.getModActionsMap();
    }
    
    public int getModActionsCount() {
        return ((AbstractMap)this.internalGetModActions()).size();
    }
    
    public Map<String, NewmodmailMsg$ModActionData> getModActionsMap() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends NewmodmailMsg$ModActionData>)this.internalGetModActions());
    }
    
    public NewmodmailMsg$ModActionData getModActionsOrDefault(final String s, NewmodmailMsg$ModActionData newmodmailMsg$ModActionData) {
        s.getClass();
        final MapFieldLite<String, NewmodmailMsg$ModActionData> internalGetModActions = this.internalGetModActions();
        if (((HashMap)internalGetModActions).containsKey(s)) {
            newmodmailMsg$ModActionData = internalGetModActions.get((Object)s);
        }
        return newmodmailMsg$ModActionData;
    }
    
    public NewmodmailMsg$ModActionData getModActionsOrThrow(final String s) {
        s.getClass();
        final MapFieldLite<String, NewmodmailMsg$ModActionData> internalGetModActions = this.internalGetModActions();
        if (((HashMap)internalGetModActions).containsKey(s)) {
            return internalGetModActions.get((Object)s);
        }
        throw new IllegalArgumentException();
    }
    
    public StringValue getReason() {
        StringValue stringValue;
        if ((stringValue = this.reason_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public NewmodmailMsg$ConversationUserData getUser() {
        NewmodmailMsg$ConversationUserData newmodmailMsg$ConversationUserData;
        if ((newmodmailMsg$ConversationUserData = this.user_) == null) {
            newmodmailMsg$ConversationUserData = NewmodmailMsg$ConversationUserData.getDefaultInstance();
        }
        return newmodmailMsg$ConversationUserData;
    }
    
    public boolean hasConversations() {
        return this.conversations_ != null;
    }
    
    public boolean hasExplanation() {
        return this.explanation_ != null;
    }
    
    public boolean hasMessage() {
        return this.message_ != null;
    }
    
    public boolean hasReason() {
        return this.reason_ != null;
    }
    
    public boolean hasUser() {
        return this.user_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<NewmodmailMsg$ApproveConversationResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)NewmodmailMsg$ApproveConversationResponse.access$41100());
        }
    }
    
    public static final class b
    {
        public static final w0<String, NewmodmailMsg$MessageData> a;
        
        static {
            a = new w0(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, (Object)NewmodmailMsg$MessageData.getDefaultInstance());
        }
    }
    
    public static final class c
    {
        public static final w0<String, NewmodmailMsg$ModActionData> a;
        
        static {
            a = new w0(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, (Object)NewmodmailMsg$ModActionData.getDefaultInstance());
        }
    }
}
