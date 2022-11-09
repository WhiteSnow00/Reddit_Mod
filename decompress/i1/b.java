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
import ah2.f;
import pg2.j;
import zg2.l;
import androidx.compose.runtime.snapshots.SnapshotIdSet;

public final class b extends a
{
    public final a l;
    public boolean m;
    
    public b(final int n, final SnapshotIdSet set, final l<Object, j> l, final l<Object, j> i, final a j) {
        f.f((Object)set, "invalid");
        f.f((Object)j, "parent");
        super(n, set, (l)l, (l)i);
        (this.l = j).j((i1.f)this);
    }
    
    public final void c() {
        if (!((i1.f)this).c) {
            super.c();
            if (!this.m) {
                this.m = true;
                this.l.k((i1.f)this);
            }
        }
    }
    
    public final g t() {
        final a l = this.l;
        if (!l.k) {
            if (!((i1.f)l).c) {
                final Set g = super.g;
                final int b = ((i1.f)this).b;
                HashMap c;
                if (g != null) {
                    c = SnapshotKt.c(l, (a)this, ((i1.f)l).e());
                }
                else {
                    c = null;
                }
                synchronized (SnapshotKt.c) {
                    SnapshotKt.d((i1.f)this);
                    if (g != null && g.size() != 0) {
                        final g v = this.v(((i1.f)this.l).d(), c, ((i1.f)this.l).e());
                        if (!f.a((Object)v, (Object)g$b.a)) {
                            return v;
                        }
                        Set u;
                        if ((u = this.l.u()) == null) {
                            u = new HashSet();
                            this.l.x((HashSet)u);
                        }
                        u.addAll(g);
                    }
                    else {
                        ((i1.f)this).a();
                    }
                    if (((i1.f)this.l).d() < b) {
                        this.l.s();
                    }
                    final a i = this.l;
                    ((i1.f)i).q(((i1.f)i).e().d(b).a(super.h));
                    this.l.w(b);
                    final a j = this.l;
                    final int d = ((i1.f)this).d;
                    ((i1.f)this).d = -1;
                    if (d >= 0) {
                        final int[] k = j.i;
                        f.f((Object)k, "<this>");
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
                    f.f((Object)h, "snapshots");
                    synchronized (SnapshotKt.c) {
                        m.h = m.h.i(h);
                        final j a = pg2.j.a;
                        monitorexit(SnapshotKt.c);
                        final a l2 = this.l;
                        final int[] i2 = super.i;
                        l2.getClass();
                        f.f((Object)i2, "handles");
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
                                f.e((Object)copy2, "result");
                                l2.i = copy2;
                            }
                        }
                        monitorexit(SnapshotKt.c);
                        super.k = true;
                        if (!this.m) {
                            this.m = true;
                            this.l.k((i1.f)this);
                        }
                        return (g)g$b.a;
                    }
                }
            }
        }
        return (g)new g$a((i1.f)this);
    }
}
