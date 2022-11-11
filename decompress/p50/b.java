// 
// Decompiled by Procyon v0.6.0
// 

package p50;

import n20.d;
import kf2.h;
import ff2.y;
import ff2.t;
import kotlin.collections.c;
import kf2.o;
import y30.m;
import ff2.c0;
import ff0.t0;
import javax.inject.Inject;
import sg2.e;
import bd0.k;
import bd0.l;
import bd0.a;

public final class b extends bd0.a
{
    public final l h;
    public final n20.a i;
    public final k j;
    public final cd0.a k;
    
    @Inject
    public b(final l h, final n20.a i, final k j, final cd0.a k) {
        e.f((Object)h, "powerupsSettings");
        e.f((Object)i, "backgroundThread");
        e.f((Object)j, "powerupsRepository");
        e.f((Object)k, "powerupsFeatures");
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final c0 b0(final t0 t0) {
        final a a = (a)t0;
        e.f((Object)a, "params");
        final t onErrorReturnItem = this.j.k(null).map((o)new m(4)).onErrorReturnItem((Object)c.V0());
        final boolean mc = this.k.Mc();
        final int n = 0;
        boolean b = false;
        int n2;
        if (mc) {
            n2 = n;
        }
        else if (this.h.u()) {
            n2 = 1;
        }
        else {
            if (this.h.Q() >= 2) {
                b = true;
            }
            n2 = ((b ^ true) ? 1 : 0);
        }
        c0<b.b$b.a> c0;
        if (n2 == 0) {
            c0 = ff2.c0.v(p50.b.b$b.a.a);
            e.e((Object)c0, "{\n      Single.just(Result.None)\n    }");
        }
        else {
            final t w = this.j.b().w();
            e.e((Object)w, "powerupsRepository.getSu\u2026edditName).toObservable()");
            final t<bd0.o> n3 = this.j.n();
            e.e((Object)onErrorReturnItem, "getTopSupportersRequest");
            final t combineLatest = t.combineLatest((y)w, (y)n3, (y)onErrorReturnItem, (h)new p50.c(a));
            e.b((Object)combineLatest, "Observable.combineLatest\u2026neFunction(t1, t2, t3) })");
            c0 = combineLatest.first((Object)p50.b.b$b.a.a);
            e.e((Object)c0, "{\n      Observables.comb\u2026.first(Result.None)\n    }");
        }
        return nn0.a.V((c0)c0, (d)this.i);
    }
    
    public static final class a implements t0
    {
    }
}
