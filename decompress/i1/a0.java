// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import ng2.e;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import cg2.j;
import mg2.l;

public final class a0 extends f
{
    public final f e;
    public final boolean f;
    public final boolean g;
    public final l<Object, j> h;
    
    public a0(final f e, final l l, final boolean g) {
        super(0, SnapshotIdSet.j);
        this.e = e;
        this.f = false;
        this.g = g;
        l i;
        if (e == null || (i = e.f()) == null) {
            i = SnapshotKt.i.get().e;
        }
        this.h = (l<Object, j>)SnapshotKt.k(l, i, false);
    }
    
    public final void c() {
        super.c = true;
        if (this.g) {
            final f e = this.e;
            if (e != null) {
                e.c();
            }
        }
    }
    
    public final int d() {
        return this.s().d();
    }
    
    public final SnapshotIdSet e() {
        return this.s().e();
    }
    
    public final l<Object, j> f() {
        return this.h;
    }
    
    public final boolean g() {
        return this.s().g();
    }
    
    public final l<Object, j> h() {
        return null;
    }
    
    public final void j(final f f) {
        ng2.e.f((Object)f, "snapshot");
        p.a();
        throw null;
    }
    
    public final void k(final f f) {
        ng2.e.f((Object)f, "snapshot");
        p.a();
        throw null;
    }
    
    public final void l() {
        this.s().l();
    }
    
    public final void m(final w w) {
        ng2.e.f((Object)w, "state");
        this.s().m(w);
    }
    
    public final f r(final l<Object, j> l) {
        final l k = SnapshotKt.k((l)l, (l)this.h, true);
        f f;
        if (!this.f) {
            f = SnapshotKt.g(this.s().r((l)null), k, true);
        }
        else {
            f = this.s().r(k);
        }
        return f;
    }
    
    public final f s() {
        f e;
        if ((e = this.e) == null) {
            final f value = SnapshotKt.i.get();
            ng2.e.e((Object)value, "currentGlobalSnapshot.get()");
            e = value;
        }
        return e;
    }
}
