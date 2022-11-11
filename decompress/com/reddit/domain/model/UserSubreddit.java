// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.Iterator;
import android.os.Parcel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.squareup.moshi.n;
import com.reddit.common.size.MediaSize;
import com.reddit.common.subreddit.SubredditPostType;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0002\u0012\b\b\u0003\u0010$\u001a\u00020\u0003\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010'\u001a\u00020\u0003\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010)\u001a\u00020\u0003\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010+\u001a\u00020\u0003\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010-\u001a\u00020\u0006\u0012\b\b\u0003\u0010.\u001a\u00020\u0003\u0012\b\b\u0003\u0010/\u001a\u00020\u0003\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0003\u00101\u001a\u00020\u0006\u0012\b\b\u0003\u00102\u001a\u00020\u0003\u0012\b\b\u0003\u00103\u001a\u00020\u0006\u0012\b\b\u0003\u00104\u001a\u00020\u0003\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u00106\u001a\u00020\u0003\u0012\b\b\u0003\u00107\u001a\u00020\u0003\u0012\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u00109\u001a\u00020\u0006\u0012\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\bk\u0010lJ\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\n\u0010\bJ\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u000e\u0010\bJ\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0019\u0010\bJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u001c\u0010\bJ\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u00c6\u0003J¦\u0002\u0010=\u001a\u00020\u00002\b\b\u0003\u0010$\u001a\u00020\u00032\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010'\u001a\u00020\u00032\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010)\u001a\u00020\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010+\u001a\u00020\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010-\u001a\u00020\u00062\b\b\u0003\u0010.\u001a\u00020\u00032\b\b\u0003\u0010/\u001a\u00020\u00032\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u00101\u001a\u00020\u00062\b\b\u0003\u00102\u001a\u00020\u00032\b\b\u0003\u00103\u001a\u00020\u00062\b\b\u0003\u00104\u001a\u00020\u00032\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u00106\u001a\u00020\u00032\b\b\u0003\u00107\u001a\u00020\u00032\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u00109\u001a\u00020\u00062\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u00c6\u0001¢\u0006\u0004\b=\u0010>J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001J\t\u0010@\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010C\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010AH\u00d6\u0003J\t\u0010D\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010I\u001a\u00020H2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0012H\u00d6\u0001R\u001a\u0010$\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010%\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b%\u0010J\u001a\u0004\bM\u0010LR\u0019\u0010&\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010N\u001a\u0004\bO\u0010\bR\u0017\u0010'\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010J\u001a\u0004\bP\u0010LR\u0019\u0010(\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010N\u001a\u0004\bQ\u0010\bR\u0017\u0010)\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010J\u001a\u0004\bR\u0010LR\u0019\u0010*\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b*\u0010J\u001a\u0004\bS\u0010LR\u0017\u0010+\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\bT\u0010LR\u0019\u0010,\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010N\u001a\u0004\bU\u0010\bR\u0017\u0010-\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010.\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010J\u001a\u0004\bY\u0010LR\u0017\u0010/\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u0010J\u001a\u0004\bZ\u0010LR\u0019\u00100\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b0\u0010[\u001a\u0004\b\\\u0010\u0014R\u0017\u00101\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010V\u001a\u0004\b1\u0010XR\u0017\u00102\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u0010J\u001a\u0004\b]\u0010LR\u0017\u00103\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010V\u001a\u0004\b3\u0010XR\u0017\u00104\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u0010J\u001a\u0004\b^\u0010LR\u0019\u00105\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\b_\u0010\bR\u0017\u00106\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u0010J\u001a\u0004\b`\u0010LR\u0017\u00107\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u0010J\u001a\u0004\ba\u0010LR\u0019\u00108\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u0010N\u001a\u0004\bb\u0010\bR\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010V\u001a\u0004\bc\u0010XR\u0019\u0010:\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b:\u0010d\u001a\u0004\be\u0010fR\u0019\u0010;\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b;\u0010d\u001a\u0004\bg\u0010fR\u001f\u0010<\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b<\u0010h\u001a\u0004\bi\u0010j¨\u0006m" }, d2 = { "Lcom/reddit/domain/model/UserSubreddit;", "Lcom/reddit/domain/model/RedditModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "Lcom/reddit/common/size/MediaSize;", "component23", "component24", "", "Lcom/reddit/common/subreddit/SubredditPostType;", "component25", "kindWithId", "bannerImg", "userIsBanned", "description", "userIsMuted", "displayName", "headerImg", "title", "userIsModerator", "over18", "iconImg", "displayNamePrefixed", "subscribers", "isDefaultIcon", "keyColor", "isDefaultBanner", "url", "userIsContributor", "publicDescription", "subredditType", "userIsSubscriber", "showInDefaultSubreddits", "iconSize", "bannerSize", "allowedPostTypes", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/reddit/common/size/MediaSize;Lcom/reddit/common/size/MediaSize;Ljava/util/List;)Lcom/reddit/domain/model/UserSubreddit;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getKindWithId", "()Ljava/lang/String;", "getBannerImg", "Ljava/lang/Boolean;", "getUserIsBanned", "getDescription", "getUserIsMuted", "getDisplayName", "getHeaderImg", "getTitle", "getUserIsModerator", "Z", "getOver18", "()Z", "getIconImg", "getDisplayNamePrefixed", "Ljava/lang/Integer;", "getSubscribers", "getKeyColor", "getUrl", "getUserIsContributor", "getPublicDescription", "getSubredditType", "getUserIsSubscriber", "getShowInDefaultSubreddits", "Lcom/reddit/common/size/MediaSize;", "getIconSize", "()Lcom/reddit/common/size/MediaSize;", "getBannerSize", "Ljava/util/List;", "getAllowedPostTypes", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/reddit/common/size/MediaSize;Lcom/reddit/common/size/MediaSize;Ljava/util/List;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserSubreddit implements RedditModel, Parcelable
{
    public static final Parcelable$Creator<UserSubreddit> CREATOR;
    private final List<SubredditPostType> allowedPostTypes;
    private final String bannerImg;
    private final MediaSize bannerSize;
    private final String description;
    private final String displayName;
    private final String displayNamePrefixed;
    private final String headerImg;
    private final String iconImg;
    private final MediaSize iconSize;
    private final boolean isDefaultBanner;
    private final boolean isDefaultIcon;
    private final String keyColor;
    private final String kindWithId;
    private final boolean over18;
    private final String publicDescription;
    private final boolean showInDefaultSubreddits;
    private final String subredditType;
    private final Integer subscribers;
    private final String title;
    private final String url;
    private final Boolean userIsBanned;
    private final Boolean userIsContributor;
    private final Boolean userIsModerator;
    private final Boolean userIsMuted;
    private final Boolean userIsSubscriber;
    
    static {
        CREATOR = (Parcelable$Creator)new UserSubreddit$Creator();
    }
    
    public UserSubreddit(@n(name = "name") final String kindWithId, @n(name = "banner_img") final String bannerImg, @n(name = "user_is_banned") final Boolean userIsBanned, @n(name = "description") final String description, @n(name = "user_is_muted") final Boolean userIsMuted, @n(name = "display_name") final String displayName, @n(name = "header_img") final String headerImg, @n(name = "title") final String title, @n(name = "user_is_moderator") final Boolean userIsModerator, @n(name = "over_18") final boolean over18, @n(name = "icon_img") final String iconImg, @n(name = "display_name_prefixed") final String displayNamePrefixed, @n(name = "subscribers") final Integer subscribers, @n(name = "is_default_icon") final boolean isDefaultIcon, @n(name = "key_color") final String keyColor, @n(name = "is_default_banner") final boolean isDefaultBanner, @n(name = "url") final String url, @n(name = "user_is_contributor") final Boolean userIsContributor, @n(name = "public_description") final String publicDescription, @n(name = "subreddit_type") final String subredditType, @n(name = "user_is_subscriber") final Boolean userIsSubscriber, @n(name = "default_set") final boolean showInDefaultSubreddits, @n(name = "icon_size") final MediaSize iconSize, @n(name = "banner_size") final MediaSize bannerSize, final List<? extends SubredditPostType> allowedPostTypes) {
        e.f((Object)kindWithId, "kindWithId");
        e.f((Object)description, "description");
        e.f((Object)displayName, "displayName");
        e.f((Object)title, "title");
        e.f((Object)iconImg, "iconImg");
        e.f((Object)displayNamePrefixed, "displayNamePrefixed");
        e.f((Object)keyColor, "keyColor");
        e.f((Object)url, "url");
        e.f((Object)publicDescription, "publicDescription");
        e.f((Object)subredditType, "subredditType");
        this.kindWithId = kindWithId;
        this.bannerImg = bannerImg;
        this.userIsBanned = userIsBanned;
        this.description = description;
        this.userIsMuted = userIsMuted;
        this.displayName = displayName;
        this.headerImg = headerImg;
        this.title = title;
        this.userIsModerator = userIsModerator;
        this.over18 = over18;
        this.iconImg = iconImg;
        this.displayNamePrefixed = displayNamePrefixed;
        this.subscribers = subscribers;
        this.isDefaultIcon = isDefaultIcon;
        this.keyColor = keyColor;
        this.isDefaultBanner = isDefaultBanner;
        this.url = url;
        this.userIsContributor = userIsContributor;
        this.publicDescription = publicDescription;
        this.subredditType = subredditType;
        this.userIsSubscriber = userIsSubscriber;
        this.showInDefaultSubreddits = showInDefaultSubreddits;
        this.iconSize = iconSize;
        this.bannerSize = bannerSize;
        this.allowedPostTypes = (List<SubredditPostType>)allowedPostTypes;
    }
    
    public final String component1() {
        return this.getKindWithId();
    }
    
    public final boolean component10() {
        return this.over18;
    }
    
    public final String component11() {
        return this.iconImg;
    }
    
    public final String component12() {
        return this.displayNamePrefixed;
    }
    
    public final Integer component13() {
        return this.subscribers;
    }
    
    public final boolean component14() {
        return this.isDefaultIcon;
    }
    
    public final String component15() {
        return this.keyColor;
    }
    
    public final boolean component16() {
        return this.isDefaultBanner;
    }
    
    public final String component17() {
        return this.url;
    }
    
    public final Boolean component18() {
        return this.userIsContributor;
    }
    
    public final String component19() {
        return this.publicDescription;
    }
    
    public final String component2() {
        return this.bannerImg;
    }
    
    public final String component20() {
        return this.subredditType;
    }
    
    public final Boolean component21() {
        return this.userIsSubscriber;
    }
    
    public final boolean component22() {
        return this.showInDefaultSubreddits;
    }
    
    public final MediaSize component23() {
        return this.iconSize;
    }
    
    public final MediaSize component24() {
        return this.bannerSize;
    }
    
    public final List<SubredditPostType> component25() {
        return this.allowedPostTypes;
    }
    
    public final Boolean component3() {
        return this.userIsBanned;
    }
    
    public final String component4() {
        return this.description;
    }
    
    public final Boolean component5() {
        return this.userIsMuted;
    }
    
    public final String component6() {
        return this.displayName;
    }
    
    public final String component7() {
        return this.headerImg;
    }
    
    public final String component8() {
        return this.title;
    }
    
    public final Boolean component9() {
        return this.userIsModerator;
    }
    
    public final UserSubreddit copy(@n(name = "name") final String s, @n(name = "banner_img") final String s2, @n(name = "user_is_banned") final Boolean b, @n(name = "description") final String s3, @n(name = "user_is_muted") final Boolean b2, @n(name = "display_name") final String s4, @n(name = "header_img") final String s5, @n(name = "title") final String s6, @n(name = "user_is_moderator") final Boolean b3, @n(name = "over_18") final boolean b4, @n(name = "icon_img") final String s7, @n(name = "display_name_prefixed") final String s8, @n(name = "subscribers") final Integer n, @n(name = "is_default_icon") final boolean b5, @n(name = "key_color") final String s9, @n(name = "is_default_banner") final boolean b6, @n(name = "url") final String s10, @n(name = "user_is_contributor") final Boolean b7, @n(name = "public_description") final String s11, @n(name = "subreddit_type") final String s12, @n(name = "user_is_subscriber") final Boolean b8, @n(name = "default_set") final boolean b9, @n(name = "icon_size") final MediaSize mediaSize, @n(name = "banner_size") final MediaSize mediaSize2, final List<? extends SubredditPostType> list) {
        e.f((Object)s, "kindWithId");
        e.f((Object)s3, "description");
        e.f((Object)s4, "displayName");
        e.f((Object)s6, "title");
        e.f((Object)s7, "iconImg");
        e.f((Object)s8, "displayNamePrefixed");
        e.f((Object)s9, "keyColor");
        e.f((Object)s10, "url");
        e.f((Object)s11, "publicDescription");
        e.f((Object)s12, "subredditType");
        return new UserSubreddit(s, s2, b, s3, b2, s4, s5, s6, b3, b4, s7, s8, n, b5, s9, b6, s10, b7, s11, s12, b8, b9, mediaSize, mediaSize2, list);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserSubreddit)) {
            return false;
        }
        final UserSubreddit userSubreddit = (UserSubreddit)o;
        return e.a((Object)this.getKindWithId(), (Object)userSubreddit.getKindWithId()) && e.a((Object)this.bannerImg, (Object)userSubreddit.bannerImg) && e.a((Object)this.userIsBanned, (Object)userSubreddit.userIsBanned) && e.a((Object)this.description, (Object)userSubreddit.description) && e.a((Object)this.userIsMuted, (Object)userSubreddit.userIsMuted) && e.a((Object)this.displayName, (Object)userSubreddit.displayName) && e.a((Object)this.headerImg, (Object)userSubreddit.headerImg) && e.a((Object)this.title, (Object)userSubreddit.title) && e.a((Object)this.userIsModerator, (Object)userSubreddit.userIsModerator) && this.over18 == userSubreddit.over18 && e.a((Object)this.iconImg, (Object)userSubreddit.iconImg) && e.a((Object)this.displayNamePrefixed, (Object)userSubreddit.displayNamePrefixed) && e.a((Object)this.subscribers, (Object)userSubreddit.subscribers) && this.isDefaultIcon == userSubreddit.isDefaultIcon && e.a((Object)this.keyColor, (Object)userSubreddit.keyColor) && this.isDefaultBanner == userSubreddit.isDefaultBanner && e.a((Object)this.url, (Object)userSubreddit.url) && e.a((Object)this.userIsContributor, (Object)userSubreddit.userIsContributor) && e.a((Object)this.publicDescription, (Object)userSubreddit.publicDescription) && e.a((Object)this.subredditType, (Object)userSubreddit.subredditType) && e.a((Object)this.userIsSubscriber, (Object)userSubreddit.userIsSubscriber) && this.showInDefaultSubreddits == userSubreddit.showInDefaultSubreddits && e.a((Object)this.iconSize, (Object)userSubreddit.iconSize) && e.a((Object)this.bannerSize, (Object)userSubreddit.bannerSize) && e.a((Object)this.allowedPostTypes, (Object)userSubreddit.allowedPostTypes);
    }
    
    public final List<SubredditPostType> getAllowedPostTypes() {
        return this.allowedPostTypes;
    }
    
    public final String getBannerImg() {
        return this.bannerImg;
    }
    
    public final MediaSize getBannerSize() {
        return this.bannerSize;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getDisplayNamePrefixed() {
        return this.displayNamePrefixed;
    }
    
    public final String getHeaderImg() {
        return this.headerImg;
    }
    
    public final String getIconImg() {
        return this.iconImg;
    }
    
    public final MediaSize getIconSize() {
        return this.iconSize;
    }
    
    public final String getKeyColor() {
        return this.keyColor;
    }
    
    @Override
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public final boolean getOver18() {
        return this.over18;
    }
    
    public final String getPublicDescription() {
        return this.publicDescription;
    }
    
    public final boolean getShowInDefaultSubreddits() {
        return this.showInDefaultSubreddits;
    }
    
    public final String getSubredditType() {
        return this.subredditType;
    }
    
    public final Integer getSubscribers() {
        return this.subscribers;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    public final Boolean getUserIsBanned() {
        return this.userIsBanned;
    }
    
    public final Boolean getUserIsContributor() {
        return this.userIsContributor;
    }
    
    public final Boolean getUserIsModerator() {
        return this.userIsModerator;
    }
    
    public final Boolean getUserIsMuted() {
        return this.userIsMuted;
    }
    
    public final Boolean getUserIsSubscriber() {
        return this.userIsSubscriber;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.getKindWithId().hashCode();
        final String bannerImg = this.bannerImg;
        int hashCode2 = 0;
        int hashCode3;
        if (bannerImg == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = bannerImg.hashCode();
        }
        final Boolean userIsBanned = this.userIsBanned;
        int hashCode4;
        if (userIsBanned == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = userIsBanned.hashCode();
        }
        final int c = b.c(this.description, ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31, 31);
        final Boolean userIsMuted = this.userIsMuted;
        int hashCode5;
        if (userIsMuted == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = userIsMuted.hashCode();
        }
        final int c2 = b.c(this.displayName, (c + hashCode5) * 31, 31);
        final String headerImg = this.headerImg;
        int hashCode6;
        if (headerImg == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = headerImg.hashCode();
        }
        final int c3 = b.c(this.title, (c2 + hashCode6) * 31, 31);
        final Boolean userIsModerator = this.userIsModerator;
        int hashCode7;
        if (userIsModerator == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = userIsModerator.hashCode();
        }
        final int over18 = this.over18 ? 1 : 0;
        final int n = 1;
        int n2 = over18;
        if (over18 != 0) {
            n2 = 1;
        }
        final int c4 = b.c(this.displayNamePrefixed, b.c(this.iconImg, ((c3 + hashCode7) * 31 + n2) * 31, 31), 31);
        final Integer subscribers = this.subscribers;
        int hashCode8;
        if (subscribers == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = subscribers.hashCode();
        }
        int isDefaultIcon;
        if ((isDefaultIcon = (this.isDefaultIcon ? 1 : 0)) != 0) {
            isDefaultIcon = 1;
        }
        final int c5 = b.c(this.keyColor, ((c4 + hashCode8) * 31 + isDefaultIcon) * 31, 31);
        int isDefaultBanner;
        if ((isDefaultBanner = (this.isDefaultBanner ? 1 : 0)) != 0) {
            isDefaultBanner = 1;
        }
        final int c6 = b.c(this.url, (c5 + isDefaultBanner) * 31, 31);
        final Boolean userIsContributor = this.userIsContributor;
        int hashCode9;
        if (userIsContributor == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = userIsContributor.hashCode();
        }
        final int c7 = b.c(this.subredditType, b.c(this.publicDescription, (c6 + hashCode9) * 31, 31), 31);
        final Boolean userIsSubscriber = this.userIsSubscriber;
        int hashCode10;
        if (userIsSubscriber == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = userIsSubscriber.hashCode();
        }
        int showInDefaultSubreddits = this.showInDefaultSubreddits ? 1 : 0;
        if (showInDefaultSubreddits != 0) {
            showInDefaultSubreddits = n;
        }
        final MediaSize iconSize = this.iconSize;
        int hashCode11;
        if (iconSize == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = iconSize.hashCode();
        }
        final MediaSize bannerSize = this.bannerSize;
        int hashCode12;
        if (bannerSize == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = bannerSize.hashCode();
        }
        final List<SubredditPostType> allowedPostTypes = this.allowedPostTypes;
        if (allowedPostTypes != null) {
            hashCode2 = allowedPostTypes.hashCode();
        }
        return ((((c7 + hashCode10) * 31 + showInDefaultSubreddits) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode2;
    }
    
    public final boolean isDefaultBanner() {
        return this.isDefaultBanner;
    }
    
    public final boolean isDefaultIcon() {
        return this.isDefaultIcon;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("UserSubreddit(kindWithId=");
        r.append(this.getKindWithId());
        r.append(", bannerImg=");
        r.append(this.bannerImg);
        r.append(", userIsBanned=");
        r.append(this.userIsBanned);
        r.append(", description=");
        r.append(this.description);
        r.append(", userIsMuted=");
        r.append(this.userIsMuted);
        r.append(", displayName=");
        r.append(this.displayName);
        r.append(", headerImg=");
        r.append(this.headerImg);
        r.append(", title=");
        r.append(this.title);
        r.append(", userIsModerator=");
        r.append(this.userIsModerator);
        r.append(", over18=");
        r.append(this.over18);
        r.append(", iconImg=");
        r.append(this.iconImg);
        r.append(", displayNamePrefixed=");
        r.append(this.displayNamePrefixed);
        r.append(", subscribers=");
        r.append(this.subscribers);
        r.append(", isDefaultIcon=");
        r.append(this.isDefaultIcon);
        r.append(", keyColor=");
        r.append(this.keyColor);
        r.append(", isDefaultBanner=");
        r.append(this.isDefaultBanner);
        r.append(", url=");
        r.append(this.url);
        r.append(", userIsContributor=");
        r.append(this.userIsContributor);
        r.append(", publicDescription=");
        r.append(this.publicDescription);
        r.append(", subredditType=");
        r.append(this.subredditType);
        r.append(", userIsSubscriber=");
        r.append(this.userIsSubscriber);
        r.append(", showInDefaultSubreddits=");
        r.append(this.showInDefaultSubreddits);
        r.append(", iconSize=");
        r.append(this.iconSize);
        r.append(", bannerSize=");
        r.append(this.bannerSize);
        r.append(", allowedPostTypes=");
        return d.o(r, (List)this.allowedPostTypes, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.kindWithId);
        parcel.writeString(this.bannerImg);
        final Boolean userIsBanned = this.userIsBanned;
        if (userIsBanned == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, userIsBanned);
        }
        parcel.writeString(this.description);
        final Boolean userIsMuted = this.userIsMuted;
        if (userIsMuted == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, userIsMuted);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.headerImg);
        parcel.writeString(this.title);
        final Boolean userIsModerator = this.userIsModerator;
        if (userIsModerator == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, userIsModerator);
        }
        parcel.writeInt((int)(this.over18 ? 1 : 0));
        parcel.writeString(this.iconImg);
        parcel.writeString(this.displayNamePrefixed);
        final Integer subscribers = this.subscribers;
        if (subscribers == null) {
            parcel.writeInt(0);
        }
        else {
            b.l(parcel, 1, subscribers);
        }
        parcel.writeInt((int)(this.isDefaultIcon ? 1 : 0));
        parcel.writeString(this.keyColor);
        parcel.writeInt((int)(this.isDefaultBanner ? 1 : 0));
        parcel.writeString(this.url);
        final Boolean userIsContributor = this.userIsContributor;
        if (userIsContributor == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, userIsContributor);
        }
        parcel.writeString(this.publicDescription);
        parcel.writeString(this.subredditType);
        final Boolean userIsSubscriber = this.userIsSubscriber;
        if (userIsSubscriber == null) {
            parcel.writeInt(0);
        }
        else {
            al0.b.o(parcel, 1, userIsSubscriber);
        }
        parcel.writeInt((int)(this.showInDefaultSubreddits ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.iconSize, n);
        parcel.writeParcelable((Parcelable)this.bannerSize, n);
        final List<SubredditPostType> allowedPostTypes = this.allowedPostTypes;
        if (allowedPostTypes == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator t = d.t(parcel, 1, (List)allowedPostTypes);
            while (t.hasNext()) {
                parcel.writeString(((Enum)t.next()).name());
            }
        }
    }
}
