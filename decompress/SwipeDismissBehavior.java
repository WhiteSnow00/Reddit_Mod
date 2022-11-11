// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import b4.g;
import b4.c$a;
import android.view.ViewGroup;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewParent;
import java.util.WeakHashMap;
import a4.p0;
import i4.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import android.view.View;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout$c<V>
{
    public c a;
    public SwipeDismissBehavior.SwipeDismissBehavior$b b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public float g;
    public final SwipeDismissBehavior$a h;
    
    public SwipeDismissBehavior() {
        this.d = 2;
        this.e = 0.5f;
        this.f = 0.0f;
        this.g = 0.5f;
        this.h = new c.c() {
            public int a;
            public int b = -1;
            
            @Override
            public final int a(final View view, final int n) {
                final WeakHashMap a = p0.a;
                final boolean b = p0.e.d(view) == 1;
                final int d = SwipeDismissBehavior.this.d;
                int n2;
                int n4;
                if (d == 0) {
                    if (b) {
                        n2 = this.a - view.getWidth();
                        final int n3 = this.a;
                        return Math.min(Math.max(n2, n), n3);
                    }
                    n2 = this.a;
                    n4 = view.getWidth();
                }
                else {
                    if (d != 1) {
                        n2 = this.a - view.getWidth();
                        final int n3 = view.getWidth() + this.a;
                        return Math.min(Math.max(n2, n), n3);
                    }
                    if (!b) {
                        n2 = this.a - view.getWidth();
                        final int n3 = this.a;
                        return Math.min(Math.max(n2, n), n3);
                    }
                    n2 = this.a;
                    n4 = view.getWidth();
                }
                final int n3 = n4 + n2;
                return Math.min(Math.max(n2, n), n3);
            }
            
            @Override
            public final int b(final View view, final int n) {
                return view.getTop();
            }
            
            @Override
            public final int c(final View view) {
                return view.getWidth();
            }
            
            @Override
            public final void g(final int b, final View view) {
                this.b = b;
                this.a = view.getLeft();
                final ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            
            @Override
            public final void h(final int n) {
                final SwipeDismissBehavior.SwipeDismissBehavior$b b = SwipeDismissBehavior.this.b;
                if (b != null) {
                    b.b(n);
                }
            }
            
            @Override
            public final void i(final View view, final int n, final int n2) {
                final float n3 = view.getWidth() * SwipeDismissBehavior.this.f + this.a;
                final float n4 = view.getWidth() * SwipeDismissBehavior.this.g + this.a;
                final float n5 = (float)n;
                if (n5 <= n3) {
                    view.setAlpha(1.0f);
                }
                else if (n5 >= n4) {
                    view.setAlpha(0.0f);
                }
                else {
                    view.setAlpha(Math.min(Math.max(0.0f, 1.0f - (n5 - n3) / (n4 - n3)), 1.0f));
                }
            }
            
            @Override
            public final void j(final View view, final float n, final float n2) {
                this.b = -1;
                final int width = view.getWidth();
                final float n3 = fcmpl(n, 0.0f);
                boolean b = true;
                boolean b3 = false;
                Label_0171: {
                    Label_0168: {
                        if (n3 != 0) {
                            final WeakHashMap a = p0.a;
                            final boolean b2 = p0.e.d(view) == 1;
                            final int d = SwipeDismissBehavior.this.d;
                            if (d != 2) {
                                if ((d != 0) ? (d != 1) : (b2 ? (n >= 0.0f) : (n3 <= 0))) {
                                    break Label_0168;
                                }
                            }
                        }
                        else if (Math.abs(view.getLeft() - this.a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.e)) {
                            break Label_0168;
                        }
                        b3 = true;
                        break Label_0171;
                    }
                    b3 = false;
                }
                int a3;
                if (b3) {
                    final int left = view.getLeft();
                    final int a2 = this.a;
                    if (left < a2) {
                        a3 = a2 - width;
                    }
                    else {
                        a3 = a2 + width;
                    }
                }
                else {
                    a3 = this.a;
                    b = false;
                }
                if (SwipeDismissBehavior.this.a.q(a3, view.getTop())) {
                    final SwipeDismissBehavior$c swipeDismissBehavior$c = new SwipeDismissBehavior$c(SwipeDismissBehavior.this, view, b);
                    final WeakHashMap a4 = p0.a;
                    p0.d.m(view, (Runnable)swipeDismissBehavior$c);
                }
                else if (b) {
                    final SwipeDismissBehavior.SwipeDismissBehavior$b b4 = SwipeDismissBehavior.this.b;
                    if (b4 != null) {
                        b4.a(view);
                    }
                }
            }
            
            @Override
            public final boolean k(final int n, final View view) {
                final int b = this.b;
                return (b == -1 || b == n) && SwipeDismissBehavior.this.v(view);
            }
        };
    }
    
    public boolean g(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        boolean c = this.c;
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.c = false;
            }
        }
        else {
            c = coordinatorLayout.p((View)v, (int)motionEvent.getX(), (int)motionEvent.getY());
            this.c = c;
        }
        if (c) {
            if (this.a == null) {
                this.a = new c(((View)coordinatorLayout).getContext(), (ViewGroup)coordinatorLayout, (c.c)this.h);
            }
            return this.a.r(motionEvent);
        }
        return false;
    }
    
    public final boolean h(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        final WeakHashMap a = p0.a;
        if (p0.d.c(v) == 0) {
            p0.d.s(v, 1);
            p0.i(1048576, (View)v);
            p0.f(0, (View)v);
            if (this.v(v)) {
                p0.j((View)v, c$a.n, (g)new a(this));
            }
        }
        return false;
    }
    
    public final boolean u(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        final c a = this.a;
        if (a != null) {
            a.k(motionEvent);
            return true;
        }
        return false;
    }
    
    public boolean v(final View view) {
        return true;
    }
}
