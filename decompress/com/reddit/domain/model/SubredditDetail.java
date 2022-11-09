// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.viewpager.widget.c;
import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ak0.m;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u00d7\u0001\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010!\u001a\u00020\u0002\u0012\b\b\u0001\u0010\"\u001a\u00020\u0002\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010)\u001a\u00020\u0016\u0012\b\b\u0003\u0010*\u001a\u00020\u0002\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bP\u0010QJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\n\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\bJ\t\u0010\f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0016H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0019\u0010\bJ\u00e0\u0001\u0010,\u001a\u00020\u00002\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\"\u001a\u00020\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010)\u001a\u00020\u00162\b\b\u0003\u0010*\u001a\u00020\u00022\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001¢\u0006\u0004\b,\u0010-J\t\u0010.\u001a\u00020\u0002H\u00d6\u0001J\t\u0010/\u001a\u00020\u0016H\u00d6\u0001J\u0013\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00103\u001a\u00020\u0016H\u00d6\u0001J\u0019\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0016H\u00d6\u0001R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b<\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00109\u001a\u0004\b=\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010\bR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b@\u0010\bR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010>\u001a\u0004\bA\u0010\bR\u0019\u0010 \u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\bB\u0010\bR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u00109\u001a\u0004\bC\u0010;R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u00109\u001a\u0004\bD\u0010;R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\bE\u0010;R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u00109\u001a\u0004\bF\u0010;R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u00109\u001a\u0004\bG\u0010;R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\bH\u0010;R\u0019\u0010'\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u0010I\u001a\u0004\bJ\u0010\u0014R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\bK\u0010;R\u0017\u0010)\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b)\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\bO\u0010;R\u0019\u0010+\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010>\u001a\u0004\b+\u0010\b¨\u0006R" }, d2 = { "Lcom/reddit/domain/model/SubredditDetail;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "", "component14", "()Ljava/lang/Long;", "component15", "", "component16", "component17", "component18", "kindWithId", "keyColor", "iconImage", "over18", "userIsBanned", "userIsModerator", "userIsSubscriber", "displayName", "displayNamePrefixed", "primaryKeyColor", "bannerBackgroundImageUrl", "communityIconUrl", "publicDescription", "subscribers", "subredditType", "coins", "subredditTitle", "isTitleSafe", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)Lcom/reddit/domain/model/SubredditDetail;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getKindWithId", "()Ljava/lang/String;", "getKeyColor", "getIconImage", "Ljava/lang/Boolean;", "getOver18", "getUserIsBanned", "getUserIsModerator", "getUserIsSubscriber", "getDisplayName", "getDisplayNamePrefixed", "getPrimaryKeyColor", "getBannerBackgroundImageUrl", "getCommunityIconUrl", "getPublicDescription", "Ljava/lang/Long;", "getSubscribers", "getSubredditType", "I", "getCoins", "()I", "getSubredditTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditDetail implements Parcelable
{
    public static final Parcelable$Creator<SubredditDetail> CREATOR;
    private final String bannerBackgroundImageUrl;
    private final int coins;
    private final String communityIconUrl;
    private final String displayName;
    private final String displayNamePrefixed;
    private final String iconImage;
    private final Boolean isTitleSafe;
    private final String keyColor;
    private final String kindWithId;
    private final Boolean over18;
    private final String primaryKeyColor;
    private final String publicDescription;
    private final String subredditTitle;
    private final String subredditType;
    private final Long subscribers;
    private final Boolean userIsBanned;
    private final Boolean userIsModerator;
    private final Boolean userIsSubscriber;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SubredditDetail(@n(name = "name") final String kindWithId, @n(name = "key_color") final String keyColor, @n(name = "icon_img") final String iconImage, @n(name = "over_18") final Boolean over18, @n(name = "user_is_banned") final Boolean userIsBanned, @n(name = "user_is_moderator") final Boolean userIsModerator, @n(name = "user_is_subscriber") final Boolean userIsSubscriber, @n(name = "display_name") final String displayName, @n(name = "display_name_prefixed") final String displayNamePrefixed, @n(name = "primary_color") final String primaryKeyColor, @n(name = "banner_img") final String bannerBackgroundImageUrl, @n(name = "community_icon") final String communityIconUrl, @n(name = "public_description") final String publicDescription, @n(name = "subscribers") final Long subscribers, @n(name = "subreddit_type") final String subredditType, @n(name = "coins") final int coins, @n(name = "title") final String subredditTitle, @n(name = "isTitleSafe") final Boolean isTitleSafe) {
        m.y(displayName, "displayName", displayNamePrefixed, "displayNamePrefixed", subredditTitle, "subredditTitle");
        this.kindWithId = kindWithId;
        this.keyColor = keyColor;
        this.iconImage = iconImage;
        this.over18 = over18;
        this.userIsBanned = userIsBanned;
        this.userIsModerator = userIsModerator;
        this.userIsSubscriber = userIsSubscriber;
        this.displayName = displayName;
        this.displayNamePrefixed = displayNamePrefixed;
        this.primaryKeyColor = primaryKeyColor;
        this.bannerBackgroundImageUrl = bannerBackgroundImageUrl;
        this.communityIconUrl = communityIconUrl;
        this.publicDescription = publicDescription;
        this.subscribers = subscribers;
        this.subredditType = subredditType;
        this.coins = coins;
        this.subredditTitle = subredditTitle;
        this.isTitleSafe = isTitleSafe;
    }
    
    public final String component1() {
        return this.kindWithId;
    }
    
    public final String component10() {
        return this.primaryKeyColor;
    }
    
    public final String component11() {
        return this.bannerBackgroundImageUrl;
    }
    
    public final String component12() {
        return this.communityIconUrl;
    }
    
    public final String component13() {
        return this.publicDescription;
    }
    
    public final Long component14() {
        return this.subscribers;
    }
    
    public final String component15() {
        return this.subredditType;
    }
    
    public final int component16() {
        return this.coins;
    }
    
    public final String component17() {
        return this.subredditTitle;
    }
    
    public final Boolean component18() {
        return this.isTitleSafe;
    }
    
    public final String component2() {
        return this.keyColor;
    }
    
    public final String component3() {
        return this.iconImage;
    }
    
    public final Boolean component4() {
        return this.over18;
    }
    
    public final Boolean component5() {
        return this.userIsBanned;
    }
    
    public final Boolean component6() {
        return this.userIsModerator;
    }
    
    public final Boolean component7() {
        return this.userIsSubscriber;
    }
    
    public final String component8() {
        return this.displayName;
    }
    
    public final String component9() {
        return this.displayNamePrefixed;
    }
    
    public final SubredditDetail copy(@n(name = "name") final String s, @n(name = "key_color") final String s2, @n(name = "icon_img") final String s3, @n(name = "over_18") final Boolean b, @n(name = "user_is_banned") final Boolean b2, @n(name = "user_is_moderator") final Boolean b3, @n(name = "user_is_subscriber") final Boolean b4, @n(name = "display_name") final String s4, @n(name = "display_name_prefixed") final String s5, @n(name = "primary_color") final String s6, @n(name = "banner_img") final String s7, @n(name = "community_icon") final String s8, @n(name = "public_description") final String s9, @n(name = "subscribers") final Long n, @n(name = "subreddit_type") final String s10, @n(name = "coins") final int n2, @n(name = "title") final String s11, @n(name = "isTitleSafe") final Boolean b5) {
        f.f((Object)s4, "displayName");
        f.f((Object)s5, "displayNamePrefixed");
        f.f((Object)s11, "subredditTitle");
        return new SubredditDetail(s, s2, s3, b, b2, b3, b4, s4, s5, s6, s7, s8, s9, n, s10, n2, s11, b5);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditDetail)) {
            return false;
        }
        final SubredditDetail subredditDetail = (SubredditDetail)o;
        return f.a((Object)this.kindWithId, (Object)subredditDetail.kindWithId) && f.a((Object)this.keyColor, (Object)subredditDetail.keyColor) && f.a((Object)this.iconImage, (Object)subredditDetail.iconImage) && f.a((Object)this.over18, (Object)subredditDetail.over18) && f.a((Object)this.userIsBanned, (Object)subredditDetail.userIsBanned) && f.a((Object)this.userIsModerator, (Object)subredditDetail.userIsModerator) && f.a((Object)this.userIsSubscriber, (Object)subredditDetail.userIsSubscriber) && f.a((Object)this.displayName, (Object)subredditDetail.displayName) && f.a((Object)this.displayNamePrefixed, (Object)subredditDetail.displayNamePrefixed) && f.a((Object)this.primaryKeyColor, (Object)subredditDetail.primaryKeyColor) && f.a((Object)this.bannerBackgroundImageUrl, (Object)subredditDetail.bannerBackgroundImageUrl) && f.a((Object)this.communityIconUrl, (Object)subredditDetail.communityIconUrl) && f.a((Object)this.publicDescription, (Object)subredditDetail.publicDescription) && f.a((Object)this.subscribers, (Object)subredditDetail.subscribers) && f.a((Object)this.subredditType, (Object)subredditDetail.subredditType) && this.coins == subredditDetail.coins && f.a((Object)this.subredditTitle, (Object)subredditDetail.subredditTitle) && f.a((Object)this.isTitleSafe, (Object)subredditDetail.isTitleSafe);
    }
    
    public final String getBannerBackgroundImageUrl() {
        return this.bannerBackgroundImageUrl;
    }
    
    public final int getCoins() {
        return this.coins;
    }
    
    public final String getCommunityIconUrl() {
        return this.communityIconUrl;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getDisplayNamePrefixed() {
        return this.displayNamePrefixed;
    }
    
    public final String getIconImage() {
        return this.iconImage;
    }
    
    public final String getKeyColor() {
        return this.keyColor;
    }
    
    public final String getKindWithId() {
        return this.kindWithId;
    }
    
    public final Boolean getOver18() {
        return this.over18;
    }
    
    public final String getPrimaryKeyColor() {
        return this.primaryKeyColor;
    }
    
    public final String getPublicDescription() {
        return this.publicDescription;
    }
    
    public final String getSubredditTitle() {
        return this.subredditTitle;
    }
    
    public final String getSubredditType() {
        return this.subredditType;
    }
    
    public final Long getSubscribers() {
        return this.subscribers;
    }
    
    public final Boolean getUserIsBanned() {
        return this.userIsBanned;
    }
    
    public final Boolean getUserIsModerator() {
        return this.userIsModerator;
    }
    
    public final Boolean getUserIsSubscriber() {
        return this.userIsSubscriber;
    }
    
    @Override
    public int hashCode() {
        final String kindWithId = this.kindWithId;
        final int n = 0;
        int hashCode;
        if (kindWithId == null) {
            hashCode = 0;
        }
        else {
            hashCode = kindWithId.hashCode();
        }
        final String keyColor = this.keyColor;
        int hashCode2;
        if (keyColor == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = keyColor.hashCode();
        }
        final String iconImage = this.iconImage;
        int hashCode3;
        if (iconImage == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = iconImage.hashCode();
        }
        final Boolean over18 = this.over18;
        int hashCode4;
        if (over18 == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = over18.hashCode();
        }
        final Boolean userIsBanned = this.userIsBanned;
        int hashCode5;
        if (userIsBanned == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = userIsBanned.hashCode();
        }
        final Boolean userIsModerator = this.userIsModerator;
        int hashCode6;
        if (userIsModerator == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = userIsModerator.hashCode();
        }
        final Boolean userIsSubscriber = this.userIsSubscriber;
        int hashCode7;
        if (userIsSubscriber == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = userIsSubscriber.hashCode();
        }
        final int f = a.f(this.displayNamePrefixed, a.f(this.displayName, ((((((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31, 31), 31);
        final String primaryKeyColor = this.primaryKeyColor;
        int hashCode8;
        if (primaryKeyColor == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = primaryKeyColor.hashCode();
        }
        final String bannerBackgroundImageUrl = this.bannerBackgroundImageUrl;
        int hashCode9;
        if (bannerBackgroundImageUrl == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = bannerBackgroundImageUrl.hashCode();
        }
        final String communityIconUrl = this.communityIconUrl;
        int hashCode10;
        if (communityIconUrl == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = communityIconUrl.hashCode();
        }
        final String publicDescription = this.publicDescription;
        int hashCode11;
        if (publicDescription == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = publicDescription.hashCode();
        }
        final Long subscribers = this.subscribers;
        int hashCode12;
        if (subscribers == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = subscribers.hashCode();
        }
        final String subredditType = this.subredditType;
        int hashCode13;
        if (subredditType == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = subredditType.hashCode();
        }
        final int f2 = a.f(this.subredditTitle, s0.e(this.coins, ((((((f + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31, 31), 31);
        final Boolean isTitleSafe = this.isTitleSafe;
        int hashCode14;
        if (isTitleSafe == null) {
            hashCode14 = n;
        }
        else {
            hashCode14 = isTitleSafe.hashCode();
        }
        return f2 + hashCode14;
    }
    
    public final Boolean isTitleSafe() {
        return this.isTitleSafe;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditDetail(kindWithId=");
        k.append(this.kindWithId);
        k.append(", keyColor=");
        k.append(this.keyColor);
        k.append(", iconImage=");
        k.append(this.iconImage);
        k.append(", over18=");
        k.append(this.over18);
        k.append(", userIsBanned=");
        k.append(this.userIsBanned);
        k.append(", userIsModerator=");
        k.append(this.userIsModerator);
        k.append(", userIsSubscriber=");
        k.append(this.userIsSubscriber);
        k.append(", displayName=");
        k.append(this.displayName);
        k.append(", displayNamePrefixed=");
        k.append(this.displayNamePrefixed);
        k.append(", primaryKeyColor=");
        k.append(this.primaryKeyColor);
        k.append(", bannerBackgroundImageUrl=");
        k.append(this.bannerBackgroundImageUrl);
        k.append(", communityIconUrl=");
        k.append(this.communityIconUrl);
        k.append(", publicDescription=");
        k.append(this.publicDescription);
        k.append(", subscribers=");
        k.append(this.subscribers);
        k.append(", subredditType=");
        k.append(this.subredditType);
        k.append(", coins=");
        k.append(this.coins);
        k.append(", subredditTitle=");
        k.append(this.subredditTitle);
        k.append(", isTitleSafe=");
        return d.m(k, this.isTitleSafe, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.kindWithId);
        parcel.writeString(this.keyColor);
        parcel.writeString(this.iconImage);
        final Boolean over18 = this.over18;
        if (over18 == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, over18);
        }
        final Boolean userIsBanned = this.userIsBanned;
        if (userIsBanned == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userIsBanned);
        }
        final Boolean userIsModerator = this.userIsModerator;
        if (userIsModerator == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userIsModerator);
        }
        final Boolean userIsSubscriber = this.userIsSubscriber;
        if (userIsSubscriber == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userIsSubscriber);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayNamePrefixed);
        parcel.writeString(this.primaryKeyColor);
        parcel.writeString(this.bannerBackgroundImageUrl);
        parcel.writeString(this.communityIconUrl);
        parcel.writeString(this.publicDescription);
        final Long subscribers = this.subscribers;
        if (subscribers == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, subscribers);
        }
        parcel.writeString(this.subredditType);
        parcel.writeInt(this.coins);
        parcel.writeString(this.subredditTitle);
        final Boolean isTitleSafe = this.isTitleSafe;
        if (isTitleSafe == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, isTitleSafe);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SubredditDetail>
    {
        public final SubredditDetail createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            final boolean b = true;
            Boolean value;
            if (int1 == 0) {
                value = null;
            }
            else {
                value = (parcel.readInt() != 0);
            }
            Boolean value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = (parcel.readInt() != 0);
            }
            Boolean value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = (parcel.readInt() != 0);
            }
            Boolean value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = (parcel.readInt() != 0);
            }
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            final String string6 = parcel.readString();
            final String string7 = parcel.readString();
            final String string8 = parcel.readString();
            final String string9 = parcel.readString();
            Long value5;
            if (parcel.readInt() == 0) {
                value5 = null;
            }
            else {
                value5 = parcel.readLong();
            }
            final String string10 = parcel.readString();
            final int int2 = parcel.readInt();
            final String string11 = parcel.readString();
            Boolean value6;
            if (parcel.readInt() == 0) {
                value6 = null;
            }
            else {
                value6 = (parcel.readInt() != 0 && b);
            }
            return new SubredditDetail(string, string2, string3, value, value2, value3, value4, string4, string5, string6, string7, string8, string9, value5, string10, int2, string11, value6);
        }
        
        public final SubredditDetail[] newArray(final int n) {
            return new SubredditDetail[n];
        }
    }
}
