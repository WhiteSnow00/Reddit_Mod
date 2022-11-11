// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.users;

import com.google.protobuf.l0;
import java.util.List;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$SubredditObject;
import com.google.protobuf.Internal$j;
import com.google.protobuf.Int32Value;
import al0.b;
import com.google.protobuf.Int64Value;
import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.BoolValue;
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

public final class UsersMsg$UserAboutResponse extends GeneratedMessageLite<UsersMsg$UserAboutResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final UsersMsg$UserAboutResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<UsersMsg$UserAboutResponse> PARSER;
    private UserAboutData data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UserAboutResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UserAboutResponse()));
    }
    
    private UsersMsg$UserAboutResponse() {
    }
    
    public static /* synthetic */ UsersMsg$UserAboutResponse access$55900() {
        return UsersMsg$UserAboutResponse.DEFAULT_INSTANCE;
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static UsersMsg$UserAboutResponse getDefaultInstance() {
        return UsersMsg$UserAboutResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final UserAboutData data_) {
        data_.getClass();
        final UserAboutData data_2 = this.data_;
        if (data_2 != null && data_2 != UserAboutData.getDefaultInstance()) {
            final UserAboutData.a builder = UserAboutData.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (UserAboutData)builder.d();
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
        return (a)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UserAboutResponse usersMsg$UserAboutResponse) {
        return (a)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UserAboutResponse);
    }
    
    public static UsersMsg$UserAboutResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserAboutResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final l l) throws IOException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UserAboutResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UserAboutResponse> parser() {
        return (n1<UsersMsg$UserAboutResponse>)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final UserAboutData data_) {
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
                final n1<UsersMsg$UserAboutResponse> parser;
                if ((parser = UsersMsg$UserAboutResponse.PARSER) == null) {
                    synchronized (UsersMsg$UserAboutResponse.class) {
                        if (UsersMsg$UserAboutResponse.PARSER == null) {
                            UsersMsg$UserAboutResponse.PARSER = (n1<UsersMsg$UserAboutResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UserAboutResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UserAboutResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UserAboutResponse();
            }
        }
    }
    
    public UserAboutData getData() {
        UserAboutData userAboutData;
        if ((userAboutData = this.data_) == null) {
            userAboutData = UserAboutData.getDefaultInstance();
        }
        return userAboutData;
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
    
    public static final class FeaturesType extends GeneratedMessageLite<FeaturesType, a> implements d1
    {
        public static final int AWARDS_ON_STREAMS_FIELD_NUMBER = 7;
        public static final int CHAT_FIELD_NUMBER = 4;
        public static final int CHAT_GROUP_ROLLOUT_FIELD_NUMBER = 23;
        public static final int CHAT_SUBREDDIT_FIELD_NUMBER = 18;
        public static final int CHAT_USER_SETTINGS_FIELD_NUMBER = 15;
        public static final int COOKIE_CONSENT_BANNER_FIELD_NUMBER = 11;
        public static final int CROWD_CONTROL_FOR_POST_FIELD_NUMBER = 21;
        private static final FeaturesType DEFAULT_INSTANCE;
        public static final int DO_NOT_TRACK_FIELD_NUMBER = 13;
        public static final int EXPENSIVE_COINS_PACKAGE_FIELD_NUMBER = 27;
        public static final int IS_EMAIL_PERMISSION_REQUIRED_FIELD_NUMBER = 5;
        public static final int LIVE_ORANGEREDS_FIELD_NUMBER = 10;
        public static final int MODLOG_COPYRIGHT_REMOVAL_FIELD_NUMBER = 12;
        public static final int MOD_AWARDS_FIELD_NUMBER = 6;
        public static final int MOD_SERVICE_MUTE_READS_FIELD_NUMBER = 14;
        public static final int MOD_SERVICE_MUTE_WRITES_FIELD_NUMBER = 1;
        public static final int MWEB_NSFW_XPROMO_FIELD_NUMBER = 31;
        public static final int MWEB_SHARING_CLIPBOARD_FIELD_NUMBER = 30;
        public static final int MWEB_XPROMO_INTERSTITIAL_COMMENTS_ANDROID_FIELD_NUMBER = 20;
        public static final int MWEB_XPROMO_INTERSTITIAL_COMMENTS_IOS_FIELD_NUMBER = 17;
        public static final int MWEB_XPROMO_MODAL_LISTING_CLICK_DAILY_DISMISSIBLE_ANDROID_FIELD_NUMBER = 26;
        public static final int MWEB_XPROMO_MODAL_LISTING_CLICK_DAILY_DISMISSIBLE_IOS_FIELD_NUMBER = 9;
        public static final int MWEB_XPROMO_REVAMP_V2_FIELD_NUMBER = 29;
        public static final int MWEB_XPROMO_REVAMP_V3_FIELD_NUMBER = 28;
        public static final int NOREFERRER_TO_NOOPENER_FIELD_NUMBER = 22;
        private static volatile n1<FeaturesType> PARSER;
        public static final int PREMIUM_SUBSCRIPTIONS_TABLE_FIELD_NUMBER = 19;
        public static final int PROMOTED_TREND_BLANKS_FIELD_NUMBER = 2;
        public static final int RESIZED_STYLES_IMAGES_FIELD_NUMBER = 24;
        public static final int SHOW_AMP_LINK_FIELD_NUMBER = 3;
        public static final int SPEZ_MODAL_FIELD_NUMBER = 25;
        public static final int USE_PREF_ACCOUNT_DEPLOYMENT_FIELD_NUMBER = 16;
        public static final int WEBHOOK_CONFIG_FIELD_NUMBER = 8;
        private BoolValue awardsOnStreams_;
        private BoolValue chatGroupRollout_;
        private BoolValue chatSubreddit_;
        private BoolValue chatUserSettings_;
        private BoolValue chat_;
        private BoolValue cookieConsentBanner_;
        private BoolValue crowdControlForPost_;
        private BoolValue doNotTrack_;
        private BoolValue expensiveCoinsPackage_;
        private BoolValue isEmailPermissionRequired_;
        private BoolValue liveOrangereds_;
        private BoolValue modAwards_;
        private BoolValue modServiceMuteReads_;
        private BoolValue modServiceMuteWrites_;
        private BoolValue modlogCopyrightRemoval_;
        private MwebType mwebNsfwXpromo_;
        private MwebType mwebSharingClipboard_;
        private BoolValue mwebXpromoInterstitialCommentsAndroid_;
        private BoolValue mwebXpromoInterstitialCommentsIos_;
        private BoolValue mwebXpromoModalListingClickDailyDismissibleAndroid_;
        private BoolValue mwebXpromoModalListingClickDailyDismissibleIos_;
        private MwebType mwebXpromoRevampV2_;
        private MwebType mwebXpromoRevampV3_;
        private BoolValue noreferrerToNoopener_;
        private BoolValue premiumSubscriptionsTable_;
        private BoolValue promotedTrendBlanks_;
        private BoolValue resizedStylesImages_;
        private BoolValue showAmpLink_;
        private BoolValue spezModal_;
        private BoolValue usePrefAccountDeployment_;
        private BoolValue webhookConfig_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)FeaturesType.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new FeaturesType()));
        }
        
        private FeaturesType() {
        }
        
        public static /* synthetic */ FeaturesType access$27000() {
            return FeaturesType.DEFAULT_INSTANCE;
        }
        
        private void clearAwardsOnStreams() {
            this.awardsOnStreams_ = null;
        }
        
        private void clearChat() {
            this.chat_ = null;
        }
        
        private void clearChatGroupRollout() {
            this.chatGroupRollout_ = null;
        }
        
        private void clearChatSubreddit() {
            this.chatSubreddit_ = null;
        }
        
        private void clearChatUserSettings() {
            this.chatUserSettings_ = null;
        }
        
        private void clearCookieConsentBanner() {
            this.cookieConsentBanner_ = null;
        }
        
        private void clearCrowdControlForPost() {
            this.crowdControlForPost_ = null;
        }
        
        private void clearDoNotTrack() {
            this.doNotTrack_ = null;
        }
        
        private void clearExpensiveCoinsPackage() {
            this.expensiveCoinsPackage_ = null;
        }
        
        private void clearIsEmailPermissionRequired() {
            this.isEmailPermissionRequired_ = null;
        }
        
        private void clearLiveOrangereds() {
            this.liveOrangereds_ = null;
        }
        
        private void clearModAwards() {
            this.modAwards_ = null;
        }
        
        private void clearModServiceMuteReads() {
            this.modServiceMuteReads_ = null;
        }
        
        private void clearModServiceMuteWrites() {
            this.modServiceMuteWrites_ = null;
        }
        
        private void clearModlogCopyrightRemoval() {
            this.modlogCopyrightRemoval_ = null;
        }
        
        private void clearMwebNsfwXpromo() {
            this.mwebNsfwXpromo_ = null;
        }
        
        private void clearMwebSharingClipboard() {
            this.mwebSharingClipboard_ = null;
        }
        
        private void clearMwebXpromoInterstitialCommentsAndroid() {
            this.mwebXpromoInterstitialCommentsAndroid_ = null;
        }
        
        private void clearMwebXpromoInterstitialCommentsIos() {
            this.mwebXpromoInterstitialCommentsIos_ = null;
        }
        
        private void clearMwebXpromoModalListingClickDailyDismissibleAndroid() {
            this.mwebXpromoModalListingClickDailyDismissibleAndroid_ = null;
        }
        
        private void clearMwebXpromoModalListingClickDailyDismissibleIos() {
            this.mwebXpromoModalListingClickDailyDismissibleIos_ = null;
        }
        
        private void clearMwebXpromoRevampV2() {
            this.mwebXpromoRevampV2_ = null;
        }
        
        private void clearMwebXpromoRevampV3() {
            this.mwebXpromoRevampV3_ = null;
        }
        
        private void clearNoreferrerToNoopener() {
            this.noreferrerToNoopener_ = null;
        }
        
        private void clearPremiumSubscriptionsTable() {
            this.premiumSubscriptionsTable_ = null;
        }
        
        private void clearPromotedTrendBlanks() {
            this.promotedTrendBlanks_ = null;
        }
        
        private void clearResizedStylesImages() {
            this.resizedStylesImages_ = null;
        }
        
        private void clearShowAmpLink() {
            this.showAmpLink_ = null;
        }
        
        private void clearSpezModal() {
            this.spezModal_ = null;
        }
        
        private void clearUsePrefAccountDeployment() {
            this.usePrefAccountDeployment_ = null;
        }
        
        private void clearWebhookConfig() {
            this.webhookConfig_ = null;
        }
        
        public static FeaturesType getDefaultInstance() {
            return FeaturesType.DEFAULT_INSTANCE;
        }
        
        private void mergeAwardsOnStreams(final BoolValue awardsOnStreams_) {
            awardsOnStreams_.getClass();
            final BoolValue awardsOnStreams_2 = this.awardsOnStreams_;
            if (awardsOnStreams_2 != null && awardsOnStreams_2 != BoolValue.getDefaultInstance()) {
                this.awardsOnStreams_ = (BoolValue)android.support.v4.media.a.f(this.awardsOnStreams_, awardsOnStreams_);
            }
            else {
                this.awardsOnStreams_ = awardsOnStreams_;
            }
        }
        
        private void mergeChat(final BoolValue chat_) {
            chat_.getClass();
            final BoolValue chat_2 = this.chat_;
            if (chat_2 != null && chat_2 != BoolValue.getDefaultInstance()) {
                this.chat_ = (BoolValue)android.support.v4.media.a.f(this.chat_, chat_);
            }
            else {
                this.chat_ = chat_;
            }
        }
        
        private void mergeChatGroupRollout(final BoolValue chatGroupRollout_) {
            chatGroupRollout_.getClass();
            final BoolValue chatGroupRollout_2 = this.chatGroupRollout_;
            if (chatGroupRollout_2 != null && chatGroupRollout_2 != BoolValue.getDefaultInstance()) {
                this.chatGroupRollout_ = (BoolValue)android.support.v4.media.a.f(this.chatGroupRollout_, chatGroupRollout_);
            }
            else {
                this.chatGroupRollout_ = chatGroupRollout_;
            }
        }
        
        private void mergeChatSubreddit(final BoolValue chatSubreddit_) {
            chatSubreddit_.getClass();
            final BoolValue chatSubreddit_2 = this.chatSubreddit_;
            if (chatSubreddit_2 != null && chatSubreddit_2 != BoolValue.getDefaultInstance()) {
                this.chatSubreddit_ = (BoolValue)android.support.v4.media.a.f(this.chatSubreddit_, chatSubreddit_);
            }
            else {
                this.chatSubreddit_ = chatSubreddit_;
            }
        }
        
        private void mergeChatUserSettings(final BoolValue chatUserSettings_) {
            chatUserSettings_.getClass();
            final BoolValue chatUserSettings_2 = this.chatUserSettings_;
            if (chatUserSettings_2 != null && chatUserSettings_2 != BoolValue.getDefaultInstance()) {
                this.chatUserSettings_ = (BoolValue)android.support.v4.media.a.f(this.chatUserSettings_, chatUserSettings_);
            }
            else {
                this.chatUserSettings_ = chatUserSettings_;
            }
        }
        
        private void mergeCookieConsentBanner(final BoolValue cookieConsentBanner_) {
            cookieConsentBanner_.getClass();
            final BoolValue cookieConsentBanner_2 = this.cookieConsentBanner_;
            if (cookieConsentBanner_2 != null && cookieConsentBanner_2 != BoolValue.getDefaultInstance()) {
                this.cookieConsentBanner_ = (BoolValue)android.support.v4.media.a.f(this.cookieConsentBanner_, cookieConsentBanner_);
            }
            else {
                this.cookieConsentBanner_ = cookieConsentBanner_;
            }
        }
        
        private void mergeCrowdControlForPost(final BoolValue crowdControlForPost_) {
            crowdControlForPost_.getClass();
            final BoolValue crowdControlForPost_2 = this.crowdControlForPost_;
            if (crowdControlForPost_2 != null && crowdControlForPost_2 != BoolValue.getDefaultInstance()) {
                this.crowdControlForPost_ = (BoolValue)android.support.v4.media.a.f(this.crowdControlForPost_, crowdControlForPost_);
            }
            else {
                this.crowdControlForPost_ = crowdControlForPost_;
            }
        }
        
        private void mergeDoNotTrack(final BoolValue doNotTrack_) {
            doNotTrack_.getClass();
            final BoolValue doNotTrack_2 = this.doNotTrack_;
            if (doNotTrack_2 != null && doNotTrack_2 != BoolValue.getDefaultInstance()) {
                this.doNotTrack_ = (BoolValue)android.support.v4.media.a.f(this.doNotTrack_, doNotTrack_);
            }
            else {
                this.doNotTrack_ = doNotTrack_;
            }
        }
        
        private void mergeExpensiveCoinsPackage(final BoolValue expensiveCoinsPackage_) {
            expensiveCoinsPackage_.getClass();
            final BoolValue expensiveCoinsPackage_2 = this.expensiveCoinsPackage_;
            if (expensiveCoinsPackage_2 != null && expensiveCoinsPackage_2 != BoolValue.getDefaultInstance()) {
                this.expensiveCoinsPackage_ = (BoolValue)android.support.v4.media.a.f(this.expensiveCoinsPackage_, expensiveCoinsPackage_);
            }
            else {
                this.expensiveCoinsPackage_ = expensiveCoinsPackage_;
            }
        }
        
        private void mergeIsEmailPermissionRequired(final BoolValue isEmailPermissionRequired_) {
            isEmailPermissionRequired_.getClass();
            final BoolValue isEmailPermissionRequired_2 = this.isEmailPermissionRequired_;
            if (isEmailPermissionRequired_2 != null && isEmailPermissionRequired_2 != BoolValue.getDefaultInstance()) {
                this.isEmailPermissionRequired_ = (BoolValue)android.support.v4.media.a.f(this.isEmailPermissionRequired_, isEmailPermissionRequired_);
            }
            else {
                this.isEmailPermissionRequired_ = isEmailPermissionRequired_;
            }
        }
        
        private void mergeLiveOrangereds(final BoolValue liveOrangereds_) {
            liveOrangereds_.getClass();
            final BoolValue liveOrangereds_2 = this.liveOrangereds_;
            if (liveOrangereds_2 != null && liveOrangereds_2 != BoolValue.getDefaultInstance()) {
                this.liveOrangereds_ = (BoolValue)android.support.v4.media.a.f(this.liveOrangereds_, liveOrangereds_);
            }
            else {
                this.liveOrangereds_ = liveOrangereds_;
            }
        }
        
        private void mergeModAwards(final BoolValue modAwards_) {
            modAwards_.getClass();
            final BoolValue modAwards_2 = this.modAwards_;
            if (modAwards_2 != null && modAwards_2 != BoolValue.getDefaultInstance()) {
                this.modAwards_ = (BoolValue)android.support.v4.media.a.f(this.modAwards_, modAwards_);
            }
            else {
                this.modAwards_ = modAwards_;
            }
        }
        
        private void mergeModServiceMuteReads(final BoolValue modServiceMuteReads_) {
            modServiceMuteReads_.getClass();
            final BoolValue modServiceMuteReads_2 = this.modServiceMuteReads_;
            if (modServiceMuteReads_2 != null && modServiceMuteReads_2 != BoolValue.getDefaultInstance()) {
                this.modServiceMuteReads_ = (BoolValue)android.support.v4.media.a.f(this.modServiceMuteReads_, modServiceMuteReads_);
            }
            else {
                this.modServiceMuteReads_ = modServiceMuteReads_;
            }
        }
        
        private void mergeModServiceMuteWrites(final BoolValue modServiceMuteWrites_) {
            modServiceMuteWrites_.getClass();
            final BoolValue modServiceMuteWrites_2 = this.modServiceMuteWrites_;
            if (modServiceMuteWrites_2 != null && modServiceMuteWrites_2 != BoolValue.getDefaultInstance()) {
                this.modServiceMuteWrites_ = (BoolValue)android.support.v4.media.a.f(this.modServiceMuteWrites_, modServiceMuteWrites_);
            }
            else {
                this.modServiceMuteWrites_ = modServiceMuteWrites_;
            }
        }
        
        private void mergeModlogCopyrightRemoval(final BoolValue modlogCopyrightRemoval_) {
            modlogCopyrightRemoval_.getClass();
            final BoolValue modlogCopyrightRemoval_2 = this.modlogCopyrightRemoval_;
            if (modlogCopyrightRemoval_2 != null && modlogCopyrightRemoval_2 != BoolValue.getDefaultInstance()) {
                this.modlogCopyrightRemoval_ = (BoolValue)android.support.v4.media.a.f(this.modlogCopyrightRemoval_, modlogCopyrightRemoval_);
            }
            else {
                this.modlogCopyrightRemoval_ = modlogCopyrightRemoval_;
            }
        }
        
        private void mergeMwebNsfwXpromo(final MwebType mwebNsfwXpromo_) {
            mwebNsfwXpromo_.getClass();
            final MwebType mwebNsfwXpromo_2 = this.mwebNsfwXpromo_;
            if (mwebNsfwXpromo_2 != null && mwebNsfwXpromo_2 != MwebType.getDefaultInstance()) {
                final MwebType.a builder = MwebType.newBuilder(this.mwebNsfwXpromo_);
                builder.h((GeneratedMessageLite)mwebNsfwXpromo_);
                this.mwebNsfwXpromo_ = (MwebType)builder.d();
            }
            else {
                this.mwebNsfwXpromo_ = mwebNsfwXpromo_;
            }
        }
        
        private void mergeMwebSharingClipboard(final MwebType mwebSharingClipboard_) {
            mwebSharingClipboard_.getClass();
            final MwebType mwebSharingClipboard_2 = this.mwebSharingClipboard_;
            if (mwebSharingClipboard_2 != null && mwebSharingClipboard_2 != MwebType.getDefaultInstance()) {
                final MwebType.a builder = MwebType.newBuilder(this.mwebSharingClipboard_);
                builder.h((GeneratedMessageLite)mwebSharingClipboard_);
                this.mwebSharingClipboard_ = (MwebType)builder.d();
            }
            else {
                this.mwebSharingClipboard_ = mwebSharingClipboard_;
            }
        }
        
        private void mergeMwebXpromoInterstitialCommentsAndroid(final BoolValue mwebXpromoInterstitialCommentsAndroid_) {
            mwebXpromoInterstitialCommentsAndroid_.getClass();
            final BoolValue mwebXpromoInterstitialCommentsAndroid_2 = this.mwebXpromoInterstitialCommentsAndroid_;
            if (mwebXpromoInterstitialCommentsAndroid_2 != null && mwebXpromoInterstitialCommentsAndroid_2 != BoolValue.getDefaultInstance()) {
                this.mwebXpromoInterstitialCommentsAndroid_ = (BoolValue)android.support.v4.media.a.f(this.mwebXpromoInterstitialCommentsAndroid_, mwebXpromoInterstitialCommentsAndroid_);
            }
            else {
                this.mwebXpromoInterstitialCommentsAndroid_ = mwebXpromoInterstitialCommentsAndroid_;
            }
        }
        
        private void mergeMwebXpromoInterstitialCommentsIos(final BoolValue mwebXpromoInterstitialCommentsIos_) {
            mwebXpromoInterstitialCommentsIos_.getClass();
            final BoolValue mwebXpromoInterstitialCommentsIos_2 = this.mwebXpromoInterstitialCommentsIos_;
            if (mwebXpromoInterstitialCommentsIos_2 != null && mwebXpromoInterstitialCommentsIos_2 != BoolValue.getDefaultInstance()) {
                this.mwebXpromoInterstitialCommentsIos_ = (BoolValue)android.support.v4.media.a.f(this.mwebXpromoInterstitialCommentsIos_, mwebXpromoInterstitialCommentsIos_);
            }
            else {
                this.mwebXpromoInterstitialCommentsIos_ = mwebXpromoInterstitialCommentsIos_;
            }
        }
        
        private void mergeMwebXpromoModalListingClickDailyDismissibleAndroid(final BoolValue mwebXpromoModalListingClickDailyDismissibleAndroid_) {
            mwebXpromoModalListingClickDailyDismissibleAndroid_.getClass();
            final BoolValue mwebXpromoModalListingClickDailyDismissibleAndroid_2 = this.mwebXpromoModalListingClickDailyDismissibleAndroid_;
            if (mwebXpromoModalListingClickDailyDismissibleAndroid_2 != null && mwebXpromoModalListingClickDailyDismissibleAndroid_2 != BoolValue.getDefaultInstance()) {
                this.mwebXpromoModalListingClickDailyDismissibleAndroid_ = (BoolValue)android.support.v4.media.a.f(this.mwebXpromoModalListingClickDailyDismissibleAndroid_, mwebXpromoModalListingClickDailyDismissibleAndroid_);
            }
            else {
                this.mwebXpromoModalListingClickDailyDismissibleAndroid_ = mwebXpromoModalListingClickDailyDismissibleAndroid_;
            }
        }
        
        private void mergeMwebXpromoModalListingClickDailyDismissibleIos(final BoolValue mwebXpromoModalListingClickDailyDismissibleIos_) {
            mwebXpromoModalListingClickDailyDismissibleIos_.getClass();
            final BoolValue mwebXpromoModalListingClickDailyDismissibleIos_2 = this.mwebXpromoModalListingClickDailyDismissibleIos_;
            if (mwebXpromoModalListingClickDailyDismissibleIos_2 != null && mwebXpromoModalListingClickDailyDismissibleIos_2 != BoolValue.getDefaultInstance()) {
                this.mwebXpromoModalListingClickDailyDismissibleIos_ = (BoolValue)android.support.v4.media.a.f(this.mwebXpromoModalListingClickDailyDismissibleIos_, mwebXpromoModalListingClickDailyDismissibleIos_);
            }
            else {
                this.mwebXpromoModalListingClickDailyDismissibleIos_ = mwebXpromoModalListingClickDailyDismissibleIos_;
            }
        }
        
        private void mergeMwebXpromoRevampV2(final MwebType mwebXpromoRevampV2_) {
            mwebXpromoRevampV2_.getClass();
            final MwebType mwebXpromoRevampV2_2 = this.mwebXpromoRevampV2_;
            if (mwebXpromoRevampV2_2 != null && mwebXpromoRevampV2_2 != MwebType.getDefaultInstance()) {
                final MwebType.a builder = MwebType.newBuilder(this.mwebXpromoRevampV2_);
                builder.h((GeneratedMessageLite)mwebXpromoRevampV2_);
                this.mwebXpromoRevampV2_ = (MwebType)builder.d();
            }
            else {
                this.mwebXpromoRevampV2_ = mwebXpromoRevampV2_;
            }
        }
        
        private void mergeMwebXpromoRevampV3(final MwebType mwebXpromoRevampV3_) {
            mwebXpromoRevampV3_.getClass();
            final MwebType mwebXpromoRevampV3_2 = this.mwebXpromoRevampV3_;
            if (mwebXpromoRevampV3_2 != null && mwebXpromoRevampV3_2 != MwebType.getDefaultInstance()) {
                final MwebType.a builder = MwebType.newBuilder(this.mwebXpromoRevampV3_);
                builder.h((GeneratedMessageLite)mwebXpromoRevampV3_);
                this.mwebXpromoRevampV3_ = (MwebType)builder.d();
            }
            else {
                this.mwebXpromoRevampV3_ = mwebXpromoRevampV3_;
            }
        }
        
        private void mergeNoreferrerToNoopener(final BoolValue noreferrerToNoopener_) {
            noreferrerToNoopener_.getClass();
            final BoolValue noreferrerToNoopener_2 = this.noreferrerToNoopener_;
            if (noreferrerToNoopener_2 != null && noreferrerToNoopener_2 != BoolValue.getDefaultInstance()) {
                this.noreferrerToNoopener_ = (BoolValue)android.support.v4.media.a.f(this.noreferrerToNoopener_, noreferrerToNoopener_);
            }
            else {
                this.noreferrerToNoopener_ = noreferrerToNoopener_;
            }
        }
        
        private void mergePremiumSubscriptionsTable(final BoolValue premiumSubscriptionsTable_) {
            premiumSubscriptionsTable_.getClass();
            final BoolValue premiumSubscriptionsTable_2 = this.premiumSubscriptionsTable_;
            if (premiumSubscriptionsTable_2 != null && premiumSubscriptionsTable_2 != BoolValue.getDefaultInstance()) {
                this.premiumSubscriptionsTable_ = (BoolValue)android.support.v4.media.a.f(this.premiumSubscriptionsTable_, premiumSubscriptionsTable_);
            }
            else {
                this.premiumSubscriptionsTable_ = premiumSubscriptionsTable_;
            }
        }
        
        private void mergePromotedTrendBlanks(final BoolValue promotedTrendBlanks_) {
            promotedTrendBlanks_.getClass();
            final BoolValue promotedTrendBlanks_2 = this.promotedTrendBlanks_;
            if (promotedTrendBlanks_2 != null && promotedTrendBlanks_2 != BoolValue.getDefaultInstance()) {
                this.promotedTrendBlanks_ = (BoolValue)android.support.v4.media.a.f(this.promotedTrendBlanks_, promotedTrendBlanks_);
            }
            else {
                this.promotedTrendBlanks_ = promotedTrendBlanks_;
            }
        }
        
        private void mergeResizedStylesImages(final BoolValue resizedStylesImages_) {
            resizedStylesImages_.getClass();
            final BoolValue resizedStylesImages_2 = this.resizedStylesImages_;
            if (resizedStylesImages_2 != null && resizedStylesImages_2 != BoolValue.getDefaultInstance()) {
                this.resizedStylesImages_ = (BoolValue)android.support.v4.media.a.f(this.resizedStylesImages_, resizedStylesImages_);
            }
            else {
                this.resizedStylesImages_ = resizedStylesImages_;
            }
        }
        
        private void mergeShowAmpLink(final BoolValue showAmpLink_) {
            showAmpLink_.getClass();
            final BoolValue showAmpLink_2 = this.showAmpLink_;
            if (showAmpLink_2 != null && showAmpLink_2 != BoolValue.getDefaultInstance()) {
                this.showAmpLink_ = (BoolValue)android.support.v4.media.a.f(this.showAmpLink_, showAmpLink_);
            }
            else {
                this.showAmpLink_ = showAmpLink_;
            }
        }
        
        private void mergeSpezModal(final BoolValue spezModal_) {
            spezModal_.getClass();
            final BoolValue spezModal_2 = this.spezModal_;
            if (spezModal_2 != null && spezModal_2 != BoolValue.getDefaultInstance()) {
                this.spezModal_ = (BoolValue)android.support.v4.media.a.f(this.spezModal_, spezModal_);
            }
            else {
                this.spezModal_ = spezModal_;
            }
        }
        
        private void mergeUsePrefAccountDeployment(final BoolValue usePrefAccountDeployment_) {
            usePrefAccountDeployment_.getClass();
            final BoolValue usePrefAccountDeployment_2 = this.usePrefAccountDeployment_;
            if (usePrefAccountDeployment_2 != null && usePrefAccountDeployment_2 != BoolValue.getDefaultInstance()) {
                this.usePrefAccountDeployment_ = (BoolValue)android.support.v4.media.a.f(this.usePrefAccountDeployment_, usePrefAccountDeployment_);
            }
            else {
                this.usePrefAccountDeployment_ = usePrefAccountDeployment_;
            }
        }
        
        private void mergeWebhookConfig(final BoolValue webhookConfig_) {
            webhookConfig_.getClass();
            final BoolValue webhookConfig_2 = this.webhookConfig_;
            if (webhookConfig_2 != null && webhookConfig_2 != BoolValue.getDefaultInstance()) {
                this.webhookConfig_ = (BoolValue)android.support.v4.media.a.f(this.webhookConfig_, webhookConfig_);
            }
            else {
                this.webhookConfig_ = webhookConfig_;
            }
        }
        
        public static a newBuilder() {
            return (a)FeaturesType.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final FeaturesType featuresType) {
            return (a)FeaturesType.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)featuresType);
        }
        
        public static FeaturesType parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (FeaturesType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static FeaturesType parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (FeaturesType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static FeaturesType parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, byteString);
        }
        
        public static FeaturesType parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static FeaturesType parseFrom(final l l) throws IOException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, l);
        }
        
        public static FeaturesType parseFrom(final l l, final d0 d0) throws IOException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, l, d0);
        }
        
        public static FeaturesType parseFrom(final InputStream inputStream) throws IOException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static FeaturesType parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static FeaturesType parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static FeaturesType parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static FeaturesType parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, array);
        }
        
        public static FeaturesType parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (FeaturesType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<FeaturesType> parser() {
            return (n1<FeaturesType>)FeaturesType.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setAwardsOnStreams(final BoolValue awardsOnStreams_) {
            awardsOnStreams_.getClass();
            this.awardsOnStreams_ = awardsOnStreams_;
        }
        
        private void setChat(final BoolValue chat_) {
            chat_.getClass();
            this.chat_ = chat_;
        }
        
        private void setChatGroupRollout(final BoolValue chatGroupRollout_) {
            chatGroupRollout_.getClass();
            this.chatGroupRollout_ = chatGroupRollout_;
        }
        
        private void setChatSubreddit(final BoolValue chatSubreddit_) {
            chatSubreddit_.getClass();
            this.chatSubreddit_ = chatSubreddit_;
        }
        
        private void setChatUserSettings(final BoolValue chatUserSettings_) {
            chatUserSettings_.getClass();
            this.chatUserSettings_ = chatUserSettings_;
        }
        
        private void setCookieConsentBanner(final BoolValue cookieConsentBanner_) {
            cookieConsentBanner_.getClass();
            this.cookieConsentBanner_ = cookieConsentBanner_;
        }
        
        private void setCrowdControlForPost(final BoolValue crowdControlForPost_) {
            crowdControlForPost_.getClass();
            this.crowdControlForPost_ = crowdControlForPost_;
        }
        
        private void setDoNotTrack(final BoolValue doNotTrack_) {
            doNotTrack_.getClass();
            this.doNotTrack_ = doNotTrack_;
        }
        
        private void setExpensiveCoinsPackage(final BoolValue expensiveCoinsPackage_) {
            expensiveCoinsPackage_.getClass();
            this.expensiveCoinsPackage_ = expensiveCoinsPackage_;
        }
        
        private void setIsEmailPermissionRequired(final BoolValue isEmailPermissionRequired_) {
            isEmailPermissionRequired_.getClass();
            this.isEmailPermissionRequired_ = isEmailPermissionRequired_;
        }
        
        private void setLiveOrangereds(final BoolValue liveOrangereds_) {
            liveOrangereds_.getClass();
            this.liveOrangereds_ = liveOrangereds_;
        }
        
        private void setModAwards(final BoolValue modAwards_) {
            modAwards_.getClass();
            this.modAwards_ = modAwards_;
        }
        
        private void setModServiceMuteReads(final BoolValue modServiceMuteReads_) {
            modServiceMuteReads_.getClass();
            this.modServiceMuteReads_ = modServiceMuteReads_;
        }
        
        private void setModServiceMuteWrites(final BoolValue modServiceMuteWrites_) {
            modServiceMuteWrites_.getClass();
            this.modServiceMuteWrites_ = modServiceMuteWrites_;
        }
        
        private void setModlogCopyrightRemoval(final BoolValue modlogCopyrightRemoval_) {
            modlogCopyrightRemoval_.getClass();
            this.modlogCopyrightRemoval_ = modlogCopyrightRemoval_;
        }
        
        private void setMwebNsfwXpromo(final MwebType mwebNsfwXpromo_) {
            mwebNsfwXpromo_.getClass();
            this.mwebNsfwXpromo_ = mwebNsfwXpromo_;
        }
        
        private void setMwebSharingClipboard(final MwebType mwebSharingClipboard_) {
            mwebSharingClipboard_.getClass();
            this.mwebSharingClipboard_ = mwebSharingClipboard_;
        }
        
        private void setMwebXpromoInterstitialCommentsAndroid(final BoolValue mwebXpromoInterstitialCommentsAndroid_) {
            mwebXpromoInterstitialCommentsAndroid_.getClass();
            this.mwebXpromoInterstitialCommentsAndroid_ = mwebXpromoInterstitialCommentsAndroid_;
        }
        
        private void setMwebXpromoInterstitialCommentsIos(final BoolValue mwebXpromoInterstitialCommentsIos_) {
            mwebXpromoInterstitialCommentsIos_.getClass();
            this.mwebXpromoInterstitialCommentsIos_ = mwebXpromoInterstitialCommentsIos_;
        }
        
        private void setMwebXpromoModalListingClickDailyDismissibleAndroid(final BoolValue mwebXpromoModalListingClickDailyDismissibleAndroid_) {
            mwebXpromoModalListingClickDailyDismissibleAndroid_.getClass();
            this.mwebXpromoModalListingClickDailyDismissibleAndroid_ = mwebXpromoModalListingClickDailyDismissibleAndroid_;
        }
        
        private void setMwebXpromoModalListingClickDailyDismissibleIos(final BoolValue mwebXpromoModalListingClickDailyDismissibleIos_) {
            mwebXpromoModalListingClickDailyDismissibleIos_.getClass();
            this.mwebXpromoModalListingClickDailyDismissibleIos_ = mwebXpromoModalListingClickDailyDismissibleIos_;
        }
        
        private void setMwebXpromoRevampV2(final MwebType mwebXpromoRevampV2_) {
            mwebXpromoRevampV2_.getClass();
            this.mwebXpromoRevampV2_ = mwebXpromoRevampV2_;
        }
        
        private void setMwebXpromoRevampV3(final MwebType mwebXpromoRevampV3_) {
            mwebXpromoRevampV3_.getClass();
            this.mwebXpromoRevampV3_ = mwebXpromoRevampV3_;
        }
        
        private void setNoreferrerToNoopener(final BoolValue noreferrerToNoopener_) {
            noreferrerToNoopener_.getClass();
            this.noreferrerToNoopener_ = noreferrerToNoopener_;
        }
        
        private void setPremiumSubscriptionsTable(final BoolValue premiumSubscriptionsTable_) {
            premiumSubscriptionsTable_.getClass();
            this.premiumSubscriptionsTable_ = premiumSubscriptionsTable_;
        }
        
        private void setPromotedTrendBlanks(final BoolValue promotedTrendBlanks_) {
            promotedTrendBlanks_.getClass();
            this.promotedTrendBlanks_ = promotedTrendBlanks_;
        }
        
        private void setResizedStylesImages(final BoolValue resizedStylesImages_) {
            resizedStylesImages_.getClass();
            this.resizedStylesImages_ = resizedStylesImages_;
        }
        
        private void setShowAmpLink(final BoolValue showAmpLink_) {
            showAmpLink_.getClass();
            this.showAmpLink_ = showAmpLink_;
        }
        
        private void setSpezModal(final BoolValue spezModal_) {
            spezModal_.getClass();
            this.spezModal_ = spezModal_;
        }
        
        private void setUsePrefAccountDeployment(final BoolValue usePrefAccountDeployment_) {
            usePrefAccountDeployment_.getClass();
            this.usePrefAccountDeployment_ = usePrefAccountDeployment_;
        }
        
        private void setWebhookConfig(final BoolValue webhookConfig_) {
            webhookConfig_.getClass();
            this.webhookConfig_ = webhookConfig_;
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
                    final n1<FeaturesType> parser;
                    if ((parser = FeaturesType.PARSER) == null) {
                        synchronized (FeaturesType.class) {
                            if (FeaturesType.PARSER == null) {
                                FeaturesType.PARSER = (n1<FeaturesType>)new GeneratedMessageLite$c((GeneratedMessageLite)FeaturesType.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return FeaturesType.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)FeaturesType.DEFAULT_INSTANCE, "\u0000\u001f\u0000\u0000\u0001\u001f\u001f\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t", new Object[] { "modServiceMuteWrites_", "promotedTrendBlanks_", "showAmpLink_", "chat_", "isEmailPermissionRequired_", "modAwards_", "awardsOnStreams_", "webhookConfig_", "mwebXpromoModalListingClickDailyDismissibleIos_", "liveOrangereds_", "cookieConsentBanner_", "modlogCopyrightRemoval_", "doNotTrack_", "modServiceMuteReads_", "chatUserSettings_", "usePrefAccountDeployment_", "mwebXpromoInterstitialCommentsIos_", "chatSubreddit_", "premiumSubscriptionsTable_", "mwebXpromoInterstitialCommentsAndroid_", "crowdControlForPost_", "noreferrerToNoopener_", "chatGroupRollout_", "resizedStylesImages_", "spezModal_", "mwebXpromoModalListingClickDailyDismissibleAndroid_", "expensiveCoinsPackage_", "mwebXpromoRevampV3_", "mwebXpromoRevampV2_", "mwebSharingClipboard_", "mwebNsfwXpromo_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new FeaturesType();
                }
            }
        }
        
        public BoolValue getAwardsOnStreams() {
            BoolValue boolValue;
            if ((boolValue = this.awardsOnStreams_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getChat() {
            BoolValue boolValue;
            if ((boolValue = this.chat_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getChatGroupRollout() {
            BoolValue boolValue;
            if ((boolValue = this.chatGroupRollout_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getChatSubreddit() {
            BoolValue boolValue;
            if ((boolValue = this.chatSubreddit_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getChatUserSettings() {
            BoolValue boolValue;
            if ((boolValue = this.chatUserSettings_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getCookieConsentBanner() {
            BoolValue boolValue;
            if ((boolValue = this.cookieConsentBanner_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getCrowdControlForPost() {
            BoolValue boolValue;
            if ((boolValue = this.crowdControlForPost_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getDoNotTrack() {
            BoolValue boolValue;
            if ((boolValue = this.doNotTrack_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getExpensiveCoinsPackage() {
            BoolValue boolValue;
            if ((boolValue = this.expensiveCoinsPackage_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsEmailPermissionRequired() {
            BoolValue boolValue;
            if ((boolValue = this.isEmailPermissionRequired_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getLiveOrangereds() {
            BoolValue boolValue;
            if ((boolValue = this.liveOrangereds_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getModAwards() {
            BoolValue boolValue;
            if ((boolValue = this.modAwards_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getModServiceMuteReads() {
            BoolValue boolValue;
            if ((boolValue = this.modServiceMuteReads_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getModServiceMuteWrites() {
            BoolValue boolValue;
            if ((boolValue = this.modServiceMuteWrites_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getModlogCopyrightRemoval() {
            BoolValue boolValue;
            if ((boolValue = this.modlogCopyrightRemoval_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public MwebType getMwebNsfwXpromo() {
            GeneratedMessageLite<MwebType, MwebType.a> generatedMessageLite;
            if ((generatedMessageLite = this.mwebNsfwXpromo_) == null) {
                generatedMessageLite = MwebType.getDefaultInstance();
            }
            return (MwebType)generatedMessageLite;
        }
        
        public MwebType getMwebSharingClipboard() {
            GeneratedMessageLite<MwebType, MwebType.a> generatedMessageLite;
            if ((generatedMessageLite = this.mwebSharingClipboard_) == null) {
                generatedMessageLite = MwebType.getDefaultInstance();
            }
            return (MwebType)generatedMessageLite;
        }
        
        public BoolValue getMwebXpromoInterstitialCommentsAndroid() {
            BoolValue boolValue;
            if ((boolValue = this.mwebXpromoInterstitialCommentsAndroid_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getMwebXpromoInterstitialCommentsIos() {
            BoolValue boolValue;
            if ((boolValue = this.mwebXpromoInterstitialCommentsIos_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getMwebXpromoModalListingClickDailyDismissibleAndroid() {
            BoolValue boolValue;
            if ((boolValue = this.mwebXpromoModalListingClickDailyDismissibleAndroid_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getMwebXpromoModalListingClickDailyDismissibleIos() {
            BoolValue boolValue;
            if ((boolValue = this.mwebXpromoModalListingClickDailyDismissibleIos_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public MwebType getMwebXpromoRevampV2() {
            GeneratedMessageLite<MwebType, MwebType.a> generatedMessageLite;
            if ((generatedMessageLite = this.mwebXpromoRevampV2_) == null) {
                generatedMessageLite = MwebType.getDefaultInstance();
            }
            return (MwebType)generatedMessageLite;
        }
        
        public MwebType getMwebXpromoRevampV3() {
            GeneratedMessageLite<MwebType, MwebType.a> generatedMessageLite;
            if ((generatedMessageLite = this.mwebXpromoRevampV3_) == null) {
                generatedMessageLite = MwebType.getDefaultInstance();
            }
            return (MwebType)generatedMessageLite;
        }
        
        public BoolValue getNoreferrerToNoopener() {
            BoolValue boolValue;
            if ((boolValue = this.noreferrerToNoopener_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPremiumSubscriptionsTable() {
            BoolValue boolValue;
            if ((boolValue = this.premiumSubscriptionsTable_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPromotedTrendBlanks() {
            BoolValue boolValue;
            if ((boolValue = this.promotedTrendBlanks_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getResizedStylesImages() {
            BoolValue boolValue;
            if ((boolValue = this.resizedStylesImages_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getShowAmpLink() {
            BoolValue boolValue;
            if ((boolValue = this.showAmpLink_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getSpezModal() {
            BoolValue boolValue;
            if ((boolValue = this.spezModal_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getUsePrefAccountDeployment() {
            BoolValue boolValue;
            if ((boolValue = this.usePrefAccountDeployment_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getWebhookConfig() {
            BoolValue boolValue;
            if ((boolValue = this.webhookConfig_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public boolean hasAwardsOnStreams() {
            return this.awardsOnStreams_ != null;
        }
        
        public boolean hasChat() {
            return this.chat_ != null;
        }
        
        public boolean hasChatGroupRollout() {
            return this.chatGroupRollout_ != null;
        }
        
        public boolean hasChatSubreddit() {
            return this.chatSubreddit_ != null;
        }
        
        public boolean hasChatUserSettings() {
            return this.chatUserSettings_ != null;
        }
        
        public boolean hasCookieConsentBanner() {
            return this.cookieConsentBanner_ != null;
        }
        
        public boolean hasCrowdControlForPost() {
            return this.crowdControlForPost_ != null;
        }
        
        public boolean hasDoNotTrack() {
            return this.doNotTrack_ != null;
        }
        
        public boolean hasExpensiveCoinsPackage() {
            return this.expensiveCoinsPackage_ != null;
        }
        
        public boolean hasIsEmailPermissionRequired() {
            return this.isEmailPermissionRequired_ != null;
        }
        
        public boolean hasLiveOrangereds() {
            return this.liveOrangereds_ != null;
        }
        
        public boolean hasModAwards() {
            return this.modAwards_ != null;
        }
        
        public boolean hasModServiceMuteReads() {
            return this.modServiceMuteReads_ != null;
        }
        
        public boolean hasModServiceMuteWrites() {
            return this.modServiceMuteWrites_ != null;
        }
        
        public boolean hasModlogCopyrightRemoval() {
            return this.modlogCopyrightRemoval_ != null;
        }
        
        public boolean hasMwebNsfwXpromo() {
            return this.mwebNsfwXpromo_ != null;
        }
        
        public boolean hasMwebSharingClipboard() {
            return this.mwebSharingClipboard_ != null;
        }
        
        public boolean hasMwebXpromoInterstitialCommentsAndroid() {
            return this.mwebXpromoInterstitialCommentsAndroid_ != null;
        }
        
        public boolean hasMwebXpromoInterstitialCommentsIos() {
            return this.mwebXpromoInterstitialCommentsIos_ != null;
        }
        
        public boolean hasMwebXpromoModalListingClickDailyDismissibleAndroid() {
            return this.mwebXpromoModalListingClickDailyDismissibleAndroid_ != null;
        }
        
        public boolean hasMwebXpromoModalListingClickDailyDismissibleIos() {
            return this.mwebXpromoModalListingClickDailyDismissibleIos_ != null;
        }
        
        public boolean hasMwebXpromoRevampV2() {
            return this.mwebXpromoRevampV2_ != null;
        }
        
        public boolean hasMwebXpromoRevampV3() {
            return this.mwebXpromoRevampV3_ != null;
        }
        
        public boolean hasNoreferrerToNoopener() {
            return this.noreferrerToNoopener_ != null;
        }
        
        public boolean hasPremiumSubscriptionsTable() {
            return this.premiumSubscriptionsTable_ != null;
        }
        
        public boolean hasPromotedTrendBlanks() {
            return this.promotedTrendBlanks_ != null;
        }
        
        public boolean hasResizedStylesImages() {
            return this.resizedStylesImages_ != null;
        }
        
        public boolean hasShowAmpLink() {
            return this.showAmpLink_ != null;
        }
        
        public boolean hasSpezModal() {
            return this.spezModal_ != null;
        }
        
        public boolean hasUsePrefAccountDeployment() {
            return this.usePrefAccountDeployment_ != null;
        }
        
        public boolean hasWebhookConfig() {
            return this.webhookConfig_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<FeaturesType, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)FeaturesType.access$27000());
            }
        }
    }
    
    public static final class MwebType extends GeneratedMessageLite<MwebType, a> implements d1
    {
        private static final MwebType DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 3;
        public static final int OWNER_FIELD_NUMBER = 1;
        private static volatile n1<MwebType> PARSER;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private Int64Value experimentId_;
        private StringValue owner_;
        private StringValue variant_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)MwebType.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new MwebType()));
        }
        
        private MwebType() {
        }
        
        public static /* synthetic */ MwebType access$25900() {
            return MwebType.DEFAULT_INSTANCE;
        }
        
        private void clearExperimentId() {
            this.experimentId_ = null;
        }
        
        private void clearOwner() {
            this.owner_ = null;
        }
        
        private void clearVariant() {
            this.variant_ = null;
        }
        
        public static MwebType getDefaultInstance() {
            return MwebType.DEFAULT_INSTANCE;
        }
        
        private void mergeExperimentId(final Int64Value experimentId_) {
            experimentId_.getClass();
            final Int64Value experimentId_2 = this.experimentId_;
            if (experimentId_2 != null && experimentId_2 != Int64Value.getDefaultInstance()) {
                this.experimentId_ = (Int64Value)b.g(this.experimentId_, experimentId_);
            }
            else {
                this.experimentId_ = experimentId_;
            }
        }
        
        private void mergeOwner(final StringValue owner_) {
            owner_.getClass();
            final StringValue owner_2 = this.owner_;
            if (owner_2 != null && owner_2 != StringValue.getDefaultInstance()) {
                this.owner_ = (StringValue)f0.e(this.owner_, owner_);
            }
            else {
                this.owner_ = owner_;
            }
        }
        
        private void mergeVariant(final StringValue variant_) {
            variant_.getClass();
            final StringValue variant_2 = this.variant_;
            if (variant_2 != null && variant_2 != StringValue.getDefaultInstance()) {
                this.variant_ = (StringValue)f0.e(this.variant_, variant_);
            }
            else {
                this.variant_ = variant_;
            }
        }
        
        public static a newBuilder() {
            return (a)MwebType.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final MwebType mwebType) {
            return (a)MwebType.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)mwebType);
        }
        
        public static MwebType parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (MwebType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static MwebType parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (MwebType)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static MwebType parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, byteString);
        }
        
        public static MwebType parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static MwebType parseFrom(final l l) throws IOException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, l);
        }
        
        public static MwebType parseFrom(final l l, final d0 d0) throws IOException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, l, d0);
        }
        
        public static MwebType parseFrom(final InputStream inputStream) throws IOException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, inputStream);
        }
        
        public static MwebType parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static MwebType parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static MwebType parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static MwebType parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, array);
        }
        
        public static MwebType parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (MwebType)GeneratedMessageLite.parseFrom((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<MwebType> parser() {
            return (n1<MwebType>)MwebType.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setExperimentId(final Int64Value experimentId_) {
            experimentId_.getClass();
            this.experimentId_ = experimentId_;
        }
        
        private void setOwner(final StringValue owner_) {
            owner_.getClass();
            this.owner_ = owner_;
        }
        
        private void setVariant(final StringValue variant_) {
            variant_.getClass();
            this.variant_ = variant_;
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
                    final n1<MwebType> parser;
                    if ((parser = MwebType.PARSER) == null) {
                        synchronized (MwebType.class) {
                            if (MwebType.PARSER == null) {
                                MwebType.PARSER = (n1<MwebType>)new GeneratedMessageLite$c((GeneratedMessageLite)MwebType.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return MwebType.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)MwebType.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[] { "owner_", "variant_", "experimentId_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new MwebType();
                }
            }
        }
        
        public Int64Value getExperimentId() {
            Int64Value int64Value;
            if ((int64Value = this.experimentId_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getOwner() {
            StringValue stringValue;
            if ((stringValue = this.owner_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getVariant() {
            StringValue stringValue;
            if ((stringValue = this.variant_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasExperimentId() {
            return this.experimentId_ != null;
        }
        
        public boolean hasOwner() {
            return this.owner_ != null;
        }
        
        public boolean hasVariant() {
            return this.variant_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<MwebType, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)MwebType.access$25900());
            }
        }
    }
    
    public static final class UserAboutData extends GeneratedMessageLite<UserAboutData, a> implements d1
    {
        public static final int ACCEPT_FOLLOWERS_FIELD_NUMBER = 60;
        public static final int AWARDEE_KARMA_FIELD_NUMBER = 39;
        public static final int AWARDER_KARMA_FIELD_NUMBER = 28;
        public static final int CAN_CREATE_SUBREDDIT_FIELD_NUMBER = 24;
        public static final int CAN_EDIT_NAME_FIELD_NUMBER = 15;
        public static final int COINS_FIELD_NUMBER = 20;
        public static final int COMMENT_KARMA_FIELD_NUMBER = 59;
        public static final int CREATED_FIELD_NUMBER = 52;
        public static final int CREATED_UTC_FIELD_NUMBER = 55;
        private static final UserAboutData DEFAULT_INSTANCE;
        public static final int FEATURES_FIELD_NUMBER = 63;
        public static final int FORCE_PASSWORD_RESET_FIELD_NUMBER = 44;
        public static final int GOLD_CREDDITS_FIELD_NUMBER = 54;
        public static final int GOLD_EXPIRATION_FIELD_NUMBER = 11;
        public static final int HAS_ANDROID_SUBSCRIPTION_FIELD_NUMBER = 34;
        public static final int HAS_EXTERNAL_ACCOUNT_FIELD_NUMBER = 5;
        public static final int HAS_GOLD_SUBSCRIPTION_FIELD_NUMBER = 12;
        public static final int HAS_IOS_SUBSCRIPTION_FIELD_NUMBER = 56;
        public static final int HAS_MAIL_FIELD_NUMBER = 48;
        public static final int HAS_MOD_MAIL_FIELD_NUMBER = 37;
        public static final int HAS_PAYPAL_SUBSCRIPTION_FIELD_NUMBER = 21;
        public static final int HAS_STRIPE_SUBSCRIPTION_FIELD_NUMBER = 30;
        public static final int HAS_SUBSCRIBED_FIELD_NUMBER = 61;
        public static final int HAS_SUBSCRIBED_TO_PREMIUM_FIELD_NUMBER = 22;
        public static final int HAS_VERIFIED_EMAIL_FIELD_NUMBER = 53;
        public static final int HAS_VISITED_NEW_PROFILE_FIELD_NUMBER = 2;
        public static final int HIDE_FROM_ROBOTS_FIELD_NUMBER = 40;
        public static final int ICON_IMG_FIELD_NUMBER = 36;
        public static final int ID_FIELD_NUMBER = 23;
        public static final int INBOX_COUNT_FIELD_NUMBER = 46;
        public static final int IN_BETA_FIELD_NUMBER = 58;
        public static final int IN_CHAT_FIELD_NUMBER = 33;
        public static final int IN_REDESIGN_BETA_FIELD_NUMBER = 35;
        public static final int IS_BLOCKED_FIELD_NUMBER = 16;
        public static final int IS_EMPLOYEE_FIELD_NUMBER = 1;
        public static final int IS_FRIEND_FIELD_NUMBER = 3;
        public static final int IS_GOLD_FIELD_NUMBER = 26;
        public static final int IS_MOD_FIELD_NUMBER = 27;
        public static final int IS_SPONSOR_FIELD_NUMBER = 13;
        public static final int IS_SUSPENDED_FIELD_NUMBER = 31;
        public static final int LINK_KARMA_FIELD_NUMBER = 43;
        public static final int MODHASH_FIELD_NUMBER = 42;
        public static final int NAME_FIELD_NUMBER = 50;
        public static final int NEW_MODMAIL_EXISTS_FIELD_NUMBER = 18;
        public static final int NUM_FRIENDS_FIELD_NUMBER = 14;
        public static final int OVER_18_FIELD_NUMBER = 25;
        private static volatile n1<UserAboutData> PARSER;
        public static final int PASSWORD_SET_FIELD_NUMBER = 41;
        public static final int PREF_AUTOPLAY_FIELD_NUMBER = 19;
        public static final int PREF_CLICKGADGET_FIELD_NUMBER = 51;
        public static final int PREF_GEOPOPULAR_FIELD_NUMBER = 6;
        public static final int PREF_NIGHTMODE_FIELD_NUMBER = 38;
        public static final int PREF_NO_PROFANITY_FIELD_NUMBER = 4;
        public static final int PREF_SHOW_PRESENCE_FIELD_NUMBER = 8;
        public static final int PREF_SHOW_SNOOVATAR_FIELD_NUMBER = 49;
        public static final int PREF_SHOW_TRENDING_FIELD_NUMBER = 7;
        public static final int PREF_SHOW_TWITTER_FIELD_NUMBER = 57;
        public static final int PREF_TOP_KARMA_SUBREDDITS_FIELD_NUMBER = 47;
        public static final int PREF_VIDEO_AUTOPLAY_FIELD_NUMBER = 32;
        public static final int SNOOVATAR_IMG_FIELD_NUMBER = 9;
        public static final int SNOOVATAR_SIZE_FIELD_NUMBER = 10;
        public static final int SUBREDDIT_FIELD_NUMBER = 62;
        public static final int SUSPENSION_EXPIRATION_UTC_FIELD_NUMBER = 29;
        public static final int TOTAL_KARMA_FIELD_NUMBER = 45;
        public static final int VERIFIED_FIELD_NUMBER = 17;
        private BoolValue acceptFollowers_;
        private Int64Value awardeeKarma_;
        private Int64Value awarderKarma_;
        private BoolValue canCreateSubreddit_;
        private BoolValue canEditName_;
        private Int64Value coins_;
        private Int64Value commentKarma_;
        private Int64Value createdUtc_;
        private Int64Value created_;
        private FeaturesType features_;
        private BoolValue forcePasswordReset_;
        private Int64Value goldCreddits_;
        private StringValue goldExpiration_;
        private BoolValue hasAndroidSubscription_;
        private BoolValue hasExternalAccount_;
        private BoolValue hasGoldSubscription_;
        private BoolValue hasIosSubscription_;
        private BoolValue hasMail_;
        private BoolValue hasModMail_;
        private BoolValue hasPaypalSubscription_;
        private BoolValue hasStripeSubscription_;
        private BoolValue hasSubscribedToPremium_;
        private BoolValue hasSubscribed_;
        private BoolValue hasVerifiedEmail_;
        private BoolValue hasVisitedNewProfile_;
        private BoolValue hideFromRobots_;
        private StringValue iconImg_;
        private StringValue id_;
        private BoolValue inBeta_;
        private BoolValue inChat_;
        private BoolValue inRedesignBeta_;
        private Int32Value inboxCount_;
        private BoolValue isBlocked_;
        private BoolValue isEmployee_;
        private BoolValue isFriend_;
        private BoolValue isGold_;
        private BoolValue isMod_;
        private BoolValue isSponsor_;
        private BoolValue isSuspended_;
        private Int64Value linkKarma_;
        private StringValue modhash_;
        private StringValue name_;
        private StringValue newModmailExists_;
        private Int64Value numFriends_;
        private BoolValue over18_;
        private BoolValue passwordSet_;
        private BoolValue prefAutoplay_;
        private Int64Value prefClickgadget_;
        private StringValue prefGeopopular_;
        private BoolValue prefNightmode_;
        private BoolValue prefNoProfanity_;
        private BoolValue prefShowPresence_;
        private BoolValue prefShowSnoovatar_;
        private BoolValue prefShowTrending_;
        private BoolValue prefShowTwitter_;
        private BoolValue prefTopKarmaSubreddits_;
        private BoolValue prefVideoAutoplay_;
        private StringValue snoovatarImg_;
        private Internal$j<Int32Value> snoovatarSize_;
        private CommonMsg$SubredditObject subreddit_;
        private StringValue suspensionExpirationUtc_;
        private Int64Value totalKarma_;
        private BoolValue verified_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)UserAboutData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UserAboutData()));
        }
        
        private UserAboutData() {
            this.snoovatarSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static /* synthetic */ UserAboutData access$36500() {
            return UserAboutData.DEFAULT_INSTANCE;
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
        
        private void clearAcceptFollowers() {
            this.acceptFollowers_ = null;
        }
        
        private void clearAwardeeKarma() {
            this.awardeeKarma_ = null;
        }
        
        private void clearAwarderKarma() {
            this.awarderKarma_ = null;
        }
        
        private void clearCanCreateSubreddit() {
            this.canCreateSubreddit_ = null;
        }
        
        private void clearCanEditName() {
            this.canEditName_ = null;
        }
        
        private void clearCoins() {
            this.coins_ = null;
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
        
        private void clearFeatures() {
            this.features_ = null;
        }
        
        private void clearForcePasswordReset() {
            this.forcePasswordReset_ = null;
        }
        
        private void clearGoldCreddits() {
            this.goldCreddits_ = null;
        }
        
        private void clearGoldExpiration() {
            this.goldExpiration_ = null;
        }
        
        private void clearHasAndroidSubscription() {
            this.hasAndroidSubscription_ = null;
        }
        
        private void clearHasExternalAccount() {
            this.hasExternalAccount_ = null;
        }
        
        private void clearHasGoldSubscription() {
            this.hasGoldSubscription_ = null;
        }
        
        private void clearHasIosSubscription() {
            this.hasIosSubscription_ = null;
        }
        
        private void clearHasMail() {
            this.hasMail_ = null;
        }
        
        private void clearHasModMail() {
            this.hasModMail_ = null;
        }
        
        private void clearHasPaypalSubscription() {
            this.hasPaypalSubscription_ = null;
        }
        
        private void clearHasStripeSubscription() {
            this.hasStripeSubscription_ = null;
        }
        
        private void clearHasSubscribed() {
            this.hasSubscribed_ = null;
        }
        
        private void clearHasSubscribedToPremium() {
            this.hasSubscribedToPremium_ = null;
        }
        
        private void clearHasVerifiedEmail() {
            this.hasVerifiedEmail_ = null;
        }
        
        private void clearHasVisitedNewProfile() {
            this.hasVisitedNewProfile_ = null;
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
        
        private void clearInBeta() {
            this.inBeta_ = null;
        }
        
        private void clearInChat() {
            this.inChat_ = null;
        }
        
        private void clearInRedesignBeta() {
            this.inRedesignBeta_ = null;
        }
        
        private void clearInboxCount() {
            this.inboxCount_ = null;
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
        
        private void clearIsSponsor() {
            this.isSponsor_ = null;
        }
        
        private void clearIsSuspended() {
            this.isSuspended_ = null;
        }
        
        private void clearLinkKarma() {
            this.linkKarma_ = null;
        }
        
        private void clearModhash() {
            this.modhash_ = null;
        }
        
        private void clearName() {
            this.name_ = null;
        }
        
        private void clearNewModmailExists() {
            this.newModmailExists_ = null;
        }
        
        private void clearNumFriends() {
            this.numFriends_ = null;
        }
        
        private void clearOver18() {
            this.over18_ = null;
        }
        
        private void clearPasswordSet() {
            this.passwordSet_ = null;
        }
        
        private void clearPrefAutoplay() {
            this.prefAutoplay_ = null;
        }
        
        private void clearPrefClickgadget() {
            this.prefClickgadget_ = null;
        }
        
        private void clearPrefGeopopular() {
            this.prefGeopopular_ = null;
        }
        
        private void clearPrefNightmode() {
            this.prefNightmode_ = null;
        }
        
        private void clearPrefNoProfanity() {
            this.prefNoProfanity_ = null;
        }
        
        private void clearPrefShowPresence() {
            this.prefShowPresence_ = null;
        }
        
        private void clearPrefShowSnoovatar() {
            this.prefShowSnoovatar_ = null;
        }
        
        private void clearPrefShowTrending() {
            this.prefShowTrending_ = null;
        }
        
        private void clearPrefShowTwitter() {
            this.prefShowTwitter_ = null;
        }
        
        private void clearPrefTopKarmaSubreddits() {
            this.prefTopKarmaSubreddits_ = null;
        }
        
        private void clearPrefVideoAutoplay() {
            this.prefVideoAutoplay_ = null;
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
        
        private void clearSuspensionExpirationUtc() {
            this.suspensionExpirationUtc_ = null;
        }
        
        private void clearTotalKarma() {
            this.totalKarma_ = null;
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
        
        public static UserAboutData getDefaultInstance() {
            return UserAboutData.DEFAULT_INSTANCE;
        }
        
        private void mergeAcceptFollowers(final BoolValue acceptFollowers_) {
            acceptFollowers_.getClass();
            final BoolValue acceptFollowers_2 = this.acceptFollowers_;
            if (acceptFollowers_2 != null && acceptFollowers_2 != BoolValue.getDefaultInstance()) {
                this.acceptFollowers_ = (BoolValue)android.support.v4.media.a.f(this.acceptFollowers_, acceptFollowers_);
            }
            else {
                this.acceptFollowers_ = acceptFollowers_;
            }
        }
        
        private void mergeAwardeeKarma(final Int64Value awardeeKarma_) {
            awardeeKarma_.getClass();
            final Int64Value awardeeKarma_2 = this.awardeeKarma_;
            if (awardeeKarma_2 != null && awardeeKarma_2 != Int64Value.getDefaultInstance()) {
                this.awardeeKarma_ = (Int64Value)b.g(this.awardeeKarma_, awardeeKarma_);
            }
            else {
                this.awardeeKarma_ = awardeeKarma_;
            }
        }
        
        private void mergeAwarderKarma(final Int64Value awarderKarma_) {
            awarderKarma_.getClass();
            final Int64Value awarderKarma_2 = this.awarderKarma_;
            if (awarderKarma_2 != null && awarderKarma_2 != Int64Value.getDefaultInstance()) {
                this.awarderKarma_ = (Int64Value)b.g(this.awarderKarma_, awarderKarma_);
            }
            else {
                this.awarderKarma_ = awarderKarma_;
            }
        }
        
        private void mergeCanCreateSubreddit(final BoolValue canCreateSubreddit_) {
            canCreateSubreddit_.getClass();
            final BoolValue canCreateSubreddit_2 = this.canCreateSubreddit_;
            if (canCreateSubreddit_2 != null && canCreateSubreddit_2 != BoolValue.getDefaultInstance()) {
                this.canCreateSubreddit_ = (BoolValue)android.support.v4.media.a.f(this.canCreateSubreddit_, canCreateSubreddit_);
            }
            else {
                this.canCreateSubreddit_ = canCreateSubreddit_;
            }
        }
        
        private void mergeCanEditName(final BoolValue canEditName_) {
            canEditName_.getClass();
            final BoolValue canEditName_2 = this.canEditName_;
            if (canEditName_2 != null && canEditName_2 != BoolValue.getDefaultInstance()) {
                this.canEditName_ = (BoolValue)android.support.v4.media.a.f(this.canEditName_, canEditName_);
            }
            else {
                this.canEditName_ = canEditName_;
            }
        }
        
        private void mergeCoins(final Int64Value coins_) {
            coins_.getClass();
            final Int64Value coins_2 = this.coins_;
            if (coins_2 != null && coins_2 != Int64Value.getDefaultInstance()) {
                this.coins_ = (Int64Value)b.g(this.coins_, coins_);
            }
            else {
                this.coins_ = coins_;
            }
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
        
        private void mergeCreated(final Int64Value created_) {
            created_.getClass();
            final Int64Value created_2 = this.created_;
            if (created_2 != null && created_2 != Int64Value.getDefaultInstance()) {
                this.created_ = (Int64Value)b.g(this.created_, created_);
            }
            else {
                this.created_ = created_;
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
        
        private void mergeFeatures(final FeaturesType features_) {
            features_.getClass();
            final FeaturesType features_2 = this.features_;
            if (features_2 != null && features_2 != FeaturesType.getDefaultInstance()) {
                final FeaturesType.a builder = FeaturesType.newBuilder(this.features_);
                builder.h((GeneratedMessageLite)features_);
                this.features_ = (FeaturesType)builder.d();
            }
            else {
                this.features_ = features_;
            }
        }
        
        private void mergeForcePasswordReset(final BoolValue forcePasswordReset_) {
            forcePasswordReset_.getClass();
            final BoolValue forcePasswordReset_2 = this.forcePasswordReset_;
            if (forcePasswordReset_2 != null && forcePasswordReset_2 != BoolValue.getDefaultInstance()) {
                this.forcePasswordReset_ = (BoolValue)android.support.v4.media.a.f(this.forcePasswordReset_, forcePasswordReset_);
            }
            else {
                this.forcePasswordReset_ = forcePasswordReset_;
            }
        }
        
        private void mergeGoldCreddits(final Int64Value goldCreddits_) {
            goldCreddits_.getClass();
            final Int64Value goldCreddits_2 = this.goldCreddits_;
            if (goldCreddits_2 != null && goldCreddits_2 != Int64Value.getDefaultInstance()) {
                this.goldCreddits_ = (Int64Value)b.g(this.goldCreddits_, goldCreddits_);
            }
            else {
                this.goldCreddits_ = goldCreddits_;
            }
        }
        
        private void mergeGoldExpiration(final StringValue goldExpiration_) {
            goldExpiration_.getClass();
            final StringValue goldExpiration_2 = this.goldExpiration_;
            if (goldExpiration_2 != null && goldExpiration_2 != StringValue.getDefaultInstance()) {
                this.goldExpiration_ = (StringValue)f0.e(this.goldExpiration_, goldExpiration_);
            }
            else {
                this.goldExpiration_ = goldExpiration_;
            }
        }
        
        private void mergeHasAndroidSubscription(final BoolValue hasAndroidSubscription_) {
            hasAndroidSubscription_.getClass();
            final BoolValue hasAndroidSubscription_2 = this.hasAndroidSubscription_;
            if (hasAndroidSubscription_2 != null && hasAndroidSubscription_2 != BoolValue.getDefaultInstance()) {
                this.hasAndroidSubscription_ = (BoolValue)android.support.v4.media.a.f(this.hasAndroidSubscription_, hasAndroidSubscription_);
            }
            else {
                this.hasAndroidSubscription_ = hasAndroidSubscription_;
            }
        }
        
        private void mergeHasExternalAccount(final BoolValue hasExternalAccount_) {
            hasExternalAccount_.getClass();
            final BoolValue hasExternalAccount_2 = this.hasExternalAccount_;
            if (hasExternalAccount_2 != null && hasExternalAccount_2 != BoolValue.getDefaultInstance()) {
                this.hasExternalAccount_ = (BoolValue)android.support.v4.media.a.f(this.hasExternalAccount_, hasExternalAccount_);
            }
            else {
                this.hasExternalAccount_ = hasExternalAccount_;
            }
        }
        
        private void mergeHasGoldSubscription(final BoolValue hasGoldSubscription_) {
            hasGoldSubscription_.getClass();
            final BoolValue hasGoldSubscription_2 = this.hasGoldSubscription_;
            if (hasGoldSubscription_2 != null && hasGoldSubscription_2 != BoolValue.getDefaultInstance()) {
                this.hasGoldSubscription_ = (BoolValue)android.support.v4.media.a.f(this.hasGoldSubscription_, hasGoldSubscription_);
            }
            else {
                this.hasGoldSubscription_ = hasGoldSubscription_;
            }
        }
        
        private void mergeHasIosSubscription(final BoolValue hasIosSubscription_) {
            hasIosSubscription_.getClass();
            final BoolValue hasIosSubscription_2 = this.hasIosSubscription_;
            if (hasIosSubscription_2 != null && hasIosSubscription_2 != BoolValue.getDefaultInstance()) {
                this.hasIosSubscription_ = (BoolValue)android.support.v4.media.a.f(this.hasIosSubscription_, hasIosSubscription_);
            }
            else {
                this.hasIosSubscription_ = hasIosSubscription_;
            }
        }
        
        private void mergeHasMail(final BoolValue hasMail_) {
            hasMail_.getClass();
            final BoolValue hasMail_2 = this.hasMail_;
            if (hasMail_2 != null && hasMail_2 != BoolValue.getDefaultInstance()) {
                this.hasMail_ = (BoolValue)android.support.v4.media.a.f(this.hasMail_, hasMail_);
            }
            else {
                this.hasMail_ = hasMail_;
            }
        }
        
        private void mergeHasModMail(final BoolValue hasModMail_) {
            hasModMail_.getClass();
            final BoolValue hasModMail_2 = this.hasModMail_;
            if (hasModMail_2 != null && hasModMail_2 != BoolValue.getDefaultInstance()) {
                this.hasModMail_ = (BoolValue)android.support.v4.media.a.f(this.hasModMail_, hasModMail_);
            }
            else {
                this.hasModMail_ = hasModMail_;
            }
        }
        
        private void mergeHasPaypalSubscription(final BoolValue hasPaypalSubscription_) {
            hasPaypalSubscription_.getClass();
            final BoolValue hasPaypalSubscription_2 = this.hasPaypalSubscription_;
            if (hasPaypalSubscription_2 != null && hasPaypalSubscription_2 != BoolValue.getDefaultInstance()) {
                this.hasPaypalSubscription_ = (BoolValue)android.support.v4.media.a.f(this.hasPaypalSubscription_, hasPaypalSubscription_);
            }
            else {
                this.hasPaypalSubscription_ = hasPaypalSubscription_;
            }
        }
        
        private void mergeHasStripeSubscription(final BoolValue hasStripeSubscription_) {
            hasStripeSubscription_.getClass();
            final BoolValue hasStripeSubscription_2 = this.hasStripeSubscription_;
            if (hasStripeSubscription_2 != null && hasStripeSubscription_2 != BoolValue.getDefaultInstance()) {
                this.hasStripeSubscription_ = (BoolValue)android.support.v4.media.a.f(this.hasStripeSubscription_, hasStripeSubscription_);
            }
            else {
                this.hasStripeSubscription_ = hasStripeSubscription_;
            }
        }
        
        private void mergeHasSubscribed(final BoolValue hasSubscribed_) {
            hasSubscribed_.getClass();
            final BoolValue hasSubscribed_2 = this.hasSubscribed_;
            if (hasSubscribed_2 != null && hasSubscribed_2 != BoolValue.getDefaultInstance()) {
                this.hasSubscribed_ = (BoolValue)android.support.v4.media.a.f(this.hasSubscribed_, hasSubscribed_);
            }
            else {
                this.hasSubscribed_ = hasSubscribed_;
            }
        }
        
        private void mergeHasSubscribedToPremium(final BoolValue hasSubscribedToPremium_) {
            hasSubscribedToPremium_.getClass();
            final BoolValue hasSubscribedToPremium_2 = this.hasSubscribedToPremium_;
            if (hasSubscribedToPremium_2 != null && hasSubscribedToPremium_2 != BoolValue.getDefaultInstance()) {
                this.hasSubscribedToPremium_ = (BoolValue)android.support.v4.media.a.f(this.hasSubscribedToPremium_, hasSubscribedToPremium_);
            }
            else {
                this.hasSubscribedToPremium_ = hasSubscribedToPremium_;
            }
        }
        
        private void mergeHasVerifiedEmail(final BoolValue hasVerifiedEmail_) {
            hasVerifiedEmail_.getClass();
            final BoolValue hasVerifiedEmail_2 = this.hasVerifiedEmail_;
            if (hasVerifiedEmail_2 != null && hasVerifiedEmail_2 != BoolValue.getDefaultInstance()) {
                this.hasVerifiedEmail_ = (BoolValue)android.support.v4.media.a.f(this.hasVerifiedEmail_, hasVerifiedEmail_);
            }
            else {
                this.hasVerifiedEmail_ = hasVerifiedEmail_;
            }
        }
        
        private void mergeHasVisitedNewProfile(final BoolValue hasVisitedNewProfile_) {
            hasVisitedNewProfile_.getClass();
            final BoolValue hasVisitedNewProfile_2 = this.hasVisitedNewProfile_;
            if (hasVisitedNewProfile_2 != null && hasVisitedNewProfile_2 != BoolValue.getDefaultInstance()) {
                this.hasVisitedNewProfile_ = (BoolValue)android.support.v4.media.a.f(this.hasVisitedNewProfile_, hasVisitedNewProfile_);
            }
            else {
                this.hasVisitedNewProfile_ = hasVisitedNewProfile_;
            }
        }
        
        private void mergeHideFromRobots(final BoolValue hideFromRobots_) {
            hideFromRobots_.getClass();
            final BoolValue hideFromRobots_2 = this.hideFromRobots_;
            if (hideFromRobots_2 != null && hideFromRobots_2 != BoolValue.getDefaultInstance()) {
                this.hideFromRobots_ = (BoolValue)android.support.v4.media.a.f(this.hideFromRobots_, hideFromRobots_);
            }
            else {
                this.hideFromRobots_ = hideFromRobots_;
            }
        }
        
        private void mergeIconImg(final StringValue iconImg_) {
            iconImg_.getClass();
            final StringValue iconImg_2 = this.iconImg_;
            if (iconImg_2 != null && iconImg_2 != StringValue.getDefaultInstance()) {
                this.iconImg_ = (StringValue)f0.e(this.iconImg_, iconImg_);
            }
            else {
                this.iconImg_ = iconImg_;
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
        
        private void mergeInBeta(final BoolValue inBeta_) {
            inBeta_.getClass();
            final BoolValue inBeta_2 = this.inBeta_;
            if (inBeta_2 != null && inBeta_2 != BoolValue.getDefaultInstance()) {
                this.inBeta_ = (BoolValue)android.support.v4.media.a.f(this.inBeta_, inBeta_);
            }
            else {
                this.inBeta_ = inBeta_;
            }
        }
        
        private void mergeInChat(final BoolValue inChat_) {
            inChat_.getClass();
            final BoolValue inChat_2 = this.inChat_;
            if (inChat_2 != null && inChat_2 != BoolValue.getDefaultInstance()) {
                this.inChat_ = (BoolValue)android.support.v4.media.a.f(this.inChat_, inChat_);
            }
            else {
                this.inChat_ = inChat_;
            }
        }
        
        private void mergeInRedesignBeta(final BoolValue inRedesignBeta_) {
            inRedesignBeta_.getClass();
            final BoolValue inRedesignBeta_2 = this.inRedesignBeta_;
            if (inRedesignBeta_2 != null && inRedesignBeta_2 != BoolValue.getDefaultInstance()) {
                this.inRedesignBeta_ = (BoolValue)android.support.v4.media.a.f(this.inRedesignBeta_, inRedesignBeta_);
            }
            else {
                this.inRedesignBeta_ = inRedesignBeta_;
            }
        }
        
        private void mergeInboxCount(final Int32Value inboxCount_) {
            inboxCount_.getClass();
            final Int32Value inboxCount_2 = this.inboxCount_;
            if (inboxCount_2 != null && inboxCount_2 != Int32Value.getDefaultInstance()) {
                this.inboxCount_ = (Int32Value)android.support.v4.media.a.g(this.inboxCount_, inboxCount_);
            }
            else {
                this.inboxCount_ = inboxCount_;
            }
        }
        
        private void mergeIsBlocked(final BoolValue isBlocked_) {
            isBlocked_.getClass();
            final BoolValue isBlocked_2 = this.isBlocked_;
            if (isBlocked_2 != null && isBlocked_2 != BoolValue.getDefaultInstance()) {
                this.isBlocked_ = (BoolValue)android.support.v4.media.a.f(this.isBlocked_, isBlocked_);
            }
            else {
                this.isBlocked_ = isBlocked_;
            }
        }
        
        private void mergeIsEmployee(final BoolValue isEmployee_) {
            isEmployee_.getClass();
            final BoolValue isEmployee_2 = this.isEmployee_;
            if (isEmployee_2 != null && isEmployee_2 != BoolValue.getDefaultInstance()) {
                this.isEmployee_ = (BoolValue)android.support.v4.media.a.f(this.isEmployee_, isEmployee_);
            }
            else {
                this.isEmployee_ = isEmployee_;
            }
        }
        
        private void mergeIsFriend(final BoolValue isFriend_) {
            isFriend_.getClass();
            final BoolValue isFriend_2 = this.isFriend_;
            if (isFriend_2 != null && isFriend_2 != BoolValue.getDefaultInstance()) {
                this.isFriend_ = (BoolValue)android.support.v4.media.a.f(this.isFriend_, isFriend_);
            }
            else {
                this.isFriend_ = isFriend_;
            }
        }
        
        private void mergeIsGold(final BoolValue isGold_) {
            isGold_.getClass();
            final BoolValue isGold_2 = this.isGold_;
            if (isGold_2 != null && isGold_2 != BoolValue.getDefaultInstance()) {
                this.isGold_ = (BoolValue)android.support.v4.media.a.f(this.isGold_, isGold_);
            }
            else {
                this.isGold_ = isGold_;
            }
        }
        
        private void mergeIsMod(final BoolValue isMod_) {
            isMod_.getClass();
            final BoolValue isMod_2 = this.isMod_;
            if (isMod_2 != null && isMod_2 != BoolValue.getDefaultInstance()) {
                this.isMod_ = (BoolValue)android.support.v4.media.a.f(this.isMod_, isMod_);
            }
            else {
                this.isMod_ = isMod_;
            }
        }
        
        private void mergeIsSponsor(final BoolValue isSponsor_) {
            isSponsor_.getClass();
            final BoolValue isSponsor_2 = this.isSponsor_;
            if (isSponsor_2 != null && isSponsor_2 != BoolValue.getDefaultInstance()) {
                this.isSponsor_ = (BoolValue)android.support.v4.media.a.f(this.isSponsor_, isSponsor_);
            }
            else {
                this.isSponsor_ = isSponsor_;
            }
        }
        
        private void mergeIsSuspended(final BoolValue isSuspended_) {
            isSuspended_.getClass();
            final BoolValue isSuspended_2 = this.isSuspended_;
            if (isSuspended_2 != null && isSuspended_2 != BoolValue.getDefaultInstance()) {
                this.isSuspended_ = (BoolValue)android.support.v4.media.a.f(this.isSuspended_, isSuspended_);
            }
            else {
                this.isSuspended_ = isSuspended_;
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
        
        private void mergeModhash(final StringValue modhash_) {
            modhash_.getClass();
            final StringValue modhash_2 = this.modhash_;
            if (modhash_2 != null && modhash_2 != StringValue.getDefaultInstance()) {
                this.modhash_ = (StringValue)f0.e(this.modhash_, modhash_);
            }
            else {
                this.modhash_ = modhash_;
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
        
        private void mergeNewModmailExists(final StringValue newModmailExists_) {
            newModmailExists_.getClass();
            final StringValue newModmailExists_2 = this.newModmailExists_;
            if (newModmailExists_2 != null && newModmailExists_2 != StringValue.getDefaultInstance()) {
                this.newModmailExists_ = (StringValue)f0.e(this.newModmailExists_, newModmailExists_);
            }
            else {
                this.newModmailExists_ = newModmailExists_;
            }
        }
        
        private void mergeNumFriends(final Int64Value numFriends_) {
            numFriends_.getClass();
            final Int64Value numFriends_2 = this.numFriends_;
            if (numFriends_2 != null && numFriends_2 != Int64Value.getDefaultInstance()) {
                this.numFriends_ = (Int64Value)b.g(this.numFriends_, numFriends_);
            }
            else {
                this.numFriends_ = numFriends_;
            }
        }
        
        private void mergeOver18(final BoolValue over18_) {
            over18_.getClass();
            final BoolValue over18_2 = this.over18_;
            if (over18_2 != null && over18_2 != BoolValue.getDefaultInstance()) {
                this.over18_ = (BoolValue)android.support.v4.media.a.f(this.over18_, over18_);
            }
            else {
                this.over18_ = over18_;
            }
        }
        
        private void mergePasswordSet(final BoolValue passwordSet_) {
            passwordSet_.getClass();
            final BoolValue passwordSet_2 = this.passwordSet_;
            if (passwordSet_2 != null && passwordSet_2 != BoolValue.getDefaultInstance()) {
                this.passwordSet_ = (BoolValue)android.support.v4.media.a.f(this.passwordSet_, passwordSet_);
            }
            else {
                this.passwordSet_ = passwordSet_;
            }
        }
        
        private void mergePrefAutoplay(final BoolValue prefAutoplay_) {
            prefAutoplay_.getClass();
            final BoolValue prefAutoplay_2 = this.prefAutoplay_;
            if (prefAutoplay_2 != null && prefAutoplay_2 != BoolValue.getDefaultInstance()) {
                this.prefAutoplay_ = (BoolValue)android.support.v4.media.a.f(this.prefAutoplay_, prefAutoplay_);
            }
            else {
                this.prefAutoplay_ = prefAutoplay_;
            }
        }
        
        private void mergePrefClickgadget(final Int64Value prefClickgadget_) {
            prefClickgadget_.getClass();
            final Int64Value prefClickgadget_2 = this.prefClickgadget_;
            if (prefClickgadget_2 != null && prefClickgadget_2 != Int64Value.getDefaultInstance()) {
                this.prefClickgadget_ = (Int64Value)b.g(this.prefClickgadget_, prefClickgadget_);
            }
            else {
                this.prefClickgadget_ = prefClickgadget_;
            }
        }
        
        private void mergePrefGeopopular(final StringValue prefGeopopular_) {
            prefGeopopular_.getClass();
            final StringValue prefGeopopular_2 = this.prefGeopopular_;
            if (prefGeopopular_2 != null && prefGeopopular_2 != StringValue.getDefaultInstance()) {
                this.prefGeopopular_ = (StringValue)f0.e(this.prefGeopopular_, prefGeopopular_);
            }
            else {
                this.prefGeopopular_ = prefGeopopular_;
            }
        }
        
        private void mergePrefNightmode(final BoolValue prefNightmode_) {
            prefNightmode_.getClass();
            final BoolValue prefNightmode_2 = this.prefNightmode_;
            if (prefNightmode_2 != null && prefNightmode_2 != BoolValue.getDefaultInstance()) {
                this.prefNightmode_ = (BoolValue)android.support.v4.media.a.f(this.prefNightmode_, prefNightmode_);
            }
            else {
                this.prefNightmode_ = prefNightmode_;
            }
        }
        
        private void mergePrefNoProfanity(final BoolValue prefNoProfanity_) {
            prefNoProfanity_.getClass();
            final BoolValue prefNoProfanity_2 = this.prefNoProfanity_;
            if (prefNoProfanity_2 != null && prefNoProfanity_2 != BoolValue.getDefaultInstance()) {
                this.prefNoProfanity_ = (BoolValue)android.support.v4.media.a.f(this.prefNoProfanity_, prefNoProfanity_);
            }
            else {
                this.prefNoProfanity_ = prefNoProfanity_;
            }
        }
        
        private void mergePrefShowPresence(final BoolValue prefShowPresence_) {
            prefShowPresence_.getClass();
            final BoolValue prefShowPresence_2 = this.prefShowPresence_;
            if (prefShowPresence_2 != null && prefShowPresence_2 != BoolValue.getDefaultInstance()) {
                this.prefShowPresence_ = (BoolValue)android.support.v4.media.a.f(this.prefShowPresence_, prefShowPresence_);
            }
            else {
                this.prefShowPresence_ = prefShowPresence_;
            }
        }
        
        private void mergePrefShowSnoovatar(final BoolValue prefShowSnoovatar_) {
            prefShowSnoovatar_.getClass();
            final BoolValue prefShowSnoovatar_2 = this.prefShowSnoovatar_;
            if (prefShowSnoovatar_2 != null && prefShowSnoovatar_2 != BoolValue.getDefaultInstance()) {
                this.prefShowSnoovatar_ = (BoolValue)android.support.v4.media.a.f(this.prefShowSnoovatar_, prefShowSnoovatar_);
            }
            else {
                this.prefShowSnoovatar_ = prefShowSnoovatar_;
            }
        }
        
        private void mergePrefShowTrending(final BoolValue prefShowTrending_) {
            prefShowTrending_.getClass();
            final BoolValue prefShowTrending_2 = this.prefShowTrending_;
            if (prefShowTrending_2 != null && prefShowTrending_2 != BoolValue.getDefaultInstance()) {
                this.prefShowTrending_ = (BoolValue)android.support.v4.media.a.f(this.prefShowTrending_, prefShowTrending_);
            }
            else {
                this.prefShowTrending_ = prefShowTrending_;
            }
        }
        
        private void mergePrefShowTwitter(final BoolValue prefShowTwitter_) {
            prefShowTwitter_.getClass();
            final BoolValue prefShowTwitter_2 = this.prefShowTwitter_;
            if (prefShowTwitter_2 != null && prefShowTwitter_2 != BoolValue.getDefaultInstance()) {
                this.prefShowTwitter_ = (BoolValue)android.support.v4.media.a.f(this.prefShowTwitter_, prefShowTwitter_);
            }
            else {
                this.prefShowTwitter_ = prefShowTwitter_;
            }
        }
        
        private void mergePrefTopKarmaSubreddits(final BoolValue prefTopKarmaSubreddits_) {
            prefTopKarmaSubreddits_.getClass();
            final BoolValue prefTopKarmaSubreddits_2 = this.prefTopKarmaSubreddits_;
            if (prefTopKarmaSubreddits_2 != null && prefTopKarmaSubreddits_2 != BoolValue.getDefaultInstance()) {
                this.prefTopKarmaSubreddits_ = (BoolValue)android.support.v4.media.a.f(this.prefTopKarmaSubreddits_, prefTopKarmaSubreddits_);
            }
            else {
                this.prefTopKarmaSubreddits_ = prefTopKarmaSubreddits_;
            }
        }
        
        private void mergePrefVideoAutoplay(final BoolValue prefVideoAutoplay_) {
            prefVideoAutoplay_.getClass();
            final BoolValue prefVideoAutoplay_2 = this.prefVideoAutoplay_;
            if (prefVideoAutoplay_2 != null && prefVideoAutoplay_2 != BoolValue.getDefaultInstance()) {
                this.prefVideoAutoplay_ = (BoolValue)android.support.v4.media.a.f(this.prefVideoAutoplay_, prefVideoAutoplay_);
            }
            else {
                this.prefVideoAutoplay_ = prefVideoAutoplay_;
            }
        }
        
        private void mergeSnoovatarImg(final StringValue snoovatarImg_) {
            snoovatarImg_.getClass();
            final StringValue snoovatarImg_2 = this.snoovatarImg_;
            if (snoovatarImg_2 != null && snoovatarImg_2 != StringValue.getDefaultInstance()) {
                this.snoovatarImg_ = (StringValue)f0.e(this.snoovatarImg_, snoovatarImg_);
            }
            else {
                this.snoovatarImg_ = snoovatarImg_;
            }
        }
        
        private void mergeSubreddit(final CommonMsg$SubredditObject subreddit_) {
            subreddit_.getClass();
            final CommonMsg$SubredditObject subreddit_2 = this.subreddit_;
            if (subreddit_2 != null && subreddit_2 != CommonMsg$SubredditObject.getDefaultInstance()) {
                final CommonMsg$SubredditObject.a builder = CommonMsg$SubredditObject.newBuilder(this.subreddit_);
                builder.h((GeneratedMessageLite)subreddit_);
                this.subreddit_ = (CommonMsg$SubredditObject)builder.d();
            }
            else {
                this.subreddit_ = subreddit_;
            }
        }
        
        private void mergeSuspensionExpirationUtc(final StringValue suspensionExpirationUtc_) {
            suspensionExpirationUtc_.getClass();
            final StringValue suspensionExpirationUtc_2 = this.suspensionExpirationUtc_;
            if (suspensionExpirationUtc_2 != null && suspensionExpirationUtc_2 != StringValue.getDefaultInstance()) {
                this.suspensionExpirationUtc_ = (StringValue)f0.e(this.suspensionExpirationUtc_, suspensionExpirationUtc_);
            }
            else {
                this.suspensionExpirationUtc_ = suspensionExpirationUtc_;
            }
        }
        
        private void mergeTotalKarma(final Int64Value totalKarma_) {
            totalKarma_.getClass();
            final Int64Value totalKarma_2 = this.totalKarma_;
            if (totalKarma_2 != null && totalKarma_2 != Int64Value.getDefaultInstance()) {
                this.totalKarma_ = (Int64Value)b.g(this.totalKarma_, totalKarma_);
            }
            else {
                this.totalKarma_ = totalKarma_;
            }
        }
        
        private void mergeVerified(final BoolValue verified_) {
            verified_.getClass();
            final BoolValue verified_2 = this.verified_;
            if (verified_2 != null && verified_2 != BoolValue.getDefaultInstance()) {
                this.verified_ = (BoolValue)android.support.v4.media.a.f(this.verified_, verified_);
            }
            else {
                this.verified_ = verified_;
            }
        }
        
        public static a newBuilder() {
            return (a)UserAboutData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final UserAboutData userAboutData) {
            return (a)UserAboutData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)userAboutData);
        }
        
        public static UserAboutData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (UserAboutData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserAboutData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserAboutData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserAboutData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, byteString);
        }
        
        public static UserAboutData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static UserAboutData parseFrom(final l l) throws IOException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, l);
        }
        
        public static UserAboutData parseFrom(final l l, final d0 d0) throws IOException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static UserAboutData parseFrom(final InputStream inputStream) throws IOException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static UserAboutData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static UserAboutData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static UserAboutData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static UserAboutData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, array);
        }
        
        public static UserAboutData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (UserAboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<UserAboutData> parser() {
            return (n1<UserAboutData>)UserAboutData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeSnoovatarSize(final int n) {
            this.ensureSnoovatarSizeIsMutable();
            this.snoovatarSize_.remove(n);
        }
        
        private void setAcceptFollowers(final BoolValue acceptFollowers_) {
            acceptFollowers_.getClass();
            this.acceptFollowers_ = acceptFollowers_;
        }
        
        private void setAwardeeKarma(final Int64Value awardeeKarma_) {
            awardeeKarma_.getClass();
            this.awardeeKarma_ = awardeeKarma_;
        }
        
        private void setAwarderKarma(final Int64Value awarderKarma_) {
            awarderKarma_.getClass();
            this.awarderKarma_ = awarderKarma_;
        }
        
        private void setCanCreateSubreddit(final BoolValue canCreateSubreddit_) {
            canCreateSubreddit_.getClass();
            this.canCreateSubreddit_ = canCreateSubreddit_;
        }
        
        private void setCanEditName(final BoolValue canEditName_) {
            canEditName_.getClass();
            this.canEditName_ = canEditName_;
        }
        
        private void setCoins(final Int64Value coins_) {
            coins_.getClass();
            this.coins_ = coins_;
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
        
        private void setFeatures(final FeaturesType features_) {
            features_.getClass();
            this.features_ = features_;
        }
        
        private void setForcePasswordReset(final BoolValue forcePasswordReset_) {
            forcePasswordReset_.getClass();
            this.forcePasswordReset_ = forcePasswordReset_;
        }
        
        private void setGoldCreddits(final Int64Value goldCreddits_) {
            goldCreddits_.getClass();
            this.goldCreddits_ = goldCreddits_;
        }
        
        private void setGoldExpiration(final StringValue goldExpiration_) {
            goldExpiration_.getClass();
            this.goldExpiration_ = goldExpiration_;
        }
        
        private void setHasAndroidSubscription(final BoolValue hasAndroidSubscription_) {
            hasAndroidSubscription_.getClass();
            this.hasAndroidSubscription_ = hasAndroidSubscription_;
        }
        
        private void setHasExternalAccount(final BoolValue hasExternalAccount_) {
            hasExternalAccount_.getClass();
            this.hasExternalAccount_ = hasExternalAccount_;
        }
        
        private void setHasGoldSubscription(final BoolValue hasGoldSubscription_) {
            hasGoldSubscription_.getClass();
            this.hasGoldSubscription_ = hasGoldSubscription_;
        }
        
        private void setHasIosSubscription(final BoolValue hasIosSubscription_) {
            hasIosSubscription_.getClass();
            this.hasIosSubscription_ = hasIosSubscription_;
        }
        
        private void setHasMail(final BoolValue hasMail_) {
            hasMail_.getClass();
            this.hasMail_ = hasMail_;
        }
        
        private void setHasModMail(final BoolValue hasModMail_) {
            hasModMail_.getClass();
            this.hasModMail_ = hasModMail_;
        }
        
        private void setHasPaypalSubscription(final BoolValue hasPaypalSubscription_) {
            hasPaypalSubscription_.getClass();
            this.hasPaypalSubscription_ = hasPaypalSubscription_;
        }
        
        private void setHasStripeSubscription(final BoolValue hasStripeSubscription_) {
            hasStripeSubscription_.getClass();
            this.hasStripeSubscription_ = hasStripeSubscription_;
        }
        
        private void setHasSubscribed(final BoolValue hasSubscribed_) {
            hasSubscribed_.getClass();
            this.hasSubscribed_ = hasSubscribed_;
        }
        
        private void setHasSubscribedToPremium(final BoolValue hasSubscribedToPremium_) {
            hasSubscribedToPremium_.getClass();
            this.hasSubscribedToPremium_ = hasSubscribedToPremium_;
        }
        
        private void setHasVerifiedEmail(final BoolValue hasVerifiedEmail_) {
            hasVerifiedEmail_.getClass();
            this.hasVerifiedEmail_ = hasVerifiedEmail_;
        }
        
        private void setHasVisitedNewProfile(final BoolValue hasVisitedNewProfile_) {
            hasVisitedNewProfile_.getClass();
            this.hasVisitedNewProfile_ = hasVisitedNewProfile_;
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
        
        private void setInBeta(final BoolValue inBeta_) {
            inBeta_.getClass();
            this.inBeta_ = inBeta_;
        }
        
        private void setInChat(final BoolValue inChat_) {
            inChat_.getClass();
            this.inChat_ = inChat_;
        }
        
        private void setInRedesignBeta(final BoolValue inRedesignBeta_) {
            inRedesignBeta_.getClass();
            this.inRedesignBeta_ = inRedesignBeta_;
        }
        
        private void setInboxCount(final Int32Value inboxCount_) {
            inboxCount_.getClass();
            this.inboxCount_ = inboxCount_;
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
        
        private void setIsSponsor(final BoolValue isSponsor_) {
            isSponsor_.getClass();
            this.isSponsor_ = isSponsor_;
        }
        
        private void setIsSuspended(final BoolValue isSuspended_) {
            isSuspended_.getClass();
            this.isSuspended_ = isSuspended_;
        }
        
        private void setLinkKarma(final Int64Value linkKarma_) {
            linkKarma_.getClass();
            this.linkKarma_ = linkKarma_;
        }
        
        private void setModhash(final StringValue modhash_) {
            modhash_.getClass();
            this.modhash_ = modhash_;
        }
        
        private void setName(final StringValue name_) {
            name_.getClass();
            this.name_ = name_;
        }
        
        private void setNewModmailExists(final StringValue newModmailExists_) {
            newModmailExists_.getClass();
            this.newModmailExists_ = newModmailExists_;
        }
        
        private void setNumFriends(final Int64Value numFriends_) {
            numFriends_.getClass();
            this.numFriends_ = numFriends_;
        }
        
        private void setOver18(final BoolValue over18_) {
            over18_.getClass();
            this.over18_ = over18_;
        }
        
        private void setPasswordSet(final BoolValue passwordSet_) {
            passwordSet_.getClass();
            this.passwordSet_ = passwordSet_;
        }
        
        private void setPrefAutoplay(final BoolValue prefAutoplay_) {
            prefAutoplay_.getClass();
            this.prefAutoplay_ = prefAutoplay_;
        }
        
        private void setPrefClickgadget(final Int64Value prefClickgadget_) {
            prefClickgadget_.getClass();
            this.prefClickgadget_ = prefClickgadget_;
        }
        
        private void setPrefGeopopular(final StringValue prefGeopopular_) {
            prefGeopopular_.getClass();
            this.prefGeopopular_ = prefGeopopular_;
        }
        
        private void setPrefNightmode(final BoolValue prefNightmode_) {
            prefNightmode_.getClass();
            this.prefNightmode_ = prefNightmode_;
        }
        
        private void setPrefNoProfanity(final BoolValue prefNoProfanity_) {
            prefNoProfanity_.getClass();
            this.prefNoProfanity_ = prefNoProfanity_;
        }
        
        private void setPrefShowPresence(final BoolValue prefShowPresence_) {
            prefShowPresence_.getClass();
            this.prefShowPresence_ = prefShowPresence_;
        }
        
        private void setPrefShowSnoovatar(final BoolValue prefShowSnoovatar_) {
            prefShowSnoovatar_.getClass();
            this.prefShowSnoovatar_ = prefShowSnoovatar_;
        }
        
        private void setPrefShowTrending(final BoolValue prefShowTrending_) {
            prefShowTrending_.getClass();
            this.prefShowTrending_ = prefShowTrending_;
        }
        
        private void setPrefShowTwitter(final BoolValue prefShowTwitter_) {
            prefShowTwitter_.getClass();
            this.prefShowTwitter_ = prefShowTwitter_;
        }
        
        private void setPrefTopKarmaSubreddits(final BoolValue prefTopKarmaSubreddits_) {
            prefTopKarmaSubreddits_.getClass();
            this.prefTopKarmaSubreddits_ = prefTopKarmaSubreddits_;
        }
        
        private void setPrefVideoAutoplay(final BoolValue prefVideoAutoplay_) {
            prefVideoAutoplay_.getClass();
            this.prefVideoAutoplay_ = prefVideoAutoplay_;
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
        
        private void setSubreddit(final CommonMsg$SubredditObject subreddit_) {
            subreddit_.getClass();
            this.subreddit_ = subreddit_;
        }
        
        private void setSuspensionExpirationUtc(final StringValue suspensionExpirationUtc_) {
            suspensionExpirationUtc_.getClass();
            this.suspensionExpirationUtc_ = suspensionExpirationUtc_;
        }
        
        private void setTotalKarma(final Int64Value totalKarma_) {
            totalKarma_.getClass();
            this.totalKarma_ = totalKarma_;
        }
        
        private void setVerified(final BoolValue verified_) {
            verified_.getClass();
            this.verified_ = verified_;
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
                    final n1<UserAboutData> parser;
                    if ((parser = UserAboutData.PARSER) == null) {
                        synchronized (UserAboutData.class) {
                            if (UserAboutData.PARSER == null) {
                                UserAboutData.PARSER = (n1<UserAboutData>)new GeneratedMessageLite$c((GeneratedMessageLite)UserAboutData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return UserAboutData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)UserAboutData.DEFAULT_INSTANCE, "\u0000?\u0000\u0000\u0001??\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\u001b\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t \t!\t\"\t#\t$\t%\t&\t'\t(\t)\t*\t+\t,\t-\t.\t/\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t:\t;\t<\t=\t>\t?\t", new Object[] { "isEmployee_", "hasVisitedNewProfile_", "isFriend_", "prefNoProfanity_", "hasExternalAccount_", "prefGeopopular_", "prefShowTrending_", "prefShowPresence_", "snoovatarImg_", "snoovatarSize_", Int32Value.class, "goldExpiration_", "hasGoldSubscription_", "isSponsor_", "numFriends_", "canEditName_", "isBlocked_", "verified_", "newModmailExists_", "prefAutoplay_", "coins_", "hasPaypalSubscription_", "hasSubscribedToPremium_", "id_", "canCreateSubreddit_", "over18_", "isGold_", "isMod_", "awarderKarma_", "suspensionExpirationUtc_", "hasStripeSubscription_", "isSuspended_", "prefVideoAutoplay_", "inChat_", "hasAndroidSubscription_", "inRedesignBeta_", "iconImg_", "hasModMail_", "prefNightmode_", "awardeeKarma_", "hideFromRobots_", "passwordSet_", "modhash_", "linkKarma_", "forcePasswordReset_", "totalKarma_", "inboxCount_", "prefTopKarmaSubreddits_", "hasMail_", "prefShowSnoovatar_", "name_", "prefClickgadget_", "created_", "hasVerifiedEmail_", "goldCreddits_", "createdUtc_", "hasIosSubscription_", "prefShowTwitter_", "inBeta_", "commentKarma_", "acceptFollowers_", "hasSubscribed_", "subreddit_", "features_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new UserAboutData();
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
        
        public Int64Value getAwardeeKarma() {
            Int64Value int64Value;
            if ((int64Value = this.awardeeKarma_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public Int64Value getAwarderKarma() {
            Int64Value int64Value;
            if ((int64Value = this.awarderKarma_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public BoolValue getCanCreateSubreddit() {
            BoolValue boolValue;
            if ((boolValue = this.canCreateSubreddit_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getCanEditName() {
            BoolValue boolValue;
            if ((boolValue = this.canEditName_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int64Value getCoins() {
            Int64Value int64Value;
            if ((int64Value = this.coins_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
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
        
        public FeaturesType getFeatures() {
            GeneratedMessageLite<FeaturesType, FeaturesType.a> generatedMessageLite;
            if ((generatedMessageLite = this.features_) == null) {
                generatedMessageLite = FeaturesType.getDefaultInstance();
            }
            return (FeaturesType)generatedMessageLite;
        }
        
        public BoolValue getForcePasswordReset() {
            BoolValue boolValue;
            if ((boolValue = this.forcePasswordReset_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int64Value getGoldCreddits() {
            Int64Value int64Value;
            if ((int64Value = this.goldCreddits_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getGoldExpiration() {
            StringValue stringValue;
            if ((stringValue = this.goldExpiration_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getHasAndroidSubscription() {
            BoolValue boolValue;
            if ((boolValue = this.hasAndroidSubscription_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasExternalAccount() {
            BoolValue boolValue;
            if ((boolValue = this.hasExternalAccount_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasGoldSubscription() {
            BoolValue boolValue;
            if ((boolValue = this.hasGoldSubscription_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasIosSubscription() {
            BoolValue boolValue;
            if ((boolValue = this.hasIosSubscription_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasMail() {
            BoolValue boolValue;
            if ((boolValue = this.hasMail_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasModMail() {
            BoolValue boolValue;
            if ((boolValue = this.hasModMail_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasPaypalSubscription() {
            BoolValue boolValue;
            if ((boolValue = this.hasPaypalSubscription_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasStripeSubscription() {
            BoolValue boolValue;
            if ((boolValue = this.hasStripeSubscription_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasSubscribed() {
            BoolValue boolValue;
            if ((boolValue = this.hasSubscribed_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasSubscribedToPremium() {
            BoolValue boolValue;
            if ((boolValue = this.hasSubscribedToPremium_) == null) {
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
        
        public BoolValue getHasVisitedNewProfile() {
            BoolValue boolValue;
            if ((boolValue = this.hasVisitedNewProfile_) == null) {
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
        
        public BoolValue getInBeta() {
            BoolValue boolValue;
            if ((boolValue = this.inBeta_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getInChat() {
            BoolValue boolValue;
            if ((boolValue = this.inChat_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getInRedesignBeta() {
            BoolValue boolValue;
            if ((boolValue = this.inRedesignBeta_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int32Value getInboxCount() {
            Int32Value int32Value;
            if ((int32Value = this.inboxCount_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
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
        
        public BoolValue getIsSponsor() {
            BoolValue boolValue;
            if ((boolValue = this.isSponsor_) == null) {
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
        
        public Int64Value getLinkKarma() {
            Int64Value int64Value;
            if ((int64Value = this.linkKarma_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getModhash() {
            StringValue stringValue;
            if ((stringValue = this.modhash_) == null) {
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
        
        public StringValue getNewModmailExists() {
            StringValue stringValue;
            if ((stringValue = this.newModmailExists_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int64Value getNumFriends() {
            Int64Value int64Value;
            if ((int64Value = this.numFriends_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public BoolValue getOver18() {
            BoolValue boolValue;
            if ((boolValue = this.over18_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPasswordSet() {
            BoolValue boolValue;
            if ((boolValue = this.passwordSet_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefAutoplay() {
            BoolValue boolValue;
            if ((boolValue = this.prefAutoplay_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int64Value getPrefClickgadget() {
            Int64Value int64Value;
            if ((int64Value = this.prefClickgadget_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getPrefGeopopular() {
            StringValue stringValue;
            if ((stringValue = this.prefGeopopular_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getPrefNightmode() {
            BoolValue boolValue;
            if ((boolValue = this.prefNightmode_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefNoProfanity() {
            BoolValue boolValue;
            if ((boolValue = this.prefNoProfanity_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefShowPresence() {
            BoolValue boolValue;
            if ((boolValue = this.prefShowPresence_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefShowSnoovatar() {
            BoolValue boolValue;
            if ((boolValue = this.prefShowSnoovatar_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefShowTrending() {
            BoolValue boolValue;
            if ((boolValue = this.prefShowTrending_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefShowTwitter() {
            BoolValue boolValue;
            if ((boolValue = this.prefShowTwitter_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefTopKarmaSubreddits() {
            BoolValue boolValue;
            if ((boolValue = this.prefTopKarmaSubreddits_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getPrefVideoAutoplay() {
            BoolValue boolValue;
            if ((boolValue = this.prefVideoAutoplay_) == null) {
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
        
        public CommonMsg$SubredditObject getSubreddit() {
            CommonMsg$SubredditObject commonMsg$SubredditObject;
            if ((commonMsg$SubredditObject = this.subreddit_) == null) {
                commonMsg$SubredditObject = CommonMsg$SubredditObject.getDefaultInstance();
            }
            return commonMsg$SubredditObject;
        }
        
        public StringValue getSuspensionExpirationUtc() {
            StringValue stringValue;
            if ((stringValue = this.suspensionExpirationUtc_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int64Value getTotalKarma() {
            Int64Value int64Value;
            if ((int64Value = this.totalKarma_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public BoolValue getVerified() {
            BoolValue boolValue;
            if ((boolValue = this.verified_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public boolean hasAcceptFollowers() {
            return this.acceptFollowers_ != null;
        }
        
        public boolean hasAwardeeKarma() {
            return this.awardeeKarma_ != null;
        }
        
        public boolean hasAwarderKarma() {
            return this.awarderKarma_ != null;
        }
        
        public boolean hasCanCreateSubreddit() {
            return this.canCreateSubreddit_ != null;
        }
        
        public boolean hasCanEditName() {
            return this.canEditName_ != null;
        }
        
        public boolean hasCoins() {
            return this.coins_ != null;
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
        
        public boolean hasFeatures() {
            return this.features_ != null;
        }
        
        public boolean hasForcePasswordReset() {
            return this.forcePasswordReset_ != null;
        }
        
        public boolean hasGoldCreddits() {
            return this.goldCreddits_ != null;
        }
        
        public boolean hasGoldExpiration() {
            return this.goldExpiration_ != null;
        }
        
        public boolean hasHasAndroidSubscription() {
            return this.hasAndroidSubscription_ != null;
        }
        
        public boolean hasHasExternalAccount() {
            return this.hasExternalAccount_ != null;
        }
        
        public boolean hasHasGoldSubscription() {
            return this.hasGoldSubscription_ != null;
        }
        
        public boolean hasHasIosSubscription() {
            return this.hasIosSubscription_ != null;
        }
        
        public boolean hasHasMail() {
            return this.hasMail_ != null;
        }
        
        public boolean hasHasModMail() {
            return this.hasModMail_ != null;
        }
        
        public boolean hasHasPaypalSubscription() {
            return this.hasPaypalSubscription_ != null;
        }
        
        public boolean hasHasStripeSubscription() {
            return this.hasStripeSubscription_ != null;
        }
        
        public boolean hasHasSubscribed() {
            return this.hasSubscribed_ != null;
        }
        
        public boolean hasHasSubscribedToPremium() {
            return this.hasSubscribedToPremium_ != null;
        }
        
        public boolean hasHasVerifiedEmail() {
            return this.hasVerifiedEmail_ != null;
        }
        
        public boolean hasHasVisitedNewProfile() {
            return this.hasVisitedNewProfile_ != null;
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
        
        public boolean hasInBeta() {
            return this.inBeta_ != null;
        }
        
        public boolean hasInChat() {
            return this.inChat_ != null;
        }
        
        public boolean hasInRedesignBeta() {
            return this.inRedesignBeta_ != null;
        }
        
        public boolean hasInboxCount() {
            return this.inboxCount_ != null;
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
        
        public boolean hasIsSponsor() {
            return this.isSponsor_ != null;
        }
        
        public boolean hasIsSuspended() {
            return this.isSuspended_ != null;
        }
        
        public boolean hasLinkKarma() {
            return this.linkKarma_ != null;
        }
        
        public boolean hasModhash() {
            return this.modhash_ != null;
        }
        
        public boolean hasName() {
            return this.name_ != null;
        }
        
        public boolean hasNewModmailExists() {
            return this.newModmailExists_ != null;
        }
        
        public boolean hasNumFriends() {
            return this.numFriends_ != null;
        }
        
        public boolean hasOver18() {
            return this.over18_ != null;
        }
        
        public boolean hasPasswordSet() {
            return this.passwordSet_ != null;
        }
        
        public boolean hasPrefAutoplay() {
            return this.prefAutoplay_ != null;
        }
        
        public boolean hasPrefClickgadget() {
            return this.prefClickgadget_ != null;
        }
        
        public boolean hasPrefGeopopular() {
            return this.prefGeopopular_ != null;
        }
        
        public boolean hasPrefNightmode() {
            return this.prefNightmode_ != null;
        }
        
        public boolean hasPrefNoProfanity() {
            return this.prefNoProfanity_ != null;
        }
        
        public boolean hasPrefShowPresence() {
            return this.prefShowPresence_ != null;
        }
        
        public boolean hasPrefShowSnoovatar() {
            return this.prefShowSnoovatar_ != null;
        }
        
        public boolean hasPrefShowTrending() {
            return this.prefShowTrending_ != null;
        }
        
        public boolean hasPrefShowTwitter() {
            return this.prefShowTwitter_ != null;
        }
        
        public boolean hasPrefTopKarmaSubreddits() {
            return this.prefTopKarmaSubreddits_ != null;
        }
        
        public boolean hasPrefVideoAutoplay() {
            return this.prefVideoAutoplay_ != null;
        }
        
        public boolean hasSnoovatarImg() {
            return this.snoovatarImg_ != null;
        }
        
        public boolean hasSubreddit() {
            return this.subreddit_ != null;
        }
        
        public boolean hasSuspensionExpirationUtc() {
            return this.suspensionExpirationUtc_ != null;
        }
        
        public boolean hasTotalKarma() {
            return this.totalKarma_ != null;
        }
        
        public boolean hasVerified() {
            return this.verified_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<UserAboutData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)UserAboutData.access$36500());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UserAboutResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UserAboutResponse.access$55900());
        }
    }
}
