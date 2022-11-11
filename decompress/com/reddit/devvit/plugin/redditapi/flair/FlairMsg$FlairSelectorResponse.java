// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
import a90.d;
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
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class FlairMsg$FlairSelectorResponse extends GeneratedMessageLite<FlairMsg$FlairSelectorResponse, a> implements d1
{
    public static final int CHOICES_FIELD_NUMBER = 2;
    public static final int CURRENT_FIELD_NUMBER = 1;
    private static final FlairMsg$FlairSelectorResponse DEFAULT_INSTANCE;
    private static volatile n1<FlairMsg$FlairSelectorResponse> PARSER;
    private Internal$j<FlairMsg$FlairSelectorResponseOption> choices_;
    private FlairMsg$FlairSelectorResponseOption current_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairSelectorResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairSelectorResponse()));
    }
    
    private FlairMsg$FlairSelectorResponse() {
        this.choices_ = (Internal$j<FlairMsg$FlairSelectorResponseOption>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ FlairMsg$FlairSelectorResponse access$25500() {
        return FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE;
    }
    
    private void addAllChoices(final Iterable<? extends FlairMsg$FlairSelectorResponseOption> iterable) {
        this.ensureChoicesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.choices_);
    }
    
    private void addChoices(final int n, final FlairMsg$FlairSelectorResponseOption flairMsg$FlairSelectorResponseOption) {
        flairMsg$FlairSelectorResponseOption.getClass();
        this.ensureChoicesIsMutable();
        ((List<FlairMsg$FlairSelectorResponseOption>)this.choices_).add(n, flairMsg$FlairSelectorResponseOption);
    }
    
    private void addChoices(final FlairMsg$FlairSelectorResponseOption flairMsg$FlairSelectorResponseOption) {
        flairMsg$FlairSelectorResponseOption.getClass();
        this.ensureChoicesIsMutable();
        ((List<FlairMsg$FlairSelectorResponseOption>)this.choices_).add(flairMsg$FlairSelectorResponseOption);
    }
    
    private void clearChoices() {
        this.choices_ = (Internal$j<FlairMsg$FlairSelectorResponseOption>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearCurrent() {
        this.current_ = null;
    }
    
    private void ensureChoicesIsMutable() {
        final Internal$j<FlairMsg$FlairSelectorResponseOption> choices_ = this.choices_;
        if (!choices_.E0()) {
            this.choices_ = (Internal$j<FlairMsg$FlairSelectorResponseOption>)GeneratedMessageLite.mutableCopy((Internal$j)choices_);
        }
    }
    
    public static FlairMsg$FlairSelectorResponse getDefaultInstance() {
        return FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeCurrent(final FlairMsg$FlairSelectorResponseOption current_) {
        current_.getClass();
        final FlairMsg$FlairSelectorResponseOption current_2 = this.current_;
        if (current_2 != null && current_2 != FlairMsg$FlairSelectorResponseOption.getDefaultInstance()) {
            final FlairMsg$FlairSelectorResponseOption.a builder = FlairMsg$FlairSelectorResponseOption.newBuilder(this.current_);
            builder.h((GeneratedMessageLite)current_);
            this.current_ = (FlairMsg$FlairSelectorResponseOption)builder.d();
        }
        else {
            this.current_ = current_;
        }
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairSelectorResponse flairMsg$FlairSelectorResponse) {
        return (a)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairSelectorResponse);
    }
    
    public static FlairMsg$FlairSelectorResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairSelectorResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairSelectorResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairSelectorResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairSelectorResponse> parser() {
        return (n1<FlairMsg$FlairSelectorResponse>)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeChoices(final int n) {
        this.ensureChoicesIsMutable();
        this.choices_.remove(n);
    }
    
    private void setChoices(final int n, final FlairMsg$FlairSelectorResponseOption flairMsg$FlairSelectorResponseOption) {
        flairMsg$FlairSelectorResponseOption.getClass();
        this.ensureChoicesIsMutable();
        ((List<FlairMsg$FlairSelectorResponseOption>)this.choices_).set(n, flairMsg$FlairSelectorResponseOption);
    }
    
    private void setCurrent(final FlairMsg$FlairSelectorResponseOption current_) {
        current_.getClass();
        this.current_ = current_;
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
                final n1<FlairMsg$FlairSelectorResponse> parser;
                if ((parser = FlairMsg$FlairSelectorResponse.PARSER) == null) {
                    synchronized (FlairMsg$FlairSelectorResponse.class) {
                        if (FlairMsg$FlairSelectorResponse.PARSER == null) {
                            FlairMsg$FlairSelectorResponse.PARSER = (n1<FlairMsg$FlairSelectorResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairSelectorResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[] { "current_", "choices_", FlairMsg$FlairSelectorResponseOption.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairSelectorResponse();
            }
        }
    }
    
    public FlairMsg$FlairSelectorResponseOption getChoices(final int n) {
        return ((List<FlairMsg$FlairSelectorResponseOption>)this.choices_).get(n);
    }
    
    public int getChoicesCount() {
        return ((List)this.choices_).size();
    }
    
    public List<FlairMsg$FlairSelectorResponseOption> getChoicesList() {
        return (List<FlairMsg$FlairSelectorResponseOption>)this.choices_;
    }
    
    public d getChoicesOrBuilder(final int n) {
        return ((List<d>)this.choices_).get(n);
    }
    
    public List<? extends d> getChoicesOrBuilderList() {
        return (List<? extends d>)this.choices_;
    }
    
    public FlairMsg$FlairSelectorResponseOption getCurrent() {
        FlairMsg$FlairSelectorResponseOption flairMsg$FlairSelectorResponseOption;
        if ((flairMsg$FlairSelectorResponseOption = this.current_) == null) {
            flairMsg$FlairSelectorResponseOption = FlairMsg$FlairSelectorResponseOption.getDefaultInstance();
        }
        return flairMsg$FlairSelectorResponseOption;
    }
    
    public boolean hasCurrent() {
        return this.current_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairSelectorResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairSelectorResponse.access$25500());
        }
    }
}
