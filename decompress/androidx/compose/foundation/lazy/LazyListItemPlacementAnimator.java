// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import l0.s;
import zg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import q0.v;
import qg2.o;
import q0.d;
import u2.g;
import gh2.i;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import kotlin.collections.c;
import ah2.f;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.LinkedHashMap;
import mj2.b0;

public final class LazyListItemPlacementAnimator
{
    public final b0 a;
    public final boolean b;
    public final LinkedHashMap c;
    public Map<Object, Integer> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final LinkedHashSet i;
    
    public LazyListItemPlacementAnimator(final b0 a, final boolean b) {
        ah2.f.f((Object)a, "scope");
        this.a = a;
        this.b = b;
        this.c = new LinkedHashMap();
        this.d = kotlin.collections.c.N1();
        this.e = -1;
        this.g = -1;
        this.i = new LinkedHashSet();
    }
    
    public static int b(final int n, final int n2, final ArrayList list) {
        if (!list.isEmpty() && n >= ((a)CollectionsKt___CollectionsKt.p1((List)list)).b) {
            if (n <= ((a)CollectionsKt___CollectionsKt.A1((List)list)).b) {
                if (n - ((a)CollectionsKt___CollectionsKt.p1((List)list)).b < ((a)CollectionsKt___CollectionsKt.A1((List)list)).b - n) {
                    for (int i = 0; i < list.size(); ++i) {
                        final a a = list.get(i);
                        final int b = a.b;
                        if (b == n) {
                            return a.e;
                        }
                        if (b > n) {
                            break;
                        }
                    }
                }
                else {
                    for (int l = ah2.c.L((List)list); -1 < l; --l) {
                        final a a2 = list.get(l);
                        final int b2 = a2.b;
                        if (b2 == n) {
                            return a2.e;
                        }
                        if (b2 < n) {
                            break;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public final int a(int n, int n2, final int n3, final long n4, final boolean b, int f, int g, final ArrayList list) {
        final int g2 = this.g;
        final int n5 = 0;
        final int n6 = 0;
        final boolean b2 = b ? (g2 > n) : (g2 < n);
        final int e = this.e;
        final boolean b3 = b ? (e < n) : (e > n);
        if (b2) {
            i i;
            if (!b) {
                i = yl.a.C1(g2 + 1, n);
            }
            else {
                i = yl.a.C1(n + 1, g2);
            }
            n2 = ((gh2.g)i).f;
            final int g3 = ((gh2.g)i).g;
            n = n5;
            if (n2 <= g3) {
                g = n6;
                while (true) {
                    g = (n = g + b(n2, n3, list));
                    if (n2 == g3) {
                        break;
                    }
                    ++n2;
                }
            }
            n2 = this.h;
            g = this.c(n4) + (f + n2 + n);
        }
        else if (b3) {
            i j;
            if (!b) {
                j = yl.a.C1(n + 1, e);
            }
            else {
                j = yl.a.C1(e + 1, n);
            }
            f = ((gh2.g)j).f;
            g = ((gh2.g)j).g;
            n = n2;
            if (f <= g) {
                while (true) {
                    n2 = (n = n2 + b(f, n3, list));
                    if (f == g) {
                        break;
                    }
                    ++f;
                }
            }
            n2 = this.f;
            g = this.c(n4) + (n2 - n);
        }
        return g;
    }
    
    public final int c(final long n) {
        int b;
        if (this.b) {
            b = u2.g.b(n);
        }
        else {
            final int c = u2.g.c;
            b = (int)(n >> 32);
        }
        return b;
    }
    
    public final void d(final a a, final d d) {
        while (d.b.size() > a.i.size()) {
            o.a1(d.b);
        }
        while (d.b.size() < a.i.size()) {
            final int size = d.b.size();
            final long c = a.c(size);
            final ArrayList b = d.b;
            final long a2 = d.a;
            b.add(new v(a.b(size), at1.a.h((int)(c >> 32) - (int)(a2 >> 32), u2.g.b(c) - u2.g.b(a2))));
        }
        final ArrayList b2 = d.b;
        for (int size2 = b2.size(), i = 0; i < size2; ++i) {
            final v v = (v)b2.get(i);
            final long c2 = v.c;
            final long a3 = d.a;
            final long h = at1.a.h((int)(c2 >> 32) + (int)(a3 >> 32), u2.g.b(a3) + u2.g.b(c2));
            final long c3 = a.c(i);
            v.a = a.b(i);
            final s a4 = a.a(i);
            if (h != c3) {
                final long a5 = d.a;
                v.c = at1.a.h((int)(c3 >> 32) - (int)(a5 >> 32), u2.g.b(c3) - u2.g.b(a5));
                if (a4 != null) {
                    ((SnapshotMutableStateImpl<Boolean>)v.d).setValue(Boolean.TRUE);
                    mj2.g.i(this.a, (CoroutineContext)null, (CoroutineStart)null, (p)new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(v, a4, (tg2.c)null), 3);
                }
            }
        }
    }
}
