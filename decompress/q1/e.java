// 
// Decompiled by Procyon v0.6.0
// 

package q1;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import o1.b0;
import u2.g;
import o1.n;
import vl.a;
import n1.c;
import o1.s;
import o1.w;
import u2.b;

public interface e extends b
{
    default void C0(final e e, final w w, final s s) {
        e.b0(w, c.b, 1.0f, h.a, s, 3);
    }
    
    default long K0(final long n, final long n2) {
        return a.d0(n1.f.f(n) - c.e(n2), n1.f.d(n) - c.f(n2));
    }
    
    default void L0(final e e, final long n, final float n2, final float n3, long b, long k0, float n4, f a, int n5) {
        if ((n5 & 0x10) != 0x0) {
            b = c.b;
        }
        if ((n5 & 0x20) != 0x0) {
            k0 = K0(e.e(), b);
        }
        if ((n5 & 0x40) != 0x0) {
            n4 = 1.0f;
        }
        if ((n5 & 0x80) != 0x0) {
            a = h.a;
        }
        if ((n5 & 0x200) != 0x0) {
            n5 = 3;
        }
        else {
            n5 = 0;
        }
        e.u0(n, n2, n3, b, k0, n4, a, null, n5);
    }
    
    default void M(final e e, final n n, long b, long k0, float n2, f a, int n3, final int n4) {
        if ((n4 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n4 & 0x4) != 0x0) {
            k0 = K0(e.e(), b);
        }
        if ((n4 & 0x8) != 0x0) {
            n2 = 1.0f;
        }
        if ((n4 & 0x10) != 0x0) {
            a = h.a;
        }
        if ((n4 & 0x40) != 0x0) {
            n3 = 3;
        }
        e.q0(n, b, k0, n2, a, null, n3);
    }
    
    default void N(final e e, final w w, long f, long b, long n, final long n2, float n3, f a, s s, int n4, int n5, final int n6) {
        long b2;
        if ((n6 & 0x2) != 0x0) {
            b2 = g.b;
        }
        else {
            b2 = f;
        }
        if ((n6 & 0x4) != 0x0) {
            f = a01.a.f(w.getWidth(), w.getHeight());
        }
        else {
            f = b;
        }
        if ((n6 & 0x8) != 0x0) {
            b = g.b;
        }
        else {
            b = n;
        }
        if ((n6 & 0x10) != 0x0) {
            n = f;
        }
        else {
            n = n2;
        }
        if ((n6 & 0x20) != 0x0) {
            n3 = 1.0f;
        }
        if ((n6 & 0x40) != 0x0) {
            a = h.a;
        }
        if ((n6 & 0x80) != 0x0) {
            s = null;
        }
        if ((n6 & 0x100) != 0x0) {
            n4 = 3;
        }
        if ((n6 & 0x200) != 0x0) {
            n5 = 1;
        }
        e.j0(w, b2, f, b, n, n3, a, s, n4, n5);
    }
    
    default void Q(final e e, final long n, float n2, long e2, f a, int n3) {
        if ((n3 & 0x2) != 0x0) {
            n2 = n1.f.e(e.e()) / 2.0f;
        }
        if ((n3 & 0x4) != 0x0) {
            e2 = e.e0();
        }
        float n4;
        if ((n3 & 0x8) != 0x0) {
            n4 = 1.0f;
        }
        else {
            n4 = 0.0f;
        }
        if ((n3 & 0x10) != 0x0) {
            a = h.a;
        }
        if ((n3 & 0x40) != 0x0) {
            n3 = 3;
        }
        else {
            n3 = 0;
        }
        e.V(n, n2, e2, n4, a, null, n3);
    }
    
    default void Q0(final e e, final long n, long b, long k0, float n2, s s, int n3) {
        if ((n3 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n3 & 0x4) != 0x0) {
            k0 = K0(e.e(), b);
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = 1.0f;
        }
        h a;
        if ((n3 & 0x10) != 0x0) {
            a = h.a;
        }
        else {
            a = null;
        }
        if ((n3 & 0x20) != 0x0) {
            s = null;
        }
        if ((n3 & 0x40) != 0x0) {
            n3 = 3;
        }
        else {
            n3 = 0;
        }
        e.F0(n, b, k0, n2, a, s, n3);
    }
    
    default void W(final e e, final b0 b0, final n n, float n2, i a, int n3) {
        if ((n3 & 0x4) != 0x0) {
            n2 = 1.0f;
        }
        if ((n3 & 0x8) != 0x0) {
            a = (i)h.a;
        }
        if ((n3 & 0x20) != 0x0) {
            n3 = 3;
        }
        else {
            n3 = 0;
        }
        e.o0(b0, n, n2, a, null, n3);
    }
    
    default void X(final e e, final long n, long b, long k0, long b2, f a, int n2) {
        if ((n2 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n2 & 0x4) != 0x0) {
            k0 = K0(e.e(), b);
        }
        if ((n2 & 0x8) != 0x0) {
            b2 = n1.a.b;
        }
        if ((n2 & 0x10) != 0x0) {
            a = h.a;
        }
        float n3;
        if ((n2 & 0x20) != 0x0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        if ((n2 & 0x80) != 0x0) {
            n2 = 3;
        }
        else {
            n2 = 0;
        }
        e.J0(n, b, k0, b2, a, n3, null, n2);
    }
    
    default void a0(final e e, final long n, final long n2, final long n3, float n4, int n5, int n6, final int n7) {
        float n8 = 0.0f;
        if ((n7 & 0x8) != 0x0) {
            n4 = 0.0f;
        }
        if ((n7 & 0x10) != 0x0) {
            n5 = 0;
        }
        if ((n7 & 0x40) != 0x0) {
            n8 = 1.0f;
        }
        if ((n7 & 0x100) != 0x0) {
            n6 = 3;
        }
        e.I(n, n2, n3, n4, n5, null, n8, null, n6);
    }
    
    default void m0(final e e, final n n, long b, long k0, long b2, i a, int n2) {
        if ((n2 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n2 & 0x4) != 0x0) {
            k0 = K0(e.e(), b);
        }
        if ((n2 & 0x8) != 0x0) {
            b2 = n1.a.b;
        }
        float n3;
        if ((n2 & 0x10) != 0x0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        if ((n2 & 0x20) != 0x0) {
            a = (i)h.a;
        }
        if ((n2 & 0x80) != 0x0) {
            n2 = 3;
        }
        else {
            n2 = 0;
        }
        e.F(n, b, k0, b2, n3, a, null, n2);
    }
    
    default void n0(final e e, final b0 b0, final long n, float n2, h a, int n3) {
        if ((n3 & 0x4) != 0x0) {
            n2 = 1.0f;
        }
        if ((n3 & 0x8) != 0x0) {
            a = h.a;
        }
        if ((n3 & 0x20) != 0x0) {
            n3 = 3;
        }
        else {
            n3 = 0;
        }
        e.R(b0, n, n2, a, null, n3);
    }
    
    void F(final n p0, final long p1, final long p2, final long p3, final float p4, final f p5, final s p6, final int p7);
    
    void F0(final long p0, final long p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    void G0(final n p0, final long p1, final long p2, final float p3, final int p4, final xd.a p5, final float p6, final s p7, final int p8);
    
    void I(final long p0, final long p1, final long p2, final float p3, final int p4, final xd.a p5, final float p6, final s p7, final int p8);
    
    void J0(final long p0, final long p1, final long p2, final long p3, final f p4, final float p5, final s p6, final int p7);
    
    void P0(final ArrayList p0, final long p1, final float p2, final int p3, final xd.a p4, final float p5, final s p6, final int p7);
    
    void R(final b0 p0, final long p1, final float p2, final f p3, final s p4, final int p5);
    
    void V(final long p0, final float p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    void b0(final w p0, final long p1, final float p2, final f p3, final s p4, final int p5);
    
    q1.a.a$b c0();
    
    default long e() {
        return this.c0().e();
    }
    
    default long e0() {
        return a.M1(this.c0().e());
    }
    
    void f0(final n p0, final float p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    LayoutDirection getLayoutDirection();
    
    default void j0(final w w, final long n, final long n2, final long n3, final long n4, final float n5, final f f, final s s, final int n6, final int n7) {
        ng2.e.f((Object)w, "image");
        ng2.e.f((Object)f, "style");
        N(this, w, n, n2, n3, n4, n5, f, s, n6, 0, 512);
    }
    
    void o0(final b0 p0, final n p1, final float p2, final f p3, final s p4, final int p5);
    
    void q0(final n p0, final long p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    void u0(final long p0, final float p1, final float p2, final long p3, final long p4, final float p5, final f p6, final s p7, final int p8);
}
