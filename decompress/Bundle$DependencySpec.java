// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import m90.c;
import m90.d;
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
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class Bundle$DependencySpec extends GeneratedMessageLite<Bundle$DependencySpec, a> implements d1
{
    public static final int ACTOR_FIELD_NUMBER = 1;
    private static final Bundle$DependencySpec DEFAULT_INSTANCE;
    public static final int HOSTNAME_FIELD_NUMBER = 2;
    private static volatile n1<Bundle$DependencySpec> PARSER;
    public static final int PROVIDES_FIELD_NUMBER = 3;
    public static final int USES_FIELD_NUMBER = 4;
    private Bundle$ActorSpec actor_;
    private String hostname_;
    private Internal$j<Bundle$PackageSpec> provides_;
    private Internal$j<Bundle$PackageQuery> uses_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Bundle$DependencySpec.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Bundle$DependencySpec()));
    }
    
    private Bundle$DependencySpec() {
        this.hostname_ = "";
        this.provides_ = (Internal$j<Bundle$PackageSpec>)GeneratedMessageLite.emptyProtobufList();
        this.uses_ = (Internal$j<Bundle$PackageQuery>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ Bundle$DependencySpec access$5300() {
        return Bundle$DependencySpec.DEFAULT_INSTANCE;
    }
    
    private void addAllProvides(final Iterable<? extends Bundle$PackageSpec> iterable) {
        this.ensureProvidesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.provides_);
    }
    
    private void addAllUses(final Iterable<? extends Bundle$PackageQuery> iterable) {
        this.ensureUsesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.uses_);
    }
    
    private void addProvides(final int n, final Bundle$PackageSpec bundle$PackageSpec) {
        bundle$PackageSpec.getClass();
        this.ensureProvidesIsMutable();
        ((List<Bundle$PackageSpec>)this.provides_).add(n, bundle$PackageSpec);
    }
    
    private void addProvides(final Bundle$PackageSpec bundle$PackageSpec) {
        bundle$PackageSpec.getClass();
        this.ensureProvidesIsMutable();
        ((List<Bundle$PackageSpec>)this.provides_).add(bundle$PackageSpec);
    }
    
    private void addUses(final int n, final Bundle$PackageQuery bundle$PackageQuery) {
        bundle$PackageQuery.getClass();
        this.ensureUsesIsMutable();
        ((List<Bundle$PackageQuery>)this.uses_).add(n, bundle$PackageQuery);
    }
    
    private void addUses(final Bundle$PackageQuery bundle$PackageQuery) {
        bundle$PackageQuery.getClass();
        this.ensureUsesIsMutable();
        ((List<Bundle$PackageQuery>)this.uses_).add(bundle$PackageQuery);
    }
    
    private void clearActor() {
        this.actor_ = null;
    }
    
    private void clearHostname() {
        this.hostname_ = getDefaultInstance().getHostname();
    }
    
    private void clearProvides() {
        this.provides_ = (Internal$j<Bundle$PackageSpec>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearUses() {
        this.uses_ = (Internal$j<Bundle$PackageQuery>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureProvidesIsMutable() {
        final Internal$j<Bundle$PackageSpec> provides_ = this.provides_;
        if (!provides_.E0()) {
            this.provides_ = (Internal$j<Bundle$PackageSpec>)GeneratedMessageLite.mutableCopy((Internal$j)provides_);
        }
    }
    
    private void ensureUsesIsMutable() {
        final Internal$j<Bundle$PackageQuery> uses_ = this.uses_;
        if (!uses_.E0()) {
            this.uses_ = (Internal$j<Bundle$PackageQuery>)GeneratedMessageLite.mutableCopy((Internal$j)uses_);
        }
    }
    
    public static Bundle$DependencySpec getDefaultInstance() {
        return Bundle$DependencySpec.DEFAULT_INSTANCE;
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
    
    public static a newBuilder() {
        return (a)Bundle$DependencySpec.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Bundle$DependencySpec bundle$DependencySpec) {
        return (a)Bundle$DependencySpec.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundle$DependencySpec);
    }
    
    public static Bundle$DependencySpec parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$DependencySpec parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$DependencySpec parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, byteString);
    }
    
    public static Bundle$DependencySpec parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Bundle$DependencySpec parseFrom(final l l) throws IOException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, l);
    }
    
    public static Bundle$DependencySpec parseFrom(final l l, final d0 d0) throws IOException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Bundle$DependencySpec parseFrom(final InputStream inputStream) throws IOException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$DependencySpec parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$DependencySpec parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Bundle$DependencySpec parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Bundle$DependencySpec parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, array);
    }
    
    public static Bundle$DependencySpec parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$DependencySpec)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Bundle$DependencySpec> parser() {
        return (n1<Bundle$DependencySpec>)Bundle$DependencySpec.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeProvides(final int n) {
        this.ensureProvidesIsMutable();
        this.provides_.remove(n);
    }
    
    private void removeUses(final int n) {
        this.ensureUsesIsMutable();
        this.uses_.remove(n);
    }
    
    private void setActor(final Bundle$ActorSpec actor_) {
        actor_.getClass();
        this.actor_ = actor_;
    }
    
    private void setHostname(final String hostname_) {
        hostname_.getClass();
        this.hostname_ = hostname_;
    }
    
    private void setHostnameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.hostname_ = byteString.toStringUtf8();
    }
    
    private void setProvides(final int n, final Bundle$PackageSpec bundle$PackageSpec) {
        bundle$PackageSpec.getClass();
        this.ensureProvidesIsMutable();
        ((List<Bundle$PackageSpec>)this.provides_).set(n, bundle$PackageSpec);
    }
    
    private void setUses(final int n, final Bundle$PackageQuery bundle$PackageQuery) {
        bundle$PackageQuery.getClass();
        this.ensureUsesIsMutable();
        ((List<Bundle$PackageQuery>)this.uses_).set(n, bundle$PackageQuery);
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
                final n1<Bundle$DependencySpec> parser;
                if ((parser = Bundle$DependencySpec.PARSER) == null) {
                    synchronized (Bundle$DependencySpec.class) {
                        if (Bundle$DependencySpec.PARSER == null) {
                            Bundle$DependencySpec.PARSER = (n1<Bundle$DependencySpec>)new GeneratedMessageLite$c((GeneratedMessageLite)Bundle$DependencySpec.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Bundle$DependencySpec.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Bundle$DependencySpec.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\t\u0002\u0208\u0003\u001b\u0004\u001b", new Object[] { "actor_", "hostname_", "provides_", Bundle$PackageSpec.class, "uses_", Bundle$PackageQuery.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Bundle$DependencySpec();
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
    
    public String getHostname() {
        return this.hostname_;
    }
    
    public ByteString getHostnameBytes() {
        return ByteString.copyFromUtf8(this.hostname_);
    }
    
    public Bundle$PackageSpec getProvides(final int n) {
        return ((List<Bundle$PackageSpec>)this.provides_).get(n);
    }
    
    public int getProvidesCount() {
        return ((List)this.provides_).size();
    }
    
    public List<Bundle$PackageSpec> getProvidesList() {
        return (List<Bundle$PackageSpec>)this.provides_;
    }
    
    public d getProvidesOrBuilder(final int n) {
        return ((List<d>)this.provides_).get(n);
    }
    
    public List<? extends d> getProvidesOrBuilderList() {
        return (List<? extends d>)this.provides_;
    }
    
    public Bundle$PackageQuery getUses(final int n) {
        return ((List<Bundle$PackageQuery>)this.uses_).get(n);
    }
    
    public int getUsesCount() {
        return ((List)this.uses_).size();
    }
    
    public List<Bundle$PackageQuery> getUsesList() {
        return (List<Bundle$PackageQuery>)this.uses_;
    }
    
    public c getUsesOrBuilder(final int n) {
        return ((List<c>)this.uses_).get(n);
    }
    
    public List<? extends c> getUsesOrBuilderList() {
        return (List<? extends c>)this.uses_;
    }
    
    public boolean hasActor() {
        return this.actor_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<Bundle$DependencySpec, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)Bundle$DependencySpec.access$5300());
        }
    }
}
