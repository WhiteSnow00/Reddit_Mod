// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import q20.d;
import com.reddit.domain.model.SubredditCategory;
import java.util.List;
import af2.c0;
import javax.inject.Inject;
import cg2.f;
import com.reddit.data.remote.RemoteCategoryDataSource;
import q20.a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xd0.e;

public final class RedditCategoryRepository implements e
{
    public static final Pair<Long, TimeUnit> e;
    public final a a;
    public final RemoteCategoryDataSource b;
    public final f c;
    public final f d;
    
    static {
        e = new Pair((Object)1L, (Object)TimeUnit.HOURS);
    }
    
    @Inject
    public RedditCategoryRepository(final a a, final RemoteCategoryDataSource b) {
        ng2.e.f((Object)a, "backgroundThread");
        ng2.e.f((Object)b, "remote");
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((mg2.a)new RedditCategoryRepository$recommendedCategoryStore$2(this));
        this.d = kotlin.a.b((mg2.a)new RedditCategoryRepository$categorySubredditsStore$2(this));
    }
    
    @Override
    public final c0<List<SubredditCategory>> a(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return px1.a.K0(this.b.categoriesForSubreddit(s), (d)this.a);
    }
}
