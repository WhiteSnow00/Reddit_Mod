// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.IInterface;
import android.os.IBinder;
import pd.l0;
import pd.l1;
import pd.j;
import pd.j$a;
import android.util.Log;
import lw0.b;
import te.l;

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
            final md.b g = c.g;
            if (g.x()) {
                final l0 h = c.h;
                lw0.b.R((Object)h);
                final md.b h2 = h.h;
                if (!h2.x()) {
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
                        final int a = j$a.a;
                        final IInterface queryLocalInterface = g2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof j) {
                            o = queryLocalInterface;
                        }
                        else {
                            o = new l1(g2);
                        }
                    }
                    lw0.b.R(o);
                    b.o = (j)o;
                    b.p = h.i;
                    b.q = h.j;
                    b.m();
                }
            }
            else {
                int n = b2 ? 1 : 0;
                if (b.l) {
                    n = (b2 ? 1 : 0);
                    if (!g.q()) {
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
