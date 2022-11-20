// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.snapshots;

import i1.g;
import i1.p;
import ng2.e;
import i1.f;
import java.util.ArrayList;
import cg2.j;
import mg2.l;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import i1.a;

public final class GlobalSnapshot extends a
{
    public GlobalSnapshot(final int n, final SnapshotIdSet set) {
        synchronized (SnapshotKt.c) {
            final ArrayList h = SnapshotKt.h;
            ArrayList j5;
            if (h.isEmpty() ^ true) {
                j5 = CollectionsKt___CollectionsKt.J5((Collection)h);
            }
            else {
                j5 = null;
            }
            Object o;
            if (j5 != null) {
                if ((o = CollectionsKt___CollectionsKt.v5((List)j5)) == null) {
                    o = new GlobalSnapshot$1$1$1((List)j5);
                }
            }
            else {
                o = null;
            }
            monitorexit(SnapshotKt.c);
            super(n, set, null, (l<Object, j>)o);
        }
    }
    
    @Override
    public final void c() {
        synchronized (SnapshotKt.c) {
            final int d = super.d;
            if (d >= 0) {
                SnapshotKt.s(d);
                super.d = -1;
            }
            final j a = cg2.j.a;
        }
    }
    
    @Override
    public final void j(final f f) {
        ng2.e.f((Object)f, "snapshot");
        p.a();
        throw null;
    }
    
    @Override
    public final void k(final f f) {
        ng2.e.f((Object)f, "snapshot");
        p.a();
        throw null;
    }
    
    @Override
    public final void l() {
        SnapshotKt.a();
    }
    
    @Override
    public final f r(final l<Object, j> l) {
        final GlobalSnapshot$takeNestedSnapshot$1 globalSnapshot$takeNestedSnapshot$1 = new GlobalSnapshot$takeNestedSnapshot$1((l)l);
        final l a = SnapshotKt.a;
        return (f)SnapshotKt.f((l)new SnapshotKt$takeNewSnapshot$1((l)globalSnapshot$takeNestedSnapshot$1));
    }
    
    @Override
    public final g t() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
    
    @Override
    public final a y(final l<Object, j> l, final l<Object, j> i) {
        final GlobalSnapshot$takeNestedMutableSnapshot$1 globalSnapshot$takeNestedMutableSnapshot$1 = new GlobalSnapshot$takeNestedMutableSnapshot$1((l)l, (l)i);
        final l a = SnapshotKt.a;
        return (a)SnapshotKt.f((l)new SnapshotKt$takeNewSnapshot$1((l)globalSnapshot$takeNestedMutableSnapshot$1));
    }
}
