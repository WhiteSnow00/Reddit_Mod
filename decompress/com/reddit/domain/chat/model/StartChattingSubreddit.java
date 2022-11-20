// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import p1.h;
import aq2.a;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/chat/model/StartChattingSubreddit;", "", "displayName", "", "subredditName", "subredditKindWIthId", "keyColor", "iconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getIconUrl", "getKeyColor", "getSubredditKindWIthId", "getSubredditName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StartChattingSubreddit
{
    private final String displayName;
    private final String iconUrl;
    private final String keyColor;
    private final String subredditKindWIthId;
    private final String subredditName;
    
    public StartChattingSubreddit(final String displayName, final String subredditName, final String subredditKindWIthId, final String keyColor, final String iconUrl) {
        b.w(displayName, "displayName", subredditName, "subredditName", subredditKindWIthId, "subredditKindWIthId");
        this.displayName = displayName;
        this.subredditName = subredditName;
        this.subredditKindWIthId = subredditKindWIthId;
        this.keyColor = keyColor;
        this.iconUrl = iconUrl;
    }
    
    public static StartChattingSubreddit copy$default(final StartChattingSubreddit startChattingSubreddit, String displayName, String subredditName, String subredditKindWIthId, String keyColor, String iconUrl, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            displayName = startChattingSubreddit.displayName;
        }
        if ((n & 0x2) != 0x0) {
            subredditName = startChattingSubreddit.subredditName;
        }
        if ((n & 0x4) != 0x0) {
            subredditKindWIthId = startChattingSubreddit.subredditKindWIthId;
        }
        if ((n & 0x8) != 0x0) {
            keyColor = startChattingSubreddit.keyColor;
        }
        if ((n & 0x10) != 0x0) {
            iconUrl = startChattingSubreddit.iconUrl;
        }
        return startChattingSubreddit.copy(displayName, subredditName, subredditKindWIthId, keyColor, iconUrl);
    }
    
    public final String component1() {
        return this.displayName;
    }
    
    public final String component2() {
        return this.subredditName;
    }
    
    public final String component3() {
        return this.subredditKindWIthId;
    }
    
    public final String component4() {
        return this.keyColor;
    }
    
    public final String component5() {
        return this.iconUrl;
    }
    
    public final StartChattingSubreddit copy(final String s, final String s2, final String s3, final String s4, final String s5) {
        e.f((Object)s, "displayName");
        e.f((Object)s2, "subredditName");
        e.f((Object)s3, "subredditKindWIthId");
        return new StartChattingSubreddit(s, s2, s3, s4, s5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StartChattingSubreddit)) {
            return false;
        }
        final StartChattingSubreddit startChattingSubreddit = (StartChattingSubreddit)o;
        return e.a((Object)this.displayName, (Object)startChattingSubreddit.displayName) && e.a((Object)this.subredditName, (Object)startChattingSubreddit.subredditName) && e.a((Object)this.subredditKindWIthId, (Object)startChattingSubreddit.subredditKindWIthId) && e.a((Object)this.keyColor, (Object)startChattingSubreddit.keyColor) && e.a((Object)this.iconUrl, (Object)startChattingSubreddit.iconUrl);
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getKeyColor() {
        return this.keyColor;
    }
    
    public final String getSubredditKindWIthId() {
        return this.subredditKindWIthId;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    @Override
    public int hashCode() {
        final int e = a.e(this.subredditKindWIthId, a.e(this.subredditName, this.displayName.hashCode() * 31, 31), 31);
        final String keyColor = this.keyColor;
        int hashCode = 0;
        int hashCode2;
        if (keyColor == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = keyColor.hashCode();
        }
        final String iconUrl = this.iconUrl;
        if (iconUrl != null) {
            hashCode = iconUrl.hashCode();
        }
        return (e + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("StartChattingSubreddit(displayName=");
        t.append(this.displayName);
        t.append(", subredditName=");
        t.append(this.subredditName);
        t.append(", subredditKindWIthId=");
        t.append(this.subredditKindWIthId);
        t.append(", keyColor=");
        t.append(this.keyColor);
        t.append(", iconUrl=");
        return h.c(t, this.iconUrl, ')');
    }
}
