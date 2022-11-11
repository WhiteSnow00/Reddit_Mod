// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.common;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.e;
import java.util.List;
import com.google.protobuf.Any;
import com.google.protobuf.Internal$j;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import z80.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class CommonMsg$BasicJsonObject extends GeneratedMessageLite<CommonMsg$BasicJsonObject, a> implements d1
{
    private static final CommonMsg$BasicJsonObject DEFAULT_INSTANCE;
    public static final int JSON_FIELD_NUMBER = 4;
    private static volatile n1<CommonMsg$BasicJsonObject> PARSER;
    private JsonErrorType json_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)CommonMsg$BasicJsonObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new CommonMsg$BasicJsonObject()));
    }
    
    private CommonMsg$BasicJsonObject() {
    }
    
    public static /* synthetic */ CommonMsg$BasicJsonObject access$36300() {
        return CommonMsg$BasicJsonObject.DEFAULT_INSTANCE;
    }
    
    private void clearJson() {
        this.json_ = null;
    }
    
    public static CommonMsg$BasicJsonObject getDefaultInstance() {
        return CommonMsg$BasicJsonObject.DEFAULT_INSTANCE;
    }
    
    private void mergeJson(final JsonErrorType json_) {
        json_.getClass();
        final JsonErrorType json_2 = this.json_;
        if (json_2 != null && json_2 != JsonErrorType.getDefaultInstance()) {
            final JsonErrorType.a builder = JsonErrorType.newBuilder(this.json_);
            builder.h((GeneratedMessageLite)json_);
            this.json_ = (JsonErrorType)builder.d();
        }
        else {
            this.json_ = json_;
        }
    }
    
    public static a newBuilder() {
        return (a)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final CommonMsg$BasicJsonObject commonMsg$BasicJsonObject) {
        return (a)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commonMsg$BasicJsonObject);
    }
    
    public static CommonMsg$BasicJsonObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$BasicJsonObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, byteString);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final l l) throws IOException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, l);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final l l, final d0 d0) throws IOException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, l, d0);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, array);
    }
    
    public static CommonMsg$BasicJsonObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$BasicJsonObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<CommonMsg$BasicJsonObject> parser() {
        return (n1<CommonMsg$BasicJsonObject>)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setJson(final JsonErrorType json_) {
        json_.getClass();
        this.json_ = json_;
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
                final n1<CommonMsg$BasicJsonObject> parser;
                if ((parser = CommonMsg$BasicJsonObject.PARSER) == null) {
                    synchronized (CommonMsg$BasicJsonObject.class) {
                        if (CommonMsg$BasicJsonObject.PARSER == null) {
                            CommonMsg$BasicJsonObject.PARSER = (n1<CommonMsg$BasicJsonObject>)new GeneratedMessageLite$c((GeneratedMessageLite)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return CommonMsg$BasicJsonObject.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)CommonMsg$BasicJsonObject.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[] { "json_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new CommonMsg$BasicJsonObject();
            }
        }
    }
    
    public JsonErrorType getJson() {
        JsonErrorType jsonErrorType;
        if ((jsonErrorType = this.json_) == null) {
            jsonErrorType = JsonErrorType.getDefaultInstance();
        }
        return jsonErrorType;
    }
    
    public boolean hasJson() {
        return this.json_ != null;
    }
    
    public static final class JsonErrorType extends GeneratedMessageLite<JsonErrorType, a> implements d1
    {
        private static final JsonErrorType DEFAULT_INSTANCE;
        public static final int ERRORS_FIELD_NUMBER = 1;
        private static volatile n1<JsonErrorType> PARSER;
        private Internal$j<Any> errors_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)JsonErrorType.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new JsonErrorType()));
        }
        
        private JsonErrorType() {
            this.errors_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static /* synthetic */ JsonErrorType access$35500() {
            return JsonErrorType.DEFAULT_INSTANCE;
        }
        
        private void addAllErrors(final Iterable<? extends Any> iterable) {
            this.ensureErrorsIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.errors_);
        }
        
        private void addErrors(final int n, final Any any) {
            any.getClass();
            this.ensureErrorsIsMutable();
            ((List<Any>)this.errors_).add(n, any);
        }
        
        private void addErrors(final Any any) {
            any.getClass();
            this.ensureErrorsIsMutable();
            ((List<Any>)this.errors_).add(any);
        }
        
        private void clearErrors() {
            this.errors_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void ensureErrorsIsMutable() {
            final Internal$j<Any> errors_ = this.errors_;
            if (!errors_.E0()) {
                this.errors_ = (Internal$j<Any>)GeneratedMessageLite.mutableCopy((Internal$j)errors_);
            }
        }
        
        public static JsonErrorType getDefaultInstance() {
            return JsonErrorType.DEFAULT_INSTANCE;
        }
        
        public static a newBuilder() {
            return (a)JsonErrorType.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final JsonErrorType jsonErrorType) {
            return (a)JsonErrorType.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)jsonErrorType);
        }
        
        public static JsonErrorType parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (JsonErrorType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static JsonErrorType parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (JsonErrorType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static JsonErrorType parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, byteString);
        }
        
        public static JsonErrorType parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static JsonErrorType parseFrom(final l l) throws IOException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, l);
        }
        
        public static JsonErrorType parseFrom(final l l, final d0 d0) throws IOException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, l, d0);
        }
        
        public static JsonErrorType parseFrom(final InputStream inputStream) throws IOException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static JsonErrorType parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static JsonErrorType parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static JsonErrorType parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static JsonErrorType parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, array);
        }
        
        public static JsonErrorType parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (JsonErrorType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<JsonErrorType> parser() {
            return (n1<JsonErrorType>)JsonErrorType.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeErrors(final int n) {
            this.ensureErrorsIsMutable();
            this.errors_.remove(n);
        }
        
        private void setErrors(final int n, final Any any) {
            any.getClass();
            this.ensureErrorsIsMutable();
            ((List<Any>)this.errors_).set(n, any);
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
                    final n1<JsonErrorType> parser;
                    if ((parser = JsonErrorType.PARSER) == null) {
                        synchronized (JsonErrorType.class) {
                            if (JsonErrorType.PARSER == null) {
                                JsonErrorType.PARSER = (n1<JsonErrorType>)new GeneratedMessageLite$c((GeneratedMessageLite)JsonErrorType.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return JsonErrorType.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)JsonErrorType.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "errors_", Any.class });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new JsonErrorType();
                }
            }
        }
        
        public Any getErrors(final int n) {
            return ((List<Any>)this.errors_).get(n);
        }
        
        public int getErrorsCount() {
            return ((List)this.errors_).size();
        }
        
        public List<Any> getErrorsList() {
            return (List<Any>)this.errors_;
        }
        
        public e getErrorsOrBuilder(final int n) {
            return ((List<e>)this.errors_).get(n);
        }
        
        public List<? extends e> getErrorsOrBuilderList() {
            return (List<? extends e>)this.errors_;
        }
        
        public static final class a extends GeneratedMessageLite$b<JsonErrorType, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)JsonErrorType.access$35500());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<CommonMsg$BasicJsonObject, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)CommonMsg$BasicJsonObject.access$36300());
        }
    }
}
