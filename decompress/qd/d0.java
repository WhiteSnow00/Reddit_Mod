// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.IInterface;
import android.os.IBinder;
import rd.k0;
import od.b;
import rd.k1;
import rd.j;
import android.util.Log;
import yd.a;
import ve.l;

public final class d0 extends n0
{
    public final /* synthetic */ h0 b;
    public final /* synthetic */ l c;
    
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
            if (g.j()) {
                final k0 h = c.h;
                a.S0((Object)h);
                final b h2 = h.h;
                if (!h2.j()) {
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(h2)), (Throwable)new Exception());
                    b.k(h2);
                }
                else {
                    b.n = true;
                    final IBinder g2 = h.g;
                    j o;
                    if (g2 == null) {
                        o = null;
                    }
                    else {
                        final int a = j.a.a;
                        final IInterface queryLocalInterface = g2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof j) {
                            o = (j)queryLocalInterface;
                        }
                        else {
                            o = new k1(g2);
                        }
                    }
                    a.S0((Object)o);
                    b.o = o;
                    b.p = h.i;
                    b.q = h.j;
                    b.m();
                }
            }
            else {
                int n = b2 ? 1 : 0;
                if (b.l) {
                    n = (b2 ? 1 : 0);
                    if (!g.f()) {
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
