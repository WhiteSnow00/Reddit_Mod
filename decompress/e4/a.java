// 
// Decompiled by Procyon v0.6.0
// 

package e4;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.os.SystemClock;
import a4.t1;
import java.util.WeakHashMap;
import a4.q0$d;
import a4.q0;
import android.view.MotionEvent;
import android.widget.ListView;
import android.view.animation.AnimationUtils;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.View$OnTouchListener;

public abstract class a implements View$OnTouchListener
{
    public static final int v;
    public final a f;
    public final AccelerateInterpolator g;
    public final View h;
    public b i;
    public float[] j;
    public float[] k;
    public int l;
    public int m;
    public float[] n;
    public float[] o;
    public float[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    
    static {
        v = ViewConfiguration.getTapTimeout();
    }
    
    public a(final View h) {
        final a f = new a();
        this.f = f;
        this.g = new AccelerateInterpolator();
        this.j = new float[] { 0.0f, 0.0f };
        this.k = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.n = new float[] { 0.0f, 0.0f };
        this.o = new float[] { 0.0f, 0.0f };
        this.p = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.h = h;
        final float density = Resources.getSystem().getDisplayMetrics().density;
        final int n = (int)(1575.0f * density + 0.5f);
        final int n2 = (int)(density * 315.0f + 0.5f);
        final float n3 = (float)n;
        final float[] p = this.p;
        p[1] = (p[0] = n3 / 1000.0f);
        final float n4 = (float)n2;
        final float[] o = this.o;
        o[1] = (o[0] = n4 / 1000.0f);
        this.l = 1;
        final float[] k = this.k;
        k[1] = (k[0] = Float.MAX_VALUE);
        final float[] j = this.j;
        j[1] = (j[0] = 0.2f);
        final float[] n5 = this.n;
        n5[1] = (n5[0] = 0.001f);
        this.m = a.v;
        f.a = 500;
        f.b = 500;
    }
    
    public static float b(final float n, final float n2, final float n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    public final float a(final int n, float n2, float n3, float n4) {
        final float b = b(this.j[n] * n3, 0.0f, this.k[n]);
        n2 = this.c(n3 - n2, b) - this.c(n2, b);
        Label_0090: {
            if (n2 < 0.0f) {
                n2 = -this.g.getInterpolation(-n2);
            }
            else {
                if (n2 <= 0.0f) {
                    n2 = 0.0f;
                    break Label_0090;
                }
                n2 = this.g.getInterpolation(n2);
            }
            n2 = b(n2, -1.0f, 1.0f);
        }
        final float n5 = fcmpl(n2, 0.0f);
        if (n5 == 0) {
            return 0.0f;
        }
        final float n6 = this.n[n];
        final float n7 = this.o[n];
        n3 = this.p[n];
        n4 *= n6;
        if (n5 > 0) {
            return b(n2 * n4, n7, n3);
        }
        return -b(-n2 * n4, n7, n3);
    }
    
    public final float c(final float n, final float n2) {
        if (n2 == 0.0f) {
            return 0.0f;
        }
        final int l = this.l;
        if (l != 0 && l != 1) {
            if (l == 2) {
                if (n < 0.0f) {
                    return n / -n2;
                }
            }
        }
        else if (n < n2) {
            if (n >= 0.0f) {
                return 1.0f - n / n2;
            }
            if (this.t && l == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }
    
    public final void d() {
        final boolean r = this.r;
        int i = 0;
        if (r) {
            this.t = false;
        }
        else {
            final a f = this.f;
            f.getClass();
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            final int n = (int)(currentAnimationTimeMillis - f.e);
            final int b = f.b;
            if (n > b) {
                i = b;
            }
            else if (n >= 0) {
                i = n;
            }
            f.i = i;
            f.h = f.a(currentAnimationTimeMillis);
            f.g = currentAnimationTimeMillis;
        }
    }
    
    public final boolean e() {
        final a f = this.f;
        final float d = f.d;
        final int n = (int)(d / Math.abs(d));
        final float c = f.c;
        final int n2 = (int)(c / Math.abs(c));
        boolean b = true;
        if (n != 0) {
            final ListView w = ((f)this).w;
            final int count = ((AdapterView)w).getCount();
            boolean b2 = false;
            Label_0135: {
                Label_0058: {
                    if (count != 0) {
                        final int childCount = ((ViewGroup)w).getChildCount();
                        final int firstVisiblePosition = ((AdapterView)w).getFirstVisiblePosition();
                        if (n > 0) {
                            if (firstVisiblePosition + childCount >= count && ((ViewGroup)w).getChildAt(childCount - 1).getBottom() <= ((View)w).getHeight()) {
                                break Label_0058;
                            }
                        }
                        else {
                            if (n >= 0) {
                                break Label_0058;
                            }
                            if (firstVisiblePosition <= 0 && ((ViewGroup)w).getChildAt(0).getTop() >= 0) {
                                break Label_0058;
                            }
                        }
                        b2 = true;
                        break Label_0135;
                    }
                }
                b2 = false;
            }
            if (b2) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean onTouch(View h, final MotionEvent motionEvent) {
        if (!this.u) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        Label_0053: {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        break Label_0053;
                    }
                    if (actionMasked != 3) {
                        return false;
                    }
                }
                this.d();
                return false;
            }
            this.s = true;
            this.q = false;
        }
        final float a = this.a(0, motionEvent.getX(), (float)h.getWidth(), (float)this.h.getWidth());
        final float a2 = this.a(1, motionEvent.getY(), (float)h.getHeight(), (float)this.h.getHeight());
        final a f = this.f;
        f.c = a;
        f.d = a2;
        if (!this.t && this.e()) {
            if (this.i == null) {
                this.i = new b();
            }
            this.t = true;
            this.r = true;
            Label_0214: {
                if (!this.q) {
                    final int m = this.m;
                    if (m > 0) {
                        h = this.h;
                        final b i = this.i;
                        final long n = m;
                        final WeakHashMap<View, t1> a3 = q0.a;
                        q0$d.n(h, (Runnable)i, n);
                        break Label_0214;
                    }
                }
                this.i.run();
            }
            this.q = true;
        }
        return false;
    }
    
    public static final class a
    {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public long g;
        public float h;
        public int i;
        
        public a() {
            this.e = Long.MIN_VALUE;
            this.g = -1L;
            this.f = 0L;
        }
        
        public final float a(final long n) {
            final long e = this.e;
            if (n < e) {
                return 0.0f;
            }
            final long g = this.g;
            if (g >= 0L && n >= g) {
                final float h = this.h;
                return e4.a.b((n - g) / (float)this.i, 0.0f, 1.0f) * h + (1.0f - h);
            }
            return e4.a.b((n - e) / (float)this.a, 0.0f, 1.0f) * 0.5f;
        }
    }
    
    public final class b implements Runnable
    {
        @Override
        public final void run() {
            final a f = a.this;
            if (!f.t) {
                return;
            }
            if (f.r) {
                f.r = false;
                final a f2 = f.f;
                f2.getClass();
                final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                f2.e = currentAnimationTimeMillis;
                f2.g = -1L;
                f2.f = currentAnimationTimeMillis;
                f2.h = 0.5f;
            }
            final a f3 = a.this.f;
            if ((f3.g > 0L && AnimationUtils.currentAnimationTimeMillis() > f3.g + f3.i) || !a.this.e()) {
                a.this.t = false;
                return;
            }
            final a f4 = a.this;
            if (f4.s) {
                f4.s = false;
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                f4.h.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (f3.f != 0L) {
                final long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                final float a = f3.a(currentAnimationTimeMillis2);
                final long f5 = f3.f;
                f3.f = currentAnimationTimeMillis2;
                e4.g.b(((f)e4.a.this).w, (int)((currentAnimationTimeMillis2 - f5) * (a * 4.0f + -4.0f * a * a) * f3.d));
                final View h = e4.a.this.h;
                final WeakHashMap<View, t1> a2 = q0.a;
                q0$d.m(h, (Runnable)this);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
    }
}
