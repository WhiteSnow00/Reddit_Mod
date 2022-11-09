// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.inbox;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\nJ<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/inbox/SubredditModSettings;", "", "subredditKindWithId", "", "contentFoundation", "", "engagement", "milestone", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getContentFoundation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEngagement", "getMilestone", "getSubredditKindWithId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/reddit/domain/model/inbox/SubredditModSettings;", "equals", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditModSettings
{
    private final Boolean contentFoundation;
    private final Boolean engagement;
    private final Boolean milestone;
    private final String subredditKindWithId;
    
    public SubredditModSettings(final String subredditKindWithId, final Boolean contentFoundation, final Boolean engagement, final Boolean milestone) {
        f.f((Object)subredditKindWithId, "subredditKindWithId");
        this.subredditKindWithId = subredditKindWithId;
        this.contentFoundation = contentFoundation;
        this.engagement = engagement;
        this.milestone = milestone;
    }
    
    public final String component1() {
        return this.subredditKindWithId;
    }
    
    public final Boolean component2() {
        return this.contentFoundation;
    }
    
    public final Boolean component3() {
        return this.engagement;
    }
    
    public final Boolean component4() {
        return this.milestone;
    }
    
    public final SubredditModSettings copy(final String s, final Boolean b, final Boolean b2, final Boolean b3) {
        f.f((Object)s, "subredditKindWithId");
        return new SubredditModSettings(s, b, b2, b3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditModSettings)) {
            return false;
        }
        final SubredditModSettings subredditModSettings = (SubredditModSettings)o;
        return f.a((Object)this.subredditKindWithId, (Object)subredditModSettings.subredditKindWithId) && f.a((Object)this.contentFoundation, (Object)subredditModSettings.contentFoundation) && f.a((Object)this.engagement, (Object)subredditModSettings.engagement) && f.a((Object)this.milestone, (Object)subredditModSettings.milestone);
    }
    
    public final Boolean getContentFoundation() {
        return this.contentFoundation;
    }
    
    public final Boolean getEngagement() {
        return this.engagement;
    }
    
    public final Boolean getMilestone() {
        return this.milestone;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subredditKindWithId.hashCode();
        final Boolean contentFoundation = this.contentFoundation;
        int hashCode2 = 0;
        int hashCode3;
        if (contentFoundation == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = contentFoundation.hashCode();
        }
        final Boolean engagement = this.engagement;
        int hashCode4;
        if (engagement == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = engagement.hashCode();
        }
        final Boolean milestone = this.milestone;
        if (milestone != null) {
            hashCode2 = milestone.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditModSettings(subredditKindWithId=");
        k.append(this.subredditKindWithId);
        k.append(", contentFoundation=");
        k.append(this.contentFoundation);
        k.append(", engagement=");
        k.append(this.engagement);
        k.append(", milestone=");
        return d.m(k, this.milestone, ')');
    }
}
