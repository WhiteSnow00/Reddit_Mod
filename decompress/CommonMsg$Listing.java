// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.common;

import com.google.protobuf.GeneratedMessageLite$b;
import al0.b;
import al0.f0;
import java.util.List;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Internal$j;
import com.google.protobuf.StringValue;
import com.google.protobuf.d1;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.n1;
import com.google.protobuf.GeneratedMessageLite;

public final class CommonMsg$Listing extends GeneratedMessageLite<CommonMsg$Listing, a> implements com.reddit.devvit.plugin.redditapi.common.a
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final CommonMsg$Listing DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<CommonMsg$Listing> PARSER;
    private ListingData data_;
    private String kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)CommonMsg$Listing.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new CommonMsg$Listing()));
    }
    
    private CommonMsg$Listing() {
        this.kind_ = "";
    }
    
    public static /* synthetic */ CommonMsg$Listing access$1700() {
        return CommonMsg$Listing.DEFAULT_INSTANCE;
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }
    
    public static CommonMsg$Listing getDefaultInstance() {
        return CommonMsg$Listing.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final ListingData data_) {
        data_.getClass();
        final ListingData data_2 = this.data_;
        if (data_2 != null && data_2 != ListingData.getDefaultInstance()) {
            final ListingData.a builder = ListingData.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (ListingData)builder.d();
        }
        else {
            this.data_ = data_;
        }
    }
    
    public static a newBuilder() {
        return (a)CommonMsg$Listing.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final CommonMsg$Listing commonMsg$Listing) {
        return (a)CommonMsg$Listing.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commonMsg$Listing);
    }
    
    public static CommonMsg$Listing parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$Listing parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$Listing parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, byteString);
    }
    
    public static CommonMsg$Listing parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static CommonMsg$Listing parseFrom(final l l) throws IOException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, l);
    }
    
    public static CommonMsg$Listing parseFrom(final l l, final d0 d0) throws IOException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, l, d0);
    }
    
    public static CommonMsg$Listing parseFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$Listing parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$Listing parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static CommonMsg$Listing parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static CommonMsg$Listing parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, array);
    }
    
    public static CommonMsg$Listing parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$Listing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<CommonMsg$Listing> parser() {
        return (n1<CommonMsg$Listing>)CommonMsg$Listing.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final ListingData data_) {
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
        switch (z80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<CommonMsg$Listing> parser;
                if ((parser = CommonMsg$Listing.PARSER) == null) {
                    synchronized (CommonMsg$Listing.class) {
                        if (CommonMsg$Listing.PARSER == null) {
                            CommonMsg$Listing.PARSER = (n1<CommonMsg$Listing>)new GeneratedMessageLite$c((GeneratedMessageLite)CommonMsg$Listing.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return CommonMsg$Listing.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)CommonMsg$Listing.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new CommonMsg$Listing();
            }
        }
    }
    
    public ListingData getData() {
        ListingData listingData;
        if ((listingData = this.data_) == null) {
            listingData = ListingData.getDefaultInstance();
        }
        return listingData;
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
    
    public static final class ListingData extends GeneratedMessageLite<ListingData, a> implements d1
    {
        public static final int AFTER_FIELD_NUMBER = 1;
        public static final int BEFORE_FIELD_NUMBER = 2;
        public static final int CHILDREN_FIELD_NUMBER = 3;
        private static final ListingData DEFAULT_INSTANCE;
        public static final int DIST_FIELD_NUMBER = 4;
        private static volatile n1<ListingData> PARSER;
        private StringValue after_;
        private StringValue before_;
        private Internal$j<CommonMsg$WrappedRedditObject> children_;
        private Int64Value dist_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)ListingData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingData()));
        }
        
        private ListingData() {
            this.children_ = (Internal$j<CommonMsg$WrappedRedditObject>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static /* synthetic */ ListingData access$000() {
            return ListingData.DEFAULT_INSTANCE;
        }
        
        private void addAllChildren(final Iterable<? extends CommonMsg$WrappedRedditObject> iterable) {
            this.ensureChildrenIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.children_);
        }
        
        private void addChildren(final int n, final CommonMsg$WrappedRedditObject commonMsg$WrappedRedditObject) {
            commonMsg$WrappedRedditObject.getClass();
            this.ensureChildrenIsMutable();
            ((List<CommonMsg$WrappedRedditObject>)this.children_).add(n, commonMsg$WrappedRedditObject);
        }
        
        private void addChildren(final CommonMsg$WrappedRedditObject commonMsg$WrappedRedditObject) {
            commonMsg$WrappedRedditObject.getClass();
            this.ensureChildrenIsMutable();
            ((List<CommonMsg$WrappedRedditObject>)this.children_).add(commonMsg$WrappedRedditObject);
        }
        
        private void clearAfter() {
            this.after_ = null;
        }
        
        private void clearBefore() {
            this.before_ = null;
        }
        
        private void clearChildren() {
            this.children_ = (Internal$j<CommonMsg$WrappedRedditObject>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearDist() {
            this.dist_ = null;
        }
        
        private void ensureChildrenIsMutable() {
            final Internal$j<CommonMsg$WrappedRedditObject> children_ = this.children_;
            if (!children_.E0()) {
                this.children_ = (Internal$j<CommonMsg$WrappedRedditObject>)GeneratedMessageLite.mutableCopy((Internal$j)children_);
            }
        }
        
        public static ListingData getDefaultInstance() {
            return ListingData.DEFAULT_INSTANCE;
        }
        
        private void mergeAfter(final StringValue after_) {
            after_.getClass();
            final StringValue after_2 = this.after_;
            if (after_2 != null && after_2 != StringValue.getDefaultInstance()) {
                this.after_ = (StringValue)f0.e(this.after_, after_);
            }
            else {
                this.after_ = after_;
            }
        }
        
        private void mergeBefore(final StringValue before_) {
            before_.getClass();
            final StringValue before_2 = this.before_;
            if (before_2 != null && before_2 != StringValue.getDefaultInstance()) {
                this.before_ = (StringValue)f0.e(this.before_, before_);
            }
            else {
                this.before_ = before_;
            }
        }
        
        private void mergeDist(final Int64Value dist_) {
            dist_.getClass();
            final Int64Value dist_2 = this.dist_;
            if (dist_2 != null && dist_2 != Int64Value.getDefaultInstance()) {
                this.dist_ = (Int64Value)b.g(this.dist_, dist_);
            }
            else {
                this.dist_ = dist_;
            }
        }
        
        public static a newBuilder() {
            return (a)ListingData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final ListingData listingData) {
            return (a)ListingData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingData);
        }
        
        public static ListingData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (ListingData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static ListingData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (ListingData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static ListingData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, byteString);
        }
        
        public static ListingData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static ListingData parseFrom(final l l) throws IOException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, l);
        }
        
        public static ListingData parseFrom(final l l, final d0 d0) throws IOException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static ListingData parseFrom(final InputStream inputStream) throws IOException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static ListingData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static ListingData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static ListingData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static ListingData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, array);
        }
        
        public static ListingData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (ListingData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<ListingData> parser() {
            return (n1<ListingData>)ListingData.DEFAULT_INSTANCE.getParserForType();
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
        
        private void setChildren(final int n, final CommonMsg$WrappedRedditObject commonMsg$WrappedRedditObject) {
            commonMsg$WrappedRedditObject.getClass();
            this.ensureChildrenIsMutable();
            ((List<CommonMsg$WrappedRedditObject>)this.children_).set(n, commonMsg$WrappedRedditObject);
        }
        
        private void setDist(final Int64Value dist_) {
            dist_.getClass();
            this.dist_ = dist_;
        }
        
        public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
            switch (z80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                    final n1<ListingData> parser;
                    if ((parser = ListingData.PARSER) == null) {
                        synchronized (ListingData.class) {
                            if (ListingData.PARSER == null) {
                                ListingData.PARSER = (n1<ListingData>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return ListingData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)ListingData.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b\u0004\t", new Object[] { "after_", "before_", "children_", CommonMsg$WrappedRedditObject.class, "dist_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new ListingData();
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
        
        public CommonMsg$WrappedRedditObject getChildren(final int n) {
            return ((List<CommonMsg$WrappedRedditObject>)this.children_).get(n);
        }
        
        public int getChildrenCount() {
            return ((List)this.children_).size();
        }
        
        public List<CommonMsg$WrappedRedditObject> getChildrenList() {
            return (List<CommonMsg$WrappedRedditObject>)this.children_;
        }
        
        public z80.b getChildrenOrBuilder(final int n) {
            return ((List<z80.b>)this.children_).get(n);
        }
        
        public List<? extends z80.b> getChildrenOrBuilderList() {
            return (List<? extends z80.b>)this.children_;
        }
        
        public Int64Value getDist() {
            Int64Value int64Value;
            if ((int64Value = this.dist_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
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
        
        public static final class a extends GeneratedMessageLite$b<ListingData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)ListingData.access$000());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<CommonMsg$Listing, a> implements com.reddit.devvit.plugin.redditapi.common.a
    {
        public a() {
            super((GeneratedMessageLite)CommonMsg$Listing.access$1700());
        }
    }
}
