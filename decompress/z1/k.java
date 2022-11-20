// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import vl.a;
import ng2.e;
import c2.m;
import java.util.Map;
import a1.d;

public class k
{
    public final d<j> a;
    
    public k() {
        this.a = (d<j>)new d((Object[])new j[16]);
    }
    
    public boolean a(final Map<o, p> map, final m m, final g g, final boolean b) {
        e.f((Object)map, "changes");
        e.f((Object)m, "parentCoordinates");
        final d<j> a = this.a;
        final int h = a.h;
        boolean b2 = false;
        if (h > 0) {
            final Object[] f = a.f;
            e.d((Object)f, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            int n2 = 0;
            int i;
            do {
                b2 = (((j)f[n]).a(map, m, g, b) || n2 != 0);
                i = ++n;
                n2 = (b2 ? 1 : 0);
            } while (i < h);
        }
        return b2;
    }
    
    public void b(final g g) {
        for (int n = this.a.h - 1; -1 < n; --n) {
            if (((j)this.a.f[n]).c.j()) {
                this.a.n(n);
            }
        }
    }
    
    public void c() {
        final d<j> a = this.a;
        final int h = a.h;
        if (h > 0) {
            int n = 0;
            final Object[] f = a.f;
            e.d((Object)f, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((j)f[n]).c();
            } while (++n < h);
        }
    }
    
    public boolean d(final g g) {
        final d<j> a = this.a;
        final int h = a.h;
        boolean b = false;
        if (h > 0) {
            final Object[] f = a.f;
            e.d((Object)f, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            int n2 = 0;
            int i;
            do {
                b = (((j)f[n]).d(g) || n2 != 0);
                i = ++n;
                n2 = (b ? 1 : 0);
            } while (i < h);
        }
        this.b(g);
        return b;
    }
    
    public boolean e(final Map<o, p> map, final m m, final g g, final boolean b) {
        e.f((Object)map, "changes");
        e.f((Object)m, "parentCoordinates");
        final d<j> a = this.a;
        final int h = a.h;
        boolean b2 = false;
        if (h > 0) {
            final Object[] f = a.f;
            e.d((Object)f, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n = 0;
            int n2 = 0;
            int i;
            do {
                b2 = (((j)f[n]).e(map, m, g, b) || n2 != 0);
                i = ++n;
                n2 = (b2 ? 1 : 0);
            } while (i < h);
        }
        return b2;
    }
    
    public final void f() {
        int n = 0;
        while (true) {
            final d<j> a = this.a;
            if (n >= a.h) {
                break;
            }
            final j j = (j)a.f[n];
            if (!vl.a.k2(j.b)) {
                this.a.n(n);
                j.c();
            }
            else {
                ++n;
                j.f();
            }
        }
    }
}
