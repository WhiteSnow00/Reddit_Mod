// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import e2.c0;
import a1.d;
import androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap;
import ng2.e;
import mg2.a;
import cg2.j;
import mg2.l;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;

public final class OwnerSnapshotObserver
{
    public final SnapshotStateObserver a;
    public final l<LayoutNode, j> b;
    public final l<LayoutNode, j> c;
    public final l<LayoutNode, j> d;
    public final l<LayoutNode, j> e;
    public final l<LayoutNode, j> f;
    public final l<LayoutNode, j> g;
    
    public OwnerSnapshotObserver(final l<? super a<j>, j> l) {
        this.a = new SnapshotStateObserver((l)l);
        this.b = (l<LayoutNode, j>)OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;
        this.c = (l<LayoutNode, j>)OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;
        this.d = (l<LayoutNode, j>)OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
        this.e = (l<LayoutNode, j>)OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;
        this.f = (l<LayoutNode, j>)OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.INSTANCE;
        this.g = (l<LayoutNode, j>)OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1.INSTANCE;
    }
    
    public final void a() {
        final SnapshotStateObserver a = this.a;
        final OwnerSnapshotObserver$clearInvalidObservations$1 instance = OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE;
        a.getClass();
        ng2.e.f((Object)instance, "predicate");
        synchronized (a.d) {
            final d d = a.d;
            final int h = d.h;
            if (h > 0) {
                int n = 0;
                final Object[] f = d.f;
                ng2.e.d((Object)f, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((SnapshotStateObserver$ObservedScopeMap)f[n]).d((l)instance);
                } while (++n < h);
            }
            final j a2 = j.a;
        }
    }
    
    public final <T extends c0> void b(final T t, final l<? super T, j> l, final a<j> a) {
        ng2.e.f((Object)t, "target");
        ng2.e.f((Object)l, "onChanged");
        this.a.c((Object)t, (l)l, (a)a);
    }
}
