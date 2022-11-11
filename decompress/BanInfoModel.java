// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools;

import al0.f0;
import sg2.e;
import android.support.v4.media.a;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\"" }, d2 = { "Lcom/reddit/domain/modtools/BanInfoModel;", "", "username", "", "banReason", "modNote", "banMessage", "duration", "", "banContext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getBanContext", "()Ljava/lang/String;", "getBanMessage", "getBanReason", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getModNote", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/reddit/domain/modtools/BanInfoModel;", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class BanInfoModel
{
    private final String banContext;
    private final String banMessage;
    private final String banReason;
    private final Long duration;
    private final String modNote;
    private final String username;
    
    public BanInfoModel(final String username, final String banReason, final String modNote, final String banMessage, final Long duration, final String banContext) {
        a.t(username, "username", banReason, "banReason", modNote, "modNote", banMessage, "banMessage");
        this.username = username;
        this.banReason = banReason;
        this.modNote = modNote;
        this.banMessage = banMessage;
        this.duration = duration;
        this.banContext = banContext;
    }
    
    public final String component1() {
        return this.username;
    }
    
    public final String component2() {
        return this.banReason;
    }
    
    public final String component3() {
        return this.modNote;
    }
    
    public final String component4() {
        return this.banMessage;
    }
    
    public final Long component5() {
        return this.duration;
    }
    
    public final String component6() {
        return this.banContext;
    }
    
    public final BanInfoModel copy(final String s, final String s2, final String s3, final String s4, final Long n, final String s5) {
        e.f((Object)s, "username");
        e.f((Object)s2, "banReason");
        e.f((Object)s3, "modNote");
        e.f((Object)s4, "banMessage");
        return new BanInfoModel(s, s2, s3, s4, n, s5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BanInfoModel)) {
            return false;
        }
        final BanInfoModel banInfoModel = (BanInfoModel)o;
        return e.a((Object)this.username, (Object)banInfoModel.username) && e.a((Object)this.banReason, (Object)banInfoModel.banReason) && e.a((Object)this.modNote, (Object)banInfoModel.modNote) && e.a((Object)this.banMessage, (Object)banInfoModel.banMessage) && e.a((Object)this.duration, (Object)banInfoModel.duration) && e.a((Object)this.banContext, (Object)banInfoModel.banContext);
    }
    
    public final String getBanContext() {
        return this.banContext;
    }
    
    public final String getBanMessage() {
        return this.banMessage;
    }
    
    public final String getBanReason() {
        return this.banReason;
    }
    
    public final Long getDuration() {
        return this.duration;
    }
    
    public final String getModNote() {
        return this.modNote;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.banMessage, b.c(this.modNote, b.c(this.banReason, this.username.hashCode() * 31, 31), 31), 31);
        final Long duration = this.duration;
        int hashCode = 0;
        int hashCode2;
        if (duration == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = duration.hashCode();
        }
        final String banContext = this.banContext;
        if (banContext != null) {
            hashCode = banContext.hashCode();
        }
        return (c + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("BanInfoModel(username=");
        r.append(this.username);
        r.append(", banReason=");
        r.append(this.banReason);
        r.append(", modNote=");
        r.append(this.modNote);
        r.append(", banMessage=");
        r.append(this.banMessage);
        r.append(", duration=");
        r.append(this.duration);
        r.append(", banContext=");
        return f0.n(r, this.banContext, ')');
    }
}
