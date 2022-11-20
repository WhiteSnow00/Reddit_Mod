// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts;

import p1.h;
import ph0.a;
import ng2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostContent;", "", "subredditId", "", "recurringPosts", "", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost;", "standalonePosts", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getRecurringPosts", "()Ljava/util/List;", "getStandalonePosts", "getSubredditId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ScheduledPostContent
{
    private final List<SubredditScheduledPost> recurringPosts;
    private final List<SubredditScheduledPost> standalonePosts;
    private final String subredditId;
    
    public ScheduledPostContent(final String subredditId, final List<SubredditScheduledPost> recurringPosts, final List<SubredditScheduledPost> standalonePosts) {
        e.f((Object)subredditId, "subredditId");
        e.f((Object)recurringPosts, "recurringPosts");
        e.f((Object)standalonePosts, "standalonePosts");
        this.subredditId = subredditId;
        this.recurringPosts = recurringPosts;
        this.standalonePosts = standalonePosts;
    }
    
    public static ScheduledPostContent copy$default(final ScheduledPostContent scheduledPostContent, String subredditId, List recurringPosts, List standalonePosts, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            subredditId = scheduledPostContent.subredditId;
        }
        if ((n & 0x2) != 0x0) {
            recurringPosts = scheduledPostContent.recurringPosts;
        }
        if ((n & 0x4) != 0x0) {
            standalonePosts = scheduledPostContent.standalonePosts;
        }
        return scheduledPostContent.copy(subredditId, recurringPosts, standalonePosts);
    }
    
    public final String component1() {
        return this.subredditId;
    }
    
    public final List<SubredditScheduledPost> component2() {
        return this.recurringPosts;
    }
    
    public final List<SubredditScheduledPost> component3() {
        return this.standalonePosts;
    }
    
    public final ScheduledPostContent copy(final String s, final List<SubredditScheduledPost> list, final List<SubredditScheduledPost> list2) {
        e.f((Object)s, "subredditId");
        e.f((Object)list, "recurringPosts");
        e.f((Object)list2, "standalonePosts");
        return new ScheduledPostContent(s, list, list2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledPostContent)) {
            return false;
        }
        final ScheduledPostContent scheduledPostContent = (ScheduledPostContent)o;
        return e.a((Object)this.subredditId, (Object)scheduledPostContent.subredditId) && e.a((Object)this.recurringPosts, (Object)scheduledPostContent.recurringPosts) && e.a((Object)this.standalonePosts, (Object)scheduledPostContent.standalonePosts);
    }
    
    public final List<SubredditScheduledPost> getRecurringPosts() {
        return this.recurringPosts;
    }
    
    public final List<SubredditScheduledPost> getStandalonePosts() {
        return this.standalonePosts;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    @Override
    public int hashCode() {
        return this.standalonePosts.hashCode() + a.b((List)this.recurringPosts, this.subredditId.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ScheduledPostContent(subredditId=");
        t.append(this.subredditId);
        t.append(", recurringPosts=");
        t.append(this.recurringPosts);
        t.append(", standalonePosts=");
        return h.d(t, (List)this.standalonePosts, ')');
    }
}
