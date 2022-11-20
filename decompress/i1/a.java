// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import mg2.p;
import kotlin.collections.EmptyList;
import kotlin.Pair;
import java.util.Collection;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.HashSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import ng2.e;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.Set;
import cg2.j;
import mg2.l;

public class a extends f
{
    public final l<Object, j> e;
    public final l<Object, j> f;
    public Set<w> g;
    public SnapshotIdSet h;
    public int[] i;
    public int j;
    public boolean k;
    
    public a(final int n, final SnapshotIdSet set, final l<Object, j> e, final l<Object, j> f) {
        ng2.e.f((Object)set, "invalid");
        super(n, set);
        this.e = e;
        this.f = f;
        this.h = SnapshotIdSet.j;
        this.i = new int[0];
        this.j = 1;
    }
    
    public final void b() {
        SnapshotKt.d = SnapshotKt.d.d(this.d()).a(this.h);
    }
    
    public void c() {
        if (!super.c) {
            super.c();
            this.k(this);
        }
    }
    
    public final l<Object, j> f() {
        return this.e;
    }
    
    public boolean g() {
        return false;
    }
    
    public final l<Object, j> h() {
        return this.f;
    }
    
    public void j(final f f) {
        ng2.e.f((Object)f, "snapshot");
        ++this.j;
    }
    
    public void k(final f f) {
        ng2.e.f((Object)f, "snapshot");
        final int j = this.j;
        if (j > 0) {
            final int i = j - 1;
            this.j = i;
            if (i == 0 && !this.k) {
                final Set<w> u = this.u();
                if (u != null) {
                    if (!(true ^ this.k)) {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                    this.x(null);
                    final int d = this.d();
                    final Iterator<w> iterator = u.iterator();
                    while (iterator.hasNext()) {
                        for (x x = iterator.next().q(); x != null; x = x.b) {
                            final int a = x.a;
                            if (a == d || CollectionsKt___CollectionsKt.K4((Iterable)this.h, (Object)a)) {
                                x.a = 0;
                            }
                        }
                    }
                }
                this.a();
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public void l() {
        if (!this.k) {
            if (!super.c) {
                this.s();
            }
        }
    }
    
    public void m(final w w) {
        ng2.e.f((Object)w, "state");
        Set<w> u;
        if ((u = this.u()) == null) {
            u = new HashSet<w>();
            this.x((HashSet)u);
        }
        u.add((Object)w);
    }
    
    public final void n() {
        for (int length = this.i.length, i = 0; i < length; ++i) {
            SnapshotKt.s(this.i[i]);
        }
        final int d = super.d;
        if (d >= 0) {
            SnapshotKt.s(d);
            super.d = -1;
        }
    }
    
    public f r(final l<Object, j> l) {
        if (super.c ^ true) {
            this.z();
            final int d = this.d();
            this.w(this.d());
            Object o = SnapshotKt.c;
            synchronized (o) {
                final int e = SnapshotKt.e;
                SnapshotKt.e = e + 1;
                SnapshotKt.d = SnapshotKt.d.k(e);
                final NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(e, SnapshotKt.e(d + 1, e, this.e()), (l)l, (f)this);
                monitorexit(o);
                if (!this.k && !super.c) {
                    final int d2 = this.d();
                    synchronized (o) {
                        final int e2 = SnapshotKt.e;
                        SnapshotKt.e = e2 + 1;
                        this.p(e2);
                        SnapshotKt.d = SnapshotKt.d.k(this.d());
                        final j a = cg2.j.a;
                        monitorexit(o);
                        o = this.e();
                        this.q(SnapshotKt.e(d2 + 1, this.d(), (SnapshotIdSet)o));
                    }
                }
                return (f)nestedReadonlySnapshot;
            }
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }
    
    public final void s() {
        this.w(this.d());
        final j a = cg2.j.a;
        if (!this.k && !super.c) {
            final int d = this.d();
            Object o = SnapshotKt.c;
            synchronized (o) {
                final int e = SnapshotKt.e;
                SnapshotKt.e = e + 1;
                this.p(e);
                SnapshotKt.d = SnapshotKt.d.k(this.d());
                monitorexit(o);
                o = this.e();
                this.q(SnapshotKt.e(d + 1, this.d(), (SnapshotIdSet)o));
            }
        }
    }
    
    public g t() {
        final Set<w> u = this.u();
        HashMap c;
        if (u != null) {
            final AtomicReference i = SnapshotKt.i;
            final Object value = i.get();
            ng2.e.e(value, "currentGlobalSnapshot.get()");
            c = SnapshotKt.c((a)value, this, SnapshotKt.d.d(i.get().b));
        }
        else {
            c = null;
        }
        Object c2 = SnapshotKt.c;
        synchronized (c2) {
            SnapshotKt.d((f)this);
            Pair pair;
            if (u != null && u.size() != 0) {
                final GlobalSnapshot globalSnapshot = SnapshotKt.i.get();
                final g v = this.v(SnapshotKt.e, c, SnapshotKt.d.d(globalSnapshot.b));
                if (!ng2.e.a((Object)v, (Object)i1.g.b.a)) {
                    return v;
                }
                this.b();
                SnapshotKt.t((f)globalSnapshot, SnapshotKt.a);
                final Set<w> g = globalSnapshot.g;
                this.x(null);
                globalSnapshot.g = null;
                pair = new Pair((Object)CollectionsKt___CollectionsKt.J5((Collection)SnapshotKt.g), (Object)g);
            }
            else {
                this.b();
                final GlobalSnapshot globalSnapshot2 = SnapshotKt.i.get();
                ng2.e.e((Object)globalSnapshot2, "previousGlobalSnapshot");
                SnapshotKt.t((f)globalSnapshot2, SnapshotKt.a);
                final Set<w> g2 = globalSnapshot2.g;
                if (g2 != null && (g2.isEmpty() ^ true)) {
                    pair = new Pair((Object)CollectionsKt___CollectionsKt.J5((Collection)SnapshotKt.g), (Object)g2);
                }
                else {
                    pair = new Pair((Object)EmptyList.INSTANCE, (Object)null);
                }
            }
            monitorexit(c2);
            c2 = pair.component1();
            final Set set = (Set)pair.component2();
            this.k = true;
            final int n = 0;
            if (set != null && (set.isEmpty() ^ true)) {
                for (int size = ((List)c2).size(), j = 0; j < size; ++j) {
                    ((p)((List)c2).get(j)).invoke((Object)set, (Object)this);
                }
            }
            if (u != null && (u.isEmpty() ^ true)) {
                for (int size2 = ((List)c2).size(), k = n; k < size2; ++k) {
                    ((p)((List)c2).get(k)).invoke((Object)u, (Object)this);
                }
            }
            synchronized (SnapshotKt.c) {
                this.n();
                final j a = cg2.j.a;
                return (g)i1.g.b.a;
            }
        }
    }
    
    public Set<w> u() {
        return this.g;
    }
    
    public final g v(int i, final HashMap hashMap, final SnapshotIdSet set) {
        ng2.e.f((Object)set, "invalidSnapshots");
        final SnapshotIdSet g = this.e().k(this.d()).g(this.h);
        final Set<w> u = this.u();
        ng2.e.c((Object)u);
        final Iterator<w> iterator = u.iterator();
        List list = null;
        Collection collection = null;
        while (iterator.hasNext()) {
            final w w = iterator.next();
            final x q = w.q();
            final x q2 = SnapshotKt.q(q, i, set);
            if (q2 == null) {
                continue;
            }
            final x q3 = SnapshotKt.q(q, this.d(), g);
            if (q3 == null) {
                continue;
            }
            if (ng2.e.a((Object)q2, (Object)q3)) {
                continue;
            }
            final x q4 = SnapshotKt.q(q, this.d(), this.e());
            if (q4 == null) {
                SnapshotKt.p();
                throw null;
            }
            x a;
            if (hashMap == null || (a = (x)hashMap.get(q2)) == null) {
                a = w.a(q3, q2, q4);
            }
            if (a == null) {
                return new g.a(this);
            }
            if (ng2.e.a((Object)a, (Object)q4)) {
                continue;
            }
            if (ng2.e.a((Object)a, (Object)q2)) {
                List list2;
                if ((list2 = list) == null) {
                    list2 = new ArrayList();
                }
                list2.add(new Pair((Object)w, (Object)q2.b()));
                List<w> list3;
                if ((list3 = (List<w>)collection) == null) {
                    list3 = new ArrayList<w>();
                }
                list3.add(w);
                list = list2;
                collection = list3;
            }
            else {
                List list4;
                if ((list4 = list) == null) {
                    list4 = new ArrayList();
                }
                Pair pair;
                if (!ng2.e.a((Object)a, (Object)q3)) {
                    pair = new Pair((Object)w, (Object)a);
                }
                else {
                    pair = new Pair((Object)w, (Object)q3.b());
                }
                list4.add(pair);
                list = list4;
            }
        }
        if (list != null) {
            this.s();
            i = 0;
            while (i < list.size()) {
                final Pair pair2 = (Pair)list.get(i);
                final w w2 = (w)pair2.component1();
                final x x = (x)pair2.component2();
                x.a = this.d();
                synchronized (SnapshotKt.c) {
                    x.b = w2.q();
                    w2.u(x);
                    final j a2 = cg2.j.a;
                    monitorexit(SnapshotKt.c);
                    ++i;
                    continue;
                }
                break;
            }
        }
        if (collection != null) {
            u.removeAll(collection);
        }
        return (g)i1.g.b.a;
    }
    
    public final void w(final int n) {
        synchronized (SnapshotKt.c) {
            this.h = this.h.k(n);
            final j a = cg2.j.a;
        }
    }
    
    public void x(final HashSet g) {
        this.g = g;
    }
    
    public a y(final l<Object, j> l, final l<Object, j> i) {
        if (super.c ^ true) {
            this.z();
            this.w(this.d());
            synchronized (SnapshotKt.c) {
                final int e = SnapshotKt.e;
                SnapshotKt.e = e + 1;
                SnapshotKt.d = SnapshotKt.d.k(e);
                final SnapshotIdSet e2 = this.e();
                this.q(e2.k(e));
                final b b = new b(e, SnapshotKt.e(this.d() + 1, e, e2), (l<Object, j>)SnapshotKt.k((l)l, (l)this.e, true), (l<Object, j>)SnapshotKt.b((l)i, (l)this.f), this);
                monitorexit(SnapshotKt.c);
                if (!this.k && !super.c) {
                    final int d = this.d();
                    synchronized (SnapshotKt.c) {
                        final int e3 = SnapshotKt.e;
                        SnapshotKt.e = e3 + 1;
                        this.p(e3);
                        SnapshotKt.d = SnapshotKt.d.k(this.d());
                        final j a = cg2.j.a;
                        monitorexit(SnapshotKt.c);
                        this.q(SnapshotKt.e(d + 1, this.d(), this.e()));
                    }
                }
                return b;
            }
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }
    
    public final void z() {
        final boolean k = this.k;
        boolean b = false;
        if (!k || super.d >= 0) {
            b = true;
        }
        if (b) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
    }
}
