// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import sg2.e;
import java.util.ArrayList;
import n1.d;

public interface p
{
    void a(final d p0, final a0 p1);
    
    void b(final b0 p0, final a0 p1);
    
    void c(final float p0, final long p1, final a0 p2);
    
    void d(final a0 p0, final ArrayList p1);
    
    void e(final float p0, final float p1, final float p2, final float p3, final int p4);
    
    void f(final float p0, final float p1);
    
    void g();
    
    void h(final b0 p0, final int p1);
    
    void i(final w p0, final long p1, final a0 p2);
    
    void j(final float p0, final float p1);
    
    void k();
    
    void l(final float p0);
    
    default void m(final d d, final int n) {
        this.e(d.a, d.b, d.c, d.d, n);
    }
    
    void o(final float[] p0);
    
    void p(final float p0, final float p1, final float p2, final float p3, final a0 p4);
    
    void q(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5, final a0 p6);
    
    default void r(final d d, final f f) {
        e.f((Object)f, "paint");
        this.p(d.a, d.b, d.c, d.d, f);
    }
    
    void restore();
    
    void s(final w p0, final long p1, final long p2, final long p3, final long p4, final a0 p5);
    
    void save();
    
    void t(final long p0, final long p1, final a0 p2);
    
    void u(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5, final a0 p6);
}
