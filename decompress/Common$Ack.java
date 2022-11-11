// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import m90.e;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class Common$Ack extends GeneratedMessageLite<Common$Ack, a> implements d1
{
    private static final Common$Ack DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    private static volatile n1<Common$Ack> PARSER;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private Internal$j<String> messages_;
    private boolean success_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Common$Ack.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Common$Ack()));
    }
    
    private Common$Ack() {
        this.messages_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ Common$Ack access$000() {
        return Common$Ack.DEFAULT_INSTANCE;
    }
    
    private void addAllMessages(final Iterable<String> iterable) {
        this.ensureMessagesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.messages_);
    }
    
    private void addMessages(final String s) {
        s.getClass();
        this.ensureMessagesIsMutable();
        ((List<String>)this.messages_).add(s);
    }
    
    private void addMessagesBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureMessagesIsMutable();
        ((List<String>)this.messages_).add(byteString.toStringUtf8());
    }
    
    private void clearMessages() {
        this.messages_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearSuccess() {
        this.success_ = false;
    }
    
    private void ensureMessagesIsMutable() {
        final Internal$j<String> messages_ = this.messages_;
        if (!messages_.E0()) {
            this.messages_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)messages_);
        }
    }
    
    public static Common$Ack getDefaultInstance() {
        return Common$Ack.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Common$Ack.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Common$Ack common$Ack) {
        return (a)Common$Ack.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)common$Ack);
    }
    
    public static Common$Ack parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Common$Ack)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Ack parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Ack)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Ack parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, byteString);
    }
    
    public static Common$Ack parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Common$Ack parseFrom(final l l) throws IOException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, l);
    }
    
    public static Common$Ack parseFrom(final l l, final d0 d0) throws IOException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Common$Ack parseFrom(final InputStream inputStream) throws IOException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Ack parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Ack parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Common$Ack parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Common$Ack parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, array);
    }
    
    public static Common$Ack parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Ack)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Common$Ack> parser() {
        return (n1<Common$Ack>)Common$Ack.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setMessages(final int n, final String s) {
        s.getClass();
        this.ensureMessagesIsMutable();
        ((List<String>)this.messages_).set(n, s);
    }
    
    private void setSuccess(final boolean success_) {
        this.success_ = success_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (e.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<Common$Ack> parser;
                if ((parser = Common$Ack.PARSER) == null) {
                    synchronized (Common$Ack.class) {
                        if (Common$Ack.PARSER == null) {
                            Common$Ack.PARSER = (n1<Common$Ack>)new GeneratedMessageLite$c((GeneratedMessageLite)Common$Ack.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Common$Ack.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Common$Ack.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002\u021a", new Object[] { "success_", "messages_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Common$Ack();
            }
        }
    }
    
    public String getMessages(final int n) {
        return ((List<String>)this.messages_).get(n);
    }
    
    public ByteString getMessagesBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.messages_).get(n));
    }
    
    public int getMessagesCount() {
        return ((List)this.messages_).size();
    }
    
    public List<String> getMessagesList() {
        return (List<String>)this.messages_;
    }
    
    public boolean getSuccess() {
        return this.success_;
    }
    
    public static final class a extends GeneratedMessageLite$b<Common$Ack, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Common$Ack.access$000());
        }
    }
}
