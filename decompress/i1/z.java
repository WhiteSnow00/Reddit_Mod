// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.HashSet;
import java.util.Set;
import ah2.f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import pg2.j;
import zg2.l;

public final class z extends a
{
    public final a l;
    public final l<Object, j> m;
    public final l<Object, j> n;
    public final boolean o;
    public final boolean p;
    
    public z(final a l, final l<Object, j> m, final l<Object, j> n, final boolean o, final boolean p5) {
        final SnapshotIdSet j = SnapshotIdSet.j;
        l i;
        if (l == null || (i = l.e) == null) {
            i = ((a)SnapshotKt.i.get()).e;
        }
        final l k = SnapshotKt.j((l)m, i, o);
        l l2;
        if (l == null || (l2 = l.f) == null) {
            l2 = ((a)SnapshotKt.i.get()).f;
        }
        super(0, j, k, SnapshotKt.b((l)n, l2));
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
            f.e((Object)value, "currentGlobalSnapshot.get()");
            l = value;
        }
        return l;
    }
    
    public final void c() {
        ((i1.f)this).c = true;
        if (this.p) {
            final a l = this.l;
            if (l != null) {
                l.c();
            }
        }
    }
    
    public final int d() {
        return ((i1.f)this.A()).d();
    }
    
    public final SnapshotIdSet e() {
        return ((i1.f)this.A()).e();
    }
    
    public final boolean g() {
        return this.A().g();
    }
    
    public final void j(final i1.f f) {
        f.f((Object)f, "snapshot");
        i1.p.a();
        throw null;
    }
    
    public final void k(final i1.f f) {
        f.f((Object)f, "snapshot");
        i1.p.a();
        throw null;
    }
    
    public final void l() {
        this.A().l();
    }
    
    public final void m(final w w) {
        f.f((Object)w, "state");
        this.A().m(w);
    }
    
    public final void p(final int n) {
        i1.p.a();
        throw null;
    }
    
    public final void q(final SnapshotIdSet set) {
        f.f((Object)set, "value");
        i1.p.a();
        throw null;
    }
    
    public final i1.f r(final l<Object, j> l) {
        final l j = SnapshotKt.j((l)l, super.e, true);
        i1.f f;
        if (!this.o) {
            f = SnapshotKt.g(this.A().r((l)null), j, true);
        }
        else {
            f = this.A().r(j);
        }
        return f;
    }
    
    public final g t() {
        return this.A().t();
    }
    
    public final Set<w> u() {
        return this.A().u();
    }
    
    public final void x(final HashSet set) {
        i1.p.a();
        throw null;
    }
    
    public final a y(final l<Object, j> l, final l<Object, j> i) {
        final l j = SnapshotKt.j((l)l, super.e, true);
        final l b = SnapshotKt.b((l)i, super.f);
        a y;
        if (!this.o) {
            y = new z(this.A().y((l)null, b), (l<Object, j>)j, (l<Object, j>)b, false, true);
        }
        else {
            y = this.A().y(j, b);
        }
        return y;
    }
}
