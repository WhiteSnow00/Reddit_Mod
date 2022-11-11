// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.common;

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
import z80.b;
import com.google.protobuf.GeneratedMessageLite;

public final class CommonMsg$WrappedRedditObject extends GeneratedMessageLite<CommonMsg$WrappedRedditObject, a> implements b
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final CommonMsg$WrappedRedditObject DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<CommonMsg$WrappedRedditObject> PARSER;
    private CommonMsg$RedditObject data_;
    private String kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)CommonMsg$WrappedRedditObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new CommonMsg$WrappedRedditObject()));
    }
    
    private CommonMsg$WrappedRedditObject() {
        this.kind_ = "";
    }
    
    public static /* synthetic */ CommonMsg$WrappedRedditObject access$2500() {
        return CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE;
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }
    
    public static CommonMsg$WrappedRedditObject getDefaultInstance() {
        return CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final CommonMsg$RedditObject data_) {
        data_.getClass();
        final CommonMsg$RedditObject data_2 = this.data_;
        if (data_2 != null && data_2 != CommonMsg$RedditObject.getDefaultInstance()) {
            final CommonMsg$RedditObject.b builder = CommonMsg$RedditObject.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (CommonMsg$RedditObject)builder.d();
        }
        else {
            this.data_ = data_;
        }
    }
    
    public static a newBuilder() {
        return (a)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final CommonMsg$WrappedRedditObject commonMsg$WrappedRedditObject) {
        return (a)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commonMsg$WrappedRedditObject);
    }
    
    public static CommonMsg$WrappedRedditObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$WrappedRedditObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, byteString);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final l l) throws IOException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, l);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final l l, final d0 d0) throws IOException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, l, d0);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, array);
    }
    
    public static CommonMsg$WrappedRedditObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$WrappedRedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<CommonMsg$WrappedRedditObject> parser() {
        return (n1<CommonMsg$WrappedRedditObject>)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final CommonMsg$RedditObject data_) {
        data_.getClass();
        this.data_ = data_;
    }
    
    private void setKind(final String kind_) {
        kind_.getClass();
        this.kind_ = kind_;
    }
    
    private void setKindBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.kind_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (z80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<CommonMsg$WrappedRedditObject> parser;
                if ((parser = CommonMsg$WrappedRedditObject.PARSER) == null) {
                    synchronized (CommonMsg$WrappedRedditObject.class) {
                        if (CommonMsg$WrappedRedditObject.PARSER == null) {
                            CommonMsg$WrappedRedditObject.PARSER = (n1<CommonMsg$WrappedRedditObject>)new GeneratedMessageLite$c((GeneratedMessageLite)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)CommonMsg$WrappedRedditObject.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new CommonMsg$WrappedRedditObject();
            }
        }
    }
    
    public CommonMsg$RedditObject getData() {
        CommonMsg$RedditObject commonMsg$RedditObject;
        if ((commonMsg$RedditObject = this.data_) == null) {
            commonMsg$RedditObject = CommonMsg$RedditObject.getDefaultInstance();
        }
        return commonMsg$RedditObject;
    }
    
    public String getKind() {
        return this.kind_;
    }
    
    public ByteString getKindBytes() {
        return ByteString.copyFromUtf8(this.kind_);
    }
    
    public boolean hasData() {
        return this.data_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<CommonMsg$WrappedRedditObject, a> implements b
    {
        public a() {
            super((GeneratedMessageLite)CommonMsg$WrappedRedditObject.access$2500());
        }
    }
}
