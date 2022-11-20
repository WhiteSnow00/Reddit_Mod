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
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class ModnotesMsg$PostModNotesResponse extends GeneratedMessageLite<ModnotesMsg$PostModNotesResponse, a> implements d1
{
    public static final int CREATED_FIELD_NUMBER = 1;
    private static final ModnotesMsg$PostModNotesResponse DEFAULT_INSTANCE;
    private static volatile n1<ModnotesMsg$PostModNotesResponse> PARSER;
    private ModnotesMsg$ModNoteObject created_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$PostModNotesResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$PostModNotesResponse()));
    }
    
    private ModnotesMsg$PostModNotesResponse() {
    }
    
    public static ModnotesMsg$PostModNotesResponse access$13700() {
        return ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$13800(final ModnotesMsg$PostModNotesResponse modnotesMsg$PostModNotesResponse, final ModnotesMsg$ModNoteObject created) {
        modnotesMsg$PostModNotesResponse.setCreated(created);
    }
    
    public static void access$13900(final ModnotesMsg$PostModNotesResponse modnotesMsg$PostModNotesResponse, final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$PostModNotesResponse.mergeCreated(modnotesMsg$ModNoteObject);
    }
    
    public static void access$14000(final ModnotesMsg$PostModNotesResponse modnotesMsg$PostModNotesResponse) {
        modnotesMsg$PostModNotesResponse.clearCreated();
    }
    
    private void clearCreated() {
        this.created_ = null;
    }
    
    public static ModnotesMsg$PostModNotesResponse getDefaultInstance() {
        return ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeCreated(final ModnotesMsg$ModNoteObject created_) {
        created_.getClass();
        final ModnotesMsg$ModNoteObject created_2 = this.created_;
        if (created_2 != null && created_2 != ModnotesMsg$ModNoteObject.getDefaultInstance()) {
            final ModnotesMsg$ModNoteObject.a builder = ModnotesMsg$ModNoteObject.newBuilder(this.created_);
            builder.h((GeneratedMessageLite)created_);
            this.created_ = (ModnotesMsg$ModNoteObject)builder.c();
        }
        else {
            this.created_ = created_;
        }
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$PostModNotesResponse modnotesMsg$PostModNotesResponse) {
        return (a)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$PostModNotesResponse);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final l l) throws IOException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$PostModNotesResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$PostModNotesResponse> parser() {
        return (n1<ModnotesMsg$PostModNotesResponse>)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setCreated(final ModnotesMsg$ModNoteObject created_) {
        created_.getClass();
        this.created_ = created_;
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
                final n1<ModnotesMsg$PostModNotesResponse> parser;
                if ((parser = ModnotesMsg$PostModNotesResponse.PARSER) == null) {
                    synchronized (ModnotesMsg$PostModNotesResponse.class) {
                        if (ModnotesMsg$PostModNotesResponse.PARSER == null) {
                            ModnotesMsg$PostModNotesResponse.PARSER = (n1<ModnotesMsg$PostModNotesResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$PostModNotesResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "created_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$PostModNotesResponse();
            }
        }
    }
    
    public ModnotesMsg$ModNoteObject getCreated() {
        ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject;
        if ((modnotesMsg$ModNoteObject = this.created_) == null) {
            modnotesMsg$ModNoteObject = ModnotesMsg$ModNoteObject.getDefaultInstance();
        }
        return modnotesMsg$ModNoteObject;
    }
    
    public boolean hasCreated() {
        return this.created_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$PostModNotesResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$PostModNotesResponse.access$13700());
        }
    }
}
