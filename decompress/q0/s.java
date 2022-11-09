// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import kotlin.collections.b;
import java.util.ArrayList;
import androidx.compose.foundation.lazy.a;
import androidx.compose.foundation.lazy.LazyListItemPlacementAnimator;
import androidx.compose.ui.unit.LayoutDirection;
import j1.a$c;
import j1.a$b;
import c2.e0;

public final class s
{
    public final int a;
    public final e0[] b;
    public final boolean c;
    public final a$b d;
    public final a$c e;
    public final LayoutDirection f;
    public final boolean g;
    public final int h;
    public final int i;
    public final LazyListItemPlacementAnimator j;
    public final int k;
    public final long l;
    public final Object m;
    public final int n;
    public final int o;
    public final int p;
    
    public s(int max, final e0[] b, final boolean c, final a$b d, final a$c e, final LayoutDirection f, final boolean g, int i, int n, final LazyListItemPlacementAnimator j, int k, final long l, final Object m) {
        this.a = max;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = i;
        this.i = n;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        final int length = b.length;
        i = 0;
        n = (max = 0);
        while (i < length) {
            final e0 e2 = b[i];
            final boolean c2 = this.c;
            if (c2) {
                k = e2.g;
            }
            else {
                k = e2.f;
            }
            k += n;
            if (!c2) {
                n = e2.g;
            }
            else {
                n = e2.f;
            }
            max = Math.max(max, n);
            ++i;
            n = k;
        }
        this.n = n;
        this.o = n + this.k;
        this.p = max;
    }
    
    public final a a(final int n, int n2, int n3) {
        final ArrayList list = new ArrayList();
        int n4;
        if (this.c) {
            n4 = n3;
        }
        else {
            n4 = n2;
        }
        final boolean g = this.g;
        int n5;
        if (g) {
            n5 = n4 - n - this.n;
        }
        else {
            n5 = n;
        }
        int e1;
        if (g) {
            e1 = kotlin.collections.b.E1((Object[])this.b);
        }
        else {
            e1 = 0;
        }
        while (true) {
            final boolean g2 = this.g;
            if (!(g2 ? (e1 >= 0) : (e1 < this.b.length))) {
                final int a = this.a;
                final Object m = this.m;
                n3 = this.n;
                final int o = this.o;
                if (!g2) {
                    n2 = this.h;
                }
                else {
                    n2 = this.i;
                }
                final int n6 = -n2;
                if (!g2) {
                    n2 = this.i;
                }
                else {
                    n2 = this.h;
                }
                return new a(n, a, m, n3, o, n6, n4 + n2, this.c, list, this.j, this.l);
            }
            final e0 e2 = this.b[e1];
            int size;
            if (g2) {
                size = 0;
            }
            else {
                size = list.size();
            }
            long n7;
            if (this.c) {
                final a$b d = this.d;
                if (d == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                n7 = at1.a.h(d.a(e2.f, n2, this.f), n5);
            }
            else {
                final a$c e3 = this.e;
                if (e3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                n7 = at1.a.h(n5, e3.a(e2.g, n3));
            }
            int n8;
            if (this.c) {
                n8 = e2.g;
            }
            else {
                n8 = e2.f;
            }
            n5 += n8;
            list.add(size, new p(n7, e2, this.b[e1].c()));
            if (this.g) {
                --e1;
            }
            else {
                ++e1;
            }
        }
    }
}
