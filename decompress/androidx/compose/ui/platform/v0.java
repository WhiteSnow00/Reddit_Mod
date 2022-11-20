// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.graphics.Matrix;
import android.graphics.RecordingCanvas;
import o1.b;
import cg2.j;
import o1.p;
import mg2.l;
import o1.b0;
import h.s;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import o1.g0;
import ng2.e;
import android.graphics.RenderNode;

public final class v0 implements f0
{
    public final RenderNode a;
    
    public v0(final AndroidComposeView androidComposeView) {
        e.f((Object)androidComposeView, "ownerView");
        this.a = new RenderNode("Compose");
    }
    
    @Override
    public final void B(final float translationX) {
        this.a.setTranslationX(translationX);
    }
    
    @Override
    public final void E(final g0 g0) {
        if (Build$VERSION.SDK_INT >= 31) {
            x0.a.a(this.a, g0);
        }
    }
    
    @Override
    public final void F(final Canvas canvas) {
        a4.v0.m(canvas, this.a);
    }
    
    @Override
    public final void G(final boolean clipToBounds) {
        this.a.setClipToBounds(clipToBounds);
    }
    
    @Override
    public final void H(final float elevation) {
        this.a.setElevation(elevation);
    }
    
    @Override
    public final void I(final s s, final b0 b0, final l<? super p, j> l) {
        e.f((Object)s, "canvasHolder");
        final RecordingCanvas beginRecording = this.a.beginRecording();
        e.e((Object)beginRecording, "renderNode.beginRecording()");
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
    
    @Override
    public final void J(final int n) {
        this.a.offsetTopAndBottom(n);
    }
    
    @Override
    public final boolean K() {
        return this.a.hasDisplayList();
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
        e.f((Object)matrix, "matrix");
        this.a.getMatrix(matrix);
    }
    
    @Override
    public final void O(final int n) {
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
    public final boolean T(final int n, final int n2, final int n3, final int n4) {
        return this.a.setPosition(n, n2, n3, n4);
    }
    
    @Override
    public final void U() {
        this.a.discardDisplayList();
    }
    
    @Override
    public final boolean V() {
        return this.a.getClipToBounds();
    }
    
    @Override
    public final void W(final int ambientShadowColor) {
        this.a.setAmbientShadowColor(ambientShadowColor);
    }
    
    @Override
    public final void X(final int spotShadowColor) {
        this.a.setSpotShadowColor(spotShadowColor);
    }
    
    @Override
    public final float Y() {
        return this.a.getElevation();
    }
    
    @Override
    public final int a() {
        return this.a.getRight();
    }
    
    @Override
    public final int b() {
        return this.a.getLeft();
    }
    
    @Override
    public final int c() {
        return this.a.getBottom();
    }
    
    @Override
    public final void d(final float alpha) {
        this.a.setAlpha(alpha);
    }
    
    @Override
    public final int e() {
        return this.a.getTop();
    }
    
    @Override
    public final float f() {
        return this.a.getAlpha();
    }
    
    @Override
    public final int getHeight() {
        return this.a.getHeight();
    }
    
    @Override
    public final int getWidth() {
        return this.a.getWidth();
    }
    
    @Override
    public final void j(final float translationY) {
        this.a.setTranslationY(translationY);
    }
    
    @Override
    public final void o(final float cameraDistance) {
        this.a.setCameraDistance(cameraDistance);
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
    public final void r(final float rotationZ) {
        this.a.setRotationZ(rotationZ);
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
