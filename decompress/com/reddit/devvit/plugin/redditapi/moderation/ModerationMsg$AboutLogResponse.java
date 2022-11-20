// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.moderation;

import p1.h;
import com.google.protobuf.Int64Value;
import com.google.protobuf.GeneratedMessageLite$b;
import t5.w;
import java.util.List;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal$j;
import com.google.protobuf.StringValue;
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

public final class ModerationMsg$AboutLogResponse extends GeneratedMessageLite<ModerationMsg$AboutLogResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final ModerationMsg$AboutLogResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<ModerationMsg$AboutLogResponse> PARSER;
    private AboutLogListing data_;
    private String kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ModerationMsg$AboutLogResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ModerationMsg$AboutLogResponse()));
    }
    
    private ModerationMsg$AboutLogResponse() {
        this.kind_ = "";
    }
    
    public static ModerationMsg$AboutLogResponse access$16500() {
        return ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$16600(final ModerationMsg$AboutLogResponse moderationMsg$AboutLogResponse, final String kind) {
        moderationMsg$AboutLogResponse.setKind(kind);
    }
    
    public static void access$16700(final ModerationMsg$AboutLogResponse moderationMsg$AboutLogResponse) {
        moderationMsg$AboutLogResponse.clearKind();
    }
    
    public static void access$16800(final ModerationMsg$AboutLogResponse moderationMsg$AboutLogResponse, final ByteString kindBytes) {
        moderationMsg$AboutLogResponse.setKindBytes(kindBytes);
    }
    
    public static void access$16900(final ModerationMsg$AboutLogResponse moderationMsg$AboutLogResponse, final AboutLogListing data) {
        moderationMsg$AboutLogResponse.setData(data);
    }
    
    public static void access$17000(final ModerationMsg$AboutLogResponse moderationMsg$AboutLogResponse, final AboutLogListing aboutLogListing) {
        moderationMsg$AboutLogResponse.mergeData(aboutLogListing);
    }
    
    public static void access$17100(final ModerationMsg$AboutLogResponse moderationMsg$AboutLogResponse) {
        moderationMsg$AboutLogResponse.clearData();
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }
    
    public static ModerationMsg$AboutLogResponse getDefaultInstance() {
        return ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final AboutLogListing data_) {
        data_.getClass();
        final AboutLogListing data_2 = this.data_;
        if (data_2 != null && data_2 != AboutLogListing.getDefaultInstance()) {
            final AboutLogListing.a builder = AboutLogListing.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (AboutLogListing)builder.c();
        }
        else {
            this.data_ = data_;
        }
    }
    
    public static a newBuilder() {
        return (a)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ModerationMsg$AboutLogResponse moderationMsg$AboutLogResponse) {
        return (a)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)moderationMsg$AboutLogResponse);
    }
    
    public static ModerationMsg$AboutLogResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AboutLogResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final l l) throws IOException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, l);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final InputStream inputStream) throws IOException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, array);
    }
    
    public static ModerationMsg$AboutLogResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ModerationMsg$AboutLogResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ModerationMsg$AboutLogResponse> parser() {
        return (n1<ModerationMsg$AboutLogResponse>)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final AboutLogListing data_) {
        data_.getClass();
        this.data_ = data_;
    }
    
    private void setKind(final String kind_) {
        kind_.getClass();
        this.kind_ = kind_;
    }
    
    private void setKindBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.kind_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (d90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ModerationMsg$AboutLogResponse> parser;
                if ((parser = ModerationMsg$AboutLogResponse.PARSER) == null) {
                    synchronized (ModerationMsg$AboutLogResponse.class) {
                        if (ModerationMsg$AboutLogResponse.PARSER == null) {
                            ModerationMsg$AboutLogResponse.PARSER = (n1<ModerationMsg$AboutLogResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ModerationMsg$AboutLogResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ModerationMsg$AboutLogResponse();
            }
        }
    }
    
    public AboutLogListing getData() {
        AboutLogListing aboutLogListing;
        if ((aboutLogListing = this.data_) == null) {
            aboutLogListing = AboutLogListing.getDefaultInstance();
        }
        return aboutLogListing;
    }
    
    public String getKind() {
        return this.kind_;
    }
    
    public ByteString getKindBytes() {
        return ByteString.copyFromUtf8(this.kind_);
    }
    
    public boolean hasData() {
        return this.data_ != null;
    }
    
    public static final class AboutLogListing extends GeneratedMessageLite<AboutLogListing, a> implements d1
    {
        public static final int AFTER_FIELD_NUMBER = 1;
        public static final int BEFORE_FIELD_NUMBER = 2;
        public static final int CHILDREN_FIELD_NUMBER = 3;
        private static final AboutLogListing DEFAULT_INSTANCE;
        public static final int DIST_FIELD_NUMBER = 4;
        private static volatile n1<AboutLogListing> PARSER;
        private StringValue after_;
        private StringValue before_;
        private Internal$j<WrappedLogObject> children_;
        private Int32Value dist_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)AboutLogListing.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new AboutLogListing()));
        }
        
        private AboutLogListing() {
            this.children_ = (Internal$j<WrappedLogObject>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static AboutLogListing access$14800() {
            return AboutLogListing.DEFAULT_INSTANCE;
        }
        
        public static void access$14900(final AboutLogListing aboutLogListing, final StringValue after) {
            aboutLogListing.setAfter(after);
        }
        
        public static void access$15000(final AboutLogListing aboutLogListing, final StringValue stringValue) {
            aboutLogListing.mergeAfter(stringValue);
        }
        
        public static void access$15100(final AboutLogListing aboutLogListing) {
            aboutLogListing.clearAfter();
        }
        
        public static void access$15200(final AboutLogListing aboutLogListing, final StringValue before) {
            aboutLogListing.setBefore(before);
        }
        
        public static void access$15300(final AboutLogListing aboutLogListing, final StringValue stringValue) {
            aboutLogListing.mergeBefore(stringValue);
        }
        
        public static void access$15400(final AboutLogListing aboutLogListing) {
            aboutLogListing.clearBefore();
        }
        
        public static void access$15500(final AboutLogListing aboutLogListing, final int n, final WrappedLogObject wrappedLogObject) {
            aboutLogListing.setChildren(n, wrappedLogObject);
        }
        
        public static void access$15600(final AboutLogListing aboutLogListing, final WrappedLogObject wrappedLogObject) {
            aboutLogListing.addChildren(wrappedLogObject);
        }
        
        public static void access$15700(final AboutLogListing aboutLogListing, final int n, final WrappedLogObject wrappedLogObject) {
            aboutLogListing.addChildren(n, wrappedLogObject);
        }
        
        public static void access$15800(final AboutLogListing aboutLogListing, final Iterable iterable) {
            aboutLogListing.addAllChildren(iterable);
        }
        
        public static void access$15900(final AboutLogListing aboutLogListing) {
            aboutLogListing.clearChildren();
        }
        
        public static void access$16000(final AboutLogListing aboutLogListing, final int n) {
            aboutLogListing.removeChildren(n);
        }
        
        public static void access$16100(final AboutLogListing aboutLogListing, final Int32Value dist) {
            aboutLogListing.setDist(dist);
        }
        
        public static void access$16200(final AboutLogListing aboutLogListing, final Int32Value int32Value) {
            aboutLogListing.mergeDist(int32Value);
        }
        
        public static void access$16300(final AboutLogListing aboutLogListing) {
            aboutLogListing.clearDist();
        }
        
        private void addAllChildren(final Iterable<? extends WrappedLogObject> iterable) {
            this.ensureChildrenIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.children_);
        }
        
        private void addChildren(final int n, final WrappedLogObject wrappedLogObject) {
            wrappedLogObject.getClass();
            this.ensureChildrenIsMutable();
            ((List<WrappedLogObject>)this.children_).add(n, wrappedLogObject);
        }
        
        private void addChildren(final WrappedLogObject wrappedLogObject) {
            wrappedLogObject.getClass();
            this.ensureChildrenIsMutable();
            ((List<WrappedLogObject>)this.children_).add(wrappedLogObject);
        }
        
        private void clearAfter() {
            this.after_ = null;
        }
        
        private void clearBefore() {
            this.before_ = null;
        }
        
        private void clearChildren() {
            this.children_ = (Internal$j<WrappedLogObject>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearDist() {
            this.dist_ = null;
        }
        
        private void ensureChildrenIsMutable() {
            final Internal$j<WrappedLogObject> children_ = this.children_;
            if (!children_.E0()) {
                this.children_ = (Internal$j<WrappedLogObject>)GeneratedMessageLite.mutableCopy((Internal$j)children_);
            }
        }
        
        public static AboutLogListing getDefaultInstance() {
            return AboutLogListing.DEFAULT_INSTANCE;
        }
        
        private void mergeAfter(final StringValue after_) {
            after_.getClass();
            final StringValue after_2 = this.after_;
            if (after_2 != null && after_2 != StringValue.getDefaultInstance()) {
                this.after_ = (StringValue)w.e(this.after_, after_);
            }
            else {
                this.after_ = after_;
            }
        }
        
        private void mergeBefore(final StringValue before_) {
            before_.getClass();
            final StringValue before_2 = this.before_;
            if (before_2 != null && before_2 != StringValue.getDefaultInstance()) {
                this.before_ = (StringValue)w.e(this.before_, before_);
            }
            else {
                this.before_ = before_;
            }
        }
        
        private void mergeDist(final Int32Value dist_) {
            dist_.getClass();
            final Int32Value dist_2 = this.dist_;
            if (dist_2 != null && dist_2 != Int32Value.getDefaultInstance()) {
                this.dist_ = (Int32Value)b.d(this.dist_, dist_);
            }
            else {
                this.dist_ = dist_;
            }
        }
        
        public static a newBuilder() {
            return (a)AboutLogListing.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final AboutLogListing aboutLogListing) {
            return (a)AboutLogListing.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)aboutLogListing);
        }
        
        public static AboutLogListing parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (AboutLogListing)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AboutLogListing parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AboutLogListing)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AboutLogListing parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, byteString);
        }
        
        public static AboutLogListing parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static AboutLogListing parseFrom(final l l) throws IOException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, l);
        }
        
        public static AboutLogListing parseFrom(final l l, final d0 d0) throws IOException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, l, d0);
        }
        
        public static AboutLogListing parseFrom(final InputStream inputStream) throws IOException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AboutLogListing parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AboutLogListing parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static AboutLogListing parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static AboutLogListing parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, array);
        }
        
        public static AboutLogListing parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (AboutLogListing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<AboutLogListing> parser() {
            return (n1<AboutLogListing>)AboutLogListing.DEFAULT_INSTANCE.getParserForType();
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
        
        private void setChildren(final int n, final WrappedLogObject wrappedLogObject) {
            wrappedLogObject.getClass();
            this.ensureChildrenIsMutable();
            ((List<WrappedLogObject>)this.children_).set(n, wrappedLogObject);
        }
        
        private void setDist(final Int32Value dist_) {
            dist_.getClass();
            this.dist_ = dist_;
        }
        
        public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
            switch (d90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                    final n1<AboutLogListing> parser;
                    if ((parser = AboutLogListing.PARSER) == null) {
                        synchronized (AboutLogListing.class) {
                            if (AboutLogListing.PARSER == null) {
                                AboutLogListing.PARSER = (n1<AboutLogListing>)new GeneratedMessageLite$c((GeneratedMessageLite)AboutLogListing.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return AboutLogListing.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)AboutLogListing.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b\u0004\t", new Object[] { "after_", "before_", "children_", WrappedLogObject.class, "dist_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new AboutLogListing();
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
        
        public WrappedLogObject getChildren(final int n) {
            return ((List<WrappedLogObject>)this.children_).get(n);
        }
        
        public int getChildrenCount() {
            return ((List)this.children_).size();
        }
        
        public List<WrappedLogObject> getChildrenList() {
            return (List<WrappedLogObject>)this.children_;
        }
        
        public ModerationMsg$AboutLogResponse$AboutLogListing$b getChildrenOrBuilder(final int n) {
            return ((List<ModerationMsg$AboutLogResponse$AboutLogListing$b>)this.children_).get(n);
        }
        
        public List<? extends ModerationMsg$AboutLogResponse$AboutLogListing$b> getChildrenOrBuilderList() {
            return (List<? extends ModerationMsg$AboutLogResponse$AboutLogListing$b>)this.children_;
        }
        
        public Int32Value getDist() {
            Int32Value int32Value;
            if ((int32Value = this.dist_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
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
        
        public static final class WrappedLogObject extends GeneratedMessageLite<WrappedLogObject, a> implements ModerationMsg$AboutLogResponse$AboutLogListing$b
        {
            public static final int DATA_FIELD_NUMBER = 2;
            private static final WrappedLogObject DEFAULT_INSTANCE;
            public static final int KIND_FIELD_NUMBER = 1;
            private static volatile n1<WrappedLogObject> PARSER;
            private LogObject data_;
            private String kind_;
            
            static {
                GeneratedMessageLite.registerDefaultInstance((Class)WrappedLogObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new WrappedLogObject()));
            }
            
            private WrappedLogObject() {
                this.kind_ = "";
            }
            
            public static WrappedLogObject access$14000() {
                return WrappedLogObject.DEFAULT_INSTANCE;
            }
            
            public static void access$14100(final WrappedLogObject wrappedLogObject, final String kind) {
                wrappedLogObject.setKind(kind);
            }
            
            public static void access$14200(final WrappedLogObject wrappedLogObject) {
                wrappedLogObject.clearKind();
            }
            
            public static void access$14300(final WrappedLogObject wrappedLogObject, final ByteString kindBytes) {
                wrappedLogObject.setKindBytes(kindBytes);
            }
            
            public static void access$14400(final WrappedLogObject wrappedLogObject, final LogObject data) {
                wrappedLogObject.setData(data);
            }
            
            public static void access$14500(final WrappedLogObject wrappedLogObject, final LogObject logObject) {
                wrappedLogObject.mergeData(logObject);
            }
            
            public static void access$14600(final WrappedLogObject wrappedLogObject) {
                wrappedLogObject.clearData();
            }
            
            private void clearData() {
                this.data_ = null;
            }
            
            private void clearKind() {
                this.kind_ = getDefaultInstance().getKind();
            }
            
            public static WrappedLogObject getDefaultInstance() {
                return WrappedLogObject.DEFAULT_INSTANCE;
            }
            
            private void mergeData(final LogObject data_) {
                data_.getClass();
                final LogObject data_2 = this.data_;
                if (data_2 != null && data_2 != LogObject.getDefaultInstance()) {
                    final LogObject.a builder = LogObject.newBuilder(this.data_);
                    builder.h((GeneratedMessageLite)data_);
                    this.data_ = (LogObject)builder.c();
                }
                else {
                    this.data_ = data_;
                }
            }
            
            public static a newBuilder() {
                return (a)WrappedLogObject.DEFAULT_INSTANCE.createBuilder();
            }
            
            public static a newBuilder(final WrappedLogObject wrappedLogObject) {
                return (a)WrappedLogObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)wrappedLogObject);
            }
            
            public static WrappedLogObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
                return (WrappedLogObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, inputStream);
            }
            
            public static WrappedLogObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (WrappedLogObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static WrappedLogObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, byteString);
            }
            
            public static WrappedLogObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, byteString, d0);
            }
            
            public static WrappedLogObject parseFrom(final l l) throws IOException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, l);
            }
            
            public static WrappedLogObject parseFrom(final l l, final d0 d0) throws IOException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, l, d0);
            }
            
            public static WrappedLogObject parseFrom(final InputStream inputStream) throws IOException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, inputStream);
            }
            
            public static WrappedLogObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static WrappedLogObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, byteBuffer);
            }
            
            public static WrappedLogObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, byteBuffer, d0);
            }
            
            public static WrappedLogObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, array);
            }
            
            public static WrappedLogObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
                return (WrappedLogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE, array, d0);
            }
            
            public static n1<WrappedLogObject> parser() {
                return (n1<WrappedLogObject>)WrappedLogObject.DEFAULT_INSTANCE.getParserForType();
            }
            
            private void setData(final LogObject data_) {
                data_.getClass();
                this.data_ = data_;
            }
            
            private void setKind(final String kind_) {
                kind_.getClass();
                this.kind_ = kind_;
            }
            
            private void setKindBytes(final ByteString byteString) {
                com.google.protobuf.a.checkByteStringIsUtf8(byteString);
                this.kind_ = byteString.toStringUtf8();
            }
            
            public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
                switch (d90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                        final n1<WrappedLogObject> parser;
                        if ((parser = WrappedLogObject.PARSER) == null) {
                            synchronized (WrappedLogObject.class) {
                                if (WrappedLogObject.PARSER == null) {
                                    WrappedLogObject.PARSER = (n1<WrappedLogObject>)new GeneratedMessageLite$c((GeneratedMessageLite)WrappedLogObject.DEFAULT_INSTANCE);
                                }
                            }
                        }
                        return parser;
                    }
                    case 4: {
                        return WrappedLogObject.DEFAULT_INSTANCE;
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo((c1)WrappedLogObject.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "kind_", "data_" });
                    }
                    case 2: {
                        return new a();
                    }
                    case 1: {
                        return new WrappedLogObject();
                    }
                }
            }
            
            public LogObject getData() {
                GeneratedMessageLite<LogObject, LogObject.a> generatedMessageLite;
                if ((generatedMessageLite = this.data_) == null) {
                    generatedMessageLite = LogObject.getDefaultInstance();
                }
                return (LogObject)generatedMessageLite;
            }
            
            public String getKind() {
                return this.kind_;
            }
            
            public ByteString getKindBytes() {
                return ByteString.copyFromUtf8(this.kind_);
            }
            
            public boolean hasData() {
                return this.data_ != null;
            }
            
            public static final class a extends GeneratedMessageLite$b<WrappedLogObject, a> implements ModerationMsg$AboutLogResponse$AboutLogListing$b
            {
                public a() {
                    super((GeneratedMessageLite)WrappedLogObject.access$14000());
                }
            }
        }
        
        public static final class a extends GeneratedMessageLite$b<AboutLogListing, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)AboutLogListing.access$14800());
            }
        }
    }
    
    public static final class LogObject extends GeneratedMessageLite<LogObject, a> implements d1
    {
        public static final int ACTION_FIELD_NUMBER = 10;
        public static final int CREATED_UTC_FIELD_NUMBER = 4;
        private static final LogObject DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        public static final int DETAILS_FIELD_NUMBER = 9;
        public static final int ID_FIELD_NUMBER = 14;
        public static final int MOD_FIELD_NUMBER = 15;
        public static final int MOD_ID36_FIELD_NUMBER = 3;
        private static volatile n1<LogObject> PARSER;
        public static final int SR_ID36_FIELD_NUMBER = 13;
        public static final int SUBREDDIT_FIELD_NUMBER = 5;
        public static final int SUBREDDIT_NAME_PREFIXED_FIELD_NUMBER = 8;
        public static final int TARGET_AUTHOR_FIELD_NUMBER = 11;
        public static final int TARGET_BODY_FIELD_NUMBER = 2;
        public static final int TARGET_FULLNAME_FIELD_NUMBER = 12;
        public static final int TARGET_PERMALINK_FIELD_NUMBER = 7;
        public static final int TARGET_TITLE_FIELD_NUMBER = 6;
        private StringValue action_;
        private Int64Value createdUtc_;
        private StringValue description_;
        private StringValue details_;
        private StringValue id_;
        private StringValue modId36_;
        private StringValue mod_;
        private StringValue srId36_;
        private StringValue subredditNamePrefixed_;
        private StringValue subreddit_;
        private StringValue targetAuthor_;
        private StringValue targetBody_;
        private StringValue targetFullname_;
        private StringValue targetPermalink_;
        private StringValue targetTitle_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)LogObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LogObject()));
        }
        
        private LogObject() {
        }
        
        public static void access$10000(final LogObject logObject, final StringValue modId36) {
            logObject.setModId36(modId36);
        }
        
        public static void access$10100(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeModId36(stringValue);
        }
        
        public static void access$10200(final LogObject logObject) {
            logObject.clearModId36();
        }
        
        public static void access$10300(final LogObject logObject, final Int64Value createdUtc) {
            logObject.setCreatedUtc(createdUtc);
        }
        
        public static void access$10400(final LogObject logObject, final Int64Value int64Value) {
            logObject.mergeCreatedUtc(int64Value);
        }
        
        public static void access$10500(final LogObject logObject) {
            logObject.clearCreatedUtc();
        }
        
        public static void access$10600(final LogObject logObject, final StringValue subreddit) {
            logObject.setSubreddit(subreddit);
        }
        
        public static void access$10700(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeSubreddit(stringValue);
        }
        
        public static void access$10800(final LogObject logObject) {
            logObject.clearSubreddit();
        }
        
        public static void access$10900(final LogObject logObject, final StringValue targetTitle) {
            logObject.setTargetTitle(targetTitle);
        }
        
        public static void access$11000(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeTargetTitle(stringValue);
        }
        
        public static void access$11100(final LogObject logObject) {
            logObject.clearTargetTitle();
        }
        
        public static void access$11200(final LogObject logObject, final StringValue targetPermalink) {
            logObject.setTargetPermalink(targetPermalink);
        }
        
        public static void access$11300(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeTargetPermalink(stringValue);
        }
        
        public static void access$11400(final LogObject logObject) {
            logObject.clearTargetPermalink();
        }
        
        public static void access$11500(final LogObject logObject, final StringValue subredditNamePrefixed) {
            logObject.setSubredditNamePrefixed(subredditNamePrefixed);
        }
        
        public static void access$11600(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeSubredditNamePrefixed(stringValue);
        }
        
        public static void access$11700(final LogObject logObject) {
            logObject.clearSubredditNamePrefixed();
        }
        
        public static void access$11800(final LogObject logObject, final StringValue details) {
            logObject.setDetails(details);
        }
        
        public static void access$11900(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeDetails(stringValue);
        }
        
        public static void access$12000(final LogObject logObject) {
            logObject.clearDetails();
        }
        
        public static void access$12100(final LogObject logObject, final StringValue action) {
            logObject.setAction(action);
        }
        
        public static void access$12200(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeAction(stringValue);
        }
        
        public static void access$12300(final LogObject logObject) {
            logObject.clearAction();
        }
        
        public static void access$12400(final LogObject logObject, final StringValue targetAuthor) {
            logObject.setTargetAuthor(targetAuthor);
        }
        
        public static void access$12500(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeTargetAuthor(stringValue);
        }
        
        public static void access$12600(final LogObject logObject) {
            logObject.clearTargetAuthor();
        }
        
        public static void access$12700(final LogObject logObject, final StringValue targetFullname) {
            logObject.setTargetFullname(targetFullname);
        }
        
        public static void access$12800(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeTargetFullname(stringValue);
        }
        
        public static void access$12900(final LogObject logObject) {
            logObject.clearTargetFullname();
        }
        
        public static void access$13000(final LogObject logObject, final StringValue srId36) {
            logObject.setSrId36(srId36);
        }
        
        public static void access$13100(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeSrId36(stringValue);
        }
        
        public static void access$13200(final LogObject logObject) {
            logObject.clearSrId36();
        }
        
        public static void access$13300(final LogObject logObject, final StringValue id) {
            logObject.setId(id);
        }
        
        public static void access$13400(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeId(stringValue);
        }
        
        public static void access$13500(final LogObject logObject) {
            logObject.clearId();
        }
        
        public static void access$13600(final LogObject logObject, final StringValue mod) {
            logObject.setMod(mod);
        }
        
        public static void access$13700(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeMod(stringValue);
        }
        
        public static void access$13800(final LogObject logObject) {
            logObject.clearMod();
        }
        
        public static LogObject access$9300() {
            return LogObject.DEFAULT_INSTANCE;
        }
        
        public static void access$9400(final LogObject logObject, final StringValue description) {
            logObject.setDescription(description);
        }
        
        public static void access$9500(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeDescription(stringValue);
        }
        
        public static void access$9600(final LogObject logObject) {
            logObject.clearDescription();
        }
        
        public static void access$9700(final LogObject logObject, final StringValue targetBody) {
            logObject.setTargetBody(targetBody);
        }
        
        public static void access$9800(final LogObject logObject, final StringValue stringValue) {
            logObject.mergeTargetBody(stringValue);
        }
        
        public static void access$9900(final LogObject logObject) {
            logObject.clearTargetBody();
        }
        
        private void clearAction() {
            this.action_ = null;
        }
        
        private void clearCreatedUtc() {
            this.createdUtc_ = null;
        }
        
        private void clearDescription() {
            this.description_ = null;
        }
        
        private void clearDetails() {
            this.details_ = null;
        }
        
        private void clearId() {
            this.id_ = null;
        }
        
        private void clearMod() {
            this.mod_ = null;
        }
        
        private void clearModId36() {
            this.modId36_ = null;
        }
        
        private void clearSrId36() {
            this.srId36_ = null;
        }
        
        private void clearSubreddit() {
            this.subreddit_ = null;
        }
        
        private void clearSubredditNamePrefixed() {
            this.subredditNamePrefixed_ = null;
        }
        
        private void clearTargetAuthor() {
            this.targetAuthor_ = null;
        }
        
        private void clearTargetBody() {
            this.targetBody_ = null;
        }
        
        private void clearTargetFullname() {
            this.targetFullname_ = null;
        }
        
        private void clearTargetPermalink() {
            this.targetPermalink_ = null;
        }
        
        private void clearTargetTitle() {
            this.targetTitle_ = null;
        }
        
        public static LogObject getDefaultInstance() {
            return LogObject.DEFAULT_INSTANCE;
        }
        
        private void mergeAction(final StringValue action_) {
            action_.getClass();
            final StringValue action_2 = this.action_;
            if (action_2 != null && action_2 != StringValue.getDefaultInstance()) {
                this.action_ = (StringValue)w.e(this.action_, action_);
            }
            else {
                this.action_ = action_;
            }
        }
        
        private void mergeCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            final Int64Value createdUtc_2 = this.createdUtc_;
            if (createdUtc_2 != null && createdUtc_2 != Int64Value.getDefaultInstance()) {
                this.createdUtc_ = (Int64Value)h.b(this.createdUtc_, createdUtc_);
            }
            else {
                this.createdUtc_ = createdUtc_;
            }
        }
        
        private void mergeDescription(final StringValue description_) {
            description_.getClass();
            final StringValue description_2 = this.description_;
            if (description_2 != null && description_2 != StringValue.getDefaultInstance()) {
                this.description_ = (StringValue)w.e(this.description_, description_);
            }
            else {
                this.description_ = description_;
            }
        }
        
        private void mergeDetails(final StringValue details_) {
            details_.getClass();
            final StringValue details_2 = this.details_;
            if (details_2 != null && details_2 != StringValue.getDefaultInstance()) {
                this.details_ = (StringValue)w.e(this.details_, details_);
            }
            else {
                this.details_ = details_;
            }
        }
        
        private void mergeId(final StringValue id_) {
            id_.getClass();
            final StringValue id_2 = this.id_;
            if (id_2 != null && id_2 != StringValue.getDefaultInstance()) {
                this.id_ = (StringValue)w.e(this.id_, id_);
            }
            else {
                this.id_ = id_;
            }
        }
        
        private void mergeMod(final StringValue mod_) {
            mod_.getClass();
            final StringValue mod_2 = this.mod_;
            if (mod_2 != null && mod_2 != StringValue.getDefaultInstance()) {
                this.mod_ = (StringValue)w.e(this.mod_, mod_);
            }
            else {
                this.mod_ = mod_;
            }
        }
        
        private void mergeModId36(final StringValue modId36_) {
            modId36_.getClass();
            final StringValue modId36_2 = this.modId36_;
            if (modId36_2 != null && modId36_2 != StringValue.getDefaultInstance()) {
                this.modId36_ = (StringValue)w.e(this.modId36_, modId36_);
            }
            else {
                this.modId36_ = modId36_;
            }
        }
        
        private void mergeSrId36(final StringValue srId36_) {
            srId36_.getClass();
            final StringValue srId36_2 = this.srId36_;
            if (srId36_2 != null && srId36_2 != StringValue.getDefaultInstance()) {
                this.srId36_ = (StringValue)w.e(this.srId36_, srId36_);
            }
            else {
                this.srId36_ = srId36_;
            }
        }
        
        private void mergeSubreddit(final StringValue subreddit_) {
            subreddit_.getClass();
            final StringValue subreddit_2 = this.subreddit_;
            if (subreddit_2 != null && subreddit_2 != StringValue.getDefaultInstance()) {
                this.subreddit_ = (StringValue)w.e(this.subreddit_, subreddit_);
            }
            else {
                this.subreddit_ = subreddit_;
            }
        }
        
        private void mergeSubredditNamePrefixed(final StringValue subredditNamePrefixed_) {
            subredditNamePrefixed_.getClass();
            final StringValue subredditNamePrefixed_2 = this.subredditNamePrefixed_;
            if (subredditNamePrefixed_2 != null && subredditNamePrefixed_2 != StringValue.getDefaultInstance()) {
                this.subredditNamePrefixed_ = (StringValue)w.e(this.subredditNamePrefixed_, subredditNamePrefixed_);
            }
            else {
                this.subredditNamePrefixed_ = subredditNamePrefixed_;
            }
        }
        
        private void mergeTargetAuthor(final StringValue targetAuthor_) {
            targetAuthor_.getClass();
            final StringValue targetAuthor_2 = this.targetAuthor_;
            if (targetAuthor_2 != null && targetAuthor_2 != StringValue.getDefaultInstance()) {
                this.targetAuthor_ = (StringValue)w.e(this.targetAuthor_, targetAuthor_);
            }
            else {
                this.targetAuthor_ = targetAuthor_;
            }
        }
        
        private void mergeTargetBody(final StringValue targetBody_) {
            targetBody_.getClass();
            final StringValue targetBody_2 = this.targetBody_;
            if (targetBody_2 != null && targetBody_2 != StringValue.getDefaultInstance()) {
                this.targetBody_ = (StringValue)w.e(this.targetBody_, targetBody_);
            }
            else {
                this.targetBody_ = targetBody_;
            }
        }
        
        private void mergeTargetFullname(final StringValue targetFullname_) {
            targetFullname_.getClass();
            final StringValue targetFullname_2 = this.targetFullname_;
            if (targetFullname_2 != null && targetFullname_2 != StringValue.getDefaultInstance()) {
                this.targetFullname_ = (StringValue)w.e(this.targetFullname_, targetFullname_);
            }
            else {
                this.targetFullname_ = targetFullname_;
            }
        }
        
        private void mergeTargetPermalink(final StringValue targetPermalink_) {
            targetPermalink_.getClass();
            final StringValue targetPermalink_2 = this.targetPermalink_;
            if (targetPermalink_2 != null && targetPermalink_2 != StringValue.getDefaultInstance()) {
                this.targetPermalink_ = (StringValue)w.e(this.targetPermalink_, targetPermalink_);
            }
            else {
                this.targetPermalink_ = targetPermalink_;
            }
        }
        
        private void mergeTargetTitle(final StringValue targetTitle_) {
            targetTitle_.getClass();
            final StringValue targetTitle_2 = this.targetTitle_;
            if (targetTitle_2 != null && targetTitle_2 != StringValue.getDefaultInstance()) {
                this.targetTitle_ = (StringValue)w.e(this.targetTitle_, targetTitle_);
            }
            else {
                this.targetTitle_ = targetTitle_;
            }
        }
        
        public static a newBuilder() {
            return (a)LogObject.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final LogObject logObject) {
            return (a)LogObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)logObject);
        }
        
        public static LogObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (LogObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, inputStream);
        }
        
        public static LogObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (LogObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static LogObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, byteString);
        }
        
        public static LogObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static LogObject parseFrom(final l l) throws IOException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, l);
        }
        
        public static LogObject parseFrom(final l l, final d0 d0) throws IOException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, l, d0);
        }
        
        public static LogObject parseFrom(final InputStream inputStream) throws IOException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, inputStream);
        }
        
        public static LogObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static LogObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static LogObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static LogObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, array);
        }
        
        public static LogObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (LogObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<LogObject> parser() {
            return (n1<LogObject>)LogObject.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setAction(final StringValue action_) {
            action_.getClass();
            this.action_ = action_;
        }
        
        private void setCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            this.createdUtc_ = createdUtc_;
        }
        
        private void setDescription(final StringValue description_) {
            description_.getClass();
            this.description_ = description_;
        }
        
        private void setDetails(final StringValue details_) {
            details_.getClass();
            this.details_ = details_;
        }
        
        private void setId(final StringValue id_) {
            id_.getClass();
            this.id_ = id_;
        }
        
        private void setMod(final StringValue mod_) {
            mod_.getClass();
            this.mod_ = mod_;
        }
        
        private void setModId36(final StringValue modId36_) {
            modId36_.getClass();
            this.modId36_ = modId36_;
        }
        
        private void setSrId36(final StringValue srId36_) {
            srId36_.getClass();
            this.srId36_ = srId36_;
        }
        
        private void setSubreddit(final StringValue subreddit_) {
            subreddit_.getClass();
            this.subreddit_ = subreddit_;
        }
        
        private void setSubredditNamePrefixed(final StringValue subredditNamePrefixed_) {
            subredditNamePrefixed_.getClass();
            this.subredditNamePrefixed_ = subredditNamePrefixed_;
        }
        
        private void setTargetAuthor(final StringValue targetAuthor_) {
            targetAuthor_.getClass();
            this.targetAuthor_ = targetAuthor_;
        }
        
        private void setTargetBody(final StringValue targetBody_) {
            targetBody_.getClass();
            this.targetBody_ = targetBody_;
        }
        
        private void setTargetFullname(final StringValue targetFullname_) {
            targetFullname_.getClass();
            this.targetFullname_ = targetFullname_;
        }
        
        private void setTargetPermalink(final StringValue targetPermalink_) {
            targetPermalink_.getClass();
            this.targetPermalink_ = targetPermalink_;
        }
        
        private void setTargetTitle(final StringValue targetTitle_) {
            targetTitle_.getClass();
            this.targetTitle_ = targetTitle_;
        }
        
        public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
            switch (d90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                    final n1<LogObject> parser;
                    if ((parser = LogObject.PARSER) == null) {
                        synchronized (LogObject.class) {
                            if (LogObject.PARSER == null) {
                                LogObject.PARSER = (n1<LogObject>)new GeneratedMessageLite$c((GeneratedMessageLite)LogObject.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return LogObject.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)LogObject.DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t", new Object[] { "description_", "targetBody_", "modId36_", "createdUtc_", "subreddit_", "targetTitle_", "targetPermalink_", "subredditNamePrefixed_", "details_", "action_", "targetAuthor_", "targetFullname_", "srId36_", "id_", "mod_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new LogObject();
                }
            }
        }
        
        public StringValue getAction() {
            StringValue stringValue;
            if ((stringValue = this.action_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int64Value getCreatedUtc() {
            Int64Value int64Value;
            if ((int64Value = this.createdUtc_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getDescription() {
            StringValue stringValue;
            if ((stringValue = this.description_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getDetails() {
            StringValue stringValue;
            if ((stringValue = this.details_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getId() {
            StringValue stringValue;
            if ((stringValue = this.id_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getMod() {
            StringValue stringValue;
            if ((stringValue = this.mod_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getModId36() {
            StringValue stringValue;
            if ((stringValue = this.modId36_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSrId36() {
            StringValue stringValue;
            if ((stringValue = this.srId36_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSubreddit() {
            StringValue stringValue;
            if ((stringValue = this.subreddit_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSubredditNamePrefixed() {
            StringValue stringValue;
            if ((stringValue = this.subredditNamePrefixed_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getTargetAuthor() {
            StringValue stringValue;
            if ((stringValue = this.targetAuthor_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getTargetBody() {
            StringValue stringValue;
            if ((stringValue = this.targetBody_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getTargetFullname() {
            StringValue stringValue;
            if ((stringValue = this.targetFullname_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getTargetPermalink() {
            StringValue stringValue;
            if ((stringValue = this.targetPermalink_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getTargetTitle() {
            StringValue stringValue;
            if ((stringValue = this.targetTitle_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasAction() {
            return this.action_ != null;
        }
        
        public boolean hasCreatedUtc() {
            return this.createdUtc_ != null;
        }
        
        public boolean hasDescription() {
            return this.description_ != null;
        }
        
        public boolean hasDetails() {
            return this.details_ != null;
        }
        
        public boolean hasId() {
            return this.id_ != null;
        }
        
        public boolean hasMod() {
            return this.mod_ != null;
        }
        
        public boolean hasModId36() {
            return this.modId36_ != null;
        }
        
        public boolean hasSrId36() {
            return this.srId36_ != null;
        }
        
        public boolean hasSubreddit() {
            return this.subreddit_ != null;
        }
        
        public boolean hasSubredditNamePrefixed() {
            return this.subredditNamePrefixed_ != null;
        }
        
        public boolean hasTargetAuthor() {
            return this.targetAuthor_ != null;
        }
        
        public boolean hasTargetBody() {
            return this.targetBody_ != null;
        }
        
        public boolean hasTargetFullname() {
            return this.targetFullname_ != null;
        }
        
        public boolean hasTargetPermalink() {
            return this.targetPermalink_ != null;
        }
        
        public boolean hasTargetTitle() {
            return this.targetTitle_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<LogObject, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)LogObject.access$9300());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<ModerationMsg$AboutLogResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ModerationMsg$AboutLogResponse.access$16500());
        }
    }
}
