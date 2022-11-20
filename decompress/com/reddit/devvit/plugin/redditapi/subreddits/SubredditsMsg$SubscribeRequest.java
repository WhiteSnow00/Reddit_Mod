// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

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

public final class SubredditsMsg$SubscribeRequest extends GeneratedMessageLite<SubredditsMsg$SubscribeRequest, a> implements d1
{
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int ACTION_SOURCE_FIELD_NUMBER = 2;
    private static final SubredditsMsg$SubscribeRequest DEFAULT_INSTANCE;
    private static volatile n1<SubredditsMsg$SubscribeRequest> PARSER;
    public static final int SKIP_INITIAL_DEFAULTS_FIELD_NUMBER = 3;
    public static final int SR_FIELD_NUMBER = 4;
    public static final int SR_NAME_FIELD_NUMBER = 5;
    private String actionSource_;
    private String action_;
    private boolean skipInitialDefaults_;
    private String srName_;
    private String sr_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubscribeRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubscribeRequest()));
    }
    
    private SubredditsMsg$SubscribeRequest() {
        this.action_ = "";
        this.actionSource_ = "";
        this.sr_ = "";
        this.srName_ = "";
    }
    
    public static SubredditsMsg$SubscribeRequest access$24100() {
        return SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$24200(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final String action) {
        subredditsMsg$SubscribeRequest.setAction(action);
    }
    
    public static void access$24300(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest) {
        subredditsMsg$SubscribeRequest.clearAction();
    }
    
    public static void access$24400(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final ByteString actionBytes) {
        subredditsMsg$SubscribeRequest.setActionBytes(actionBytes);
    }
    
    public static void access$24500(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final String actionSource) {
        subredditsMsg$SubscribeRequest.setActionSource(actionSource);
    }
    
    public static void access$24600(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest) {
        subredditsMsg$SubscribeRequest.clearActionSource();
    }
    
    public static void access$24700(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final ByteString actionSourceBytes) {
        subredditsMsg$SubscribeRequest.setActionSourceBytes(actionSourceBytes);
    }
    
    public static void access$24800(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final boolean skipInitialDefaults) {
        subredditsMsg$SubscribeRequest.setSkipInitialDefaults(skipInitialDefaults);
    }
    
    public static void access$24900(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest) {
        subredditsMsg$SubscribeRequest.clearSkipInitialDefaults();
    }
    
    public static void access$25000(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final String sr) {
        subredditsMsg$SubscribeRequest.setSr(sr);
    }
    
    public static void access$25100(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest) {
        subredditsMsg$SubscribeRequest.clearSr();
    }
    
    public static void access$25200(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final ByteString srBytes) {
        subredditsMsg$SubscribeRequest.setSrBytes(srBytes);
    }
    
    public static void access$25300(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final String srName) {
        subredditsMsg$SubscribeRequest.setSrName(srName);
    }
    
    public static void access$25400(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest) {
        subredditsMsg$SubscribeRequest.clearSrName();
    }
    
    public static void access$25500(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest, final ByteString srNameBytes) {
        subredditsMsg$SubscribeRequest.setSrNameBytes(srNameBytes);
    }
    
    private void clearAction() {
        this.action_ = getDefaultInstance().getAction();
    }
    
    private void clearActionSource() {
        this.actionSource_ = getDefaultInstance().getActionSource();
    }
    
    private void clearSkipInitialDefaults() {
        this.skipInitialDefaults_ = false;
    }
    
    private void clearSr() {
        this.sr_ = getDefaultInstance().getSr();
    }
    
    private void clearSrName() {
        this.srName_ = getDefaultInstance().getSrName();
    }
    
    public static SubredditsMsg$SubscribeRequest getDefaultInstance() {
        return SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubscribeRequest subredditsMsg$SubscribeRequest) {
        return (a)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubscribeRequest);
    }
    
    public static SubredditsMsg$SubscribeRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubscribeRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubscribeRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubscribeRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubscribeRequest> parser() {
        return (n1<SubredditsMsg$SubscribeRequest>)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAction(final String action_) {
        action_.getClass();
        this.action_ = action_;
    }
    
    private void setActionBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
    }
    
    private void setActionSource(final String actionSource_) {
        actionSource_.getClass();
        this.actionSource_ = actionSource_;
    }
    
    private void setActionSourceBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.actionSource_ = byteString.toStringUtf8();
    }
    
    private void setSkipInitialDefaults(final boolean skipInitialDefaults_) {
        this.skipInitialDefaults_ = skipInitialDefaults_;
    }
    
    private void setSr(final String sr_) {
        sr_.getClass();
        this.sr_ = sr_;
    }
    
    private void setSrBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.sr_ = byteString.toStringUtf8();
    }
    
    private void setSrName(final String srName_) {
        srName_.getClass();
        this.srName_ = srName_;
    }
    
    private void setSrNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.srName_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (h90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<SubredditsMsg$SubscribeRequest> parser;
                if ((parser = SubredditsMsg$SubscribeRequest.PARSER) == null) {
                    synchronized (SubredditsMsg$SubscribeRequest.class) {
                        if (SubredditsMsg$SubscribeRequest.PARSER == null) {
                            SubredditsMsg$SubscribeRequest.PARSER = (n1<SubredditsMsg$SubscribeRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubscribeRequest.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007\u0004\u0208\u0005\u0208", new Object[] { "action_", "actionSource_", "skipInitialDefaults_", "sr_", "srName_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubscribeRequest();
            }
        }
    }
    
    public String getAction() {
        return this.action_;
    }
    
    public ByteString getActionBytes() {
        return ByteString.copyFromUtf8(this.action_);
    }
    
    public String getActionSource() {
        return this.actionSource_;
    }
    
    public ByteString getActionSourceBytes() {
        return ByteString.copyFromUtf8(this.actionSource_);
    }
    
    public boolean getSkipInitialDefaults() {
        return this.skipInitialDefaults_;
    }
    
    public String getSr() {
        return this.sr_;
    }
    
    public ByteString getSrBytes() {
        return ByteString.copyFromUtf8(this.sr_);
    }
    
    public String getSrName() {
        return this.srName_;
    }
    
    public ByteString getSrNameBytes() {
        return ByteString.copyFromUtf8(this.srName_);
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubscribeRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubscribeRequest.access$24100());
        }
    }
}
