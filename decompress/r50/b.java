// 
// Decompiled by Procyon v0.6.0
// 

package r50;

import bd0.n;
import q20.d;
import ff2.h;
import af2.y;
import af2.t;
import java.util.Map;
import bd0.p;
import java.util.List;
import ff2.o;
import com.reddit.video.creation.widgets.adjustclips.trim.c;
import af2.c0;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import bd0.j;
import q20.a;
import bd0.k;

public final class b extends android.support.v4.media.b
{
    public final k g;
    public final a h;
    public final j i;
    public final cd0.a j;
    
    @Inject
    public b(final k g, final a h, final j i, final cd0.a j) {
        e.f((Object)g, "powerupsSettings");
        e.f((Object)h, "backgroundThread");
        e.f((Object)i, "powerupsRepository");
        e.f((Object)j, "powerupsFeatures");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final c0 f1(final v0 v0) {
        final b.b$a b$a = (b.b$a)v0;
        e.f((Object)b$a, "params");
        final t<Map> onErrorReturnItem = this.i.j(null).map((ff2.o<? super List<p>, ? extends Map>)new c(16)).onErrorReturnItem(kotlin.collections.c.u4());
        final boolean wc = this.j.Wc();
        int n = 0;
        final int n2 = 0;
        if (!wc) {
            if (this.g.u()) {
                n = 1;
            }
            else {
                int n3 = n2;
                if (this.g.Q() >= 2) {
                    n3 = 1;
                }
                n = (n3 ^ 0x1);
            }
        }
        c0<b$b$a> c0;
        if (n == 0) {
            c0 = af2.c0.v(b$b$a.a);
            e.e((Object)c0, "{\n      Single.just(Result.None)\n    }");
        }
        else {
            final t x = this.i.b().x();
            e.e((Object)x, "powerupsRepository.getSu\u2026edditName).toObservable()");
            final t<n> l = this.i.l();
            e.e((Object)onErrorReturnItem, "getTopSupportersRequest");
            final t<Object> combineLatest = t.combineLatest((af2.y<?>)x, (af2.y<?>)l, (af2.y<?>)onErrorReturnItem, (ff2.h<? super Object, ? super Object, ? super Object, ?>)new r50.c(b$a));
            e.b((Object)combineLatest, "Observable.combineLatest\u2026neFunction(t1, t2, t3) })");
            c0 = combineLatest.first(b$b$a.a);
            e.e((Object)c0, "{\n      Observables.comb\u2026.first(Result.None)\n    }");
        }
        return px1.a.K0((c0)c0, (d)this.h);
    }
}
