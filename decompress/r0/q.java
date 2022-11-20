// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import u2.i;
import l0.t;
import java.util.ArrayList;
import androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator;
import java.util.List;

public final class q implements g
{
    public final long a;
    public final long b;
    public final int c;
    public final Object d;
    public final int e;
    public final int f;
    public final long g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final List<p> m;
    public final LazyGridItemPlacementAnimator n;
    public final long o;
    public final boolean p;
    
    public q() {
        throw null;
    }
    
    public q(final long a, final long b, int c, final Object d, int size, final int f, final long g, final int h, final int i, final int j, final int k, final boolean l, final ArrayList m, final LazyGridItemPlacementAnimator n, final long o) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = size;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        size = m.size();
        final boolean b2 = false;
        c = 0;
        boolean p15;
        while (true) {
            p15 = b2;
            if (c >= size) {
                break;
            }
            if (this.e(c) != null) {
                p15 = true;
                break;
            }
            ++c;
        }
        this.p = p15;
    }
    
    @Override
    public final long a() {
        return this.g;
    }
    
    @Override
    public final int b() {
        return this.f;
    }
    
    @Override
    public final long c() {
        return this.a;
    }
    
    @Override
    public final int d() {
        return this.e;
    }
    
    public final t<u2.g> e(final int n) {
        final Object b = this.m.get(n).b;
        t t;
        if (b instanceof t) {
            t = (t)b;
        }
        else {
            t = null;
        }
        return t;
    }
    
    public final int f() {
        final int i = this.i;
        int b;
        if (this.l) {
            b = u2.i.b(this.g);
        }
        else {
            b = (int)(this.g >> 32);
        }
        return i + b;
    }
    
    @Override
    public final int getIndex() {
        return this.c;
    }
}
