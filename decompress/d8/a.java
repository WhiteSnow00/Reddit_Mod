// 
// Decompiled by Procyon v0.6.0
// 

package d8;

import android.os.BaseBundle;
import android.view.ViewTreeObserver;
import android.view.ViewParent;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.os.Bundle;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.bluelinelabs.conductor.b;
import android.view.View;
import android.view.ViewGroup;
import android.animation.Animator;
import com.bluelinelabs.conductor.c;

public abstract class a extends c
{
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public Animator n;
    public b o;
    
    public a() {
        this(-1L, true);
    }
    
    public a(final long n) {
        this(n, true);
    }
    
    public a(final long i, final boolean j) {
        this.i = i;
        this.j = j;
    }
    
    public a(final boolean b) {
        this(-1L, b);
    }
    
    @Override
    public final void b() {
        this.l = true;
        final Animator n = this.n;
        if (n != null) {
            n.end();
        }
        else {
            final b o = this.o;
            if (o != null) {
                o.a();
            }
        }
    }
    
    @Override
    public final void g(final c c) {
        this.k = true;
        final Animator n = this.n;
        if (n != null) {
            n.cancel();
        }
        else {
            final b o = this.o;
            if (o != null) {
                o.a();
            }
        }
    }
    
    @Override
    public final void h(final ViewGroup viewGroup, final View view, final View view2, final boolean b, final com.bluelinelabs.conductor.b b2) {
        boolean b3 = false;
        final boolean b4 = view2 != null && view2.getParent() == null;
        Label_0115: {
            if (b4) {
                if (!b && view != null) {
                    if (view2.getParent() == null) {
                        viewGroup.addView(view2, viewGroup.indexOfChild(view));
                    }
                }
                else {
                    viewGroup.addView(view2);
                }
                if (view2.getWidth() <= 0 && view2.getHeight() <= 0) {
                    this.o = new b(viewGroup, view, view2, b, b2);
                    view2.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.o);
                    break Label_0115;
                }
            }
            b3 = true;
        }
        if (b3) {
            this.p(viewGroup, view, view2, b, b4, (c)b2);
        }
    }
    
    @Override
    public final boolean i() {
        return this.j;
    }
    
    @Override
    public final void j(final Bundle bundle) {
        this.i = ((BaseBundle)bundle).getLong("AnimatorChangeHandler.duration");
        this.j = ((BaseBundle)bundle).getBoolean("AnimatorChangeHandler.removesFromViewOnPush");
    }
    
    @Override
    public final void k(final Bundle bundle) {
        ((BaseBundle)bundle).putLong("AnimatorChangeHandler.duration", this.i);
        ((BaseBundle)bundle).putBoolean("AnimatorChangeHandler.removesFromViewOnPush", this.j);
    }
    
    public final void n(final c c, final Animator$AnimatorListener animator$AnimatorListener) {
        if (!this.m) {
            this.m = true;
            ((com.bluelinelabs.conductor.b)c).a();
        }
        final Animator n = this.n;
        if (n != null) {
            if (animator$AnimatorListener != null) {
                n.removeListener(animator$AnimatorListener);
            }
            this.n.cancel();
            this.n = null;
        }
        this.o = null;
    }
    
    public abstract AnimatorSet o(final ViewGroup p0, final View p1, final View p2, final boolean p3, final boolean p4);
    
    public final void p(final ViewGroup viewGroup, final View view, final View view2, final boolean b, final boolean b2, final c c) {
        if (this.k) {
            this.n(c, null);
            return;
        }
        if (this.l) {
            if (view != null && (!b || this.j)) {
                viewGroup.removeView(view);
            }
            this.n(c, null);
            if (b && view != null) {
                this.q(view);
            }
            return;
        }
        final AnimatorSet o = this.o(viewGroup, view, view2, b, b2);
        this.n = (Animator)o;
        final long i = this.i;
        if (i > 0L) {
            ((Animator)o).setDuration(i);
        }
        this.n.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public final void onAnimationCancel(final Animator animator) {
                final View a = view;
                if (a != null) {
                    d8.a.this.q(a);
                }
                final View b = view2;
                if (b != null) {
                    final ViewParent parent = b.getParent();
                    final ViewGroup c = viewGroup;
                    if (parent == c) {
                        c.removeView(view2);
                    }
                }
                d8.a.this.n(c, (Animator$AnimatorListener)this);
            }
            
            public final void onAnimationEnd(final Animator animator) {
                final a f = d8.a.this;
                if (!f.k && f.n != null) {
                    final View a = view;
                    if (a != null && (!b || f.j)) {
                        viewGroup.removeView(a);
                    }
                    d8.a.this.n(c, (Animator$AnimatorListener)this);
                    if (b) {
                        final View a2 = view;
                        if (a2 != null) {
                            d8.a.this.q(a2);
                        }
                    }
                }
            }
        });
        this.n.start();
    }
    
    public abstract void q(final View p0);
    
    public final class b implements ViewTreeObserver$OnPreDrawListener
    {
        public final ViewGroup f;
        public final View g;
        public final View h;
        public final boolean i;
        public final c j;
        public boolean k;
        
        public b(final ViewGroup f, final View g, final View h, final boolean i, final com.bluelinelabs.conductor.b j) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = (c)j;
        }
        
        public final void a() {
            if (!this.k) {
                this.k = true;
                final View h = this.h;
                if (h != null) {
                    final ViewTreeObserver viewTreeObserver = h.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                    }
                }
                a.this.p(this.f, this.g, this.h, this.i, true, this.j);
            }
        }
        
        public final boolean onPreDraw() {
            this.a();
            return true;
        }
    }
}
