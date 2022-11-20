// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import androidx.compose.ui.node.LayoutNode$c;
import java.util.Iterator;
import n1.c;
import a01.a;
import java.util.Collection;
import ng2.e;
import e2.e0;
import androidx.compose.ui.node.LayoutNode;

public final class t
{
    public final LayoutNode a;
    public final f b;
    public final q c;
    public final e2.f<e0> d;
    public boolean e;
    
    public t(final LayoutNode a) {
        ng2.e.f((Object)a, "root");
        this.a = a;
        this.b = new f(a.G.b);
        this.c = new q();
        this.d = (e2.f<e0>)new e2.f();
    }
    
    public final int a(final r r, final y y, final boolean b) {
        ng2.e.f((Object)y, "positionCalculator");
        if (this.e) {
            return 0;
        }
        final int n = 1;
        try {
            this.e = true;
            final g a = this.c.a(r, y);
            final Collection<p> values = a.a.values();
            boolean b2 = false;
            Label_0131: {
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    for (final p p3 : values) {
                        if (p3.d || p3.g) {
                            b2 = true;
                            break Label_0131;
                        }
                    }
                }
                b2 = false;
            }
            final boolean b3 = !b2;
            for (final p p4 : a.a.values()) {
                if (b3 || a01.a.u(p4)) {
                    final boolean b4 = p4.h == 1;
                    final LayoutNode a2 = this.a;
                    final long c = p4.c;
                    final e2.f<e0> d = this.d;
                    final LayoutNode$c r2 = LayoutNode.R;
                    a2.A(c, (e2.f)d, b4, true);
                    if (!(this.d.isEmpty() ^ true)) {
                        continue;
                    }
                    this.b.d(p4.a, this.d);
                    this.d.clear();
                }
            }
            ((k)this.b.h).f();
            final boolean e = this.b.e(a, b);
            int n2 = 0;
            Label_0428: {
                if (!a.c) {
                    final Collection<p> values2 = a.a.values();
                    if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                        for (final p p5 : values2) {
                            ng2.e.f((Object)p5, "<this>");
                            if ((n1.c.c(a01.a.T(p5, true), n1.c.b) ^ true) && p5.b()) {
                                n2 = n;
                                break Label_0428;
                            }
                        }
                    }
                }
                n2 = 0;
            }
            int n3;
            if (n2 != 0) {
                n3 = 2;
            }
            else {
                n3 = 0;
            }
            this.e = false;
            return n3 | (e ? 1 : 0);
        }
        finally {
            this.e = false;
        }
    }
    
    public final void b() {
        if (!this.e) {
            this.c.a.clear();
            final f b = this.b;
            ((k)b.h).c();
            ((k)b.h).a.f();
        }
    }
}
