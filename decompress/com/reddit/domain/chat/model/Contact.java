// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/chat/model/Contact;", "", "userId", "", "name", "createdUtc", "", "linkKarma", "", "lastInteraction", "commentKarma", "profileIcon", "(Ljava/lang/String;Ljava/lang/String;DIDILjava/lang/String;)V", "getCommentKarma", "()I", "getCreatedUtc", "()D", "getLastInteraction", "getLinkKarma", "getName", "()Ljava/lang/String;", "getProfileIcon", "getUserId", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Contact
{
    private final int commentKarma;
    private final double createdUtc;
    private final double lastInteraction;
    private final int linkKarma;
    private final String name;
    private final String profileIcon;
    private final String userId;
    
    public Contact(@n(name = "contact_account_id") final String userId, @n(name = "name") String name, @n(name = "created_utc") final double createdUtc, @n(name = "link_karma") final int linkKarma, @n(name = "last_interaction") final double lastInteraction, @n(name = "comment_karma") final int commentKarma, @n(name = "profile_img") final String profileIcon) {
        e.f((Object)userId, "userId");
        e.f((Object)name, "name");
        this.userId = userId;
        this.name = name;
        this.createdUtc = createdUtc;
        this.linkKarma = linkKarma;
        this.lastInteraction = lastInteraction;
        this.commentKarma = commentKarma;
        this.profileIcon = profileIcon;
    }
    
    public final int getCommentKarma() {
        return this.commentKarma;
    }
    
    public final double getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final double getLastInteraction() {
        return this.lastInteraction;
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
    
    public final String getUserId() {
        return this.userId;
    }
}
