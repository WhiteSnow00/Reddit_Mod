// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.http;

import java.util.HashMap;
import java.util.AbstractMap;
import com.google.protobuf.GeneratedMessageLite$b;
import java.util.Collections;
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
import java.util.Map;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class _HTTP$RequestData extends GeneratedMessageLite<_HTTP$RequestData, a> implements d1
{
    public static final int BODY_FIELD_NUMBER = 3;
    private static final _HTTP$RequestData DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 2;
    public static final int METHOD_FIELD_NUMBER = 1;
    private static volatile n1<_HTTP$RequestData> PARSER;
    private ByteString body_;
    private MapFieldLite<String, String> headers_;
    private String method_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)_HTTP$RequestData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new _HTTP$RequestData()));
    }
    
    private _HTTP$RequestData() {
        this.headers_ = (MapFieldLite<String, String>)MapFieldLite.emptyMapField();
        this.method_ = "";
        this.body_ = ByteString.EMPTY;
    }
    
    public static /* synthetic */ _HTTP$RequestData access$800() {
        return _HTTP$RequestData.DEFAULT_INSTANCE;
    }
    
    private void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }
    
    private void clearMethod() {
        this.method_ = getDefaultInstance().getMethod();
    }
    
    public static _HTTP$RequestData getDefaultInstance() {
        return _HTTP$RequestData.DEFAULT_INSTANCE;
    }
    
    private Map<String, String> getMutableHeadersMap() {
        return (Map<String, String>)this.internalGetMutableHeaders();
    }
    
    private MapFieldLite<String, String> internalGetHeaders() {
        return this.headers_;
    }
    
    private MapFieldLite<String, String> internalGetMutableHeaders() {
        if (!this.headers_.isMutable()) {
            this.headers_ = (MapFieldLite<String, String>)this.headers_.mutableCopy();
        }
        return this.headers_;
    }
    
    public static a newBuilder() {
        return (a)_HTTP$RequestData.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final _HTTP$RequestData http$RequestData) {
        return (a)_HTTP$RequestData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)http$RequestData);
    }
    
    public static _HTTP$RequestData parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _HTTP$RequestData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _HTTP$RequestData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, byteString);
    }
    
    public static _HTTP$RequestData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static _HTTP$RequestData parseFrom(final l l) throws IOException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, l);
    }
    
    public static _HTTP$RequestData parseFrom(final l l, final d0 d0) throws IOException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, l, d0);
    }
    
    public static _HTTP$RequestData parseFrom(final InputStream inputStream) throws IOException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, inputStream);
    }
    
    public static _HTTP$RequestData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static _HTTP$RequestData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static _HTTP$RequestData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static _HTTP$RequestData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, array);
    }
    
    public static _HTTP$RequestData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (_HTTP$RequestData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<_HTTP$RequestData> parser() {
        return (n1<_HTTP$RequestData>)_HTTP$RequestData.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setBody(final ByteString body_) {
        body_.getClass();
        this.body_ = body_;
    }
    
    private void setMethod(final String method_) {
        method_.getClass();
        this.method_ = method_;
    }
    
    private void setMethodBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.method_ = byteString.toStringUtf8();
    }
    
    public boolean containsHeaders(final String s) {
        s.getClass();
        return ((AbstractMap)this.internalGetHeaders()).containsKey(s);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (v80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<_HTTP$RequestData> parser;
                if ((parser = _HTTP$RequestData.PARSER) == null) {
                    synchronized (_HTTP$RequestData.class) {
                        if (_HTTP$RequestData.PARSER == null) {
                            _HTTP$RequestData.PARSER = (n1<_HTTP$RequestData>)new GeneratedMessageLite$c((GeneratedMessageLite)_HTTP$RequestData.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return _HTTP$RequestData.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)_HTTP$RequestData.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0208\u00022\u0003\n", new Object[] { "method_", "headers_", _HTTP$RequestData._HTTP$RequestData$b.a, "body_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new _HTTP$RequestData();
            }
        }
    }
    
    public ByteString getBody() {
        return this.body_;
    }
    
    @Deprecated
    public Map<String, String> getHeaders() {
        return this.getHeadersMap();
    }
    
    public int getHeadersCount() {
        return ((AbstractMap)this.internalGetHeaders()).size();
    }
    
    public Map<String, String> getHeadersMap() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends String>)this.internalGetHeaders());
    }
    
    public String getHeadersOrDefault(final String s, String s2) {
        s.getClass();
        final MapFieldLite<String, String> internalGetHeaders = this.internalGetHeaders();
        if (((HashMap)internalGetHeaders).containsKey(s)) {
            s2 = internalGetHeaders.get((Object)s);
        }
        return s2;
    }
    
    public String getHeadersOrThrow(final String s) {
        s.getClass();
        final MapFieldLite<String, String> internalGetHeaders = this.internalGetHeaders();
        if (((HashMap)internalGetHeaders).containsKey(s)) {
            return internalGetHeaders.get((Object)s);
        }
        throw new IllegalArgumentException();
    }
    
    public String getMethod() {
        return this.method_;
    }
    
    public ByteString getMethodBytes() {
        return ByteString.copyFromUtf8(this.method_);
    }
    
    public static final class a extends GeneratedMessageLite$b<_HTTP$RequestData, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)_HTTP$RequestData.access$800());
        }
    }
}
