// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/RecentGroupChannelStub;", "Lcom/reddit/domain/chat/model/WithLastVisit;", "channelUrl", "", "lastVisitTime", "", "(Ljava/lang/String;J)V", "getChannelUrl", "()Ljava/lang/String;", "getLastVisitTime", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RecentGroupChannelStub implements WithLastVisit
{
    private final String channelUrl;
    private final long lastVisitTime;
    
    public RecentGroupChannelStub(final String channelUrl, final long lastVisitTime) {
        f.f((Object)channelUrl, "channelUrl");
        this.channelUrl = channelUrl;
        this.lastVisitTime = lastVisitTime;
    }
    
    public final String component1() {
        return this.channelUrl;
    }
    
    public final long component2() {
        return this.getLastVisitTime();
    }
    
    public final RecentGroupChannelStub copy(final String s, final long n) {
        f.f((Object)s, "channelUrl");
        return new RecentGroupChannelStub(s, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentGroupChannelStub)) {
            return false;
        }
        final RecentGroupChannelStub recentGroupChannelStub = (RecentGroupChannelStub)o;
        return f.a((Object)this.channelUrl, (Object)recentGroupChannelStub.channelUrl) && this.getLastVisitTime() == recentGroupChannelStub.getLastVisitTime();
    }
    
    public final String getChannelUrl() {
        return this.channelUrl;
    }
    
    public long getLastVisitTime() {
        return this.lastVisitTime;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.getLastVisitTime()) + this.channelUrl.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RecentGroupChannelStub(channelUrl=");
        k.append(this.channelUrl);
        k.append(", lastVisitTime=");
        k.append(this.getLastVisitTime());
        k.append(')');
        return k.toString();
    }
}
