// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import y2.b;
import i1.e;
import java.util.Iterator;
import zg2.a;
import c2.r;
import java.util.List;
import y2.g;
import i1.f$a;
import ah2.f;
import java.util.ArrayList;
import pg2.j;
import zg2.l;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import android.os.Handler;
import y2.c;
import z0.u0;

public final class ConstraintSetForInlineDsl implements u0
{
    public final c f;
    public Handler g;
    public final SnapshotStateObserver h;
    public boolean i;
    public final l<j, j> j;
    public final ArrayList k;
    
    public ConstraintSetForInlineDsl(final c f) {
        ah2.f.f((Object)f, "scope");
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
    
    public final void b(final g g, final List<? extends r> list) {
        ah2.f.f((Object)g, "state");
        ah2.f.f((Object)list, "measurables");
        final c f = this.f;
        f.getClass();
        final Iterator iterator = f.a.iterator();
        while (iterator.hasNext()) {
            ((l)iterator.next()).invoke((Object)g);
        }
        this.k.clear();
        this.h.b((Object)pg2.j.a, (l)this.j, (a)new ConstraintSetForInlineDsl$applyTo$1((List)list, g, this));
        this.i = false;
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d() {
        final e e = this.h.e;
        if (e != null) {
            e.dispose();
        }
        this.h.a();
    }
    
    public final boolean e(final List<? extends r> list) {
        ah2.f.f((Object)list, "measurables");
        if (!this.i && list.size() == this.k.size()) {
            final int n = list.size() - 1;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    final int n3 = n2 + 1;
                    final Object c = list.get(n2).c();
                    b b;
                    if (c instanceof b) {
                        b = (b)c;
                    }
                    else {
                        b = null;
                    }
                    if (!ah2.f.a((Object)b, this.k.get(n2))) {
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
