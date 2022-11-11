// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.users;

import java.util.List;
import com.google.protobuf.Internal$j;
import com.google.protobuf.GeneratedMessageLite$b;
import al0.b;
import com.google.protobuf.Int64Value;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import i90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import al0.f0;
import com.google.protobuf.StringValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class UsersMsg$UserTrophiesResponse extends GeneratedMessageLite<UsersMsg$UserTrophiesResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final UsersMsg$UserTrophiesResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<UsersMsg$UserTrophiesResponse> PARSER;
    private UserTrophiesData data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UserTrophiesResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UserTrophiesResponse()));
    }
    
    private UsersMsg$UserTrophiesResponse() {
    }
    
    public static /* synthetic */ UsersMsg$UserTrophiesResponse access$25100() {
        return UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE;
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static UsersMsg$UserTrophiesResponse getDefaultInstance() {
        return UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final UserTrophiesData data_) {
        data_.getClass();
        final UserTrophiesData data_2 = this.data_;
        if (data_2 != null && data_2 != UserTrophiesData.getDefaultInstance()) {
            final UserTrophiesData.a builder = UserTrophiesData.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (UserTrophiesData)builder.d();
        }
        else {
            this.data_ = data_;
        }
    }
    
    private void mergeKind(final StringValue kind_) {
        kind_.getClass();
        final StringValue kind_2 = this.kind_;
        if (kind_2 != null && kind_2 != StringValue.getDefaultInstance()) {
            this.kind_ = (StringValue)f0.e(this.kind_, kind_);
        }
        else {
            this.kind_ = kind_;
        }
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UserTrophiesResponse usersMsg$UserTrophiesResponse) {
        return (a)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UserTrophiesResponse);
    }
    
    public static UsersMsg$UserTrophiesResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserTrophiesResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final l l) throws IOException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UserTrophiesResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserTrophiesResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UserTrophiesResponse> parser() {
        return (n1<UsersMsg$UserTrophiesResponse>)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final UserTrophiesData data_) {
        data_.getClass();
        this.data_ = data_;
    }
    
    private void setKind(final StringValue kind_) {
        kind_.getClass();
        this.kind_ = kind_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (i90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<UsersMsg$UserTrophiesResponse> parser;
                if ((parser = UsersMsg$UserTrophiesResponse.PARSER) == null) {
                    synchronized (UsersMsg$UserTrophiesResponse.class) {
                        if (UsersMsg$UserTrophiesResponse.PARSER == null) {
                            UsersMsg$UserTrophiesResponse.PARSER = (n1<UsersMsg$UserTrophiesResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UserTrophiesResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UserTrophiesResponse();
            }
        }
    }
    
    public UserTrophiesData getData() {
        UserTrophiesData userTrophiesData;
        if ((userTrophiesData = this.data_) == null) {
            userTrophiesData = UserTrophiesData.getDefaultInstance();
        }
        return userTrophiesData;
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
    
    public static final class TrophiesData extends GeneratedMessageLite<TrophiesData, a> implements d1
    {
        public static final int AWARD_ID_FIELD_NUMBER = 6;
        private static final TrophiesData DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 8;
        public static final int GRANTED_AT_FIELD_NUMBER = 2;
        public static final int ICON_40_FIELD_NUMBER = 4;
        public static final int ICON_70_FIELD_NUMBER = 1;
        public static final int ID_FIELD_NUMBER = 7;
        public static final int NAME_FIELD_NUMBER = 5;
        private static volatile n1<TrophiesData> PARSER;
        public static final int URL_FIELD_NUMBER = 3;
        private StringValue awardId_;
        private StringValue description_;
        private Int64Value grantedAt_;
        private StringValue icon40_;
        private StringValue icon70_;
        private StringValue id_;
        private StringValue name_;
        private StringValue url_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)TrophiesData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new TrophiesData()));
        }
        
        private TrophiesData() {
        }
        
        public static /* synthetic */ TrophiesData access$20900() {
            return TrophiesData.DEFAULT_INSTANCE;
        }
        
        private void clearAwardId() {
            this.awardId_ = null;
        }
        
        private void clearDescription() {
            this.description_ = null;
        }
        
        private void clearGrantedAt() {
            this.grantedAt_ = null;
        }
        
        private void clearIcon40() {
            this.icon40_ = null;
        }
        
        private void clearIcon70() {
            this.icon70_ = null;
        }
        
        private void clearId() {
            this.id_ = null;
        }
        
        private void clearName() {
            this.name_ = null;
        }
        
        private void clearUrl() {
            this.url_ = null;
        }
        
        public static TrophiesData getDefaultInstance() {
            return TrophiesData.DEFAULT_INSTANCE;
        }
        
        private void mergeAwardId(final StringValue awardId_) {
            awardId_.getClass();
            final StringValue awardId_2 = this.awardId_;
            if (awardId_2 != null && awardId_2 != StringValue.getDefaultInstance()) {
                this.awardId_ = (StringValue)f0.e(this.awardId_, awardId_);
            }
            else {
                this.awardId_ = awardId_;
            }
        }
        
        private void mergeDescription(final StringValue description_) {
            description_.getClass();
            final StringValue description_2 = this.description_;
            if (description_2 != null && description_2 != StringValue.getDefaultInstance()) {
                this.description_ = (StringValue)f0.e(this.description_, description_);
            }
            else {
                this.description_ = description_;
            }
        }
        
        private void mergeGrantedAt(final Int64Value grantedAt_) {
            grantedAt_.getClass();
            final Int64Value grantedAt_2 = this.grantedAt_;
            if (grantedAt_2 != null && grantedAt_2 != Int64Value.getDefaultInstance()) {
                this.grantedAt_ = (Int64Value)b.g(this.grantedAt_, grantedAt_);
            }
            else {
                this.grantedAt_ = grantedAt_;
            }
        }
        
        private void mergeIcon40(final StringValue icon40_) {
            icon40_.getClass();
            final StringValue icon40_2 = this.icon40_;
            if (icon40_2 != null && icon40_2 != StringValue.getDefaultInstance()) {
                this.icon40_ = (StringValue)f0.e(this.icon40_, icon40_);
            }
            else {
                this.icon40_ = icon40_;
            }
        }
        
        private void mergeIcon70(final StringValue icon70_) {
            icon70_.getClass();
            final StringValue icon70_2 = this.icon70_;
            if (icon70_2 != null && icon70_2 != StringValue.getDefaultInstance()) {
                this.icon70_ = (StringValue)f0.e(this.icon70_, icon70_);
            }
            else {
                this.icon70_ = icon70_;
            }
        }
        
        private void mergeId(final StringValue id_) {
            id_.getClass();
            final StringValue id_2 = this.id_;
            if (id_2 != null && id_2 != StringValue.getDefaultInstance()) {
                this.id_ = (StringValue)f0.e(this.id_, id_);
            }
            else {
                this.id_ = id_;
            }
        }
        
        private void mergeName(final StringValue name_) {
            name_.getClass();
            final StringValue name_2 = this.name_;
            if (name_2 != null && name_2 != StringValue.getDefaultInstance()) {
                this.name_ = (StringValue)f0.e(this.name_, name_);
            }
            else {
                this.name_ = name_;
            }
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
            return (a)TrophiesData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final TrophiesData trophiesData) {
            return (a)TrophiesData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)trophiesData);
        }
        
        public static TrophiesData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (TrophiesData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static TrophiesData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (TrophiesData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static TrophiesData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, byteString);
        }
        
        public static TrophiesData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static TrophiesData parseFrom(final l l) throws IOException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, l);
        }
        
        public static TrophiesData parseFrom(final l l, final d0 d0) throws IOException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static TrophiesData parseFrom(final InputStream inputStream) throws IOException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static TrophiesData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static TrophiesData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static TrophiesData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static TrophiesData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, array);
        }
        
        public static TrophiesData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (TrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<TrophiesData> parser() {
            return (n1<TrophiesData>)TrophiesData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setAwardId(final StringValue awardId_) {
            awardId_.getClass();
            this.awardId_ = awardId_;
        }
        
        private void setDescription(final StringValue description_) {
            description_.getClass();
            this.description_ = description_;
        }
        
        private void setGrantedAt(final Int64Value grantedAt_) {
            grantedAt_.getClass();
            this.grantedAt_ = grantedAt_;
        }
        
        private void setIcon40(final StringValue icon40_) {
            icon40_.getClass();
            this.icon40_ = icon40_;
        }
        
        private void setIcon70(final StringValue icon70_) {
            icon70_.getClass();
            this.icon70_ = icon70_;
        }
        
        private void setId(final StringValue id_) {
            id_.getClass();
            this.id_ = id_;
        }
        
        private void setName(final StringValue name_) {
            name_.getClass();
            this.name_ = name_;
        }
        
        private void setUrl(final StringValue url_) {
            url_.getClass();
            this.url_ = url_;
        }
        
        public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
            switch (i90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                    final n1<TrophiesData> parser;
                    if ((parser = TrophiesData.PARSER) == null) {
                        synchronized (TrophiesData.class) {
                            if (TrophiesData.PARSER == null) {
                                TrophiesData.PARSER = (n1<TrophiesData>)new GeneratedMessageLite$c((GeneratedMessageLite)TrophiesData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return TrophiesData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)TrophiesData.DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t", new Object[] { "icon70_", "grantedAt_", "url_", "icon40_", "name_", "awardId_", "id_", "description_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new TrophiesData();
                }
            }
        }
        
        public StringValue getAwardId() {
            StringValue stringValue;
            if ((stringValue = this.awardId_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getDescription() {
            StringValue stringValue;
            if ((stringValue = this.description_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int64Value getGrantedAt() {
            Int64Value int64Value;
            if ((int64Value = this.grantedAt_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getIcon40() {
            StringValue stringValue;
            if ((stringValue = this.icon40_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getIcon70() {
            StringValue stringValue;
            if ((stringValue = this.icon70_) == null) {
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
        
        public StringValue getName() {
            StringValue stringValue;
            if ((stringValue = this.name_) == null) {
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
        
        public boolean hasAwardId() {
            return this.awardId_ != null;
        }
        
        public boolean hasDescription() {
            return this.description_ != null;
        }
        
        public boolean hasGrantedAt() {
            return this.grantedAt_ != null;
        }
        
        public boolean hasIcon40() {
            return this.icon40_ != null;
        }
        
        public boolean hasIcon70() {
            return this.icon70_ != null;
        }
        
        public boolean hasId() {
            return this.id_ != null;
        }
        
        public boolean hasName() {
            return this.name_ != null;
        }
        
        public boolean hasUrl() {
            return this.url_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<TrophiesData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)TrophiesData.access$20900());
            }
        }
    }
    
    public static final class TrophiesType extends GeneratedMessageLite<TrophiesType, a> implements UsersMsg$UserTrophiesResponse$b
    {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final TrophiesType DEFAULT_INSTANCE;
        public static final int KIND_FIELD_NUMBER = 1;
        private static volatile n1<TrophiesType> PARSER;
        private TrophiesData data_;
        private StringValue kind_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)TrophiesType.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new TrophiesType()));
        }
        
        private TrophiesType() {
        }
        
        public static /* synthetic */ TrophiesType access$23500() {
            return TrophiesType.DEFAULT_INSTANCE;
        }
        
        private void clearData() {
            this.data_ = null;
        }
        
        private void clearKind() {
            this.kind_ = null;
        }
        
        public static TrophiesType getDefaultInstance() {
            return TrophiesType.DEFAULT_INSTANCE;
        }
        
        private void mergeData(final TrophiesData data_) {
            data_.getClass();
            final TrophiesData data_2 = this.data_;
            if (data_2 != null && data_2 != TrophiesData.getDefaultInstance()) {
                final TrophiesData.a builder = TrophiesData.newBuilder(this.data_);
                builder.h((GeneratedMessageLite)data_);
                this.data_ = (TrophiesData)builder.d();
            }
            else {
                this.data_ = data_;
            }
        }
        
        private void mergeKind(final StringValue kind_) {
            kind_.getClass();
            final StringValue kind_2 = this.kind_;
            if (kind_2 != null && kind_2 != StringValue.getDefaultInstance()) {
                this.kind_ = (StringValue)f0.e(this.kind_, kind_);
            }
            else {
                this.kind_ = kind_;
            }
        }
        
        public static a newBuilder() {
            return (a)TrophiesType.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final TrophiesType trophiesType) {
            return (a)TrophiesType.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)trophiesType);
        }
        
        public static TrophiesType parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (TrophiesType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static TrophiesType parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (TrophiesType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static TrophiesType parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, byteString);
        }
        
        public static TrophiesType parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static TrophiesType parseFrom(final l l) throws IOException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, l);
        }
        
        public static TrophiesType parseFrom(final l l, final d0 d0) throws IOException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, l, d0);
        }
        
        public static TrophiesType parseFrom(final InputStream inputStream) throws IOException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static TrophiesType parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static TrophiesType parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static TrophiesType parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static TrophiesType parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, array);
        }
        
        public static TrophiesType parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (TrophiesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<TrophiesType> parser() {
            return (n1<TrophiesType>)TrophiesType.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setData(final TrophiesData data_) {
            data_.getClass();
            this.data_ = data_;
        }
        
        private void setKind(final StringValue kind_) {
            kind_.getClass();
            this.kind_ = kind_;
        }
        
        public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
            switch (i90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                    final n1<TrophiesType> parser;
                    if ((parser = TrophiesType.PARSER) == null) {
                        synchronized (TrophiesType.class) {
                            if (TrophiesType.PARSER == null) {
                                TrophiesType.PARSER = (n1<TrophiesType>)new GeneratedMessageLite$c((GeneratedMessageLite)TrophiesType.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return TrophiesType.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)TrophiesType.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new TrophiesType();
                }
            }
        }
        
        public TrophiesData getData() {
            GeneratedMessageLite<TrophiesData, TrophiesData.a> generatedMessageLite;
            if ((generatedMessageLite = this.data_) == null) {
                generatedMessageLite = TrophiesData.getDefaultInstance();
            }
            return (TrophiesData)generatedMessageLite;
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
        
        public static final class a extends GeneratedMessageLite$b<TrophiesType, a> implements UsersMsg$UserTrophiesResponse$b
        {
            public a() {
                super((GeneratedMessageLite)TrophiesType.access$23500());
            }
        }
    }
    
    public static final class UserTrophiesData extends GeneratedMessageLite<UserTrophiesData, a> implements d1
    {
        private static final UserTrophiesData DEFAULT_INSTANCE;
        private static volatile n1<UserTrophiesData> PARSER;
        public static final int TROPHIES_FIELD_NUMBER = 1;
        private Internal$j<TrophiesType> trophies_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)UserTrophiesData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UserTrophiesData()));
        }
        
        private UserTrophiesData() {
            this.trophies_ = (Internal$j<TrophiesType>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static /* synthetic */ UserTrophiesData access$24300() {
            return UserTrophiesData.DEFAULT_INSTANCE;
        }
        
        private void addAllTrophies(final Iterable<? extends TrophiesType> iterable) {
            this.ensureTrophiesIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.trophies_);
        }
        
        private void addTrophies(final int n, final TrophiesType trophiesType) {
            trophiesType.getClass();
            this.ensureTrophiesIsMutable();
            ((List<TrophiesType>)this.trophies_).add(n, trophiesType);
        }
        
        private void addTrophies(final TrophiesType trophiesType) {
            trophiesType.getClass();
            this.ensureTrophiesIsMutable();
            ((List<TrophiesType>)this.trophies_).add(trophiesType);
        }
        
        private void clearTrophies() {
            this.trophies_ = (Internal$j<TrophiesType>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void ensureTrophiesIsMutable() {
            final Internal$j<TrophiesType> trophies_ = this.trophies_;
            if (!trophies_.E0()) {
                this.trophies_ = (Internal$j<TrophiesType>)GeneratedMessageLite.mutableCopy((Internal$j)trophies_);
            }
        }
        
        public static UserTrophiesData getDefaultInstance() {
            return UserTrophiesData.DEFAULT_INSTANCE;
        }
        
        public static a newBuilder() {
            return (a)UserTrophiesData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final UserTrophiesData userTrophiesData) {
            return (a)UserTrophiesData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)userTrophiesData);
        }
        
        public static UserTrophiesData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (UserTrophiesData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserTrophiesData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserTrophiesData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserTrophiesData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, byteString);
        }
        
        public static UserTrophiesData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static UserTrophiesData parseFrom(final l l) throws IOException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, l);
        }
        
        public static UserTrophiesData parseFrom(final l l, final d0 d0) throws IOException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static UserTrophiesData parseFrom(final InputStream inputStream) throws IOException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserTrophiesData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserTrophiesData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static UserTrophiesData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static UserTrophiesData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, array);
        }
        
        public static UserTrophiesData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (UserTrophiesData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<UserTrophiesData> parser() {
            return (n1<UserTrophiesData>)UserTrophiesData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeTrophies(final int n) {
            this.ensureTrophiesIsMutable();
            this.trophies_.remove(n);
        }
        
        private void setTrophies(final int n, final TrophiesType trophiesType) {
            trophiesType.getClass();
            this.ensureTrophiesIsMutable();
            ((List<TrophiesType>)this.trophies_).set(n, trophiesType);
        }
        
        public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
            switch (i90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                    final n1<UserTrophiesData> parser;
                    if ((parser = UserTrophiesData.PARSER) == null) {
                        synchronized (UserTrophiesData.class) {
                            if (UserTrophiesData.PARSER == null) {
                                UserTrophiesData.PARSER = (n1<UserTrophiesData>)new GeneratedMessageLite$c((GeneratedMessageLite)UserTrophiesData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return UserTrophiesData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)UserTrophiesData.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "trophies_", TrophiesType.class });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new UserTrophiesData();
                }
            }
        }
        
        public TrophiesType getTrophies(final int n) {
            return ((List<TrophiesType>)this.trophies_).get(n);
        }
        
        public int getTrophiesCount() {
            return ((List)this.trophies_).size();
        }
        
        public List<TrophiesType> getTrophiesList() {
            return (List<TrophiesType>)this.trophies_;
        }
        
        public UsersMsg$UserTrophiesResponse$b getTrophiesOrBuilder(final int n) {
            return ((List<UsersMsg$UserTrophiesResponse$b>)this.trophies_).get(n);
        }
        
        public List<? extends UsersMsg$UserTrophiesResponse$b> getTrophiesOrBuilderList() {
            return (List<? extends UsersMsg$UserTrophiesResponse$b>)this.trophies_;
        }
        
        public static final class a extends GeneratedMessageLite$b<UserTrophiesData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)UserTrophiesData.access$24300());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UserTrophiesResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UserTrophiesResponse.access$25100());
        }
    }
}
