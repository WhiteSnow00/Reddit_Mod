// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import g60.u;
import g60.d1;
import g60.b1;
import com.reddit.domain.model.Result;
import sf2.o;
import g60.a2;
import com.reddit.domain.model.search.SearchResult;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.search.TrendingQuery;
import com.reddit.domain.repository.Subplacement;
import com.reddit.domain.model.search.SearchCorrelation;
import a4.u1;
import java.util.List;
import nf2.c0;
import r20.d;
import ak0.m;
import androidx.viewpager.widget.c;
import com.reddit.domain.model.search.Query;
import kj2.j;
import javax.inject.Inject;
import pg2.f;
import db0.z;
import iv1.b;
import ge0.a0;
import r20.a;
import c50.l0;
import com.reddit.data.remote.RedditRemoteSearchGqlDataSource;
import d60.h0;
import com.reddit.data.remote.RemoteSearchDataSource;
import java.util.concurrent.TimeUnit;
import ge0.j0;

public final class RedditSearchRepository implements j0
{
    public static final TimeUnit l;
    public final RemoteSearchDataSource a;
    public final h0 b;
    public final RedditRemoteSearchGqlDataSource c;
    public final l0 d;
    public final r20.a e;
    public final ev.a f;
    public final a0 g;
    public final iv1.b h;
    public final z i;
    public final f j;
    public final f k;
    
    static {
        l = TimeUnit.SECONDS;
    }
    
    @Inject
    public RedditSearchRepository(final RemoteSearchDataSource a, final h0 b, final RedditRemoteSearchGqlDataSource c, final l0 d, final r20.a e, final ev.a f, final a0 g, final iv1.b h, final z i) {
        ah2.f.f((Object)a, "remote");
        ah2.f.f((Object)b, "remoteR2Typeahead");
        ah2.f.f((Object)c, "remoteGqlTypeahead");
        ah2.f.f((Object)d, "local");
        ah2.f.f((Object)e, "backgroundThread");
        ah2.f.f((Object)f, "adOverrider");
        ah2.f.f((Object)g, "preferenceRepository");
        ah2.f.f((Object)h, "searchQueryIdGenerator");
        ah2.f.f((Object)i, "searchFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = kotlin.a.b((zg2.a)new RedditSearchRepository$searchSuggestionsStore.RedditSearchRepository$searchSuggestionsStore$2(this));
        this.k = kotlin.a.b((zg2.a)new RedditSearchRepository$trendingQueriesStore.RedditSearchRepository$trendingQueriesStore$2(this));
    }
    
    public static String h(String n, final String s) {
        final int n2 = 0;
        if ((n == null || j.X1((CharSequence)n)) && (s == null || j.X1((CharSequence)s))) {
            n = "";
        }
        else if ((n == null || j.X1((CharSequence)n)) && s != null) {
            n = s;
        }
        else {
            if (n != null) {
                int n3 = 0;
                Label_0111: {
                    if (s != null) {
                        n3 = n2;
                        if (!j.X1((CharSequence)s)) {
                            break Label_0111;
                        }
                    }
                    n3 = 1;
                }
                if (n3 != 0) {
                    return n;
                }
            }
            n = a40.f.n(n, " AND ", s);
        }
        return n;
    }
    
    public static String i(final Query query) {
        ah2.f.f((Object)query, "<this>");
        final String subreddit = query.getSubreddit();
        String i;
        if (subreddit == null || (i = c.i("subreddit:\"", subreddit, '\"')) == null) {
            i = "";
        }
        String s;
        if ((s = query.getFlairApiText()) == null) {
            s = query.getFlairText();
        }
        final String s2 = null;
        String j;
        if (s != null) {
            j = c.i("flair_name:\"", s, '\"');
        }
        else {
            j = null;
        }
        String s4;
        final String s3 = s4 = h(h(i, j), query.getQuery());
        if (ah2.f.a((Object)query.getSafeSearch(), (Object)Boolean.TRUE)) {
            s4 = m.l(s3, " SafeSearch:on");
        }
        final boolean b = s4.length() > 0;
        String s5 = s2;
        if (b) {
            s5 = s4;
        }
        String s6;
        if ((s6 = s5) == null) {
            s6 = "*:*";
        }
        return s6;
    }
    
    public final nf2.a a(final Query query) {
        ah2.f.f((Object)query, "query");
        return o72.f.t(this.d.a(query), (d)this.e);
    }
    
    public final c0<List<Query>> b() {
        return (c0<List<Query>>)u1.j1((c0)this.d.b(), (d)this.e);
    }
    
    public final nf2.a c(final Query query) {
        return o72.f.t(this.d.c(query), (d)this.e);
    }
    
    public final c0<List<TrendingQuery>> d(final SearchCorrelation searchCorrelation, final Subplacement subplacement) {
        ah2.f.f((Object)searchCorrelation, "searchCorrelation");
        final Object value = this.k.getValue();
        ah2.f.e(value, "<get-trendingQueriesStore>(...)");
        final c0 value2 = ((Store)value).get((Object)new b(searchCorrelation, subplacement));
        ah2.f.e((Object)value2, "trendingQueriesStore[Tre\u2026rrelation, subplacement)]");
        return (c0<List<TrendingQuery>>)u1.j1(value2, (d)this.e);
    }
    
    public final c0<List<SearchResult>> e(final Query query, final String s, final SearchCorrelation searchCorrelation, final iv1.c c) {
        ah2.f.f((Object)query, "query");
        ah2.f.f((Object)searchCorrelation, "searchCorrelation");
        final c0 w = this.a.getUsers(i(query), s, this.h.b(searchCorrelation, c, s == null), searchCorrelation.getId(), this.g.G3()).w((o)new a2(query.getQuery(), 1));
        ah2.f.e((Object)w, "this.map { searchResults\u2026,\n        )\n      }\n    }");
        return (c0<List<SearchResult>>)u1.j1(w, (d)this.e);
    }
    
    public final c0<List<SearchResult>> f(final Query query, final String s, final SearchCorrelation searchCorrelation, final iv1.c c) {
        ah2.f.f((Object)query, "query");
        ah2.f.f((Object)searchCorrelation, "searchCorrelation");
        final c0 w = this.a.getSubreddits(i(query), s, null, this.h.b(searchCorrelation, c, s == null), searchCorrelation.getId(), this.g.G3()).w((o)new a2(query.getQuery(), 1));
        ah2.f.e((Object)w, "this.map { searchResults\u2026,\n        )\n      }\n    }");
        return (c0<List<SearchResult>>)u1.j1(w, (d)this.e);
    }
    
    public final c0<Result<mv1.a>> g(final String s, final boolean b, final SearchCorrelation searchCorrelation, final boolean b2, final iv1.c c) {
        ah2.f.f((Object)s, "query");
        ah2.f.f((Object)searchCorrelation, "searchCorrelation");
        final a a = new a(s, b, searchCorrelation, b2, c);
        final Object value = this.j.getValue();
        ah2.f.e(value, "<get-searchSuggestionsStore>(...)");
        final c0 b3 = ((Store)value).get((Object)a).w((o)new b1(1, (Object)this, (Object)s)).w((o)new d1(6)).B((o)new u(5));
        ah2.f.e((Object)b3, "searchSuggestionsStore[k\u2026r(it.message.orEmpty()) }");
        return (c0<Result<mv1.a>>)u1.j1(b3, (d)this.e);
    }
    
    public static final class a
    {
        public final String a;
        public final boolean b;
        public final SearchCorrelation c;
        public final boolean d;
        public final iv1.c e;
        
        public a(final String a, final boolean b, final SearchCorrelation c, final boolean d, final iv1.c e) {
            ah2.f.f((Object)a, "query");
            ah2.f.f((Object)c, "searchCorrelation");
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
            return ah2.f.a((Object)this.a, (Object)a.a) && this.b == a.b && ah2.f.a((Object)this.c, (Object)a.c) && this.d == a.d && ah2.f.a((Object)this.e, (Object)a.e);
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
            final StringBuilder k = a.k("SearchSuggestionsKey(query=");
            k.append(this.a);
            k.append(", includeUsers=");
            k.append(this.b);
            k.append(", searchCorrelation=");
            k.append(this.c);
            k.append(", includeOver18=");
            k.append(this.d);
            k.append(", searchQueryKey=");
            k.append(this.e);
            k.append(')');
            return k.toString();
        }
    }
    
    public static final class b
    {
        public final SearchCorrelation a;
        public final Subplacement b;
        
        public b(final SearchCorrelation a, final Subplacement b) {
            ah2.f.f((Object)a, "searchCorrelation");
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
            final StringBuilder k = a.k("TrendingSearchKey(searchCorrelation=");
            k.append(this.a);
            k.append(", subplacement=");
            k.append(this.b);
            k.append(')');
            return k.toString();
        }
    }
}
