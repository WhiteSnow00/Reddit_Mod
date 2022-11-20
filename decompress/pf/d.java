// 
// Decompiled by Procyon v0.6.0
// 

package pf;

import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.view.Gravity;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import oy0.b;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.LinearLayoutCompat;

public class d extends LinearLayoutCompat
{
    public Drawable f;
    public final Rect g;
    public final Rect h;
    public int i;
    public boolean j;
    public boolean k;
    
    public d(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public d(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.g = new Rect();
        this.h = new Rect();
        this.i = 119;
        this.j = true;
        this.k = false;
        final TypedArray d = pf.g.d(context, set, b.J, 0, 0, new int[0]);
        this.i = d.getInt(1, this.i);
        final Drawable drawable = d.getDrawable(0);
        if (drawable != null) {
            this.setForeground(drawable);
        }
        this.j = d.getBoolean(2, true);
        d.recycle();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final Drawable f = this.f;
        if (f != null) {
            if (this.k) {
                this.k = false;
                final Rect g = this.g;
                final Rect h = this.h;
                final int n = ((View)this).getRight() - ((View)this).getLeft();
                final int n2 = ((View)this).getBottom() - ((View)this).getTop();
                if (this.j) {
                    g.set(0, 0, n, n2);
                }
                else {
                    g.set(((View)this).getPaddingLeft(), ((View)this).getPaddingTop(), n - ((View)this).getPaddingRight(), n2 - ((View)this).getPaddingBottom());
                }
                Gravity.apply(this.i, f.getIntrinsicWidth(), f.getIntrinsicHeight(), g, h);
                f.setBounds(h);
            }
            f.draw(canvas);
        }
    }
    
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable f = this.f;
        if (f != null) {
            f.setHotspot(n, n2);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable f = this.f;
        if (f != null && f.isStateful()) {
            this.f.setState(((View)this).getDrawableState());
        }
    }
    
    public Drawable getForeground() {
        return this.f;
    }
    
    public int getForegroundGravity() {
        return this.i;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable f = this.f;
        if (f != null) {
            f.jumpToCurrentState();
        }
    }
    
    @Override
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.k |= b;
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.k = true;
    }
    
    public void setForeground(final Drawable f) {
        final Drawable f2 = this.f;
        if (f2 != f) {
            if (f2 != null) {
                f2.setCallback((Drawable$Callback)null);
                ((View)this).unscheduleDrawable(this.f);
            }
            if ((this.f = f) != null) {
                ((View)this).setWillNotDraw(false);
                f.setCallback((Drawable$Callback)this);
                if (f.isStateful()) {
                    f.setState(((View)this).getDrawableState());
                }
                if (this.i == 119) {
                    f.getPadding(new Rect());
                }
            }
            else {
                ((View)this).setWillNotDraw(true);
            }
            ((View)this).requestLayout();
            ((View)this).invalidate();
        }
    }
    
    public void setForegroundGravity(int i) {
        if (this.i != i) {
            int n = i;
            if ((0x800007 & i) == 0x0) {
                n = (i | 0x800003);
            }
            i = n;
            if ((n & 0x70) == 0x0) {
                i = (n | 0x30);
            }
            this.i = i;
            if (i == 119 && this.f != null) {
                this.f.getPadding(new Rect());
            }
            ((View)this).requestLayout();
        }
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f;
    }
}
