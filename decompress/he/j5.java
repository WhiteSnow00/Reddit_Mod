// 
// Decompiled by Procyon v0.6.0
// 

package he;

import ai2.h;
import mg.d0;
import ih.i;
import com.google.android.gms.internal.firebase-auth-api.o0;

public final class j5 implements j2, jc
{
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    
    public j5(final o0 f, final k5 g, final f5 i, final g5 h) {
        this.f = f;
        this.g = g;
        this.i = i;
        this.h = h;
    }
    
    public j5(final q5 i, final String f, final String g, final r5 h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a(final String s) {
        ((r5)this.h).d(ih.i.a(s));
    }
    
    public final void c(final cc cc) {
        final bd bd = (bd)cc;
        final kd kd = new kd();
        final String g = bd.g;
        d0.v(g);
        kd.f = g;
        final String g2 = (String)this.f;
        if (g2 == null) {
            kd.i.g.add("EMAIL");
        }
        else {
            kd.g = g2;
        }
        final String h = (String)this.g;
        if (h == null) {
            kd.i.g.add("PASSWORD");
        }
        else {
            kd.h = h;
        }
        final q5 q5 = (q5)this.i;
        final r5 r5 = (r5)this.h;
        d0.y((Object)r5);
        ((h)q5.f).l0(new f2(bd.g), (jc)new hb(q5, r5, (jc)this, bd, kd));
    }
}
