// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/mod/ApprovedSubmitter;", "Lcom/reddit/domain/model/mod/ModToolsUserModel;", "username", "", "atUtc", "", "id", "accountIcon", "reason", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountIcon", "()Ljava/lang/String;", "getAtUtc", "()J", "getId", "getReason", "getUsername", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ApprovedSubmitter implements ModToolsUserModel
{
    private final String accountIcon;
    private final long atUtc;
    private final String id;
    private final String reason;
    private final String username;
    
    public ApprovedSubmitter(@n(name = "username") final String username, @n(name = "approvedAtUTC") final long atUtc, @n(name = "id") final String id, @n(name = "accountIcon") final String accountIcon, @n(name = "reason") final String reason) {
        f.f((Object)username, "username");
        f.f((Object)id, "id");
        this.username = username;
        this.atUtc = atUtc;
        this.id = id;
        this.accountIcon = accountIcon;
        this.reason = reason;
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
    
    public final ApprovedSubmitter copy(@n(name = "username") final String s, @n(name = "approvedAtUTC") final long n, @n(name = "id") final String s2, @n(name = "accountIcon") final String s3, @n(name = "reason") final String s4) {
        f.f((Object)s, "username");
        f.f((Object)s2, "id");
        return new ApprovedSubmitter(s, n, s2, s3, s4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApprovedSubmitter)) {
            return false;
        }
        final ApprovedSubmitter approvedSubmitter = (ApprovedSubmitter)o;
        return f.a((Object)this.getUsername(), (Object)approvedSubmitter.getUsername()) && this.getAtUtc() == approvedSubmitter.getAtUtc() && f.a((Object)this.getId(), (Object)approvedSubmitter.getId()) && f.a((Object)this.getAccountIcon(), (Object)approvedSubmitter.getAccountIcon()) && f.a((Object)this.getReason(), (Object)approvedSubmitter.getReason());
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
        return ((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode5) * 31 + hashCode4;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ApprovedSubmitter(username=");
        k.append(this.getUsername());
        k.append(", atUtc=");
        k.append(this.getAtUtc());
        k.append(", id=");
        k.append(this.getId());
        k.append(", accountIcon=");
        k.append(this.getAccountIcon());
        k.append(", reason=");
        k.append(this.getReason());
        k.append(')');
        return k.toString();
    }
}
