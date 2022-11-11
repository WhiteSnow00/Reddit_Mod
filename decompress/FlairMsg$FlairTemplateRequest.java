// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.a;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairTemplateRequest extends GeneratedMessageLite<FlairMsg$FlairTemplateRequest, a> implements d1
{
    public static final int ALLOWABLE_CONTENT_FIELD_NUMBER = 2;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
    public static final int CSS_CLASS_FIELD_NUMBER = 4;
    private static final FlairMsg$FlairTemplateRequest DEFAULT_INSTANCE;
    public static final int FLAIR_TEMPLATE_ID_FIELD_NUMBER = 5;
    public static final int FLAIR_TYPE_FIELD_NUMBER = 6;
    public static final int MAX_EMOJIS_FIELD_NUMBER = 7;
    public static final int MOD_ONLY_FIELD_NUMBER = 8;
    public static final int OVERRIDE_CSS_FIELD_NUMBER = 9;
    private static volatile n1<FlairMsg$FlairTemplateRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int TEXT_COLOR_FIELD_NUMBER = 11;
    public static final int TEXT_EDITABLE_FIELD_NUMBER = 12;
    public static final int TEXT_FIELD_NUMBER = 10;
    private String allowableContent_;
    private String backgroundColor_;
    private String cssClass_;
    private String flairTemplateId_;
    private String flairType_;
    private long maxEmojis_;
    private boolean modOnly_;
    private boolean overrideCss_;
    private String subreddit_;
    private String textColor_;
    private boolean textEditable_;
    private String text_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairTemplateRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairTemplateRequest()));
    }
    
    private FlairMsg$FlairTemplateRequest() {
        this.subreddit_ = "";
        this.allowableContent_ = "";
        this.backgroundColor_ = "";
        this.cssClass_ = "";
        this.flairTemplateId_ = "";
        this.flairType_ = "";
        this.text_ = "";
        this.textColor_ = "";
    }
    
    public static /* synthetic */ FlairMsg$FlairTemplateRequest access$11500() {
        return FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE;
    }
    
    private void clearAllowableContent() {
        this.allowableContent_ = getDefaultInstance().getAllowableContent();
    }
    
    private void clearBackgroundColor() {
        this.backgroundColor_ = getDefaultInstance().getBackgroundColor();
    }
    
    private void clearCssClass() {
        this.cssClass_ = getDefaultInstance().getCssClass();
    }
    
    private void clearFlairTemplateId() {
        this.flairTemplateId_ = getDefaultInstance().getFlairTemplateId();
    }
    
    private void clearFlairType() {
        this.flairType_ = getDefaultInstance().getFlairType();
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
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearText() {
        this.text_ = getDefaultInstance().getText();
    }
    
    private void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }
    
    private void clearTextEditable() {
        this.textEditable_ = false;
    }
    
    public static FlairMsg$FlairTemplateRequest getDefaultInstance() {
        return FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairTemplateRequest flairMsg$FlairTemplateRequest) {
        return (a)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairTemplateRequest);
    }
    
    public static FlairMsg$FlairTemplateRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairTemplateRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairTemplateRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairTemplateRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairTemplateRequest> parser() {
        return (n1<FlairMsg$FlairTemplateRequest>)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAllowableContent(final String allowableContent_) {
        allowableContent_.getClass();
        this.allowableContent_ = allowableContent_;
    }
    
    private void setAllowableContentBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.allowableContent_ = byteString.toStringUtf8();
    }
    
    private void setBackgroundColor(final String backgroundColor_) {
        backgroundColor_.getClass();
        this.backgroundColor_ = backgroundColor_;
    }
    
    private void setBackgroundColorBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.backgroundColor_ = byteString.toStringUtf8();
    }
    
    private void setCssClass(final String cssClass_) {
        cssClass_.getClass();
        this.cssClass_ = cssClass_;
    }
    
    private void setCssClassBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.cssClass_ = byteString.toStringUtf8();
    }
    
    private void setFlairTemplateId(final String flairTemplateId_) {
        flairTemplateId_.getClass();
        this.flairTemplateId_ = flairTemplateId_;
    }
    
    private void setFlairTemplateIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairTemplateId_ = byteString.toStringUtf8();
    }
    
    private void setFlairType(final String flairType_) {
        flairType_.getClass();
        this.flairType_ = flairType_;
    }
    
    private void setFlairTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairType_ = byteString.toStringUtf8();
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
    
    private void setSubreddit(final String subreddit_) {
        subreddit_.getClass();
        this.subreddit_ = subreddit_;
    }
    
    private void setSubredditBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.subreddit_ = byteString.toStringUtf8();
    }
    
    private void setText(final String text_) {
        text_.getClass();
        this.text_ = text_;
    }
    
    private void setTextBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }
    
    private void setTextColor(final String textColor_) {
        textColor_.getClass();
        this.textColor_ = textColor_;
    }
    
    private void setTextColorBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }
    
    private void setTextEditable(final boolean textEditable_) {
        this.textEditable_ = textEditable_;
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
                final n1<FlairMsg$FlairTemplateRequest> parser;
                if ((parser = FlairMsg$FlairTemplateRequest.PARSER) == null) {
                    synchronized (FlairMsg$FlairTemplateRequest.class) {
                        if (FlairMsg$FlairTemplateRequest.PARSER == null) {
                            FlairMsg$FlairTemplateRequest.PARSER = (n1<FlairMsg$FlairTemplateRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairTemplateRequest.DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0002\b\u0007\t\u0007\n\u0208\u000b\u0208\f\u0007", new Object[] { "subreddit_", "allowableContent_", "backgroundColor_", "cssClass_", "flairTemplateId_", "flairType_", "maxEmojis_", "modOnly_", "overrideCss_", "text_", "textColor_", "textEditable_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairTemplateRequest();
            }
        }
    }
    
    public String getAllowableContent() {
        return this.allowableContent_;
    }
    
    public ByteString getAllowableContentBytes() {
        return ByteString.copyFromUtf8(this.allowableContent_);
    }
    
    public String getBackgroundColor() {
        return this.backgroundColor_;
    }
    
    public ByteString getBackgroundColorBytes() {
        return ByteString.copyFromUtf8(this.backgroundColor_);
    }
    
    public String getCssClass() {
        return this.cssClass_;
    }
    
    public ByteString getCssClassBytes() {
        return ByteString.copyFromUtf8(this.cssClass_);
    }
    
    public String getFlairTemplateId() {
        return this.flairTemplateId_;
    }
    
    public ByteString getFlairTemplateIdBytes() {
        return ByteString.copyFromUtf8(this.flairTemplateId_);
    }
    
    public String getFlairType() {
        return this.flairType_;
    }
    
    public ByteString getFlairTypeBytes() {
        return ByteString.copyFromUtf8(this.flairType_);
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
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public String getText() {
        return this.text_;
    }
    
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }
    
    public String getTextColor() {
        return this.textColor_;
    }
    
    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }
    
    public boolean getTextEditable() {
        return this.textEditable_;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairTemplateRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairTemplateRequest.access$11500());
        }
    }
}
