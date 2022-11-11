// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.common;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.x1;
import com.google.protobuf.e;
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
import com.google.protobuf.ListValue$b;
import com.google.protobuf.Any$b;
import al0.f0;
import al0.b;
import java.util.List;
import com.google.protobuf.a;
import com.google.protobuf.ListValue;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Any;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class CommonMsg$RedditObject extends GeneratedMessageLite<CommonMsg$RedditObject, b> implements d1
{
    public static final int ALL_AWARDINGS_FIELD_NUMBER = 1;
    public static final int APPROVED_AT_UTC_FIELD_NUMBER = 3;
    public static final int APPROVED_BY_FIELD_NUMBER = 4;
    public static final int APPROVED_FIELD_NUMBER = 2;
    public static final int ARCHIVED_FIELD_NUMBER = 5;
    public static final int ASSOCIATED_AWARD_FIELD_NUMBER = 6;
    public static final int AUTHOR_FIELD_NUMBER = 7;
    public static final int AUTHOR_FLAIR_BACKGROUND_COLOR_FIELD_NUMBER = 8;
    public static final int AUTHOR_FLAIR_CSS_CLASS_FIELD_NUMBER = 9;
    public static final int AUTHOR_FLAIR_RICHTEXT_FIELD_NUMBER = 10;
    public static final int AUTHOR_FLAIR_TEMPLATE_ID_FIELD_NUMBER = 11;
    public static final int AUTHOR_FLAIR_TEXT_COLOR_FIELD_NUMBER = 13;
    public static final int AUTHOR_FLAIR_TEXT_FIELD_NUMBER = 12;
    public static final int AUTHOR_FLAIR_TYPE_FIELD_NUMBER = 14;
    public static final int AUTHOR_FULLNAME_FIELD_NUMBER = 15;
    public static final int AUTHOR_IS_BLOCKED_FIELD_NUMBER = 16;
    public static final int AUTHOR_PATREON_FLAIR_FIELD_NUMBER = 17;
    public static final int AUTHOR_PREMIUM_FIELD_NUMBER = 18;
    public static final int AWARDERS_FIELD_NUMBER = 19;
    public static final int BANNED_AT_UTC_FIELD_NUMBER = 20;
    public static final int BANNED_BY_FIELD_NUMBER = 21;
    public static final int BODY_FIELD_NUMBER = 22;
    public static final int BODY_HTML_FIELD_NUMBER = 23;
    public static final int CAN_GILD_FIELD_NUMBER = 24;
    public static final int CAN_MOD_POST_FIELD_NUMBER = 25;
    public static final int COLLAPSED_BECAUSE_CROWD_CONTROL_FIELD_NUMBER = 27;
    public static final int COLLAPSED_FIELD_NUMBER = 26;
    public static final int COLLAPSED_REASON_CODE_FIELD_NUMBER = 29;
    public static final int COLLAPSED_REASON_FIELD_NUMBER = 28;
    public static final int COMMENT_TYPE_FIELD_NUMBER = 30;
    public static final int CONTROVERSIALITY_FIELD_NUMBER = 31;
    public static final int CREATED_FIELD_NUMBER = 32;
    public static final int CREATED_UTC_FIELD_NUMBER = 33;
    private static final CommonMsg$RedditObject DEFAULT_INSTANCE;
    public static final int DEPTH_FIELD_NUMBER = 76;
    public static final int DISTINGUISHED_FIELD_NUMBER = 34;
    public static final int DOWNS_FIELD_NUMBER = 35;
    public static final int EDITED_FIELD_NUMBER = 36;
    public static final int GILDED_FIELD_NUMBER = 37;
    public static final int GILDINGS_FIELD_NUMBER = 38;
    public static final int ID_FIELD_NUMBER = 39;
    public static final int IGNORE_REPORTS_FIELD_NUMBER = 40;
    public static final int IS_SUBMITTER_FIELD_NUMBER = 41;
    public static final int LIKES_FIELD_NUMBER = 42;
    public static final int LINK_AUTHOR_FIELD_NUMBER = 78;
    public static final int LINK_ID_FIELD_NUMBER = 43;
    public static final int LINK_PERMALINK_FIELD_NUMBER = 81;
    public static final int LINK_TITLE_FIELD_NUMBER = 77;
    public static final int LINK_URL_FIELD_NUMBER = 83;
    public static final int LOCKED_FIELD_NUMBER = 44;
    public static final int MOD_NOTE_FIELD_NUMBER = 45;
    public static final int MOD_REASON_BY_FIELD_NUMBER = 46;
    public static final int MOD_REASON_TITLE_FIELD_NUMBER = 47;
    public static final int MOD_REPORTS_FIELD_NUMBER = 48;
    public static final int NAME_FIELD_NUMBER = 49;
    public static final int NO_FOLLOW_FIELD_NUMBER = 50;
    public static final int NUM_COMMENTS_FIELD_NUMBER = 79;
    public static final int NUM_REPORTS_FIELD_NUMBER = 52;
    public static final int OVER_18_FIELD_NUMBER = 80;
    public static final int PARENT_ID_FIELD_NUMBER = 53;
    private static volatile n1<CommonMsg$RedditObject> PARSER;
    public static final int PERMALINK_FIELD_NUMBER = 54;
    public static final int QUARANTINE_FIELD_NUMBER = 82;
    public static final int REMOVAL_REASON_FIELD_NUMBER = 55;
    public static final int REMOVED_FIELD_NUMBER = 56;
    public static final int REPLIES_FIELD_NUMBER = 57;
    public static final int REPORT_REASONS_FIELD_NUMBER = 58;
    public static final int RTE_MODE_FIELD_NUMBER = 59;
    public static final int SAVED_FIELD_NUMBER = 60;
    public static final int SCORE_FIELD_NUMBER = 61;
    public static final int SCORE_HIDDEN_FIELD_NUMBER = 62;
    public static final int SELFTEXT_FIELD_NUMBER = 84;
    public static final int SELFTEXT_HTML_FIELD_NUMBER = 85;
    public static final int SEND_REPLIES_FIELD_NUMBER = 63;
    public static final int SPAM_FIELD_NUMBER = 64;
    public static final int SPOILER_FIELD_NUMBER = 86;
    public static final int STICKIED_FIELD_NUMBER = 65;
    public static final int SUBREDDIT_FIELD_NUMBER = 66;
    public static final int SUBREDDIT_ID_FIELD_NUMBER = 67;
    public static final int SUBREDDIT_NAME_PREFIXED_FIELD_NUMBER = 68;
    public static final int SUBREDDIT_TYPE_FIELD_NUMBER = 69;
    public static final int THUMBNAIL_FIELD_NUMBER = 87;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 89;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 88;
    public static final int TITLE_FIELD_NUMBER = 90;
    public static final int TOP_AWARDED_TYPE_FIELD_NUMBER = 70;
    public static final int TOTAL_AWARDS_RECEIVED_FIELD_NUMBER = 71;
    public static final int TREATMENT_TAGS_FIELD_NUMBER = 72;
    public static final int UNREPLIABLE_REASON_FIELD_NUMBER = 73;
    public static final int UPS_FIELD_NUMBER = 74;
    public static final int URL_FIELD_NUMBER = 91;
    public static final int USER_REPORTS_FIELD_NUMBER = 75;
    private Internal$j<Any> allAwardings_;
    private Int64Value approvedAtUtc_;
    private StringValue approvedBy_;
    private BoolValue approved_;
    private BoolValue archived_;
    private StringValue associatedAward_;
    private StringValue authorFlairBackgroundColor_;
    private StringValue authorFlairCssClass_;
    private Internal$j<AuthorFlairRichText> authorFlairRichtext_;
    private StringValue authorFlairTemplateId_;
    private StringValue authorFlairTextColor_;
    private StringValue authorFlairText_;
    private StringValue authorFlairType_;
    private StringValue authorFullname_;
    private BoolValue authorIsBlocked_;
    private BoolValue authorPatreonFlair_;
    private BoolValue authorPremium_;
    private StringValue author_;
    private Internal$j<StringValue> awarders_;
    private Int64Value bannedAtUtc_;
    private StringValue bannedBy_;
    private StringValue bodyHtml_;
    private StringValue body_;
    private BoolValue canGild_;
    private BoolValue canModPost_;
    private BoolValue collapsedBecauseCrowdControl_;
    private StringValue collapsedReasonCode_;
    private StringValue collapsedReason_;
    private BoolValue collapsed_;
    private StringValue commentType_;
    private Int64Value controversiality_;
    private Int64Value createdUtc_;
    private Int64Value created_;
    private Int64Value depth_;
    private StringValue distinguished_;
    private Int64Value downs_;
    private BoolValue edited_;
    private Int64Value gilded_;
    private Any gildings_;
    private StringValue id_;
    private BoolValue ignoreReports_;
    private BoolValue isSubmitter_;
    private BoolValue likes_;
    private StringValue linkAuthor_;
    private StringValue linkId_;
    private StringValue linkPermalink_;
    private StringValue linkTitle_;
    private StringValue linkUrl_;
    private BoolValue locked_;
    private StringValue modNote_;
    private StringValue modReasonBy_;
    private StringValue modReasonTitle_;
    private Internal$j<Any> modReports_;
    private StringValue name_;
    private BoolValue noFollow_;
    private Int64Value numComments_;
    private Int64Value numReports_;
    private BoolValue over18_;
    private StringValue parentId_;
    private StringValue permalink_;
    private BoolValue quarantine_;
    private StringValue removalReason_;
    private BoolValue removed_;
    private StringValue replies_;
    private ListValue reportReasons_;
    private StringValue rteMode_;
    private BoolValue saved_;
    private BoolValue scoreHidden_;
    private Int64Value score_;
    private StringValue selftextHtml_;
    private StringValue selftext_;
    private BoolValue sendReplies_;
    private BoolValue spam_;
    private StringValue spoiler_;
    private BoolValue stickied_;
    private StringValue subredditId_;
    private StringValue subredditNamePrefixed_;
    private StringValue subredditType_;
    private StringValue subreddit_;
    private Int64Value thumbnailHeight_;
    private Int64Value thumbnailWidth_;
    private StringValue thumbnail_;
    private StringValue title_;
    private StringValue topAwardedType_;
    private Int64Value totalAwardsReceived_;
    private Internal$j<Any> treatmentTags_;
    private StringValue unrepliableReason_;
    private Int64Value ups_;
    private StringValue url_;
    private Internal$j<Any> userReports_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)CommonMsg$RedditObject.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new CommonMsg$RedditObject()));
    }
    
    private CommonMsg$RedditObject() {
        this.allAwardings_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
        this.authorFlairRichtext_ = (Internal$j<AuthorFlairRichText>)GeneratedMessageLite.emptyProtobufList();
        this.awarders_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
        this.modReports_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
        this.treatmentTags_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
        this.userReports_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static /* synthetic */ CommonMsg$RedditObject access$6500() {
        return CommonMsg$RedditObject.DEFAULT_INSTANCE;
    }
    
    private void addAllAllAwardings(final Iterable<? extends Any> iterable) {
        this.ensureAllAwardingsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.allAwardings_);
    }
    
    private void addAllAuthorFlairRichtext(final Iterable<? extends AuthorFlairRichText> iterable) {
        this.ensureAuthorFlairRichtextIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.authorFlairRichtext_);
    }
    
    private void addAllAwarders(final Iterable<? extends StringValue> iterable) {
        this.ensureAwardersIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.awarders_);
    }
    
    private void addAllAwardings(final int n, final Any any) {
        any.getClass();
        this.ensureAllAwardingsIsMutable();
        ((List<Any>)this.allAwardings_).add(n, any);
    }
    
    private void addAllAwardings(final Any any) {
        any.getClass();
        this.ensureAllAwardingsIsMutable();
        ((List<Any>)this.allAwardings_).add(any);
    }
    
    private void addAllModReports(final Iterable<? extends Any> iterable) {
        this.ensureModReportsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.modReports_);
    }
    
    private void addAllTreatmentTags(final Iterable<? extends Any> iterable) {
        this.ensureTreatmentTagsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.treatmentTags_);
    }
    
    private void addAllUserReports(final Iterable<? extends Any> iterable) {
        this.ensureUserReportsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.userReports_);
    }
    
    private void addAuthorFlairRichtext(final int n, final AuthorFlairRichText authorFlairRichText) {
        authorFlairRichText.getClass();
        this.ensureAuthorFlairRichtextIsMutable();
        ((List<AuthorFlairRichText>)this.authorFlairRichtext_).add(n, authorFlairRichText);
    }
    
    private void addAuthorFlairRichtext(final AuthorFlairRichText authorFlairRichText) {
        authorFlairRichText.getClass();
        this.ensureAuthorFlairRichtextIsMutable();
        ((List<AuthorFlairRichText>)this.authorFlairRichtext_).add(authorFlairRichText);
    }
    
    private void addAwarders(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureAwardersIsMutable();
        ((List<StringValue>)this.awarders_).add(n, stringValue);
    }
    
    private void addAwarders(final StringValue stringValue) {
        stringValue.getClass();
        this.ensureAwardersIsMutable();
        ((List<StringValue>)this.awarders_).add(stringValue);
    }
    
    private void addModReports(final int n, final Any any) {
        any.getClass();
        this.ensureModReportsIsMutable();
        ((List<Any>)this.modReports_).add(n, any);
    }
    
    private void addModReports(final Any any) {
        any.getClass();
        this.ensureModReportsIsMutable();
        ((List<Any>)this.modReports_).add(any);
    }
    
    private void addTreatmentTags(final int n, final Any any) {
        any.getClass();
        this.ensureTreatmentTagsIsMutable();
        ((List<Any>)this.treatmentTags_).add(n, any);
    }
    
    private void addTreatmentTags(final Any any) {
        any.getClass();
        this.ensureTreatmentTagsIsMutable();
        ((List<Any>)this.treatmentTags_).add(any);
    }
    
    private void addUserReports(final int n, final Any any) {
        any.getClass();
        this.ensureUserReportsIsMutable();
        ((List<Any>)this.userReports_).add(n, any);
    }
    
    private void addUserReports(final Any any) {
        any.getClass();
        this.ensureUserReportsIsMutable();
        ((List<Any>)this.userReports_).add(any);
    }
    
    private void clearAllAwardings() {
        this.allAwardings_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearApproved() {
        this.approved_ = null;
    }
    
    private void clearApprovedAtUtc() {
        this.approvedAtUtc_ = null;
    }
    
    private void clearApprovedBy() {
        this.approvedBy_ = null;
    }
    
    private void clearArchived() {
        this.archived_ = null;
    }
    
    private void clearAssociatedAward() {
        this.associatedAward_ = null;
    }
    
    private void clearAuthor() {
        this.author_ = null;
    }
    
    private void clearAuthorFlairBackgroundColor() {
        this.authorFlairBackgroundColor_ = null;
    }
    
    private void clearAuthorFlairCssClass() {
        this.authorFlairCssClass_ = null;
    }
    
    private void clearAuthorFlairRichtext() {
        this.authorFlairRichtext_ = (Internal$j<AuthorFlairRichText>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearAuthorFlairTemplateId() {
        this.authorFlairTemplateId_ = null;
    }
    
    private void clearAuthorFlairText() {
        this.authorFlairText_ = null;
    }
    
    private void clearAuthorFlairTextColor() {
        this.authorFlairTextColor_ = null;
    }
    
    private void clearAuthorFlairType() {
        this.authorFlairType_ = null;
    }
    
    private void clearAuthorFullname() {
        this.authorFullname_ = null;
    }
    
    private void clearAuthorIsBlocked() {
        this.authorIsBlocked_ = null;
    }
    
    private void clearAuthorPatreonFlair() {
        this.authorPatreonFlair_ = null;
    }
    
    private void clearAuthorPremium() {
        this.authorPremium_ = null;
    }
    
    private void clearAwarders() {
        this.awarders_ = (Internal$j<StringValue>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearBannedAtUtc() {
        this.bannedAtUtc_ = null;
    }
    
    private void clearBannedBy() {
        this.bannedBy_ = null;
    }
    
    private void clearBody() {
        this.body_ = null;
    }
    
    private void clearBodyHtml() {
        this.bodyHtml_ = null;
    }
    
    private void clearCanGild() {
        this.canGild_ = null;
    }
    
    private void clearCanModPost() {
        this.canModPost_ = null;
    }
    
    private void clearCollapsed() {
        this.collapsed_ = null;
    }
    
    private void clearCollapsedBecauseCrowdControl() {
        this.collapsedBecauseCrowdControl_ = null;
    }
    
    private void clearCollapsedReason() {
        this.collapsedReason_ = null;
    }
    
    private void clearCollapsedReasonCode() {
        this.collapsedReasonCode_ = null;
    }
    
    private void clearCommentType() {
        this.commentType_ = null;
    }
    
    private void clearControversiality() {
        this.controversiality_ = null;
    }
    
    private void clearCreated() {
        this.created_ = null;
    }
    
    private void clearCreatedUtc() {
        this.createdUtc_ = null;
    }
    
    private void clearDepth() {
        this.depth_ = null;
    }
    
    private void clearDistinguished() {
        this.distinguished_ = null;
    }
    
    private void clearDowns() {
        this.downs_ = null;
    }
    
    private void clearEdited() {
        this.edited_ = null;
    }
    
    private void clearGilded() {
        this.gilded_ = null;
    }
    
    private void clearGildings() {
        this.gildings_ = null;
    }
    
    private void clearId() {
        this.id_ = null;
    }
    
    private void clearIgnoreReports() {
        this.ignoreReports_ = null;
    }
    
    private void clearIsSubmitter() {
        this.isSubmitter_ = null;
    }
    
    private void clearLikes() {
        this.likes_ = null;
    }
    
    private void clearLinkAuthor() {
        this.linkAuthor_ = null;
    }
    
    private void clearLinkId() {
        this.linkId_ = null;
    }
    
    private void clearLinkPermalink() {
        this.linkPermalink_ = null;
    }
    
    private void clearLinkTitle() {
        this.linkTitle_ = null;
    }
    
    private void clearLinkUrl() {
        this.linkUrl_ = null;
    }
    
    private void clearLocked() {
        this.locked_ = null;
    }
    
    private void clearModNote() {
        this.modNote_ = null;
    }
    
    private void clearModReasonBy() {
        this.modReasonBy_ = null;
    }
    
    private void clearModReasonTitle() {
        this.modReasonTitle_ = null;
    }
    
    private void clearModReports() {
        this.modReports_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearName() {
        this.name_ = null;
    }
    
    private void clearNoFollow() {
        this.noFollow_ = null;
    }
    
    private void clearNumComments() {
        this.numComments_ = null;
    }
    
    private void clearNumReports() {
        this.numReports_ = null;
    }
    
    private void clearOver18() {
        this.over18_ = null;
    }
    
    private void clearParentId() {
        this.parentId_ = null;
    }
    
    private void clearPermalink() {
        this.permalink_ = null;
    }
    
    private void clearQuarantine() {
        this.quarantine_ = null;
    }
    
    private void clearRemovalReason() {
        this.removalReason_ = null;
    }
    
    private void clearRemoved() {
        this.removed_ = null;
    }
    
    private void clearReplies() {
        this.replies_ = null;
    }
    
    private void clearReportReasons() {
        this.reportReasons_ = null;
    }
    
    private void clearRteMode() {
        this.rteMode_ = null;
    }
    
    private void clearSaved() {
        this.saved_ = null;
    }
    
    private void clearScore() {
        this.score_ = null;
    }
    
    private void clearScoreHidden() {
        this.scoreHidden_ = null;
    }
    
    private void clearSelftext() {
        this.selftext_ = null;
    }
    
    private void clearSelftextHtml() {
        this.selftextHtml_ = null;
    }
    
    private void clearSendReplies() {
        this.sendReplies_ = null;
    }
    
    private void clearSpam() {
        this.spam_ = null;
    }
    
    private void clearSpoiler() {
        this.spoiler_ = null;
    }
    
    private void clearStickied() {
        this.stickied_ = null;
    }
    
    private void clearSubreddit() {
        this.subreddit_ = null;
    }
    
    private void clearSubredditId() {
        this.subredditId_ = null;
    }
    
    private void clearSubredditNamePrefixed() {
        this.subredditNamePrefixed_ = null;
    }
    
    private void clearSubredditType() {
        this.subredditType_ = null;
    }
    
    private void clearThumbnail() {
        this.thumbnail_ = null;
    }
    
    private void clearThumbnailHeight() {
        this.thumbnailHeight_ = null;
    }
    
    private void clearThumbnailWidth() {
        this.thumbnailWidth_ = null;
    }
    
    private void clearTitle() {
        this.title_ = null;
    }
    
    private void clearTopAwardedType() {
        this.topAwardedType_ = null;
    }
    
    private void clearTotalAwardsReceived() {
        this.totalAwardsReceived_ = null;
    }
    
    private void clearTreatmentTags() {
        this.treatmentTags_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void clearUnrepliableReason() {
        this.unrepliableReason_ = null;
    }
    
    private void clearUps() {
        this.ups_ = null;
    }
    
    private void clearUrl() {
        this.url_ = null;
    }
    
    private void clearUserReports() {
        this.userReports_ = (Internal$j<Any>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureAllAwardingsIsMutable() {
        final Internal$j<Any> allAwardings_ = this.allAwardings_;
        if (!allAwardings_.E0()) {
            this.allAwardings_ = (Internal$j<Any>)GeneratedMessageLite.mutableCopy((Internal$j)allAwardings_);
        }
    }
    
    private void ensureAuthorFlairRichtextIsMutable() {
        final Internal$j<AuthorFlairRichText> authorFlairRichtext_ = this.authorFlairRichtext_;
        if (!authorFlairRichtext_.E0()) {
            this.authorFlairRichtext_ = (Internal$j<AuthorFlairRichText>)GeneratedMessageLite.mutableCopy((Internal$j)authorFlairRichtext_);
        }
    }
    
    private void ensureAwardersIsMutable() {
        final Internal$j<StringValue> awarders_ = this.awarders_;
        if (!awarders_.E0()) {
            this.awarders_ = (Internal$j<StringValue>)GeneratedMessageLite.mutableCopy((Internal$j)awarders_);
        }
    }
    
    private void ensureModReportsIsMutable() {
        final Internal$j<Any> modReports_ = this.modReports_;
        if (!modReports_.E0()) {
            this.modReports_ = (Internal$j<Any>)GeneratedMessageLite.mutableCopy((Internal$j)modReports_);
        }
    }
    
    private void ensureTreatmentTagsIsMutable() {
        final Internal$j<Any> treatmentTags_ = this.treatmentTags_;
        if (!treatmentTags_.E0()) {
            this.treatmentTags_ = (Internal$j<Any>)GeneratedMessageLite.mutableCopy((Internal$j)treatmentTags_);
        }
    }
    
    private void ensureUserReportsIsMutable() {
        final Internal$j<Any> userReports_ = this.userReports_;
        if (!userReports_.E0()) {
            this.userReports_ = (Internal$j<Any>)GeneratedMessageLite.mutableCopy((Internal$j)userReports_);
        }
    }
    
    public static CommonMsg$RedditObject getDefaultInstance() {
        return CommonMsg$RedditObject.DEFAULT_INSTANCE;
    }
    
    private void mergeApproved(final BoolValue approved_) {
        approved_.getClass();
        final BoolValue approved_2 = this.approved_;
        if (approved_2 != null && approved_2 != BoolValue.getDefaultInstance()) {
            this.approved_ = (BoolValue)android.support.v4.media.a.f(this.approved_, approved_);
        }
        else {
            this.approved_ = approved_;
        }
    }
    
    private void mergeApprovedAtUtc(final Int64Value approvedAtUtc_) {
        approvedAtUtc_.getClass();
        final Int64Value approvedAtUtc_2 = this.approvedAtUtc_;
        if (approvedAtUtc_2 != null && approvedAtUtc_2 != Int64Value.getDefaultInstance()) {
            this.approvedAtUtc_ = (Int64Value)al0.b.g(this.approvedAtUtc_, approvedAtUtc_);
        }
        else {
            this.approvedAtUtc_ = approvedAtUtc_;
        }
    }
    
    private void mergeApprovedBy(final StringValue approvedBy_) {
        approvedBy_.getClass();
        final StringValue approvedBy_2 = this.approvedBy_;
        if (approvedBy_2 != null && approvedBy_2 != StringValue.getDefaultInstance()) {
            this.approvedBy_ = (StringValue)f0.e(this.approvedBy_, approvedBy_);
        }
        else {
            this.approvedBy_ = approvedBy_;
        }
    }
    
    private void mergeArchived(final BoolValue archived_) {
        archived_.getClass();
        final BoolValue archived_2 = this.archived_;
        if (archived_2 != null && archived_2 != BoolValue.getDefaultInstance()) {
            this.archived_ = (BoolValue)android.support.v4.media.a.f(this.archived_, archived_);
        }
        else {
            this.archived_ = archived_;
        }
    }
    
    private void mergeAssociatedAward(final StringValue associatedAward_) {
        associatedAward_.getClass();
        final StringValue associatedAward_2 = this.associatedAward_;
        if (associatedAward_2 != null && associatedAward_2 != StringValue.getDefaultInstance()) {
            this.associatedAward_ = (StringValue)f0.e(this.associatedAward_, associatedAward_);
        }
        else {
            this.associatedAward_ = associatedAward_;
        }
    }
    
    private void mergeAuthor(final StringValue author_) {
        author_.getClass();
        final StringValue author_2 = this.author_;
        if (author_2 != null && author_2 != StringValue.getDefaultInstance()) {
            this.author_ = (StringValue)f0.e(this.author_, author_);
        }
        else {
            this.author_ = author_;
        }
    }
    
    private void mergeAuthorFlairBackgroundColor(final StringValue authorFlairBackgroundColor_) {
        authorFlairBackgroundColor_.getClass();
        final StringValue authorFlairBackgroundColor_2 = this.authorFlairBackgroundColor_;
        if (authorFlairBackgroundColor_2 != null && authorFlairBackgroundColor_2 != StringValue.getDefaultInstance()) {
            this.authorFlairBackgroundColor_ = (StringValue)f0.e(this.authorFlairBackgroundColor_, authorFlairBackgroundColor_);
        }
        else {
            this.authorFlairBackgroundColor_ = authorFlairBackgroundColor_;
        }
    }
    
    private void mergeAuthorFlairCssClass(final StringValue authorFlairCssClass_) {
        authorFlairCssClass_.getClass();
        final StringValue authorFlairCssClass_2 = this.authorFlairCssClass_;
        if (authorFlairCssClass_2 != null && authorFlairCssClass_2 != StringValue.getDefaultInstance()) {
            this.authorFlairCssClass_ = (StringValue)f0.e(this.authorFlairCssClass_, authorFlairCssClass_);
        }
        else {
            this.authorFlairCssClass_ = authorFlairCssClass_;
        }
    }
    
    private void mergeAuthorFlairTemplateId(final StringValue authorFlairTemplateId_) {
        authorFlairTemplateId_.getClass();
        final StringValue authorFlairTemplateId_2 = this.authorFlairTemplateId_;
        if (authorFlairTemplateId_2 != null && authorFlairTemplateId_2 != StringValue.getDefaultInstance()) {
            this.authorFlairTemplateId_ = (StringValue)f0.e(this.authorFlairTemplateId_, authorFlairTemplateId_);
        }
        else {
            this.authorFlairTemplateId_ = authorFlairTemplateId_;
        }
    }
    
    private void mergeAuthorFlairText(final StringValue authorFlairText_) {
        authorFlairText_.getClass();
        final StringValue authorFlairText_2 = this.authorFlairText_;
        if (authorFlairText_2 != null && authorFlairText_2 != StringValue.getDefaultInstance()) {
            this.authorFlairText_ = (StringValue)f0.e(this.authorFlairText_, authorFlairText_);
        }
        else {
            this.authorFlairText_ = authorFlairText_;
        }
    }
    
    private void mergeAuthorFlairTextColor(final StringValue authorFlairTextColor_) {
        authorFlairTextColor_.getClass();
        final StringValue authorFlairTextColor_2 = this.authorFlairTextColor_;
        if (authorFlairTextColor_2 != null && authorFlairTextColor_2 != StringValue.getDefaultInstance()) {
            this.authorFlairTextColor_ = (StringValue)f0.e(this.authorFlairTextColor_, authorFlairTextColor_);
        }
        else {
            this.authorFlairTextColor_ = authorFlairTextColor_;
        }
    }
    
    private void mergeAuthorFlairType(final StringValue authorFlairType_) {
        authorFlairType_.getClass();
        final StringValue authorFlairType_2 = this.authorFlairType_;
        if (authorFlairType_2 != null && authorFlairType_2 != StringValue.getDefaultInstance()) {
            this.authorFlairType_ = (StringValue)f0.e(this.authorFlairType_, authorFlairType_);
        }
        else {
            this.authorFlairType_ = authorFlairType_;
        }
    }
    
    private void mergeAuthorFullname(final StringValue authorFullname_) {
        authorFullname_.getClass();
        final StringValue authorFullname_2 = this.authorFullname_;
        if (authorFullname_2 != null && authorFullname_2 != StringValue.getDefaultInstance()) {
            this.authorFullname_ = (StringValue)f0.e(this.authorFullname_, authorFullname_);
        }
        else {
            this.authorFullname_ = authorFullname_;
        }
    }
    
    private void mergeAuthorIsBlocked(final BoolValue authorIsBlocked_) {
        authorIsBlocked_.getClass();
        final BoolValue authorIsBlocked_2 = this.authorIsBlocked_;
        if (authorIsBlocked_2 != null && authorIsBlocked_2 != BoolValue.getDefaultInstance()) {
            this.authorIsBlocked_ = (BoolValue)android.support.v4.media.a.f(this.authorIsBlocked_, authorIsBlocked_);
        }
        else {
            this.authorIsBlocked_ = authorIsBlocked_;
        }
    }
    
    private void mergeAuthorPatreonFlair(final BoolValue authorPatreonFlair_) {
        authorPatreonFlair_.getClass();
        final BoolValue authorPatreonFlair_2 = this.authorPatreonFlair_;
        if (authorPatreonFlair_2 != null && authorPatreonFlair_2 != BoolValue.getDefaultInstance()) {
            this.authorPatreonFlair_ = (BoolValue)android.support.v4.media.a.f(this.authorPatreonFlair_, authorPatreonFlair_);
        }
        else {
            this.authorPatreonFlair_ = authorPatreonFlair_;
        }
    }
    
    private void mergeAuthorPremium(final BoolValue authorPremium_) {
        authorPremium_.getClass();
        final BoolValue authorPremium_2 = this.authorPremium_;
        if (authorPremium_2 != null && authorPremium_2 != BoolValue.getDefaultInstance()) {
            this.authorPremium_ = (BoolValue)android.support.v4.media.a.f(this.authorPremium_, authorPremium_);
        }
        else {
            this.authorPremium_ = authorPremium_;
        }
    }
    
    private void mergeBannedAtUtc(final Int64Value bannedAtUtc_) {
        bannedAtUtc_.getClass();
        final Int64Value bannedAtUtc_2 = this.bannedAtUtc_;
        if (bannedAtUtc_2 != null && bannedAtUtc_2 != Int64Value.getDefaultInstance()) {
            this.bannedAtUtc_ = (Int64Value)al0.b.g(this.bannedAtUtc_, bannedAtUtc_);
        }
        else {
            this.bannedAtUtc_ = bannedAtUtc_;
        }
    }
    
    private void mergeBannedBy(final StringValue bannedBy_) {
        bannedBy_.getClass();
        final StringValue bannedBy_2 = this.bannedBy_;
        if (bannedBy_2 != null && bannedBy_2 != StringValue.getDefaultInstance()) {
            this.bannedBy_ = (StringValue)f0.e(this.bannedBy_, bannedBy_);
        }
        else {
            this.bannedBy_ = bannedBy_;
        }
    }
    
    private void mergeBody(final StringValue body_) {
        body_.getClass();
        final StringValue body_2 = this.body_;
        if (body_2 != null && body_2 != StringValue.getDefaultInstance()) {
            this.body_ = (StringValue)f0.e(this.body_, body_);
        }
        else {
            this.body_ = body_;
        }
    }
    
    private void mergeBodyHtml(final StringValue bodyHtml_) {
        bodyHtml_.getClass();
        final StringValue bodyHtml_2 = this.bodyHtml_;
        if (bodyHtml_2 != null && bodyHtml_2 != StringValue.getDefaultInstance()) {
            this.bodyHtml_ = (StringValue)f0.e(this.bodyHtml_, bodyHtml_);
        }
        else {
            this.bodyHtml_ = bodyHtml_;
        }
    }
    
    private void mergeCanGild(final BoolValue canGild_) {
        canGild_.getClass();
        final BoolValue canGild_2 = this.canGild_;
        if (canGild_2 != null && canGild_2 != BoolValue.getDefaultInstance()) {
            this.canGild_ = (BoolValue)android.support.v4.media.a.f(this.canGild_, canGild_);
        }
        else {
            this.canGild_ = canGild_;
        }
    }
    
    private void mergeCanModPost(final BoolValue canModPost_) {
        canModPost_.getClass();
        final BoolValue canModPost_2 = this.canModPost_;
        if (canModPost_2 != null && canModPost_2 != BoolValue.getDefaultInstance()) {
            this.canModPost_ = (BoolValue)android.support.v4.media.a.f(this.canModPost_, canModPost_);
        }
        else {
            this.canModPost_ = canModPost_;
        }
    }
    
    private void mergeCollapsed(final BoolValue collapsed_) {
        collapsed_.getClass();
        final BoolValue collapsed_2 = this.collapsed_;
        if (collapsed_2 != null && collapsed_2 != BoolValue.getDefaultInstance()) {
            this.collapsed_ = (BoolValue)android.support.v4.media.a.f(this.collapsed_, collapsed_);
        }
        else {
            this.collapsed_ = collapsed_;
        }
    }
    
    private void mergeCollapsedBecauseCrowdControl(final BoolValue collapsedBecauseCrowdControl_) {
        collapsedBecauseCrowdControl_.getClass();
        final BoolValue collapsedBecauseCrowdControl_2 = this.collapsedBecauseCrowdControl_;
        if (collapsedBecauseCrowdControl_2 != null && collapsedBecauseCrowdControl_2 != BoolValue.getDefaultInstance()) {
            this.collapsedBecauseCrowdControl_ = (BoolValue)android.support.v4.media.a.f(this.collapsedBecauseCrowdControl_, collapsedBecauseCrowdControl_);
        }
        else {
            this.collapsedBecauseCrowdControl_ = collapsedBecauseCrowdControl_;
        }
    }
    
    private void mergeCollapsedReason(final StringValue collapsedReason_) {
        collapsedReason_.getClass();
        final StringValue collapsedReason_2 = this.collapsedReason_;
        if (collapsedReason_2 != null && collapsedReason_2 != StringValue.getDefaultInstance()) {
            this.collapsedReason_ = (StringValue)f0.e(this.collapsedReason_, collapsedReason_);
        }
        else {
            this.collapsedReason_ = collapsedReason_;
        }
    }
    
    private void mergeCollapsedReasonCode(final StringValue collapsedReasonCode_) {
        collapsedReasonCode_.getClass();
        final StringValue collapsedReasonCode_2 = this.collapsedReasonCode_;
        if (collapsedReasonCode_2 != null && collapsedReasonCode_2 != StringValue.getDefaultInstance()) {
            this.collapsedReasonCode_ = (StringValue)f0.e(this.collapsedReasonCode_, collapsedReasonCode_);
        }
        else {
            this.collapsedReasonCode_ = collapsedReasonCode_;
        }
    }
    
    private void mergeCommentType(final StringValue commentType_) {
        commentType_.getClass();
        final StringValue commentType_2 = this.commentType_;
        if (commentType_2 != null && commentType_2 != StringValue.getDefaultInstance()) {
            this.commentType_ = (StringValue)f0.e(this.commentType_, commentType_);
        }
        else {
            this.commentType_ = commentType_;
        }
    }
    
    private void mergeControversiality(final Int64Value controversiality_) {
        controversiality_.getClass();
        final Int64Value controversiality_2 = this.controversiality_;
        if (controversiality_2 != null && controversiality_2 != Int64Value.getDefaultInstance()) {
            this.controversiality_ = (Int64Value)al0.b.g(this.controversiality_, controversiality_);
        }
        else {
            this.controversiality_ = controversiality_;
        }
    }
    
    private void mergeCreated(final Int64Value created_) {
        created_.getClass();
        final Int64Value created_2 = this.created_;
        if (created_2 != null && created_2 != Int64Value.getDefaultInstance()) {
            this.created_ = (Int64Value)al0.b.g(this.created_, created_);
        }
        else {
            this.created_ = created_;
        }
    }
    
    private void mergeCreatedUtc(final Int64Value createdUtc_) {
        createdUtc_.getClass();
        final Int64Value createdUtc_2 = this.createdUtc_;
        if (createdUtc_2 != null && createdUtc_2 != Int64Value.getDefaultInstance()) {
            this.createdUtc_ = (Int64Value)al0.b.g(this.createdUtc_, createdUtc_);
        }
        else {
            this.createdUtc_ = createdUtc_;
        }
    }
    
    private void mergeDepth(final Int64Value depth_) {
        depth_.getClass();
        final Int64Value depth_2 = this.depth_;
        if (depth_2 != null && depth_2 != Int64Value.getDefaultInstance()) {
            this.depth_ = (Int64Value)al0.b.g(this.depth_, depth_);
        }
        else {
            this.depth_ = depth_;
        }
    }
    
    private void mergeDistinguished(final StringValue distinguished_) {
        distinguished_.getClass();
        final StringValue distinguished_2 = this.distinguished_;
        if (distinguished_2 != null && distinguished_2 != StringValue.getDefaultInstance()) {
            this.distinguished_ = (StringValue)f0.e(this.distinguished_, distinguished_);
        }
        else {
            this.distinguished_ = distinguished_;
        }
    }
    
    private void mergeDowns(final Int64Value downs_) {
        downs_.getClass();
        final Int64Value downs_2 = this.downs_;
        if (downs_2 != null && downs_2 != Int64Value.getDefaultInstance()) {
            this.downs_ = (Int64Value)al0.b.g(this.downs_, downs_);
        }
        else {
            this.downs_ = downs_;
        }
    }
    
    private void mergeEdited(final BoolValue edited_) {
        edited_.getClass();
        final BoolValue edited_2 = this.edited_;
        if (edited_2 != null && edited_2 != BoolValue.getDefaultInstance()) {
            this.edited_ = (BoolValue)android.support.v4.media.a.f(this.edited_, edited_);
        }
        else {
            this.edited_ = edited_;
        }
    }
    
    private void mergeGilded(final Int64Value gilded_) {
        gilded_.getClass();
        final Int64Value gilded_2 = this.gilded_;
        if (gilded_2 != null && gilded_2 != Int64Value.getDefaultInstance()) {
            this.gilded_ = (Int64Value)al0.b.g(this.gilded_, gilded_);
        }
        else {
            this.gilded_ = gilded_;
        }
    }
    
    private void mergeGildings(final Any gildings_) {
        gildings_.getClass();
        final Any gildings_2 = this.gildings_;
        if (gildings_2 != null && gildings_2 != Any.getDefaultInstance()) {
            final Any$b builder = Any.newBuilder(this.gildings_);
            ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)gildings_);
            this.gildings_ = (Any)((GeneratedMessageLite$b)builder).d();
        }
        else {
            this.gildings_ = gildings_;
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
    
    private void mergeIgnoreReports(final BoolValue ignoreReports_) {
        ignoreReports_.getClass();
        final BoolValue ignoreReports_2 = this.ignoreReports_;
        if (ignoreReports_2 != null && ignoreReports_2 != BoolValue.getDefaultInstance()) {
            this.ignoreReports_ = (BoolValue)android.support.v4.media.a.f(this.ignoreReports_, ignoreReports_);
        }
        else {
            this.ignoreReports_ = ignoreReports_;
        }
    }
    
    private void mergeIsSubmitter(final BoolValue isSubmitter_) {
        isSubmitter_.getClass();
        final BoolValue isSubmitter_2 = this.isSubmitter_;
        if (isSubmitter_2 != null && isSubmitter_2 != BoolValue.getDefaultInstance()) {
            this.isSubmitter_ = (BoolValue)android.support.v4.media.a.f(this.isSubmitter_, isSubmitter_);
        }
        else {
            this.isSubmitter_ = isSubmitter_;
        }
    }
    
    private void mergeLikes(final BoolValue likes_) {
        likes_.getClass();
        final BoolValue likes_2 = this.likes_;
        if (likes_2 != null && likes_2 != BoolValue.getDefaultInstance()) {
            this.likes_ = (BoolValue)android.support.v4.media.a.f(this.likes_, likes_);
        }
        else {
            this.likes_ = likes_;
        }
    }
    
    private void mergeLinkAuthor(final StringValue linkAuthor_) {
        linkAuthor_.getClass();
        final StringValue linkAuthor_2 = this.linkAuthor_;
        if (linkAuthor_2 != null && linkAuthor_2 != StringValue.getDefaultInstance()) {
            this.linkAuthor_ = (StringValue)f0.e(this.linkAuthor_, linkAuthor_);
        }
        else {
            this.linkAuthor_ = linkAuthor_;
        }
    }
    
    private void mergeLinkId(final StringValue linkId_) {
        linkId_.getClass();
        final StringValue linkId_2 = this.linkId_;
        if (linkId_2 != null && linkId_2 != StringValue.getDefaultInstance()) {
            this.linkId_ = (StringValue)f0.e(this.linkId_, linkId_);
        }
        else {
            this.linkId_ = linkId_;
        }
    }
    
    private void mergeLinkPermalink(final StringValue linkPermalink_) {
        linkPermalink_.getClass();
        final StringValue linkPermalink_2 = this.linkPermalink_;
        if (linkPermalink_2 != null && linkPermalink_2 != StringValue.getDefaultInstance()) {
            this.linkPermalink_ = (StringValue)f0.e(this.linkPermalink_, linkPermalink_);
        }
        else {
            this.linkPermalink_ = linkPermalink_;
        }
    }
    
    private void mergeLinkTitle(final StringValue linkTitle_) {
        linkTitle_.getClass();
        final StringValue linkTitle_2 = this.linkTitle_;
        if (linkTitle_2 != null && linkTitle_2 != StringValue.getDefaultInstance()) {
            this.linkTitle_ = (StringValue)f0.e(this.linkTitle_, linkTitle_);
        }
        else {
            this.linkTitle_ = linkTitle_;
        }
    }
    
    private void mergeLinkUrl(final StringValue linkUrl_) {
        linkUrl_.getClass();
        final StringValue linkUrl_2 = this.linkUrl_;
        if (linkUrl_2 != null && linkUrl_2 != StringValue.getDefaultInstance()) {
            this.linkUrl_ = (StringValue)f0.e(this.linkUrl_, linkUrl_);
        }
        else {
            this.linkUrl_ = linkUrl_;
        }
    }
    
    private void mergeLocked(final BoolValue locked_) {
        locked_.getClass();
        final BoolValue locked_2 = this.locked_;
        if (locked_2 != null && locked_2 != BoolValue.getDefaultInstance()) {
            this.locked_ = (BoolValue)android.support.v4.media.a.f(this.locked_, locked_);
        }
        else {
            this.locked_ = locked_;
        }
    }
    
    private void mergeModNote(final StringValue modNote_) {
        modNote_.getClass();
        final StringValue modNote_2 = this.modNote_;
        if (modNote_2 != null && modNote_2 != StringValue.getDefaultInstance()) {
            this.modNote_ = (StringValue)f0.e(this.modNote_, modNote_);
        }
        else {
            this.modNote_ = modNote_;
        }
    }
    
    private void mergeModReasonBy(final StringValue modReasonBy_) {
        modReasonBy_.getClass();
        final StringValue modReasonBy_2 = this.modReasonBy_;
        if (modReasonBy_2 != null && modReasonBy_2 != StringValue.getDefaultInstance()) {
            this.modReasonBy_ = (StringValue)f0.e(this.modReasonBy_, modReasonBy_);
        }
        else {
            this.modReasonBy_ = modReasonBy_;
        }
    }
    
    private void mergeModReasonTitle(final StringValue modReasonTitle_) {
        modReasonTitle_.getClass();
        final StringValue modReasonTitle_2 = this.modReasonTitle_;
        if (modReasonTitle_2 != null && modReasonTitle_2 != StringValue.getDefaultInstance()) {
            this.modReasonTitle_ = (StringValue)f0.e(this.modReasonTitle_, modReasonTitle_);
        }
        else {
            this.modReasonTitle_ = modReasonTitle_;
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
    
    private void mergeNoFollow(final BoolValue noFollow_) {
        noFollow_.getClass();
        final BoolValue noFollow_2 = this.noFollow_;
        if (noFollow_2 != null && noFollow_2 != BoolValue.getDefaultInstance()) {
            this.noFollow_ = (BoolValue)android.support.v4.media.a.f(this.noFollow_, noFollow_);
        }
        else {
            this.noFollow_ = noFollow_;
        }
    }
    
    private void mergeNumComments(final Int64Value numComments_) {
        numComments_.getClass();
        final Int64Value numComments_2 = this.numComments_;
        if (numComments_2 != null && numComments_2 != Int64Value.getDefaultInstance()) {
            this.numComments_ = (Int64Value)al0.b.g(this.numComments_, numComments_);
        }
        else {
            this.numComments_ = numComments_;
        }
    }
    
    private void mergeNumReports(final Int64Value numReports_) {
        numReports_.getClass();
        final Int64Value numReports_2 = this.numReports_;
        if (numReports_2 != null && numReports_2 != Int64Value.getDefaultInstance()) {
            this.numReports_ = (Int64Value)al0.b.g(this.numReports_, numReports_);
        }
        else {
            this.numReports_ = numReports_;
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
    
    private void mergeParentId(final StringValue parentId_) {
        parentId_.getClass();
        final StringValue parentId_2 = this.parentId_;
        if (parentId_2 != null && parentId_2 != StringValue.getDefaultInstance()) {
            this.parentId_ = (StringValue)f0.e(this.parentId_, parentId_);
        }
        else {
            this.parentId_ = parentId_;
        }
    }
    
    private void mergePermalink(final StringValue permalink_) {
        permalink_.getClass();
        final StringValue permalink_2 = this.permalink_;
        if (permalink_2 != null && permalink_2 != StringValue.getDefaultInstance()) {
            this.permalink_ = (StringValue)f0.e(this.permalink_, permalink_);
        }
        else {
            this.permalink_ = permalink_;
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
    
    private void mergeRemovalReason(final StringValue removalReason_) {
        removalReason_.getClass();
        final StringValue removalReason_2 = this.removalReason_;
        if (removalReason_2 != null && removalReason_2 != StringValue.getDefaultInstance()) {
            this.removalReason_ = (StringValue)f0.e(this.removalReason_, removalReason_);
        }
        else {
            this.removalReason_ = removalReason_;
        }
    }
    
    private void mergeRemoved(final BoolValue removed_) {
        removed_.getClass();
        final BoolValue removed_2 = this.removed_;
        if (removed_2 != null && removed_2 != BoolValue.getDefaultInstance()) {
            this.removed_ = (BoolValue)android.support.v4.media.a.f(this.removed_, removed_);
        }
        else {
            this.removed_ = removed_;
        }
    }
    
    private void mergeReplies(final StringValue replies_) {
        replies_.getClass();
        final StringValue replies_2 = this.replies_;
        if (replies_2 != null && replies_2 != StringValue.getDefaultInstance()) {
            this.replies_ = (StringValue)f0.e(this.replies_, replies_);
        }
        else {
            this.replies_ = replies_;
        }
    }
    
    private void mergeReportReasons(final ListValue reportReasons_) {
        reportReasons_.getClass();
        final ListValue reportReasons_2 = this.reportReasons_;
        if (reportReasons_2 != null && reportReasons_2 != ListValue.getDefaultInstance()) {
            final ListValue$b builder = ListValue.newBuilder(this.reportReasons_);
            ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)reportReasons_);
            this.reportReasons_ = (ListValue)((GeneratedMessageLite$b)builder).d();
        }
        else {
            this.reportReasons_ = reportReasons_;
        }
    }
    
    private void mergeRteMode(final StringValue rteMode_) {
        rteMode_.getClass();
        final StringValue rteMode_2 = this.rteMode_;
        if (rteMode_2 != null && rteMode_2 != StringValue.getDefaultInstance()) {
            this.rteMode_ = (StringValue)f0.e(this.rteMode_, rteMode_);
        }
        else {
            this.rteMode_ = rteMode_;
        }
    }
    
    private void mergeSaved(final BoolValue saved_) {
        saved_.getClass();
        final BoolValue saved_2 = this.saved_;
        if (saved_2 != null && saved_2 != BoolValue.getDefaultInstance()) {
            this.saved_ = (BoolValue)android.support.v4.media.a.f(this.saved_, saved_);
        }
        else {
            this.saved_ = saved_;
        }
    }
    
    private void mergeScore(final Int64Value score_) {
        score_.getClass();
        final Int64Value score_2 = this.score_;
        if (score_2 != null && score_2 != Int64Value.getDefaultInstance()) {
            this.score_ = (Int64Value)al0.b.g(this.score_, score_);
        }
        else {
            this.score_ = score_;
        }
    }
    
    private void mergeScoreHidden(final BoolValue scoreHidden_) {
        scoreHidden_.getClass();
        final BoolValue scoreHidden_2 = this.scoreHidden_;
        if (scoreHidden_2 != null && scoreHidden_2 != BoolValue.getDefaultInstance()) {
            this.scoreHidden_ = (BoolValue)android.support.v4.media.a.f(this.scoreHidden_, scoreHidden_);
        }
        else {
            this.scoreHidden_ = scoreHidden_;
        }
    }
    
    private void mergeSelftext(final StringValue selftext_) {
        selftext_.getClass();
        final StringValue selftext_2 = this.selftext_;
        if (selftext_2 != null && selftext_2 != StringValue.getDefaultInstance()) {
            this.selftext_ = (StringValue)f0.e(this.selftext_, selftext_);
        }
        else {
            this.selftext_ = selftext_;
        }
    }
    
    private void mergeSelftextHtml(final StringValue selftextHtml_) {
        selftextHtml_.getClass();
        final StringValue selftextHtml_2 = this.selftextHtml_;
        if (selftextHtml_2 != null && selftextHtml_2 != StringValue.getDefaultInstance()) {
            this.selftextHtml_ = (StringValue)f0.e(this.selftextHtml_, selftextHtml_);
        }
        else {
            this.selftextHtml_ = selftextHtml_;
        }
    }
    
    private void mergeSendReplies(final BoolValue sendReplies_) {
        sendReplies_.getClass();
        final BoolValue sendReplies_2 = this.sendReplies_;
        if (sendReplies_2 != null && sendReplies_2 != BoolValue.getDefaultInstance()) {
            this.sendReplies_ = (BoolValue)android.support.v4.media.a.f(this.sendReplies_, sendReplies_);
        }
        else {
            this.sendReplies_ = sendReplies_;
        }
    }
    
    private void mergeSpam(final BoolValue spam_) {
        spam_.getClass();
        final BoolValue spam_2 = this.spam_;
        if (spam_2 != null && spam_2 != BoolValue.getDefaultInstance()) {
            this.spam_ = (BoolValue)android.support.v4.media.a.f(this.spam_, spam_);
        }
        else {
            this.spam_ = spam_;
        }
    }
    
    private void mergeSpoiler(final StringValue spoiler_) {
        spoiler_.getClass();
        final StringValue spoiler_2 = this.spoiler_;
        if (spoiler_2 != null && spoiler_2 != StringValue.getDefaultInstance()) {
            this.spoiler_ = (StringValue)f0.e(this.spoiler_, spoiler_);
        }
        else {
            this.spoiler_ = spoiler_;
        }
    }
    
    private void mergeStickied(final BoolValue stickied_) {
        stickied_.getClass();
        final BoolValue stickied_2 = this.stickied_;
        if (stickied_2 != null && stickied_2 != BoolValue.getDefaultInstance()) {
            this.stickied_ = (BoolValue)android.support.v4.media.a.f(this.stickied_, stickied_);
        }
        else {
            this.stickied_ = stickied_;
        }
    }
    
    private void mergeSubreddit(final StringValue subreddit_) {
        subreddit_.getClass();
        final StringValue subreddit_2 = this.subreddit_;
        if (subreddit_2 != null && subreddit_2 != StringValue.getDefaultInstance()) {
            this.subreddit_ = (StringValue)f0.e(this.subreddit_, subreddit_);
        }
        else {
            this.subreddit_ = subreddit_;
        }
    }
    
    private void mergeSubredditId(final StringValue subredditId_) {
        subredditId_.getClass();
        final StringValue subredditId_2 = this.subredditId_;
        if (subredditId_2 != null && subredditId_2 != StringValue.getDefaultInstance()) {
            this.subredditId_ = (StringValue)f0.e(this.subredditId_, subredditId_);
        }
        else {
            this.subredditId_ = subredditId_;
        }
    }
    
    private void mergeSubredditNamePrefixed(final StringValue subredditNamePrefixed_) {
        subredditNamePrefixed_.getClass();
        final StringValue subredditNamePrefixed_2 = this.subredditNamePrefixed_;
        if (subredditNamePrefixed_2 != null && subredditNamePrefixed_2 != StringValue.getDefaultInstance()) {
            this.subredditNamePrefixed_ = (StringValue)f0.e(this.subredditNamePrefixed_, subredditNamePrefixed_);
        }
        else {
            this.subredditNamePrefixed_ = subredditNamePrefixed_;
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
    
    private void mergeThumbnail(final StringValue thumbnail_) {
        thumbnail_.getClass();
        final StringValue thumbnail_2 = this.thumbnail_;
        if (thumbnail_2 != null && thumbnail_2 != StringValue.getDefaultInstance()) {
            this.thumbnail_ = (StringValue)f0.e(this.thumbnail_, thumbnail_);
        }
        else {
            this.thumbnail_ = thumbnail_;
        }
    }
    
    private void mergeThumbnailHeight(final Int64Value thumbnailHeight_) {
        thumbnailHeight_.getClass();
        final Int64Value thumbnailHeight_2 = this.thumbnailHeight_;
        if (thumbnailHeight_2 != null && thumbnailHeight_2 != Int64Value.getDefaultInstance()) {
            this.thumbnailHeight_ = (Int64Value)al0.b.g(this.thumbnailHeight_, thumbnailHeight_);
        }
        else {
            this.thumbnailHeight_ = thumbnailHeight_;
        }
    }
    
    private void mergeThumbnailWidth(final Int64Value thumbnailWidth_) {
        thumbnailWidth_.getClass();
        final Int64Value thumbnailWidth_2 = this.thumbnailWidth_;
        if (thumbnailWidth_2 != null && thumbnailWidth_2 != Int64Value.getDefaultInstance()) {
            this.thumbnailWidth_ = (Int64Value)al0.b.g(this.thumbnailWidth_, thumbnailWidth_);
        }
        else {
            this.thumbnailWidth_ = thumbnailWidth_;
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
    
    private void mergeTopAwardedType(final StringValue topAwardedType_) {
        topAwardedType_.getClass();
        final StringValue topAwardedType_2 = this.topAwardedType_;
        if (topAwardedType_2 != null && topAwardedType_2 != StringValue.getDefaultInstance()) {
            this.topAwardedType_ = (StringValue)f0.e(this.topAwardedType_, topAwardedType_);
        }
        else {
            this.topAwardedType_ = topAwardedType_;
        }
    }
    
    private void mergeTotalAwardsReceived(final Int64Value totalAwardsReceived_) {
        totalAwardsReceived_.getClass();
        final Int64Value totalAwardsReceived_2 = this.totalAwardsReceived_;
        if (totalAwardsReceived_2 != null && totalAwardsReceived_2 != Int64Value.getDefaultInstance()) {
            this.totalAwardsReceived_ = (Int64Value)al0.b.g(this.totalAwardsReceived_, totalAwardsReceived_);
        }
        else {
            this.totalAwardsReceived_ = totalAwardsReceived_;
        }
    }
    
    private void mergeUnrepliableReason(final StringValue unrepliableReason_) {
        unrepliableReason_.getClass();
        final StringValue unrepliableReason_2 = this.unrepliableReason_;
        if (unrepliableReason_2 != null && unrepliableReason_2 != StringValue.getDefaultInstance()) {
            this.unrepliableReason_ = (StringValue)f0.e(this.unrepliableReason_, unrepliableReason_);
        }
        else {
            this.unrepliableReason_ = unrepliableReason_;
        }
    }
    
    private void mergeUps(final Int64Value ups_) {
        ups_.getClass();
        final Int64Value ups_2 = this.ups_;
        if (ups_2 != null && ups_2 != Int64Value.getDefaultInstance()) {
            this.ups_ = (Int64Value)al0.b.g(this.ups_, ups_);
        }
        else {
            this.ups_ = ups_;
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
    
    public static b newBuilder() {
        return (b)CommonMsg$RedditObject.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static b newBuilder(final CommonMsg$RedditObject commonMsg$RedditObject) {
        return (b)CommonMsg$RedditObject.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commonMsg$RedditObject);
    }
    
    public static CommonMsg$RedditObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$RedditObject parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$RedditObject parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, byteString);
    }
    
    public static CommonMsg$RedditObject parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static CommonMsg$RedditObject parseFrom(final l l) throws IOException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, l);
    }
    
    public static CommonMsg$RedditObject parseFrom(final l l, final d0 d0) throws IOException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, l, d0);
    }
    
    public static CommonMsg$RedditObject parseFrom(final InputStream inputStream) throws IOException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, inputStream);
    }
    
    public static CommonMsg$RedditObject parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static CommonMsg$RedditObject parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static CommonMsg$RedditObject parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static CommonMsg$RedditObject parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, array);
    }
    
    public static CommonMsg$RedditObject parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (CommonMsg$RedditObject)GeneratedMessageLite.parseFrom((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<CommonMsg$RedditObject> parser() {
        return (n1<CommonMsg$RedditObject>)CommonMsg$RedditObject.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeAllAwardings(final int n) {
        this.ensureAllAwardingsIsMutable();
        this.allAwardings_.remove(n);
    }
    
    private void removeAuthorFlairRichtext(final int n) {
        this.ensureAuthorFlairRichtextIsMutable();
        this.authorFlairRichtext_.remove(n);
    }
    
    private void removeAwarders(final int n) {
        this.ensureAwardersIsMutable();
        this.awarders_.remove(n);
    }
    
    private void removeModReports(final int n) {
        this.ensureModReportsIsMutable();
        this.modReports_.remove(n);
    }
    
    private void removeTreatmentTags(final int n) {
        this.ensureTreatmentTagsIsMutable();
        this.treatmentTags_.remove(n);
    }
    
    private void removeUserReports(final int n) {
        this.ensureUserReportsIsMutable();
        this.userReports_.remove(n);
    }
    
    private void setAllAwardings(final int n, final Any any) {
        any.getClass();
        this.ensureAllAwardingsIsMutable();
        ((List<Any>)this.allAwardings_).set(n, any);
    }
    
    private void setApproved(final BoolValue approved_) {
        approved_.getClass();
        this.approved_ = approved_;
    }
    
    private void setApprovedAtUtc(final Int64Value approvedAtUtc_) {
        approvedAtUtc_.getClass();
        this.approvedAtUtc_ = approvedAtUtc_;
    }
    
    private void setApprovedBy(final StringValue approvedBy_) {
        approvedBy_.getClass();
        this.approvedBy_ = approvedBy_;
    }
    
    private void setArchived(final BoolValue archived_) {
        archived_.getClass();
        this.archived_ = archived_;
    }
    
    private void setAssociatedAward(final StringValue associatedAward_) {
        associatedAward_.getClass();
        this.associatedAward_ = associatedAward_;
    }
    
    private void setAuthor(final StringValue author_) {
        author_.getClass();
        this.author_ = author_;
    }
    
    private void setAuthorFlairBackgroundColor(final StringValue authorFlairBackgroundColor_) {
        authorFlairBackgroundColor_.getClass();
        this.authorFlairBackgroundColor_ = authorFlairBackgroundColor_;
    }
    
    private void setAuthorFlairCssClass(final StringValue authorFlairCssClass_) {
        authorFlairCssClass_.getClass();
        this.authorFlairCssClass_ = authorFlairCssClass_;
    }
    
    private void setAuthorFlairRichtext(final int n, final AuthorFlairRichText authorFlairRichText) {
        authorFlairRichText.getClass();
        this.ensureAuthorFlairRichtextIsMutable();
        ((List<AuthorFlairRichText>)this.authorFlairRichtext_).set(n, authorFlairRichText);
    }
    
    private void setAuthorFlairTemplateId(final StringValue authorFlairTemplateId_) {
        authorFlairTemplateId_.getClass();
        this.authorFlairTemplateId_ = authorFlairTemplateId_;
    }
    
    private void setAuthorFlairText(final StringValue authorFlairText_) {
        authorFlairText_.getClass();
        this.authorFlairText_ = authorFlairText_;
    }
    
    private void setAuthorFlairTextColor(final StringValue authorFlairTextColor_) {
        authorFlairTextColor_.getClass();
        this.authorFlairTextColor_ = authorFlairTextColor_;
    }
    
    private void setAuthorFlairType(final StringValue authorFlairType_) {
        authorFlairType_.getClass();
        this.authorFlairType_ = authorFlairType_;
    }
    
    private void setAuthorFullname(final StringValue authorFullname_) {
        authorFullname_.getClass();
        this.authorFullname_ = authorFullname_;
    }
    
    private void setAuthorIsBlocked(final BoolValue authorIsBlocked_) {
        authorIsBlocked_.getClass();
        this.authorIsBlocked_ = authorIsBlocked_;
    }
    
    private void setAuthorPatreonFlair(final BoolValue authorPatreonFlair_) {
        authorPatreonFlair_.getClass();
        this.authorPatreonFlair_ = authorPatreonFlair_;
    }
    
    private void setAuthorPremium(final BoolValue authorPremium_) {
        authorPremium_.getClass();
        this.authorPremium_ = authorPremium_;
    }
    
    private void setAwarders(final int n, final StringValue stringValue) {
        stringValue.getClass();
        this.ensureAwardersIsMutable();
        ((List<StringValue>)this.awarders_).set(n, stringValue);
    }
    
    private void setBannedAtUtc(final Int64Value bannedAtUtc_) {
        bannedAtUtc_.getClass();
        this.bannedAtUtc_ = bannedAtUtc_;
    }
    
    private void setBannedBy(final StringValue bannedBy_) {
        bannedBy_.getClass();
        this.bannedBy_ = bannedBy_;
    }
    
    private void setBody(final StringValue body_) {
        body_.getClass();
        this.body_ = body_;
    }
    
    private void setBodyHtml(final StringValue bodyHtml_) {
        bodyHtml_.getClass();
        this.bodyHtml_ = bodyHtml_;
    }
    
    private void setCanGild(final BoolValue canGild_) {
        canGild_.getClass();
        this.canGild_ = canGild_;
    }
    
    private void setCanModPost(final BoolValue canModPost_) {
        canModPost_.getClass();
        this.canModPost_ = canModPost_;
    }
    
    private void setCollapsed(final BoolValue collapsed_) {
        collapsed_.getClass();
        this.collapsed_ = collapsed_;
    }
    
    private void setCollapsedBecauseCrowdControl(final BoolValue collapsedBecauseCrowdControl_) {
        collapsedBecauseCrowdControl_.getClass();
        this.collapsedBecauseCrowdControl_ = collapsedBecauseCrowdControl_;
    }
    
    private void setCollapsedReason(final StringValue collapsedReason_) {
        collapsedReason_.getClass();
        this.collapsedReason_ = collapsedReason_;
    }
    
    private void setCollapsedReasonCode(final StringValue collapsedReasonCode_) {
        collapsedReasonCode_.getClass();
        this.collapsedReasonCode_ = collapsedReasonCode_;
    }
    
    private void setCommentType(final StringValue commentType_) {
        commentType_.getClass();
        this.commentType_ = commentType_;
    }
    
    private void setControversiality(final Int64Value controversiality_) {
        controversiality_.getClass();
        this.controversiality_ = controversiality_;
    }
    
    private void setCreated(final Int64Value created_) {
        created_.getClass();
        this.created_ = created_;
    }
    
    private void setCreatedUtc(final Int64Value createdUtc_) {
        createdUtc_.getClass();
        this.createdUtc_ = createdUtc_;
    }
    
    private void setDepth(final Int64Value depth_) {
        depth_.getClass();
        this.depth_ = depth_;
    }
    
    private void setDistinguished(final StringValue distinguished_) {
        distinguished_.getClass();
        this.distinguished_ = distinguished_;
    }
    
    private void setDowns(final Int64Value downs_) {
        downs_.getClass();
        this.downs_ = downs_;
    }
    
    private void setEdited(final BoolValue edited_) {
        edited_.getClass();
        this.edited_ = edited_;
    }
    
    private void setGilded(final Int64Value gilded_) {
        gilded_.getClass();
        this.gilded_ = gilded_;
    }
    
    private void setGildings(final Any gildings_) {
        gildings_.getClass();
        this.gildings_ = gildings_;
    }
    
    private void setId(final StringValue id_) {
        id_.getClass();
        this.id_ = id_;
    }
    
    private void setIgnoreReports(final BoolValue ignoreReports_) {
        ignoreReports_.getClass();
        this.ignoreReports_ = ignoreReports_;
    }
    
    private void setIsSubmitter(final BoolValue isSubmitter_) {
        isSubmitter_.getClass();
        this.isSubmitter_ = isSubmitter_;
    }
    
    private void setLikes(final BoolValue likes_) {
        likes_.getClass();
        this.likes_ = likes_;
    }
    
    private void setLinkAuthor(final StringValue linkAuthor_) {
        linkAuthor_.getClass();
        this.linkAuthor_ = linkAuthor_;
    }
    
    private void setLinkId(final StringValue linkId_) {
        linkId_.getClass();
        this.linkId_ = linkId_;
    }
    
    private void setLinkPermalink(final StringValue linkPermalink_) {
        linkPermalink_.getClass();
        this.linkPermalink_ = linkPermalink_;
    }
    
    private void setLinkTitle(final StringValue linkTitle_) {
        linkTitle_.getClass();
        this.linkTitle_ = linkTitle_;
    }
    
    private void setLinkUrl(final StringValue linkUrl_) {
        linkUrl_.getClass();
        this.linkUrl_ = linkUrl_;
    }
    
    private void setLocked(final BoolValue locked_) {
        locked_.getClass();
        this.locked_ = locked_;
    }
    
    private void setModNote(final StringValue modNote_) {
        modNote_.getClass();
        this.modNote_ = modNote_;
    }
    
    private void setModReasonBy(final StringValue modReasonBy_) {
        modReasonBy_.getClass();
        this.modReasonBy_ = modReasonBy_;
    }
    
    private void setModReasonTitle(final StringValue modReasonTitle_) {
        modReasonTitle_.getClass();
        this.modReasonTitle_ = modReasonTitle_;
    }
    
    private void setModReports(final int n, final Any any) {
        any.getClass();
        this.ensureModReportsIsMutable();
        ((List<Any>)this.modReports_).set(n, any);
    }
    
    private void setName(final StringValue name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNoFollow(final BoolValue noFollow_) {
        noFollow_.getClass();
        this.noFollow_ = noFollow_;
    }
    
    private void setNumComments(final Int64Value numComments_) {
        numComments_.getClass();
        this.numComments_ = numComments_;
    }
    
    private void setNumReports(final Int64Value numReports_) {
        numReports_.getClass();
        this.numReports_ = numReports_;
    }
    
    private void setOver18(final BoolValue over18_) {
        over18_.getClass();
        this.over18_ = over18_;
    }
    
    private void setParentId(final StringValue parentId_) {
        parentId_.getClass();
        this.parentId_ = parentId_;
    }
    
    private void setPermalink(final StringValue permalink_) {
        permalink_.getClass();
        this.permalink_ = permalink_;
    }
    
    private void setQuarantine(final BoolValue quarantine_) {
        quarantine_.getClass();
        this.quarantine_ = quarantine_;
    }
    
    private void setRemovalReason(final StringValue removalReason_) {
        removalReason_.getClass();
        this.removalReason_ = removalReason_;
    }
    
    private void setRemoved(final BoolValue removed_) {
        removed_.getClass();
        this.removed_ = removed_;
    }
    
    private void setReplies(final StringValue replies_) {
        replies_.getClass();
        this.replies_ = replies_;
    }
    
    private void setReportReasons(final ListValue reportReasons_) {
        reportReasons_.getClass();
        this.reportReasons_ = reportReasons_;
    }
    
    private void setRteMode(final StringValue rteMode_) {
        rteMode_.getClass();
        this.rteMode_ = rteMode_;
    }
    
    private void setSaved(final BoolValue saved_) {
        saved_.getClass();
        this.saved_ = saved_;
    }
    
    private void setScore(final Int64Value score_) {
        score_.getClass();
        this.score_ = score_;
    }
    
    private void setScoreHidden(final BoolValue scoreHidden_) {
        scoreHidden_.getClass();
        this.scoreHidden_ = scoreHidden_;
    }
    
    private void setSelftext(final StringValue selftext_) {
        selftext_.getClass();
        this.selftext_ = selftext_;
    }
    
    private void setSelftextHtml(final StringValue selftextHtml_) {
        selftextHtml_.getClass();
        this.selftextHtml_ = selftextHtml_;
    }
    
    private void setSendReplies(final BoolValue sendReplies_) {
        sendReplies_.getClass();
        this.sendReplies_ = sendReplies_;
    }
    
    private void setSpam(final BoolValue spam_) {
        spam_.getClass();
        this.spam_ = spam_;
    }
    
    private void setSpoiler(final StringValue spoiler_) {
        spoiler_.getClass();
        this.spoiler_ = spoiler_;
    }
    
    private void setStickied(final BoolValue stickied_) {
        stickied_.getClass();
        this.stickied_ = stickied_;
    }
    
    private void setSubreddit(final StringValue subreddit_) {
        subreddit_.getClass();
        this.subreddit_ = subreddit_;
    }
    
    private void setSubredditId(final StringValue subredditId_) {
        subredditId_.getClass();
        this.subredditId_ = subredditId_;
    }
    
    private void setSubredditNamePrefixed(final StringValue subredditNamePrefixed_) {
        subredditNamePrefixed_.getClass();
        this.subredditNamePrefixed_ = subredditNamePrefixed_;
    }
    
    private void setSubredditType(final StringValue subredditType_) {
        subredditType_.getClass();
        this.subredditType_ = subredditType_;
    }
    
    private void setThumbnail(final StringValue thumbnail_) {
        thumbnail_.getClass();
        this.thumbnail_ = thumbnail_;
    }
    
    private void setThumbnailHeight(final Int64Value thumbnailHeight_) {
        thumbnailHeight_.getClass();
        this.thumbnailHeight_ = thumbnailHeight_;
    }
    
    private void setThumbnailWidth(final Int64Value thumbnailWidth_) {
        thumbnailWidth_.getClass();
        this.thumbnailWidth_ = thumbnailWidth_;
    }
    
    private void setTitle(final StringValue title_) {
        title_.getClass();
        this.title_ = title_;
    }
    
    private void setTopAwardedType(final StringValue topAwardedType_) {
        topAwardedType_.getClass();
        this.topAwardedType_ = topAwardedType_;
    }
    
    private void setTotalAwardsReceived(final Int64Value totalAwardsReceived_) {
        totalAwardsReceived_.getClass();
        this.totalAwardsReceived_ = totalAwardsReceived_;
    }
    
    private void setTreatmentTags(final int n, final Any any) {
        any.getClass();
        this.ensureTreatmentTagsIsMutable();
        ((List<Any>)this.treatmentTags_).set(n, any);
    }
    
    private void setUnrepliableReason(final StringValue unrepliableReason_) {
        unrepliableReason_.getClass();
        this.unrepliableReason_ = unrepliableReason_;
    }
    
    private void setUps(final Int64Value ups_) {
        ups_.getClass();
        this.ups_ = ups_;
    }
    
    private void setUrl(final StringValue url_) {
        url_.getClass();
        this.url_ = url_;
    }
    
    private void setUserReports(final int n, final Any any) {
        any.getClass();
        this.ensureUserReportsIsMutable();
        ((List<Any>)this.userReports_).set(n, any);
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
                final n1<CommonMsg$RedditObject> parser;
                if ((parser = CommonMsg$RedditObject.PARSER) == null) {
                    synchronized (CommonMsg$RedditObject.class) {
                        if (CommonMsg$RedditObject.PARSER == null) {
                            CommonMsg$RedditObject.PARSER = (n1<CommonMsg$RedditObject>)new GeneratedMessageLite$c((GeneratedMessageLite)CommonMsg$RedditObject.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return CommonMsg$RedditObject.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)CommonMsg$RedditObject.DEFAULT_INSTANCE, "\u0000Z\u0000\u0000\u0001[Z\u0000\u0006\u0000\u0001\u001b\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\u001b\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t\u0013\u001b\u0014\t\u0015\t\u0016\t\u0017\t\u0018\t\u0019\t\u001a\t\u001b\t\u001c\t\u001d\t\u001e\t\u001f\t \t!\t\"\t#\t$\t%\t&\t'\t(\t)\t*\t+\t,\t-\t.\t/\t0\u001b1\t2\t4\t5\t6\t7\t8\t9\t:\t;\t<\t=\t>\t?\t@\tA\tB\tC\tD\tE\tF\tG\tH\u001bI\tJ\tK\u001bL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ\t[\t", new Object[] { "allAwardings_", Any.class, "approved_", "approvedAtUtc_", "approvedBy_", "archived_", "associatedAward_", "author_", "authorFlairBackgroundColor_", "authorFlairCssClass_", "authorFlairRichtext_", AuthorFlairRichText.class, "authorFlairTemplateId_", "authorFlairText_", "authorFlairTextColor_", "authorFlairType_", "authorFullname_", "authorIsBlocked_", "authorPatreonFlair_", "authorPremium_", "awarders_", StringValue.class, "bannedAtUtc_", "bannedBy_", "body_", "bodyHtml_", "canGild_", "canModPost_", "collapsed_", "collapsedBecauseCrowdControl_", "collapsedReason_", "collapsedReasonCode_", "commentType_", "controversiality_", "created_", "createdUtc_", "distinguished_", "downs_", "edited_", "gilded_", "gildings_", "id_", "ignoreReports_", "isSubmitter_", "likes_", "linkId_", "locked_", "modNote_", "modReasonBy_", "modReasonTitle_", "modReports_", Any.class, "name_", "noFollow_", "numReports_", "parentId_", "permalink_", "removalReason_", "removed_", "replies_", "reportReasons_", "rteMode_", "saved_", "score_", "scoreHidden_", "sendReplies_", "spam_", "stickied_", "subreddit_", "subredditId_", "subredditNamePrefixed_", "subredditType_", "topAwardedType_", "totalAwardsReceived_", "treatmentTags_", Any.class, "unrepliableReason_", "ups_", "userReports_", Any.class, "depth_", "linkTitle_", "linkAuthor_", "numComments_", "over18_", "linkPermalink_", "quarantine_", "linkUrl_", "selftext_", "selftextHtml_", "spoiler_", "thumbnail_", "thumbnailWidth_", "thumbnailHeight_", "title_", "url_" });
            }
            case 2: {
                return new b();
            }
            case 1: {
                return new CommonMsg$RedditObject();
            }
        }
    }
    
    public Any getAllAwardings(final int n) {
        return ((List<Any>)this.allAwardings_).get(n);
    }
    
    public int getAllAwardingsCount() {
        return ((List)this.allAwardings_).size();
    }
    
    public List<Any> getAllAwardingsList() {
        return (List<Any>)this.allAwardings_;
    }
    
    public e getAllAwardingsOrBuilder(final int n) {
        return ((List<e>)this.allAwardings_).get(n);
    }
    
    public List<? extends e> getAllAwardingsOrBuilderList() {
        return (List<? extends e>)this.allAwardings_;
    }
    
    public BoolValue getApproved() {
        BoolValue boolValue;
        if ((boolValue = this.approved_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public Int64Value getApprovedAtUtc() {
        Int64Value int64Value;
        if ((int64Value = this.approvedAtUtc_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public StringValue getApprovedBy() {
        StringValue stringValue;
        if ((stringValue = this.approvedBy_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getArchived() {
        BoolValue boolValue;
        if ((boolValue = this.archived_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getAssociatedAward() {
        StringValue stringValue;
        if ((stringValue = this.associatedAward_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getAuthor() {
        StringValue stringValue;
        if ((stringValue = this.author_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getAuthorFlairBackgroundColor() {
        StringValue stringValue;
        if ((stringValue = this.authorFlairBackgroundColor_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getAuthorFlairCssClass() {
        StringValue stringValue;
        if ((stringValue = this.authorFlairCssClass_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public AuthorFlairRichText getAuthorFlairRichtext(final int n) {
        return ((List<AuthorFlairRichText>)this.authorFlairRichtext_).get(n);
    }
    
    public int getAuthorFlairRichtextCount() {
        return ((List)this.authorFlairRichtext_).size();
    }
    
    public List<AuthorFlairRichText> getAuthorFlairRichtextList() {
        return (List<AuthorFlairRichText>)this.authorFlairRichtext_;
    }
    
    public CommonMsg$RedditObject$a getAuthorFlairRichtextOrBuilder(final int n) {
        return ((List<CommonMsg$RedditObject$a>)this.authorFlairRichtext_).get(n);
    }
    
    public List<? extends CommonMsg$RedditObject$a> getAuthorFlairRichtextOrBuilderList() {
        return (List<? extends CommonMsg$RedditObject$a>)this.authorFlairRichtext_;
    }
    
    public StringValue getAuthorFlairTemplateId() {
        StringValue stringValue;
        if ((stringValue = this.authorFlairTemplateId_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getAuthorFlairText() {
        StringValue stringValue;
        if ((stringValue = this.authorFlairText_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getAuthorFlairTextColor() {
        StringValue stringValue;
        if ((stringValue = this.authorFlairTextColor_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getAuthorFlairType() {
        StringValue stringValue;
        if ((stringValue = this.authorFlairType_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getAuthorFullname() {
        StringValue stringValue;
        if ((stringValue = this.authorFullname_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getAuthorIsBlocked() {
        BoolValue boolValue;
        if ((boolValue = this.authorIsBlocked_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getAuthorPatreonFlair() {
        BoolValue boolValue;
        if ((boolValue = this.authorPatreonFlair_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getAuthorPremium() {
        BoolValue boolValue;
        if ((boolValue = this.authorPremium_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getAwarders(final int n) {
        return ((List<StringValue>)this.awarders_).get(n);
    }
    
    public int getAwardersCount() {
        return ((List)this.awarders_).size();
    }
    
    public List<StringValue> getAwardersList() {
        return (List<StringValue>)this.awarders_;
    }
    
    public x1 getAwardersOrBuilder(final int n) {
        return ((List<x1>)this.awarders_).get(n);
    }
    
    public List<? extends x1> getAwardersOrBuilderList() {
        return (List<? extends x1>)this.awarders_;
    }
    
    public Int64Value getBannedAtUtc() {
        Int64Value int64Value;
        if ((int64Value = this.bannedAtUtc_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public StringValue getBannedBy() {
        StringValue stringValue;
        if ((stringValue = this.bannedBy_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getBody() {
        StringValue stringValue;
        if ((stringValue = this.body_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getBodyHtml() {
        StringValue stringValue;
        if ((stringValue = this.bodyHtml_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getCanGild() {
        BoolValue boolValue;
        if ((boolValue = this.canGild_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getCanModPost() {
        BoolValue boolValue;
        if ((boolValue = this.canModPost_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getCollapsed() {
        BoolValue boolValue;
        if ((boolValue = this.collapsed_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getCollapsedBecauseCrowdControl() {
        BoolValue boolValue;
        if ((boolValue = this.collapsedBecauseCrowdControl_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getCollapsedReason() {
        StringValue stringValue;
        if ((stringValue = this.collapsedReason_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getCollapsedReasonCode() {
        StringValue stringValue;
        if ((stringValue = this.collapsedReasonCode_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getCommentType() {
        StringValue stringValue;
        if ((stringValue = this.commentType_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Int64Value getControversiality() {
        Int64Value int64Value;
        if ((int64Value = this.controversiality_) == null) {
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
    
    public Int64Value getDepth() {
        Int64Value int64Value;
        if ((int64Value = this.depth_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public StringValue getDistinguished() {
        StringValue stringValue;
        if ((stringValue = this.distinguished_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Int64Value getDowns() {
        Int64Value int64Value;
        if ((int64Value = this.downs_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public BoolValue getEdited() {
        BoolValue boolValue;
        if ((boolValue = this.edited_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public Int64Value getGilded() {
        Int64Value int64Value;
        if ((int64Value = this.gilded_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public Any getGildings() {
        Any any;
        if ((any = this.gildings_) == null) {
            any = Any.getDefaultInstance();
        }
        return any;
    }
    
    public StringValue getId() {
        StringValue stringValue;
        if ((stringValue = this.id_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getIgnoreReports() {
        BoolValue boolValue;
        if ((boolValue = this.ignoreReports_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getIsSubmitter() {
        BoolValue boolValue;
        if ((boolValue = this.isSubmitter_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getLikes() {
        BoolValue boolValue;
        if ((boolValue = this.likes_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getLinkAuthor() {
        StringValue stringValue;
        if ((stringValue = this.linkAuthor_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getLinkId() {
        StringValue stringValue;
        if ((stringValue = this.linkId_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getLinkPermalink() {
        StringValue stringValue;
        if ((stringValue = this.linkPermalink_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getLinkTitle() {
        StringValue stringValue;
        if ((stringValue = this.linkTitle_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getLinkUrl() {
        StringValue stringValue;
        if ((stringValue = this.linkUrl_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getLocked() {
        BoolValue boolValue;
        if ((boolValue = this.locked_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getModNote() {
        StringValue stringValue;
        if ((stringValue = this.modNote_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getModReasonBy() {
        StringValue stringValue;
        if ((stringValue = this.modReasonBy_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getModReasonTitle() {
        StringValue stringValue;
        if ((stringValue = this.modReasonTitle_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Any getModReports(final int n) {
        return ((List<Any>)this.modReports_).get(n);
    }
    
    public int getModReportsCount() {
        return ((List)this.modReports_).size();
    }
    
    public List<Any> getModReportsList() {
        return (List<Any>)this.modReports_;
    }
    
    public e getModReportsOrBuilder(final int n) {
        return ((List<e>)this.modReports_).get(n);
    }
    
    public List<? extends e> getModReportsOrBuilderList() {
        return (List<? extends e>)this.modReports_;
    }
    
    public StringValue getName() {
        StringValue stringValue;
        if ((stringValue = this.name_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getNoFollow() {
        BoolValue boolValue;
        if ((boolValue = this.noFollow_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public Int64Value getNumComments() {
        Int64Value int64Value;
        if ((int64Value = this.numComments_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public Int64Value getNumReports() {
        Int64Value int64Value;
        if ((int64Value = this.numReports_) == null) {
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
    
    public StringValue getParentId() {
        StringValue stringValue;
        if ((stringValue = this.parentId_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getPermalink() {
        StringValue stringValue;
        if ((stringValue = this.permalink_) == null) {
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
    
    public StringValue getRemovalReason() {
        StringValue stringValue;
        if ((stringValue = this.removalReason_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getRemoved() {
        BoolValue boolValue;
        if ((boolValue = this.removed_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getReplies() {
        StringValue stringValue;
        if ((stringValue = this.replies_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public ListValue getReportReasons() {
        ListValue listValue;
        if ((listValue = this.reportReasons_) == null) {
            listValue = ListValue.getDefaultInstance();
        }
        return listValue;
    }
    
    public StringValue getRteMode() {
        StringValue stringValue;
        if ((stringValue = this.rteMode_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getSaved() {
        BoolValue boolValue;
        if ((boolValue = this.saved_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public Int64Value getScore() {
        Int64Value int64Value;
        if ((int64Value = this.score_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public BoolValue getScoreHidden() {
        BoolValue boolValue;
        if ((boolValue = this.scoreHidden_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getSelftext() {
        StringValue stringValue;
        if ((stringValue = this.selftext_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public StringValue getSelftextHtml() {
        StringValue stringValue;
        if ((stringValue = this.selftextHtml_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getSendReplies() {
        BoolValue boolValue;
        if ((boolValue = this.sendReplies_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public BoolValue getSpam() {
        BoolValue boolValue;
        if ((boolValue = this.spam_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getSpoiler() {
        StringValue stringValue;
        if ((stringValue = this.spoiler_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public BoolValue getStickied() {
        BoolValue boolValue;
        if ((boolValue = this.stickied_) == null) {
            boolValue = BoolValue.getDefaultInstance();
        }
        return boolValue;
    }
    
    public StringValue getSubreddit() {
        StringValue stringValue;
        if ((stringValue = this.subreddit_) == null) {
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
    
    public StringValue getSubredditNamePrefixed() {
        StringValue stringValue;
        if ((stringValue = this.subredditNamePrefixed_) == null) {
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
    
    public StringValue getThumbnail() {
        StringValue stringValue;
        if ((stringValue = this.thumbnail_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Int64Value getThumbnailHeight() {
        Int64Value int64Value;
        if ((int64Value = this.thumbnailHeight_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public Int64Value getThumbnailWidth() {
        Int64Value int64Value;
        if ((int64Value = this.thumbnailWidth_) == null) {
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
    
    public StringValue getTopAwardedType() {
        StringValue stringValue;
        if ((stringValue = this.topAwardedType_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Int64Value getTotalAwardsReceived() {
        Int64Value int64Value;
        if ((int64Value = this.totalAwardsReceived_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public Any getTreatmentTags(final int n) {
        return ((List<Any>)this.treatmentTags_).get(n);
    }
    
    public int getTreatmentTagsCount() {
        return ((List)this.treatmentTags_).size();
    }
    
    public List<Any> getTreatmentTagsList() {
        return (List<Any>)this.treatmentTags_;
    }
    
    public e getTreatmentTagsOrBuilder(final int n) {
        return ((List<e>)this.treatmentTags_).get(n);
    }
    
    public List<? extends e> getTreatmentTagsOrBuilderList() {
        return (List<? extends e>)this.treatmentTags_;
    }
    
    public StringValue getUnrepliableReason() {
        StringValue stringValue;
        if ((stringValue = this.unrepliableReason_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Int64Value getUps() {
        Int64Value int64Value;
        if ((int64Value = this.ups_) == null) {
            int64Value = Int64Value.getDefaultInstance();
        }
        return int64Value;
    }
    
    public StringValue getUrl() {
        StringValue stringValue;
        if ((stringValue = this.url_) == null) {
            stringValue = StringValue.getDefaultInstance();
        }
        return stringValue;
    }
    
    public Any getUserReports(final int n) {
        return ((List<Any>)this.userReports_).get(n);
    }
    
    public int getUserReportsCount() {
        return ((List)this.userReports_).size();
    }
    
    public List<Any> getUserReportsList() {
        return (List<Any>)this.userReports_;
    }
    
    public e getUserReportsOrBuilder(final int n) {
        return ((List<e>)this.userReports_).get(n);
    }
    
    public List<? extends e> getUserReportsOrBuilderList() {
        return (List<? extends e>)this.userReports_;
    }
    
    public boolean hasApproved() {
        return this.approved_ != null;
    }
    
    public boolean hasApprovedAtUtc() {
        return this.approvedAtUtc_ != null;
    }
    
    public boolean hasApprovedBy() {
        return this.approvedBy_ != null;
    }
    
    public boolean hasArchived() {
        return this.archived_ != null;
    }
    
    public boolean hasAssociatedAward() {
        return this.associatedAward_ != null;
    }
    
    public boolean hasAuthor() {
        return this.author_ != null;
    }
    
    public boolean hasAuthorFlairBackgroundColor() {
        return this.authorFlairBackgroundColor_ != null;
    }
    
    public boolean hasAuthorFlairCssClass() {
        return this.authorFlairCssClass_ != null;
    }
    
    public boolean hasAuthorFlairTemplateId() {
        return this.authorFlairTemplateId_ != null;
    }
    
    public boolean hasAuthorFlairText() {
        return this.authorFlairText_ != null;
    }
    
    public boolean hasAuthorFlairTextColor() {
        return this.authorFlairTextColor_ != null;
    }
    
    public boolean hasAuthorFlairType() {
        return this.authorFlairType_ != null;
    }
    
    public boolean hasAuthorFullname() {
        return this.authorFullname_ != null;
    }
    
    public boolean hasAuthorIsBlocked() {
        return this.authorIsBlocked_ != null;
    }
    
    public boolean hasAuthorPatreonFlair() {
        return this.authorPatreonFlair_ != null;
    }
    
    public boolean hasAuthorPremium() {
        return this.authorPremium_ != null;
    }
    
    public boolean hasBannedAtUtc() {
        return this.bannedAtUtc_ != null;
    }
    
    public boolean hasBannedBy() {
        return this.bannedBy_ != null;
    }
    
    public boolean hasBody() {
        return this.body_ != null;
    }
    
    public boolean hasBodyHtml() {
        return this.bodyHtml_ != null;
    }
    
    public boolean hasCanGild() {
        return this.canGild_ != null;
    }
    
    public boolean hasCanModPost() {
        return this.canModPost_ != null;
    }
    
    public boolean hasCollapsed() {
        return this.collapsed_ != null;
    }
    
    public boolean hasCollapsedBecauseCrowdControl() {
        return this.collapsedBecauseCrowdControl_ != null;
    }
    
    public boolean hasCollapsedReason() {
        return this.collapsedReason_ != null;
    }
    
    public boolean hasCollapsedReasonCode() {
        return this.collapsedReasonCode_ != null;
    }
    
    public boolean hasCommentType() {
        return this.commentType_ != null;
    }
    
    public boolean hasControversiality() {
        return this.controversiality_ != null;
    }
    
    public boolean hasCreated() {
        return this.created_ != null;
    }
    
    public boolean hasCreatedUtc() {
        return this.createdUtc_ != null;
    }
    
    public boolean hasDepth() {
        return this.depth_ != null;
    }
    
    public boolean hasDistinguished() {
        return this.distinguished_ != null;
    }
    
    public boolean hasDowns() {
        return this.downs_ != null;
    }
    
    public boolean hasEdited() {
        return this.edited_ != null;
    }
    
    public boolean hasGilded() {
        return this.gilded_ != null;
    }
    
    public boolean hasGildings() {
        return this.gildings_ != null;
    }
    
    public boolean hasId() {
        return this.id_ != null;
    }
    
    public boolean hasIgnoreReports() {
        return this.ignoreReports_ != null;
    }
    
    public boolean hasIsSubmitter() {
        return this.isSubmitter_ != null;
    }
    
    public boolean hasLikes() {
        return this.likes_ != null;
    }
    
    public boolean hasLinkAuthor() {
        return this.linkAuthor_ != null;
    }
    
    public boolean hasLinkId() {
        return this.linkId_ != null;
    }
    
    public boolean hasLinkPermalink() {
        return this.linkPermalink_ != null;
    }
    
    public boolean hasLinkTitle() {
        return this.linkTitle_ != null;
    }
    
    public boolean hasLinkUrl() {
        return this.linkUrl_ != null;
    }
    
    public boolean hasLocked() {
        return this.locked_ != null;
    }
    
    public boolean hasModNote() {
        return this.modNote_ != null;
    }
    
    public boolean hasModReasonBy() {
        return this.modReasonBy_ != null;
    }
    
    public boolean hasModReasonTitle() {
        return this.modReasonTitle_ != null;
    }
    
    public boolean hasName() {
        return this.name_ != null;
    }
    
    public boolean hasNoFollow() {
        return this.noFollow_ != null;
    }
    
    public boolean hasNumComments() {
        return this.numComments_ != null;
    }
    
    public boolean hasNumReports() {
        return this.numReports_ != null;
    }
    
    public boolean hasOver18() {
        return this.over18_ != null;
    }
    
    public boolean hasParentId() {
        return this.parentId_ != null;
    }
    
    public boolean hasPermalink() {
        return this.permalink_ != null;
    }
    
    public boolean hasQuarantine() {
        return this.quarantine_ != null;
    }
    
    public boolean hasRemovalReason() {
        return this.removalReason_ != null;
    }
    
    public boolean hasRemoved() {
        return this.removed_ != null;
    }
    
    public boolean hasReplies() {
        return this.replies_ != null;
    }
    
    public boolean hasReportReasons() {
        return this.reportReasons_ != null;
    }
    
    public boolean hasRteMode() {
        return this.rteMode_ != null;
    }
    
    public boolean hasSaved() {
        return this.saved_ != null;
    }
    
    public boolean hasScore() {
        return this.score_ != null;
    }
    
    public boolean hasScoreHidden() {
        return this.scoreHidden_ != null;
    }
    
    public boolean hasSelftext() {
        return this.selftext_ != null;
    }
    
    public boolean hasSelftextHtml() {
        return this.selftextHtml_ != null;
    }
    
    public boolean hasSendReplies() {
        return this.sendReplies_ != null;
    }
    
    public boolean hasSpam() {
        return this.spam_ != null;
    }
    
    public boolean hasSpoiler() {
        return this.spoiler_ != null;
    }
    
    public boolean hasStickied() {
        return this.stickied_ != null;
    }
    
    public boolean hasSubreddit() {
        return this.subreddit_ != null;
    }
    
    public boolean hasSubredditId() {
        return this.subredditId_ != null;
    }
    
    public boolean hasSubredditNamePrefixed() {
        return this.subredditNamePrefixed_ != null;
    }
    
    public boolean hasSubredditType() {
        return this.subredditType_ != null;
    }
    
    public boolean hasThumbnail() {
        return this.thumbnail_ != null;
    }
    
    public boolean hasThumbnailHeight() {
        return this.thumbnailHeight_ != null;
    }
    
    public boolean hasThumbnailWidth() {
        return this.thumbnailWidth_ != null;
    }
    
    public boolean hasTitle() {
        return this.title_ != null;
    }
    
    public boolean hasTopAwardedType() {
        return this.topAwardedType_ != null;
    }
    
    public boolean hasTotalAwardsReceived() {
        return this.totalAwardsReceived_ != null;
    }
    
    public boolean hasUnrepliableReason() {
        return this.unrepliableReason_ != null;
    }
    
    public boolean hasUps() {
        return this.ups_ != null;
    }
    
    public boolean hasUrl() {
        return this.url_ != null;
    }
    
    public static final class AuthorFlairRichText extends GeneratedMessageLite<AuthorFlairRichText, a> implements CommonMsg$RedditObject$a
    {
        private static final AuthorFlairRichText DEFAULT_INSTANCE;
        public static final int E_FIELD_NUMBER = 1;
        private static volatile n1<AuthorFlairRichText> PARSER;
        public static final int T_FIELD_NUMBER = 2;
        private StringValue e_;
        private StringValue t_;
        
        static {
            GeneratedMessageLite.registerDefaultInstance((Class)AuthorFlairRichText.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new AuthorFlairRichText()));
        }
        
        private AuthorFlairRichText() {
        }
        
        public static /* synthetic */ AuthorFlairRichText access$5700() {
            return AuthorFlairRichText.DEFAULT_INSTANCE;
        }
        
        private void clearE() {
            this.e_ = null;
        }
        
        private void clearT() {
            this.t_ = null;
        }
        
        public static AuthorFlairRichText getDefaultInstance() {
            return AuthorFlairRichText.DEFAULT_INSTANCE;
        }
        
        private void mergeE(final StringValue e_) {
            e_.getClass();
            final StringValue e_2 = this.e_;
            if (e_2 != null && e_2 != StringValue.getDefaultInstance()) {
                this.e_ = (StringValue)f0.e(this.e_, e_);
            }
            else {
                this.e_ = e_;
            }
        }
        
        private void mergeT(final StringValue t_) {
            t_.getClass();
            final StringValue t_2 = this.t_;
            if (t_2 != null && t_2 != StringValue.getDefaultInstance()) {
                this.t_ = (StringValue)f0.e(this.t_, t_);
            }
            else {
                this.t_ = t_;
            }
        }
        
        public static a newBuilder() {
            return (a)AuthorFlairRichText.DEFAULT_INSTANCE.createBuilder();
        }
        
        public static a newBuilder(final AuthorFlairRichText authorFlairRichText) {
            return (a)AuthorFlairRichText.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)authorFlairRichText);
        }
        
        public static AuthorFlairRichText parseDelimitedFrom(final InputStream inputStream) throws IOException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AuthorFlairRichText parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AuthorFlairRichText parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, byteString);
        }
        
        public static AuthorFlairRichText parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, byteString, d0);
        }
        
        public static AuthorFlairRichText parseFrom(final l l) throws IOException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, l);
        }
        
        public static AuthorFlairRichText parseFrom(final l l, final d0 d0) throws IOException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, l, d0);
        }
        
        public static AuthorFlairRichText parseFrom(final InputStream inputStream) throws IOException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, inputStream);
        }
        
        public static AuthorFlairRichText parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, inputStream, d0);
        }
        
        public static AuthorFlairRichText parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, byteBuffer);
        }
        
        public static AuthorFlairRichText parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, byteBuffer, d0);
        }
        
        public static AuthorFlairRichText parseFrom(final byte[] array) throws InvalidProtocolBufferException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, array);
        }
        
        public static AuthorFlairRichText parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
            return (AuthorFlairRichText)GeneratedMessageLite.parseFrom((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE, array, d0);
        }
        
        public static n1<AuthorFlairRichText> parser() {
            return (n1<AuthorFlairRichText>)AuthorFlairRichText.DEFAULT_INSTANCE.getParserForType();
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
                    final n1<AuthorFlairRichText> parser;
                    if ((parser = AuthorFlairRichText.PARSER) == null) {
                        synchronized (AuthorFlairRichText.class) {
                            if (AuthorFlairRichText.PARSER == null) {
                                AuthorFlairRichText.PARSER = (n1<AuthorFlairRichText>)new GeneratedMessageLite$c((GeneratedMessageLite)AuthorFlairRichText.DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return parser;
                }
                case 4: {
                    return AuthorFlairRichText.DEFAULT_INSTANCE;
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo((c1)AuthorFlairRichText.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "e_", "t_" });
                }
                case 2: {
                    return new a();
                }
                case 1: {
                    return new AuthorFlairRichText();
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
        
        public static final class a extends GeneratedMessageLite$b<AuthorFlairRichText, a> implements CommonMsg$RedditObject$a
        {
            public a() {
                super((GeneratedMessageLite)AuthorFlairRichText.access$5700());
            }
        }
    }
    
    public static final class b extends GeneratedMessageLite$b<CommonMsg$RedditObject, b> implements d1
    {
        public b() {
            super((GeneratedMessageLite)CommonMsg$RedditObject.access$6500());
        }
    }
}
