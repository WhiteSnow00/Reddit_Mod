// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

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
import al0.f0;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.ByteString;
import com.google.protobuf.StringValue;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class LinksandcommentsMsg$InfoRequest extends GeneratedMessageLite<LinksandcommentsMsg$InfoRequest, a> implements d1
{
    private static final LinksandcommentsMsg$InfoRequest DEFAULT_INSTANCE;
    private static volatile n1<LinksandcommentsMsg$InfoRequest> PARSER;
    public static final int SUBREDDITS_FIELD_NUMBER = 1;
    public static final int THING_IDS_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 3;
    private Internal$j<String> subreddits_;
    private Internal$j<String> thingIds_;
    private StringValue url_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$InfoRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$InfoRequest()));
    }
    
    private LinksandcommentsMsg$InfoRequest() {
        this.subreddits_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
        this.thingIds_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ LinksandcommentsMsg$InfoRequest access$3900() {
        return LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE;
    }
    
    private void addAllSubreddits(final Iterable<String> iterable) {
        this.ensureSubredditsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.subreddits_);
    }
    
    private void addAllThingIds(final Iterable<String> iterable) {
        this.ensureThingIdsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.thingIds_);
    }
    
    private void addSubreddits(final String s) {
        s.getClass();
        this.ensureSubredditsIsMutable();
        ((List<String>)this.subreddits_).add(s);
    }
    
    private void addSubredditsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureSubredditsIsMutable();
        ((List<String>)this.subreddits_).add(byteString.toStringUtf8());
    }
    
    private void addThingIds(final String s) {
        s.getClass();
        this.ensureThingIdsIsMutable();
        ((List<String>)this.thingIds_).add(s);
    }
    
    private void addThingIdsBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.ensureThingIdsIsMutable();
        ((List<String>)this.thingIds_).add(byteString.toStringUtf8());
    }
    
    private void clearSubreddits() {
        this.subreddits_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearThingIds() {
        this.thingIds_ = (Internal$j<String>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearUrl() {
        this.url_ = null;
    }
    
    private void ensureSubredditsIsMutable() {
        final Internal$j<String> subreddits_ = this.subreddits_;
        if (!subreddits_.E0()) {
            this.subreddits_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)subreddits_);
        }
    }
    
    private void ensureThingIdsIsMutable() {
        final Internal$j<String> thingIds_ = this.thingIds_;
        if (!thingIds_.E0()) {
            this.thingIds_ = (Internal$j<String>)GeneratedMessageLite.mutableCopy((Internal$j)thingIds_);
        }
    }
    
    public static LinksandcommentsMsg$InfoRequest getDefaultInstance() {
        return LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE;
    }
    
    private void mergeUrl(final StringValue url_) {
        url_.getClass();
        final StringValue url_2 = this.url_;
        if (url_2 != null && url_2 != StringValue.getDefaultInstance()) {
            this.url_ = (StringValue)f0.e(this.url_, url_);
        }
        else {
            this.url_ = url_;
        }
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$InfoRequest linksandcommentsMsg$InfoRequest) {
        return (a)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$InfoRequest);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$InfoRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$InfoRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$InfoRequest> parser() {
        return (n1<LinksandcommentsMsg$InfoRequest>)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setSubreddits(final int n, final String s) {
        s.getClass();
        this.ensureSubredditsIsMutable();
        ((List<String>)this.subreddits_).set(n, s);
    }
    
    private void setThingIds(final int n, final String s) {
        s.getClass();
        this.ensureThingIdsIsMutable();
        ((List<String>)this.thingIds_).set(n, s);
    }
    
    private void setUrl(final StringValue url_) {
        url_.getClass();
        this.url_ = url_;
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
                final n1<LinksandcommentsMsg$InfoRequest> parser;
                if ((parser = LinksandcommentsMsg$InfoRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$InfoRequest.class) {
                        if (LinksandcommentsMsg$InfoRequest.PARSER == null) {
                            LinksandcommentsMsg$InfoRequest.PARSER = (n1<LinksandcommentsMsg$InfoRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$InfoRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u021a\u0002\u021a\u0003\t", new Object[] { "subreddits_", "thingIds_", "url_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$InfoRequest();
            }
        }
    }
    
    public String getSubreddits(final int n) {
        return ((List<String>)this.subreddits_).get(n);
    }
    
    public ByteString getSubredditsBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.subreddits_).get(n));
    }
    
    public int getSubredditsCount() {
        return ((List)this.subreddits_).size();
    }
    
    public List<String> getSubredditsList() {
        return (List<String>)this.subreddits_;
    }
    
    public String getThingIds(final int n) {
        return ((List<String>)this.thingIds_).get(n);
    }
    
    public ByteString getThingIdsBytes(final int n) {
        return ByteString.copyFromUtf8((String)((List<String>)this.thingIds_).get(n));
    }
    
    public int getThingIdsCount() {
        return ((List)this.thingIds_).size();
    }
    
    public List<String> getThingIdsList() {
        return (List<String>)this.thingIds_;
    }
    
    public StringValue getUrl() {
        StringValue stringValue;
        if ((stringValue = this.url_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasUrl() {
        return this.url_ != null;
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$InfoRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$InfoRequest.access$3900());
        }
    }
}
