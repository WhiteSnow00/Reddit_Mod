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

public final class LinksandcommentsMsg$StoreVisitsRequest extends GeneratedMessageLite<LinksandcommentsMsg$StoreVisitsRequest, a> implements d1
{
    private static final LinksandcommentsMsg$StoreVisitsRequest DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile n1<LinksandcommentsMsg$StoreVisitsRequest> PARSER;
    private String links_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$StoreVisitsRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$StoreVisitsRequest()));
    }
    
    private LinksandcommentsMsg$StoreVisitsRequest() {
        this.links_ = "";
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest access$15600() {
        return LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$15700(final LinksandcommentsMsg$StoreVisitsRequest linksandcommentsMsg$StoreVisitsRequest, final String links) {
        linksandcommentsMsg$StoreVisitsRequest.setLinks(links);
    }
    
    public static void access$15800(final LinksandcommentsMsg$StoreVisitsRequest linksandcommentsMsg$StoreVisitsRequest) {
        linksandcommentsMsg$StoreVisitsRequest.clearLinks();
    }
    
    public static void access$15900(final LinksandcommentsMsg$StoreVisitsRequest linksandcommentsMsg$StoreVisitsRequest, final ByteString linksBytes) {
        linksandcommentsMsg$StoreVisitsRequest.setLinksBytes(linksBytes);
    }
    
    private void clearLinks() {
        this.links_ = getDefaultInstance().getLinks();
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest getDefaultInstance() {
        return LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$StoreVisitsRequest linksandcommentsMsg$StoreVisitsRequest) {
        return (a)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$StoreVisitsRequest);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$StoreVisitsRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$StoreVisitsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$StoreVisitsRequest> parser() {
        return (n1<LinksandcommentsMsg$StoreVisitsRequest>)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setLinks(final String links_) {
        links_.getClass();
        this.links_ = links_;
    }
    
    private void setLinksBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.links_ = byteString.toStringUtf8();
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
                final n1<LinksandcommentsMsg$StoreVisitsRequest> parser;
                if ((parser = LinksandcommentsMsg$StoreVisitsRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$StoreVisitsRequest.class) {
                        if (LinksandcommentsMsg$StoreVisitsRequest.PARSER == null) {
                            LinksandcommentsMsg$StoreVisitsRequest.PARSER = (n1<LinksandcommentsMsg$StoreVisitsRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$StoreVisitsRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "links_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$StoreVisitsRequest();
            }
        }
    }
    
    public String getLinks() {
        return this.links_;
    }
    
    public ByteString getLinksBytes() {
        return ByteString.copyFromUtf8(this.links_);
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$StoreVisitsRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$StoreVisitsRequest.access$15600());
        }
    }
}
