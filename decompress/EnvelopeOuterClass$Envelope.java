// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import java.util.HashMap;
import java.util.AbstractMap;
import com.google.protobuf.GeneratedMessageLite$b;
import java.util.Collections;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import m90.f;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.a;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.Value$b;
import java.util.Map;
import com.google.protobuf.ByteString;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Value;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class EnvelopeOuterClass$Envelope extends GeneratedMessageLite<EnvelopeOuterClass$Envelope, a> implements d1
{
    public static final int COMPLETE_FIELD_NUMBER = 8;
    private static final EnvelopeOuterClass$Envelope DEFAULT_INSTANCE;
    public static final int DST_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 11;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    public static final int METADATA_FIELD_NUMBER = 9;
    public static final int METHOD_FIELD_NUMBER = 3;
    private static volatile n1<EnvelopeOuterClass$Envelope> PARSER;
    public static final int REQUEST_FIELD_NUMBER = 7;
    public static final int SRC_FIELD_NUMBER = 1;
    public static final int STREAM_ID_FIELD_NUMBER = 4;
    public static final int SUCCESS_FIELD_NUMBER = 5;
    public static final int TRACE_ID_FIELD_NUMBER = 10;
    private boolean complete_;
    private String dst_;
    private String id_;
    private Value message_;
    private MapFieldLite<String, Common$Strings> metadata_;
    private String method_;
    private boolean request_;
    private String src_;
    private String streamId_;
    private boolean success_;
    private String traceId_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)EnvelopeOuterClass$Envelope.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new EnvelopeOuterClass$Envelope()));
    }
    
    private EnvelopeOuterClass$Envelope() {
        this.metadata_ = (MapFieldLite<String, Common$Strings>)MapFieldLite.emptyMapField();
        this.id_ = "";
        this.src_ = "";
        this.dst_ = "";
        this.method_ = "";
        this.streamId_ = "";
        this.traceId_ = "";
    }
    
    public static /* synthetic */ EnvelopeOuterClass$Envelope access$000() {
        return EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE;
    }
    
    private void clearComplete() {
        this.complete_ = false;
    }
    
    private void clearDst() {
        this.dst_ = getDefaultInstance().getDst();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearMessage() {
        this.message_ = null;
    }
    
    private void clearMethod() {
        this.method_ = getDefaultInstance().getMethod();
    }
    
    private void clearRequest() {
        this.request_ = false;
    }
    
    private void clearSrc() {
        this.src_ = getDefaultInstance().getSrc();
    }
    
    private void clearStreamId() {
        this.streamId_ = getDefaultInstance().getStreamId();
    }
    
    private void clearSuccess() {
        this.success_ = false;
    }
    
    private void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }
    
    public static EnvelopeOuterClass$Envelope getDefaultInstance() {
        return EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE;
    }
    
    private Map<String, Common$Strings> getMutableMetadataMap() {
        return (Map<String, Common$Strings>)this.internalGetMutableMetadata();
    }
    
    private MapFieldLite<String, Common$Strings> internalGetMetadata() {
        return this.metadata_;
    }
    
    private MapFieldLite<String, Common$Strings> internalGetMutableMetadata() {
        if (!this.metadata_.isMutable()) {
            this.metadata_ = (MapFieldLite<String, Common$Strings>)this.metadata_.mutableCopy();
        }
        return this.metadata_;
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
        return (a)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final EnvelopeOuterClass$Envelope envelopeOuterClass$Envelope) {
        return (a)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)envelopeOuterClass$Envelope);
    }
    
    public static EnvelopeOuterClass$Envelope parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, inputStream);
    }
    
    public static EnvelopeOuterClass$Envelope parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, byteString);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final l l) throws IOException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, l);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final l l, final d0 d0) throws IOException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, l, d0);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final InputStream inputStream) throws IOException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, inputStream);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, array);
    }
    
    public static EnvelopeOuterClass$Envelope parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (EnvelopeOuterClass$Envelope)GeneratedMessageLite.parseFrom((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<EnvelopeOuterClass$Envelope> parser() {
        return (n1<EnvelopeOuterClass$Envelope>)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setComplete(final boolean complete_) {
        this.complete_ = complete_;
    }
    
    private void setDst(final String dst_) {
        dst_.getClass();
        this.dst_ = dst_;
    }
    
    private void setDstBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.dst_ = byteString.toStringUtf8();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setMessage(final Value message_) {
        message_.getClass();
        this.message_ = message_;
    }
    
    private void setMethod(final String method_) {
        method_.getClass();
        this.method_ = method_;
    }
    
    private void setMethodBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.method_ = byteString.toStringUtf8();
    }
    
    private void setRequest(final boolean request_) {
        this.request_ = request_;
    }
    
    private void setSrc(final String src_) {
        src_.getClass();
        this.src_ = src_;
    }
    
    private void setSrcBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.src_ = byteString.toStringUtf8();
    }
    
    private void setStreamId(final String streamId_) {
        streamId_.getClass();
        this.streamId_ = streamId_;
    }
    
    private void setStreamIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.streamId_ = byteString.toStringUtf8();
    }
    
    private void setSuccess(final boolean success_) {
        this.success_ = success_;
    }
    
    private void setTraceId(final String traceId_) {
        traceId_.getClass();
        this.traceId_ = traceId_;
    }
    
    private void setTraceIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.traceId_ = byteString.toStringUtf8();
    }
    
    public boolean containsMetadata(final String s) {
        s.getClass();
        return ((AbstractMap)this.internalGetMetadata()).containsKey(s);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (f.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<EnvelopeOuterClass$Envelope> parser;
                if ((parser = EnvelopeOuterClass$Envelope.PARSER) == null) {
                    synchronized (EnvelopeOuterClass$Envelope.class) {
                        if (EnvelopeOuterClass$Envelope.PARSER == null) {
                            EnvelopeOuterClass$Envelope.PARSER = (n1<EnvelopeOuterClass$Envelope>)new GeneratedMessageLite$c((GeneratedMessageLite)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)EnvelopeOuterClass$Envelope.DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0007\u0006\t\u0007\u0007\b\u0007\t2\n\u0208\u000b\u0208", new Object[] { "src_", "dst_", "method_", "streamId_", "success_", "message_", "request_", "complete_", "metadata_", EnvelopeOuterClass$Envelope.EnvelopeOuterClass$Envelope$b.a, "traceId_", "id_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new EnvelopeOuterClass$Envelope();
            }
        }
    }
    
    public boolean getComplete() {
        return this.complete_;
    }
    
    public String getDst() {
        return this.dst_;
    }
    
    public ByteString getDstBytes() {
        return ByteString.copyFromUtf8(this.dst_);
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public Value getMessage() {
        Value value;
        if ((value = this.message_) == null) {
            value = Value.getDefaultInstance();
        }
        return value;
    }
    
    @Deprecated
    public Map<String, Common$Strings> getMetadata() {
        return this.getMetadataMap();
    }
    
    public int getMetadataCount() {
        return ((AbstractMap)this.internalGetMetadata()).size();
    }
    
    public Map<String, Common$Strings> getMetadataMap() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends Common$Strings>)this.internalGetMetadata());
    }
    
    public Common$Strings getMetadataOrDefault(final String s, Common$Strings common$Strings) {
        s.getClass();
        final MapFieldLite<String, Common$Strings> internalGetMetadata = this.internalGetMetadata();
        if (((HashMap)internalGetMetadata).containsKey(s)) {
            common$Strings = internalGetMetadata.get((Object)s);
        }
        return common$Strings;
    }
    
    public Common$Strings getMetadataOrThrow(final String s) {
        s.getClass();
        final MapFieldLite<String, Common$Strings> internalGetMetadata = this.internalGetMetadata();
        if (((HashMap)internalGetMetadata).containsKey(s)) {
            return internalGetMetadata.get((Object)s);
        }
        throw new IllegalArgumentException();
    }
    
    public String getMethod() {
        return this.method_;
    }
    
    public ByteString getMethodBytes() {
        return ByteString.copyFromUtf8(this.method_);
    }
    
    public boolean getRequest() {
        return this.request_;
    }
    
    public String getSrc() {
        return this.src_;
    }
    
    public ByteString getSrcBytes() {
        return ByteString.copyFromUtf8(this.src_);
    }
    
    public String getStreamId() {
        return this.streamId_;
    }
    
    public ByteString getStreamIdBytes() {
        return ByteString.copyFromUtf8(this.streamId_);
    }
    
    public boolean getSuccess() {
        return this.success_;
    }
    
    public String getTraceId() {
        return this.traceId_;
    }
    
    public ByteString getTraceIdBytes() {
        return ByteString.copyFromUtf8(this.traceId_);
    }
    
    public boolean hasMessage() {
        return this.message_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<EnvelopeOuterClass$Envelope, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)EnvelopeOuterClass$Envelope.access$000());
        }
    }
}
