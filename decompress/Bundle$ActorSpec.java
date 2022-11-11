// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

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

public final class Bundle$ActorSpec extends GeneratedMessageLite<Bundle$ActorSpec, a> implements d1
{
    private static final Bundle$ActorSpec DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OWNER_FIELD_NUMBER = 2;
    private static volatile n1<Bundle$ActorSpec> PARSER;
    public static final int VERSION_FIELD_NUMBER = 3;
    private String name_;
    private String owner_;
    private String version_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Bundle$ActorSpec.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Bundle$ActorSpec()));
    }
    
    private Bundle$ActorSpec() {
        this.name_ = "";
        this.owner_ = "";
        this.version_ = "";
    }
    
    public static /* synthetic */ Bundle$ActorSpec access$000() {
        return Bundle$ActorSpec.DEFAULT_INSTANCE;
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearOwner() {
        this.owner_ = getDefaultInstance().getOwner();
    }
    
    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }
    
    public static Bundle$ActorSpec getDefaultInstance() {
        return Bundle$ActorSpec.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)Bundle$ActorSpec.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Bundle$ActorSpec bundle$ActorSpec) {
        return (a)Bundle$ActorSpec.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundle$ActorSpec);
    }
    
    public static Bundle$ActorSpec parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$ActorSpec parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$ActorSpec parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, byteString);
    }
    
    public static Bundle$ActorSpec parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Bundle$ActorSpec parseFrom(final l l) throws IOException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, l);
    }
    
    public static Bundle$ActorSpec parseFrom(final l l, final d0 d0) throws IOException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Bundle$ActorSpec parseFrom(final InputStream inputStream) throws IOException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$ActorSpec parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$ActorSpec parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Bundle$ActorSpec parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Bundle$ActorSpec parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, array);
    }
    
    public static Bundle$ActorSpec parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$ActorSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Bundle$ActorSpec> parser() {
        return (n1<Bundle$ActorSpec>)Bundle$ActorSpec.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }
    
    private void setOwner(final String owner_) {
        owner_.getClass();
        this.owner_ = owner_;
    }
    
    private void setOwnerBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.owner_ = byteString.toStringUtf8();
    }
    
    private void setVersion(final String version_) {
        version_.getClass();
        this.version_ = version_;
    }
    
    private void setVersionBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (m90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<Bundle$ActorSpec> parser;
                if ((parser = Bundle$ActorSpec.PARSER) == null) {
                    synchronized (Bundle$ActorSpec.class) {
                        if (Bundle$ActorSpec.PARSER == null) {
                            Bundle$ActorSpec.PARSER = (n1<Bundle$ActorSpec>)new GeneratedMessageLite$c((GeneratedMessageLite)Bundle$ActorSpec.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Bundle$ActorSpec.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Bundle$ActorSpec.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[] { "name_", "owner_", "version_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Bundle$ActorSpec();
            }
        }
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public String getOwner() {
        return this.owner_;
    }
    
    public ByteString getOwnerBytes() {
        return ByteString.copyFromUtf8(this.owner_);
    }
    
    public String getVersion() {
        return this.version_;
    }
    
    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }
    
    public static final class a extends GeneratedMessageLite$b<Bundle$ActorSpec, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Bundle$ActorSpec.access$000());
        }
    }
}
