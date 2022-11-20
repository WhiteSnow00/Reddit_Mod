// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.l0;
import com.google.protobuf.x1;
import java.util.List;
import com.google.protobuf.Internal$j;
import p1.h;
import u10.o;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.BoolValue;
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

public final class SubredditsMsg$SubredditAutocompleteResponse extends GeneratedMessageLite<SubredditsMsg$SubredditAutocompleteResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SubredditsMsg$SubredditAutocompleteResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<SubredditsMsg$SubredditAutocompleteResponse> PARSER;
    private AutocompleteResponse data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditAutocompleteResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditAutocompleteResponse()));
    }
    
    private SubredditsMsg$SubredditAutocompleteResponse() {
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse access$66300() {
        return SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$66400(final SubredditsMsg$SubredditAutocompleteResponse subredditsMsg$SubredditAutocompleteResponse, final StringValue kind) {
        subredditsMsg$SubredditAutocompleteResponse.setKind(kind);
    }
    
    public static void access$66500(final SubredditsMsg$SubredditAutocompleteResponse subredditsMsg$SubredditAutocompleteResponse, final StringValue stringValue) {
        subredditsMsg$SubredditAutocompleteResponse.mergeKind(stringValue);
    }
    
    public static void access$66600(final SubredditsMsg$SubredditAutocompleteResponse subredditsMsg$SubredditAutocompleteResponse) {
        subredditsMsg$SubredditAutocompleteResponse.clearKind();
    }
    
    public static void access$66700(final SubredditsMsg$SubredditAutocompleteResponse subredditsMsg$SubredditAutocompleteResponse, final AutocompleteResponse data) {
        subredditsMsg$SubredditAutocompleteResponse.setData(data);
    }
    
    public static void access$66800(final SubredditsMsg$SubredditAutocompleteResponse subredditsMsg$SubredditAutocompleteResponse, final AutocompleteResponse autocompleteResponse) {
        subredditsMsg$SubredditAutocompleteResponse.mergeData(autocompleteResponse);
    }
    
    public static void access$66900(final SubredditsMsg$SubredditAutocompleteResponse subredditsMsg$SubredditAutocompleteResponse) {
        subredditsMsg$SubredditAutocompleteResponse.clearData();
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse getDefaultInstance() {
        return SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final AutocompleteResponse data_) {
        data_.getClass();
        final AutocompleteResponse data_2 = this.data_;
        if (data_2 != null && data_2 != AutocompleteResponse.getDefaultInstance()) {
            final AutocompleteResponse.a builder = AutocompleteResponse.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (AutocompleteResponse)builder.c();
        }
        else {
            this.data_ = data_;
        }
    }
    
    private void mergeKind(final StringValue kind_) {
        kind_.getClass();
        final StringValue kind_2 = this.kind_;
        if (kind_2 != null && kind_2 != StringValue.getDefaultInstance()) {
            this.kind_ = (StringValue)w.e(this.kind_, kind_);
        }
        else {
            this.kind_ = kind_;
        }
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditAutocompleteResponse subredditsMsg$SubredditAutocompleteResponse) {
        return (a)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditAutocompleteResponse);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditAutocompleteResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditAutocompleteResponse> parser() {
        return (n1<SubredditsMsg$SubredditAutocompleteResponse>)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final AutocompleteResponse data_) {
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
                final n1<SubredditsMsg$SubredditAutocompleteResponse> parser;
                if ((parser = SubredditsMsg$SubredditAutocompleteResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditAutocompleteResponse.class) {
                        if (SubredditsMsg$SubredditAutocompleteResponse.PARSER == null) {
                            SubredditsMsg$SubredditAutocompleteResponse.PARSER = (n1<SubredditsMsg$SubredditAutocompleteResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditAutocompleteResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditAutocompleteResponse();
            }
        }
    }
    
    public AutocompleteResponse getData() {
        AutocompleteResponse autocompleteResponse;
        if ((autocompleteResponse = this.data_) == null) {
            autocompleteResponse = AutocompleteResponse.getDefaultInstance();
        }
        return autocompleteResponse;
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
    
    public static final class AutocompleteAccount extends GeneratedMessageLite<AutocompleteAccount, a> implements d1
    {
        public static final int ACCEPT_CHATS_FIELD_NUMBER = 12;
        public static final int ACCEPT_FOLLOWERS_FIELD_NUMBER = 20;
        public static final int ACCEPT_PMS_FIELD_NUMBER = 22;
        public static final int COMMENT_KARMA_FIELD_NUMBER = 19;
        public static final int CREATED_FIELD_NUMBER = 16;
        public static final int CREATED_UTC_FIELD_NUMBER = 17;
        private static final AutocompleteAccount DEFAULT_INSTANCE;
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
        public static final int LINK_KARMA_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 15;
        private static volatile n1<AutocompleteAccount> PARSER;
        public static final int PREF_SHOW_SNOOVATAR_FIELD_NUMBER = 14;
        public static final int SNOOVATAR_IMG_FIELD_NUMBER = 18;
        public static final int SNOOVATAR_SIZE_FIELD_NUMBER = 3;
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
        private Int32Value linkKarma_;
        private StringValue name_;
        private BoolValue prefShowSnoovatar_;
        private StringValue snoovatarImg_;
        private Int32Value snoovatarSize_;
        private BoolValue verified_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)AutocompleteAccount.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new AutocompleteAccount()));
        }
        
        private AutocompleteAccount() {
        }
        
        public static AutocompleteAccount access$55600() {
            return AutocompleteAccount.DEFAULT_INSTANCE;
        }
        
        public static void access$55700(final AutocompleteAccount autocompleteAccount, final BoolValue isEmployee) {
            autocompleteAccount.setIsEmployee(isEmployee);
        }
        
        public static void access$55800(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeIsEmployee(boolValue);
        }
        
        public static void access$55900(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearIsEmployee();
        }
        
        public static void access$56000(final AutocompleteAccount autocompleteAccount, final BoolValue isFriend) {
            autocompleteAccount.setIsFriend(isFriend);
        }
        
        public static void access$56100(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeIsFriend(boolValue);
        }
        
        public static void access$56200(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearIsFriend();
        }
        
        public static void access$56300(final AutocompleteAccount autocompleteAccount, final Int32Value snoovatarSize) {
            autocompleteAccount.setSnoovatarSize(snoovatarSize);
        }
        
        public static void access$56400(final AutocompleteAccount autocompleteAccount, final Int32Value int32Value) {
            autocompleteAccount.mergeSnoovatarSize(int32Value);
        }
        
        public static void access$56500(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearSnoovatarSize();
        }
        
        public static void access$56600(final AutocompleteAccount autocompleteAccount, final StringValue id) {
            autocompleteAccount.setId(id);
        }
        
        public static void access$56700(final AutocompleteAccount autocompleteAccount, final StringValue stringValue) {
            autocompleteAccount.mergeId(stringValue);
        }
        
        public static void access$56800(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearId();
        }
        
        public static void access$56900(final AutocompleteAccount autocompleteAccount, final BoolValue verified) {
            autocompleteAccount.setVerified(verified);
        }
        
        public static void access$57000(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeVerified(boolValue);
        }
        
        public static void access$57100(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearVerified();
        }
        
        public static void access$57200(final AutocompleteAccount autocompleteAccount, final BoolValue isGold) {
            autocompleteAccount.setIsGold(isGold);
        }
        
        public static void access$57300(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeIsGold(boolValue);
        }
        
        public static void access$57400(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearIsGold();
        }
        
        public static void access$57500(final AutocompleteAccount autocompleteAccount, final BoolValue isMod) {
            autocompleteAccount.setIsMod(isMod);
        }
        
        public static void access$57600(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeIsMod(boolValue);
        }
        
        public static void access$57700(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearIsMod();
        }
        
        public static void access$57800(final AutocompleteAccount autocompleteAccount, final BoolValue hasVerifiedEmail) {
            autocompleteAccount.setHasVerifiedEmail(hasVerifiedEmail);
        }
        
        public static void access$57900(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeHasVerifiedEmail(boolValue);
        }
        
        public static void access$58000(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearHasVerifiedEmail();
        }
        
        public static void access$58100(final AutocompleteAccount autocompleteAccount, final StringValue iconImg) {
            autocompleteAccount.setIconImg(iconImg);
        }
        
        public static void access$58200(final AutocompleteAccount autocompleteAccount, final StringValue stringValue) {
            autocompleteAccount.mergeIconImg(stringValue);
        }
        
        public static void access$58300(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearIconImg();
        }
        
        public static void access$58400(final AutocompleteAccount autocompleteAccount, final BoolValue hideFromRobots) {
            autocompleteAccount.setHideFromRobots(hideFromRobots);
        }
        
        public static void access$58500(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeHideFromRobots(boolValue);
        }
        
        public static void access$58600(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearHideFromRobots();
        }
        
        public static void access$58700(final AutocompleteAccount autocompleteAccount, final Int32Value linkKarma) {
            autocompleteAccount.setLinkKarma(linkKarma);
        }
        
        public static void access$58800(final AutocompleteAccount autocompleteAccount, final Int32Value int32Value) {
            autocompleteAccount.mergeLinkKarma(int32Value);
        }
        
        public static void access$58900(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearLinkKarma();
        }
        
        public static void access$59000(final AutocompleteAccount autocompleteAccount, final BoolValue acceptChats) {
            autocompleteAccount.setAcceptChats(acceptChats);
        }
        
        public static void access$59100(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeAcceptChats(boolValue);
        }
        
        public static void access$59200(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearAcceptChats();
        }
        
        public static void access$59300(final AutocompleteAccount autocompleteAccount, final BoolValue isBlocked) {
            autocompleteAccount.setIsBlocked(isBlocked);
        }
        
        public static void access$59400(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeIsBlocked(boolValue);
        }
        
        public static void access$59500(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearIsBlocked();
        }
        
        public static void access$59600(final AutocompleteAccount autocompleteAccount, final BoolValue prefShowSnoovatar) {
            autocompleteAccount.setPrefShowSnoovatar(prefShowSnoovatar);
        }
        
        public static void access$59700(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergePrefShowSnoovatar(boolValue);
        }
        
        public static void access$59800(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearPrefShowSnoovatar();
        }
        
        public static void access$59900(final AutocompleteAccount autocompleteAccount, final StringValue name) {
            autocompleteAccount.setName(name);
        }
        
        public static void access$60000(final AutocompleteAccount autocompleteAccount, final StringValue stringValue) {
            autocompleteAccount.mergeName(stringValue);
        }
        
        public static void access$60100(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearName();
        }
        
        public static void access$60200(final AutocompleteAccount autocompleteAccount, final Int64Value created) {
            autocompleteAccount.setCreated(created);
        }
        
        public static void access$60300(final AutocompleteAccount autocompleteAccount, final Int64Value int64Value) {
            autocompleteAccount.mergeCreated(int64Value);
        }
        
        public static void access$60400(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearCreated();
        }
        
        public static void access$60500(final AutocompleteAccount autocompleteAccount, final Int64Value createdUtc) {
            autocompleteAccount.setCreatedUtc(createdUtc);
        }
        
        public static void access$60600(final AutocompleteAccount autocompleteAccount, final Int64Value int64Value) {
            autocompleteAccount.mergeCreatedUtc(int64Value);
        }
        
        public static void access$60700(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearCreatedUtc();
        }
        
        public static void access$60800(final AutocompleteAccount autocompleteAccount, final StringValue snoovatarImg) {
            autocompleteAccount.setSnoovatarImg(snoovatarImg);
        }
        
        public static void access$60900(final AutocompleteAccount autocompleteAccount, final StringValue stringValue) {
            autocompleteAccount.mergeSnoovatarImg(stringValue);
        }
        
        public static void access$61000(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearSnoovatarImg();
        }
        
        public static void access$61100(final AutocompleteAccount autocompleteAccount, final Int64Value commentKarma) {
            autocompleteAccount.setCommentKarma(commentKarma);
        }
        
        public static void access$61200(final AutocompleteAccount autocompleteAccount, final Int64Value int64Value) {
            autocompleteAccount.mergeCommentKarma(int64Value);
        }
        
        public static void access$61300(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearCommentKarma();
        }
        
        public static void access$61400(final AutocompleteAccount autocompleteAccount, final BoolValue acceptFollowers) {
            autocompleteAccount.setAcceptFollowers(acceptFollowers);
        }
        
        public static void access$61500(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeAcceptFollowers(boolValue);
        }
        
        public static void access$61600(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearAcceptFollowers();
        }
        
        public static void access$61700(final AutocompleteAccount autocompleteAccount, final BoolValue hasSubscribed) {
            autocompleteAccount.setHasSubscribed(hasSubscribed);
        }
        
        public static void access$61800(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeHasSubscribed(boolValue);
        }
        
        public static void access$61900(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearHasSubscribed();
        }
        
        public static void access$62000(final AutocompleteAccount autocompleteAccount, final BoolValue acceptPms) {
            autocompleteAccount.setAcceptPms(acceptPms);
        }
        
        public static void access$62100(final AutocompleteAccount autocompleteAccount, final BoolValue boolValue) {
            autocompleteAccount.mergeAcceptPms(boolValue);
        }
        
        public static void access$62200(final AutocompleteAccount autocompleteAccount) {
            autocompleteAccount.clearAcceptPms();
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
            this.snoovatarSize_ = null;
        }
        
        private void clearVerified() {
            this.verified_ = null;
        }
        
        public static AutocompleteAccount getDefaultInstance() {
            return AutocompleteAccount.DEFAULT_INSTANCE;
        }
        
        private void mergeAcceptChats(final BoolValue acceptChats_) {
            acceptChats_.getClass();
            final BoolValue acceptChats_2 = this.acceptChats_;
            if (acceptChats_2 != null && acceptChats_2 != BoolValue.getDefaultInstance()) {
                this.acceptChats_ = (BoolValue)o.g(this.acceptChats_, acceptChats_);
            }
            else {
                this.acceptChats_ = acceptChats_;
            }
        }
        
        private void mergeAcceptFollowers(final BoolValue acceptFollowers_) {
            acceptFollowers_.getClass();
            final BoolValue acceptFollowers_2 = this.acceptFollowers_;
            if (acceptFollowers_2 != null && acceptFollowers_2 != BoolValue.getDefaultInstance()) {
                this.acceptFollowers_ = (BoolValue)o.g(this.acceptFollowers_, acceptFollowers_);
            }
            else {
                this.acceptFollowers_ = acceptFollowers_;
            }
        }
        
        private void mergeAcceptPms(final BoolValue acceptPms_) {
            acceptPms_.getClass();
            final BoolValue acceptPms_2 = this.acceptPms_;
            if (acceptPms_2 != null && acceptPms_2 != BoolValue.getDefaultInstance()) {
                this.acceptPms_ = (BoolValue)o.g(this.acceptPms_, acceptPms_);
            }
            else {
                this.acceptPms_ = acceptPms_;
            }
        }
        
        private void mergeCommentKarma(final Int64Value commentKarma_) {
            commentKarma_.getClass();
            final Int64Value commentKarma_2 = this.commentKarma_;
            if (commentKarma_2 != null && commentKarma_2 != Int64Value.getDefaultInstance()) {
                this.commentKarma_ = (Int64Value)h.b(this.commentKarma_, commentKarma_);
            }
            else {
                this.commentKarma_ = commentKarma_;
            }
        }
        
        private void mergeCreated(final Int64Value created_) {
            created_.getClass();
            final Int64Value created_2 = this.created_;
            if (created_2 != null && created_2 != Int64Value.getDefaultInstance()) {
                this.created_ = (Int64Value)h.b(this.created_, created_);
            }
            else {
                this.created_ = created_;
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
        
        private void mergeHasSubscribed(final BoolValue hasSubscribed_) {
            hasSubscribed_.getClass();
            final BoolValue hasSubscribed_2 = this.hasSubscribed_;
            if (hasSubscribed_2 != null && hasSubscribed_2 != BoolValue.getDefaultInstance()) {
                this.hasSubscribed_ = (BoolValue)o.g(this.hasSubscribed_, hasSubscribed_);
            }
            else {
                this.hasSubscribed_ = hasSubscribed_;
            }
        }
        
        private void mergeHasVerifiedEmail(final BoolValue hasVerifiedEmail_) {
            hasVerifiedEmail_.getClass();
            final BoolValue hasVerifiedEmail_2 = this.hasVerifiedEmail_;
            if (hasVerifiedEmail_2 != null && hasVerifiedEmail_2 != BoolValue.getDefaultInstance()) {
                this.hasVerifiedEmail_ = (BoolValue)o.g(this.hasVerifiedEmail_, hasVerifiedEmail_);
            }
            else {
                this.hasVerifiedEmail_ = hasVerifiedEmail_;
            }
        }
        
        private void mergeHideFromRobots(final BoolValue hideFromRobots_) {
            hideFromRobots_.getClass();
            final BoolValue hideFromRobots_2 = this.hideFromRobots_;
            if (hideFromRobots_2 != null && hideFromRobots_2 != BoolValue.getDefaultInstance()) {
                this.hideFromRobots_ = (BoolValue)o.g(this.hideFromRobots_, hideFromRobots_);
            }
            else {
                this.hideFromRobots_ = hideFromRobots_;
            }
        }
        
        private void mergeIconImg(final StringValue iconImg_) {
            iconImg_.getClass();
            final StringValue iconImg_2 = this.iconImg_;
            if (iconImg_2 != null && iconImg_2 != StringValue.getDefaultInstance()) {
                this.iconImg_ = (StringValue)w.e(this.iconImg_, iconImg_);
            }
            else {
                this.iconImg_ = iconImg_;
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
        
        private void mergeIsBlocked(final BoolValue isBlocked_) {
            isBlocked_.getClass();
            final BoolValue isBlocked_2 = this.isBlocked_;
            if (isBlocked_2 != null && isBlocked_2 != BoolValue.getDefaultInstance()) {
                this.isBlocked_ = (BoolValue)o.g(this.isBlocked_, isBlocked_);
            }
            else {
                this.isBlocked_ = isBlocked_;
            }
        }
        
        private void mergeIsEmployee(final BoolValue isEmployee_) {
            isEmployee_.getClass();
            final BoolValue isEmployee_2 = this.isEmployee_;
            if (isEmployee_2 != null && isEmployee_2 != BoolValue.getDefaultInstance()) {
                this.isEmployee_ = (BoolValue)o.g(this.isEmployee_, isEmployee_);
            }
            else {
                this.isEmployee_ = isEmployee_;
            }
        }
        
        private void mergeIsFriend(final BoolValue isFriend_) {
            isFriend_.getClass();
            final BoolValue isFriend_2 = this.isFriend_;
            if (isFriend_2 != null && isFriend_2 != BoolValue.getDefaultInstance()) {
                this.isFriend_ = (BoolValue)o.g(this.isFriend_, isFriend_);
            }
            else {
                this.isFriend_ = isFriend_;
            }
        }
        
        private void mergeIsGold(final BoolValue isGold_) {
            isGold_.getClass();
            final BoolValue isGold_2 = this.isGold_;
            if (isGold_2 != null && isGold_2 != BoolValue.getDefaultInstance()) {
                this.isGold_ = (BoolValue)o.g(this.isGold_, isGold_);
            }
            else {
                this.isGold_ = isGold_;
            }
        }
        
        private void mergeIsMod(final BoolValue isMod_) {
            isMod_.getClass();
            final BoolValue isMod_2 = this.isMod_;
            if (isMod_2 != null && isMod_2 != BoolValue.getDefaultInstance()) {
                this.isMod_ = (BoolValue)o.g(this.isMod_, isMod_);
            }
            else {
                this.isMod_ = isMod_;
            }
        }
        
        private void mergeLinkKarma(final Int32Value linkKarma_) {
            linkKarma_.getClass();
            final Int32Value linkKarma_2 = this.linkKarma_;
            if (linkKarma_2 != null && linkKarma_2 != Int32Value.getDefaultInstance()) {
                this.linkKarma_ = (Int32Value)b.d(this.linkKarma_, linkKarma_);
            }
            else {
                this.linkKarma_ = linkKarma_;
            }
        }
        
        private void mergeName(final StringValue name_) {
            name_.getClass();
            final StringValue name_2 = this.name_;
            if (name_2 != null && name_2 != StringValue.getDefaultInstance()) {
                this.name_ = (StringValue)w.e(this.name_, name_);
            }
            else {
                this.name_ = name_;
            }
        }
        
        private void mergePrefShowSnoovatar(final BoolValue prefShowSnoovatar_) {
            prefShowSnoovatar_.getClass();
            final BoolValue prefShowSnoovatar_2 = this.prefShowSnoovatar_;
            if (prefShowSnoovatar_2 != null && prefShowSnoovatar_2 != BoolValue.getDefaultInstance()) {
                this.prefShowSnoovatar_ = (BoolValue)o.g(this.prefShowSnoovatar_, prefShowSnoovatar_);
            }
            else {
                this.prefShowSnoovatar_ = prefShowSnoovatar_;
            }
        }
        
        private void mergeSnoovatarImg(final StringValue snoovatarImg_) {
            snoovatarImg_.getClass();
            final StringValue snoovatarImg_2 = this.snoovatarImg_;
            if (snoovatarImg_2 != null && snoovatarImg_2 != StringValue.getDefaultInstance()) {
                this.snoovatarImg_ = (StringValue)w.e(this.snoovatarImg_, snoovatarImg_);
            }
            else {
                this.snoovatarImg_ = snoovatarImg_;
            }
        }
        
        private void mergeSnoovatarSize(final Int32Value snoovatarSize_) {
            snoovatarSize_.getClass();
            final Int32Value snoovatarSize_2 = this.snoovatarSize_;
            if (snoovatarSize_2 != null && snoovatarSize_2 != Int32Value.getDefaultInstance()) {
                this.snoovatarSize_ = (Int32Value)b.d(this.snoovatarSize_, snoovatarSize_);
            }
            else {
                this.snoovatarSize_ = snoovatarSize_;
            }
        }
        
        private void mergeVerified(final BoolValue verified_) {
            verified_.getClass();
            final BoolValue verified_2 = this.verified_;
            if (verified_2 != null && verified_2 != BoolValue.getDefaultInstance()) {
                this.verified_ = (BoolValue)o.g(this.verified_, verified_);
            }
            else {
                this.verified_ = verified_;
            }
        }
        
        public static a newBuilder() {
            return (a)AutocompleteAccount.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final AutocompleteAccount autocompleteAccount) {
            return (a)AutocompleteAccount.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)autocompleteAccount);
        }
        
        public static AutocompleteAccount parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (AutocompleteAccount)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AutocompleteAccount parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AutocompleteAccount)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AutocompleteAccount parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, byteString);
        }
        
        public static AutocompleteAccount parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static AutocompleteAccount parseFrom(final l l) throws IOException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, l);
        }
        
        public static AutocompleteAccount parseFrom(final l l, final d0 d0) throws IOException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, l, d0);
        }
        
        public static AutocompleteAccount parseFrom(final InputStream inputStream) throws IOException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AutocompleteAccount parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AutocompleteAccount parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static AutocompleteAccount parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static AutocompleteAccount parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, array);
        }
        
        public static AutocompleteAccount parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (AutocompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<AutocompleteAccount> parser() {
            return (n1<AutocompleteAccount>)AutocompleteAccount.DEFAULT_INSTANCE.getParserForType();
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
        
        private void setSnoovatarSize(final Int32Value snoovatarSize_) {
            snoovatarSize_.getClass();
            this.snoovatarSize_ = snoovatarSize_;
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
                    final n1<AutocompleteAccount> parser;
                    if ((parser = AutocompleteAccount.PARSER) == null) {
                        synchronized (AutocompleteAccount.class) {
                            if (AutocompleteAccount.PARSER == null) {
                                AutocompleteAccount.PARSER = (n1<AutocompleteAccount>)new GeneratedMessageLite$c((GeneratedMessageLite)AutocompleteAccount.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return AutocompleteAccount.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)AutocompleteAccount.DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0000\u0001\u0016\u0016\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t", new Object[] { "isEmployee_", "isFriend_", "snoovatarSize_", "id_", "verified_", "isGold_", "isMod_", "hasVerifiedEmail_", "iconImg_", "hideFromRobots_", "linkKarma_", "acceptChats_", "isBlocked_", "prefShowSnoovatar_", "name_", "created_", "createdUtc_", "snoovatarImg_", "commentKarma_", "acceptFollowers_", "hasSubscribed_", "acceptPms_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new AutocompleteAccount();
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
        
        public Int32Value getSnoovatarSize() {
            Int32Value int32Value;
            if ((int32Value = this.snoovatarSize_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
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
        
        public boolean hasSnoovatarSize() {
            return this.snoovatarSize_ != null;
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
            public static final int INK_FLAIR_POSITION_FIELD_NUMBER = 27;
            public static final int IS_DEFAULT_BANNER_FIELD_NUMBER = 31;
            public static final int IS_DEFAULT_ICON_FIELD_NUMBER = 26;
            public static final int KEY_COLOR_FIELD_NUMBER = 29;
            public static final int LINK_FLAIR_ENABLED_FIELD_NUMBER = 38;
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
            private Int32Value bannerSize_;
            private StringValue communityIcon_;
            private BoolValue defaultSet_;
            private StringValue description_;
            private BoolValue disableContributorRequests_;
            private StringValue displayNamePrefixed_;
            private StringValue displayName_;
            private BoolValue freeFormReports_;
            private StringValue headerImg_;
            private Int32Value headerSize_;
            private StringValue iconColor_;
            private StringValue iconImg_;
            private Internal$j<Int32Value> iconSize_;
            private StringValue inkFlairPosition_;
            private BoolValue isDefaultBanner_;
            private BoolValue isDefaultIcon_;
            private StringValue keyColor_;
            private BoolValue linkFlairEnabled_;
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
            }
            
            public static Subreddit access$42200() {
                return Subreddit.DEFAULT_INSTANCE;
            }
            
            public static void access$42300(final Subreddit subreddit, final BoolValue defaultSet) {
                subreddit.setDefaultSet(defaultSet);
            }
            
            public static void access$42400(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeDefaultSet(boolValue);
            }
            
            public static void access$42500(final Subreddit subreddit) {
                subreddit.clearDefaultSet();
            }
            
            public static void access$42600(final Subreddit subreddit, final BoolValue userIsContributor) {
                subreddit.setUserIsContributor(userIsContributor);
            }
            
            public static void access$42700(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsContributor(boolValue);
            }
            
            public static void access$42800(final Subreddit subreddit) {
                subreddit.clearUserIsContributor();
            }
            
            public static void access$42900(final Subreddit subreddit, final StringValue bannerImg) {
                subreddit.setBannerImg(bannerImg);
            }
            
            public static void access$43000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeBannerImg(stringValue);
            }
            
            public static void access$43100(final Subreddit subreddit) {
                subreddit.clearBannerImg();
            }
            
            public static void access$43200(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.setAllowedMediaInComments(n, stringValue);
            }
            
            public static void access$43300(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.addAllowedMediaInComments(stringValue);
            }
            
            public static void access$43400(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.addAllowedMediaInComments(n, stringValue);
            }
            
            public static void access$43500(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllAllowedMediaInComments(iterable);
            }
            
            public static void access$43600(final Subreddit subreddit) {
                subreddit.clearAllowedMediaInComments();
            }
            
            public static void access$43700(final Subreddit subreddit, final int n) {
                subreddit.removeAllowedMediaInComments(n);
            }
            
            public static void access$43800(final Subreddit subreddit, final BoolValue userIsBanned) {
                subreddit.setUserIsBanned(userIsBanned);
            }
            
            public static void access$43900(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsBanned(boolValue);
            }
            
            public static void access$44000(final Subreddit subreddit) {
                subreddit.clearUserIsBanned();
            }
            
            public static void access$44100(final Subreddit subreddit, final BoolValue freeFormReports) {
                subreddit.setFreeFormReports(freeFormReports);
            }
            
            public static void access$44200(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeFreeFormReports(boolValue);
            }
            
            public static void access$44300(final Subreddit subreddit) {
                subreddit.clearFreeFormReports();
            }
            
            public static void access$44400(final Subreddit subreddit, final StringValue communityIcon) {
                subreddit.setCommunityIcon(communityIcon);
            }
            
            public static void access$44500(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeCommunityIcon(stringValue);
            }
            
            public static void access$44600(final Subreddit subreddit) {
                subreddit.clearCommunityIcon();
            }
            
            public static void access$44700(final Subreddit subreddit, final BoolValue showMedia) {
                subreddit.setShowMedia(showMedia);
            }
            
            public static void access$44800(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeShowMedia(boolValue);
            }
            
            public static void access$44900(final Subreddit subreddit) {
                subreddit.clearShowMedia();
            }
            
            public static void access$45000(final Subreddit subreddit, final StringValue iconColor) {
                subreddit.setIconColor(iconColor);
            }
            
            public static void access$45100(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeIconColor(stringValue);
            }
            
            public static void access$45200(final Subreddit subreddit) {
                subreddit.clearIconColor();
            }
            
            public static void access$45300(final Subreddit subreddit, final BoolValue userIsMuted) {
                subreddit.setUserIsMuted(userIsMuted);
            }
            
            public static void access$45400(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsMuted(boolValue);
            }
            
            public static void access$45500(final Subreddit subreddit) {
                subreddit.clearUserIsMuted();
            }
            
            public static void access$45600(final Subreddit subreddit, final StringValue displayName) {
                subreddit.setDisplayName(displayName);
            }
            
            public static void access$45700(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeDisplayName(stringValue);
            }
            
            public static void access$45800(final Subreddit subreddit) {
                subreddit.clearDisplayName();
            }
            
            public static void access$45900(final Subreddit subreddit, final StringValue headerImg) {
                subreddit.setHeaderImg(headerImg);
            }
            
            public static void access$46000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeHeaderImg(stringValue);
            }
            
            public static void access$46100(final Subreddit subreddit) {
                subreddit.clearHeaderImg();
            }
            
            public static void access$46200(final Subreddit subreddit, final StringValue title) {
                subreddit.setTitle(title);
            }
            
            public static void access$46300(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeTitle(stringValue);
            }
            
            public static void access$46400(final Subreddit subreddit) {
                subreddit.clearTitle();
            }
            
            public static void access$46500(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.setPreviousNames(n, stringValue);
            }
            
            public static void access$46600(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.addPreviousNames(stringValue);
            }
            
            public static void access$46700(final Subreddit subreddit, final int n, final StringValue stringValue) {
                subreddit.addPreviousNames(n, stringValue);
            }
            
            public static void access$46800(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllPreviousNames(iterable);
            }
            
            public static void access$46900(final Subreddit subreddit) {
                subreddit.clearPreviousNames();
            }
            
            public static void access$47000(final Subreddit subreddit, final int n) {
                subreddit.removePreviousNames(n);
            }
            
            public static void access$47100(final Subreddit subreddit, final BoolValue over18) {
                subreddit.setOver18(over18);
            }
            
            public static void access$47200(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeOver18(boolValue);
            }
            
            public static void access$47300(final Subreddit subreddit) {
                subreddit.clearOver18();
            }
            
            public static void access$47400(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.setIconSize(n, int32Value);
            }
            
            public static void access$47500(final Subreddit subreddit, final Int32Value int32Value) {
                subreddit.addIconSize(int32Value);
            }
            
            public static void access$47600(final Subreddit subreddit, final int n, final Int32Value int32Value) {
                subreddit.addIconSize(n, int32Value);
            }
            
            public static void access$47700(final Subreddit subreddit, final Iterable iterable) {
                subreddit.addAllIconSize(iterable);
            }
            
            public static void access$47800(final Subreddit subreddit) {
                subreddit.clearIconSize();
            }
            
            public static void access$47900(final Subreddit subreddit, final int n) {
                subreddit.removeIconSize(n);
            }
            
            public static void access$48000(final Subreddit subreddit, final StringValue primaryColor) {
                subreddit.setPrimaryColor(primaryColor);
            }
            
            public static void access$48100(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergePrimaryColor(stringValue);
            }
            
            public static void access$48200(final Subreddit subreddit) {
                subreddit.clearPrimaryColor();
            }
            
            public static void access$48300(final Subreddit subreddit, final StringValue iconImg) {
                subreddit.setIconImg(iconImg);
            }
            
            public static void access$48400(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeIconImg(stringValue);
            }
            
            public static void access$48500(final Subreddit subreddit) {
                subreddit.clearIconImg();
            }
            
            public static void access$48600(final Subreddit subreddit, final StringValue description) {
                subreddit.setDescription(description);
            }
            
            public static void access$48700(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeDescription(stringValue);
            }
            
            public static void access$48800(final Subreddit subreddit) {
                subreddit.clearDescription();
            }
            
            public static void access$48900(final Subreddit subreddit, final StringValue submitLinkLabel) {
                subreddit.setSubmitLinkLabel(submitLinkLabel);
            }
            
            public static void access$49000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeSubmitLinkLabel(stringValue);
            }
            
            public static void access$49100(final Subreddit subreddit) {
                subreddit.clearSubmitLinkLabel();
            }
            
            public static void access$49200(final Subreddit subreddit, final Int32Value headerSize) {
                subreddit.setHeaderSize(headerSize);
            }
            
            public static void access$49300(final Subreddit subreddit, final Int32Value int32Value) {
                subreddit.mergeHeaderSize(int32Value);
            }
            
            public static void access$49400(final Subreddit subreddit) {
                subreddit.clearHeaderSize();
            }
            
            public static void access$49500(final Subreddit subreddit, final BoolValue restrictPosting) {
                subreddit.setRestrictPosting(restrictPosting);
            }
            
            public static void access$49600(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeRestrictPosting(boolValue);
            }
            
            public static void access$49700(final Subreddit subreddit) {
                subreddit.clearRestrictPosting();
            }
            
            public static void access$49800(final Subreddit subreddit, final BoolValue restrictCommenting) {
                subreddit.setRestrictCommenting(restrictCommenting);
            }
            
            public static void access$49900(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeRestrictCommenting(boolValue);
            }
            
            public static void access$50000(final Subreddit subreddit) {
                subreddit.clearRestrictCommenting();
            }
            
            public static void access$50100(final Subreddit subreddit, final Int64Value subscribers) {
                subreddit.setSubscribers(subscribers);
            }
            
            public static void access$50200(final Subreddit subreddit, final Int64Value int64Value) {
                subreddit.mergeSubscribers(int64Value);
            }
            
            public static void access$50300(final Subreddit subreddit) {
                subreddit.clearSubscribers();
            }
            
            public static void access$50400(final Subreddit subreddit, final StringValue submitTextLabel) {
                subreddit.setSubmitTextLabel(submitTextLabel);
            }
            
            public static void access$50500(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeSubmitTextLabel(stringValue);
            }
            
            public static void access$50600(final Subreddit subreddit) {
                subreddit.clearSubmitTextLabel();
            }
            
            public static void access$50700(final Subreddit subreddit, final BoolValue isDefaultIcon) {
                subreddit.setIsDefaultIcon(isDefaultIcon);
            }
            
            public static void access$50800(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeIsDefaultIcon(boolValue);
            }
            
            public static void access$50900(final Subreddit subreddit) {
                subreddit.clearIsDefaultIcon();
            }
            
            public static void access$51000(final Subreddit subreddit, final StringValue inkFlairPosition) {
                subreddit.setInkFlairPosition(inkFlairPosition);
            }
            
            public static void access$51100(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeInkFlairPosition(stringValue);
            }
            
            public static void access$51200(final Subreddit subreddit) {
                subreddit.clearInkFlairPosition();
            }
            
            public static void access$51300(final Subreddit subreddit, final StringValue displayNamePrefixed) {
                subreddit.setDisplayNamePrefixed(displayNamePrefixed);
            }
            
            public static void access$51400(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeDisplayNamePrefixed(stringValue);
            }
            
            public static void access$51500(final Subreddit subreddit) {
                subreddit.clearDisplayNamePrefixed();
            }
            
            public static void access$51600(final Subreddit subreddit, final StringValue keyColor) {
                subreddit.setKeyColor(keyColor);
            }
            
            public static void access$51700(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeKeyColor(stringValue);
            }
            
            public static void access$51800(final Subreddit subreddit) {
                subreddit.clearKeyColor();
            }
            
            public static void access$51900(final Subreddit subreddit, final StringValue name) {
                subreddit.setName(name);
            }
            
            public static void access$52000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeName(stringValue);
            }
            
            public static void access$52100(final Subreddit subreddit) {
                subreddit.clearName();
            }
            
            public static void access$52200(final Subreddit subreddit, final BoolValue isDefaultBanner) {
                subreddit.setIsDefaultBanner(isDefaultBanner);
            }
            
            public static void access$52300(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeIsDefaultBanner(boolValue);
            }
            
            public static void access$52400(final Subreddit subreddit) {
                subreddit.clearIsDefaultBanner();
            }
            
            public static void access$52500(final Subreddit subreddit, final StringValue url) {
                subreddit.setUrl(url);
            }
            
            public static void access$52600(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeUrl(stringValue);
            }
            
            public static void access$52700(final Subreddit subreddit) {
                subreddit.clearUrl();
            }
            
            public static void access$52800(final Subreddit subreddit, final BoolValue quarantine) {
                subreddit.setQuarantine(quarantine);
            }
            
            public static void access$52900(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeQuarantine(boolValue);
            }
            
            public static void access$53000(final Subreddit subreddit) {
                subreddit.clearQuarantine();
            }
            
            public static void access$53100(final Subreddit subreddit, final Int32Value bannerSize) {
                subreddit.setBannerSize(bannerSize);
            }
            
            public static void access$53200(final Subreddit subreddit, final Int32Value int32Value) {
                subreddit.mergeBannerSize(int32Value);
            }
            
            public static void access$53300(final Subreddit subreddit) {
                subreddit.clearBannerSize();
            }
            
            public static void access$53400(final Subreddit subreddit, final BoolValue userIsModerator) {
                subreddit.setUserIsModerator(userIsModerator);
            }
            
            public static void access$53500(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsModerator(boolValue);
            }
            
            public static void access$53600(final Subreddit subreddit) {
                subreddit.clearUserIsModerator();
            }
            
            public static void access$53700(final Subreddit subreddit, final BoolValue acceptFollowers) {
                subreddit.setAcceptFollowers(acceptFollowers);
            }
            
            public static void access$53800(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeAcceptFollowers(boolValue);
            }
            
            public static void access$53900(final Subreddit subreddit) {
                subreddit.clearAcceptFollowers();
            }
            
            public static void access$54000(final Subreddit subreddit, final StringValue publicDescription) {
                subreddit.setPublicDescription(publicDescription);
            }
            
            public static void access$54100(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergePublicDescription(stringValue);
            }
            
            public static void access$54200(final Subreddit subreddit) {
                subreddit.clearPublicDescription();
            }
            
            public static void access$54300(final Subreddit subreddit, final BoolValue linkFlairEnabled) {
                subreddit.setLinkFlairEnabled(linkFlairEnabled);
            }
            
            public static void access$54400(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeLinkFlairEnabled(boolValue);
            }
            
            public static void access$54500(final Subreddit subreddit) {
                subreddit.clearLinkFlairEnabled();
            }
            
            public static void access$54600(final Subreddit subreddit, final BoolValue disableContributorRequests) {
                subreddit.setDisableContributorRequests(disableContributorRequests);
            }
            
            public static void access$54700(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeDisableContributorRequests(boolValue);
            }
            
            public static void access$54800(final Subreddit subreddit) {
                subreddit.clearDisableContributorRequests();
            }
            
            public static void access$54900(final Subreddit subreddit, final StringValue subredditType) {
                subreddit.setSubredditType(subredditType);
            }
            
            public static void access$55000(final Subreddit subreddit, final StringValue stringValue) {
                subreddit.mergeSubredditType(stringValue);
            }
            
            public static void access$55100(final Subreddit subreddit) {
                subreddit.clearSubredditType();
            }
            
            public static void access$55200(final Subreddit subreddit, final BoolValue userIsSubscriber) {
                subreddit.setUserIsSubscriber(userIsSubscriber);
            }
            
            public static void access$55300(final Subreddit subreddit, final BoolValue boolValue) {
                subreddit.mergeUserIsSubscriber(boolValue);
            }
            
            public static void access$55400(final Subreddit subreddit) {
                subreddit.clearUserIsSubscriber();
            }
            
            private void addAllAllowedMediaInComments(final Iterable<? extends StringValue> iterable) {
                this.ensureAllowedMediaInCommentsIsMutable();
                com.google.protobuf.a.addAll((Iterable)iterable, (List)this.allowedMediaInComments_);
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
                this.bannerSize_ = null;
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
                this.headerSize_ = null;
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
            
            private void clearInkFlairPosition() {
                this.inkFlairPosition_ = null;
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
            
            private void mergeAcceptFollowers(final BoolValue acceptFollowers_) {
                acceptFollowers_.getClass();
                final BoolValue acceptFollowers_2 = this.acceptFollowers_;
                if (acceptFollowers_2 != null && acceptFollowers_2 != BoolValue.getDefaultInstance()) {
                    this.acceptFollowers_ = (BoolValue)o.g(this.acceptFollowers_, acceptFollowers_);
                }
                else {
                    this.acceptFollowers_ = acceptFollowers_;
                }
            }
            
            private void mergeBannerImg(final StringValue bannerImg_) {
                bannerImg_.getClass();
                final StringValue bannerImg_2 = this.bannerImg_;
                if (bannerImg_2 != null && bannerImg_2 != StringValue.getDefaultInstance()) {
                    this.bannerImg_ = (StringValue)w.e(this.bannerImg_, bannerImg_);
                }
                else {
                    this.bannerImg_ = bannerImg_;
                }
            }
            
            private void mergeBannerSize(final Int32Value bannerSize_) {
                bannerSize_.getClass();
                final Int32Value bannerSize_2 = this.bannerSize_;
                if (bannerSize_2 != null && bannerSize_2 != Int32Value.getDefaultInstance()) {
                    this.bannerSize_ = (Int32Value)b.d(this.bannerSize_, bannerSize_);
                }
                else {
                    this.bannerSize_ = bannerSize_;
                }
            }
            
            private void mergeCommunityIcon(final StringValue communityIcon_) {
                communityIcon_.getClass();
                final StringValue communityIcon_2 = this.communityIcon_;
                if (communityIcon_2 != null && communityIcon_2 != StringValue.getDefaultInstance()) {
                    this.communityIcon_ = (StringValue)w.e(this.communityIcon_, communityIcon_);
                }
                else {
                    this.communityIcon_ = communityIcon_;
                }
            }
            
            private void mergeDefaultSet(final BoolValue defaultSet_) {
                defaultSet_.getClass();
                final BoolValue defaultSet_2 = this.defaultSet_;
                if (defaultSet_2 != null && defaultSet_2 != BoolValue.getDefaultInstance()) {
                    this.defaultSet_ = (BoolValue)o.g(this.defaultSet_, defaultSet_);
                }
                else {
                    this.defaultSet_ = defaultSet_;
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
            
            private void mergeDisableContributorRequests(final BoolValue disableContributorRequests_) {
                disableContributorRequests_.getClass();
                final BoolValue disableContributorRequests_2 = this.disableContributorRequests_;
                if (disableContributorRequests_2 != null && disableContributorRequests_2 != BoolValue.getDefaultInstance()) {
                    this.disableContributorRequests_ = (BoolValue)o.g(this.disableContributorRequests_, disableContributorRequests_);
                }
                else {
                    this.disableContributorRequests_ = disableContributorRequests_;
                }
            }
            
            private void mergeDisplayName(final StringValue displayName_) {
                displayName_.getClass();
                final StringValue displayName_2 = this.displayName_;
                if (displayName_2 != null && displayName_2 != StringValue.getDefaultInstance()) {
                    this.displayName_ = (StringValue)w.e(this.displayName_, displayName_);
                }
                else {
                    this.displayName_ = displayName_;
                }
            }
            
            private void mergeDisplayNamePrefixed(final StringValue displayNamePrefixed_) {
                displayNamePrefixed_.getClass();
                final StringValue displayNamePrefixed_2 = this.displayNamePrefixed_;
                if (displayNamePrefixed_2 != null && displayNamePrefixed_2 != StringValue.getDefaultInstance()) {
                    this.displayNamePrefixed_ = (StringValue)w.e(this.displayNamePrefixed_, displayNamePrefixed_);
                }
                else {
                    this.displayNamePrefixed_ = displayNamePrefixed_;
                }
            }
            
            private void mergeFreeFormReports(final BoolValue freeFormReports_) {
                freeFormReports_.getClass();
                final BoolValue freeFormReports_2 = this.freeFormReports_;
                if (freeFormReports_2 != null && freeFormReports_2 != BoolValue.getDefaultInstance()) {
                    this.freeFormReports_ = (BoolValue)o.g(this.freeFormReports_, freeFormReports_);
                }
                else {
                    this.freeFormReports_ = freeFormReports_;
                }
            }
            
            private void mergeHeaderImg(final StringValue headerImg_) {
                headerImg_.getClass();
                final StringValue headerImg_2 = this.headerImg_;
                if (headerImg_2 != null && headerImg_2 != StringValue.getDefaultInstance()) {
                    this.headerImg_ = (StringValue)w.e(this.headerImg_, headerImg_);
                }
                else {
                    this.headerImg_ = headerImg_;
                }
            }
            
            private void mergeHeaderSize(final Int32Value headerSize_) {
                headerSize_.getClass();
                final Int32Value headerSize_2 = this.headerSize_;
                if (headerSize_2 != null && headerSize_2 != Int32Value.getDefaultInstance()) {
                    this.headerSize_ = (Int32Value)b.d(this.headerSize_, headerSize_);
                }
                else {
                    this.headerSize_ = headerSize_;
                }
            }
            
            private void mergeIconColor(final StringValue iconColor_) {
                iconColor_.getClass();
                final StringValue iconColor_2 = this.iconColor_;
                if (iconColor_2 != null && iconColor_2 != StringValue.getDefaultInstance()) {
                    this.iconColor_ = (StringValue)w.e(this.iconColor_, iconColor_);
                }
                else {
                    this.iconColor_ = iconColor_;
                }
            }
            
            private void mergeIconImg(final StringValue iconImg_) {
                iconImg_.getClass();
                final StringValue iconImg_2 = this.iconImg_;
                if (iconImg_2 != null && iconImg_2 != StringValue.getDefaultInstance()) {
                    this.iconImg_ = (StringValue)w.e(this.iconImg_, iconImg_);
                }
                else {
                    this.iconImg_ = iconImg_;
                }
            }
            
            private void mergeInkFlairPosition(final StringValue inkFlairPosition_) {
                inkFlairPosition_.getClass();
                final StringValue inkFlairPosition_2 = this.inkFlairPosition_;
                if (inkFlairPosition_2 != null && inkFlairPosition_2 != StringValue.getDefaultInstance()) {
                    this.inkFlairPosition_ = (StringValue)w.e(this.inkFlairPosition_, inkFlairPosition_);
                }
                else {
                    this.inkFlairPosition_ = inkFlairPosition_;
                }
            }
            
            private void mergeIsDefaultBanner(final BoolValue isDefaultBanner_) {
                isDefaultBanner_.getClass();
                final BoolValue isDefaultBanner_2 = this.isDefaultBanner_;
                if (isDefaultBanner_2 != null && isDefaultBanner_2 != BoolValue.getDefaultInstance()) {
                    this.isDefaultBanner_ = (BoolValue)o.g(this.isDefaultBanner_, isDefaultBanner_);
                }
                else {
                    this.isDefaultBanner_ = isDefaultBanner_;
                }
            }
            
            private void mergeIsDefaultIcon(final BoolValue isDefaultIcon_) {
                isDefaultIcon_.getClass();
                final BoolValue isDefaultIcon_2 = this.isDefaultIcon_;
                if (isDefaultIcon_2 != null && isDefaultIcon_2 != BoolValue.getDefaultInstance()) {
                    this.isDefaultIcon_ = (BoolValue)o.g(this.isDefaultIcon_, isDefaultIcon_);
                }
                else {
                    this.isDefaultIcon_ = isDefaultIcon_;
                }
            }
            
            private void mergeKeyColor(final StringValue keyColor_) {
                keyColor_.getClass();
                final StringValue keyColor_2 = this.keyColor_;
                if (keyColor_2 != null && keyColor_2 != StringValue.getDefaultInstance()) {
                    this.keyColor_ = (StringValue)w.e(this.keyColor_, keyColor_);
                }
                else {
                    this.keyColor_ = keyColor_;
                }
            }
            
            private void mergeLinkFlairEnabled(final BoolValue linkFlairEnabled_) {
                linkFlairEnabled_.getClass();
                final BoolValue linkFlairEnabled_2 = this.linkFlairEnabled_;
                if (linkFlairEnabled_2 != null && linkFlairEnabled_2 != BoolValue.getDefaultInstance()) {
                    this.linkFlairEnabled_ = (BoolValue)o.g(this.linkFlairEnabled_, linkFlairEnabled_);
                }
                else {
                    this.linkFlairEnabled_ = linkFlairEnabled_;
                }
            }
            
            private void mergeName(final StringValue name_) {
                name_.getClass();
                final StringValue name_2 = this.name_;
                if (name_2 != null && name_2 != StringValue.getDefaultInstance()) {
                    this.name_ = (StringValue)w.e(this.name_, name_);
                }
                else {
                    this.name_ = name_;
                }
            }
            
            private void mergeOver18(final BoolValue over18_) {
                over18_.getClass();
                final BoolValue over18_2 = this.over18_;
                if (over18_2 != null && over18_2 != BoolValue.getDefaultInstance()) {
                    this.over18_ = (BoolValue)o.g(this.over18_, over18_);
                }
                else {
                    this.over18_ = over18_;
                }
            }
            
            private void mergePrimaryColor(final StringValue primaryColor_) {
                primaryColor_.getClass();
                final StringValue primaryColor_2 = this.primaryColor_;
                if (primaryColor_2 != null && primaryColor_2 != StringValue.getDefaultInstance()) {
                    this.primaryColor_ = (StringValue)w.e(this.primaryColor_, primaryColor_);
                }
                else {
                    this.primaryColor_ = primaryColor_;
                }
            }
            
            private void mergePublicDescription(final StringValue publicDescription_) {
                publicDescription_.getClass();
                final StringValue publicDescription_2 = this.publicDescription_;
                if (publicDescription_2 != null && publicDescription_2 != StringValue.getDefaultInstance()) {
                    this.publicDescription_ = (StringValue)w.e(this.publicDescription_, publicDescription_);
                }
                else {
                    this.publicDescription_ = publicDescription_;
                }
            }
            
            private void mergeQuarantine(final BoolValue quarantine_) {
                quarantine_.getClass();
                final BoolValue quarantine_2 = this.quarantine_;
                if (quarantine_2 != null && quarantine_2 != BoolValue.getDefaultInstance()) {
                    this.quarantine_ = (BoolValue)o.g(this.quarantine_, quarantine_);
                }
                else {
                    this.quarantine_ = quarantine_;
                }
            }
            
            private void mergeRestrictCommenting(final BoolValue restrictCommenting_) {
                restrictCommenting_.getClass();
                final BoolValue restrictCommenting_2 = this.restrictCommenting_;
                if (restrictCommenting_2 != null && restrictCommenting_2 != BoolValue.getDefaultInstance()) {
                    this.restrictCommenting_ = (BoolValue)o.g(this.restrictCommenting_, restrictCommenting_);
                }
                else {
                    this.restrictCommenting_ = restrictCommenting_;
                }
            }
            
            private void mergeRestrictPosting(final BoolValue restrictPosting_) {
                restrictPosting_.getClass();
                final BoolValue restrictPosting_2 = this.restrictPosting_;
                if (restrictPosting_2 != null && restrictPosting_2 != BoolValue.getDefaultInstance()) {
                    this.restrictPosting_ = (BoolValue)o.g(this.restrictPosting_, restrictPosting_);
                }
                else {
                    this.restrictPosting_ = restrictPosting_;
                }
            }
            
            private void mergeShowMedia(final BoolValue showMedia_) {
                showMedia_.getClass();
                final BoolValue showMedia_2 = this.showMedia_;
                if (showMedia_2 != null && showMedia_2 != BoolValue.getDefaultInstance()) {
                    this.showMedia_ = (BoolValue)o.g(this.showMedia_, showMedia_);
                }
                else {
                    this.showMedia_ = showMedia_;
                }
            }
            
            private void mergeSubmitLinkLabel(final StringValue submitLinkLabel_) {
                submitLinkLabel_.getClass();
                final StringValue submitLinkLabel_2 = this.submitLinkLabel_;
                if (submitLinkLabel_2 != null && submitLinkLabel_2 != StringValue.getDefaultInstance()) {
                    this.submitLinkLabel_ = (StringValue)w.e(this.submitLinkLabel_, submitLinkLabel_);
                }
                else {
                    this.submitLinkLabel_ = submitLinkLabel_;
                }
            }
            
            private void mergeSubmitTextLabel(final StringValue submitTextLabel_) {
                submitTextLabel_.getClass();
                final StringValue submitTextLabel_2 = this.submitTextLabel_;
                if (submitTextLabel_2 != null && submitTextLabel_2 != StringValue.getDefaultInstance()) {
                    this.submitTextLabel_ = (StringValue)w.e(this.submitTextLabel_, submitTextLabel_);
                }
                else {
                    this.submitTextLabel_ = submitTextLabel_;
                }
            }
            
            private void mergeSubredditType(final StringValue subredditType_) {
                subredditType_.getClass();
                final StringValue subredditType_2 = this.subredditType_;
                if (subredditType_2 != null && subredditType_2 != StringValue.getDefaultInstance()) {
                    this.subredditType_ = (StringValue)w.e(this.subredditType_, subredditType_);
                }
                else {
                    this.subredditType_ = subredditType_;
                }
            }
            
            private void mergeSubscribers(final Int64Value subscribers_) {
                subscribers_.getClass();
                final Int64Value subscribers_2 = this.subscribers_;
                if (subscribers_2 != null && subscribers_2 != Int64Value.getDefaultInstance()) {
                    this.subscribers_ = (Int64Value)h.b(this.subscribers_, subscribers_);
                }
                else {
                    this.subscribers_ = subscribers_;
                }
            }
            
            private void mergeTitle(final StringValue title_) {
                title_.getClass();
                final StringValue title_2 = this.title_;
                if (title_2 != null && title_2 != StringValue.getDefaultInstance()) {
                    this.title_ = (StringValue)w.e(this.title_, title_);
                }
                else {
                    this.title_ = title_;
                }
            }
            
            private void mergeUrl(final StringValue url_) {
                url_.getClass();
                final StringValue url_2 = this.url_;
                if (url_2 != null && url_2 != StringValue.getDefaultInstance()) {
                    this.url_ = (StringValue)w.e(this.url_, url_);
                }
                else {
                    this.url_ = url_;
                }
            }
            
            private void mergeUserIsBanned(final BoolValue userIsBanned_) {
                userIsBanned_.getClass();
                final BoolValue userIsBanned_2 = this.userIsBanned_;
                if (userIsBanned_2 != null && userIsBanned_2 != BoolValue.getDefaultInstance()) {
                    this.userIsBanned_ = (BoolValue)o.g(this.userIsBanned_, userIsBanned_);
                }
                else {
                    this.userIsBanned_ = userIsBanned_;
                }
            }
            
            private void mergeUserIsContributor(final BoolValue userIsContributor_) {
                userIsContributor_.getClass();
                final BoolValue userIsContributor_2 = this.userIsContributor_;
                if (userIsContributor_2 != null && userIsContributor_2 != BoolValue.getDefaultInstance()) {
                    this.userIsContributor_ = (BoolValue)o.g(this.userIsContributor_, userIsContributor_);
                }
                else {
                    this.userIsContributor_ = userIsContributor_;
                }
            }
            
            private void mergeUserIsModerator(final BoolValue userIsModerator_) {
                userIsModerator_.getClass();
                final BoolValue userIsModerator_2 = this.userIsModerator_;
                if (userIsModerator_2 != null && userIsModerator_2 != BoolValue.getDefaultInstance()) {
                    this.userIsModerator_ = (BoolValue)o.g(this.userIsModerator_, userIsModerator_);
                }
                else {
                    this.userIsModerator_ = userIsModerator_;
                }
            }
            
            private void mergeUserIsMuted(final BoolValue userIsMuted_) {
                userIsMuted_.getClass();
                final BoolValue userIsMuted_2 = this.userIsMuted_;
                if (userIsMuted_2 != null && userIsMuted_2 != BoolValue.getDefaultInstance()) {
                    this.userIsMuted_ = (BoolValue)o.g(this.userIsMuted_, userIsMuted_);
                }
                else {
                    this.userIsMuted_ = userIsMuted_;
                }
            }
            
            private void mergeUserIsSubscriber(final BoolValue userIsSubscriber_) {
                userIsSubscriber_.getClass();
                final BoolValue userIsSubscriber_2 = this.userIsSubscriber_;
                if (userIsSubscriber_2 != null && userIsSubscriber_2 != BoolValue.getDefaultInstance()) {
                    this.userIsSubscriber_ = (BoolValue)o.g(this.userIsSubscriber_, userIsSubscriber_);
                }
                else {
                    this.userIsSubscriber_ = userIsSubscriber_;
                }
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
            
            private void setBannerSize(final Int32Value bannerSize_) {
                bannerSize_.getClass();
                this.bannerSize_ = bannerSize_;
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
            
            private void setHeaderSize(final Int32Value headerSize_) {
                headerSize_.getClass();
                this.headerSize_ = headerSize_;
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
            
            private void setInkFlairPosition(final StringValue inkFlairPosition_) {
                inkFlairPosition_.getClass();
                this.inkFlairPosition_ = inkFlairPosition_;
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
                        return GeneratedMessageLite.newMessageInfo((c1)Subreddit.DEFAULT_INSTANCE, "\u0000)\u0000\u0000\u0001))\u0000\u0003\u0000\u0001\t\u0002\t\u0003\t\u0004\u001b\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\u001b\u000f\t\u0010\u001b\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t \t!\t\"\t#\t$\t%\t&\t'\t(\t)\t", new Object[] { "defaultSet_", "userIsContributor_", "bannerImg_", "allowedMediaInComments_", StringValue.class, "userIsBanned_", "freeFormReports_", "communityIcon_", "showMedia_", "iconColor_", "userIsMuted_", "displayName_", "headerImg_", "title_", "previousNames_", StringValue.class, "over18_", "iconSize_", Int32Value.class, "primaryColor_", "iconImg_", "description_", "submitLinkLabel_", "headerSize_", "restrictPosting_", "restrictCommenting_", "subscribers_", "submitTextLabel_", "isDefaultIcon_", "inkFlairPosition_", "displayNamePrefixed_", "keyColor_", "name_", "isDefaultBanner_", "url_", "quarantine_", "bannerSize_", "userIsModerator_", "acceptFollowers_", "publicDescription_", "linkFlairEnabled_", "disableContributorRequests_", "subredditType_", "userIsSubscriber_" });
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
            
            public Int32Value getBannerSize() {
                Int32Value int32Value;
                if ((int32Value = this.bannerSize_) == null) {
                    int32Value = Int32Value.getDefaultInstance();
                }
                return int32Value;
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
            
            public Int32Value getHeaderSize() {
                Int32Value int32Value;
                if ((int32Value = this.headerSize_) == null) {
                    int32Value = Int32Value.getDefaultInstance();
                }
                return int32Value;
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
            
            public StringValue getInkFlairPosition() {
                StringValue stringValue;
                if ((stringValue = this.inkFlairPosition_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
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
            
            public boolean hasBannerSize() {
                return this.bannerSize_ != null;
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
            
            public boolean hasHeaderSize() {
                return this.headerSize_ != null;
            }
            
            public boolean hasIconColor() {
                return this.iconColor_ != null;
            }
            
            public boolean hasIconImg() {
                return this.iconImg_ != null;
            }
            
            public boolean hasInkFlairPosition() {
                return this.inkFlairPosition_ != null;
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
                    super((GeneratedMessageLite)Subreddit.access$42200());
                }
            }
        }
        
        public static final class a extends GeneratedMessageLite$b<AutocompleteAccount, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)AutocompleteAccount.access$55600());
            }
        }
    }
    
    public static final class AutocompleteResponse extends GeneratedMessageLite<AutocompleteResponse, a> implements d1
    {
        public static final int AFTER_FIELD_NUMBER = 1;
        public static final int BEFORE_FIELD_NUMBER = 2;
        public static final int CHILDREN_ACCOUNTS_FIELD_NUMBER = 5;
        public static final int CHILDREN_SUBREDDITS_FIELD_NUMBER = 4;
        private static final AutocompleteResponse DEFAULT_INSTANCE;
        public static final int DIST_FIELD_NUMBER = 3;
        private static volatile n1<AutocompleteResponse> PARSER;
        private StringValue after_;
        private StringValue before_;
        private Internal$j<WrappedAutoCompleteAccount> childrenAccounts_;
        private Internal$j<WrappedAutoCompleteSubreddit> childrenSubreddits_;
        private Int32Value dist_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)AutocompleteResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new AutocompleteResponse()));
        }
        
        private AutocompleteResponse() {
            this.childrenSubreddits_ = (Internal$j<WrappedAutoCompleteSubreddit>)GeneratedMessageLite.emptyProtobufList();
            this.childrenAccounts_ = (Internal$j<WrappedAutoCompleteAccount>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static AutocompleteResponse access$64000() {
            return AutocompleteResponse.DEFAULT_INSTANCE;
        }
        
        public static void access$64100(final AutocompleteResponse autocompleteResponse, final StringValue after) {
            autocompleteResponse.setAfter(after);
        }
        
        public static void access$64200(final AutocompleteResponse autocompleteResponse, final StringValue stringValue) {
            autocompleteResponse.mergeAfter(stringValue);
        }
        
        public static void access$64300(final AutocompleteResponse autocompleteResponse) {
            autocompleteResponse.clearAfter();
        }
        
        public static void access$64400(final AutocompleteResponse autocompleteResponse, final StringValue before) {
            autocompleteResponse.setBefore(before);
        }
        
        public static void access$64500(final AutocompleteResponse autocompleteResponse, final StringValue stringValue) {
            autocompleteResponse.mergeBefore(stringValue);
        }
        
        public static void access$64600(final AutocompleteResponse autocompleteResponse) {
            autocompleteResponse.clearBefore();
        }
        
        public static void access$64700(final AutocompleteResponse autocompleteResponse, final Int32Value dist) {
            autocompleteResponse.setDist(dist);
        }
        
        public static void access$64800(final AutocompleteResponse autocompleteResponse, final Int32Value int32Value) {
            autocompleteResponse.mergeDist(int32Value);
        }
        
        public static void access$64900(final AutocompleteResponse autocompleteResponse) {
            autocompleteResponse.clearDist();
        }
        
        public static void access$65000(final AutocompleteResponse autocompleteResponse, final int n, final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            autocompleteResponse.setChildrenSubreddits(n, wrappedAutoCompleteSubreddit);
        }
        
        public static void access$65100(final AutocompleteResponse autocompleteResponse, final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            autocompleteResponse.addChildrenSubreddits(wrappedAutoCompleteSubreddit);
        }
        
        public static void access$65200(final AutocompleteResponse autocompleteResponse, final int n, final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            autocompleteResponse.addChildrenSubreddits(n, wrappedAutoCompleteSubreddit);
        }
        
        public static void access$65300(final AutocompleteResponse autocompleteResponse, final Iterable iterable) {
            autocompleteResponse.addAllChildrenSubreddits(iterable);
        }
        
        public static void access$65400(final AutocompleteResponse autocompleteResponse) {
            autocompleteResponse.clearChildrenSubreddits();
        }
        
        public static void access$65500(final AutocompleteResponse autocompleteResponse, final int n) {
            autocompleteResponse.removeChildrenSubreddits(n);
        }
        
        public static void access$65600(final AutocompleteResponse autocompleteResponse, final int n, final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            autocompleteResponse.setChildrenAccounts(n, wrappedAutoCompleteAccount);
        }
        
        public static void access$65700(final AutocompleteResponse autocompleteResponse, final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            autocompleteResponse.addChildrenAccounts(wrappedAutoCompleteAccount);
        }
        
        public static void access$65800(final AutocompleteResponse autocompleteResponse, final int n, final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            autocompleteResponse.addChildrenAccounts(n, wrappedAutoCompleteAccount);
        }
        
        public static void access$65900(final AutocompleteResponse autocompleteResponse, final Iterable iterable) {
            autocompleteResponse.addAllChildrenAccounts(iterable);
        }
        
        public static void access$66000(final AutocompleteResponse autocompleteResponse) {
            autocompleteResponse.clearChildrenAccounts();
        }
        
        public static void access$66100(final AutocompleteResponse autocompleteResponse, final int n) {
            autocompleteResponse.removeChildrenAccounts(n);
        }
        
        private void addAllChildrenAccounts(final Iterable<? extends WrappedAutoCompleteAccount> iterable) {
            this.ensureChildrenAccountsIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.childrenAccounts_);
        }
        
        private void addAllChildrenSubreddits(final Iterable<? extends WrappedAutoCompleteSubreddit> iterable) {
            this.ensureChildrenSubredditsIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.childrenSubreddits_);
        }
        
        private void addChildrenAccounts(final int n, final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            wrappedAutoCompleteAccount.getClass();
            this.ensureChildrenAccountsIsMutable();
            ((List<WrappedAutoCompleteAccount>)this.childrenAccounts_).add(n, wrappedAutoCompleteAccount);
        }
        
        private void addChildrenAccounts(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            wrappedAutoCompleteAccount.getClass();
            this.ensureChildrenAccountsIsMutable();
            ((List<WrappedAutoCompleteAccount>)this.childrenAccounts_).add(wrappedAutoCompleteAccount);
        }
        
        private void addChildrenSubreddits(final int n, final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            wrappedAutoCompleteSubreddit.getClass();
            this.ensureChildrenSubredditsIsMutable();
            ((List<WrappedAutoCompleteSubreddit>)this.childrenSubreddits_).add(n, wrappedAutoCompleteSubreddit);
        }
        
        private void addChildrenSubreddits(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            wrappedAutoCompleteSubreddit.getClass();
            this.ensureChildrenSubredditsIsMutable();
            ((List<WrappedAutoCompleteSubreddit>)this.childrenSubreddits_).add(wrappedAutoCompleteSubreddit);
        }
        
        private void clearAfter() {
            this.after_ = null;
        }
        
        private void clearBefore() {
            this.before_ = null;
        }
        
        private void clearChildrenAccounts() {
            this.childrenAccounts_ = (Internal$j<WrappedAutoCompleteAccount>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearChildrenSubreddits() {
            this.childrenSubreddits_ = (Internal$j<WrappedAutoCompleteSubreddit>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearDist() {
            this.dist_ = null;
        }
        
        private void ensureChildrenAccountsIsMutable() {
            final Internal$j<WrappedAutoCompleteAccount> childrenAccounts_ = this.childrenAccounts_;
            if (!childrenAccounts_.E0()) {
                this.childrenAccounts_ = (Internal$j<WrappedAutoCompleteAccount>)GeneratedMessageLite.mutableCopy((Internal$j)childrenAccounts_);
            }
        }
        
        private void ensureChildrenSubredditsIsMutable() {
            final Internal$j<WrappedAutoCompleteSubreddit> childrenSubreddits_ = this.childrenSubreddits_;
            if (!childrenSubreddits_.E0()) {
                this.childrenSubreddits_ = (Internal$j<WrappedAutoCompleteSubreddit>)GeneratedMessageLite.mutableCopy((Internal$j)childrenSubreddits_);
            }
        }
        
        public static AutocompleteResponse getDefaultInstance() {
            return AutocompleteResponse.DEFAULT_INSTANCE;
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
            return (a)AutocompleteResponse.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final AutocompleteResponse autocompleteResponse) {
            return (a)AutocompleteResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)autocompleteResponse);
        }
        
        public static AutocompleteResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (AutocompleteResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AutocompleteResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AutocompleteResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AutocompleteResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, byteString);
        }
        
        public static AutocompleteResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static AutocompleteResponse parseFrom(final l l) throws IOException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, l);
        }
        
        public static AutocompleteResponse parseFrom(final l l, final d0 d0) throws IOException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, l, d0);
        }
        
        public static AutocompleteResponse parseFrom(final InputStream inputStream) throws IOException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AutocompleteResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AutocompleteResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static AutocompleteResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static AutocompleteResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, array);
        }
        
        public static AutocompleteResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (AutocompleteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<AutocompleteResponse> parser() {
            return (n1<AutocompleteResponse>)AutocompleteResponse.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeChildrenAccounts(final int n) {
            this.ensureChildrenAccountsIsMutable();
            this.childrenAccounts_.remove(n);
        }
        
        private void removeChildrenSubreddits(final int n) {
            this.ensureChildrenSubredditsIsMutable();
            this.childrenSubreddits_.remove(n);
        }
        
        private void setAfter(final StringValue after_) {
            after_.getClass();
            this.after_ = after_;
        }
        
        private void setBefore(final StringValue before_) {
            before_.getClass();
            this.before_ = before_;
        }
        
        private void setChildrenAccounts(final int n, final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            wrappedAutoCompleteAccount.getClass();
            this.ensureChildrenAccountsIsMutable();
            ((List<WrappedAutoCompleteAccount>)this.childrenAccounts_).set(n, wrappedAutoCompleteAccount);
        }
        
        private void setChildrenSubreddits(final int n, final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            wrappedAutoCompleteSubreddit.getClass();
            this.ensureChildrenSubredditsIsMutable();
            ((List<WrappedAutoCompleteSubreddit>)this.childrenSubreddits_).set(n, wrappedAutoCompleteSubreddit);
        }
        
        private void setDist(final Int32Value dist_) {
            dist_.getClass();
            this.dist_ = dist_;
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
                    final n1<AutocompleteResponse> parser;
                    if ((parser = AutocompleteResponse.PARSER) == null) {
                        synchronized (AutocompleteResponse.class) {
                            if (AutocompleteResponse.PARSER == null) {
                                AutocompleteResponse.PARSER = (n1<AutocompleteResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)AutocompleteResponse.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return AutocompleteResponse.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)AutocompleteResponse.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\u001b\u0005\u001b", new Object[] { "after_", "before_", "dist_", "childrenSubreddits_", WrappedAutoCompleteSubreddit.class, "childrenAccounts_", WrappedAutoCompleteAccount.class });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new AutocompleteResponse();
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
        
        public WrappedAutoCompleteAccount getChildrenAccounts(final int n) {
            return ((List<WrappedAutoCompleteAccount>)this.childrenAccounts_).get(n);
        }
        
        public int getChildrenAccountsCount() {
            return ((List)this.childrenAccounts_).size();
        }
        
        public List<WrappedAutoCompleteAccount> getChildrenAccountsList() {
            return (List<WrappedAutoCompleteAccount>)this.childrenAccounts_;
        }
        
        public SubredditsMsg$SubredditAutocompleteResponse$b getChildrenAccountsOrBuilder(final int n) {
            return ((List<SubredditsMsg$SubredditAutocompleteResponse$b>)this.childrenAccounts_).get(n);
        }
        
        public List<? extends SubredditsMsg$SubredditAutocompleteResponse$b> getChildrenAccountsOrBuilderList() {
            return (List<? extends SubredditsMsg$SubredditAutocompleteResponse$b>)this.childrenAccounts_;
        }
        
        public WrappedAutoCompleteSubreddit getChildrenSubreddits(final int n) {
            return ((List<WrappedAutoCompleteSubreddit>)this.childrenSubreddits_).get(n);
        }
        
        public int getChildrenSubredditsCount() {
            return ((List)this.childrenSubreddits_).size();
        }
        
        public List<WrappedAutoCompleteSubreddit> getChildrenSubredditsList() {
            return (List<WrappedAutoCompleteSubreddit>)this.childrenSubreddits_;
        }
        
        public SubredditsMsg$SubredditAutocompleteResponse$c getChildrenSubredditsOrBuilder(final int n) {
            return ((List<SubredditsMsg$SubredditAutocompleteResponse$c>)this.childrenSubreddits_).get(n);
        }
        
        public List<? extends SubredditsMsg$SubredditAutocompleteResponse$c> getChildrenSubredditsOrBuilderList() {
            return (List<? extends SubredditsMsg$SubredditAutocompleteResponse$c>)this.childrenSubreddits_;
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
        
        public static final class a extends GeneratedMessageLite$b<AutocompleteResponse, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)AutocompleteResponse.access$64000());
            }
        }
    }
    
    public static final class WrappedAutoCompleteAccount extends GeneratedMessageLite<WrappedAutoCompleteAccount, a> implements SubredditsMsg$SubredditAutocompleteResponse$b
    {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final WrappedAutoCompleteAccount DEFAULT_INSTANCE;
        public static final int KIND_FIELD_NUMBER = 1;
        private static volatile n1<WrappedAutoCompleteAccount> PARSER;
        private AutocompleteAccount data_;
        private String kind_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)WrappedAutoCompleteAccount.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new WrappedAutoCompleteAccount()));
        }
        
        private WrappedAutoCompleteAccount() {
            this.kind_ = "";
        }
        
        public static WrappedAutoCompleteAccount access$63200() {
            return WrappedAutoCompleteAccount.DEFAULT_INSTANCE;
        }
        
        public static void access$63300(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount, final String kind) {
            wrappedAutoCompleteAccount.setKind(kind);
        }
        
        public static void access$63400(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            wrappedAutoCompleteAccount.clearKind();
        }
        
        public static void access$63500(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount, final ByteString kindBytes) {
            wrappedAutoCompleteAccount.setKindBytes(kindBytes);
        }
        
        public static void access$63600(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount, final AutocompleteAccount data) {
            wrappedAutoCompleteAccount.setData(data);
        }
        
        public static void access$63700(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount, final AutocompleteAccount autocompleteAccount) {
            wrappedAutoCompleteAccount.mergeData(autocompleteAccount);
        }
        
        public static void access$63800(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            wrappedAutoCompleteAccount.clearData();
        }
        
        private void clearData() {
            this.data_ = null;
        }
        
        private void clearKind() {
            this.kind_ = getDefaultInstance().getKind();
        }
        
        public static WrappedAutoCompleteAccount getDefaultInstance() {
            return WrappedAutoCompleteAccount.DEFAULT_INSTANCE;
        }
        
        private void mergeData(final AutocompleteAccount data_) {
            data_.getClass();
            final AutocompleteAccount data_2 = this.data_;
            if (data_2 != null && data_2 != AutocompleteAccount.getDefaultInstance()) {
                final AutocompleteAccount.a builder = AutocompleteAccount.newBuilder(this.data_);
                builder.h((GeneratedMessageLite)data_);
                this.data_ = (AutocompleteAccount)builder.c();
            }
            else {
                this.data_ = data_;
            }
        }
        
        public static a newBuilder() {
            return (a)WrappedAutoCompleteAccount.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final WrappedAutoCompleteAccount wrappedAutoCompleteAccount) {
            return (a)WrappedAutoCompleteAccount.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)wrappedAutoCompleteAccount);
        }
        
        public static WrappedAutoCompleteAccount parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedAutoCompleteAccount parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, byteString);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final l l) throws IOException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, l);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final l l, final d0 d0) throws IOException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, l, d0);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final InputStream inputStream) throws IOException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, array);
        }
        
        public static WrappedAutoCompleteAccount parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteAccount)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<WrappedAutoCompleteAccount> parser() {
            return (n1<WrappedAutoCompleteAccount>)WrappedAutoCompleteAccount.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setData(final AutocompleteAccount data_) {
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
                    final n1<WrappedAutoCompleteAccount> parser;
                    if ((parser = WrappedAutoCompleteAccount.PARSER) == null) {
                        synchronized (WrappedAutoCompleteAccount.class) {
                            if (WrappedAutoCompleteAccount.PARSER == null) {
                                WrappedAutoCompleteAccount.PARSER = (n1<WrappedAutoCompleteAccount>)new GeneratedMessageLite$c((GeneratedMessageLite)WrappedAutoCompleteAccount.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return WrappedAutoCompleteAccount.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)WrappedAutoCompleteAccount.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "kind_", "data_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new WrappedAutoCompleteAccount();
                }
            }
        }
        
        public AutocompleteAccount getData() {
            GeneratedMessageLite<AutocompleteAccount, AutocompleteAccount.a> generatedMessageLite;
            if ((generatedMessageLite = this.data_) == null) {
                generatedMessageLite = AutocompleteAccount.getDefaultInstance();
            }
            return (AutocompleteAccount)generatedMessageLite;
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
        
        public static final class a extends GeneratedMessageLite$b<WrappedAutoCompleteAccount, a> implements SubredditsMsg$SubredditAutocompleteResponse$b
        {
            public a() {
                super((GeneratedMessageLite)WrappedAutoCompleteAccount.access$63200());
            }
        }
    }
    
    public static final class WrappedAutoCompleteSubreddit extends GeneratedMessageLite<WrappedAutoCompleteSubreddit, a> implements SubredditsMsg$SubredditAutocompleteResponse$c
    {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final WrappedAutoCompleteSubreddit DEFAULT_INSTANCE;
        public static final int KIND_FIELD_NUMBER = 1;
        private static volatile n1<WrappedAutoCompleteSubreddit> PARSER;
        private SubredditsMsg$FullSubredditObject data_;
        private String kind_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)WrappedAutoCompleteSubreddit.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new WrappedAutoCompleteSubreddit()));
        }
        
        private WrappedAutoCompleteSubreddit() {
            this.kind_ = "";
        }
        
        public static WrappedAutoCompleteSubreddit access$62400() {
            return WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE;
        }
        
        public static void access$62500(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit, final String kind) {
            wrappedAutoCompleteSubreddit.setKind(kind);
        }
        
        public static void access$62600(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            wrappedAutoCompleteSubreddit.clearKind();
        }
        
        public static void access$62700(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit, final ByteString kindBytes) {
            wrappedAutoCompleteSubreddit.setKindBytes(kindBytes);
        }
        
        public static void access$62800(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit, final SubredditsMsg$FullSubredditObject data) {
            wrappedAutoCompleteSubreddit.setData(data);
        }
        
        public static void access$62900(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit, final SubredditsMsg$FullSubredditObject subredditsMsg$FullSubredditObject) {
            wrappedAutoCompleteSubreddit.mergeData(subredditsMsg$FullSubredditObject);
        }
        
        public static void access$63000(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            wrappedAutoCompleteSubreddit.clearData();
        }
        
        private void clearData() {
            this.data_ = null;
        }
        
        private void clearKind() {
            this.kind_ = getDefaultInstance().getKind();
        }
        
        public static WrappedAutoCompleteSubreddit getDefaultInstance() {
            return WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE;
        }
        
        private void mergeData(final SubredditsMsg$FullSubredditObject data_) {
            data_.getClass();
            final SubredditsMsg$FullSubredditObject data_2 = this.data_;
            if (data_2 != null && data_2 != SubredditsMsg$FullSubredditObject.getDefaultInstance()) {
                final SubredditsMsg$FullSubredditObject$a builder = SubredditsMsg$FullSubredditObject.newBuilder(this.data_);
                ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)data_);
                this.data_ = (SubredditsMsg$FullSubredditObject)((GeneratedMessageLite$b)builder).c();
            }
            else {
                this.data_ = data_;
            }
        }
        
        public static a newBuilder() {
            return (a)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final WrappedAutoCompleteSubreddit wrappedAutoCompleteSubreddit) {
            return (a)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)wrappedAutoCompleteSubreddit);
        }
        
        public static WrappedAutoCompleteSubreddit parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedAutoCompleteSubreddit parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, byteString);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final l l) throws IOException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, l);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final l l, final d0 d0) throws IOException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, l, d0);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final InputStream inputStream) throws IOException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, inputStream);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, array);
        }
        
        public static WrappedAutoCompleteSubreddit parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (WrappedAutoCompleteSubreddit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<WrappedAutoCompleteSubreddit> parser() {
            return (n1<WrappedAutoCompleteSubreddit>)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setData(final SubredditsMsg$FullSubredditObject data_) {
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
                    final n1<WrappedAutoCompleteSubreddit> parser;
                    if ((parser = WrappedAutoCompleteSubreddit.PARSER) == null) {
                        synchronized (WrappedAutoCompleteSubreddit.class) {
                            if (WrappedAutoCompleteSubreddit.PARSER == null) {
                                WrappedAutoCompleteSubreddit.PARSER = (n1<WrappedAutoCompleteSubreddit>)new GeneratedMessageLite$c((GeneratedMessageLite)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)WrappedAutoCompleteSubreddit.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "kind_", "data_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new WrappedAutoCompleteSubreddit();
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
        
        public String getKind() {
            return this.kind_;
        }
        
        public ByteString getKindBytes() {
            return ByteString.copyFromUtf8(this.kind_);
        }
        
        public boolean hasData() {
            return this.data_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<WrappedAutoCompleteSubreddit, a> implements SubredditsMsg$SubredditAutocompleteResponse$c
        {
            public a() {
                super((GeneratedMessageLite)WrappedAutoCompleteSubreddit.access$62400());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditAutocompleteResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteResponse.access$66300());
        }
    }
}
