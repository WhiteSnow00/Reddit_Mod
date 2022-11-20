// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import java.util.List;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal$j;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import h90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import t5.w;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SubredditsMsg$StickyResponse extends GeneratedMessageLite<SubredditsMsg$StickyResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SubredditsMsg$StickyResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<SubredditsMsg$StickyResponse> PARSER;
    private StickyResponseData data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$StickyResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$StickyResponse()));
    }
    
    private SubredditsMsg$StickyResponse() {
    }
    
    public static SubredditsMsg$StickyResponse access$186100() {
        return SubredditsMsg$StickyResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$186200(final SubredditsMsg$StickyResponse subredditsMsg$StickyResponse, final StringValue kind) {
        subredditsMsg$StickyResponse.setKind(kind);
    }
    
    public static void access$186300(final SubredditsMsg$StickyResponse subredditsMsg$StickyResponse, final StringValue stringValue) {
        subredditsMsg$StickyResponse.mergeKind(stringValue);
    }
    
    public static void access$186400(final SubredditsMsg$StickyResponse subredditsMsg$StickyResponse) {
        subredditsMsg$StickyResponse.clearKind();
    }
    
    public static void access$186500(final SubredditsMsg$StickyResponse subredditsMsg$StickyResponse, final StickyResponseData data) {
        subredditsMsg$StickyResponse.setData(data);
    }
    
    public static void access$186600(final SubredditsMsg$StickyResponse subredditsMsg$StickyResponse, final StickyResponseData stickyResponseData) {
        subredditsMsg$StickyResponse.mergeData(stickyResponseData);
    }
    
    public static void access$186700(final SubredditsMsg$StickyResponse subredditsMsg$StickyResponse) {
        subredditsMsg$StickyResponse.clearData();
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static SubredditsMsg$StickyResponse getDefaultInstance() {
        return SubredditsMsg$StickyResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final StickyResponseData stickyResponseData) {
        stickyResponseData.getClass();
        final StickyResponseData data_ = this.data_;
        StickyResponseData data_2 = stickyResponseData;
        if (data_ != null) {
            data_2 = stickyResponseData;
            if (data_ != StickyResponseData.getDefaultInstance()) {
                final StickyResponseData.SubredditsMsg$StickyResponse$StickyResponseData$a builder = StickyResponseData.newBuilder(this.data_);
                ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)stickyResponseData);
                data_2 = (StickyResponseData)((GeneratedMessageLite$b)builder).c();
            }
        }
        this.data_ = data_2;
    }
    
    private void mergeKind(final StringValue stringValue) {
        stringValue.getClass();
        final StringValue kind_ = this.kind_;
        StringValue kind_2 = stringValue;
        if (kind_ != null) {
            kind_2 = stringValue;
            if (kind_ != StringValue.getDefaultInstance()) {
                kind_2 = (StringValue)w.e(this.kind_, stringValue);
            }
        }
        this.kind_ = kind_2;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$StickyResponse subredditsMsg$StickyResponse) {
        return (a)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$StickyResponse);
    }
    
    public static SubredditsMsg$StickyResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$StickyResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$StickyResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$StickyResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$StickyResponse> parser() {
        return (n1<SubredditsMsg$StickyResponse>)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final StickyResponseData data_) {
        data_.getClass();
        this.data_ = data_;
    }
    
    private void setKind(final StringValue kind_) {
        kind_.getClass();
        this.kind_ = kind_;
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
                final n1<SubredditsMsg$StickyResponse> parser;
                if ((parser = SubredditsMsg$StickyResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$StickyResponse.class) {
                        if (SubredditsMsg$StickyResponse.PARSER == null) {
                            SubredditsMsg$StickyResponse.PARSER = (n1<SubredditsMsg$StickyResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$StickyResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$StickyResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$StickyResponse();
            }
        }
    }
    
    public StickyResponseData getData() {
        StickyResponseData stickyResponseData;
        if ((stickyResponseData = this.data_) == null) {
            stickyResponseData = StickyResponseData.getDefaultInstance();
        }
        return stickyResponseData;
    }
    
    public StringValue getKind() {
        StringValue stringValue;
        if ((stringValue = this.kind_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public boolean hasData() {
        return this.data_ != null;
    }
    
    public boolean hasKind() {
        return this.kind_ != null;
    }
    
    public static final class StickyResponseData extends GeneratedMessageLite<StickyResponseData, StickyResponseData.SubredditsMsg$StickyResponse$StickyResponseData$a> implements d1
    {
        public static final int AFTER_FIELD_NUMBER = 1;
        public static final int BEFORE_FIELD_NUMBER = 2;
        public static final int CHILDREN_FIELD_NUMBER = 6;
        private static final StickyResponseData DEFAULT_INSTANCE;
        public static final int DIST_FIELD_NUMBER = 3;
        public static final int GEO_FILTER_FIELD_NUMBER = 5;
        public static final int MODHASH_FIELD_NUMBER = 4;
        private static volatile n1<StickyResponseData> PARSER;
        private StringValue after_;
        private StringValue before_;
        private Internal$j<WrappedStickyListing> children_;
        private Int32Value dist_;
        private StringValue geoFilter_;
        private StringValue modhash_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)StickyResponseData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new StickyResponseData()));
        }
        
        private StickyResponseData() {
            this.children_ = (Internal$j<WrappedStickyListing>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static StickyResponseData access$183800() {
            return StickyResponseData.DEFAULT_INSTANCE;
        }
        
        public static void access$183900(final StickyResponseData stickyResponseData, final StringValue after) {
            stickyResponseData.setAfter(after);
        }
        
        public static void access$184000(final StickyResponseData stickyResponseData, final StringValue stringValue) {
            stickyResponseData.mergeAfter(stringValue);
        }
        
        public static void access$184100(final StickyResponseData stickyResponseData) {
            stickyResponseData.clearAfter();
        }
        
        public static void access$184200(final StickyResponseData stickyResponseData, final StringValue before) {
            stickyResponseData.setBefore(before);
        }
        
        public static void access$184300(final StickyResponseData stickyResponseData, final StringValue stringValue) {
            stickyResponseData.mergeBefore(stringValue);
        }
        
        public static void access$184400(final StickyResponseData stickyResponseData) {
            stickyResponseData.clearBefore();
        }
        
        public static void access$184500(final StickyResponseData stickyResponseData, final Int32Value dist) {
            stickyResponseData.setDist(dist);
        }
        
        public static void access$184600(final StickyResponseData stickyResponseData, final Int32Value int32Value) {
            stickyResponseData.mergeDist(int32Value);
        }
        
        public static void access$184700(final StickyResponseData stickyResponseData) {
            stickyResponseData.clearDist();
        }
        
        public static void access$184800(final StickyResponseData stickyResponseData, final StringValue modhash) {
            stickyResponseData.setModhash(modhash);
        }
        
        public static void access$184900(final StickyResponseData stickyResponseData, final StringValue stringValue) {
            stickyResponseData.mergeModhash(stringValue);
        }
        
        public static void access$185000(final StickyResponseData stickyResponseData) {
            stickyResponseData.clearModhash();
        }
        
        public static void access$185100(final StickyResponseData stickyResponseData, final StringValue geoFilter) {
            stickyResponseData.setGeoFilter(geoFilter);
        }
        
        public static void access$185200(final StickyResponseData stickyResponseData, final StringValue stringValue) {
            stickyResponseData.mergeGeoFilter(stringValue);
        }
        
        public static void access$185300(final StickyResponseData stickyResponseData) {
            stickyResponseData.clearGeoFilter();
        }
        
        public static void access$185400(final StickyResponseData stickyResponseData, final int n, final WrappedStickyListing wrappedStickyListing) {
            stickyResponseData.setChildren(n, wrappedStickyListing);
        }
        
        public static void access$185500(final StickyResponseData stickyResponseData, final WrappedStickyListing wrappedStickyListing) {
            stickyResponseData.addChildren(wrappedStickyListing);
        }
        
        public static void access$185600(final StickyResponseData stickyResponseData, final int n, final WrappedStickyListing wrappedStickyListing) {
            stickyResponseData.addChildren(n, wrappedStickyListing);
        }
        
        public static void access$185700(final StickyResponseData stickyResponseData, final Iterable iterable) {
            stickyResponseData.addAllChildren(iterable);
        }
        
        public static void access$185800(final StickyResponseData stickyResponseData) {
            stickyResponseData.clearChildren();
        }
        
        public static void access$185900(final StickyResponseData stickyResponseData, final int n) {
            stickyResponseData.removeChildren(n);
        }
        
        private void addAllChildren(final Iterable<? extends WrappedStickyListing> iterable) {
            this.ensureChildrenIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.children_);
        }
        
        private void addChildren(final int n, final WrappedStickyListing wrappedStickyListing) {
            wrappedStickyListing.getClass();
            this.ensureChildrenIsMutable();
            ((List<WrappedStickyListing>)this.children_).add(n, wrappedStickyListing);
        }
        
        private void addChildren(final WrappedStickyListing wrappedStickyListing) {
            wrappedStickyListing.getClass();
            this.ensureChildrenIsMutable();
            ((List<WrappedStickyListing>)this.children_).add(wrappedStickyListing);
        }
        
        private void clearAfter() {
            this.after_ = null;
        }
        
        private void clearBefore() {
            this.before_ = null;
        }
        
        private void clearChildren() {
            this.children_ = (Internal$j<WrappedStickyListing>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearDist() {
            this.dist_ = null;
        }
        
        private void clearGeoFilter() {
            this.geoFilter_ = null;
        }
        
        private void clearModhash() {
            this.modhash_ = null;
        }
        
        private void ensureChildrenIsMutable() {
            final Internal$j<WrappedStickyListing> children_ = this.children_;
            if (!children_.E0()) {
                this.children_ = (Internal$j<WrappedStickyListing>)GeneratedMessageLite.mutableCopy((Internal$j)children_);
            }
        }
        
        public static StickyResponseData getDefaultInstance() {
            return StickyResponseData.DEFAULT_INSTANCE;
        }
        
        private void mergeAfter(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue after_ = this.after_;
            StringValue after_2 = stringValue;
            if (after_ != null) {
                after_2 = stringValue;
                if (after_ != StringValue.getDefaultInstance()) {
                    after_2 = (StringValue)w.e(this.after_, stringValue);
                }
            }
            this.after_ = after_2;
        }
        
        private void mergeBefore(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue before_ = this.before_;
            StringValue before_2 = stringValue;
            if (before_ != null) {
                before_2 = stringValue;
                if (before_ != StringValue.getDefaultInstance()) {
                    before_2 = (StringValue)w.e(this.before_, stringValue);
                }
            }
            this.before_ = before_2;
        }
        
        private void mergeDist(final Int32Value int32Value) {
            int32Value.getClass();
            final Int32Value dist_ = this.dist_;
            Int32Value dist_2 = int32Value;
            if (dist_ != null) {
                dist_2 = int32Value;
                if (dist_ != Int32Value.getDefaultInstance()) {
                    dist_2 = (Int32Value)b.d(this.dist_, int32Value);
                }
            }
            this.dist_ = dist_2;
        }
        
        private void mergeGeoFilter(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue geoFilter_ = this.geoFilter_;
            StringValue geoFilter_2 = stringValue;
            if (geoFilter_ != null) {
                geoFilter_2 = stringValue;
                if (geoFilter_ != StringValue.getDefaultInstance()) {
                    geoFilter_2 = (StringValue)w.e(this.geoFilter_, stringValue);
                }
            }
            this.geoFilter_ = geoFilter_2;
        }
        
        private void mergeModhash(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue modhash_ = this.modhash_;
            StringValue modhash_2 = stringValue;
            if (modhash_ != null) {
                modhash_2 = stringValue;
                if (modhash_ != StringValue.getDefaultInstance()) {
                    modhash_2 = (StringValue)w.e(this.modhash_, stringValue);
                }
            }
            this.modhash_ = modhash_2;
        }
        
        public static StickyResponseData.SubredditsMsg$StickyResponse$StickyResponseData$a newBuilder() {
            return (StickyResponseData.SubredditsMsg$StickyResponse$StickyResponseData$a)StickyResponseData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static StickyResponseData.SubredditsMsg$StickyResponse$StickyResponseData$a newBuilder(final StickyResponseData stickyResponseData) {
            return (StickyResponseData.SubredditsMsg$StickyResponse$StickyResponseData$a)StickyResponseData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)stickyResponseData);
        }
        
        public static StickyResponseData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (StickyResponseData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static StickyResponseData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (StickyResponseData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static StickyResponseData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, byteString);
        }
        
        public static StickyResponseData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static StickyResponseData parseFrom(final l l) throws IOException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, l);
        }
        
        public static StickyResponseData parseFrom(final l l, final d0 d0) throws IOException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static StickyResponseData parseFrom(final InputStream inputStream) throws IOException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static StickyResponseData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static StickyResponseData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static StickyResponseData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static StickyResponseData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, array);
        }
        
        public static StickyResponseData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (StickyResponseData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<StickyResponseData> parser() {
            return (n1<StickyResponseData>)StickyResponseData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeChildren(final int n) {
            this.ensureChildrenIsMutable();
            this.children_.remove(n);
        }
        
        private void setAfter(final StringValue after_) {
            after_.getClass();
            this.after_ = after_;
        }
        
        private void setBefore(final StringValue before_) {
            before_.getClass();
            this.before_ = before_;
        }
        
        private void setChildren(final int n, final WrappedStickyListing wrappedStickyListing) {
            wrappedStickyListing.getClass();
            this.ensureChildrenIsMutable();
            ((List<WrappedStickyListing>)this.children_).set(n, wrappedStickyListing);
        }
        
        private void setDist(final Int32Value dist_) {
            dist_.getClass();
            this.dist_ = dist_;
        }
        
        private void setGeoFilter(final StringValue geoFilter_) {
            geoFilter_.getClass();
            this.geoFilter_ = geoFilter_;
        }
        
        private void setModhash(final StringValue modhash_) {
            modhash_.getClass();
            this.modhash_ = modhash_;
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
                    final n1<StickyResponseData> parser;
                    if ((parser = StickyResponseData.PARSER) == null) {
                        synchronized (StickyResponseData.class) {
                            if (StickyResponseData.PARSER == null) {
                                StickyResponseData.PARSER = (n1<StickyResponseData>)new GeneratedMessageLite$c((GeneratedMessageLite)StickyResponseData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return StickyResponseData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)StickyResponseData.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\u001b", new Object[] { "after_", "before_", "dist_", "modhash_", "geoFilter_", "children_", WrappedStickyListing.class });
                }
                case 2: {
                    return new StickyResponseData.SubredditsMsg$StickyResponse$StickyResponseData$a();
                }
                case 1: {
                    return new StickyResponseData();
                }
            }
        }
        
        public StringValue getAfter() {
            StringValue stringValue;
            if ((stringValue = this.after_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getBefore() {
            StringValue stringValue;
            if ((stringValue = this.before_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public WrappedStickyListing getChildren(final int n) {
            return ((List<WrappedStickyListing>)this.children_).get(n);
        }
        
        public int getChildrenCount() {
            return ((List)this.children_).size();
        }
        
        public List<WrappedStickyListing> getChildrenList() {
            return (List<WrappedStickyListing>)this.children_;
        }
        
        public SubredditsMsg$StickyResponse$b getChildrenOrBuilder(final int n) {
            return ((List<SubredditsMsg$StickyResponse$b>)this.children_).get(n);
        }
        
        public List<? extends SubredditsMsg$StickyResponse$b> getChildrenOrBuilderList() {
            return (List<? extends SubredditsMsg$StickyResponse$b>)this.children_;
        }
        
        public Int32Value getDist() {
            Int32Value int32Value;
            if ((int32Value = this.dist_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public StringValue getGeoFilter() {
            StringValue stringValue;
            if ((stringValue = this.geoFilter_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getModhash() {
            StringValue stringValue;
            if ((stringValue = this.modhash_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasAfter() {
            return this.after_ != null;
        }
        
        public boolean hasBefore() {
            return this.before_ != null;
        }
        
        public boolean hasDist() {
            return this.dist_ != null;
        }
        
        public boolean hasGeoFilter() {
            return this.geoFilter_ != null;
        }
        
        public boolean hasModhash() {
            return this.modhash_ != null;
        }
    }
    
    public static final class WrappedStickyListing extends GeneratedMessageLite<WrappedStickyListing, a> implements SubredditsMsg$StickyResponse$b
    {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final WrappedStickyListing DEFAULT_INSTANCE;
        public static final int KIND_FIELD_NUMBER = 1;
        private static volatile n1<WrappedStickyListing> PARSER;
        private SubredditsMsg$StickyResponse$LinkData data_;
        private StringValue kind_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)WrappedStickyListing.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new WrappedStickyListing()));
        }
        
        private WrappedStickyListing() {
        }
        
        public static WrappedStickyListing access$183000() {
            return WrappedStickyListing.DEFAULT_INSTANCE;
        }
        
        public static void access$183100(final WrappedStickyListing wrappedStickyListing, final StringValue kind) {
            wrappedStickyListing.setKind(kind);
        }
        
        public static void access$183200(final WrappedStickyListing wrappedStickyListing, final StringValue stringValue) {
            wrappedStickyListing.mergeKind(stringValue);
        }
        
        public static void access$183300(final WrappedStickyListing wrappedStickyListing) {
            wrappedStickyListing.clearKind();
        }
        
        public static void access$183400(final WrappedStickyListing wrappedStickyListing, final SubredditsMsg$StickyResponse$LinkData data) {
            wrappedStickyListing.setData(data);
        }
        
        public static void access$183500(final WrappedStickyListing wrappedStickyListing, final SubredditsMsg$StickyResponse$LinkData subredditsMsg$StickyResponse$LinkData) {
            wrappedStickyListing.mergeData(subredditsMsg$StickyResponse$LinkData);
        }
        
        public static void access$183600(final WrappedStickyListing wrappedStickyListing) {
            wrappedStickyListing.clearData();
        }
        
        private void clearData() {
            this.data_ = null;
        }
        
        private void clearKind() {
            this.kind_ = null;
        }
        
        public static WrappedStickyListing getDefaultInstance() {
            return WrappedStickyListing.DEFAULT_INSTANCE;
        }
        
        private void mergeData(final SubredditsMsg$StickyResponse$LinkData subredditsMsg$StickyResponse$LinkData) {
            subredditsMsg$StickyResponse$LinkData.getClass();
            final SubredditsMsg$StickyResponse$LinkData data_ = this.data_;
            SubredditsMsg$StickyResponse$LinkData data_2 = subredditsMsg$StickyResponse$LinkData;
            if (data_ != null) {
                data_2 = subredditsMsg$StickyResponse$LinkData;
                if (data_ != SubredditsMsg$StickyResponse$LinkData.getDefaultInstance()) {
                    final SubredditsMsg$StickyResponse$LinkData$a builder = SubredditsMsg$StickyResponse$LinkData.newBuilder(this.data_);
                    ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)subredditsMsg$StickyResponse$LinkData);
                    data_2 = (SubredditsMsg$StickyResponse$LinkData)((GeneratedMessageLite$b)builder).c();
                }
            }
            this.data_ = data_2;
        }
        
        private void mergeKind(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue kind_ = this.kind_;
            StringValue kind_2 = stringValue;
            if (kind_ != null) {
                kind_2 = stringValue;
                if (kind_ != StringValue.getDefaultInstance()) {
                    kind_2 = (StringValue)w.e(this.kind_, stringValue);
                }
            }
            this.kind_ = kind_2;
        }
        
        public static a newBuilder() {
            return (a)WrappedStickyListing.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final WrappedStickyListing wrappedStickyListing) {
            return (a)WrappedStickyListing.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)wrappedStickyListing);
        }
        
        public static WrappedStickyListing parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (WrappedStickyListing)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedStickyListing parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedStickyListing)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedStickyListing parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, byteString);
        }
        
        public static WrappedStickyListing parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static WrappedStickyListing parseFrom(final l l) throws IOException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, l);
        }
        
        public static WrappedStickyListing parseFrom(final l l, final d0 d0) throws IOException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, l, d0);
        }
        
        public static WrappedStickyListing parseFrom(final InputStream inputStream) throws IOException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedStickyListing parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedStickyListing parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static WrappedStickyListing parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static WrappedStickyListing parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, array);
        }
        
        public static WrappedStickyListing parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedStickyListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<WrappedStickyListing> parser() {
            return (n1<WrappedStickyListing>)WrappedStickyListing.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setData(final SubredditsMsg$StickyResponse$LinkData data_) {
            data_.getClass();
            this.data_ = data_;
        }
        
        private void setKind(final StringValue kind_) {
            kind_.getClass();
            this.kind_ = kind_;
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
                    final n1<WrappedStickyListing> parser;
                    if ((parser = WrappedStickyListing.PARSER) == null) {
                        synchronized (WrappedStickyListing.class) {
                            if (WrappedStickyListing.PARSER == null) {
                                WrappedStickyListing.PARSER = (n1<WrappedStickyListing>)new GeneratedMessageLite$c((GeneratedMessageLite)WrappedStickyListing.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return WrappedStickyListing.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)WrappedStickyListing.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new WrappedStickyListing();
                }
            }
        }
        
        public SubredditsMsg$StickyResponse$LinkData getData() {
            SubredditsMsg$StickyResponse$LinkData subredditsMsg$StickyResponse$LinkData;
            if ((subredditsMsg$StickyResponse$LinkData = this.data_) == null) {
                subredditsMsg$StickyResponse$LinkData = SubredditsMsg$StickyResponse$LinkData.getDefaultInstance();
            }
            return subredditsMsg$StickyResponse$LinkData;
        }
        
        public StringValue getKind() {
            StringValue stringValue;
            if ((stringValue = this.kind_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasData() {
            return this.data_ != null;
        }
        
        public boolean hasKind() {
            return this.kind_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<WrappedStickyListing, a> implements SubredditsMsg$StickyResponse$b
        {
            public a() {
                super((GeneratedMessageLite)WrappedStickyListing.access$183000());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$StickyResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$StickyResponse.access$186100());
        }
    }
}
