// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import c2.e0;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import l0.s;
import r0.y;
import at1.a;
import qg2.o;
import r0.e;
import r0.p;
import u2.g;
import ak0.m;
import kotlin.collections.c;
import ah2.f;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.LinkedHashMap;
import mj2.b0;

public final class LazyGridItemPlacementAnimator
{
    public final b0 a;
    public final boolean b;
    public int c;
    public final LinkedHashMap d;
    public Map<Object, Integer> e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final LinkedHashSet j;
    
    public LazyGridItemPlacementAnimator(final b0 a, final boolean b) {
        ah2.f.f((Object)a, "scope");
        this.a = a;
        this.b = b;
        this.d = new LinkedHashMap();
        this.e = kotlin.collections.c.N1();
        this.f = -1;
        this.h = -1;
        this.j = new LinkedHashSet();
    }
    
    public final int a(int n, int abs, final int n2, final long n3, final boolean b, int n4, int n5) {
        final int c = this.c;
        boolean b2 = false;
        if (c != 0) {
            final int h = this.h;
            final boolean b3 = b ? (h > n) : (h < n);
            Label_0090: {
                if (!b) {
                    if (this.f <= n) {
                        break Label_0090;
                    }
                }
                else if (this.f >= n) {
                    break Label_0090;
                }
                b2 = true;
            }
            if (b3) {
                abs = Math.abs(n - this.h);
                n = this.c;
                n = m.d((abs + n - 1) / n, 1, n2, n4 + this.i);
                n5 = this.b(n3) + n;
            }
            else if (b2) {
                n = Math.abs(this.f - n);
                n4 = this.c;
                n = (n + n4 - 1) / n4;
                n4 = this.g;
                n5 = this.b(n3) + (n4 - abs - (n - 1) * n2);
            }
            return n5;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final int b(final long n) {
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
    
    public final void c(final p p2, final e e) {
        while (e.d.size() > p2.m.size()) {
            o.a1(e.d);
        }
        while (e.d.size() < p2.m.size()) {
            final int size = e.d.size();
            final long a = p2.a;
            final ArrayList d = e.d;
            final long c = e.c;
            final long h = at1.a.h((int)(a >> 32) - (int)(c >> 32), u2.g.b(a) - u2.g.b(c));
            final e0 a2 = p2.m.get(size).a;
            int n;
            if (p2.l) {
                n = a2.g;
            }
            else {
                n = a2.f;
            }
            d.add(new y(n, h));
        }
        final ArrayList d2 = e.d;
        for (int size2 = d2.size(), i = 0; i < size2; ++i) {
            final y y = (y)d2.get(i);
            final long c2 = y.c;
            final long c3 = e.c;
            final long h2 = at1.a.h((int)(c2 >> 32) + (int)(c3 >> 32), u2.g.b(c3) + u2.g.b(c2));
            final long b = p2.b;
            final e0 a3 = p2.m.get(i).a;
            int a4;
            if (p2.l) {
                a4 = a3.g;
            }
            else {
                a4 = a3.f;
            }
            y.a = a4;
            final s<g> c4 = p2.c(i);
            if (h2 != b) {
                final long c5 = e.c;
                y.c = at1.a.h((int)(b >> 32) - (int)(c5 >> 32), u2.g.b(b) - u2.g.b(c5));
                if (c4 != null) {
                    ((SnapshotMutableStateImpl<Boolean>)y.d).setValue(Boolean.TRUE);
                    mj2.g.i(this.a, (CoroutineContext)null, (CoroutineStart)null, (zg2.p)new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(y, (s)c4, (tg2.c)null), 3);
                }
            }
        }
    }
}
