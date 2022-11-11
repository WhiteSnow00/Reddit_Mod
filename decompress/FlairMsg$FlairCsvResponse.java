// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
import a90.b;
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
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairCsvResponse extends GeneratedMessageLite<FlairMsg$FlairCsvResponse, a> implements d1
{
    private static final FlairMsg$FlairCsvResponse DEFAULT_INSTANCE;
    private static volatile n1<FlairMsg$FlairCsvResponse> PARSER;
    public static final int RESULT_FIELD_NUMBER = 1;
    private Internal$j<FlairMsg$FlairCsvResult> result_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairCsvResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairCsvResponse()));
    }
    
    private FlairMsg$FlairCsvResponse() {
        this.result_ = (Internal$j<FlairMsg$FlairCsvResult>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ FlairMsg$FlairCsvResponse access$31500() {
        return FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE;
    }
    
    private void addAllResult(final Iterable<? extends FlairMsg$FlairCsvResult> iterable) {
        this.ensureResultIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.result_);
    }
    
    private void addResult(final int n, final FlairMsg$FlairCsvResult flairMsg$FlairCsvResult) {
        flairMsg$FlairCsvResult.getClass();
        this.ensureResultIsMutable();
        ((List<FlairMsg$FlairCsvResult>)this.result_).add(n, flairMsg$FlairCsvResult);
    }
    
    private void addResult(final FlairMsg$FlairCsvResult flairMsg$FlairCsvResult) {
        flairMsg$FlairCsvResult.getClass();
        this.ensureResultIsMutable();
        ((List<FlairMsg$FlairCsvResult>)this.result_).add(flairMsg$FlairCsvResult);
    }
    
    private void clearResult() {
        this.result_ = (Internal$j<FlairMsg$FlairCsvResult>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureResultIsMutable() {
        final Internal$j<FlairMsg$FlairCsvResult> result_ = this.result_;
        if (!result_.E0()) {
            this.result_ = (Internal$j<FlairMsg$FlairCsvResult>)GeneratedMessageLite.mutableCopy((Internal$j)result_);
        }
    }
    
    public static FlairMsg$FlairCsvResponse getDefaultInstance() {
        return FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairCsvResponse flairMsg$FlairCsvResponse) {
        return (a)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairCsvResponse);
    }
    
    public static FlairMsg$FlairCsvResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairCsvResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairCsvResponse> parser() {
        return (n1<FlairMsg$FlairCsvResponse>)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeResult(final int n) {
        this.ensureResultIsMutable();
        this.result_.remove(n);
    }
    
    private void setResult(final int n, final FlairMsg$FlairCsvResult flairMsg$FlairCsvResult) {
        flairMsg$FlairCsvResult.getClass();
        this.ensureResultIsMutable();
        ((List<FlairMsg$FlairCsvResult>)this.result_).set(n, flairMsg$FlairCsvResult);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (a90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<FlairMsg$FlairCsvResponse> parser;
                if ((parser = FlairMsg$FlairCsvResponse.PARSER) == null) {
                    synchronized (FlairMsg$FlairCsvResponse.class) {
                        if (FlairMsg$FlairCsvResponse.PARSER == null) {
                            FlairMsg$FlairCsvResponse.PARSER = (n1<FlairMsg$FlairCsvResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairCsvResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "result_", FlairMsg$FlairCsvResult.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairCsvResponse();
            }
        }
    }
    
    public FlairMsg$FlairCsvResult getResult(final int n) {
        return ((List<FlairMsg$FlairCsvResult>)this.result_).get(n);
    }
    
    public int getResultCount() {
        return ((List)this.result_).size();
    }
    
    public List<FlairMsg$FlairCsvResult> getResultList() {
        return (List<FlairMsg$FlairCsvResult>)this.result_;
    }
    
    public b getResultOrBuilder(final int n) {
        return ((List<b>)this.result_).get(n);
    }
    
    public List<? extends b> getResultOrBuilderList() {
        return (List<? extends b>)this.result_;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairCsvResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairCsvResponse.access$31500());
        }
    }
}
