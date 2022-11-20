// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import b60.g0;
import b60.n0;
import ff2.o;
import com.reddit.domain.model.Result;
import wu1.c;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.search.TrendingQuery;
import com.reddit.domain.repository.Subplacement;
import com.reddit.domain.model.search.SearchCorrelation;
import java.util.List;
import af2.c0;
import q20.d;
import mg.d0;
import com.reddit.domain.model.search.Query;
import javax.inject.Inject;
import ng2.e;
import cg2.f;
import wa0.x;
import wu1.b;
import xd0.s;
import q20.a;
import x40.h0;
import com.reddit.data.remote.RedditRemoteSearchGqlDataSource;
import y50.j0;
import com.reddit.data.remote.RemoteSearchDataSource;
import java.util.concurrent.TimeUnit;
import xd0.b0;

public final class RedditSearchRepository implements b0
{
    public static final TimeUnit l;
    public final RemoteSearchDataSource a;
    public final j0 b;
    public final RedditRemoteSearchGqlDataSource c;
    public final h0 d;
    public final a e;
    public final av.a f;
    public final s g;
    public final b h;
    public final x i;
    public final f j;
    public final f k;
    
    static {
        l = TimeUnit.SECONDS;
    }
    
    @Inject
    public RedditSearchRepository(final RemoteSearchDataSource a, final j0 b, final RedditRemoteSearchGqlDataSource c, final h0 d, final a e, final av.a f, final s g, final b h, final x i) {
        ng2.e.f((Object)a, "remote");
        ng2.e.f((Object)b, "remoteR2Typeahead");
        ng2.e.f((Object)c, "remoteGqlTypeahead");
        ng2.e.f((Object)d, "local");
        ng2.e.f((Object)e, "backgroundThread");
        ng2.e.f((Object)f, "adOverrider");
        ng2.e.f((Object)g, "preferenceRepository");
        ng2.e.f((Object)h, "searchQueryIdGenerator");
        ng2.e.f((Object)i, "searchFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = kotlin.a.b((mg2.a)new RedditSearchRepository$searchSuggestionsStore$2(this));
        this.k = kotlin.a.b((mg2.a)new RedditSearchRepository$trendingQueriesStore$2(this));
    }
    
    @Override
    public final af2.a a(final Query query) {
        ng2.e.f((Object)query, "query");
        return d0.S0(this.d.a(query), (d)this.e);
    }
    
    @Override
    public final c0<List<Query>> b() {
        return px1.a.K0(this.d.b(), (d)this.e);
    }
    
    @Override
    public final af2.a c(final Query query) {
        return d0.S0(this.d.c(query), (d)this.e);
    }
    
    @Override
    public final c0<List<TrendingQuery>> d(final SearchCorrelation searchCorrelation, final Subplacement subplacement) {
        ng2.e.f((Object)searchCorrelation, "searchCorrelation");
        final Object value = this.k.getValue();
        ng2.e.e(value, "<get-trendingQueriesStore>(...)");
        final c0 value2 = ((Store)value).get((Object)new RedditSearchRepository.RedditSearchRepository$b(searchCorrelation, subplacement));
        ng2.e.e((Object)value2, "trendingQueriesStore[Tre\u2026rrelation, subplacement)]");
        return px1.a.K0(value2, (d)this.e);
    }
    
    @Override
    public final c0<Result<av1.a>> e(final String s, final boolean b, final SearchCorrelation searchCorrelation, final boolean b2, final c c) {
        ng2.e.f((Object)s, "query");
        ng2.e.f((Object)searchCorrelation, "searchCorrelation");
        final RedditSearchRepository.RedditSearchRepository$a redditSearchRepository$a = new RedditSearchRepository.RedditSearchRepository$a(s, b, searchCorrelation, b2, c);
        final Object value = this.j.getValue();
        ng2.e.e(value, "<get-searchSuggestionsStore>(...)");
        final c0 b3 = ((Store)value).get((Object)redditSearchRepository$a).w((o)new k(4, this, s)).w((o)new n0(3)).B((o)new g0(6));
        ng2.e.e((Object)b3, "searchSuggestionsStore[k\u2026r(it.message.orEmpty()) }");
        return px1.a.K0((c0)b3, (d)this.e);
    }
}
