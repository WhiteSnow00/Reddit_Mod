// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import mg2.l;
import androidx.compose.ui.layout.AlignmentLineKt;
import java.util.Map;
import n1.c;
import c2.h;
import ng2.e;
import java.util.HashMap;
import e2.a;

public abstract class AlignmentLines
{
    public final a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public a h;
    public final HashMap i;
    
    public AlignmentLines(final a a) {
        this.a = a;
        this.b = true;
        this.i = new HashMap();
    }
    
    public static final void a(final AlignmentLines alignmentLines, final c2.a a, int n, NodeCoordinator nodeCoordinator) {
        alignmentLines.getClass();
        final float n2 = (float)n;
        long n3 = vl.a.T(n2, n2);
        while (true) {
            n3 = alignmentLines.b(nodeCoordinator, n3);
            final NodeCoordinator n4 = nodeCoordinator.n;
            e.c((Object)n4);
            if (e.a((Object)n4, (Object)alignmentLines.a.Z())) {
                break;
            }
            nodeCoordinator = n4;
            if (!alignmentLines.c(n4).containsKey(a)) {
                continue;
            }
            final float n5 = (float)alignmentLines.d(n4, a);
            n3 = vl.a.T(n5, n5);
            nodeCoordinator = n4;
        }
        if (a instanceof h) {
            n = p7.a.W(c.f(n3));
        }
        else {
            n = p7.a.W(c.e(n3));
        }
        final HashMap i = alignmentLines.i;
        int intValue = n;
        if (i.containsKey(a)) {
            final int intValue2 = ((Number)kotlin.collections.c.v4((Map)alignmentLines.i, (Object)a)).intValue();
            final h a2 = AlignmentLineKt.a;
            e.f((Object)a, "<this>");
            intValue = ((Number)a.a.invoke((Object)intValue2, (Object)n)).intValue();
        }
        i.put(a, intValue);
    }
    
    public abstract long b(final NodeCoordinator p0, final long p1);
    
    public abstract Map<c2.a, Integer> c(final NodeCoordinator p0);
    
    public abstract int d(final NodeCoordinator p0, final c2.a p1);
    
    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }
    
    public final boolean f() {
        this.i();
        return this.h != null;
    }
    
    public final void g() {
        this.b = true;
        final a v = this.a.v();
        if (v == null) {
            return;
        }
        if (this.c) {
            v.n();
        }
        else if (this.e || this.d) {
            v.requestLayout();
        }
        if (this.f) {
            this.a.n();
        }
        if (this.g) {
            v.requestLayout();
        }
        v.c().g();
    }
    
    public final void h() {
        this.i.clear();
        this.a.g((l)new AlignmentLines$recalculate$1(this));
        this.i.putAll(this.c((NodeCoordinator)this.a.Z()));
        this.b = false;
    }
    
    public final void i() {
        a h = null;
        Label_0141: {
            if (this.e()) {
                h = this.a;
            }
            else {
                final a v = this.a.v();
                if (v == null) {
                    return;
                }
                h = v.c().h;
                if (h == null || !h.c().e()) {
                    final a h2 = this.h;
                    if (h2 == null) {
                        return;
                    }
                    if (h2.c().e()) {
                        return;
                    }
                    final a v2 = h2.v();
                    if (v2 != null) {
                        final AlignmentLines c = v2.c();
                        if (c != null) {
                            c.i();
                        }
                    }
                    final a v3 = h2.v();
                    if (v3 != null) {
                        final AlignmentLines c2 = v3.c();
                        if (c2 != null) {
                            h = c2.h;
                            break Label_0141;
                        }
                    }
                    h = null;
                }
            }
        }
        this.h = h;
    }
}
