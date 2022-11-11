// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final class s4 implements Callable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    
    @Override
    public final Object call() {
        switch (this.f) {
            default: {
                final b4 b4 = (b4)this.h;
                final String g = this.g;
                final k h = b4.g.h;
                g7.H((b7)h);
                final x4 g2 = h.g0(g);
                final HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", g);
                ((h4)b4.f).l.R();
                hashMap.put("gmp_version", 68000L);
                if (g2 != null) {
                    final String x = g2.x();
                    if (x != null) {
                        hashMap.put("app_version", x);
                    }
                    hashMap.put("app_version_int", g2.s());
                    g2.a.b().M();
                    hashMap.put("dynamite_version", g2.s);
                }
                return hashMap;
            }
            case 0: {
                ((u4)this.h).a.a();
                final k h2 = ((u4)this.h).a.h;
                g7.H((b7)h2);
                return h2.q0(this.g);
            }
        }
    }
}
