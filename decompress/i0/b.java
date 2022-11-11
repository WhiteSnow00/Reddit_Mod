// 
// Decompiled by Procyon v0.6.0
// 

package i0;

import android.graphics.Outline;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class b extends Drawable
{
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean f;
    public boolean g;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff$Mode k;
    
    public b(final float a, final ColorStateList list) {
        this.f = false;
        this.g = true;
        this.k = PorterDuff$Mode.SRC_IN;
        this.a = a;
        this.b = new Paint(5);
        this.b(list);
        this.c = new RectF();
        this.d = new Rect();
    }
    
    public final PorterDuffColorFilter a(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public final void b(final ColorStateList list) {
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        this.h = value;
        this.b.setColor(value.getColorForState(this.getState(), this.h.getDefaultColor()));
    }
    
    public final void c(final Rect rect) {
        Rect bounds = rect;
        if (rect == null) {
            bounds = this.getBounds();
        }
        this.c.set((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom);
        this.d.set(bounds);
        if (this.f) {
            final float a = i0.c.a(this.e, this.a, this.g);
            final float e = this.e;
            final float a2 = this.a;
            float n = e;
            if (this.g) {
                n = (float)((1.0 - i0.c.a) * a2 + e);
            }
            this.d.inset((int)Math.ceil(n), (int)Math.ceil(a));
            this.c.set(this.d);
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Paint b = this.b;
        boolean b2;
        if (this.i != null && b.getColorFilter() == null) {
            b.setColorFilter((ColorFilter)this.i);
            b2 = true;
        }
        else {
            b2 = false;
        }
        final RectF c = this.c;
        final float a = this.a;
        canvas.drawRoundRect(c, a, a, b);
        if (b2) {
            b.setColorFilter((ColorFilter)null);
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        outline.setRoundRect(this.d, this.a);
    }
    
    public final boolean isStateful() {
        final ColorStateList j = this.j;
        if (j == null || !j.isStateful()) {
            final ColorStateList h = this.h;
            if ((h == null || !h.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.c(rect);
    }
    
    public final boolean onStateChange(final int[] array) {
        final ColorStateList h = this.h;
        final int colorForState = h.getColorForState(array, h.getDefaultColor());
        final boolean b = colorForState != this.b.getColor();
        if (b) {
            this.b.setColor(colorForState);
        }
        final ColorStateList j = this.j;
        if (j != null) {
            final PorterDuff$Mode k = this.k;
            if (k != null) {
                this.i = this.a(j, k);
                return true;
            }
        }
        return b;
    }
    
    public final void setAlpha(final int alpha) {
        this.b.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
    
    public final void setTintList(final ColorStateList j) {
        this.j = j;
        this.i = this.a(j, this.k);
        this.invalidateSelf();
    }
    
    public final void setTintMode(final PorterDuff$Mode k) {
        this.k = k;
        this.i = this.a(this.j, k);
        this.invalidateSelf();
    }
}
