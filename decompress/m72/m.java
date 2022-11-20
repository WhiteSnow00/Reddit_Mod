// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import af2.c0;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.g;
import af2.g0;
import wq.i;
import ff2.o;
import af2.t;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import com.reddit.domain.model.streaming.StreamingEntryPointType;
import q20.a;
import xd0.e0;
import android.support.v4.media.b;

public final class m extends b
{
    public static final m.m$a k;
    public final e0 g;
    public final a h;
    public final c i;
    public final StreamingEntryPointType j;
    
    static {
        k = new m.m$a(5L, 5L);
    }
    
    @Inject
    public m(final e0 g, final a h, final c i, final StreamingEntryPointType j) {
        e.f((Object)g, "repository");
        e.f((Object)h, "backgroundThread");
        e.f((Object)i, "getConfiguration");
        e.f((Object)j, "entryPointType");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final t S2(final v0 v0) {
        final m.m$b m$b = (m.m$b)v0;
        final c i = this.i;
        final c$a c$a = new c$a(this.j, m$b.b);
        i.getClass();
        final c0 w = i.f1((v0)c$a).w((o)new q61.b(8));
        final i j = new i(4);
        w.getClass();
        final c0 b = RxJavaPlugins.onAssembly((c0)new pf2.e((g0)w, (g)j)).B((o)new tf0.a(23));
        final q61.a a = new q61.a(12);
        b.getClass();
        final t onErrorReturn = RxJavaPlugins.onAssembly((t)new SingleFlatMapObservable((g0)b, (o)a)).flatMap((o)new i40.b(10, (Object)this, (Object)m$b)).onErrorReturn((o)new q61.b(9));
        e.e((Object)onErrorReturn, "getConfiguration.execute\u2026  .onErrorReturn { Unit }");
        return px0.c.T2((t)onErrorReturn, this.h);
    }
}
