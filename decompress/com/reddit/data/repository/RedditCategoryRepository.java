// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import r20.d;
import a4.u1;
import com.reddit.domain.model.SubredditCategory;
import java.util.List;
import nf2.c0;
import javax.inject.Inject;
import com.reddit.data.remote.RemoteCategoryDataSource;
import r20.a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ge0.f;

public final class RedditCategoryRepository implements f
{
    public static final Pair<Long, TimeUnit> e;
    public final r20.a a;
    public final RemoteCategoryDataSource b;
    public final pg2.f c;
    public final pg2.f d;
    
    static {
        e = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    @Inject
    public RedditCategoryRepository(final r20.a a, final RemoteCategoryDataSource b) {
        ah2.f.f((Object)a, "backgroundThread");
        ah2.f.f((Object)b, "remote");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((zg2.a)new RedditCategoryRepository$recommendedCategoryStore.RedditCategoryRepository$recommendedCategoryStore$2(this));
        this.d = kotlin.a.b((zg2.a)new RedditCategoryRepository$categorySubredditsStore.RedditCategoryRepository$categorySubredditsStore$2(this));
    }
    
    public final c0<List<SubredditCategory>> a(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return (c0<List<SubredditCategory>>)u1.j1((c0)this.b.categoriesForSubreddit(s), (d)this.a);
    }
    
    public static final class a
    {
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            o.getClass();
            return ah2.f.a((Object)null, (Object)null);
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
        
        @Override
        public final String toString() {
            return "CategoryKey(categoryId=null, limit=0)";
        }
    }
}
