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

public final class NewmodmailMsg$BasicConversationsRequest extends GeneratedMessageLite<NewmodmailMsg$BasicConversationsRequest, a> implements d1
{
    public static final int CONVERSATION_IDS_FIELD_NUMBER = 1;
    private static final NewmodmailMsg$BasicConversationsRequest DEFAULT_INSTANCE;
    private static volatile n1<NewmodmailMsg$BasicConversationsRequest> PARSER;
    private String conversationIds_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)NewmodmailMsg$BasicConversationsRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new NewmodmailMsg$BasicConversationsRequest()));
    }
    
    private NewmodmailMsg$BasicConversationsRequest() {
        this.conversationIds_ = "";
    }
    
    public static NewmodmailMsg$BasicConversationsRequest access$33000() {
        return NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$33100(final NewmodmailMsg$BasicConversationsRequest newmodmailMsg$BasicConversationsRequest, final String conversationIds) {
        newmodmailMsg$BasicConversationsRequest.setConversationIds(conversationIds);
    }
    
    public static void access$33200(final NewmodmailMsg$BasicConversationsRequest newmodmailMsg$BasicConversationsRequest) {
        newmodmailMsg$BasicConversationsRequest.clearConversationIds();
    }
    
    public static void access$33300(final NewmodmailMsg$BasicConversationsRequest newmodmailMsg$BasicConversationsRequest, final ByteString conversationIdsBytes) {
        newmodmailMsg$BasicConversationsRequest.setConversationIdsBytes(conversationIdsBytes);
    }
    
    private void clearConversationIds() {
        this.conversationIds_ = getDefaultInstance().getConversationIds();
    }
    
    public static NewmodmailMsg$BasicConversationsRequest getDefaultInstance() {
        return NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final NewmodmailMsg$BasicConversationsRequest newmodmailMsg$BasicConversationsRequest) {
        return (a)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)newmodmailMsg$BasicConversationsRequest);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final l l) throws IOException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, l);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final InputStream inputStream) throws IOException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, array);
    }
    
    public static NewmodmailMsg$BasicConversationsRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (NewmodmailMsg$BasicConversationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<NewmodmailMsg$BasicConversationsRequest> parser() {
        return (n1<NewmodmailMsg$BasicConversationsRequest>)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setConversationIds(final String conversationIds_) {
        conversationIds_.getClass();
        this.conversationIds_ = conversationIds_;
    }
    
    private void setConversationIdsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.conversationIds_ = byteString.toStringUtf8();
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
                final n1<NewmodmailMsg$BasicConversationsRequest> parser;
                if ((parser = NewmodmailMsg$BasicConversationsRequest.PARSER) == null) {
                    synchronized (NewmodmailMsg$BasicConversationsRequest.class) {
                        if (NewmodmailMsg$BasicConversationsRequest.PARSER == null) {
                            NewmodmailMsg$BasicConversationsRequest.PARSER = (n1<NewmodmailMsg$BasicConversationsRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)NewmodmailMsg$BasicConversationsRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "conversationIds_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new NewmodmailMsg$BasicConversationsRequest();
            }
        }
    }
    
    public String getConversationIds() {
        return this.conversationIds_;
    }
    
    public ByteString getConversationIdsBytes() {
        return ByteString.copyFromUtf8(this.conversationIds_);
    }
    
    public static final class a extends GeneratedMessageLite$b<NewmodmailMsg$BasicConversationsRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)NewmodmailMsg$BasicConversationsRequest.access$33000());
        }
    }
}
