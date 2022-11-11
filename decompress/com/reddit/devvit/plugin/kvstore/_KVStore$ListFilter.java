// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.kvstore;

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

public final class _KVStore$ListFilter extends GeneratedMessageLite<_KVStore$ListFilter, a> implements d1
{
    private static final _KVStore$ListFilter DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    private static volatile n1<_KVStore$ListFilter> PARSER;
    private String filter_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)_KVStore$ListFilter.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new _KVStore$ListFilter()));
    }
    
    private _KVStore$ListFilter() {
        this.filter_ = "";
    }
    
    public static /* synthetic */ _KVStore$ListFilter access$1000() {
        return _KVStore$ListFilter.DEFAULT_INSTANCE;
    }
    
    private void clearFilter() {
        this.filter_ = getDefaultInstance().getFilter();
    }
    
    public static _KVStore$ListFilter getDefaultInstance() {
        return _KVStore$ListFilter.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)_KVStore$ListFilter.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final _KVStore$ListFilter kvStore$ListFilter) {
        return (a)_KVStore$ListFilter.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)kvStore$ListFilter);
    }
    
    public static _KVStore$ListFilter parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _KVStore$ListFilter parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _KVStore$ListFilter parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, byteString);
    }
    
    public static _KVStore$ListFilter parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static _KVStore$ListFilter parseFrom(final l l) throws IOException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, l);
    }
    
    public static _KVStore$ListFilter parseFrom(final l l, final d0 d0) throws IOException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, l, d0);
    }
    
    public static _KVStore$ListFilter parseFrom(final InputStream inputStream) throws IOException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _KVStore$ListFilter parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _KVStore$ListFilter parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static _KVStore$ListFilter parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static _KVStore$ListFilter parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, array);
    }
    
    public static _KVStore$ListFilter parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (_KVStore$ListFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<_KVStore$ListFilter> parser() {
        return (n1<_KVStore$ListFilter>)_KVStore$ListFilter.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFilter(final String filter_) {
        filter_.getClass();
        this.filter_ = filter_;
    }
    
    private void setFilterBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.filter_ = byteString.toStringUtf8();
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
                final n1<_KVStore$ListFilter> parser;
                if ((parser = _KVStore$ListFilter.PARSER) == null) {
                    synchronized (_KVStore$ListFilter.class) {
                        if (_KVStore$ListFilter.PARSER == null) {
                            _KVStore$ListFilter.PARSER = (n1<_KVStore$ListFilter>)new GeneratedMessageLite$c((GeneratedMessageLite)_KVStore$ListFilter.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return _KVStore$ListFilter.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)_KVStore$ListFilter.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "filter_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new _KVStore$ListFilter();
            }
        }
    }
    
    public String getFilter() {
        return this.filter_;
    }
    
    public ByteString getFilterBytes() {
        return ByteString.copyFromUtf8(this.filter_);
    }
    
    public static final class a extends GeneratedMessageLite$b<_KVStore$ListFilter, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)_KVStore$ListFilter.access$1000());
        }
    }
}
