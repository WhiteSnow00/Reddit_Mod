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

public final class LinksandcommentsMsg$EventPostTimeRequest extends GeneratedMessageLite<LinksandcommentsMsg$EventPostTimeRequest, a> implements d1
{
    private static final LinksandcommentsMsg$EventPostTimeRequest DEFAULT_INSTANCE;
    public static final int EVENT_END_FIELD_NUMBER = 1;
    public static final int EVENT_START_FIELD_NUMBER = 2;
    public static final int EVENT_TZ_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 4;
    private static volatile n1<LinksandcommentsMsg$EventPostTimeRequest> PARSER;
    private String eventEnd_;
    private String eventStart_;
    private String eventTz_;
    private String id_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$EventPostTimeRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$EventPostTimeRequest()));
    }
    
    private LinksandcommentsMsg$EventPostTimeRequest() {
        this.eventEnd_ = "";
        this.eventStart_ = "";
        this.eventTz_ = "";
        this.id_ = "";
    }
    
    public static /* synthetic */ LinksandcommentsMsg$EventPostTimeRequest access$1300() {
        return LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE;
    }
    
    private void clearEventEnd() {
        this.eventEnd_ = getDefaultInstance().getEventEnd();
    }
    
    private void clearEventStart() {
        this.eventStart_ = getDefaultInstance().getEventStart();
    }
    
    private void clearEventTz() {
        this.eventTz_ = getDefaultInstance().getEventTz();
    }
    
    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest getDefaultInstance() {
        return LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$EventPostTimeRequest linksandcommentsMsg$EventPostTimeRequest) {
        return (a)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$EventPostTimeRequest);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$EventPostTimeRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$EventPostTimeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$EventPostTimeRequest> parser() {
        return (n1<LinksandcommentsMsg$EventPostTimeRequest>)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setEventEnd(final String eventEnd_) {
        eventEnd_.getClass();
        this.eventEnd_ = eventEnd_;
    }
    
    private void setEventEndBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.eventEnd_ = byteString.toStringUtf8();
    }
    
    private void setEventStart(final String eventStart_) {
        eventStart_.getClass();
        this.eventStart_ = eventStart_;
    }
    
    private void setEventStartBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.eventStart_ = byteString.toStringUtf8();
    }
    
    private void setEventTz(final String eventTz_) {
        eventTz_.getClass();
        this.eventTz_ = eventTz_;
    }
    
    private void setEventTzBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.eventTz_ = byteString.toStringUtf8();
    }
    
    private void setId(final String id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
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
                final n1<LinksandcommentsMsg$EventPostTimeRequest> parser;
                if ((parser = LinksandcommentsMsg$EventPostTimeRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$EventPostTimeRequest.class) {
                        if (LinksandcommentsMsg$EventPostTimeRequest.PARSER == null) {
                            LinksandcommentsMsg$EventPostTimeRequest.PARSER = (n1<LinksandcommentsMsg$EventPostTimeRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$EventPostTimeRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[] { "eventEnd_", "eventStart_", "eventTz_", "id_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$EventPostTimeRequest();
            }
        }
    }
    
    public String getEventEnd() {
        return this.eventEnd_;
    }
    
    public ByteString getEventEndBytes() {
        return ByteString.copyFromUtf8(this.eventEnd_);
    }
    
    public String getEventStart() {
        return this.eventStart_;
    }
    
    public ByteString getEventStartBytes() {
        return ByteString.copyFromUtf8(this.eventStart_);
    }
    
    public String getEventTz() {
        return this.eventTz_;
    }
    
    public ByteString getEventTzBytes() {
        return ByteString.copyFromUtf8(this.eventTz_);
    }
    
    public String getId() {
        return this.id_;
    }
    
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$EventPostTimeRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$EventPostTimeRequest.access$1300());
        }
    }
}
