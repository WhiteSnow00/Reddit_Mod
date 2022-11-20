// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.x1;
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
import t5.w;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.StringValue;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SubredditsMsg$UploadSrImgResponse extends GeneratedMessageLite<SubredditsMsg$UploadSrImgResponse, a> implements d1
{
    private static final SubredditsMsg$UploadSrImgResponse DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 1;
    public static final int ERRORS_VALUES_FIELD_NUMBER = 3;
    public static final int IMG_SRC_FIELD_NUMBER = 2;
    private static volatile n1<SubredditsMsg$UploadSrImgResponse> PARSER;
    private Internal$j<StringValue> errorsValues_;
    private Internal$j<StringValue> errors_;
    private StringValue imgSrc_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$UploadSrImgResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$UploadSrImgResponse()));
    }
    
    private SubredditsMsg$UploadSrImgResponse() {
        this.errors_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.errorsValues_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static SubredditsMsg$UploadSrImgResponse access$67100() {
        return SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$67200(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final int n, final StringValue stringValue) {
        subredditsMsg$UploadSrImgResponse.setErrors(n, stringValue);
    }
    
    public static void access$67300(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final StringValue stringValue) {
        subredditsMsg$UploadSrImgResponse.addErrors(stringValue);
    }
    
    public static void access$67400(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final int n, final StringValue stringValue) {
        subredditsMsg$UploadSrImgResponse.addErrors(n, stringValue);
    }
    
    public static void access$67500(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final Iterable iterable) {
        subredditsMsg$UploadSrImgResponse.addAllErrors(iterable);
    }
    
    public static void access$67600(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse) {
        subredditsMsg$UploadSrImgResponse.clearErrors();
    }
    
    public static void access$67700(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final int n) {
        subredditsMsg$UploadSrImgResponse.removeErrors(n);
    }
    
    public static void access$67800(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final StringValue imgSrc) {
        subredditsMsg$UploadSrImgResponse.setImgSrc(imgSrc);
    }
    
    public static void access$67900(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final StringValue stringValue) {
        subredditsMsg$UploadSrImgResponse.mergeImgSrc(stringValue);
    }
    
    public static void access$68000(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse) {
        subredditsMsg$UploadSrImgResponse.clearImgSrc();
    }
    
    public static void access$68100(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final int n, final StringValue stringValue) {
        subredditsMsg$UploadSrImgResponse.setErrorsValues(n, stringValue);
    }
    
    public static void access$68200(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final StringValue stringValue) {
        subredditsMsg$UploadSrImgResponse.addErrorsValues(stringValue);
    }
    
    public static void access$68300(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final int n, final StringValue stringValue) {
        subredditsMsg$UploadSrImgResponse.addErrorsValues(n, stringValue);
    }
    
    public static void access$68400(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final Iterable iterable) {
        subredditsMsg$UploadSrImgResponse.addAllErrorsValues(iterable);
    }
    
    public static void access$68500(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse) {
        subredditsMsg$UploadSrImgResponse.clearErrorsValues();
    }
    
    public static void access$68600(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse, final int n) {
        subredditsMsg$UploadSrImgResponse.removeErrorsValues(n);
    }
    
    private void addAllErrors(final Iterable<? extends StringValue> iterable) {
        this.ensureErrorsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.errors_);
    }
    
    private void addAllErrorsValues(final Iterable<? extends StringValue> iterable) {
        this.ensureErrorsValuesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.errorsValues_);
    }
    
    private void addErrors(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureErrorsIsMutable();
        ((List<StringValue>)this.errors_).add(n, stringValue);
    }
    
    private void addErrors(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureErrorsIsMutable();
        ((List<StringValue>)this.errors_).add(stringValue);
    }
    
    private void addErrorsValues(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureErrorsValuesIsMutable();
        ((List<StringValue>)this.errorsValues_).add(n, stringValue);
    }
    
    private void addErrorsValues(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureErrorsValuesIsMutable();
        ((List<StringValue>)this.errorsValues_).add(stringValue);
    }
    
    private void clearErrors() {
        this.errors_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearErrorsValues() {
        this.errorsValues_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearImgSrc() {
        this.imgSrc_ = null;
    }
    
    private void ensureErrorsIsMutable() {
        final Internal$j<StringValue> errors_ = this.errors_;
        if (!errors_.E0()) {
            this.errors_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)errors_);
        }
    }
    
    private void ensureErrorsValuesIsMutable() {
        final Internal$j<StringValue> errorsValues_ = this.errorsValues_;
        if (!errorsValues_.E0()) {
            this.errorsValues_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)errorsValues_);
        }
    }
    
    public static SubredditsMsg$UploadSrImgResponse getDefaultInstance() {
        return SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeImgSrc(final StringValue imgSrc_) {
        imgSrc_.getClass();
        final StringValue imgSrc_2 = this.imgSrc_;
        if (imgSrc_2 != null && imgSrc_2 != StringValue.getDefaultInstance()) {
            this.imgSrc_ = (StringValue)w.e(this.imgSrc_, imgSrc_);
        }
        else {
            this.imgSrc_ = imgSrc_;
        }
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$UploadSrImgResponse subredditsMsg$UploadSrImgResponse) {
        return (a)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$UploadSrImgResponse);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$UploadSrImgResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$UploadSrImgResponse> parser() {
        return (n1<SubredditsMsg$UploadSrImgResponse>)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeErrors(final int n) {
        this.ensureErrorsIsMutable();
        this.errors_.remove(n);
    }
    
    private void removeErrorsValues(final int n) {
        this.ensureErrorsValuesIsMutable();
        this.errorsValues_.remove(n);
    }
    
    private void setErrors(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureErrorsIsMutable();
        ((List<StringValue>)this.errors_).set(n, stringValue);
    }
    
    private void setErrorsValues(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureErrorsValuesIsMutable();
        ((List<StringValue>)this.errorsValues_).set(n, stringValue);
    }
    
    private void setImgSrc(final StringValue imgSrc_) {
        imgSrc_.getClass();
        this.imgSrc_ = imgSrc_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (h90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<SubredditsMsg$UploadSrImgResponse> parser;
                if ((parser = SubredditsMsg$UploadSrImgResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$UploadSrImgResponse.class) {
                        if (SubredditsMsg$UploadSrImgResponse.PARSER == null) {
                            SubredditsMsg$UploadSrImgResponse.PARSER = (n1<SubredditsMsg$UploadSrImgResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$UploadSrImgResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\t\u0003\u001b", new Object[] { "errors_", StringValue.class, "imgSrc_", "errorsValues_", StringValue.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$UploadSrImgResponse();
            }
        }
    }
    
    public StringValue getErrors(final int n) {
        return ((List<StringValue>)this.errors_).get(n);
    }
    
    public int getErrorsCount() {
        return ((List)this.errors_).size();
    }
    
    public List<StringValue> getErrorsList() {
        return (List<StringValue>)this.errors_;
    }
    
    public x1 getErrorsOrBuilder(final int n) {
        return ((List<x1>)this.errors_).get(n);
    }
    
    public List<? extends x1> getErrorsOrBuilderList() {
        return (List<? extends x1>)this.errors_;
    }
    
    public StringValue getErrorsValues(final int n) {
        return ((List<StringValue>)this.errorsValues_).get(n);
    }
    
    public int getErrorsValuesCount() {
        return ((List)this.errorsValues_).size();
    }
    
    public List<StringValue> getErrorsValuesList() {
        return (List<StringValue>)this.errorsValues_;
    }
    
    public x1 getErrorsValuesOrBuilder(final int n) {
        return ((List<x1>)this.errorsValues_).get(n);
    }
    
    public List<? extends x1> getErrorsValuesOrBuilderList() {
        return (List<? extends x1>)this.errorsValues_;
    }
    
    public StringValue getImgSrc() {
        StringValue stringValue;
        if ((stringValue = this.imgSrc_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasImgSrc() {
        return this.imgSrc_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$UploadSrImgResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$UploadSrImgResponse.access$67100());
        }
    }
}
