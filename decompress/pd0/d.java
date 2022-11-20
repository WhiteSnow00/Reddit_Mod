// 
// Decompiled by Procyon v0.6.0
// 

package pd0;

import af2.n;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.o;
import af2.r;
import af2.c0;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import od0.c;
import q20.a;
import android.support.v4.media.b;

public final class d extends b
{
    public final q20.a g;
    public final c h;
    
    @Inject
    public d(final q20.a g, final c h) {
        e.f((Object)g, "backgroundThread");
        e.f((Object)h, "predictionsRepository");
        this.g = g;
        this.h = h;
    }
    
    public final c0 f1(final v0 v0) {
        final a a = (a)v0;
        e.f((Object)a, "params");
        c0<d.d$b.a> c0;
        if (!a.b) {
            c0 = af2.c0.v(d.d$b.a.a);
            e.e((Object)c0, "{\n      Single.just(Result.None)\n    }");
        }
        else {
            final n f = this.h.f(a.a);
            final com.reddit.video.creation.widgets.adjustclips.trim.c c2 = new com.reddit.video.creation.widgets.adjustclips.trim.c(25);
            f.getClass();
            c0 = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)f, (o)c2)).z(d.d$b.a.a);
            e.e((Object)c0, "{\n      predictionsRepos\u2026Single(Result.None)\n    }");
        }
        return px1.a.K0((c0)c0, (q20.d)this.g);
    }
    
    public static final class a implements v0
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
