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
import a90.e;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$UserFlair extends GeneratedMessageLite<FlairMsg$UserFlair, a> implements e
{
    private static final FlairMsg$UserFlair DEFAULT_INSTANCE;
    public static final int FLAIR_CSS_CLASS_FIELD_NUMBER = 1;
    public static final int FLAIR_TEXT_FIELD_NUMBER = 3;
    private static volatile n1<FlairMsg$UserFlair> PARSER;
    public static final int USER_FIELD_NUMBER = 2;
    private StringValue flairCssClass_;
    private StringValue flairText_;
    private StringValue user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$UserFlair.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$UserFlair()));
    }
    
    private FlairMsg$UserFlair() {
    }
    
    public static /* synthetic */ FlairMsg$UserFlair access$26600() {
        return FlairMsg$UserFlair.DEFAULT_INSTANCE;
    }
    
    private void clearFlairCssClass() {
        this.flairCssClass_ = null;
    }
    
    private void clearFlairText() {
        this.flairText_ = null;
    }
    
    private void clearUser() {
        this.user_ = null;
    }
    
    public static FlairMsg$UserFlair getDefaultInstance() {
        return FlairMsg$UserFlair.DEFAULT_INSTANCE;
    }
    
    private void mergeFlairCssClass(final StringValue flairCssClass_) {
        flairCssClass_.getClass();
        final StringValue flairCssClass_2 = this.flairCssClass_;
        if (flairCssClass_2 != null && flairCssClass_2 != StringValue.getDefaultInstance()) {
            this.flairCssClass_ = (StringValue)f0.e(this.flairCssClass_, flairCssClass_);
        }
        else {
            this.flairCssClass_ = flairCssClass_;
        }
    }
    
    private void mergeFlairText(final StringValue flairText_) {
        flairText_.getClass();
        final StringValue flairText_2 = this.flairText_;
        if (flairText_2 != null && flairText_2 != StringValue.getDefaultInstance()) {
            this.flairText_ = (StringValue)f0.e(this.flairText_, flairText_);
        }
        else {
            this.flairText_ = flairText_;
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
        return (a)FlairMsg$UserFlair.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$UserFlair flairMsg$UserFlair) {
        return (a)FlairMsg$UserFlair.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$UserFlair);
    }
    
    public static FlairMsg$UserFlair parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$UserFlair parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$UserFlair parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$UserFlair parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$UserFlair parseFrom(final l l) throws IOException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$UserFlair parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$UserFlair parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$UserFlair parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$UserFlair parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$UserFlair parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$UserFlair parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$UserFlair parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$UserFlair)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$UserFlair> parser() {
        return (n1<FlairMsg$UserFlair>)FlairMsg$UserFlair.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairCssClass(final StringValue flairCssClass_) {
        flairCssClass_.getClass();
        this.flairCssClass_ = flairCssClass_;
    }
    
    private void setFlairText(final StringValue flairText_) {
        flairText_.getClass();
        this.flairText_ = flairText_;
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
                final n1<FlairMsg$UserFlair> parser;
                if ((parser = FlairMsg$UserFlair.PARSER) == null) {
                    synchronized (FlairMsg$UserFlair.class) {
                        if (FlairMsg$UserFlair.PARSER == null) {
                            FlairMsg$UserFlair.PARSER = (n1<FlairMsg$UserFlair>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$UserFlair.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$UserFlair.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$UserFlair.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[] { "flairCssClass_", "user_", "flairText_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$UserFlair();
            }
        }
    }
    
    public StringValue getFlairCssClass() {
        StringValue stringValue;
        if ((stringValue = this.flairCssClass_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getFlairText() {
        StringValue stringValue;
        if ((stringValue = this.flairText_) == null) {
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
    
    public boolean hasFlairCssClass() {
        return this.flairCssClass_ != null;
    }
    
    public boolean hasFlairText() {
        return this.flairText_ != null;
    }
    
    public boolean hasUser() {
        return this.user_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$UserFlair, a> implements e
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$UserFlair.access$26600());
        }
    }
}
