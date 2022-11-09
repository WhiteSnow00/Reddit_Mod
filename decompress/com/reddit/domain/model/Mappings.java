// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/Mappings;", "", "subreddit_name", "", "subreddit_counterpart", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubreddit_counterpart", "()Ljava/lang/String;", "getSubreddit_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Mappings
{
    private final String subreddit_counterpart;
    private final String subreddit_name;
    
    public Mappings(final String subreddit_name, final String subreddit_counterpart) {
        f.f((Object)subreddit_name, "subreddit_name");
        f.f((Object)subreddit_counterpart, "subreddit_counterpart");
        this.subreddit_name = subreddit_name;
        this.subreddit_counterpart = subreddit_counterpart;
    }
    
    public final String component1() {
        return this.subreddit_name;
    }
    
    public final String component2() {
        return this.subreddit_counterpart;
    }
    
    public final Mappings copy(final String s, final String s2) {
        f.f((Object)s, "subreddit_name");
        f.f((Object)s2, "subreddit_counterpart");
        return new Mappings(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Mappings)) {
            return false;
        }
        final Mappings mappings = (Mappings)o;
        return f.a((Object)this.subreddit_name, (Object)mappings.subreddit_name) && f.a((Object)this.subreddit_counterpart, (Object)mappings.subreddit_counterpart);
    }
    
    public final String getSubreddit_counterpart() {
        return this.subreddit_counterpart;
    }
    
    public final String getSubreddit_name() {
        return this.subreddit_name;
    }
    
    @Override
    public int hashCode() {
        return this.subreddit_counterpart.hashCode() + this.subreddit_name.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Mappings(subreddit_name=");
        k.append(this.subreddit_name);
        k.append(", subreddit_counterpart=");
        return b.k(k, this.subreddit_counterpart, ')');
    }
}
