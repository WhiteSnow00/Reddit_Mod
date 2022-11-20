// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.m0;
import com.google.protobuf.Int64Value;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SubredditsMsg$SubredditAboutTrafficResponse extends GeneratedMessageLite<SubredditsMsg$SubredditAboutTrafficResponse, a> implements d1
{
    public static final int DAY_FIELD_NUMBER = 1;
    private static final SubredditsMsg$SubredditAboutTrafficResponse DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER = 2;
    public static final int MONTH_FIELD_NUMBER = 3;
    private static volatile n1<SubredditsMsg$SubredditAboutTrafficResponse> PARSER;
    private Internal$j<Data> day_;
    private Internal$j<Data> hour_;
    private Internal$j<Data> month_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditAboutTrafficResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditAboutTrafficResponse()));
    }
    
    private SubredditsMsg$SubredditAboutTrafficResponse() {
        this.day_ = (Internal$j<Data>)GeneratedMessageLite.emptyProtobufList();
        this.hour_ = (Internal$j<Data>)GeneratedMessageLite.emptyProtobufList();
        this.month_ = (Internal$j<Data>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse access$142200() {
        return SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$142300(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.setDay(n, data);
    }
    
    public static void access$142400(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.addDay(data);
    }
    
    public static void access$142500(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.addDay(n, data);
    }
    
    public static void access$142600(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final Iterable iterable) {
        subredditsMsg$SubredditAboutTrafficResponse.addAllDay(iterable);
    }
    
    public static void access$142700(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse) {
        subredditsMsg$SubredditAboutTrafficResponse.clearDay();
    }
    
    public static void access$142800(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n) {
        subredditsMsg$SubredditAboutTrafficResponse.removeDay(n);
    }
    
    public static void access$142900(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.setHour(n, data);
    }
    
    public static void access$143000(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.addHour(data);
    }
    
    public static void access$143100(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.addHour(n, data);
    }
    
    public static void access$143200(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final Iterable iterable) {
        subredditsMsg$SubredditAboutTrafficResponse.addAllHour(iterable);
    }
    
    public static void access$143300(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse) {
        subredditsMsg$SubredditAboutTrafficResponse.clearHour();
    }
    
    public static void access$143400(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n) {
        subredditsMsg$SubredditAboutTrafficResponse.removeHour(n);
    }
    
    public static void access$143500(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.setMonth(n, data);
    }
    
    public static void access$143600(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.addMonth(data);
    }
    
    public static void access$143700(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n, final Data data) {
        subredditsMsg$SubredditAboutTrafficResponse.addMonth(n, data);
    }
    
    public static void access$143800(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final Iterable iterable) {
        subredditsMsg$SubredditAboutTrafficResponse.addAllMonth(iterable);
    }
    
    public static void access$143900(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse) {
        subredditsMsg$SubredditAboutTrafficResponse.clearMonth();
    }
    
    public static void access$144000(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse, final int n) {
        subredditsMsg$SubredditAboutTrafficResponse.removeMonth(n);
    }
    
    private void addAllDay(final Iterable<? extends Data> iterable) {
        this.ensureDayIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.day_);
    }
    
    private void addAllHour(final Iterable<? extends Data> iterable) {
        this.ensureHourIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.hour_);
    }
    
    private void addAllMonth(final Iterable<? extends Data> iterable) {
        this.ensureMonthIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.month_);
    }
    
    private void addDay(final int n, final Data data) {
        data.getClass();
        this.ensureDayIsMutable();
        ((List<Data>)this.day_).add(n, data);
    }
    
    private void addDay(final Data data) {
        data.getClass();
        this.ensureDayIsMutable();
        ((List<Data>)this.day_).add(data);
    }
    
    private void addHour(final int n, final Data data) {
        data.getClass();
        this.ensureHourIsMutable();
        ((List<Data>)this.hour_).add(n, data);
    }
    
    private void addHour(final Data data) {
        data.getClass();
        this.ensureHourIsMutable();
        ((List<Data>)this.hour_).add(data);
    }
    
    private void addMonth(final int n, final Data data) {
        data.getClass();
        this.ensureMonthIsMutable();
        ((List<Data>)this.month_).add(n, data);
    }
    
    private void addMonth(final Data data) {
        data.getClass();
        this.ensureMonthIsMutable();
        ((List<Data>)this.month_).add(data);
    }
    
    private void clearDay() {
        this.day_ = (Internal$j<Data>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearHour() {
        this.hour_ = (Internal$j<Data>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearMonth() {
        this.month_ = (Internal$j<Data>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureDayIsMutable() {
        final Internal$j<Data> day_ = this.day_;
        if (!day_.E0()) {
            this.day_ = (Internal$j<Data>)GeneratedMessageLite.mutableCopy((Internal$j)day_);
        }
    }
    
    private void ensureHourIsMutable() {
        final Internal$j<Data> hour_ = this.hour_;
        if (!hour_.E0()) {
            this.hour_ = (Internal$j<Data>)GeneratedMessageLite.mutableCopy((Internal$j)hour_);
        }
    }
    
    private void ensureMonthIsMutable() {
        final Internal$j<Data> month_ = this.month_;
        if (!month_.E0()) {
            this.month_ = (Internal$j<Data>)GeneratedMessageLite.mutableCopy((Internal$j)month_);
        }
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse getDefaultInstance() {
        return SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditAboutTrafficResponse subredditsMsg$SubredditAboutTrafficResponse) {
        return (a)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditAboutTrafficResponse);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditAboutTrafficResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutTrafficResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditAboutTrafficResponse> parser() {
        return (n1<SubredditsMsg$SubredditAboutTrafficResponse>)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeDay(final int n) {
        this.ensureDayIsMutable();
        this.day_.remove(n);
    }
    
    private void removeHour(final int n) {
        this.ensureHourIsMutable();
        this.hour_.remove(n);
    }
    
    private void removeMonth(final int n) {
        this.ensureMonthIsMutable();
        this.month_.remove(n);
    }
    
    private void setDay(final int n, final Data data) {
        data.getClass();
        this.ensureDayIsMutable();
        ((List<Data>)this.day_).set(n, data);
    }
    
    private void setHour(final int n, final Data data) {
        data.getClass();
        this.ensureHourIsMutable();
        ((List<Data>)this.hour_).set(n, data);
    }
    
    private void setMonth(final int n, final Data data) {
        data.getClass();
        this.ensureMonthIsMutable();
        ((List<Data>)this.month_).set(n, data);
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
                final n1<SubredditsMsg$SubredditAboutTrafficResponse> parser;
                if ((parser = SubredditsMsg$SubredditAboutTrafficResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditAboutTrafficResponse.class) {
                        if (SubredditsMsg$SubredditAboutTrafficResponse.PARSER == null) {
                            SubredditsMsg$SubredditAboutTrafficResponse.PARSER = (n1<SubredditsMsg$SubredditAboutTrafficResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditAboutTrafficResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[] { "day_", Data.class, "hour_", Data.class, "month_", Data.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditAboutTrafficResponse();
            }
        }
    }
    
    public Data getDay(final int n) {
        return ((List<Data>)this.day_).get(n);
    }
    
    public int getDayCount() {
        return ((List)this.day_).size();
    }
    
    public List<Data> getDayList() {
        return (List<Data>)this.day_;
    }
    
    public SubredditsMsg$SubredditAboutTrafficResponse$b getDayOrBuilder(final int n) {
        return ((List<SubredditsMsg$SubredditAboutTrafficResponse$b>)this.day_).get(n);
    }
    
    public List<? extends SubredditsMsg$SubredditAboutTrafficResponse$b> getDayOrBuilderList() {
        return (List<? extends SubredditsMsg$SubredditAboutTrafficResponse$b>)this.day_;
    }
    
    public Data getHour(final int n) {
        return ((List<Data>)this.hour_).get(n);
    }
    
    public int getHourCount() {
        return ((List)this.hour_).size();
    }
    
    public List<Data> getHourList() {
        return (List<Data>)this.hour_;
    }
    
    public SubredditsMsg$SubredditAboutTrafficResponse$b getHourOrBuilder(final int n) {
        return ((List<SubredditsMsg$SubredditAboutTrafficResponse$b>)this.hour_).get(n);
    }
    
    public List<? extends SubredditsMsg$SubredditAboutTrafficResponse$b> getHourOrBuilderList() {
        return (List<? extends SubredditsMsg$SubredditAboutTrafficResponse$b>)this.hour_;
    }
    
    public Data getMonth(final int n) {
        return ((List<Data>)this.month_).get(n);
    }
    
    public int getMonthCount() {
        return ((List)this.month_).size();
    }
    
    public List<Data> getMonthList() {
        return (List<Data>)this.month_;
    }
    
    public SubredditsMsg$SubredditAboutTrafficResponse$b getMonthOrBuilder(final int n) {
        return ((List<SubredditsMsg$SubredditAboutTrafficResponse$b>)this.month_).get(n);
    }
    
    public List<? extends SubredditsMsg$SubredditAboutTrafficResponse$b> getMonthOrBuilderList() {
        return (List<? extends SubredditsMsg$SubredditAboutTrafficResponse$b>)this.month_;
    }
    
    public static final class Data extends GeneratedMessageLite<Data, a> implements SubredditsMsg$SubredditAboutTrafficResponse$b
    {
        private static final Data DEFAULT_INSTANCE;
        private static volatile n1<Data> PARSER;
        public static final int VALUES_FIELD_NUMBER = 1;
        private Internal$j<Int64Value> values_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)Data.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new Data()));
        }
        
        private Data() {
            this.values_ = (Internal$j<Int64Value>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static Data access$141400() {
            return Data.DEFAULT_INSTANCE;
        }
        
        public static void access$141500(final Data data, final int n, final Int64Value int64Value) {
            data.setValues(n, int64Value);
        }
        
        public static void access$141600(final Data data, final Int64Value int64Value) {
            data.addValues(int64Value);
        }
        
        public static void access$141700(final Data data, final int n, final Int64Value int64Value) {
            data.addValues(n, int64Value);
        }
        
        public static void access$141800(final Data data, final Iterable iterable) {
            data.addAllValues(iterable);
        }
        
        public static void access$141900(final Data data) {
            data.clearValues();
        }
        
        public static void access$142000(final Data data, final int n) {
            data.removeValues(n);
        }
        
        private void addAllValues(final Iterable<? extends Int64Value> iterable) {
            this.ensureValuesIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.values_);
        }
        
        private void addValues(final int n, final Int64Value int64Value) {
            int64Value.getClass();
            this.ensureValuesIsMutable();
            ((List<Int64Value>)this.values_).add(n, int64Value);
        }
        
        private void addValues(final Int64Value int64Value) {
            int64Value.getClass();
            this.ensureValuesIsMutable();
            ((List<Int64Value>)this.values_).add(int64Value);
        }
        
        private void clearValues() {
            this.values_ = (Internal$j<Int64Value>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void ensureValuesIsMutable() {
            final Internal$j<Int64Value> values_ = this.values_;
            if (!values_.E0()) {
                this.values_ = (Internal$j<Int64Value>)GeneratedMessageLite.mutableCopy((Internal$j)values_);
            }
        }
        
        public static Data getDefaultInstance() {
            return Data.DEFAULT_INSTANCE;
        }
        
        public static a newBuilder() {
            return (a)Data.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final Data data) {
            return (a)Data.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)data);
        }
        
        public static Data parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (Data)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, inputStream);
        }
        
        public static Data parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (Data)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static Data parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, byteString);
        }
        
        public static Data parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static Data parseFrom(final l l) throws IOException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, l);
        }
        
        public static Data parseFrom(final l l, final d0 d0) throws IOException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, l, d0);
        }
        
        public static Data parseFrom(final InputStream inputStream) throws IOException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, inputStream);
        }
        
        public static Data parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static Data parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static Data parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static Data parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, array);
        }
        
        public static Data parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (Data)GeneratedMessageLite.parseFrom((GeneratedMessageLite)Data.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<Data> parser() {
            return (n1<Data>)Data.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeValues(final int n) {
            this.ensureValuesIsMutable();
            this.values_.remove(n);
        }
        
        private void setValues(final int n, final Int64Value int64Value) {
            int64Value.getClass();
            this.ensureValuesIsMutable();
            ((List<Int64Value>)this.values_).set(n, int64Value);
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
                    final n1<Data> parser;
                    if ((parser = Data.PARSER) == null) {
                        synchronized (Data.class) {
                            if (Data.PARSER == null) {
                                Data.PARSER = (n1<Data>)new GeneratedMessageLite$c((GeneratedMessageLite)Data.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return Data.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)Data.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "values_", Int64Value.class });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new Data();
                }
            }
        }
        
        public Int64Value getValues(final int n) {
            return ((List<Int64Value>)this.values_).get(n);
        }
        
        public int getValuesCount() {
            return ((List)this.values_).size();
        }
        
        public List<Int64Value> getValuesList() {
            return (List<Int64Value>)this.values_;
        }
        
        public m0 getValuesOrBuilder(final int n) {
            return ((List<m0>)this.values_).get(n);
        }
        
        public List<? extends m0> getValuesOrBuilderList() {
            return (List<? extends m0>)this.values_;
        }
        
        public static final class a extends GeneratedMessageLite$b<Data, a> implements SubredditsMsg$SubredditAboutTrafficResponse$b
        {
            public a() {
                super((GeneratedMessageLite)Data.access$141400());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditAboutTrafficResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditAboutTrafficResponse.access$142200());
        }
    }
}
