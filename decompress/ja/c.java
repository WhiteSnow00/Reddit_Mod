// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import qa.l;
import pa.f;
import ra.w;
import ra.g;
import ra.d0;
import ka.j;
import ka.h;
import ma.b;
import ma.a;
import android.content.Context;
import com.google.android.datatransport.runtime.d;
import ra.v;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class c extends n
{
    public Provider<Executor> f;
    public ma.c g;
    public Provider h;
    public Provider<v> i;
    public Provider<d> j;
    
    public c(final Context context) {
        this.f = (Provider<Executor>)a.a((b)f$a.a);
        if (context != null) {
            final ma.c g = new ma.c((Object)context);
            this.g = g;
            this.h = a.a((b)new j(g, new h(g)));
            final ma.c g2 = this.g;
            final Provider a = ma.a.a((b)new w(new d0((Provider)g2), new g((Provider<Context>)g2)));
            this.i = (Provider<v>)a;
            final f f = new f();
            final ma.c g3 = this.g;
            final pa.g g4 = new pa.g((Provider)g3, a, f);
            final Provider<Executor> f2 = this.f;
            final Provider h = this.h;
            this.j = (Provider<d>)ma.a.a((b)new o(new pa.d(f2, h, g4, a, a), new l((Provider)g3, h, a, g4, f2, a, a), new qa.n(f2, a, g4, a)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
