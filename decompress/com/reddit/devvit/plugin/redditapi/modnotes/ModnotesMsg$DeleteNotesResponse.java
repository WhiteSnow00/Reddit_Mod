// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.modnotes;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import e90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import u10.o;
import com.google.protobuf.BoolValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class ModnotesMsg$DeleteNotesResponse extends GeneratedMessageLite<ModnotesMsg$DeleteNotesResponse, a> implements d1
{
    private static final ModnotesMsg$DeleteNotesResponse DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 1;
    private static volatile n1<ModnotesMsg$DeleteNotesResponse> PARSER;
    private BoolValue deleted_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$DeleteNotesResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$DeleteNotesResponse()));
    }
    
    private ModnotesMsg$DeleteNotesResponse() {
    }
    
    public static ModnotesMsg$DeleteNotesResponse access$6900() {
        return ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$7000(final ModnotesMsg$DeleteNotesResponse modnotesMsg$DeleteNotesResponse, final BoolValue deleted) {
        modnotesMsg$DeleteNotesResponse.setDeleted(deleted);
    }
    
    public static void access$7100(final ModnotesMsg$DeleteNotesResponse modnotesMsg$DeleteNotesResponse, final BoolValue boolValue) {
        modnotesMsg$DeleteNotesResponse.mergeDeleted(boolValue);
    }
    
    public static void access$7200(final ModnotesMsg$DeleteNotesResponse modnotesMsg$DeleteNotesResponse) {
        modnotesMsg$DeleteNotesResponse.clearDeleted();
    }
    
    private void clearDeleted() {
        this.deleted_ = null;
    }
    
    public static ModnotesMsg$DeleteNotesResponse getDefaultInstance() {
        return ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeDeleted(final BoolValue deleted_) {
        deleted_.getClass();
        final BoolValue deleted_2 = this.deleted_;
        if (deleted_2 != null && deleted_2 != BoolValue.getDefaultInstance()) {
            this.deleted_ = (BoolValue)o.g(this.deleted_, deleted_);
        }
        else {
            this.deleted_ = deleted_;
        }
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$DeleteNotesResponse modnotesMsg$DeleteNotesResponse) {
        return (a)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$DeleteNotesResponse);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final l l) throws IOException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$DeleteNotesResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$DeleteNotesResponse> parser() {
        return (n1<ModnotesMsg$DeleteNotesResponse>)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setDeleted(final BoolValue deleted_) {
        deleted_.getClass();
        this.deleted_ = deleted_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (e90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ModnotesMsg$DeleteNotesResponse> parser;
                if ((parser = ModnotesMsg$DeleteNotesResponse.PARSER) == null) {
                    synchronized (ModnotesMsg$DeleteNotesResponse.class) {
                        if (ModnotesMsg$DeleteNotesResponse.PARSER == null) {
                            ModnotesMsg$DeleteNotesResponse.PARSER = (n1<ModnotesMsg$DeleteNotesResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$DeleteNotesResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "deleted_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$DeleteNotesResponse();
            }
        }
    }
    
    public BoolValue getDeleted() {
        BoolValue boolValue;
        if ((boolValue = this.deleted_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public boolean hasDeleted() {
        return this.deleted_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$DeleteNotesResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$DeleteNotesResponse.access$6900());
        }
    }
}
