// 
// Decompiled by Procyon v0.6.0
// 

package q1;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import a4.u1;
import o1.b0;
import yl.a;
import u2.g;
import o1.n;
import n1.c;
import o1.s;
import o1.w;
import u2.b;

public interface e extends b
{
    default void A0(final e e, final w w, final s s) {
        e.X(w, c.b, 1.0f, h.a, s, 3);
    }
    
    default void G(final e e, final n n, long b, long j0, float n2, f a, int n3, final int n4) {
        if ((n4 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n4 & 0x4) != 0x0) {
            j0 = J0(e.b(), b);
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
        e.o0(n, b, j0, n2, a, null, n3);
    }
    
    default void H(final e e, final w w, long c, long b, long n, final long n2, float n3, f a, s s, int n4, int n5, final int n6) {
        long b2;
        if ((n6 & 0x2) != 0x0) {
            b2 = g.b;
        }
        else {
            b2 = c;
        }
        if ((n6 & 0x4) != 0x0) {
            c = a.c(w.getWidth(), w.getHeight());
        }
        else {
            c = b;
        }
        if ((n6 & 0x8) != 0x0) {
            b = g.b;
        }
        else {
            b = n;
        }
        if ((n6 & 0x10) != 0x0) {
            n = c;
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
        e.d0(w, b2, c, b, n, n3, a, s, n4, n5);
    }
    
    default long J0(final long n, final long n2) {
        return a80.a.f(n1.f.e(n) - c.c(n2), n1.f.c(n) - c.d(n2));
    }
    
    default void L0(final e e, final long n, final float n2, final float n3, long b, long j0, float n4, f a, int n5) {
        if ((n5 & 0x10) != 0x0) {
            b = c.b;
        }
        if ((n5 & 0x20) != 0x0) {
            j0 = J0(e.b(), b);
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
        e.q0(n, n2, n3, b, j0, n4, a, null, n5);
    }
    
    default void P0(final e e, final long n, long b, long j0, float n2, s s, int n3) {
        if ((n3 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n3 & 0x4) != 0x0) {
            j0 = J0(e.b(), b);
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
        e.D0(n, b, j0, n2, a, s, n3);
    }
    
    default void U(final e e, final long n, long b, long j0, long b2, f a, int n2) {
        if ((n2 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n2 & 0x4) != 0x0) {
            j0 = J0(e.b(), b);
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
        e.I0(n, b, j0, b2, a, n3, null, n2);
    }
    
    default void h0(final e e, final n n, long b, long j0, long b2, i a, int n2) {
        if ((n2 & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n2 & 0x4) != 0x0) {
            j0 = J0(e.b(), b);
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
        e.A(n, b, j0, b2, n3, a, null, n2);
    }
    
    void A(final n p0, final long p1, final long p2, final long p3, final float p4, final f p5, final s p6, final int p7);
    
    void D0(final long p0, final long p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    void I0(final long p0, final long p1, final long p2, final long p3, final f p4, final float p5, final s p6, final int p7);
    
    void K0(final ArrayList p0, final long p1, final float p2, final int p3, final u1 p4, final float p5, final s p6, final int p7);
    
    void N(final b0 p0, final long p1, final float p2, final f p3, final s p4, final int p5);
    
    void N0(final long p0, final long p1, final long p2, final float p3, final int p4, final u1 p5, final float p6, final s p7, final int p8);
    
    void S(final long p0, final float p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    void X(final w p0, final long p1, final float p2, final f p3, final s p4, final int p5);
    
    q1.a.a$b Y();
    
    default long Z() {
        return a80.a.I(this.Y().b());
    }
    
    void a0(final n p0, final float p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    default long b() {
        return this.Y().b();
    }
    
    default void d0(final w w, final long n, final long n2, final long n3, final long n4, final float n5, final f f, final s s, final int n6, final int n7) {
        ah2.f.f((Object)w, "image");
        ah2.f.f((Object)f, "style");
        H(this, w, n, n2, n3, n4, n5, f, s, n6, 0, 512);
    }
    
    LayoutDirection getLayoutDirection();
    
    void i0(final n p0, final long p1, final long p2, final float p3, final int p4, final u1 p5, final float p6, final s p7, final int p8);
    
    void m0(final b0 p0, final n p1, final float p2, final f p3, final s p4, final int p5);
    
    void o0(final n p0, final long p1, final long p2, final float p3, final f p4, final s p5, final int p6);
    
    void q0(final long p0, final float p1, final float p2, final long p3, final long p4, final float p5, final f p6, final s p7, final int p8);
}
