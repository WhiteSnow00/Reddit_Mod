// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

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

public final class LinksandcommentsMsg$CommentRequest extends GeneratedMessageLite<LinksandcommentsMsg$CommentRequest, a> implements d1
{
    private static final LinksandcommentsMsg$CommentRequest DEFAULT_INSTANCE;
    private static volatile n1<LinksandcommentsMsg$CommentRequest> PARSER;
    public static final int RETURN_RTJSON_FIELD_NUMBER = 1;
    public static final int RICHTEXT_JSON_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int THING_ID_FIELD_NUMBER = 4;
    private boolean returnRtjson_;
    private String richtextJson_;
    private String text_;
    private String thingId_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$CommentRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$CommentRequest()));
    }
    
    private LinksandcommentsMsg$CommentRequest() {
        this.richtextJson_ = "";
        this.text_ = "";
        this.thingId_ = "";
    }
    
    public static /* synthetic */ LinksandcommentsMsg$CommentRequest access$000() {
        return LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE;
    }
    
    private void clearReturnRtjson() {
        this.returnRtjson_ = false;
    }
    
    private void clearRichtextJson() {
        this.richtextJson_ = getDefaultInstance().getRichtextJson();
    }
    
    private void clearText() {
        this.text_ = getDefaultInstance().getText();
    }
    
    private void clearThingId() {
        this.thingId_ = getDefaultInstance().getThingId();
    }
    
    public static LinksandcommentsMsg$CommentRequest getDefaultInstance() {
        return LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$CommentRequest linksandcommentsMsg$CommentRequest) {
        return (a)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$CommentRequest);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$CommentRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$CommentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$CommentRequest> parser() {
        return (n1<LinksandcommentsMsg$CommentRequest>)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setReturnRtjson(final boolean returnRtjson_) {
        this.returnRtjson_ = returnRtjson_;
    }
    
    private void setRichtextJson(final String richtextJson_) {
        richtextJson_.getClass();
        this.richtextJson_ = richtextJson_;
    }
    
    private void setRichtextJsonBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.richtextJson_ = byteString.toStringUtf8();
    }
    
    private void setText(final String text_) {
        text_.getClass();
        this.text_ = text_;
    }
    
    private void setTextBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }
    
    private void setThingId(final String thingId_) {
        thingId_.getClass();
        this.thingId_ = thingId_;
    }
    
    private void setThingIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.thingId_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<LinksandcommentsMsg$CommentRequest> parser;
                if ((parser = LinksandcommentsMsg$CommentRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$CommentRequest.class) {
                        if (LinksandcommentsMsg$CommentRequest.PARSER == null) {
                            LinksandcommentsMsg$CommentRequest.PARSER = (n1<LinksandcommentsMsg$CommentRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$CommentRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0208\u0003\u0208\u0004\u0208", new Object[] { "returnRtjson_", "richtextJson_", "text_", "thingId_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$CommentRequest();
            }
        }
    }
    
    public boolean getReturnRtjson() {
        return this.returnRtjson_;
    }
    
    public String getRichtextJson() {
        return this.richtextJson_;
    }
    
    public ByteString getRichtextJsonBytes() {
        return ByteString.copyFromUtf8(this.richtextJson_);
    }
    
    public String getText() {
        return this.text_;
    }
    
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }
    
    public String getThingId() {
        return this.thingId_;
    }
    
    public ByteString getThingIdBytes() {
        return ByteString.copyFromUtf8(this.thingId_);
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$CommentRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$CommentRequest.access$000());
        }
    }
}
