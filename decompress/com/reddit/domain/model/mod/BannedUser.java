// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import p1.h;
import aq2.a;
import ng2.e;
import b5.k;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0092\u0001\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00066" }, d2 = { "Lcom/reddit/domain/model/mod/BannedUser;", "Lcom/reddit/domain/model/mod/ModToolsUserModel;", "username", "", "atUtc", "", "banMessage", "bannedBy", "reason", "duration", "postId", "id", "modNote", "accountIcon", "commentId", "subredditId", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountIcon", "()Ljava/lang/String;", "getAtUtc", "()J", "getBanMessage", "getBannedBy", "getCommentId", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getModNote", "getPostId", "getReason", "getSubredditId", "getUsername", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/reddit/domain/model/mod/BannedUser;", "equals", "", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class BannedUser implements ModToolsUserModel
{
    private final String accountIcon;
    private final long atUtc;
    private final String banMessage;
    private final String bannedBy;
    private final String commentId;
    private final Long duration;
    private final String id;
    private final String modNote;
    private final String postId;
    private final String reason;
    private final String subredditId;
    private final String username;
    
    public BannedUser(@n(name = "username") final String username, @n(name = "bannedAtUTC") final long atUtc, @n(name = "banMessage") final String banMessage, @n(name = "bannedBy") final String bannedBy, @n(name = "reason") final String reason, @n(name = "duration") final Long duration, @n(name = "post") final String postId, @n(name = "id") final String id, @n(name = "modNote") final String modNote, @n(name = "accountIcon") final String accountIcon, @n(name = "commentId") final String commentId, @n(name = "subredditId") final String subredditId) {
        k.x(username, "username", banMessage, "banMessage", bannedBy, "bannedBy", id, "id", subredditId, "subredditId");
        this.username = username;
        this.atUtc = atUtc;
        this.banMessage = banMessage;
        this.bannedBy = bannedBy;
        this.reason = reason;
        this.duration = duration;
        this.postId = postId;
        this.id = id;
        this.modNote = modNote;
        this.accountIcon = accountIcon;
        this.commentId = commentId;
        this.subredditId = subredditId;
    }
    
    public static BannedUser copy$default(final BannedUser bannedUser, String username, long atUtc, String banMessage, String bannedBy, String reason, Long duration, String postId, String id, String modNote, String accountIcon, String commentId, String subredditId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            username = bannedUser.getUsername();
        }
        if ((n & 0x2) != 0x0) {
            atUtc = bannedUser.getAtUtc();
        }
        if ((n & 0x4) != 0x0) {
            banMessage = bannedUser.banMessage;
        }
        if ((n & 0x8) != 0x0) {
            bannedBy = bannedUser.bannedBy;
        }
        if ((n & 0x10) != 0x0) {
            reason = bannedUser.getReason();
        }
        if ((n & 0x20) != 0x0) {
            duration = bannedUser.duration;
        }
        if ((n & 0x40) != 0x0) {
            postId = bannedUser.postId;
        }
        if ((n & 0x80) != 0x0) {
            id = bannedUser.getId();
        }
        if ((n & 0x100) != 0x0) {
            modNote = bannedUser.modNote;
        }
        if ((n & 0x200) != 0x0) {
            accountIcon = bannedUser.getAccountIcon();
        }
        if ((n & 0x400) != 0x0) {
            commentId = bannedUser.commentId;
        }
        if ((n & 0x800) != 0x0) {
            subredditId = bannedUser.subredditId;
        }
        return bannedUser.copy(username, atUtc, banMessage, bannedBy, reason, duration, postId, id, modNote, accountIcon, commentId, subredditId);
    }
    
    public final String component1() {
        return this.getUsername();
    }
    
    public final String component10() {
        return this.getAccountIcon();
    }
    
    public final String component11() {
        return this.commentId;
    }
    
    public final String component12() {
        return this.subredditId;
    }
    
    public final long component2() {
        return this.getAtUtc();
    }
    
    public final String component3() {
        return this.banMessage;
    }
    
    public final String component4() {
        return this.bannedBy;
    }
    
    public final String component5() {
        return this.getReason();
    }
    
    public final Long component6() {
        return this.duration;
    }
    
    public final String component7() {
        return this.postId;
    }
    
    public final String component8() {
        return this.getId();
    }
    
    public final String component9() {
        return this.modNote;
    }
    
    public final BannedUser copy(@n(name = "username") final String s, @n(name = "bannedAtUTC") final long n, @n(name = "banMessage") final String s2, @n(name = "bannedBy") final String s3, @n(name = "reason") final String s4, @n(name = "duration") final Long n2, @n(name = "post") final String s5, @n(name = "id") final String s6, @n(name = "modNote") final String s7, @n(name = "accountIcon") final String s8, @n(name = "commentId") final String s9, @n(name = "subredditId") final String s10) {
        e.f((Object)s, "username");
        e.f((Object)s2, "banMessage");
        e.f((Object)s3, "bannedBy");
        e.f((Object)s6, "id");
        e.f((Object)s10, "subredditId");
        return new BannedUser(s, n, s2, s3, s4, n2, s5, s6, s7, s8, s9, s10);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BannedUser)) {
            return false;
        }
        final BannedUser bannedUser = (BannedUser)o;
        return e.a((Object)this.getUsername(), (Object)bannedUser.getUsername()) && this.getAtUtc() == bannedUser.getAtUtc() && e.a((Object)this.banMessage, (Object)bannedUser.banMessage) && e.a((Object)this.bannedBy, (Object)bannedUser.bannedBy) && e.a((Object)this.getReason(), (Object)bannedUser.getReason()) && e.a((Object)this.duration, (Object)bannedUser.duration) && e.a((Object)this.postId, (Object)bannedUser.postId) && e.a((Object)this.getId(), (Object)bannedUser.getId()) && e.a((Object)this.modNote, (Object)bannedUser.modNote) && e.a((Object)this.getAccountIcon(), (Object)bannedUser.getAccountIcon()) && e.a((Object)this.commentId, (Object)bannedUser.commentId) && e.a((Object)this.subredditId, (Object)bannedUser.subredditId);
    }
    
    public String getAccountIcon() {
        return this.accountIcon;
    }
    
    public long getAtUtc() {
        return this.atUtc;
    }
    
    public final String getBanMessage() {
        return this.banMessage;
    }
    
    public final String getBannedBy() {
        return this.bannedBy;
    }
    
    public final String getCommentId() {
        return this.commentId;
    }
    
    public final Long getDuration() {
        return this.duration;
    }
    
    public String getId() {
        return this.id;
    }
    
    public final String getModNote() {
        return this.modNote;
    }
    
    public final String getPostId() {
        return this.postId;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int e = a.e(this.bannedBy, a.e(this.banMessage, (Long.hashCode(this.getAtUtc()) + this.getUsername().hashCode() * 31) * 31, 31), 31);
        final String reason = this.getReason();
        int hashCode = 0;
        int hashCode2;
        if (reason == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = this.getReason().hashCode();
        }
        final Long duration = this.duration;
        int hashCode3;
        if (duration == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = duration.hashCode();
        }
        final String postId = this.postId;
        int hashCode4;
        if (postId == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = postId.hashCode();
        }
        final int hashCode5 = this.getId().hashCode();
        final String modNote = this.modNote;
        int hashCode6;
        if (modNote == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = modNote.hashCode();
        }
        int hashCode7;
        if (this.getAccountIcon() == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = this.getAccountIcon().hashCode();
        }
        final String commentId = this.commentId;
        if (commentId != null) {
            hashCode = commentId.hashCode();
        }
        return this.subredditId.hashCode() + ((((hashCode5 + (((e + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("BannedUser(username=");
        t.append(this.getUsername());
        t.append(", atUtc=");
        t.append(this.getAtUtc());
        t.append(", banMessage=");
        t.append(this.banMessage);
        t.append(", bannedBy=");
        t.append(this.bannedBy);
        t.append(", reason=");
        t.append(this.getReason());
        t.append(", duration=");
        t.append(this.duration);
        t.append(", postId=");
        t.append(this.postId);
        t.append(", id=");
        t.append(this.getId());
        t.append(", modNote=");
        t.append(this.modNote);
        t.append(", accountIcon=");
        t.append(this.getAccountIcon());
        t.append(", commentId=");
        t.append(this.commentId);
        t.append(", subredditId=");
        return h.c(t, this.subredditId, ')');
    }
}
