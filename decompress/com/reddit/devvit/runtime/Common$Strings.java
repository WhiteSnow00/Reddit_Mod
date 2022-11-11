// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import m90.e;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class Common$Strings extends GeneratedMessageLite<Common$Strings, a> implements d1
{
    private static final Common$Strings DEFAULT_INSTANCE;
    private static volatile n1<Common$Strings> PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal$j<String> values_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Common$Strings.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Common$Strings()));
    }
    
    private Common$Strings() {
        this.values_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ Common$Strings access$1400() {
        return Common$Strings.DEFAULT_INSTANCE;
    }
    
    private void addAllValues(final Iterable<String> iterable) {
        this.ensureValuesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.values_);
    }
    
    private void addValues(final String s) {
        s.getClass();
        this.ensureValuesIsMutable();
        ((List<String>)this.values_).add(s);
    }
    
    private void addValuesBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureValuesIsMutable();
        ((List<String>)this.values_).add(byteString.toStringUtf8());
    }
    
    private void clearValues() {
        this.values_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureValuesIsMutable() {
        final Internal$j<String> values_ = this.values_;
        if (!values_.E0()) {
            this.values_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)values_);
        }
    }
    
    public static Common$Strings getDefaultInstance() {
        return Common$Strings.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Common$Strings.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Common$Strings common$Strings) {
        return (a)Common$Strings.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)common$Strings);
    }
    
    public static Common$Strings parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Common$Strings)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Strings parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Strings)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Strings parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, byteString);
    }
    
    public static Common$Strings parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Common$Strings parseFrom(final l l) throws IOException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, l);
    }
    
    public static Common$Strings parseFrom(final l l, final d0 d0) throws IOException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Common$Strings parseFrom(final InputStream inputStream) throws IOException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Common$Strings parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Common$Strings parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Common$Strings parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Common$Strings parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, array);
    }
    
    public static Common$Strings parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Common$Strings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Common$Strings> parser() {
        return (n1<Common$Strings>)Common$Strings.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setValues(final int n, final String s) {
        s.getClass();
        this.ensureValuesIsMutable();
        ((List<String>)this.values_).set(n, s);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (e.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<Common$Strings> parser;
                if ((parser = Common$Strings.PARSER) == null) {
                    synchronized (Common$Strings.class) {
                        if (Common$Strings.PARSER == null) {
                            Common$Strings.PARSER = (n1<Common$Strings>)new GeneratedMessageLite$c((GeneratedMessageLite)Common$Strings.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Common$Strings.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Common$Strings.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a", new Object[] { "values_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Common$Strings();
            }
        }
    }
    
    public String getValues(final int n) {
        return ((List<String>)this.values_).get(n);
    }
    
    public ByteString getValuesBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.values_).get(n));
    }
    
    public int getValuesCount() {
        return ((List)this.values_).size();
    }
    
    public List<String> getValuesList() {
        return (List<String>)this.values_;
    }
    
    public static final class a extends GeneratedMessageLite$b<Common$Strings, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Common$Strings.access$1400());
        }
    }
}
