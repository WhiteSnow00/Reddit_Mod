// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import com.reddit.news.ui.composables.RecommendationContextSection;
import androidx.compose.ui.unit.LayoutDirection;
import o1.p;
import o1.w;
import o1.b0;
import a4.u1;
import java.util.ArrayList;
import o1.s;
import o1.n;
import androidx.compose.ui.node.DrawEntity;
import q1.a;
import q1.c;
import q1.e;

public final class f implements e, c
{
    public final a f;
    public DrawEntity g;
    
    public f() {
        final a f = new a();
        this.f = f;
    }
    
    @Override
    public final void A(final n n, final long n2, final long n3, final long n4, final float n5, final q1.f f, final s s, final int n6) {
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.A(n, n2, n3, n4, n5, f, s, n6);
    }
    
    @Override
    public final void D0(final long n, final long n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)f, "style");
        this.f.D0(n, n2, n3, n4, f, s, n5);
    }
    
    @Override
    public final void I0(final long n, final long n2, final long n3, final long n4, final q1.f f, final float n5, final s s, final int n6) {
        ah2.f.f((Object)f, "style");
        this.f.I0(n, n2, n3, n4, f, n5, s, n6);
    }
    
    @Override
    public final void K0(final ArrayList list, final long n, final float n2, final int n3, final u1 u1, final float n4, final s s, final int n5) {
        this.f.K0(list, n, n2, n3, u1, n4, s, n5);
    }
    
    @Override
    public final float M0(final float n) {
        return this.f.getDensity() * n;
    }
    
    @Override
    public final void N(final b0 b0, final long n, final float n2, final q1.f f, final s s, final int n3) {
        ah2.f.f((Object)b0, "path");
        ah2.f.f((Object)f, "style");
        this.f.N(b0, n, n2, f, s, n3);
    }
    
    @Override
    public final void N0(final long n, final long n2, final long n3, final float n4, final int n5, final u1 u1, final float n6, final s s, final int n7) {
        this.f.N0(n, n2, n3, n4, n5, u1, n6, s, n7);
    }
    
    @Override
    public final void S(final long n, final float n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)f, "style");
        this.f.S(n, n2, n3, n4, f, s, n5);
    }
    
    @Override
    public final void X(final w w, final long n, final float n2, final q1.f f, final s s, final int n3) {
        ah2.f.f((Object)w, "image");
        ah2.f.f((Object)f, "style");
        this.f.X(w, n, n2, f, s, n3);
    }
    
    @Override
    public final a.a$b Y() {
        return this.f.g;
    }
    
    @Override
    public final long Z() {
        return this.f.Z();
    }
    
    @Override
    public final void a0(final n n, final float n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.a0(n, n2, n3, n4, f, s, n5);
    }
    
    @Override
    public final long b() {
        return this.f.b();
    }
    
    @Override
    public final long b0(final long n) {
        return this.f.b0(n);
    }
    
    @Override
    public final void c0() {
        final p a = this.f.g.a();
        final DrawEntity g = this.g;
        ah2.f.c((Object)g);
        final DrawEntity drawEntity = (DrawEntity)((g)g).h;
        if (drawEntity != null) {
            drawEntity.c(a);
        }
        else {
            ((g)g).f.j1(a);
        }
    }
    
    @Override
    public final void d0(final w w, final long n, final long n2, final long n3, final long n4, final float n5, final q1.f f, final s s, final int n6, final int n7) {
        ah2.f.f((Object)w, "image");
        ah2.f.f((Object)f, "style");
        this.f.d0(w, n, n2, n3, n4, n5, f, s, n6, n7);
    }
    
    @Override
    public final long f(final long n) {
        return this.f.f(n);
    }
    
    @Override
    public final float getDensity() {
        return this.f.getDensity();
    }
    
    @Override
    public final float getFontScale() {
        return this.f.getFontScale();
    }
    
    @Override
    public final LayoutDirection getLayoutDirection() {
        return this.f.f.b;
    }
    
    @Override
    public final float i(final long n) {
        return this.f.i(n);
    }
    
    @Override
    public final void i0(final n n, final long n2, final long n3, final float n4, final int n5, final u1 u1, final float n6, final s s, final int n7) {
        ah2.f.f((Object)n, "brush");
        this.f.i0(n, n2, n3, n4, n5, u1, n6, s, n7);
    }
    
    @Override
    public final long j(final float n) {
        return this.f.j(n);
    }
    
    @Override
    public final void m0(final b0 b0, final n n, final float n2, final q1.f f, final s s, final int n3) {
        ah2.f.f((Object)b0, "path");
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.m0(b0, n, n2, f, s, n3);
    }
    
    @Override
    public final void o0(final n n, final long n2, final long n3, final float n4, final q1.f f, final s s, final int n5) {
        ah2.f.f((Object)n, "brush");
        ah2.f.f((Object)f, "style");
        this.f.o0(n, n2, n3, n4, f, s, n5);
    }
    
    @Override
    public final float q(final int n) {
        return this.f.q(n);
    }
    
    @Override
    public final void q0(final long n, final float n2, final float n3, final long n4, final long n5, final float n6, final q1.f f, final s s, final int n7) {
        ah2.f.f((Object)f, "style");
        this.f.q0(n, n2, n3, n4, n5, n6, f, s, n7);
    }
    
    @Override
    public final float r(final float n) {
        return n / this.f.getDensity();
    }
    
    @Override
    public final long s() {
        final float f = RecommendationContextSection.f;
        return this.f.s();
    }
    
    @Override
    public final int s0(final float n) {
        return this.f.s0(n);
    }
    
    @Override
    public final float x0(final long n) {
        return this.f.x0(n);
    }
}
