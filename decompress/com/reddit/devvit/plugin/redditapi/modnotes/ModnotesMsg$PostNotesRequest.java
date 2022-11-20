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

public final class ModnotesMsg$PostNotesRequest extends GeneratedMessageLite<ModnotesMsg$PostNotesRequest, a> implements d1
{
    private static final ModnotesMsg$PostNotesRequest DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int NOTE_FIELD_NUMBER = 3;
    private static volatile n1<ModnotesMsg$PostNotesRequest> PARSER;
    public static final int REDDIT_ID_FIELD_NUMBER = 4;
    public static final int SUBREDDIT_FIELD_NUMBER = 1;
    public static final int USER_FIELD_NUMBER = 5;
    private String label_;
    private String note_;
    private String redditId_;
    private String subreddit_;
    private String user_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModnotesMsg$PostNotesRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModnotesMsg$PostNotesRequest()));
    }
    
    private ModnotesMsg$PostNotesRequest() {
        this.subreddit_ = "";
        this.label_ = "";
        this.note_ = "";
        this.redditId_ = "";
        this.user_ = "";
    }
    
    public static ModnotesMsg$PostNotesRequest access$2700() {
        return ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$2800(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final String subreddit) {
        modnotesMsg$PostNotesRequest.setSubreddit(subreddit);
    }
    
    public static void access$2900(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest) {
        modnotesMsg$PostNotesRequest.clearSubreddit();
    }
    
    public static void access$3000(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final ByteString subredditBytes) {
        modnotesMsg$PostNotesRequest.setSubredditBytes(subredditBytes);
    }
    
    public static void access$3100(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final String label) {
        modnotesMsg$PostNotesRequest.setLabel(label);
    }
    
    public static void access$3200(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest) {
        modnotesMsg$PostNotesRequest.clearLabel();
    }
    
    public static void access$3300(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final ByteString labelBytes) {
        modnotesMsg$PostNotesRequest.setLabelBytes(labelBytes);
    }
    
    public static void access$3400(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final String note) {
        modnotesMsg$PostNotesRequest.setNote(note);
    }
    
    public static void access$3500(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest) {
        modnotesMsg$PostNotesRequest.clearNote();
    }
    
    public static void access$3600(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final ByteString noteBytes) {
        modnotesMsg$PostNotesRequest.setNoteBytes(noteBytes);
    }
    
    public static void access$3700(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final String redditId) {
        modnotesMsg$PostNotesRequest.setRedditId(redditId);
    }
    
    public static void access$3800(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest) {
        modnotesMsg$PostNotesRequest.clearRedditId();
    }
    
    public static void access$3900(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final ByteString redditIdBytes) {
        modnotesMsg$PostNotesRequest.setRedditIdBytes(redditIdBytes);
    }
    
    public static void access$4000(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final String user) {
        modnotesMsg$PostNotesRequest.setUser(user);
    }
    
    public static void access$4100(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest) {
        modnotesMsg$PostNotesRequest.clearUser();
    }
    
    public static void access$4200(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest, final ByteString userBytes) {
        modnotesMsg$PostNotesRequest.setUserBytes(userBytes);
    }
    
    private void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }
    
    private void clearNote() {
        this.note_ = getDefaultInstance().getNote();
    }
    
    private void clearRedditId() {
        this.redditId_ = getDefaultInstance().getRedditId();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearUser() {
        this.user_ = getDefaultInstance().getUser();
    }
    
    public static ModnotesMsg$PostNotesRequest getDefaultInstance() {
        return ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModnotesMsg$PostNotesRequest modnotesMsg$PostNotesRequest) {
        return (a)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)modnotesMsg$PostNotesRequest);
    }
    
    public static ModnotesMsg$PostNotesRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$PostNotesRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final l l) throws IOException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ModnotesMsg$PostNotesRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModnotesMsg$PostNotesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModnotesMsg$PostNotesRequest> parser() {
        return (n1<ModnotesMsg$PostNotesRequest>)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setLabel(final String label_) {
        label_.getClass();
        this.label_ = label_;
    }
    
    private void setLabelBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.toStringUtf8();
    }
    
    private void setNote(final String note_) {
        note_.getClass();
        this.note_ = note_;
    }
    
    private void setNoteBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.note_ = byteString.toStringUtf8();
    }
    
    private void setRedditId(final String redditId_) {
        redditId_.getClass();
        this.redditId_ = redditId_;
    }
    
    private void setRedditIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.redditId_ = byteString.toStringUtf8();
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
                final n1<ModnotesMsg$PostNotesRequest> parser;
                if ((parser = ModnotesMsg$PostNotesRequest.PARSER) == null) {
                    synchronized (ModnotesMsg$PostNotesRequest.class) {
                        if (ModnotesMsg$PostNotesRequest.PARSER == null) {
                            ModnotesMsg$PostNotesRequest.PARSER = (n1<ModnotesMsg$PostNotesRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModnotesMsg$PostNotesRequest.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208", new Object[] { "subreddit_", "label_", "note_", "redditId_", "user_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModnotesMsg$PostNotesRequest();
            }
        }
    }
    
    public String getLabel() {
        return this.label_;
    }
    
    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.label_);
    }
    
    public String getNote() {
        return this.note_;
    }
    
    public ByteString getNoteBytes() {
        return ByteString.copyFromUtf8(this.note_);
    }
    
    public String getRedditId() {
        return this.redditId_;
    }
    
    public ByteString getRedditIdBytes() {
        return ByteString.copyFromUtf8(this.redditId_);
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
    
    public static final class a extends GeneratedMessageLite$b<ModnotesMsg$PostNotesRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModnotesMsg$PostNotesRequest.access$2700());
        }
    }
}
