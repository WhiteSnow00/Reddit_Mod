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
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import f90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class NewmodmailMsg$ArchiveConversationResponse extends GeneratedMessageLite<NewmodmailMsg$ArchiveConversationResponse, a> implements d1
{
    public static final int CONVERSATIONS_FIELD_NUMBER = 1;
    private static final NewmodmailMsg$ArchiveConversationResponse DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    public static final int MOD_ACTIONS_FIELD_NUMBER = 3;
    private static volatile n1<NewmodmailMsg$ArchiveConversationResponse> PARSER;
    private NewmodmailMsg$ConversationData conversations_;
    private MapFieldLite<String, NewmodmailMsg$MessageData> messages_;
    private MapFieldLite<String, NewmodmailMsg$ModActionData> modActions_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)NewmodmailMsg$ArchiveConversationResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new NewmodmailMsg$ArchiveConversationResponse()));
    }
    
    private NewmodmailMsg$ArchiveConversationResponse() {
        this.messages_ = (MapFieldLite<String, NewmodmailMsg$MessageData>)MapFieldLite.emptyMapField();
        this.modActions_ = (MapFieldLite<String, NewmodmailMsg$ModActionData>)MapFieldLite.emptyMapField();
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse access$43600() {
        return NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$43700(final NewmodmailMsg$ArchiveConversationResponse newmodmailMsg$ArchiveConversationResponse, final NewmodmailMsg$ConversationData conversations) {
        newmodmailMsg$ArchiveConversationResponse.setConversations(conversations);
    }
    
    public static void access$43800(final NewmodmailMsg$ArchiveConversationResponse newmodmailMsg$ArchiveConversationResponse, final NewmodmailMsg$ConversationData newmodmailMsg$ConversationData) {
        newmodmailMsg$ArchiveConversationResponse.mergeConversations(newmodmailMsg$ConversationData);
    }
    
    public static void access$43900(final NewmodmailMsg$ArchiveConversationResponse newmodmailMsg$ArchiveConversationResponse) {
        newmodmailMsg$ArchiveConversationResponse.clearConversations();
    }
    
    public static Map access$44000(final NewmodmailMsg$ArchiveConversationResponse newmodmailMsg$ArchiveConversationResponse) {
        return newmodmailMsg$ArchiveConversationResponse.getMutableMessagesMap();
    }
    
    public static Map access$44100(final NewmodmailMsg$ArchiveConversationResponse newmodmailMsg$ArchiveConversationResponse) {
        return newmodmailMsg$ArchiveConversationResponse.getMutableModActionsMap();
    }
    
    private void clearConversations() {
        this.conversations_ = null;
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse getDefaultInstance() {
        return NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE;
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
    
    public static a newBuilder() {
        return (a)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final NewmodmailMsg$ArchiveConversationResponse newmodmailMsg$ArchiveConversationResponse) {
        return (a)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)newmodmailMsg$ArchiveConversationResponse);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final l l) throws IOException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, l);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, array);
    }
    
    public static NewmodmailMsg$ArchiveConversationResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$ArchiveConversationResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<NewmodmailMsg$ArchiveConversationResponse> parser() {
        return (n1<NewmodmailMsg$ArchiveConversationResponse>)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setConversations(final NewmodmailMsg$ConversationData conversations_) {
        conversations_.getClass();
        this.conversations_ = conversations_;
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
                final n1<NewmodmailMsg$ArchiveConversationResponse> parser;
                if ((parser = NewmodmailMsg$ArchiveConversationResponse.PARSER) == null) {
                    synchronized (NewmodmailMsg$ArchiveConversationResponse.class) {
                        if (NewmodmailMsg$ArchiveConversationResponse.PARSER == null) {
                            NewmodmailMsg$ArchiveConversationResponse.PARSER = (n1<NewmodmailMsg$ArchiveConversationResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)NewmodmailMsg$ArchiveConversationResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0000\u0000\u0001\t\u00022\u00032", new Object[] { "conversations_", "messages_", b.a, "modActions_", c.a });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new NewmodmailMsg$ArchiveConversationResponse();
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
    
    public boolean hasConversations() {
        return this.conversations_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<NewmodmailMsg$ArchiveConversationResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)NewmodmailMsg$ArchiveConversationResponse.access$43600());
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
