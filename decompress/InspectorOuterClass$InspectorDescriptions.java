// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.inspector;

import com.google.protobuf.GeneratedMessageLite$b;
import w80.b;
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

public final class InspectorOuterClass$InspectorDescriptions extends GeneratedMessageLite<InspectorOuterClass$InspectorDescriptions, a> implements d1
{
    private static final InspectorOuterClass$InspectorDescriptions DEFAULT_INSTANCE;
    public static final int DESCRIPTIONS_FIELD_NUMBER = 1;
    private static volatile n1<InspectorOuterClass$InspectorDescriptions> PARSER;
    private Internal$j<InspectorOuterClass$InspectorDescription> descriptions_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)InspectorOuterClass$InspectorDescriptions.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new InspectorOuterClass$InspectorDescriptions()));
    }
    
    private InspectorOuterClass$InspectorDescriptions() {
        this.descriptions_ = (Internal$j<InspectorOuterClass$InspectorDescription>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ InspectorOuterClass$InspectorDescriptions access$1900() {
        return InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE;
    }
    
    private void addAllDescriptions(final Iterable<? extends InspectorOuterClass$InspectorDescription> iterable) {
        this.ensureDescriptionsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.descriptions_);
    }
    
    private void addDescriptions(final int n, final InspectorOuterClass$InspectorDescription inspectorOuterClass$InspectorDescription) {
        inspectorOuterClass$InspectorDescription.getClass();
        this.ensureDescriptionsIsMutable();
        ((List<InspectorOuterClass$InspectorDescription>)this.descriptions_).add(n, inspectorOuterClass$InspectorDescription);
    }
    
    private void addDescriptions(final InspectorOuterClass$InspectorDescription inspectorOuterClass$InspectorDescription) {
        inspectorOuterClass$InspectorDescription.getClass();
        this.ensureDescriptionsIsMutable();
        ((List<InspectorOuterClass$InspectorDescription>)this.descriptions_).add(inspectorOuterClass$InspectorDescription);
    }
    
    private void clearDescriptions() {
        this.descriptions_ = (Internal$j<InspectorOuterClass$InspectorDescription>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureDescriptionsIsMutable() {
        final Internal$j<InspectorOuterClass$InspectorDescription> descriptions_ = this.descriptions_;
        if (!descriptions_.E0()) {
            this.descriptions_ = (Internal$j<InspectorOuterClass$InspectorDescription>)GeneratedMessageLite.mutableCopy((Internal$j)descriptions_);
        }
    }
    
    public static InspectorOuterClass$InspectorDescriptions getDefaultInstance() {
        return InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final InspectorOuterClass$InspectorDescriptions inspectorOuterClass$InspectorDescriptions) {
        return (a)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)inspectorOuterClass$InspectorDescriptions);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, byteString);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final l l) throws IOException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, l);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final l l, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, l, d0);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, array);
    }
    
    public static InspectorOuterClass$InspectorDescriptions parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorDescriptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<InspectorOuterClass$InspectorDescriptions> parser() {
        return (n1<InspectorOuterClass$InspectorDescriptions>)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeDescriptions(final int n) {
        this.ensureDescriptionsIsMutable();
        this.descriptions_.remove(n);
    }
    
    private void setDescriptions(final int n, final InspectorOuterClass$InspectorDescription inspectorOuterClass$InspectorDescription) {
        inspectorOuterClass$InspectorDescription.getClass();
        this.ensureDescriptionsIsMutable();
        ((List<InspectorOuterClass$InspectorDescription>)this.descriptions_).set(n, inspectorOuterClass$InspectorDescription);
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
                final n1<InspectorOuterClass$InspectorDescriptions> parser;
                if ((parser = InspectorOuterClass$InspectorDescriptions.PARSER) == null) {
                    synchronized (InspectorOuterClass$InspectorDescriptions.class) {
                        if (InspectorOuterClass$InspectorDescriptions.PARSER == null) {
                            InspectorOuterClass$InspectorDescriptions.PARSER = (n1<InspectorOuterClass$InspectorDescriptions>)new GeneratedMessageLite$c((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)InspectorOuterClass$InspectorDescriptions.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "descriptions_", InspectorOuterClass$InspectorDescription.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new InspectorOuterClass$InspectorDescriptions();
            }
        }
    }
    
    public InspectorOuterClass$InspectorDescription getDescriptions(final int n) {
        return ((List<InspectorOuterClass$InspectorDescription>)this.descriptions_).get(n);
    }
    
    public int getDescriptionsCount() {
        return ((List)this.descriptions_).size();
    }
    
    public List<InspectorOuterClass$InspectorDescription> getDescriptionsList() {
        return (List<InspectorOuterClass$InspectorDescription>)this.descriptions_;
    }
    
    public b getDescriptionsOrBuilder(final int n) {
        return ((List<b>)this.descriptions_).get(n);
    }
    
    public List<? extends b> getDescriptionsOrBuilderList() {
        return (List<? extends b>)this.descriptions_;
    }
    
    public static final class a extends GeneratedMessageLite$b<InspectorOuterClass$InspectorDescriptions, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)InspectorOuterClass$InspectorDescriptions.access$1900());
        }
    }
}
