// 
// Decompiled by Procyon v0.6.0
// 

package i;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import r3.a$b;
import android.graphics.ColorFilter;
import r3.a$a;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public class a extends Drawable implements Drawable$Callback
{
    public Drawable f;
    
    public a(final Drawable f) {
        final Drawable f2 = this.f;
        if (f2 != null) {
            f2.setCallback((Drawable$Callback)null);
        }
        if ((this.f = f) != null) {
            f.setCallback((Drawable$Callback)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        this.f.draw(canvas);
    }
    
    public final int getChangingConfigurations() {
        return this.f.getChangingConfigurations();
    }
    
    public final Drawable getCurrent() {
        return this.f.getCurrent();
    }
    
    public final int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }
    
    public final int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }
    
    public final int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }
    
    public final int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }
    
    public final int getOpacity() {
        return this.f.getOpacity();
    }
    
    public final boolean getPadding(final Rect rect) {
        return this.f.getPadding(rect);
    }
    
    public final int[] getState() {
        return this.f.getState();
    }
    
    public final Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public final boolean isAutoMirrored() {
        return a$a.d(this.f);
    }
    
    public final boolean isStateful() {
        return this.f.isStateful();
    }
    
    public final void jumpToCurrentState() {
        this.f.jumpToCurrentState();
    }
    
    public final void onBoundsChange(final Rect bounds) {
        this.f.setBounds(bounds);
    }
    
    public final boolean onLevelChange(final int level) {
        return this.f.setLevel(level);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public final void setAlpha(final int alpha) {
        this.f.setAlpha(alpha);
    }
    
    public final void setAutoMirrored(final boolean b) {
        a$a.e(this.f, b);
    }
    
    public final void setChangingConfigurations(final int changingConfigurations) {
        this.f.setChangingConfigurations(changingConfigurations);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }
    
    public final void setDither(final boolean dither) {
        this.f.setDither(dither);
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.f.setFilterBitmap(filterBitmap);
    }
    
    public void setHotspot(final float n, final float n2) {
        a$b.e(this.f, n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        a$b.f(this.f, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        return this.f.setState(state);
    }
    
    public final void setTint(final int n) {
        a$b.g(this.f, n);
    }
    
    public final void setTintList(final ColorStateList list) {
        a$b.h(this.f, list);
    }
    
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        a$b.i(this.f, porterDuff$Mode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.f.setVisible(b, b2);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
