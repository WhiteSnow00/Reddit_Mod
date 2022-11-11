// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.common;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.x1;
import com.google.protobuf.l0;
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
import al0.b;
import al0.f0;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal$j;
import com.google.protobuf.StringValue;
import com.google.protobuf.BoolValue;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class CommonMsg$SubredditObject extends GeneratedMessageLite<CommonMsg$SubredditObject, a> implements d1
{
    public static final int ACCEPT_FOLLOWERS_FIELD_NUMBER = 36;
    public static final int BANNER_IMG_FIELD_NUMBER = 3;
    public static final int BANNER_SIZE_FIELD_NUMBER = 34;
    public static final int COINS_FIELD_NUMBER = 14;
    public static final int COMMUNITY_ICON_FIELD_NUMBER = 7;
    private static final CommonMsg$SubredditObject DEFAULT_INSTANCE;
    public static final int DEFAULT_SET_FIELD_NUMBER = 1;
    public static final int DESCRIPTION_FIELD_NUMBER = 20;
    public static final int DISABLE_CONTRIBUTOR_REQUESTS_FIELD_NUMBER = 39;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 11;
    public static final int DISPLAY_NAME_PREFIXED_FIELD_NUMBER = 28;
    public static final int FREE_FORM_REPORTS_FIELD_NUMBER = 6;
    public static final int HEADER_IMG_FIELD_NUMBER = 12;
    public static final int HEADER_SIZE_FIELD_NUMBER = 22;
    public static final int ICON_COLOR_FIELD_NUMBER = 9;
    public static final int ICON_IMG_FIELD_NUMBER = 19;
    public static final int ICON_SIZE_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 43;
    public static final int IS_DEFAULT_BANNER_FIELD_NUMBER = 31;
    public static final int IS_DEFAULT_ICON_FIELD_NUMBER = 26;
    public static final int KEY_COLOR_FIELD_NUMBER = 29;
    public static final int LINK_FLAIR_ENABLED_FIELD_NUMBER = 38;
    public static final int LINK_FLAIR_POSITION_FIELD_NUMBER = 27;
    public static final int NAME_FIELD_NUMBER = 30;
    public static final int OVER_18_FIELD_NUMBER = 16;
    private static volatile n1<CommonMsg$SubredditObject> PARSER;
    public static final int PREVIOUS_NAMES_FIELD_NUMBER = 15;
    public static final int PRIMARY_COLOR_FIELD_NUMBER = 18;
    public static final int PUBLIC_DESCRIPTION_FIELD_NUMBER = 37;
    public static final int PUBLIC_DESCRIPTION_HTML_FIELD_NUMBER = 42;
    public static final int QUARANTINE_FIELD_NUMBER = 33;
    public static final int RESTRICT_COMMENTING_FIELD_NUMBER = 23;
    public static final int RESTRICT_POSTING_FIELD_NUMBER = 4;
    public static final int SHOW_MEDIA_FIELD_NUMBER = 8;
    public static final int SUBMIT_LINK_LABEL_FIELD_NUMBER = 21;
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
    private StringValue bannerImg_;
    private Internal$j<Int32Value> bannerSize_;
    private Int64Value coins_;
    private StringValue communityIcon_;
    private BoolValue defaultSet_;
    private StringValue description_;
    private BoolValue disableContributorRequests_;
    private StringValue displayNamePrefixed_;
    private StringValue displayName_;
    private BoolValue freeFormReports_;
    private StringValue headerImg_;
    private StringValue headerSize_;
    private StringValue iconColor_;
    private StringValue iconImg_;
    private Internal$j<Int32Value> iconSize_;
    private StringValue id_;
    private BoolValue isDefaultBanner_;
    private BoolValue isDefaultIcon_;
    private StringValue keyColor_;
    private BoolValue linkFlairEnabled_;
    private StringValue linkFlairPosition_;
    private StringValue name_;
    private BoolValue over18_;
    private Internal$j<StringValue> previousNames_;
    private StringValue primaryColor_;
    private StringValue publicDescriptionHtml_;
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
    private StringValue userIsMuted_;
    private BoolValue userIsSubscriber_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)CommonMsg$SubredditObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new CommonMsg$SubredditObject()));
    }
    
    private CommonMsg$SubredditObject() {
        this.previousNames_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.iconSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
        this.bannerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ CommonMsg$SubredditObject access$36800() {
        return CommonMsg$SubredditObject.DEFAULT_INSTANCE;
    }
    
    private void addAllBannerSize(final Iterable<? extends Int32Value> iterable) {
        this.ensureBannerSizeIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.bannerSize_);
    }
    
    private void addAllIconSize(final Iterable<? extends Int32Value> iterable) {
        this.ensureIconSizeIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.iconSize_);
    }
    
    private void addAllPreviousNames(final Iterable<? extends StringValue> iterable) {
        this.ensurePreviousNamesIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.previousNames_);
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
    
    private void clearBannerImg() {
        this.bannerImg_ = null;
    }
    
    private void clearBannerSize() {
        this.bannerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearCoins() {
        this.coins_ = null;
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
    
    private void clearId() {
        this.id_ = null;
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
    
    private void clearPublicDescriptionHtml() {
        this.publicDescriptionHtml_ = null;
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
    
    private void ensureBannerSizeIsMutable() {
        final Internal$j<Int32Value> bannerSize_ = this.bannerSize_;
        if (!bannerSize_.E0()) {
            this.bannerSize_ = (Internal$j<Int32Value>)GeneratedMessageLite.mutableCopy((Internal$j)bannerSize_);
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
    
    public static CommonMsg$SubredditObject getDefaultInstance() {
        return CommonMsg$SubredditObject.DEFAULT_INSTANCE;
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
    
    private void mergeBannerImg(final StringValue bannerImg_) {
        bannerImg_.getClass();
        final StringValue bannerImg_2 = this.bannerImg_;
        if (bannerImg_2 != null && bannerImg_2 != StringValue.getDefaultInstance()) {
            this.bannerImg_ = (StringValue)f0.e(this.bannerImg_, bannerImg_);
        }
        else {
            this.bannerImg_ = bannerImg_;
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
    
    private void mergeCommunityIcon(final StringValue communityIcon_) {
        communityIcon_.getClass();
        final StringValue communityIcon_2 = this.communityIcon_;
        if (communityIcon_2 != null && communityIcon_2 != StringValue.getDefaultInstance()) {
            this.communityIcon_ = (StringValue)f0.e(this.communityIcon_, communityIcon_);
        }
        else {
            this.communityIcon_ = communityIcon_;
        }
    }
    
    private void mergeDefaultSet(final BoolValue defaultSet_) {
        defaultSet_.getClass();
        final BoolValue defaultSet_2 = this.defaultSet_;
        if (defaultSet_2 != null && defaultSet_2 != BoolValue.getDefaultInstance()) {
            this.defaultSet_ = (BoolValue)android.support.v4.media.a.f(this.defaultSet_, defaultSet_);
        }
        else {
            this.defaultSet_ = defaultSet_;
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
    
    private void mergeDisableContributorRequests(final BoolValue disableContributorRequests_) {
        disableContributorRequests_.getClass();
        final BoolValue disableContributorRequests_2 = this.disableContributorRequests_;
        if (disableContributorRequests_2 != null && disableContributorRequests_2 != BoolValue.getDefaultInstance()) {
            this.disableContributorRequests_ = (BoolValue)android.support.v4.media.a.f(this.disableContributorRequests_, disableContributorRequests_);
        }
        else {
            this.disableContributorRequests_ = disableContributorRequests_;
        }
    }
    
    private void mergeDisplayName(final StringValue displayName_) {
        displayName_.getClass();
        final StringValue displayName_2 = this.displayName_;
        if (displayName_2 != null && displayName_2 != StringValue.getDefaultInstance()) {
            this.displayName_ = (StringValue)f0.e(this.displayName_, displayName_);
        }
        else {
            this.displayName_ = displayName_;
        }
    }
    
    private void mergeDisplayNamePrefixed(final StringValue displayNamePrefixed_) {
        displayNamePrefixed_.getClass();
        final StringValue displayNamePrefixed_2 = this.displayNamePrefixed_;
        if (displayNamePrefixed_2 != null && displayNamePrefixed_2 != StringValue.getDefaultInstance()) {
            this.displayNamePrefixed_ = (StringValue)f0.e(this.displayNamePrefixed_, displayNamePrefixed_);
        }
        else {
            this.displayNamePrefixed_ = displayNamePrefixed_;
        }
    }
    
    private void mergeFreeFormReports(final BoolValue freeFormReports_) {
        freeFormReports_.getClass();
        final BoolValue freeFormReports_2 = this.freeFormReports_;
        if (freeFormReports_2 != null && freeFormReports_2 != BoolValue.getDefaultInstance()) {
            this.freeFormReports_ = (BoolValue)android.support.v4.media.a.f(this.freeFormReports_, freeFormReports_);
        }
        else {
            this.freeFormReports_ = freeFormReports_;
        }
    }
    
    private void mergeHeaderImg(final StringValue headerImg_) {
        headerImg_.getClass();
        final StringValue headerImg_2 = this.headerImg_;
        if (headerImg_2 != null && headerImg_2 != StringValue.getDefaultInstance()) {
            this.headerImg_ = (StringValue)f0.e(this.headerImg_, headerImg_);
        }
        else {
            this.headerImg_ = headerImg_;
        }
    }
    
    private void mergeHeaderSize(final StringValue headerSize_) {
        headerSize_.getClass();
        final StringValue headerSize_2 = this.headerSize_;
        if (headerSize_2 != null && headerSize_2 != StringValue.getDefaultInstance()) {
            this.headerSize_ = (StringValue)f0.e(this.headerSize_, headerSize_);
        }
        else {
            this.headerSize_ = headerSize_;
        }
    }
    
    private void mergeIconColor(final StringValue iconColor_) {
        iconColor_.getClass();
        final StringValue iconColor_2 = this.iconColor_;
        if (iconColor_2 != null && iconColor_2 != StringValue.getDefaultInstance()) {
            this.iconColor_ = (StringValue)f0.e(this.iconColor_, iconColor_);
        }
        else {
            this.iconColor_ = iconColor_;
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
    
    private void mergeIsDefaultBanner(final BoolValue isDefaultBanner_) {
        isDefaultBanner_.getClass();
        final BoolValue isDefaultBanner_2 = this.isDefaultBanner_;
        if (isDefaultBanner_2 != null && isDefaultBanner_2 != BoolValue.getDefaultInstance()) {
            this.isDefaultBanner_ = (BoolValue)android.support.v4.media.a.f(this.isDefaultBanner_, isDefaultBanner_);
        }
        else {
            this.isDefaultBanner_ = isDefaultBanner_;
        }
    }
    
    private void mergeIsDefaultIcon(final BoolValue isDefaultIcon_) {
        isDefaultIcon_.getClass();
        final BoolValue isDefaultIcon_2 = this.isDefaultIcon_;
        if (isDefaultIcon_2 != null && isDefaultIcon_2 != BoolValue.getDefaultInstance()) {
            this.isDefaultIcon_ = (BoolValue)android.support.v4.media.a.f(this.isDefaultIcon_, isDefaultIcon_);
        }
        else {
            this.isDefaultIcon_ = isDefaultIcon_;
        }
    }
    
    private void mergeKeyColor(final StringValue keyColor_) {
        keyColor_.getClass();
        final StringValue keyColor_2 = this.keyColor_;
        if (keyColor_2 != null && keyColor_2 != StringValue.getDefaultInstance()) {
            this.keyColor_ = (StringValue)f0.e(this.keyColor_, keyColor_);
        }
        else {
            this.keyColor_ = keyColor_;
        }
    }
    
    private void mergeLinkFlairEnabled(final BoolValue linkFlairEnabled_) {
        linkFlairEnabled_.getClass();
        final BoolValue linkFlairEnabled_2 = this.linkFlairEnabled_;
        if (linkFlairEnabled_2 != null && linkFlairEnabled_2 != BoolValue.getDefaultInstance()) {
            this.linkFlairEnabled_ = (BoolValue)android.support.v4.media.a.f(this.linkFlairEnabled_, linkFlairEnabled_);
        }
        else {
            this.linkFlairEnabled_ = linkFlairEnabled_;
        }
    }
    
    private void mergeLinkFlairPosition(final StringValue linkFlairPosition_) {
        linkFlairPosition_.getClass();
        final StringValue linkFlairPosition_2 = this.linkFlairPosition_;
        if (linkFlairPosition_2 != null && linkFlairPosition_2 != StringValue.getDefaultInstance()) {
            this.linkFlairPosition_ = (StringValue)f0.e(this.linkFlairPosition_, linkFlairPosition_);
        }
        else {
            this.linkFlairPosition_ = linkFlairPosition_;
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
    
    private void mergePrimaryColor(final StringValue primaryColor_) {
        primaryColor_.getClass();
        final StringValue primaryColor_2 = this.primaryColor_;
        if (primaryColor_2 != null && primaryColor_2 != StringValue.getDefaultInstance()) {
            this.primaryColor_ = (StringValue)f0.e(this.primaryColor_, primaryColor_);
        }
        else {
            this.primaryColor_ = primaryColor_;
        }
    }
    
    private void mergePublicDescription(final StringValue publicDescription_) {
        publicDescription_.getClass();
        final StringValue publicDescription_2 = this.publicDescription_;
        if (publicDescription_2 != null && publicDescription_2 != StringValue.getDefaultInstance()) {
            this.publicDescription_ = (StringValue)f0.e(this.publicDescription_, publicDescription_);
        }
        else {
            this.publicDescription_ = publicDescription_;
        }
    }
    
    private void mergePublicDescriptionHtml(final StringValue publicDescriptionHtml_) {
        publicDescriptionHtml_.getClass();
        final StringValue publicDescriptionHtml_2 = this.publicDescriptionHtml_;
        if (publicDescriptionHtml_2 != null && publicDescriptionHtml_2 != StringValue.getDefaultInstance()) {
            this.publicDescriptionHtml_ = (StringValue)f0.e(this.publicDescriptionHtml_, publicDescriptionHtml_);
        }
        else {
            this.publicDescriptionHtml_ = publicDescriptionHtml_;
        }
    }
    
    private void mergeQuarantine(final BoolValue quarantine_) {
        quarantine_.getClass();
        final BoolValue quarantine_2 = this.quarantine_;
        if (quarantine_2 != null && quarantine_2 != BoolValue.getDefaultInstance()) {
            this.quarantine_ = (BoolValue)android.support.v4.media.a.f(this.quarantine_, quarantine_);
        }
        else {
            this.quarantine_ = quarantine_;
        }
    }
    
    private void mergeRestrictCommenting(final BoolValue restrictCommenting_) {
        restrictCommenting_.getClass();
        final BoolValue restrictCommenting_2 = this.restrictCommenting_;
        if (restrictCommenting_2 != null && restrictCommenting_2 != BoolValue.getDefaultInstance()) {
            this.restrictCommenting_ = (BoolValue)android.support.v4.media.a.f(this.restrictCommenting_, restrictCommenting_);
        }
        else {
            this.restrictCommenting_ = restrictCommenting_;
        }
    }
    
    private void mergeRestrictPosting(final BoolValue restrictPosting_) {
        restrictPosting_.getClass();
        final BoolValue restrictPosting_2 = this.restrictPosting_;
        if (restrictPosting_2 != null && restrictPosting_2 != BoolValue.getDefaultInstance()) {
            this.restrictPosting_ = (BoolValue)android.support.v4.media.a.f(this.restrictPosting_, restrictPosting_);
        }
        else {
            this.restrictPosting_ = restrictPosting_;
        }
    }
    
    private void mergeShowMedia(final BoolValue showMedia_) {
        showMedia_.getClass();
        final BoolValue showMedia_2 = this.showMedia_;
        if (showMedia_2 != null && showMedia_2 != BoolValue.getDefaultInstance()) {
            this.showMedia_ = (BoolValue)android.support.v4.media.a.f(this.showMedia_, showMedia_);
        }
        else {
            this.showMedia_ = showMedia_;
        }
    }
    
    private void mergeSubmitLinkLabel(final StringValue submitLinkLabel_) {
        submitLinkLabel_.getClass();
        final StringValue submitLinkLabel_2 = this.submitLinkLabel_;
        if (submitLinkLabel_2 != null && submitLinkLabel_2 != StringValue.getDefaultInstance()) {
            this.submitLinkLabel_ = (StringValue)f0.e(this.submitLinkLabel_, submitLinkLabel_);
        }
        else {
            this.submitLinkLabel_ = submitLinkLabel_;
        }
    }
    
    private void mergeSubmitTextLabel(final StringValue submitTextLabel_) {
        submitTextLabel_.getClass();
        final StringValue submitTextLabel_2 = this.submitTextLabel_;
        if (submitTextLabel_2 != null && submitTextLabel_2 != StringValue.getDefaultInstance()) {
            this.submitTextLabel_ = (StringValue)f0.e(this.submitTextLabel_, submitTextLabel_);
        }
        else {
            this.submitTextLabel_ = submitTextLabel_;
        }
    }
    
    private void mergeSubredditType(final StringValue subredditType_) {
        subredditType_.getClass();
        final StringValue subredditType_2 = this.subredditType_;
        if (subredditType_2 != null && subredditType_2 != StringValue.getDefaultInstance()) {
            this.subredditType_ = (StringValue)f0.e(this.subredditType_, subredditType_);
        }
        else {
            this.subredditType_ = subredditType_;
        }
    }
    
    private void mergeSubscribers(final Int64Value subscribers_) {
        subscribers_.getClass();
        final Int64Value subscribers_2 = this.subscribers_;
        if (subscribers_2 != null && subscribers_2 != Int64Value.getDefaultInstance()) {
            this.subscribers_ = (Int64Value)b.g(this.subscribers_, subscribers_);
        }
        else {
            this.subscribers_ = subscribers_;
        }
    }
    
    private void mergeTitle(final StringValue title_) {
        title_.getClass();
        final StringValue title_2 = this.title_;
        if (title_2 != null && title_2 != StringValue.getDefaultInstance()) {
            this.title_ = (StringValue)f0.e(this.title_, title_);
        }
        else {
            this.title_ = title_;
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
    
    private void mergeUserIsBanned(final BoolValue userIsBanned_) {
        userIsBanned_.getClass();
        final BoolValue userIsBanned_2 = this.userIsBanned_;
        if (userIsBanned_2 != null && userIsBanned_2 != BoolValue.getDefaultInstance()) {
            this.userIsBanned_ = (BoolValue)android.support.v4.media.a.f(this.userIsBanned_, userIsBanned_);
        }
        else {
            this.userIsBanned_ = userIsBanned_;
        }
    }
    
    private void mergeUserIsContributor(final BoolValue userIsContributor_) {
        userIsContributor_.getClass();
        final BoolValue userIsContributor_2 = this.userIsContributor_;
        if (userIsContributor_2 != null && userIsContributor_2 != BoolValue.getDefaultInstance()) {
            this.userIsContributor_ = (BoolValue)android.support.v4.media.a.f(this.userIsContributor_, userIsContributor_);
        }
        else {
            this.userIsContributor_ = userIsContributor_;
        }
    }
    
    private void mergeUserIsModerator(final BoolValue userIsModerator_) {
        userIsModerator_.getClass();
        final BoolValue userIsModerator_2 = this.userIsModerator_;
        if (userIsModerator_2 != null && userIsModerator_2 != BoolValue.getDefaultInstance()) {
            this.userIsModerator_ = (BoolValue)android.support.v4.media.a.f(this.userIsModerator_, userIsModerator_);
        }
        else {
            this.userIsModerator_ = userIsModerator_;
        }
    }
    
    private void mergeUserIsMuted(final StringValue userIsMuted_) {
        userIsMuted_.getClass();
        final StringValue userIsMuted_2 = this.userIsMuted_;
        if (userIsMuted_2 != null && userIsMuted_2 != StringValue.getDefaultInstance()) {
            this.userIsMuted_ = (StringValue)f0.e(this.userIsMuted_, userIsMuted_);
        }
        else {
            this.userIsMuted_ = userIsMuted_;
        }
    }
    
    private void mergeUserIsSubscriber(final BoolValue userIsSubscriber_) {
        userIsSubscriber_.getClass();
        final BoolValue userIsSubscriber_2 = this.userIsSubscriber_;
        if (userIsSubscriber_2 != null && userIsSubscriber_2 != BoolValue.getDefaultInstance()) {
            this.userIsSubscriber_ = (BoolValue)android.support.v4.media.a.f(this.userIsSubscriber_, userIsSubscriber_);
        }
        else {
            this.userIsSubscriber_ = userIsSubscriber_;
        }
    }
    
    public static a newBuilder() {
        return (a)CommonMsg$SubredditObject.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final CommonMsg$SubredditObject commonMsg$SubredditObject) {
        return (a)CommonMsg$SubredditObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commonMsg$SubredditObject);
    }
    
    public static CommonMsg$SubredditObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$SubredditObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, byteString);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final l l) throws IOException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, l);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final l l, final d0 d0) throws IOException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, l, d0);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, array);
    }
    
    public static CommonMsg$SubredditObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$SubredditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<CommonMsg$SubredditObject> parser() {
        return (n1<CommonMsg$SubredditObject>)CommonMsg$SubredditObject.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeBannerSize(final int n) {
        this.ensureBannerSizeIsMutable();
        this.bannerSize_.remove(n);
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
    
    private void setBannerImg(final StringValue bannerImg_) {
        bannerImg_.getClass();
        this.bannerImg_ = bannerImg_;
    }
    
    private void setBannerSize(final int n, final Int32Value int32Value) {
        int32Value.getClass();
        this.ensureBannerSizeIsMutable();
        ((List<Int32Value>)this.bannerSize_).set(n, int32Value);
    }
    
    private void setCoins(final Int64Value coins_) {
        coins_.getClass();
        this.coins_ = coins_;
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
    
    private void setHeaderSize(final StringValue headerSize_) {
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
    
    private void setId(final StringValue id_) {
        id_.getClass();
        this.id_ = id_;
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
    
    private void setPublicDescriptionHtml(final StringValue publicDescriptionHtml_) {
        publicDescriptionHtml_.getClass();
        this.publicDescriptionHtml_ = publicDescriptionHtml_;
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
    
    private void setUserIsMuted(final StringValue userIsMuted_) {
        userIsMuted_.getClass();
        this.userIsMuted_ = userIsMuted_;
    }
    
    private void setUserIsSubscriber(final BoolValue userIsSubscriber_) {
        userIsSubscriber_.getClass();
        this.userIsSubscriber_ = userIsSubscriber_;
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
                final n1<CommonMsg$SubredditObject> parser;
                if ((parser = CommonMsg$SubredditObject.PARSER) == null) {
                    synchronized (CommonMsg$SubredditObject.class) {
                        if (CommonMsg$SubredditObject.PARSER == null) {
                            CommonMsg$SubredditObject.PARSER = (n1<CommonMsg$SubredditObject>)new GeneratedMessageLite$c((GeneratedMessageLite)CommonMsg$SubredditObject.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return CommonMsg$SubredditObject.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)CommonMsg$SubredditObject.DEFAULT_INSTANCE, "\u0000+\u0000\u0000\u0001++\u0000\u0003\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\u001b\u0010\t\u0011\u001b\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t \t!\t\"\u001b#\t$\t%\t&\t'\t(\t)\t*\t+\t", new Object[] { "defaultSet_", "userIsContributor_", "bannerImg_", "restrictPosting_", "userIsBanned_", "freeFormReports_", "communityIcon_", "showMedia_", "iconColor_", "userIsMuted_", "displayName_", "headerImg_", "title_", "coins_", "previousNames_", StringValue.class, "over18_", "iconSize_", Int32Value.class, "primaryColor_", "iconImg_", "description_", "submitLinkLabel_", "headerSize_", "restrictCommenting_", "subscribers_", "submitTextLabel_", "isDefaultIcon_", "linkFlairPosition_", "displayNamePrefixed_", "keyColor_", "name_", "isDefaultBanner_", "url_", "quarantine_", "bannerSize_", Int32Value.class, "userIsModerator_", "acceptFollowers_", "publicDescription_", "linkFlairEnabled_", "disableContributorRequests_", "subredditType_", "userIsSubscriber_", "publicDescriptionHtml_", "id_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new CommonMsg$SubredditObject();
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
    
    public Int64Value getCoins() {
        Int64Value int64Value;
        if ((int64Value = this.coins_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
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
    
    public StringValue getHeaderSize() {
        StringValue stringValue;
        if ((stringValue = this.headerSize_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
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
    
    public StringValue getId() {
        StringValue stringValue;
        if ((stringValue = this.id_) == null) {
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
    
    public StringValue getPublicDescriptionHtml() {
        StringValue stringValue;
        if ((stringValue = this.publicDescriptionHtml_) == null) {
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
    
    public StringValue getUserIsMuted() {
        StringValue stringValue;
        if ((stringValue = this.userIsMuted_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
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
    
    public boolean hasCoins() {
        return this.coins_ != null;
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
    
    public boolean hasId() {
        return this.id_ != null;
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
    
    public boolean hasPublicDescriptionHtml() {
        return this.publicDescriptionHtml_ != null;
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
    
    public static final class a extends GeneratedMessageLite$b<CommonMsg$SubredditObject, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)CommonMsg$SubredditObject.access$36800());
        }
    }
}
