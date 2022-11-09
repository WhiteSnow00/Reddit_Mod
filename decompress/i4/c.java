// 
// Decompiled by Procyon v0.6.0
// 

package i4;

import android.view.MotionEvent;
import android.util.Log;
import java.util.WeakHashMap;
import a4.p0;
import java.util.Arrays;
import android.view.ViewConfiguration;
import android.content.Context;
import android.view.animation.Interpolator;
import android.view.ViewGroup;
import android.view.View;
import android.widget.OverScroller;
import android.view.VelocityTracker;

public final class c
{
    public static final c$a w;
    public int a;
    public int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public int p;
    public OverScroller q;
    public final c r;
    public View s;
    public boolean t;
    public final ViewGroup u;
    public final c$b v;
    
    static {
        w = new Interpolator() {
            public final float getInterpolation(float n) {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        };
    }
    
    public c(final Context context, final ViewGroup u, final c r) {
        this.c = -1;
        this.v = new Runnable() {
            @Override
            public final void run() {
                i4.c.this.p(0);
            }
        };
        if (u == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (r != null) {
            this.u = u;
            this.r = r;
            final ViewConfiguration value = ViewConfiguration.get(context);
            this.o = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
            this.b = value.getScaledTouchSlop();
            this.m = (float)value.getScaledMaximumFlingVelocity();
            this.n = (float)value.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, (Interpolator)i4.c.w);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }
    
    public final void a() {
        this.c = -1;
        final float[] d = this.d;
        if (d != null) {
            Arrays.fill(d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        final VelocityTracker l = this.l;
        if (l != null) {
            l.recycle();
            this.l = null;
        }
    }
    
    public final void b(final int c, final View s) {
        if (s.getParent() == this.u) {
            this.s = s;
            this.c = c;
            this.r.g(c, s);
            this.p(1);
            return;
        }
        final StringBuilder k = a.k("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        k.append(this.u);
        k.append(")");
        throw new IllegalArgumentException(k.toString());
    }
    
    public final boolean c(float abs, float abs2, final int n, final int n2) {
        abs = Math.abs(abs);
        abs2 = Math.abs(abs2);
        final int n3 = this.h[n];
        boolean b2;
        final boolean b = b2 = false;
        if ((n3 & n2) == n2) {
            b2 = b;
            if ((this.p & n2) != 0x0) {
                b2 = b;
                if ((this.j[n] & n2) != n2) {
                    b2 = b;
                    if ((this.i[n] & n2) != n2) {
                        final int b3 = this.b;
                        if (abs <= b3 && abs2 <= b3) {
                            b2 = b;
                        }
                        else {
                            if (abs < abs2 * 0.5f) {
                                this.r.getClass();
                            }
                            b2 = b;
                            if ((this.i[n] & n2) == 0x0) {
                                b2 = b;
                                if (abs > this.b) {
                                    b2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final boolean d(final View view, final float n, final float n2) {
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (view == null) {
            return false;
        }
        final boolean b4 = this.r.c(view) > 0;
        final boolean b5 = this.r.d(view) > 0;
        if (b4 && b5) {
            final int b6 = this.b;
            if (n2 * n2 + n * n > b6 * b6) {
                b3 = true;
            }
            return b3;
        }
        if (b4) {
            boolean b7 = b;
            if (Math.abs(n) > this.b) {
                b7 = true;
            }
            return b7;
        }
        boolean b8 = b2;
        if (b5) {
            b8 = b2;
            if (Math.abs(n2) > this.b) {
                b8 = true;
            }
        }
        return b8;
    }
    
    public final void e(final int n) {
        final float[] d = this.d;
        if (d != null) {
            final int k = this.k;
            boolean b = true;
            final int n2 = 1 << n;
            if ((n2 & k) == 0x0) {
                b = false;
            }
            if (b) {
                d[n] = 0.0f;
                this.e[n] = 0.0f;
                this.f[n] = 0.0f;
                this.g[n] = 0.0f;
                this.h[n] = 0;
                this.i[n] = 0;
                this.j[n] = 0;
                this.k = (~n2 & k);
            }
        }
    }
    
    public final int f(int n, int abs, final int n2) {
        if (n == 0) {
            return 0;
        }
        final int width = ((View)this.u).getWidth();
        final int n3 = width / 2;
        final float min = Math.min(1.0f, Math.abs(n) / (float)width);
        final float n4 = (float)n3;
        final float n5 = (float)Math.sin((min - 0.5f) * 0.47123894f);
        abs = Math.abs(abs);
        if (abs > 0) {
            n = Math.round(Math.abs((n5 * n4 + n4) / abs) * 1000.0f) * 4;
        }
        else {
            n = (int)((Math.abs(n) / (float)n2 + 1.0f) * 256.0f);
        }
        return Math.min(n, 600);
    }
    
    public final boolean g() {
        final int a = this.a;
        final boolean b = false;
        if (a == 2) {
            final boolean computeScrollOffset = this.q.computeScrollOffset();
            final int currX = this.q.getCurrX();
            final int currY = this.q.getCurrY();
            final int n = currX - this.s.getLeft();
            final int n2 = currY - this.s.getTop();
            if (n != 0) {
                final View s = this.s;
                final WeakHashMap a2 = p0.a;
                s.offsetLeftAndRight(n);
            }
            if (n2 != 0) {
                final View s2 = this.s;
                final WeakHashMap a3 = p0.a;
                s2.offsetTopAndBottom(n2);
            }
            if (n != 0 || n2 != 0) {
                this.r.i(this.s, currX, currY);
            }
            boolean b2 = computeScrollOffset;
            if (computeScrollOffset) {
                b2 = computeScrollOffset;
                if (currX == this.q.getFinalX()) {
                    b2 = computeScrollOffset;
                    if (currY == this.q.getFinalY()) {
                        this.q.abortAnimation();
                        b2 = false;
                    }
                }
            }
            if (!b2) {
                ((View)this.u).post((Runnable)this.v);
            }
        }
        boolean b3 = b;
        if (this.a == 2) {
            b3 = true;
        }
        return b3;
    }
    
    public final View h(final int n, final int n2) {
        for (int i = this.u.getChildCount() - 1; i >= 0; --i) {
            final ViewGroup u = this.u;
            this.r.getClass();
            final View child = u.getChildAt(i);
            if (n >= child.getLeft() && n < child.getRight() && n2 >= child.getTop() && n2 < child.getBottom()) {
                return child;
            }
        }
        return null;
    }
    
    public final boolean i(int f, int f2, int abs, int abs2) {
        final int left = this.s.getLeft();
        final int top = this.s.getTop();
        final int n = f - left;
        final int n2 = f2 - top;
        f2 = 0;
        if (n == 0 && n2 == 0) {
            this.q.abortAnimation();
            this.p(0);
            return false;
        }
        final View s = this.s;
        f = (int)this.n;
        final int n3 = (int)this.m;
        final int abs3 = Math.abs(abs);
        if (abs3 < f) {
            f = 0;
        }
        else {
            f = abs;
            if (abs3 > n3) {
                if (abs > 0) {
                    f = n3;
                }
                else {
                    f = -n3;
                }
            }
        }
        final int n4 = (int)this.n;
        abs = (int)this.m;
        final int abs4 = Math.abs(abs2);
        if (abs4 >= n4) {
            f2 = abs2;
            if (abs4 > abs) {
                if (abs2 > 0) {
                    f2 = abs;
                }
                else {
                    f2 = -abs;
                }
            }
        }
        abs2 = Math.abs(n);
        abs = Math.abs(n2);
        final int abs5 = Math.abs(f);
        final int abs6 = Math.abs(f2);
        final int n5 = abs5 + abs6;
        final int n6 = abs2 + abs;
        float n7;
        float n8;
        if (f != 0) {
            n7 = (float)abs5;
            n8 = (float)n5;
        }
        else {
            n7 = (float)abs2;
            n8 = (float)n6;
        }
        final float n9 = n7 / n8;
        float n10;
        float n11;
        if (f2 != 0) {
            n10 = (float)abs6;
            n11 = (float)n5;
        }
        else {
            n10 = (float)abs;
            n11 = (float)n6;
        }
        final float n12 = n10 / n11;
        f = this.f(n, f, this.r.c(s));
        f2 = this.f(n2, f2, this.r.d(s));
        f = (int)(f2 * n12 + f * n9);
        this.q.startScroll(left, top, n, n2, f);
        this.p(2);
        return true;
    }
    
    public final boolean j(final int n) {
        if ((this.k & 1 << n) == 0x0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pointerId=");
            sb.append(n);
            sb.append(" because ACTION_DOWN was not received ");
            sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
            sb.append(" ViewDragHelper did not receive all the events in the event stream.");
            Log.e("ViewDragHelper", sb.toString());
            return false;
        }
        return true;
    }
    
    public final void k(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        final boolean b = false;
        final int n = 0;
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                Label_0216: {
                                    if (this.a == 1 && pointerId == this.c) {
                                        while (true) {
                                            while (i < motionEvent.getPointerCount()) {
                                                final int pointerId2 = motionEvent.getPointerId(i);
                                                if (pointerId2 != this.c) {
                                                    final View h = this.h((int)motionEvent.getX(i), (int)motionEvent.getY(i));
                                                    final View s = this.s;
                                                    if (h == s && this.t(pointerId2, s)) {
                                                        final int c = this.c;
                                                        if (c == -1) {
                                                            this.l();
                                                        }
                                                        break Label_0216;
                                                    }
                                                }
                                                ++i;
                                            }
                                            final int c = -1;
                                            continue;
                                        }
                                    }
                                }
                                this.e(pointerId);
                            }
                        }
                        else {
                            final int pointerId3 = motionEvent.getPointerId(actionIndex);
                            final float x = motionEvent.getX(actionIndex);
                            final float y = motionEvent.getY(actionIndex);
                            this.n(x, y, pointerId3);
                            if (this.a == 0) {
                                this.t(pointerId3, this.h((int)x, (int)y));
                                if ((this.h[pointerId3] & this.p) != 0x0) {
                                    this.r.f();
                                }
                            }
                            else {
                                final int n2 = (int)x;
                                final int n3 = (int)y;
                                final View s2 = this.s;
                                int n4;
                                if (s2 == null) {
                                    n4 = (b ? 1 : 0);
                                }
                                else {
                                    n4 = (b ? 1 : 0);
                                    if (n2 >= s2.getLeft()) {
                                        n4 = (b ? 1 : 0);
                                        if (n2 < s2.getRight()) {
                                            n4 = (b ? 1 : 0);
                                            if (n3 >= s2.getTop()) {
                                                n4 = (b ? 1 : 0);
                                                if (n3 < s2.getBottom()) {
                                                    n4 = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (n4 != 0) {
                                    this.t(pointerId3, this.s);
                                }
                            }
                        }
                    }
                    else {
                        if (this.a == 1) {
                            this.t = true;
                            this.r.j(this.s, 0.0f, 0.0f);
                            this.t = false;
                            if (this.a == 1) {
                                this.p(0);
                            }
                        }
                        this.a();
                    }
                }
                else if (this.a == 1) {
                    if (this.j(this.c)) {
                        final int pointerIndex = motionEvent.findPointerIndex(this.c);
                        final float x2 = motionEvent.getX(pointerIndex);
                        final float y2 = motionEvent.getY(pointerIndex);
                        final float[] f = this.f;
                        final int c2 = this.c;
                        final int n5 = (int)(x2 - f[c2]);
                        final int n6 = (int)(y2 - this.g[c2]);
                        final int n7 = this.s.getLeft() + n5;
                        final int n8 = this.s.getTop() + n6;
                        final int left = this.s.getLeft();
                        final int top = this.s.getTop();
                        int a = n7;
                        if (n5 != 0) {
                            a = this.r.a(this.s, n7);
                            final View s3 = this.s;
                            final WeakHashMap a2 = p0.a;
                            s3.offsetLeftAndRight(a - left);
                        }
                        int b2 = n8;
                        if (n6 != 0) {
                            b2 = this.r.b(this.s, n8);
                            final View s4 = this.s;
                            final WeakHashMap a3 = p0.a;
                            s4.offsetTopAndBottom(b2 - top);
                        }
                        if (n5 != 0 || n6 != 0) {
                            this.r.i(this.s, a, b2);
                        }
                        this.o(motionEvent);
                    }
                }
                else {
                    for (int pointerCount = motionEvent.getPointerCount(), j = n; j < pointerCount; ++j) {
                        final int pointerId4 = motionEvent.getPointerId(j);
                        if (this.j(pointerId4)) {
                            final float x3 = motionEvent.getX(j);
                            final float y3 = motionEvent.getY(j);
                            final float n9 = x3 - this.d[pointerId4];
                            final float n10 = y3 - this.e[pointerId4];
                            this.m(n9, n10, pointerId4);
                            if (this.a == 1) {
                                break;
                            }
                            final View h2 = this.h((int)x3, (int)y3);
                            if (this.d(h2, n9, n10) && this.t(pointerId4, h2)) {
                                break;
                            }
                        }
                    }
                    this.o(motionEvent);
                }
            }
            else {
                if (this.a == 1) {
                    this.l();
                }
                this.a();
            }
        }
        else {
            final float x4 = motionEvent.getX();
            final float y4 = motionEvent.getY();
            final int pointerId5 = motionEvent.getPointerId(0);
            final View h3 = this.h((int)x4, (int)y4);
            this.n(x4, y4, pointerId5);
            this.t(pointerId5, h3);
            if ((this.h[pointerId5] & this.p) != 0x0) {
                this.r.f();
            }
        }
    }
    
    public final void l() {
        this.l.computeCurrentVelocity(1000, this.m);
        final float xVelocity = this.l.getXVelocity(this.c);
        final float n = this.n;
        final float m = this.m;
        final float abs = Math.abs(xVelocity);
        float n2 = 0.0f;
        float n3;
        if (abs < n) {
            n3 = 0.0f;
        }
        else {
            n3 = xVelocity;
            if (abs > m) {
                if (xVelocity > 0.0f) {
                    n3 = m;
                }
                else {
                    n3 = -m;
                }
            }
        }
        final float yVelocity = this.l.getYVelocity(this.c);
        final float n4 = this.n;
        final float i = this.m;
        final float abs2 = Math.abs(yVelocity);
        if (abs2 >= n4) {
            n2 = yVelocity;
            if (abs2 > i) {
                if (yVelocity > 0.0f) {
                    n2 = i;
                }
                else {
                    n2 = -i;
                }
            }
        }
        this.t = true;
        this.r.j(this.s, n3, n2);
        this.t = false;
        if (this.a == 1) {
            this.p(0);
        }
    }
    
    public final void m(final float n, final float n2, final int n3) {
        int c;
        final boolean b = (c = (this.c(n, n2, n3, 1) ? 1 : 0)) != 0;
        if (this.c(n2, n, n3, 4)) {
            c = ((b ? 1 : 0) | 0x4);
        }
        int n4 = c;
        if (this.c(n, n2, n3, 2)) {
            n4 = (c | 0x2);
        }
        int n5 = n4;
        if (this.c(n2, n, n3, 8)) {
            n5 = (n4 | 0x8);
        }
        if (n5 != 0) {
            final int[] i = this.i;
            i[n3] |= n5;
            this.r.e(n5, n3);
        }
    }
    
    public final void n(final float n, final float n2, final int n3) {
        final float[] d = this.d;
        boolean b = false;
        if (d == null || d.length <= n3) {
            final int n4 = n3 + 1;
            final float[] d2 = new float[n4];
            final float[] e = new float[n4];
            final float[] f = new float[n4];
            final float[] g = new float[n4];
            final int[] h = new int[n4];
            final int[] i = new int[n4];
            final int[] j = new int[n4];
            if (d != null) {
                System.arraycopy(d, 0, d2, 0, d.length);
                final float[] e2 = this.e;
                System.arraycopy(e2, 0, e, 0, e2.length);
                final float[] f2 = this.f;
                System.arraycopy(f2, 0, f, 0, f2.length);
                final float[] g2 = this.g;
                System.arraycopy(g2, 0, g, 0, g2.length);
                final int[] h2 = this.h;
                System.arraycopy(h2, 0, h, 0, h2.length);
                final int[] k = this.i;
                System.arraycopy(k, 0, i, 0, k.length);
                final int[] l = this.j;
                System.arraycopy(l, 0, j, 0, l.length);
            }
            this.d = d2;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
        this.d[n3] = (this.f[n3] = n);
        this.e[n3] = (this.g[n3] = n2);
        final int[] h3 = this.h;
        final int n5 = (int)n;
        final int n6 = (int)n2;
        if (n5 < ((View)this.u).getLeft() + this.o) {
            b = true;
        }
        int n7 = b ? 1 : 0;
        if (n6 < ((View)this.u).getTop() + this.o) {
            n7 = ((b ? 1 : 0) | 0x4);
        }
        int n8 = n7;
        if (n5 > ((View)this.u).getRight() - this.o) {
            n8 = (n7 | 0x2);
        }
        int n9 = n8;
        if (n6 > ((View)this.u).getBottom() - this.o) {
            n9 = (n8 | 0x8);
        }
        h3[n3] = n9;
        this.k |= 1 << n3;
    }
    
    public final void o(final MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
            final int pointerId = motionEvent.getPointerId(i);
            if (this.j(pointerId)) {
                final float x = motionEvent.getX(i);
                final float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }
    
    public final void p(final int a) {
        ((View)this.u).removeCallbacks((Runnable)this.v);
        if (this.a != a) {
            this.a = a;
            this.r.h(a);
            if (this.a == 0) {
                this.s = null;
            }
        }
    }
    
    public final boolean q(final int n, final int n2) {
        if (this.t) {
            return this.i(n, n2, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    
    public final boolean r(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        boolean b = true;
        if (actionMasked != 0) {
            Label_0485: {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked != 6) {
                                    break Label_0485;
                                }
                                this.e(motionEvent.getPointerId(actionIndex));
                                break Label_0485;
                            }
                            else {
                                final int pointerId = motionEvent.getPointerId(actionIndex);
                                final float x = motionEvent.getX(actionIndex);
                                final float y = motionEvent.getY(actionIndex);
                                this.n(x, y, pointerId);
                                final int a = this.a;
                                if (a == 0) {
                                    if ((this.h[pointerId] & this.p) != 0x0) {
                                        this.r.f();
                                    }
                                    break Label_0485;
                                }
                                else {
                                    if (a != 2) {
                                        break Label_0485;
                                    }
                                    final View h = this.h((int)x, (int)y);
                                    if (h == this.s) {
                                        this.t(pointerId, h);
                                    }
                                    break Label_0485;
                                }
                            }
                        }
                    }
                    else {
                        if (this.d == null) {
                            break Label_0485;
                        }
                        if (this.e == null) {
                            break Label_0485;
                        }
                        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                            final int pointerId2 = motionEvent.getPointerId(i);
                            if (this.j(pointerId2)) {
                                final float x2 = motionEvent.getX(i);
                                final float y2 = motionEvent.getY(i);
                                final float n = x2 - this.d[pointerId2];
                                final float n2 = y2 - this.e[pointerId2];
                                final View h2 = this.h((int)x2, (int)y2);
                                final boolean b2 = h2 != null && this.d(h2, n, n2);
                                if (b2) {
                                    final int left = h2.getLeft();
                                    final int a2 = this.r.a(h2, (int)n + left);
                                    final int top = h2.getTop();
                                    final int b3 = this.r.b(h2, (int)n2 + top);
                                    final int c = this.r.c(h2);
                                    final int d = this.r.d(h2);
                                    if (c == 0 || (c > 0 && a2 == left)) {
                                        if (d == 0) {
                                            break;
                                        }
                                        if (d > 0 && b3 == top) {
                                            break;
                                        }
                                    }
                                }
                                this.m(n, n2, pointerId2);
                                if (this.a == 1) {
                                    break;
                                }
                                if (b2 && this.t(pointerId2, h2)) {
                                    break;
                                }
                            }
                        }
                        this.o(motionEvent);
                        break Label_0485;
                    }
                }
                this.a();
            }
        }
        else {
            final float x3 = motionEvent.getX();
            final float y3 = motionEvent.getY();
            final int pointerId3 = motionEvent.getPointerId(0);
            this.n(x3, y3, pointerId3);
            final View h3 = this.h((int)x3, (int)y3);
            if (h3 == this.s && this.a == 2) {
                this.t(pointerId3, h3);
            }
            if ((this.h[pointerId3] & this.p) != 0x0) {
                this.r.f();
            }
        }
        if (this.a != 1) {
            b = false;
        }
        return b;
    }
    
    public final boolean s(final View s, final int n, final int n2) {
        this.s = s;
        this.c = -1;
        final boolean i = this.i(n, n2, 0, 0);
        if (!i && this.a == 0 && this.s != null) {
            this.s = null;
        }
        return i;
    }
    
    public final boolean t(final int c, final View view) {
        if (view == this.s && this.c == c) {
            return true;
        }
        if (view != null && this.r.k(c, view)) {
            this.b(this.c = c, view);
            return true;
        }
        return false;
    }
    
    public abstract static class c
    {
        public abstract int a(final View p0, final int p1);
        
        public abstract int b(final View p0, final int p1);
        
        public int c(final View view) {
            return 0;
        }
        
        public int d(final View view) {
            return 0;
        }
        
        public void e(final int n, final int n2) {
        }
        
        public void f() {
        }
        
        public void g(final int n, final View view) {
        }
        
        public abstract void h(final int p0);
        
        public abstract void i(final View p0, final int p1, final int p2);
        
        public abstract void j(final View p0, final float p1, final float p2);
        
        public abstract boolean k(final int p0, final View p1);
    }
}
