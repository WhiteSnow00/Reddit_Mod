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

public final class LinksandcommentsMsg$SendRepliesRequest extends GeneratedMessageLite<LinksandcommentsMsg$SendRepliesRequest, a> implements d1
{
    private static final LinksandcommentsMsg$SendRepliesRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<LinksandcommentsMsg$SendRepliesRequest> PARSER;
    public static final int STATE_FIELD_NUMBER = 2;
    private String id_;
    private boolean state_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$SendRepliesRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$SendRepliesRequest()));
    }
    
    private LinksandcommentsMsg$SendRepliesRequest() {
        this.id_ = "";
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest access$12300() {
        return LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$12400(final LinksandcommentsMsg$SendRepliesRequest linksandcommentsMsg$SendRepliesRequest, final String id) {
        linksandcommentsMsg$SendRepliesRequest.setId(id);
    }
    
    public static void access$12500(final LinksandcommentsMsg$SendRepliesRequest linksandcommentsMsg$SendRepliesRequest) {
        linksandcommentsMsg$SendRepliesRequest.clearId();
    }
    
    public static void access$12600(final LinksandcommentsMsg$SendRepliesRequest linksandcommentsMsg$SendRepliesRequest, final ByteString idBytes) {
        linksandcommentsMsg$SendRepliesRequest.setIdBytes(idBytes);
    }
    
    public static void access$12700(final LinksandcommentsMsg$SendRepliesRequest linksandcommentsMsg$SendRepliesRequest, final boolean state) {
        linksandcommentsMsg$SendRepliesRequest.setState(state);
    }
    
    public static void access$12800(final LinksandcommentsMsg$SendRepliesRequest linksandcommentsMsg$SendRepliesRequest) {
        linksandcommentsMsg$SendRepliesRequest.clearState();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearState() {
        this.state_ = false;
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest getDefaultInstance() {
        return LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$SendRepliesRequest linksandcommentsMsg$SendRepliesRequest) {
        return (a)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$SendRepliesRequest);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$SendRepliesRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SendRepliesRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$SendRepliesRequest> parser() {
        return (n1<LinksandcommentsMsg$SendRepliesRequest>)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE.getParserForType();
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
                final n1<LinksandcommentsMsg$SendRepliesRequest> parser;
                if ((parser = LinksandcommentsMsg$SendRepliesRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$SendRepliesRequest.class) {
                        if (LinksandcommentsMsg$SendRepliesRequest.PARSER == null) {
                            LinksandcommentsMsg$SendRepliesRequest.PARSER = (n1<LinksandcommentsMsg$SendRepliesRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$SendRepliesRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[] { "id_", "state_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$SendRepliesRequest();
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
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$SendRepliesRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$SendRepliesRequest.access$12300());
        }
    }
}
