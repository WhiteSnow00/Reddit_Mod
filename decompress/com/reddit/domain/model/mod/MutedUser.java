// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import p1.h;
import ng2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!" }, d2 = { "Lcom/reddit/domain/model/mod/MutedUser;", "Lcom/reddit/domain/model/mod/ModToolsUserModel;", "username", "", "atUtc", "", "id", "accountIcon", "reason", "mutedBy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountIcon", "()Ljava/lang/String;", "getAtUtc", "()J", "getId", "getMutedBy", "getReason", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MutedUser implements ModToolsUserModel
{
    private final String accountIcon;
    private final long atUtc;
    private final String id;
    private final String mutedBy;
    private final String reason;
    private final String username;
    
    public MutedUser(@n(name = "username") final String username, @n(name = "mutedAtUTC") final long atUtc, @n(name = "id") final String id, @n(name = "accountIcon") final String accountIcon, @n(name = "reason") final String reason, @n(name = "mutedBy") final String mutedBy) {
        b.w(username, "username", id, "id", mutedBy, "mutedBy");
        this.username = username;
        this.atUtc = atUtc;
        this.id = id;
        this.accountIcon = accountIcon;
        this.reason = reason;
        this.mutedBy = mutedBy;
    }
    
    public static MutedUser copy$default(final MutedUser mutedUser, String username, long atUtc, String id, String accountIcon, String reason, String mutedBy, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            username = mutedUser.getUsername();
        }
        if ((n & 0x2) != 0x0) {
            atUtc = mutedUser.getAtUtc();
        }
        if ((n & 0x4) != 0x0) {
            id = mutedUser.getId();
        }
        if ((n & 0x8) != 0x0) {
            accountIcon = mutedUser.getAccountIcon();
        }
        if ((n & 0x10) != 0x0) {
            reason = mutedUser.getReason();
        }
        if ((n & 0x20) != 0x0) {
            mutedBy = mutedUser.mutedBy;
        }
        return mutedUser.copy(username, atUtc, id, accountIcon, reason, mutedBy);
    }
    
    public final String component1() {
        return this.getUsername();
    }
    
    public final long component2() {
        return this.getAtUtc();
    }
    
    public final String component3() {
        return this.getId();
    }
    
    public final String component4() {
        return this.getAccountIcon();
    }
    
    public final String component5() {
        return this.getReason();
    }
    
    public final String component6() {
        return this.mutedBy;
    }
    
    public final MutedUser copy(@n(name = "username") final String s, @n(name = "mutedAtUTC") final long n, @n(name = "id") final String s2, @n(name = "accountIcon") final String s3, @n(name = "reason") final String s4, @n(name = "mutedBy") final String s5) {
        e.f((Object)s, "username");
        e.f((Object)s2, "id");
        e.f((Object)s5, "mutedBy");
        return new MutedUser(s, n, s2, s3, s4, s5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MutedUser)) {
            return false;
        }
        final MutedUser mutedUser = (MutedUser)o;
        return e.a((Object)this.getUsername(), (Object)mutedUser.getUsername()) && this.getAtUtc() == mutedUser.getAtUtc() && e.a((Object)this.getId(), (Object)mutedUser.getId()) && e.a((Object)this.getAccountIcon(), (Object)mutedUser.getAccountIcon()) && e.a((Object)this.getReason(), (Object)mutedUser.getReason()) && e.a((Object)this.mutedBy, (Object)mutedUser.mutedBy);
    }
    
    public String getAccountIcon() {
        return this.accountIcon;
    }
    
    public long getAtUtc() {
        return this.atUtc;
    }
    
    public String getId() {
        return this.id;
    }
    
    public final String getMutedBy() {
        return this.mutedBy;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.getUsername().hashCode();
        final int hashCode2 = Long.hashCode(this.getAtUtc());
        final int hashCode3 = this.getId().hashCode();
        final String accountIcon = this.getAccountIcon();
        int hashCode4 = 0;
        int hashCode5;
        if (accountIcon == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = this.getAccountIcon().hashCode();
        }
        if (this.getReason() != null) {
            hashCode4 = this.getReason().hashCode();
        }
        return this.mutedBy.hashCode() + (((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode5) * 31 + hashCode4) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("MutedUser(username=");
        t.append(this.getUsername());
        t.append(", atUtc=");
        t.append(this.getAtUtc());
        t.append(", id=");
        t.append(this.getId());
        t.append(", accountIcon=");
        t.append(this.getAccountIcon());
        t.append(", reason=");
        t.append(this.getReason());
        t.append(", mutedBy=");
        return h.c(t, this.mutedBy, ')');
    }
}
