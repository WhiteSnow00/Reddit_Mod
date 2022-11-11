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
import android.support.v4.media.a;
import al0.f0;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import a90.d;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairSelectorResponseOption extends GeneratedMessageLite<FlairMsg$FlairSelectorResponseOption, a> implements d
{
    private static final FlairMsg$FlairSelectorResponseOption DEFAULT_INSTANCE;
    public static final int FLAIR_CSS_CLASS_FIELD_NUMBER = 1;
    public static final int FLAIR_POSITION_FIELD_NUMBER = 5;
    public static final int FLAIR_TEMPLATE_ID_FIELD_NUMBER = 2;
    public static final int FLAIR_TEXT_EDITABLE_FIELD_NUMBER = 4;
    public static final int FLAIR_TEXT_FIELD_NUMBER = 3;
    private static volatile n1<FlairMsg$FlairSelectorResponseOption> PARSER;
    private StringValue flairCssClass_;
    private StringValue flairPosition_;
    private StringValue flairTemplateId_;
    private BoolValue flairTextEditable_;
    private StringValue flairText_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairSelectorResponseOption.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairSelectorResponseOption()));
    }
    
    private FlairMsg$FlairSelectorResponseOption() {
    }
    
    public static /* synthetic */ FlairMsg$FlairSelectorResponseOption access$23800() {
        return FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE;
    }
    
    private void clearFlairCssClass() {
        this.flairCssClass_ = null;
    }
    
    private void clearFlairPosition() {
        this.flairPosition_ = null;
    }
    
    private void clearFlairTemplateId() {
        this.flairTemplateId_ = null;
    }
    
    private void clearFlairText() {
        this.flairText_ = null;
    }
    
    private void clearFlairTextEditable() {
        this.flairTextEditable_ = null;
    }
    
    public static FlairMsg$FlairSelectorResponseOption getDefaultInstance() {
        return FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE;
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
    
    private void mergeFlairPosition(final StringValue flairPosition_) {
        flairPosition_.getClass();
        final StringValue flairPosition_2 = this.flairPosition_;
        if (flairPosition_2 != null && flairPosition_2 != StringValue.getDefaultInstance()) {
            this.flairPosition_ = (StringValue)f0.e(this.flairPosition_, flairPosition_);
        }
        else {
            this.flairPosition_ = flairPosition_;
        }
    }
    
    private void mergeFlairTemplateId(final StringValue flairTemplateId_) {
        flairTemplateId_.getClass();
        final StringValue flairTemplateId_2 = this.flairTemplateId_;
        if (flairTemplateId_2 != null && flairTemplateId_2 != StringValue.getDefaultInstance()) {
            this.flairTemplateId_ = (StringValue)f0.e(this.flairTemplateId_, flairTemplateId_);
        }
        else {
            this.flairTemplateId_ = flairTemplateId_;
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
    
    private void mergeFlairTextEditable(final BoolValue flairTextEditable_) {
        flairTextEditable_.getClass();
        final BoolValue flairTextEditable_2 = this.flairTextEditable_;
        if (flairTextEditable_2 != null && flairTextEditable_2 != BoolValue.getDefaultInstance()) {
            this.flairTextEditable_ = (BoolValue)android.support.v4.media.a.f(this.flairTextEditable_, flairTextEditable_);
        }
        else {
            this.flairTextEditable_ = flairTextEditable_;
        }
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairSelectorResponseOption flairMsg$FlairSelectorResponseOption) {
        return (a)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairSelectorResponseOption);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairSelectorResponseOption parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponseOption)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairSelectorResponseOption> parser() {
        return (n1<FlairMsg$FlairSelectorResponseOption>)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFlairCssClass(final StringValue flairCssClass_) {
        flairCssClass_.getClass();
        this.flairCssClass_ = flairCssClass_;
    }
    
    private void setFlairPosition(final StringValue flairPosition_) {
        flairPosition_.getClass();
        this.flairPosition_ = flairPosition_;
    }
    
    private void setFlairTemplateId(final StringValue flairTemplateId_) {
        flairTemplateId_.getClass();
        this.flairTemplateId_ = flairTemplateId_;
    }
    
    private void setFlairText(final StringValue flairText_) {
        flairText_.getClass();
        this.flairText_ = flairText_;
    }
    
    private void setFlairTextEditable(final BoolValue flairTextEditable_) {
        flairTextEditable_.getClass();
        this.flairTextEditable_ = flairTextEditable_;
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
                final n1<FlairMsg$FlairSelectorResponseOption> parser;
                if ((parser = FlairMsg$FlairSelectorResponseOption.PARSER) == null) {
                    synchronized (FlairMsg$FlairSelectorResponseOption.class) {
                        if (FlairMsg$FlairSelectorResponseOption.PARSER == null) {
                            FlairMsg$FlairSelectorResponseOption.PARSER = (n1<FlairMsg$FlairSelectorResponseOption>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairSelectorResponseOption.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t", new Object[] { "flairCssClass_", "flairTemplateId_", "flairText_", "flairTextEditable_", "flairPosition_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairSelectorResponseOption();
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
    
    public StringValue getFlairPosition() {
        StringValue stringValue;
        if ((stringValue = this.flairPosition_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getFlairTemplateId() {
        StringValue stringValue;
        if ((stringValue = this.flairTemplateId_) == null) {
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
    
    public BoolValue getFlairTextEditable() {
        BoolValue boolValue;
        if ((boolValue = this.flairTextEditable_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public boolean hasFlairCssClass() {
        return this.flairCssClass_ != null;
    }
    
    public boolean hasFlairPosition() {
        return this.flairPosition_ != null;
    }
    
    public boolean hasFlairTemplateId() {
        return this.flairTemplateId_ != null;
    }
    
    public boolean hasFlairText() {
        return this.flairText_ != null;
    }
    
    public boolean hasFlairTextEditable() {
        return this.flairTextEditable_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairSelectorResponseOption, a> implements d
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairSelectorResponseOption.access$23800());
        }
    }
}
