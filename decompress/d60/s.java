// 
// Decompiled by Procyon v0.6.0
// 

package d60;

import af2.e;
import e40.k;
import com.reddit.session.Session;
import ge0.a0;
import db0.i;
import az0.b;
import db0.x;
import db0.t;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import bt0.j;
import o50.a;
import com.squareup.moshi.y;
import ur0.g;
import javax.inject.Provider;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import af2.d;

public final class s implements d<RemoteGqlLinkDataSource>
{
    public final Provider<g> a;
    public final Provider<av.g> b;
    public final Provider<y> c;
    public final Provider<a> d;
    public final Provider<e22.d> e;
    public final Provider<j> f;
    public final Provider<gv.a> g;
    public final Provider<GqlPostToLinkDomainModelMapper> h;
    public final Provider<t> i;
    public final Provider<rr0.a> j;
    public final Provider<x> k;
    public final Provider<b> l;
    public final Provider<x01.a> m;
    public final Provider<i> n;
    public final Provider<a0> o;
    public final Provider<ub0.a> p;
    public final Provider<Session> q;
    
    public s(final k a, final Provider b, final Provider c, final Provider d, final Provider e, final e f, final af2.b g, final Provider h, final af2.b i, final af2.b j, final af2.b k, final af2.b l, final af2.b m, final af2.b n, final Provider o, final af2.b p17, final Provider q) {
        this.a = (Provider<g>)a;
        this.b = (Provider<av.g>)b;
        this.c = (Provider<y>)c;
        this.d = (Provider<a>)d;
        this.e = (Provider<e22.d>)e;
        this.f = (Provider<j>)f;
        this.g = (Provider<gv.a>)g;
        this.h = (Provider<GqlPostToLinkDomainModelMapper>)h;
        this.i = (Provider<t>)i;
        this.j = (Provider<rr0.a>)j;
        this.k = (Provider<x>)k;
        this.l = (Provider<b>)l;
        this.m = (Provider<x01.a>)m;
        this.n = (Provider<i>)n;
        this.o = (Provider<a0>)o;
        this.p = (Provider<ub0.a>)p17;
        this.q = (Provider<Session>)q;
    }
    
    public final Object get() {
        return new RemoteGqlLinkDataSource((g)this.a.get(), (av.g)this.b.get(), (y)this.c.get(), (a)this.d.get(), (e22.d)this.e.get(), (j)this.f.get(), (gv.a)this.g.get(), (GqlPostToLinkDomainModelMapper)this.h.get(), (t)this.i.get(), (rr0.a)this.j.get(), (x)this.k.get(), (b)this.l.get(), (x01.a)this.m.get(), (i)this.n.get(), (a0)this.o.get(), (ub0.a)this.p.get(), (Session)this.q.get());
    }
}
