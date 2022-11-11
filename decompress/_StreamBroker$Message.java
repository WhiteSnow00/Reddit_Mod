// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.streambroker;

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

public final class _StreamBroker$Message extends GeneratedMessageLite<_StreamBroker$Message, a> implements d1
{
    private static final _StreamBroker$Message DEFAULT_INSTANCE;
    private static volatile n1<_StreamBroker$Message> PARSER;
    public static final int TOPIC_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String topic_;
    private String value_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)_StreamBroker$Message.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new _StreamBroker$Message()));
    }
    
    private _StreamBroker$Message() {
        this.topic_ = "";
        this.value_ = "";
    }
    
    public static /* synthetic */ _StreamBroker$Message access$000() {
        return _StreamBroker$Message.DEFAULT_INSTANCE;
    }
    
    private void clearTopic() {
        this.topic_ = getDefaultInstance().getTopic();
    }
    
    private void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }
    
    public static _StreamBroker$Message getDefaultInstance() {
        return _StreamBroker$Message.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)_StreamBroker$Message.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final _StreamBroker$Message streamBroker$Message) {
        return (a)_StreamBroker$Message.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)streamBroker$Message);
    }
    
    public static _StreamBroker$Message parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _StreamBroker$Message parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _StreamBroker$Message parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, byteString);
    }
    
    public static _StreamBroker$Message parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static _StreamBroker$Message parseFrom(final l l) throws IOException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, l);
    }
    
    public static _StreamBroker$Message parseFrom(final l l, final d0 d0) throws IOException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, l, d0);
    }
    
    public static _StreamBroker$Message parseFrom(final InputStream inputStream) throws IOException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _StreamBroker$Message parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _StreamBroker$Message parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static _StreamBroker$Message parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static _StreamBroker$Message parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, array);
    }
    
    public static _StreamBroker$Message parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (_StreamBroker$Message)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<_StreamBroker$Message> parser() {
        return (n1<_StreamBroker$Message>)_StreamBroker$Message.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setTopic(final String topic_) {
        topic_.getClass();
        this.topic_ = topic_;
    }
    
    private void setTopicBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.topic_ = byteString.toStringUtf8();
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
        switch (k90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<_StreamBroker$Message> parser;
                if ((parser = _StreamBroker$Message.PARSER) == null) {
                    synchronized (_StreamBroker$Message.class) {
                        if (_StreamBroker$Message.PARSER == null) {
                            _StreamBroker$Message.PARSER = (n1<_StreamBroker$Message>)new GeneratedMessageLite$c((GeneratedMessageLite)_StreamBroker$Message.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return _StreamBroker$Message.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)_StreamBroker$Message.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "topic_", "value_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new _StreamBroker$Message();
            }
        }
    }
    
    public String getTopic() {
        return this.topic_;
    }
    
    public ByteString getTopicBytes() {
        return ByteString.copyFromUtf8(this.topic_);
    }
    
    public String getValue() {
        return this.value_;
    }
    
    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }
    
    public static final class a extends GeneratedMessageLite$b<_StreamBroker$Message, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)_StreamBroker$Message.access$000());
        }
    }
}
