// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import m90.d;
import com.google.protobuf.GeneratedMessageLite;

public final class Bundle$PackageSpec extends GeneratedMessageLite<Bundle$PackageSpec, a> implements d
{
    public static final int ACTOR_FIELD_NUMBER = 1;
    private static final Bundle$PackageSpec DEFAULT_INSTANCE;
    public static final int DEFINITION_FIELD_NUMBER = 2;
    public static final int LOCATIONS_FIELD_NUMBER = 3;
    private static volatile n1<Bundle$PackageSpec> PARSER;
    public static final int PARTITIONS_BY_FIELD_NUMBER = 4;
    private Bundle$ActorSpec actor_;
    private Serializable$SerializableServiceDefinition definition_;
    private Bundle$LocationFilter locations_;
    private Internal$j<String> partitionsBy_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Bundle$PackageSpec.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Bundle$PackageSpec()));
    }
    
    private Bundle$PackageSpec() {
        this.partitionsBy_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ Bundle$PackageSpec access$2300() {
        return Bundle$PackageSpec.DEFAULT_INSTANCE;
    }
    
    private void addAllPartitionsBy(final Iterable<String> iterable) {
        this.ensurePartitionsByIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.partitionsBy_);
    }
    
    private void addPartitionsBy(final String s) {
        s.getClass();
        this.ensurePartitionsByIsMutable();
        ((List<String>)this.partitionsBy_).add(s);
    }
    
    private void addPartitionsByBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensurePartitionsByIsMutable();
        ((List<String>)this.partitionsBy_).add(byteString.toStringUtf8());
    }
    
    private void clearActor() {
        this.actor_ = null;
    }
    
    private void clearDefinition() {
        this.definition_ = null;
    }
    
    private void clearLocations() {
        this.locations_ = null;
    }
    
    private void clearPartitionsBy() {
        this.partitionsBy_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensurePartitionsByIsMutable() {
        final Internal$j<String> partitionsBy_ = this.partitionsBy_;
        if (!partitionsBy_.E0()) {
            this.partitionsBy_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)partitionsBy_);
        }
    }
    
    public static Bundle$PackageSpec getDefaultInstance() {
        return Bundle$PackageSpec.DEFAULT_INSTANCE;
    }
    
    private void mergeActor(final Bundle$ActorSpec actor_) {
        actor_.getClass();
        final Bundle$ActorSpec actor_2 = this.actor_;
        if (actor_2 != null && actor_2 != Bundle$ActorSpec.getDefaultInstance()) {
            final Bundle$ActorSpec.a builder = Bundle$ActorSpec.newBuilder(this.actor_);
            builder.h((GeneratedMessageLite)actor_);
            this.actor_ = (Bundle$ActorSpec)builder.d();
        }
        else {
            this.actor_ = actor_;
        }
    }
    
    private void mergeDefinition(final Serializable$SerializableServiceDefinition definition_) {
        definition_.getClass();
        final Serializable$SerializableServiceDefinition definition_2 = this.definition_;
        if (definition_2 != null && definition_2 != Serializable$SerializableServiceDefinition.getDefaultInstance()) {
            final Serializable$SerializableServiceDefinition.a builder = Serializable$SerializableServiceDefinition.newBuilder(this.definition_);
            builder.h((GeneratedMessageLite)definition_);
            this.definition_ = (Serializable$SerializableServiceDefinition)builder.d();
        }
        else {
            this.definition_ = definition_;
        }
    }
    
    private void mergeLocations(final Bundle$LocationFilter locations_) {
        locations_.getClass();
        final Bundle$LocationFilter locations_2 = this.locations_;
        if (locations_2 != null && locations_2 != Bundle$LocationFilter.getDefaultInstance()) {
            final Bundle$LocationFilter.a builder = Bundle$LocationFilter.newBuilder(this.locations_);
            builder.h((GeneratedMessageLite)locations_);
            this.locations_ = (Bundle$LocationFilter)builder.d();
        }
        else {
            this.locations_ = locations_;
        }
    }
    
    public static a newBuilder() {
        return (a)Bundle$PackageSpec.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Bundle$PackageSpec bundle$PackageSpec) {
        return (a)Bundle$PackageSpec.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundle$PackageSpec);
    }
    
    public static Bundle$PackageSpec parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$PackageSpec parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$PackageSpec parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, byteString);
    }
    
    public static Bundle$PackageSpec parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Bundle$PackageSpec parseFrom(final l l) throws IOException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, l);
    }
    
    public static Bundle$PackageSpec parseFrom(final l l, final d0 d0) throws IOException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Bundle$PackageSpec parseFrom(final InputStream inputStream) throws IOException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$PackageSpec parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$PackageSpec parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Bundle$PackageSpec parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Bundle$PackageSpec parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, array);
    }
    
    public static Bundle$PackageSpec parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$PackageSpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Bundle$PackageSpec> parser() {
        return (n1<Bundle$PackageSpec>)Bundle$PackageSpec.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setActor(final Bundle$ActorSpec actor_) {
        actor_.getClass();
        this.actor_ = actor_;
    }
    
    private void setDefinition(final Serializable$SerializableServiceDefinition definition_) {
        definition_.getClass();
        this.definition_ = definition_;
    }
    
    private void setLocations(final Bundle$LocationFilter locations_) {
        locations_.getClass();
        this.locations_ = locations_;
    }
    
    private void setPartitionsBy(final int n, final String s) {
        s.getClass();
        this.ensurePartitionsByIsMutable();
        ((List<String>)this.partitionsBy_).set(n, s);
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
                final n1<Bundle$PackageSpec> parser;
                if ((parser = Bundle$PackageSpec.PARSER) == null) {
                    synchronized (Bundle$PackageSpec.class) {
                        if (Bundle$PackageSpec.PARSER == null) {
                            Bundle$PackageSpec.PARSER = (n1<Bundle$PackageSpec>)new GeneratedMessageLite$c((GeneratedMessageLite)Bundle$PackageSpec.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Bundle$PackageSpec.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Bundle$PackageSpec.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\u021a", new Object[] { "actor_", "definition_", "locations_", "partitionsBy_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Bundle$PackageSpec();
            }
        }
    }
    
    public Bundle$ActorSpec getActor() {
        Bundle$ActorSpec bundle$ActorSpec;
        if ((bundle$ActorSpec = this.actor_) == null) {
            bundle$ActorSpec = Bundle$ActorSpec.getDefaultInstance();
        }
        return bundle$ActorSpec;
    }
    
    public Serializable$SerializableServiceDefinition getDefinition() {
        Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition;
        if ((serializable$SerializableServiceDefinition = this.definition_) == null) {
            serializable$SerializableServiceDefinition = Serializable$SerializableServiceDefinition.getDefaultInstance();
        }
        return serializable$SerializableServiceDefinition;
    }
    
    public Bundle$LocationFilter getLocations() {
        Bundle$LocationFilter bundle$LocationFilter;
        if ((bundle$LocationFilter = this.locations_) == null) {
            bundle$LocationFilter = Bundle$LocationFilter.getDefaultInstance();
        }
        return bundle$LocationFilter;
    }
    
    public String getPartitionsBy(final int n) {
        return ((List<String>)this.partitionsBy_).get(n);
    }
    
    public ByteString getPartitionsByBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.partitionsBy_).get(n));
    }
    
    public int getPartitionsByCount() {
        return ((List)this.partitionsBy_).size();
    }
    
    public List<String> getPartitionsByList() {
        return (List<String>)this.partitionsBy_;
    }
    
    public boolean hasActor() {
        return this.actor_ != null;
    }
    
    public boolean hasDefinition() {
        return this.definition_ != null;
    }
    
    public boolean hasLocations() {
        return this.locations_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<Bundle$PackageSpec, a> implements d
    {
        public a() {
            super((GeneratedMessageLite)Bundle$PackageSpec.access$2300());
        }
    }
}
