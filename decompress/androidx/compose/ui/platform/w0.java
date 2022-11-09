// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.os.Build$VERSION;
import o1.g0;
import android.graphics.RecordingCanvas;
import o1.b;
import pg2.j;
import o1.p;
import zg2.l;
import o1.b0;
import h.s;
import android.graphics.Outline;
import android.graphics.Matrix;
import a4.c2;
import android.graphics.Canvas;
import ah2.f;
import android.graphics.RenderNode;

public final class w0 implements h0
{
    public final RenderNode a;
    
    public w0(final AndroidComposeView androidComposeView) {
        f.f((Object)androidComposeView, "ownerView");
        this.a = new RenderNode("Compose");
    }
    
    public final void A(final Canvas canvas) {
        c2.h(canvas, this.a);
    }
    
    public final void B(final boolean clipToBounds) {
        this.a.setClipToBounds(clipToBounds);
    }
    
    public final void C(final float elevation) {
        this.a.setElevation(elevation);
    }
    
    public final void D(final int n) {
        this.a.offsetTopAndBottom(n);
    }
    
    public final boolean E() {
        return this.a.hasDisplayList();
    }
    
    public final boolean F() {
        return this.a.setHasOverlappingRendering(true);
    }
    
    public final boolean G() {
        return this.a.getClipToOutline();
    }
    
    public final void H(final Matrix matrix) {
        f.f((Object)matrix, "matrix");
        this.a.getMatrix(matrix);
    }
    
    public final void I(final int n) {
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
        f.f((Object)s, "canvasHolder");
        final RecordingCanvas beginRecording = this.a.beginRecording();
        f.e((Object)beginRecording, "renderNode.beginRecording()");
        final b b2 = (b)s.g;
        final Canvas a = b2.a;
        b2.getClass();
        b2.a = (Canvas)beginRecording;
        final b b3 = (b)s.g;
        if (b0 != null) {
            b3.save();
            b3.h(b0, 1);
        }
        l.invoke((Object)b3);
        if (b0 != null) {
            b3.restore();
        }
        ((b)s.g).w(a);
        this.a.endRecording();
    }
    
    public final boolean O(final int n, final int n2, final int n3, final int n4) {
        return this.a.setPosition(n, n2, n3, n4);
    }
    
    public final void P() {
        this.a.discardDisplayList();
    }
    
    public final boolean Q() {
        return this.a.getClipToBounds();
    }
    
    public final void R(final int ambientShadowColor) {
        this.a.setAmbientShadowColor(ambientShadowColor);
    }
    
    public final void S(final int spotShadowColor) {
        this.a.setSpotShadowColor(spotShadowColor);
    }
    
    public final float T() {
        return this.a.getElevation();
    }
    
    public final int a() {
        return this.a.getRight();
    }
    
    public final int b() {
        return this.a.getLeft();
    }
    
    public final int c() {
        return this.a.getBottom();
    }
    
    public final void d(final float alpha) {
        this.a.setAlpha(alpha);
    }
    
    public final int e() {
        return this.a.getTop();
    }
    
    public final void g(final float translationY) {
        this.a.setTranslationY(translationY);
    }
    
    public final int getHeight() {
        return this.a.getHeight();
    }
    
    public final int getWidth() {
        return this.a.getWidth();
    }
    
    public final void l(final float cameraDistance) {
        this.a.setCameraDistance(cameraDistance);
    }
    
    public final void m(final float rotationX) {
        this.a.setRotationX(rotationX);
    }
    
    public final void n(final float rotationY) {
        this.a.setRotationY(rotationY);
    }
    
    public final void o(final float rotationZ) {
        this.a.setRotationZ(rotationZ);
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
        if (Build$VERSION.SDK_INT >= 31) {
            x0.a.a(this.a, g0);
        }
    }
}
