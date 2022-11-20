// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.modnotes;

import com.google.protobuf.GeneratedMessageLite$b;
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
import u10.o;
import t5.w;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class ModnotesMsg$ModNotesResponse extends GeneratedMessageLite<ModnotesMsg$ModNotesResponse, a> implements d1
{
    private static final ModnotesMsg$ModNotesResponse DEFAULT_INSTANCE;
    public static final int END_CURSOR_FIELD_NUMBER = 3;
    public static final int HAS_NEXT_PAGE_FIELD_NUMBER = 4;
    public static final int MOD_NOTES_FIELD_NUMBER = 1;
    private static volatile n1<ModnotesMsg$ModNotesResponse> PARSER;
    public static final int START_CURSOR_FIELD_NUMBER = 2;
    private StringValue endCursor_;
    private BoolValue hasNextPage_;
    private Internal$j<ModnotesMsg$ModNoteObject> modNotes_;
    private StringValue startCursor_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$ModNotesResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$ModNotesResponse()));
    }
    
    private ModnotesMsg$ModNotesResponse() {
        this.modNotes_ = (Internal$j<ModnotesMsg$ModNoteObject>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static ModnotesMsg$ModNotesResponse access$5200() {
        return ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$5300(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final int n, final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNotesResponse.setModNotes(n, modnotesMsg$ModNoteObject);
    }
    
    public static void access$5400(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNotesResponse.addModNotes(modnotesMsg$ModNoteObject);
    }
    
    public static void access$5500(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final int n, final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNotesResponse.addModNotes(n, modnotesMsg$ModNoteObject);
    }
    
    public static void access$5600(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final Iterable iterable) {
        modnotesMsg$ModNotesResponse.addAllModNotes(iterable);
    }
    
    public static void access$5700(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse) {
        modnotesMsg$ModNotesResponse.clearModNotes();
    }
    
    public static void access$5800(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final int n) {
        modnotesMsg$ModNotesResponse.removeModNotes(n);
    }
    
    public static void access$5900(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final StringValue startCursor) {
        modnotesMsg$ModNotesResponse.setStartCursor(startCursor);
    }
    
    public static void access$6000(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final StringValue stringValue) {
        modnotesMsg$ModNotesResponse.mergeStartCursor(stringValue);
    }
    
    public static void access$6100(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse) {
        modnotesMsg$ModNotesResponse.clearStartCursor();
    }
    
    public static void access$6200(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final StringValue endCursor) {
        modnotesMsg$ModNotesResponse.setEndCursor(endCursor);
    }
    
    public static void access$6300(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final StringValue stringValue) {
        modnotesMsg$ModNotesResponse.mergeEndCursor(stringValue);
    }
    
    public static void access$6400(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse) {
        modnotesMsg$ModNotesResponse.clearEndCursor();
    }
    
    public static void access$6500(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final BoolValue hasNextPage) {
        modnotesMsg$ModNotesResponse.setHasNextPage(hasNextPage);
    }
    
    public static void access$6600(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse, final BoolValue boolValue) {
        modnotesMsg$ModNotesResponse.mergeHasNextPage(boolValue);
    }
    
    public static void access$6700(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse) {
        modnotesMsg$ModNotesResponse.clearHasNextPage();
    }
    
    private void addAllModNotes(final Iterable<? extends ModnotesMsg$ModNoteObject> iterable) {
        this.ensureModNotesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.modNotes_);
    }
    
    private void addModNotes(final int n, final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.getClass();
        this.ensureModNotesIsMutable();
        ((List<ModnotesMsg$ModNoteObject>)this.modNotes_).add(n, modnotesMsg$ModNoteObject);
    }
    
    private void addModNotes(final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.getClass();
        this.ensureModNotesIsMutable();
        ((List<ModnotesMsg$ModNoteObject>)this.modNotes_).add(modnotesMsg$ModNoteObject);
    }
    
    private void clearEndCursor() {
        this.endCursor_ = null;
    }
    
    private void clearHasNextPage() {
        this.hasNextPage_ = null;
    }
    
    private void clearModNotes() {
        this.modNotes_ = (Internal$j<ModnotesMsg$ModNoteObject>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearStartCursor() {
        this.startCursor_ = null;
    }
    
    private void ensureModNotesIsMutable() {
        final Internal$j<ModnotesMsg$ModNoteObject> modNotes_ = this.modNotes_;
        if (!modNotes_.E0()) {
            this.modNotes_ = (Internal$j<ModnotesMsg$ModNoteObject>)GeneratedMessageLite.mutableCopy((Internal$j)modNotes_);
        }
    }
    
    public static ModnotesMsg$ModNotesResponse getDefaultInstance() {
        return ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeEndCursor(final StringValue endCursor_) {
        endCursor_.getClass();
        final StringValue endCursor_2 = this.endCursor_;
        if (endCursor_2 != null && endCursor_2 != StringValue.getDefaultInstance()) {
            this.endCursor_ = (StringValue)w.e(this.endCursor_, endCursor_);
        }
        else {
            this.endCursor_ = endCursor_;
        }
    }
    
    private void mergeHasNextPage(final BoolValue hasNextPage_) {
        hasNextPage_.getClass();
        final BoolValue hasNextPage_2 = this.hasNextPage_;
        if (hasNextPage_2 != null && hasNextPage_2 != BoolValue.getDefaultInstance()) {
            this.hasNextPage_ = (BoolValue)o.g(this.hasNextPage_, hasNextPage_);
        }
        else {
            this.hasNextPage_ = hasNextPage_;
        }
    }
    
    private void mergeStartCursor(final StringValue startCursor_) {
        startCursor_.getClass();
        final StringValue startCursor_2 = this.startCursor_;
        if (startCursor_2 != null && startCursor_2 != StringValue.getDefaultInstance()) {
            this.startCursor_ = (StringValue)w.e(this.startCursor_, startCursor_);
        }
        else {
            this.startCursor_ = startCursor_;
        }
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$ModNotesResponse modnotesMsg$ModNotesResponse) {
        return (a)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$ModNotesResponse);
    }
    
    public static ModnotesMsg$ModNotesResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$ModNotesResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final l l) throws IOException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$ModNotesResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$ModNotesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$ModNotesResponse> parser() {
        return (n1<ModnotesMsg$ModNotesResponse>)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeModNotes(final int n) {
        this.ensureModNotesIsMutable();
        this.modNotes_.remove(n);
    }
    
    private void setEndCursor(final StringValue endCursor_) {
        endCursor_.getClass();
        this.endCursor_ = endCursor_;
    }
    
    private void setHasNextPage(final BoolValue hasNextPage_) {
        hasNextPage_.getClass();
        this.hasNextPage_ = hasNextPage_;
    }
    
    private void setModNotes(final int n, final ModnotesMsg$ModNoteObject modnotesMsg$ModNoteObject) {
        modnotesMsg$ModNoteObject.getClass();
        this.ensureModNotesIsMutable();
        ((List<ModnotesMsg$ModNoteObject>)this.modNotes_).set(n, modnotesMsg$ModNoteObject);
    }
    
    private void setStartCursor(final StringValue startCursor_) {
        startCursor_.getClass();
        this.startCursor_ = startCursor_;
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
                final n1<ModnotesMsg$ModNotesResponse> parser;
                if ((parser = ModnotesMsg$ModNotesResponse.PARSER) == null) {
                    synchronized (ModnotesMsg$ModNotesResponse.class) {
                        if (ModnotesMsg$ModNotesResponse.PARSER == null) {
                            ModnotesMsg$ModNotesResponse.PARSER = (n1<ModnotesMsg$ModNotesResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$ModNotesResponse.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t", new Object[] { "modNotes_", ModnotesMsg$ModNoteObject.class, "startCursor_", "endCursor_", "hasNextPage_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$ModNotesResponse();
            }
        }
    }
    
    public StringValue getEndCursor() {
        StringValue stringValue;
        if ((stringValue = this.endCursor_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getHasNextPage() {
        BoolValue boolValue;
        if ((boolValue = this.hasNextPage_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public ModnotesMsg$ModNoteObject getModNotes(final int n) {
        return ((List<ModnotesMsg$ModNoteObject>)this.modNotes_).get(n);
    }
    
    public int getModNotesCount() {
        return ((List)this.modNotes_).size();
    }
    
    public List<ModnotesMsg$ModNoteObject> getModNotesList() {
        return (List<ModnotesMsg$ModNoteObject>)this.modNotes_;
    }
    
    public com.reddit.devvit.plugin.redditapi.modnotes.a getModNotesOrBuilder(final int n) {
        return ((List<com.reddit.devvit.plugin.redditapi.modnotes.a>)this.modNotes_).get(n);
    }
    
    public List<? extends com.reddit.devvit.plugin.redditapi.modnotes.a> getModNotesOrBuilderList() {
        return (List<? extends com.reddit.devvit.plugin.redditapi.modnotes.a>)this.modNotes_;
    }
    
    public StringValue getStartCursor() {
        StringValue stringValue;
        if ((stringValue = this.startCursor_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasEndCursor() {
        return this.endCursor_ != null;
    }
    
    public boolean hasHasNextPage() {
        return this.hasNextPage_ != null;
    }
    
    public boolean hasStartCursor() {
        return this.startCursor_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$ModNotesResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$ModNotesResponse.access$5200());
        }
    }
}
