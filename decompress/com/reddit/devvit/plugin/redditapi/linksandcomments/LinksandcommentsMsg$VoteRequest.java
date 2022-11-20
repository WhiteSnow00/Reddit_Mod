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

public final class LinksandcommentsMsg$VoteRequest extends GeneratedMessageLite<LinksandcommentsMsg$VoteRequest, a> implements d1
{
    private static final LinksandcommentsMsg$VoteRequest DEFAULT_INSTANCE;
    public static final int DIR_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile n1<LinksandcommentsMsg$VoteRequest> PARSER;
    public static final int RANK_FIELD_NUMBER = 3;
    private int dir_;
    private String id_;
    private int rank_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$VoteRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$VoteRequest()));
    }
    
    private LinksandcommentsMsg$VoteRequest() {
        this.id_ = "";
    }
    
    public static LinksandcommentsMsg$VoteRequest access$21500() {
        return LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$21600(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest, final int dir) {
        linksandcommentsMsg$VoteRequest.setDir(dir);
    }
    
    public static void access$21700(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest) {
        linksandcommentsMsg$VoteRequest.clearDir();
    }
    
    public static void access$21800(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest, final String id) {
        linksandcommentsMsg$VoteRequest.setId(id);
    }
    
    public static void access$21900(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest) {
        linksandcommentsMsg$VoteRequest.clearId();
    }
    
    public static void access$22000(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest, final ByteString idBytes) {
        linksandcommentsMsg$VoteRequest.setIdBytes(idBytes);
    }
    
    public static void access$22100(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest, final int rank) {
        linksandcommentsMsg$VoteRequest.setRank(rank);
    }
    
    public static void access$22200(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest) {
        linksandcommentsMsg$VoteRequest.clearRank();
    }
    
    private void clearDir() {
        this.dir_ = 0;
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearRank() {
        this.rank_ = 0;
    }
    
    public static LinksandcommentsMsg$VoteRequest getDefaultInstance() {
        return LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$VoteRequest linksandcommentsMsg$VoteRequest) {
        return (a)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$VoteRequest);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$VoteRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$VoteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$VoteRequest> parser() {
        return (n1<LinksandcommentsMsg$VoteRequest>)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setDir(final int dir_) {
        this.dir_ = dir_;
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setRank(final int rank_) {
        this.rank_ = rank_;
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
                final n1<LinksandcommentsMsg$VoteRequest> parser;
                if ((parser = LinksandcommentsMsg$VoteRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$VoteRequest.class) {
                        if (LinksandcommentsMsg$VoteRequest.PARSER == null) {
                            LinksandcommentsMsg$VoteRequest.PARSER = (n1<LinksandcommentsMsg$VoteRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$VoteRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0004", new Object[] { "dir_", "id_", "rank_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$VoteRequest();
            }
        }
    }
    
    public int getDir() {
        return this.dir_;
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public int getRank() {
        return this.rank_;
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$VoteRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$VoteRequest.access$21500());
        }
    }
}
