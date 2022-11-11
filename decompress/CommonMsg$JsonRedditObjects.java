// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.common;

import com.google.protobuf.GeneratedMessageLite$b;
import z80.b;
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

public final class CommonMsg$JsonRedditObjects extends GeneratedMessageLite<CommonMsg$JsonRedditObjects, a> implements d1
{
    private static final CommonMsg$JsonRedditObjects DEFAULT_INSTANCE;
    public static final int JSON_FIELD_NUMBER = 4;
    private static volatile n1<CommonMsg$JsonRedditObjects> PARSER;
    private JsonType json_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)CommonMsg$JsonRedditObjects.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new CommonMsg$JsonRedditObjects()));
    }
    
    private CommonMsg$JsonRedditObjects() {
    }
    
    public static /* synthetic */ CommonMsg$JsonRedditObjects access$5200() {
        return CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE;
    }
    
    private void clearJson() {
        this.json_ = null;
    }
    
    public static CommonMsg$JsonRedditObjects getDefaultInstance() {
        return CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE;
    }
    
    private void mergeJson(final JsonType json_) {
        json_.getClass();
        final JsonType json_2 = this.json_;
        if (json_2 != null && json_2 != JsonType.getDefaultInstance()) {
            final JsonType.a builder = JsonType.newBuilder(this.json_);
            builder.h((GeneratedMessageLite)json_);
            this.json_ = (JsonType)builder.d();
        }
        else {
            this.json_ = json_;
        }
    }
    
    public static a newBuilder() {
        return (a)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final CommonMsg$JsonRedditObjects commonMsg$JsonRedditObjects) {
        return (a)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commonMsg$JsonRedditObjects);
    }
    
    public static CommonMsg$JsonRedditObjects parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$JsonRedditObjects parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, byteString);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final l l) throws IOException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, l);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final l l, final d0 d0) throws IOException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, l, d0);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, array);
    }
    
    public static CommonMsg$JsonRedditObjects parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$JsonRedditObjects)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<CommonMsg$JsonRedditObjects> parser() {
        return (n1<CommonMsg$JsonRedditObjects>)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setJson(final JsonType json_) {
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
                final n1<CommonMsg$JsonRedditObjects> parser;
                if ((parser = CommonMsg$JsonRedditObjects.PARSER) == null) {
                    synchronized (CommonMsg$JsonRedditObjects.class) {
                        if (CommonMsg$JsonRedditObjects.PARSER == null) {
                            CommonMsg$JsonRedditObjects.PARSER = (n1<CommonMsg$JsonRedditObjects>)new GeneratedMessageLite$c((GeneratedMessageLite)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)CommonMsg$JsonRedditObjects.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[] { "json_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new CommonMsg$JsonRedditObjects();
            }
        }
    }
    
    public JsonType getJson() {
        JsonType jsonType;
        if ((jsonType = this.json_) == null) {
            jsonType = JsonType.getDefaultInstance();
        }
        return jsonType;
    }
    
    public boolean hasJson() {
        return this.json_ != null;
    }
    
    public static final class JsonType extends GeneratedMessageLite<JsonType, a> implements d1
    {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final JsonType DEFAULT_INSTANCE;
        public static final int ERRORS_FIELD_NUMBER = 1;
        private static volatile n1<JsonType> PARSER;
        private JsonData data_;
        private Internal$j<Any> errors_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)JsonType.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new JsonType()));
        }
        
        private JsonType() {
            this.errors_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static /* synthetic */ JsonType access$4100() {
            return JsonType.DEFAULT_INSTANCE;
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
        
        private void clearData() {
            this.data_ = null;
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
        
        public static JsonType getDefaultInstance() {
            return JsonType.DEFAULT_INSTANCE;
        }
        
        private void mergeData(final JsonData data_) {
            data_.getClass();
            final JsonData data_2 = this.data_;
            if (data_2 != null && data_2 != JsonData.getDefaultInstance()) {
                final JsonData.a builder = JsonData.newBuilder(this.data_);
                builder.h((GeneratedMessageLite)data_);
                this.data_ = (JsonData)builder.d();
            }
            else {
                this.data_ = data_;
            }
        }
        
        public static a newBuilder() {
            return (a)JsonType.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final JsonType jsonType) {
            return (a)JsonType.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)jsonType);
        }
        
        public static JsonType parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (JsonType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static JsonType parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (JsonType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static JsonType parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, byteString);
        }
        
        public static JsonType parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static JsonType parseFrom(final l l) throws IOException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, l);
        }
        
        public static JsonType parseFrom(final l l, final d0 d0) throws IOException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, l, d0);
        }
        
        public static JsonType parseFrom(final InputStream inputStream) throws IOException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static JsonType parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static JsonType parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static JsonType parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static JsonType parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, array);
        }
        
        public static JsonType parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (JsonType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<JsonType> parser() {
            return (n1<JsonType>)JsonType.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeErrors(final int n) {
            this.ensureErrorsIsMutable();
            this.errors_.remove(n);
        }
        
        private void setData(final JsonData data_) {
            data_.getClass();
            this.data_ = data_;
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
                    final n1<JsonType> parser;
                    if ((parser = JsonType.PARSER) == null) {
                        synchronized (JsonType.class) {
                            if (JsonType.PARSER == null) {
                                JsonType.PARSER = (n1<JsonType>)new GeneratedMessageLite$c((GeneratedMessageLite)JsonType.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return JsonType.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)JsonType.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[] { "errors_", Any.class, "data_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new JsonType();
                }
            }
        }
        
        public JsonData getData() {
            JsonData jsonData;
            if ((jsonData = this.data_) == null) {
                jsonData = JsonData.getDefaultInstance();
            }
            return jsonData;
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
        
        public boolean hasData() {
            return this.data_ != null;
        }
        
        public static final class JsonData extends GeneratedMessageLite<JsonData, a> implements d1
        {
            private static final JsonData DEFAULT_INSTANCE;
            private static volatile n1<JsonData> PARSER;
            public static final int THINGS_FIELD_NUMBER = 1;
            private Internal$j<CommonMsg$WrappedRedditObject> things_;
            
            static {
                GeneratedMessageLite.registerDefaultInstance((Class)JsonData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new JsonData()));
            }
            
            private JsonData() {
                this.things_ = (Internal$j<CommonMsg$WrappedRedditObject>)GeneratedMessageLite.emptyProtobufList();
            }
            
            public static /* synthetic */ JsonData access$3300() {
                return JsonData.DEFAULT_INSTANCE;
            }
            
            private void addAllThings(final Iterable<? extends CommonMsg$WrappedRedditObject> iterable) {
                this.ensureThingsIsMutable();
                com.google.protobuf.a.addAll((Iterable)iterable, (List)this.things_);
            }
            
            private void addThings(final int n, final CommonMsg$WrappedRedditObject commonMsg$WrappedRedditObject) {
                commonMsg$WrappedRedditObject.getClass();
                this.ensureThingsIsMutable();
                ((List<CommonMsg$WrappedRedditObject>)this.things_).add(n, commonMsg$WrappedRedditObject);
            }
            
            private void addThings(final CommonMsg$WrappedRedditObject commonMsg$WrappedRedditObject) {
                commonMsg$WrappedRedditObject.getClass();
                this.ensureThingsIsMutable();
                ((List<CommonMsg$WrappedRedditObject>)this.things_).add(commonMsg$WrappedRedditObject);
            }
            
            private void clearThings() {
                this.things_ = (Internal$j<CommonMsg$WrappedRedditObject>)GeneratedMessageLite.emptyProtobufList();
            }
            
            private void ensureThingsIsMutable() {
                final Internal$j<CommonMsg$WrappedRedditObject> things_ = this.things_;
                if (!things_.E0()) {
                    this.things_ = (Internal$j<CommonMsg$WrappedRedditObject>)GeneratedMessageLite.mutableCopy((Internal$j)things_);
                }
            }
            
            public static JsonData getDefaultInstance() {
                return JsonData.DEFAULT_INSTANCE;
            }
            
            public static a newBuilder() {
                return (a)JsonData.DEFAULT_INSTANCE.createBuilder();
            }
            
            public static a newBuilder(final JsonData jsonData) {
                return (a)JsonData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)jsonData);
            }
            
            public static JsonData parseDelimitedFrom(final InputStream inputStream) throws IOException {
                return (JsonData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, inputStream);
            }
            
            public static JsonData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (JsonData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static JsonData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, byteString);
            }
            
            public static JsonData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, byteString, d0);
            }
            
            public static JsonData parseFrom(final l l) throws IOException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, l);
            }
            
            public static JsonData parseFrom(final l l, final d0 d0) throws IOException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, l, d0);
            }
            
            public static JsonData parseFrom(final InputStream inputStream) throws IOException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, inputStream);
            }
            
            public static JsonData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static JsonData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, byteBuffer);
            }
            
            public static JsonData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, byteBuffer, d0);
            }
            
            public static JsonData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, array);
            }
            
            public static JsonData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
                return (JsonData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE, array, d0);
            }
            
            public static n1<JsonData> parser() {
                return (n1<JsonData>)JsonData.DEFAULT_INSTANCE.getParserForType();
            }
            
            private void removeThings(final int n) {
                this.ensureThingsIsMutable();
                this.things_.remove(n);
            }
            
            private void setThings(final int n, final CommonMsg$WrappedRedditObject commonMsg$WrappedRedditObject) {
                commonMsg$WrappedRedditObject.getClass();
                this.ensureThingsIsMutable();
                ((List<CommonMsg$WrappedRedditObject>)this.things_).set(n, commonMsg$WrappedRedditObject);
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
                        final n1<JsonData> parser;
                        if ((parser = JsonData.PARSER) == null) {
                            synchronized (JsonData.class) {
                                if (JsonData.PARSER == null) {
                                    JsonData.PARSER = (n1<JsonData>)new GeneratedMessageLite$c((GeneratedMessageLite)JsonData.DEFAULT_INSTANCE);
                                }
                            }
                        }
                        return parser;
                    }
                    case 4: {
                        return JsonData.DEFAULT_INSTANCE;
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo((c1)JsonData.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "things_", CommonMsg$WrappedRedditObject.class });
                    }
                    case 2: {
                        return new a();
                    }
                    case 1: {
                        return new JsonData();
                    }
                }
            }
            
            public CommonMsg$WrappedRedditObject getThings(final int n) {
                return ((List<CommonMsg$WrappedRedditObject>)this.things_).get(n);
            }
            
            public int getThingsCount() {
                return ((List)this.things_).size();
            }
            
            public List<CommonMsg$WrappedRedditObject> getThingsList() {
                return (List<CommonMsg$WrappedRedditObject>)this.things_;
            }
            
            public b getThingsOrBuilder(final int n) {
                return ((List<b>)this.things_).get(n);
            }
            
            public List<? extends b> getThingsOrBuilderList() {
                return (List<? extends b>)this.things_;
            }
            
            public static final class a extends GeneratedMessageLite$b<JsonData, a> implements d1
            {
                public a() {
                    super((GeneratedMessageLite)JsonData.access$3300());
                }
            }
        }
        
        public static final class a extends GeneratedMessageLite$b<JsonType, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)JsonType.access$4100());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<CommonMsg$JsonRedditObjects, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)CommonMsg$JsonRedditObjects.access$5200());
        }
    }
}
