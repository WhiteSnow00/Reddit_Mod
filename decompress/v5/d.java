// 
// Decompiled by Procyon v0.6.0
// 

package v5;

import android.graphics.PorterDuff$Mode;
import android.graphics.Region;
import android.graphics.Rect;
import r3.a;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;

public abstract class d extends Drawable
{
    public Drawable f;
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable f = this.f;
        if (f != null) {
            a.b.a(f, resources$Theme);
        }
    }
    
    public final void clearColorFilter() {
        final Drawable f = this.f;
        if (f != null) {
            f.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }
    
    public final Drawable getCurrent() {
        final Drawable f = this.f;
        if (f != null) {
            return f.getCurrent();
        }
        return super.getCurrent();
    }
    
    public final int getMinimumHeight() {
        final Drawable f = this.f;
        if (f != null) {
            return f.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        final Drawable f = this.f;
        if (f != null) {
            return f.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }
    
    public final boolean getPadding(final Rect rect) {
        final Drawable f = this.f;
        if (f != null) {
            return f.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public final int[] getState() {
        final Drawable f = this.f;
        if (f != null) {
            return f.getState();
        }
        return super.getState();
    }
    
    public final Region getTransparentRegion() {
        final Drawable f = this.f;
        if (f != null) {
            return f.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public final void jumpToCurrentState() {
        final Drawable f = this.f;
        if (f != null) {
            f.jumpToCurrentState();
        }
    }
    
    public boolean onLevelChange(final int level) {
        final Drawable f = this.f;
        if (f != null) {
            return f.setLevel(level);
        }
        return super.onLevelChange(level);
    }
    
    public final void setChangingConfigurations(final int n) {
        final Drawable f = this.f;
        if (f != null) {
            f.setChangingConfigurations(n);
            return;
        }
        super.setChangingConfigurations(n);
    }
    
    public final void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        final Drawable f = this.f;
        if (f != null) {
            f.setColorFilter(n, porterDuff$Mode);
            return;
        }
        super.setColorFilter(n, porterDuff$Mode);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        final Drawable f = this.f;
        if (f != null) {
            f.setFilterBitmap(filterBitmap);
        }
    }
    
    public final void setHotspot(final float n, final float n2) {
        final Drawable f = this.f;
        if (f != null) {
            a.b.e(f, n, n2);
        }
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Drawable f = this.f;
        if (f != null) {
            a.b.f(f, n, n2, n3, n4);
        }
    }
    
    public final boolean setState(final int[] array) {
        final Drawable f = this.f;
        if (f != null) {
            return f.setState(array);
        }
        return super.setState(array);
    }
}
