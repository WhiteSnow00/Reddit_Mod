// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import m90.e;
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

public final class Common$Str extends GeneratedMessageLite<Common$Str, a> implements d1
{
    private static final Common$Str DEFAULT_INSTANCE;
    private static volatile n1<Common$Str> PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Common$Str.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Common$Str()));
    }
    
    private Common$Str() {
        this.value_ = "";
    }
    
    public static /* synthetic */ Common$Str access$2100() {
        return Common$Str.DEFAULT_INSTANCE;
    }
    
    private void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }
    
    public static Common$Str getDefaultInstance() {
        return Common$Str.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Common$Str.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Common$Str common$Str) {
        return (a)Common$Str.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)common$Str);
    }
    
    public static Common$Str parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Common$Str)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Str parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Str)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Str parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, byteString);
    }
    
    public static Common$Str parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Common$Str parseFrom(final l l) throws IOException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, l);
    }
    
    public static Common$Str parseFrom(final l l, final d0 d0) throws IOException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Common$Str parseFrom(final InputStream inputStream) throws IOException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Str parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Str parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Common$Str parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Common$Str parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, array);
    }
    
    public static Common$Str parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Str)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Common$Str> parser() {
        return (n1<Common$Str>)Common$Str.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setValue(final String value_) {
        value_.getClass();
        this.value_ = value_;
    }
    
    private void setValueBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.toStringUtf8();
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
                final n1<Common$Str> parser;
                if ((parser = Common$Str.PARSER) == null) {
                    synchronized (Common$Str.class) {
                        if (Common$Str.PARSER == null) {
                            Common$Str.PARSER = (n1<Common$Str>)new GeneratedMessageLite$c((GeneratedMessageLite)Common$Str.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Common$Str.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Common$Str.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "value_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Common$Str();
            }
        }
    }
    
    public String getValue() {
        return this.value_;
    }
    
    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }
    
    public static final class a extends GeneratedMessageLite$b<Common$Str, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Common$Str.access$2100());
        }
    }
}
