// 
// Decompiled by Procyon v0.6.0
// 

package pd0;

import ff2.n;
import io.reactivex.plugins.RxJavaPlugins;
import kf2.o;
import ff2.r;
import ff2.c0;
import ff0.t0;
import javax.inject.Inject;
import sg2.e;
import od0.c;
import bd0.a;

public final class d extends bd0.a
{
    public final n20.a h;
    public final c i;
    
    @Inject
    public d(final n20.a h, final c i) {
        e.f((Object)h, "backgroundThread");
        e.f((Object)i, "predictionsRepository");
        this.h = h;
        this.i = i;
    }
    
    public final c0 b0(final t0 t0) {
        final a a = (a)t0;
        e.f((Object)a, "params");
        c0<d.d$b.a> c0;
        if (!a.b) {
            c0 = ff2.c0.v(d.d$b.a.a);
            e.e((Object)c0, "{\n      Single.just(Result.None)\n    }");
        }
        else {
            final n h = this.i.h(a.a);
            final nw.d d = new nw.d(21);
            h.getClass();
            c0 = RxJavaPlugins.onAssembly((ff2.n<Object>)new io.reactivex.internal.operators.maybe.a((r)h, (o)d)).y((Object)pd0.d.d$b.a.a);
            e.e((Object)c0, "{\n      predictionsRepos\u2026Single(Result.None)\n    }");
        }
        return nn0.a.V((c0)c0, (n20.d)this.h);
    }
    
    public static final class a implements t0
    {
        public final String a;
        public final boolean b;
        
        public a(final String a, final boolean b) {
            e.f((Object)a, "subredditName");
            this.a = a;
            this.b = b;
        }
    }
}
