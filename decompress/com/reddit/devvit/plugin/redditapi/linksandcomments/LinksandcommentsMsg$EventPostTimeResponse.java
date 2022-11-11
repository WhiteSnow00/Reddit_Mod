// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.e;
import java.util.List;
import com.google.protobuf.Any;
import com.google.protobuf.Internal$j;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import android.support.v4.media.a;
import al0.b;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class LinksandcommentsMsg$EventPostTimeResponse extends GeneratedMessageLite<LinksandcommentsMsg$EventPostTimeResponse, a> implements d1
{
    private static final LinksandcommentsMsg$EventPostTimeResponse DEFAULT_INSTANCE;
    public static final int EVENT_END_FIELD_NUMBER = 3;
    public static final int EVENT_IS_LIVE_FIELD_NUMBER = 1;
    public static final int EVENT_START_FIELD_NUMBER = 2;
    public static final int JSON_FIELD_NUMBER = 4;
    private static volatile n1<LinksandcommentsMsg$EventPostTimeResponse> PARSER;
    private Int64Value eventEnd_;
    private BoolValue eventIsLive_;
    private Int64Value eventStart_;
    private JsonErrorType json_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$EventPostTimeResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$EventPostTimeResponse()));
    }
    
    private LinksandcommentsMsg$EventPostTimeResponse() {
    }
    
    public static /* synthetic */ LinksandcommentsMsg$EventPostTimeResponse access$23200() {
        return LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE;
    }
    
    private void clearEventEnd() {
        this.eventEnd_ = null;
    }
    
    private void clearEventIsLive() {
        this.eventIsLive_ = null;
    }
    
    private void clearEventStart() {
        this.eventStart_ = null;
    }
    
    private void clearJson() {
        this.json_ = null;
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse getDefaultInstance() {
        return LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeEventEnd(final Int64Value eventEnd_) {
        eventEnd_.getClass();
        final Int64Value eventEnd_2 = this.eventEnd_;
        if (eventEnd_2 != null && eventEnd_2 != Int64Value.getDefaultInstance()) {
            this.eventEnd_ = (Int64Value)b.g(this.eventEnd_, eventEnd_);
        }
        else {
            this.eventEnd_ = eventEnd_;
        }
    }
    
    private void mergeEventIsLive(final BoolValue eventIsLive_) {
        eventIsLive_.getClass();
        final BoolValue eventIsLive_2 = this.eventIsLive_;
        if (eventIsLive_2 != null && eventIsLive_2 != BoolValue.getDefaultInstance()) {
            this.eventIsLive_ = (BoolValue)android.support.v4.media.a.f(this.eventIsLive_, eventIsLive_);
        }
        else {
            this.eventIsLive_ = eventIsLive_;
        }
    }
    
    private void mergeEventStart(final Int64Value eventStart_) {
        eventStart_.getClass();
        final Int64Value eventStart_2 = this.eventStart_;
        if (eventStart_2 != null && eventStart_2 != Int64Value.getDefaultInstance()) {
            this.eventStart_ = (Int64Value)b.g(this.eventStart_, eventStart_);
        }
        else {
            this.eventStart_ = eventStart_;
        }
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
        return (a)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$EventPostTimeResponse linksandcommentsMsg$EventPostTimeResponse) {
        return (a)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$EventPostTimeResponse);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$EventPostTimeResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$EventPostTimeResponse> parser() {
        return (n1<LinksandcommentsMsg$EventPostTimeResponse>)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setEventEnd(final Int64Value eventEnd_) {
        eventEnd_.getClass();
        this.eventEnd_ = eventEnd_;
    }
    
    private void setEventIsLive(final BoolValue eventIsLive_) {
        eventIsLive_.getClass();
        this.eventIsLive_ = eventIsLive_;
    }
    
    private void setEventStart(final Int64Value eventStart_) {
        eventStart_.getClass();
        this.eventStart_ = eventStart_;
    }
    
    private void setJson(final JsonErrorType json_) {
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
                final n1<LinksandcommentsMsg$EventPostTimeResponse> parser;
                if ((parser = LinksandcommentsMsg$EventPostTimeResponse.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$EventPostTimeResponse.class) {
                        if (LinksandcommentsMsg$EventPostTimeResponse.PARSER == null) {
                            LinksandcommentsMsg$EventPostTimeResponse.PARSER = (n1<LinksandcommentsMsg$EventPostTimeResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$EventPostTimeResponse.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[] { "eventIsLive_", "eventStart_", "eventEnd_", "json_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$EventPostTimeResponse();
            }
        }
    }
    
    public Int64Value getEventEnd() {
        Int64Value int64Value;
        if ((int64Value = this.eventEnd_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public BoolValue getEventIsLive() {
        BoolValue boolValue;
        if ((boolValue = this.eventIsLive_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public Int64Value getEventStart() {
        Int64Value int64Value;
        if ((int64Value = this.eventStart_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public JsonErrorType getJson() {
        JsonErrorType jsonErrorType;
        if ((jsonErrorType = this.json_) == null) {
            jsonErrorType = JsonErrorType.getDefaultInstance();
        }
        return jsonErrorType;
    }
    
    public boolean hasEventEnd() {
        return this.eventEnd_ != null;
    }
    
    public boolean hasEventIsLive() {
        return this.eventIsLive_ != null;
    }
    
    public boolean hasEventStart() {
        return this.eventStart_ != null;
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
        
        public static /* synthetic */ JsonErrorType access$22400() {
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
                super((GeneratedMessageLite)JsonErrorType.access$22400());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$EventPostTimeResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeResponse.access$23200());
        }
    }
}
