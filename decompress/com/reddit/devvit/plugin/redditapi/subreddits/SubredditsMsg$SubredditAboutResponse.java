// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.x1;
import p1.h;
import u10.o;
import java.util.List;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal$j;
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

public final class SubredditsMsg$SubredditAboutResponse extends GeneratedMessageLite<SubredditsMsg$SubredditAboutResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SubredditsMsg$SubredditAboutResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<SubredditsMsg$SubredditAboutResponse> PARSER;
    private AboutData data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditAboutResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditAboutResponse()));
    }
    
    private SubredditsMsg$SubredditAboutResponse() {
    }
    
    public static SubredditsMsg$SubredditAboutResponse access$111400() {
        return SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$111500(final SubredditsMsg$SubredditAboutResponse subredditsMsg$SubredditAboutResponse, final StringValue kind) {
        subredditsMsg$SubredditAboutResponse.setKind(kind);
    }
    
    public static void access$111600(final SubredditsMsg$SubredditAboutResponse subredditsMsg$SubredditAboutResponse, final StringValue stringValue) {
        subredditsMsg$SubredditAboutResponse.mergeKind(stringValue);
    }
    
    public static void access$111700(final SubredditsMsg$SubredditAboutResponse subredditsMsg$SubredditAboutResponse) {
        subredditsMsg$SubredditAboutResponse.clearKind();
    }
    
    public static void access$111800(final SubredditsMsg$SubredditAboutResponse subredditsMsg$SubredditAboutResponse, final AboutData data) {
        subredditsMsg$SubredditAboutResponse.setData(data);
    }
    
    public static void access$111900(final SubredditsMsg$SubredditAboutResponse subredditsMsg$SubredditAboutResponse, final AboutData aboutData) {
        subredditsMsg$SubredditAboutResponse.mergeData(aboutData);
    }
    
    public static void access$112000(final SubredditsMsg$SubredditAboutResponse subredditsMsg$SubredditAboutResponse) {
        subredditsMsg$SubredditAboutResponse.clearData();
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static SubredditsMsg$SubredditAboutResponse getDefaultInstance() {
        return SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final AboutData data_) {
        data_.getClass();
        final AboutData data_2 = this.data_;
        if (data_2 != null && data_2 != AboutData.getDefaultInstance()) {
            final AboutData.a builder = AboutData.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (AboutData)builder.c();
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
        return (a)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditAboutResponse subredditsMsg$SubredditAboutResponse) {
        return (a)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditAboutResponse);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditAboutResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditAboutResponse> parser() {
        return (n1<SubredditsMsg$SubredditAboutResponse>)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final AboutData data_) {
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
                final n1<SubredditsMsg$SubredditAboutResponse> parser;
                if ((parser = SubredditsMsg$SubredditAboutResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditAboutResponse.class) {
                        if (SubredditsMsg$SubredditAboutResponse.PARSER == null) {
                            SubredditsMsg$SubredditAboutResponse.PARSER = (n1<SubredditsMsg$SubredditAboutResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditAboutResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditAboutResponse();
            }
        }
    }
    
    public AboutData getData() {
        AboutData aboutData;
        if ((aboutData = this.data_) == null) {
            aboutData = AboutData.getDefaultInstance();
        }
        return aboutData;
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
    
    public static final class AboutData extends GeneratedMessageLite<AboutData, a> implements d1
    {
        public static final int ACCEPT_FOLLOWERS_FIELD_NUMBER = 78;
        public static final int ACCOUNTS_ACTIVE_FIELD_NUMBER = 18;
        public static final int ACCOUNTS_ACTIVE_IS_FUZZED_FIELD_NUMBER = 70;
        public static final int ACTIVE_USER_COUNT_FIELD_NUMBER = 15;
        public static final int ADVERTISER_CATEGORY_FIELD_NUMBER = 27;
        public static final int ALLOWED_MEDIA_IN_COMMENTS_FIELD_NUMBER = 55;
        public static final int ALLOW_CHAT_POST_CREATION_FIELD_NUMBER = 76;
        public static final int ALLOW_DISCOVERY_FIELD_NUMBER = 77;
        public static final int ALLOW_GALLERIES_FIELD_NUMBER = 12;
        public static final int ALLOW_IMAGES_FIELD_NUMBER = 98;
        public static final int ALLOW_POLLS_FIELD_NUMBER = 59;
        public static final int ALLOW_PREDICTIONS_FIELD_NUMBER = 30;
        public static final int ALLOW_PREDICTIONS_TOURNAMENT_FIELD_NUMBER = 106;
        public static final int ALLOW_PREDICTION_CONTRIBUTORS_FIELD_NUMBER = 71;
        public static final int ALLOW_TALKS_FIELD_NUMBER = 41;
        public static final int ALLOW_VIDEOGIFS_FIELD_NUMBER = 56;
        public static final int ALLOW_VIDEOS_FIELD_NUMBER = 64;
        public static final int ALL_ORIGINAL_CONTENT_FIELD_NUMBER = 44;
        public static final int BANNER_BACKGROUND_COLOR_FIELD_NUMBER = 86;
        public static final int BANNER_BACKGROUND_IMAGE_FIELD_NUMBER = 34;
        public static final int BANNER_IMG_FIELD_NUMBER = 84;
        public static final int BANNER_SIZE_FIELD_NUMBER = 103;
        public static final int CAN_ASSIGN_LINK_FLAIR_FIELD_NUMBER = 68;
        public static final int CAN_ASSIGN_USER_FLAIR_FIELD_NUMBER = 49;
        public static final int COINS_FIELD_NUMBER = 61;
        public static final int COLLAPSE_DELETED_COMMENTS_FIELD_NUMBER = 60;
        public static final int COLLECTIONS_ENABLED_FIELD_NUMBER = 45;
        public static final int COMMENT_CONTRIBUTION_SETTINGS_FIELD_NUMBER = 40;
        public static final int COMMENT_SCORE_HIDE_MINS_FIELD_NUMBER = 29;
        public static final int COMMUNITY_ICON_FIELD_NUMBER = 33;
        public static final int COMMUNITY_REVIEWED_FIELD_NUMBER = 36;
        public static final int CREATED_FIELD_NUMBER = 50;
        public static final int CREATED_UTC_FIELD_NUMBER = 102;
        private static final AboutData DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 92;
        public static final int DESCRIPTION_HTML_FIELD_NUMBER = 38;
        public static final int DISABLE_CONTRIBUTOR_REQUESTS_FIELD_NUMBER = 81;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 9;
        public static final int DISPLAY_NAME_PREFIXED_FIELD_NUMBER = 17;
        public static final int EMOJIS_CUSTOM_SIZE_FIELD_NUMBER = 62;
        public static final int EMOJIS_ENABLED_FIELD_NUMBER = 26;
        public static final int EVENT_POSTS_ENABLED_FIELD_NUMBER = 48;
        public static final int FREE_FORM_REPORTS_FIELD_NUMBER = 5;
        public static final int HAS_MENU_WIDGET_FIELD_NUMBER = 69;
        public static final int HEADER_IMG_FIELD_NUMBER = 10;
        public static final int HEADER_SIZE_FIELD_NUMBER = 42;
        public static final int HEADER_TITLE_FIELD_NUMBER = 91;
        public static final int HIDE_ADS_FIELD_NUMBER = 24;
        public static final int ICON_IMG_FIELD_NUMBER = 16;
        public static final int ICON_SIZE_FIELD_NUMBER = 13;
        public static final int ID_FIELD_NUMBER = 88;
        public static final int IS_CHAT_POST_FEATURE_ENABLED_FIELD_NUMBER = 93;
        public static final int IS_CROSSPOSTABLE_SUBREDDIT_FIELD_NUMBER = 65;
        public static final int IS_ENROLLED_IN_NEW_MODMAIL_FIELD_NUMBER = 46;
        public static final int KEY_COLOR_FIELD_NUMBER = 47;
        public static final int LANG_FIELD_NUMBER = 99;
        public static final int LINK_FLAIR_ENABLED_FIELD_NUMBER = 80;
        public static final int LINK_FLAIR_POSITION_FIELD_NUMBER = 73;
        public static final int MOBILE_BANNER_IMAGE_FIELD_NUMBER = 104;
        public static final int NAME_FIELD_NUMBER = 22;
        public static final int NOTIFICATION_LEVEL_FIELD_NUMBER = 66;
        public static final int ORIGINAL_CONTENT_TAG_ENABLED_FIELD_NUMBER = 35;
        public static final int OVER18_FIELD_NUMBER = 90;
        private static volatile n1<AboutData> PARSER;
        public static final int PREDICTION_LEADERBOARD_ENTRY_TYPE_FIELD_NUMBER = 25;
        public static final int PRIMARY_COLOR_FIELD_NUMBER = 14;
        public static final int PUBLIC_DESCRIPTION_FIELD_NUMBER = 28;
        public static final int PUBLIC_DESCRIPTION_HTML_FIELD_NUMBER = 63;
        public static final int PUBLIC_TRAFFIC_FIELD_NUMBER = 19;
        public static final int QUARANTINE_FIELD_NUMBER = 23;
        public static final int RESTRICT_COMMENTING_FIELD_NUMBER = 96;
        public static final int RESTRICT_POSTING_FIELD_NUMBER = 3;
        public static final int SHOULD_ARCHIVE_POSTS_FIELD_NUMBER = 57;
        public static final int SHOULD_SHOW_MEDIA_IN_COMMENTS_SETTING_FIELD_NUMBER = 67;
        public static final int SHOW_MEDIA_FIELD_NUMBER = 87;
        public static final int SHOW_MEDIA_PREVIEW_FIELD_NUMBER = 52;
        public static final int SPOILERS_ENABLED_FIELD_NUMBER = 39;
        public static final int SUBMISSION_TYPE_FIELD_NUMBER = 53;
        public static final int SUBMIT_LINK_LABEL_FIELD_NUMBER = 94;
        public static final int SUBMIT_TEXT_FIELD_NUMBER = 37;
        public static final int SUBMIT_TEXT_HTML_FIELD_NUMBER = 2;
        public static final int SUBMIT_TEXT_LABEL_FIELD_NUMBER = 72;
        public static final int SUBREDDIT_TYPE_FIELD_NUMBER = 82;
        public static final int SUBSCRIBERS_FIELD_NUMBER = 20;
        public static final int SUGGESTED_COMMENT_SORT_FIELD_NUMBER = 83;
        public static final int TITLE_FIELD_NUMBER = 11;
        public static final int URL_FIELD_NUMBER = 101;
        public static final int USER_CAN_FLAIR_IN_SR_FIELD_NUMBER = 8;
        public static final int USER_FLAIR_BACKGROUND_COLOR_FIELD_NUMBER = 1;
        public static final int USER_FLAIR_CSS_CLASS_FIELD_NUMBER = 97;
        public static final int USER_FLAIR_ENABLED_IN_SR_FIELD_NUMBER = 75;
        public static final int USER_FLAIR_POSITION_FIELD_NUMBER = 43;
        public static final int USER_FLAIR_RICHTEXT_FIELD_NUMBER = 21;
        public static final int USER_FLAIR_TEMPLATE_ID_FIELD_NUMBER = 32;
        public static final int USER_FLAIR_TEXT_COLOR_FIELD_NUMBER = 95;
        public static final int USER_FLAIR_TEXT_FIELD_NUMBER = 85;
        public static final int USER_FLAIR_TYPE_FIELD_NUMBER = 58;
        public static final int USER_HAS_FAVORITED_FIELD_NUMBER = 31;
        public static final int USER_IS_BANNED_FIELD_NUMBER = 4;
        public static final int USER_IS_CONTRIBUTOR_FIELD_NUMBER = 105;
        public static final int USER_IS_MODERATOR_FIELD_NUMBER = 89;
        public static final int USER_IS_MUTED_FIELD_NUMBER = 7;
        public static final int USER_IS_SUBSCRIBER_FIELD_NUMBER = 54;
        public static final int USER_SR_FLAIR_ENABLED_FIELD_NUMBER = 74;
        public static final int USER_SR_THEME_ENABLED_FIELD_NUMBER = 79;
        public static final int WHITELIST_STATUS_FIELD_NUMBER = 100;
        public static final int WIKI_ENABLED_FIELD_NUMBER = 6;
        public static final int WLS_FIELD_NUMBER = 51;
        private BoolValue acceptFollowers_;
        private BoolValue accountsActiveIsFuzzed_;
        private Int64Value accountsActive_;
        private Int64Value activeUserCount_;
        private StringValue advertiserCategory_;
        private BoolValue allOriginalContent_;
        private BoolValue allowChatPostCreation_;
        private BoolValue allowDiscovery_;
        private BoolValue allowGalleries_;
        private BoolValue allowImages_;
        private BoolValue allowPolls_;
        private BoolValue allowPredictionContributors_;
        private BoolValue allowPredictionsTournament_;
        private BoolValue allowPredictions_;
        private BoolValue allowTalks_;
        private BoolValue allowVideogifs_;
        private BoolValue allowVideos_;
        private Internal$j<StringValue> allowedMediaInComments_;
        private StringValue bannerBackgroundColor_;
        private StringValue bannerBackgroundImage_;
        private StringValue bannerImg_;
        private Int64Value bannerSize_;
        private BoolValue canAssignLinkFlair_;
        private BoolValue canAssignUserFlair_;
        private Int64Value coins_;
        private BoolValue collapseDeletedComments_;
        private BoolValue collectionsEnabled_;
        private SubredditsMsg$CommentContributionSettings commentContributionSettings_;
        private Int32Value commentScoreHideMins_;
        private StringValue communityIcon_;
        private BoolValue communityReviewed_;
        private Int64Value createdUtc_;
        private Int64Value created_;
        private StringValue descriptionHtml_;
        private StringValue description_;
        private BoolValue disableContributorRequests_;
        private StringValue displayNamePrefixed_;
        private StringValue displayName_;
        private Int64Value emojisCustomSize_;
        private BoolValue emojisEnabled_;
        private BoolValue eventPostsEnabled_;
        private BoolValue freeFormReports_;
        private BoolValue hasMenuWidget_;
        private StringValue headerImg_;
        private Int64Value headerSize_;
        private StringValue headerTitle_;
        private BoolValue hideAds_;
        private StringValue iconImg_;
        private Int64Value iconSize_;
        private StringValue id_;
        private BoolValue isChatPostFeatureEnabled_;
        private BoolValue isCrosspostableSubreddit_;
        private BoolValue isEnrolledInNewModmail_;
        private StringValue keyColor_;
        private StringValue lang_;
        private BoolValue linkFlairEnabled_;
        private StringValue linkFlairPosition_;
        private StringValue mobileBannerImage_;
        private StringValue name_;
        private StringValue notificationLevel_;
        private BoolValue originalContentTagEnabled_;
        private BoolValue over18_;
        private StringValue predictionLeaderboardEntryType_;
        private StringValue primaryColor_;
        private StringValue publicDescriptionHtml_;
        private StringValue publicDescription_;
        private BoolValue publicTraffic_;
        private BoolValue quarantine_;
        private BoolValue restrictCommenting_;
        private BoolValue restrictPosting_;
        private BoolValue shouldArchivePosts_;
        private BoolValue shouldShowMediaInCommentsSetting_;
        private BoolValue showMediaPreview_;
        private BoolValue showMedia_;
        private BoolValue spoilersEnabled_;
        private StringValue submissionType_;
        private StringValue submitLinkLabel_;
        private StringValue submitTextHtml_;
        private StringValue submitTextLabel_;
        private StringValue submitText_;
        private StringValue subredditType_;
        private Int64Value subscribers_;
        private StringValue suggestedCommentSort_;
        private StringValue title_;
        private StringValue url_;
        private BoolValue userCanFlairInSr_;
        private StringValue userFlairBackgroundColor_;
        private StringValue userFlairCssClass_;
        private BoolValue userFlairEnabledInSr_;
        private StringValue userFlairPosition_;
        private Internal$j<UserFlairRichtext> userFlairRichtext_;
        private StringValue userFlairTemplateId_;
        private StringValue userFlairTextColor_;
        private StringValue userFlairText_;
        private StringValue userFlairType_;
        private BoolValue userHasFavorited_;
        private BoolValue userIsBanned_;
        private BoolValue userIsContributor_;
        private BoolValue userIsModerator_;
        private BoolValue userIsMuted_;
        private BoolValue userIsSubscriber_;
        private BoolValue userSrFlairEnabled_;
        private BoolValue userSrThemeEnabled_;
        private BoolValue whitelistStatus_;
        private BoolValue wikiEnabled_;
        private StringValue wls_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)AboutData.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new AboutData()));
        }
        
        private AboutData() {
            this.userFlairRichtext_ = (Internal$j<UserFlairRichtext>)GeneratedMessageLite.emptyProtobufList();
            this.allowedMediaInComments_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        }
        
        public static void access$100000(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeHasMenuWidget(boolValue);
        }
        
        public static void access$100100(final AboutData aboutData) {
            aboutData.clearHasMenuWidget();
        }
        
        public static void access$100200(final AboutData aboutData, final BoolValue accountsActiveIsFuzzed) {
            aboutData.setAccountsActiveIsFuzzed(accountsActiveIsFuzzed);
        }
        
        public static void access$100300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAccountsActiveIsFuzzed(boolValue);
        }
        
        public static void access$100400(final AboutData aboutData) {
            aboutData.clearAccountsActiveIsFuzzed();
        }
        
        public static void access$100500(final AboutData aboutData, final BoolValue allowPredictionContributors) {
            aboutData.setAllowPredictionContributors(allowPredictionContributors);
        }
        
        public static void access$100600(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowPredictionContributors(boolValue);
        }
        
        public static void access$100700(final AboutData aboutData) {
            aboutData.clearAllowPredictionContributors();
        }
        
        public static void access$100800(final AboutData aboutData, final StringValue submitTextLabel) {
            aboutData.setSubmitTextLabel(submitTextLabel);
        }
        
        public static void access$100900(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeSubmitTextLabel(stringValue);
        }
        
        public static void access$101000(final AboutData aboutData) {
            aboutData.clearSubmitTextLabel();
        }
        
        public static void access$101100(final AboutData aboutData, final StringValue linkFlairPosition) {
            aboutData.setLinkFlairPosition(linkFlairPosition);
        }
        
        public static void access$101200(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeLinkFlairPosition(stringValue);
        }
        
        public static void access$101300(final AboutData aboutData) {
            aboutData.clearLinkFlairPosition();
        }
        
        public static void access$101400(final AboutData aboutData, final BoolValue userSrFlairEnabled) {
            aboutData.setUserSrFlairEnabled(userSrFlairEnabled);
        }
        
        public static void access$101500(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserSrFlairEnabled(boolValue);
        }
        
        public static void access$101600(final AboutData aboutData) {
            aboutData.clearUserSrFlairEnabled();
        }
        
        public static void access$101700(final AboutData aboutData, final BoolValue userFlairEnabledInSr) {
            aboutData.setUserFlairEnabledInSr(userFlairEnabledInSr);
        }
        
        public static void access$101800(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserFlairEnabledInSr(boolValue);
        }
        
        public static void access$101900(final AboutData aboutData) {
            aboutData.clearUserFlairEnabledInSr();
        }
        
        public static void access$102000(final AboutData aboutData, final BoolValue allowChatPostCreation) {
            aboutData.setAllowChatPostCreation(allowChatPostCreation);
        }
        
        public static void access$102100(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowChatPostCreation(boolValue);
        }
        
        public static void access$102200(final AboutData aboutData) {
            aboutData.clearAllowChatPostCreation();
        }
        
        public static void access$102300(final AboutData aboutData, final BoolValue allowDiscovery) {
            aboutData.setAllowDiscovery(allowDiscovery);
        }
        
        public static void access$102400(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowDiscovery(boolValue);
        }
        
        public static void access$102500(final AboutData aboutData) {
            aboutData.clearAllowDiscovery();
        }
        
        public static void access$102600(final AboutData aboutData, final BoolValue acceptFollowers) {
            aboutData.setAcceptFollowers(acceptFollowers);
        }
        
        public static void access$102700(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAcceptFollowers(boolValue);
        }
        
        public static void access$102800(final AboutData aboutData) {
            aboutData.clearAcceptFollowers();
        }
        
        public static void access$102900(final AboutData aboutData, final BoolValue userSrThemeEnabled) {
            aboutData.setUserSrThemeEnabled(userSrThemeEnabled);
        }
        
        public static void access$103000(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserSrThemeEnabled(boolValue);
        }
        
        public static void access$103100(final AboutData aboutData) {
            aboutData.clearUserSrThemeEnabled();
        }
        
        public static void access$103200(final AboutData aboutData, final BoolValue linkFlairEnabled) {
            aboutData.setLinkFlairEnabled(linkFlairEnabled);
        }
        
        public static void access$103300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeLinkFlairEnabled(boolValue);
        }
        
        public static void access$103400(final AboutData aboutData) {
            aboutData.clearLinkFlairEnabled();
        }
        
        public static void access$103500(final AboutData aboutData, final BoolValue disableContributorRequests) {
            aboutData.setDisableContributorRequests(disableContributorRequests);
        }
        
        public static void access$103600(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeDisableContributorRequests(boolValue);
        }
        
        public static void access$103700(final AboutData aboutData) {
            aboutData.clearDisableContributorRequests();
        }
        
        public static void access$103800(final AboutData aboutData, final StringValue subredditType) {
            aboutData.setSubredditType(subredditType);
        }
        
        public static void access$103900(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeSubredditType(stringValue);
        }
        
        public static void access$104000(final AboutData aboutData) {
            aboutData.clearSubredditType();
        }
        
        public static void access$104100(final AboutData aboutData, final StringValue suggestedCommentSort) {
            aboutData.setSuggestedCommentSort(suggestedCommentSort);
        }
        
        public static void access$104200(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeSuggestedCommentSort(stringValue);
        }
        
        public static void access$104300(final AboutData aboutData) {
            aboutData.clearSuggestedCommentSort();
        }
        
        public static void access$104400(final AboutData aboutData, final StringValue bannerImg) {
            aboutData.setBannerImg(bannerImg);
        }
        
        public static void access$104500(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeBannerImg(stringValue);
        }
        
        public static void access$104600(final AboutData aboutData) {
            aboutData.clearBannerImg();
        }
        
        public static void access$104700(final AboutData aboutData, final StringValue userFlairText) {
            aboutData.setUserFlairText(userFlairText);
        }
        
        public static void access$104800(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUserFlairText(stringValue);
        }
        
        public static void access$104900(final AboutData aboutData) {
            aboutData.clearUserFlairText();
        }
        
        public static void access$105000(final AboutData aboutData, final StringValue bannerBackgroundColor) {
            aboutData.setBannerBackgroundColor(bannerBackgroundColor);
        }
        
        public static void access$105100(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeBannerBackgroundColor(stringValue);
        }
        
        public static void access$105200(final AboutData aboutData) {
            aboutData.clearBannerBackgroundColor();
        }
        
        public static void access$105300(final AboutData aboutData, final BoolValue showMedia) {
            aboutData.setShowMedia(showMedia);
        }
        
        public static void access$105400(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeShowMedia(boolValue);
        }
        
        public static void access$105500(final AboutData aboutData) {
            aboutData.clearShowMedia();
        }
        
        public static void access$105600(final AboutData aboutData, final StringValue id) {
            aboutData.setId(id);
        }
        
        public static void access$105700(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeId(stringValue);
        }
        
        public static void access$105800(final AboutData aboutData) {
            aboutData.clearId();
        }
        
        public static void access$105900(final AboutData aboutData, final BoolValue userIsModerator) {
            aboutData.setUserIsModerator(userIsModerator);
        }
        
        public static void access$106000(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserIsModerator(boolValue);
        }
        
        public static void access$106100(final AboutData aboutData) {
            aboutData.clearUserIsModerator();
        }
        
        public static void access$106200(final AboutData aboutData, final BoolValue over18) {
            aboutData.setOver18(over18);
        }
        
        public static void access$106300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeOver18(boolValue);
        }
        
        public static void access$106400(final AboutData aboutData) {
            aboutData.clearOver18();
        }
        
        public static void access$106500(final AboutData aboutData, final StringValue headerTitle) {
            aboutData.setHeaderTitle(headerTitle);
        }
        
        public static void access$106600(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeHeaderTitle(stringValue);
        }
        
        public static void access$106700(final AboutData aboutData) {
            aboutData.clearHeaderTitle();
        }
        
        public static void access$106800(final AboutData aboutData, final StringValue description) {
            aboutData.setDescription(description);
        }
        
        public static void access$106900(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeDescription(stringValue);
        }
        
        public static void access$107000(final AboutData aboutData) {
            aboutData.clearDescription();
        }
        
        public static void access$107100(final AboutData aboutData, final BoolValue isChatPostFeatureEnabled) {
            aboutData.setIsChatPostFeatureEnabled(isChatPostFeatureEnabled);
        }
        
        public static void access$107200(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeIsChatPostFeatureEnabled(boolValue);
        }
        
        public static void access$107300(final AboutData aboutData) {
            aboutData.clearIsChatPostFeatureEnabled();
        }
        
        public static void access$107400(final AboutData aboutData, final StringValue submitLinkLabel) {
            aboutData.setSubmitLinkLabel(submitLinkLabel);
        }
        
        public static void access$107500(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeSubmitLinkLabel(stringValue);
        }
        
        public static void access$107600(final AboutData aboutData) {
            aboutData.clearSubmitLinkLabel();
        }
        
        public static void access$107700(final AboutData aboutData, final StringValue userFlairTextColor) {
            aboutData.setUserFlairTextColor(userFlairTextColor);
        }
        
        public static void access$107800(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUserFlairTextColor(stringValue);
        }
        
        public static void access$107900(final AboutData aboutData) {
            aboutData.clearUserFlairTextColor();
        }
        
        public static void access$108000(final AboutData aboutData, final BoolValue restrictCommenting) {
            aboutData.setRestrictCommenting(restrictCommenting);
        }
        
        public static void access$108100(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeRestrictCommenting(boolValue);
        }
        
        public static void access$108200(final AboutData aboutData) {
            aboutData.clearRestrictCommenting();
        }
        
        public static void access$108300(final AboutData aboutData, final StringValue userFlairCssClass) {
            aboutData.setUserFlairCssClass(userFlairCssClass);
        }
        
        public static void access$108400(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUserFlairCssClass(stringValue);
        }
        
        public static void access$108500(final AboutData aboutData) {
            aboutData.clearUserFlairCssClass();
        }
        
        public static void access$108600(final AboutData aboutData, final BoolValue allowImages) {
            aboutData.setAllowImages(allowImages);
        }
        
        public static void access$108700(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowImages(boolValue);
        }
        
        public static void access$108800(final AboutData aboutData) {
            aboutData.clearAllowImages();
        }
        
        public static void access$108900(final AboutData aboutData, final StringValue lang) {
            aboutData.setLang(lang);
        }
        
        public static void access$109000(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeLang(stringValue);
        }
        
        public static void access$109100(final AboutData aboutData) {
            aboutData.clearLang();
        }
        
        public static void access$109200(final AboutData aboutData, final BoolValue whitelistStatus) {
            aboutData.setWhitelistStatus(whitelistStatus);
        }
        
        public static void access$109300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeWhitelistStatus(boolValue);
        }
        
        public static void access$109400(final AboutData aboutData) {
            aboutData.clearWhitelistStatus();
        }
        
        public static void access$109500(final AboutData aboutData, final StringValue url) {
            aboutData.setUrl(url);
        }
        
        public static void access$109600(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUrl(stringValue);
        }
        
        public static void access$109700(final AboutData aboutData) {
            aboutData.clearUrl();
        }
        
        public static void access$109800(final AboutData aboutData, final Int64Value createdUtc) {
            aboutData.setCreatedUtc(createdUtc);
        }
        
        public static void access$109900(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeCreatedUtc(int64Value);
        }
        
        public static void access$110000(final AboutData aboutData) {
            aboutData.clearCreatedUtc();
        }
        
        public static void access$110100(final AboutData aboutData, final Int64Value bannerSize) {
            aboutData.setBannerSize(bannerSize);
        }
        
        public static void access$110200(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeBannerSize(int64Value);
        }
        
        public static void access$110300(final AboutData aboutData) {
            aboutData.clearBannerSize();
        }
        
        public static void access$110400(final AboutData aboutData, final StringValue mobileBannerImage) {
            aboutData.setMobileBannerImage(mobileBannerImage);
        }
        
        public static void access$110500(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeMobileBannerImage(stringValue);
        }
        
        public static void access$110600(final AboutData aboutData) {
            aboutData.clearMobileBannerImage();
        }
        
        public static void access$110700(final AboutData aboutData, final BoolValue userIsContributor) {
            aboutData.setUserIsContributor(userIsContributor);
        }
        
        public static void access$110800(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserIsContributor(boolValue);
        }
        
        public static void access$110900(final AboutData aboutData) {
            aboutData.clearUserIsContributor();
        }
        
        public static void access$111000(final AboutData aboutData, final BoolValue allowPredictionsTournament) {
            aboutData.setAllowPredictionsTournament(allowPredictionsTournament);
        }
        
        public static void access$111100(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowPredictionsTournament(boolValue);
        }
        
        public static void access$111200(final AboutData aboutData) {
            aboutData.clearAllowPredictionsTournament();
        }
        
        public static AboutData access$78800() {
            return AboutData.DEFAULT_INSTANCE;
        }
        
        public static void access$78900(final AboutData aboutData, final StringValue userFlairBackgroundColor) {
            aboutData.setUserFlairBackgroundColor(userFlairBackgroundColor);
        }
        
        public static void access$79000(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUserFlairBackgroundColor(stringValue);
        }
        
        public static void access$79100(final AboutData aboutData) {
            aboutData.clearUserFlairBackgroundColor();
        }
        
        public static void access$79200(final AboutData aboutData, final StringValue submitTextHtml) {
            aboutData.setSubmitTextHtml(submitTextHtml);
        }
        
        public static void access$79300(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeSubmitTextHtml(stringValue);
        }
        
        public static void access$79400(final AboutData aboutData) {
            aboutData.clearSubmitTextHtml();
        }
        
        public static void access$79500(final AboutData aboutData, final BoolValue restrictPosting) {
            aboutData.setRestrictPosting(restrictPosting);
        }
        
        public static void access$79600(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeRestrictPosting(boolValue);
        }
        
        public static void access$79700(final AboutData aboutData) {
            aboutData.clearRestrictPosting();
        }
        
        public static void access$79800(final AboutData aboutData, final BoolValue userIsBanned) {
            aboutData.setUserIsBanned(userIsBanned);
        }
        
        public static void access$79900(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserIsBanned(boolValue);
        }
        
        public static void access$80000(final AboutData aboutData) {
            aboutData.clearUserIsBanned();
        }
        
        public static void access$80100(final AboutData aboutData, final BoolValue freeFormReports) {
            aboutData.setFreeFormReports(freeFormReports);
        }
        
        public static void access$80200(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeFreeFormReports(boolValue);
        }
        
        public static void access$80300(final AboutData aboutData) {
            aboutData.clearFreeFormReports();
        }
        
        public static void access$80400(final AboutData aboutData, final BoolValue wikiEnabled) {
            aboutData.setWikiEnabled(wikiEnabled);
        }
        
        public static void access$80500(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeWikiEnabled(boolValue);
        }
        
        public static void access$80600(final AboutData aboutData) {
            aboutData.clearWikiEnabled();
        }
        
        public static void access$80700(final AboutData aboutData, final BoolValue userIsMuted) {
            aboutData.setUserIsMuted(userIsMuted);
        }
        
        public static void access$80800(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserIsMuted(boolValue);
        }
        
        public static void access$80900(final AboutData aboutData) {
            aboutData.clearUserIsMuted();
        }
        
        public static void access$81000(final AboutData aboutData, final BoolValue userCanFlairInSr) {
            aboutData.setUserCanFlairInSr(userCanFlairInSr);
        }
        
        public static void access$81100(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserCanFlairInSr(boolValue);
        }
        
        public static void access$81200(final AboutData aboutData) {
            aboutData.clearUserCanFlairInSr();
        }
        
        public static void access$81300(final AboutData aboutData, final StringValue displayName) {
            aboutData.setDisplayName(displayName);
        }
        
        public static void access$81400(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeDisplayName(stringValue);
        }
        
        public static void access$81500(final AboutData aboutData) {
            aboutData.clearDisplayName();
        }
        
        public static void access$81600(final AboutData aboutData, final StringValue headerImg) {
            aboutData.setHeaderImg(headerImg);
        }
        
        public static void access$81700(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeHeaderImg(stringValue);
        }
        
        public static void access$81800(final AboutData aboutData) {
            aboutData.clearHeaderImg();
        }
        
        public static void access$81900(final AboutData aboutData, final StringValue title) {
            aboutData.setTitle(title);
        }
        
        public static void access$82000(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeTitle(stringValue);
        }
        
        public static void access$82100(final AboutData aboutData) {
            aboutData.clearTitle();
        }
        
        public static void access$82200(final AboutData aboutData, final BoolValue allowGalleries) {
            aboutData.setAllowGalleries(allowGalleries);
        }
        
        public static void access$82300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowGalleries(boolValue);
        }
        
        public static void access$82400(final AboutData aboutData) {
            aboutData.clearAllowGalleries();
        }
        
        public static void access$82500(final AboutData aboutData, final Int64Value iconSize) {
            aboutData.setIconSize(iconSize);
        }
        
        public static void access$82600(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeIconSize(int64Value);
        }
        
        public static void access$82700(final AboutData aboutData) {
            aboutData.clearIconSize();
        }
        
        public static void access$82800(final AboutData aboutData, final StringValue primaryColor) {
            aboutData.setPrimaryColor(primaryColor);
        }
        
        public static void access$82900(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergePrimaryColor(stringValue);
        }
        
        public static void access$83000(final AboutData aboutData) {
            aboutData.clearPrimaryColor();
        }
        
        public static void access$83100(final AboutData aboutData, final Int64Value activeUserCount) {
            aboutData.setActiveUserCount(activeUserCount);
        }
        
        public static void access$83200(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeActiveUserCount(int64Value);
        }
        
        public static void access$83300(final AboutData aboutData) {
            aboutData.clearActiveUserCount();
        }
        
        public static void access$83400(final AboutData aboutData, final StringValue iconImg) {
            aboutData.setIconImg(iconImg);
        }
        
        public static void access$83500(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeIconImg(stringValue);
        }
        
        public static void access$83600(final AboutData aboutData) {
            aboutData.clearIconImg();
        }
        
        public static void access$83700(final AboutData aboutData, final StringValue displayNamePrefixed) {
            aboutData.setDisplayNamePrefixed(displayNamePrefixed);
        }
        
        public static void access$83800(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeDisplayNamePrefixed(stringValue);
        }
        
        public static void access$83900(final AboutData aboutData) {
            aboutData.clearDisplayNamePrefixed();
        }
        
        public static void access$84000(final AboutData aboutData, final Int64Value accountsActive) {
            aboutData.setAccountsActive(accountsActive);
        }
        
        public static void access$84100(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeAccountsActive(int64Value);
        }
        
        public static void access$84200(final AboutData aboutData) {
            aboutData.clearAccountsActive();
        }
        
        public static void access$84300(final AboutData aboutData, final BoolValue publicTraffic) {
            aboutData.setPublicTraffic(publicTraffic);
        }
        
        public static void access$84400(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergePublicTraffic(boolValue);
        }
        
        public static void access$84500(final AboutData aboutData) {
            aboutData.clearPublicTraffic();
        }
        
        public static void access$84600(final AboutData aboutData, final Int64Value subscribers) {
            aboutData.setSubscribers(subscribers);
        }
        
        public static void access$84700(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeSubscribers(int64Value);
        }
        
        public static void access$84800(final AboutData aboutData) {
            aboutData.clearSubscribers();
        }
        
        public static void access$84900(final AboutData aboutData, final int n, final UserFlairRichtext userFlairRichtext) {
            aboutData.setUserFlairRichtext(n, userFlairRichtext);
        }
        
        public static void access$85000(final AboutData aboutData, final UserFlairRichtext userFlairRichtext) {
            aboutData.addUserFlairRichtext(userFlairRichtext);
        }
        
        public static void access$85100(final AboutData aboutData, final int n, final UserFlairRichtext userFlairRichtext) {
            aboutData.addUserFlairRichtext(n, userFlairRichtext);
        }
        
        public static void access$85200(final AboutData aboutData, final Iterable iterable) {
            aboutData.addAllUserFlairRichtext(iterable);
        }
        
        public static void access$85300(final AboutData aboutData) {
            aboutData.clearUserFlairRichtext();
        }
        
        public static void access$85400(final AboutData aboutData, final int n) {
            aboutData.removeUserFlairRichtext(n);
        }
        
        public static void access$85500(final AboutData aboutData, final StringValue name) {
            aboutData.setName(name);
        }
        
        public static void access$85600(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeName(stringValue);
        }
        
        public static void access$85700(final AboutData aboutData) {
            aboutData.clearName();
        }
        
        public static void access$85800(final AboutData aboutData, final BoolValue quarantine) {
            aboutData.setQuarantine(quarantine);
        }
        
        public static void access$85900(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeQuarantine(boolValue);
        }
        
        public static void access$86000(final AboutData aboutData) {
            aboutData.clearQuarantine();
        }
        
        public static void access$86100(final AboutData aboutData, final BoolValue hideAds) {
            aboutData.setHideAds(hideAds);
        }
        
        public static void access$86200(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeHideAds(boolValue);
        }
        
        public static void access$86300(final AboutData aboutData) {
            aboutData.clearHideAds();
        }
        
        public static void access$86400(final AboutData aboutData, final StringValue predictionLeaderboardEntryType) {
            aboutData.setPredictionLeaderboardEntryType(predictionLeaderboardEntryType);
        }
        
        public static void access$86500(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergePredictionLeaderboardEntryType(stringValue);
        }
        
        public static void access$86600(final AboutData aboutData) {
            aboutData.clearPredictionLeaderboardEntryType();
        }
        
        public static void access$86700(final AboutData aboutData, final BoolValue emojisEnabled) {
            aboutData.setEmojisEnabled(emojisEnabled);
        }
        
        public static void access$86800(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeEmojisEnabled(boolValue);
        }
        
        public static void access$86900(final AboutData aboutData) {
            aboutData.clearEmojisEnabled();
        }
        
        public static void access$87000(final AboutData aboutData, final StringValue advertiserCategory) {
            aboutData.setAdvertiserCategory(advertiserCategory);
        }
        
        public static void access$87100(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeAdvertiserCategory(stringValue);
        }
        
        public static void access$87200(final AboutData aboutData) {
            aboutData.clearAdvertiserCategory();
        }
        
        public static void access$87300(final AboutData aboutData, final StringValue publicDescription) {
            aboutData.setPublicDescription(publicDescription);
        }
        
        public static void access$87400(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergePublicDescription(stringValue);
        }
        
        public static void access$87500(final AboutData aboutData) {
            aboutData.clearPublicDescription();
        }
        
        public static void access$87600(final AboutData aboutData, final Int32Value commentScoreHideMins) {
            aboutData.setCommentScoreHideMins(commentScoreHideMins);
        }
        
        public static void access$87700(final AboutData aboutData, final Int32Value int32Value) {
            aboutData.mergeCommentScoreHideMins(int32Value);
        }
        
        public static void access$87800(final AboutData aboutData) {
            aboutData.clearCommentScoreHideMins();
        }
        
        public static void access$87900(final AboutData aboutData, final BoolValue allowPredictions) {
            aboutData.setAllowPredictions(allowPredictions);
        }
        
        public static void access$88000(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowPredictions(boolValue);
        }
        
        public static void access$88100(final AboutData aboutData) {
            aboutData.clearAllowPredictions();
        }
        
        public static void access$88200(final AboutData aboutData, final BoolValue userHasFavorited) {
            aboutData.setUserHasFavorited(userHasFavorited);
        }
        
        public static void access$88300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserHasFavorited(boolValue);
        }
        
        public static void access$88400(final AboutData aboutData) {
            aboutData.clearUserHasFavorited();
        }
        
        public static void access$88500(final AboutData aboutData, final StringValue userFlairTemplateId) {
            aboutData.setUserFlairTemplateId(userFlairTemplateId);
        }
        
        public static void access$88600(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUserFlairTemplateId(stringValue);
        }
        
        public static void access$88700(final AboutData aboutData) {
            aboutData.clearUserFlairTemplateId();
        }
        
        public static void access$88800(final AboutData aboutData, final StringValue communityIcon) {
            aboutData.setCommunityIcon(communityIcon);
        }
        
        public static void access$88900(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeCommunityIcon(stringValue);
        }
        
        public static void access$89000(final AboutData aboutData) {
            aboutData.clearCommunityIcon();
        }
        
        public static void access$89100(final AboutData aboutData, final StringValue bannerBackgroundImage) {
            aboutData.setBannerBackgroundImage(bannerBackgroundImage);
        }
        
        public static void access$89200(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeBannerBackgroundImage(stringValue);
        }
        
        public static void access$89300(final AboutData aboutData) {
            aboutData.clearBannerBackgroundImage();
        }
        
        public static void access$89400(final AboutData aboutData, final BoolValue originalContentTagEnabled) {
            aboutData.setOriginalContentTagEnabled(originalContentTagEnabled);
        }
        
        public static void access$89500(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeOriginalContentTagEnabled(boolValue);
        }
        
        public static void access$89600(final AboutData aboutData) {
            aboutData.clearOriginalContentTagEnabled();
        }
        
        public static void access$89700(final AboutData aboutData, final BoolValue communityReviewed) {
            aboutData.setCommunityReviewed(communityReviewed);
        }
        
        public static void access$89800(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeCommunityReviewed(boolValue);
        }
        
        public static void access$89900(final AboutData aboutData) {
            aboutData.clearCommunityReviewed();
        }
        
        public static void access$90000(final AboutData aboutData, final StringValue submitText) {
            aboutData.setSubmitText(submitText);
        }
        
        public static void access$90100(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeSubmitText(stringValue);
        }
        
        public static void access$90200(final AboutData aboutData) {
            aboutData.clearSubmitText();
        }
        
        public static void access$90300(final AboutData aboutData, final StringValue descriptionHtml) {
            aboutData.setDescriptionHtml(descriptionHtml);
        }
        
        public static void access$90400(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeDescriptionHtml(stringValue);
        }
        
        public static void access$90500(final AboutData aboutData) {
            aboutData.clearDescriptionHtml();
        }
        
        public static void access$90600(final AboutData aboutData, final BoolValue spoilersEnabled) {
            aboutData.setSpoilersEnabled(spoilersEnabled);
        }
        
        public static void access$90700(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeSpoilersEnabled(boolValue);
        }
        
        public static void access$90800(final AboutData aboutData) {
            aboutData.clearSpoilersEnabled();
        }
        
        public static void access$90900(final AboutData aboutData, final SubredditsMsg$CommentContributionSettings commentContributionSettings) {
            aboutData.setCommentContributionSettings(commentContributionSettings);
        }
        
        public static void access$91000(final AboutData aboutData, final SubredditsMsg$CommentContributionSettings subredditsMsg$CommentContributionSettings) {
            aboutData.mergeCommentContributionSettings(subredditsMsg$CommentContributionSettings);
        }
        
        public static void access$91100(final AboutData aboutData) {
            aboutData.clearCommentContributionSettings();
        }
        
        public static void access$91200(final AboutData aboutData, final BoolValue allowTalks) {
            aboutData.setAllowTalks(allowTalks);
        }
        
        public static void access$91300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowTalks(boolValue);
        }
        
        public static void access$91400(final AboutData aboutData) {
            aboutData.clearAllowTalks();
        }
        
        public static void access$91500(final AboutData aboutData, final Int64Value headerSize) {
            aboutData.setHeaderSize(headerSize);
        }
        
        public static void access$91600(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeHeaderSize(int64Value);
        }
        
        public static void access$91700(final AboutData aboutData) {
            aboutData.clearHeaderSize();
        }
        
        public static void access$91800(final AboutData aboutData, final StringValue userFlairPosition) {
            aboutData.setUserFlairPosition(userFlairPosition);
        }
        
        public static void access$91900(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUserFlairPosition(stringValue);
        }
        
        public static void access$92000(final AboutData aboutData) {
            aboutData.clearUserFlairPosition();
        }
        
        public static void access$92100(final AboutData aboutData, final BoolValue allOriginalContent) {
            aboutData.setAllOriginalContent(allOriginalContent);
        }
        
        public static void access$92200(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllOriginalContent(boolValue);
        }
        
        public static void access$92300(final AboutData aboutData) {
            aboutData.clearAllOriginalContent();
        }
        
        public static void access$92400(final AboutData aboutData, final BoolValue collectionsEnabled) {
            aboutData.setCollectionsEnabled(collectionsEnabled);
        }
        
        public static void access$92500(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeCollectionsEnabled(boolValue);
        }
        
        public static void access$92600(final AboutData aboutData) {
            aboutData.clearCollectionsEnabled();
        }
        
        public static void access$92700(final AboutData aboutData, final BoolValue isEnrolledInNewModmail) {
            aboutData.setIsEnrolledInNewModmail(isEnrolledInNewModmail);
        }
        
        public static void access$92800(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeIsEnrolledInNewModmail(boolValue);
        }
        
        public static void access$92900(final AboutData aboutData) {
            aboutData.clearIsEnrolledInNewModmail();
        }
        
        public static void access$93000(final AboutData aboutData, final StringValue keyColor) {
            aboutData.setKeyColor(keyColor);
        }
        
        public static void access$93100(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeKeyColor(stringValue);
        }
        
        public static void access$93200(final AboutData aboutData) {
            aboutData.clearKeyColor();
        }
        
        public static void access$93300(final AboutData aboutData, final BoolValue eventPostsEnabled) {
            aboutData.setEventPostsEnabled(eventPostsEnabled);
        }
        
        public static void access$93400(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeEventPostsEnabled(boolValue);
        }
        
        public static void access$93500(final AboutData aboutData) {
            aboutData.clearEventPostsEnabled();
        }
        
        public static void access$93600(final AboutData aboutData, final BoolValue canAssignUserFlair) {
            aboutData.setCanAssignUserFlair(canAssignUserFlair);
        }
        
        public static void access$93700(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeCanAssignUserFlair(boolValue);
        }
        
        public static void access$93800(final AboutData aboutData) {
            aboutData.clearCanAssignUserFlair();
        }
        
        public static void access$93900(final AboutData aboutData, final Int64Value created) {
            aboutData.setCreated(created);
        }
        
        public static void access$94000(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeCreated(int64Value);
        }
        
        public static void access$94100(final AboutData aboutData) {
            aboutData.clearCreated();
        }
        
        public static void access$94200(final AboutData aboutData, final StringValue wls) {
            aboutData.setWls(wls);
        }
        
        public static void access$94300(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeWls(stringValue);
        }
        
        public static void access$94400(final AboutData aboutData) {
            aboutData.clearWls();
        }
        
        public static void access$94500(final AboutData aboutData, final BoolValue showMediaPreview) {
            aboutData.setShowMediaPreview(showMediaPreview);
        }
        
        public static void access$94600(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeShowMediaPreview(boolValue);
        }
        
        public static void access$94700(final AboutData aboutData) {
            aboutData.clearShowMediaPreview();
        }
        
        public static void access$94800(final AboutData aboutData, final StringValue submissionType) {
            aboutData.setSubmissionType(submissionType);
        }
        
        public static void access$94900(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeSubmissionType(stringValue);
        }
        
        public static void access$95000(final AboutData aboutData) {
            aboutData.clearSubmissionType();
        }
        
        public static void access$95100(final AboutData aboutData, final BoolValue userIsSubscriber) {
            aboutData.setUserIsSubscriber(userIsSubscriber);
        }
        
        public static void access$95200(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeUserIsSubscriber(boolValue);
        }
        
        public static void access$95300(final AboutData aboutData) {
            aboutData.clearUserIsSubscriber();
        }
        
        public static void access$95400(final AboutData aboutData, final int n, final StringValue stringValue) {
            aboutData.setAllowedMediaInComments(n, stringValue);
        }
        
        public static void access$95500(final AboutData aboutData, final StringValue stringValue) {
            aboutData.addAllowedMediaInComments(stringValue);
        }
        
        public static void access$95600(final AboutData aboutData, final int n, final StringValue stringValue) {
            aboutData.addAllowedMediaInComments(n, stringValue);
        }
        
        public static void access$95700(final AboutData aboutData, final Iterable iterable) {
            aboutData.addAllAllowedMediaInComments(iterable);
        }
        
        public static void access$95800(final AboutData aboutData) {
            aboutData.clearAllowedMediaInComments();
        }
        
        public static void access$95900(final AboutData aboutData, final int n) {
            aboutData.removeAllowedMediaInComments(n);
        }
        
        public static void access$96000(final AboutData aboutData, final BoolValue allowVideogifs) {
            aboutData.setAllowVideogifs(allowVideogifs);
        }
        
        public static void access$96100(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowVideogifs(boolValue);
        }
        
        public static void access$96200(final AboutData aboutData) {
            aboutData.clearAllowVideogifs();
        }
        
        public static void access$96300(final AboutData aboutData, final BoolValue shouldArchivePosts) {
            aboutData.setShouldArchivePosts(shouldArchivePosts);
        }
        
        public static void access$96400(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeShouldArchivePosts(boolValue);
        }
        
        public static void access$96500(final AboutData aboutData) {
            aboutData.clearShouldArchivePosts();
        }
        
        public static void access$96600(final AboutData aboutData, final StringValue userFlairType) {
            aboutData.setUserFlairType(userFlairType);
        }
        
        public static void access$96700(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeUserFlairType(stringValue);
        }
        
        public static void access$96800(final AboutData aboutData) {
            aboutData.clearUserFlairType();
        }
        
        public static void access$96900(final AboutData aboutData, final BoolValue allowPolls) {
            aboutData.setAllowPolls(allowPolls);
        }
        
        public static void access$97000(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowPolls(boolValue);
        }
        
        public static void access$97100(final AboutData aboutData) {
            aboutData.clearAllowPolls();
        }
        
        public static void access$97200(final AboutData aboutData, final BoolValue collapseDeletedComments) {
            aboutData.setCollapseDeletedComments(collapseDeletedComments);
        }
        
        public static void access$97300(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeCollapseDeletedComments(boolValue);
        }
        
        public static void access$97400(final AboutData aboutData) {
            aboutData.clearCollapseDeletedComments();
        }
        
        public static void access$97500(final AboutData aboutData, final Int64Value coins) {
            aboutData.setCoins(coins);
        }
        
        public static void access$97600(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeCoins(int64Value);
        }
        
        public static void access$97700(final AboutData aboutData) {
            aboutData.clearCoins();
        }
        
        public static void access$97800(final AboutData aboutData, final Int64Value emojisCustomSize) {
            aboutData.setEmojisCustomSize(emojisCustomSize);
        }
        
        public static void access$97900(final AboutData aboutData, final Int64Value int64Value) {
            aboutData.mergeEmojisCustomSize(int64Value);
        }
        
        public static void access$98000(final AboutData aboutData) {
            aboutData.clearEmojisCustomSize();
        }
        
        public static void access$98100(final AboutData aboutData, final StringValue publicDescriptionHtml) {
            aboutData.setPublicDescriptionHtml(publicDescriptionHtml);
        }
        
        public static void access$98200(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergePublicDescriptionHtml(stringValue);
        }
        
        public static void access$98300(final AboutData aboutData) {
            aboutData.clearPublicDescriptionHtml();
        }
        
        public static void access$98400(final AboutData aboutData, final BoolValue allowVideos) {
            aboutData.setAllowVideos(allowVideos);
        }
        
        public static void access$98500(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeAllowVideos(boolValue);
        }
        
        public static void access$98600(final AboutData aboutData) {
            aboutData.clearAllowVideos();
        }
        
        public static void access$98700(final AboutData aboutData, final BoolValue isCrosspostableSubreddit) {
            aboutData.setIsCrosspostableSubreddit(isCrosspostableSubreddit);
        }
        
        public static void access$98800(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeIsCrosspostableSubreddit(boolValue);
        }
        
        public static void access$98900(final AboutData aboutData) {
            aboutData.clearIsCrosspostableSubreddit();
        }
        
        public static void access$99000(final AboutData aboutData, final StringValue notificationLevel) {
            aboutData.setNotificationLevel(notificationLevel);
        }
        
        public static void access$99100(final AboutData aboutData, final StringValue stringValue) {
            aboutData.mergeNotificationLevel(stringValue);
        }
        
        public static void access$99200(final AboutData aboutData) {
            aboutData.clearNotificationLevel();
        }
        
        public static void access$99300(final AboutData aboutData, final BoolValue shouldShowMediaInCommentsSetting) {
            aboutData.setShouldShowMediaInCommentsSetting(shouldShowMediaInCommentsSetting);
        }
        
        public static void access$99400(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeShouldShowMediaInCommentsSetting(boolValue);
        }
        
        public static void access$99500(final AboutData aboutData) {
            aboutData.clearShouldShowMediaInCommentsSetting();
        }
        
        public static void access$99600(final AboutData aboutData, final BoolValue canAssignLinkFlair) {
            aboutData.setCanAssignLinkFlair(canAssignLinkFlair);
        }
        
        public static void access$99700(final AboutData aboutData, final BoolValue boolValue) {
            aboutData.mergeCanAssignLinkFlair(boolValue);
        }
        
        public static void access$99800(final AboutData aboutData) {
            aboutData.clearCanAssignLinkFlair();
        }
        
        public static void access$99900(final AboutData aboutData, final BoolValue hasMenuWidget) {
            aboutData.setHasMenuWidget(hasMenuWidget);
        }
        
        private void addAllAllowedMediaInComments(final Iterable<? extends StringValue> iterable) {
            this.ensureAllowedMediaInCommentsIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.allowedMediaInComments_);
        }
        
        private void addAllUserFlairRichtext(final Iterable<? extends UserFlairRichtext> iterable) {
            this.ensureUserFlairRichtextIsMutable();
            com.google.protobuf.a.addAll((Iterable)iterable, (List)this.userFlairRichtext_);
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
        
        private void addUserFlairRichtext(final int n, final UserFlairRichtext userFlairRichtext) {
            userFlairRichtext.getClass();
            this.ensureUserFlairRichtextIsMutable();
            ((List<UserFlairRichtext>)this.userFlairRichtext_).add(n, userFlairRichtext);
        }
        
        private void addUserFlairRichtext(final UserFlairRichtext userFlairRichtext) {
            userFlairRichtext.getClass();
            this.ensureUserFlairRichtextIsMutable();
            ((List<UserFlairRichtext>)this.userFlairRichtext_).add(userFlairRichtext);
        }
        
        private void clearAcceptFollowers() {
            this.acceptFollowers_ = null;
        }
        
        private void clearAccountsActive() {
            this.accountsActive_ = null;
        }
        
        private void clearAccountsActiveIsFuzzed() {
            this.accountsActiveIsFuzzed_ = null;
        }
        
        private void clearActiveUserCount() {
            this.activeUserCount_ = null;
        }
        
        private void clearAdvertiserCategory() {
            this.advertiserCategory_ = null;
        }
        
        private void clearAllOriginalContent() {
            this.allOriginalContent_ = null;
        }
        
        private void clearAllowChatPostCreation() {
            this.allowChatPostCreation_ = null;
        }
        
        private void clearAllowDiscovery() {
            this.allowDiscovery_ = null;
        }
        
        private void clearAllowGalleries() {
            this.allowGalleries_ = null;
        }
        
        private void clearAllowImages() {
            this.allowImages_ = null;
        }
        
        private void clearAllowPolls() {
            this.allowPolls_ = null;
        }
        
        private void clearAllowPredictionContributors() {
            this.allowPredictionContributors_ = null;
        }
        
        private void clearAllowPredictions() {
            this.allowPredictions_ = null;
        }
        
        private void clearAllowPredictionsTournament() {
            this.allowPredictionsTournament_ = null;
        }
        
        private void clearAllowTalks() {
            this.allowTalks_ = null;
        }
        
        private void clearAllowVideogifs() {
            this.allowVideogifs_ = null;
        }
        
        private void clearAllowVideos() {
            this.allowVideos_ = null;
        }
        
        private void clearAllowedMediaInComments() {
            this.allowedMediaInComments_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearBannerBackgroundColor() {
            this.bannerBackgroundColor_ = null;
        }
        
        private void clearBannerBackgroundImage() {
            this.bannerBackgroundImage_ = null;
        }
        
        private void clearBannerImg() {
            this.bannerImg_ = null;
        }
        
        private void clearBannerSize() {
            this.bannerSize_ = null;
        }
        
        private void clearCanAssignLinkFlair() {
            this.canAssignLinkFlair_ = null;
        }
        
        private void clearCanAssignUserFlair() {
            this.canAssignUserFlair_ = null;
        }
        
        private void clearCoins() {
            this.coins_ = null;
        }
        
        private void clearCollapseDeletedComments() {
            this.collapseDeletedComments_ = null;
        }
        
        private void clearCollectionsEnabled() {
            this.collectionsEnabled_ = null;
        }
        
        private void clearCommentContributionSettings() {
            this.commentContributionSettings_ = null;
        }
        
        private void clearCommentScoreHideMins() {
            this.commentScoreHideMins_ = null;
        }
        
        private void clearCommunityIcon() {
            this.communityIcon_ = null;
        }
        
        private void clearCommunityReviewed() {
            this.communityReviewed_ = null;
        }
        
        private void clearCreated() {
            this.created_ = null;
        }
        
        private void clearCreatedUtc() {
            this.createdUtc_ = null;
        }
        
        private void clearDescription() {
            this.description_ = null;
        }
        
        private void clearDescriptionHtml() {
            this.descriptionHtml_ = null;
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
        
        private void clearEmojisCustomSize() {
            this.emojisCustomSize_ = null;
        }
        
        private void clearEmojisEnabled() {
            this.emojisEnabled_ = null;
        }
        
        private void clearEventPostsEnabled() {
            this.eventPostsEnabled_ = null;
        }
        
        private void clearFreeFormReports() {
            this.freeFormReports_ = null;
        }
        
        private void clearHasMenuWidget() {
            this.hasMenuWidget_ = null;
        }
        
        private void clearHeaderImg() {
            this.headerImg_ = null;
        }
        
        private void clearHeaderSize() {
            this.headerSize_ = null;
        }
        
        private void clearHeaderTitle() {
            this.headerTitle_ = null;
        }
        
        private void clearHideAds() {
            this.hideAds_ = null;
        }
        
        private void clearIconImg() {
            this.iconImg_ = null;
        }
        
        private void clearIconSize() {
            this.iconSize_ = null;
        }
        
        private void clearId() {
            this.id_ = null;
        }
        
        private void clearIsChatPostFeatureEnabled() {
            this.isChatPostFeatureEnabled_ = null;
        }
        
        private void clearIsCrosspostableSubreddit() {
            this.isCrosspostableSubreddit_ = null;
        }
        
        private void clearIsEnrolledInNewModmail() {
            this.isEnrolledInNewModmail_ = null;
        }
        
        private void clearKeyColor() {
            this.keyColor_ = null;
        }
        
        private void clearLang() {
            this.lang_ = null;
        }
        
        private void clearLinkFlairEnabled() {
            this.linkFlairEnabled_ = null;
        }
        
        private void clearLinkFlairPosition() {
            this.linkFlairPosition_ = null;
        }
        
        private void clearMobileBannerImage() {
            this.mobileBannerImage_ = null;
        }
        
        private void clearName() {
            this.name_ = null;
        }
        
        private void clearNotificationLevel() {
            this.notificationLevel_ = null;
        }
        
        private void clearOriginalContentTagEnabled() {
            this.originalContentTagEnabled_ = null;
        }
        
        private void clearOver18() {
            this.over18_ = null;
        }
        
        private void clearPredictionLeaderboardEntryType() {
            this.predictionLeaderboardEntryType_ = null;
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
        
        private void clearPublicTraffic() {
            this.publicTraffic_ = null;
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
        
        private void clearShouldArchivePosts() {
            this.shouldArchivePosts_ = null;
        }
        
        private void clearShouldShowMediaInCommentsSetting() {
            this.shouldShowMediaInCommentsSetting_ = null;
        }
        
        private void clearShowMedia() {
            this.showMedia_ = null;
        }
        
        private void clearShowMediaPreview() {
            this.showMediaPreview_ = null;
        }
        
        private void clearSpoilersEnabled() {
            this.spoilersEnabled_ = null;
        }
        
        private void clearSubmissionType() {
            this.submissionType_ = null;
        }
        
        private void clearSubmitLinkLabel() {
            this.submitLinkLabel_ = null;
        }
        
        private void clearSubmitText() {
            this.submitText_ = null;
        }
        
        private void clearSubmitTextHtml() {
            this.submitTextHtml_ = null;
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
        
        private void clearSuggestedCommentSort() {
            this.suggestedCommentSort_ = null;
        }
        
        private void clearTitle() {
            this.title_ = null;
        }
        
        private void clearUrl() {
            this.url_ = null;
        }
        
        private void clearUserCanFlairInSr() {
            this.userCanFlairInSr_ = null;
        }
        
        private void clearUserFlairBackgroundColor() {
            this.userFlairBackgroundColor_ = null;
        }
        
        private void clearUserFlairCssClass() {
            this.userFlairCssClass_ = null;
        }
        
        private void clearUserFlairEnabledInSr() {
            this.userFlairEnabledInSr_ = null;
        }
        
        private void clearUserFlairPosition() {
            this.userFlairPosition_ = null;
        }
        
        private void clearUserFlairRichtext() {
            this.userFlairRichtext_ = (Internal$j<UserFlairRichtext>)GeneratedMessageLite.emptyProtobufList();
        }
        
        private void clearUserFlairTemplateId() {
            this.userFlairTemplateId_ = null;
        }
        
        private void clearUserFlairText() {
            this.userFlairText_ = null;
        }
        
        private void clearUserFlairTextColor() {
            this.userFlairTextColor_ = null;
        }
        
        private void clearUserFlairType() {
            this.userFlairType_ = null;
        }
        
        private void clearUserHasFavorited() {
            this.userHasFavorited_ = null;
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
        
        private void clearUserSrFlairEnabled() {
            this.userSrFlairEnabled_ = null;
        }
        
        private void clearUserSrThemeEnabled() {
            this.userSrThemeEnabled_ = null;
        }
        
        private void clearWhitelistStatus() {
            this.whitelistStatus_ = null;
        }
        
        private void clearWikiEnabled() {
            this.wikiEnabled_ = null;
        }
        
        private void clearWls() {
            this.wls_ = null;
        }
        
        private void ensureAllowedMediaInCommentsIsMutable() {
            final Internal$j<StringValue> allowedMediaInComments_ = this.allowedMediaInComments_;
            if (!allowedMediaInComments_.E0()) {
                this.allowedMediaInComments_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)allowedMediaInComments_);
            }
        }
        
        private void ensureUserFlairRichtextIsMutable() {
            final Internal$j<UserFlairRichtext> userFlairRichtext_ = this.userFlairRichtext_;
            if (!userFlairRichtext_.E0()) {
                this.userFlairRichtext_ = (Internal$j<UserFlairRichtext>)GeneratedMessageLite.mutableCopy((Internal$j)userFlairRichtext_);
            }
        }
        
        public static AboutData getDefaultInstance() {
            return AboutData.DEFAULT_INSTANCE;
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
        
        private void mergeAccountsActive(final Int64Value accountsActive_) {
            accountsActive_.getClass();
            final Int64Value accountsActive_2 = this.accountsActive_;
            if (accountsActive_2 != null && accountsActive_2 != Int64Value.getDefaultInstance()) {
                this.accountsActive_ = (Int64Value)h.b(this.accountsActive_, accountsActive_);
            }
            else {
                this.accountsActive_ = accountsActive_;
            }
        }
        
        private void mergeAccountsActiveIsFuzzed(final BoolValue accountsActiveIsFuzzed_) {
            accountsActiveIsFuzzed_.getClass();
            final BoolValue accountsActiveIsFuzzed_2 = this.accountsActiveIsFuzzed_;
            if (accountsActiveIsFuzzed_2 != null && accountsActiveIsFuzzed_2 != BoolValue.getDefaultInstance()) {
                this.accountsActiveIsFuzzed_ = (BoolValue)o.g(this.accountsActiveIsFuzzed_, accountsActiveIsFuzzed_);
            }
            else {
                this.accountsActiveIsFuzzed_ = accountsActiveIsFuzzed_;
            }
        }
        
        private void mergeActiveUserCount(final Int64Value activeUserCount_) {
            activeUserCount_.getClass();
            final Int64Value activeUserCount_2 = this.activeUserCount_;
            if (activeUserCount_2 != null && activeUserCount_2 != Int64Value.getDefaultInstance()) {
                this.activeUserCount_ = (Int64Value)h.b(this.activeUserCount_, activeUserCount_);
            }
            else {
                this.activeUserCount_ = activeUserCount_;
            }
        }
        
        private void mergeAdvertiserCategory(final StringValue advertiserCategory_) {
            advertiserCategory_.getClass();
            final StringValue advertiserCategory_2 = this.advertiserCategory_;
            if (advertiserCategory_2 != null && advertiserCategory_2 != StringValue.getDefaultInstance()) {
                this.advertiserCategory_ = (StringValue)w.e(this.advertiserCategory_, advertiserCategory_);
            }
            else {
                this.advertiserCategory_ = advertiserCategory_;
            }
        }
        
        private void mergeAllOriginalContent(final BoolValue allOriginalContent_) {
            allOriginalContent_.getClass();
            final BoolValue allOriginalContent_2 = this.allOriginalContent_;
            if (allOriginalContent_2 != null && allOriginalContent_2 != BoolValue.getDefaultInstance()) {
                this.allOriginalContent_ = (BoolValue)o.g(this.allOriginalContent_, allOriginalContent_);
            }
            else {
                this.allOriginalContent_ = allOriginalContent_;
            }
        }
        
        private void mergeAllowChatPostCreation(final BoolValue allowChatPostCreation_) {
            allowChatPostCreation_.getClass();
            final BoolValue allowChatPostCreation_2 = this.allowChatPostCreation_;
            if (allowChatPostCreation_2 != null && allowChatPostCreation_2 != BoolValue.getDefaultInstance()) {
                this.allowChatPostCreation_ = (BoolValue)o.g(this.allowChatPostCreation_, allowChatPostCreation_);
            }
            else {
                this.allowChatPostCreation_ = allowChatPostCreation_;
            }
        }
        
        private void mergeAllowDiscovery(final BoolValue allowDiscovery_) {
            allowDiscovery_.getClass();
            final BoolValue allowDiscovery_2 = this.allowDiscovery_;
            if (allowDiscovery_2 != null && allowDiscovery_2 != BoolValue.getDefaultInstance()) {
                this.allowDiscovery_ = (BoolValue)o.g(this.allowDiscovery_, allowDiscovery_);
            }
            else {
                this.allowDiscovery_ = allowDiscovery_;
            }
        }
        
        private void mergeAllowGalleries(final BoolValue allowGalleries_) {
            allowGalleries_.getClass();
            final BoolValue allowGalleries_2 = this.allowGalleries_;
            if (allowGalleries_2 != null && allowGalleries_2 != BoolValue.getDefaultInstance()) {
                this.allowGalleries_ = (BoolValue)o.g(this.allowGalleries_, allowGalleries_);
            }
            else {
                this.allowGalleries_ = allowGalleries_;
            }
        }
        
        private void mergeAllowImages(final BoolValue allowImages_) {
            allowImages_.getClass();
            final BoolValue allowImages_2 = this.allowImages_;
            if (allowImages_2 != null && allowImages_2 != BoolValue.getDefaultInstance()) {
                this.allowImages_ = (BoolValue)o.g(this.allowImages_, allowImages_);
            }
            else {
                this.allowImages_ = allowImages_;
            }
        }
        
        private void mergeAllowPolls(final BoolValue allowPolls_) {
            allowPolls_.getClass();
            final BoolValue allowPolls_2 = this.allowPolls_;
            if (allowPolls_2 != null && allowPolls_2 != BoolValue.getDefaultInstance()) {
                this.allowPolls_ = (BoolValue)o.g(this.allowPolls_, allowPolls_);
            }
            else {
                this.allowPolls_ = allowPolls_;
            }
        }
        
        private void mergeAllowPredictionContributors(final BoolValue allowPredictionContributors_) {
            allowPredictionContributors_.getClass();
            final BoolValue allowPredictionContributors_2 = this.allowPredictionContributors_;
            if (allowPredictionContributors_2 != null && allowPredictionContributors_2 != BoolValue.getDefaultInstance()) {
                this.allowPredictionContributors_ = (BoolValue)o.g(this.allowPredictionContributors_, allowPredictionContributors_);
            }
            else {
                this.allowPredictionContributors_ = allowPredictionContributors_;
            }
        }
        
        private void mergeAllowPredictions(final BoolValue allowPredictions_) {
            allowPredictions_.getClass();
            final BoolValue allowPredictions_2 = this.allowPredictions_;
            if (allowPredictions_2 != null && allowPredictions_2 != BoolValue.getDefaultInstance()) {
                this.allowPredictions_ = (BoolValue)o.g(this.allowPredictions_, allowPredictions_);
            }
            else {
                this.allowPredictions_ = allowPredictions_;
            }
        }
        
        private void mergeAllowPredictionsTournament(final BoolValue allowPredictionsTournament_) {
            allowPredictionsTournament_.getClass();
            final BoolValue allowPredictionsTournament_2 = this.allowPredictionsTournament_;
            if (allowPredictionsTournament_2 != null && allowPredictionsTournament_2 != BoolValue.getDefaultInstance()) {
                this.allowPredictionsTournament_ = (BoolValue)o.g(this.allowPredictionsTournament_, allowPredictionsTournament_);
            }
            else {
                this.allowPredictionsTournament_ = allowPredictionsTournament_;
            }
        }
        
        private void mergeAllowTalks(final BoolValue allowTalks_) {
            allowTalks_.getClass();
            final BoolValue allowTalks_2 = this.allowTalks_;
            if (allowTalks_2 != null && allowTalks_2 != BoolValue.getDefaultInstance()) {
                this.allowTalks_ = (BoolValue)o.g(this.allowTalks_, allowTalks_);
            }
            else {
                this.allowTalks_ = allowTalks_;
            }
        }
        
        private void mergeAllowVideogifs(final BoolValue allowVideogifs_) {
            allowVideogifs_.getClass();
            final BoolValue allowVideogifs_2 = this.allowVideogifs_;
            if (allowVideogifs_2 != null && allowVideogifs_2 != BoolValue.getDefaultInstance()) {
                this.allowVideogifs_ = (BoolValue)o.g(this.allowVideogifs_, allowVideogifs_);
            }
            else {
                this.allowVideogifs_ = allowVideogifs_;
            }
        }
        
        private void mergeAllowVideos(final BoolValue allowVideos_) {
            allowVideos_.getClass();
            final BoolValue allowVideos_2 = this.allowVideos_;
            if (allowVideos_2 != null && allowVideos_2 != BoolValue.getDefaultInstance()) {
                this.allowVideos_ = (BoolValue)o.g(this.allowVideos_, allowVideos_);
            }
            else {
                this.allowVideos_ = allowVideos_;
            }
        }
        
        private void mergeBannerBackgroundColor(final StringValue bannerBackgroundColor_) {
            bannerBackgroundColor_.getClass();
            final StringValue bannerBackgroundColor_2 = this.bannerBackgroundColor_;
            if (bannerBackgroundColor_2 != null && bannerBackgroundColor_2 != StringValue.getDefaultInstance()) {
                this.bannerBackgroundColor_ = (StringValue)w.e(this.bannerBackgroundColor_, bannerBackgroundColor_);
            }
            else {
                this.bannerBackgroundColor_ = bannerBackgroundColor_;
            }
        }
        
        private void mergeBannerBackgroundImage(final StringValue bannerBackgroundImage_) {
            bannerBackgroundImage_.getClass();
            final StringValue bannerBackgroundImage_2 = this.bannerBackgroundImage_;
            if (bannerBackgroundImage_2 != null && bannerBackgroundImage_2 != StringValue.getDefaultInstance()) {
                this.bannerBackgroundImage_ = (StringValue)w.e(this.bannerBackgroundImage_, bannerBackgroundImage_);
            }
            else {
                this.bannerBackgroundImage_ = bannerBackgroundImage_;
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
        
        private void mergeBannerSize(final Int64Value bannerSize_) {
            bannerSize_.getClass();
            final Int64Value bannerSize_2 = this.bannerSize_;
            if (bannerSize_2 != null && bannerSize_2 != Int64Value.getDefaultInstance()) {
                this.bannerSize_ = (Int64Value)h.b(this.bannerSize_, bannerSize_);
            }
            else {
                this.bannerSize_ = bannerSize_;
            }
        }
        
        private void mergeCanAssignLinkFlair(final BoolValue canAssignLinkFlair_) {
            canAssignLinkFlair_.getClass();
            final BoolValue canAssignLinkFlair_2 = this.canAssignLinkFlair_;
            if (canAssignLinkFlair_2 != null && canAssignLinkFlair_2 != BoolValue.getDefaultInstance()) {
                this.canAssignLinkFlair_ = (BoolValue)o.g(this.canAssignLinkFlair_, canAssignLinkFlair_);
            }
            else {
                this.canAssignLinkFlair_ = canAssignLinkFlair_;
            }
        }
        
        private void mergeCanAssignUserFlair(final BoolValue canAssignUserFlair_) {
            canAssignUserFlair_.getClass();
            final BoolValue canAssignUserFlair_2 = this.canAssignUserFlair_;
            if (canAssignUserFlair_2 != null && canAssignUserFlair_2 != BoolValue.getDefaultInstance()) {
                this.canAssignUserFlair_ = (BoolValue)o.g(this.canAssignUserFlair_, canAssignUserFlair_);
            }
            else {
                this.canAssignUserFlair_ = canAssignUserFlair_;
            }
        }
        
        private void mergeCoins(final Int64Value coins_) {
            coins_.getClass();
            final Int64Value coins_2 = this.coins_;
            if (coins_2 != null && coins_2 != Int64Value.getDefaultInstance()) {
                this.coins_ = (Int64Value)h.b(this.coins_, coins_);
            }
            else {
                this.coins_ = coins_;
            }
        }
        
        private void mergeCollapseDeletedComments(final BoolValue collapseDeletedComments_) {
            collapseDeletedComments_.getClass();
            final BoolValue collapseDeletedComments_2 = this.collapseDeletedComments_;
            if (collapseDeletedComments_2 != null && collapseDeletedComments_2 != BoolValue.getDefaultInstance()) {
                this.collapseDeletedComments_ = (BoolValue)o.g(this.collapseDeletedComments_, collapseDeletedComments_);
            }
            else {
                this.collapseDeletedComments_ = collapseDeletedComments_;
            }
        }
        
        private void mergeCollectionsEnabled(final BoolValue collectionsEnabled_) {
            collectionsEnabled_.getClass();
            final BoolValue collectionsEnabled_2 = this.collectionsEnabled_;
            if (collectionsEnabled_2 != null && collectionsEnabled_2 != BoolValue.getDefaultInstance()) {
                this.collectionsEnabled_ = (BoolValue)o.g(this.collectionsEnabled_, collectionsEnabled_);
            }
            else {
                this.collectionsEnabled_ = collectionsEnabled_;
            }
        }
        
        private void mergeCommentContributionSettings(final SubredditsMsg$CommentContributionSettings commentContributionSettings_) {
            commentContributionSettings_.getClass();
            final SubredditsMsg$CommentContributionSettings commentContributionSettings_2 = this.commentContributionSettings_;
            if (commentContributionSettings_2 != null && commentContributionSettings_2 != SubredditsMsg$CommentContributionSettings.getDefaultInstance()) {
                final SubredditsMsg$CommentContributionSettings$a builder = SubredditsMsg$CommentContributionSettings.newBuilder(this.commentContributionSettings_);
                ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)commentContributionSettings_);
                this.commentContributionSettings_ = (SubredditsMsg$CommentContributionSettings)((GeneratedMessageLite$b)builder).c();
            }
            else {
                this.commentContributionSettings_ = commentContributionSettings_;
            }
        }
        
        private void mergeCommentScoreHideMins(final Int32Value commentScoreHideMins_) {
            commentScoreHideMins_.getClass();
            final Int32Value commentScoreHideMins_2 = this.commentScoreHideMins_;
            if (commentScoreHideMins_2 != null && commentScoreHideMins_2 != Int32Value.getDefaultInstance()) {
                this.commentScoreHideMins_ = (Int32Value)b.d(this.commentScoreHideMins_, commentScoreHideMins_);
            }
            else {
                this.commentScoreHideMins_ = commentScoreHideMins_;
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
        
        private void mergeCommunityReviewed(final BoolValue communityReviewed_) {
            communityReviewed_.getClass();
            final BoolValue communityReviewed_2 = this.communityReviewed_;
            if (communityReviewed_2 != null && communityReviewed_2 != BoolValue.getDefaultInstance()) {
                this.communityReviewed_ = (BoolValue)o.g(this.communityReviewed_, communityReviewed_);
            }
            else {
                this.communityReviewed_ = communityReviewed_;
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
        
        private void mergeDescriptionHtml(final StringValue descriptionHtml_) {
            descriptionHtml_.getClass();
            final StringValue descriptionHtml_2 = this.descriptionHtml_;
            if (descriptionHtml_2 != null && descriptionHtml_2 != StringValue.getDefaultInstance()) {
                this.descriptionHtml_ = (StringValue)w.e(this.descriptionHtml_, descriptionHtml_);
            }
            else {
                this.descriptionHtml_ = descriptionHtml_;
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
        
        private void mergeEmojisCustomSize(final Int64Value emojisCustomSize_) {
            emojisCustomSize_.getClass();
            final Int64Value emojisCustomSize_2 = this.emojisCustomSize_;
            if (emojisCustomSize_2 != null && emojisCustomSize_2 != Int64Value.getDefaultInstance()) {
                this.emojisCustomSize_ = (Int64Value)h.b(this.emojisCustomSize_, emojisCustomSize_);
            }
            else {
                this.emojisCustomSize_ = emojisCustomSize_;
            }
        }
        
        private void mergeEmojisEnabled(final BoolValue emojisEnabled_) {
            emojisEnabled_.getClass();
            final BoolValue emojisEnabled_2 = this.emojisEnabled_;
            if (emojisEnabled_2 != null && emojisEnabled_2 != BoolValue.getDefaultInstance()) {
                this.emojisEnabled_ = (BoolValue)o.g(this.emojisEnabled_, emojisEnabled_);
            }
            else {
                this.emojisEnabled_ = emojisEnabled_;
            }
        }
        
        private void mergeEventPostsEnabled(final BoolValue eventPostsEnabled_) {
            eventPostsEnabled_.getClass();
            final BoolValue eventPostsEnabled_2 = this.eventPostsEnabled_;
            if (eventPostsEnabled_2 != null && eventPostsEnabled_2 != BoolValue.getDefaultInstance()) {
                this.eventPostsEnabled_ = (BoolValue)o.g(this.eventPostsEnabled_, eventPostsEnabled_);
            }
            else {
                this.eventPostsEnabled_ = eventPostsEnabled_;
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
        
        private void mergeHasMenuWidget(final BoolValue hasMenuWidget_) {
            hasMenuWidget_.getClass();
            final BoolValue hasMenuWidget_2 = this.hasMenuWidget_;
            if (hasMenuWidget_2 != null && hasMenuWidget_2 != BoolValue.getDefaultInstance()) {
                this.hasMenuWidget_ = (BoolValue)o.g(this.hasMenuWidget_, hasMenuWidget_);
            }
            else {
                this.hasMenuWidget_ = hasMenuWidget_;
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
        
        private void mergeHeaderSize(final Int64Value headerSize_) {
            headerSize_.getClass();
            final Int64Value headerSize_2 = this.headerSize_;
            if (headerSize_2 != null && headerSize_2 != Int64Value.getDefaultInstance()) {
                this.headerSize_ = (Int64Value)h.b(this.headerSize_, headerSize_);
            }
            else {
                this.headerSize_ = headerSize_;
            }
        }
        
        private void mergeHeaderTitle(final StringValue headerTitle_) {
            headerTitle_.getClass();
            final StringValue headerTitle_2 = this.headerTitle_;
            if (headerTitle_2 != null && headerTitle_2 != StringValue.getDefaultInstance()) {
                this.headerTitle_ = (StringValue)w.e(this.headerTitle_, headerTitle_);
            }
            else {
                this.headerTitle_ = headerTitle_;
            }
        }
        
        private void mergeHideAds(final BoolValue hideAds_) {
            hideAds_.getClass();
            final BoolValue hideAds_2 = this.hideAds_;
            if (hideAds_2 != null && hideAds_2 != BoolValue.getDefaultInstance()) {
                this.hideAds_ = (BoolValue)o.g(this.hideAds_, hideAds_);
            }
            else {
                this.hideAds_ = hideAds_;
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
        
        private void mergeIconSize(final Int64Value iconSize_) {
            iconSize_.getClass();
            final Int64Value iconSize_2 = this.iconSize_;
            if (iconSize_2 != null && iconSize_2 != Int64Value.getDefaultInstance()) {
                this.iconSize_ = (Int64Value)h.b(this.iconSize_, iconSize_);
            }
            else {
                this.iconSize_ = iconSize_;
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
        
        private void mergeIsChatPostFeatureEnabled(final BoolValue isChatPostFeatureEnabled_) {
            isChatPostFeatureEnabled_.getClass();
            final BoolValue isChatPostFeatureEnabled_2 = this.isChatPostFeatureEnabled_;
            if (isChatPostFeatureEnabled_2 != null && isChatPostFeatureEnabled_2 != BoolValue.getDefaultInstance()) {
                this.isChatPostFeatureEnabled_ = (BoolValue)o.g(this.isChatPostFeatureEnabled_, isChatPostFeatureEnabled_);
            }
            else {
                this.isChatPostFeatureEnabled_ = isChatPostFeatureEnabled_;
            }
        }
        
        private void mergeIsCrosspostableSubreddit(final BoolValue isCrosspostableSubreddit_) {
            isCrosspostableSubreddit_.getClass();
            final BoolValue isCrosspostableSubreddit_2 = this.isCrosspostableSubreddit_;
            if (isCrosspostableSubreddit_2 != null && isCrosspostableSubreddit_2 != BoolValue.getDefaultInstance()) {
                this.isCrosspostableSubreddit_ = (BoolValue)o.g(this.isCrosspostableSubreddit_, isCrosspostableSubreddit_);
            }
            else {
                this.isCrosspostableSubreddit_ = isCrosspostableSubreddit_;
            }
        }
        
        private void mergeIsEnrolledInNewModmail(final BoolValue isEnrolledInNewModmail_) {
            isEnrolledInNewModmail_.getClass();
            final BoolValue isEnrolledInNewModmail_2 = this.isEnrolledInNewModmail_;
            if (isEnrolledInNewModmail_2 != null && isEnrolledInNewModmail_2 != BoolValue.getDefaultInstance()) {
                this.isEnrolledInNewModmail_ = (BoolValue)o.g(this.isEnrolledInNewModmail_, isEnrolledInNewModmail_);
            }
            else {
                this.isEnrolledInNewModmail_ = isEnrolledInNewModmail_;
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
        
        private void mergeLang(final StringValue lang_) {
            lang_.getClass();
            final StringValue lang_2 = this.lang_;
            if (lang_2 != null && lang_2 != StringValue.getDefaultInstance()) {
                this.lang_ = (StringValue)w.e(this.lang_, lang_);
            }
            else {
                this.lang_ = lang_;
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
        
        private void mergeLinkFlairPosition(final StringValue linkFlairPosition_) {
            linkFlairPosition_.getClass();
            final StringValue linkFlairPosition_2 = this.linkFlairPosition_;
            if (linkFlairPosition_2 != null && linkFlairPosition_2 != StringValue.getDefaultInstance()) {
                this.linkFlairPosition_ = (StringValue)w.e(this.linkFlairPosition_, linkFlairPosition_);
            }
            else {
                this.linkFlairPosition_ = linkFlairPosition_;
            }
        }
        
        private void mergeMobileBannerImage(final StringValue mobileBannerImage_) {
            mobileBannerImage_.getClass();
            final StringValue mobileBannerImage_2 = this.mobileBannerImage_;
            if (mobileBannerImage_2 != null && mobileBannerImage_2 != StringValue.getDefaultInstance()) {
                this.mobileBannerImage_ = (StringValue)w.e(this.mobileBannerImage_, mobileBannerImage_);
            }
            else {
                this.mobileBannerImage_ = mobileBannerImage_;
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
        
        private void mergeNotificationLevel(final StringValue notificationLevel_) {
            notificationLevel_.getClass();
            final StringValue notificationLevel_2 = this.notificationLevel_;
            if (notificationLevel_2 != null && notificationLevel_2 != StringValue.getDefaultInstance()) {
                this.notificationLevel_ = (StringValue)w.e(this.notificationLevel_, notificationLevel_);
            }
            else {
                this.notificationLevel_ = notificationLevel_;
            }
        }
        
        private void mergeOriginalContentTagEnabled(final BoolValue originalContentTagEnabled_) {
            originalContentTagEnabled_.getClass();
            final BoolValue originalContentTagEnabled_2 = this.originalContentTagEnabled_;
            if (originalContentTagEnabled_2 != null && originalContentTagEnabled_2 != BoolValue.getDefaultInstance()) {
                this.originalContentTagEnabled_ = (BoolValue)o.g(this.originalContentTagEnabled_, originalContentTagEnabled_);
            }
            else {
                this.originalContentTagEnabled_ = originalContentTagEnabled_;
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
        
        private void mergePredictionLeaderboardEntryType(final StringValue predictionLeaderboardEntryType_) {
            predictionLeaderboardEntryType_.getClass();
            final StringValue predictionLeaderboardEntryType_2 = this.predictionLeaderboardEntryType_;
            if (predictionLeaderboardEntryType_2 != null && predictionLeaderboardEntryType_2 != StringValue.getDefaultInstance()) {
                this.predictionLeaderboardEntryType_ = (StringValue)w.e(this.predictionLeaderboardEntryType_, predictionLeaderboardEntryType_);
            }
            else {
                this.predictionLeaderboardEntryType_ = predictionLeaderboardEntryType_;
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
        
        private void mergePublicDescriptionHtml(final StringValue publicDescriptionHtml_) {
            publicDescriptionHtml_.getClass();
            final StringValue publicDescriptionHtml_2 = this.publicDescriptionHtml_;
            if (publicDescriptionHtml_2 != null && publicDescriptionHtml_2 != StringValue.getDefaultInstance()) {
                this.publicDescriptionHtml_ = (StringValue)w.e(this.publicDescriptionHtml_, publicDescriptionHtml_);
            }
            else {
                this.publicDescriptionHtml_ = publicDescriptionHtml_;
            }
        }
        
        private void mergePublicTraffic(final BoolValue publicTraffic_) {
            publicTraffic_.getClass();
            final BoolValue publicTraffic_2 = this.publicTraffic_;
            if (publicTraffic_2 != null && publicTraffic_2 != BoolValue.getDefaultInstance()) {
                this.publicTraffic_ = (BoolValue)o.g(this.publicTraffic_, publicTraffic_);
            }
            else {
                this.publicTraffic_ = publicTraffic_;
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
        
        private void mergeShouldArchivePosts(final BoolValue shouldArchivePosts_) {
            shouldArchivePosts_.getClass();
            final BoolValue shouldArchivePosts_2 = this.shouldArchivePosts_;
            if (shouldArchivePosts_2 != null && shouldArchivePosts_2 != BoolValue.getDefaultInstance()) {
                this.shouldArchivePosts_ = (BoolValue)o.g(this.shouldArchivePosts_, shouldArchivePosts_);
            }
            else {
                this.shouldArchivePosts_ = shouldArchivePosts_;
            }
        }
        
        private void mergeShouldShowMediaInCommentsSetting(final BoolValue shouldShowMediaInCommentsSetting_) {
            shouldShowMediaInCommentsSetting_.getClass();
            final BoolValue shouldShowMediaInCommentsSetting_2 = this.shouldShowMediaInCommentsSetting_;
            if (shouldShowMediaInCommentsSetting_2 != null && shouldShowMediaInCommentsSetting_2 != BoolValue.getDefaultInstance()) {
                this.shouldShowMediaInCommentsSetting_ = (BoolValue)o.g(this.shouldShowMediaInCommentsSetting_, shouldShowMediaInCommentsSetting_);
            }
            else {
                this.shouldShowMediaInCommentsSetting_ = shouldShowMediaInCommentsSetting_;
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
        
        private void mergeShowMediaPreview(final BoolValue showMediaPreview_) {
            showMediaPreview_.getClass();
            final BoolValue showMediaPreview_2 = this.showMediaPreview_;
            if (showMediaPreview_2 != null && showMediaPreview_2 != BoolValue.getDefaultInstance()) {
                this.showMediaPreview_ = (BoolValue)o.g(this.showMediaPreview_, showMediaPreview_);
            }
            else {
                this.showMediaPreview_ = showMediaPreview_;
            }
        }
        
        private void mergeSpoilersEnabled(final BoolValue spoilersEnabled_) {
            spoilersEnabled_.getClass();
            final BoolValue spoilersEnabled_2 = this.spoilersEnabled_;
            if (spoilersEnabled_2 != null && spoilersEnabled_2 != BoolValue.getDefaultInstance()) {
                this.spoilersEnabled_ = (BoolValue)o.g(this.spoilersEnabled_, spoilersEnabled_);
            }
            else {
                this.spoilersEnabled_ = spoilersEnabled_;
            }
        }
        
        private void mergeSubmissionType(final StringValue submissionType_) {
            submissionType_.getClass();
            final StringValue submissionType_2 = this.submissionType_;
            if (submissionType_2 != null && submissionType_2 != StringValue.getDefaultInstance()) {
                this.submissionType_ = (StringValue)w.e(this.submissionType_, submissionType_);
            }
            else {
                this.submissionType_ = submissionType_;
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
        
        private void mergeSubmitText(final StringValue submitText_) {
            submitText_.getClass();
            final StringValue submitText_2 = this.submitText_;
            if (submitText_2 != null && submitText_2 != StringValue.getDefaultInstance()) {
                this.submitText_ = (StringValue)w.e(this.submitText_, submitText_);
            }
            else {
                this.submitText_ = submitText_;
            }
        }
        
        private void mergeSubmitTextHtml(final StringValue submitTextHtml_) {
            submitTextHtml_.getClass();
            final StringValue submitTextHtml_2 = this.submitTextHtml_;
            if (submitTextHtml_2 != null && submitTextHtml_2 != StringValue.getDefaultInstance()) {
                this.submitTextHtml_ = (StringValue)w.e(this.submitTextHtml_, submitTextHtml_);
            }
            else {
                this.submitTextHtml_ = submitTextHtml_;
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
        
        private void mergeSuggestedCommentSort(final StringValue suggestedCommentSort_) {
            suggestedCommentSort_.getClass();
            final StringValue suggestedCommentSort_2 = this.suggestedCommentSort_;
            if (suggestedCommentSort_2 != null && suggestedCommentSort_2 != StringValue.getDefaultInstance()) {
                this.suggestedCommentSort_ = (StringValue)w.e(this.suggestedCommentSort_, suggestedCommentSort_);
            }
            else {
                this.suggestedCommentSort_ = suggestedCommentSort_;
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
        
        private void mergeUserCanFlairInSr(final BoolValue userCanFlairInSr_) {
            userCanFlairInSr_.getClass();
            final BoolValue userCanFlairInSr_2 = this.userCanFlairInSr_;
            if (userCanFlairInSr_2 != null && userCanFlairInSr_2 != BoolValue.getDefaultInstance()) {
                this.userCanFlairInSr_ = (BoolValue)o.g(this.userCanFlairInSr_, userCanFlairInSr_);
            }
            else {
                this.userCanFlairInSr_ = userCanFlairInSr_;
            }
        }
        
        private void mergeUserFlairBackgroundColor(final StringValue userFlairBackgroundColor_) {
            userFlairBackgroundColor_.getClass();
            final StringValue userFlairBackgroundColor_2 = this.userFlairBackgroundColor_;
            if (userFlairBackgroundColor_2 != null && userFlairBackgroundColor_2 != StringValue.getDefaultInstance()) {
                this.userFlairBackgroundColor_ = (StringValue)w.e(this.userFlairBackgroundColor_, userFlairBackgroundColor_);
            }
            else {
                this.userFlairBackgroundColor_ = userFlairBackgroundColor_;
            }
        }
        
        private void mergeUserFlairCssClass(final StringValue userFlairCssClass_) {
            userFlairCssClass_.getClass();
            final StringValue userFlairCssClass_2 = this.userFlairCssClass_;
            if (userFlairCssClass_2 != null && userFlairCssClass_2 != StringValue.getDefaultInstance()) {
                this.userFlairCssClass_ = (StringValue)w.e(this.userFlairCssClass_, userFlairCssClass_);
            }
            else {
                this.userFlairCssClass_ = userFlairCssClass_;
            }
        }
        
        private void mergeUserFlairEnabledInSr(final BoolValue userFlairEnabledInSr_) {
            userFlairEnabledInSr_.getClass();
            final BoolValue userFlairEnabledInSr_2 = this.userFlairEnabledInSr_;
            if (userFlairEnabledInSr_2 != null && userFlairEnabledInSr_2 != BoolValue.getDefaultInstance()) {
                this.userFlairEnabledInSr_ = (BoolValue)o.g(this.userFlairEnabledInSr_, userFlairEnabledInSr_);
            }
            else {
                this.userFlairEnabledInSr_ = userFlairEnabledInSr_;
            }
        }
        
        private void mergeUserFlairPosition(final StringValue userFlairPosition_) {
            userFlairPosition_.getClass();
            final StringValue userFlairPosition_2 = this.userFlairPosition_;
            if (userFlairPosition_2 != null && userFlairPosition_2 != StringValue.getDefaultInstance()) {
                this.userFlairPosition_ = (StringValue)w.e(this.userFlairPosition_, userFlairPosition_);
            }
            else {
                this.userFlairPosition_ = userFlairPosition_;
            }
        }
        
        private void mergeUserFlairTemplateId(final StringValue userFlairTemplateId_) {
            userFlairTemplateId_.getClass();
            final StringValue userFlairTemplateId_2 = this.userFlairTemplateId_;
            if (userFlairTemplateId_2 != null && userFlairTemplateId_2 != StringValue.getDefaultInstance()) {
                this.userFlairTemplateId_ = (StringValue)w.e(this.userFlairTemplateId_, userFlairTemplateId_);
            }
            else {
                this.userFlairTemplateId_ = userFlairTemplateId_;
            }
        }
        
        private void mergeUserFlairText(final StringValue userFlairText_) {
            userFlairText_.getClass();
            final StringValue userFlairText_2 = this.userFlairText_;
            if (userFlairText_2 != null && userFlairText_2 != StringValue.getDefaultInstance()) {
                this.userFlairText_ = (StringValue)w.e(this.userFlairText_, userFlairText_);
            }
            else {
                this.userFlairText_ = userFlairText_;
            }
        }
        
        private void mergeUserFlairTextColor(final StringValue userFlairTextColor_) {
            userFlairTextColor_.getClass();
            final StringValue userFlairTextColor_2 = this.userFlairTextColor_;
            if (userFlairTextColor_2 != null && userFlairTextColor_2 != StringValue.getDefaultInstance()) {
                this.userFlairTextColor_ = (StringValue)w.e(this.userFlairTextColor_, userFlairTextColor_);
            }
            else {
                this.userFlairTextColor_ = userFlairTextColor_;
            }
        }
        
        private void mergeUserFlairType(final StringValue userFlairType_) {
            userFlairType_.getClass();
            final StringValue userFlairType_2 = this.userFlairType_;
            if (userFlairType_2 != null && userFlairType_2 != StringValue.getDefaultInstance()) {
                this.userFlairType_ = (StringValue)w.e(this.userFlairType_, userFlairType_);
            }
            else {
                this.userFlairType_ = userFlairType_;
            }
        }
        
        private void mergeUserHasFavorited(final BoolValue userHasFavorited_) {
            userHasFavorited_.getClass();
            final BoolValue userHasFavorited_2 = this.userHasFavorited_;
            if (userHasFavorited_2 != null && userHasFavorited_2 != BoolValue.getDefaultInstance()) {
                this.userHasFavorited_ = (BoolValue)o.g(this.userHasFavorited_, userHasFavorited_);
            }
            else {
                this.userHasFavorited_ = userHasFavorited_;
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
        
        private void mergeUserSrFlairEnabled(final BoolValue userSrFlairEnabled_) {
            userSrFlairEnabled_.getClass();
            final BoolValue userSrFlairEnabled_2 = this.userSrFlairEnabled_;
            if (userSrFlairEnabled_2 != null && userSrFlairEnabled_2 != BoolValue.getDefaultInstance()) {
                this.userSrFlairEnabled_ = (BoolValue)o.g(this.userSrFlairEnabled_, userSrFlairEnabled_);
            }
            else {
                this.userSrFlairEnabled_ = userSrFlairEnabled_;
            }
        }
        
        private void mergeUserSrThemeEnabled(final BoolValue userSrThemeEnabled_) {
            userSrThemeEnabled_.getClass();
            final BoolValue userSrThemeEnabled_2 = this.userSrThemeEnabled_;
            if (userSrThemeEnabled_2 != null && userSrThemeEnabled_2 != BoolValue.getDefaultInstance()) {
                this.userSrThemeEnabled_ = (BoolValue)o.g(this.userSrThemeEnabled_, userSrThemeEnabled_);
            }
            else {
                this.userSrThemeEnabled_ = userSrThemeEnabled_;
            }
        }
        
        private void mergeWhitelistStatus(final BoolValue whitelistStatus_) {
            whitelistStatus_.getClass();
            final BoolValue whitelistStatus_2 = this.whitelistStatus_;
            if (whitelistStatus_2 != null && whitelistStatus_2 != BoolValue.getDefaultInstance()) {
                this.whitelistStatus_ = (BoolValue)o.g(this.whitelistStatus_, whitelistStatus_);
            }
            else {
                this.whitelistStatus_ = whitelistStatus_;
            }
        }
        
        private void mergeWikiEnabled(final BoolValue wikiEnabled_) {
            wikiEnabled_.getClass();
            final BoolValue wikiEnabled_2 = this.wikiEnabled_;
            if (wikiEnabled_2 != null && wikiEnabled_2 != BoolValue.getDefaultInstance()) {
                this.wikiEnabled_ = (BoolValue)o.g(this.wikiEnabled_, wikiEnabled_);
            }
            else {
                this.wikiEnabled_ = wikiEnabled_;
            }
        }
        
        private void mergeWls(final StringValue wls_) {
            wls_.getClass();
            final StringValue wls_2 = this.wls_;
            if (wls_2 != null && wls_2 != StringValue.getDefaultInstance()) {
                this.wls_ = (StringValue)w.e(this.wls_, wls_);
            }
            else {
                this.wls_ = wls_;
            }
        }
        
        public static a newBuilder() {
            return (a)AboutData.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final AboutData aboutData) {
            return (a)AboutData.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)aboutData);
        }
        
        public static AboutData parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (AboutData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AboutData parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AboutData)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AboutData parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, byteString);
        }
        
        public static AboutData parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static AboutData parseFrom(final l l) throws IOException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, l);
        }
        
        public static AboutData parseFrom(final l l, final d0 d0) throws IOException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, l, d0);
        }
        
        public static AboutData parseFrom(final InputStream inputStream) throws IOException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AboutData parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AboutData parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static AboutData parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static AboutData parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, array);
        }
        
        public static AboutData parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (AboutData)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<AboutData> parser() {
            return (n1<AboutData>)AboutData.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void removeAllowedMediaInComments(final int n) {
            this.ensureAllowedMediaInCommentsIsMutable();
            this.allowedMediaInComments_.remove(n);
        }
        
        private void removeUserFlairRichtext(final int n) {
            this.ensureUserFlairRichtextIsMutable();
            this.userFlairRichtext_.remove(n);
        }
        
        private void setAcceptFollowers(final BoolValue acceptFollowers_) {
            acceptFollowers_.getClass();
            this.acceptFollowers_ = acceptFollowers_;
        }
        
        private void setAccountsActive(final Int64Value accountsActive_) {
            accountsActive_.getClass();
            this.accountsActive_ = accountsActive_;
        }
        
        private void setAccountsActiveIsFuzzed(final BoolValue accountsActiveIsFuzzed_) {
            accountsActiveIsFuzzed_.getClass();
            this.accountsActiveIsFuzzed_ = accountsActiveIsFuzzed_;
        }
        
        private void setActiveUserCount(final Int64Value activeUserCount_) {
            activeUserCount_.getClass();
            this.activeUserCount_ = activeUserCount_;
        }
        
        private void setAdvertiserCategory(final StringValue advertiserCategory_) {
            advertiserCategory_.getClass();
            this.advertiserCategory_ = advertiserCategory_;
        }
        
        private void setAllOriginalContent(final BoolValue allOriginalContent_) {
            allOriginalContent_.getClass();
            this.allOriginalContent_ = allOriginalContent_;
        }
        
        private void setAllowChatPostCreation(final BoolValue allowChatPostCreation_) {
            allowChatPostCreation_.getClass();
            this.allowChatPostCreation_ = allowChatPostCreation_;
        }
        
        private void setAllowDiscovery(final BoolValue allowDiscovery_) {
            allowDiscovery_.getClass();
            this.allowDiscovery_ = allowDiscovery_;
        }
        
        private void setAllowGalleries(final BoolValue allowGalleries_) {
            allowGalleries_.getClass();
            this.allowGalleries_ = allowGalleries_;
        }
        
        private void setAllowImages(final BoolValue allowImages_) {
            allowImages_.getClass();
            this.allowImages_ = allowImages_;
        }
        
        private void setAllowPolls(final BoolValue allowPolls_) {
            allowPolls_.getClass();
            this.allowPolls_ = allowPolls_;
        }
        
        private void setAllowPredictionContributors(final BoolValue allowPredictionContributors_) {
            allowPredictionContributors_.getClass();
            this.allowPredictionContributors_ = allowPredictionContributors_;
        }
        
        private void setAllowPredictions(final BoolValue allowPredictions_) {
            allowPredictions_.getClass();
            this.allowPredictions_ = allowPredictions_;
        }
        
        private void setAllowPredictionsTournament(final BoolValue allowPredictionsTournament_) {
            allowPredictionsTournament_.getClass();
            this.allowPredictionsTournament_ = allowPredictionsTournament_;
        }
        
        private void setAllowTalks(final BoolValue allowTalks_) {
            allowTalks_.getClass();
            this.allowTalks_ = allowTalks_;
        }
        
        private void setAllowVideogifs(final BoolValue allowVideogifs_) {
            allowVideogifs_.getClass();
            this.allowVideogifs_ = allowVideogifs_;
        }
        
        private void setAllowVideos(final BoolValue allowVideos_) {
            allowVideos_.getClass();
            this.allowVideos_ = allowVideos_;
        }
        
        private void setAllowedMediaInComments(final int n, final StringValue stringValue) {
            stringValue.getClass();
            this.ensureAllowedMediaInCommentsIsMutable();
            ((List<StringValue>)this.allowedMediaInComments_).set(n, stringValue);
        }
        
        private void setBannerBackgroundColor(final StringValue bannerBackgroundColor_) {
            bannerBackgroundColor_.getClass();
            this.bannerBackgroundColor_ = bannerBackgroundColor_;
        }
        
        private void setBannerBackgroundImage(final StringValue bannerBackgroundImage_) {
            bannerBackgroundImage_.getClass();
            this.bannerBackgroundImage_ = bannerBackgroundImage_;
        }
        
        private void setBannerImg(final StringValue bannerImg_) {
            bannerImg_.getClass();
            this.bannerImg_ = bannerImg_;
        }
        
        private void setBannerSize(final Int64Value bannerSize_) {
            bannerSize_.getClass();
            this.bannerSize_ = bannerSize_;
        }
        
        private void setCanAssignLinkFlair(final BoolValue canAssignLinkFlair_) {
            canAssignLinkFlair_.getClass();
            this.canAssignLinkFlair_ = canAssignLinkFlair_;
        }
        
        private void setCanAssignUserFlair(final BoolValue canAssignUserFlair_) {
            canAssignUserFlair_.getClass();
            this.canAssignUserFlair_ = canAssignUserFlair_;
        }
        
        private void setCoins(final Int64Value coins_) {
            coins_.getClass();
            this.coins_ = coins_;
        }
        
        private void setCollapseDeletedComments(final BoolValue collapseDeletedComments_) {
            collapseDeletedComments_.getClass();
            this.collapseDeletedComments_ = collapseDeletedComments_;
        }
        
        private void setCollectionsEnabled(final BoolValue collectionsEnabled_) {
            collectionsEnabled_.getClass();
            this.collectionsEnabled_ = collectionsEnabled_;
        }
        
        private void setCommentContributionSettings(final SubredditsMsg$CommentContributionSettings commentContributionSettings_) {
            commentContributionSettings_.getClass();
            this.commentContributionSettings_ = commentContributionSettings_;
        }
        
        private void setCommentScoreHideMins(final Int32Value commentScoreHideMins_) {
            commentScoreHideMins_.getClass();
            this.commentScoreHideMins_ = commentScoreHideMins_;
        }
        
        private void setCommunityIcon(final StringValue communityIcon_) {
            communityIcon_.getClass();
            this.communityIcon_ = communityIcon_;
        }
        
        private void setCommunityReviewed(final BoolValue communityReviewed_) {
            communityReviewed_.getClass();
            this.communityReviewed_ = communityReviewed_;
        }
        
        private void setCreated(final Int64Value created_) {
            created_.getClass();
            this.created_ = created_;
        }
        
        private void setCreatedUtc(final Int64Value createdUtc_) {
            createdUtc_.getClass();
            this.createdUtc_ = createdUtc_;
        }
        
        private void setDescription(final StringValue description_) {
            description_.getClass();
            this.description_ = description_;
        }
        
        private void setDescriptionHtml(final StringValue descriptionHtml_) {
            descriptionHtml_.getClass();
            this.descriptionHtml_ = descriptionHtml_;
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
        
        private void setEmojisCustomSize(final Int64Value emojisCustomSize_) {
            emojisCustomSize_.getClass();
            this.emojisCustomSize_ = emojisCustomSize_;
        }
        
        private void setEmojisEnabled(final BoolValue emojisEnabled_) {
            emojisEnabled_.getClass();
            this.emojisEnabled_ = emojisEnabled_;
        }
        
        private void setEventPostsEnabled(final BoolValue eventPostsEnabled_) {
            eventPostsEnabled_.getClass();
            this.eventPostsEnabled_ = eventPostsEnabled_;
        }
        
        private void setFreeFormReports(final BoolValue freeFormReports_) {
            freeFormReports_.getClass();
            this.freeFormReports_ = freeFormReports_;
        }
        
        private void setHasMenuWidget(final BoolValue hasMenuWidget_) {
            hasMenuWidget_.getClass();
            this.hasMenuWidget_ = hasMenuWidget_;
        }
        
        private void setHeaderImg(final StringValue headerImg_) {
            headerImg_.getClass();
            this.headerImg_ = headerImg_;
        }
        
        private void setHeaderSize(final Int64Value headerSize_) {
            headerSize_.getClass();
            this.headerSize_ = headerSize_;
        }
        
        private void setHeaderTitle(final StringValue headerTitle_) {
            headerTitle_.getClass();
            this.headerTitle_ = headerTitle_;
        }
        
        private void setHideAds(final BoolValue hideAds_) {
            hideAds_.getClass();
            this.hideAds_ = hideAds_;
        }
        
        private void setIconImg(final StringValue iconImg_) {
            iconImg_.getClass();
            this.iconImg_ = iconImg_;
        }
        
        private void setIconSize(final Int64Value iconSize_) {
            iconSize_.getClass();
            this.iconSize_ = iconSize_;
        }
        
        private void setId(final StringValue id_) {
            id_.getClass();
            this.id_ = id_;
        }
        
        private void setIsChatPostFeatureEnabled(final BoolValue isChatPostFeatureEnabled_) {
            isChatPostFeatureEnabled_.getClass();
            this.isChatPostFeatureEnabled_ = isChatPostFeatureEnabled_;
        }
        
        private void setIsCrosspostableSubreddit(final BoolValue isCrosspostableSubreddit_) {
            isCrosspostableSubreddit_.getClass();
            this.isCrosspostableSubreddit_ = isCrosspostableSubreddit_;
        }
        
        private void setIsEnrolledInNewModmail(final BoolValue isEnrolledInNewModmail_) {
            isEnrolledInNewModmail_.getClass();
            this.isEnrolledInNewModmail_ = isEnrolledInNewModmail_;
        }
        
        private void setKeyColor(final StringValue keyColor_) {
            keyColor_.getClass();
            this.keyColor_ = keyColor_;
        }
        
        private void setLang(final StringValue lang_) {
            lang_.getClass();
            this.lang_ = lang_;
        }
        
        private void setLinkFlairEnabled(final BoolValue linkFlairEnabled_) {
            linkFlairEnabled_.getClass();
            this.linkFlairEnabled_ = linkFlairEnabled_;
        }
        
        private void setLinkFlairPosition(final StringValue linkFlairPosition_) {
            linkFlairPosition_.getClass();
            this.linkFlairPosition_ = linkFlairPosition_;
        }
        
        private void setMobileBannerImage(final StringValue mobileBannerImage_) {
            mobileBannerImage_.getClass();
            this.mobileBannerImage_ = mobileBannerImage_;
        }
        
        private void setName(final StringValue name_) {
            name_.getClass();
            this.name_ = name_;
        }
        
        private void setNotificationLevel(final StringValue notificationLevel_) {
            notificationLevel_.getClass();
            this.notificationLevel_ = notificationLevel_;
        }
        
        private void setOriginalContentTagEnabled(final BoolValue originalContentTagEnabled_) {
            originalContentTagEnabled_.getClass();
            this.originalContentTagEnabled_ = originalContentTagEnabled_;
        }
        
        private void setOver18(final BoolValue over18_) {
            over18_.getClass();
            this.over18_ = over18_;
        }
        
        private void setPredictionLeaderboardEntryType(final StringValue predictionLeaderboardEntryType_) {
            predictionLeaderboardEntryType_.getClass();
            this.predictionLeaderboardEntryType_ = predictionLeaderboardEntryType_;
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
        
        private void setPublicTraffic(final BoolValue publicTraffic_) {
            publicTraffic_.getClass();
            this.publicTraffic_ = publicTraffic_;
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
        
        private void setShouldArchivePosts(final BoolValue shouldArchivePosts_) {
            shouldArchivePosts_.getClass();
            this.shouldArchivePosts_ = shouldArchivePosts_;
        }
        
        private void setShouldShowMediaInCommentsSetting(final BoolValue shouldShowMediaInCommentsSetting_) {
            shouldShowMediaInCommentsSetting_.getClass();
            this.shouldShowMediaInCommentsSetting_ = shouldShowMediaInCommentsSetting_;
        }
        
        private void setShowMedia(final BoolValue showMedia_) {
            showMedia_.getClass();
            this.showMedia_ = showMedia_;
        }
        
        private void setShowMediaPreview(final BoolValue showMediaPreview_) {
            showMediaPreview_.getClass();
            this.showMediaPreview_ = showMediaPreview_;
        }
        
        private void setSpoilersEnabled(final BoolValue spoilersEnabled_) {
            spoilersEnabled_.getClass();
            this.spoilersEnabled_ = spoilersEnabled_;
        }
        
        private void setSubmissionType(final StringValue submissionType_) {
            submissionType_.getClass();
            this.submissionType_ = submissionType_;
        }
        
        private void setSubmitLinkLabel(final StringValue submitLinkLabel_) {
            submitLinkLabel_.getClass();
            this.submitLinkLabel_ = submitLinkLabel_;
        }
        
        private void setSubmitText(final StringValue submitText_) {
            submitText_.getClass();
            this.submitText_ = submitText_;
        }
        
        private void setSubmitTextHtml(final StringValue submitTextHtml_) {
            submitTextHtml_.getClass();
            this.submitTextHtml_ = submitTextHtml_;
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
        
        private void setSuggestedCommentSort(final StringValue suggestedCommentSort_) {
            suggestedCommentSort_.getClass();
            this.suggestedCommentSort_ = suggestedCommentSort_;
        }
        
        private void setTitle(final StringValue title_) {
            title_.getClass();
            this.title_ = title_;
        }
        
        private void setUrl(final StringValue url_) {
            url_.getClass();
            this.url_ = url_;
        }
        
        private void setUserCanFlairInSr(final BoolValue userCanFlairInSr_) {
            userCanFlairInSr_.getClass();
            this.userCanFlairInSr_ = userCanFlairInSr_;
        }
        
        private void setUserFlairBackgroundColor(final StringValue userFlairBackgroundColor_) {
            userFlairBackgroundColor_.getClass();
            this.userFlairBackgroundColor_ = userFlairBackgroundColor_;
        }
        
        private void setUserFlairCssClass(final StringValue userFlairCssClass_) {
            userFlairCssClass_.getClass();
            this.userFlairCssClass_ = userFlairCssClass_;
        }
        
        private void setUserFlairEnabledInSr(final BoolValue userFlairEnabledInSr_) {
            userFlairEnabledInSr_.getClass();
            this.userFlairEnabledInSr_ = userFlairEnabledInSr_;
        }
        
        private void setUserFlairPosition(final StringValue userFlairPosition_) {
            userFlairPosition_.getClass();
            this.userFlairPosition_ = userFlairPosition_;
        }
        
        private void setUserFlairRichtext(final int n, final UserFlairRichtext userFlairRichtext) {
            userFlairRichtext.getClass();
            this.ensureUserFlairRichtextIsMutable();
            ((List<UserFlairRichtext>)this.userFlairRichtext_).set(n, userFlairRichtext);
        }
        
        private void setUserFlairTemplateId(final StringValue userFlairTemplateId_) {
            userFlairTemplateId_.getClass();
            this.userFlairTemplateId_ = userFlairTemplateId_;
        }
        
        private void setUserFlairText(final StringValue userFlairText_) {
            userFlairText_.getClass();
            this.userFlairText_ = userFlairText_;
        }
        
        private void setUserFlairTextColor(final StringValue userFlairTextColor_) {
            userFlairTextColor_.getClass();
            this.userFlairTextColor_ = userFlairTextColor_;
        }
        
        private void setUserFlairType(final StringValue userFlairType_) {
            userFlairType_.getClass();
            this.userFlairType_ = userFlairType_;
        }
        
        private void setUserHasFavorited(final BoolValue userHasFavorited_) {
            userHasFavorited_.getClass();
            this.userHasFavorited_ = userHasFavorited_;
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
        
        private void setUserSrFlairEnabled(final BoolValue userSrFlairEnabled_) {
            userSrFlairEnabled_.getClass();
            this.userSrFlairEnabled_ = userSrFlairEnabled_;
        }
        
        private void setUserSrThemeEnabled(final BoolValue userSrThemeEnabled_) {
            userSrThemeEnabled_.getClass();
            this.userSrThemeEnabled_ = userSrThemeEnabled_;
        }
        
        private void setWhitelistStatus(final BoolValue whitelistStatus_) {
            whitelistStatus_.getClass();
            this.whitelistStatus_ = whitelistStatus_;
        }
        
        private void setWikiEnabled(final BoolValue wikiEnabled_) {
            wikiEnabled_.getClass();
            this.wikiEnabled_ = wikiEnabled_;
        }
        
        private void setWls(final StringValue wls_) {
            wls_.getClass();
            this.wls_ = wls_;
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
                    final n1<AboutData> parser;
                    if ((parser = AboutData.PARSER) == null) {
                        synchronized (AboutData.class) {
                            if (AboutData.PARSER == null) {
                                AboutData.PARSER = (n1<AboutData>)new GeneratedMessageLite$c((GeneratedMessageLite)AboutData.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return AboutData.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)AboutData.DEFAULT_INSTANCE, "\u0000j\u0000\u0000\u0001jj\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\u001b\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t \t!\t\"\t#\t$\t%\t&\t'\t(\t)\t*\t+\t,\t-\t.\t/\t0\t1\t2\t3\t4\t5\t6\t7\u001b8\t9\t:\t;\t<\t=\t>\t?\t@\tA\tB\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ\t[\t\\\t]\t^\t_\t`\ta\tb\tc\td\te\tf\tg\th\ti\tj\t", new Object[] { "userFlairBackgroundColor_", "submitTextHtml_", "restrictPosting_", "userIsBanned_", "freeFormReports_", "wikiEnabled_", "userIsMuted_", "userCanFlairInSr_", "displayName_", "headerImg_", "title_", "allowGalleries_", "iconSize_", "primaryColor_", "activeUserCount_", "iconImg_", "displayNamePrefixed_", "accountsActive_", "publicTraffic_", "subscribers_", "userFlairRichtext_", UserFlairRichtext.class, "name_", "quarantine_", "hideAds_", "predictionLeaderboardEntryType_", "emojisEnabled_", "advertiserCategory_", "publicDescription_", "commentScoreHideMins_", "allowPredictions_", "userHasFavorited_", "userFlairTemplateId_", "communityIcon_", "bannerBackgroundImage_", "originalContentTagEnabled_", "communityReviewed_", "submitText_", "descriptionHtml_", "spoilersEnabled_", "commentContributionSettings_", "allowTalks_", "headerSize_", "userFlairPosition_", "allOriginalContent_", "collectionsEnabled_", "isEnrolledInNewModmail_", "keyColor_", "eventPostsEnabled_", "canAssignUserFlair_", "created_", "wls_", "showMediaPreview_", "submissionType_", "userIsSubscriber_", "allowedMediaInComments_", StringValue.class, "allowVideogifs_", "shouldArchivePosts_", "userFlairType_", "allowPolls_", "collapseDeletedComments_", "coins_", "emojisCustomSize_", "publicDescriptionHtml_", "allowVideos_", "isCrosspostableSubreddit_", "notificationLevel_", "shouldShowMediaInCommentsSetting_", "canAssignLinkFlair_", "hasMenuWidget_", "accountsActiveIsFuzzed_", "allowPredictionContributors_", "submitTextLabel_", "linkFlairPosition_", "userSrFlairEnabled_", "userFlairEnabledInSr_", "allowChatPostCreation_", "allowDiscovery_", "acceptFollowers_", "userSrThemeEnabled_", "linkFlairEnabled_", "disableContributorRequests_", "subredditType_", "suggestedCommentSort_", "bannerImg_", "userFlairText_", "bannerBackgroundColor_", "showMedia_", "id_", "userIsModerator_", "over18_", "headerTitle_", "description_", "isChatPostFeatureEnabled_", "submitLinkLabel_", "userFlairTextColor_", "restrictCommenting_", "userFlairCssClass_", "allowImages_", "lang_", "whitelistStatus_", "url_", "createdUtc_", "bannerSize_", "mobileBannerImage_", "userIsContributor_", "allowPredictionsTournament_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new AboutData();
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
        
        public Int64Value getAccountsActive() {
            Int64Value int64Value;
            if ((int64Value = this.accountsActive_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public BoolValue getAccountsActiveIsFuzzed() {
            BoolValue boolValue;
            if ((boolValue = this.accountsActiveIsFuzzed_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int64Value getActiveUserCount() {
            Int64Value int64Value;
            if ((int64Value = this.activeUserCount_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getAdvertiserCategory() {
            StringValue stringValue;
            if ((stringValue = this.advertiserCategory_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getAllOriginalContent() {
            BoolValue boolValue;
            if ((boolValue = this.allOriginalContent_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowChatPostCreation() {
            BoolValue boolValue;
            if ((boolValue = this.allowChatPostCreation_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowDiscovery() {
            BoolValue boolValue;
            if ((boolValue = this.allowDiscovery_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowGalleries() {
            BoolValue boolValue;
            if ((boolValue = this.allowGalleries_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowImages() {
            BoolValue boolValue;
            if ((boolValue = this.allowImages_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowPolls() {
            BoolValue boolValue;
            if ((boolValue = this.allowPolls_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowPredictionContributors() {
            BoolValue boolValue;
            if ((boolValue = this.allowPredictionContributors_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowPredictions() {
            BoolValue boolValue;
            if ((boolValue = this.allowPredictions_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowPredictionsTournament() {
            BoolValue boolValue;
            if ((boolValue = this.allowPredictionsTournament_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowTalks() {
            BoolValue boolValue;
            if ((boolValue = this.allowTalks_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowVideogifs() {
            BoolValue boolValue;
            if ((boolValue = this.allowVideogifs_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getAllowVideos() {
            BoolValue boolValue;
            if ((boolValue = this.allowVideos_) == null) {
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
        
        public StringValue getBannerBackgroundColor() {
            StringValue stringValue;
            if ((stringValue = this.bannerBackgroundColor_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getBannerBackgroundImage() {
            StringValue stringValue;
            if ((stringValue = this.bannerBackgroundImage_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getBannerImg() {
            StringValue stringValue;
            if ((stringValue = this.bannerImg_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int64Value getBannerSize() {
            Int64Value int64Value;
            if ((int64Value = this.bannerSize_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public BoolValue getCanAssignLinkFlair() {
            BoolValue boolValue;
            if ((boolValue = this.canAssignLinkFlair_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getCanAssignUserFlair() {
            BoolValue boolValue;
            if ((boolValue = this.canAssignUserFlair_) == null) {
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
        
        public BoolValue getCollapseDeletedComments() {
            BoolValue boolValue;
            if ((boolValue = this.collapseDeletedComments_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getCollectionsEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.collectionsEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public SubredditsMsg$CommentContributionSettings getCommentContributionSettings() {
            SubredditsMsg$CommentContributionSettings subredditsMsg$CommentContributionSettings;
            if ((subredditsMsg$CommentContributionSettings = this.commentContributionSettings_) == null) {
                subredditsMsg$CommentContributionSettings = SubredditsMsg$CommentContributionSettings.getDefaultInstance();
            }
            return subredditsMsg$CommentContributionSettings;
        }
        
        public Int32Value getCommentScoreHideMins() {
            Int32Value int32Value;
            if ((int32Value = this.commentScoreHideMins_) == null) {
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
        
        public BoolValue getCommunityReviewed() {
            BoolValue boolValue;
            if ((boolValue = this.communityReviewed_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
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
        
        public StringValue getDescription() {
            StringValue stringValue;
            if ((stringValue = this.description_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getDescriptionHtml() {
            StringValue stringValue;
            if ((stringValue = this.descriptionHtml_) == null) {
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
        
        public Int64Value getEmojisCustomSize() {
            Int64Value int64Value;
            if ((int64Value = this.emojisCustomSize_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public BoolValue getEmojisEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.emojisEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getEventPostsEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.eventPostsEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getFreeFormReports() {
            BoolValue boolValue;
            if ((boolValue = this.freeFormReports_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getHasMenuWidget() {
            BoolValue boolValue;
            if ((boolValue = this.hasMenuWidget_) == null) {
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
        
        public Int64Value getHeaderSize() {
            Int64Value int64Value;
            if ((int64Value = this.headerSize_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getHeaderTitle() {
            StringValue stringValue;
            if ((stringValue = this.headerTitle_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getHideAds() {
            BoolValue boolValue;
            if ((boolValue = this.hideAds_) == null) {
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
        
        public Int64Value getIconSize() {
            Int64Value int64Value;
            if ((int64Value = this.iconSize_) == null) {
                int64Value = Int64Value.getDefaultInstance();
            }
            return int64Value;
        }
        
        public StringValue getId() {
            StringValue stringValue;
            if ((stringValue = this.id_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getIsChatPostFeatureEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.isChatPostFeatureEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsCrosspostableSubreddit() {
            BoolValue boolValue;
            if ((boolValue = this.isCrosspostableSubreddit_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getIsEnrolledInNewModmail() {
            BoolValue boolValue;
            if ((boolValue = this.isEnrolledInNewModmail_) == null) {
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
        
        public StringValue getLang() {
            StringValue stringValue;
            if ((stringValue = this.lang_) == null) {
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
        
        public StringValue getMobileBannerImage() {
            StringValue stringValue;
            if ((stringValue = this.mobileBannerImage_) == null) {
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
        
        public StringValue getNotificationLevel() {
            StringValue stringValue;
            if ((stringValue = this.notificationLevel_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getOriginalContentTagEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.originalContentTagEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getOver18() {
            BoolValue boolValue;
            if ((boolValue = this.over18_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getPredictionLeaderboardEntryType() {
            StringValue stringValue;
            if ((stringValue = this.predictionLeaderboardEntryType_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
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
        
        public BoolValue getPublicTraffic() {
            BoolValue boolValue;
            if ((boolValue = this.publicTraffic_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
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
        
        public BoolValue getShouldArchivePosts() {
            BoolValue boolValue;
            if ((boolValue = this.shouldArchivePosts_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getShouldShowMediaInCommentsSetting() {
            BoolValue boolValue;
            if ((boolValue = this.shouldShowMediaInCommentsSetting_) == null) {
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
        
        public BoolValue getShowMediaPreview() {
            BoolValue boolValue;
            if ((boolValue = this.showMediaPreview_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getSpoilersEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.spoilersEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getSubmissionType() {
            StringValue stringValue;
            if ((stringValue = this.submissionType_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSubmitLinkLabel() {
            StringValue stringValue;
            if ((stringValue = this.submitLinkLabel_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSubmitText() {
            StringValue stringValue;
            if ((stringValue = this.submitText_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSubmitTextHtml() {
            StringValue stringValue;
            if ((stringValue = this.submitTextHtml_) == null) {
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
        
        public StringValue getSuggestedCommentSort() {
            StringValue stringValue;
            if ((stringValue = this.suggestedCommentSort_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
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
        
        public BoolValue getUserCanFlairInSr() {
            BoolValue boolValue;
            if ((boolValue = this.userCanFlairInSr_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getUserFlairBackgroundColor() {
            StringValue stringValue;
            if ((stringValue = this.userFlairBackgroundColor_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getUserFlairCssClass() {
            StringValue stringValue;
            if ((stringValue = this.userFlairCssClass_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getUserFlairEnabledInSr() {
            BoolValue boolValue;
            if ((boolValue = this.userFlairEnabledInSr_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getUserFlairPosition() {
            StringValue stringValue;
            if ((stringValue = this.userFlairPosition_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public UserFlairRichtext getUserFlairRichtext(final int n) {
            return ((List<UserFlairRichtext>)this.userFlairRichtext_).get(n);
        }
        
        public int getUserFlairRichtextCount() {
            return ((List)this.userFlairRichtext_).size();
        }
        
        public List<UserFlairRichtext> getUserFlairRichtextList() {
            return (List<UserFlairRichtext>)this.userFlairRichtext_;
        }
        
        public SubredditsMsg$SubredditAboutResponse$AboutData$b getUserFlairRichtextOrBuilder(final int n) {
            return ((List<SubredditsMsg$SubredditAboutResponse$AboutData$b>)this.userFlairRichtext_).get(n);
        }
        
        public List<? extends SubredditsMsg$SubredditAboutResponse$AboutData$b> getUserFlairRichtextOrBuilderList() {
            return (List<? extends SubredditsMsg$SubredditAboutResponse$AboutData$b>)this.userFlairRichtext_;
        }
        
        public StringValue getUserFlairTemplateId() {
            StringValue stringValue;
            if ((stringValue = this.userFlairTemplateId_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getUserFlairText() {
            StringValue stringValue;
            if ((stringValue = this.userFlairText_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getUserFlairTextColor() {
            StringValue stringValue;
            if ((stringValue = this.userFlairTextColor_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getUserFlairType() {
            StringValue stringValue;
            if ((stringValue = this.userFlairType_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getUserHasFavorited() {
            BoolValue boolValue;
            if ((boolValue = this.userHasFavorited_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
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
        
        public BoolValue getUserSrFlairEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.userSrFlairEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getUserSrThemeEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.userSrThemeEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getWhitelistStatus() {
            BoolValue boolValue;
            if ((boolValue = this.whitelistStatus_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getWikiEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.wikiEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getWls() {
            StringValue stringValue;
            if ((stringValue = this.wls_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasAcceptFollowers() {
            return this.acceptFollowers_ != null;
        }
        
        public boolean hasAccountsActive() {
            return this.accountsActive_ != null;
        }
        
        public boolean hasAccountsActiveIsFuzzed() {
            return this.accountsActiveIsFuzzed_ != null;
        }
        
        public boolean hasActiveUserCount() {
            return this.activeUserCount_ != null;
        }
        
        public boolean hasAdvertiserCategory() {
            return this.advertiserCategory_ != null;
        }
        
        public boolean hasAllOriginalContent() {
            return this.allOriginalContent_ != null;
        }
        
        public boolean hasAllowChatPostCreation() {
            return this.allowChatPostCreation_ != null;
        }
        
        public boolean hasAllowDiscovery() {
            return this.allowDiscovery_ != null;
        }
        
        public boolean hasAllowGalleries() {
            return this.allowGalleries_ != null;
        }
        
        public boolean hasAllowImages() {
            return this.allowImages_ != null;
        }
        
        public boolean hasAllowPolls() {
            return this.allowPolls_ != null;
        }
        
        public boolean hasAllowPredictionContributors() {
            return this.allowPredictionContributors_ != null;
        }
        
        public boolean hasAllowPredictions() {
            return this.allowPredictions_ != null;
        }
        
        public boolean hasAllowPredictionsTournament() {
            return this.allowPredictionsTournament_ != null;
        }
        
        public boolean hasAllowTalks() {
            return this.allowTalks_ != null;
        }
        
        public boolean hasAllowVideogifs() {
            return this.allowVideogifs_ != null;
        }
        
        public boolean hasAllowVideos() {
            return this.allowVideos_ != null;
        }
        
        public boolean hasBannerBackgroundColor() {
            return this.bannerBackgroundColor_ != null;
        }
        
        public boolean hasBannerBackgroundImage() {
            return this.bannerBackgroundImage_ != null;
        }
        
        public boolean hasBannerImg() {
            return this.bannerImg_ != null;
        }
        
        public boolean hasBannerSize() {
            return this.bannerSize_ != null;
        }
        
        public boolean hasCanAssignLinkFlair() {
            return this.canAssignLinkFlair_ != null;
        }
        
        public boolean hasCanAssignUserFlair() {
            return this.canAssignUserFlair_ != null;
        }
        
        public boolean hasCoins() {
            return this.coins_ != null;
        }
        
        public boolean hasCollapseDeletedComments() {
            return this.collapseDeletedComments_ != null;
        }
        
        public boolean hasCollectionsEnabled() {
            return this.collectionsEnabled_ != null;
        }
        
        public boolean hasCommentContributionSettings() {
            return this.commentContributionSettings_ != null;
        }
        
        public boolean hasCommentScoreHideMins() {
            return this.commentScoreHideMins_ != null;
        }
        
        public boolean hasCommunityIcon() {
            return this.communityIcon_ != null;
        }
        
        public boolean hasCommunityReviewed() {
            return this.communityReviewed_ != null;
        }
        
        public boolean hasCreated() {
            return this.created_ != null;
        }
        
        public boolean hasCreatedUtc() {
            return this.createdUtc_ != null;
        }
        
        public boolean hasDescription() {
            return this.description_ != null;
        }
        
        public boolean hasDescriptionHtml() {
            return this.descriptionHtml_ != null;
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
        
        public boolean hasEmojisCustomSize() {
            return this.emojisCustomSize_ != null;
        }
        
        public boolean hasEmojisEnabled() {
            return this.emojisEnabled_ != null;
        }
        
        public boolean hasEventPostsEnabled() {
            return this.eventPostsEnabled_ != null;
        }
        
        public boolean hasFreeFormReports() {
            return this.freeFormReports_ != null;
        }
        
        public boolean hasHasMenuWidget() {
            return this.hasMenuWidget_ != null;
        }
        
        public boolean hasHeaderImg() {
            return this.headerImg_ != null;
        }
        
        public boolean hasHeaderSize() {
            return this.headerSize_ != null;
        }
        
        public boolean hasHeaderTitle() {
            return this.headerTitle_ != null;
        }
        
        public boolean hasHideAds() {
            return this.hideAds_ != null;
        }
        
        public boolean hasIconImg() {
            return this.iconImg_ != null;
        }
        
        public boolean hasIconSize() {
            return this.iconSize_ != null;
        }
        
        public boolean hasId() {
            return this.id_ != null;
        }
        
        public boolean hasIsChatPostFeatureEnabled() {
            return this.isChatPostFeatureEnabled_ != null;
        }
        
        public boolean hasIsCrosspostableSubreddit() {
            return this.isCrosspostableSubreddit_ != null;
        }
        
        public boolean hasIsEnrolledInNewModmail() {
            return this.isEnrolledInNewModmail_ != null;
        }
        
        public boolean hasKeyColor() {
            return this.keyColor_ != null;
        }
        
        public boolean hasLang() {
            return this.lang_ != null;
        }
        
        public boolean hasLinkFlairEnabled() {
            return this.linkFlairEnabled_ != null;
        }
        
        public boolean hasLinkFlairPosition() {
            return this.linkFlairPosition_ != null;
        }
        
        public boolean hasMobileBannerImage() {
            return this.mobileBannerImage_ != null;
        }
        
        public boolean hasName() {
            return this.name_ != null;
        }
        
        public boolean hasNotificationLevel() {
            return this.notificationLevel_ != null;
        }
        
        public boolean hasOriginalContentTagEnabled() {
            return this.originalContentTagEnabled_ != null;
        }
        
        public boolean hasOver18() {
            return this.over18_ != null;
        }
        
        public boolean hasPredictionLeaderboardEntryType() {
            return this.predictionLeaderboardEntryType_ != null;
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
        
        public boolean hasPublicTraffic() {
            return this.publicTraffic_ != null;
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
        
        public boolean hasShouldArchivePosts() {
            return this.shouldArchivePosts_ != null;
        }
        
        public boolean hasShouldShowMediaInCommentsSetting() {
            return this.shouldShowMediaInCommentsSetting_ != null;
        }
        
        public boolean hasShowMedia() {
            return this.showMedia_ != null;
        }
        
        public boolean hasShowMediaPreview() {
            return this.showMediaPreview_ != null;
        }
        
        public boolean hasSpoilersEnabled() {
            return this.spoilersEnabled_ != null;
        }
        
        public boolean hasSubmissionType() {
            return this.submissionType_ != null;
        }
        
        public boolean hasSubmitLinkLabel() {
            return this.submitLinkLabel_ != null;
        }
        
        public boolean hasSubmitText() {
            return this.submitText_ != null;
        }
        
        public boolean hasSubmitTextHtml() {
            return this.submitTextHtml_ != null;
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
        
        public boolean hasSuggestedCommentSort() {
            return this.suggestedCommentSort_ != null;
        }
        
        public boolean hasTitle() {
            return this.title_ != null;
        }
        
        public boolean hasUrl() {
            return this.url_ != null;
        }
        
        public boolean hasUserCanFlairInSr() {
            return this.userCanFlairInSr_ != null;
        }
        
        public boolean hasUserFlairBackgroundColor() {
            return this.userFlairBackgroundColor_ != null;
        }
        
        public boolean hasUserFlairCssClass() {
            return this.userFlairCssClass_ != null;
        }
        
        public boolean hasUserFlairEnabledInSr() {
            return this.userFlairEnabledInSr_ != null;
        }
        
        public boolean hasUserFlairPosition() {
            return this.userFlairPosition_ != null;
        }
        
        public boolean hasUserFlairTemplateId() {
            return this.userFlairTemplateId_ != null;
        }
        
        public boolean hasUserFlairText() {
            return this.userFlairText_ != null;
        }
        
        public boolean hasUserFlairTextColor() {
            return this.userFlairTextColor_ != null;
        }
        
        public boolean hasUserFlairType() {
            return this.userFlairType_ != null;
        }
        
        public boolean hasUserHasFavorited() {
            return this.userHasFavorited_ != null;
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
        
        public boolean hasUserSrFlairEnabled() {
            return this.userSrFlairEnabled_ != null;
        }
        
        public boolean hasUserSrThemeEnabled() {
            return this.userSrThemeEnabled_ != null;
        }
        
        public boolean hasWhitelistStatus() {
            return this.whitelistStatus_ != null;
        }
        
        public boolean hasWikiEnabled() {
            return this.wikiEnabled_ != null;
        }
        
        public boolean hasWls() {
            return this.wls_ != null;
        }
        
        public static final class UserFlairRichtext extends GeneratedMessageLite<UserFlairRichtext, a> implements SubredditsMsg$SubredditAboutResponse$AboutData$b
        {
            private static final UserFlairRichtext DEFAULT_INSTANCE;
            public static final int E_FIELD_NUMBER = 1;
            private static volatile n1<UserFlairRichtext> PARSER;
            public static final int T_FIELD_NUMBER = 2;
            private StringValue e_;
            private StringValue t_;
            
            static {
                GeneratedMessageLite.registerDefaultInstance((Class)UserFlairRichtext.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UserFlairRichtext()));
            }
            
            private UserFlairRichtext() {
            }
            
            public static UserFlairRichtext access$78000() {
                return UserFlairRichtext.DEFAULT_INSTANCE;
            }
            
            public static void access$78100(final UserFlairRichtext userFlairRichtext, final StringValue e) {
                userFlairRichtext.setE(e);
            }
            
            public static void access$78200(final UserFlairRichtext userFlairRichtext, final StringValue stringValue) {
                userFlairRichtext.mergeE(stringValue);
            }
            
            public static void access$78300(final UserFlairRichtext userFlairRichtext) {
                userFlairRichtext.clearE();
            }
            
            public static void access$78400(final UserFlairRichtext userFlairRichtext, final StringValue t) {
                userFlairRichtext.setT(t);
            }
            
            public static void access$78500(final UserFlairRichtext userFlairRichtext, final StringValue stringValue) {
                userFlairRichtext.mergeT(stringValue);
            }
            
            public static void access$78600(final UserFlairRichtext userFlairRichtext) {
                userFlairRichtext.clearT();
            }
            
            private void clearE() {
                this.e_ = null;
            }
            
            private void clearT() {
                this.t_ = null;
            }
            
            public static UserFlairRichtext getDefaultInstance() {
                return UserFlairRichtext.DEFAULT_INSTANCE;
            }
            
            private void mergeE(final StringValue e_) {
                e_.getClass();
                final StringValue e_2 = this.e_;
                if (e_2 != null && e_2 != StringValue.getDefaultInstance()) {
                    this.e_ = (StringValue)w.e(this.e_, e_);
                }
                else {
                    this.e_ = e_;
                }
            }
            
            private void mergeT(final StringValue t_) {
                t_.getClass();
                final StringValue t_2 = this.t_;
                if (t_2 != null && t_2 != StringValue.getDefaultInstance()) {
                    this.t_ = (StringValue)w.e(this.t_, t_);
                }
                else {
                    this.t_ = t_;
                }
            }
            
            public static a newBuilder() {
                return (a)UserFlairRichtext.DEFAULT_INSTANCE.createBuilder();
            }
            
            public static a newBuilder(final UserFlairRichtext userFlairRichtext) {
                return (a)UserFlairRichtext.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)userFlairRichtext);
            }
            
            public static UserFlairRichtext parseDelimitedFrom(final InputStream inputStream) throws IOException {
                return (UserFlairRichtext)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, inputStream);
            }
            
            public static UserFlairRichtext parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (UserFlairRichtext)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static UserFlairRichtext parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, byteString);
            }
            
            public static UserFlairRichtext parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, byteString, d0);
            }
            
            public static UserFlairRichtext parseFrom(final l l) throws IOException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, l);
            }
            
            public static UserFlairRichtext parseFrom(final l l, final d0 d0) throws IOException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, l, d0);
            }
            
            public static UserFlairRichtext parseFrom(final InputStream inputStream) throws IOException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, inputStream);
            }
            
            public static UserFlairRichtext parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, inputStream, d0);
            }
            
            public static UserFlairRichtext parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, byteBuffer);
            }
            
            public static UserFlairRichtext parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, byteBuffer, d0);
            }
            
            public static UserFlairRichtext parseFrom(final byte[] array) throws InvalidProtocolBufferException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, array);
            }
            
            public static UserFlairRichtext parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
                return (UserFlairRichtext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE, array, d0);
            }
            
            public static n1<UserFlairRichtext> parser() {
                return (n1<UserFlairRichtext>)UserFlairRichtext.DEFAULT_INSTANCE.getParserForType();
            }
            
            private void setE(final StringValue e_) {
                e_.getClass();
                this.e_ = e_;
            }
            
            private void setT(final StringValue t_) {
                t_.getClass();
                this.t_ = t_;
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
                        final n1<UserFlairRichtext> parser;
                        if ((parser = UserFlairRichtext.PARSER) == null) {
                            synchronized (UserFlairRichtext.class) {
                                if (UserFlairRichtext.PARSER == null) {
                                    UserFlairRichtext.PARSER = (n1<UserFlairRichtext>)new GeneratedMessageLite$c((GeneratedMessageLite)UserFlairRichtext.DEFAULT_INSTANCE);
                                }
                            }
                        }
                        return parser;
                    }
                    case 4: {
                        return UserFlairRichtext.DEFAULT_INSTANCE;
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo((c1)UserFlairRichtext.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "e_", "t_" });
                    }
                    case 2: {
                        return new a();
                    }
                    case 1: {
                        return new UserFlairRichtext();
                    }
                }
            }
            
            public StringValue getE() {
                StringValue stringValue;
                if ((stringValue = this.e_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public StringValue getT() {
                StringValue stringValue;
                if ((stringValue = this.t_) == null) {
                    stringValue = StringValue.getDefaultInstance();
                }
                return stringValue;
            }
            
            public boolean hasE() {
                return this.e_ != null;
            }
            
            public boolean hasT() {
                return this.t_ != null;
            }
            
            public static final class a extends GeneratedMessageLite$b<UserFlairRichtext, a> implements SubredditsMsg$SubredditAboutResponse$AboutData$b
            {
                public a() {
                    super((GeneratedMessageLite)UserFlairRichtext.access$78000());
                }
            }
        }
        
        public static final class a extends GeneratedMessageLite$b<AboutData, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)AboutData.access$78800());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditAboutResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditAboutResponse.access$111400());
        }
    }
}
