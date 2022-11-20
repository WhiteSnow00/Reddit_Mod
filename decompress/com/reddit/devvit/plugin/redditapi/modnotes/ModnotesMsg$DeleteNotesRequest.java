// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.modnotes;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.a;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class ModnotesMsg$DeleteNotesRequest extends GeneratedMessageLite<ModnotesMsg$DeleteNotesRequest, a> implements d1
{
    private static final ModnotesMsg$DeleteNotesRequest DEFAULT_INSTANCE;
    public static final int NOTE_ID_FIELD_NUMBER = 2;
    private static volatile n1<ModnotesMsg$DeleteNotesRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int USER_FIELD_NUMBER = 3;
    private String noteId_;
    private String subreddit_;
    private String user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$DeleteNotesRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$DeleteNotesRequest()));
    }
    
    private ModnotesMsg$DeleteNotesRequest() {
        this.subreddit_ = "";
        this.noteId_ = "";
        this.user_ = "";
    }
    
    public static ModnotesMsg$DeleteNotesRequest access$000() {
        return ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$100(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest, final String subreddit) {
        modnotesMsg$DeleteNotesRequest.setSubreddit(subreddit);
    }
    
    public static void access$200(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest) {
        modnotesMsg$DeleteNotesRequest.clearSubreddit();
    }
    
    public static void access$300(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest, final ByteString subredditBytes) {
        modnotesMsg$DeleteNotesRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$400(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest, final String noteId) {
        modnotesMsg$DeleteNotesRequest.setNoteId(noteId);
    }
    
    public static void access$500(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest) {
        modnotesMsg$DeleteNotesRequest.clearNoteId();
    }
    
    public static void access$600(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest, final ByteString noteIdBytes) {
        modnotesMsg$DeleteNotesRequest.setNoteIdBytes(noteIdBytes);
    }
    
    public static void access$700(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest, final String user) {
        modnotesMsg$DeleteNotesRequest.setUser(user);
    }
    
    public static void access$800(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest) {
        modnotesMsg$DeleteNotesRequest.clearUser();
    }
    
    public static void access$900(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest, final ByteString userBytes) {
        modnotesMsg$DeleteNotesRequest.setUserBytes(userBytes);
    }
    
    private void clearNoteId() {
        this.noteId_ = getDefaultInstance().getNoteId();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearUser() {
        this.user_ = getDefaultInstance().getUser();
    }
    
    public static ModnotesMsg$DeleteNotesRequest getDefaultInstance() {
        return ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$DeleteNotesRequest modnotesMsg$DeleteNotesRequest) {
        return (a)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$DeleteNotesRequest);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final l l) throws IOException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$DeleteNotesRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$DeleteNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$DeleteNotesRequest> parser() {
        return (n1<ModnotesMsg$DeleteNotesRequest>)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setNoteId(final String noteId_) {
        noteId_.getClass();
        this.noteId_ = noteId_;
    }
    
    private void setNoteIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.noteId_ = byteString.toStringUtf8();
    }
    
    private void setSubreddit(final String subreddit_) {
        subreddit_.getClass();
        this.subreddit_ = subreddit_;
    }
    
    private void setSubredditBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.subreddit_ = byteString.toStringUtf8();
    }
    
    private void setUser(final String user_) {
        user_.getClass();
        this.user_ = user_;
    }
    
    private void setUserBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.user_ = byteString.toStringUtf8();
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
                final n1<ModnotesMsg$DeleteNotesRequest> parser;
                if ((parser = ModnotesMsg$DeleteNotesRequest.PARSER) == null) {
                    synchronized (ModnotesMsg$DeleteNotesRequest.class) {
                        if (ModnotesMsg$DeleteNotesRequest.PARSER == null) {
                            ModnotesMsg$DeleteNotesRequest.PARSER = (n1<ModnotesMsg$DeleteNotesRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$DeleteNotesRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[] { "subreddit_", "noteId_", "user_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$DeleteNotesRequest();
            }
        }
    }
    
    public String getNoteId() {
        return this.noteId_;
    }
    
    public ByteString getNoteIdBytes() {
        return ByteString.copyFromUtf8(this.noteId_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public String getUser() {
        return this.user_;
    }
    
    public ByteString getUserBytes() {
        return ByteString.copyFromUtf8(this.user_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$DeleteNotesRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$DeleteNotesRequest.access$000());
        }
    }
}
