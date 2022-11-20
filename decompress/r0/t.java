// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import c2.y;
import cg.d;
import xd.a;
import java.util.ArrayList;
import androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator;
import c2.h0;
import java.util.List;
import androidx.compose.ui.unit.LayoutDirection;

public final class t
{
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final LayoutDirection g;
    public final int h;
    public final int i;
    public final List<h0> j;
    public final LazyGridItemPlacementAnimator k;
    public final long l;
    public final int m;
    public final int n;
    
    public t() {
        throw null;
    }
    
    public t(int max, final Object b, final boolean c, int i, int e, final boolean f, final LayoutDirection g, int h, int size, final List j, final LazyGridItemPlacementAnimator k, final long l) {
        this.a = max;
        this.b = b;
        this.c = c;
        this.d = i;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = size;
        this.j = j;
        this.k = k;
        this.l = l;
        size = j.size();
        h = 0;
        i = 0;
        max = 0;
        while (i < size) {
            final h0 h2 = j.get(i);
            if (this.c) {
                e = h2.g;
            }
            else {
                e = h2.f;
            }
            max = Math.max(max, e);
            ++i;
        }
        this.m = max;
        max += this.e;
        if (max < 0) {
            max = h;
        }
        this.n = max;
    }
    
    public final q a(int n, int a, int n2, int size, final int n3, final int n4, final int n5) {
        final ArrayList list = new ArrayList();
        final boolean c = this.c;
        int n6;
        if (c) {
            n6 = size;
        }
        else {
            n6 = n2;
        }
        int n7;
        if (this.f) {
            n7 = n6 - n - this.m;
        }
        else {
            n7 = n;
        }
        if (!c) {
            n2 = size;
        }
        if (c && this.g == LayoutDirection.Rtl) {
            n2 = n2 - a - this.d;
        }
        else {
            n2 = a;
        }
        long n8;
        if (c) {
            n8 = a.g(n2, n7);
        }
        else {
            n8 = a.g(n7, n2);
        }
        if (this.f) {
            n2 = cg.d.R2((List)this.j);
        }
        else {
            n2 = 0;
        }
        while (true) {
            size = ((this.f ? (n2 >= 0) : (n2 < this.j.size())) ? 1 : 0);
            if (size == 0) {
                break;
            }
            final h0 h0 = this.j.get(n2);
            if (this.f) {
                size = 0;
            }
            else {
                size = list.size();
            }
            list.add(size, new p(h0, ((y)this.j.get(n2)).b()));
            if (this.f) {
                --n2;
            }
            else {
                ++n2;
            }
        }
        long n9;
        if (this.c) {
            n9 = a.g(a, n);
        }
        else {
            n9 = a.g(n, a);
        }
        a = this.a;
        final Object b = this.b;
        long n10;
        if (this.c) {
            n10 = a01.a.f(this.d, this.m);
        }
        else {
            n10 = a01.a.f(this.m, this.d);
        }
        n2 = this.e;
        final boolean f = this.f;
        if (!f) {
            n = this.h;
        }
        else {
            n = this.i;
        }
        size = -n;
        if (!f) {
            n = this.i;
        }
        else {
            n = this.h;
        }
        return new q(n9, n8, a, b, n3, n4, n10, n5, n2, size, n6 + n, this.c, list, this.k, this.l);
    }
}
