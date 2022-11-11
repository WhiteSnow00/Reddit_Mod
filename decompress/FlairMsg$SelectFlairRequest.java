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

public final class FlairMsg$SelectFlairRequest extends GeneratedMessageLite<FlairMsg$SelectFlairRequest, a> implements d1
{
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int CSS_CLASS_FIELD_NUMBER = 3;
    private static final FlairMsg$SelectFlairRequest DEFAULT_INSTANCE;
    public static final int FLAIR_TEMPLATE_ID_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile n1<FlairMsg$SelectFlairRequest> PARSER;
    public static final int RETURN_RTJSON_FIELD_NUMBER = 7;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int TEXT_COLOR_FIELD_NUMBER = 9;
    public static final int TEXT_FIELD_NUMBER = 8;
    private String backgroundColor_;
    private String cssClass_;
    private String flairTemplateId_;
    private String link_;
    private String name_;
    private String returnRtjson_;
    private String subreddit_;
    private String textColor_;
    private String text_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$SelectFlairRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$SelectFlairRequest()));
    }
    
    private FlairMsg$SelectFlairRequest() {
        this.subreddit_ = "";
        this.backgroundColor_ = "";
        this.cssClass_ = "";
        this.flairTemplateId_ = "";
        this.link_ = "";
        this.name_ = "";
        this.returnRtjson_ = "";
        this.text_ = "";
        this.textColor_ = "";
    }
    
    public static /* synthetic */ FlairMsg$SelectFlairRequest access$15400() {
        return FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE;
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
    
    private void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearReturnRtjson() {
        this.returnRtjson_ = getDefaultInstance().getReturnRtjson();
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
    
    public static FlairMsg$SelectFlairRequest getDefaultInstance() {
        return FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$SelectFlairRequest flairMsg$SelectFlairRequest) {
        return (a)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$SelectFlairRequest);
    }
    
    public static FlairMsg$SelectFlairRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$SelectFlairRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$SelectFlairRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$SelectFlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$SelectFlairRequest> parser() {
        return (n1<FlairMsg$SelectFlairRequest>)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE.getParserForType();
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
    
    private void setLink(final String link_) {
        link_.getClass();
        this.link_ = link_;
    }
    
    private void setLinkBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }
    
    private void setReturnRtjson(final String returnRtjson_) {
        returnRtjson_.getClass();
        this.returnRtjson_ = returnRtjson_;
    }
    
    private void setReturnRtjsonBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.returnRtjson_ = byteString.toStringUtf8();
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
                final n1<FlairMsg$SelectFlairRequest> parser;
                if ((parser = FlairMsg$SelectFlairRequest.PARSER) == null) {
                    synchronized (FlairMsg$SelectFlairRequest.class) {
                        if (FlairMsg$SelectFlairRequest.PARSER == null) {
                            FlairMsg$SelectFlairRequest.PARSER = (n1<FlairMsg$SelectFlairRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$SelectFlairRequest.DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208", new Object[] { "subreddit_", "backgroundColor_", "cssClass_", "flairTemplateId_", "link_", "name_", "returnRtjson_", "text_", "textColor_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$SelectFlairRequest();
            }
        }
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
    
    public String getLink() {
        return this.link_;
    }
    
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public String getReturnRtjson() {
        return this.returnRtjson_;
    }
    
    public ByteString getReturnRtjsonBytes() {
        return ByteString.copyFromUtf8(this.returnRtjson_);
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
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$SelectFlairRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$SelectFlairRequest.access$15400());
        }
    }
}
