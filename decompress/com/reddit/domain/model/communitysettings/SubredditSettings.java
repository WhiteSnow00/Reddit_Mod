// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitysettings;

import a2.b;
import ag0.a;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001<B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u000eH\u00c6\u0003J\u00ad\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\u0013\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020:H\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010 R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001f¨\u0006=" }, d2 = { "Lcom/reddit/domain/model/communitysettings/SubredditSettings;", "", "subredditId", "", "isTopListingAllowed", "", "isDiscoveryAllowed", "languageId", "allowedPostTypes", "", "Lcom/reddit/domain/model/communitysettings/SubredditSettings$PostType;", "isChatPostFeatureEnabled", "isChatPostCreationAllowed", "postFlairSettings", "Lcom/reddit/domain/model/communitysettings/FlairSettings;", "authorFlairSettings", "isArchivePostsEnabled", "countryCode", "languageCode", "isCountrySiteEditable", "modMigrationAt", "commentContributionSettings", "Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;ZZLcom/reddit/domain/model/communitysettings/FlairSettings;Lcom/reddit/domain/model/communitysettings/FlairSettings;ZLjava/lang/String;Ljava/lang/Object;ZLjava/lang/String;Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;)V", "getAllowedPostTypes", "()Ljava/util/List;", "getAuthorFlairSettings", "()Lcom/reddit/domain/model/communitysettings/FlairSettings;", "getCommentContributionSettings", "()Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;", "getCountryCode", "()Ljava/lang/String;", "()Z", "getLanguageCode", "()Ljava/lang/Object;", "getLanguageId", "getModMigrationAt", "getPostFlairSettings", "getSubredditId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "PostType", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditSettings
{
    private final List<PostType> allowedPostTypes;
    private final FlairSettings authorFlairSettings;
    private final CommentContributionSettings commentContributionSettings;
    private final String countryCode;
    private final boolean isArchivePostsEnabled;
    private final boolean isChatPostCreationAllowed;
    private final boolean isChatPostFeatureEnabled;
    private final boolean isCountrySiteEditable;
    private final boolean isDiscoveryAllowed;
    private final boolean isTopListingAllowed;
    private final Object languageCode;
    private final String languageId;
    private final String modMigrationAt;
    private final FlairSettings postFlairSettings;
    private final String subredditId;
    
    public SubredditSettings(final String subredditId, final boolean isTopListingAllowed, final boolean isDiscoveryAllowed, final String languageId, final List<? extends PostType> allowedPostTypes, final boolean isChatPostFeatureEnabled, final boolean isChatPostCreationAllowed, final FlairSettings postFlairSettings, final FlairSettings authorFlairSettings, final boolean isArchivePostsEnabled, final String countryCode, final Object languageCode, final boolean isCountrySiteEditable, final String modMigrationAt, final CommentContributionSettings commentContributionSettings) {
        f.f((Object)subredditId, "subredditId");
        f.f((Object)languageId, "languageId");
        f.f((Object)allowedPostTypes, "allowedPostTypes");
        f.f((Object)postFlairSettings, "postFlairSettings");
        f.f((Object)authorFlairSettings, "authorFlairSettings");
        this.subredditId = subredditId;
        this.isTopListingAllowed = isTopListingAllowed;
        this.isDiscoveryAllowed = isDiscoveryAllowed;
        this.languageId = languageId;
        this.allowedPostTypes = (List<PostType>)allowedPostTypes;
        this.isChatPostFeatureEnabled = isChatPostFeatureEnabled;
        this.isChatPostCreationAllowed = isChatPostCreationAllowed;
        this.postFlairSettings = postFlairSettings;
        this.authorFlairSettings = authorFlairSettings;
        this.isArchivePostsEnabled = isArchivePostsEnabled;
        this.countryCode = countryCode;
        this.languageCode = languageCode;
        this.isCountrySiteEditable = isCountrySiteEditable;
        this.modMigrationAt = modMigrationAt;
        this.commentContributionSettings = commentContributionSettings;
    }
    
    public final String component1() {
        return this.subredditId;
    }
    
    public final boolean component10() {
        return this.isArchivePostsEnabled;
    }
    
    public final String component11() {
        return this.countryCode;
    }
    
    public final Object component12() {
        return this.languageCode;
    }
    
    public final boolean component13() {
        return this.isCountrySiteEditable;
    }
    
    public final String component14() {
        return this.modMigrationAt;
    }
    
    public final CommentContributionSettings component15() {
        return this.commentContributionSettings;
    }
    
    public final boolean component2() {
        return this.isTopListingAllowed;
    }
    
    public final boolean component3() {
        return this.isDiscoveryAllowed;
    }
    
    public final String component4() {
        return this.languageId;
    }
    
    public final List<PostType> component5() {
        return this.allowedPostTypes;
    }
    
    public final boolean component6() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final boolean component7() {
        return this.isChatPostCreationAllowed;
    }
    
    public final FlairSettings component8() {
        return this.postFlairSettings;
    }
    
    public final FlairSettings component9() {
        return this.authorFlairSettings;
    }
    
    public final SubredditSettings copy(final String s, final boolean b, final boolean b2, final String s2, final List<? extends PostType> list, final boolean b3, final boolean b4, final FlairSettings flairSettings, final FlairSettings flairSettings2, final boolean b5, final String s3, final Object o, final boolean b6, final String s4, final CommentContributionSettings commentContributionSettings) {
        f.f((Object)s, "subredditId");
        f.f((Object)s2, "languageId");
        f.f((Object)list, "allowedPostTypes");
        f.f((Object)flairSettings, "postFlairSettings");
        f.f((Object)flairSettings2, "authorFlairSettings");
        return new SubredditSettings(s, b, b2, s2, list, b3, b4, flairSettings, flairSettings2, b5, s3, o, b6, s4, commentContributionSettings);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditSettings)) {
            return false;
        }
        final SubredditSettings subredditSettings = (SubredditSettings)o;
        return f.a((Object)this.subredditId, (Object)subredditSettings.subredditId) && this.isTopListingAllowed == subredditSettings.isTopListingAllowed && this.isDiscoveryAllowed == subredditSettings.isDiscoveryAllowed && f.a((Object)this.languageId, (Object)subredditSettings.languageId) && f.a((Object)this.allowedPostTypes, (Object)subredditSettings.allowedPostTypes) && this.isChatPostFeatureEnabled == subredditSettings.isChatPostFeatureEnabled && this.isChatPostCreationAllowed == subredditSettings.isChatPostCreationAllowed && f.a((Object)this.postFlairSettings, (Object)subredditSettings.postFlairSettings) && f.a((Object)this.authorFlairSettings, (Object)subredditSettings.authorFlairSettings) && this.isArchivePostsEnabled == subredditSettings.isArchivePostsEnabled && f.a((Object)this.countryCode, (Object)subredditSettings.countryCode) && f.a(this.languageCode, subredditSettings.languageCode) && this.isCountrySiteEditable == subredditSettings.isCountrySiteEditable && f.a((Object)this.modMigrationAt, (Object)subredditSettings.modMigrationAt) && f.a((Object)this.commentContributionSettings, (Object)subredditSettings.commentContributionSettings);
    }
    
    public final List<PostType> getAllowedPostTypes() {
        return this.allowedPostTypes;
    }
    
    public final FlairSettings getAuthorFlairSettings() {
        return this.authorFlairSettings;
    }
    
    public final CommentContributionSettings getCommentContributionSettings() {
        return this.commentContributionSettings;
    }
    
    public final String getCountryCode() {
        return this.countryCode;
    }
    
    public final Object getLanguageCode() {
        return this.languageCode;
    }
    
    public final String getLanguageId() {
        return this.languageId;
    }
    
    public final String getModMigrationAt() {
        return this.modMigrationAt;
    }
    
    public final FlairSettings getPostFlairSettings() {
        return this.postFlairSettings;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subredditId.hashCode();
        final int isTopListingAllowed = this.isTopListingAllowed ? 1 : 0;
        int n = 1;
        int n2 = isTopListingAllowed;
        if (isTopListingAllowed != 0) {
            n2 = 1;
        }
        int isDiscoveryAllowed;
        if ((isDiscoveryAllowed = (this.isDiscoveryAllowed ? 1 : 0)) != 0) {
            isDiscoveryAllowed = 1;
        }
        final int a = b.a((List)this.allowedPostTypes, ag0.a.f(this.languageId, ((hashCode * 31 + n2) * 31 + isDiscoveryAllowed) * 31, 31), 31);
        int isChatPostFeatureEnabled;
        if ((isChatPostFeatureEnabled = (this.isChatPostFeatureEnabled ? 1 : 0)) != 0) {
            isChatPostFeatureEnabled = 1;
        }
        int isChatPostCreationAllowed;
        if ((isChatPostCreationAllowed = (this.isChatPostCreationAllowed ? 1 : 0)) != 0) {
            isChatPostCreationAllowed = 1;
        }
        final int hashCode2 = this.postFlairSettings.hashCode();
        final int hashCode3 = this.authorFlairSettings.hashCode();
        int isArchivePostsEnabled;
        if ((isArchivePostsEnabled = (this.isArchivePostsEnabled ? 1 : 0)) != 0) {
            isArchivePostsEnabled = 1;
        }
        final String countryCode = this.countryCode;
        int hashCode4 = 0;
        int hashCode5;
        if (countryCode == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = countryCode.hashCode();
        }
        final Object languageCode = this.languageCode;
        int hashCode6;
        if (languageCode == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = languageCode.hashCode();
        }
        final int isCountrySiteEditable = this.isCountrySiteEditable ? 1 : 0;
        if (isCountrySiteEditable == 0) {
            n = isCountrySiteEditable;
        }
        final String modMigrationAt = this.modMigrationAt;
        int hashCode7;
        if (modMigrationAt == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = modMigrationAt.hashCode();
        }
        final CommentContributionSettings commentContributionSettings = this.commentContributionSettings;
        if (commentContributionSettings != null) {
            hashCode4 = commentContributionSettings.hashCode();
        }
        return ((((((hashCode3 + (hashCode2 + ((a + isChatPostFeatureEnabled) * 31 + isChatPostCreationAllowed) * 31) * 31) * 31 + isArchivePostsEnabled) * 31 + hashCode5) * 31 + hashCode6) * 31 + n) * 31 + hashCode7) * 31 + hashCode4;
    }
    
    public final boolean isArchivePostsEnabled() {
        return this.isArchivePostsEnabled;
    }
    
    public final boolean isChatPostCreationAllowed() {
        return this.isChatPostCreationAllowed;
    }
    
    public final boolean isChatPostFeatureEnabled() {
        return this.isChatPostFeatureEnabled;
    }
    
    public final boolean isCountrySiteEditable() {
        return this.isCountrySiteEditable;
    }
    
    public final boolean isDiscoveryAllowed() {
        return this.isDiscoveryAllowed;
    }
    
    public final boolean isTopListingAllowed() {
        return this.isTopListingAllowed;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditSettings(subredditId=");
        k.append(this.subredditId);
        k.append(", isTopListingAllowed=");
        k.append(this.isTopListingAllowed);
        k.append(", isDiscoveryAllowed=");
        k.append(this.isDiscoveryAllowed);
        k.append(", languageId=");
        k.append(this.languageId);
        k.append(", allowedPostTypes=");
        k.append(this.allowedPostTypes);
        k.append(", isChatPostFeatureEnabled=");
        k.append(this.isChatPostFeatureEnabled);
        k.append(", isChatPostCreationAllowed=");
        k.append(this.isChatPostCreationAllowed);
        k.append(", postFlairSettings=");
        k.append(this.postFlairSettings);
        k.append(", authorFlairSettings=");
        k.append(this.authorFlairSettings);
        k.append(", isArchivePostsEnabled=");
        k.append(this.isArchivePostsEnabled);
        k.append(", countryCode=");
        k.append(this.countryCode);
        k.append(", languageCode=");
        k.append(this.languageCode);
        k.append(", isCountrySiteEditable=");
        k.append(this.isCountrySiteEditable);
        k.append(", modMigrationAt=");
        k.append(this.modMigrationAt);
        k.append(", commentContributionSettings=");
        k.append(this.commentContributionSettings);
        k.append(')');
        return k.toString();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/communitysettings/SubredditSettings$PostType;", "", "(Ljava/lang/String;I)V", "LINK", "IMAGE", "VIDEO", "TEXT", "POLL", "TALK", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum PostType
    {
        IMAGE, 
        LINK, 
        POLL, 
        TALK, 
        TEXT, 
        VIDEO;
    }
}
