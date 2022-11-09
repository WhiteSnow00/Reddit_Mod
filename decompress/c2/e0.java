// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import u2.g;
import ah2.f;
import androidx.compose.ui.unit.LayoutDirection;
import pg2.j;
import o1.u;
import zg2.l;
import u2.i;
import androidx.compose.ui.layout.PlaceableKt;
import yl.a;

public abstract class e0 implements v
{
    public int f;
    public int g;
    public long h;
    public long i;
    
    public e0() {
        this.h = yl.a.c(0, 0);
        this.i = PlaceableKt.b;
    }
    
    public final long M() {
        final int f = this.f;
        final long h = this.h;
        return at1.a.h((f - (int)(h >> 32)) / 2, (this.g - u2.i.b(h)) / 2);
    }
    
    public int R() {
        return u2.i.b(this.h);
    }
    
    public int V() {
        return (int)(this.h >> 32);
    }
    
    public abstract void f0(final long p0, final float p1, final l<? super u, j> p2);
    
    public final void g0() {
        this.f = yl.a.K((int)(this.h >> 32), u2.a.j(this.i), u2.a.h(this.i));
        this.g = yl.a.K(u2.i.b(this.h), u2.a.i(this.i), u2.a.g(this.i));
    }
    
    public final void k0(final long h) {
        if (!u2.i.a(this.h, h)) {
            this.h = h;
            this.g0();
        }
    }
    
    public final void t0(final long i) {
        if (!u2.a.b(this.i, i)) {
            this.i = i;
            this.g0();
        }
    }
    
    public abstract static class a
    {
        public static final e0.a.a a;
        public static LayoutDirection b;
        public static int c;
        
        static {
            a = new e0.a.a(0);
            e0.a.b = LayoutDirection.Ltr;
        }
        
        public static void c(final e0 e0, int b, int n, final float n2) {
            f.f((Object)e0, "<this>");
            final long h = at1.a.h(b, n);
            final long m = e0.M();
            final int n3 = (int)(h >> 32);
            n = (int)(m >> 32);
            b = g.b(h);
            e0.f0(at1.a.h(n3 + n, g.b(m) + b), n2, null);
        }
        
        public static void d(final e0 e0, final long n, final float n2) {
            f.f((Object)e0, "$this$place");
            final long m = e0.M();
            e0.f0(at1.a.h((int)(n >> 32) + (int)(m >> 32), g.b(m) + g.b(n)), n2, null);
        }
        
        public static void f(final e0.a a, final e0 e0, long h) {
            a.getClass();
            f.f((Object)e0, "$this$placeRelative");
            if (a.a() != LayoutDirection.Ltr && a.b() != 0) {
                h = at1.a.h(a.b() - (int)(e0.h >> 32) - (int)(h >> 32), g.b(h));
                final long m = e0.M();
                e0.f0(at1.a.h((int)(h >> 32) + (int)(m >> 32), g.b(m) + g.b(h)), 0.0f, null);
            }
            else {
                final long i = e0.M();
                e0.f0(at1.a.h((int)(h >> 32) + (int)(i >> 32), g.b(i) + g.b(h)), 0.0f, null);
            }
        }
        
        public static void g(final e0.a a, final e0 e0, int n, int b, l a2, int b2) {
            if ((b2 & 0x8) != 0x0) {
                a2 = PlaceableKt.a;
            }
            a.getClass();
            f.f((Object)e0, "<this>");
            f.f((Object)a2, "layerBlock");
            final long h = at1.a.h(n, b);
            if (a.a() != LayoutDirection.Ltr && a.b() != 0) {
                final long h2 = at1.a.h(a.b() - (int)(e0.h >> 32) - (int)(h >> 32), g.b(h));
                final long m = e0.M();
                b2 = (int)(h2 >> 32);
                n = (int)(m >> 32);
                b = g.b(h2);
                e0.f0(at1.a.h(b2 + n, g.b(m) + b), 0.0f, (l<? super u, j>)a2);
            }
            else {
                final long i = e0.M();
                b = (int)(h >> 32);
                n = (int)(i >> 32);
                b2 = g.b(h);
                e0.f0(at1.a.h(b + n, g.b(i) + b2), 0.0f, (l<? super u, j>)a2);
            }
        }
        
        public static void h(final e0.a a, final e0 e0, long m) {
            final l a2 = PlaceableKt.a;
            a.getClass();
            f.f((Object)a2, "layerBlock");
            if (a.a() != LayoutDirection.Ltr && a.b() != 0) {
                final long h = at1.a.h(a.b() - (int)(e0.h >> 32) - (int)(m >> 32), g.b(m));
                m = e0.M();
                e0.f0(at1.a.h((int)(h >> 32) + (int)(m >> 32), g.b(m) + g.b(h)), 0.0f, (l<? super u, j>)a2);
            }
            else {
                final long i = e0.M();
                e0.f0(at1.a.h((int)(m >> 32) + (int)(i >> 32), g.b(i) + g.b(m)), 0.0f, (l<? super u, j>)a2);
            }
        }
        
        public static void i(final e0 e0, int n, int n2, final float n3, final l l) {
            f.f((Object)e0, "<this>");
            f.f((Object)l, "layerBlock");
            final long h = at1.a.h(n, n2);
            final long m = e0.M();
            n2 = (int)(h >> 32);
            n = (int)(m >> 32);
            e0.f0(at1.a.h(n2 + n, g.b(m) + g.b(h)), n3, (l<? super u, j>)l);
        }
        
        public static void k(final e0 e0, final long n, final float n2, final l l) {
            f.f((Object)e0, "$this$placeWithLayer");
            f.f((Object)l, "layerBlock");
            final long m = e0.M();
            e0.f0(at1.a.h((int)(n >> 32) + (int)(m >> 32), g.b(m) + g.b(n)), n2, (l<? super u, j>)l);
        }
        
        public abstract LayoutDirection a();
        
        public abstract int b();
        
        public final void e(final e0 e0, int n, int n2, final float n3) {
            ah2.f.f((Object)e0, "<this>");
            final long h = at1.a.h(n, n2);
            if (this.a() != LayoutDirection.Ltr && this.b() != 0) {
                final long h2 = at1.a.h(this.b() - (int)(e0.h >> 32) - (int)(h >> 32), u2.g.b(h));
                final long m = e0.M();
                final int n4 = (int)(h2 >> 32);
                n = (int)(m >> 32);
                n2 = u2.g.b(h2);
                e0.f0(at1.a.h(n4 + n, u2.g.b(m) + n2), n3, null);
            }
            else {
                final long i = e0.M();
                n = (int)(h >> 32);
                final int n5 = (int)(i >> 32);
                n2 = u2.g.b(h);
                e0.f0(at1.a.h(n + n5, u2.g.b(i) + n2), n3, null);
            }
        }
        
        public static final class a extends e0.a
        {
            public a(final int n) {
            }
            
            @Override
            public final LayoutDirection a() {
                return e0.a.b;
            }
            
            @Override
            public final int b() {
                return e0.a.c;
            }
        }
    }
}
