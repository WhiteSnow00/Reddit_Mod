// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotMutableStateImpl$a;
import i1.z;
import i1.a0;
import rg2.p;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import i1.x;
import java.util.Iterator;
import java.util.Set;
import i1.w;
import java.util.HashMap;
import i1.a;
import i1.f;
import sg2.e;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import i1.h;
import z0.c1;
import hg2.j;
import rg2.l;

public final class SnapshotKt
{
    public static final l<SnapshotIdSet, j> a;
    public static final c1 b;
    public static final Object c;
    public static SnapshotIdSet d;
    public static int e;
    public static final h f;
    public static final ArrayList g;
    public static final ArrayList h;
    public static final AtomicReference<GlobalSnapshot> i;
    
    static {
        a = (l)SnapshotKt$emptyLambda$1.INSTANCE;
        b = new c1(0);
        c = new Object();
        final SnapshotIdSet set = SnapshotKt.d = SnapshotIdSet.j;
        SnapshotKt.e = 1;
        f = new h();
        g = new ArrayList();
        h = new ArrayList();
        final int e = SnapshotKt.e;
        SnapshotKt.e = e + 1;
        final GlobalSnapshot globalSnapshot = new GlobalSnapshot(e, set);
        SnapshotKt.d = SnapshotKt.d.l(((f)globalSnapshot).b);
        final GlobalSnapshot value = (i = new AtomicReference<GlobalSnapshot>(globalSnapshot)).get();
        sg2.e.e((Object)value, "currentGlobalSnapshot.get()");
        final f f2 = (f)value;
    }
    
    public static final void a() {
        f((l<? super SnapshotIdSet, ?>)SnapshotKt$advanceGlobalSnapshot$2.INSTANCE);
    }
    
    public static final l b(final l l, final l i) {
        Object o;
        if (l != null && i != null && !sg2.e.a((Object)l, (Object)i)) {
            o = new SnapshotKt$mergedWriteObserver$1(l, i);
        }
        else if ((o = l) == null) {
            o = i;
        }
        return (l)o;
    }
    
    public static final HashMap c(final a a, final a a2, final SnapshotIdSet set) {
        final Set u = a2.u();
        final int d = ((f)a).d();
        final HashMap hashMap = null;
        HashMap hashMap2;
        if (u == null) {
            hashMap2 = hashMap;
        }
        else {
            final SnapshotIdSet k = ((f)a2).e().l(((f)a2).d()).k(a2.h);
            final Iterator iterator = u.iterator();
            HashMap hashMap3 = null;
            while (iterator.hasNext()) {
                final w w = (w)iterator.next();
                final x q = w.q();
                final x p3 = p(q, d, set);
                if (p3 == null) {
                    continue;
                }
                final x p4 = p(q, d, k);
                if (p4 == null) {
                    continue;
                }
                if (sg2.e.a((Object)p3, (Object)p4)) {
                    continue;
                }
                final x p5 = p(q, ((f)a2).d(), ((f)a2).e());
                if (p5 == null) {
                    o();
                    throw null;
                }
                final x a3 = w.a(p4, p3, p5);
                hashMap2 = hashMap;
                if (a3 == null) {
                    return hashMap2;
                }
                HashMap hashMap4;
                if ((hashMap4 = hashMap3) == null) {
                    hashMap4 = new HashMap();
                }
                hashMap4.put(p3, a3);
                hashMap3 = hashMap4;
            }
            hashMap2 = hashMap3;
        }
        return hashMap2;
    }
    
    public static final void d(final f f) {
        if (SnapshotKt.d.e(f.d())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }
    
    public static final SnapshotIdSet e(int i, final int n, SnapshotIdSet l) {
        sg2.e.f((Object)l, "<this>");
        while (i < n) {
            l = l.l(i);
            ++i;
        }
        return l;
    }
    
    public static final <T> T f(final l<? super SnapshotIdSet, ? extends T> l) {
        final GlobalSnapshot globalSnapshot = SnapshotKt.i.get();
        synchronized (SnapshotKt.c) {
            sg2.e.e((Object)globalSnapshot, "previousGlobalSnapshot");
            final Object t = t(globalSnapshot, l);
            monitorexit(SnapshotKt.c);
            final Set g = ((a)globalSnapshot).g;
            if (g != null) {
                synchronized (SnapshotKt.c) {
                    final ArrayList r4 = CollectionsKt___CollectionsKt.r4((Collection)SnapshotKt.g);
                    monitorexit(SnapshotKt.c);
                    for (int i = 0; i < r4.size(); ++i) {
                        ((p<Set, GlobalSnapshot, Object>)r4.get(i)).invoke(g, globalSnapshot);
                    }
                }
            }
            return (T)t;
        }
    }
    
    public static final f g(final f f, final l<Object, j> l, final boolean b) {
        final boolean b2 = f instanceof a;
        Object o;
        if (!b2 && f != null) {
            o = new a0(f, (l)l, b);
        }
        else {
            a a;
            if (b2) {
                a = (a)f;
            }
            else {
                a = null;
            }
            o = new z(a, (l)l, (l)null, false, b);
        }
        return (f)o;
    }
    
    public static final <T extends x> T h(final T t, final f f) {
        sg2.e.f((Object)t, "r");
        final x p2 = p(t, f.d(), f.e());
        if (p2 != null) {
            return (T)p2;
        }
        o();
        throw null;
    }
    
    public static final f i() {
        f f;
        if ((f = (f)SnapshotKt.b.h()) == null) {
            final GlobalSnapshot value = SnapshotKt.i.get();
            sg2.e.e((Object)value, "currentGlobalSnapshot.get()");
            f = (f)value;
        }
        return f;
    }
    
    public static final l<Object, j> j(final l<Object, j> l, l<Object, j> o, final boolean b) {
        Object o2;
        if (b) {
            o2 = o;
        }
        else {
            o2 = null;
        }
        if (l != null && o2 != null && !sg2.e.a((Object)l, o2)) {
            o = new SnapshotKt$mergedReadObserver$1((l)l, (l)o2);
        }
        else if ((o = l) == null) {
            o = o2;
        }
        return (l<Object, j>)o;
    }
    
    public static final <T extends x> T k(final T t, final w w) {
        sg2.e.f((Object)t, "<this>");
        sg2.e.f((Object)w, "state");
        x x = w.q();
        final h f = SnapshotKt.f;
        int e = SnapshotKt.e;
        if (f.b > 0) {
            e = ((int[])f.d)[0];
        }
        final SnapshotIdSet j = SnapshotIdSet.j;
        final x x2 = null;
        x x3 = null;
        x b;
        while (true) {
            b = x2;
            if (x != null) {
                final int a = x.a;
                Label_0141: {
                    if (a != 0) {
                        final boolean b2 = a != 0 && a <= e - 1 && !j.e(a);
                        x x4 = x3;
                        if (b2) {
                            if (x3 == null) {
                                x4 = x;
                            }
                            else {
                                if (x.a < x3.a) {
                                    break Label_0141;
                                }
                                b = x3;
                                break;
                            }
                        }
                        x = x.b;
                        x3 = x4;
                        continue;
                    }
                }
                b = x;
                break;
            }
            break;
        }
        if (b != null) {
            b.a = Integer.MAX_VALUE;
        }
        else {
            b = t.b();
            b.a = Integer.MAX_VALUE;
            b.b = w.q();
            w.x(b);
        }
        return (T)b;
    }
    
    public static final <T extends x> T l(final T t, final w w, final f f) {
        sg2.e.f((Object)t, "<this>");
        sg2.e.f((Object)w, "state");
        final x k = k(t, w);
        k.a(t);
        k.a = f.d();
        return (T)k;
    }
    
    public static final void m(final f f, final w w) {
        sg2.e.f((Object)w, "state");
        final l<Object, j> h = f.h();
        if (h != null) {
            h.invoke(w);
        }
    }
    
    public static final x n(final SnapshotMutableStateImpl$a snapshotMutableStateImpl$a, final w w, final f f, final SnapshotMutableStateImpl$a snapshotMutableStateImpl$a2) {
        sg2.e.f((Object)snapshotMutableStateImpl$a, "<this>");
        sg2.e.f((Object)w, "state");
        if (f.g()) {
            f.m(w);
        }
        final int d = f.d();
        if (((x)snapshotMutableStateImpl$a2).a == d) {
            return (x)snapshotMutableStateImpl$a2;
        }
        final x k = k((x)snapshotMutableStateImpl$a, w);
        k.a = d;
        f.m(w);
        return k;
    }
    
    public static final void o() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }
    
    public static final <T extends x> T p(T b, final int n, final SnapshotIdSet set) {
        x x = null;
        while (b != null) {
            final int a = b.a;
            final boolean b2 = a != 0 && a <= n && !set.e(a);
            x x2 = x;
            Label_0073: {
                if (b2) {
                    if (x != null) {
                        x2 = x;
                        if (x.a >= b.a) {
                            break Label_0073;
                        }
                    }
                    x2 = b;
                }
            }
            b = (T)b.b;
            x = x2;
        }
        if (x != null) {
            return (T)x;
        }
        return null;
    }
    
    public static final <T extends x> T q(final T t, final w w) {
        sg2.e.f((Object)t, "<this>");
        sg2.e.f((Object)w, "state");
        return r(t, w, i());
    }
    
    public static final <T extends x> T r(final T t, final w w, final f f) {
        sg2.e.f((Object)t, "<this>");
        sg2.e.f((Object)w, "state");
        final l<Object, j> f2 = f.f();
        if (f2 != null) {
            f2.invoke(w);
        }
        final x p3 = p(t, f.d(), f.e());
        if (p3 != null) {
            return (T)p3;
        }
        o();
        throw null;
    }
    
    public static final void s(final int c) {
        final h f = SnapshotKt.f;
        int i = ((int[])f.f)[c];
        f.b(i, f.b - 1);
        --f.b;
        final int[] array = (int[])f.d;
        final int n = array[i];
        int n2;
        for (int j = i; j > 0; j = n2) {
            n2 = (j + 1 >> 1) - 1;
            if (array[n2] <= n) {
                break;
            }
            f.b(n2, j);
        }
        final int[] array2 = (int[])f.d;
        while (i < f.b >> 1) {
            final int n3 = i + 1 << 1;
            final int n4 = n3 - 1;
            if (n3 < f.b) {
                final int n5 = array2[n3];
                if (n5 < array2[n4]) {
                    if (n5 < array2[i]) {
                        f.b(n3, i);
                        i = n3;
                        continue;
                    }
                    break;
                }
            }
            if (array2[n4] >= array2[i]) {
                break;
            }
            f.b(n4, i);
            i = n4;
        }
        ((int[])f.f)[c] = f.c;
        f.c = c;
    }
    
    public static final Object t(final GlobalSnapshot globalSnapshot, final l l) {
        final Object invoke = l.invoke(SnapshotKt.d.d(((f)globalSnapshot).b));
        synchronized (SnapshotKt.c) {
            final int e = SnapshotKt.e;
            SnapshotKt.e = e + 1;
            SnapshotKt.i.set(new GlobalSnapshot(e, SnapshotKt.d = SnapshotKt.d.d(((f)globalSnapshot).b)));
            globalSnapshot.c();
            SnapshotKt.d = SnapshotKt.d.l(e);
            final j a = j.a;
            return invoke;
        }
    }
    
    public static final <T extends x> T u(final T t, final w w, final f f) {
        sg2.e.f((Object)t, "<this>");
        sg2.e.f((Object)w, "state");
        if (f.g()) {
            f.m(w);
        }
        final x p3 = p(t, f.d(), f.e());
        if (p3 == null) {
            o();
            throw null;
        }
        if (p3.a == f.d()) {
            return (T)p3;
        }
        final x l = l(p3, w, f);
        f.m(w);
        return (T)l;
    }
}
