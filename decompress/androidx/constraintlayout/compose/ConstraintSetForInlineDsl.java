// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import y2.b;
import java.util.Iterator;
import mg2.a;
import c2.u;
import java.util.List;
import y2.g;
import i1.f$a;
import ng2.e;
import java.util.ArrayList;
import cg2.j;
import mg2.l;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import android.os.Handler;
import y2.c;
import z0.s0;

public final class ConstraintSetForInlineDsl implements s0
{
    public final c f;
    public Handler g;
    public final SnapshotStateObserver h;
    public boolean i;
    public final l<j, j> j;
    public final ArrayList k;
    
    public ConstraintSetForInlineDsl(final c f) {
        e.f((Object)f, "scope");
        this.f = f;
        this.h = new SnapshotStateObserver((l)new ConstraintSetForInlineDsl$observer$1(this));
        this.i = true;
        this.j = (l<j, j>)new ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1(this);
        this.k = new ArrayList();
    }
    
    @Override
    public final void a() {
        final SnapshotStateObserver h = this.h;
        h.e = f$a.c(h.b);
    }
    
    public final void b(final g g, final List<? extends u> list) {
        e.f((Object)g, "state");
        e.f((Object)list, "measurables");
        final c f = this.f;
        f.getClass();
        final Iterator iterator = ((androidx.constraintlayout.compose.a)f).a.iterator();
        while (iterator.hasNext()) {
            ((l)iterator.next()).invoke((Object)g);
        }
        this.k.clear();
        this.h.c((Object)cg2.j.a, (l)this.j, (a)new ConstraintSetForInlineDsl$applyTo$1((List)list, g, this));
        this.i = false;
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d() {
        final i1.e e = this.h.e;
        if (e != null) {
            e.dispose();
        }
        this.h.a();
    }
    
    public final boolean e(final List<? extends u> list) {
        e.f((Object)list, "measurables");
        if (!this.i && list.size() == this.k.size()) {
            final int n = list.size() - 1;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    final int n3 = n2 + 1;
                    final Object b = ((c2.j)list.get(n2)).b();
                    b b2;
                    if (b instanceof b) {
                        b2 = (b)b;
                    }
                    else {
                        b2 = null;
                    }
                    if (!e.a((Object)b2, this.k.get(n2))) {
                        return true;
                    }
                    if (n3 > n) {
                        break;
                    }
                    n2 = n3;
                }
            }
            return false;
        }
        return true;
    }
}
