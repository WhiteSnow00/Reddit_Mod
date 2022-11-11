// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import com.google.android.gms.internal.measurement.x;
import ie.s9;

public final class t4 implements Runnable
{
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ long i;
    public final /* synthetic */ u4 j;
    
    public t4(final u4 j, final String f, final String g, final String h, final long i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        ((s9)x.g.f.zza()).zza();
        if (this.j.a.J().V(null, r2.h0)) {
            final String f = this.f;
            if (f == null) {
                final g7 a = this.j.a;
                final String g = this.g;
                a.b().M();
                final String i = a.I;
                if (i == null || i.equals(g)) {
                    a.I = g;
                    a.H = null;
                }
                return;
            }
            final u5 h = new u5(this.h, f, this.i);
            final g7 a2 = this.j.a;
            final String g2 = this.g;
            a2.b().M();
            final String j = a2.I;
            if (j != null) {
                j.equals(g2);
            }
            a2.I = g2;
            a2.H = h;
        }
        else {
            if (this.f == null) {
                final y5 u = this.j.a.q.u();
                final String g3 = this.g;
                ((l2)u).M();
                synchronized (u) {
                    final String r = u.r;
                    if (r == null || r.equals(g3)) {
                        u.r = g3;
                    }
                    return;
                }
            }
            final y5 u2 = this.j.a.q.u();
            final String g4 = this.g;
            ((l2)u2).M();
            synchronized (u2) {
                final String r2 = u2.r;
                if (r2 != null) {
                    r2.equals(g4);
                }
                u2.r = g4;
            }
        }
    }
}
