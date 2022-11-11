// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.inspector;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import w80.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class InspectorOuterClass$InspectorUpdate extends GeneratedMessageLite<InspectorOuterClass$InspectorUpdate, a> implements d1
{
    private static final InspectorOuterClass$InspectorUpdate DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    private static volatile n1<InspectorOuterClass$InspectorUpdate> PARSER;
    public static final int TYPE_FIELD_NUMBER = 2;
    private InspectorOuterClass$InspectorDescription description_;
    private int type_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)InspectorOuterClass$InspectorUpdate.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new InspectorOuterClass$InspectorUpdate()));
    }
    
    private InspectorOuterClass$InspectorUpdate() {
    }
    
    public static /* synthetic */ InspectorOuterClass$InspectorUpdate access$2700() {
        return InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE;
    }
    
    private void clearDescription() {
        this.description_ = null;
    }
    
    private void clearType() {
        this.type_ = 0;
    }
    
    public static InspectorOuterClass$InspectorUpdate getDefaultInstance() {
        return InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE;
    }
    
    private void mergeDescription(final InspectorOuterClass$InspectorDescription description_) {
        description_.getClass();
        final InspectorOuterClass$InspectorDescription description_2 = this.description_;
        if (description_2 != null && description_2 != InspectorOuterClass$InspectorDescription.getDefaultInstance()) {
            final InspectorOuterClass$InspectorDescription.a builder = InspectorOuterClass$InspectorDescription.newBuilder(this.description_);
            builder.h((GeneratedMessageLite)description_);
            this.description_ = (InspectorOuterClass$InspectorDescription)builder.d();
        }
        else {
            this.description_ = description_;
        }
    }
    
    public static a newBuilder() {
        return (a)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final InspectorOuterClass$InspectorUpdate inspectorOuterClass$InspectorUpdate) {
        return (a)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)inspectorOuterClass$InspectorUpdate);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, byteString);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final l l) throws IOException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, l);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final l l, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, l, d0);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, array);
    }
    
    public static InspectorOuterClass$InspectorUpdate parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorUpdate)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<InspectorOuterClass$InspectorUpdate> parser() {
        return (n1<InspectorOuterClass$InspectorUpdate>)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setDescription(final InspectorOuterClass$InspectorDescription description_) {
        description_.getClass();
        this.description_ = description_;
    }
    
    private void setType(final InspectorOuterClass$InspectorUpdateType inspectorOuterClass$InspectorUpdateType) {
        this.type_ = inspectorOuterClass$InspectorUpdateType.getNumber();
    }
    
    private void setTypeValue(final int type_) {
        this.type_ = type_;
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
                final n1<InspectorOuterClass$InspectorUpdate> parser;
                if ((parser = InspectorOuterClass$InspectorUpdate.PARSER) == null) {
                    synchronized (InspectorOuterClass$InspectorUpdate.class) {
                        if (InspectorOuterClass$InspectorUpdate.PARSER == null) {
                            InspectorOuterClass$InspectorUpdate.PARSER = (n1<InspectorOuterClass$InspectorUpdate>)new GeneratedMessageLite$c((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)InspectorOuterClass$InspectorUpdate.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[] { "description_", "type_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new InspectorOuterClass$InspectorUpdate();
            }
        }
    }
    
    public InspectorOuterClass$InspectorDescription getDescription() {
        InspectorOuterClass$InspectorDescription inspectorOuterClass$InspectorDescription;
        if ((inspectorOuterClass$InspectorDescription = this.description_) == null) {
            inspectorOuterClass$InspectorDescription = InspectorOuterClass$InspectorDescription.getDefaultInstance();
        }
        return inspectorOuterClass$InspectorDescription;
    }
    
    public InspectorOuterClass$InspectorUpdateType getType() {
        InspectorOuterClass$InspectorUpdateType inspectorOuterClass$InspectorUpdateType;
        if ((inspectorOuterClass$InspectorUpdateType = InspectorOuterClass$InspectorUpdateType.forNumber(this.type_)) == null) {
            inspectorOuterClass$InspectorUpdateType = InspectorOuterClass$InspectorUpdateType.UNRECOGNIZED;
        }
        return inspectorOuterClass$InspectorUpdateType;
    }
    
    public int getTypeValue() {
        return this.type_;
    }
    
    public boolean hasDescription() {
        return this.description_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<InspectorOuterClass$InspectorUpdate, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)InspectorOuterClass$InspectorUpdate.access$2700());
        }
    }
}
