// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
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
import al0.f0;
import android.support.v4.media.a;
import com.google.protobuf.StringValue;
import com.google.protobuf.BoolValue;
import com.google.protobuf.n1;
import a90.b;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairCsvResult extends GeneratedMessageLite<FlairMsg$FlairCsvResult, a> implements b
{
    private static final FlairMsg$FlairCsvResult DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 3;
    public static final int OK_FIELD_NUMBER = 2;
    private static volatile n1<FlairMsg$FlairCsvResult> PARSER;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int WARNINGS_FIELD_NUMBER = 4;
    private FlairMsg$FlairCsvResultError errors_;
    private BoolValue ok_;
    private StringValue status_;
    private FlairMsg$FlairCsvResultWarning warnings_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairCsvResult.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairCsvResult()));
    }
    
    private FlairMsg$FlairCsvResult() {
    }
    
    public static /* synthetic */ FlairMsg$FlairCsvResult access$30100() {
        return FlairMsg$FlairCsvResult.DEFAULT_INSTANCE;
    }
    
    private void clearErrors() {
        this.errors_ = null;
    }
    
    private void clearOk() {
        this.ok_ = null;
    }
    
    private void clearStatus() {
        this.status_ = null;
    }
    
    private void clearWarnings() {
        this.warnings_ = null;
    }
    
    public static FlairMsg$FlairCsvResult getDefaultInstance() {
        return FlairMsg$FlairCsvResult.DEFAULT_INSTANCE;
    }
    
    private void mergeErrors(final FlairMsg$FlairCsvResultError errors_) {
        errors_.getClass();
        final FlairMsg$FlairCsvResultError errors_2 = this.errors_;
        if (errors_2 != null && errors_2 != FlairMsg$FlairCsvResultError.getDefaultInstance()) {
            final FlairMsg$FlairCsvResultError.a builder = FlairMsg$FlairCsvResultError.newBuilder(this.errors_);
            builder.h((GeneratedMessageLite)errors_);
            this.errors_ = (FlairMsg$FlairCsvResultError)builder.d();
        }
        else {
            this.errors_ = errors_;
        }
    }
    
    private void mergeOk(final BoolValue ok_) {
        ok_.getClass();
        final BoolValue ok_2 = this.ok_;
        if (ok_2 != null && ok_2 != BoolValue.getDefaultInstance()) {
            this.ok_ = (BoolValue)android.support.v4.media.a.f(this.ok_, ok_);
        }
        else {
            this.ok_ = ok_;
        }
    }
    
    private void mergeStatus(final StringValue status_) {
        status_.getClass();
        final StringValue status_2 = this.status_;
        if (status_2 != null && status_2 != StringValue.getDefaultInstance()) {
            this.status_ = (StringValue)f0.e(this.status_, status_);
        }
        else {
            this.status_ = status_;
        }
    }
    
    private void mergeWarnings(final FlairMsg$FlairCsvResultWarning warnings_) {
        warnings_.getClass();
        final FlairMsg$FlairCsvResultWarning warnings_2 = this.warnings_;
        if (warnings_2 != null && warnings_2 != FlairMsg$FlairCsvResultWarning.getDefaultInstance()) {
            final FlairMsg$FlairCsvResultWarning.a builder = FlairMsg$FlairCsvResultWarning.newBuilder(this.warnings_);
            builder.h((GeneratedMessageLite)warnings_);
            this.warnings_ = (FlairMsg$FlairCsvResultWarning)builder.d();
        }
        else {
            this.warnings_ = warnings_;
        }
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairCsvResult flairMsg$FlairCsvResult) {
        return (a)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairCsvResult);
    }
    
    public static FlairMsg$FlairCsvResult parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResult parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairCsvResult parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairCsvResult> parser() {
        return (n1<FlairMsg$FlairCsvResult>)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setErrors(final FlairMsg$FlairCsvResultError errors_) {
        errors_.getClass();
        this.errors_ = errors_;
    }
    
    private void setOk(final BoolValue ok_) {
        ok_.getClass();
        this.ok_ = ok_;
    }
    
    private void setStatus(final StringValue status_) {
        status_.getClass();
        this.status_ = status_;
    }
    
    private void setWarnings(final FlairMsg$FlairCsvResultWarning warnings_) {
        warnings_.getClass();
        this.warnings_ = warnings_;
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
                final n1<FlairMsg$FlairCsvResult> parser;
                if ((parser = FlairMsg$FlairCsvResult.PARSER) == null) {
                    synchronized (FlairMsg$FlairCsvResult.class) {
                        if (FlairMsg$FlairCsvResult.PARSER == null) {
                            FlairMsg$FlairCsvResult.PARSER = (n1<FlairMsg$FlairCsvResult>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairCsvResult.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairCsvResult.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[] { "status_", "ok_", "errors_", "warnings_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairCsvResult();
            }
        }
    }
    
    public FlairMsg$FlairCsvResultError getErrors() {
        FlairMsg$FlairCsvResultError flairMsg$FlairCsvResultError;
        if ((flairMsg$FlairCsvResultError = this.errors_) == null) {
            flairMsg$FlairCsvResultError = FlairMsg$FlairCsvResultError.getDefaultInstance();
        }
        return flairMsg$FlairCsvResultError;
    }
    
    public BoolValue getOk() {
        BoolValue boolValue;
        if ((boolValue = this.ok_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getStatus() {
        StringValue stringValue;
        if ((stringValue = this.status_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public FlairMsg$FlairCsvResultWarning getWarnings() {
        FlairMsg$FlairCsvResultWarning flairMsg$FlairCsvResultWarning;
        if ((flairMsg$FlairCsvResultWarning = this.warnings_) == null) {
            flairMsg$FlairCsvResultWarning = FlairMsg$FlairCsvResultWarning.getDefaultInstance();
        }
        return flairMsg$FlairCsvResultWarning;
    }
    
    public boolean hasErrors() {
        return this.errors_ != null;
    }
    
    public boolean hasOk() {
        return this.ok_ != null;
    }
    
    public boolean hasStatus() {
        return this.status_ != null;
    }
    
    public boolean hasWarnings() {
        return this.warnings_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairCsvResult, a> implements b
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairCsvResult.access$30100());
        }
    }
}
