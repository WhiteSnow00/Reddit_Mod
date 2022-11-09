// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.content.Context;
import gn.a;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import java.util.WeakHashMap;
import android.graphics.drawable.Drawable;
import a4.p0;
import android.view.View;

public final class e
{
    public final View a;
    public final i b;
    public int c;
    public x0 d;
    public x0 e;
    public x0 f;
    
    public e(final View a) {
        this.c = -1;
        this.a = a;
        this.b = i.a();
    }
    
    public final void a() {
        final Drawable background = this.a.getBackground();
        if (background != null) {
            final x0 d = this.d;
            final int n = 1;
            if (d != null) {
                if (this.f == null) {
                    this.f = new x0();
                }
                final x0 f = this.f;
                f.a = null;
                f.d = false;
                f.b = null;
                f.c = false;
                final View a = this.a;
                final WeakHashMap a2 = p0.a;
                final ColorStateList g = p0.i.g(a);
                if (g != null) {
                    f.d = true;
                    f.a = g;
                }
                final PorterDuff$Mode h = p0.i.h(this.a);
                if (h != null) {
                    f.c = true;
                    f.b = h;
                }
                int n2;
                if (!f.d && !f.c) {
                    n2 = 0;
                }
                else {
                    final int[] drawableState = this.a.getDrawableState();
                    final PorterDuff$Mode b = i.b;
                    ResourceManagerInternal.tintDrawable(background, f, drawableState);
                    n2 = n;
                }
                if (n2 != 0) {
                    return;
                }
            }
            final x0 e = this.e;
            if (e != null) {
                final int[] drawableState2 = this.a.getDrawableState();
                final PorterDuff$Mode b2 = i.b;
                ResourceManagerInternal.tintDrawable(background, e, drawableState2);
            }
            else {
                final x0 d2 = this.d;
                if (d2 != null) {
                    final int[] drawableState3 = this.a.getDrawableState();
                    final PorterDuff$Mode b3 = i.b;
                    ResourceManagerInternal.tintDrawable(background, d2, drawableState3);
                }
            }
        }
    }
    
    public final ColorStateList b() {
        final x0 e = this.e;
        ColorStateList a;
        if (e != null) {
            a = e.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final PorterDuff$Mode c() {
        final x0 e = this.e;
        PorterDuff$Mode b;
        if (e != null) {
            b = e.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final void d(AttributeSet b, int c) {
        final Context context = this.a.getContext();
        final int[] q0 = gn.a.q0;
        final z0 m = z0.m(context, b, q0, c);
        final View a = this.a;
        p0.k(a, a.getContext(), q0, b, m.b, c);
        try {
            if (m.l(0)) {
                this.c = m.i(0, -1);
                b = (AttributeSet)this.b;
                final Context context2 = this.a.getContext();
                c = this.c;
                synchronized (b) {
                    final ColorStateList tintList = ((i)b).a.getTintList(context2, c);
                    monitorexit(b);
                    if (tintList != null) {
                        this.g(tintList);
                    }
                }
            }
            if (m.l(1)) {
                p0.i.q(this.a, m.b(1));
            }
            if (m.l(2)) {
                p0.i.r(this.a, d0.c(m.h(2, -1), null));
            }
        }
        finally {
            m.n();
        }
    }
    
    public final void e() {
        this.c = -1;
        this.g(null);
        this.a();
    }
    
    public final void f(final int c) {
        this.c = c;
        final i b = this.b;
        final ColorStateList list;
        Label_0046: {
            if (b != null) {
                final Context context = this.a.getContext();
                synchronized (b) {
                    b.a.getTintList(context, c);
                    break Label_0046;
                }
            }
            list = null;
        }
        this.g(list);
        this.a();
    }
    
    public final void g(final ColorStateList a) {
        if (a != null) {
            if (this.d == null) {
                this.d = new x0();
            }
            final x0 d = this.d;
            d.a = a;
            d.d = true;
        }
        else {
            this.d = null;
        }
        this.a();
    }
    
    public final void h(final ColorStateList a) {
        if (this.e == null) {
            this.e = new x0();
        }
        final x0 e = this.e;
        e.a = a;
        e.d = true;
        this.a();
    }
    
    public final void i(final PorterDuff$Mode b) {
        if (this.e == null) {
            this.e = new x0();
        }
        final x0 e = this.e;
        e.b = b;
        e.c = true;
        this.a();
    }
}
