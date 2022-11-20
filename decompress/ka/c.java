// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import ra.n;
import ra.k;
import qa.g;
import sa.v;
import qa.f;
import sa.c0;
import la.j;
import la.h;
import ua.b$a;
import na.b;
import na.a;
import android.content.Context;
import com.google.android.datatransport.runtime.d;
import sa.u;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class c extends m
{
    public Provider<Executor> f;
    public na.c g;
    public Provider h;
    public Provider<u> i;
    public Provider<d> j;
    
    public c(final Context context) {
        this.f = (Provider<Executor>)a.a((b)f$a.a);
        if (context != null) {
            final na.c g = new na.c((Object)context);
            this.g = g;
            final ua.b a = b$a.a;
            this.h = na.a.a((b)new j(g, new h(g)));
            final na.c g2 = this.g;
            final Provider a2 = na.a.a((b)new v(new c0((Provider)g2), new f((Provider)g2, 1)));
            this.i = (Provider<u>)a2;
            final f f = new f((Provider)a, 0);
            final na.c g3 = this.g;
            final g g4 = new g((Provider)g3, a2, f);
            final Provider<Executor> f2 = this.f;
            final Provider h = this.h;
            this.j = (Provider<d>)na.a.a((b)new ka.n(new qa.d((Provider)f2, h, g4, a2, a2), new k((Provider)g3, h, a2, g4, (Provider)f2, a2, a2), new n((Provider)f2, a2, g4, a2)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
