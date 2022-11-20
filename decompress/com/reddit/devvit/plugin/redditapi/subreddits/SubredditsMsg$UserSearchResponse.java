// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.x1;
import com.google.protobuf.l0;
import u10.o;
import com.google.protobuf.Int32Value;
import com.google.protobuf.BoolValue;
import com.google.protobuf.GeneratedMessageLite$b;
import p1.h;
import java.util.List;
import com.google.protobuf.Int64Value;
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

public final class SubredditsMsg$UserSearchResponse extends GeneratedMessageLite<SubredditsMsg$UserSearchResponse, b> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SubredditsMsg$UserSearchResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<SubredditsMsg$UserSearchResponse> PARSER;
    private AccData data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$UserSearchResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$UserSearchResponse()));
    }
    
    private SubredditsMsg$UserSearchResponse() {
    }
    
    public static SubredditsMsg$UserSearchResponse access$249600() {
        return SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$249700(final SubredditsMsg$UserSearchResponse subredditsMsg$UserSearchResponse, final StringValue kind) {
        subredditsMsg$UserSearchResponse.setKind(kind);
    }
    
    public static void access$249800(final SubredditsMsg$UserSearchResponse subredditsMsg$UserSearchResponse, final StringValue stringValue) {
        subredditsMsg$UserSearchResponse.mergeKind(stringValue);
    }
    
    public static void access$249900(final SubredditsMsg$UserSearchResponse subredditsMsg$UserSearchResponse) {
        subredditsMsg$UserSearchResponse.clearKind();
    }
    
    public static void access$250000(final SubredditsMsg$UserSearchResponse subredditsMsg$UserSearchResponse, final AccData data) {
        subredditsMsg$UserSearchResponse.setData(data);
    }
    
    public static void access$250100(final SubredditsMsg$UserSearchResponse subredditsMsg$UserSearchResponse, final AccData accData) {
        subredditsMsg$UserSearchResponse.mergeData(accData);
    }
    
    public static void access$250200(final SubredditsMsg$UserSearchResponse subredditsMsg$UserSearchResponse) {
        subredditsMsg$UserSearchResponse.clearData();
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static SubredditsMsg$UserSearchResponse getDefaultInstance() {
        return SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final AccData accData) {
        accData.getClass();
        final AccData data_ = this.data_;
        AccData data_2 = accData;
        if (data_ != null) {
            data_2 = accData;
            if (data_ != AccData.getDefaultInstance()) {
                final AccData.a builder = AccData.newBuilder(this.data_);
                builder.h((GeneratedMessageLite)accData);
                data_2 = (AccData)builder.c();
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
    
    public static b newBuilder() {
        return (b)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static b newBuilder(final SubredditsMsg$UserSearchResponse subredditsMsg$UserSearchResponse) {
        return (b)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$UserSearchResponse);
    }
    
    public static SubredditsMsg$UserSearchResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UserSearchResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$UserSearchResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UserSearchResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$UserSearchResponse> parser() {
        return (n1<SubredditsMsg$UserSearchResponse>)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final AccData data_) {
        data_.getClass();
        this.data_ = data_;
    }
    
    private void setKind(final StringValue kind_) {
        kind_.getClass();
        this.kind_ = kind_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<SubredditsMsg$UserSearchResponse> parser;
                if ((parser = SubredditsMsg$UserSearchResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$UserSearchResponse.class) {
                        if (SubredditsMsg$UserSearchResponse.PARSER == null) {
                            SubredditsMsg$UserSearchResponse.PARSER = (n1<SubredditsMsg$UserSearchResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$UserSearchResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new b();
            }
            case 1: {
                return new SubredditsMsg$UserSearchResponse();
            }
        }
    }
    
    public AccData getData() {
        AccData accData;
        if ((accData = this.data_) == null) {
            accData = AccData.getDefaultInstance();
        }
        return accData;
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
    
    public static final class AccData extends GeneratedMessageLite<AccData, a> implements d1
    {
        public static final int AFTER_FIELD_NUMBER = 1;
        public static final int BEFORE_FIELD_NUMBER = 6;
        public static final int CHILDREN_FIELD_NUMBER = 5;
        private static final AccData DEFAULT_INSTANCE;
        public static final int DIST_FIELD_NUMBER = 2;
        public static final int GEO_FILTER_FIELD_NUMBER = 4;
        public static final int MODHASH_FIELD_NUMBER = 3;
        private static volatile n1<AccData> PARSER;
        private StringValue after_;
        private StringValue before_;
        private Internal$j<Account> children_;
        private Int64Value dist_;
        private StringValue geoFilter_;
        private StringValue modhash_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)AccData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new AccData()));
        }
        
        private AccData() {
            this.children_ = (Internal$j<Account>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static AccData access$224800() {
            return AccData.DEFAULT_INSTANCE;
        }
        
        public static void access$224900(final AccData accData, final StringValue after) {
            accData.setAfter(after);
        }
        
        public static void access$225000(final AccData accData, final StringValue stringValue) {
            accData.mergeAfter(stringValue);
        }
        
        public static void access$225100(final AccData accData) {
            accData.clearAfter();
        }
        
        public static void access$225200(final AccData accData, final Int64Value dist) {
            accData.setDist(dist);
        }
        
        public static void access$225300(final AccData accData, final Int64Value int64Value) {
            accData.mergeDist(int64Value);
        }
        
        public static void access$225400(final AccData accData) {
            accData.clearDist();
        }
        
        public static void access$225500(final AccData accData, final StringValue modhash) {
            accData.setModhash(modhash);
        }
        
        public static void access$225600(final AccData accData, final StringValue stringValue) {
            accData.mergeModhash(stringValue);
        }
        
        public static void access$225700(final AccData accData) {
            accData.clearModhash();
        }
        
        public static void access$225800(final AccData accData, final StringValue geoFilter) {
            accData.setGeoFilter(geoFilter);
        }
        
        public static void access$225900(final AccData accData, final StringValue stringValue) {
            accData.mergeGeoFilter(stringValue);
        }
        
        public static void access$226000(final AccData accData) {
            accData.clearGeoFilter();
        }
        
        public static void access$226100(final AccData accData, final int n, final Account account) {
            accData.setChildren(n, account);
        }
        
        public static void access$226200(final AccData accData, final Account account) {
            accData.addChildren(account);
        }
        
        public static void access$226300(final AccData accData, final int n, final Account account) {
            accData.addChildren(n, account);
        }
        
        public static void access$226400(final AccData accData, final Iterable iterable) {
            accData.addAllChildren(iterable);
        }
        
        public static void access$226500(final AccData accData) {
            accData.clearChildren();
        }
        
        public static void access$226600(final AccData accData, final int n) {
            accData.removeChildren(n);
        }
        
        public static void access$226700(final AccData accData, final StringValue before) {
            accData.setBefore(before);
        }
        
        public static void access$226800(final AccData accData, final StringValue stringValue) {
            accData.mergeBefore(stringValue);
        }
        
        public static void access$226900(final AccData accData) {
            accData.clearBefore();
        }
        
        private void addAllChildren(final Iterable<? extends Account> iterable) {
            this.ensureChildrenIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.children_);
        }
        
        private void addChildren(final int n, final Account account) {
            account.getClass();
            this.ensureChildrenIsMutable();
            ((List<Account>)this.children_).add(n, account);
        }
        
        private void addChildren(final Account account) {
            account.getClass();
            this.ensureChildrenIsMutable();
            ((List<Account>)this.children_).add(account);
        }
        
        private void clearAfter() {
            this.after_ = null;
        }
        
        private void clearBefore() {
            this.before_ = null;
        }
        
        private void clearChildren() {
            this.children_ = (Internal$j<Account>)GeneratedMessageLite.emptyProtobufList();
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
            final Internal$j<Account> children_ = this.children_;
            if (!children_.E0()) {
                this.children_ = (Internal$j<Account>)GeneratedMessageLite.mutableCopy((Internal$j)children_);
            }
        }
        
        public static AccData getDefaultInstance() {
            return AccData.DEFAULT_INSTANCE;
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
        
        private void mergeDist(final Int64Value int64Value) {
            int64Value.getClass();
            final Int64Value dist_ = this.dist_;
            Int64Value dist_2 = int64Value;
            if (dist_ != null) {
                dist_2 = int64Value;
                if (dist_ != Int64Value.getDefaultInstance()) {
                    dist_2 = (Int64Value)h.b(this.dist_, int64Value);
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
        
        public static a newBuilder() {
            return (a)AccData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final AccData accData) {
            return (a)AccData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)accData);
        }
        
        public static AccData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (AccData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AccData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AccData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AccData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, byteString);
        }
        
        public static AccData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static AccData parseFrom(final l l) throws IOException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, l);
        }
        
        public static AccData parseFrom(final l l, final d0 d0) throws IOException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static AccData parseFrom(final InputStream inputStream) throws IOException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AccData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AccData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static AccData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static AccData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, array);
        }
        
        public static AccData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (AccData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<AccData> parser() {
            return (n1<AccData>)AccData.DEFAULT_INSTANCE.getParserForType();
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
        
        private void setChildren(final int n, final Account account) {
            account.getClass();
            this.ensureChildrenIsMutable();
            ((List<Account>)this.children_).set(n, account);
        }
        
        private void setDist(final Int64Value dist_) {
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
                    final n1<AccData> parser;
                    if ((parser = AccData.PARSER) == null) {
                        synchronized (AccData.class) {
                            if (AccData.PARSER == null) {
                                AccData.PARSER = (n1<AccData>)new GeneratedMessageLite$c((GeneratedMessageLite)AccData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return AccData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)AccData.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0006\t", new Object[] { "after_", "dist_", "modhash_", "geoFilter_", "children_", Account.class, "before_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new AccData();
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
        
        public Account getChildren(final int n) {
            return ((List<Account>)this.children_).get(n);
        }
        
        public int getChildrenCount() {
            return ((List)this.children_).size();
        }
        
        public List<Account> getChildrenList() {
            return (List<Account>)this.children_;
        }
        
        public SubredditsMsg$UserSearchResponse$a getChildrenOrBuilder(final int n) {
            return ((List<SubredditsMsg$UserSearchResponse$a>)this.children_).get(n);
        }
        
        public List<? extends SubredditsMsg$UserSearchResponse$a> getChildrenOrBuilderList() {
            return (List<? extends SubredditsMsg$UserSearchResponse$a>)this.children_;
        }
        
        public Int64Value getDist() {
            Int64Value int64Value;
            if ((int64Value = this.dist_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
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
        
        public static final class a extends GeneratedMessageLite$b<AccData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)AccData.access$224800());
            }
        }
    }
    
    public static final class Account extends GeneratedMessageLite<Account, a> implements SubredditsMsg$UserSearchResponse$a
    {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final Account DEFAULT_INSTANCE;
        public static final int KIND_FIELD_NUMBER = 1;
        private static volatile n1<Account> PARSER;
        private AccountData data_;
        private StringValue kind_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)Account.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Account()));
        }
        
        private Account() {
        }
        
        public static Account access$227100() {
            return Account.DEFAULT_INSTANCE;
        }
        
        public static void access$227200(final Account account, final StringValue kind) {
            account.setKind(kind);
        }
        
        public static void access$227300(final Account account, final StringValue stringValue) {
            account.mergeKind(stringValue);
        }
        
        public static void access$227400(final Account account) {
            account.clearKind();
        }
        
        public static void access$227500(final Account account, final AccountData data) {
            account.setData(data);
        }
        
        public static void access$227600(final Account account, final AccountData accountData) {
            account.mergeData(accountData);
        }
        
        public static void access$227700(final Account account) {
            account.clearData();
        }
        
        private void clearData() {
            this.data_ = null;
        }
        
        private void clearKind() {
            this.kind_ = null;
        }
        
        public static Account getDefaultInstance() {
            return Account.DEFAULT_INSTANCE;
        }
        
        private void mergeData(final AccountData accountData) {
            accountData.getClass();
            final AccountData data_ = this.data_;
            AccountData data_2 = accountData;
            if (data_ != null) {
                data_2 = accountData;
                if (data_ != AccountData.getDefaultInstance()) {
                    final AccountData.a builder = AccountData.newBuilder(this.data_);
                    builder.h((GeneratedMessageLite)accountData);
                    data_2 = (AccountData)builder.c();
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
            return (a)Account.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final Account account) {
            return (a)Account.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)account);
        }
        
        public static Account parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (Account)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, inputStream);
        }
        
        public static Account parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (Account)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static Account parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, byteString);
        }
        
        public static Account parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static Account parseFrom(final l l) throws IOException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, l);
        }
        
        public static Account parseFrom(final l l, final d0 d0) throws IOException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, l, d0);
        }
        
        public static Account parseFrom(final InputStream inputStream) throws IOException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, inputStream);
        }
        
        public static Account parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static Account parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static Account parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static Account parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, array);
        }
        
        public static Account parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (Account)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Account.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<Account> parser() {
            return (n1<Account>)Account.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setData(final AccountData data_) {
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
                    final n1<Account> parser;
                    if ((parser = Account.PARSER) == null) {
                        synchronized (Account.class) {
                            if (Account.PARSER == null) {
                                Account.PARSER = (n1<Account>)new GeneratedMessageLite$c((GeneratedMessageLite)Account.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return Account.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)Account.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new Account();
                }
            }
        }
        
        public AccountData getData() {
            GeneratedMessageLite<AccountData, AccountData.a> generatedMessageLite;
            if ((generatedMessageLite = this.data_) == null) {
                generatedMessageLite = AccountData.getDefaultInstance();
            }
            return (AccountData)generatedMessageLite;
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
        
        public static final class a extends GeneratedMessageLite$b<Account, a> implements SubredditsMsg$UserSearchResponse$a
        {
            public a() {
                super((GeneratedMessageLite)Account.access$227100());
            }
        }
    }
    
    public static final class AccountData extends GeneratedMessageLite<AccountData, a> implements d1
    {
        public static final int ACCEPT_CHATS_FIELD_NUMBER = 12;
        public static final int ACCEPT_FOLLOWERS_FIELD_NUMBER = 20;
        public static final int ACCEPT_PMS_FIELD_NUMBER = 22;
        public static final int COMMENT_KARMA_FIELD_NUMBER = 19;
        public static final int CREATED_FIELD_NUMBER = 16;
        public static final int CREATED_UTC_FIELD_NUMBER = 17;
        private static final AccountData DEFAULT_INSTANCE;
        public static final int HAS_SUBSCRIBED_FIELD_NUMBER = 21;
        public static final int HAS_VERIFIED_EMAIL_FIELD_NUMBER = 8;
        public static final int HIDE_FROM_ROBOTS_FIELD_NUMBER = 10;
        public static final int ICON_IMG_FIELD_NUMBER = 9;
        public static final int ID_FIELD_NUMBER = 4;
        public static final int IS_BLOCKED_FIELD_NUMBER = 13;
        public static final int IS_EMPLOYEE_FIELD_NUMBER = 1;
        public static final int IS_FRIEND_FIELD_NUMBER = 2;
        public static final int IS_GOLD_FIELD_NUMBER = 6;
        public static final int IS_MOD_FIELD_NUMBER = 7;
        public static final int IS_SUSPENDED_FIELD_NUMBER = 23;
        public static final int LINK_KARMA_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 15;
        private static volatile n1<AccountData> PARSER;
        public static final int PREF_SHOW_SNOOVATAR_FIELD_NUMBER = 14;
        public static final int SNOOVATAR_IMG_FIELD_NUMBER = 18;
        public static final int SNOOVATAR_SIZE_FIELD_NUMBER = 3;
        public static final int SUBREDDIT_FIELD_NUMBER = 24;
        public static final int VERIFIED_FIELD_NUMBER = 5;
        private BoolValue acceptChats_;
        private BoolValue acceptFollowers_;
        private BoolValue acceptPms_;
        private Int64Value commentKarma_;
        private Int64Value createdUtc_;
        private Int64Value created_;
        private BoolValue hasSubscribed_;
        private BoolValue hasVerifiedEmail_;
        private BoolValue hideFromRobots_;
        private StringValue iconImg_;
        private StringValue id_;
        private BoolValue isBlocked_;
        private BoolValue isEmployee_;
        private BoolValue isFriend_;
        private BoolValue isGold_;
        private BoolValue isMod_;
        private BoolValue isSuspended_;
        private Int32Value linkKarma_;
        private StringValue name_;
        private BoolValue prefShowSnoovatar_;
        private StringValue snoovatarImg_;
        private Internal$j<Int32Value> snoovatarSize_;
        private Subreddit subreddit_;
        private BoolValue verified_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)AccountData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new AccountData()));
        }
        
        private AccountData() {
            this.snoovatarSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static AccountData access$241900() {
            return AccountData.DEFAULT_INSTANCE;
        }
        
        public static void access$242000(final AccountData accountData, final BoolValue isEmployee) {
            accountData.setIsEmployee(isEmployee);
        }
        
        public static void access$242100(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeIsEmployee(boolValue);
        }
        
        public static void access$242200(final AccountData accountData) {
            accountData.clearIsEmployee();
        }
        
        public static void access$242300(final AccountData accountData, final BoolValue isFriend) {
            accountData.setIsFriend(isFriend);
        }
        
        public static void access$242400(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeIsFriend(boolValue);
        }
        
        public static void access$242500(final AccountData accountData) {
            accountData.clearIsFriend();
        }
        
        public static void access$242600(final AccountData accountData, final int n, final Int32Value int32Value) {
            accountData.setSnoovatarSize(n, int32Value);
        }
        
        public static void access$242700(final AccountData accountData, final Int32Value int32Value) {
            accountData.addSnoovatarSize(int32Value);
        }
        
        public static void access$242800(final AccountData accountData, final int n, final Int32Value int32Value) {
            accountData.addSnoovatarSize(n, int32Value);
        }
        
        public static void access$242900(final AccountData accountData, final Iterable iterable) {
            accountData.addAllSnoovatarSize(iterable);
        }
        
        public static void access$243000(final AccountData accountData) {
            accountData.clearSnoovatarSize();
        }
        
        public static void access$243100(final AccountData accountData, final int n) {
            accountData.removeSnoovatarSize(n);
        }
        
        public static void access$243200(final AccountData accountData, final StringValue id) {
            accountData.setId(id);
        }
        
        public static void access$243300(final AccountData accountData, final StringValue stringValue) {
            accountData.mergeId(stringValue);
        }
        
        public static void access$243400(final AccountData accountData) {
            accountData.clearId();
        }
        
        public static void access$243500(final AccountData accountData, final BoolValue verified) {
            accountData.setVerified(verified);
        }
        
        public static void access$243600(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeVerified(boolValue);
        }
        
        public static void access$243700(final AccountData accountData) {
            accountData.clearVerified();
        }
        
        public static void access$243800(final AccountData accountData, final BoolValue isGold) {
            accountData.setIsGold(isGold);
        }
        
        public static void access$243900(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeIsGold(boolValue);
        }
        
        public static void access$244000(final AccountData accountData) {
            accountData.clearIsGold();
        }
        
        public static void access$244100(final AccountData accountData, final BoolValue isMod) {
            accountData.setIsMod(isMod);
        }
        
        public static void access$244200(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeIsMod(boolValue);
        }
        
        public static void access$244300(final AccountData accountData) {
            accountData.clearIsMod();
        }
        
        public static void access$244400(final AccountData accountData, final BoolValue hasVerifiedEmail) {
            accountData.setHasVerifiedEmail(hasVerifiedEmail);
        }
        
        public static void access$244500(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeHasVerifiedEmail(boolValue);
        }
        
        public static void access$244600(final AccountData accountData) {
            accountData.clearHasVerifiedEmail();
        }
        
        public static void access$244700(final AccountData accountData, final StringValue iconImg) {
            accountData.setIconImg(iconImg);
        }
        
        public static void access$244800(final AccountData accountData, final StringValue stringValue) {
            accountData.mergeIconImg(stringValue);
        }
        
        public static void access$244900(final AccountData accountData) {
            accountData.clearIconImg();
        }
        
        public static void access$245000(final AccountData accountData, final BoolValue hideFromRobots) {
            accountData.setHideFromRobots(hideFromRobots);
        }
        
        public static void access$245100(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeHideFromRobots(boolValue);
        }
        
        public static void access$245200(final AccountData accountData) {
            accountData.clearHideFromRobots();
        }
        
        public static void access$245300(final AccountData accountData, final Int32Value linkKarma) {
            accountData.setLinkKarma(linkKarma);
        }
        
        public static void access$245400(final AccountData accountData, final Int32Value int32Value) {
            accountData.mergeLinkKarma(int32Value);
        }
        
        public static void access$245500(final AccountData accountData) {
            accountData.clearLinkKarma();
        }
        
        public static void access$245600(final AccountData accountData, final BoolValue acceptChats) {
            accountData.setAcceptChats(acceptChats);
        }
        
        public static void access$245700(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeAcceptChats(boolValue);
        }
        
        public static void access$245800(final AccountData accountData) {
            accountData.clearAcceptChats();
        }
        
        public static void access$245900(final AccountData accountData, final BoolValue isBlocked) {
            accountData.setIsBlocked(isBlocked);
        }
        
        public static void access$246000(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeIsBlocked(boolValue);
        }
        
        public static void access$246100(final AccountData accountData) {
            accountData.clearIsBlocked();
        }
        
        public static void access$246200(final AccountData accountData, final BoolValue prefShowSnoovatar) {
            accountData.setPrefShowSnoovatar(prefShowSnoovatar);
        }
        
        public static void access$246300(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergePrefShowSnoovatar(boolValue);
        }
        
        public static void access$246400(final AccountData accountData) {
            accountData.clearPrefShowSnoovatar();
        }
        
        public static void access$246500(final AccountData accountData, final StringValue name) {
            accountData.setName(name);
        }
        
        public static void access$246600(final AccountData accountData, final StringValue stringValue) {
            accountData.mergeName(stringValue);
        }
        
        public static void access$246700(final AccountData accountData) {
            accountData.clearName();
        }
        
        public static void access$246800(final AccountData accountData, final Int64Value created) {
            accountData.setCreated(created);
        }
        
        public static void access$246900(final AccountData accountData, final Int64Value int64Value) {
            accountData.mergeCreated(int64Value);
        }
        
        public static void access$247000(final AccountData accountData) {
            accountData.clearCreated();
        }
        
        public static void access$247100(final AccountData accountData, final Int64Value createdUtc) {
            accountData.setCreatedUtc(createdUtc);
        }
        
        public static void access$247200(final AccountData accountData, final Int64Value int64Value) {
            accountData.mergeCreatedUtc(int64Value);
        }
        
        public static void access$247300(final AccountData accountData) {
            accountData.clearCreatedUtc();
        }
        
        public static void access$247400(final AccountData accountData, final StringValue snoovatarImg) {
            accountData.setSnoovatarImg(snoovatarImg);
        }
        
        public static void access$247500(final AccountData accountData, final StringValue stringValue) {
            accountData.mergeSnoovatarImg(stringValue);
        }
        
        public static void access$247600(final AccountData accountData) {
            accountData.clearSnoovatarImg();
        }
        
        public static void access$247700(final AccountData accountData, final Int64Value commentKarma) {
            accountData.setCommentKarma(commentKarma);
        }
        
        public static void access$247800(final AccountData accountData, final Int64Value int64Value) {
            accountData.mergeCommentKarma(int64Value);
        }
        
        public static void access$247900(final AccountData accountData) {
            accountData.clearCommentKarma();
        }
        
        public static void access$248000(final AccountData accountData, final BoolValue acceptFollowers) {
            accountData.setAcceptFollowers(acceptFollowers);
        }
        
        public static void access$248100(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeAcceptFollowers(boolValue);
        }
        
        public static void access$248200(final AccountData accountData) {
            accountData.clearAcceptFollowers();
        }
        
        public static void access$248300(final AccountData accountData, final BoolValue hasSubscribed) {
            accountData.setHasSubscribed(hasSubscribed);
        }
        
        public static void access$248400(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeHasSubscribed(boolValue);
        }
        
        public static void access$248500(final AccountData accountData) {
            accountData.clearHasSubscribed();
        }
        
        public static void access$248600(final AccountData accountData, final BoolValue acceptPms) {
            accountData.setAcceptPms(acceptPms);
        }
        
        public static void access$248700(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeAcceptPms(boolValue);
        }
        
        public static void access$248800(final AccountData accountData) {
            accountData.clearAcceptPms();
        }
        
        public static void access$248900(final AccountData accountData, final BoolValue isSuspended) {
            accountData.setIsSuspended(isSuspended);
        }
        
        public static void access$249000(final AccountData accountData, final BoolValue boolValue) {
            accountData.mergeIsSuspended(boolValue);
        }
        
        public static void access$249100(final AccountData accountData) {
            accountData.clearIsSuspended();
        }
        
        public static void access$249200(final AccountData accountData, final Subreddit subreddit) {
            accountData.setSubreddit(subreddit);
        }
        
        public static void access$249300(final AccountData accountData, final Subreddit subreddit) {
            accountData.mergeSubreddit(subreddit);
        }
        
        public static void access$249400(final AccountData accountData) {
            accountData.clearSubreddit();
        }
        
        private void addAllSnoovatarSize(final Iterable<? extends Int32Value> iterable) {
            this.ensureSnoovatarSizeIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.snoovatarSize_);
        }
        
        private void addSnoovatarSize(final int n, final Int32Value int32Value) {
            int32Value.getClass();
            this.ensureSnoovatarSizeIsMutable();
            ((List<Int32Value>)this.snoovatarSize_).add(n, int32Value);
        }
        
        private void addSnoovatarSize(final Int32Value int32Value) {
            int32Value.getClass();
            this.ensureSnoovatarSizeIsMutable();
            ((List<Int32Value>)this.snoovatarSize_).add(int32Value);
        }
        
        private void clearAcceptChats() {
            this.acceptChats_ = null;
        }
        
        private void clearAcceptFollowers() {
            this.acceptFollowers_ = null;
        }
        
        private void clearAcceptPms() {
            this.acceptPms_ = null;
        }
        
        private void clearCommentKarma() {
            this.commentKarma_ = null;
        }
        
        private void clearCreated() {
            this.created_ = null;
        }
        
        private void clearCreatedUtc() {
            this.createdUtc_ = null;
        }
        
        private void clearHasSubscribed() {
            this.hasSubscribed_ = null;
        }
        
        private void clearHasVerifiedEmail() {
            this.hasVerifiedEmail_ = null;
        }
        
        private void clearHideFromRobots() {
            this.hideFromRobots_ = null;
        }
        
        private void clearIconImg() {
            this.iconImg_ = null;
        }
        
        private void clearId() {
            this.id_ = null;
        }
        
        private void clearIsBlocked() {
            this.isBlocked_ = null;
        }
        
        private void clearIsEmployee() {
            this.isEmployee_ = null;
        }
        
        private void clearIsFriend() {
            this.isFriend_ = null;
        }
        
        private void clearIsGold() {
            this.isGold_ = null;
        }
        
        private void clearIsMod() {
            this.isMod_ = null;
        }
        
        private void clearIsSuspended() {
            this.isSuspended_ = null;
        }
        
        private void clearLinkKarma() {
            this.linkKarma_ = null;
        }
        
        private void clearName() {
            this.name_ = null;
        }
        
        private void clearPrefShowSnoovatar() {
            this.prefShowSnoovatar_ = null;
        }
        
        private void clearSnoovatarImg() {
            this.snoovatarImg_ = null;
        }
        
        private void clearSnoovatarSize() {
            this.snoovatarSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearSubreddit() {
            this.subreddit_ = null;
        }
        
        private void clearVerified() {
            this.verified_ = null;
        }
        
        private void ensureSnoovatarSizeIsMutable() {
            final Internal$j<Int32Value> snoovatarSize_ = this.snoovatarSize_;
            if (!snoovatarSize_.E0()) {
                this.snoovatarSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.mutableCopy((Internal$j)snoovatarSize_);
            }
        }
        
        public static AccountData getDefaultInstance() {
            return AccountData.DEFAULT_INSTANCE;
        }
        
        private void mergeAcceptChats(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue acceptChats_ = this.acceptChats_;
            BoolValue acceptChats_2 = boolValue;
            if (acceptChats_ != null) {
                acceptChats_2 = boolValue;
                if (acceptChats_ != BoolValue.getDefaultInstance()) {
                    acceptChats_2 = (BoolValue)o.g(this.acceptChats_, boolValue);
                }
            }
            this.acceptChats_ = acceptChats_2;
        }
        
        private void mergeAcceptFollowers(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue acceptFollowers_ = this.acceptFollowers_;
            BoolValue acceptFollowers_2 = boolValue;
            if (acceptFollowers_ != null) {
                acceptFollowers_2 = boolValue;
                if (acceptFollowers_ != BoolValue.getDefaultInstance()) {
                    acceptFollowers_2 = (BoolValue)o.g(this.acceptFollowers_, boolValue);
                }
            }
            this.acceptFollowers_ = acceptFollowers_2;
        }
        
        private void mergeAcceptPms(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue acceptPms_ = this.acceptPms_;
            BoolValue acceptPms_2 = boolValue;
            if (acceptPms_ != null) {
                acceptPms_2 = boolValue;
                if (acceptPms_ != BoolValue.getDefaultInstance()) {
                    acceptPms_2 = (BoolValue)o.g(this.acceptPms_, boolValue);
                }
            }
            this.acceptPms_ = acceptPms_2;
        }
        
        private void mergeCommentKarma(final Int64Value int64Value) {
            int64Value.getClass();
            final Int64Value commentKarma_ = this.commentKarma_;
            Int64Value commentKarma_2 = int64Value;
            if (commentKarma_ != null) {
                commentKarma_2 = int64Value;
                if (commentKarma_ != Int64Value.getDefaultInstance()) {
                    commentKarma_2 = (Int64Value)h.b(this.commentKarma_, int64Value);
                }
            }
            this.commentKarma_ = commentKarma_2;
        }
        
        private void mergeCreated(final Int64Value int64Value) {
            int64Value.getClass();
            final Int64Value created_ = this.created_;
            Int64Value created_2 = int64Value;
            if (created_ != null) {
                created_2 = int64Value;
                if (created_ != Int64Value.getDefaultInstance()) {
                    created_2 = (Int64Value)h.b(this.created_, int64Value);
                }
            }
            this.created_ = created_2;
        }
        
        private void mergeCreatedUtc(final Int64Value int64Value) {
            int64Value.getClass();
            final Int64Value createdUtc_ = this.createdUtc_;
            Int64Value createdUtc_2 = int64Value;
            if (createdUtc_ != null) {
                createdUtc_2 = int64Value;
                if (createdUtc_ != Int64Value.getDefaultInstance()) {
                    createdUtc_2 = (Int64Value)h.b(this.createdUtc_, int64Value);
                }
            }
            this.createdUtc_ = createdUtc_2;
        }
        
        private void mergeHasSubscribed(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue hasSubscribed_ = this.hasSubscribed_;
            BoolValue hasSubscribed_2 = boolValue;
            if (hasSubscribed_ != null) {
                hasSubscribed_2 = boolValue;
                if (hasSubscribed_ != BoolValue.getDefaultInstance()) {
                    hasSubscribed_2 = (BoolValue)o.g(this.hasSubscribed_, boolValue);
                }
            }
            this.hasSubscribed_ = hasSubscribed_2;
        }
        
        private void mergeHasVerifiedEmail(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue hasVerifiedEmail_ = this.hasVerifiedEmail_;
            BoolValue hasVerifiedEmail_2 = boolValue;
            if (hasVerifiedEmail_ != null) {
                hasVerifiedEmail_2 = boolValue;
                if (hasVerifiedEmail_ != BoolValue.getDefaultInstance()) {
                    hasVerifiedEmail_2 = (BoolValue)o.g(this.hasVerifiedEmail_, boolValue);
                }
            }
            this.hasVerifiedEmail_ = hasVerifiedEmail_2;
        }
        
        private void mergeHideFromRobots(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue hideFromRobots_ = this.hideFromRobots_;
            BoolValue hideFromRobots_2 = boolValue;
            if (hideFromRobots_ != null) {
                hideFromRobots_2 = boolValue;
                if (hideFromRobots_ != BoolValue.getDefaultInstance()) {
                    hideFromRobots_2 = (BoolValue)o.g(this.hideFromRobots_, boolValue);
                }
            }
            this.hideFromRobots_ = hideFromRobots_2;
        }
        
        private void mergeIconImg(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue iconImg_ = this.iconImg_;
            StringValue iconImg_2 = stringValue;
            if (iconImg_ != null) {
                iconImg_2 = stringValue;
                if (iconImg_ != StringValue.getDefaultInstance()) {
                    iconImg_2 = (StringValue)w.e(this.iconImg_, stringValue);
                }
            }
            this.iconImg_ = iconImg_2;
        }
        
        private void mergeId(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue id_ = this.id_;
            StringValue id_2 = stringValue;
            if (id_ != null) {
                id_2 = stringValue;
                if (id_ != StringValue.getDefaultInstance()) {
                    id_2 = (StringValue)w.e(this.id_, stringValue);
                }
            }
            this.id_ = id_2;
        }
        
        private void mergeIsBlocked(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue isBlocked_ = this.isBlocked_;
            BoolValue isBlocked_2 = boolValue;
            if (isBlocked_ != null) {
                isBlocked_2 = boolValue;
                if (isBlocked_ != BoolValue.getDefaultInstance()) {
                    isBlocked_2 = (BoolValue)o.g(this.isBlocked_, boolValue);
                }
            }
            this.isBlocked_ = isBlocked_2;
        }
        
        private void mergeIsEmployee(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue isEmployee_ = this.isEmployee_;
            BoolValue isEmployee_2 = boolValue;
            if (isEmployee_ != null) {
                isEmployee_2 = boolValue;
                if (isEmployee_ != BoolValue.getDefaultInstance()) {
                    isEmployee_2 = (BoolValue)o.g(this.isEmployee_, boolValue);
                }
            }
            this.isEmployee_ = isEmployee_2;
        }
        
        private void mergeIsFriend(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue isFriend_ = this.isFriend_;
            BoolValue isFriend_2 = boolValue;
            if (isFriend_ != null) {
                isFriend_2 = boolValue;
                if (isFriend_ != BoolValue.getDefaultInstance()) {
                    isFriend_2 = (BoolValue)o.g(this.isFriend_, boolValue);
                }
            }
            this.isFriend_ = isFriend_2;
        }
        
        private void mergeIsGold(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue isGold_ = this.isGold_;
            BoolValue isGold_2 = boolValue;
            if (isGold_ != null) {
                isGold_2 = boolValue;
                if (isGold_ != BoolValue.getDefaultInstance()) {
                    isGold_2 = (BoolValue)o.g(this.isGold_, boolValue);
                }
            }
            this.isGold_ = isGold_2;
        }
        
        private void mergeIsMod(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue isMod_ = this.isMod_;
            BoolValue isMod_2 = boolValue;
            if (isMod_ != null) {
                isMod_2 = boolValue;
                if (isMod_ != BoolValue.getDefaultInstance()) {
                    isMod_2 = (BoolValue)o.g(this.isMod_, boolValue);
                }
            }
            this.isMod_ = isMod_2;
        }
        
        private void mergeIsSuspended(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue isSuspended_ = this.isSuspended_;
            BoolValue isSuspended_2 = boolValue;
            if (isSuspended_ != null) {
                isSuspended_2 = boolValue;
                if (isSuspended_ != BoolValue.getDefaultInstance()) {
                    isSuspended_2 = (BoolValue)o.g(this.isSuspended_, boolValue);
                }
            }
            this.isSuspended_ = isSuspended_2;
        }
        
        private void mergeLinkKarma(final Int32Value int32Value) {
            int32Value.getClass();
            final Int32Value linkKarma_ = this.linkKarma_;
            Int32Value linkKarma_2 = int32Value;
            if (linkKarma_ != null) {
                linkKarma_2 = int32Value;
                if (linkKarma_ != Int32Value.getDefaultInstance()) {
                    linkKarma_2 = (Int32Value)b.d(this.linkKarma_, int32Value);
                }
            }
            this.linkKarma_ = linkKarma_2;
        }
        
        private void mergeName(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue name_ = this.name_;
            StringValue name_2 = stringValue;
            if (name_ != null) {
                name_2 = stringValue;
                if (name_ != StringValue.getDefaultInstance()) {
                    name_2 = (StringValue)w.e(this.name_, stringValue);
                }
            }
            this.name_ = name_2;
        }
        
        private void mergePrefShowSnoovatar(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue prefShowSnoovatar_ = this.prefShowSnoovatar_;
            BoolValue prefShowSnoovatar_2 = boolValue;
            if (prefShowSnoovatar_ != null) {
                prefShowSnoovatar_2 = boolValue;
                if (prefShowSnoovatar_ != BoolValue.getDefaultInstance()) {
                    prefShowSnoovatar_2 = (BoolValue)o.g(this.prefShowSnoovatar_, boolValue);
                }
            }
            this.prefShowSnoovatar_ = prefShowSnoovatar_2;
        }
        
        private void mergeSnoovatarImg(final StringValue stringValue) {
            stringValue.getClass();
            final StringValue snoovatarImg_ = this.snoovatarImg_;
            StringValue snoovatarImg_2 = stringValue;
            if (snoovatarImg_ != null) {
                snoovatarImg_2 = stringValue;
                if (snoovatarImg_ != StringValue.getDefaultInstance()) {
                    snoovatarImg_2 = (StringValue)w.e(this.snoovatarImg_, stringValue);
                }
            }
            this.snoovatarImg_ = snoovatarImg_2;
        }
        
        private void mergeSubreddit(final Subreddit subreddit) {
            subreddit.getClass();
            final Subreddit subreddit_ = this.subreddit_;
            Subreddit subreddit_2 = subreddit;
            if (subreddit_ != null) {
                subreddit_2 = subreddit;
                if (subreddit_ != Subreddit.getDefaultInstance()) {
                    final Subreddit.a builder = Subreddit.newBuilder(this.subreddit_);
                    builder.h((GeneratedMessageLite)subreddit);
                    subreddit_2 = (Subreddit)builder.c();
                }
            }
            this.subreddit_ = subreddit_2;
        }
        
        private void mergeVerified(final BoolValue boolValue) {
            boolValue.getClass();
            final BoolValue verified_ = this.verified_;
            BoolValue verified_2 = boolValue;
            if (verified_ != null) {
                verified_2 = boolValue;
                if (verified_ != BoolValue.getDefaultInstance()) {
                    verified_2 = (BoolValue)o.g(this.verified_, boolValue);
                }
            }
            this.verified_ = verified_2;
        }
        
        public static a newBuilder() {
            return (a)AccountData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final AccountData accountData) {
            return (a)AccountData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)accountData);
        }
        
        public static AccountData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (AccountData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AccountData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AccountData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AccountData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, byteString);
        }
        
        public static AccountData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static AccountData parseFrom(final l l) throws IOException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, l);
        }
        
        public static AccountData parseFrom(final l l, final d0 d0) throws IOException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static AccountData parseFrom(final InputStream inputStream) throws IOException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AccountData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AccountData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static AccountData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static AccountData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, array);
        }
        
        public static AccountData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (AccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<AccountData> parser() {
            return (n1<AccountData>)AccountData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeSnoovatarSize(final int n) {
            this.ensureSnoovatarSizeIsMutable();
            this.snoovatarSize_.remove(n);
        }
        
        private void setAcceptChats(final BoolValue acceptChats_) {
            acceptChats_.getClass();
            this.acceptChats_ = acceptChats_;
        }
        
        private void setAcceptFollowers(final BoolValue acceptFollowers_) {
            acceptFollowers_.getClass();
            this.acceptFollowers_ = acceptFollowers_;
        }
        
        private void setAcceptPms(final BoolValue acceptPms_) {
            acceptPms_.getClass();
            this.acceptPms_ = acceptPms_;
        }
        
        private void setCommentKarma(final Int64Value commentKarma_) {
            commentKarma_.getClass();
            this.commentKarma_ = commentKarma_;
        }
        
        private void setCreated(final Int64Value created_) {
            created_.getClass();
            this.created_ = created_;
        }
        
        private void setCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            this.createdUtc_ = createdUtc_;
        }
        
        private void setHasSubscribed(final BoolValue hasSubscribed_) {
            hasSubscribed_.getClass();
            this.hasSubscribed_ = hasSubscribed_;
        }
        
        private void setHasVerifiedEmail(final BoolValue hasVerifiedEmail_) {
            hasVerifiedEmail_.getClass();
            this.hasVerifiedEmail_ = hasVerifiedEmail_;
        }
        
        private void setHideFromRobots(final BoolValue hideFromRobots_) {
            hideFromRobots_.getClass();
            this.hideFromRobots_ = hideFromRobots_;
        }
        
        private void setIconImg(final StringValue iconImg_) {
            iconImg_.getClass();
            this.iconImg_ = iconImg_;
        }
        
        private void setId(final StringValue id_) {
            id_.getClass();
            this.id_ = id_;
        }
        
        private void setIsBlocked(final BoolValue isBlocked_) {
            isBlocked_.getClass();
            this.isBlocked_ = isBlocked_;
        }
        
        private void setIsEmployee(final BoolValue isEmployee_) {
            isEmployee_.getClass();
            this.isEmployee_ = isEmployee_;
        }
        
        private void setIsFriend(final BoolValue isFriend_) {
            isFriend_.getClass();
            this.isFriend_ = isFriend_;
        }
        
        private void setIsGold(final BoolValue isGold_) {
            isGold_.getClass();
            this.isGold_ = isGold_;
        }
        
        private void setIsMod(final BoolValue isMod_) {
            isMod_.getClass();
            this.isMod_ = isMod_;
        }
        
        private void setIsSuspended(final BoolValue isSuspended_) {
            isSuspended_.getClass();
            this.isSuspended_ = isSuspended_;
        }
        
        private void setLinkKarma(final Int32Value linkKarma_) {
            linkKarma_.getClass();
            this.linkKarma_ = linkKarma_;
        }
        
        private void setName(final StringValue name_) {
            name_.getClass();
            this.name_ = name_;
        }
        
        private void setPrefShowSnoovatar(final BoolValue prefShowSnoovatar_) {
            prefShowSnoovatar_.getClass();
            this.prefShowSnoovatar_ = prefShowSnoovatar_;
        }
        
        private void setSnoovatarImg(final StringValue snoovatarImg_) {
            snoovatarImg_.getClass();
            this.snoovatarImg_ = snoovatarImg_;
        }
        
        private void setSnoovatarSize(final int n, final Int32Value int32Value) {
            int32Value.getClass();
            this.ensureSnoovatarSizeIsMutable();
            ((List<Int32Value>)this.snoovatarSize_).set(n, int32Value);
        }
        
        private void setSubreddit(final Subreddit subreddit_) {
            subreddit_.getClass();
            this.subreddit_ = subreddit_;
        }
        
        private void setVerified(final BoolValue verified_) {
            verified_.getClass();
            this.verified_ = verified_;
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
                    final n1<AccountData> parser;
                    if ((parser = AccountData.PARSER) == null) {
                        synchronized (AccountData.class) {
                            if (AccountData.PARSER == null) {
                                AccountData.PARSER = (n1<AccountData>)new GeneratedMessageLite$c((GeneratedMessageLite)AccountData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return AccountData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)AccountData.DEFAULT_INSTANCE, "\u0000\u0018\u0000\u0000\u0001\u0018\u0018\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t", new Object[] { "isEmployee_", "isFriend_", "snoovatarSize_", Int32Value.class, "id_", "verified_", "isGold_", "isMod_", "hasVerifiedEmail_", "iconImg_", "hideFromRobots_", "linkKarma_", "acceptChats_", "isBlocked_", "prefShowSnoovatar_", "name_", "created_", "createdUtc_", "snoovatarImg_", "commentKarma_", "acceptFollowers_", "hasSubscribed_", "acceptPms_", "isSuspended_", "subreddit_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new AccountData();
                }
            }
        }
        
        public BoolValue getAcceptChats() {
            BoolValue boolValue;
            if ((boolValue = this.acceptChats_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAcceptFollowers() {
            BoolValue boolValue;
            if ((boolValue = this.acceptFollowers_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAcceptPms() {
            BoolValue boolValue;
            if ((boolValue = this.acceptPms_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int64Value getCommentKarma() {
            Int64Value int64Value;
            if ((int64Value = this.commentKarma_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public Int64Value getCreated() {
            Int64Value int64Value;
            if ((int64Value = this.created_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public Int64Value getCreatedUtc() {
            Int64Value int64Value;
            if ((int64Value = this.createdUtc_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public BoolValue getHasSubscribed() {
            BoolValue boolValue;
            if ((boolValue = this.hasSubscribed_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasVerifiedEmail() {
            BoolValue boolValue;
            if ((boolValue = this.hasVerifiedEmail_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHideFromRobots() {
            BoolValue boolValue;
            if ((boolValue = this.hideFromRobots_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getIconImg() {
            StringValue stringValue;
            if ((stringValue = this.iconImg_) == null) {
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
        
        public BoolValue getIsBlocked() {
            BoolValue boolValue;
            if ((boolValue = this.isBlocked_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsEmployee() {
            BoolValue boolValue;
            if ((boolValue = this.isEmployee_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsFriend() {
            BoolValue boolValue;
            if ((boolValue = this.isFriend_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsGold() {
            BoolValue boolValue;
            if ((boolValue = this.isGold_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsMod() {
            BoolValue boolValue;
            if ((boolValue = this.isMod_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsSuspended() {
            BoolValue boolValue;
            if ((boolValue = this.isSuspended_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int32Value getLinkKarma() {
            Int32Value int32Value;
            if ((int32Value = this.linkKarma_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public StringValue getName() {
            StringValue stringValue;
            if ((stringValue = this.name_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getPrefShowSnoovatar() {
            BoolValue boolValue;
            if ((boolValue = this.prefShowSnoovatar_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getSnoovatarImg() {
            StringValue stringValue;
            if ((stringValue = this.snoovatarImg_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int32Value getSnoovatarSize(final int n) {
            return ((List<Int32Value>)this.snoovatarSize_).get(n);
        }
        
        public int getSnoovatarSizeCount() {
            return ((List)this.snoovatarSize_).size();
        }
        
        public List<Int32Value> getSnoovatarSizeList() {
            return (List<Int32Value>)this.snoovatarSize_;
        }
        
        public l0 getSnoovatarSizeOrBuilder(final int n) {
            return ((List<l0>)this.snoovatarSize_).get(n);
        }
        
        public List<? extends l0> getSnoovatarSizeOrBuilderList() {
            return (List<? extends l0>)this.snoovatarSize_;
        }
        
        public Subreddit getSubreddit() {
            Subreddit subreddit;
            if ((subreddit = this.subreddit_) == null) {
                subreddit = Subreddit.getDefaultInstance();
            }
            return subreddit;
        }
        
        public BoolValue getVerified() {
            BoolValue boolValue;
            if ((boolValue = this.verified_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public boolean hasAcceptChats() {
            return this.acceptChats_ != null;
        }
        
        public boolean hasAcceptFollowers() {
            return this.acceptFollowers_ != null;
        }
        
        public boolean hasAcceptPms() {
            return this.acceptPms_ != null;
        }
        
        public boolean hasCommentKarma() {
            return this.commentKarma_ != null;
        }
        
        public boolean hasCreated() {
            return this.created_ != null;
        }
        
        public boolean hasCreatedUtc() {
            return this.createdUtc_ != null;
        }
        
        public boolean hasHasSubscribed() {
            return this.hasSubscribed_ != null;
        }
        
        public boolean hasHasVerifiedEmail() {
            return this.hasVerifiedEmail_ != null;
        }
        
        public boolean hasHideFromRobots() {
            return this.hideFromRobots_ != null;
        }
        
        public boolean hasIconImg() {
            return this.iconImg_ != null;
        }
        
        public boolean hasId() {
            return this.id_ != null;
        }
        
        public boolean hasIsBlocked() {
            return this.isBlocked_ != null;
        }
        
        public boolean hasIsEmployee() {
            return this.isEmployee_ != null;
        }
        
        public boolean hasIsFriend() {
            return this.isFriend_ != null;
        }
        
        public boolean hasIsGold() {
            return this.isGold_ != null;
        }
        
        public boolean hasIsMod() {
            return this.isMod_ != null;
        }
        
        public boolean hasIsSuspended() {
            return this.isSuspended_ != null;
        }
        
        public boolean hasLinkKarma() {
            return this.linkKarma_ != null;
        }
        
        public boolean hasName() {
            return this.name_ != null;
        }
        
        public boolean hasPrefShowSnoovatar() {
            return this.prefShowSnoovatar_ != null;
        }
        
        public boolean hasSnoovatarImg() {
            return this.snoovatarImg_ != null;
        }
        
        public boolean hasSubreddit() {
            return this.subreddit_ != null;
        }
        
        public boolean hasVerified() {
            return this.verified_ != null;
        }
        
        public static final class Subreddit extends GeneratedMessageLite<Subreddit, a> implements d1
        {
            public static final int ACCEPT_FOLLOWERS_FIELD_NUMBER = 36;
            public static final int ALLOWED_MEDIA_IN_COMMENTS_FIELD_NUMBER = 4;
            public static final int BANNER_IMG_FIELD_NUMBER = 3;
            public static final int BANNER_SIZE_FIELD_NUMBER = 34;
            public static final int COMMUNITY_ICON_FIELD_NUMBER = 7;
            private static final Subreddit DEFAULT_INSTANCE;
            public static final int DEFAULT_SET_FIELD_NUMBER = 1;
            public static final int DESCRIPTION_FIELD_NUMBER = 19;
            public static final int DISABLE_CONTRIBUTOR_REQUESTS_FIELD_NUMBER = 39;
            public static final int DISPLAY_NAME_FIELD_NUMBER = 11;
            public static final int DISPLAY_NAME_PREFIXED_FIELD_NUMBER = 28;
            public static final int FREE_FORM_REPORTS_FIELD_NUMBER = 6;
            public static final int HEADER_IMG_FIELD_NUMBER = 12;
            public static final int HEADER_SIZE_FIELD_NUMBER = 21;
            public static final int ICON_COLOR_FIELD_NUMBER = 9;
            public static final int ICON_IMG_FIELD_NUMBER = 18;
            public static final int ICON_SIZE_FIELD_NUMBER = 16;
            public static final int IS_DEFAULT_BANNER_FIELD_NUMBER = 31;
            public static final int IS_DEFAULT_ICON_FIELD_NUMBER = 26;
            public static final int KEY_COLOR_FIELD_NUMBER = 29;
            public static final int LINK_FLAIR_ENABLED_FIELD_NUMBER = 38;
            public static final int LINK_FLAIR_POSITION_FIELD_NUMBER = 27;
            public static final int NAME_FIELD_NUMBER = 30;
            public static final int OVER_18_FIELD_NUMBER = 15;
            private static volatile n1<Subreddit> PARSER;
            public static final int PREVIOUS_NAMES_FIELD_NUMBER = 14;
            public static final int PRIMARY_COLOR_FIELD_NUMBER = 17;
            public static final int PUBLIC_DESCRIPTION_FIELD_NUMBER = 37;
            public static final int QUARANTINE_FIELD_NUMBER = 33;
            public static final int RESTRICT_COMMENTING_FIELD_NUMBER = 23;
            public static final int RESTRICT_POSTING_FIELD_NUMBER = 22;
            public static final int SHOW_MEDIA_FIELD_NUMBER = 8;
            public static final int SUBMIT_LINK_LABEL_FIELD_NUMBER = 20;
            public static final int SUBMIT_TEXT_LABEL_FIELD_NUMBER = 25;
            public static final int SUBREDDIT_TYPE_FIELD_NUMBER = 40;
            public static final int SUBSCRIBERS_FIELD_NUMBER = 24;
            public static final int TITLE_FIELD_NUMBER = 13;
            public static final int URL_FIELD_NUMBER = 32;
            public static final int USER_IS_BANNED_FIELD_NUMBER = 5;
            public static final int USER_IS_CONTRIBUTOR_FIELD_NUMBER = 2;
            public static final int USER_IS_MODERATOR_FIELD_NUMBER = 35;
            public static final int USER_IS_MUTED_FIELD_NUMBER = 10;
            public static final int USER_IS_SUBSCRIBER_FIELD_NUMBER = 41;
            private BoolValue acceptFollowers_;
            private Internal$j<StringValue> allowedMediaInComments_;
            private StringValue bannerImg_;
            private Internal$j<Int32Value> bannerSize_;
            private StringValue communityIcon_;
            private BoolValue defaultSet_;
            private StringValue description_;
            private BoolValue disableContributorRequests_;
            private StringValue displayNamePrefixed_;
            private StringValue displayName_;
            private BoolValue freeFormReports_;
            private StringValue headerImg_;
            private Internal$j<Int32Value> headerSize_;
            private StringValue iconColor_;
            private StringValue iconImg_;
            private Internal$j<Int32Value> iconSize_;
            private BoolValue isDefaultBanner_;
            private BoolValue isDefaultIcon_;
            private StringValue keyColor_;
            private BoolValue linkFlairEnabled_;
            private StringValue linkFlairPosition_;
            private StringValue name_;
            private BoolValue over18_;
            private Internal$j<StringValue> previousNames_;
            private StringValue primaryColor_;
            private StringValue publicDescription_;
            private BoolValue quarantine_;
            private BoolValue restrictCommenting_;
            private BoolValue restrictPosting_;
            private BoolValue showMedia_;
            private StringValue submitLinkLabel_;
            private StringValue submitTextLabel_;
            private StringValue subredditType_;
            private Int64Value subscribers_;
            private StringValue title_;
            private StringValue url_;
            private BoolValue userIsBanned_;
            private BoolValue userIsContributor_;
            private BoolValue userIsModerator_;
            private BoolValue userIsMuted_;
            private BoolValue userIsSubscriber_;
            
            static {
                GeneratedMessageLite.registerDefaultInstance((Class)Subreddit.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Subreddit()));
            }
            
            private Subreddit() {
                this.allowedMediaInComments_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
                this.previousNames_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
                this.iconSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
                this.headerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
                this.bannerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
            }
            
            public static Subreddit access$227900() {
                return Subreddit.DEFAULT_INSTANCE;
            }
            
            public static void access$228000(final Subreddit subreddit, final BoolValue defaultSet) {
                subreddit.setDefaultSet(defaultSet);
            }
            
            public static void access$228100(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeDefaultSet(boolValue);
            }
            
            public static void access$228200(final Subreddit subreddit) {
                subreddit.clearDefaultSet();
            }
            
            public static void access$228300(final Subreddit subreddit, final BoolValue userIsContributor) {
                subreddit.setUserIsContributor(userIsContributor);
            }
            
            public static void access$228400(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsContributor(boolValue);
            }
            
            public static void access$228500(final Subreddit subreddit) {
                subreddit.clearUserIsContributor();
            }
            
            public static void access$228600(final Subreddit subreddit, final StringValue bannerImg) {
                subreddit.setBannerImg(bannerImg);
            }
            
            public static void access$228700(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeBannerImg(stringValue);
            }
            
            public static void access$228800(final Subreddit subreddit) {
                subreddit.clearBannerImg();
            }
            
            public static void access$228900(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.setAllowedMediaInComments(n, stringValue);
            }
            
            public static void access$229000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.addAllowedMediaInComments(stringValue);
            }
            
            public static void access$229100(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.addAllowedMediaInComments(n, stringValue);
            }
            
            public static void access$229200(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllAllowedMediaInComments(iterable);
            }
            
            public static void access$229300(final Subreddit subreddit) {
                subreddit.clearAllowedMediaInComments();
            }
            
            public static void access$229400(final Subreddit subreddit, final int n) {
                subreddit.removeAllowedMediaInComments(n);
            }
            
            public static void access$229500(final Subreddit subreddit, final BoolValue userIsBanned) {
                subreddit.setUserIsBanned(userIsBanned);
            }
            
            public static void access$229600(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsBanned(boolValue);
            }
            
            public static void access$229700(final Subreddit subreddit) {
                subreddit.clearUserIsBanned();
            }
            
            public static void access$229800(final Subreddit subreddit, final BoolValue freeFormReports) {
                subreddit.setFreeFormReports(freeFormReports);
            }
            
            public static void access$229900(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeFreeFormReports(boolValue);
            }
            
            public static void access$230000(final Subreddit subreddit) {
                subreddit.clearFreeFormReports();
            }
            
            public static void access$230100(final Subreddit subreddit, final StringValue communityIcon) {
                subreddit.setCommunityIcon(communityIcon);
            }
            
            public static void access$230200(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeCommunityIcon(stringValue);
            }
            
            public static void access$230300(final Subreddit subreddit) {
                subreddit.clearCommunityIcon();
            }
            
            public static void access$230400(final Subreddit subreddit, final BoolValue showMedia) {
                subreddit.setShowMedia(showMedia);
            }
            
            public static void access$230500(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeShowMedia(boolValue);
            }
            
            public static void access$230600(final Subreddit subreddit) {
                subreddit.clearShowMedia();
            }
            
            public static void access$230700(final Subreddit subreddit, final StringValue iconColor) {
                subreddit.setIconColor(iconColor);
            }
            
            public static void access$230800(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeIconColor(stringValue);
            }
            
            public static void access$230900(final Subreddit subreddit) {
                subreddit.clearIconColor();
            }
            
            public static void access$231000(final Subreddit subreddit, final BoolValue userIsMuted) {
                subreddit.setUserIsMuted(userIsMuted);
            }
            
            public static void access$231100(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsMuted(boolValue);
            }
            
            public static void access$231200(final Subreddit subreddit) {
                subreddit.clearUserIsMuted();
            }
            
            public static void access$231300(final Subreddit subreddit, final StringValue displayName) {
                subreddit.setDisplayName(displayName);
            }
            
            public static void access$231400(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeDisplayName(stringValue);
            }
            
            public static void access$231500(final Subreddit subreddit) {
                subreddit.clearDisplayName();
            }
            
            public static void access$231600(final Subreddit subreddit, final StringValue headerImg) {
                subreddit.setHeaderImg(headerImg);
            }
            
            public static void access$231700(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeHeaderImg(stringValue);
            }
            
            public static void access$231800(final Subreddit subreddit) {
                subreddit.clearHeaderImg();
            }
            
            public static void access$231900(final Subreddit subreddit, final StringValue title) {
                subreddit.setTitle(title);
            }
            
            public static void access$232000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeTitle(stringValue);
            }
            
            public static void access$232100(final Subreddit subreddit) {
                subreddit.clearTitle();
            }
            
            public static void access$232200(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.setPreviousNames(n, stringValue);
            }
            
            public static void access$232300(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.addPreviousNames(stringValue);
            }
            
            public static void access$232400(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.addPreviousNames(n, stringValue);
            }
            
            public static void access$232500(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllPreviousNames(iterable);
            }
            
            public static void access$232600(final Subreddit subreddit) {
                subreddit.clearPreviousNames();
            }
            
            public static void access$232700(final Subreddit subreddit, final int n) {
                subreddit.removePreviousNames(n);
            }
            
            public static void access$232800(final Subreddit subreddit, final BoolValue over18) {
                subreddit.setOver18(over18);
            }
            
            public static void access$232900(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeOver18(boolValue);
            }
            
            public static void access$233000(final Subreddit subreddit) {
                subreddit.clearOver18();
            }
            
            public static void access$233100(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.setIconSize(n, int32Value);
            }
            
            public static void access$233200(final Subreddit subreddit, final Int32Value int32Value) {
                subreddit.addIconSize(int32Value);
            }
            
            public static void access$233300(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.addIconSize(n, int32Value);
            }
            
            public static void access$233400(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllIconSize(iterable);
            }
            
            public static void access$233500(final Subreddit subreddit) {
                subreddit.clearIconSize();
            }
            
            public static void access$233600(final Subreddit subreddit, final int n) {
                subreddit.removeIconSize(n);
            }
            
            public static void access$233700(final Subreddit subreddit, final StringValue primaryColor) {
                subreddit.setPrimaryColor(primaryColor);
            }
            
            public static void access$233800(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergePrimaryColor(stringValue);
            }
            
            public static void access$233900(final Subreddit subreddit) {
                subreddit.clearPrimaryColor();
            }
            
            public static void access$234000(final Subreddit subreddit, final StringValue iconImg) {
                subreddit.setIconImg(iconImg);
            }
            
            public static void access$234100(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeIconImg(stringValue);
            }
            
            public static void access$234200(final Subreddit subreddit) {
                subreddit.clearIconImg();
            }
            
            public static void access$234300(final Subreddit subreddit, final StringValue description) {
                subreddit.setDescription(description);
            }
            
            public static void access$234400(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeDescription(stringValue);
            }
            
            public static void access$234500(final Subreddit subreddit) {
                subreddit.clearDescription();
            }
            
            public static void access$234600(final Subreddit subreddit, final StringValue submitLinkLabel) {
                subreddit.setSubmitLinkLabel(submitLinkLabel);
            }
            
            public static void access$234700(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeSubmitLinkLabel(stringValue);
            }
            
            public static void access$234800(final Subreddit subreddit) {
                subreddit.clearSubmitLinkLabel();
            }
            
            public static void access$234900(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.setHeaderSize(n, int32Value);
            }
            
            public static void access$235000(final Subreddit subreddit, final Int32Value int32Value) {
                subreddit.addHeaderSize(int32Value);
            }
            
            public static void access$235100(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.addHeaderSize(n, int32Value);
            }
            
            public static void access$235200(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllHeaderSize(iterable);
            }
            
            public static void access$235300(final Subreddit subreddit) {
                subreddit.clearHeaderSize();
            }
            
            public static void access$235400(final Subreddit subreddit, final int n) {
                subreddit.removeHeaderSize(n);
            }
            
            public static void access$235500(final Subreddit subreddit, final BoolValue restrictPosting) {
                subreddit.setRestrictPosting(restrictPosting);
            }
            
            public static void access$235600(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeRestrictPosting(boolValue);
            }
            
            public static void access$235700(final Subreddit subreddit) {
                subreddit.clearRestrictPosting();
            }
            
            public static void access$235800(final Subreddit subreddit, final BoolValue restrictCommenting) {
                subreddit.setRestrictCommenting(restrictCommenting);
            }
            
            public static void access$235900(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeRestrictCommenting(boolValue);
            }
            
            public static void access$236000(final Subreddit subreddit) {
                subreddit.clearRestrictCommenting();
            }
            
            public static void access$236100(final Subreddit subreddit, final Int64Value subscribers) {
                subreddit.setSubscribers(subscribers);
            }
            
            public static void access$236200(final Subreddit subreddit, final Int64Value int64Value) {
                subreddit.mergeSubscribers(int64Value);
            }
            
            public static void access$236300(final Subreddit subreddit) {
                subreddit.clearSubscribers();
            }
            
            public static void access$236400(final Subreddit subreddit, final StringValue submitTextLabel) {
                subreddit.setSubmitTextLabel(submitTextLabel);
            }
            
            public static void access$236500(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeSubmitTextLabel(stringValue);
            }
            
            public static void access$236600(final Subreddit subreddit) {
                subreddit.clearSubmitTextLabel();
            }
            
            public static void access$236700(final Subreddit subreddit, final BoolValue isDefaultIcon) {
                subreddit.setIsDefaultIcon(isDefaultIcon);
            }
            
            public static void access$236800(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeIsDefaultIcon(boolValue);
            }
            
            public static void access$236900(final Subreddit subreddit) {
                subreddit.clearIsDefaultIcon();
            }
            
            public static void access$237000(final Subreddit subreddit, final StringValue linkFlairPosition) {
                subreddit.setLinkFlairPosition(linkFlairPosition);
            }
            
            public static void access$237100(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeLinkFlairPosition(stringValue);
            }
            
            public static void access$237200(final Subreddit subreddit) {
                subreddit.clearLinkFlairPosition();
            }
            
            public static void access$237300(final Subreddit subreddit, final StringValue displayNamePrefixed) {
                subreddit.setDisplayNamePrefixed(displayNamePrefixed);
            }
            
            public static void access$237400(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeDisplayNamePrefixed(stringValue);
            }
            
            public static void access$237500(final Subreddit subreddit) {
                subreddit.clearDisplayNamePrefixed();
            }
            
            public static void access$237600(final Subreddit subreddit, final StringValue keyColor) {
                subreddit.setKeyColor(keyColor);
            }
            
            public static void access$237700(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeKeyColor(stringValue);
            }
            
            public static void access$237800(final Subreddit subreddit) {
                subreddit.clearKeyColor();
            }
            
            public static void access$237900(final Subreddit subreddit, final StringValue name) {
                subreddit.setName(name);
            }
            
            public static void access$238000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeName(stringValue);
            }
            
            public static void access$238100(final Subreddit subreddit) {
                subreddit.clearName();
            }
            
            public static void access$238200(final Subreddit subreddit, final BoolValue isDefaultBanner) {
                subreddit.setIsDefaultBanner(isDefaultBanner);
            }
            
            public static void access$238300(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeIsDefaultBanner(boolValue);
            }
            
            public static void access$238400(final Subreddit subreddit) {
                subreddit.clearIsDefaultBanner();
            }
            
            public static void access$238500(final Subreddit subreddit, final StringValue url) {
                subreddit.setUrl(url);
            }
            
            public static void access$238600(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeUrl(stringValue);
            }
            
            public static void access$238700(final Subreddit subreddit) {
                subreddit.clearUrl();
            }
            
            public static void access$238800(final Subreddit subreddit, final BoolValue quarantine) {
                subreddit.setQuarantine(quarantine);
            }
            
            public static void access$238900(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeQuarantine(boolValue);
            }
            
            public static void access$239000(final Subreddit subreddit) {
                subreddit.clearQuarantine();
            }
            
            public static void access$239100(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.setBannerSize(n, int32Value);
            }
            
            public static void access$239200(final Subreddit subreddit, final Int32Value int32Value) {
                subreddit.addBannerSize(int32Value);
            }
            
            public static void access$239300(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.addBannerSize(n, int32Value);
            }
            
            public static void access$239400(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllBannerSize(iterable);
            }
            
            public static void access$239500(final Subreddit subreddit) {
                subreddit.clearBannerSize();
            }
            
            public static void access$239600(final Subreddit subreddit, final int n) {
                subreddit.removeBannerSize(n);
            }
            
            public static void access$239700(final Subreddit subreddit, final BoolValue userIsModerator) {
                subreddit.setUserIsModerator(userIsModerator);
            }
            
            public static void access$239800(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsModerator(boolValue);
            }
            
            public static void access$239900(final Subreddit subreddit) {
                subreddit.clearUserIsModerator();
            }
            
            public static void access$240000(final Subreddit subreddit, final BoolValue acceptFollowers) {
                subreddit.setAcceptFollowers(acceptFollowers);
            }
            
            public static void access$240100(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeAcceptFollowers(boolValue);
            }
            
            public static void access$240200(final Subreddit subreddit) {
                subreddit.clearAcceptFollowers();
            }
            
            public static void access$240300(final Subreddit subreddit, final StringValue publicDescription) {
                subreddit.setPublicDescription(publicDescription);
            }
            
            public static void access$240400(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergePublicDescription(stringValue);
            }
            
            public static void access$240500(final Subreddit subreddit) {
                subreddit.clearPublicDescription();
            }
            
            public static void access$240600(final Subreddit subreddit, final BoolValue linkFlairEnabled) {
                subreddit.setLinkFlairEnabled(linkFlairEnabled);
            }
            
            public static void access$240700(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeLinkFlairEnabled(boolValue);
            }
            
            public static void access$240800(final Subreddit subreddit) {
                subreddit.clearLinkFlairEnabled();
            }
            
            public static void access$240900(final Subreddit subreddit, final BoolValue disableContributorRequests) {
                subreddit.setDisableContributorRequests(disableContributorRequests);
            }
            
            public static void access$241000(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeDisableContributorRequests(boolValue);
            }
            
            public static void access$241100(final Subreddit subreddit) {
                subreddit.clearDisableContributorRequests();
            }
            
            public static void access$241200(final Subreddit subreddit, final StringValue subredditType) {
                subreddit.setSubredditType(subredditType);
            }
            
            public static void access$241300(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeSubredditType(stringValue);
            }
            
            public static void access$241400(final Subreddit subreddit) {
                subreddit.clearSubredditType();
            }
            
            public static void access$241500(final Subreddit subreddit, final BoolValue userIsSubscriber) {
                subreddit.setUserIsSubscriber(userIsSubscriber);
            }
            
            public static void access$241600(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsSubscriber(boolValue);
            }
            
            public static void access$241700(final Subreddit subreddit) {
                subreddit.clearUserIsSubscriber();
            }
            
            private void addAllAllowedMediaInComments(final Iterable<? extends StringValue> iterable) {
                this.ensureAllowedMediaInCommentsIsMutable();
                com.google.protobuf.a.addAll((Iterable)iterable, (List)this.allowedMediaInComments_);
            }
            
            private void addAllBannerSize(final Iterable<? extends Int32Value> iterable) {
                this.ensureBannerSizeIsMutable();
                com.google.protobuf.a.addAll((Iterable)iterable, (List)this.bannerSize_);
            }
            
            private void addAllHeaderSize(final Iterable<? extends Int32Value> iterable) {
                this.ensureHeaderSizeIsMutable();
                com.google.protobuf.a.addAll((Iterable)iterable, (List)this.headerSize_);
            }
            
            private void addAllIconSize(final Iterable<? extends Int32Value> iterable) {
                this.ensureIconSizeIsMutable();
                com.google.protobuf.a.addAll((Iterable)iterable, (List)this.iconSize_);
            }
            
            private void addAllPreviousNames(final Iterable<? extends StringValue> iterable) {
                this.ensurePreviousNamesIsMutable();
                com.google.protobuf.a.addAll((Iterable)iterable, (List)this.previousNames_);
            }
            
            private void addAllowedMediaInComments(final int n, final StringValue stringValue) {
                stringValue.getClass();
                this.ensureAllowedMediaInCommentsIsMutable();
                ((List<StringValue>)this.allowedMediaInComments_).add(n, stringValue);
            }
            
            private void addAllowedMediaInComments(final StringValue stringValue) {
                stringValue.getClass();
                this.ensureAllowedMediaInCommentsIsMutable();
                ((List<StringValue>)this.allowedMediaInComments_).add(stringValue);
            }
            
            private void addBannerSize(final int n, final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureBannerSizeIsMutable();
                ((List<Int32Value>)this.bannerSize_).add(n, int32Value);
            }
            
            private void addBannerSize(final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureBannerSizeIsMutable();
                ((List<Int32Value>)this.bannerSize_).add(int32Value);
            }
            
            private void addHeaderSize(final int n, final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureHeaderSizeIsMutable();
                ((List<Int32Value>)this.headerSize_).add(n, int32Value);
            }
            
            private void addHeaderSize(final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureHeaderSizeIsMutable();
                ((List<Int32Value>)this.headerSize_).add(int32Value);
            }
            
            private void addIconSize(final int n, final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureIconSizeIsMutable();
                ((List<Int32Value>)this.iconSize_).add(n, int32Value);
            }
            
            private void addIconSize(final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureIconSizeIsMutable();
                ((List<Int32Value>)this.iconSize_).add(int32Value);
            }
            
            private void addPreviousNames(final int n, final StringValue stringValue) {
                stringValue.getClass();
                this.ensurePreviousNamesIsMutable();
                ((List<StringValue>)this.previousNames_).add(n, stringValue);
            }
            
            private void addPreviousNames(final StringValue stringValue) {
                stringValue.getClass();
                this.ensurePreviousNamesIsMutable();
                ((List<StringValue>)this.previousNames_).add(stringValue);
            }
            
            private void clearAcceptFollowers() {
                this.acceptFollowers_ = null;
            }
            
            private void clearAllowedMediaInComments() {
                this.allowedMediaInComments_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
            }
            
            private void clearBannerImg() {
                this.bannerImg_ = null;
            }
            
            private void clearBannerSize() {
                this.bannerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
            }
            
            private void clearCommunityIcon() {
                this.communityIcon_ = null;
            }
            
            private void clearDefaultSet() {
                this.defaultSet_ = null;
            }
            
            private void clearDescription() {
                this.description_ = null;
            }
            
            private void clearDisableContributorRequests() {
                this.disableContributorRequests_ = null;
            }
            
            private void clearDisplayName() {
                this.displayName_ = null;
            }
            
            private void clearDisplayNamePrefixed() {
                this.displayNamePrefixed_ = null;
            }
            
            private void clearFreeFormReports() {
                this.freeFormReports_ = null;
            }
            
            private void clearHeaderImg() {
                this.headerImg_ = null;
            }
            
            private void clearHeaderSize() {
                this.headerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
            }
            
            private void clearIconColor() {
                this.iconColor_ = null;
            }
            
            private void clearIconImg() {
                this.iconImg_ = null;
            }
            
            private void clearIconSize() {
                this.iconSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
            }
            
            private void clearIsDefaultBanner() {
                this.isDefaultBanner_ = null;
            }
            
            private void clearIsDefaultIcon() {
                this.isDefaultIcon_ = null;
            }
            
            private void clearKeyColor() {
                this.keyColor_ = null;
            }
            
            private void clearLinkFlairEnabled() {
                this.linkFlairEnabled_ = null;
            }
            
            private void clearLinkFlairPosition() {
                this.linkFlairPosition_ = null;
            }
            
            private void clearName() {
                this.name_ = null;
            }
            
            private void clearOver18() {
                this.over18_ = null;
            }
            
            private void clearPreviousNames() {
                this.previousNames_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
            }
            
            private void clearPrimaryColor() {
                this.primaryColor_ = null;
            }
            
            private void clearPublicDescription() {
                this.publicDescription_ = null;
            }
            
            private void clearQuarantine() {
                this.quarantine_ = null;
            }
            
            private void clearRestrictCommenting() {
                this.restrictCommenting_ = null;
            }
            
            private void clearRestrictPosting() {
                this.restrictPosting_ = null;
            }
            
            private void clearShowMedia() {
                this.showMedia_ = null;
            }
            
            private void clearSubmitLinkLabel() {
                this.submitLinkLabel_ = null;
            }
            
            private void clearSubmitTextLabel() {
                this.submitTextLabel_ = null;
            }
            
            private void clearSubredditType() {
                this.subredditType_ = null;
            }
            
            private void clearSubscribers() {
                this.subscribers_ = null;
            }
            
            private void clearTitle() {
                this.title_ = null;
            }
            
            private void clearUrl() {
                this.url_ = null;
            }
            
            private void clearUserIsBanned() {
                this.userIsBanned_ = null;
            }
            
            private void clearUserIsContributor() {
                this.userIsContributor_ = null;
            }
            
            private void clearUserIsModerator() {
                this.userIsModerator_ = null;
            }
            
            private void clearUserIsMuted() {
                this.userIsMuted_ = null;
            }
            
            private void clearUserIsSubscriber() {
                this.userIsSubscriber_ = null;
            }
            
            private void ensureAllowedMediaInCommentsIsMutable() {
                final Internal$j<StringValue> allowedMediaInComments_ = this.allowedMediaInComments_;
                if (!allowedMediaInComments_.E0()) {
                    this.allowedMediaInComments_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)allowedMediaInComments_);
                }
            }
            
            private void ensureBannerSizeIsMutable() {
                final Internal$j<Int32Value> bannerSize_ = this.bannerSize_;
                if (!bannerSize_.E0()) {
                    this.bannerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.mutableCopy((Internal$j)bannerSize_);
                }
            }
            
            private void ensureHeaderSizeIsMutable() {
                final Internal$j<Int32Value> headerSize_ = this.headerSize_;
                if (!headerSize_.E0()) {
                    this.headerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.mutableCopy((Internal$j)headerSize_);
                }
            }
            
            private void ensureIconSizeIsMutable() {
                final Internal$j<Int32Value> iconSize_ = this.iconSize_;
                if (!iconSize_.E0()) {
                    this.iconSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.mutableCopy((Internal$j)iconSize_);
                }
            }
            
            private void ensurePreviousNamesIsMutable() {
                final Internal$j<StringValue> previousNames_ = this.previousNames_;
                if (!previousNames_.E0()) {
                    this.previousNames_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)previousNames_);
                }
            }
            
            public static Subreddit getDefaultInstance() {
                return Subreddit.DEFAULT_INSTANCE;
            }
            
            private void mergeAcceptFollowers(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue acceptFollowers_ = this.acceptFollowers_;
                BoolValue acceptFollowers_2 = boolValue;
                if (acceptFollowers_ != null) {
                    acceptFollowers_2 = boolValue;
                    if (acceptFollowers_ != BoolValue.getDefaultInstance()) {
                        acceptFollowers_2 = (BoolValue)o.g(this.acceptFollowers_, boolValue);
                    }
                }
                this.acceptFollowers_ = acceptFollowers_2;
            }
            
            private void mergeBannerImg(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue bannerImg_ = this.bannerImg_;
                StringValue bannerImg_2 = stringValue;
                if (bannerImg_ != null) {
                    bannerImg_2 = stringValue;
                    if (bannerImg_ != StringValue.getDefaultInstance()) {
                        bannerImg_2 = (StringValue)w.e(this.bannerImg_, stringValue);
                    }
                }
                this.bannerImg_ = bannerImg_2;
            }
            
            private void mergeCommunityIcon(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue communityIcon_ = this.communityIcon_;
                StringValue communityIcon_2 = stringValue;
                if (communityIcon_ != null) {
                    communityIcon_2 = stringValue;
                    if (communityIcon_ != StringValue.getDefaultInstance()) {
                        communityIcon_2 = (StringValue)w.e(this.communityIcon_, stringValue);
                    }
                }
                this.communityIcon_ = communityIcon_2;
            }
            
            private void mergeDefaultSet(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue defaultSet_ = this.defaultSet_;
                BoolValue defaultSet_2 = boolValue;
                if (defaultSet_ != null) {
                    defaultSet_2 = boolValue;
                    if (defaultSet_ != BoolValue.getDefaultInstance()) {
                        defaultSet_2 = (BoolValue)o.g(this.defaultSet_, boolValue);
                    }
                }
                this.defaultSet_ = defaultSet_2;
            }
            
            private void mergeDescription(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue description_ = this.description_;
                StringValue description_2 = stringValue;
                if (description_ != null) {
                    description_2 = stringValue;
                    if (description_ != StringValue.getDefaultInstance()) {
                        description_2 = (StringValue)w.e(this.description_, stringValue);
                    }
                }
                this.description_ = description_2;
            }
            
            private void mergeDisableContributorRequests(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue disableContributorRequests_ = this.disableContributorRequests_;
                BoolValue disableContributorRequests_2 = boolValue;
                if (disableContributorRequests_ != null) {
                    disableContributorRequests_2 = boolValue;
                    if (disableContributorRequests_ != BoolValue.getDefaultInstance()) {
                        disableContributorRequests_2 = (BoolValue)o.g(this.disableContributorRequests_, boolValue);
                    }
                }
                this.disableContributorRequests_ = disableContributorRequests_2;
            }
            
            private void mergeDisplayName(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue displayName_ = this.displayName_;
                StringValue displayName_2 = stringValue;
                if (displayName_ != null) {
                    displayName_2 = stringValue;
                    if (displayName_ != StringValue.getDefaultInstance()) {
                        displayName_2 = (StringValue)w.e(this.displayName_, stringValue);
                    }
                }
                this.displayName_ = displayName_2;
            }
            
            private void mergeDisplayNamePrefixed(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue displayNamePrefixed_ = this.displayNamePrefixed_;
                StringValue displayNamePrefixed_2 = stringValue;
                if (displayNamePrefixed_ != null) {
                    displayNamePrefixed_2 = stringValue;
                    if (displayNamePrefixed_ != StringValue.getDefaultInstance()) {
                        displayNamePrefixed_2 = (StringValue)w.e(this.displayNamePrefixed_, stringValue);
                    }
                }
                this.displayNamePrefixed_ = displayNamePrefixed_2;
            }
            
            private void mergeFreeFormReports(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue freeFormReports_ = this.freeFormReports_;
                BoolValue freeFormReports_2 = boolValue;
                if (freeFormReports_ != null) {
                    freeFormReports_2 = boolValue;
                    if (freeFormReports_ != BoolValue.getDefaultInstance()) {
                        freeFormReports_2 = (BoolValue)o.g(this.freeFormReports_, boolValue);
                    }
                }
                this.freeFormReports_ = freeFormReports_2;
            }
            
            private void mergeHeaderImg(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue headerImg_ = this.headerImg_;
                StringValue headerImg_2 = stringValue;
                if (headerImg_ != null) {
                    headerImg_2 = stringValue;
                    if (headerImg_ != StringValue.getDefaultInstance()) {
                        headerImg_2 = (StringValue)w.e(this.headerImg_, stringValue);
                    }
                }
                this.headerImg_ = headerImg_2;
            }
            
            private void mergeIconColor(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue iconColor_ = this.iconColor_;
                StringValue iconColor_2 = stringValue;
                if (iconColor_ != null) {
                    iconColor_2 = stringValue;
                    if (iconColor_ != StringValue.getDefaultInstance()) {
                        iconColor_2 = (StringValue)w.e(this.iconColor_, stringValue);
                    }
                }
                this.iconColor_ = iconColor_2;
            }
            
            private void mergeIconImg(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue iconImg_ = this.iconImg_;
                StringValue iconImg_2 = stringValue;
                if (iconImg_ != null) {
                    iconImg_2 = stringValue;
                    if (iconImg_ != StringValue.getDefaultInstance()) {
                        iconImg_2 = (StringValue)w.e(this.iconImg_, stringValue);
                    }
                }
                this.iconImg_ = iconImg_2;
            }
            
            private void mergeIsDefaultBanner(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue isDefaultBanner_ = this.isDefaultBanner_;
                BoolValue isDefaultBanner_2 = boolValue;
                if (isDefaultBanner_ != null) {
                    isDefaultBanner_2 = boolValue;
                    if (isDefaultBanner_ != BoolValue.getDefaultInstance()) {
                        isDefaultBanner_2 = (BoolValue)o.g(this.isDefaultBanner_, boolValue);
                    }
                }
                this.isDefaultBanner_ = isDefaultBanner_2;
            }
            
            private void mergeIsDefaultIcon(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue isDefaultIcon_ = this.isDefaultIcon_;
                BoolValue isDefaultIcon_2 = boolValue;
                if (isDefaultIcon_ != null) {
                    isDefaultIcon_2 = boolValue;
                    if (isDefaultIcon_ != BoolValue.getDefaultInstance()) {
                        isDefaultIcon_2 = (BoolValue)o.g(this.isDefaultIcon_, boolValue);
                    }
                }
                this.isDefaultIcon_ = isDefaultIcon_2;
            }
            
            private void mergeKeyColor(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue keyColor_ = this.keyColor_;
                StringValue keyColor_2 = stringValue;
                if (keyColor_ != null) {
                    keyColor_2 = stringValue;
                    if (keyColor_ != StringValue.getDefaultInstance()) {
                        keyColor_2 = (StringValue)w.e(this.keyColor_, stringValue);
                    }
                }
                this.keyColor_ = keyColor_2;
            }
            
            private void mergeLinkFlairEnabled(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue linkFlairEnabled_ = this.linkFlairEnabled_;
                BoolValue linkFlairEnabled_2 = boolValue;
                if (linkFlairEnabled_ != null) {
                    linkFlairEnabled_2 = boolValue;
                    if (linkFlairEnabled_ != BoolValue.getDefaultInstance()) {
                        linkFlairEnabled_2 = (BoolValue)o.g(this.linkFlairEnabled_, boolValue);
                    }
                }
                this.linkFlairEnabled_ = linkFlairEnabled_2;
            }
            
            private void mergeLinkFlairPosition(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue linkFlairPosition_ = this.linkFlairPosition_;
                StringValue linkFlairPosition_2 = stringValue;
                if (linkFlairPosition_ != null) {
                    linkFlairPosition_2 = stringValue;
                    if (linkFlairPosition_ != StringValue.getDefaultInstance()) {
                        linkFlairPosition_2 = (StringValue)w.e(this.linkFlairPosition_, stringValue);
                    }
                }
                this.linkFlairPosition_ = linkFlairPosition_2;
            }
            
            private void mergeName(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue name_ = this.name_;
                StringValue name_2 = stringValue;
                if (name_ != null) {
                    name_2 = stringValue;
                    if (name_ != StringValue.getDefaultInstance()) {
                        name_2 = (StringValue)w.e(this.name_, stringValue);
                    }
                }
                this.name_ = name_2;
            }
            
            private void mergeOver18(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue over18_ = this.over18_;
                BoolValue over18_2 = boolValue;
                if (over18_ != null) {
                    over18_2 = boolValue;
                    if (over18_ != BoolValue.getDefaultInstance()) {
                        over18_2 = (BoolValue)o.g(this.over18_, boolValue);
                    }
                }
                this.over18_ = over18_2;
            }
            
            private void mergePrimaryColor(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue primaryColor_ = this.primaryColor_;
                StringValue primaryColor_2 = stringValue;
                if (primaryColor_ != null) {
                    primaryColor_2 = stringValue;
                    if (primaryColor_ != StringValue.getDefaultInstance()) {
                        primaryColor_2 = (StringValue)w.e(this.primaryColor_, stringValue);
                    }
                }
                this.primaryColor_ = primaryColor_2;
            }
            
            private void mergePublicDescription(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue publicDescription_ = this.publicDescription_;
                StringValue publicDescription_2 = stringValue;
                if (publicDescription_ != null) {
                    publicDescription_2 = stringValue;
                    if (publicDescription_ != StringValue.getDefaultInstance()) {
                        publicDescription_2 = (StringValue)w.e(this.publicDescription_, stringValue);
                    }
                }
                this.publicDescription_ = publicDescription_2;
            }
            
            private void mergeQuarantine(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue quarantine_ = this.quarantine_;
                BoolValue quarantine_2 = boolValue;
                if (quarantine_ != null) {
                    quarantine_2 = boolValue;
                    if (quarantine_ != BoolValue.getDefaultInstance()) {
                        quarantine_2 = (BoolValue)o.g(this.quarantine_, boolValue);
                    }
                }
                this.quarantine_ = quarantine_2;
            }
            
            private void mergeRestrictCommenting(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue restrictCommenting_ = this.restrictCommenting_;
                BoolValue restrictCommenting_2 = boolValue;
                if (restrictCommenting_ != null) {
                    restrictCommenting_2 = boolValue;
                    if (restrictCommenting_ != BoolValue.getDefaultInstance()) {
                        restrictCommenting_2 = (BoolValue)o.g(this.restrictCommenting_, boolValue);
                    }
                }
                this.restrictCommenting_ = restrictCommenting_2;
            }
            
            private void mergeRestrictPosting(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue restrictPosting_ = this.restrictPosting_;
                BoolValue restrictPosting_2 = boolValue;
                if (restrictPosting_ != null) {
                    restrictPosting_2 = boolValue;
                    if (restrictPosting_ != BoolValue.getDefaultInstance()) {
                        restrictPosting_2 = (BoolValue)o.g(this.restrictPosting_, boolValue);
                    }
                }
                this.restrictPosting_ = restrictPosting_2;
            }
            
            private void mergeShowMedia(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue showMedia_ = this.showMedia_;
                BoolValue showMedia_2 = boolValue;
                if (showMedia_ != null) {
                    showMedia_2 = boolValue;
                    if (showMedia_ != BoolValue.getDefaultInstance()) {
                        showMedia_2 = (BoolValue)o.g(this.showMedia_, boolValue);
                    }
                }
                this.showMedia_ = showMedia_2;
            }
            
            private void mergeSubmitLinkLabel(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue submitLinkLabel_ = this.submitLinkLabel_;
                StringValue submitLinkLabel_2 = stringValue;
                if (submitLinkLabel_ != null) {
                    submitLinkLabel_2 = stringValue;
                    if (submitLinkLabel_ != StringValue.getDefaultInstance()) {
                        submitLinkLabel_2 = (StringValue)w.e(this.submitLinkLabel_, stringValue);
                    }
                }
                this.submitLinkLabel_ = submitLinkLabel_2;
            }
            
            private void mergeSubmitTextLabel(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue submitTextLabel_ = this.submitTextLabel_;
                StringValue submitTextLabel_2 = stringValue;
                if (submitTextLabel_ != null) {
                    submitTextLabel_2 = stringValue;
                    if (submitTextLabel_ != StringValue.getDefaultInstance()) {
                        submitTextLabel_2 = (StringValue)w.e(this.submitTextLabel_, stringValue);
                    }
                }
                this.submitTextLabel_ = submitTextLabel_2;
            }
            
            private void mergeSubredditType(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue subredditType_ = this.subredditType_;
                StringValue subredditType_2 = stringValue;
                if (subredditType_ != null) {
                    subredditType_2 = stringValue;
                    if (subredditType_ != StringValue.getDefaultInstance()) {
                        subredditType_2 = (StringValue)w.e(this.subredditType_, stringValue);
                    }
                }
                this.subredditType_ = subredditType_2;
            }
            
            private void mergeSubscribers(final Int64Value int64Value) {
                int64Value.getClass();
                final Int64Value subscribers_ = this.subscribers_;
                Int64Value subscribers_2 = int64Value;
                if (subscribers_ != null) {
                    subscribers_2 = int64Value;
                    if (subscribers_ != Int64Value.getDefaultInstance()) {
                        subscribers_2 = (Int64Value)h.b(this.subscribers_, int64Value);
                    }
                }
                this.subscribers_ = subscribers_2;
            }
            
            private void mergeTitle(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue title_ = this.title_;
                StringValue title_2 = stringValue;
                if (title_ != null) {
                    title_2 = stringValue;
                    if (title_ != StringValue.getDefaultInstance()) {
                        title_2 = (StringValue)w.e(this.title_, stringValue);
                    }
                }
                this.title_ = title_2;
            }
            
            private void mergeUrl(final StringValue stringValue) {
                stringValue.getClass();
                final StringValue url_ = this.url_;
                StringValue url_2 = stringValue;
                if (url_ != null) {
                    url_2 = stringValue;
                    if (url_ != StringValue.getDefaultInstance()) {
                        url_2 = (StringValue)w.e(this.url_, stringValue);
                    }
                }
                this.url_ = url_2;
            }
            
            private void mergeUserIsBanned(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue userIsBanned_ = this.userIsBanned_;
                BoolValue userIsBanned_2 = boolValue;
                if (userIsBanned_ != null) {
                    userIsBanned_2 = boolValue;
                    if (userIsBanned_ != BoolValue.getDefaultInstance()) {
                        userIsBanned_2 = (BoolValue)o.g(this.userIsBanned_, boolValue);
                    }
                }
                this.userIsBanned_ = userIsBanned_2;
            }
            
            private void mergeUserIsContributor(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue userIsContributor_ = this.userIsContributor_;
                BoolValue userIsContributor_2 = boolValue;
                if (userIsContributor_ != null) {
                    userIsContributor_2 = boolValue;
                    if (userIsContributor_ != BoolValue.getDefaultInstance()) {
                        userIsContributor_2 = (BoolValue)o.g(this.userIsContributor_, boolValue);
                    }
                }
                this.userIsContributor_ = userIsContributor_2;
            }
            
            private void mergeUserIsModerator(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue userIsModerator_ = this.userIsModerator_;
                BoolValue userIsModerator_2 = boolValue;
                if (userIsModerator_ != null) {
                    userIsModerator_2 = boolValue;
                    if (userIsModerator_ != BoolValue.getDefaultInstance()) {
                        userIsModerator_2 = (BoolValue)o.g(this.userIsModerator_, boolValue);
                    }
                }
                this.userIsModerator_ = userIsModerator_2;
            }
            
            private void mergeUserIsMuted(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue userIsMuted_ = this.userIsMuted_;
                BoolValue userIsMuted_2 = boolValue;
                if (userIsMuted_ != null) {
                    userIsMuted_2 = boolValue;
                    if (userIsMuted_ != BoolValue.getDefaultInstance()) {
                        userIsMuted_2 = (BoolValue)o.g(this.userIsMuted_, boolValue);
                    }
                }
                this.userIsMuted_ = userIsMuted_2;
            }
            
            private void mergeUserIsSubscriber(final BoolValue boolValue) {
                boolValue.getClass();
                final BoolValue userIsSubscriber_ = this.userIsSubscriber_;
                BoolValue userIsSubscriber_2 = boolValue;
                if (userIsSubscriber_ != null) {
                    userIsSubscriber_2 = boolValue;
                    if (userIsSubscriber_ != BoolValue.getDefaultInstance()) {
                        userIsSubscriber_2 = (BoolValue)o.g(this.userIsSubscriber_, boolValue);
                    }
                }
                this.userIsSubscriber_ = userIsSubscriber_2;
            }
            
            public static a newBuilder() {
                return (a)Subreddit.DEFAULT_INSTANCE.createBuilder();
            }
            
            public static a newBuilder(final Subreddit subreddit) {
                return (a)Subreddit.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subreddit);
            }
            
            public static Subreddit parseDelimitedFrom(final InputStream inputStream) throws IOException {
                return (Subreddit)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, inputStream);
            }
            
            public static Subreddit parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (Subreddit)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static Subreddit parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, byteString);
            }
            
            public static Subreddit parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, byteString, d0);
            }
            
            public static Subreddit parseFrom(final l l) throws IOException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, l);
            }
            
            public static Subreddit parseFrom(final l l, final d0 d0) throws IOException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, l, d0);
            }
            
            public static Subreddit parseFrom(final InputStream inputStream) throws IOException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, inputStream);
            }
            
            public static Subreddit parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static Subreddit parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, byteBuffer);
            }
            
            public static Subreddit parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, byteBuffer, d0);
            }
            
            public static Subreddit parseFrom(final byte[] array) throws InvalidProtocolBufferException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, array);
            }
            
            public static Subreddit parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
                return (Subreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE, array, d0);
            }
            
            public static n1<Subreddit> parser() {
                return (n1<Subreddit>)Subreddit.DEFAULT_INSTANCE.getParserForType();
            }
            
            private void removeAllowedMediaInComments(final int n) {
                this.ensureAllowedMediaInCommentsIsMutable();
                this.allowedMediaInComments_.remove(n);
            }
            
            private void removeBannerSize(final int n) {
                this.ensureBannerSizeIsMutable();
                this.bannerSize_.remove(n);
            }
            
            private void removeHeaderSize(final int n) {
                this.ensureHeaderSizeIsMutable();
                this.headerSize_.remove(n);
            }
            
            private void removeIconSize(final int n) {
                this.ensureIconSizeIsMutable();
                this.iconSize_.remove(n);
            }
            
            private void removePreviousNames(final int n) {
                this.ensurePreviousNamesIsMutable();
                this.previousNames_.remove(n);
            }
            
            private void setAcceptFollowers(final BoolValue acceptFollowers_) {
                acceptFollowers_.getClass();
                this.acceptFollowers_ = acceptFollowers_;
            }
            
            private void setAllowedMediaInComments(final int n, final StringValue stringValue) {
                stringValue.getClass();
                this.ensureAllowedMediaInCommentsIsMutable();
                ((List<StringValue>)this.allowedMediaInComments_).set(n, stringValue);
            }
            
            private void setBannerImg(final StringValue bannerImg_) {
                bannerImg_.getClass();
                this.bannerImg_ = bannerImg_;
            }
            
            private void setBannerSize(final int n, final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureBannerSizeIsMutable();
                ((List<Int32Value>)this.bannerSize_).set(n, int32Value);
            }
            
            private void setCommunityIcon(final StringValue communityIcon_) {
                communityIcon_.getClass();
                this.communityIcon_ = communityIcon_;
            }
            
            private void setDefaultSet(final BoolValue defaultSet_) {
                defaultSet_.getClass();
                this.defaultSet_ = defaultSet_;
            }
            
            private void setDescription(final StringValue description_) {
                description_.getClass();
                this.description_ = description_;
            }
            
            private void setDisableContributorRequests(final BoolValue disableContributorRequests_) {
                disableContributorRequests_.getClass();
                this.disableContributorRequests_ = disableContributorRequests_;
            }
            
            private void setDisplayName(final StringValue displayName_) {
                displayName_.getClass();
                this.displayName_ = displayName_;
            }
            
            private void setDisplayNamePrefixed(final StringValue displayNamePrefixed_) {
                displayNamePrefixed_.getClass();
                this.displayNamePrefixed_ = displayNamePrefixed_;
            }
            
            private void setFreeFormReports(final BoolValue freeFormReports_) {
                freeFormReports_.getClass();
                this.freeFormReports_ = freeFormReports_;
            }
            
            private void setHeaderImg(final StringValue headerImg_) {
                headerImg_.getClass();
                this.headerImg_ = headerImg_;
            }
            
            private void setHeaderSize(final int n, final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureHeaderSizeIsMutable();
                ((List<Int32Value>)this.headerSize_).set(n, int32Value);
            }
            
            private void setIconColor(final StringValue iconColor_) {
                iconColor_.getClass();
                this.iconColor_ = iconColor_;
            }
            
            private void setIconImg(final StringValue iconImg_) {
                iconImg_.getClass();
                this.iconImg_ = iconImg_;
            }
            
            private void setIconSize(final int n, final Int32Value int32Value) {
                int32Value.getClass();
                this.ensureIconSizeIsMutable();
                ((List<Int32Value>)this.iconSize_).set(n, int32Value);
            }
            
            private void setIsDefaultBanner(final BoolValue isDefaultBanner_) {
                isDefaultBanner_.getClass();
                this.isDefaultBanner_ = isDefaultBanner_;
            }
            
            private void setIsDefaultIcon(final BoolValue isDefaultIcon_) {
                isDefaultIcon_.getClass();
                this.isDefaultIcon_ = isDefaultIcon_;
            }
            
            private void setKeyColor(final StringValue keyColor_) {
                keyColor_.getClass();
                this.keyColor_ = keyColor_;
            }
            
            private void setLinkFlairEnabled(final BoolValue linkFlairEnabled_) {
                linkFlairEnabled_.getClass();
                this.linkFlairEnabled_ = linkFlairEnabled_;
            }
            
            private void setLinkFlairPosition(final StringValue linkFlairPosition_) {
                linkFlairPosition_.getClass();
                this.linkFlairPosition_ = linkFlairPosition_;
            }
            
            private void setName(final StringValue name_) {
                name_.getClass();
                this.name_ = name_;
            }
            
            private void setOver18(final BoolValue over18_) {
                over18_.getClass();
                this.over18_ = over18_;
            }
            
            private void setPreviousNames(final int n, final StringValue stringValue) {
                stringValue.getClass();
                this.ensurePreviousNamesIsMutable();
                ((List<StringValue>)this.previousNames_).set(n, stringValue);
            }
            
            private void setPrimaryColor(final StringValue primaryColor_) {
                primaryColor_.getClass();
                this.primaryColor_ = primaryColor_;
            }
            
            private void setPublicDescription(final StringValue publicDescription_) {
                publicDescription_.getClass();
                this.publicDescription_ = publicDescription_;
            }
            
            private void setQuarantine(final BoolValue quarantine_) {
                quarantine_.getClass();
                this.quarantine_ = quarantine_;
            }
            
            private void setRestrictCommenting(final BoolValue restrictCommenting_) {
                restrictCommenting_.getClass();
                this.restrictCommenting_ = restrictCommenting_;
            }
            
            private void setRestrictPosting(final BoolValue restrictPosting_) {
                restrictPosting_.getClass();
                this.restrictPosting_ = restrictPosting_;
            }
            
            private void setShowMedia(final BoolValue showMedia_) {
                showMedia_.getClass();
                this.showMedia_ = showMedia_;
            }
            
            private void setSubmitLinkLabel(final StringValue submitLinkLabel_) {
                submitLinkLabel_.getClass();
                this.submitLinkLabel_ = submitLinkLabel_;
            }
            
            private void setSubmitTextLabel(final StringValue submitTextLabel_) {
                submitTextLabel_.getClass();
                this.submitTextLabel_ = submitTextLabel_;
            }
            
            private void setSubredditType(final StringValue subredditType_) {
                subredditType_.getClass();
                this.subredditType_ = subredditType_;
            }
            
            private void setSubscribers(final Int64Value subscribers_) {
                subscribers_.getClass();
                this.subscribers_ = subscribers_;
            }
            
            private void setTitle(final StringValue title_) {
                title_.getClass();
                this.title_ = title_;
            }
            
            private void setUrl(final StringValue url_) {
                url_.getClass();
                this.url_ = url_;
            }
            
            private void setUserIsBanned(final BoolValue userIsBanned_) {
                userIsBanned_.getClass();
                this.userIsBanned_ = userIsBanned_;
            }
            
            private void setUserIsContributor(final BoolValue userIsContributor_) {
                userIsContributor_.getClass();
                this.userIsContributor_ = userIsContributor_;
            }
            
            private void setUserIsModerator(final BoolValue userIsModerator_) {
                userIsModerator_.getClass();
                this.userIsModerator_ = userIsModerator_;
            }
            
            private void setUserIsMuted(final BoolValue userIsMuted_) {
                userIsMuted_.getClass();
                this.userIsMuted_ = userIsMuted_;
            }
            
            private void setUserIsSubscriber(final BoolValue userIsSubscriber_) {
                userIsSubscriber_.getClass();
                this.userIsSubscriber_ = userIsSubscriber_;
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
                        final n1<Subreddit> parser;
                        if ((parser = Subreddit.PARSER) == null) {
                            synchronized (Subreddit.class) {
                                if (Subreddit.PARSER == null) {
                                    Subreddit.PARSER = (n1<Subreddit>)new GeneratedMessageLite$c((GeneratedMessageLite)Subreddit.DEFAULT_INSTANCE);
                                }
                            }
                        }
                        return parser;
                    }
                    case 4: {
                        return Subreddit.DEFAULT_INSTANCE;
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo((c1)Subreddit.DEFAULT_INSTANCE, "\u0000)\u0000\u0000\u0001))\u0000\u0005\u0000\u0001\t\u0002\t\u0003\t\u0004\u001b\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\u001b\u000f\t\u0010\u001b\u0011\t\u0012\t\u0013\t\u0014\t\u0015\u001b\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t \t!\t\"\u001b#\t$\t%\t&\t'\t(\t)\t", new Object[] { "defaultSet_", "userIsContributor_", "bannerImg_", "allowedMediaInComments_", StringValue.class, "userIsBanned_", "freeFormReports_", "communityIcon_", "showMedia_", "iconColor_", "userIsMuted_", "displayName_", "headerImg_", "title_", "previousNames_", StringValue.class, "over18_", "iconSize_", Int32Value.class, "primaryColor_", "iconImg_", "description_", "submitLinkLabel_", "headerSize_", Int32Value.class, "restrictPosting_", "restrictCommenting_", "subscribers_", "submitTextLabel_", "isDefaultIcon_", "linkFlairPosition_", "displayNamePrefixed_", "keyColor_", "name_", "isDefaultBanner_", "url_", "quarantine_", "bannerSize_", Int32Value.class, "userIsModerator_", "acceptFollowers_", "publicDescription_", "linkFlairEnabled_", "disableContributorRequests_", "subredditType_", "userIsSubscriber_" });
                    }
                    case 2: {
                        return new a();
                    }
                    case 1: {
                        return new Subreddit();
                    }
                }
            }
            
            public BoolValue getAcceptFollowers() {
                BoolValue boolValue;
                if ((boolValue = this.acceptFollowers_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getAllowedMediaInComments(final int n) {
                return ((List<StringValue>)this.allowedMediaInComments_).get(n);
            }
            
            public int getAllowedMediaInCommentsCount() {
                return ((List)this.allowedMediaInComments_).size();
            }
            
            public List<StringValue> getAllowedMediaInCommentsList() {
                return (List<StringValue>)this.allowedMediaInComments_;
            }
            
            public x1 getAllowedMediaInCommentsOrBuilder(final int n) {
                return ((List<x1>)this.allowedMediaInComments_).get(n);
            }
            
            public List<? extends x1> getAllowedMediaInCommentsOrBuilderList() {
                return (List<? extends x1>)this.allowedMediaInComments_;
            }
            
            public StringValue getBannerImg() {
                StringValue stringValue;
                if ((stringValue = this.bannerImg_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public Int32Value getBannerSize(final int n) {
                return ((List<Int32Value>)this.bannerSize_).get(n);
            }
            
            public int getBannerSizeCount() {
                return ((List)this.bannerSize_).size();
            }
            
            public List<Int32Value> getBannerSizeList() {
                return (List<Int32Value>)this.bannerSize_;
            }
            
            public l0 getBannerSizeOrBuilder(final int n) {
                return ((List<l0>)this.bannerSize_).get(n);
            }
            
            public List<? extends l0> getBannerSizeOrBuilderList() {
                return (List<? extends l0>)this.bannerSize_;
            }
            
            public StringValue getCommunityIcon() {
                StringValue stringValue;
                if ((stringValue = this.communityIcon_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public BoolValue getDefaultSet() {
                BoolValue boolValue;
                if ((boolValue = this.defaultSet_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getDescription() {
                StringValue stringValue;
                if ((stringValue = this.description_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public BoolValue getDisableContributorRequests() {
                BoolValue boolValue;
                if ((boolValue = this.disableContributorRequests_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getDisplayName() {
                StringValue stringValue;
                if ((stringValue = this.displayName_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getDisplayNamePrefixed() {
                StringValue stringValue;
                if ((stringValue = this.displayNamePrefixed_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public BoolValue getFreeFormReports() {
                BoolValue boolValue;
                if ((boolValue = this.freeFormReports_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getHeaderImg() {
                StringValue stringValue;
                if ((stringValue = this.headerImg_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public Int32Value getHeaderSize(final int n) {
                return ((List<Int32Value>)this.headerSize_).get(n);
            }
            
            public int getHeaderSizeCount() {
                return ((List)this.headerSize_).size();
            }
            
            public List<Int32Value> getHeaderSizeList() {
                return (List<Int32Value>)this.headerSize_;
            }
            
            public l0 getHeaderSizeOrBuilder(final int n) {
                return ((List<l0>)this.headerSize_).get(n);
            }
            
            public List<? extends l0> getHeaderSizeOrBuilderList() {
                return (List<? extends l0>)this.headerSize_;
            }
            
            public StringValue getIconColor() {
                StringValue stringValue;
                if ((stringValue = this.iconColor_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getIconImg() {
                StringValue stringValue;
                if ((stringValue = this.iconImg_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public Int32Value getIconSize(final int n) {
                return ((List<Int32Value>)this.iconSize_).get(n);
            }
            
            public int getIconSizeCount() {
                return ((List)this.iconSize_).size();
            }
            
            public List<Int32Value> getIconSizeList() {
                return (List<Int32Value>)this.iconSize_;
            }
            
            public l0 getIconSizeOrBuilder(final int n) {
                return ((List<l0>)this.iconSize_).get(n);
            }
            
            public List<? extends l0> getIconSizeOrBuilderList() {
                return (List<? extends l0>)this.iconSize_;
            }
            
            public BoolValue getIsDefaultBanner() {
                BoolValue boolValue;
                if ((boolValue = this.isDefaultBanner_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getIsDefaultIcon() {
                BoolValue boolValue;
                if ((boolValue = this.isDefaultIcon_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getKeyColor() {
                StringValue stringValue;
                if ((stringValue = this.keyColor_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public BoolValue getLinkFlairEnabled() {
                BoolValue boolValue;
                if ((boolValue = this.linkFlairEnabled_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getLinkFlairPosition() {
                StringValue stringValue;
                if ((stringValue = this.linkFlairPosition_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getName() {
                StringValue stringValue;
                if ((stringValue = this.name_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public BoolValue getOver18() {
                BoolValue boolValue;
                if ((boolValue = this.over18_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getPreviousNames(final int n) {
                return ((List<StringValue>)this.previousNames_).get(n);
            }
            
            public int getPreviousNamesCount() {
                return ((List)this.previousNames_).size();
            }
            
            public List<StringValue> getPreviousNamesList() {
                return (List<StringValue>)this.previousNames_;
            }
            
            public x1 getPreviousNamesOrBuilder(final int n) {
                return ((List<x1>)this.previousNames_).get(n);
            }
            
            public List<? extends x1> getPreviousNamesOrBuilderList() {
                return (List<? extends x1>)this.previousNames_;
            }
            
            public StringValue getPrimaryColor() {
                StringValue stringValue;
                if ((stringValue = this.primaryColor_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getPublicDescription() {
                StringValue stringValue;
                if ((stringValue = this.publicDescription_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public BoolValue getQuarantine() {
                BoolValue boolValue;
                if ((boolValue = this.quarantine_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getRestrictCommenting() {
                BoolValue boolValue;
                if ((boolValue = this.restrictCommenting_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getRestrictPosting() {
                BoolValue boolValue;
                if ((boolValue = this.restrictPosting_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getShowMedia() {
                BoolValue boolValue;
                if ((boolValue = this.showMedia_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public StringValue getSubmitLinkLabel() {
                StringValue stringValue;
                if ((stringValue = this.submitLinkLabel_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getSubmitTextLabel() {
                StringValue stringValue;
                if ((stringValue = this.submitTextLabel_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getSubredditType() {
                StringValue stringValue;
                if ((stringValue = this.subredditType_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public Int64Value getSubscribers() {
                Int64Value int64Value;
                if ((int64Value = this.subscribers_) == null) {
                    int64Value = Int64Value.getDefaultInstance();
                }
                return int64Value;
            }
            
            public StringValue getTitle() {
                StringValue stringValue;
                if ((stringValue = this.title_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getUrl() {
                StringValue stringValue;
                if ((stringValue = this.url_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public BoolValue getUserIsBanned() {
                BoolValue boolValue;
                if ((boolValue = this.userIsBanned_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getUserIsContributor() {
                BoolValue boolValue;
                if ((boolValue = this.userIsContributor_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getUserIsModerator() {
                BoolValue boolValue;
                if ((boolValue = this.userIsModerator_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getUserIsMuted() {
                BoolValue boolValue;
                if ((boolValue = this.userIsMuted_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public BoolValue getUserIsSubscriber() {
                BoolValue boolValue;
                if ((boolValue = this.userIsSubscriber_) == null) {
                    boolValue = BoolValue.getDefaultInstance();
                }
                return boolValue;
            }
            
            public boolean hasAcceptFollowers() {
                return this.acceptFollowers_ != null;
            }
            
            public boolean hasBannerImg() {
                return this.bannerImg_ != null;
            }
            
            public boolean hasCommunityIcon() {
                return this.communityIcon_ != null;
            }
            
            public boolean hasDefaultSet() {
                return this.defaultSet_ != null;
            }
            
            public boolean hasDescription() {
                return this.description_ != null;
            }
            
            public boolean hasDisableContributorRequests() {
                return this.disableContributorRequests_ != null;
            }
            
            public boolean hasDisplayName() {
                return this.displayName_ != null;
            }
            
            public boolean hasDisplayNamePrefixed() {
                return this.displayNamePrefixed_ != null;
            }
            
            public boolean hasFreeFormReports() {
                return this.freeFormReports_ != null;
            }
            
            public boolean hasHeaderImg() {
                return this.headerImg_ != null;
            }
            
            public boolean hasIconColor() {
                return this.iconColor_ != null;
            }
            
            public boolean hasIconImg() {
                return this.iconImg_ != null;
            }
            
            public boolean hasIsDefaultBanner() {
                return this.isDefaultBanner_ != null;
            }
            
            public boolean hasIsDefaultIcon() {
                return this.isDefaultIcon_ != null;
            }
            
            public boolean hasKeyColor() {
                return this.keyColor_ != null;
            }
            
            public boolean hasLinkFlairEnabled() {
                return this.linkFlairEnabled_ != null;
            }
            
            public boolean hasLinkFlairPosition() {
                return this.linkFlairPosition_ != null;
            }
            
            public boolean hasName() {
                return this.name_ != null;
            }
            
            public boolean hasOver18() {
                return this.over18_ != null;
            }
            
            public boolean hasPrimaryColor() {
                return this.primaryColor_ != null;
            }
            
            public boolean hasPublicDescription() {
                return this.publicDescription_ != null;
            }
            
            public boolean hasQuarantine() {
                return this.quarantine_ != null;
            }
            
            public boolean hasRestrictCommenting() {
                return this.restrictCommenting_ != null;
            }
            
            public boolean hasRestrictPosting() {
                return this.restrictPosting_ != null;
            }
            
            public boolean hasShowMedia() {
                return this.showMedia_ != null;
            }
            
            public boolean hasSubmitLinkLabel() {
                return this.submitLinkLabel_ != null;
            }
            
            public boolean hasSubmitTextLabel() {
                return this.submitTextLabel_ != null;
            }
            
            public boolean hasSubredditType() {
                return this.subredditType_ != null;
            }
            
            public boolean hasSubscribers() {
                return this.subscribers_ != null;
            }
            
            public boolean hasTitle() {
                return this.title_ != null;
            }
            
            public boolean hasUrl() {
                return this.url_ != null;
            }
            
            public boolean hasUserIsBanned() {
                return this.userIsBanned_ != null;
            }
            
            public boolean hasUserIsContributor() {
                return this.userIsContributor_ != null;
            }
            
            public boolean hasUserIsModerator() {
                return this.userIsModerator_ != null;
            }
            
            public boolean hasUserIsMuted() {
                return this.userIsMuted_ != null;
            }
            
            public boolean hasUserIsSubscriber() {
                return this.userIsSubscriber_ != null;
            }
            
            public static final class a extends GeneratedMessageLite$b<Subreddit, a> implements d1
            {
                public a() {
                    super((GeneratedMessageLite)Subreddit.access$227900());
                }
            }
        }
        
        public static final class a extends GeneratedMessageLite$b<AccountData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)AccountData.access$241900());
            }
        }
    }
    
    public static final class b extends GeneratedMessageLite$b<SubredditsMsg$UserSearchResponse, b> implements d1
    {
        public b() {
            super((GeneratedMessageLite)SubredditsMsg$UserSearchResponse.access$249600());
        }
    }
}
