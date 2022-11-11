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

public final class _StreamBroker$Cursor extends GeneratedMessageLite<_StreamBroker$Cursor, a> implements d1
{
    public static final int CLOSE_AT_END_FIELD_NUMBER = 3;
    private static final _StreamBroker$Cursor DEFAULT_INSTANCE;
    public static final int OFFSET_FIELD_NUMBER = 2;
    private static volatile n1<_StreamBroker$Cursor> PARSER;
    public static final int TOPIC_FIELD_NUMBER = 1;
    private boolean closeAtEnd_;
    private long offset_;
    private String topic_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)_StreamBroker$Cursor.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new _StreamBroker$Cursor()));
    }
    
    private _StreamBroker$Cursor() {
        this.topic_ = "";
    }
    
    public static /* synthetic */ _StreamBroker$Cursor access$800() {
        return _StreamBroker$Cursor.DEFAULT_INSTANCE;
    }
    
    private void clearCloseAtEnd() {
        this.closeAtEnd_ = false;
    }
    
    private void clearOffset() {
        this.offset_ = 0L;
    }
    
    private void clearTopic() {
        this.topic_ = getDefaultInstance().getTopic();
    }
    
    public static _StreamBroker$Cursor getDefaultInstance() {
        return _StreamBroker$Cursor.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)_StreamBroker$Cursor.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final _StreamBroker$Cursor streamBroker$Cursor) {
        return (a)_StreamBroker$Cursor.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)streamBroker$Cursor);
    }
    
    public static _StreamBroker$Cursor parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _StreamBroker$Cursor parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _StreamBroker$Cursor parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, byteString);
    }
    
    public static _StreamBroker$Cursor parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static _StreamBroker$Cursor parseFrom(final l l) throws IOException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, l);
    }
    
    public static _StreamBroker$Cursor parseFrom(final l l, final d0 d0) throws IOException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, l, d0);
    }
    
    public static _StreamBroker$Cursor parseFrom(final InputStream inputStream) throws IOException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _StreamBroker$Cursor parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _StreamBroker$Cursor parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static _StreamBroker$Cursor parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static _StreamBroker$Cursor parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, array);
    }
    
    public static _StreamBroker$Cursor parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (_StreamBroker$Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<_StreamBroker$Cursor> parser() {
        return (n1<_StreamBroker$Cursor>)_StreamBroker$Cursor.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setCloseAtEnd(final boolean closeAtEnd_) {
        this.closeAtEnd_ = closeAtEnd_;
    }
    
    private void setOffset(final long offset_) {
        this.offset_ = offset_;
    }
    
    private void setTopic(final String topic_) {
        topic_.getClass();
        this.topic_ = topic_;
    }
    
    private void setTopicBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.topic_ = byteString.toStringUtf8();
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
                final n1<_StreamBroker$Cursor> parser;
                if ((parser = _StreamBroker$Cursor.PARSER) == null) {
                    synchronized (_StreamBroker$Cursor.class) {
                        if (_StreamBroker$Cursor.PARSER == null) {
                            _StreamBroker$Cursor.PARSER = (n1<_StreamBroker$Cursor>)new GeneratedMessageLite$c((GeneratedMessageLite)_StreamBroker$Cursor.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return _StreamBroker$Cursor.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)_StreamBroker$Cursor.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0007", new Object[] { "topic_", "offset_", "closeAtEnd_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new _StreamBroker$Cursor();
            }
        }
    }
    
    public boolean getCloseAtEnd() {
        return this.closeAtEnd_;
    }
    
    public long getOffset() {
        return this.offset_;
    }
    
    public String getTopic() {
        return this.topic_;
    }
    
    public ByteString getTopicBytes() {
        return ByteString.copyFromUtf8(this.topic_);
    }
    
    public static final class a extends GeneratedMessageLite$b<_StreamBroker$Cursor, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)_StreamBroker$Cursor.access$800());
        }
    }
}
