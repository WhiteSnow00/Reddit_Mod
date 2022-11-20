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

public final class SubredditsMsg$SubredditsSearchResponse extends GeneratedMessageLite<SubredditsMsg$SubredditsSearchResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SubredditsMsg$SubredditsSearchResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<SubredditsMsg$SubredditsSearchResponse> PARSER;
    private WrappedSubredditObject data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditsSearchResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditsSearchResponse()));
    }
    
    private SubredditsMsg$SubredditsSearchResponse() {
    }
    
    public static SubredditsMsg$SubredditsSearchResponse access$224000() {
        return SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$224100(final SubredditsMsg$SubredditsSearchResponse subredditsMsg$SubredditsSearchResponse, final StringValue kind) {
        subredditsMsg$SubredditsSearchResponse.setKind(kind);
    }
    
    public static void access$224200(final SubredditsMsg$SubredditsSearchResponse subredditsMsg$SubredditsSearchResponse, final StringValue stringValue) {
        subredditsMsg$SubredditsSearchResponse.mergeKind(stringValue);
    }
    
    public static void access$224300(final SubredditsMsg$SubredditsSearchResponse subredditsMsg$SubredditsSearchResponse) {
        subredditsMsg$SubredditsSearchResponse.clearKind();
    }
    
    public static void access$224400(final SubredditsMsg$SubredditsSearchResponse subredditsMsg$SubredditsSearchResponse, final WrappedSubredditObject data) {
        subredditsMsg$SubredditsSearchResponse.setData(data);
    }
    
    public static void access$224500(final SubredditsMsg$SubredditsSearchResponse subredditsMsg$SubredditsSearchResponse, final WrappedSubredditObject wrappedSubredditObject) {
        subredditsMsg$SubredditsSearchResponse.mergeData(wrappedSubredditObject);
    }
    
    public static void access$224600(final SubredditsMsg$SubredditsSearchResponse subredditsMsg$SubredditsSearchResponse) {
        subredditsMsg$SubredditsSearchResponse.clearData();
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static SubredditsMsg$SubredditsSearchResponse getDefaultInstance() {
        return SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final WrappedSubredditObject wrappedSubredditObject) {
        wrappedSubredditObject.getClass();
        final WrappedSubredditObject data_ = this.data_;
        WrappedSubredditObject data_2 = wrappedSubredditObject;
        if (data_ != null) {
            data_2 = wrappedSubredditObject;
            if (data_ != WrappedSubredditObject.getDefaultInstance()) {
                final WrappedSubredditObject.a builder = WrappedSubredditObject.newBuilder(this.data_);
                builder.h((GeneratedMessageLite)wrappedSubredditObject);
                data_2 = (WrappedSubredditObject)builder.c();
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
        return (a)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditsSearchResponse subredditsMsg$SubredditsSearchResponse) {
        return (a)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditsSearchResponse);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditsSearchResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditsSearchResponse> parser() {
        return (n1<SubredditsMsg$SubredditsSearchResponse>)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final WrappedSubredditObject data_) {
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
                final n1<SubredditsMsg$SubredditsSearchResponse> parser;
                if ((parser = SubredditsMsg$SubredditsSearchResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditsSearchResponse.class) {
                        if (SubredditsMsg$SubredditsSearchResponse.PARSER == null) {
                            SubredditsMsg$SubredditsSearchResponse.PARSER = (n1<SubredditsMsg$SubredditsSearchResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditsSearchResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditsSearchResponse();
            }
        }
    }
    
    public WrappedSubredditObject getData() {
        WrappedSubredditObject wrappedSubredditObject;
        if ((wrappedSubredditObject = this.data_) == null) {
            wrappedSubredditObject = WrappedSubredditObject.getDefaultInstance();
        }
        return wrappedSubredditObject;
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
    
    public static final class WrappedSubredditObject extends GeneratedMessageLite<WrappedSubredditObject, a> implements d1
    {
        public static final int AFTER_FIELD_NUMBER = 1;
        public static final int BEFORE_FIELD_NUMBER = 2;
        public static final int CHILDREN_FIELD_NUMBER = 5;
        private static final WrappedSubredditObject DEFAULT_INSTANCE;
        public static final int DIST_FIELD_NUMBER = 3;
        public static final int GEO_FILTER_FIELD_NUMBER = 4;
        private static volatile n1<WrappedSubredditObject> PARSER;
        private StringValue after_;
        private StringValue before_;
        private Internal$j<SubredditData> children_;
        private Int32Value dist_;
        private StringValue geoFilter_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)WrappedSubredditObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new WrappedSubredditObject()));
        }
        
        private WrappedSubredditObject() {
            this.children_ = (Internal$j<SubredditData>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static WrappedSubredditObject access$222000() {
            return WrappedSubredditObject.DEFAULT_INSTANCE;
        }
        
        public static void access$222100(final WrappedSubredditObject wrappedSubredditObject, final StringValue after) {
            wrappedSubredditObject.setAfter(after);
        }
        
        public static void access$222200(final WrappedSubredditObject wrappedSubredditObject, final StringValue stringValue) {
            wrappedSubredditObject.mergeAfter(stringValue);
        }
        
        public static void access$222300(final WrappedSubredditObject wrappedSubredditObject) {
            wrappedSubredditObject.clearAfter();
        }
        
        public static void access$222400(final WrappedSubredditObject wrappedSubredditObject, final StringValue before) {
            wrappedSubredditObject.setBefore(before);
        }
        
        public static void access$222500(final WrappedSubredditObject wrappedSubredditObject, final StringValue stringValue) {
            wrappedSubredditObject.mergeBefore(stringValue);
        }
        
        public static void access$222600(final WrappedSubredditObject wrappedSubredditObject) {
            wrappedSubredditObject.clearBefore();
        }
        
        public static void access$222700(final WrappedSubredditObject wrappedSubredditObject, final Int32Value dist) {
            wrappedSubredditObject.setDist(dist);
        }
        
        public static void access$222800(final WrappedSubredditObject wrappedSubredditObject, final Int32Value int32Value) {
            wrappedSubredditObject.mergeDist(int32Value);
        }
        
        public static void access$222900(final WrappedSubredditObject wrappedSubredditObject) {
            wrappedSubredditObject.clearDist();
        }
        
        public static void access$223000(final WrappedSubredditObject wrappedSubredditObject, final StringValue geoFilter) {
            wrappedSubredditObject.setGeoFilter(geoFilter);
        }
        
        public static void access$223100(final WrappedSubredditObject wrappedSubredditObject, final StringValue stringValue) {
            wrappedSubredditObject.mergeGeoFilter(stringValue);
        }
        
        public static void access$223200(final WrappedSubredditObject wrappedSubredditObject) {
            wrappedSubredditObject.clearGeoFilter();
        }
        
        public static void access$223300(final WrappedSubredditObject wrappedSubredditObject, final int n, final SubredditData subredditData) {
            wrappedSubredditObject.setChildren(n, subredditData);
        }
        
        public static void access$223400(final WrappedSubredditObject wrappedSubredditObject, final SubredditData subredditData) {
            wrappedSubredditObject.addChildren(subredditData);
        }
        
        public static void access$223500(final WrappedSubredditObject wrappedSubredditObject, final int n, final SubredditData subredditData) {
            wrappedSubredditObject.addChildren(n, subredditData);
        }
        
        public static void access$223600(final WrappedSubredditObject wrappedSubredditObject, final Iterable iterable) {
            wrappedSubredditObject.addAllChildren(iterable);
        }
        
        public static void access$223700(final WrappedSubredditObject wrappedSubredditObject) {
            wrappedSubredditObject.clearChildren();
        }
        
        public static void access$223800(final WrappedSubredditObject wrappedSubredditObject, final int n) {
            wrappedSubredditObject.removeChildren(n);
        }
        
        private void addAllChildren(final Iterable<? extends SubredditData> iterable) {
            this.ensureChildrenIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.children_);
        }
        
        private void addChildren(final int n, final SubredditData subredditData) {
            subredditData.getClass();
            this.ensureChildrenIsMutable();
            ((List<SubredditData>)this.children_).add(n, subredditData);
        }
        
        private void addChildren(final SubredditData subredditData) {
            subredditData.getClass();
            this.ensureChildrenIsMutable();
            ((List<SubredditData>)this.children_).add(subredditData);
        }
        
        private void clearAfter() {
            this.after_ = null;
        }
        
        private void clearBefore() {
            this.before_ = null;
        }
        
        private void clearChildren() {
            this.children_ = (Internal$j<SubredditData>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearDist() {
            this.dist_ = null;
        }
        
        private void clearGeoFilter() {
            this.geoFilter_ = null;
        }
        
        private void ensureChildrenIsMutable() {
            final Internal$j<SubredditData> children_ = this.children_;
            if (!children_.E0()) {
                this.children_ = (Internal$j<SubredditData>)GeneratedMessageLite.mutableCopy((Internal$j)children_);
            }
        }
        
        public static WrappedSubredditObject getDefaultInstance() {
            return WrappedSubredditObject.DEFAULT_INSTANCE;
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
        
        public static a newBuilder() {
            return (a)WrappedSubredditObject.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final WrappedSubredditObject wrappedSubredditObject) {
            return (a)WrappedSubredditObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)wrappedSubredditObject);
        }
        
        public static WrappedSubredditObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedSubredditObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedSubredditObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, byteString);
        }
        
        public static WrappedSubredditObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static WrappedSubredditObject parseFrom(final l l) throws IOException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, l);
        }
        
        public static WrappedSubredditObject parseFrom(final l l, final d0 d0) throws IOException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, l, d0);
        }
        
        public static WrappedSubredditObject parseFrom(final InputStream inputStream) throws IOException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedSubredditObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedSubredditObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static WrappedSubredditObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static WrappedSubredditObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, array);
        }
        
        public static WrappedSubredditObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedSubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<WrappedSubredditObject> parser() {
            return (n1<WrappedSubredditObject>)WrappedSubredditObject.DEFAULT_INSTANCE.getParserForType();
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
        
        private void setChildren(final int n, final SubredditData subredditData) {
            subredditData.getClass();
            this.ensureChildrenIsMutable();
            ((List<SubredditData>)this.children_).set(n, subredditData);
        }
        
        private void setDist(final Int32Value dist_) {
            dist_.getClass();
            this.dist_ = dist_;
        }
        
        private void setGeoFilter(final StringValue geoFilter_) {
            geoFilter_.getClass();
            this.geoFilter_ = geoFilter_;
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
                    final n1<WrappedSubredditObject> parser;
                    if ((parser = WrappedSubredditObject.PARSER) == null) {
                        synchronized (WrappedSubredditObject.class) {
                            if (WrappedSubredditObject.PARSER == null) {
                                WrappedSubredditObject.PARSER = (n1<WrappedSubredditObject>)new GeneratedMessageLite$c((GeneratedMessageLite)WrappedSubredditObject.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return WrappedSubredditObject.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)WrappedSubredditObject.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b", new Object[] { "after_", "before_", "dist_", "geoFilter_", "children_", SubredditData.class });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new WrappedSubredditObject();
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
        
        public SubredditData getChildren(final int n) {
            return ((List<SubredditData>)this.children_).get(n);
        }
        
        public int getChildrenCount() {
            return ((List)this.children_).size();
        }
        
        public List<SubredditData> getChildrenList() {
            return (List<SubredditData>)this.children_;
        }
        
        public SubredditsMsg$SubredditsSearchResponse$WrappedSubredditObject$b getChildrenOrBuilder(final int n) {
            return ((List<SubredditsMsg$SubredditsSearchResponse$WrappedSubredditObject$b>)this.children_).get(n);
        }
        
        public List<? extends SubredditsMsg$SubredditsSearchResponse$WrappedSubredditObject$b> getChildrenOrBuilderList() {
            return (List<? extends SubredditsMsg$SubredditsSearchResponse$WrappedSubredditObject$b>)this.children_;
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
        
        public static final class SubredditData extends GeneratedMessageLite<SubredditData, a> implements SubredditsMsg$SubredditsSearchResponse$WrappedSubredditObject$b
        {
            public static final int DATA_FIELD_NUMBER = 2;
            private static final SubredditData DEFAULT_INSTANCE;
            public static final int KIND_FIELD_NUMBER = 1;
            private static volatile n1<SubredditData> PARSER;
            private SubredditsMsg$FullSubredditObject data_;
            private StringValue kind_;
            
            static {
                GeneratedMessageLite.registerDefaultInstance((Class)SubredditData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditData()));
            }
            
            private SubredditData() {
            }
            
            public static SubredditData access$221200() {
                return SubredditData.DEFAULT_INSTANCE;
            }
            
            public static void access$221300(final SubredditData subredditData, final StringValue kind) {
                subredditData.setKind(kind);
            }
            
            public static void access$221400(final SubredditData subredditData, final StringValue stringValue) {
                subredditData.mergeKind(stringValue);
            }
            
            public static void access$221500(final SubredditData subredditData) {
                subredditData.clearKind();
            }
            
            public static void access$221600(final SubredditData subredditData, final SubredditsMsg$FullSubredditObject data) {
                subredditData.setData(data);
            }
            
            public static void access$221700(final SubredditData subredditData, final SubredditsMsg$FullSubredditObject subredditsMsg$FullSubredditObject) {
                subredditData.mergeData(subredditsMsg$FullSubredditObject);
            }
            
            public static void access$221800(final SubredditData subredditData) {
                subredditData.clearData();
            }
            
            private void clearData() {
                this.data_ = null;
            }
            
            private void clearKind() {
                this.kind_ = null;
            }
            
            public static SubredditData getDefaultInstance() {
                return SubredditData.DEFAULT_INSTANCE;
            }
            
            private void mergeData(final SubredditsMsg$FullSubredditObject subredditsMsg$FullSubredditObject) {
                subredditsMsg$FullSubredditObject.getClass();
                final SubredditsMsg$FullSubredditObject data_ = this.data_;
                SubredditsMsg$FullSubredditObject data_2 = subredditsMsg$FullSubredditObject;
                if (data_ != null) {
                    data_2 = subredditsMsg$FullSubredditObject;
                    if (data_ != SubredditsMsg$FullSubredditObject.getDefaultInstance()) {
                        final SubredditsMsg$FullSubredditObject$a builder = SubredditsMsg$FullSubredditObject.newBuilder(this.data_);
                        ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)subredditsMsg$FullSubredditObject);
                        data_2 = (SubredditsMsg$FullSubredditObject)((GeneratedMessageLite$b)builder).c();
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
                return (a)SubredditData.DEFAULT_INSTANCE.createBuilder();
            }
            
            public static a newBuilder(final SubredditData subredditData) {
                return (a)SubredditData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditData);
            }
            
            public static SubredditData parseDelimitedFrom(final InputStream inputStream) throws IOException {
                return (SubredditData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, inputStream);
            }
            
            public static SubredditData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (SubredditData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static SubredditData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, byteString);
            }
            
            public static SubredditData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, byteString, d0);
            }
            
            public static SubredditData parseFrom(final l l) throws IOException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, l);
            }
            
            public static SubredditData parseFrom(final l l, final d0 d0) throws IOException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, l, d0);
            }
            
            public static SubredditData parseFrom(final InputStream inputStream) throws IOException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, inputStream);
            }
            
            public static SubredditData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static SubredditData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, byteBuffer);
            }
            
            public static SubredditData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, byteBuffer, d0);
            }
            
            public static SubredditData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, array);
            }
            
            public static SubredditData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
                return (SubredditData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE, array, d0);
            }
            
            public static n1<SubredditData> parser() {
                return (n1<SubredditData>)SubredditData.DEFAULT_INSTANCE.getParserForType();
            }
            
            private void setData(final SubredditsMsg$FullSubredditObject data_) {
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
                        final n1<SubredditData> parser;
                        if ((parser = SubredditData.PARSER) == null) {
                            synchronized (SubredditData.class) {
                                if (SubredditData.PARSER == null) {
                                    SubredditData.PARSER = (n1<SubredditData>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditData.DEFAULT_INSTANCE);
                                }
                            }
                        }
                        return parser;
                    }
                    case 4: {
                        return SubredditData.DEFAULT_INSTANCE;
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo((c1)SubredditData.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
                    }
                    case 2: {
                        return new a();
                    }
                    case 1: {
                        return new SubredditData();
                    }
                }
            }
            
            public SubredditsMsg$FullSubredditObject getData() {
                SubredditsMsg$FullSubredditObject subredditsMsg$FullSubredditObject;
                if ((subredditsMsg$FullSubredditObject = this.data_) == null) {
                    subredditsMsg$FullSubredditObject = SubredditsMsg$FullSubredditObject.getDefaultInstance();
                }
                return subredditsMsg$FullSubredditObject;
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
            
            public static final class a extends GeneratedMessageLite$b<SubredditData, a> implements SubredditsMsg$SubredditsSearchResponse$WrappedSubredditObject$b
            {
                public a() {
                    super((GeneratedMessageLite)SubredditData.access$221200());
                }
            }
        }
        
        public static final class a extends GeneratedMessageLite$b<WrappedSubredditObject, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)WrappedSubredditObject.access$222000());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditsSearchResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditsSearchResponse.access$224000());
        }
    }
}
