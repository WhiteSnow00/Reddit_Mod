// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import m90.g;
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
import m90.h;
import com.google.protobuf.GeneratedMessageLite;

public final class Serializable$SerializableMethodDefinition extends GeneratedMessageLite<Serializable$SerializableMethodDefinition, a> implements h
{
    private static final Serializable$SerializableMethodDefinition DEFAULT_INSTANCE;
    public static final int FULL_NAME_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile n1<Serializable$SerializableMethodDefinition> PARSER;
    public static final int REQUEST_STREAM_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 5;
    public static final int RESPONSE_STREAM_FIELD_NUMBER = 4;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 6;
    private String fullName_;
    private String name_;
    private boolean requestStream_;
    private String requestType_;
    private boolean responseStream_;
    private String responseType_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Serializable$SerializableMethodDefinition.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Serializable$SerializableMethodDefinition()));
    }
    
    private Serializable$SerializableMethodDefinition() {
        this.fullName_ = "";
        this.name_ = "";
        this.requestType_ = "";
        this.responseType_ = "";
    }
    
    public static /* synthetic */ Serializable$SerializableMethodDefinition access$1700() {
        return Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE;
    }
    
    private void clearFullName() {
        this.fullName_ = getDefaultInstance().getFullName();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearRequestStream() {
        this.requestStream_ = false;
    }
    
    private void clearRequestType() {
        this.requestType_ = getDefaultInstance().getRequestType();
    }
    
    private void clearResponseStream() {
        this.responseStream_ = false;
    }
    
    private void clearResponseType() {
        this.responseType_ = getDefaultInstance().getResponseType();
    }
    
    public static Serializable$SerializableMethodDefinition getDefaultInstance() {
        return Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Serializable$SerializableMethodDefinition serializable$SerializableMethodDefinition) {
        return (a)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)serializable$SerializableMethodDefinition);
    }
    
    public static Serializable$SerializableMethodDefinition parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Serializable$SerializableMethodDefinition parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, byteString);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final l l) throws IOException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, l);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final l l, final d0 d0) throws IOException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final InputStream inputStream) throws IOException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, array);
    }
    
    public static Serializable$SerializableMethodDefinition parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Serializable$SerializableMethodDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Serializable$SerializableMethodDefinition> parser() {
        return (n1<Serializable$SerializableMethodDefinition>)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFullName(final String fullName_) {
        fullName_.getClass();
        this.fullName_ = fullName_;
    }
    
    private void setFullNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.fullName_ = byteString.toStringUtf8();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }
    
    private void setRequestStream(final boolean requestStream_) {
        this.requestStream_ = requestStream_;
    }
    
    private void setRequestType(final String requestType_) {
        requestType_.getClass();
        this.requestType_ = requestType_;
    }
    
    private void setRequestTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.requestType_ = byteString.toStringUtf8();
    }
    
    private void setResponseStream(final boolean responseStream_) {
        this.responseStream_ = responseStream_;
    }
    
    private void setResponseType(final String responseType_) {
        responseType_.getClass();
        this.responseType_ = responseType_;
    }
    
    private void setResponseTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.responseType_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (g.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<Serializable$SerializableMethodDefinition> parser;
                if ((parser = Serializable$SerializableMethodDefinition.PARSER) == null) {
                    synchronized (Serializable$SerializableMethodDefinition.class) {
                        if (Serializable$SerializableMethodDefinition.PARSER == null) {
                            Serializable$SerializableMethodDefinition.PARSER = (n1<Serializable$SerializableMethodDefinition>)new GeneratedMessageLite$c((GeneratedMessageLite)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Serializable$SerializableMethodDefinition.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007\u0004\u0007\u0005\u0208\u0006\u0208", new Object[] { "fullName_", "name_", "requestStream_", "responseStream_", "requestType_", "responseType_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Serializable$SerializableMethodDefinition();
            }
        }
    }
    
    public String getFullName() {
        return this.fullName_;
    }
    
    public ByteString getFullNameBytes() {
        return ByteString.copyFromUtf8(this.fullName_);
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public boolean getRequestStream() {
        return this.requestStream_;
    }
    
    public String getRequestType() {
        return this.requestType_;
    }
    
    public ByteString getRequestTypeBytes() {
        return ByteString.copyFromUtf8(this.requestType_);
    }
    
    public boolean getResponseStream() {
        return this.responseStream_;
    }
    
    public String getResponseType() {
        return this.responseType_;
    }
    
    public ByteString getResponseTypeBytes() {
        return ByteString.copyFromUtf8(this.responseType_);
    }
    
    public static final class a extends GeneratedMessageLite$b<Serializable$SerializableMethodDefinition, a> implements h
    {
        public a() {
            super((GeneratedMessageLite)Serializable$SerializableMethodDefinition.access$1700());
        }
    }
}
