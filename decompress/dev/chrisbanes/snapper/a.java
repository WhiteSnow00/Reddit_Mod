// 
// Decompiled by Procyon v0.6.0
// 

package dev.chrisbanes.snapper;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import rg2.l;
import bj2.k;
import bj2.v;
import java.util.Iterator;
import q0.m;
import bj2.v$a;
import lg.e0;
import l0.n;
import kotlin.collections.CollectionsKt___CollectionsKt;
import q0.j;
import bg.d;
import sg2.e;
import androidx.compose.runtime.DerivedSnapshotState;
import z0.l0;
import ue2.c;
import rg2.p;
import androidx.compose.foundation.lazy.LazyListState;
import ue2.b;

public final class a extends b
{
    public final LazyListState a;
    public final p<b, c, Integer> b;
    public final l0 c;
    public final DerivedSnapshotState d;
    
    public a() {
        throw null;
    }
    
    public a(final LazyListState a, final p b) {
        e.f((Object)a, "lazyListState");
        e.f((Object)b, "snapOffsetForItem");
        this.a = a;
        this.b = b;
        this.c = bg.d.t0((Object)0);
        this.d = bg.d.V((rg2.a)new LazyListSnapperLayoutInfo$currentItem$2(this));
    }
    
    public final boolean a() {
        final j j = (j)CollectionsKt___CollectionsKt.M3(this.a.h().b());
        if (j != null) {
            final int index = j.getIndex();
            final int a = this.a.h().a();
            boolean b = true;
            if (index < a - 1) {
                return b;
            }
            if (j.getSize() + j.getOffset() > this.f()) {
                b = b;
                return b;
            }
        }
        return false;
    }
    
    public final boolean b() {
        final j j = (j)CollectionsKt___CollectionsKt.C3(this.a.h().b());
        boolean b = false;
        if (j != null) {
            if (j.getIndex() > 0 || j.getOffset() < 0) {
                b = true;
            }
        }
        return b;
    }
    
    public final int c(float n, float u, final n n2) {
        e.f((Object)n2, "decayAnimationSpec");
        final c e = this.e();
        if (e == null) {
            return -1;
        }
        final float i = this.i();
        final float n3 = 0.0f;
        if (i <= 0.0f) {
            return e.a();
        }
        final int d = this.d(e.a());
        final int d2 = this.d(e.a() + 1);
        if (Math.abs(n) < 0.5f) {
            int a;
            if (Math.abs(d) < Math.abs(d2)) {
                a = e.a();
            }
            else {
                a = e.a() + 1;
            }
            return e0.v(a, 0, this.a.h().a() - 1);
        }
        u = e0.u(wd.a.q(n, n2), -u, u);
        if (n < 0.0f) {
            u = (n = u + d2);
            if (u > 0.0f) {
                n = n3;
            }
        }
        else {
            u = (n = u + d);
            if (u < 0.0f) {
                n = n3;
            }
        }
        final double n4 = n;
        final double n5 = i;
        return e0.v(e.a() + lw0.b.j2(n4 / n5 - d / n5), 0, this.a.h().a() - 1);
    }
    
    public final int d(int k2) {
        final v$a v$a = new v$a(this.j());
        while (true) {
            while (v$a.hasNext()) {
                final Object next = v$a.next();
                if (((c)next).a() == k2) {
                    final c c = (c)next;
                    if (c != null) {
                        return c.b() - this.b.invoke(this, c).intValue();
                    }
                    final c e = this.e();
                    if (e == null) {
                        return 0;
                    }
                    k2 = lw0.b.k2(this.i() * (k2 - e.a()));
                    return e.b() + k2 - this.b.invoke(this, e).intValue();
                }
            }
            final Object next = null;
            continue;
        }
    }
    
    public final c e() {
        return (c)this.d.getValue();
    }
    
    public final int f() {
        return this.a.h().f() - ((Number)((SnapshotMutableStateImpl)this.c).getValue()).intValue();
    }
    
    public final void g() {
    }
    
    public final int h() {
        return this.a.h().a();
    }
    
    public final float i() {
        final m h = this.a.h();
        final boolean empty = h.b().isEmpty();
        float n = -1.0f;
        if (empty) {
            return -1.0f;
        }
        final Iterator iterator = h.b().iterator();
        final boolean hasNext = iterator.hasNext();
        final j j = null;
        Object next;
        if (!hasNext) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                int offset = ((j)next).getOffset();
                j i = (j)next;
                do {
                    final Object next2 = iterator.next();
                    final int offset2 = ((j)next2).getOffset();
                    next = i;
                    int n2;
                    if ((n2 = offset) > offset2) {
                        next = next2;
                        n2 = offset2;
                    }
                    i = (j)next;
                    offset = n2;
                } while (iterator.hasNext());
            }
        }
        final j k = (j)next;
        if (k == null) {
            return -1.0f;
        }
        final Iterator iterator2 = h.b().iterator();
        Object next3;
        if (!iterator2.hasNext()) {
            next3 = j;
        }
        else {
            next3 = iterator2.next();
            if (iterator2.hasNext()) {
                final j l = (j)next3;
                int n3 = l.getSize() + l.getOffset();
                j m = (j)next3;
                do {
                    final Object next4 = iterator2.next();
                    final j j2 = (j)next4;
                    final int n4 = j2.getSize() + j2.getOffset();
                    int n5 = n3;
                    next3 = m;
                    if (n3 < n4) {
                        next3 = next4;
                        n5 = n4;
                    }
                    n3 = n5;
                    m = (j)next3;
                } while (iterator2.hasNext());
            }
        }
        final j j3 = (j)next3;
        if (j3 == null) {
            return -1.0f;
        }
        final int n6 = Math.max(k.getSize() + k.getOffset(), j3.getSize() + j3.getOffset()) - Math.min(k.getOffset(), j3.getOffset());
        if (n6 != 0) {
            final m h2 = this.a.h();
            final int size = h2.b().size();
            int n7 = 0;
            if (size >= 2) {
                final j j4 = h2.b().get(0);
                n7 = h2.b().get(1).getOffset() - (j4.getOffset() + j4.getSize());
            }
            n = (n6 + n7) / (float)h.b().size();
        }
        return n;
    }
    
    public final v j() {
        return kotlin.sequences.b.s1((k)CollectionsKt___CollectionsKt.q3((Iterable)this.a.h().b()), (l)LazyListSnapperLayoutInfo$visibleItems$1.INSTANCE);
    }
}
