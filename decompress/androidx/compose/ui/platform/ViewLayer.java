// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewGroup;
import u2.g;
import u2.i;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.view.ViewOutlineProvider;
import o1.f0;
import androidx.compose.ui.unit.LayoutDirection;
import o1.g0;
import aj2.c;
import n1.b;
import o1.b0;
import o1.q0;
import ah2.f;
import h.s;
import android.graphics.Rect;
import zg2.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import pg2.j;
import android.graphics.Matrix;
import zg2.p;
import e2.l;
import android.view.View;

public final class ViewLayer extends View implements l
{
    public static final p<View, Matrix, j> r;
    public static final ViewLayer$a s;
    public static Method t;
    public static Field u;
    public static boolean v;
    public static boolean w;
    public final AndroidComposeView f;
    public final l0 g;
    public zg2.l<? super o1.p, j> h;
    public a<j> i;
    public final u0 j;
    public boolean k;
    public Rect l;
    public boolean m;
    public boolean n;
    public final s o;
    public final r0<View> p;
    public long q;
    
    static {
        r = (p)ViewLayer$Companion$getMatrix.ViewLayer$Companion$getMatrix$1.INSTANCE;
        s = new ViewLayer$a();
    }
    
    public ViewLayer(final AndroidComposeView f, final l0 g, final zg2.l<? super o1.p, j> h, final a<j> i) {
        ah2.f.f((Object)f, "ownerView");
        ah2.f.f((Object)h, "drawBlock");
        ah2.f.f((Object)i, "invalidateParentLayer");
        super(((View)f).getContext());
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = new u0(f.getDensity());
        this.o = new s(1, 0);
        this.p = (r0<View>)new r0((p)ViewLayer.r);
        this.q = q0.b;
        this.setWillNotDraw(false);
        this.setId(View.generateViewId());
        ((ViewGroup)g).addView((View)this);
    }
    
    private final b0 getManualClipPath() {
        if (this.getClipToOutline()) {
            final u0 j = this.j;
            if (!(j.i ^ true)) {
                j.e();
                return j.g;
            }
        }
        return null;
    }
    
    private final void setInvalidated(final boolean m) {
        if (m != this.m) {
            this.m = m;
            this.f.J((l)this, m);
        }
    }
    
    public final void a(final b b, final boolean b2) {
        if (b2) {
            final float[] a = this.p.a((Object)this);
            if (a != null) {
                c.q0(a, b);
            }
            else {
                b.a = 0.0f;
                b.b = 0.0f;
                b.c = 0.0f;
                b.d = 0.0f;
            }
        }
        else {
            c.q0(this.p.b((Object)this), b);
        }
    }
    
    public final void b(final a i, final zg2.l h) {
        ah2.f.f((Object)h, "drawBlock");
        ah2.f.f((Object)i, "invalidateParentLayer");
        ((ViewGroup)this.g).addView((View)this);
        this.k = false;
        this.n = false;
        final int c = q0.c;
        this.q = q0.b;
        this.h = (zg2.l<? super o1.p, j>)h;
        this.i = (a<j>)i;
    }
    
    public final void c(final o1.p p) {
        ah2.f.f((Object)p, "canvas");
        final boolean n = this.getElevation() > 0.0f;
        this.n = n;
        if (n) {
            p.k();
        }
        this.g.a(p, (View)this, this.getDrawingTime());
        if (this.n) {
            p.g();
        }
    }
    
    public final void d(final float scaleX, final float scaleY, final float alpha, final float translationX, final float translationY, final float elevation, final float rotationX, final float rotationY, final float rotation, final float cameraDistancePx, long q, final o1.l0 l0, final boolean b, final g0 g0, final long n, final long n2, final LayoutDirection layoutDirection, final u2.b b2) {
        ah2.f.f((Object)l0, "shape");
        ah2.f.f((Object)layoutDirection, "layoutDirection");
        ah2.f.f((Object)b2, "density");
        this.q = q;
        this.setScaleX(scaleX);
        this.setScaleY(scaleY);
        this.setAlpha(alpha);
        this.setTranslationX(translationX);
        this.setTranslationY(translationY);
        this.setElevation(elevation);
        this.setRotation(rotation);
        this.setRotationX(rotationX);
        this.setRotationY(rotationY);
        q = this.q;
        final int c = q0.c;
        this.setPivotX(Float.intBitsToFloat((int)(q >> 32)) * this.getWidth());
        this.setPivotY(q0.a(this.q) * this.getHeight());
        this.setCameraDistancePx(cameraDistancePx);
        int n3 = 1;
        this.k = (b && l0 == f0.a);
        this.j();
        final boolean b3 = this.getManualClipPath() != null;
        this.setClipToOutline(b && l0 != f0.a);
        final boolean d = this.j.d(l0, this.getAlpha(), this.getClipToOutline(), this.getElevation(), layoutDirection, b2);
        Object s;
        if (this.j.b() != null) {
            s = ViewLayer.s;
        }
        else {
            s = null;
        }
        this.setOutlineProvider((ViewOutlineProvider)s);
        if (this.getManualClipPath() == null) {
            n3 = 0;
        }
        if ((b3 ? 1 : 0) != n3 || (n3 && d)) {
            this.invalidate();
        }
        if (!this.n && this.getElevation() > 0.0f) {
            final a<j> i = this.i;
            if (i != null) {
                i.invoke();
            }
        }
        this.p.c();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            final m1 a = m1.a;
            a.a((View)this, at1.a.X1(n));
            a.b((View)this, at1.a.X1(n2));
        }
        if (sdk_INT >= 31) {
            o1.a.a((View)this, g0);
        }
    }
    
    public final void destroy() {
        this.setInvalidated(false);
        final AndroidComposeView f = this.f;
        f.A = true;
        this.h = null;
        this.i = null;
        f.L((l)this);
        ((ViewGroup)this.g).removeViewInLayout((View)this);
    }
    
    public final void dispatchDraw(final Canvas a) {
        ah2.f.f((Object)a, "canvas");
        boolean b = false;
        this.setInvalidated(false);
        final s o = this.o;
        final Object g = o.g;
        final Canvas a2 = ((o1.b)g).a;
        final o1.b b2 = (o1.b)g;
        b2.getClass();
        b2.a = a;
        final o1.b b3 = (o1.b)o.g;
        if (this.getManualClipPath() != null || !a.isHardwareAccelerated()) {
            b = true;
            ((o1.p)b3).save();
            this.j.a((o1.p)b3);
        }
        final zg2.l<? super o1.p, j> h = this.h;
        if (h != null) {
            h.invoke((Object)b3);
        }
        if (b) {
            ((o1.p)b3).restore();
        }
        ((o1.b)o.g).w(a2);
    }
    
    public final long e(long n, final boolean b) {
        if (b) {
            final float[] a = this.p.a((Object)this);
            if (a != null) {
                n = c.p0(a, n);
            }
            else {
                final int e = n1.c.e;
                n = n1.c.c;
            }
        }
        else {
            n = c.p0(this.p.b((Object)this), n);
        }
        return n;
    }
    
    public final void f(long d) {
        final int n = (int)(d >> 32);
        final int b = u2.i.b(d);
        if (n != this.getWidth() || b != this.getHeight()) {
            d = this.q;
            final int c = q0.c;
            final float intBitsToFloat = Float.intBitsToFloat((int)(d >> 32));
            final float n2 = (float)n;
            this.setPivotX(intBitsToFloat * n2);
            final float a = q0.a(this.q);
            final float n3 = (float)b;
            this.setPivotY(a * n3);
            final u0 j = this.j;
            d = a80.a.f(n2, n3);
            if (!n1.f.b(j.d, d)) {
                j.d = d;
                j.h = true;
            }
            Object s;
            if (this.j.b() != null) {
                s = ViewLayer.s;
            }
            else {
                s = null;
            }
            this.setOutlineProvider((ViewOutlineProvider)s);
            this.layout(this.getLeft(), this.getTop(), this.getLeft() + n, this.getTop() + b);
            this.j();
            this.p.c();
        }
    }
    
    public final void forceLayout() {
    }
    
    public final boolean g(final long n) {
        final float c = n1.c.c(n);
        final float d = n1.c.d(n);
        final boolean k = this.k;
        boolean b = true;
        if (k) {
            if (0.0f > c || c >= this.getWidth() || 0.0f > d || d >= this.getHeight()) {
                b = false;
            }
            return b;
        }
        return !this.getClipToOutline() || this.j.c(n);
    }
    
    public final float getCameraDistancePx() {
        return this.getCameraDistance() / this.getResources().getDisplayMetrics().densityDpi;
    }
    
    public final l0 getContainer() {
        return this.g;
    }
    
    public long getLayerId() {
        return this.getId();
    }
    
    public final AndroidComposeView getOwnerView() {
        return this.f;
    }
    
    public long getOwnerViewId() {
        long a;
        if (Build$VERSION.SDK_INT >= 29) {
            a = ViewLayer.ViewLayer$c.a((View)this.f);
        }
        else {
            a = -1L;
        }
        return a;
    }
    
    public final void h(final long n) {
        final int c = u2.g.c;
        final int n2 = (int)(n >> 32);
        if (n2 != this.getLeft()) {
            this.offsetLeftAndRight(n2 - this.getLeft());
            this.p.c();
        }
        final int b = u2.g.b(n);
        if (b != this.getTop()) {
            this.offsetTopAndBottom(b - this.getTop());
            this.p.c();
        }
    }
    
    public final void i() {
        if (this.m && !ViewLayer.w) {
            this.setInvalidated(false);
            ViewLayer.ViewLayer$b.a((View)this);
        }
    }
    
    public final void invalidate() {
        if (!this.m) {
            this.setInvalidated(true);
            super.invalidate();
            ((View)this.f).invalidate();
        }
    }
    
    public final void j() {
        Rect i;
        if (this.k) {
            final Rect l = this.l;
            if (l == null) {
                this.l = new Rect(0, 0, this.getWidth(), this.getHeight());
            }
            else {
                ah2.f.c((Object)l);
                l.set(0, 0, this.getWidth(), this.getHeight());
            }
            i = this.l;
        }
        else {
            i = null;
        }
        this.setClipBounds(i);
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setCameraDistancePx(final float n) {
        this.setCameraDistance(n * this.getResources().getDisplayMetrics().densityDpi);
    }
}
