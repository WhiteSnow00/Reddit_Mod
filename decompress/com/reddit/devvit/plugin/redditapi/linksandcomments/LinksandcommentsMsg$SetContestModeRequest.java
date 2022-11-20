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

public final class LinksandcommentsMsg$SetContestModeRequest extends GeneratedMessageLite<LinksandcommentsMsg$SetContestModeRequest, a> implements d1
{
    private static final LinksandcommentsMsg$SetContestModeRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<LinksandcommentsMsg$SetContestModeRequest> PARSER;
    public static final int STATE_FIELD_NUMBER = 2;
    private String id_;
    private boolean state_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$SetContestModeRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$SetContestModeRequest()));
    }
    
    private LinksandcommentsMsg$SetContestModeRequest() {
        this.id_ = "";
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest access$13000() {
        return LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$13100(final LinksandcommentsMsg$SetContestModeRequest linksandcommentsMsg$SetContestModeRequest, final String id) {
        linksandcommentsMsg$SetContestModeRequest.setId(id);
    }
    
    public static void access$13200(final LinksandcommentsMsg$SetContestModeRequest linksandcommentsMsg$SetContestModeRequest) {
        linksandcommentsMsg$SetContestModeRequest.clearId();
    }
    
    public static void access$13300(final LinksandcommentsMsg$SetContestModeRequest linksandcommentsMsg$SetContestModeRequest, final ByteString idBytes) {
        linksandcommentsMsg$SetContestModeRequest.setIdBytes(idBytes);
    }
    
    public static void access$13400(final LinksandcommentsMsg$SetContestModeRequest linksandcommentsMsg$SetContestModeRequest, final boolean state) {
        linksandcommentsMsg$SetContestModeRequest.setState(state);
    }
    
    public static void access$13500(final LinksandcommentsMsg$SetContestModeRequest linksandcommentsMsg$SetContestModeRequest) {
        linksandcommentsMsg$SetContestModeRequest.clearState();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearState() {
        this.state_ = false;
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest getDefaultInstance() {
        return LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$SetContestModeRequest linksandcommentsMsg$SetContestModeRequest) {
        return (a)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$SetContestModeRequest);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$SetContestModeRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetContestModeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$SetContestModeRequest> parser() {
        return (n1<LinksandcommentsMsg$SetContestModeRequest>)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setState(final boolean state_) {
        this.state_ = state_;
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
                final n1<LinksandcommentsMsg$SetContestModeRequest> parser;
                if ((parser = LinksandcommentsMsg$SetContestModeRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$SetContestModeRequest.class) {
                        if (LinksandcommentsMsg$SetContestModeRequest.PARSER == null) {
                            LinksandcommentsMsg$SetContestModeRequest.PARSER = (n1<LinksandcommentsMsg$SetContestModeRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$SetContestModeRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[] { "id_", "state_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$SetContestModeRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public boolean getState() {
        return this.state_;
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$SetContestModeRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$SetContestModeRequest.access$13000());
        }
    }
}
