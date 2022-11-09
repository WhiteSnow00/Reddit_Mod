// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ak0.n;
import ah2.f;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J?\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/SubredditSnoomoji;", "", "snoomojis", "", "", "Lcom/reddit/domain/model/Snoomoji;", "subredditSnoomoji", "subredditId", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getSnoomojis", "()Ljava/util/Map;", "getSubredditId", "()Ljava/lang/String;", "getSubredditSnoomoji", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditSnoomoji
{
    private final Map<String, Snoomoji> snoomojis;
    private final String subredditId;
    private final Map<String, Snoomoji> subredditSnoomoji;
    
    public SubredditSnoomoji(final Map<String, Snoomoji> snoomojis, final Map<String, Snoomoji> subredditSnoomoji, final String subredditId) {
        f.f((Object)snoomojis, "snoomojis");
        f.f((Object)subredditSnoomoji, "subredditSnoomoji");
        f.f((Object)subredditId, "subredditId");
        this.snoomojis = snoomojis;
        this.subredditSnoomoji = subredditSnoomoji;
        this.subredditId = subredditId;
    }
    
    public final Map<String, Snoomoji> component1() {
        return this.snoomojis;
    }
    
    public final Map<String, Snoomoji> component2() {
        return this.subredditSnoomoji;
    }
    
    public final String component3() {
        return this.subredditId;
    }
    
    public final SubredditSnoomoji copy(final Map<String, Snoomoji> map, final Map<String, Snoomoji> map2, final String s) {
        f.f((Object)map, "snoomojis");
        f.f((Object)map2, "subredditSnoomoji");
        f.f((Object)s, "subredditId");
        return new SubredditSnoomoji(map, map2, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditSnoomoji)) {
            return false;
        }
        final SubredditSnoomoji subredditSnoomoji = (SubredditSnoomoji)o;
        return f.a((Object)this.snoomojis, (Object)subredditSnoomoji.snoomojis) && f.a((Object)this.subredditSnoomoji, (Object)subredditSnoomoji.subredditSnoomoji) && f.a((Object)this.subredditId, (Object)subredditSnoomoji.subredditId);
    }
    
    public final Map<String, Snoomoji> getSnoomojis() {
        return this.snoomojis;
    }
    
    public final String getSubredditId() {
        return this.subredditId;
    }
    
    public final Map<String, Snoomoji> getSubredditSnoomoji() {
        return this.subredditSnoomoji;
    }
    
    @Override
    public int hashCode() {
        return this.subredditId.hashCode() + n.g((Map)this.subredditSnoomoji, this.snoomojis.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditSnoomoji(snoomojis=");
        k.append(this.snoomojis);
        k.append(", subredditSnoomoji=");
        k.append(this.subredditSnoomoji);
        k.append(", subredditId=");
        return b.k(k, this.subredditId, ')');
    }
}
