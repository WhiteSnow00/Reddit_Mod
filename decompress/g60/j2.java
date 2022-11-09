// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import jw0.b$a;
import ca0.o;
import ca0.k0;
import y90.h$b;
import af2.e;
import android.content.Context;
import i22.c;
import db0.r;
import ge0.u;
import com.squareup.moshi.y;
import gc0.b;
import com.reddit.data.remote.RemoteGqlSubredditQuestionsDataSource;
import com.reddit.data.remote.RemoteGqlSubredditTopicsDataSource;
import ge0.p;
import com.reddit.data.remote.RemoteGqlSubredditDataSource;
import com.reddit.data.remote.RemoteSubredditStatsDataSource;
import com.reddit.data.remote.RemoteSubredditDataSource;
import r20.a;
import db0.s;
import javax.inject.Provider;
import com.reddit.data.repository.RedditSubredditRepository;
import af2.d;

public final class j2 implements d<RedditSubredditRepository>
{
    public final Provider<s> a;
    public final Provider<a> b;
    public final Provider<RemoteSubredditDataSource> c;
    public final Provider<RemoteSubredditStatsDataSource> d;
    public final Provider<RemoteGqlSubredditDataSource> e;
    public final Provider<p> f;
    public final Provider<RemoteGqlSubredditTopicsDataSource> g;
    public final Provider<RemoteGqlSubredditQuestionsDataSource> h;
    public final Provider<gc0.a> i;
    public final Provider<b> j;
    public final Provider<n22.p> k;
    public final Provider<y> l;
    public final Provider<u> m;
    public final Provider<db0.d> n;
    public final Provider<r> o;
    public final Provider<com.reddit.session.r> p;
    public final Provider<e20.a> q;
    public final Provider<jw0.a> r;
    public final Provider<c> s;
    public final Provider<Context> t;
    public final Provider<db0.c> u;
    
    public j2(final af2.b a, final Provider c, final Provider d, final Provider e, final Provider f, final Provider g, final Provider h, final Provider i, final Provider j, final e k, final Provider l, final Provider m, final af2.b n, final af2.b o, final Provider p18, final Provider s, final h$b t, final af2.b u) {
        final k0 a2 = k0.a.a;
        final o a3 = ca0.o.a.a;
        final jw0.b a4 = b$a.a;
        this.a = (Provider<s>)a;
        this.b = (Provider<a>)a2;
        this.c = (Provider<RemoteSubredditDataSource>)c;
        this.d = (Provider<RemoteSubredditStatsDataSource>)d;
        this.e = (Provider<RemoteGqlSubredditDataSource>)e;
        this.f = (Provider<p>)f;
        this.g = (Provider<RemoteGqlSubredditTopicsDataSource>)g;
        this.h = (Provider<RemoteGqlSubredditQuestionsDataSource>)h;
        this.i = (Provider<gc0.a>)i;
        this.j = (Provider<b>)j;
        this.k = (Provider<n22.p>)k;
        this.l = (Provider<y>)l;
        this.m = (Provider<u>)m;
        this.n = (Provider<db0.d>)n;
        this.o = (Provider<r>)o;
        this.p = (Provider<com.reddit.session.r>)p18;
        this.q = (Provider<e20.a>)a3;
        this.r = (Provider<jw0.a>)a4;
        this.s = (Provider<c>)s;
        this.t = (Provider<Context>)t;
        this.u = (Provider<db0.c>)u;
    }
    
    public final Object get() {
        return new RedditSubredditRepository((s)this.a.get(), (a)this.b.get(), (RemoteSubredditDataSource)this.c.get(), (RemoteSubredditStatsDataSource)this.d.get(), (RemoteGqlSubredditDataSource)this.e.get(), (p)this.f.get(), (RemoteGqlSubredditTopicsDataSource)this.g.get(), (RemoteGqlSubredditQuestionsDataSource)this.h.get(), (gc0.a)this.i.get(), (b)this.j.get(), (n22.p)this.k.get(), (y)this.l.get(), (u)this.m.get(), (db0.d)this.n.get(), (r)this.o.get(), (com.reddit.session.r)this.p.get(), (e20.a)this.q.get(), (jw0.a)this.r.get(), (c)this.s.get(), (Context)this.t.get(), (db0.c)this.u.get());
    }
}
