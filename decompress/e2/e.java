// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import androidx.compose.ui.layout.AlignmentLineKt;
import java.util.Map;
import lw0.b;
import n1.c;
import c2.h;
import androidx.compose.ui.node.LayoutNodeWrapper;
import c2.a;
import java.util.HashMap;
import androidx.compose.ui.node.LayoutNode;

public final class e
{
    public final LayoutNode a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public LayoutNode h;
    public final HashMap i;
    
    public e(final LayoutNode a) {
        sg2.e.f((Object)a, "layoutNode");
        this.a = a;
        this.b = true;
        this.i = new HashMap();
    }
    
    public static final void b(final e e, final a a, int n, LayoutNodeWrapper layoutNodeWrapper) {
        final float n2 = (float)n;
        long n3 = wd.a.f(n2, n2);
        while (true) {
            n3 = layoutNodeWrapper.o1(n3);
            final LayoutNodeWrapper k = layoutNodeWrapper.k;
            e.c((Object)k);
            if (e.a((Object)k, (Object)e.a.H)) {
                break;
            }
            layoutNodeWrapper = k;
            if (!k.V0().c().containsKey(a)) {
                continue;
            }
            final float n4 = (float)k.o(a);
            n3 = wd.a.f(n4, n4);
            layoutNodeWrapper = k;
        }
        if (a instanceof h) {
            n = b.k2(c.d(n3));
        }
        else {
            n = b.k2(c.c(n3));
        }
        final HashMap i = e.i;
        int intValue = n;
        if (i.containsKey(a)) {
            final int intValue2 = ((Number)kotlin.collections.c.W0((Map)e.i, (Object)a)).intValue();
            final h a2 = AlignmentLineKt.a;
            e.f((Object)a, "<this>");
            intValue = ((Number)a.a.invoke(intValue2, n)).intValue();
        }
        i.put(a, intValue);
    }
    
    public final boolean a() {
        return this.c || this.e || this.f || this.g;
    }
    
    public final void c() {
        LayoutNode h = null;
        Label_0125: {
            if (this.a()) {
                h = this.a;
            }
            else {
                final LayoutNode t = this.a.t();
                if (t == null) {
                    return;
                }
                h = t.y.h;
                if (h == null || !h.y.a()) {
                    final LayoutNode h2 = this.h;
                    if (h2 == null) {
                        return;
                    }
                    if (h2.y.a()) {
                        return;
                    }
                    final LayoutNode t2 = h2.t();
                    if (t2 != null) {
                        final e y = t2.y;
                        if (y != null) {
                            y.c();
                        }
                    }
                    final LayoutNode t3 = h2.t();
                    if (t3 != null) {
                        final e y2 = t3.y;
                        if (y2 != null) {
                            h = y2.h;
                            break Label_0125;
                        }
                    }
                    h = null;
                }
            }
        }
        this.h = h;
    }
}
