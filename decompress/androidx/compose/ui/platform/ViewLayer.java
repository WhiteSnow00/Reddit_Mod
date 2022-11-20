// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import a4.v0;
import u2.g;
import n1.f;
import u2.i;
import n1.c;
import android.graphics.Canvas;
import cg.d;
import android.os.Build$VERSION;
import o1.f0;
import androidx.compose.ui.unit.LayoutDirection;
import o1.g0;
import o1.l0;
import n1.b;
import o1.b0;
import ng2.e;
import android.graphics.Outline;
import android.view.ViewOutlineProvider;
import h.s;
import android.graphics.Rect;
import mg2.a;
import mg2.l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import cg2.j;
import android.graphics.Matrix;
import mg2.p;
import e2.a0;
import android.view.View;

public final class ViewLayer extends View implements a0
{
    public static final p<View, Matrix, j> r;
    public static final ViewLayer$a s;
    public static Method t;
    public static Field u;
    public static boolean v;
    public static boolean w;
    public final AndroidComposeView f;
    public final j0 g;
    public l<? super o1.p, j> h;
    public a<j> i;
    public final t0 j;
    public boolean k;
    public Rect l;
    public boolean m;
    public boolean n;
    public final s o;
    public final q0<View> p;
    public long q;
    
    static {
        r = (p)ViewLayer$Companion$getMatrix$1.INSTANCE;
        s = new ViewOutlineProvider() {
            public final void getOutline(final View view, final Outline outline) {
                e.f((Object)view, "view");
                e.f((Object)outline, "outline");
                final Outline b = ((ViewLayer)view).j.b();
                e.c((Object)b);
                outline.set(b);
            }
        };
    }
    
    public ViewLayer(final AndroidComposeView f, final j0 g, final l<? super o1.p, j> h, final a<j> i) {
        e.f((Object)f, "ownerView");
        e.f((Object)h, "drawBlock");
        e.f((Object)i, "invalidateParentLayer");
        super(((View)f).getContext());
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = new t0(f.getDensity());
        this.o = new s(2, 0);
        this.p = (q0<View>)new q0((p)ViewLayer.r);
        this.q = o1.q0.b;
        this.setWillNotDraw(false);
        this.setId(View.generateViewId());
        g.addView((View)this);
    }
    
    private final b0 getManualClipPath() {
        if (this.getClipToOutline()) {
            final t0 j = this.j;
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
            this.f.K((a0)this, m);
        }
    }
    
    public final void a(final n1.b b, final boolean b2) {
        if (b2) {
            final float[] a = this.p.a((Object)this);
            if (a != null) {
                if0.a.M(a, b);
            }
            else {
                b.a = 0.0f;
                b.b = 0.0f;
                b.c = 0.0f;
                b.d = 0.0f;
            }
        }
        else {
            if0.a.M(this.p.b((Object)this), b);
        }
    }
    
    public final void b(final a i, final l h) {
        e.f((Object)h, "drawBlock");
        e.f((Object)i, "invalidateParentLayer");
        this.g.addView((View)this);
        this.k = false;
        this.n = false;
        final int c = o1.q0.c;
        this.q = o1.q0.b;
        this.h = (l<? super o1.p, j>)h;
        this.i = (a<j>)i;
    }
    
    public final void c(final o1.p p) {
        e.f((Object)p, "canvas");
        final boolean n = this.getElevation() > 0.0f;
        this.n = n;
        if (n) {
            p.k();
        }
        this.g.a(p, this, this.getDrawingTime());
        if (this.n) {
            p.g();
        }
    }
    
    public final void d(final float scaleX, final float scaleY, final float alpha, final float translationX, final float translationY, final float elevation, final float rotationX, final float rotationY, final float rotation, final float cameraDistancePx, long q, final l0 l0, final boolean b, final g0 g0, final long n, final long n2, final LayoutDirection layoutDirection, final u2.b b2) {
        e.f((Object)l0, "shape");
        e.f((Object)layoutDirection, "layoutDirection");
        e.f((Object)b2, "density");
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
        final int c = o1.q0.c;
        this.setPivotX(Float.intBitsToFloat((int)(q >> 32)) * this.getWidth());
        this.setPivotY(o1.q0.a(this.q) * this.getHeight());
        this.setCameraDistancePx(cameraDistancePx);
        int n3 = 1;
        this.k = (b && l0 == f0.a);
        this.j();
        final boolean b3 = this.getManualClipPath() != null;
        this.setClipToOutline(b && l0 != f0.a);
        final boolean d = this.j.d(l0, this.getAlpha(), this.getClipToOutline(), this.getElevation(), layoutDirection, b2);
        ViewOutlineProvider s;
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
            a.a(this, cg.d.l4(n));
            a.b(this, cg.d.l4(n2));
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
        f.M((a0)this);
        this.g.removeViewInLayout((View)this);
    }
    
    public final void dispatchDraw(final Canvas a) {
        e.f((Object)a, "canvas");
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
        final l<? super o1.p, j> h = this.h;
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
                n = if0.a.L(a, n);
            }
            else {
                final int e = n1.c.e;
                n = n1.c.c;
            }
        }
        else {
            n = if0.a.L(this.p.b((Object)this), n);
        }
        return n;
    }
    
    public final void f(long d) {
        final int n = (int)(d >> 32);
        final int b = u2.i.b(d);
        if (n != this.getWidth() || b != this.getHeight()) {
            d = this.q;
            final int c = o1.q0.c;
            final float intBitsToFloat = Float.intBitsToFloat((int)(d >> 32));
            final float n2 = (float)n;
            this.setPivotX(intBitsToFloat * n2);
            final float a = o1.q0.a(this.q);
            final float n3 = (float)b;
            this.setPivotY(a * n3);
            final t0 j = this.j;
            d = vl.a.d0(n2, n3);
            if (!n1.f.c(j.d, d)) {
                j.d = d;
                j.h = true;
            }
            ViewOutlineProvider s;
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
        final float e = n1.c.e(n);
        final float f = n1.c.f(n);
        final boolean k = this.k;
        boolean b = true;
        if (k) {
            if (0.0f > e || e >= this.getWidth() || 0.0f > f || f >= this.getHeight()) {
                b = false;
            }
            return b;
        }
        return !this.getClipToOutline() || this.j.c(n);
    }
    
    public final float getCameraDistancePx() {
        return this.getCameraDistance() / this.getResources().getDisplayMetrics().densityDpi;
    }
    
    public final j0 getContainer() {
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
            a = c.a((View)this.f);
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
        final int c2 = u2.g.c(n);
        if (c2 != this.getTop()) {
            this.offsetTopAndBottom(c2 - this.getTop());
            this.p.c();
        }
    }
    
    public final void i() {
        if (this.m && !ViewLayer.w) {
            this.setInvalidated(false);
            b.a(this);
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
                e.c((Object)l);
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
    
    public static final class b
    {
        public static void a(final View view) {
            e.f((Object)view, "view");
            try {
                if (!ViewLayer.v) {
                    ViewLayer.v = true;
                    if (Build$VERSION.SDK_INT < 28) {
                        ViewLayer.t = View.class.getDeclaredMethod("updateDisplayListIfDirty", (Class<?>[])new Class[0]);
                        ViewLayer.u = View.class.getDeclaredField("mRecreateDisplayList");
                    }
                    else {
                        ViewLayer.t = (Method)Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.u = (Field)Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    final Method t = ViewLayer.t;
                    if (t != null) {
                        t.setAccessible(true);
                    }
                    final Field u = ViewLayer.u;
                    if (u != null) {
                        u.setAccessible(true);
                    }
                }
                final Field u2 = ViewLayer.u;
                if (u2 != null) {
                    u2.setBoolean(view, true);
                }
                final Method t2 = ViewLayer.t;
                if (t2 != null) {
                    t2.invoke(view, new Object[0]);
                }
            }
            finally {
                ViewLayer.w = true;
            }
        }
    }
    
    public static final class c
    {
        public static final long a(final View view) {
            e.f((Object)view, "view");
            return v0.c(view);
        }
    }
}
