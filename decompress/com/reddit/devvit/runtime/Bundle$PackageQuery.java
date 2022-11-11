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
import al0.f0;
import com.google.protobuf.ByteString;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import m90.c;
import com.google.protobuf.GeneratedMessageLite;

public final class Bundle$PackageQuery extends GeneratedMessageLite<Bundle$PackageQuery, a> implements c
{
    private static final Bundle$PackageQuery DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OWNER_FIELD_NUMBER = 2;
    private static volatile n1<Bundle$PackageQuery> PARSER;
    public static final int TYPE_NAME_FIELD_NUMBER = 3;
    public static final int VERSIONS_FIELD_NUMBER = 4;
    private StringValue name_;
    private StringValue owner_;
    private String typeName_;
    private StringValue versions_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Bundle$PackageQuery.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Bundle$PackageQuery()));
    }
    
    private Bundle$PackageQuery() {
        this.typeName_ = "";
    }
    
    public static /* synthetic */ Bundle$PackageQuery access$3900() {
        return Bundle$PackageQuery.DEFAULT_INSTANCE;
    }
    
    private void clearName() {
        this.name_ = null;
    }
    
    private void clearOwner() {
        this.owner_ = null;
    }
    
    private void clearTypeName() {
        this.typeName_ = getDefaultInstance().getTypeName();
    }
    
    private void clearVersions() {
        this.versions_ = null;
    }
    
    public static Bundle$PackageQuery getDefaultInstance() {
        return Bundle$PackageQuery.DEFAULT_INSTANCE;
    }
    
    private void mergeName(final StringValue name_) {
        name_.getClass();
        final StringValue name_2 = this.name_;
        if (name_2 != null && name_2 != StringValue.getDefaultInstance()) {
            this.name_ = (StringValue)f0.e(this.name_, name_);
        }
        else {
            this.name_ = name_;
        }
    }
    
    private void mergeOwner(final StringValue owner_) {
        owner_.getClass();
        final StringValue owner_2 = this.owner_;
        if (owner_2 != null && owner_2 != StringValue.getDefaultInstance()) {
            this.owner_ = (StringValue)f0.e(this.owner_, owner_);
        }
        else {
            this.owner_ = owner_;
        }
    }
    
    private void mergeVersions(final StringValue versions_) {
        versions_.getClass();
        final StringValue versions_2 = this.versions_;
        if (versions_2 != null && versions_2 != StringValue.getDefaultInstance()) {
            this.versions_ = (StringValue)f0.e(this.versions_, versions_);
        }
        else {
            this.versions_ = versions_;
        }
    }
    
    public static a newBuilder() {
        return (a)Bundle$PackageQuery.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Bundle$PackageQuery bundle$PackageQuery) {
        return (a)Bundle$PackageQuery.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundle$PackageQuery);
    }
    
    public static Bundle$PackageQuery parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$PackageQuery parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$PackageQuery parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, byteString);
    }
    
    public static Bundle$PackageQuery parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Bundle$PackageQuery parseFrom(final l l) throws IOException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, l);
    }
    
    public static Bundle$PackageQuery parseFrom(final l l, final d0 d0) throws IOException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Bundle$PackageQuery parseFrom(final InputStream inputStream) throws IOException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$PackageQuery parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$PackageQuery parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Bundle$PackageQuery parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Bundle$PackageQuery parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, array);
    }
    
    public static Bundle$PackageQuery parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$PackageQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Bundle$PackageQuery> parser() {
        return (n1<Bundle$PackageQuery>)Bundle$PackageQuery.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setName(final StringValue name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setOwner(final StringValue owner_) {
        owner_.getClass();
        this.owner_ = owner_;
    }
    
    private void setTypeName(final String typeName_) {
        typeName_.getClass();
        this.typeName_ = typeName_;
    }
    
    private void setTypeNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.typeName_ = byteString.toStringUtf8();
    }
    
    private void setVersions(final StringValue versions_) {
        versions_.getClass();
        this.versions_ = versions_;
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
                final n1<Bundle$PackageQuery> parser;
                if ((parser = Bundle$PackageQuery.PARSER) == null) {
                    synchronized (Bundle$PackageQuery.class) {
                        if (Bundle$PackageQuery.PARSER == null) {
                            Bundle$PackageQuery.PARSER = (n1<Bundle$PackageQuery>)new GeneratedMessageLite$c((GeneratedMessageLite)Bundle$PackageQuery.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Bundle$PackageQuery.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Bundle$PackageQuery.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0208\u0004\t", new Object[] { "name_", "owner_", "typeName_", "versions_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Bundle$PackageQuery();
            }
        }
    }
    
    public StringValue getName() {
        StringValue stringValue;
        if ((stringValue = this.name_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getOwner() {
        StringValue stringValue;
        if ((stringValue = this.owner_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public String getTypeName() {
        return this.typeName_;
    }
    
    public ByteString getTypeNameBytes() {
        return ByteString.copyFromUtf8(this.typeName_);
    }
    
    public StringValue getVersions() {
        StringValue stringValue;
        if ((stringValue = this.versions_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasName() {
        return this.name_ != null;
    }
    
    public boolean hasOwner() {
        return this.owner_ != null;
    }
    
    public boolean hasVersions() {
        return this.versions_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<Bundle$PackageQuery, a> implements c
    {
        public a() {
            super((GeneratedMessageLite)Bundle$PackageQuery.access$3900());
        }
    }
}
