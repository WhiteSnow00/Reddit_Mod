// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.domain.model.search.SearchResult;
import z50.n1;
import z50.q0;
import kf2.o;
import com.reddit.domain.model.Result;
import xu1.c;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.search.TrendingQuery;
import com.reddit.domain.repository.Subplacement;
import com.reddit.domain.model.search.SearchCorrelation;
import java.util.List;
import ff2.c0;
import n20.d;
import com.reddit.domain.model.search.Query;
import cj2.j;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import va0.y;
import xu1.b;
import xd0.s;
import n20.a;
import v40.j0;
import com.reddit.data.remote.RedditRemoteSearchGqlDataSource;
import w50.h0;
import com.reddit.data.remote.RemoteSearchDataSource;
import java.util.concurrent.TimeUnit;
import xd0.b0;

public final class RedditSearchRepository implements b0
{
    public static final TimeUnit l;
    public final RemoteSearchDataSource a;
    public final h0 b;
    public final RedditRemoteSearchGqlDataSource c;
    public final j0 d;
    public final n20.a e;
    public final av.a f;
    public final s g;
    public final xu1.b h;
    public final y i;
    public final f j;
    public final f k;
    
    static {
        l = TimeUnit.SECONDS;
    }
    
    @Inject
    public RedditSearchRepository(final RemoteSearchDataSource a, final h0 b, final RedditRemoteSearchGqlDataSource c, final j0 d, final n20.a e, final av.a f, final s g, final xu1.b h, final y i) {
        sg2.e.f((Object)a, "remote");
        sg2.e.f((Object)b, "remoteR2Typeahead");
        sg2.e.f((Object)c, "remoteGqlTypeahead");
        sg2.e.f((Object)d, "local");
        sg2.e.f((Object)e, "backgroundThread");
        sg2.e.f((Object)f, "adOverrider");
        sg2.e.f((Object)g, "preferenceRepository");
        sg2.e.f((Object)h, "searchQueryIdGenerator");
        sg2.e.f((Object)i, "searchFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = kotlin.a.b((rg2.a)new RedditSearchRepository$searchSuggestionsStore$2(this));
        this.k = kotlin.a.b((rg2.a)new RedditSearchRepository$trendingQueriesStore$2(this));
    }
    
    public static String g(String k, final String s) {
        final int n = 0;
        if ((k == null || j.H0((CharSequence)k)) && (s == null || j.H0((CharSequence)s))) {
            k = "";
        }
        else if ((k == null || j.H0((CharSequence)k)) && s != null) {
            k = s;
        }
        else {
            if (k != null) {
                int n2 = 0;
                Label_0111: {
                    if (s != null) {
                        n2 = n;
                        if (!j.H0((CharSequence)s)) {
                            break Label_0111;
                        }
                    }
                    n2 = 1;
                }
                if (n2 != 0) {
                    return k;
                }
            }
            k = a.k(k, " AND ", s);
        }
        return k;
    }
    
    public final ff2.a a(final Query query) {
        sg2.e.f((Object)query, "query");
        return yd.b.i0(this.d.a(query), (d)this.e);
    }
    
    public final c0<List<Query>> b() {
        return nn0.a.V(this.d.b(), (d)this.e);
    }
    
    public final ff2.a c(final Query query) {
        return yd.b.i0(this.d.c(query), (d)this.e);
    }
    
    public final c0<List<TrendingQuery>> d(final SearchCorrelation searchCorrelation, final Subplacement subplacement) {
        sg2.e.f((Object)searchCorrelation, "searchCorrelation");
        final Store value = this.k.getValue();
        sg2.e.e((Object)value, "<get-trendingQueriesStore>(...)");
        final c0 value2 = value.get((Object)new b(searchCorrelation, subplacement));
        sg2.e.e((Object)value2, "trendingQueriesStore[Tre\u2026rrelation, subplacement)]");
        return nn0.a.V(value2, (d)this.e);
    }
    
    public final c0<Result<bv1.a>> e(final String s, final boolean b, final SearchCorrelation searchCorrelation, final boolean b2, final c c) {
        sg2.e.f((Object)s, "query");
        sg2.e.f((Object)searchCorrelation, "searchCorrelation");
        final a a = new a(s, b, searchCorrelation, b2, c);
        final Store value = this.j.getValue();
        sg2.e.e((Object)value, "<get-searchSuggestionsStore>(...)");
        final c0 b3 = value.get((Object)a).w((o)new qa.e(1, (Object)this, (Object)s)).w((o)new q0(6)).B((o)new n1(2));
        sg2.e.e((Object)b3, "searchSuggestionsStore[k\u2026r(it.message.orEmpty()) }");
        return nn0.a.V((c0)b3, (d)this.e);
    }
    
    public final c0<List<SearchResult>> f(final Query query, final String s, final SearchCorrelation searchCorrelation, final c c) {
        sg2.e.f((Object)query, "query");
        sg2.e.f((Object)searchCorrelation, "searchCorrelation");
        final RemoteSearchDataSource a = this.a;
        final String subreddit = query.getSubreddit();
        String g;
        if (subreddit == null || (g = b.g("subreddit:\"", subreddit, '\"')) == null) {
            g = "";
        }
        String s2;
        if ((s2 = query.getFlairApiText()) == null) {
            s2 = query.getFlairText();
        }
        final String s3 = null;
        String g2;
        if (s2 != null) {
            g2 = b.g("flair_name:\"", s2, '\"');
        }
        else {
            g2 = null;
        }
        String s5;
        final String s4 = s5 = g(g(g, g2), query.getQuery());
        if (sg2.e.a((Object)query.getSafeSearch(), (Object)Boolean.TRUE)) {
            s5 = al0.b.h(s4, " SafeSearch:on");
        }
        final int length = s5.length();
        boolean b = false;
        final boolean b2 = length > 0;
        String s6 = s3;
        if (b2) {
            s6 = s5;
        }
        String s7;
        if (s6 == null) {
            s7 = "*:*";
        }
        else {
            s7 = s6;
        }
        final String id = searchCorrelation.getId();
        final xu1.b h = this.h;
        if (s == null) {
            b = true;
        }
        final c0 w = a.getUsers(s7, s, h.b(searchCorrelation, c, b), id, this.g.p()).w((o)new y30.o(query.getQuery(), 1));
        sg2.e.e((Object)w, "this.map { searchResults\u2026,\n        )\n      }\n    }");
        return nn0.a.V((c0)w, (d)this.e);
    }
    
    public static final class a
    {
        public final String a;
        public final boolean b;
        public final SearchCorrelation c;
        public final boolean d;
        public final c e;
        
        public a(final String a, final boolean b, final SearchCorrelation c, final boolean d, final c e) {
            e.f((Object)a, "query");
            e.f((Object)c, "searchCorrelation");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return sg2.e.a((Object)this.a, (Object)a.a) && this.b == a.b && sg2.e.a((Object)this.c, (Object)a.c) && this.d == a.d && sg2.e.a((Object)this.e, (Object)a.e);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int b = this.b ? 1 : 0;
            int n = 1;
            int n2 = b;
            if (b != 0) {
                n2 = 1;
            }
            final int hashCode2 = this.c.hashCode();
            final int d = this.d ? 1 : 0;
            if (d == 0) {
                n = d;
            }
            return this.e.hashCode() + ((hashCode2 + (hashCode * 31 + n2) * 31) * 31 + n) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("SearchSuggestionsKey(query=");
            r.append(this.a);
            r.append(", includeUsers=");
            r.append(this.b);
            r.append(", searchCorrelation=");
            r.append(this.c);
            r.append(", includeOver18=");
            r.append(this.d);
            r.append(", searchQueryKey=");
            r.append(this.e);
            r.append(')');
            return r.toString();
        }
    }
    
    public static final class b
    {
        public final SearchCorrelation a;
        public final Subplacement b;
        
        public b(final SearchCorrelation a, final Subplacement b) {
            e.f((Object)a, "searchCorrelation");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return true;
        }
        
        @Override
        public final int hashCode() {
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("TrendingSearchKey(searchCorrelation=");
            r.append(this.a);
            r.append(", subplacement=");
            r.append(this.b);
            r.append(')');
            return r.toString();
        }
    }
}
