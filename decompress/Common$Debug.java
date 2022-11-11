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
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.Value$b;
import com.google.protobuf.Value;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class Common$Debug extends GeneratedMessageLite<Common$Debug, a> implements d1
{
    private static final Common$Debug DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile n1<Common$Debug> PARSER;
    private Value message_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Common$Debug.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Common$Debug()));
    }
    
    private Common$Debug() {
    }
    
    public static /* synthetic */ Common$Debug access$900() {
        return Common$Debug.DEFAULT_INSTANCE;
    }
    
    private void clearMessage() {
        this.message_ = null;
    }
    
    public static Common$Debug getDefaultInstance() {
        return Common$Debug.DEFAULT_INSTANCE;
    }
    
    private void mergeMessage(final Value message_) {
        message_.getClass();
        final Value message_2 = this.message_;
        if (message_2 != null && message_2 != Value.getDefaultInstance()) {
            final Value$b builder = Value.newBuilder(this.message_);
            ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)message_);
            this.message_ = (Value)((GeneratedMessageLite$b)builder).d();
        }
        else {
            this.message_ = message_;
        }
    }
    
    public static a newBuilder() {
        return (a)Common$Debug.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Common$Debug common$Debug) {
        return (a)Common$Debug.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)common$Debug);
    }
    
    public static Common$Debug parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Common$Debug)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Debug parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Debug)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Debug parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, byteString);
    }
    
    public static Common$Debug parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Common$Debug parseFrom(final l l) throws IOException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, l);
    }
    
    public static Common$Debug parseFrom(final l l, final d0 d0) throws IOException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Common$Debug parseFrom(final InputStream inputStream) throws IOException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Debug parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Debug parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Common$Debug parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Common$Debug parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, array);
    }
    
    public static Common$Debug parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Debug)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Common$Debug> parser() {
        return (n1<Common$Debug>)Common$Debug.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setMessage(final Value message_) {
        message_.getClass();
        this.message_ = message_;
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
                final n1<Common$Debug> parser;
                if ((parser = Common$Debug.PARSER) == null) {
                    synchronized (Common$Debug.class) {
                        if (Common$Debug.PARSER == null) {
                            Common$Debug.PARSER = (n1<Common$Debug>)new GeneratedMessageLite$c((GeneratedMessageLite)Common$Debug.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Common$Debug.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Common$Debug.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "message_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Common$Debug();
            }
        }
    }
    
    public Value getMessage() {
        Value value;
        if ((value = this.message_) == null) {
            value = Value.getDefaultInstance();
        }
        return value;
    }
    
    public boolean hasMessage() {
        return this.message_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<Common$Debug, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Common$Debug.access$900());
        }
    }
}
