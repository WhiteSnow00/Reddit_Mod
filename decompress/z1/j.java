// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import c2.h0;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.Iterator;
import n1.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import e2.b;
import vl.a;
import c2.m;
import java.util.Map;
import ng2.e;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.LinkedHashMap;
import a1.d;
import e2.e0;

public final class j extends k
{
    public final e0 b;
    public final d<o> c;
    public final LinkedHashMap d;
    public NodeCoordinator e;
    public l f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    public j(final e0 b) {
        ng2.e.f((Object)b, "pointerInputNode");
        this.b = b;
        this.c = (d<o>)new d((Object[])new o[16]);
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }
    
    @Override
    public final boolean a(final Map<o, p> map, final m m, final g g, final boolean b) {
        ng2.e.f((Object)map, "changes");
        ng2.e.f((Object)m, "parentCoordinates");
        final boolean a = super.a(map, m, g, b);
        if (!vl.a.k2(this.b)) {
            return true;
        }
        final e0 b2 = this.b;
        ng2.e.f((Object)b2, "<this>");
        this.e = xd.a.f1((b)b2, 16);
        final Iterator<Map.Entry<o, p>> iterator = map.entrySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final Map.Entry<o, V> entry = iterator.next();
            final long a2 = entry.getKey().a;
            final p p4 = (p)entry.getValue();
            if (!this.c.g((Object)new o(a2))) {
                continue;
            }
            final ArrayList<z1.e> list = new ArrayList<z1.e>();
            Object o;
            if ((o = p4.k) == null) {
                o = EmptyList.INSTANCE;
            }
            final int size = ((List)o).size();
            final List list2 = (List)o;
            final p p5 = p4;
            while (i < size) {
                final z1.e e = (z1.e)list2.get(i);
                final long a3 = e.a;
                final NodeCoordinator e2 = this.e;
                ng2.e.c((Object)e2);
                list.add(new z1.e(a3, e2.A(m, e.b)));
                ++i;
            }
            final LinkedHashMap d = this.d;
            final o o2 = new o(a2);
            final NodeCoordinator e3 = this.e;
            ng2.e.c((Object)e3);
            final long a4 = e3.A(m, p5.f);
            final NodeCoordinator e4 = this.e;
            ng2.e.c((Object)e4);
            final long a5 = e4.A(m, p5.c);
            final long a6 = p5.a;
            final long b3 = p5.b;
            final boolean d2 = p5.d;
            final long e5 = p5.e;
            final boolean g2 = p5.g;
            final int h = p5.h;
            final long j = p5.i;
            final Float k = p5.j;
            float floatValue;
            if (k != null) {
                floatValue = k;
            }
            else {
                floatValue = 0.0f;
            }
            final p p6 = new p(a6, b3, a5, d2, floatValue, e5, a4, g2, h, list, j);
            p6.l = p5.l;
            d.put(o2, p6);
        }
        if (this.d.isEmpty()) {
            this.c.f();
            super.a.f();
            return true;
        }
        for (int n = this.c.h - 1; -1 < n; --n) {
            if (!map.containsKey(new o(((o)this.c.f[n]).a))) {
                this.c.n(n);
            }
        }
        final l f = new l(CollectionsKt___CollectionsKt.I5((Iterable)this.d.values()), g);
        final List<p> a7 = f.a;
        while (true) {
            for (int size2 = a7.size(), l = 0; l < size2; ++l) {
                final Object value = a7.get(l);
                if (g.a(((p)value).a)) {
                    final p p7 = (p)value;
                    Label_0899: {
                        if (p7 != null) {
                            if (!b) {
                                this.h = false;
                            }
                            else if (!this.h && (p7.d || p7.g)) {
                                final NodeCoordinator e6 = this.e;
                                ng2.e.c((Object)e6);
                                this.h = (a01.a.N(p7, ((h0)e6).h) ^ true);
                            }
                            final boolean h2 = this.h;
                            final boolean g3 = this.g;
                            final int n2 = 5;
                            if (h2 != g3) {
                                final int c = f.c;
                                if (c == 3 || c == 4 || c == 5) {
                                    int c2 = n2;
                                    if (h2) {
                                        c2 = 4;
                                    }
                                    f.c = c2;
                                    break Label_0899;
                                }
                            }
                            final int c3 = f.c;
                            if (c3 == 4 && g3 && !this.i) {
                                f.c = 3;
                            }
                            else if (c3 == 5 && h2 && p7.d) {
                                f.c = 3;
                            }
                        }
                    }
                    boolean b5 = false;
                    Label_1061: {
                        if (!a && f.c == 3) {
                            final l f2 = this.f;
                            boolean b4 = false;
                            Label_1044: {
                                Label_1041: {
                                    if (f2 != null) {
                                        if (f2.a.size() == f.a.size()) {
                                            for (int size3 = f.a.size(), n3 = 0; n3 < size3; ++n3) {
                                                if (!n1.c.c(f2.a.get(n3).c, f.a.get(n3).c)) {
                                                    break Label_1041;
                                                }
                                            }
                                            b4 = false;
                                            break Label_1044;
                                        }
                                    }
                                }
                                b4 = true;
                            }
                            if (!b4) {
                                b5 = false;
                                break Label_1061;
                            }
                        }
                        b5 = true;
                    }
                    this.f = f;
                    return b5;
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    @Override
    public final void b(final g g) {
        super.b(g);
        final l f = this.f;
        if (f == null) {
            return;
        }
        this.g = this.h;
        final List<p> a = f.a;
        final int size = a.size();
        boolean i = false;
        int n = 0;
        while (true) {
            final boolean b = true;
            if (n >= size) {
                break;
            }
            final p p = a.get(n);
            int n2 = 0;
            Label_0106: {
                if (!p.d) {
                    n2 = (b ? 1 : 0);
                    if (!g.a(p.a)) {
                        break Label_0106;
                    }
                    if (!this.h) {
                        n2 = (b ? 1 : 0);
                        break Label_0106;
                    }
                }
                n2 = 0;
            }
            if (n2 != 0) {
                this.c.l((Object)new o(p.a));
            }
            ++n;
        }
        this.h = false;
        if (f.c == 5) {
            i = true;
        }
        this.i = i;
    }
    
    @Override
    public final void c() {
        final d<j> a = (d<j>)super.a;
        final int h = a.h;
        if (h > 0) {
            int n = 0;
            final Object[] f = a.f;
            ng2.e.d((Object)f, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((j)f[n]).c();
            } while (++n < h);
        }
        this.b.k();
    }
    
    @Override
    public final boolean d(final g g) {
        final boolean empty = this.d.isEmpty();
        final boolean b = true;
        int n = 0;
        boolean b2 = false;
        Label_0164: {
            if (!empty) {
                if (vl.a.k2(this.b)) {
                    final l f = this.f;
                    ng2.e.c((Object)f);
                    final NodeCoordinator e = this.e;
                    ng2.e.c((Object)e);
                    this.b.m(f, PointerEventPass.Final, ((h0)e).h);
                    b2 = b;
                    if (!vl.a.k2(this.b)) {
                        break Label_0164;
                    }
                    final d<j> a = (d<j>)super.a;
                    final int h = a.h;
                    b2 = b;
                    if (h > 0) {
                        final Object[] f2 = a.f;
                        ng2.e.d((Object)f2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((j)f2[n]).d(g);
                        } while (++n < h);
                        b2 = b;
                    }
                    break Label_0164;
                }
            }
            b2 = false;
        }
        this.b(g);
        this.d.clear();
        this.e = null;
        return b2;
    }
    
    @Override
    public final boolean e(final Map<o, p> map, final m m, final g g, final boolean b) {
        ng2.e.f((Object)map, "changes");
        ng2.e.f((Object)m, "parentCoordinates");
        final boolean empty = this.d.isEmpty();
        final boolean b2 = true;
        int n = 0;
        if (!empty) {
            if (vl.a.k2(this.b)) {
                final l f = this.f;
                ng2.e.c((Object)f);
                final NodeCoordinator e = this.e;
                ng2.e.c((Object)e);
                final long h = ((h0)e).h;
                this.b.m(f, PointerEventPass.Initial, h);
                if (vl.a.k2(this.b)) {
                    final d<j> a = (d<j>)super.a;
                    final int h2 = a.h;
                    if (h2 > 0) {
                        final Object[] f2 = a.f;
                        ng2.e.d((Object)f2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            final j j = (j)f2[n];
                            final LinkedHashMap d = this.d;
                            final NodeCoordinator e2 = this.e;
                            ng2.e.c((Object)e2);
                            j.e(d, (m)e2, g, b);
                        } while (++n < h2);
                    }
                }
                boolean b3 = b2;
                if (vl.a.k2(this.b)) {
                    this.b.m(f, PointerEventPass.Main, h);
                    b3 = b2;
                    return b3;
                }
                return b3;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Node(pointerInputFilter=");
        t.append(this.b);
        t.append(", children=");
        t.append(super.a);
        t.append(", pointerIds=");
        t.append(this.c);
        t.append(')');
        return t.toString();
    }
}
