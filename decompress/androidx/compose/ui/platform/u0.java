// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.graphics.Matrix;
import o1.b;
import cg2.j;
import o1.p;
import mg2.l;
import o1.b0;
import h.s;
import android.view.DisplayListCanvas;
import android.graphics.Canvas;
import o1.g0;
import android.os.Build$VERSION;
import android.view.View;
import ng2.e;
import android.view.RenderNode;

public final class u0 implements f0
{
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    
    public u0(final AndroidComposeView androidComposeView) {
        ng2.e.f((Object)androidComposeView, "ownerView");
        final RenderNode create = RenderNode.create("Compose", (View)androidComposeView);
        ng2.e.e((Object)create, "create(\"Compose\", ownerView)");
        this.a = create;
        if (u0.g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build$VERSION.SDK_INT >= 28) {
                final z0 a = z0.a;
                a.c(create, a.a(create));
                a.d(create, a.b(create));
            }
            y0.a.a(create);
            u0.g = false;
        }
    }
    
    @Override
    public final void B(final float translationX) {
        this.a.setTranslationX(translationX);
    }
    
    @Override
    public final void E(final g0 g0) {
    }
    
    @Override
    public final void F(final Canvas canvas) {
        ((DisplayListCanvas)canvas).drawRenderNode(this.a);
    }
    
    @Override
    public final void G(final boolean b) {
        this.f = b;
        this.a.setClipToBounds(b);
    }
    
    @Override
    public final void H(final float elevation) {
        this.a.setElevation(elevation);
    }
    
    @Override
    public final void I(final s s, final b0 b0, final l<? super p, j> l) {
        ng2.e.f((Object)s, "canvasHolder");
        final DisplayListCanvas start = this.a.start(this.d - this.b, this.e - this.c);
        ng2.e.e((Object)start, "renderNode.start(width, height)");
        final Canvas v = s.v().v();
        s.v().w((Canvas)start);
        final b v2 = s.v();
        if (b0 != null) {
            v2.save();
            p.n((p)v2, b0);
        }
        l.invoke((Object)v2);
        if (b0 != null) {
            v2.restore();
        }
        s.v().w(v);
        this.a.end(start);
    }
    
    @Override
    public final void J(final int n) {
        this.c += n;
        this.e += n;
        this.a.offsetTopAndBottom(n);
    }
    
    @Override
    public final boolean K() {
        return this.a.isValid();
    }
    
    @Override
    public final boolean L() {
        return this.a.setHasOverlappingRendering(true);
    }
    
    @Override
    public final boolean M() {
        return this.a.getClipToOutline();
    }
    
    @Override
    public final void N(final Matrix matrix) {
        ng2.e.f((Object)matrix, "matrix");
        this.a.getMatrix(matrix);
    }
    
    @Override
    public final void O(final int n) {
        this.b += n;
        this.d += n;
        this.a.offsetLeftAndRight(n);
    }
    
    @Override
    public final void P(final float pivotX) {
        this.a.setPivotX(pivotX);
    }
    
    @Override
    public final void Q(final float pivotY) {
        this.a.setPivotY(pivotY);
    }
    
    @Override
    public final void R(final Outline outline) {
        this.a.setOutline(outline);
    }
    
    @Override
    public final void S(final boolean clipToOutline) {
        this.a.setClipToOutline(clipToOutline);
    }
    
    @Override
    public final boolean T(final int b, final int c, final int d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        return this.a.setLeftTopRightBottom(b, c, d, e);
    }
    
    @Override
    public final void U() {
        y0.a.a(this.a);
    }
    
    @Override
    public final boolean V() {
        return this.f;
    }
    
    @Override
    public final void W(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            z0.a.c(this.a, n);
        }
    }
    
    @Override
    public final void X(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            z0.a.d(this.a, n);
        }
    }
    
    @Override
    public final float Y() {
        return this.a.getElevation();
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final int b() {
        return this.b;
    }
    
    @Override
    public final int c() {
        return this.e;
    }
    
    @Override
    public final void d(final float alpha) {
        this.a.setAlpha(alpha);
    }
    
    @Override
    public final int e() {
        return this.c;
    }
    
    @Override
    public final float f() {
        return this.a.getAlpha();
    }
    
    @Override
    public final int getHeight() {
        return this.e - this.c;
    }
    
    @Override
    public final int getWidth() {
        return this.d - this.b;
    }
    
    @Override
    public final void j(final float translationY) {
        this.a.setTranslationY(translationY);
    }
    
    @Override
    public final void o(final float n) {
        this.a.setCameraDistance(-n);
    }
    
    @Override
    public final void p(final float rotationX) {
        this.a.setRotationX(rotationX);
    }
    
    @Override
    public final void q(final float rotationY) {
        this.a.setRotationY(rotationY);
    }
    
    @Override
    public final void r(final float rotation) {
        this.a.setRotation(rotation);
    }
    
    @Override
    public final void x(final float scaleX) {
        this.a.setScaleX(scaleX);
    }
    
    @Override
    public final void z(final float scaleY) {
        this.a.setScaleY(scaleY);
    }
}
