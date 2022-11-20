// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

import com.google.protobuf.GeneratedMessageLite$b;
import t5.w;
import com.google.protobuf.StringValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.e;
import java.util.List;
import com.google.protobuf.Any;
import com.google.protobuf.Internal$j;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import b90.a;
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

public final class LinksandcommentsMsg$SubmitResponse extends GeneratedMessageLite<LinksandcommentsMsg$SubmitResponse, a> implements d1
{
    private static final LinksandcommentsMsg$SubmitResponse DEFAULT_INSTANCE;
    public static final int JSON_FIELD_NUMBER = 4;
    private static volatile n1<LinksandcommentsMsg$SubmitResponse> PARSER;
    private JsonType json_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$SubmitResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$SubmitResponse()));
    }
    
    private LinksandcommentsMsg$SubmitResponse() {
    }
    
    public static LinksandcommentsMsg$SubmitResponse access$30800() {
        return LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$30900(final LinksandcommentsMsg$SubmitResponse linksandcommentsMsg$SubmitResponse, final JsonType json) {
        linksandcommentsMsg$SubmitResponse.setJson(json);
    }
    
    public static void access$31000(final LinksandcommentsMsg$SubmitResponse linksandcommentsMsg$SubmitResponse, final JsonType jsonType) {
        linksandcommentsMsg$SubmitResponse.mergeJson(jsonType);
    }
    
    public static void access$31100(final LinksandcommentsMsg$SubmitResponse linksandcommentsMsg$SubmitResponse) {
        linksandcommentsMsg$SubmitResponse.clearJson();
    }
    
    private void clearJson() {
        this.json_ = null;
    }
    
    public static LinksandcommentsMsg$SubmitResponse getDefaultInstance() {
        return LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeJson(final JsonType json_) {
        json_.getClass();
        final JsonType json_2 = this.json_;
        if (json_2 != null && json_2 != JsonType.getDefaultInstance()) {
            final JsonType.a builder = JsonType.newBuilder(this.json_);
            builder.h((GeneratedMessageLite)json_);
            this.json_ = (JsonType)builder.c();
        }
        else {
            this.json_ = json_;
        }
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$SubmitResponse linksandcommentsMsg$SubmitResponse) {
        return (a)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$SubmitResponse);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$SubmitResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$SubmitResponse> parser() {
        return (n1<LinksandcommentsMsg$SubmitResponse>)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setJson(final JsonType json_) {
        json_.getClass();
        this.json_ = json_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<LinksandcommentsMsg$SubmitResponse> parser;
                if ((parser = LinksandcommentsMsg$SubmitResponse.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$SubmitResponse.class) {
                        if (LinksandcommentsMsg$SubmitResponse.PARSER == null) {
                            LinksandcommentsMsg$SubmitResponse.PARSER = (n1<LinksandcommentsMsg$SubmitResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$SubmitResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[] { "json_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$SubmitResponse();
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
        
        public static JsonType access$29700() {
            return JsonType.DEFAULT_INSTANCE;
        }
        
        public static void access$29800(final JsonType jsonType, final int n, final Any any) {
            jsonType.setErrors(n, any);
        }
        
        public static void access$29900(final JsonType jsonType, final Any any) {
            jsonType.addErrors(any);
        }
        
        public static void access$30000(final JsonType jsonType, final int n, final Any any) {
            jsonType.addErrors(n, any);
        }
        
        public static void access$30100(final JsonType jsonType, final Iterable iterable) {
            jsonType.addAllErrors(iterable);
        }
        
        public static void access$30200(final JsonType jsonType) {
            jsonType.clearErrors();
        }
        
        public static void access$30300(final JsonType jsonType, final int n) {
            jsonType.removeErrors(n);
        }
        
        public static void access$30400(final JsonType jsonType, final JsonData data) {
            jsonType.setData(data);
        }
        
        public static void access$30500(final JsonType jsonType, final JsonData jsonData) {
            jsonType.mergeData(jsonData);
        }
        
        public static void access$30600(final JsonType jsonType) {
            jsonType.clearData();
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
                this.data_ = (JsonData)builder.c();
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
            switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
            public static final int DRAFTS_COUNT_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 3;
            public static final int NAME_FIELD_NUMBER = 4;
            private static volatile n1<JsonData> PARSER;
            public static final int URL_FIELD_NUMBER = 1;
            private Int32Value draftsCount_;
            private StringValue id_;
            private StringValue name_;
            private StringValue url_;
            
            static {
                GeneratedMessageLite.registerDefaultInstance((Class)JsonData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new JsonData()));
            }
            
            private JsonData() {
            }
            
            public static JsonData access$28300() {
                return JsonData.DEFAULT_INSTANCE;
            }
            
            public static void access$28400(final JsonData jsonData, final StringValue url) {
                jsonData.setUrl(url);
            }
            
            public static void access$28500(final JsonData jsonData, final StringValue stringValue) {
                jsonData.mergeUrl(stringValue);
            }
            
            public static void access$28600(final JsonData jsonData) {
                jsonData.clearUrl();
            }
            
            public static void access$28700(final JsonData jsonData, final Int32Value draftsCount) {
                jsonData.setDraftsCount(draftsCount);
            }
            
            public static void access$28800(final JsonData jsonData, final Int32Value int32Value) {
                jsonData.mergeDraftsCount(int32Value);
            }
            
            public static void access$28900(final JsonData jsonData) {
                jsonData.clearDraftsCount();
            }
            
            public static void access$29000(final JsonData jsonData, final StringValue id) {
                jsonData.setId(id);
            }
            
            public static void access$29100(final JsonData jsonData, final StringValue stringValue) {
                jsonData.mergeId(stringValue);
            }
            
            public static void access$29200(final JsonData jsonData) {
                jsonData.clearId();
            }
            
            public static void access$29300(final JsonData jsonData, final StringValue name) {
                jsonData.setName(name);
            }
            
            public static void access$29400(final JsonData jsonData, final StringValue stringValue) {
                jsonData.mergeName(stringValue);
            }
            
            public static void access$29500(final JsonData jsonData) {
                jsonData.clearName();
            }
            
            private void clearDraftsCount() {
                this.draftsCount_ = null;
            }
            
            private void clearId() {
                this.id_ = null;
            }
            
            private void clearName() {
                this.name_ = null;
            }
            
            private void clearUrl() {
                this.url_ = null;
            }
            
            public static JsonData getDefaultInstance() {
                return JsonData.DEFAULT_INSTANCE;
            }
            
            private void mergeDraftsCount(final Int32Value draftsCount_) {
                draftsCount_.getClass();
                final Int32Value draftsCount_2 = this.draftsCount_;
                if (draftsCount_2 != null && draftsCount_2 != Int32Value.getDefaultInstance()) {
                    this.draftsCount_ = (Int32Value)b.d(this.draftsCount_, draftsCount_);
                }
                else {
                    this.draftsCount_ = draftsCount_;
                }
            }
            
            private void mergeId(final StringValue id_) {
                id_.getClass();
                final StringValue id_2 = this.id_;
                if (id_2 != null && id_2 != StringValue.getDefaultInstance()) {
                    this.id_ = (StringValue)w.e(this.id_, id_);
                }
                else {
                    this.id_ = id_;
                }
            }
            
            private void mergeName(final StringValue name_) {
                name_.getClass();
                final StringValue name_2 = this.name_;
                if (name_2 != null && name_2 != StringValue.getDefaultInstance()) {
                    this.name_ = (StringValue)w.e(this.name_, name_);
                }
                else {
                    this.name_ = name_;
                }
            }
            
            private void mergeUrl(final StringValue url_) {
                url_.getClass();
                final StringValue url_2 = this.url_;
                if (url_2 != null && url_2 != StringValue.getDefaultInstance()) {
                    this.url_ = (StringValue)w.e(this.url_, url_);
                }
                else {
                    this.url_ = url_;
                }
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
            
            private void setDraftsCount(final Int32Value draftsCount_) {
                draftsCount_.getClass();
                this.draftsCount_ = draftsCount_;
            }
            
            private void setId(final StringValue id_) {
                id_.getClass();
                this.id_ = id_;
            }
            
            private void setName(final StringValue name_) {
                name_.getClass();
                this.name_ = name_;
            }
            
            private void setUrl(final StringValue url_) {
                url_.getClass();
                this.url_ = url_;
            }
            
            public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
                switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                        return GeneratedMessageLite.newMessageInfo((c1)JsonData.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[] { "url_", "draftsCount_", "id_", "name_" });
                    }
                    case 2: {
                        return new a();
                    }
                    case 1: {
                        return new JsonData();
                    }
                }
            }
            
            public Int32Value getDraftsCount() {
                Int32Value int32Value;
                if ((int32Value = this.draftsCount_) == null) {
                    int32Value = Int32Value.getDefaultInstance();
                }
                return int32Value;
            }
            
            public StringValue getId() {
                StringValue stringValue;
                if ((stringValue = this.id_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getName() {
                StringValue stringValue;
                if ((stringValue = this.name_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getUrl() {
                StringValue stringValue;
                if ((stringValue = this.url_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public boolean hasDraftsCount() {
                return this.draftsCount_ != null;
            }
            
            public boolean hasId() {
                return this.id_ != null;
            }
            
            public boolean hasName() {
                return this.name_ != null;
            }
            
            public boolean hasUrl() {
                return this.url_ != null;
            }
            
            public static final class a extends GeneratedMessageLite$b<JsonData, a> implements d1
            {
                public a() {
                    super((GeneratedMessageLite)JsonData.access$28300());
                }
            }
        }
        
        public static final class a extends GeneratedMessageLite$b<JsonType, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)JsonType.access$29700());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$SubmitResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$SubmitResponse.access$30800());
        }
    }
}
