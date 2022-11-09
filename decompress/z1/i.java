// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.Iterator;
import n1.c;
import yd.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import java.util.Map;
import ah2.f;
import c2.l;
import java.util.LinkedHashMap;
import a1.e;

public final class i extends j
{
    public final t b;
    public final e<n> c;
    public final LinkedHashMap d;
    public l e;
    public k f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    public i(final t b) {
        ah2.f.f((Object)b, "pointerInputFilter");
        this.b = b;
        this.c = new e<n>(new n[16]);
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }
    
    @Override
    public final boolean a(final Map<n, o> map, final l l, final z1.f f, final boolean b) {
        f.f((Object)map, "changes");
        f.f((Object)l, "parentCoordinates");
        final boolean a = super.a(map, l, f, b);
        final t b2 = this.b;
        if (!b2.g) {
            return true;
        }
        this.e = b2.f;
        final Iterator<Map.Entry<n, o>> iterator = map.entrySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final Map.Entry<n, V> entry = iterator.next();
            final long a2 = entry.getKey().a;
            final o o = (o)entry.getValue();
            if (!this.c.f(new n(a2))) {
                continue;
            }
            final ArrayList<z1.e> list = new ArrayList<z1.e>();
            Object o2;
            if ((o2 = o.j) == null) {
                o2 = EmptyList.INSTANCE;
            }
            while (i < ((List)o2).size()) {
                final z1.e e = (z1.e)((List)o2).get(i);
                final long a3 = e.a;
                final l e2 = this.e;
                f.c((Object)e2);
                list.add(new z1.e(a3, e2.y(l, e.b)));
                ++i;
            }
            final LinkedHashMap d = this.d;
            final n n = new n(a2);
            final l e3 = this.e;
            f.c((Object)e3);
            final long y = e3.y(l, o.f);
            final l e4 = this.e;
            f.c((Object)e4);
            final o o3 = new o(o.a, o.b, e4.y(l, o.c), o.d, o.e, y, o.g, o.h, list, o.i);
            o3.k = o.k;
            d.put(n, o3);
        }
        if (this.d.isEmpty()) {
            this.c.e();
            super.a.e();
            return true;
        }
        for (int n2 = this.c.h - 1; -1 < n2; --n2) {
            if (!map.containsKey(new n(this.c.f[n2].a))) {
                this.c.n(n2);
            }
        }
        final k f2 = new k(CollectionsKt___CollectionsKt.h2((Iterable)this.d.values()), f);
        final List<o> a4 = f2.a;
        while (true) {
            for (int size = a4.size(), j = 0; j < size; ++j) {
                final Object value = a4.get(j);
                if (f.a(((o)value).a)) {
                    final o o4 = (o)value;
                    Label_0830: {
                        if (o4 != null) {
                            if (!b) {
                                this.h = false;
                            }
                            else if (!this.h && (o4.d || o4.g)) {
                                final l e5 = this.e;
                                f.c((Object)e5);
                                this.h = (yd.a.K1(o4, e5.a()) ^ true);
                            }
                            final boolean h = this.h;
                            final boolean g = this.g;
                            final int n3 = 5;
                            if (h != g) {
                                final int c = f2.c;
                                if (c == 3 || c == 4 || c == 5) {
                                    int c2 = n3;
                                    if (h) {
                                        c2 = 4;
                                    }
                                    f2.c = c2;
                                    break Label_0830;
                                }
                            }
                            final int c3 = f2.c;
                            if (c3 == 4 && g && !this.i) {
                                f2.c = 3;
                            }
                            else if (c3 == 5 && h && o4.d) {
                                f2.c = 3;
                            }
                        }
                    }
                    boolean b4 = false;
                    Label_0992: {
                        if (!a && f2.c == 3) {
                            final k f3 = this.f;
                            boolean b3 = false;
                            Label_0975: {
                                Label_0972: {
                                    if (f3 != null) {
                                        if (f3.a.size() == f2.a.size()) {
                                            for (int size2 = f2.a.size(), k = 0; k < size2; ++k) {
                                                if (!n1.c.a(f3.a.get(k).c, f2.a.get(k).c)) {
                                                    break Label_0972;
                                                }
                                            }
                                            b3 = false;
                                            break Label_0975;
                                        }
                                    }
                                }
                                b3 = true;
                            }
                            if (!b3) {
                                b4 = false;
                                break Label_0992;
                            }
                        }
                        b4 = true;
                    }
                    this.f = f2;
                    return b4;
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    @Override
    public final void b(final z1.f f) {
        super.b(f);
        final k f2 = this.f;
        if (f2 == null) {
            return;
        }
        this.g = this.h;
        final List<o> a = f2.a;
        final int size = a.size();
        boolean i = false;
        int n = 0;
        while (true) {
            final boolean b = true;
            if (n >= size) {
                break;
            }
            final o o = a.get(n);
            int n2 = 0;
            Label_0106: {
                if (!o.d) {
                    n2 = (b ? 1 : 0);
                    if (!f.a(o.a)) {
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
                this.c.l(new n(o.a));
            }
            ++n;
        }
        this.h = false;
        if (f2.c == 5) {
            i = true;
        }
        this.i = i;
    }
    
    @Override
    public final void c() {
        final e<i> a = super.a;
        final int h = a.h;
        if (h > 0) {
            int n = 0;
            final i[] f = a.f;
            do {
                f[n].c();
            } while (++n < h);
        }
        this.b.S0();
    }
    
    @Override
    public final boolean d(final z1.f f) {
        final boolean empty = this.d.isEmpty();
        final boolean b = true;
        int n = 0;
        boolean b2 = false;
        Label_0153: {
            if (!empty) {
                if (this.b.g) {
                    final k f2 = this.f;
                    f.c((Object)f2);
                    final l e = this.e;
                    f.c((Object)e);
                    this.b.T0(f2, PointerEventPass.Final, e.a());
                    b2 = b;
                    if (!this.b.g) {
                        break Label_0153;
                    }
                    final e<i> a = super.a;
                    final int h = a.h;
                    b2 = b;
                    if (h > 0) {
                        final i[] f3 = a.f;
                        do {
                            f3[n].d(f);
                        } while (++n < h);
                        b2 = b;
                    }
                    break Label_0153;
                }
            }
            b2 = false;
        }
        this.b(f);
        this.d.clear();
        this.e = null;
        return b2;
    }
    
    @Override
    public final boolean e(final Map<n, o> map, l e, final z1.f f, final boolean b) {
        f.f((Object)map, "changes");
        f.f((Object)e, "parentCoordinates");
        final boolean empty = this.d.isEmpty();
        final boolean b2 = true;
        int n = 0;
        if (!empty) {
            if (this.b.g) {
                final k f2 = this.f;
                f.c((Object)f2);
                e = this.e;
                f.c((Object)e);
                final long a = e.a();
                this.b.T0(f2, PointerEventPass.Initial, a);
                if (this.b.g) {
                    final e<i> a2 = super.a;
                    final int h = a2.h;
                    if (h > 0) {
                        final i[] f3 = a2.f;
                        do {
                            final i i = f3[n];
                            final LinkedHashMap d = this.d;
                            final l e2 = this.e;
                            f.c((Object)e2);
                            i.e(d, e2, f, b);
                        } while (++n < h);
                    }
                }
                final t b3 = this.b;
                boolean b4 = b2;
                if (b3.g) {
                    b3.T0(f2, PointerEventPass.Main, a);
                    b4 = b2;
                    return b4;
                }
                return b4;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Node(pointerInputFilter=");
        k.append(this.b);
        k.append(", children=");
        k.append(super.a);
        k.append(", pointerIds=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
