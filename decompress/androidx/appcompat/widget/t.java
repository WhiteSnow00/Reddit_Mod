// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.AbsSeekBar;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import a4.p0;
import gn.a;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

public final class t extends p
{
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff$Mode g;
    public boolean h;
    public boolean i;
    
    public t(final SeekBar d) {
        super((ProgressBar)d);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = d;
    }
    
    public final void a(final AttributeSet set, final int n) {
        super.a(set, n);
        final Context context = ((View)this.d).getContext();
        final int[] w = a.W;
        final z0 m = z0.m(context, set, w, n);
        final SeekBar d = this.d;
        p0.k((View)d, ((View)d).getContext(), w, set, m.b, n);
        final Drawable f = m.f(0);
        if (f != null) {
            ((AbsSeekBar)this.d).setThumb(f);
        }
        final Drawable e = m.e(1);
        final Drawable e2 = this.e;
        if (e2 != null) {
            e2.setCallback((Drawable$Callback)null);
        }
        if ((this.e = e) != null) {
            e.setCallback((Drawable$Callback)this.d);
            r3.a.c.b(e, p0.e.d((View)this.d));
            if (e.isStateful()) {
                e.setState(((View)this.d).getDrawableState());
            }
            this.c();
        }
        ((View)this.d).invalidate();
        if (m.l(3)) {
            this.g = d0.c(m.h(3, -1), this.g);
            this.i = true;
        }
        if (m.l(2)) {
            this.f = m.b(2);
            this.h = true;
        }
        m.n();
        this.c();
    }
    
    public final void c() {
        final Drawable e = this.e;
        if (e != null && (this.h || this.i)) {
            final Drawable mutate = e.mutate();
            this.e = mutate;
            if (this.h) {
                r3.a.b.h(mutate, this.f);
            }
            if (this.i) {
                r3.a.b.i(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(((View)this.d).getDrawableState());
            }
        }
    }
    
    public final void d(final Canvas canvas) {
        if (this.e != null) {
            final int max = ((ProgressBar)this.d).getMax();
            int n = 1;
            if (max > 1) {
                final int intrinsicWidth = this.e.getIntrinsicWidth();
                final int intrinsicHeight = this.e.getIntrinsicHeight();
                int n2;
                if (intrinsicWidth >= 0) {
                    n2 = intrinsicWidth / 2;
                }
                else {
                    n2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    n = intrinsicHeight / 2;
                }
                this.e.setBounds(-n2, -n, n2, n);
                final float n3 = (((View)this.d).getWidth() - ((View)this.d).getPaddingLeft() - ((View)this.d).getPaddingRight()) / (float)max;
                final int save = canvas.save();
                canvas.translate((float)((View)this.d).getPaddingLeft(), (float)(((View)this.d).getHeight() / 2));
                for (int i = 0; i <= max; ++i) {
                    this.e.draw(canvas);
                    canvas.translate(n3, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
