// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PorterDuff$Mode;
import android.graphics.Region;
import android.graphics.Rect;
import android.content.res.Resources$Theme;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable;

public abstract class 16e extends Drawable implements 08X
{
    public Drawable LIZIZ;
    
    static {
        Covode.recordClassIndex(1487);
    }
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.applyTheme(resources$Theme);
        }
    }
    
    public void clearColorFilter() {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }
    
    public Drawable getCurrent() {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.getCurrent();
        }
        return super.getCurrent();
    }
    
    public int getMinimumHeight() {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }
    
    public boolean getPadding(final Rect rect) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public int[] getState() {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.getState();
        }
        return super.getState();
    }
    
    public Region getTransparentRegion() {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public void jumpToCurrentState() {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.jumpToCurrentState();
        }
    }
    
    public void onBoundsChange(final Rect bounds) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setBounds(bounds);
            return;
        }
        super.onBoundsChange(bounds);
    }
    
    public boolean onLevelChange(final int level) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.setLevel(level);
        }
        return super.onLevelChange(level);
    }
    
    public void setChangingConfigurations(final int n) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setChangingConfigurations(n);
            return;
        }
        super.setChangingConfigurations(n);
    }
    
    public void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setColorFilter(n, porterDuff$Mode);
            return;
        }
        super.setColorFilter(n, porterDuff$Mode);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setFilterBitmap(filterBitmap);
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setHotspot(n, n2);
        }
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            08U.LIZ(liziz, n, n2, n3, n4);
        }
    }
    
    public boolean setState(final int[] array) {
        final Drawable liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.setState(array);
        }
        return super.setState(array);
    }
}
