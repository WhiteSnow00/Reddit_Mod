// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.appcompat.widget.s0;
import a2.b;
import ag0.a;
import ah2.f;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\u000bH\u00c6\u0003Jr\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u00c6\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u000eH\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006," }, d2 = { "Lcom/reddit/domain/model/FollowerModel;", "", "userId", "", "username", "displayName", "resizedIcons", "", "Lcom/reddit/domain/image/model/ImageResolution;", "snoovatarIconUrl", "isNsfw", "", "isFollowed", "karma", "", "acceptsFollowers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/Integer;Z)V", "getAcceptsFollowers", "()Z", "getDisplayName", "()Ljava/lang/String;", "getKarma", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResizedIcons", "()Ljava/util/List;", "getSnoovatarIconUrl", "getUserId", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/Integer;Z)Lcom/reddit/domain/model/FollowerModel;", "equals", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FollowerModel
{
    private final boolean acceptsFollowers;
    private final String displayName;
    private final boolean isFollowed;
    private final boolean isNsfw;
    private final Integer karma;
    private final List<ImageResolution> resizedIcons;
    private final String snoovatarIconUrl;
    private final String userId;
    private final String username;
    
    public FollowerModel(final String userId, final String username, final String displayName, final List<ImageResolution> resizedIcons, final String snoovatarIconUrl, final boolean isNsfw, final boolean isFollowed, final Integer karma, final boolean acceptsFollowers) {
        f.f((Object)userId, "userId");
        f.f((Object)username, "username");
        f.f((Object)displayName, "displayName");
        f.f((Object)resizedIcons, "resizedIcons");
        this.userId = userId;
        this.username = username;
        this.displayName = displayName;
        this.resizedIcons = resizedIcons;
        this.snoovatarIconUrl = snoovatarIconUrl;
        this.isNsfw = isNsfw;
        this.isFollowed = isFollowed;
        this.karma = karma;
        this.acceptsFollowers = acceptsFollowers;
    }
    
    public final String component1() {
        return this.userId;
    }
    
    public final String component2() {
        return this.username;
    }
    
    public final String component3() {
        return this.displayName;
    }
    
    public final List<ImageResolution> component4() {
        return this.resizedIcons;
    }
    
    public final String component5() {
        return this.snoovatarIconUrl;
    }
    
    public final boolean component6() {
        return this.isNsfw;
    }
    
    public final boolean component7() {
        return this.isFollowed;
    }
    
    public final Integer component8() {
        return this.karma;
    }
    
    public final boolean component9() {
        return this.acceptsFollowers;
    }
    
    public final FollowerModel copy(final String s, final String s2, final String s3, final List<ImageResolution> list, final String s4, final boolean b, final boolean b2, final Integer n, final boolean b3) {
        f.f((Object)s, "userId");
        f.f((Object)s2, "username");
        f.f((Object)s3, "displayName");
        f.f((Object)list, "resizedIcons");
        return new FollowerModel(s, s2, s3, list, s4, b, b2, n, b3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FollowerModel)) {
            return false;
        }
        final FollowerModel followerModel = (FollowerModel)o;
        return f.a((Object)this.userId, (Object)followerModel.userId) && f.a((Object)this.username, (Object)followerModel.username) && f.a((Object)this.displayName, (Object)followerModel.displayName) && f.a((Object)this.resizedIcons, (Object)followerModel.resizedIcons) && f.a((Object)this.snoovatarIconUrl, (Object)followerModel.snoovatarIconUrl) && this.isNsfw == followerModel.isNsfw && this.isFollowed == followerModel.isFollowed && f.a((Object)this.karma, (Object)followerModel.karma) && this.acceptsFollowers == followerModel.acceptsFollowers;
    }
    
    public final boolean getAcceptsFollowers() {
        return this.acceptsFollowers;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final Integer getKarma() {
        return this.karma;
    }
    
    public final List<ImageResolution> getResizedIcons() {
        return this.resizedIcons;
    }
    
    public final String getSnoovatarIconUrl() {
        return this.snoovatarIconUrl;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int a = b.a((List)this.resizedIcons, ag0.a.f(this.displayName, ag0.a.f(this.username, this.userId.hashCode() * 31, 31), 31), 31);
        final String snoovatarIconUrl = this.snoovatarIconUrl;
        int hashCode = 0;
        int hashCode2;
        if (snoovatarIconUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = snoovatarIconUrl.hashCode();
        }
        final int isNsfw = this.isNsfw ? 1 : 0;
        int n = 1;
        int n2 = isNsfw;
        if (isNsfw != 0) {
            n2 = 1;
        }
        int isFollowed;
        if ((isFollowed = (this.isFollowed ? 1 : 0)) != 0) {
            isFollowed = 1;
        }
        final Integer karma = this.karma;
        if (karma != null) {
            hashCode = karma.hashCode();
        }
        final int acceptsFollowers = this.acceptsFollowers ? 1 : 0;
        if (acceptsFollowers == 0) {
            n = acceptsFollowers;
        }
        return ((((a + hashCode2) * 31 + n2) * 31 + isFollowed) * 31 + hashCode) * 31 + n;
    }
    
    public final boolean isFollowed() {
        return this.isFollowed;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FollowerModel(userId=");
        k.append(this.userId);
        k.append(", username=");
        k.append(this.username);
        k.append(", displayName=");
        k.append(this.displayName);
        k.append(", resizedIcons=");
        k.append(this.resizedIcons);
        k.append(", snoovatarIconUrl=");
        k.append(this.snoovatarIconUrl);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", isFollowed=");
        k.append(this.isFollowed);
        k.append(", karma=");
        k.append(this.karma);
        k.append(", acceptsFollowers=");
        return s0.o(k, this.acceptsFollowers, ')');
    }
}
