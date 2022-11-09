// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Region;
import android.util.StateSet;
import android.graphics.Rect;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public class 0eH extends Drawable implements Drawable$Callback
{
    public Drawable LIZ;
    
    static {
        Covode.recordClassIndex(5952);
    }
    
    public 0eH(final Drawable drawable) {
        this.LIZ(drawable);
    }
    
    public void LIZ(final Drawable liz) {
        final Drawable liz2 = this.LIZ;
        if (liz2 != null) {
            liz2.setCallback((Drawable$Callback)null);
        }
        if ((this.LIZ = liz) != null) {
            liz.setCallback((Drawable$Callback)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.draw(canvas);
        }
    }
    
    public int getChangingConfigurations() {
        final Drawable liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        return liz.getChangingConfigurations();
    }
    
    public Drawable getCurrent() {
        final Drawable liz = this.LIZ;
        if (liz == null) {
            return this;
        }
        return liz.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            return liz.getIntrinsicHeight();
        }
        return -1;
    }
    
    public int getIntrinsicWidth() {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            return liz.getIntrinsicWidth();
        }
        return -1;
    }
    
    public int getMinimumHeight() {
        final Drawable liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        return liz.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        final Drawable liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        return liz.getMinimumWidth();
    }
    
    public int getOpacity() {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            return liz.getOpacity();
        }
        return -2;
    }
    
    public boolean getPadding(final Rect rect) {
        final Drawable liz = this.LIZ;
        return liz != null && liz.getPadding(rect);
    }
    
    public int[] getState() {
        final Drawable liz = this.LIZ;
        if (liz == null) {
            return StateSet.WILD_CARD;
        }
        return liz.getState();
    }
    
    public Region getTransparentRegion() {
        final Drawable liz = this.LIZ;
        if (liz == null) {
            return null;
        }
        return liz.getTransparentRegion();
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public boolean isAutoMirrored() {
        return this.LIZ.isAutoMirrored();
    }
    
    public boolean isStateful() {
        final Drawable liz = this.LIZ;
        return liz != null && liz.isStateful();
    }
    
    public void jumpToCurrentState() {
        this.LIZ.jumpToCurrentState();
    }
    
    public void onBoundsChange(final Rect bounds) {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.setBounds(bounds);
        }
    }
    
    public boolean onLevelChange(final int level) {
        final Drawable liz = this.LIZ;
        return liz != null && liz.setLevel(level);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.setAlpha(alpha);
        }
    }
    
    public void setAutoMirrored(final boolean autoMirrored) {
        this.LIZ.setAutoMirrored(autoMirrored);
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.setChangingConfigurations(changingConfigurations);
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.setColorFilter(colorFilter);
        }
    }
    
    public void setDither(final boolean dither) {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.setDither(dither);
        }
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        final Drawable liz = this.LIZ;
        if (liz != null) {
            liz.setFilterBitmap(filterBitmap);
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        this.LIZ.setHotspot(n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        08U.LIZ(this.LIZ, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        final Drawable liz = this.LIZ;
        return liz != null && liz.setState(state);
    }
    
    public void setTint(final int tint) {
        this.LIZ.setTint(tint);
    }
    
    public void setTintList(final ColorStateList tintList) {
        this.LIZ.setTintList(tintList);
    }
    
    public void setTintMode(final PorterDuff$Mode tintMode) {
        this.LIZ.setTintMode(tintMode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final Drawable liz = this.LIZ;
        boolean b3;
        if (liz != null && liz.setVisible(b, b2)) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        return b3 | setVisible;
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
