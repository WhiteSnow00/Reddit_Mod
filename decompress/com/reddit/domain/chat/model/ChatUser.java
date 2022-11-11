// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010 \u001a\u0004\u0018\u00010\fH\u00c6\u0003¢\u0006\u0002\u0010\u000fJ\\\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\nH\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006'" }, d2 = { "Lcom/reddit/domain/chat/model/ChatUser;", "", "id", "", "name", "profileIconUrl", "snoovatarIconUrl", "isNsfw", "", "totalKarma", "", "cakeday", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Long;)V", "getCakeday", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "()Z", "getName", "getProfileIconUrl", "getSnoovatarIconUrl", "getTotalKarma", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Long;)Lcom/reddit/domain/chat/model/ChatUser;", "equals", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChatUser
{
    private final Long cakeday;
    private final String id;
    private final boolean isNsfw;
    private final String name;
    private final String profileIconUrl;
    private final String snoovatarIconUrl;
    private final Integer totalKarma;
    
    public ChatUser(final String id, final String name, final String profileIconUrl, final String snoovatarIconUrl, final boolean isNsfw, final Integer totalKarma, final Long cakeday) {
        e.f((Object)id, "id");
        e.f((Object)name, "name");
        this.id = id;
        this.name = name;
        this.profileIconUrl = profileIconUrl;
        this.snoovatarIconUrl = snoovatarIconUrl;
        this.isNsfw = isNsfw;
        this.totalKarma = totalKarma;
        this.cakeday = cakeday;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.profileIconUrl;
    }
    
    public final String component4() {
        return this.snoovatarIconUrl;
    }
    
    public final boolean component5() {
        return this.isNsfw;
    }
    
    public final Integer component6() {
        return this.totalKarma;
    }
    
    public final Long component7() {
        return this.cakeday;
    }
    
    public final ChatUser copy(final String s, final String s2, final String s3, final String s4, final boolean b, final Integer n, final Long n2) {
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        return new ChatUser(s, s2, s3, s4, b, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatUser)) {
            return false;
        }
        final ChatUser chatUser = (ChatUser)o;
        return e.a((Object)this.id, (Object)chatUser.id) && e.a((Object)this.name, (Object)chatUser.name) && e.a((Object)this.profileIconUrl, (Object)chatUser.profileIconUrl) && e.a((Object)this.snoovatarIconUrl, (Object)chatUser.snoovatarIconUrl) && this.isNsfw == chatUser.isNsfw && e.a((Object)this.totalKarma, (Object)chatUser.totalKarma) && e.a((Object)this.cakeday, (Object)chatUser.cakeday);
    }
    
    public final Long getCakeday() {
        return this.cakeday;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getProfileIconUrl() {
        return this.profileIconUrl;
    }
    
    public final String getSnoovatarIconUrl() {
        return this.snoovatarIconUrl;
    }
    
    public final Integer getTotalKarma() {
        return this.totalKarma;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.name, this.id.hashCode() * 31, 31);
        final String profileIconUrl = this.profileIconUrl;
        int hashCode = 0;
        int hashCode2;
        if (profileIconUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = profileIconUrl.hashCode();
        }
        final String snoovatarIconUrl = this.snoovatarIconUrl;
        int hashCode3;
        if (snoovatarIconUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = snoovatarIconUrl.hashCode();
        }
        int isNsfw;
        if ((isNsfw = (this.isNsfw ? 1 : 0)) != 0) {
            isNsfw = 1;
        }
        final Integer totalKarma = this.totalKarma;
        int hashCode4;
        if (totalKarma == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = totalKarma.hashCode();
        }
        final Long cakeday = this.cakeday;
        if (cakeday != null) {
            hashCode = cakeday.hashCode();
        }
        return ((((c + hashCode2) * 31 + hashCode3) * 31 + isNsfw) * 31 + hashCode4) * 31 + hashCode;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("ChatUser(id=");
        r.append(this.id);
        r.append(", name=");
        r.append(this.name);
        r.append(", profileIconUrl=");
        r.append(this.profileIconUrl);
        r.append(", snoovatarIconUrl=");
        r.append(this.snoovatarIconUrl);
        r.append(", isNsfw=");
        r.append(this.isNsfw);
        r.append(", totalKarma=");
        r.append(this.totalKarma);
        r.append(", cakeday=");
        return a.l(r, this.cakeday, ')');
    }
}
