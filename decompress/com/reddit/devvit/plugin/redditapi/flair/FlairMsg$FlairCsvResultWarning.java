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

public final class FlairMsg$FlairCsvResultWarning extends GeneratedMessageLite<FlairMsg$FlairCsvResultWarning, a> implements d1
{
    private static final FlairMsg$FlairCsvResultWarning DEFAULT_INSTANCE;
    private static volatile n1<FlairMsg$FlairCsvResultWarning> PARSER;
    public static final int TEXT_FIELD_NUMBER = 1;
    private StringValue text_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairCsvResultWarning.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairCsvResultWarning()));
    }
    
    private FlairMsg$FlairCsvResultWarning() {
    }
    
    public static /* synthetic */ FlairMsg$FlairCsvResultWarning access$29600() {
        return FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE;
    }
    
    private void clearText() {
        this.text_ = null;
    }
    
    public static FlairMsg$FlairCsvResultWarning getDefaultInstance() {
        return FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE;
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
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairCsvResultWarning flairMsg$FlairCsvResultWarning) {
        return (a)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairCsvResultWarning);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairCsvResultWarning parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairCsvResultWarning)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairCsvResultWarning> parser() {
        return (n1<FlairMsg$FlairCsvResultWarning>)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setText(final StringValue text_) {
        text_.getClass();
        this.text_ = text_;
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
                final n1<FlairMsg$FlairCsvResultWarning> parser;
                if ((parser = FlairMsg$FlairCsvResultWarning.PARSER) == null) {
                    synchronized (FlairMsg$FlairCsvResultWarning.class) {
                        if (FlairMsg$FlairCsvResultWarning.PARSER == null) {
                            FlairMsg$FlairCsvResultWarning.PARSER = (n1<FlairMsg$FlairCsvResultWarning>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairCsvResultWarning.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "text_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairCsvResultWarning();
            }
        }
    }
    
    public StringValue getText() {
        StringValue stringValue;
        if ((stringValue = this.text_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasText() {
        return this.text_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairCsvResultWarning, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairCsvResultWarning.access$29600());
        }
    }
}
