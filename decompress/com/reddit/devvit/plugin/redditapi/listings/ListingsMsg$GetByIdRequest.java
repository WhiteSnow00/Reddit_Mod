// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.listings;

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

public final class ListingsMsg$GetByIdRequest extends GeneratedMessageLite<ListingsMsg$GetByIdRequest, a> implements d1
{
    private static final ListingsMsg$GetByIdRequest DEFAULT_INSTANCE;
    private static volatile n1<ListingsMsg$GetByIdRequest> PARSER;
    public static final int POST_IDS_FIELD_NUMBER = 1;
    private String postIds_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$GetByIdRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$GetByIdRequest()));
    }
    
    private ListingsMsg$GetByIdRequest() {
        this.postIds_ = "";
    }
    
    public static ListingsMsg$GetByIdRequest access$11100() {
        return ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$11200(final ListingsMsg$GetByIdRequest listingsMsg$GetByIdRequest, final String postIds) {
        listingsMsg$GetByIdRequest.setPostIds(postIds);
    }
    
    public static void access$11300(final ListingsMsg$GetByIdRequest listingsMsg$GetByIdRequest) {
        listingsMsg$GetByIdRequest.clearPostIds();
    }
    
    public static void access$11400(final ListingsMsg$GetByIdRequest listingsMsg$GetByIdRequest, final ByteString postIdsBytes) {
        listingsMsg$GetByIdRequest.setPostIdsBytes(postIdsBytes);
    }
    
    private void clearPostIds() {
        this.postIds_ = getDefaultInstance().getPostIds();
    }
    
    public static ListingsMsg$GetByIdRequest getDefaultInstance() {
        return ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$GetByIdRequest listingsMsg$GetByIdRequest) {
        return (a)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$GetByIdRequest);
    }
    
    public static ListingsMsg$GetByIdRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetByIdRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final l l) throws IOException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$GetByIdRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$GetByIdRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$GetByIdRequest> parser() {
        return (n1<ListingsMsg$GetByIdRequest>)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setPostIds(final String postIds_) {
        postIds_.getClass();
        this.postIds_ = postIds_;
    }
    
    private void setPostIdsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.postIds_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (c90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ListingsMsg$GetByIdRequest> parser;
                if ((parser = ListingsMsg$GetByIdRequest.PARSER) == null) {
                    synchronized (ListingsMsg$GetByIdRequest.class) {
                        if (ListingsMsg$GetByIdRequest.PARSER == null) {
                            ListingsMsg$GetByIdRequest.PARSER = (n1<ListingsMsg$GetByIdRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$GetByIdRequest.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "postIds_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$GetByIdRequest();
            }
        }
    }
    
    public String getPostIds() {
        return this.postIds_;
    }
    
    public ByteString getPostIdsBytes() {
        return ByteString.copyFromUtf8(this.postIds_);
    }
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$GetByIdRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$GetByIdRequest.access$11100());
        }
    }
}
