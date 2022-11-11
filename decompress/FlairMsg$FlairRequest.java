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

public final class FlairMsg$FlairRequest extends GeneratedMessageLite<FlairMsg$FlairRequest, a> implements d1
{
    public static final int CSS_CLASS_FIELD_NUMBER = 2;
    private static final FlairMsg$FlairRequest DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile n1<FlairMsg$FlairRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 5;
    private String cssClass_;
    private String link_;
    private String name_;
    private String subreddit_;
    private String text_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairRequest()));
    }
    
    private FlairMsg$FlairRequest() {
        this.subreddit_ = "";
        this.cssClass_ = "";
        this.link_ = "";
        this.name_ = "";
        this.text_ = "";
    }
    
    public static /* synthetic */ FlairMsg$FlairRequest access$2400() {
        return FlairMsg$FlairRequest.DEFAULT_INSTANCE;
    }
    
    private void clearCssClass() {
        this.cssClass_ = getDefaultInstance().getCssClass();
    }
    
    private void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearText() {
        this.text_ = getDefaultInstance().getText();
    }
    
    public static FlairMsg$FlairRequest getDefaultInstance() {
        return FlairMsg$FlairRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairRequest flairMsg$FlairRequest) {
        return (a)FlairMsg$FlairRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairRequest);
    }
    
    public static FlairMsg$FlairRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairRequest> parser() {
        return (n1<FlairMsg$FlairRequest>)FlairMsg$FlairRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setCssClass(final String cssClass_) {
        cssClass_.getClass();
        this.cssClass_ = cssClass_;
    }
    
    private void setCssClassBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.cssClass_ = byteString.toStringUtf8();
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
                final n1<FlairMsg$FlairRequest> parser;
                if ((parser = FlairMsg$FlairRequest.PARSER) == null) {
                    synchronized (FlairMsg$FlairRequest.class) {
                        if (FlairMsg$FlairRequest.PARSER == null) {
                            FlairMsg$FlairRequest.PARSER = (n1<FlairMsg$FlairRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairRequest.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208", new Object[] { "subreddit_", "cssClass_", "link_", "name_", "text_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairRequest();
            }
        }
    }
    
    public String getCssClass() {
        return this.cssClass_;
    }
    
    public ByteString getCssClassBytes() {
        return ByteString.copyFromUtf8(this.cssClass_);
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
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairRequest.access$2400());
        }
    }
}
