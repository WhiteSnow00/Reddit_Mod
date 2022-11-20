// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ng2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/chat/model/UserBriefData;", "", "name", "", "createdUtc", "", "linkKarma", "", "commentKarma", "profileIcon", "isNsfw", "", "(Ljava/lang/String;JIILjava/lang/String;Z)V", "getCommentKarma", "()I", "getCreatedUtc", "()J", "()Z", "getLinkKarma", "getName", "()Ljava/lang/String;", "getProfileIcon", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UserBriefData
{
    private final int commentKarma;
    private final long createdUtc;
    private final boolean isNsfw;
    private final int linkKarma;
    private final String name;
    private final String profileIcon;
    
    public UserBriefData(@n(name = "name") String name, @n(name = "created_utc") final long createdUtc, @n(name = "link_karma") final int linkKarma, @n(name = "comment_karma") final int commentKarma, @n(name = "profile_img") final String profileIcon, @n(name = "profile_over_18") final boolean isNsfw) {
        e.f((Object)name, "name");
        this.name = name;
        this.createdUtc = createdUtc;
        this.linkKarma = linkKarma;
        this.commentKarma = commentKarma;
        this.profileIcon = profileIcon;
        this.isNsfw = isNsfw;
    }
    
    public final int getCommentKarma() {
        return this.commentKarma;
    }
    
    public final long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final int getLinkKarma() {
        return this.linkKarma;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getProfileIcon() {
        return this.profileIcon;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
}
