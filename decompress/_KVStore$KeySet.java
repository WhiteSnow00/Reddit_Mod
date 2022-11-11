// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.kvstore;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
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

public final class _KVStore$KeySet extends GeneratedMessageLite<_KVStore$KeySet, a> implements d1
{
    private static final _KVStore$KeySet DEFAULT_INSTANCE;
    public static final int KEYS_FIELD_NUMBER = 1;
    private static volatile n1<_KVStore$KeySet> PARSER;
    private Internal$j<String> keys_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)_KVStore$KeySet.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new _KVStore$KeySet()));
    }
    
    private _KVStore$KeySet() {
        this.keys_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ _KVStore$KeySet access$300() {
        return _KVStore$KeySet.DEFAULT_INSTANCE;
    }
    
    private void addAllKeys(final Iterable<String> iterable) {
        this.ensureKeysIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.keys_);
    }
    
    private void addKeys(final String s) {
        s.getClass();
        this.ensureKeysIsMutable();
        ((List<String>)this.keys_).add(s);
    }
    
    private void addKeysBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureKeysIsMutable();
        ((List<String>)this.keys_).add(byteString.toStringUtf8());
    }
    
    private void clearKeys() {
        this.keys_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureKeysIsMutable() {
        final Internal$j<String> keys_ = this.keys_;
        if (!keys_.E0()) {
            this.keys_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)keys_);
        }
    }
    
    public static _KVStore$KeySet getDefaultInstance() {
        return _KVStore$KeySet.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)_KVStore$KeySet.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final _KVStore$KeySet set) {
        return (a)_KVStore$KeySet.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)set);
    }
    
    public static _KVStore$KeySet parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _KVStore$KeySet parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _KVStore$KeySet parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, byteString);
    }
    
    public static _KVStore$KeySet parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static _KVStore$KeySet parseFrom(final l l) throws IOException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, l);
    }
    
    public static _KVStore$KeySet parseFrom(final l l, final d0 d0) throws IOException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, l, d0);
    }
    
    public static _KVStore$KeySet parseFrom(final InputStream inputStream) throws IOException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _KVStore$KeySet parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _KVStore$KeySet parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static _KVStore$KeySet parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static _KVStore$KeySet parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, array);
    }
    
    public static _KVStore$KeySet parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$KeySet)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<_KVStore$KeySet> parser() {
        return (n1<_KVStore$KeySet>)_KVStore$KeySet.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setKeys(final int n, final String s) {
        s.getClass();
        this.ensureKeysIsMutable();
        ((List<String>)this.keys_).set(n, s);
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
                final n1<_KVStore$KeySet> parser;
                if ((parser = _KVStore$KeySet.PARSER) == null) {
                    synchronized (_KVStore$KeySet.class) {
                        if (_KVStore$KeySet.PARSER == null) {
                            _KVStore$KeySet.PARSER = (n1<_KVStore$KeySet>)new GeneratedMessageLite$c((GeneratedMessageLite)_KVStore$KeySet.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return _KVStore$KeySet.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)_KVStore$KeySet.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a", new Object[] { "keys_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new _KVStore$KeySet();
            }
        }
    }
    
    public String getKeys(final int n) {
        return ((List<String>)this.keys_).get(n);
    }
    
    public ByteString getKeysBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.keys_).get(n));
    }
    
    public int getKeysCount() {
        return ((List)this.keys_).size();
    }
    
    public List<String> getKeysList() {
        return (List<String>)this.keys_;
    }
    
    public static final class a extends GeneratedMessageLite$b<_KVStore$KeySet, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)_KVStore$KeySet.access$300());
        }
    }
}
