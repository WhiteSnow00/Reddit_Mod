// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitycreation;

import ak0.m;
import a2.b;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J5\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/communitycreation/CreateSubredditTopics;", "", "toApplyPrimary", "", "toApply", "", "toCreateAndApply", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getToApply", "()Ljava/util/List;", "getToApplyPrimary", "()Ljava/lang/String;", "getToCreateAndApply", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CreateSubredditTopics
{
    private final List<String> toApply;
    private final String toApplyPrimary;
    private final List<String> toCreateAndApply;
    
    public CreateSubredditTopics(final String toApplyPrimary, final List<String> toApply, final List<String> toCreateAndApply) {
        f.f((Object)toApply, "toApply");
        f.f((Object)toCreateAndApply, "toCreateAndApply");
        this.toApplyPrimary = toApplyPrimary;
        this.toApply = toApply;
        this.toCreateAndApply = toCreateAndApply;
    }
    
    public final String component1() {
        return this.toApplyPrimary;
    }
    
    public final List<String> component2() {
        return this.toApply;
    }
    
    public final List<String> component3() {
        return this.toCreateAndApply;
    }
    
    public final CreateSubredditTopics copy(final String s, final List<String> list, final List<String> list2) {
        f.f((Object)list, "toApply");
        f.f((Object)list2, "toCreateAndApply");
        return new CreateSubredditTopics(s, list, list2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSubredditTopics)) {
            return false;
        }
        final CreateSubredditTopics createSubredditTopics = (CreateSubredditTopics)o;
        return f.a((Object)this.toApplyPrimary, (Object)createSubredditTopics.toApplyPrimary) && f.a((Object)this.toApply, (Object)createSubredditTopics.toApply) && f.a((Object)this.toCreateAndApply, (Object)createSubredditTopics.toCreateAndApply);
    }
    
    public final List<String> getToApply() {
        return this.toApply;
    }
    
    public final String getToApplyPrimary() {
        return this.toApplyPrimary;
    }
    
    public final List<String> getToCreateAndApply() {
        return this.toCreateAndApply;
    }
    
    @Override
    public int hashCode() {
        final String toApplyPrimary = this.toApplyPrimary;
        int hashCode;
        if (toApplyPrimary == null) {
            hashCode = 0;
        }
        else {
            hashCode = toApplyPrimary.hashCode();
        }
        return this.toCreateAndApply.hashCode() + b.a((List)this.toApply, hashCode * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CreateSubredditTopics(toApplyPrimary=");
        k.append(this.toApplyPrimary);
        k.append(", toApply=");
        k.append(this.toApply);
        k.append(", toCreateAndApply=");
        return m.n(k, (List)this.toCreateAndApply, ')');
    }
}
