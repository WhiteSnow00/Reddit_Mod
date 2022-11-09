// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import o1.g0;
import o1.b;
import pg2.j;
import o1.p;
import zg2.l;
import o1.b0;
import h.s;
import android.graphics.Outline;
import android.graphics.Matrix;
import android.view.DisplayListCanvas;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.view.View;
import ah2.f;
import android.view.RenderNode;

public final class v0 implements h0
{
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    
    public v0(final AndroidComposeView androidComposeView) {
        ah2.f.f((Object)androidComposeView, "ownerView");
        final RenderNode create = RenderNode.create("Compose", (View)androidComposeView);
        ah2.f.e((Object)create, "create(\"Compose\", ownerView)");
        this.a = create;
        if (v0.g) {
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
            v0.g = false;
        }
    }
    
    public final void A(final Canvas canvas) {
        ((DisplayListCanvas)canvas).drawRenderNode(this.a);
    }
    
    public final void B(final boolean b) {
        this.f = b;
        this.a.setClipToBounds(b);
    }
    
    public final void C(final float elevation) {
        this.a.setElevation(elevation);
    }
    
    public final void D(final int n) {
        this.c += n;
        this.e += n;
        this.a.offsetTopAndBottom(n);
    }
    
    public final boolean E() {
        return this.a.isValid();
    }
    
    public final boolean F() {
        return this.a.setHasOverlappingRendering(true);
    }
    
    public final boolean G() {
        return this.a.getClipToOutline();
    }
    
    public final void H(final Matrix matrix) {
        ah2.f.f((Object)matrix, "matrix");
        this.a.getMatrix(matrix);
    }
    
    public final void I(final int n) {
        this.b += n;
        this.d += n;
        this.a.offsetLeftAndRight(n);
    }
    
    public final void J(final float pivotX) {
        this.a.setPivotX(pivotX);
    }
    
    public final void K(final float pivotY) {
        this.a.setPivotY(pivotY);
    }
    
    public final void L(final Outline outline) {
        this.a.setOutline(outline);
    }
    
    public final void M(final boolean clipToOutline) {
        this.a.setClipToOutline(clipToOutline);
    }
    
    public final void N(final s s, final b0 b0, final l<? super p, j> l) {
        ah2.f.f((Object)s, "canvasHolder");
        final DisplayListCanvas start = this.a.start(this.d - this.b, this.e - this.c);
        ah2.f.e((Object)start, "renderNode.start(width, height)");
        final Canvas v = s.g().v();
        s.g().w((Canvas)start);
        final b g = s.g();
        if (b0 != null) {
            g.save();
            p.n((p)g, b0);
        }
        l.invoke((Object)g);
        if (b0 != null) {
            g.restore();
        }
        s.g().w(v);
        this.a.end(start);
    }
    
    public final boolean O(final int b, final int c, final int d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        return this.a.setLeftTopRightBottom(b, c, d, e);
    }
    
    public final void P() {
        y0.a.a(this.a);
    }
    
    public final boolean Q() {
        return this.f;
    }
    
    public final void R(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            z0.a.c(this.a, n);
        }
    }
    
    public final void S(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            z0.a.d(this.a, n);
        }
    }
    
    public final float T() {
        return this.a.getElevation();
    }
    
    public final int a() {
        return this.d;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c() {
        return this.e;
    }
    
    public final void d(final float alpha) {
        this.a.setAlpha(alpha);
    }
    
    public final int e() {
        return this.c;
    }
    
    public final void g(final float translationY) {
        this.a.setTranslationY(translationY);
    }
    
    public final int getHeight() {
        return this.e - this.c;
    }
    
    public final int getWidth() {
        return this.d - this.b;
    }
    
    public final void l(final float n) {
        this.a.setCameraDistance(-n);
    }
    
    public final void m(final float rotationX) {
        this.a.setRotationX(rotationX);
    }
    
    public final void n(final float rotationY) {
        this.a.setRotationY(rotationY);
    }
    
    public final void o(final float rotation) {
        this.a.setRotation(rotation);
    }
    
    public final void t(final float scaleX) {
        this.a.setScaleX(scaleX);
    }
    
    public final float u() {
        return this.a.getAlpha();
    }
    
    public final void v(final float scaleY) {
        this.a.setScaleY(scaleY);
    }
    
    public final void x(final float translationX) {
        this.a.setTranslationX(translationX);
    }
    
    public final void z(final g0 g0) {
    }
}
