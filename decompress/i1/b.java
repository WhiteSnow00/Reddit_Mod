// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.HashMap;
import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import ng2.e;
import cg2.j;
import mg2.l;
import androidx.compose.runtime.snapshots.SnapshotIdSet;

public final class b extends a
{
    public final a l;
    public boolean m;
    
    public b(final int n, final SnapshotIdSet set, final l<Object, j> l, final l<Object, j> i, final a j) {
        ng2.e.f((Object)set, "invalid");
        ng2.e.f((Object)j, "parent");
        super(n, set, l, i);
        (this.l = j).j(this);
    }
    
    @Override
    public final void c() {
        if (!super.c) {
            super.c();
            if (!this.m) {
                this.m = true;
                this.l.k(this);
            }
        }
    }
    
    @Override
    public final g t() {
        final a l = this.l;
        if (!l.k) {
            if (!l.c) {
                final Set<w> g = super.g;
                final int b = super.b;
                HashMap c;
                if (g != null) {
                    c = SnapshotKt.c(l, (a)this, l.e());
                }
                else {
                    c = null;
                }
                synchronized (SnapshotKt.c) {
                    SnapshotKt.d((f)this);
                    if (g != null && g.size()) {
                        final g v = this.v(this.l.d(), c, this.l.e());
                        if (!ng2.e.a((Object)v, (Object)i1.g.b.a)) {
                            return v;
                        }
                        Set<w> u;
                        if ((u = this.l.u()) == null) {
                            u = new HashSet<w>();
                            this.l.x((HashSet)u);
                        }
                        u.addAll(g);
                    }
                    else {
                        this.a();
                    }
                    if (this.l.d() < b) {
                        this.l.s();
                    }
                    final a i = this.l;
                    i.q(i.e().d(b).a(super.h));
                    this.l.w(b);
                    final a j = this.l;
                    final int d = super.d;
                    super.d = -1;
                    if (d >= 0) {
                        final int[] k = j.i;
                        ng2.e.f((Object)k, "<this>");
                        final int length = k.length;
                        final int[] copy = Arrays.copyOf(k, length + 1);
                        copy[length] = d;
                        j.i = copy;
                    }
                    else {
                        j.getClass();
                    }
                    final a m = this.l;
                    final SnapshotIdSet h = super.h;
                    m.getClass();
                    ng2.e.f((Object)h, "snapshots");
                    synchronized (SnapshotKt.c) {
                        m.h = m.h.g(h);
                        final j a = cg2.j.a;
                        monitorexit(SnapshotKt.c);
                        final a l2 = this.l;
                        final int[] i2 = super.i;
                        l2.getClass();
                        ng2.e.f((Object)i2, "handles");
                        if (i2.length != 0) {
                            final int[] i3 = l2.i;
                            if (i3.length == 0) {
                                l2.i = i2;
                            }
                            else {
                                final int length2 = i3.length;
                                final int length3 = i2.length;
                                final int[] copy2 = Arrays.copyOf(i3, length2 + length3);
                                System.arraycopy(i2, 0, copy2, length2, length3);
                                ng2.e.e((Object)copy2, "result");
                                l2.i = copy2;
                            }
                        }
                        monitorexit(SnapshotKt.c);
                        super.k = true;
                        if (!this.m) {
                            this.m = true;
                            this.l.k(this);
                        }
                        return (g)i1.g.b.a;
                    }
                }
            }
        }
        return new g.a(this);
    }
}
