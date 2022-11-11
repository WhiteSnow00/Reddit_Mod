// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitycreation;

import ak0.m;
import ah2.f;
import java.util.List;
import com.reddit.domain.model.paging.PageInfo;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/communitycreation/SubredditTopicsResult;", "", "pageInfo", "Lcom/reddit/domain/model/paging/PageInfo;", "topics", "", "Lcom/reddit/domain/model/communitycreation/SubredditTopic;", "(Lcom/reddit/domain/model/paging/PageInfo;Ljava/util/List;)V", "getPageInfo", "()Lcom/reddit/domain/model/paging/PageInfo;", "getTopics", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditTopicsResult
{
    private final PageInfo pageInfo;
    private final List<SubredditTopic> topics;
    
    public SubredditTopicsResult(final PageInfo pageInfo, final List<SubredditTopic> topics) {
        f.f((Object)pageInfo, "pageInfo");
        f.f((Object)topics, "topics");
        this.pageInfo = pageInfo;
        this.topics = topics;
    }
    
    public final PageInfo component1() {
        return this.pageInfo;
    }
    
    public final List<SubredditTopic> component2() {
        return this.topics;
    }
    
    public final SubredditTopicsResult copy(final PageInfo pageInfo, final List<SubredditTopic> list) {
        f.f((Object)pageInfo, "pageInfo");
        f.f((Object)list, "topics");
        return new SubredditTopicsResult(pageInfo, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditTopicsResult)) {
            return false;
        }
        final SubredditTopicsResult subredditTopicsResult = (SubredditTopicsResult)o;
        return f.a((Object)this.pageInfo, (Object)subredditTopicsResult.pageInfo) && f.a((Object)this.topics, (Object)subredditTopicsResult.topics);
    }
    
    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }
    
    public final List<SubredditTopic> getTopics() {
        return this.topics;
    }
    
    @Override
    public int hashCode() {
        return this.topics.hashCode() + this.pageInfo.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditTopicsResult(pageInfo=");
        k.append(this.pageInfo);
        k.append(", topics=");
        return m.n(k, (List)this.topics, ')');
    }
}
