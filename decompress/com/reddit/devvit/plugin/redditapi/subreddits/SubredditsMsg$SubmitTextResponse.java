// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import h90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import t5.w;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SubredditsMsg$SubmitTextResponse extends GeneratedMessageLite<SubredditsMsg$SubmitTextResponse, a> implements d1
{
    private static final SubredditsMsg$SubmitTextResponse DEFAULT_INSTANCE;
    private static volatile n1<SubredditsMsg$SubmitTextResponse> PARSER;
    public static final int SUBMIT_TEXT_FIELD_NUMBER = 1;
    public static final int SUBMIT_TEXT_HTML_FIELD_NUMBER = 2;
    private StringValue submitTextHtml_;
    private StringValue submitText_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubmitTextResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubmitTextResponse()));
    }
    
    private SubredditsMsg$SubmitTextResponse() {
    }
    
    public static SubredditsMsg$SubmitTextResponse access$41400() {
        return SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$41500(final SubredditsMsg$SubmitTextResponse subredditsMsg$SubmitTextResponse, final StringValue submitText) {
        subredditsMsg$SubmitTextResponse.setSubmitText(submitText);
    }
    
    public static void access$41600(final SubredditsMsg$SubmitTextResponse subredditsMsg$SubmitTextResponse, final StringValue stringValue) {
        subredditsMsg$SubmitTextResponse.mergeSubmitText(stringValue);
    }
    
    public static void access$41700(final SubredditsMsg$SubmitTextResponse subredditsMsg$SubmitTextResponse) {
        subredditsMsg$SubmitTextResponse.clearSubmitText();
    }
    
    public static void access$41800(final SubredditsMsg$SubmitTextResponse subredditsMsg$SubmitTextResponse, final StringValue submitTextHtml) {
        subredditsMsg$SubmitTextResponse.setSubmitTextHtml(submitTextHtml);
    }
    
    public static void access$41900(final SubredditsMsg$SubmitTextResponse subredditsMsg$SubmitTextResponse, final StringValue stringValue) {
        subredditsMsg$SubmitTextResponse.mergeSubmitTextHtml(stringValue);
    }
    
    public static void access$42000(final SubredditsMsg$SubmitTextResponse subredditsMsg$SubmitTextResponse) {
        subredditsMsg$SubmitTextResponse.clearSubmitTextHtml();
    }
    
    private void clearSubmitText() {
        this.submitText_ = null;
    }
    
    private void clearSubmitTextHtml() {
        this.submitTextHtml_ = null;
    }
    
    public static SubredditsMsg$SubmitTextResponse getDefaultInstance() {
        return SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeSubmitText(final StringValue submitText_) {
        submitText_.getClass();
        final StringValue submitText_2 = this.submitText_;
        if (submitText_2 != null && submitText_2 != StringValue.getDefaultInstance()) {
            this.submitText_ = (StringValue)w.e(this.submitText_, submitText_);
        }
        else {
            this.submitText_ = submitText_;
        }
    }
    
    private void mergeSubmitTextHtml(final StringValue submitTextHtml_) {
        submitTextHtml_.getClass();
        final StringValue submitTextHtml_2 = this.submitTextHtml_;
        if (submitTextHtml_2 != null && submitTextHtml_2 != StringValue.getDefaultInstance()) {
            this.submitTextHtml_ = (StringValue)w.e(this.submitTextHtml_, submitTextHtml_);
        }
        else {
            this.submitTextHtml_ = submitTextHtml_;
        }
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubmitTextResponse subredditsMsg$SubmitTextResponse) {
        return (a)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubmitTextResponse);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubmitTextResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubmitTextResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubmitTextResponse> parser() {
        return (n1<SubredditsMsg$SubmitTextResponse>)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setSubmitText(final StringValue submitText_) {
        submitText_.getClass();
        this.submitText_ = submitText_;
    }
    
    private void setSubmitTextHtml(final StringValue submitTextHtml_) {
        submitTextHtml_.getClass();
        this.submitTextHtml_ = submitTextHtml_;
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
                final n1<SubredditsMsg$SubmitTextResponse> parser;
                if ((parser = SubredditsMsg$SubmitTextResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubmitTextResponse.class) {
                        if (SubredditsMsg$SubmitTextResponse.PARSER == null) {
                            SubredditsMsg$SubmitTextResponse.PARSER = (n1<SubredditsMsg$SubmitTextResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubmitTextResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "submitText_", "submitTextHtml_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubmitTextResponse();
            }
        }
    }
    
    public StringValue getSubmitText() {
        StringValue stringValue;
        if ((stringValue = this.submitText_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getSubmitTextHtml() {
        StringValue stringValue;
        if ((stringValue = this.submitTextHtml_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasSubmitText() {
        return this.submitText_ != null;
    }
    
    public boolean hasSubmitTextHtml() {
        return this.submitTextHtml_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubmitTextResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubmitTextResponse.access$41400());
        }
    }
}
