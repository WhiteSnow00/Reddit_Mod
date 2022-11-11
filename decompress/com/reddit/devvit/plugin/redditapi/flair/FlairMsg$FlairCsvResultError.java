// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import a90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import al0.f0;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairCsvResultError extends GeneratedMessageLite<FlairMsg$FlairCsvResultError, a> implements d1
{
    public static final int CSS_FIELD_NUMBER = 1;
    private static final FlairMsg$FlairCsvResultError DEFAULT_INSTANCE;
    private static volatile n1<FlairMsg$FlairCsvResultError> PARSER;
    public static final int ROW_FIELD_NUMBER = 2;
    public static final int USER_FIELD_NUMBER = 3;
    private StringValue css_;
    private StringValue row_;
    private StringValue user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairCsvResultError.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairCsvResultError()));
    }
    
    private FlairMsg$FlairCsvResultError() {
    }
    
    public static /* synthetic */ FlairMsg$FlairCsvResultError access$28500() {
        return FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE;
    }
    
    private void clearCss() {
        this.css_ = null;
    }
    
    private void clearRow() {
        this.row_ = null;
    }
    
    private void clearUser() {
        this.user_ = null;
    }
    
    public static FlairMsg$FlairCsvResultError getDefaultInstance() {
        return FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE;
    }
    
    private void mergeCss(final StringValue css_) {
        css_.getClass();
        final StringValue css_2 = this.css_;
        if (css_2 != null && css_2 != StringValue.getDefaultInstance()) {
            this.css_ = (StringValue)f0.e(this.css_, css_);
        }
        else {
            this.css_ = css_;
        }
    }
    
    private void mergeRow(final StringValue row_) {
        row_.getClass();
        final StringValue row_2 = this.row_;
        if (row_2 != null && row_2 != StringValue.getDefaultInstance()) {
            this.row_ = (StringValue)f0.e(this.row_, row_);
        }
        else {
            this.row_ = row_;
        }
    }
    
    private void mergeUser(final StringValue user_) {
        user_.getClass();
        final StringValue user_2 = this.user_;
        if (user_2 != null && user_2 != StringValue.getDefaultInstance()) {
            this.user_ = (StringValue)f0.e(this.user_, user_);
        }
        else {
            this.user_ = user_;
        }
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairCsvResultError flairMsg$FlairCsvResultError) {
        return (a)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairCsvResultError);
    }
    
    public static FlairMsg$FlairCsvResultError parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResultError parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairCsvResultError parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultError)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairCsvResultError> parser() {
        return (n1<FlairMsg$FlairCsvResultError>)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setCss(final StringValue css_) {
        css_.getClass();
        this.css_ = css_;
    }
    
    private void setRow(final StringValue row_) {
        row_.getClass();
        this.row_ = row_;
    }
    
    private void setUser(final StringValue user_) {
        user_.getClass();
        this.user_ = user_;
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
                final n1<FlairMsg$FlairCsvResultError> parser;
                if ((parser = FlairMsg$FlairCsvResultError.PARSER) == null) {
                    synchronized (FlairMsg$FlairCsvResultError.class) {
                        if (FlairMsg$FlairCsvResultError.PARSER == null) {
                            FlairMsg$FlairCsvResultError.PARSER = (n1<FlairMsg$FlairCsvResultError>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairCsvResultError.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[] { "css_", "row_", "user_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairCsvResultError();
            }
        }
    }
    
    public StringValue getCss() {
        StringValue stringValue;
        if ((stringValue = this.css_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getRow() {
        StringValue stringValue;
        if ((stringValue = this.row_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getUser() {
        StringValue stringValue;
        if ((stringValue = this.user_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasCss() {
        return this.css_ != null;
    }
    
    public boolean hasRow() {
        return this.row_ != null;
    }
    
    public boolean hasUser() {
        return this.user_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairCsvResultError, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairCsvResultError.access$28500());
        }
    }
}
