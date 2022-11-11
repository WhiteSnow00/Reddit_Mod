// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.g7;
import cj2.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0002\u0010\u0012J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\rH\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003J\t\u0010,\u001a\u00020\rH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u009d\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u00c6\u0001J\u0013\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u000209H\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u0006;" }, d2 = { "Lcom/reddit/domain/model/SubredditListItem;", "", "id", "", "kindWithId", "displayName", "displayNamePrefixed", "primaryColorKey", "keyColor", "communityIconUrl", "iconImg", "subredditType", "userHasFavorited", "", "over18", "userIsSubscriber", "userIsModerator", "isMyReddit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "communityIcon", "getCommunityIcon", "()Ljava/lang/String;", "getCommunityIconUrl", "getDisplayName", "getDisplayNamePrefixed", "getIconImg", "getId", "()Z", "isUser", "getKeyColor", "getKindWithId", "getOver18", "primaryColor", "getPrimaryColor", "getPrimaryColorKey", "getSubredditType", "getUserHasFavorited", "getUserIsModerator", "getUserIsSubscriber", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditListItem
{
    private final String communityIconUrl;
    private final String displayName;
    private final String displayNamePrefixed;
    private final String iconImg;
    private final String id;
    private final boolean isMyReddit;
    private final boolean isUser;
    private final String keyColor;
    private final String kindWithId;
    private final boolean over18;
    private final String primaryColorKey;
    private final String subredditType;
    private final boolean userHasFavorited;
    private final boolean userIsModerator;
    private final boolean userIsSubscriber;
    
    public SubredditListItem(final String id, final String kindWithId, final String displayName, final String displayNamePrefixed, final String primaryColorKey, final String keyColor, final String communityIconUrl, final String iconImg, final String subredditType, final boolean userHasFavorited, final boolean over18, final boolean userIsSubscriber, final boolean userIsModerator, final boolean isMyReddit) {
        d.y(id, "id", kindWithId, "kindWithId", displayName, "displayName", displayNamePrefixed, "displayNamePrefixed", subredditType, "subredditType");
        this.id = id;
        this.kindWithId = kindWithId;
        this.displayName = displayName;
        this.displayNamePrefixed = displayNamePrefixed;
        this.primaryColorKey = primaryColorKey;
        this.keyColor = keyColor;
        this.communityIconUrl = communityIconUrl;
        this.iconImg = iconImg;
        this.subredditType = subredditType;
        this.userHasFavorited = userHasFavorited;
        this.over18 = over18;
        this.userIsSubscriber = userIsSubscriber;
        this.userIsModerator = userIsModerator;
        this.isMyReddit = isMyReddit;
        this.isUser = e.a((Object)subredditType, (Object)"user");
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final boolean component10() {
        return this.userHasFavorited;
    }
    
    public final boolean component11() {
        return this.over18;
    }
    
    public final boolean component12() {
        return this.userIsSubscriber;
    }
    
    public final boolean component13() {
        return this.userIsModerator;
    }
    
    public final boolean component14() {
        return this.isMyReddit;
    }
    
    public final String component2() {
        return this.kindWithId;
    }
    
    public final String component3() {
        return this.displayName;
    }
    
    public final String component4() {
        return this.displayNamePrefixed;
    }
    
    public final String component5() {
        return this.primaryColorKey;
    }
    
    public final String component6() {
        return this.keyColor;
    }
    
    public final String component7() {
        return this.communityIconUrl;
    }
    
    public final String component8() {
        return this.iconImg;
    }
    
    public final String component9() {
        return this.subredditType;
    }
    
    public final SubredditListItem copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        e.f((Object)s, "id");
        e.f((Object)s2, "kindWithId");
        e.f((Object)s3, "displayName");
        e.f((Object)s4, "displayNamePrefixed");
        e.f((Object)s9, "subredditType");
        return new SubredditListItem(s, s2, s3, s4, s5, s6, s7, s8, s9, b, b2, b3, b4, b5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditListItem)) {
            return false;
        }
        final SubredditListItem subredditListItem = (SubredditListItem)o;
        return e.a((Object)this.id, (Object)subredditListItem.id) && e.a((Object)this.kindWithId, (Object)subredditListItem.kindWithId) && e.a((Object)this.displayName, (Object)subredditListItem.displayName) && e.a((Object)this.displayNamePrefixed, (Object)subredditListItem.displayNamePrefixed) && e.a((Object)this.primaryColorKey, (Object)subredditListItem.primaryColorKey) && e.a((Object)this.keyColor, (Object)subredditListItem.keyColor) && e.a((Object)this.communityIconUrl, (Object)subredditListItem.communityIconUrl) && e.a((Object)this.iconImg, (Object)subredditListItem.iconImg) && e.a((Object)this.subredditType, (Object)subredditListItem.subredditType) && this.userHasFavorited == subredditListItem.userHasFavorited && this.over18 == subredditListItem.over18 && this.userIsSubscriber == subredditListItem.userIsSubscriber && this.userIsModerator == subredditListItem.userIsModerator && this.isMyReddit == subredditListItem.isMyReddit;
    }
    
    public final String getCommunityIcon() {
        String communityIconUrl = this.communityIconUrl;
        if (!(true ^ (communityIconUrl == null || communityIconUrl.length() == 0))) {
            communityIconUrl = null;
        }
        String iconImg = communityIconUrl;
        if (communityIconUrl == null) {
            iconImg = this.iconImg;
        }
        return iconImg;
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
    
    public final String getIconImg() {
        return this.iconImg;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getKeyColor() {
        return this.keyColor;
    }
    
    public final String getKindWithId() {
        return this.kindWithId;
    }
    
    public final boolean getOver18() {
        return this.over18;
    }
    
    public final String getPrimaryColor() {
        String primaryColorKey = this.primaryColorKey;
        final int n = 0;
        final boolean b = primaryColorKey == null || primaryColorKey.length() == 0;
        final String s = null;
        if (!(b ^ true)) {
            primaryColorKey = null;
        }
        String keyColor = primaryColorKey;
        if (primaryColorKey == null) {
            keyColor = this.keyColor;
        }
        int n2 = 0;
        Label_0074: {
            if (keyColor != null) {
                n2 = n;
                if (!j.H0((CharSequence)keyColor)) {
                    break Label_0074;
                }
            }
            n2 = 1;
        }
        String s2;
        if (n2 != 0) {
            s2 = s;
        }
        else {
            s2 = keyColor;
        }
        return s2;
    }
    
    public final String getPrimaryColorKey() {
        return this.primaryColorKey;
    }
    
    public final String getSubredditType() {
        return this.subredditType;
    }
    
    public final boolean getUserHasFavorited() {
        return this.userHasFavorited;
    }
    
    public final boolean getUserIsModerator() {
        return this.userIsModerator;
    }
    
    public final boolean getUserIsSubscriber() {
        return this.userIsSubscriber;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.displayNamePrefixed, b.c(this.displayName, b.c(this.kindWithId, this.id.hashCode() * 31, 31), 31), 31);
        final String primaryColorKey = this.primaryColorKey;
        int hashCode = 0;
        int hashCode2;
        if (primaryColorKey == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = primaryColorKey.hashCode();
        }
        final String keyColor = this.keyColor;
        int hashCode3;
        if (keyColor == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = keyColor.hashCode();
        }
        final String communityIconUrl = this.communityIconUrl;
        int hashCode4;
        if (communityIconUrl == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = communityIconUrl.hashCode();
        }
        final String iconImg = this.iconImg;
        if (iconImg != null) {
            hashCode = iconImg.hashCode();
        }
        final int c2 = b.c(this.subredditType, ((((c + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 31, 31);
        final int userHasFavorited = this.userHasFavorited ? 1 : 0;
        int n = 1;
        int n2 = userHasFavorited;
        if (userHasFavorited != 0) {
            n2 = 1;
        }
        int over18;
        if ((over18 = (this.over18 ? 1 : 0)) != 0) {
            over18 = 1;
        }
        int userIsSubscriber;
        if ((userIsSubscriber = (this.userIsSubscriber ? 1 : 0)) != 0) {
            userIsSubscriber = 1;
        }
        int userIsModerator;
        if ((userIsModerator = (this.userIsModerator ? 1 : 0)) != 0) {
            userIsModerator = 1;
        }
        final int isMyReddit = this.isMyReddit ? 1 : 0;
        if (isMyReddit == 0) {
            n = isMyReddit;
        }
        return ((((c2 + n2) * 31 + over18) * 31 + userIsSubscriber) * 31 + userIsModerator) * 31 + n;
    }
    
    public final boolean isMyReddit() {
        return this.isMyReddit;
    }
    
    public final boolean isUser() {
        return this.isUser;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditListItem(id=");
        r.append(this.id);
        r.append(", kindWithId=");
        r.append(this.kindWithId);
        r.append(", displayName=");
        r.append(this.displayName);
        r.append(", displayNamePrefixed=");
        r.append(this.displayNamePrefixed);
        r.append(", primaryColorKey=");
        r.append(this.primaryColorKey);
        r.append(", keyColor=");
        r.append(this.keyColor);
        r.append(", communityIconUrl=");
        r.append(this.communityIconUrl);
        r.append(", iconImg=");
        r.append(this.iconImg);
        r.append(", subredditType=");
        r.append(this.subredditType);
        r.append(", userHasFavorited=");
        r.append(this.userHasFavorited);
        r.append(", over18=");
        r.append(this.over18);
        r.append(", userIsSubscriber=");
        r.append(this.userIsSubscriber);
        r.append(", userIsModerator=");
        r.append(this.userIsModerator);
        r.append(", isMyReddit=");
        return g7.m(r, this.isMyReddit, ')');
    }
}
