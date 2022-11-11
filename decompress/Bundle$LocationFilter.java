// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
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

public final class Bundle$LocationFilter extends GeneratedMessageLite<Bundle$LocationFilter, a> implements d1
{
    public static final int ALLOW_FIELD_NUMBER = 1;
    private static final Bundle$LocationFilter DEFAULT_INSTANCE;
    public static final int DENY_FIELD_NUMBER = 2;
    private static volatile n1<Bundle$LocationFilter> PARSER;
    private Internal$j<String> allow_;
    private Internal$j<String> deny_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Bundle$LocationFilter.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Bundle$LocationFilter()));
    }
    
    private Bundle$LocationFilter() {
        this.allow_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
        this.deny_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ Bundle$LocationFilter access$1100() {
        return Bundle$LocationFilter.DEFAULT_INSTANCE;
    }
    
    private void addAllAllow(final Iterable<String> iterable) {
        this.ensureAllowIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.allow_);
    }
    
    private void addAllDeny(final Iterable<String> iterable) {
        this.ensureDenyIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.deny_);
    }
    
    private void addAllow(final String s) {
        s.getClass();
        this.ensureAllowIsMutable();
        ((List<String>)this.allow_).add(s);
    }
    
    private void addAllowBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureAllowIsMutable();
        ((List<String>)this.allow_).add(byteString.toStringUtf8());
    }
    
    private void addDeny(final String s) {
        s.getClass();
        this.ensureDenyIsMutable();
        ((List<String>)this.deny_).add(s);
    }
    
    private void addDenyBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureDenyIsMutable();
        ((List<String>)this.deny_).add(byteString.toStringUtf8());
    }
    
    private void clearAllow() {
        this.allow_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearDeny() {
        this.deny_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureAllowIsMutable() {
        final Internal$j<String> allow_ = this.allow_;
        if (!allow_.E0()) {
            this.allow_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)allow_);
        }
    }
    
    private void ensureDenyIsMutable() {
        final Internal$j<String> deny_ = this.deny_;
        if (!deny_.E0()) {
            this.deny_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)deny_);
        }
    }
    
    public static Bundle$LocationFilter getDefaultInstance() {
        return Bundle$LocationFilter.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Bundle$LocationFilter.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Bundle$LocationFilter bundle$LocationFilter) {
        return (a)Bundle$LocationFilter.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundle$LocationFilter);
    }
    
    public static Bundle$LocationFilter parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$LocationFilter parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$LocationFilter parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, byteString);
    }
    
    public static Bundle$LocationFilter parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Bundle$LocationFilter parseFrom(final l l) throws IOException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, l);
    }
    
    public static Bundle$LocationFilter parseFrom(final l l, final d0 d0) throws IOException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Bundle$LocationFilter parseFrom(final InputStream inputStream) throws IOException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$LocationFilter parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$LocationFilter parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Bundle$LocationFilter parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Bundle$LocationFilter parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, array);
    }
    
    public static Bundle$LocationFilter parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$LocationFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Bundle$LocationFilter> parser() {
        return (n1<Bundle$LocationFilter>)Bundle$LocationFilter.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAllow(final int n, final String s) {
        s.getClass();
        this.ensureAllowIsMutable();
        ((List<String>)this.allow_).set(n, s);
    }
    
    private void setDeny(final int n, final String s) {
        s.getClass();
        this.ensureDenyIsMutable();
        ((List<String>)this.deny_).set(n, s);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (m90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<Bundle$LocationFilter> parser;
                if ((parser = Bundle$LocationFilter.PARSER) == null) {
                    synchronized (Bundle$LocationFilter.class) {
                        if (Bundle$LocationFilter.PARSER == null) {
                            Bundle$LocationFilter.PARSER = (n1<Bundle$LocationFilter>)new GeneratedMessageLite$c((GeneratedMessageLite)Bundle$LocationFilter.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Bundle$LocationFilter.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Bundle$LocationFilter.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u021a\u0002\u021a", new Object[] { "allow_", "deny_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Bundle$LocationFilter();
            }
        }
    }
    
    public String getAllow(final int n) {
        return ((List<String>)this.allow_).get(n);
    }
    
    public ByteString getAllowBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.allow_).get(n));
    }
    
    public int getAllowCount() {
        return ((List)this.allow_).size();
    }
    
    public List<String> getAllowList() {
        return (List<String>)this.allow_;
    }
    
    public String getDeny(final int n) {
        return ((List<String>)this.deny_).get(n);
    }
    
    public ByteString getDenyBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.deny_).get(n));
    }
    
    public int getDenyCount() {
        return ((List)this.deny_).size();
    }
    
    public List<String> getDenyList() {
        return (List<String>)this.deny_;
    }
    
    public static final class a extends GeneratedMessageLite$b<Bundle$LocationFilter, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Bundle$LocationFilter.access$1100());
        }
    }
}
