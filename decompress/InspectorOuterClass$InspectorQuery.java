// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.inspector;

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

public final class InspectorOuterClass$InspectorQuery extends GeneratedMessageLite<InspectorOuterClass$InspectorQuery, a> implements d1
{
    private static final InspectorOuterClass$InspectorQuery DEFAULT_INSTANCE;
    public static final int HOSTNAME_FIELD_NUMBER = 2;
    private static volatile n1<InspectorOuterClass$InspectorQuery> PARSER;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String hostname_;
    private String type_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)InspectorOuterClass$InspectorQuery.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new InspectorOuterClass$InspectorQuery()));
    }
    
    private InspectorOuterClass$InspectorQuery() {
        this.type_ = "";
        this.hostname_ = "";
    }
    
    public static /* synthetic */ InspectorOuterClass$InspectorQuery access$000() {
        return InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE;
    }
    
    private void clearHostname() {
        this.hostname_ = getDefaultInstance().getHostname();
    }
    
    private void clearType() {
        this.type_ = getDefaultInstance().getType();
    }
    
    public static InspectorOuterClass$InspectorQuery getDefaultInstance() {
        return InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final InspectorOuterClass$InspectorQuery inspectorOuterClass$InspectorQuery) {
        return (a)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)inspectorOuterClass$InspectorQuery);
    }
    
    public static InspectorOuterClass$InspectorQuery parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorQuery parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, byteString);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final l l) throws IOException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, l);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final l l, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, l, d0);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final InputStream inputStream) throws IOException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, inputStream);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, array);
    }
    
    public static InspectorOuterClass$InspectorQuery parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (InspectorOuterClass$InspectorQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<InspectorOuterClass$InspectorQuery> parser() {
        return (n1<InspectorOuterClass$InspectorQuery>)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setHostname(final String hostname_) {
        hostname_.getClass();
        this.hostname_ = hostname_;
    }
    
    private void setHostnameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.hostname_ = byteString.toStringUtf8();
    }
    
    private void setType(final String type_) {
        type_.getClass();
        this.type_ = type_;
    }
    
    private void setTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (w80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<InspectorOuterClass$InspectorQuery> parser;
                if ((parser = InspectorOuterClass$InspectorQuery.PARSER) == null) {
                    synchronized (InspectorOuterClass$InspectorQuery.class) {
                        if (InspectorOuterClass$InspectorQuery.PARSER == null) {
                            InspectorOuterClass$InspectorQuery.PARSER = (n1<InspectorOuterClass$InspectorQuery>)new GeneratedMessageLite$c((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)InspectorOuterClass$InspectorQuery.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[] { "type_", "hostname_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new InspectorOuterClass$InspectorQuery();
            }
        }
    }
    
    public String getHostname() {
        return this.hostname_;
    }
    
    public ByteString getHostnameBytes() {
        return ByteString.copyFromUtf8(this.hostname_);
    }
    
    public String getType() {
        return this.type_;
    }
    
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
    
    public static final class a extends GeneratedMessageLite$b<InspectorOuterClass$InspectorQuery, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)InspectorOuterClass$InspectorQuery.access$000());
        }
    }
}
