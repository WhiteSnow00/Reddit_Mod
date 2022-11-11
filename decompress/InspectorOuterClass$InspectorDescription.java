// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.inspector;

import com.google.protobuf.GeneratedMessageLite$b;
import m90.i;
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
import com.reddit.devvit.runtime.Serializable$SerializableServiceDefinition;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import w80.b;
import com.google.protobuf.GeneratedMessageLite;

public final class InspectorOuterClass$InspectorDescription extends GeneratedMessageLite<InspectorOuterClass$InspectorDescription, a> implements b
{
    private static final InspectorOuterClass$InspectorDescription DEFAULT_INSTANCE;
    public static final int HOSTNAME_FIELD_NUMBER = 2;
    private static volatile n1<InspectorOuterClass$InspectorDescription> PARSER;
    public static final int PROVIDES_FIELD_NUMBER = 1;
    private String hostname_;
    private Internal$j<Serializable$SerializableServiceDefinition> provides_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)InspectorOuterClass$InspectorDescription.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new InspectorOuterClass$InspectorDescription()));
    }
    
    private InspectorOuterClass$InspectorDescription() {
        this.provides_ = (Internal$j<Serializable$SerializableServiceDefinition>)GeneratedMessageLite.emptyProtobufList();
        this.hostname_ = "";
    }
    
    public static /* synthetic */ InspectorOuterClass$InspectorDescription access$800() {
        return InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE;
    }
    
    private void addAllProvides(final Iterable<? extends Serializable$SerializableServiceDefinition> iterable) {
        this.ensureProvidesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.provides_);
    }
    
    private void addProvides(final int n, final Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition) {
        serializable$SerializableServiceDefinition.getClass();
        this.ensureProvidesIsMutable();
        ((List<Serializable$SerializableServiceDefinition>)this.provides_).add(n, serializable$SerializableServiceDefinition);
    }
    
    private void addProvides(final Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition) {
        serializable$SerializableServiceDefinition.getClass();
        this.ensureProvidesIsMutable();
        ((List<Serializable$SerializableServiceDefinition>)this.provides_).add(serializable$SerializableServiceDefinition);
    }
    
    private void clearHostname() {
        this.hostname_ = getDefaultInstance().getHostname();
    }
    
    private void clearProvides() {
        this.provides_ = (Internal$j<Serializable$SerializableServiceDefinition>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureProvidesIsMutable() {
        final Internal$j<Serializable$SerializableServiceDefinition> provides_ = this.provides_;
        if (!provides_.E0()) {
            this.provides_ = (Internal$j<Serializable$SerializableServiceDefinition>)GeneratedMessageLite.mutableCopy((Internal$j)provides_);
        }
    }
    
    public static InspectorOuterClass$InspectorDescription getDefaultInstance() {
        return InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final InspectorOuterClass$InspectorDescription inspectorOuterClass$InspectorDescription) {
        return (a)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)inspectorOuterClass$InspectorDescription);
    }
    
    public static InspectorOuterClass$InspectorDescription parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorDescription parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, byteString);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final l l) throws IOException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, l);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final l l, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, l, d0);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, array);
    }
    
    public static InspectorOuterClass$InspectorDescription parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescription)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<InspectorOuterClass$InspectorDescription> parser() {
        return (n1<InspectorOuterClass$InspectorDescription>)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeProvides(final int n) {
        this.ensureProvidesIsMutable();
        this.provides_.remove(n);
    }
    
    private void setHostname(final String hostname_) {
        hostname_.getClass();
        this.hostname_ = hostname_;
    }
    
    private void setHostnameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.hostname_ = byteString.toStringUtf8();
    }
    
    private void setProvides(final int n, final Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition) {
        serializable$SerializableServiceDefinition.getClass();
        this.ensureProvidesIsMutable();
        ((List<Serializable$SerializableServiceDefinition>)this.provides_).set(n, serializable$SerializableServiceDefinition);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (w80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<InspectorOuterClass$InspectorDescription> parser;
                if ((parser = InspectorOuterClass$InspectorDescription.PARSER) == null) {
                    synchronized (InspectorOuterClass$InspectorDescription.class) {
                        if (InspectorOuterClass$InspectorDescription.PARSER == null) {
                            InspectorOuterClass$InspectorDescription.PARSER = (n1<InspectorOuterClass$InspectorDescription>)new GeneratedMessageLite$c((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)InspectorOuterClass$InspectorDescription.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", new Object[] { "provides_", Serializable$SerializableServiceDefinition.class, "hostname_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new InspectorOuterClass$InspectorDescription();
            }
        }
    }
    
    public String getHostname() {
        return this.hostname_;
    }
    
    public ByteString getHostnameBytes() {
        return ByteString.copyFromUtf8(this.hostname_);
    }
    
    public Serializable$SerializableServiceDefinition getProvides(final int n) {
        return ((List<Serializable$SerializableServiceDefinition>)this.provides_).get(n);
    }
    
    public int getProvidesCount() {
        return ((List)this.provides_).size();
    }
    
    public List<Serializable$SerializableServiceDefinition> getProvidesList() {
        return (List<Serializable$SerializableServiceDefinition>)this.provides_;
    }
    
    public i getProvidesOrBuilder(final int n) {
        return ((List<i>)this.provides_).get(n);
    }
    
    public List<? extends i> getProvidesOrBuilderList() {
        return (List<? extends i>)this.provides_;
    }
    
    public static final class a extends GeneratedMessageLite$b<InspectorOuterClass$InspectorDescription, a> implements b
    {
        public a() {
            super((GeneratedMessageLite)InspectorOuterClass$InspectorDescription.access$800());
        }
    }
}
