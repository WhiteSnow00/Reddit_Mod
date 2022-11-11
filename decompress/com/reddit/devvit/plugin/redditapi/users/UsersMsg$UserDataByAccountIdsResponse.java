// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.users;

import java.util.HashMap;
import java.util.AbstractMap;
import com.google.protobuf.GeneratedMessageLite$b;
import al0.f0;
import al0.b;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.Int64Value;
import java.util.Collections;
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
import java.util.Map;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class UsersMsg$UserDataByAccountIdsResponse extends GeneratedMessageLite<UsersMsg$UserDataByAccountIdsResponse, a> implements d1
{
    private static final UsersMsg$UserDataByAccountIdsResponse DEFAULT_INSTANCE;
    private static volatile n1<UsersMsg$UserDataByAccountIdsResponse> PARSER;
    public static final int USERS_FIELD_NUMBER = 1;
    private MapFieldLite<String, UserAccountData> users_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UserDataByAccountIdsResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UserDataByAccountIdsResponse()));
    }
    
    private UsersMsg$UserDataByAccountIdsResponse() {
        this.users_ = (MapFieldLite<String, UserAccountData>)MapFieldLite.emptyMapField();
    }
    
    public static /* synthetic */ UsersMsg$UserDataByAccountIdsResponse access$20600() {
        return UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE;
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse getDefaultInstance() {
        return UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE;
    }
    
    private Map<String, UserAccountData> getMutableUsersMap() {
        return (Map<String, UserAccountData>)this.internalGetMutableUsers();
    }
    
    private MapFieldLite<String, UserAccountData> internalGetMutableUsers() {
        if (!this.users_.isMutable()) {
            this.users_ = (MapFieldLite<String, UserAccountData>)this.users_.mutableCopy();
        }
        return this.users_;
    }
    
    private MapFieldLite<String, UserAccountData> internalGetUsers() {
        return this.users_;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UserDataByAccountIdsResponse usersMsg$UserDataByAccountIdsResponse) {
        return (a)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UserDataByAccountIdsResponse);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final l l) throws IOException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UserDataByAccountIdsResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserDataByAccountIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UserDataByAccountIdsResponse> parser() {
        return (n1<UsersMsg$UserDataByAccountIdsResponse>)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    public boolean containsUsers(final String s) {
        s.getClass();
        return ((AbstractMap)this.internalGetUsers()).containsKey(s);
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
                final n1<UsersMsg$UserDataByAccountIdsResponse> parser;
                if ((parser = UsersMsg$UserDataByAccountIdsResponse.PARSER) == null) {
                    synchronized (UsersMsg$UserDataByAccountIdsResponse.class) {
                        if (UsersMsg$UserDataByAccountIdsResponse.PARSER == null) {
                            UsersMsg$UserDataByAccountIdsResponse.PARSER = (n1<UsersMsg$UserDataByAccountIdsResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UserDataByAccountIdsResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "users_", UsersMsg$UserDataByAccountIdsResponse.UsersMsg$UserDataByAccountIdsResponse$b.a });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UserDataByAccountIdsResponse();
            }
        }
    }
    
    @Deprecated
    public Map<String, UserAccountData> getUsers() {
        return this.getUsersMap();
    }
    
    public int getUsersCount() {
        return ((AbstractMap)this.internalGetUsers()).size();
    }
    
    public Map<String, UserAccountData> getUsersMap() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends UserAccountData>)this.internalGetUsers());
    }
    
    public UserAccountData getUsersOrDefault(final String s, UserAccountData userAccountData) {
        s.getClass();
        final MapFieldLite<String, UserAccountData> internalGetUsers = this.internalGetUsers();
        if (((HashMap)internalGetUsers).containsKey(s)) {
            userAccountData = internalGetUsers.get((Object)s);
        }
        return userAccountData;
    }
    
    public UserAccountData getUsersOrThrow(final String s) {
        s.getClass();
        final MapFieldLite<String, UserAccountData> internalGetUsers = this.internalGetUsers();
        if (((HashMap)internalGetUsers).containsKey(s)) {
            return internalGetUsers.get((Object)s);
        }
        throw new IllegalArgumentException();
    }
    
    public static final class UserAccountData extends GeneratedMessageLite<UserAccountData, a> implements d1
    {
        public static final int COMMENT_KARMA_FIELD_NUMBER = 4;
        public static final int CREATED_UTC_FIELD_NUMBER = 2;
        private static final UserAccountData DEFAULT_INSTANCE;
        public static final int LINK_KARMA_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile n1<UserAccountData> PARSER;
        public static final int PROFILE_COLOR_FIELD_NUMBER = 6;
        public static final int PROFILE_IMG_FIELD_NUMBER = 5;
        public static final int PROFILE_OVER_18_FIELD_NUMBER = 7;
        private Int64Value commentKarma_;
        private Int64Value createdUtc_;
        private Int64Value linkKarma_;
        private StringValue name_;
        private StringValue profileColor_;
        private StringValue profileImg_;
        private BoolValue profileOver18_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)UserAccountData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UserAccountData()));
        }
        
        private UserAccountData() {
        }
        
        public static /* synthetic */ UserAccountData access$18300() {
            return UserAccountData.DEFAULT_INSTANCE;
        }
        
        private void clearCommentKarma() {
            this.commentKarma_ = null;
        }
        
        private void clearCreatedUtc() {
            this.createdUtc_ = null;
        }
        
        private void clearLinkKarma() {
            this.linkKarma_ = null;
        }
        
        private void clearName() {
            this.name_ = null;
        }
        
        private void clearProfileColor() {
            this.profileColor_ = null;
        }
        
        private void clearProfileImg() {
            this.profileImg_ = null;
        }
        
        private void clearProfileOver18() {
            this.profileOver18_ = null;
        }
        
        public static UserAccountData getDefaultInstance() {
            return UserAccountData.DEFAULT_INSTANCE;
        }
        
        private void mergeCommentKarma(final Int64Value commentKarma_) {
            commentKarma_.getClass();
            final Int64Value commentKarma_2 = this.commentKarma_;
            if (commentKarma_2 != null && commentKarma_2 != Int64Value.getDefaultInstance()) {
                this.commentKarma_ = (Int64Value)b.g(this.commentKarma_, commentKarma_);
            }
            else {
                this.commentKarma_ = commentKarma_;
            }
        }
        
        private void mergeCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            final Int64Value createdUtc_2 = this.createdUtc_;
            if (createdUtc_2 != null && createdUtc_2 != Int64Value.getDefaultInstance()) {
                this.createdUtc_ = (Int64Value)b.g(this.createdUtc_, createdUtc_);
            }
            else {
                this.createdUtc_ = createdUtc_;
            }
        }
        
        private void mergeLinkKarma(final Int64Value linkKarma_) {
            linkKarma_.getClass();
            final Int64Value linkKarma_2 = this.linkKarma_;
            if (linkKarma_2 != null && linkKarma_2 != Int64Value.getDefaultInstance()) {
                this.linkKarma_ = (Int64Value)b.g(this.linkKarma_, linkKarma_);
            }
            else {
                this.linkKarma_ = linkKarma_;
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
        
        private void mergeProfileColor(final StringValue profileColor_) {
            profileColor_.getClass();
            final StringValue profileColor_2 = this.profileColor_;
            if (profileColor_2 != null && profileColor_2 != StringValue.getDefaultInstance()) {
                this.profileColor_ = (StringValue)f0.e(this.profileColor_, profileColor_);
            }
            else {
                this.profileColor_ = profileColor_;
            }
        }
        
        private void mergeProfileImg(final StringValue profileImg_) {
            profileImg_.getClass();
            final StringValue profileImg_2 = this.profileImg_;
            if (profileImg_2 != null && profileImg_2 != StringValue.getDefaultInstance()) {
                this.profileImg_ = (StringValue)f0.e(this.profileImg_, profileImg_);
            }
            else {
                this.profileImg_ = profileImg_;
            }
        }
        
        private void mergeProfileOver18(final BoolValue profileOver18_) {
            profileOver18_.getClass();
            final BoolValue profileOver18_2 = this.profileOver18_;
            if (profileOver18_2 != null && profileOver18_2 != BoolValue.getDefaultInstance()) {
                this.profileOver18_ = (BoolValue)android.support.v4.media.a.f(this.profileOver18_, profileOver18_);
            }
            else {
                this.profileOver18_ = profileOver18_;
            }
        }
        
        public static a newBuilder() {
            return (a)UserAccountData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final UserAccountData userAccountData) {
            return (a)UserAccountData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)userAccountData);
        }
        
        public static UserAccountData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (UserAccountData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserAccountData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserAccountData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserAccountData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, byteString);
        }
        
        public static UserAccountData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static UserAccountData parseFrom(final l l) throws IOException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, l);
        }
        
        public static UserAccountData parseFrom(final l l, final d0 d0) throws IOException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static UserAccountData parseFrom(final InputStream inputStream) throws IOException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserAccountData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserAccountData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static UserAccountData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static UserAccountData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, array);
        }
        
        public static UserAccountData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (UserAccountData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<UserAccountData> parser() {
            return (n1<UserAccountData>)UserAccountData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setCommentKarma(final Int64Value commentKarma_) {
            commentKarma_.getClass();
            this.commentKarma_ = commentKarma_;
        }
        
        private void setCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            this.createdUtc_ = createdUtc_;
        }
        
        private void setLinkKarma(final Int64Value linkKarma_) {
            linkKarma_.getClass();
            this.linkKarma_ = linkKarma_;
        }
        
        private void setName(final StringValue name_) {
            name_.getClass();
            this.name_ = name_;
        }
        
        private void setProfileColor(final StringValue profileColor_) {
            profileColor_.getClass();
            this.profileColor_ = profileColor_;
        }
        
        private void setProfileImg(final StringValue profileImg_) {
            profileImg_.getClass();
            this.profileImg_ = profileImg_;
        }
        
        private void setProfileOver18(final BoolValue profileOver18_) {
            profileOver18_.getClass();
            this.profileOver18_ = profileOver18_;
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
                    final n1<UserAccountData> parser;
                    if ((parser = UserAccountData.PARSER) == null) {
                        synchronized (UserAccountData.class) {
                            if (UserAccountData.PARSER == null) {
                                UserAccountData.PARSER = (n1<UserAccountData>)new GeneratedMessageLite$c((GeneratedMessageLite)UserAccountData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return UserAccountData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)UserAccountData.DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[] { "name_", "createdUtc_", "linkKarma_", "commentKarma_", "profileImg_", "profileColor_", "profileOver18_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new UserAccountData();
                }
            }
        }
        
        public Int64Value getCommentKarma() {
            Int64Value int64Value;
            if ((int64Value = this.commentKarma_) == null) {
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
        
        public Int64Value getLinkKarma() {
            Int64Value int64Value;
            if ((int64Value = this.linkKarma_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getName() {
            StringValue stringValue;
            if ((stringValue = this.name_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getProfileColor() {
            StringValue stringValue;
            if ((stringValue = this.profileColor_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getProfileImg() {
            StringValue stringValue;
            if ((stringValue = this.profileImg_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getProfileOver18() {
            BoolValue boolValue;
            if ((boolValue = this.profileOver18_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public boolean hasCommentKarma() {
            return this.commentKarma_ != null;
        }
        
        public boolean hasCreatedUtc() {
            return this.createdUtc_ != null;
        }
        
        public boolean hasLinkKarma() {
            return this.linkKarma_ != null;
        }
        
        public boolean hasName() {
            return this.name_ != null;
        }
        
        public boolean hasProfileColor() {
            return this.profileColor_ != null;
        }
        
        public boolean hasProfileImg() {
            return this.profileImg_ != null;
        }
        
        public boolean hasProfileOver18() {
            return this.profileOver18_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<UserAccountData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)UserAccountData.access$18300());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UserDataByAccountIdsResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UserDataByAccountIdsResponse.access$20600());
        }
    }
}
