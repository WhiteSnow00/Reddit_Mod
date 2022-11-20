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

public final class LinksandcommentsMsg$SetSuggestedSortRequest extends GeneratedMessageLite<LinksandcommentsMsg$SetSuggestedSortRequest, a> implements d1
{
    private static final LinksandcommentsMsg$SetSuggestedSortRequest DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile n1<LinksandcommentsMsg$SetSuggestedSortRequest> PARSER;
    public static final int SORT_FIELD_NUMBER = 2;
    private String id_;
    private String sort_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$SetSuggestedSortRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$SetSuggestedSortRequest()));
    }
    
    private LinksandcommentsMsg$SetSuggestedSortRequest() {
        this.id_ = "";
        this.sort_ = "";
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest access$14800() {
        return LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$14900(final LinksandcommentsMsg$SetSuggestedSortRequest linksandcommentsMsg$SetSuggestedSortRequest, final String id) {
        linksandcommentsMsg$SetSuggestedSortRequest.setId(id);
    }
    
    public static void access$15000(final LinksandcommentsMsg$SetSuggestedSortRequest linksandcommentsMsg$SetSuggestedSortRequest) {
        linksandcommentsMsg$SetSuggestedSortRequest.clearId();
    }
    
    public static void access$15100(final LinksandcommentsMsg$SetSuggestedSortRequest linksandcommentsMsg$SetSuggestedSortRequest, final ByteString idBytes) {
        linksandcommentsMsg$SetSuggestedSortRequest.setIdBytes(idBytes);
    }
    
    public static void access$15200(final LinksandcommentsMsg$SetSuggestedSortRequest linksandcommentsMsg$SetSuggestedSortRequest, final String sort) {
        linksandcommentsMsg$SetSuggestedSortRequest.setSort(sort);
    }
    
    public static void access$15300(final LinksandcommentsMsg$SetSuggestedSortRequest linksandcommentsMsg$SetSuggestedSortRequest) {
        linksandcommentsMsg$SetSuggestedSortRequest.clearSort();
    }
    
    public static void access$15400(final LinksandcommentsMsg$SetSuggestedSortRequest linksandcommentsMsg$SetSuggestedSortRequest, final ByteString sortBytes) {
        linksandcommentsMsg$SetSuggestedSortRequest.setSortBytes(sortBytes);
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    private void clearSort() {
        this.sort_ = getDefaultInstance().getSort();
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest getDefaultInstance() {
        return LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$SetSuggestedSortRequest linksandcommentsMsg$SetSuggestedSortRequest) {
        return (a)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$SetSuggestedSortRequest);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$SetSuggestedSortRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SetSuggestedSortRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$SetSuggestedSortRequest> parser() {
        return (n1<LinksandcommentsMsg$SetSuggestedSortRequest>)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }
    
    private void setSort(final String sort_) {
        sort_.getClass();
        this.sort_ = sort_;
    }
    
    private void setSortBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.sort_ = byteString.toStringUtf8();
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
                final n1<LinksandcommentsMsg$SetSuggestedSortRequest> parser;
                if ((parser = LinksandcommentsMsg$SetSuggestedSortRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$SetSuggestedSortRequest.class) {
                        if (LinksandcommentsMsg$SetSuggestedSortRequest.PARSER == null) {
                            LinksandcommentsMsg$SetSuggestedSortRequest.PARSER = (n1<LinksandcommentsMsg$SetSuggestedSortRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$SetSuggestedSortRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "id_", "sort_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$SetSuggestedSortRequest();
            }
        }
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public String getSort() {
        return this.sort_;
    }
    
    public ByteString getSortBytes() {
        return ByteString.copyFromUtf8(this.sort_);
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$SetSuggestedSortRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$SetSuggestedSortRequest.access$14800());
        }
    }
}
