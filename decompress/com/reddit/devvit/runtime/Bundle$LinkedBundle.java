// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.runtime;

import com.google.protobuf.GeneratedMessageLite$b;
import m90.i;
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
import m90.b;
import com.google.protobuf.GeneratedMessageLite;

public final class Bundle$LinkedBundle extends GeneratedMessageLite<Bundle$LinkedBundle, a> implements b
{
    public static final int ACTOR_FIELD_NUMBER = 1;
    public static final int CODE_FIELD_NUMBER = 2;
    private static final Bundle$LinkedBundle DEFAULT_INSTANCE;
    public static final int HOSTNAME_FIELD_NUMBER = 3;
    private static volatile n1<Bundle$LinkedBundle> PARSER;
    public static final int PROVIDES_FIELD_NUMBER = 4;
    public static final int USES_FIELD_NUMBER = 5;
    private Bundle$ActorSpec actor_;
    private String code_;
    private String hostname_;
    private Internal$j<Serializable$SerializableServiceDefinition> provides_;
    private Internal$j<Bundle$LinkedBundle> uses_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)Bundle$LinkedBundle.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Bundle$LinkedBundle()));
    }
    
    private Bundle$LinkedBundle() {
        this.code_ = "";
        this.hostname_ = "";
        this.provides_ = (Internal$j<Serializable$SerializableServiceDefinition>)GeneratedMessageLite.emptyProtobufList();
        this.uses_ = (Internal$j<Bundle$LinkedBundle>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ Bundle$LinkedBundle access$7300() {
        return Bundle$LinkedBundle.DEFAULT_INSTANCE;
    }
    
    private void addAllProvides(final Iterable<? extends Serializable$SerializableServiceDefinition> iterable) {
        this.ensureProvidesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.provides_);
    }
    
    private void addAllUses(final Iterable<? extends Bundle$LinkedBundle> iterable) {
        this.ensureUsesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.uses_);
    }
    
    private void addProvides(final int n, final Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition) {
        serializable$SerializableServiceDefinition.getClass();
        this.ensureProvidesIsMutable();
        ((List<Serializable$SerializableServiceDefinition>)this.provides_).add(n, serializable$SerializableServiceDefinition);
    }
    
    private void addProvides(final Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition) {
        serializable$SerializableServiceDefinition.getClass();
        this.ensureProvidesIsMutable();
        ((List<Serializable$SerializableServiceDefinition>)this.provides_).add(serializable$SerializableServiceDefinition);
    }
    
    private void addUses(final int n, final Bundle$LinkedBundle bundle$LinkedBundle) {
        bundle$LinkedBundle.getClass();
        this.ensureUsesIsMutable();
        ((List<Bundle$LinkedBundle>)this.uses_).add(n, bundle$LinkedBundle);
    }
    
    private void addUses(final Bundle$LinkedBundle bundle$LinkedBundle) {
        bundle$LinkedBundle.getClass();
        this.ensureUsesIsMutable();
        ((List<Bundle$LinkedBundle>)this.uses_).add(bundle$LinkedBundle);
    }
    
    private void clearActor() {
        this.actor_ = null;
    }
    
    private void clearCode() {
        this.code_ = getDefaultInstance().getCode();
    }
    
    private void clearHostname() {
        this.hostname_ = getDefaultInstance().getHostname();
    }
    
    private void clearProvides() {
        this.provides_ = (Internal$j<Serializable$SerializableServiceDefinition>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearUses() {
        this.uses_ = (Internal$j<Bundle$LinkedBundle>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureProvidesIsMutable() {
        final Internal$j<Serializable$SerializableServiceDefinition> provides_ = this.provides_;
        if (!provides_.E0()) {
            this.provides_ = (Internal$j<Serializable$SerializableServiceDefinition>)GeneratedMessageLite.mutableCopy((Internal$j)provides_);
        }
    }
    
    private void ensureUsesIsMutable() {
        final Internal$j<Bundle$LinkedBundle> uses_ = this.uses_;
        if (!uses_.E0()) {
            this.uses_ = (Internal$j<Bundle$LinkedBundle>)GeneratedMessageLite.mutableCopy((Internal$j)uses_);
        }
    }
    
    public static Bundle$LinkedBundle getDefaultInstance() {
        return Bundle$LinkedBundle.DEFAULT_INSTANCE;
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
        return (a)Bundle$LinkedBundle.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final Bundle$LinkedBundle bundle$LinkedBundle) {
        return (a)Bundle$LinkedBundle.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundle$LinkedBundle);
    }
    
    public static Bundle$LinkedBundle parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$LinkedBundle parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$LinkedBundle parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, byteString);
    }
    
    public static Bundle$LinkedBundle parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static Bundle$LinkedBundle parseFrom(final l l) throws IOException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, l);
    }
    
    public static Bundle$LinkedBundle parseFrom(final l l, final d0 d0) throws IOException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, l, d0);
    }
    
    public static Bundle$LinkedBundle parseFrom(final InputStream inputStream) throws IOException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, inputStream);
    }
    
    public static Bundle$LinkedBundle parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static Bundle$LinkedBundle parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static Bundle$LinkedBundle parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static Bundle$LinkedBundle parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, array);
    }
    
    public static Bundle$LinkedBundle parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (Bundle$LinkedBundle)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<Bundle$LinkedBundle> parser() {
        return (n1<Bundle$LinkedBundle>)Bundle$LinkedBundle.DEFAULT_INSTANCE.getParserForType();
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
    
    private void setCode(final String code_) {
        code_.getClass();
        this.code_ = code_;
    }
    
    private void setCodeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.code_ = byteString.toStringUtf8();
    }
    
    private void setHostname(final String hostname_) {
        hostname_.getClass();
        this.hostname_ = hostname_;
    }
    
    private void setHostnameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.hostname_ = byteString.toStringUtf8();
    }
    
    private void setProvides(final int n, final Serializable$SerializableServiceDefinition serializable$SerializableServiceDefinition) {
        serializable$SerializableServiceDefinition.getClass();
        this.ensureProvidesIsMutable();
        ((List<Serializable$SerializableServiceDefinition>)this.provides_).set(n, serializable$SerializableServiceDefinition);
    }
    
    private void setUses(final int n, final Bundle$LinkedBundle bundle$LinkedBundle) {
        bundle$LinkedBundle.getClass();
        this.ensureUsesIsMutable();
        ((List<Bundle$LinkedBundle>)this.uses_).set(n, bundle$LinkedBundle);
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
                final n1<Bundle$LinkedBundle> parser;
                if ((parser = Bundle$LinkedBundle.PARSER) == null) {
                    synchronized (Bundle$LinkedBundle.class) {
                        if (Bundle$LinkedBundle.PARSER == null) {
                            Bundle$LinkedBundle.PARSER = (n1<Bundle$LinkedBundle>)new GeneratedMessageLite$c((GeneratedMessageLite)Bundle$LinkedBundle.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return Bundle$LinkedBundle.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)Bundle$LinkedBundle.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\u001b\u0005\u001b", new Object[] { "actor_", "code_", "hostname_", "provides_", Serializable$SerializableServiceDefinition.class, "uses_", Bundle$LinkedBundle.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new Bundle$LinkedBundle();
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
    
    public String getCode() {
        return this.code_;
    }
    
    public ByteString getCodeBytes() {
        return ByteString.copyFromUtf8(this.code_);
    }
    
    public String getHostname() {
        return this.hostname_;
    }
    
    public ByteString getHostnameBytes() {
        return ByteString.copyFromUtf8(this.hostname_);
    }
    
    public Serializable$SerializableServiceDefinition getProvides(final int n) {
        return ((List<Serializable$SerializableServiceDefinition>)this.provides_).get(n);
    }
    
    public int getProvidesCount() {
        return ((List)this.provides_).size();
    }
    
    public List<Serializable$SerializableServiceDefinition> getProvidesList() {
        return (List<Serializable$SerializableServiceDefinition>)this.provides_;
    }
    
    public i getProvidesOrBuilder(final int n) {
        return ((List<i>)this.provides_).get(n);
    }
    
    public List<? extends i> getProvidesOrBuilderList() {
        return (List<? extends i>)this.provides_;
    }
    
    public Bundle$LinkedBundle getUses(final int n) {
        return ((List<Bundle$LinkedBundle>)this.uses_).get(n);
    }
    
    public int getUsesCount() {
        return ((List)this.uses_).size();
    }
    
    public List<Bundle$LinkedBundle> getUsesList() {
        return (List<Bundle$LinkedBundle>)this.uses_;
    }
    
    public b getUsesOrBuilder(final int n) {
        return ((List<b>)this.uses_).get(n);
    }
    
    public List<? extends b> getUsesOrBuilderList() {
        return (List<? extends b>)this.uses_;
    }
    
    public boolean hasActor() {
        return this.actor_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<Bundle$LinkedBundle, a> implements b
    {
        public a() {
            super((GeneratedMessageLite)Bundle$LinkedBundle.access$7300());
        }
    }
}
