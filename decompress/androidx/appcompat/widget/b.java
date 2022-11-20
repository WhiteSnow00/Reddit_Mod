// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public final class b extends Drawable
{
    public final ActionBarContainer a;
    
    public b(final ActionBarContainer a) {
        this.a = a;
    }
    
    public final void draw(final Canvas canvas) {
        final ActionBarContainer a = this.a;
        if (a.m) {
            final Drawable l = a.l;
            if (l != null) {
                l.draw(canvas);
            }
        }
        else {
            final Drawable j = a.j;
            if (j != null) {
                j.draw(canvas);
            }
            final ActionBarContainer a2 = this.a;
            final Drawable k = a2.k;
            if (k != null && a2.n) {
                k.draw(canvas);
            }
        }
    }
    
    public final int getOpacity() {
        return 0;
    }
    
    public final void getOutline(final Outline outline) {
        final ActionBarContainer a = this.a;
        if (a.m) {
            if (a.l != null) {
                a.j.getOutline(outline);
            }
        }
        else {
            final Drawable j = a.j;
            if (j != null) {
                j.getOutline(outline);
            }
        }
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
