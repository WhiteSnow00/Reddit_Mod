// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.kvstore;

import java.util.HashMap;
import java.util.AbstractMap;
import com.google.protobuf.GeneratedMessageLite$b;
import java.util.Collections;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import x80.a;
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

public final class _KVStore$MessageSet extends GeneratedMessageLite<_KVStore$MessageSet, a> implements d1
{
    private static final _KVStore$MessageSet DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile n1<_KVStore$MessageSet> PARSER;
    private MapFieldLite<String, String> messages_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)_KVStore$MessageSet.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new _KVStore$MessageSet()));
    }
    
    private _KVStore$MessageSet() {
        this.messages_ = (MapFieldLite<String, String>)MapFieldLite.emptyMapField();
    }
    
    public static /* synthetic */ _KVStore$MessageSet access$000() {
        return _KVStore$MessageSet.DEFAULT_INSTANCE;
    }
    
    public static _KVStore$MessageSet getDefaultInstance() {
        return _KVStore$MessageSet.DEFAULT_INSTANCE;
    }
    
    private Map<String, String> getMutableMessagesMap() {
        return (Map<String, String>)this.internalGetMutableMessages();
    }
    
    private MapFieldLite<String, String> internalGetMessages() {
        return this.messages_;
    }
    
    private MapFieldLite<String, String> internalGetMutableMessages() {
        if (!this.messages_.isMutable()) {
            this.messages_ = (MapFieldLite<String, String>)this.messages_.mutableCopy();
        }
        return this.messages_;
    }
    
    public static a newBuilder() {
        return (a)_KVStore$MessageSet.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final _KVStore$MessageSet set) {
        return (a)_KVStore$MessageSet.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)set);
    }
    
    public static _KVStore$MessageSet parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _KVStore$MessageSet parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _KVStore$MessageSet parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, byteString);
    }
    
    public static _KVStore$MessageSet parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static _KVStore$MessageSet parseFrom(final l l) throws IOException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, l);
    }
    
    public static _KVStore$MessageSet parseFrom(final l l, final d0 d0) throws IOException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, l, d0);
    }
    
    public static _KVStore$MessageSet parseFrom(final InputStream inputStream) throws IOException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _KVStore$MessageSet parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _KVStore$MessageSet parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static _KVStore$MessageSet parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static _KVStore$MessageSet parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, array);
    }
    
    public static _KVStore$MessageSet parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$MessageSet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<_KVStore$MessageSet> parser() {
        return (n1<_KVStore$MessageSet>)_KVStore$MessageSet.DEFAULT_INSTANCE.getParserForType();
    }
    
    public boolean containsMessages(final String s) {
        s.getClass();
        return ((AbstractMap)this.internalGetMessages()).containsKey(s);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (x80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<_KVStore$MessageSet> parser;
                if ((parser = _KVStore$MessageSet.PARSER) == null) {
                    synchronized (_KVStore$MessageSet.class) {
                        if (_KVStore$MessageSet.PARSER == null) {
                            _KVStore$MessageSet.PARSER = (n1<_KVStore$MessageSet>)new GeneratedMessageLite$c((GeneratedMessageLite)_KVStore$MessageSet.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return _KVStore$MessageSet.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)_KVStore$MessageSet.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "messages_", _KVStore$MessageSet._KVStore$MessageSet$b.a });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new _KVStore$MessageSet();
            }
        }
    }
    
    @Deprecated
    public Map<String, String> getMessages() {
        return this.getMessagesMap();
    }
    
    public int getMessagesCount() {
        return ((AbstractMap)this.internalGetMessages()).size();
    }
    
    public Map<String, String> getMessagesMap() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends String>)this.internalGetMessages());
    }
    
    public String getMessagesOrDefault(final String s, String s2) {
        s.getClass();
        final MapFieldLite<String, String> internalGetMessages = this.internalGetMessages();
        if (((HashMap)internalGetMessages).containsKey(s)) {
            s2 = internalGetMessages.get((Object)s);
        }
        return s2;
    }
    
    public String getMessagesOrThrow(final String s) {
        s.getClass();
        final MapFieldLite<String, String> internalGetMessages = this.internalGetMessages();
        if (((HashMap)internalGetMessages).containsKey(s)) {
            return internalGetMessages.get((Object)s);
        }
        throw new IllegalArgumentException();
    }
    
    public static final class a extends GeneratedMessageLite$b<_KVStore$MessageSet, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)_KVStore$MessageSet.access$000());
        }
    }
}
