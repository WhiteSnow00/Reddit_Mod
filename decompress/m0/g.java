// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import android.widget.EdgeEffect;
import android.graphics.Canvas;
import o1.p;
import aa1.a;
import o1.c;
import sg2.e;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import l1.f;
import androidx.compose.ui.platform.o0;

public final class g extends o0 implements f
{
    public final AndroidEdgeEffectOverscrollEffect g;
    
    public g(final AndroidEdgeEffectOverscrollEffect g, final l<? super n0, j> l) {
        e.f((Object)g, "overscrollEffect");
        e.f((Object)l, "inspectorInfo");
        super(l);
        this.g = g;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g && e.a((Object)this.g, (Object)((g)o).g));
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final void n0(final e2.f f) {
        f.g0();
        final AndroidEdgeEffectOverscrollEffect g = this.g;
        g.getClass();
        final p a = f.f.g.a();
        ((SnapshotMutableStateImpl)g.k).getValue();
        final Canvas a2 = c.a(a);
        final float q0 = aa1.a.q0(g.i);
        final boolean b = true;
        if (q0 != 0.0f) {
            g.j(f, g.i, a2);
            g.i.finish();
        }
        boolean i;
        if (!g.d.isFinished()) {
            i = g.i(f, g.d, a2);
            aa1.a.L0(g.i, aa1.a.q0(g.d), 0.0f);
        }
        else {
            i = false;
        }
        if (aa1.a.q0(g.g) != 0.0f) {
            g.h(f, g.g, a2);
            g.g.finish();
        }
        boolean b2 = i;
        if (!g.b.isFinished()) {
            final EdgeEffect b3 = g.b;
            final int save = a2.save();
            a2.translate(0.0f, f.M0(g.a.b.d()));
            final boolean draw = b3.draw(a2);
            a2.restoreToCount(save);
            b2 = (draw || i);
            aa1.a.L0(g.g, aa1.a.q0(g.b), 0.0f);
        }
        if (aa1.a.q0(g.j) != 0.0f) {
            g.i(f, g.j, a2);
            g.j.finish();
        }
        boolean b4 = b2;
        if (!g.e.isFinished()) {
            b4 = (g.j(f, g.e, a2) || b2);
            aa1.a.L0(g.j, aa1.a.q0(g.e), 0.0f);
        }
        if (aa1.a.q0(g.h) != 0.0f) {
            final EdgeEffect h = g.h;
            final int save2 = a2.save();
            a2.translate(0.0f, f.M0(g.a.b.d()));
            h.draw(a2);
            a2.restoreToCount(save2);
            g.h.finish();
        }
        int n = b4 ? 1 : 0;
        if (!g.c.isFinished()) {
            n = (b ? 1 : 0);
            if (!g.h(f, g.c, a2)) {
                if (b4) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
            aa1.a.L0(g.h, aa1.a.q0(g.c), 0.0f);
        }
        if (n != 0) {
            g.k();
        }
    }
    
    public final String toString() {
        final StringBuilder r = a.r("DrawOverscrollModifier(overscrollEffect=");
        r.append(this.g);
        r.append(')');
        return r.toString();
    }
}
