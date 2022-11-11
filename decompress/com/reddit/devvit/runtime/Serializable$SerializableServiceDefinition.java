// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import m90.h;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import m90.g;
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
import m90.i;
import com.google.protobuf.GeneratedMessageLite;

public final class Serializable$SerializableServiceDefinition extends GeneratedMessageLite<Serializable$SerializableServiceDefinition, a> implements i
{
    private static final Serializable$SerializableServiceDefinition DEFAULT_INSTANCE;
    public static final int FULL_NAME_FIELD_NUMBER = 1;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile n1<Serializable$SerializableServiceDefinition> PARSER;
    public static final int VERSION_FIELD_NUMBER = 4;
    private String fullName_;
    private Internal$j<Serializable$SerializableMethodDefinition> methods_;
    private String name_;
    private String version_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Serializable$SerializableServiceDefinition.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Serializable$SerializableServiceDefinition()));
    }
    
    private Serializable$SerializableServiceDefinition() {
        this.fullName_ = "";
        this.methods_ = (Internal$j<Serializable$SerializableMethodDefinition>)GeneratedMessageLite.emptyProtobufList();
        this.name_ = "";
        this.version_ = "";
    }
    
    public static /* synthetic */ Serializable$SerializableServiceDefinition access$000() {
        return Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE;
    }
    
    private void addAllMethods(final Iterable<? extends Serializable$SerializableMethodDefinition> iterable) {
        this.ensureMethodsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.methods_);
    }
    
    private void addMethods(final int n, final Serializable$SerializableMethodDefinition serializable$SerializableMethodDefinition) {
        serializable$SerializableMethodDefinition.getClass();
        this.ensureMethodsIsMutable();
        ((List<Serializable$SerializableMethodDefinition>)this.methods_).add(n, serializable$SerializableMethodDefinition);
    }
    
    private void addMethods(final Serializable$SerializableMethodDefinition serializable$SerializableMethodDefinition) {
        serializable$SerializableMethodDefinition.getClass();
        this.ensureMethodsIsMutable();
        ((List<Serializable$SerializableMethodDefinition>)this.methods_).add(serializable$SerializableMethodDefinition);
    }
    
    private void clearFullName() {
        this.fullName_ = getDefaultInstance().getFullName();
    }
    
    private void clearMethods() {
        this.methods_ = (Internal$j<Serializable$SerializableMethodDefinition>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }
    
    private void ensureMethodsIsMutable() {
        final Internal$j<Serializable$SerializableMethodDefinition> methods_ = this.methods_;
        if (!methods_.E0()) {
            this.methods_ = (Internal$j<Serializable$SerializableMethodDefinition>)GeneratedMessageLite.mutableCopy((Internal$j)methods_);
        }
    }
    
    public static Serializable$SerializableServiceDefinition getDefaultInstance() {
        return Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition) {
        return (a)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)serializable$SerializableServiceDefinition);
    }
    
    public static Serializable$SerializableServiceDefinition parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Serializable$SerializableServiceDefinition parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, byteString);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final l l) throws IOException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, l);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final l l, final d0 d0) throws IOException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final InputStream inputStream) throws IOException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, array);
    }
    
    public static Serializable$SerializableServiceDefinition parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Serializable$SerializableServiceDefinition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Serializable$SerializableServiceDefinition> parser() {
        return (n1<Serializable$SerializableServiceDefinition>)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeMethods(final int n) {
        this.ensureMethodsIsMutable();
        this.methods_.remove(n);
    }
    
    private void setFullName(final String fullName_) {
        fullName_.getClass();
        this.fullName_ = fullName_;
    }
    
    private void setFullNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.fullName_ = byteString.toStringUtf8();
    }
    
    private void setMethods(final int n, final Serializable$SerializableMethodDefinition serializable$SerializableMethodDefinition) {
        serializable$SerializableMethodDefinition.getClass();
        this.ensureMethodsIsMutable();
        ((List<Serializable$SerializableMethodDefinition>)this.methods_).set(n, serializable$SerializableMethodDefinition);
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }
    
    private void setVersion(final String version_) {
        version_.getClass();
        this.version_ = version_;
    }
    
    private void setVersionBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (g.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<Serializable$SerializableServiceDefinition> parser;
                if ((parser = Serializable$SerializableServiceDefinition.PARSER) == null) {
                    synchronized (Serializable$SerializableServiceDefinition.class) {
                        if (Serializable$SerializableServiceDefinition.PARSER == null) {
                            Serializable$SerializableServiceDefinition.PARSER = (n1<Serializable$SerializableServiceDefinition>)new GeneratedMessageLite$c((GeneratedMessageLite)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Serializable$SerializableServiceDefinition.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\u0208\u0004\u0208", new Object[] { "fullName_", "methods_", Serializable$SerializableMethodDefinition.class, "name_", "version_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Serializable$SerializableServiceDefinition();
            }
        }
    }
    
    public String getFullName() {
        return this.fullName_;
    }
    
    public ByteString getFullNameBytes() {
        return ByteString.copyFromUtf8(this.fullName_);
    }
    
    public Serializable$SerializableMethodDefinition getMethods(final int n) {
        return ((List<Serializable$SerializableMethodDefinition>)this.methods_).get(n);
    }
    
    public int getMethodsCount() {
        return ((List)this.methods_).size();
    }
    
    public List<Serializable$SerializableMethodDefinition> getMethodsList() {
        return (List<Serializable$SerializableMethodDefinition>)this.methods_;
    }
    
    public h getMethodsOrBuilder(final int n) {
        return ((List<h>)this.methods_).get(n);
    }
    
    public List<? extends h> getMethodsOrBuilderList() {
        return (List<? extends h>)this.methods_;
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public String getVersion() {
        return this.version_;
    }
    
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }
    
    public static final class a extends GeneratedMessageLite$b<Serializable$SerializableServiceDefinition, a> implements i
    {
        public a() {
            super((GeneratedMessageLite)Serializable$SerializableServiceDefinition.access$000());
        }
    }
}
