// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.flair;

import com.google.protobuf.GeneratedMessageLite$b;
import a90.c;
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

public final class FlairMsg$FlairArray extends GeneratedMessageLite<FlairMsg$FlairArray, a> implements d1
{
    private static final FlairMsg$FlairArray DEFAULT_INSTANCE;
    public static final int FLAIR_FIELD_NUMBER = 1;
    private static volatile n1<FlairMsg$FlairArray> PARSER;
    private Internal$j<FlairMsg$FlairObject> flair_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)FlairMsg$FlairArray.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FlairMsg$FlairArray()));
    }
    
    private FlairMsg$FlairArray() {
        this.flair_ = (Internal$j<FlairMsg$FlairObject>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ FlairMsg$FlairArray access$23000() {
        return FlairMsg$FlairArray.DEFAULT_INSTANCE;
    }
    
    private void addAllFlair(final Iterable<? extends FlairMsg$FlairObject> iterable) {
        this.ensureFlairIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.flair_);
    }
    
    private void addFlair(final int n, final FlairMsg$FlairObject flairMsg$FlairObject) {
        flairMsg$FlairObject.getClass();
        this.ensureFlairIsMutable();
        ((List<FlairMsg$FlairObject>)this.flair_).add(n, flairMsg$FlairObject);
    }
    
    private void addFlair(final FlairMsg$FlairObject flairMsg$FlairObject) {
        flairMsg$FlairObject.getClass();
        this.ensureFlairIsMutable();
        ((List<FlairMsg$FlairObject>)this.flair_).add(flairMsg$FlairObject);
    }
    
    private void clearFlair() {
        this.flair_ = (Internal$j<FlairMsg$FlairObject>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureFlairIsMutable() {
        final Internal$j<FlairMsg$FlairObject> flair_ = this.flair_;
        if (!flair_.E0()) {
            this.flair_ = (Internal$j<FlairMsg$FlairObject>)GeneratedMessageLite.mutableCopy((Internal$j)flair_);
        }
    }
    
    public static FlairMsg$FlairArray getDefaultInstance() {
        return FlairMsg$FlairArray.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)FlairMsg$FlairArray.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final FlairMsg$FlairArray flairMsg$FlairArray) {
        return (a)FlairMsg$FlairArray.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)flairMsg$FlairArray);
    }
    
    public static FlairMsg$FlairArray parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairArray parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairArray parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, byteString);
    }
    
    public static FlairMsg$FlairArray parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static FlairMsg$FlairArray parseFrom(final l l) throws IOException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, l);
    }
    
    public static FlairMsg$FlairArray parseFrom(final l l, final d0 d0) throws IOException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, l, d0);
    }
    
    public static FlairMsg$FlairArray parseFrom(final InputStream inputStream) throws IOException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, inputStream);
    }
    
    public static FlairMsg$FlairArray parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static FlairMsg$FlairArray parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static FlairMsg$FlairArray parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static FlairMsg$FlairArray parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, array);
    }
    
    public static FlairMsg$FlairArray parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (FlairMsg$FlairArray)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<FlairMsg$FlairArray> parser() {
        return (n1<FlairMsg$FlairArray>)FlairMsg$FlairArray.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeFlair(final int n) {
        this.ensureFlairIsMutable();
        this.flair_.remove(n);
    }
    
    private void setFlair(final int n, final FlairMsg$FlairObject flairMsg$FlairObject) {
        flairMsg$FlairObject.getClass();
        this.ensureFlairIsMutable();
        ((List<FlairMsg$FlairObject>)this.flair_).set(n, flairMsg$FlairObject);
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
                final n1<FlairMsg$FlairArray> parser;
                if ((parser = FlairMsg$FlairArray.PARSER) == null) {
                    synchronized (FlairMsg$FlairArray.class) {
                        if (FlairMsg$FlairArray.PARSER == null) {
                            FlairMsg$FlairArray.PARSER = (n1<FlairMsg$FlairArray>)new GeneratedMessageLite$c((GeneratedMessageLite)FlairMsg$FlairArray.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return FlairMsg$FlairArray.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)FlairMsg$FlairArray.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "flair_", FlairMsg$FlairObject.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new FlairMsg$FlairArray();
            }
        }
    }
    
    public FlairMsg$FlairObject getFlair(final int n) {
        return ((List<FlairMsg$FlairObject>)this.flair_).get(n);
    }
    
    public int getFlairCount() {
        return ((List)this.flair_).size();
    }
    
    public List<FlairMsg$FlairObject> getFlairList() {
        return (List<FlairMsg$FlairObject>)this.flair_;
    }
    
    public c getFlairOrBuilder(final int n) {
        return ((List<c>)this.flair_).get(n);
    }
    
    public List<? extends c> getFlairOrBuilderList() {
        return (List<? extends c>)this.flair_;
    }
    
    public static final class a extends GeneratedMessageLite$b<FlairMsg$FlairArray, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)FlairMsg$FlairArray.access$23000());
        }
    }
}
