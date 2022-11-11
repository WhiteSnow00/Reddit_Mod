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

public final class LinksandcommentsMsg$FollowPostRequest extends GeneratedMessageLite<LinksandcommentsMsg$FollowPostRequest, a> implements d1
{
    private static final LinksandcommentsMsg$FollowPostRequest DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 1;
    public static final int FULLNAME_FIELD_NUMBER = 2;
    private static volatile n1<LinksandcommentsMsg$FollowPostRequest> PARSER;
    private boolean follow_;
    private String fullname_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$FollowPostRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$FollowPostRequest()));
    }
    
    private LinksandcommentsMsg$FollowPostRequest() {
        this.fullname_ = "";
    }
    
    public static /* synthetic */ LinksandcommentsMsg$FollowPostRequest access$2700() {
        return LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE;
    }
    
    private void clearFollow() {
        this.follow_ = false;
    }
    
    private void clearFullname() {
        this.fullname_ = getDefaultInstance().getFullname();
    }
    
    public static LinksandcommentsMsg$FollowPostRequest getDefaultInstance() {
        return LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$FollowPostRequest linksandcommentsMsg$FollowPostRequest) {
        return (a)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$FollowPostRequest);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$FollowPostRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$FollowPostRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$FollowPostRequest> parser() {
        return (n1<LinksandcommentsMsg$FollowPostRequest>)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFollow(final boolean follow_) {
        this.follow_ = follow_;
    }
    
    private void setFullname(final String fullname_) {
        fullname_.getClass();
        this.fullname_ = fullname_;
    }
    
    private void setFullnameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.fullname_ = byteString.toStringUtf8();
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
                final n1<LinksandcommentsMsg$FollowPostRequest> parser;
                if ((parser = LinksandcommentsMsg$FollowPostRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$FollowPostRequest.class) {
                        if (LinksandcommentsMsg$FollowPostRequest.PARSER == null) {
                            LinksandcommentsMsg$FollowPostRequest.PARSER = (n1<LinksandcommentsMsg$FollowPostRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$FollowPostRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0208", new Object[] { "follow_", "fullname_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$FollowPostRequest();
            }
        }
    }
    
    public boolean getFollow() {
        return this.follow_;
    }
    
    public String getFullname() {
        return this.fullname_;
    }
    
    public ByteString getFullnameBytes() {
        return ByteString.copyFromUtf8(this.fullname_);
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$FollowPostRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$FollowPostRequest.access$2700());
        }
    }
}
