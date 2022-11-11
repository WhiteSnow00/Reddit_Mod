// 
// Decompiled by Procyon v0.6.0
// 

package qa;

import pa.g;
import ra.c;
import sa.a;
import java.util.concurrent.Executor;
import ka.d;
import android.content.Context;
import javax.inject.Provider;
import ma.b;

public final class l implements b<k>
{
    public final Provider<Context> a;
    public final Provider<d> b;
    public final Provider<ra.d> c;
    public final Provider<o> d;
    public final Provider<Executor> e;
    public final Provider<a> f;
    public final Provider<ta.a> g;
    public final Provider<ta.a> h;
    public final Provider<c> i;
    
    public l(final Provider a, final Provider b, final Provider c, final g d, final Provider e, final Provider f, final Provider i) {
        final ta.b a2 = ta.b.a.a;
        final ta.c a3 = ta.c.a.a;
        this.a = (Provider<Context>)a;
        this.b = (Provider<d>)b;
        this.c = (Provider<ra.d>)c;
        this.d = (Provider<o>)d;
        this.e = (Provider<Executor>)e;
        this.f = (Provider<a>)f;
        this.g = (Provider<ta.a>)a2;
        this.h = (Provider<ta.a>)a3;
        this.i = (Provider<c>)i;
    }
    
    public final Object get() {
        return new k((Context)this.a.get(), (d)this.b.get(), (ra.d)this.c.get(), (o)this.d.get(), (Executor)this.e.get(), (a)this.f.get(), (ta.a)this.g.get(), (ta.a)this.h.get(), (c)this.i.get());
    }
}
