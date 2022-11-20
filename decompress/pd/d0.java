// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.IInterface;
import android.os.IBinder;
import qd.k0;
import nd.b;
import qd.k1;
import qd.i;
import android.util.Log;
import ue.l;

public final class d0 extends n0
{
    public final h0 b;
    public final l c;
    
    public d0(final h0 h0, final h0 b, final l c) {
        this.b = b;
        this.c = c;
        super((m0)h0);
    }
    
    public final void a() {
        final h0 b = this.b;
        final l c = this.c;
        final boolean b2 = false;
        if (b.n(0)) {
            final b g = c.g;
            if (g.q()) {
                final k0 h = c.h;
                mg.d0.y((Object)h);
                final b h2 = h.h;
                if (!h2.q()) {
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(h2)), (Throwable)new Exception());
                    b.k(h2);
                }
                else {
                    b.n = true;
                    final IBinder g2 = h.g;
                    Object o;
                    if (g2 == null) {
                        o = null;
                    }
                    else {
                        final int a = i.a.a;
                        final IInterface queryLocalInterface = g2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof i) {
                            o = queryLocalInterface;
                        }
                        else {
                            o = new k1(g2);
                        }
                    }
                    mg.d0.y(o);
                    b.o = (i)o;
                    b.p = h.i;
                    b.q = h.j;
                    b.m();
                }
            }
            else {
                int n = b2 ? 1 : 0;
                if (b.l) {
                    n = (b2 ? 1 : 0);
                    if (!g.g()) {
                        n = 1;
                    }
                }
                if (n != 0) {
                    b.h();
                    b.m();
                }
                else {
                    b.k(g);
                }
            }
        }
    }
}
