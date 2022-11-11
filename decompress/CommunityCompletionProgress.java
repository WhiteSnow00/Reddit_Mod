// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/tagging/CommunityCompletionProgress;", "", "done", "", "total", "(II)V", "getDone", "()I", "getTotal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CommunityCompletionProgress
{
    private final int done;
    private final int total;
    
    public CommunityCompletionProgress(final int done, final int total) {
        this.done = done;
        this.total = total;
    }
    
    public final int component1() {
        return this.done;
    }
    
    public final int component2() {
        return this.total;
    }
    
    public final CommunityCompletionProgress copy(final int n, final int n2) {
        return new CommunityCompletionProgress(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommunityCompletionProgress)) {
            return false;
        }
        final CommunityCompletionProgress communityCompletionProgress = (CommunityCompletionProgress)o;
        return this.done == communityCompletionProgress.done && this.total == communityCompletionProgress.total;
    }
    
    public final int getDone() {
        return this.done;
    }
    
    public final int getTotal() {
        return this.total;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.total) + Integer.hashCode(this.done) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CommunityCompletionProgress(done=");
        k.append(this.done);
        k.append(", total=");
        return d.k(k, this.total, ')');
    }
}
