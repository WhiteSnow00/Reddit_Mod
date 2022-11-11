// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

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
import al0.f0;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import a90.c;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairObject extends GeneratedMessageLite<FlairMsg$FlairObject, a> implements c
{
    public static final int ALLOWABLE_CONTENT_FIELD_NUMBER = 1;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 5;
    public static final int CSS_CLASS_FIELD_NUMBER = 7;
    private static final FlairMsg$FlairObject DEFAULT_INSTANCE;
    public static final int FLAIR_TYPE_FIELD_NUMBER = 13;
    public static final int ID_FIELD_NUMBER = 6;
    public static final int MAX_EMOJIS_FIELD_NUMBER = 8;
    public static final int MOD_ONLY_FIELD_NUMBER = 4;
    public static final int OVERRIDE_CSS_FIELD_NUMBER = 11;
    private static volatile n1<FlairMsg$FlairObject> PARSER;
    public static final int RICHTEXT_FIELD_NUMBER = 9;
    public static final int TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int TEXT_EDITABLE_FIELD_NUMBER = 10;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 12;
    private StringValue allowableContent_;
    private StringValue backgroundColor_;
    private StringValue cssClass_;
    private StringValue flairType_;
    private StringValue id_;
    private long maxEmojis_;
    private boolean modOnly_;
    private boolean overrideCss_;
    private Internal$j<StringValue> richtext_;
    private StringValue textColor_;
    private boolean textEditable_;
    private StringValue text_;
    private StringValue type_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairObject()));
    }
    
    private FlairMsg$FlairObject() {
        this.richtext_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ FlairMsg$FlairObject access$19000() {
        return FlairMsg$FlairObject.DEFAULT_INSTANCE;
    }
    
    private void addAllRichtext(final Iterable<? extends StringValue> iterable) {
        this.ensureRichtextIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.richtext_);
    }
    
    private void addRichtext(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureRichtextIsMutable();
        ((List<StringValue>)this.richtext_).add(n, stringValue);
    }
    
    private void addRichtext(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureRichtextIsMutable();
        ((List<StringValue>)this.richtext_).add(stringValue);
    }
    
    private void clearAllowableContent() {
        this.allowableContent_ = null;
    }
    
    private void clearBackgroundColor() {
        this.backgroundColor_ = null;
    }
    
    private void clearCssClass() {
        this.cssClass_ = null;
    }
    
    private void clearFlairType() {
        this.flairType_ = null;
    }
    
    private void clearId() {
        this.id_ = null;
    }
    
    private void clearMaxEmojis() {
        this.maxEmojis_ = 0L;
    }
    
    private void clearModOnly() {
        this.modOnly_ = false;
    }
    
    private void clearOverrideCss() {
        this.overrideCss_ = false;
    }
    
    private void clearRichtext() {
        this.richtext_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearText() {
        this.text_ = null;
    }
    
    private void clearTextColor() {
        this.textColor_ = null;
    }
    
    private void clearTextEditable() {
        this.textEditable_ = false;
    }
    
    private void clearType() {
        this.type_ = null;
    }
    
    private void ensureRichtextIsMutable() {
        final Internal$j<StringValue> richtext_ = this.richtext_;
        if (!richtext_.E0()) {
            this.richtext_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)richtext_);
        }
    }
    
    public static FlairMsg$FlairObject getDefaultInstance() {
        return FlairMsg$FlairObject.DEFAULT_INSTANCE;
    }
    
    private void mergeAllowableContent(final StringValue allowableContent_) {
        allowableContent_.getClass();
        final StringValue allowableContent_2 = this.allowableContent_;
        if (allowableContent_2 != null && allowableContent_2 != StringValue.getDefaultInstance()) {
            this.allowableContent_ = (StringValue)f0.e(this.allowableContent_, allowableContent_);
        }
        else {
            this.allowableContent_ = allowableContent_;
        }
    }
    
    private void mergeBackgroundColor(final StringValue backgroundColor_) {
        backgroundColor_.getClass();
        final StringValue backgroundColor_2 = this.backgroundColor_;
        if (backgroundColor_2 != null && backgroundColor_2 != StringValue.getDefaultInstance()) {
            this.backgroundColor_ = (StringValue)f0.e(this.backgroundColor_, backgroundColor_);
        }
        else {
            this.backgroundColor_ = backgroundColor_;
        }
    }
    
    private void mergeCssClass(final StringValue cssClass_) {
        cssClass_.getClass();
        final StringValue cssClass_2 = this.cssClass_;
        if (cssClass_2 != null && cssClass_2 != StringValue.getDefaultInstance()) {
            this.cssClass_ = (StringValue)f0.e(this.cssClass_, cssClass_);
        }
        else {
            this.cssClass_ = cssClass_;
        }
    }
    
    private void mergeFlairType(final StringValue flairType_) {
        flairType_.getClass();
        final StringValue flairType_2 = this.flairType_;
        if (flairType_2 != null && flairType_2 != StringValue.getDefaultInstance()) {
            this.flairType_ = (StringValue)f0.e(this.flairType_, flairType_);
        }
        else {
            this.flairType_ = flairType_;
        }
    }
    
    private void mergeId(final StringValue id_) {
        id_.getClass();
        final StringValue id_2 = this.id_;
        if (id_2 != null && id_2 != StringValue.getDefaultInstance()) {
            this.id_ = (StringValue)f0.e(this.id_, id_);
        }
        else {
            this.id_ = id_;
        }
    }
    
    private void mergeText(final StringValue text_) {
        text_.getClass();
        final StringValue text_2 = this.text_;
        if (text_2 != null && text_2 != StringValue.getDefaultInstance()) {
            this.text_ = (StringValue)f0.e(this.text_, text_);
        }
        else {
            this.text_ = text_;
        }
    }
    
    private void mergeTextColor(final StringValue textColor_) {
        textColor_.getClass();
        final StringValue textColor_2 = this.textColor_;
        if (textColor_2 != null && textColor_2 != StringValue.getDefaultInstance()) {
            this.textColor_ = (StringValue)f0.e(this.textColor_, textColor_);
        }
        else {
            this.textColor_ = textColor_;
        }
    }
    
    private void mergeType(final StringValue type_) {
        type_.getClass();
        final StringValue type_2 = this.type_;
        if (type_2 != null && type_2 != StringValue.getDefaultInstance()) {
            this.type_ = (StringValue)f0.e(this.type_, type_);
        }
        else {
            this.type_ = type_;
        }
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairObject.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairObject flairMsg$FlairObject) {
        return (a)FlairMsg$FlairObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairObject);
    }
    
    public static FlairMsg$FlairObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairObject parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairObject parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairObject parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairObject> parser() {
        return (n1<FlairMsg$FlairObject>)FlairMsg$FlairObject.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeRichtext(final int n) {
        this.ensureRichtextIsMutable();
        this.richtext_.remove(n);
    }
    
    private void setAllowableContent(final StringValue allowableContent_) {
        allowableContent_.getClass();
        this.allowableContent_ = allowableContent_;
    }
    
    private void setBackgroundColor(final StringValue backgroundColor_) {
        backgroundColor_.getClass();
        this.backgroundColor_ = backgroundColor_;
    }
    
    private void setCssClass(final StringValue cssClass_) {
        cssClass_.getClass();
        this.cssClass_ = cssClass_;
    }
    
    private void setFlairType(final StringValue flairType_) {
        flairType_.getClass();
        this.flairType_ = flairType_;
    }
    
    private void setId(final StringValue id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setMaxEmojis(final long maxEmojis_) {
        this.maxEmojis_ = maxEmojis_;
    }
    
    private void setModOnly(final boolean modOnly_) {
        this.modOnly_ = modOnly_;
    }
    
    private void setOverrideCss(final boolean overrideCss_) {
        this.overrideCss_ = overrideCss_;
    }
    
    private void setRichtext(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureRichtextIsMutable();
        ((List<StringValue>)this.richtext_).set(n, stringValue);
    }
    
    private void setText(final StringValue text_) {
        text_.getClass();
        this.text_ = text_;
    }
    
    private void setTextColor(final StringValue textColor_) {
        textColor_.getClass();
        this.textColor_ = textColor_;
    }
    
    private void setTextEditable(final boolean textEditable_) {
        this.textEditable_ = textEditable_;
    }
    
    private void setType(final StringValue type_) {
        type_.getClass();
        this.type_ = type_;
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
                final n1<FlairMsg$FlairObject> parser;
                if ((parser = FlairMsg$FlairObject.PARSER) == null) {
                    synchronized (FlairMsg$FlairObject.class) {
                        if (FlairMsg$FlairObject.PARSER == null) {
                            FlairMsg$FlairObject.PARSER = (n1<FlairMsg$FlairObject>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairObject.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairObject.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairObject.DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\u0007\u0005\t\u0006\t\u0007\t\b\u0002\t\u001b\n\u0007\u000b\u0007\f\t\r\t", new Object[] { "allowableContent_", "text_", "textColor_", "modOnly_", "backgroundColor_", "id_", "cssClass_", "maxEmojis_", "richtext_", StringValue.class, "textEditable_", "overrideCss_", "type_", "flairType_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairObject();
            }
        }
    }
    
    public StringValue getAllowableContent() {
        StringValue stringValue;
        if ((stringValue = this.allowableContent_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getBackgroundColor() {
        StringValue stringValue;
        if ((stringValue = this.backgroundColor_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getCssClass() {
        StringValue stringValue;
        if ((stringValue = this.cssClass_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getFlairType() {
        StringValue stringValue;
        if ((stringValue = this.flairType_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getId() {
        StringValue stringValue;
        if ((stringValue = this.id_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public long getMaxEmojis() {
        return this.maxEmojis_;
    }
    
    public boolean getModOnly() {
        return this.modOnly_;
    }
    
    public boolean getOverrideCss() {
        return this.overrideCss_;
    }
    
    public StringValue getRichtext(final int n) {
        return ((List<StringValue>)this.richtext_).get(n);
    }
    
    public int getRichtextCount() {
        return ((List)this.richtext_).size();
    }
    
    public List<StringValue> getRichtextList() {
        return (List<StringValue>)this.richtext_;
    }
    
    public x1 getRichtextOrBuilder(final int n) {
        return ((List<x1>)this.richtext_).get(n);
    }
    
    public List<? extends x1> getRichtextOrBuilderList() {
        return (List<? extends x1>)this.richtext_;
    }
    
    public StringValue getText() {
        StringValue stringValue;
        if ((stringValue = this.text_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getTextColor() {
        StringValue stringValue;
        if ((stringValue = this.textColor_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean getTextEditable() {
        return this.textEditable_;
    }
    
    public StringValue getType() {
        StringValue stringValue;
        if ((stringValue = this.type_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasAllowableContent() {
        return this.allowableContent_ != null;
    }
    
    public boolean hasBackgroundColor() {
        return this.backgroundColor_ != null;
    }
    
    public boolean hasCssClass() {
        return this.cssClass_ != null;
    }
    
    public boolean hasFlairType() {
        return this.flairType_ != null;
    }
    
    public boolean hasId() {
        return this.id_ != null;
    }
    
    public boolean hasText() {
        return this.text_ != null;
    }
    
    public boolean hasTextColor() {
        return this.textColor_ != null;
    }
    
    public boolean hasType() {
        return this.type_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairObject, a> implements c
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairObject.access$19000());
        }
    }
}
