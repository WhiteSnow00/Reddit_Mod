// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import ra.m;
import ra.k;
import sa.w;
import sa.g;
import sa.d0;
import la.j;
import la.h;
import na.b;
import na.a;
import android.content.Context;
import com.google.android.datatransport.runtime.d;
import sa.v;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class c extends n
{
    public Provider<Executor> f;
    public na.c g;
    public Provider h;
    public Provider<v> i;
    public Provider<d> j;
    
    public c(final Context context) {
        this.f = (Provider<Executor>)a.a((b)ka.f.a.a);
        if (context != null) {
            final na.c g = new na.c((T)context);
            this.g = g;
            this.h = a.a(new j(g, new h(g)));
            final na.c g2 = this.g;
            final Provider a = na.a.a((b)new w(new d0((Provider)g2), new g((Provider)g2)));
            this.i = (Provider<v>)a;
            final qa.f f = new qa.f();
            final na.c g3 = this.g;
            final qa.g g4 = new qa.g((Provider)g3, a, f);
            final Provider<Executor> f2 = this.f;
            final Provider h = this.h;
            this.j = (Provider<d>)na.a.a((b)new o(new qa.d(f2, h, g4, a, a), new k((Provider)g3, h, a, g4, (Provider)f2, a, a), new m((Provider)f2, a, g4, a)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
