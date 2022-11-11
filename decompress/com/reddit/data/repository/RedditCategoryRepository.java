// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import n20.d;
import com.reddit.domain.model.SubredditCategory;
import java.util.List;
import ff2.c0;
import javax.inject.Inject;
import hg2.f;
import com.reddit.data.remote.RemoteCategoryDataSource;
import n20.a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xd0.e;

public final class RedditCategoryRepository implements e
{
    public static final Pair<Long, TimeUnit> e;
    public final n20.a a;
    public final RemoteCategoryDataSource b;
    public final f c;
    public final f d;
    
    static {
        e = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    @Inject
    public RedditCategoryRepository(final n20.a a, final RemoteCategoryDataSource b) {
        sg2.e.f((Object)a, "backgroundThread");
        sg2.e.f((Object)b, "remote");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((rg2.a)new RedditCategoryRepository$recommendedCategoryStore$2(this));
        this.d = kotlin.a.b((rg2.a)new RedditCategoryRepository$categorySubredditsStore$2(this));
    }
    
    public final c0<List<SubredditCategory>> a(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return nn0.a.V(this.b.categoriesForSubreddit(s), (d)this.a);
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
            return sg2.e.a((Object)null, (Object)null);
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
