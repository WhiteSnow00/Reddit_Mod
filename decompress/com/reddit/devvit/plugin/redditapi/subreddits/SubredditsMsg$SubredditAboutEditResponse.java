// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

import com.google.protobuf.GeneratedMessageLite$b;
import u10.o;
import com.google.protobuf.Int32Value;
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

public final class SubredditsMsg$SubredditAboutEditResponse extends GeneratedMessageLite<SubredditsMsg$SubredditAboutEditResponse, a> implements d1
{
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SubredditsMsg$SubredditAboutEditResponse DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile n1<SubredditsMsg$SubredditAboutEditResponse> PARSER;
    private SubredditSettings data_;
    private StringValue kind_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditAboutEditResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditAboutEditResponse()));
    }
    
    private SubredditsMsg$SubredditAboutEditResponse() {
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse access$131000() {
        return SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$131100(final SubredditsMsg$SubredditAboutEditResponse subredditsMsg$SubredditAboutEditResponse, final StringValue kind) {
        subredditsMsg$SubredditAboutEditResponse.setKind(kind);
    }
    
    public static void access$131200(final SubredditsMsg$SubredditAboutEditResponse subredditsMsg$SubredditAboutEditResponse, final StringValue stringValue) {
        subredditsMsg$SubredditAboutEditResponse.mergeKind(stringValue);
    }
    
    public static void access$131300(final SubredditsMsg$SubredditAboutEditResponse subredditsMsg$SubredditAboutEditResponse) {
        subredditsMsg$SubredditAboutEditResponse.clearKind();
    }
    
    public static void access$131400(final SubredditsMsg$SubredditAboutEditResponse subredditsMsg$SubredditAboutEditResponse, final SubredditSettings data) {
        subredditsMsg$SubredditAboutEditResponse.setData(data);
    }
    
    public static void access$131500(final SubredditsMsg$SubredditAboutEditResponse subredditsMsg$SubredditAboutEditResponse, final SubredditSettings subredditSettings) {
        subredditsMsg$SubredditAboutEditResponse.mergeData(subredditSettings);
    }
    
    public static void access$131600(final SubredditsMsg$SubredditAboutEditResponse subredditsMsg$SubredditAboutEditResponse) {
        subredditsMsg$SubredditAboutEditResponse.clearData();
    }
    
    private void clearData() {
        this.data_ = null;
    }
    
    private void clearKind() {
        this.kind_ = null;
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse getDefaultInstance() {
        return SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE;
    }
    
    private void mergeData(final SubredditSettings data_) {
        data_.getClass();
        final SubredditSettings data_2 = this.data_;
        if (data_2 != null && data_2 != SubredditSettings.getDefaultInstance()) {
            final SubredditSettings.a builder = SubredditSettings.newBuilder(this.data_);
            builder.h((GeneratedMessageLite)data_);
            this.data_ = (SubredditSettings)builder.c();
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
        return (a)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditAboutEditResponse subredditsMsg$SubredditAboutEditResponse) {
        return (a)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditAboutEditResponse);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditAboutEditResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAboutEditResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditAboutEditResponse> parser() {
        return (n1<SubredditsMsg$SubredditAboutEditResponse>)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setData(final SubredditSettings data_) {
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
                final n1<SubredditsMsg$SubredditAboutEditResponse> parser;
                if ((parser = SubredditsMsg$SubredditAboutEditResponse.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditAboutEditResponse.class) {
                        if (SubredditsMsg$SubredditAboutEditResponse.PARSER == null) {
                            SubredditsMsg$SubredditAboutEditResponse.PARSER = (n1<SubredditsMsg$SubredditAboutEditResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditAboutEditResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "kind_", "data_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditAboutEditResponse();
            }
        }
    }
    
    public SubredditSettings getData() {
        SubredditSettings subredditSettings;
        if ((subredditSettings = this.data_) == null) {
            subredditSettings = SubredditSettings.getDefaultInstance();
        }
        return subredditSettings;
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
    
    public static final class SubredditSettings extends GeneratedMessageLite<SubredditSettings, a> implements d1
    {
        public static final int ACCEPT_FOLLOWERS_FIELD_NUMBER = 53;
        public static final int ALLOW_CHAT_POST_CREATION_FIELD_NUMBER = 50;
        public static final int ALLOW_DISCOVERY_FIELD_NUMBER = 52;
        public static final int ALLOW_GALLERIES_FIELD_NUMBER = 21;
        public static final int ALLOW_IMAGES_FIELD_NUMBER = 7;
        public static final int ALLOW_POLLS_FIELD_NUMBER = 37;
        public static final int ALLOW_POST_CROSSPOSTS_FIELD_NUMBER = 33;
        public static final int ALLOW_PREDICTIONS_FIELD_NUMBER = 60;
        public static final int ALLOW_PREDICTIONS_TOURNAMENT_FIELD_NUMBER = 55;
        public static final int ALLOW_PREDICTION_CONTRIBUTORS_FIELD_NUMBER = 51;
        public static final int ALLOW_TALKS_FIELD_NUMBER = 29;
        public static final int ALLOW_VIDEOS_FIELD_NUMBER = 20;
        public static final int ALL_ORIGINAL_CONTENT_FIELD_NUMBER = 41;
        public static final int BAN_EVASION_THRESHOLD_FIELD_NUMBER = 23;
        public static final int COLLAPSE_DELETED_COMMENTS_FIELD_NUMBER = 17;
        public static final int COMMENT_CONTRIBUTION_SETTINGS_FIELD_NUMBER = 38;
        public static final int COMMENT_SCORE_HIDE_MINS_FIELD_NUMBER = 40;
        public static final int CONTENT_OPTIONS_FIELD_NUMBER = 62;
        public static final int CROWD_CONTROL_CHAT_LEVEL_FIELD_NUMBER = 3;
        public static final int CROWD_CONTROL_FILTER_FIELD_NUMBER = 58;
        public static final int CROWD_CONTROL_LEVEL_FIELD_NUMBER = 22;
        public static final int CROWD_CONTROL_MODE_FIELD_NUMBER = 24;
        public static final int CROWD_CONTROL_POST_LEVEL_FIELD_NUMBER = 54;
        private static final SubredditSettings DEFAULT_INSTANCE;
        public static final int DEFAULT_SET_FIELD_NUMBER = 1;
        public static final int DESCRIPTION_FIELD_NUMBER = 30;
        public static final int DISABLE_CONTRIBUTOR_REQUESTS_FIELD_NUMBER = 28;
        public static final int DOMAIN_FIELD_NUMBER = 9;
        public static final int EXCLUDE_BANNED_MODQUEUE_FIELD_NUMBER = 12;
        public static final int FREE_FORM_REPORTS_FIELD_NUMBER = 8;
        public static final int HEADER_HOVER_TEXT_FIELD_NUMBER = 48;
        public static final int HIDE_ADS_FIELD_NUMBER = 46;
        public static final int KEY_COLOR_FIELD_NUMBER = 43;
        public static final int LANGUAGE_FIELD_NUMBER = 44;
        public static final int NEW_PINNED_POST_PNS_ENABLED_FIELD_NUMBER = 45;
        public static final int ORIGINAL_CONTENT_TAG_ENABLED_FIELD_NUMBER = 10;
        public static final int OVER_18_FIELD_NUMBER = 19;
        private static volatile n1<SubredditSettings> PARSER;
        public static final int PREDICTION_LEADERBOARD_ENTRY_TYPE_FIELD_NUMBER = 47;
        public static final int PUBLIC_DESCRIPTION_FIELD_NUMBER = 5;
        public static final int PUBLIC_TRAFFIC_FIELD_NUMBER = 35;
        public static final int RESTRICT_COMMENTING_FIELD_NUMBER = 36;
        public static final int RESTRICT_POSTING_FIELD_NUMBER = 4;
        public static final int SHOULD_ARCHIVE_POSTS_FIELD_NUMBER = 13;
        public static final int SHOW_MEDIA_FIELD_NUMBER = 11;
        public static final int SHOW_MEDIA_PREVIEW_FIELD_NUMBER = 57;
        public static final int SPAM_COMMENTS_FIELD_NUMBER = 34;
        public static final int SPAM_LINKS_FIELD_NUMBER = 15;
        public static final int SPAM_SELFPOSTS_FIELD_NUMBER = 42;
        public static final int SPOILERS_ENABLED_FIELD_NUMBER = 32;
        public static final int SUBMIT_LINK_LABEL_FIELD_NUMBER = 31;
        public static final int SUBMIT_TEXT_FIELD_NUMBER = 14;
        public static final int SUBMIT_TEXT_LABEL_FIELD_NUMBER = 39;
        public static final int SUBREDDIT_ID_FIELD_NUMBER = 6;
        public static final int SUBREDDIT_TYPE_FIELD_NUMBER = 59;
        public static final int SUGGESTED_COMMENT_SORT_FIELD_NUMBER = 27;
        public static final int TITLE_FIELD_NUMBER = 16;
        public static final int TOXICITY_THRESHOLD_CHAT_LEVEL_FIELD_NUMBER = 2;
        public static final int USER_FLAIR_PNS_ENABLED_FIELD_NUMBER = 61;
        public static final int WELCOME_MESSAGE_ENABLED_FIELD_NUMBER = 25;
        public static final int WELCOME_MESSAGE_TEXT_FIELD_NUMBER = 26;
        public static final int WIKIMODE_FIELD_NUMBER = 18;
        public static final int WIKI_EDIT_AGE_FIELD_NUMBER = 49;
        public static final int WIKI_EDIT_KARMA_FIELD_NUMBER = 56;
        private BoolValue acceptFollowers_;
        private BoolValue allOriginalContent_;
        private BoolValue allowChatPostCreation_;
        private BoolValue allowDiscovery_;
        private BoolValue allowGalleries_;
        private BoolValue allowImages_;
        private BoolValue allowPolls_;
        private BoolValue allowPostCrossposts_;
        private BoolValue allowPredictionContributors_;
        private BoolValue allowPredictionsTournament_;
        private BoolValue allowPredictions_;
        private BoolValue allowTalks_;
        private BoolValue allowVideos_;
        private Int32Value banEvasionThreshold_;
        private BoolValue collapseDeletedComments_;
        private SubredditsMsg$CommentContributionSettings commentContributionSettings_;
        private Int32Value commentScoreHideMins_;
        private StringValue contentOptions_;
        private Int32Value crowdControlChatLevel_;
        private BoolValue crowdControlFilter_;
        private Int32Value crowdControlLevel_;
        private BoolValue crowdControlMode_;
        private Int32Value crowdControlPostLevel_;
        private BoolValue defaultSet_;
        private StringValue description_;
        private BoolValue disableContributorRequests_;
        private StringValue domain_;
        private BoolValue excludeBannedModqueue_;
        private BoolValue freeFormReports_;
        private StringValue headerHoverText_;
        private BoolValue hideAds_;
        private StringValue keyColor_;
        private StringValue language_;
        private BoolValue newPinnedPostPnsEnabled_;
        private BoolValue originalContentTagEnabled_;
        private BoolValue over18_;
        private Int32Value predictionLeaderboardEntryType_;
        private StringValue publicDescription_;
        private BoolValue publicTraffic_;
        private BoolValue restrictCommenting_;
        private BoolValue restrictPosting_;
        private BoolValue shouldArchivePosts_;
        private BoolValue showMediaPreview_;
        private BoolValue showMedia_;
        private StringValue spamComments_;
        private StringValue spamLinks_;
        private StringValue spamSelfposts_;
        private BoolValue spoilersEnabled_;
        private StringValue submitLinkLabel_;
        private StringValue submitTextLabel_;
        private StringValue submitText_;
        private StringValue subredditId_;
        private StringValue subredditType_;
        private BoolValue suggestedCommentSort_;
        private StringValue title_;
        private Int32Value toxicityThresholdChatLevel_;
        private BoolValue userFlairPnsEnabled_;
        private BoolValue welcomeMessageEnabled_;
        private StringValue welcomeMessageText_;
        private Int32Value wikiEditAge_;
        private Int32Value wikiEditKarma_;
        private StringValue wikimode_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)SubredditSettings.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditSettings()));
        }
        
        private SubredditSettings() {
        }
        
        public static SubredditSettings access$112200() {
            return SubredditSettings.DEFAULT_INSTANCE;
        }
        
        public static void access$112300(final SubredditSettings subredditSettings, final BoolValue defaultSet) {
            subredditSettings.setDefaultSet(defaultSet);
        }
        
        public static void access$112400(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeDefaultSet(boolValue);
        }
        
        public static void access$112500(final SubredditSettings subredditSettings) {
            subredditSettings.clearDefaultSet();
        }
        
        public static void access$112600(final SubredditSettings subredditSettings, final Int32Value toxicityThresholdChatLevel) {
            subredditSettings.setToxicityThresholdChatLevel(toxicityThresholdChatLevel);
        }
        
        public static void access$112700(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeToxicityThresholdChatLevel(int32Value);
        }
        
        public static void access$112800(final SubredditSettings subredditSettings) {
            subredditSettings.clearToxicityThresholdChatLevel();
        }
        
        public static void access$112900(final SubredditSettings subredditSettings, final Int32Value crowdControlChatLevel) {
            subredditSettings.setCrowdControlChatLevel(crowdControlChatLevel);
        }
        
        public static void access$113000(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeCrowdControlChatLevel(int32Value);
        }
        
        public static void access$113100(final SubredditSettings subredditSettings) {
            subredditSettings.clearCrowdControlChatLevel();
        }
        
        public static void access$113200(final SubredditSettings subredditSettings, final BoolValue restrictPosting) {
            subredditSettings.setRestrictPosting(restrictPosting);
        }
        
        public static void access$113300(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeRestrictPosting(boolValue);
        }
        
        public static void access$113400(final SubredditSettings subredditSettings) {
            subredditSettings.clearRestrictPosting();
        }
        
        public static void access$113500(final SubredditSettings subredditSettings, final StringValue publicDescription) {
            subredditSettings.setPublicDescription(publicDescription);
        }
        
        public static void access$113600(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergePublicDescription(stringValue);
        }
        
        public static void access$113700(final SubredditSettings subredditSettings) {
            subredditSettings.clearPublicDescription();
        }
        
        public static void access$113800(final SubredditSettings subredditSettings, final StringValue subredditId) {
            subredditSettings.setSubredditId(subredditId);
        }
        
        public static void access$113900(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSubredditId(stringValue);
        }
        
        public static void access$114000(final SubredditSettings subredditSettings) {
            subredditSettings.clearSubredditId();
        }
        
        public static void access$114100(final SubredditSettings subredditSettings, final BoolValue allowImages) {
            subredditSettings.setAllowImages(allowImages);
        }
        
        public static void access$114200(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowImages(boolValue);
        }
        
        public static void access$114300(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowImages();
        }
        
        public static void access$114400(final SubredditSettings subredditSettings, final BoolValue freeFormReports) {
            subredditSettings.setFreeFormReports(freeFormReports);
        }
        
        public static void access$114500(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeFreeFormReports(boolValue);
        }
        
        public static void access$114600(final SubredditSettings subredditSettings) {
            subredditSettings.clearFreeFormReports();
        }
        
        public static void access$114700(final SubredditSettings subredditSettings, final StringValue domain) {
            subredditSettings.setDomain(domain);
        }
        
        public static void access$114800(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeDomain(stringValue);
        }
        
        public static void access$114900(final SubredditSettings subredditSettings) {
            subredditSettings.clearDomain();
        }
        
        public static void access$115000(final SubredditSettings subredditSettings, final BoolValue originalContentTagEnabled) {
            subredditSettings.setOriginalContentTagEnabled(originalContentTagEnabled);
        }
        
        public static void access$115100(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeOriginalContentTagEnabled(boolValue);
        }
        
        public static void access$115200(final SubredditSettings subredditSettings) {
            subredditSettings.clearOriginalContentTagEnabled();
        }
        
        public static void access$115300(final SubredditSettings subredditSettings, final BoolValue showMedia) {
            subredditSettings.setShowMedia(showMedia);
        }
        
        public static void access$115400(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeShowMedia(boolValue);
        }
        
        public static void access$115500(final SubredditSettings subredditSettings) {
            subredditSettings.clearShowMedia();
        }
        
        public static void access$115600(final SubredditSettings subredditSettings, final BoolValue excludeBannedModqueue) {
            subredditSettings.setExcludeBannedModqueue(excludeBannedModqueue);
        }
        
        public static void access$115700(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeExcludeBannedModqueue(boolValue);
        }
        
        public static void access$115800(final SubredditSettings subredditSettings) {
            subredditSettings.clearExcludeBannedModqueue();
        }
        
        public static void access$115900(final SubredditSettings subredditSettings, final BoolValue shouldArchivePosts) {
            subredditSettings.setShouldArchivePosts(shouldArchivePosts);
        }
        
        public static void access$116000(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeShouldArchivePosts(boolValue);
        }
        
        public static void access$116100(final SubredditSettings subredditSettings) {
            subredditSettings.clearShouldArchivePosts();
        }
        
        public static void access$116200(final SubredditSettings subredditSettings, final StringValue submitText) {
            subredditSettings.setSubmitText(submitText);
        }
        
        public static void access$116300(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSubmitText(stringValue);
        }
        
        public static void access$116400(final SubredditSettings subredditSettings) {
            subredditSettings.clearSubmitText();
        }
        
        public static void access$116500(final SubredditSettings subredditSettings, final StringValue spamLinks) {
            subredditSettings.setSpamLinks(spamLinks);
        }
        
        public static void access$116600(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSpamLinks(stringValue);
        }
        
        public static void access$116700(final SubredditSettings subredditSettings) {
            subredditSettings.clearSpamLinks();
        }
        
        public static void access$116800(final SubredditSettings subredditSettings, final StringValue title) {
            subredditSettings.setTitle(title);
        }
        
        public static void access$116900(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeTitle(stringValue);
        }
        
        public static void access$117000(final SubredditSettings subredditSettings) {
            subredditSettings.clearTitle();
        }
        
        public static void access$117100(final SubredditSettings subredditSettings, final BoolValue collapseDeletedComments) {
            subredditSettings.setCollapseDeletedComments(collapseDeletedComments);
        }
        
        public static void access$117200(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeCollapseDeletedComments(boolValue);
        }
        
        public static void access$117300(final SubredditSettings subredditSettings) {
            subredditSettings.clearCollapseDeletedComments();
        }
        
        public static void access$117400(final SubredditSettings subredditSettings, final StringValue wikimode) {
            subredditSettings.setWikimode(wikimode);
        }
        
        public static void access$117500(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeWikimode(stringValue);
        }
        
        public static void access$117600(final SubredditSettings subredditSettings) {
            subredditSettings.clearWikimode();
        }
        
        public static void access$117700(final SubredditSettings subredditSettings, final BoolValue over18) {
            subredditSettings.setOver18(over18);
        }
        
        public static void access$117800(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeOver18(boolValue);
        }
        
        public static void access$117900(final SubredditSettings subredditSettings) {
            subredditSettings.clearOver18();
        }
        
        public static void access$118000(final SubredditSettings subredditSettings, final BoolValue allowVideos) {
            subredditSettings.setAllowVideos(allowVideos);
        }
        
        public static void access$118100(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowVideos(boolValue);
        }
        
        public static void access$118200(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowVideos();
        }
        
        public static void access$118300(final SubredditSettings subredditSettings, final BoolValue allowGalleries) {
            subredditSettings.setAllowGalleries(allowGalleries);
        }
        
        public static void access$118400(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowGalleries(boolValue);
        }
        
        public static void access$118500(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowGalleries();
        }
        
        public static void access$118600(final SubredditSettings subredditSettings, final Int32Value crowdControlLevel) {
            subredditSettings.setCrowdControlLevel(crowdControlLevel);
        }
        
        public static void access$118700(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeCrowdControlLevel(int32Value);
        }
        
        public static void access$118800(final SubredditSettings subredditSettings) {
            subredditSettings.clearCrowdControlLevel();
        }
        
        public static void access$118900(final SubredditSettings subredditSettings, final Int32Value banEvasionThreshold) {
            subredditSettings.setBanEvasionThreshold(banEvasionThreshold);
        }
        
        public static void access$119000(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeBanEvasionThreshold(int32Value);
        }
        
        public static void access$119100(final SubredditSettings subredditSettings) {
            subredditSettings.clearBanEvasionThreshold();
        }
        
        public static void access$119200(final SubredditSettings subredditSettings, final BoolValue crowdControlMode) {
            subredditSettings.setCrowdControlMode(crowdControlMode);
        }
        
        public static void access$119300(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeCrowdControlMode(boolValue);
        }
        
        public static void access$119400(final SubredditSettings subredditSettings) {
            subredditSettings.clearCrowdControlMode();
        }
        
        public static void access$119500(final SubredditSettings subredditSettings, final BoolValue welcomeMessageEnabled) {
            subredditSettings.setWelcomeMessageEnabled(welcomeMessageEnabled);
        }
        
        public static void access$119600(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeWelcomeMessageEnabled(boolValue);
        }
        
        public static void access$119700(final SubredditSettings subredditSettings) {
            subredditSettings.clearWelcomeMessageEnabled();
        }
        
        public static void access$119800(final SubredditSettings subredditSettings, final StringValue welcomeMessageText) {
            subredditSettings.setWelcomeMessageText(welcomeMessageText);
        }
        
        public static void access$119900(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeWelcomeMessageText(stringValue);
        }
        
        public static void access$120000(final SubredditSettings subredditSettings) {
            subredditSettings.clearWelcomeMessageText();
        }
        
        public static void access$120100(final SubredditSettings subredditSettings, final BoolValue suggestedCommentSort) {
            subredditSettings.setSuggestedCommentSort(suggestedCommentSort);
        }
        
        public static void access$120200(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeSuggestedCommentSort(boolValue);
        }
        
        public static void access$120300(final SubredditSettings subredditSettings) {
            subredditSettings.clearSuggestedCommentSort();
        }
        
        public static void access$120400(final SubredditSettings subredditSettings, final BoolValue disableContributorRequests) {
            subredditSettings.setDisableContributorRequests(disableContributorRequests);
        }
        
        public static void access$120500(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeDisableContributorRequests(boolValue);
        }
        
        public static void access$120600(final SubredditSettings subredditSettings) {
            subredditSettings.clearDisableContributorRequests();
        }
        
        public static void access$120700(final SubredditSettings subredditSettings, final BoolValue allowTalks) {
            subredditSettings.setAllowTalks(allowTalks);
        }
        
        public static void access$120800(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowTalks(boolValue);
        }
        
        public static void access$120900(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowTalks();
        }
        
        public static void access$121000(final SubredditSettings subredditSettings, final StringValue description) {
            subredditSettings.setDescription(description);
        }
        
        public static void access$121100(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeDescription(stringValue);
        }
        
        public static void access$121200(final SubredditSettings subredditSettings) {
            subredditSettings.clearDescription();
        }
        
        public static void access$121300(final SubredditSettings subredditSettings, final StringValue submitLinkLabel) {
            subredditSettings.setSubmitLinkLabel(submitLinkLabel);
        }
        
        public static void access$121400(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSubmitLinkLabel(stringValue);
        }
        
        public static void access$121500(final SubredditSettings subredditSettings) {
            subredditSettings.clearSubmitLinkLabel();
        }
        
        public static void access$121600(final SubredditSettings subredditSettings, final BoolValue spoilersEnabled) {
            subredditSettings.setSpoilersEnabled(spoilersEnabled);
        }
        
        public static void access$121700(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeSpoilersEnabled(boolValue);
        }
        
        public static void access$121800(final SubredditSettings subredditSettings) {
            subredditSettings.clearSpoilersEnabled();
        }
        
        public static void access$121900(final SubredditSettings subredditSettings, final BoolValue allowPostCrossposts) {
            subredditSettings.setAllowPostCrossposts(allowPostCrossposts);
        }
        
        public static void access$122000(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowPostCrossposts(boolValue);
        }
        
        public static void access$122100(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowPostCrossposts();
        }
        
        public static void access$122200(final SubredditSettings subredditSettings, final StringValue spamComments) {
            subredditSettings.setSpamComments(spamComments);
        }
        
        public static void access$122300(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSpamComments(stringValue);
        }
        
        public static void access$122400(final SubredditSettings subredditSettings) {
            subredditSettings.clearSpamComments();
        }
        
        public static void access$122500(final SubredditSettings subredditSettings, final BoolValue publicTraffic) {
            subredditSettings.setPublicTraffic(publicTraffic);
        }
        
        public static void access$122600(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergePublicTraffic(boolValue);
        }
        
        public static void access$122700(final SubredditSettings subredditSettings) {
            subredditSettings.clearPublicTraffic();
        }
        
        public static void access$122800(final SubredditSettings subredditSettings, final BoolValue restrictCommenting) {
            subredditSettings.setRestrictCommenting(restrictCommenting);
        }
        
        public static void access$122900(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeRestrictCommenting(boolValue);
        }
        
        public static void access$123000(final SubredditSettings subredditSettings) {
            subredditSettings.clearRestrictCommenting();
        }
        
        public static void access$123100(final SubredditSettings subredditSettings, final BoolValue allowPolls) {
            subredditSettings.setAllowPolls(allowPolls);
        }
        
        public static void access$123200(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowPolls(boolValue);
        }
        
        public static void access$123300(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowPolls();
        }
        
        public static void access$123400(final SubredditSettings subredditSettings, final SubredditsMsg$CommentContributionSettings commentContributionSettings) {
            subredditSettings.setCommentContributionSettings(commentContributionSettings);
        }
        
        public static void access$123500(final SubredditSettings subredditSettings, final SubredditsMsg$CommentContributionSettings subredditsMsg$CommentContributionSettings) {
            subredditSettings.mergeCommentContributionSettings(subredditsMsg$CommentContributionSettings);
        }
        
        public static void access$123600(final SubredditSettings subredditSettings) {
            subredditSettings.clearCommentContributionSettings();
        }
        
        public static void access$123700(final SubredditSettings subredditSettings, final StringValue submitTextLabel) {
            subredditSettings.setSubmitTextLabel(submitTextLabel);
        }
        
        public static void access$123800(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSubmitTextLabel(stringValue);
        }
        
        public static void access$123900(final SubredditSettings subredditSettings) {
            subredditSettings.clearSubmitTextLabel();
        }
        
        public static void access$124000(final SubredditSettings subredditSettings, final Int32Value commentScoreHideMins) {
            subredditSettings.setCommentScoreHideMins(commentScoreHideMins);
        }
        
        public static void access$124100(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeCommentScoreHideMins(int32Value);
        }
        
        public static void access$124200(final SubredditSettings subredditSettings) {
            subredditSettings.clearCommentScoreHideMins();
        }
        
        public static void access$124300(final SubredditSettings subredditSettings, final BoolValue allOriginalContent) {
            subredditSettings.setAllOriginalContent(allOriginalContent);
        }
        
        public static void access$124400(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllOriginalContent(boolValue);
        }
        
        public static void access$124500(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllOriginalContent();
        }
        
        public static void access$124600(final SubredditSettings subredditSettings, final StringValue spamSelfposts) {
            subredditSettings.setSpamSelfposts(spamSelfposts);
        }
        
        public static void access$124700(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSpamSelfposts(stringValue);
        }
        
        public static void access$124800(final SubredditSettings subredditSettings) {
            subredditSettings.clearSpamSelfposts();
        }
        
        public static void access$124900(final SubredditSettings subredditSettings, final StringValue keyColor) {
            subredditSettings.setKeyColor(keyColor);
        }
        
        public static void access$125000(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeKeyColor(stringValue);
        }
        
        public static void access$125100(final SubredditSettings subredditSettings) {
            subredditSettings.clearKeyColor();
        }
        
        public static void access$125200(final SubredditSettings subredditSettings, final StringValue language) {
            subredditSettings.setLanguage(language);
        }
        
        public static void access$125300(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeLanguage(stringValue);
        }
        
        public static void access$125400(final SubredditSettings subredditSettings) {
            subredditSettings.clearLanguage();
        }
        
        public static void access$125500(final SubredditSettings subredditSettings, final BoolValue newPinnedPostPnsEnabled) {
            subredditSettings.setNewPinnedPostPnsEnabled(newPinnedPostPnsEnabled);
        }
        
        public static void access$125600(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeNewPinnedPostPnsEnabled(boolValue);
        }
        
        public static void access$125700(final SubredditSettings subredditSettings) {
            subredditSettings.clearNewPinnedPostPnsEnabled();
        }
        
        public static void access$125800(final SubredditSettings subredditSettings, final BoolValue hideAds) {
            subredditSettings.setHideAds(hideAds);
        }
        
        public static void access$125900(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeHideAds(boolValue);
        }
        
        public static void access$126000(final SubredditSettings subredditSettings) {
            subredditSettings.clearHideAds();
        }
        
        public static void access$126100(final SubredditSettings subredditSettings, final Int32Value predictionLeaderboardEntryType) {
            subredditSettings.setPredictionLeaderboardEntryType(predictionLeaderboardEntryType);
        }
        
        public static void access$126200(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergePredictionLeaderboardEntryType(int32Value);
        }
        
        public static void access$126300(final SubredditSettings subredditSettings) {
            subredditSettings.clearPredictionLeaderboardEntryType();
        }
        
        public static void access$126400(final SubredditSettings subredditSettings, final StringValue headerHoverText) {
            subredditSettings.setHeaderHoverText(headerHoverText);
        }
        
        public static void access$126500(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeHeaderHoverText(stringValue);
        }
        
        public static void access$126600(final SubredditSettings subredditSettings) {
            subredditSettings.clearHeaderHoverText();
        }
        
        public static void access$126700(final SubredditSettings subredditSettings, final Int32Value wikiEditAge) {
            subredditSettings.setWikiEditAge(wikiEditAge);
        }
        
        public static void access$126800(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeWikiEditAge(int32Value);
        }
        
        public static void access$126900(final SubredditSettings subredditSettings) {
            subredditSettings.clearWikiEditAge();
        }
        
        public static void access$127000(final SubredditSettings subredditSettings, final BoolValue allowChatPostCreation) {
            subredditSettings.setAllowChatPostCreation(allowChatPostCreation);
        }
        
        public static void access$127100(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowChatPostCreation(boolValue);
        }
        
        public static void access$127200(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowChatPostCreation();
        }
        
        public static void access$127300(final SubredditSettings subredditSettings, final BoolValue allowPredictionContributors) {
            subredditSettings.setAllowPredictionContributors(allowPredictionContributors);
        }
        
        public static void access$127400(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowPredictionContributors(boolValue);
        }
        
        public static void access$127500(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowPredictionContributors();
        }
        
        public static void access$127600(final SubredditSettings subredditSettings, final BoolValue allowDiscovery) {
            subredditSettings.setAllowDiscovery(allowDiscovery);
        }
        
        public static void access$127700(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowDiscovery(boolValue);
        }
        
        public static void access$127800(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowDiscovery();
        }
        
        public static void access$127900(final SubredditSettings subredditSettings, final BoolValue acceptFollowers) {
            subredditSettings.setAcceptFollowers(acceptFollowers);
        }
        
        public static void access$128000(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAcceptFollowers(boolValue);
        }
        
        public static void access$128100(final SubredditSettings subredditSettings) {
            subredditSettings.clearAcceptFollowers();
        }
        
        public static void access$128200(final SubredditSettings subredditSettings, final Int32Value crowdControlPostLevel) {
            subredditSettings.setCrowdControlPostLevel(crowdControlPostLevel);
        }
        
        public static void access$128300(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeCrowdControlPostLevel(int32Value);
        }
        
        public static void access$128400(final SubredditSettings subredditSettings) {
            subredditSettings.clearCrowdControlPostLevel();
        }
        
        public static void access$128500(final SubredditSettings subredditSettings, final BoolValue allowPredictionsTournament) {
            subredditSettings.setAllowPredictionsTournament(allowPredictionsTournament);
        }
        
        public static void access$128600(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowPredictionsTournament(boolValue);
        }
        
        public static void access$128700(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowPredictionsTournament();
        }
        
        public static void access$128800(final SubredditSettings subredditSettings, final Int32Value wikiEditKarma) {
            subredditSettings.setWikiEditKarma(wikiEditKarma);
        }
        
        public static void access$128900(final SubredditSettings subredditSettings, final Int32Value int32Value) {
            subredditSettings.mergeWikiEditKarma(int32Value);
        }
        
        public static void access$129000(final SubredditSettings subredditSettings) {
            subredditSettings.clearWikiEditKarma();
        }
        
        public static void access$129100(final SubredditSettings subredditSettings, final BoolValue showMediaPreview) {
            subredditSettings.setShowMediaPreview(showMediaPreview);
        }
        
        public static void access$129200(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeShowMediaPreview(boolValue);
        }
        
        public static void access$129300(final SubredditSettings subredditSettings) {
            subredditSettings.clearShowMediaPreview();
        }
        
        public static void access$129400(final SubredditSettings subredditSettings, final BoolValue crowdControlFilter) {
            subredditSettings.setCrowdControlFilter(crowdControlFilter);
        }
        
        public static void access$129500(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeCrowdControlFilter(boolValue);
        }
        
        public static void access$129600(final SubredditSettings subredditSettings) {
            subredditSettings.clearCrowdControlFilter();
        }
        
        public static void access$129700(final SubredditSettings subredditSettings, final StringValue subredditType) {
            subredditSettings.setSubredditType(subredditType);
        }
        
        public static void access$129800(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeSubredditType(stringValue);
        }
        
        public static void access$129900(final SubredditSettings subredditSettings) {
            subredditSettings.clearSubredditType();
        }
        
        public static void access$130000(final SubredditSettings subredditSettings, final BoolValue allowPredictions) {
            subredditSettings.setAllowPredictions(allowPredictions);
        }
        
        public static void access$130100(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeAllowPredictions(boolValue);
        }
        
        public static void access$130200(final SubredditSettings subredditSettings) {
            subredditSettings.clearAllowPredictions();
        }
        
        public static void access$130300(final SubredditSettings subredditSettings, final BoolValue userFlairPnsEnabled) {
            subredditSettings.setUserFlairPnsEnabled(userFlairPnsEnabled);
        }
        
        public static void access$130400(final SubredditSettings subredditSettings, final BoolValue boolValue) {
            subredditSettings.mergeUserFlairPnsEnabled(boolValue);
        }
        
        public static void access$130500(final SubredditSettings subredditSettings) {
            subredditSettings.clearUserFlairPnsEnabled();
        }
        
        public static void access$130600(final SubredditSettings subredditSettings, final StringValue contentOptions) {
            subredditSettings.setContentOptions(contentOptions);
        }
        
        public static void access$130700(final SubredditSettings subredditSettings, final StringValue stringValue) {
            subredditSettings.mergeContentOptions(stringValue);
        }
        
        public static void access$130800(final SubredditSettings subredditSettings) {
            subredditSettings.clearContentOptions();
        }
        
        private void clearAcceptFollowers() {
            this.acceptFollowers_ = null;
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
        
        private void clearAllowPostCrossposts() {
            this.allowPostCrossposts_ = null;
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
        
        private void clearAllowVideos() {
            this.allowVideos_ = null;
        }
        
        private void clearBanEvasionThreshold() {
            this.banEvasionThreshold_ = null;
        }
        
        private void clearCollapseDeletedComments() {
            this.collapseDeletedComments_ = null;
        }
        
        private void clearCommentContributionSettings() {
            this.commentContributionSettings_ = null;
        }
        
        private void clearCommentScoreHideMins() {
            this.commentScoreHideMins_ = null;
        }
        
        private void clearContentOptions() {
            this.contentOptions_ = null;
        }
        
        private void clearCrowdControlChatLevel() {
            this.crowdControlChatLevel_ = null;
        }
        
        private void clearCrowdControlFilter() {
            this.crowdControlFilter_ = null;
        }
        
        private void clearCrowdControlLevel() {
            this.crowdControlLevel_ = null;
        }
        
        private void clearCrowdControlMode() {
            this.crowdControlMode_ = null;
        }
        
        private void clearCrowdControlPostLevel() {
            this.crowdControlPostLevel_ = null;
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
        
        private void clearDomain() {
            this.domain_ = null;
        }
        
        private void clearExcludeBannedModqueue() {
            this.excludeBannedModqueue_ = null;
        }
        
        private void clearFreeFormReports() {
            this.freeFormReports_ = null;
        }
        
        private void clearHeaderHoverText() {
            this.headerHoverText_ = null;
        }
        
        private void clearHideAds() {
            this.hideAds_ = null;
        }
        
        private void clearKeyColor() {
            this.keyColor_ = null;
        }
        
        private void clearLanguage() {
            this.language_ = null;
        }
        
        private void clearNewPinnedPostPnsEnabled() {
            this.newPinnedPostPnsEnabled_ = null;
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
        
        private void clearPublicDescription() {
            this.publicDescription_ = null;
        }
        
        private void clearPublicTraffic() {
            this.publicTraffic_ = null;
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
        
        private void clearShowMedia() {
            this.showMedia_ = null;
        }
        
        private void clearShowMediaPreview() {
            this.showMediaPreview_ = null;
        }
        
        private void clearSpamComments() {
            this.spamComments_ = null;
        }
        
        private void clearSpamLinks() {
            this.spamLinks_ = null;
        }
        
        private void clearSpamSelfposts() {
            this.spamSelfposts_ = null;
        }
        
        private void clearSpoilersEnabled() {
            this.spoilersEnabled_ = null;
        }
        
        private void clearSubmitLinkLabel() {
            this.submitLinkLabel_ = null;
        }
        
        private void clearSubmitText() {
            this.submitText_ = null;
        }
        
        private void clearSubmitTextLabel() {
            this.submitTextLabel_ = null;
        }
        
        private void clearSubredditId() {
            this.subredditId_ = null;
        }
        
        private void clearSubredditType() {
            this.subredditType_ = null;
        }
        
        private void clearSuggestedCommentSort() {
            this.suggestedCommentSort_ = null;
        }
        
        private void clearTitle() {
            this.title_ = null;
        }
        
        private void clearToxicityThresholdChatLevel() {
            this.toxicityThresholdChatLevel_ = null;
        }
        
        private void clearUserFlairPnsEnabled() {
            this.userFlairPnsEnabled_ = null;
        }
        
        private void clearWelcomeMessageEnabled() {
            this.welcomeMessageEnabled_ = null;
        }
        
        private void clearWelcomeMessageText() {
            this.welcomeMessageText_ = null;
        }
        
        private void clearWikiEditAge() {
            this.wikiEditAge_ = null;
        }
        
        private void clearWikiEditKarma() {
            this.wikiEditKarma_ = null;
        }
        
        private void clearWikimode() {
            this.wikimode_ = null;
        }
        
        public static SubredditSettings getDefaultInstance() {
            return SubredditSettings.DEFAULT_INSTANCE;
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
        
        private void mergeAllowPostCrossposts(final BoolValue allowPostCrossposts_) {
            allowPostCrossposts_.getClass();
            final BoolValue allowPostCrossposts_2 = this.allowPostCrossposts_;
            if (allowPostCrossposts_2 != null && allowPostCrossposts_2 != BoolValue.getDefaultInstance()) {
                this.allowPostCrossposts_ = (BoolValue)o.g(this.allowPostCrossposts_, allowPostCrossposts_);
            }
            else {
                this.allowPostCrossposts_ = allowPostCrossposts_;
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
        
        private void mergeBanEvasionThreshold(final Int32Value banEvasionThreshold_) {
            banEvasionThreshold_.getClass();
            final Int32Value banEvasionThreshold_2 = this.banEvasionThreshold_;
            if (banEvasionThreshold_2 != null && banEvasionThreshold_2 != Int32Value.getDefaultInstance()) {
                this.banEvasionThreshold_ = (Int32Value)b.d(this.banEvasionThreshold_, banEvasionThreshold_);
            }
            else {
                this.banEvasionThreshold_ = banEvasionThreshold_;
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
        
        private void mergeContentOptions(final StringValue contentOptions_) {
            contentOptions_.getClass();
            final StringValue contentOptions_2 = this.contentOptions_;
            if (contentOptions_2 != null && contentOptions_2 != StringValue.getDefaultInstance()) {
                this.contentOptions_ = (StringValue)w.e(this.contentOptions_, contentOptions_);
            }
            else {
                this.contentOptions_ = contentOptions_;
            }
        }
        
        private void mergeCrowdControlChatLevel(final Int32Value crowdControlChatLevel_) {
            crowdControlChatLevel_.getClass();
            final Int32Value crowdControlChatLevel_2 = this.crowdControlChatLevel_;
            if (crowdControlChatLevel_2 != null && crowdControlChatLevel_2 != Int32Value.getDefaultInstance()) {
                this.crowdControlChatLevel_ = (Int32Value)b.d(this.crowdControlChatLevel_, crowdControlChatLevel_);
            }
            else {
                this.crowdControlChatLevel_ = crowdControlChatLevel_;
            }
        }
        
        private void mergeCrowdControlFilter(final BoolValue crowdControlFilter_) {
            crowdControlFilter_.getClass();
            final BoolValue crowdControlFilter_2 = this.crowdControlFilter_;
            if (crowdControlFilter_2 != null && crowdControlFilter_2 != BoolValue.getDefaultInstance()) {
                this.crowdControlFilter_ = (BoolValue)o.g(this.crowdControlFilter_, crowdControlFilter_);
            }
            else {
                this.crowdControlFilter_ = crowdControlFilter_;
            }
        }
        
        private void mergeCrowdControlLevel(final Int32Value crowdControlLevel_) {
            crowdControlLevel_.getClass();
            final Int32Value crowdControlLevel_2 = this.crowdControlLevel_;
            if (crowdControlLevel_2 != null && crowdControlLevel_2 != Int32Value.getDefaultInstance()) {
                this.crowdControlLevel_ = (Int32Value)b.d(this.crowdControlLevel_, crowdControlLevel_);
            }
            else {
                this.crowdControlLevel_ = crowdControlLevel_;
            }
        }
        
        private void mergeCrowdControlMode(final BoolValue crowdControlMode_) {
            crowdControlMode_.getClass();
            final BoolValue crowdControlMode_2 = this.crowdControlMode_;
            if (crowdControlMode_2 != null && crowdControlMode_2 != BoolValue.getDefaultInstance()) {
                this.crowdControlMode_ = (BoolValue)o.g(this.crowdControlMode_, crowdControlMode_);
            }
            else {
                this.crowdControlMode_ = crowdControlMode_;
            }
        }
        
        private void mergeCrowdControlPostLevel(final Int32Value crowdControlPostLevel_) {
            crowdControlPostLevel_.getClass();
            final Int32Value crowdControlPostLevel_2 = this.crowdControlPostLevel_;
            if (crowdControlPostLevel_2 != null && crowdControlPostLevel_2 != Int32Value.getDefaultInstance()) {
                this.crowdControlPostLevel_ = (Int32Value)b.d(this.crowdControlPostLevel_, crowdControlPostLevel_);
            }
            else {
                this.crowdControlPostLevel_ = crowdControlPostLevel_;
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
        
        private void mergeDomain(final StringValue domain_) {
            domain_.getClass();
            final StringValue domain_2 = this.domain_;
            if (domain_2 != null && domain_2 != StringValue.getDefaultInstance()) {
                this.domain_ = (StringValue)w.e(this.domain_, domain_);
            }
            else {
                this.domain_ = domain_;
            }
        }
        
        private void mergeExcludeBannedModqueue(final BoolValue excludeBannedModqueue_) {
            excludeBannedModqueue_.getClass();
            final BoolValue excludeBannedModqueue_2 = this.excludeBannedModqueue_;
            if (excludeBannedModqueue_2 != null && excludeBannedModqueue_2 != BoolValue.getDefaultInstance()) {
                this.excludeBannedModqueue_ = (BoolValue)o.g(this.excludeBannedModqueue_, excludeBannedModqueue_);
            }
            else {
                this.excludeBannedModqueue_ = excludeBannedModqueue_;
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
        
        private void mergeHeaderHoverText(final StringValue headerHoverText_) {
            headerHoverText_.getClass();
            final StringValue headerHoverText_2 = this.headerHoverText_;
            if (headerHoverText_2 != null && headerHoverText_2 != StringValue.getDefaultInstance()) {
                this.headerHoverText_ = (StringValue)w.e(this.headerHoverText_, headerHoverText_);
            }
            else {
                this.headerHoverText_ = headerHoverText_;
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
        
        private void mergeLanguage(final StringValue language_) {
            language_.getClass();
            final StringValue language_2 = this.language_;
            if (language_2 != null && language_2 != StringValue.getDefaultInstance()) {
                this.language_ = (StringValue)w.e(this.language_, language_);
            }
            else {
                this.language_ = language_;
            }
        }
        
        private void mergeNewPinnedPostPnsEnabled(final BoolValue newPinnedPostPnsEnabled_) {
            newPinnedPostPnsEnabled_.getClass();
            final BoolValue newPinnedPostPnsEnabled_2 = this.newPinnedPostPnsEnabled_;
            if (newPinnedPostPnsEnabled_2 != null && newPinnedPostPnsEnabled_2 != BoolValue.getDefaultInstance()) {
                this.newPinnedPostPnsEnabled_ = (BoolValue)o.g(this.newPinnedPostPnsEnabled_, newPinnedPostPnsEnabled_);
            }
            else {
                this.newPinnedPostPnsEnabled_ = newPinnedPostPnsEnabled_;
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
        
        private void mergePredictionLeaderboardEntryType(final Int32Value predictionLeaderboardEntryType_) {
            predictionLeaderboardEntryType_.getClass();
            final Int32Value predictionLeaderboardEntryType_2 = this.predictionLeaderboardEntryType_;
            if (predictionLeaderboardEntryType_2 != null && predictionLeaderboardEntryType_2 != Int32Value.getDefaultInstance()) {
                this.predictionLeaderboardEntryType_ = (Int32Value)b.d(this.predictionLeaderboardEntryType_, predictionLeaderboardEntryType_);
            }
            else {
                this.predictionLeaderboardEntryType_ = predictionLeaderboardEntryType_;
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
        
        private void mergeSpamComments(final StringValue spamComments_) {
            spamComments_.getClass();
            final StringValue spamComments_2 = this.spamComments_;
            if (spamComments_2 != null && spamComments_2 != StringValue.getDefaultInstance()) {
                this.spamComments_ = (StringValue)w.e(this.spamComments_, spamComments_);
            }
            else {
                this.spamComments_ = spamComments_;
            }
        }
        
        private void mergeSpamLinks(final StringValue spamLinks_) {
            spamLinks_.getClass();
            final StringValue spamLinks_2 = this.spamLinks_;
            if (spamLinks_2 != null && spamLinks_2 != StringValue.getDefaultInstance()) {
                this.spamLinks_ = (StringValue)w.e(this.spamLinks_, spamLinks_);
            }
            else {
                this.spamLinks_ = spamLinks_;
            }
        }
        
        private void mergeSpamSelfposts(final StringValue spamSelfposts_) {
            spamSelfposts_.getClass();
            final StringValue spamSelfposts_2 = this.spamSelfposts_;
            if (spamSelfposts_2 != null && spamSelfposts_2 != StringValue.getDefaultInstance()) {
                this.spamSelfposts_ = (StringValue)w.e(this.spamSelfposts_, spamSelfposts_);
            }
            else {
                this.spamSelfposts_ = spamSelfposts_;
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
        
        private void mergeSubredditId(final StringValue subredditId_) {
            subredditId_.getClass();
            final StringValue subredditId_2 = this.subredditId_;
            if (subredditId_2 != null && subredditId_2 != StringValue.getDefaultInstance()) {
                this.subredditId_ = (StringValue)w.e(this.subredditId_, subredditId_);
            }
            else {
                this.subredditId_ = subredditId_;
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
        
        private void mergeSuggestedCommentSort(final BoolValue suggestedCommentSort_) {
            suggestedCommentSort_.getClass();
            final BoolValue suggestedCommentSort_2 = this.suggestedCommentSort_;
            if (suggestedCommentSort_2 != null && suggestedCommentSort_2 != BoolValue.getDefaultInstance()) {
                this.suggestedCommentSort_ = (BoolValue)o.g(this.suggestedCommentSort_, suggestedCommentSort_);
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
        
        private void mergeToxicityThresholdChatLevel(final Int32Value toxicityThresholdChatLevel_) {
            toxicityThresholdChatLevel_.getClass();
            final Int32Value toxicityThresholdChatLevel_2 = this.toxicityThresholdChatLevel_;
            if (toxicityThresholdChatLevel_2 != null && toxicityThresholdChatLevel_2 != Int32Value.getDefaultInstance()) {
                this.toxicityThresholdChatLevel_ = (Int32Value)b.d(this.toxicityThresholdChatLevel_, toxicityThresholdChatLevel_);
            }
            else {
                this.toxicityThresholdChatLevel_ = toxicityThresholdChatLevel_;
            }
        }
        
        private void mergeUserFlairPnsEnabled(final BoolValue userFlairPnsEnabled_) {
            userFlairPnsEnabled_.getClass();
            final BoolValue userFlairPnsEnabled_2 = this.userFlairPnsEnabled_;
            if (userFlairPnsEnabled_2 != null && userFlairPnsEnabled_2 != BoolValue.getDefaultInstance()) {
                this.userFlairPnsEnabled_ = (BoolValue)o.g(this.userFlairPnsEnabled_, userFlairPnsEnabled_);
            }
            else {
                this.userFlairPnsEnabled_ = userFlairPnsEnabled_;
            }
        }
        
        private void mergeWelcomeMessageEnabled(final BoolValue welcomeMessageEnabled_) {
            welcomeMessageEnabled_.getClass();
            final BoolValue welcomeMessageEnabled_2 = this.welcomeMessageEnabled_;
            if (welcomeMessageEnabled_2 != null && welcomeMessageEnabled_2 != BoolValue.getDefaultInstance()) {
                this.welcomeMessageEnabled_ = (BoolValue)o.g(this.welcomeMessageEnabled_, welcomeMessageEnabled_);
            }
            else {
                this.welcomeMessageEnabled_ = welcomeMessageEnabled_;
            }
        }
        
        private void mergeWelcomeMessageText(final StringValue welcomeMessageText_) {
            welcomeMessageText_.getClass();
            final StringValue welcomeMessageText_2 = this.welcomeMessageText_;
            if (welcomeMessageText_2 != null && welcomeMessageText_2 != StringValue.getDefaultInstance()) {
                this.welcomeMessageText_ = (StringValue)w.e(this.welcomeMessageText_, welcomeMessageText_);
            }
            else {
                this.welcomeMessageText_ = welcomeMessageText_;
            }
        }
        
        private void mergeWikiEditAge(final Int32Value wikiEditAge_) {
            wikiEditAge_.getClass();
            final Int32Value wikiEditAge_2 = this.wikiEditAge_;
            if (wikiEditAge_2 != null && wikiEditAge_2 != Int32Value.getDefaultInstance()) {
                this.wikiEditAge_ = (Int32Value)b.d(this.wikiEditAge_, wikiEditAge_);
            }
            else {
                this.wikiEditAge_ = wikiEditAge_;
            }
        }
        
        private void mergeWikiEditKarma(final Int32Value wikiEditKarma_) {
            wikiEditKarma_.getClass();
            final Int32Value wikiEditKarma_2 = this.wikiEditKarma_;
            if (wikiEditKarma_2 != null && wikiEditKarma_2 != Int32Value.getDefaultInstance()) {
                this.wikiEditKarma_ = (Int32Value)b.d(this.wikiEditKarma_, wikiEditKarma_);
            }
            else {
                this.wikiEditKarma_ = wikiEditKarma_;
            }
        }
        
        private void mergeWikimode(final StringValue wikimode_) {
            wikimode_.getClass();
            final StringValue wikimode_2 = this.wikimode_;
            if (wikimode_2 != null && wikimode_2 != StringValue.getDefaultInstance()) {
                this.wikimode_ = (StringValue)w.e(this.wikimode_, wikimode_);
            }
            else {
                this.wikimode_ = wikimode_;
            }
        }
        
        public static a newBuilder() {
            return (a)SubredditSettings.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final SubredditSettings subredditSettings) {
            return (a)SubredditSettings.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditSettings);
        }
        
        public static SubredditSettings parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (SubredditSettings)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, inputStream);
        }
        
        public static SubredditSettings parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (SubredditSettings)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static SubredditSettings parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, byteString);
        }
        
        public static SubredditSettings parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static SubredditSettings parseFrom(final l l) throws IOException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, l);
        }
        
        public static SubredditSettings parseFrom(final l l, final d0 d0) throws IOException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, l, d0);
        }
        
        public static SubredditSettings parseFrom(final InputStream inputStream) throws IOException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, inputStream);
        }
        
        public static SubredditSettings parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static SubredditSettings parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static SubredditSettings parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static SubredditSettings parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, array);
        }
        
        public static SubredditSettings parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (SubredditSettings)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<SubredditSettings> parser() {
            return (n1<SubredditSettings>)SubredditSettings.DEFAULT_INSTANCE.getParserForType();
        }
        
        private void setAcceptFollowers(final BoolValue acceptFollowers_) {
            acceptFollowers_.getClass();
            this.acceptFollowers_ = acceptFollowers_;
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
        
        private void setAllowPostCrossposts(final BoolValue allowPostCrossposts_) {
            allowPostCrossposts_.getClass();
            this.allowPostCrossposts_ = allowPostCrossposts_;
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
        
        private void setAllowVideos(final BoolValue allowVideos_) {
            allowVideos_.getClass();
            this.allowVideos_ = allowVideos_;
        }
        
        private void setBanEvasionThreshold(final Int32Value banEvasionThreshold_) {
            banEvasionThreshold_.getClass();
            this.banEvasionThreshold_ = banEvasionThreshold_;
        }
        
        private void setCollapseDeletedComments(final BoolValue collapseDeletedComments_) {
            collapseDeletedComments_.getClass();
            this.collapseDeletedComments_ = collapseDeletedComments_;
        }
        
        private void setCommentContributionSettings(final SubredditsMsg$CommentContributionSettings commentContributionSettings_) {
            commentContributionSettings_.getClass();
            this.commentContributionSettings_ = commentContributionSettings_;
        }
        
        private void setCommentScoreHideMins(final Int32Value commentScoreHideMins_) {
            commentScoreHideMins_.getClass();
            this.commentScoreHideMins_ = commentScoreHideMins_;
        }
        
        private void setContentOptions(final StringValue contentOptions_) {
            contentOptions_.getClass();
            this.contentOptions_ = contentOptions_;
        }
        
        private void setCrowdControlChatLevel(final Int32Value crowdControlChatLevel_) {
            crowdControlChatLevel_.getClass();
            this.crowdControlChatLevel_ = crowdControlChatLevel_;
        }
        
        private void setCrowdControlFilter(final BoolValue crowdControlFilter_) {
            crowdControlFilter_.getClass();
            this.crowdControlFilter_ = crowdControlFilter_;
        }
        
        private void setCrowdControlLevel(final Int32Value crowdControlLevel_) {
            crowdControlLevel_.getClass();
            this.crowdControlLevel_ = crowdControlLevel_;
        }
        
        private void setCrowdControlMode(final BoolValue crowdControlMode_) {
            crowdControlMode_.getClass();
            this.crowdControlMode_ = crowdControlMode_;
        }
        
        private void setCrowdControlPostLevel(final Int32Value crowdControlPostLevel_) {
            crowdControlPostLevel_.getClass();
            this.crowdControlPostLevel_ = crowdControlPostLevel_;
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
        
        private void setDomain(final StringValue domain_) {
            domain_.getClass();
            this.domain_ = domain_;
        }
        
        private void setExcludeBannedModqueue(final BoolValue excludeBannedModqueue_) {
            excludeBannedModqueue_.getClass();
            this.excludeBannedModqueue_ = excludeBannedModqueue_;
        }
        
        private void setFreeFormReports(final BoolValue freeFormReports_) {
            freeFormReports_.getClass();
            this.freeFormReports_ = freeFormReports_;
        }
        
        private void setHeaderHoverText(final StringValue headerHoverText_) {
            headerHoverText_.getClass();
            this.headerHoverText_ = headerHoverText_;
        }
        
        private void setHideAds(final BoolValue hideAds_) {
            hideAds_.getClass();
            this.hideAds_ = hideAds_;
        }
        
        private void setKeyColor(final StringValue keyColor_) {
            keyColor_.getClass();
            this.keyColor_ = keyColor_;
        }
        
        private void setLanguage(final StringValue language_) {
            language_.getClass();
            this.language_ = language_;
        }
        
        private void setNewPinnedPostPnsEnabled(final BoolValue newPinnedPostPnsEnabled_) {
            newPinnedPostPnsEnabled_.getClass();
            this.newPinnedPostPnsEnabled_ = newPinnedPostPnsEnabled_;
        }
        
        private void setOriginalContentTagEnabled(final BoolValue originalContentTagEnabled_) {
            originalContentTagEnabled_.getClass();
            this.originalContentTagEnabled_ = originalContentTagEnabled_;
        }
        
        private void setOver18(final BoolValue over18_) {
            over18_.getClass();
            this.over18_ = over18_;
        }
        
        private void setPredictionLeaderboardEntryType(final Int32Value predictionLeaderboardEntryType_) {
            predictionLeaderboardEntryType_.getClass();
            this.predictionLeaderboardEntryType_ = predictionLeaderboardEntryType_;
        }
        
        private void setPublicDescription(final StringValue publicDescription_) {
            publicDescription_.getClass();
            this.publicDescription_ = publicDescription_;
        }
        
        private void setPublicTraffic(final BoolValue publicTraffic_) {
            publicTraffic_.getClass();
            this.publicTraffic_ = publicTraffic_;
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
        
        private void setShowMedia(final BoolValue showMedia_) {
            showMedia_.getClass();
            this.showMedia_ = showMedia_;
        }
        
        private void setShowMediaPreview(final BoolValue showMediaPreview_) {
            showMediaPreview_.getClass();
            this.showMediaPreview_ = showMediaPreview_;
        }
        
        private void setSpamComments(final StringValue spamComments_) {
            spamComments_.getClass();
            this.spamComments_ = spamComments_;
        }
        
        private void setSpamLinks(final StringValue spamLinks_) {
            spamLinks_.getClass();
            this.spamLinks_ = spamLinks_;
        }
        
        private void setSpamSelfposts(final StringValue spamSelfposts_) {
            spamSelfposts_.getClass();
            this.spamSelfposts_ = spamSelfposts_;
        }
        
        private void setSpoilersEnabled(final BoolValue spoilersEnabled_) {
            spoilersEnabled_.getClass();
            this.spoilersEnabled_ = spoilersEnabled_;
        }
        
        private void setSubmitLinkLabel(final StringValue submitLinkLabel_) {
            submitLinkLabel_.getClass();
            this.submitLinkLabel_ = submitLinkLabel_;
        }
        
        private void setSubmitText(final StringValue submitText_) {
            submitText_.getClass();
            this.submitText_ = submitText_;
        }
        
        private void setSubmitTextLabel(final StringValue submitTextLabel_) {
            submitTextLabel_.getClass();
            this.submitTextLabel_ = submitTextLabel_;
        }
        
        private void setSubredditId(final StringValue subredditId_) {
            subredditId_.getClass();
            this.subredditId_ = subredditId_;
        }
        
        private void setSubredditType(final StringValue subredditType_) {
            subredditType_.getClass();
            this.subredditType_ = subredditType_;
        }
        
        private void setSuggestedCommentSort(final BoolValue suggestedCommentSort_) {
            suggestedCommentSort_.getClass();
            this.suggestedCommentSort_ = suggestedCommentSort_;
        }
        
        private void setTitle(final StringValue title_) {
            title_.getClass();
            this.title_ = title_;
        }
        
        private void setToxicityThresholdChatLevel(final Int32Value toxicityThresholdChatLevel_) {
            toxicityThresholdChatLevel_.getClass();
            this.toxicityThresholdChatLevel_ = toxicityThresholdChatLevel_;
        }
        
        private void setUserFlairPnsEnabled(final BoolValue userFlairPnsEnabled_) {
            userFlairPnsEnabled_.getClass();
            this.userFlairPnsEnabled_ = userFlairPnsEnabled_;
        }
        
        private void setWelcomeMessageEnabled(final BoolValue welcomeMessageEnabled_) {
            welcomeMessageEnabled_.getClass();
            this.welcomeMessageEnabled_ = welcomeMessageEnabled_;
        }
        
        private void setWelcomeMessageText(final StringValue welcomeMessageText_) {
            welcomeMessageText_.getClass();
            this.welcomeMessageText_ = welcomeMessageText_;
        }
        
        private void setWikiEditAge(final Int32Value wikiEditAge_) {
            wikiEditAge_.getClass();
            this.wikiEditAge_ = wikiEditAge_;
        }
        
        private void setWikiEditKarma(final Int32Value wikiEditKarma_) {
            wikiEditKarma_.getClass();
            this.wikiEditKarma_ = wikiEditKarma_;
        }
        
        private void setWikimode(final StringValue wikimode_) {
            wikimode_.getClass();
            this.wikimode_ = wikimode_;
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
                    final n1<SubredditSettings> parser;
                    if ((parser = SubredditSettings.PARSER) == null) {
                        synchronized (SubredditSettings.class) {
                            if (SubredditSettings.PARSER == null) {
                                SubredditSettings.PARSER = (n1<SubredditSettings>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditSettings.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return SubredditSettings.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)SubredditSettings.DEFAULT_INSTANCE, "\u0000>\u0000\u0000\u0001>>\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t \t!\t\"\t#\t$\t%\t&\t'\t(\t)\t*\t+\t,\t-\t.\t/\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t:\t;\t<\t=\t>\t", new Object[] { "defaultSet_", "toxicityThresholdChatLevel_", "crowdControlChatLevel_", "restrictPosting_", "publicDescription_", "subredditId_", "allowImages_", "freeFormReports_", "domain_", "originalContentTagEnabled_", "showMedia_", "excludeBannedModqueue_", "shouldArchivePosts_", "submitText_", "spamLinks_", "title_", "collapseDeletedComments_", "wikimode_", "over18_", "allowVideos_", "allowGalleries_", "crowdControlLevel_", "banEvasionThreshold_", "crowdControlMode_", "welcomeMessageEnabled_", "welcomeMessageText_", "suggestedCommentSort_", "disableContributorRequests_", "allowTalks_", "description_", "submitLinkLabel_", "spoilersEnabled_", "allowPostCrossposts_", "spamComments_", "publicTraffic_", "restrictCommenting_", "allowPolls_", "commentContributionSettings_", "submitTextLabel_", "commentScoreHideMins_", "allOriginalContent_", "spamSelfposts_", "keyColor_", "language_", "newPinnedPostPnsEnabled_", "hideAds_", "predictionLeaderboardEntryType_", "headerHoverText_", "wikiEditAge_", "allowChatPostCreation_", "allowPredictionContributors_", "allowDiscovery_", "acceptFollowers_", "crowdControlPostLevel_", "allowPredictionsTournament_", "wikiEditKarma_", "showMediaPreview_", "crowdControlFilter_", "subredditType_", "allowPredictions_", "userFlairPnsEnabled_", "contentOptions_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new SubredditSettings();
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
        
        public BoolValue getAllowPostCrossposts() {
            BoolValue boolValue;
            if ((boolValue = this.allowPostCrossposts_) == null) {
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
        
        public BoolValue getAllowVideos() {
            BoolValue boolValue;
            if ((boolValue = this.allowVideos_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int32Value getBanEvasionThreshold() {
            Int32Value int32Value;
            if ((int32Value = this.banEvasionThreshold_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public BoolValue getCollapseDeletedComments() {
            BoolValue boolValue;
            if ((boolValue = this.collapseDeletedComments_) == null) {
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
        
        public StringValue getContentOptions() {
            StringValue stringValue;
            if ((stringValue = this.contentOptions_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int32Value getCrowdControlChatLevel() {
            Int32Value int32Value;
            if ((int32Value = this.crowdControlChatLevel_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public BoolValue getCrowdControlFilter() {
            BoolValue boolValue;
            if ((boolValue = this.crowdControlFilter_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int32Value getCrowdControlLevel() {
            Int32Value int32Value;
            if ((int32Value = this.crowdControlLevel_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public BoolValue getCrowdControlMode() {
            BoolValue boolValue;
            if ((boolValue = this.crowdControlMode_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public Int32Value getCrowdControlPostLevel() {
            Int32Value int32Value;
            if ((int32Value = this.crowdControlPostLevel_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
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
        
        public StringValue getDomain() {
            StringValue stringValue;
            if ((stringValue = this.domain_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getExcludeBannedModqueue() {
            BoolValue boolValue;
            if ((boolValue = this.excludeBannedModqueue_) == null) {
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
        
        public StringValue getHeaderHoverText() {
            StringValue stringValue;
            if ((stringValue = this.headerHoverText_) == null) {
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
        
        public StringValue getKeyColor() {
            StringValue stringValue;
            if ((stringValue = this.keyColor_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getLanguage() {
            StringValue stringValue;
            if ((stringValue = this.language_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getNewPinnedPostPnsEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.newPinnedPostPnsEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
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
        
        public Int32Value getPredictionLeaderboardEntryType() {
            Int32Value int32Value;
            if ((int32Value = this.predictionLeaderboardEntryType_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public StringValue getPublicDescription() {
            StringValue stringValue;
            if ((stringValue = this.publicDescription_) == null) {
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
        
        public StringValue getSpamComments() {
            StringValue stringValue;
            if ((stringValue = this.spamComments_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSpamLinks() {
            StringValue stringValue;
            if ((stringValue = this.spamLinks_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public StringValue getSpamSelfposts() {
            StringValue stringValue;
            if ((stringValue = this.spamSelfposts_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public BoolValue getSpoilersEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.spoilersEnabled_) == null) {
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
        
        public StringValue getSubmitText() {
            StringValue stringValue;
            if ((stringValue = this.submitText_) == null) {
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
        
        public StringValue getSubredditId() {
            StringValue stringValue;
            if ((stringValue = this.subredditId_) == null) {
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
        
        public BoolValue getSuggestedCommentSort() {
            BoolValue boolValue;
            if ((boolValue = this.suggestedCommentSort_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getTitle() {
            StringValue stringValue;
            if ((stringValue = this.title_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int32Value getToxicityThresholdChatLevel() {
            Int32Value int32Value;
            if ((int32Value = this.toxicityThresholdChatLevel_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public BoolValue getUserFlairPnsEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.userFlairPnsEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public BoolValue getWelcomeMessageEnabled() {
            BoolValue boolValue;
            if ((boolValue = this.welcomeMessageEnabled_) == null) {
                boolValue = BoolValue.getDefaultInstance();
            }
            return boolValue;
        }
        
        public StringValue getWelcomeMessageText() {
            StringValue stringValue;
            if ((stringValue = this.welcomeMessageText_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public Int32Value getWikiEditAge() {
            Int32Value int32Value;
            if ((int32Value = this.wikiEditAge_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public Int32Value getWikiEditKarma() {
            Int32Value int32Value;
            if ((int32Value = this.wikiEditKarma_) == null) {
                int32Value = Int32Value.getDefaultInstance();
            }
            return int32Value;
        }
        
        public StringValue getWikimode() {
            StringValue stringValue;
            if ((stringValue = this.wikimode_) == null) {
                stringValue = StringValue.getDefaultInstance();
            }
            return stringValue;
        }
        
        public boolean hasAcceptFollowers() {
            return this.acceptFollowers_ != null;
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
        
        public boolean hasAllowPostCrossposts() {
            return this.allowPostCrossposts_ != null;
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
        
        public boolean hasAllowVideos() {
            return this.allowVideos_ != null;
        }
        
        public boolean hasBanEvasionThreshold() {
            return this.banEvasionThreshold_ != null;
        }
        
        public boolean hasCollapseDeletedComments() {
            return this.collapseDeletedComments_ != null;
        }
        
        public boolean hasCommentContributionSettings() {
            return this.commentContributionSettings_ != null;
        }
        
        public boolean hasCommentScoreHideMins() {
            return this.commentScoreHideMins_ != null;
        }
        
        public boolean hasContentOptions() {
            return this.contentOptions_ != null;
        }
        
        public boolean hasCrowdControlChatLevel() {
            return this.crowdControlChatLevel_ != null;
        }
        
        public boolean hasCrowdControlFilter() {
            return this.crowdControlFilter_ != null;
        }
        
        public boolean hasCrowdControlLevel() {
            return this.crowdControlLevel_ != null;
        }
        
        public boolean hasCrowdControlMode() {
            return this.crowdControlMode_ != null;
        }
        
        public boolean hasCrowdControlPostLevel() {
            return this.crowdControlPostLevel_ != null;
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
        
        public boolean hasDomain() {
            return this.domain_ != null;
        }
        
        public boolean hasExcludeBannedModqueue() {
            return this.excludeBannedModqueue_ != null;
        }
        
        public boolean hasFreeFormReports() {
            return this.freeFormReports_ != null;
        }
        
        public boolean hasHeaderHoverText() {
            return this.headerHoverText_ != null;
        }
        
        public boolean hasHideAds() {
            return this.hideAds_ != null;
        }
        
        public boolean hasKeyColor() {
            return this.keyColor_ != null;
        }
        
        public boolean hasLanguage() {
            return this.language_ != null;
        }
        
        public boolean hasNewPinnedPostPnsEnabled() {
            return this.newPinnedPostPnsEnabled_ != null;
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
        
        public boolean hasPublicDescription() {
            return this.publicDescription_ != null;
        }
        
        public boolean hasPublicTraffic() {
            return this.publicTraffic_ != null;
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
        
        public boolean hasShowMedia() {
            return this.showMedia_ != null;
        }
        
        public boolean hasShowMediaPreview() {
            return this.showMediaPreview_ != null;
        }
        
        public boolean hasSpamComments() {
            return this.spamComments_ != null;
        }
        
        public boolean hasSpamLinks() {
            return this.spamLinks_ != null;
        }
        
        public boolean hasSpamSelfposts() {
            return this.spamSelfposts_ != null;
        }
        
        public boolean hasSpoilersEnabled() {
            return this.spoilersEnabled_ != null;
        }
        
        public boolean hasSubmitLinkLabel() {
            return this.submitLinkLabel_ != null;
        }
        
        public boolean hasSubmitText() {
            return this.submitText_ != null;
        }
        
        public boolean hasSubmitTextLabel() {
            return this.submitTextLabel_ != null;
        }
        
        public boolean hasSubredditId() {
            return this.subredditId_ != null;
        }
        
        public boolean hasSubredditType() {
            return this.subredditType_ != null;
        }
        
        public boolean hasSuggestedCommentSort() {
            return this.suggestedCommentSort_ != null;
        }
        
        public boolean hasTitle() {
            return this.title_ != null;
        }
        
        public boolean hasToxicityThresholdChatLevel() {
            return this.toxicityThresholdChatLevel_ != null;
        }
        
        public boolean hasUserFlairPnsEnabled() {
            return this.userFlairPnsEnabled_ != null;
        }
        
        public boolean hasWelcomeMessageEnabled() {
            return this.welcomeMessageEnabled_ != null;
        }
        
        public boolean hasWelcomeMessageText() {
            return this.welcomeMessageText_ != null;
        }
        
        public boolean hasWikiEditAge() {
            return this.wikiEditAge_ != null;
        }
        
        public boolean hasWikiEditKarma() {
            return this.wikiEditKarma_ != null;
        }
        
        public boolean hasWikimode() {
            return this.wikimode_ != null;
        }
        
        public static final class a extends GeneratedMessageLite$b<SubredditSettings, a> implements d1
        {
            public a() {
                super((GeneratedMessageLite)SubredditSettings.access$112200());
            }
        }
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditAboutEditResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditAboutEditResponse.access$131000());
        }
    }
}
