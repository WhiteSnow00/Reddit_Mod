// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

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

public final class LinksandcommentsMsg$SetSubredditStickyRequest extends GeneratedMessageLite<LinksandcommentsMsg$SetSubredditStickyRequest, a> implements d1
{
    private static final LinksandcommentsMsg$SetSubredditStickyRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NUM_FIELD_NUMBER = 2;
    private static volatile n1<LinksandcommentsMsg$SetSubredditStickyRequest> PARSER;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int TO_PROFILE_FIELD_NUMBER = 4;
    private String id_;
    private int num_;
    private boolean state_;
    private boolean toProfile_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$SetSubredditStickyRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$SetSubredditStickyRequest()));
    }
    
    private LinksandcommentsMsg$SetSubredditStickyRequest() {
        this.id_ = "";
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest access$13700() {
        return LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$13800(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest, final String id) {
        linksandcommentsMsg$SetSubredditStickyRequest.setId(id);
    }
    
    public static void access$13900(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest) {
        linksandcommentsMsg$SetSubredditStickyRequest.clearId();
    }
    
    public static void access$14000(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest, final ByteString idBytes) {
        linksandcommentsMsg$SetSubredditStickyRequest.setIdBytes(idBytes);
    }
    
    public static void access$14100(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest, final int num) {
        linksandcommentsMsg$SetSubredditStickyRequest.setNum(num);
    }
    
    public static void access$14200(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest) {
        linksandcommentsMsg$SetSubredditStickyRequest.clearNum();
    }
    
    public static void access$14300(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest, final boolean state) {
        linksandcommentsMsg$SetSubredditStickyRequest.setState(state);
    }
    
    public static void access$14400(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest) {
        linksandcommentsMsg$SetSubredditStickyRequest.clearState();
    }
    
    public static void access$14500(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest, final boolean toProfile) {
        linksandcommentsMsg$SetSubredditStickyRequest.setToProfile(toProfile);
    }
    
    public static void access$14600(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest) {
        linksandcommentsMsg$SetSubredditStickyRequest.clearToProfile();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearNum() {
        this.num_ = 0;
    }
    
    private void clearState() {
        this.state_ = false;
    }
    
    private void clearToProfile() {
        this.toProfile_ = false;
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest getDefaultInstance() {
        return LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$SetSubredditStickyRequest linksandcommentsMsg$SetSubredditStickyRequest) {
        return (a)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$SetSubredditStickyRequest);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$SetSubredditStickyRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSubredditStickyRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$SetSubredditStickyRequest> parser() {
        return (n1<LinksandcommentsMsg$SetSubredditStickyRequest>)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setNum(final int num_) {
        this.num_ = num_;
    }
    
    private void setState(final boolean state_) {
        this.state_ = state_;
    }
    
    private void setToProfile(final boolean toProfile_) {
        this.toProfile_ = toProfile_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<LinksandcommentsMsg$SetSubredditStickyRequest> parser;
                if ((parser = LinksandcommentsMsg$SetSubredditStickyRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$SetSubredditStickyRequest.class) {
                        if (LinksandcommentsMsg$SetSubredditStickyRequest.PARSER == null) {
                            LinksandcommentsMsg$SetSubredditStickyRequest.PARSER = (n1<LinksandcommentsMsg$SetSubredditStickyRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$SetSubredditStickyRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0007\u0004\u0007", new Object[] { "id_", "num_", "state_", "toProfile_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$SetSubredditStickyRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public int getNum() {
        return this.num_;
    }
    
    public boolean getState() {
        return this.state_;
    }
    
    public boolean getToProfile() {
        return this.toProfile_;
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$SetSubredditStickyRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$SetSubredditStickyRequest.access$13700());
        }
    }
}
