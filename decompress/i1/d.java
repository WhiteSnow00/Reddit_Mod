// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import ng2.e;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import cg2.j;
import mg2.l;

public final class d extends f
{
    public final l<Object, j> e;
    public int f;
    
    public d(final int n, final SnapshotIdSet set, final l<Object, j> e) {
        ng2.e.f((Object)set, "invalid");
        super(n, set);
        this.e = e;
        this.f = 1;
    }
    
    public final void c() {
        if (!super.c) {
            this.k(this);
            super.c();
        }
    }
    
    public final l<Object, j> f() {
        return this.e;
    }
    
    public final boolean g() {
        return true;
    }
    
    public final l<Object, j> h() {
        return null;
    }
    
    public final void j(final f f) {
        ng2.e.f((Object)f, "snapshot");
        ++this.f;
    }
    
    public final void k(final f f) {
        ng2.e.f((Object)f, "snapshot");
        final int f2 = this.f - 1;
        this.f = f2;
        if (f2 == 0) {
            this.a();
        }
    }
    
    public final void l() {
    }
    
    public final void m(final w w) {
        ng2.e.f((Object)w, "state");
        final l a = SnapshotKt.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }
    
    public final f r(final l<Object, j> l) {
        SnapshotKt.d((f)this);
        return (f)new NestedReadonlySnapshot(super.b, super.a, (l)l, (f)this);
    }
}
