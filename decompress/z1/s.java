// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import androidx.compose.ui.node.LayoutNode$b;
import java.util.Iterator;
import n1.c;
import yd.a;
import java.util.Collection;
import ah2.f;
import e2.b;
import z0.c1;
import androidx.compose.ui.node.LayoutNode;

public final class s
{
    public final LayoutNode a;
    public final c1 b;
    public final p c;
    public final b<t> d;
    public boolean e;
    
    public s(final LayoutNode a) {
        f.f((Object)a, "root");
        this.a = a;
        this.b = new c1(a.H);
        this.c = new p();
        this.d = (b<t>)new b();
    }
    
    public final int a(final q q, final w w, final boolean b) {
        f.f((Object)w, "positionCalculator");
        if (this.e) {
            return 0;
        }
        final int n = 1;
        try {
            this.e = true;
            final z1.f a = this.c.a(q, w);
            final Collection<o> values = a.a.values();
            boolean b2 = false;
            Label_0131: {
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    for (final o o : values) {
                        if (o.d || o.g) {
                            b2 = true;
                            break Label_0131;
                        }
                    }
                }
                b2 = false;
            }
            final boolean b3 = !b2;
            for (final o o2 : a.a.values()) {
                if (b3 || yd.a.H0(o2)) {
                    final boolean b4 = o2.h == 1;
                    final LayoutNode a2 = this.a;
                    final long c = o2.c;
                    final b<t> d = this.d;
                    final LayoutNode$b y = LayoutNode.Y;
                    a2.w(c, (b)d, b4, true);
                    if (!(this.d.isEmpty() ^ true)) {
                        continue;
                    }
                    this.b.b(o2.a, this.d);
                    this.d.clear();
                }
            }
            ((j)this.b.g).f();
            final boolean d2 = this.b.d(a, b);
            int n2 = 0;
            Label_0430: {
                if (!a.c) {
                    final Collection<o> values2 = a.a.values();
                    if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                        for (final o o3 : values2) {
                            f.f((Object)o3, "<this>");
                            if ((n1.c.a(yd.a.g2(o3, true), n1.c.b) ^ true) && o3.b()) {
                                n2 = n;
                                break Label_0430;
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
            return n3 | (d2 ? 1 : 0);
        }
        finally {
            this.e = false;
        }
    }
}
