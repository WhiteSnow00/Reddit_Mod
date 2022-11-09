// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.content.Context;
import e4.e;
import eg.n0;
import android.view.View;
import a4.p0;
import gn.a;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class m
{
    public final ImageView a;
    public x0 b;
    public int c;
    
    public m(final ImageView a) {
        this.c = 0;
        this.a = a;
    }
    
    public final void a() {
        final Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            d0.a(drawable);
        }
        if (drawable != null) {
            final x0 b = this.b;
            if (b != null) {
                final int[] drawableState = ((View)this.a).getDrawableState();
                final PorterDuff$Mode b2 = i.b;
                ResourceManagerInternal.tintDrawable(drawable, b, drawableState);
            }
        }
    }
    
    public final void b(final AttributeSet set, int i) {
        final Context context = ((View)this.a).getContext();
        final int[] v = gn.a.V;
        final z0 m = z0.m(context, set, v, i);
        final ImageView a = this.a;
        p0.k((View)a, ((View)a).getContext(), v, set, m.b, i);
        try {
            Drawable drawable2;
            final Drawable drawable = drawable2 = this.a.getDrawable();
            if (drawable == null) {
                i = m.i(1, -1);
                drawable2 = drawable;
                if (i != -1) {
                    final Drawable l = n0.L(((View)this.a).getContext(), i);
                    if ((drawable2 = l) != null) {
                        this.a.setImageDrawable(l);
                        drawable2 = l;
                    }
                }
            }
            if (drawable2 != null) {
                d0.a(drawable2);
            }
            if (m.l(2)) {
                e.c(this.a, m.b(2));
            }
            if (m.l(3)) {
                e.d(this.a, d0.c(m.h(3, -1), null));
            }
        }
        finally {
            m.n();
        }
    }
    
    public final void c(final int n) {
        if (n != 0) {
            final Drawable l = n0.L(((View)this.a).getContext(), n);
            if (l != null) {
                d0.a(l);
            }
            this.a.setImageDrawable(l);
        }
        else {
            this.a.setImageDrawable((Drawable)null);
        }
        this.a();
    }
}
