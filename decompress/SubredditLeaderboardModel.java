// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import com.reddit.notification.common.NotificationLevel;
import v10.v;
import al0.f0;
import sg2.e;
import android.support.v4.media.a;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003J\t\u0010'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0002\u0010\u0018J\t\u00100\u001a\u00020\u000bH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0002\u0010\u0018J¦\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u00c6\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\bH\u00d6\u0001J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\u0006\u00109\u001a\u00020:R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006;" }, d2 = { "Lcom/reddit/domain/model/SubredditLeaderboardModel;", "", "id", "", "name", "prefixedName", "avatarImageUrl", "rank", "", "rankDelta", "isSubscribed", "", "backgroundColorKey", "backgroundColor", "subscribers", "", "isNsfw", "isQuarantined", "publicDescription", "cursor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;JZZLjava/lang/String;Ljava/lang/String;)V", "getAvatarImageUrl", "()Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColorKey", "getCursor", "getId", "()Z", "getName", "getPrefixedName", "getPublicDescription", "getRank", "getRankDelta", "getSubscribers", "()J", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;JZZLjava/lang/String;Ljava/lang/String;)Lcom/reddit/domain/model/SubredditLeaderboardModel;", "equals", "other", "hashCode", "toString", "toSubreddit", "Lcom/reddit/domain/model/Subreddit;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditLeaderboardModel
{
    private final String avatarImageUrl;
    private final Integer backgroundColor;
    private final String backgroundColorKey;
    private final String cursor;
    private final String id;
    private final boolean isNsfw;
    private final boolean isQuarantined;
    private final boolean isSubscribed;
    private final String name;
    private final String prefixedName;
    private final String publicDescription;
    private final Integer rank;
    private final Integer rankDelta;
    private final long subscribers;
    
    public SubredditLeaderboardModel(final String id, final String name, final String prefixedName, final String avatarImageUrl, final Integer rank, final Integer rankDelta, final boolean isSubscribed, final String backgroundColorKey, final Integer backgroundColor, final long subscribers, final boolean isNsfw, final boolean isQuarantined, final String publicDescription, final String cursor) {
        a.t(id, "id", name, "name", prefixedName, "prefixedName", cursor, "cursor");
        this.id = id;
        this.name = name;
        this.prefixedName = prefixedName;
        this.avatarImageUrl = avatarImageUrl;
        this.rank = rank;
        this.rankDelta = rankDelta;
        this.isSubscribed = isSubscribed;
        this.backgroundColorKey = backgroundColorKey;
        this.backgroundColor = backgroundColor;
        this.subscribers = subscribers;
        this.isNsfw = isNsfw;
        this.isQuarantined = isQuarantined;
        this.publicDescription = publicDescription;
        this.cursor = cursor;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final long component10() {
        return this.subscribers;
    }
    
    public final boolean component11() {
        return this.isNsfw;
    }
    
    public final boolean component12() {
        return this.isQuarantined;
    }
    
    public final String component13() {
        return this.publicDescription;
    }
    
    public final String component14() {
        return this.cursor;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.prefixedName;
    }
    
    public final String component4() {
        return this.avatarImageUrl;
    }
    
    public final Integer component5() {
        return this.rank;
    }
    
    public final Integer component6() {
        return this.rankDelta;
    }
    
    public final boolean component7() {
        return this.isSubscribed;
    }
    
    public final String component8() {
        return this.backgroundColorKey;
    }
    
    public final Integer component9() {
        return this.backgroundColor;
    }
    
    public final SubredditLeaderboardModel copy(final String s, final String s2, final String s3, final String s4, final Integer n, final Integer n2, final boolean b, final String s5, final Integer n3, final long n4, final boolean b2, final boolean b3, final String s6, final String s7) {
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        e.f((Object)s3, "prefixedName");
        e.f((Object)s7, "cursor");
        return new SubredditLeaderboardModel(s, s2, s3, s4, n, n2, b, s5, n3, n4, b2, b3, s6, s7);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditLeaderboardModel)) {
            return false;
        }
        final SubredditLeaderboardModel subredditLeaderboardModel = (SubredditLeaderboardModel)o;
        return e.a((Object)this.id, (Object)subredditLeaderboardModel.id) && e.a((Object)this.name, (Object)subredditLeaderboardModel.name) && e.a((Object)this.prefixedName, (Object)subredditLeaderboardModel.prefixedName) && e.a((Object)this.avatarImageUrl, (Object)subredditLeaderboardModel.avatarImageUrl) && e.a((Object)this.rank, (Object)subredditLeaderboardModel.rank) && e.a((Object)this.rankDelta, (Object)subredditLeaderboardModel.rankDelta) && this.isSubscribed == subredditLeaderboardModel.isSubscribed && e.a((Object)this.backgroundColorKey, (Object)subredditLeaderboardModel.backgroundColorKey) && e.a((Object)this.backgroundColor, (Object)subredditLeaderboardModel.backgroundColor) && this.subscribers == subredditLeaderboardModel.subscribers && this.isNsfw == subredditLeaderboardModel.isNsfw && this.isQuarantined == subredditLeaderboardModel.isQuarantined && e.a((Object)this.publicDescription, (Object)subredditLeaderboardModel.publicDescription) && e.a((Object)this.cursor, (Object)subredditLeaderboardModel.cursor);
    }
    
    public final String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }
    
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public final String getBackgroundColorKey() {
        return this.backgroundColorKey;
    }
    
    public final String getCursor() {
        return this.cursor;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getPrefixedName() {
        return this.prefixedName;
    }
    
    public final String getPublicDescription() {
        return this.publicDescription;
    }
    
    public final Integer getRank() {
        return this.rank;
    }
    
    public final Integer getRankDelta() {
        return this.rankDelta;
    }
    
    public final long getSubscribers() {
        return this.subscribers;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.prefixedName, b.c(this.name, this.id.hashCode() * 31, 31), 31);
        final String avatarImageUrl = this.avatarImageUrl;
        final int n = 0;
        int hashCode;
        if (avatarImageUrl == null) {
            hashCode = 0;
        }
        else {
            hashCode = avatarImageUrl.hashCode();
        }
        final Integer rank = this.rank;
        int hashCode2;
        if (rank == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = rank.hashCode();
        }
        final Integer rankDelta = this.rankDelta;
        int hashCode3;
        if (rankDelta == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = rankDelta.hashCode();
        }
        final int isSubscribed = this.isSubscribed ? 1 : 0;
        final int n2 = 1;
        int n3 = isSubscribed;
        if (isSubscribed != 0) {
            n3 = 1;
        }
        final String backgroundColorKey = this.backgroundColorKey;
        int hashCode4;
        if (backgroundColorKey == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = backgroundColorKey.hashCode();
        }
        final Integer backgroundColor = this.backgroundColor;
        int hashCode5;
        if (backgroundColor == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = backgroundColor.hashCode();
        }
        final int b = b.b(this.subscribers, ((((((c + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + n3) * 31 + hashCode4) * 31 + hashCode5) * 31, 31);
        int isNsfw;
        if ((isNsfw = (this.isNsfw ? 1 : 0)) != 0) {
            isNsfw = 1;
        }
        int isQuarantined = this.isQuarantined ? 1 : 0;
        if (isQuarantined != 0) {
            isQuarantined = n2;
        }
        final String publicDescription = this.publicDescription;
        int hashCode6;
        if (publicDescription == null) {
            hashCode6 = n;
        }
        else {
            hashCode6 = publicDescription.hashCode();
        }
        return this.cursor.hashCode() + (((b + isNsfw) * 31 + isQuarantined) * 31 + hashCode6) * 31;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final boolean isQuarantined() {
        return this.isQuarantined;
    }
    
    public final boolean isSubscribed() {
        return this.isSubscribed;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SubredditLeaderboardModel(id=");
        r.append(this.id);
        r.append(", name=");
        r.append(this.name);
        r.append(", prefixedName=");
        r.append(this.prefixedName);
        r.append(", avatarImageUrl=");
        r.append(this.avatarImageUrl);
        r.append(", rank=");
        r.append(this.rank);
        r.append(", rankDelta=");
        r.append(this.rankDelta);
        r.append(", isSubscribed=");
        r.append(this.isSubscribed);
        r.append(", backgroundColorKey=");
        r.append(this.backgroundColorKey);
        r.append(", backgroundColor=");
        r.append(this.backgroundColor);
        r.append(", subscribers=");
        r.append(this.subscribers);
        r.append(", isNsfw=");
        r.append(this.isNsfw);
        r.append(", isQuarantined=");
        r.append(this.isQuarantined);
        r.append(", publicDescription=");
        r.append(this.publicDescription);
        r.append(", cursor=");
        return f0.n(r, this.cursor, ')');
    }
    
    public final Subreddit toSubreddit() {
        final String g = v.g(this.id);
        final String id = this.id;
        final String name = this.name;
        final String prefixedName = this.prefixedName;
        final String avatarImageUrl = this.avatarImageUrl;
        final String backgroundColorKey = this.backgroundColorKey;
        final boolean isSubscribed = this.isSubscribed;
        final long subscribers = this.subscribers;
        String publicDescription;
        if ((publicDescription = this.publicDescription) == null) {
            publicDescription = "";
        }
        return new Subreddit(g, id, name, prefixedName, avatarImageUrl, backgroundColorKey, null, null, null, null, publicDescription, subscribers, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, isSubscribed, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, -3136, -129, 31, null);
    }
}
