// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.newmodmail;

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

public final class NewmodmailMsg$BasicConversationRequest extends GeneratedMessageLite<NewmodmailMsg$BasicConversationRequest, a> implements d1
{
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    private static final NewmodmailMsg$BasicConversationRequest DEFAULT_INSTANCE;
    private static volatile n1<NewmodmailMsg$BasicConversationRequest> PARSER;
    private String conversationId_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)NewmodmailMsg$BasicConversationRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new NewmodmailMsg$BasicConversationRequest()));
    }
    
    private NewmodmailMsg$BasicConversationRequest() {
        this.conversationId_ = "";
    }
    
    public static NewmodmailMsg$BasicConversationRequest access$32500() {
        return NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$32600(final NewmodmailMsg$BasicConversationRequest newmodmailMsg$BasicConversationRequest, final String conversationId) {
        newmodmailMsg$BasicConversationRequest.setConversationId(conversationId);
    }
    
    public static void access$32700(final NewmodmailMsg$BasicConversationRequest newmodmailMsg$BasicConversationRequest) {
        newmodmailMsg$BasicConversationRequest.clearConversationId();
    }
    
    public static void access$32800(final NewmodmailMsg$BasicConversationRequest newmodmailMsg$BasicConversationRequest, final ByteString conversationIdBytes) {
        newmodmailMsg$BasicConversationRequest.setConversationIdBytes(conversationIdBytes);
    }
    
    private void clearConversationId() {
        this.conversationId_ = getDefaultInstance().getConversationId();
    }
    
    public static NewmodmailMsg$BasicConversationRequest getDefaultInstance() {
        return NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final NewmodmailMsg$BasicConversationRequest newmodmailMsg$BasicConversationRequest) {
        return (a)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)newmodmailMsg$BasicConversationRequest);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final l l) throws IOException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, l);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, array);
    }
    
    public static NewmodmailMsg$BasicConversationRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<NewmodmailMsg$BasicConversationRequest> parser() {
        return (n1<NewmodmailMsg$BasicConversationRequest>)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setConversationId(final String conversationId_) {
        conversationId_.getClass();
        this.conversationId_ = conversationId_;
    }
    
    private void setConversationIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.conversationId_ = byteString.toStringUtf8();
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
                final n1<NewmodmailMsg$BasicConversationRequest> parser;
                if ((parser = NewmodmailMsg$BasicConversationRequest.PARSER) == null) {
                    synchronized (NewmodmailMsg$BasicConversationRequest.class) {
                        if (NewmodmailMsg$BasicConversationRequest.PARSER == null) {
                            NewmodmailMsg$BasicConversationRequest.PARSER = (n1<NewmodmailMsg$BasicConversationRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)NewmodmailMsg$BasicConversationRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "conversationId_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new NewmodmailMsg$BasicConversationRequest();
            }
        }
    }
    
    public String getConversationId() {
        return this.conversationId_;
    }
    
    public ByteString getConversationIdBytes() {
        return ByteString.copyFromUtf8(this.conversationId_);
    }
    
    public static final class a extends GeneratedMessageLite$b<NewmodmailMsg$BasicConversationRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)NewmodmailMsg$BasicConversationRequest.access$32500());
        }
    }
}
