// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.HashSet;
import java.util.Set;
import ng2.e;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import cg2.j;
import mg2.l;

public final class z extends a
{
    public final a l;
    public final l<Object, j> m;
    public final l<Object, j> n;
    public final boolean o;
    public final boolean p;
    
    public z(final a l, final l<Object, j> m, final l<Object, j> n, final boolean o, final boolean p5) {
        final SnapshotIdSet j = SnapshotIdSet.j;
        l<Object, j> i;
        if (l == null || (i = l.e) == null) {
            i = SnapshotKt.i.get().e;
        }
        final l k = SnapshotKt.k((l)m, (l)i, o);
        l<Object, j> l2;
        if (l == null || (l2 = l.f) == null) {
            l2 = SnapshotKt.i.get().f;
        }
        super(0, j, (l<Object, j>)k, (l<Object, j>)SnapshotKt.b((l)n, (l)l2));
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p5;
    }
    
    public final a A() {
        a l;
        if ((l = this.l) == null) {
            final a value = SnapshotKt.i.get();
            ng2.e.e((Object)value, "currentGlobalSnapshot.get()");
            l = value;
        }
        return l;
    }
    
    @Override
    public final void c() {
        super.c = true;
        if (this.p) {
            final a l = this.l;
            if (l != null) {
                l.c();
            }
        }
    }
    
    public final int d() {
        return this.A().d();
    }
    
    public final SnapshotIdSet e() {
        return this.A().e();
    }
    
    @Override
    public final boolean g() {
        return this.A().g();
    }
    
    @Override
    public final void j(final f f) {
        ng2.e.f((Object)f, "snapshot");
        i1.p.a();
        throw null;
    }
    
    @Override
    public final void k(final f f) {
        ng2.e.f((Object)f, "snapshot");
        i1.p.a();
        throw null;
    }
    
    @Override
    public final void l() {
        this.A().l();
    }
    
    @Override
    public final void m(final w w) {
        ng2.e.f((Object)w, "state");
        this.A().m(w);
    }
    
    public final void p(final int n) {
        i1.p.a();
        throw null;
    }
    
    public final void q(final SnapshotIdSet set) {
        ng2.e.f((Object)set, "value");
        i1.p.a();
        throw null;
    }
    
    @Override
    public final f r(final l<Object, j> l) {
        final l k = SnapshotKt.k((l)l, super.e, true);
        f f;
        if (!this.o) {
            f = SnapshotKt.g(this.A().r(null), k, true);
        }
        else {
            f = this.A().r((l<Object, j>)k);
        }
        return f;
    }
    
    @Override
    public final g t() {
        return this.A().t();
    }
    
    @Override
    public final Set<w> u() {
        return this.A().u();
    }
    
    @Override
    public final void x(final HashSet set) {
        i1.p.a();
        throw null;
    }
    
    @Override
    public final a y(final l<Object, j> l, final l<Object, j> i) {
        final l k = SnapshotKt.k((l)l, super.e, true);
        final l b = SnapshotKt.b((l)i, super.f);
        a y;
        if (!this.o) {
            y = new z(this.A().y(null, (l<Object, j>)b), (l<Object, j>)k, (l<Object, j>)b, false, true);
        }
        else {
            y = this.A().y((l<Object, j>)k, (l<Object, j>)b);
        }
        return y;
    }
}
