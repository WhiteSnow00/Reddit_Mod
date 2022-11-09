// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001:\u0001BB\u008e\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u001eJ\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010H\u00c6\u0003J\t\u00100\u001a\u00020\u0015H\u00c6\u0003J\t\u00101\u001a\u00020\u0017H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\u0019\u00105\u001a\u00020\tH\u00c6\u0003\u00f8\u0001\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000¢\u0006\u0004\b6\u0010\u001aJ\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J¸\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001\u00f8\u0001\u0001\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0015H\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\b\u001a\u00020\t\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\n\n\u0002\u0010$\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C" }, d2 = { "Lcom/reddit/domain/model/Multireddit;", "", "name", "", "displayName", "descriptionRichText", "isEditable", "", "path", "Lcom/reddit/domain/model/MultiredditPath;", "ownerId", "ownerName", "iconUrl", "isFollowed", "isNsfw", "subreddits", "", "Lcom/reddit/domain/model/Subreddit;", "users", "Lcom/reddit/domain/model/User;", "subredditCount", "", "visibility", "Lcom/reddit/domain/model/Multireddit$Visibility;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Ljava/util/List;ILcom/reddit/domain/model/Multireddit$Visibility;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDescriptionRichText", "()Ljava/lang/String;", "getDisplayName", "getIconUrl", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getOwnerId", "getOwnerName", "getPath-6nFwv9Y", "Ljava/lang/String;", "getSubredditCount", "()I", "getSubreddits", "()Ljava/util/List;", "getUsers", "getVisibility", "()Lcom/reddit/domain/model/Multireddit$Visibility;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component5-6nFwv9Y", "component6", "component7", "component8", "component9", "copy", "copy--v4K5gg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Ljava/util/List;ILcom/reddit/domain/model/Multireddit$Visibility;)Lcom/reddit/domain/model/Multireddit;", "equals", "other", "hashCode", "toString", "Visibility", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Multireddit
{
    private final String descriptionRichText;
    private final String displayName;
    private final String iconUrl;
    private final boolean isEditable;
    private final boolean isFollowed;
    private final Boolean isNsfw;
    private final String name;
    private final String ownerId;
    private final String ownerName;
    private final String path;
    private final int subredditCount;
    private final List<Subreddit> subreddits;
    private final List<User> users;
    private final Visibility visibility;
    
    private Multireddit(final String name, final String displayName, final String descriptionRichText, final boolean isEditable, final String path, final String ownerId, final String ownerName, final String iconUrl, final boolean isFollowed, final Boolean isNsfw, final List<Subreddit> subreddits, final List<User> users, final int subredditCount, final Visibility visibility) {
        this.name = name;
        this.displayName = displayName;
        this.descriptionRichText = descriptionRichText;
        this.isEditable = isEditable;
        this.path = path;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.iconUrl = iconUrl;
        this.isFollowed = isFollowed;
        this.isNsfw = isNsfw;
        this.subreddits = subreddits;
        this.users = users;
        this.subredditCount = subredditCount;
        this.visibility = visibility;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final Boolean component10() {
        return this.isNsfw;
    }
    
    public final List<Subreddit> component11() {
        return this.subreddits;
    }
    
    public final List<User> component12() {
        return this.users;
    }
    
    public final int component13() {
        return this.subredditCount;
    }
    
    public final Visibility component14() {
        return this.visibility;
    }
    
    public final String component2() {
        return this.displayName;
    }
    
    public final String component3() {
        return this.descriptionRichText;
    }
    
    public final boolean component4() {
        return this.isEditable;
    }
    
    public final String component5-6nFwv9Y() {
        return this.path;
    }
    
    public final String component6() {
        return this.ownerId;
    }
    
    public final String component7() {
        return this.ownerName;
    }
    
    public final String component8() {
        return this.iconUrl;
    }
    
    public final boolean component9() {
        return this.isFollowed;
    }
    
    public final Multireddit copy--v4K5gg(final String s, final String s2, final String s3, final boolean b, final String s4, final String s5, final String s6, final String s7, final boolean b2, final Boolean b3, final List<Subreddit> list, final List<User> list2, final int n, final Visibility visibility) {
        f.f((Object)s, "name");
        f.f((Object)s2, "displayName");
        f.f((Object)s4, "path");
        f.f((Object)s5, "ownerId");
        f.f((Object)s7, "iconUrl");
        f.f((Object)visibility, "visibility");
        return new Multireddit(s, s2, s3, b, s4, s5, s6, s7, b2, b3, list, list2, n, visibility, null);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Multireddit)) {
            return false;
        }
        final Multireddit multireddit = (Multireddit)o;
        return f.a((Object)this.name, (Object)multireddit.name) && f.a((Object)this.displayName, (Object)multireddit.displayName) && f.a((Object)this.descriptionRichText, (Object)multireddit.descriptionRichText) && this.isEditable == multireddit.isEditable && MultiredditPath.equals-impl0(this.path, multireddit.path) && f.a((Object)this.ownerId, (Object)multireddit.ownerId) && f.a((Object)this.ownerName, (Object)multireddit.ownerName) && f.a((Object)this.iconUrl, (Object)multireddit.iconUrl) && this.isFollowed == multireddit.isFollowed && f.a((Object)this.isNsfw, (Object)multireddit.isNsfw) && f.a((Object)this.subreddits, (Object)multireddit.subreddits) && f.a((Object)this.users, (Object)multireddit.users) && this.subredditCount == multireddit.subredditCount && this.visibility == multireddit.visibility;
    }
    
    public final String getDescriptionRichText() {
        return this.descriptionRichText;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getOwnerId() {
        return this.ownerId;
    }
    
    public final String getOwnerName() {
        return this.ownerName;
    }
    
    public final String getPath-6nFwv9Y() {
        return this.path;
    }
    
    public final int getSubredditCount() {
        return this.subredditCount;
    }
    
    public final List<Subreddit> getSubreddits() {
        return this.subreddits;
    }
    
    public final List<User> getUsers() {
        return this.users;
    }
    
    public final Visibility getVisibility() {
        return this.visibility;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.displayName, this.name.hashCode() * 31, 31);
        final String descriptionRichText = this.descriptionRichText;
        int hashCode = 0;
        int hashCode2;
        if (descriptionRichText == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = descriptionRichText.hashCode();
        }
        final int isEditable = this.isEditable ? 1 : 0;
        final int n = 1;
        int n2 = isEditable;
        if (isEditable != 0) {
            n2 = 1;
        }
        final int f2 = a.f(this.ownerId, (MultiredditPath.hashCode-impl(this.path) + ((f + hashCode2) * 31 + n2) * 31) * 31, 31);
        final String ownerName = this.ownerName;
        int hashCode3;
        if (ownerName == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = ownerName.hashCode();
        }
        final int f3 = a.f(this.iconUrl, (f2 + hashCode3) * 31, 31);
        int isFollowed = this.isFollowed ? 1 : 0;
        if (isFollowed != 0) {
            isFollowed = n;
        }
        final Boolean isNsfw = this.isNsfw;
        int hashCode4;
        if (isNsfw == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = isNsfw.hashCode();
        }
        final List<Subreddit> subreddits = this.subreddits;
        int hashCode5;
        if (subreddits == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = subreddits.hashCode();
        }
        final List<User> users = this.users;
        if (users != null) {
            hashCode = users.hashCode();
        }
        return this.visibility.hashCode() + s0.e(this.subredditCount, ((((f3 + isFollowed) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode) * 31, 31);
    }
    
    public final boolean isEditable() {
        return this.isEditable;
    }
    
    public final boolean isFollowed() {
        return this.isFollowed;
    }
    
    public final Boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Multireddit(name=");
        k.append(this.name);
        k.append(", displayName=");
        k.append(this.displayName);
        k.append(", descriptionRichText=");
        k.append(this.descriptionRichText);
        k.append(", isEditable=");
        k.append(this.isEditable);
        k.append(", path=");
        k.append((Object)MultiredditPath.toString-impl(this.path));
        k.append(", ownerId=");
        k.append(this.ownerId);
        k.append(", ownerName=");
        k.append(this.ownerName);
        k.append(", iconUrl=");
        k.append(this.iconUrl);
        k.append(", isFollowed=");
        k.append(this.isFollowed);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", subreddits=");
        k.append(this.subreddits);
        k.append(", users=");
        k.append(this.users);
        k.append(", subredditCount=");
        k.append(this.subredditCount);
        k.append(", visibility=");
        k.append(this.visibility);
        k.append(')');
        return k.toString();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/Multireddit$Visibility;", "", "(Ljava/lang/String;I)V", "PUBLIC", "PRIVATE", "HIDDEN", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Visibility
    {
        HIDDEN, 
        PRIVATE, 
        PUBLIC;
    }
}
