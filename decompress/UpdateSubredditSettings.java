// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitysettings;

import ah2.f;
import com.reddit.domain.model.communitycreation.SubredditPrivacyType;
import kotlin.Metadata;

@Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001@B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u00cc\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020>H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0014\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\n\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0004\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\t\u0010\u0019R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0013\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#¨\u0006A" }, d2 = { "Lcom/reddit/domain/model/communitysettings/UpdateSubredditSettings;", "", "subredditId", "", "isNsfw", "", "publicDescription", "privacyType", "Lcom/reddit/domain/model/communitycreation/SubredditPrivacyType;", "isTopListingAllowed", "isDiscoveryAllowed", "languageId", "allowedPostType", "Lcom/reddit/domain/model/communitysettings/UpdateSubredditSettings$AllowedPostType;", "allowImages", "allowVideos", "allowChatPosts", "allowPolls", "welcomeMessage", "isWelcomeMessageEnabled", "isArchivePostsEnabled", "commentContributionSettings", "Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/reddit/domain/model/communitycreation/SubredditPrivacyType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/reddit/domain/model/communitysettings/UpdateSubredditSettings$AllowedPostType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;)V", "getAllowChatPosts", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowImages", "getAllowPolls", "getAllowVideos", "getAllowedPostType", "()Lcom/reddit/domain/model/communitysettings/UpdateSubredditSettings$AllowedPostType;", "getCommentContributionSettings", "()Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;", "getLanguageId", "()Ljava/lang/String;", "getPrivacyType", "()Lcom/reddit/domain/model/communitycreation/SubredditPrivacyType;", "getPublicDescription", "getSubredditId", "getWelcomeMessage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/reddit/domain/model/communitycreation/SubredditPrivacyType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/reddit/domain/model/communitysettings/UpdateSubredditSettings$AllowedPostType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;)Lcom/reddit/domain/model/communitysettings/UpdateSubredditSettings;", "equals", "other", "hashCode", "", "toString", "AllowedPostType", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UpdateSubredditSettings
{
    private final Boolean allowChatPosts;
    private final Boolean allowImages;
    private final Boolean allowPolls;
    private final Boolean allowVideos;
    private final AllowedPostType allowedPostType;
    private final CommentContributionSettings commentContributionSettings;
    private final Boolean isArchivePostsEnabled;
    private final Boolean isDiscoveryAllowed;
    private final Boolean isNsfw;
    private final Boolean isTopListingAllowed;
    private final Boolean isWelcomeMessageEnabled;
    private final String languageId;
    private final SubredditPrivacyType privacyType;
    private final String publicDescription;
    private final String subredditId;
    private final String welcomeMessage;
    
    public UpdateSubredditSettings(final String subredditId, final Boolean isNsfw, final String publicDescription, final SubredditPrivacyType privacyType, final Boolean isTopListingAllowed, final Boolean isDiscoveryAllowed, final String languageId, final AllowedPostType allowedPostType, final Boolean allowImages, final Boolean allowVideos, final Boolean allowChatPosts, final Boolean allowPolls, final String welcomeMessage, final Boolean isWelcomeMessageEnabled, final Boolean isArchivePostsEnabled, final CommentContributionSettings commentContributionSettings) {
        f.f((Object)subredditId, "subredditId");
        this.subredditId = subredditId;
        this.isNsfw = isNsfw;
        this.publicDescription = publicDescription;
        this.privacyType = privacyType;
        this.isTopListingAllowed = isTopListingAllowed;
        this.isDiscoveryAllowed = isDiscoveryAllowed;
        this.languageId = languageId;
        this.allowedPostType = allowedPostType;
        this.allowImages = allowImages;
        this.allowVideos = allowVideos;
        this.allowChatPosts = allowChatPosts;
        this.allowPolls = allowPolls;
        this.welcomeMessage = welcomeMessage;
        this.isWelcomeMessageEnabled = isWelcomeMessageEnabled;
        this.isArchivePostsEnabled = isArchivePostsEnabled;
        this.commentContributionSettings = commentContributionSettings;
    }
    
    public final String component1() {
        return this.subredditId;
    }
    
    public final Boolean component10() {
        return this.allowVideos;
    }
    
    public final Boolean component11() {
        return this.allowChatPosts;
    }
    
    public final Boolean component12() {
        return this.allowPolls;
    }
    
    public final String component13() {
        return this.welcomeMessage;
    }
    
    public final Boolean component14() {
        return this.isWelcomeMessageEnabled;
    }
    
    public final Boolean component15() {
        return this.isArchivePostsEnabled;
    }
    
    public final CommentContributionSettings component16() {
        return this.commentContributionSettings;
    }
    
    public final Boolean component2() {
        return this.isNsfw;
    }
    
    public final String component3() {
        return this.publicDescription;
    }
    
    public final SubredditPrivacyType component4() {
        return this.privacyType;
    }
    
    public final Boolean component5() {
        return this.isTopListingAllowed;
    }
    
    public final Boolean component6() {
        return this.isDiscoveryAllowed;
    }
    
    public final String component7() {
        return this.languageId;
    }
    
    public final AllowedPostType component8() {
        return this.allowedPostType;
    }
    
    public final Boolean component9() {
        return this.allowImages;
    }
    
    public final UpdateSubredditSettings copy(final String s, final Boolean b, final String s2, final SubredditPrivacyType subredditPrivacyType, final Boolean b2, final Boolean b3, final String s3, final AllowedPostType allowedPostType, final Boolean b4, final Boolean b5, final Boolean b6, final Boolean b7, final String s4, final Boolean b8, final Boolean b9, final CommentContributionSettings commentContributionSettings) {
        f.f((Object)s, "subredditId");
        return new UpdateSubredditSettings(s, b, s2, subredditPrivacyType, b2, b3, s3, allowedPostType, b4, b5, b6, b7, s4, b8, b9, commentContributionSettings);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubredditSettings)) {
            return false;
        }
        final UpdateSubredditSettings updateSubredditSettings = (UpdateSubredditSettings)o;
        return f.a((Object)this.subredditId, (Object)updateSubredditSettings.subredditId) && f.a((Object)this.isNsfw, (Object)updateSubredditSettings.isNsfw) && f.a((Object)this.publicDescription, (Object)updateSubredditSettings.publicDescription) && this.privacyType == updateSubredditSettings.privacyType && f.a((Object)this.isTopListingAllowed, (Object)updateSubredditSettings.isTopListingAllowed) && f.a((Object)this.isDiscoveryAllowed, (Object)updateSubredditSettings.isDiscoveryAllowed) && f.a((Object)this.languageId, (Object)updateSubredditSettings.languageId) && this.allowedPostType == updateSubredditSettings.allowedPostType && f.a((Object)this.allowImages, (Object)updateSubredditSettings.allowImages) && f.a((Object)this.allowVideos, (Object)updateSubredditSettings.allowVideos) && f.a((Object)this.allowChatPosts, (Object)updateSubredditSettings.allowChatPosts) && f.a((Object)this.allowPolls, (Object)updateSubredditSettings.allowPolls) && f.a((Object)this.welcomeMessage, (Object)updateSubredditSettings.welcomeMessage) && f.a((Object)this.isWelcomeMessageEnabled, (Object)updateSubredditSettings.isWelcomeMessageEnabled) && f.a((Object)this.isArchivePostsEnabled, (Object)updateSubredditSettings.isArchivePostsEnabled) && f.a((Object)this.commentContributionSettings, (Object)updateSubredditSettings.commentContributionSettings);
    }
    
    public final Boolean getAllowChatPosts() {
        return this.allowChatPosts;
    }
    
    public final Boolean getAllowImages() {
        return this.allowImages;
    }
    
    public final Boolean getAllowPolls() {
        return this.allowPolls;
    }
    
    public final Boolean getAllowVideos() {
        return this.allowVideos;
    }
    
    public final AllowedPostType getAllowedPostType() {
        return this.allowedPostType;
    }
    
    public final CommentContributionSettings getCommentContributionSettings() {
        return this.commentContributionSettings;
    }
    
    public final String getLanguageId() {
        return this.languageId;
    }
    
    public final SubredditPrivacyType getPrivacyType() {
        return this.privacyType;
    }
    
    public final String getPublicDescription() {
        return this.publicDescription;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final String getWelcomeMessage() {
        return this.welcomeMessage;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subredditId.hashCode();
        final Boolean isNsfw = this.isNsfw;
        int hashCode2 = 0;
        int hashCode3;
        if (isNsfw == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = isNsfw.hashCode();
        }
        final String publicDescription = this.publicDescription;
        int hashCode4;
        if (publicDescription == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = publicDescription.hashCode();
        }
        final SubredditPrivacyType privacyType = this.privacyType;
        int hashCode5;
        if (privacyType == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = privacyType.hashCode();
        }
        final Boolean isTopListingAllowed = this.isTopListingAllowed;
        int hashCode6;
        if (isTopListingAllowed == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = isTopListingAllowed.hashCode();
        }
        final Boolean isDiscoveryAllowed = this.isDiscoveryAllowed;
        int hashCode7;
        if (isDiscoveryAllowed == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = isDiscoveryAllowed.hashCode();
        }
        final String languageId = this.languageId;
        int hashCode8;
        if (languageId == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = languageId.hashCode();
        }
        final AllowedPostType allowedPostType = this.allowedPostType;
        int hashCode9;
        if (allowedPostType == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = allowedPostType.hashCode();
        }
        final Boolean allowImages = this.allowImages;
        int hashCode10;
        if (allowImages == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = allowImages.hashCode();
        }
        final Boolean allowVideos = this.allowVideos;
        int hashCode11;
        if (allowVideos == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = allowVideos.hashCode();
        }
        final Boolean allowChatPosts = this.allowChatPosts;
        int hashCode12;
        if (allowChatPosts == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = allowChatPosts.hashCode();
        }
        final Boolean allowPolls = this.allowPolls;
        int hashCode13;
        if (allowPolls == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = allowPolls.hashCode();
        }
        final String welcomeMessage = this.welcomeMessage;
        int hashCode14;
        if (welcomeMessage == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = welcomeMessage.hashCode();
        }
        final Boolean isWelcomeMessageEnabled = this.isWelcomeMessageEnabled;
        int hashCode15;
        if (isWelcomeMessageEnabled == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = isWelcomeMessageEnabled.hashCode();
        }
        final Boolean isArchivePostsEnabled = this.isArchivePostsEnabled;
        int hashCode16;
        if (isArchivePostsEnabled == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = isArchivePostsEnabled.hashCode();
        }
        final CommentContributionSettings commentContributionSettings = this.commentContributionSettings;
        if (commentContributionSettings != null) {
            hashCode2 = commentContributionSettings.hashCode();
        }
        return ((((((((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode2;
    }
    
    public final Boolean isArchivePostsEnabled() {
        return this.isArchivePostsEnabled;
    }
    
    public final Boolean isDiscoveryAllowed() {
        return this.isDiscoveryAllowed;
    }
    
    public final Boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final Boolean isTopListingAllowed() {
        return this.isTopListingAllowed;
    }
    
    public final Boolean isWelcomeMessageEnabled() {
        return this.isWelcomeMessageEnabled;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UpdateSubredditSettings(subredditId=");
        k.append(this.subredditId);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", publicDescription=");
        k.append(this.publicDescription);
        k.append(", privacyType=");
        k.append(this.privacyType);
        k.append(", isTopListingAllowed=");
        k.append(this.isTopListingAllowed);
        k.append(", isDiscoveryAllowed=");
        k.append(this.isDiscoveryAllowed);
        k.append(", languageId=");
        k.append(this.languageId);
        k.append(", allowedPostType=");
        k.append(this.allowedPostType);
        k.append(", allowImages=");
        k.append(this.allowImages);
        k.append(", allowVideos=");
        k.append(this.allowVideos);
        k.append(", allowChatPosts=");
        k.append(this.allowChatPosts);
        k.append(", allowPolls=");
        k.append(this.allowPolls);
        k.append(", welcomeMessage=");
        k.append(this.welcomeMessage);
        k.append(", isWelcomeMessageEnabled=");
        k.append(this.isWelcomeMessageEnabled);
        k.append(", isArchivePostsEnabled=");
        k.append(this.isArchivePostsEnabled);
        k.append(", commentContributionSettings=");
        k.append(this.commentContributionSettings);
        k.append(')');
        return k.toString();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/communitysettings/UpdateSubredditSettings$AllowedPostType;", "", "(Ljava/lang/String;I)V", "LINK", "SELF", "ANY", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum AllowedPostType
    {
        ANY, 
        LINK, 
        SELF;
    }
}
