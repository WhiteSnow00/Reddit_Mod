// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public class 14j extends Drawable implements Drawable$Callback, 08X, 08Y
{
    public static final PorterDuff$Mode LIZ;
    public 08Z LIZIZ;
    public Drawable LIZJ;
    public int LIZLLL;
    public PorterDuff$Mode LJ;
    public boolean LJFF;
    public boolean LJI;
    
    static {
        Covode.recordClassIndex(897);
        LIZ = PorterDuff$Mode.SRC_IN;
    }
    
    public 14j(final 08Z liziz, final Resources resources) {
        this.LIZIZ = liziz;
        if (liziz != null && liziz.LIZIZ != null) {
            this.LIZ(this.LIZIZ.LIZIZ.newDrawable(resources));
        }
    }
    
    public 14j(final Drawable drawable) {
        this.LIZIZ = this.LIZJ();
        this.LIZ(drawable);
    }
    
    private boolean LIZ(final int[] array) {
        if (!this.LIZIZ()) {
            return false;
        }
        final ColorStateList lizj = this.LIZIZ.LIZJ;
        final PorterDuff$Mode lizlll = this.LIZIZ.LIZLLL;
        if (lizj != null && lizlll != null) {
            final int colorForState = lizj.getColorForState(array, lizj.getDefaultColor());
            if (!this.LJFF || colorForState != this.LIZLLL || lizlll != this.LJ) {
                this.setColorFilter(colorForState, lizlll);
                this.LIZLLL = colorForState;
                this.LJ = lizlll;
                return this.LJFF = true;
            }
        }
        else {
            this.LJFF = false;
            this.clearColorFilter();
        }
        return false;
    }
    
    private 08Z LIZJ() {
        return new 08Z(this.LIZIZ);
    }
    
    public final Drawable LIZ() {
        return this.LIZJ;
    }
    
    public final void LIZ(final Drawable lizj) {
        final Drawable lizj2 = this.LIZJ;
        if (lizj2 != null) {
            lizj2.setCallback((Drawable$Callback)null);
        }
        if ((this.LIZJ = lizj) != null) {
            lizj.setCallback((Drawable$Callback)this);
            this.setVisible(lizj.isVisible(), true);
            this.setState(lizj.getState());
            this.setLevel(lizj.getLevel());
            this.setBounds(lizj.getBounds());
            final 08Z liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZIZ = lizj.getConstantState();
            }
        }
        this.invalidateSelf();
    }
    
    public boolean LIZIZ() {
        return true;
    }
    
    public void draw(final Canvas canvas) {
        this.LIZJ.draw(canvas);
    }
    
    public int getChangingConfigurations() {
        final int changingConfigurations = super.getChangingConfigurations();
        final 08Z liziz = this.LIZIZ;
        int changingConfigurations2;
        if (liziz != null) {
            changingConfigurations2 = liziz.getChangingConfigurations();
        }
        else {
            changingConfigurations2 = 0;
        }
        return changingConfigurations | changingConfigurations2 | this.LIZJ.getChangingConfigurations();
    }
    
    public Drawable$ConstantState getConstantState() {
        final 08Z liziz = this.LIZIZ;
        if (liziz != null && liziz.LIZIZ != null) {
            this.LIZIZ.LIZ = this.getChangingConfigurations();
            return this.LIZIZ;
        }
        return null;
    }
    
    public Drawable getCurrent() {
        return this.LIZJ.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.LIZJ.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.LIZJ.getIntrinsicWidth();
    }
    
    public int getMinimumHeight() {
        return this.LIZJ.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        return this.LIZJ.getMinimumWidth();
    }
    
    public int getOpacity() {
        return this.LIZJ.getOpacity();
    }
    
    public boolean getPadding(final Rect rect) {
        return this.LIZJ.getPadding(rect);
    }
    
    public int[] getState() {
        return this.LIZJ.getState();
    }
    
    public Region getTransparentRegion() {
        return this.LIZJ.getTransparentRegion();
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public boolean isAutoMirrored() {
        return this.LIZJ.isAutoMirrored();
    }
    
    public boolean isStateful() {
        if (this.LIZIZ()) {
            final 08Z liziz = this.LIZIZ;
            if (liziz != null) {
                final ColorStateList lizj = liziz.LIZJ;
                if (lizj != null && lizj.isStateful()) {
                    return true;
                }
            }
        }
        if (!this.LIZJ.isStateful()) {
            return false;
        }
        return true;
    }
    
    public void jumpToCurrentState() {
        this.LIZJ.jumpToCurrentState();
    }
    
    public Drawable mutate() {
        if (!this.LJI && super.mutate() == this) {
            this.LIZIZ = this.LIZJ();
            final Drawable lizj = this.LIZJ;
            if (lizj != null) {
                lizj.mutate();
            }
            final 08Z liziz = this.LIZIZ;
            if (liziz != null) {
                final Drawable lizj2 = this.LIZJ;
                Drawable$ConstantState constantState;
                if (lizj2 != null) {
                    constantState = lizj2.getConstantState();
                }
                else {
                    constantState = null;
                }
                liziz.LIZIZ = constantState;
            }
            this.LJI = true;
        }
        return this;
    }
    
    public void onBoundsChange(final Rect bounds) {
        final Drawable lizj = this.LIZJ;
        if (lizj != null) {
            lizj.setBounds(bounds);
        }
    }
    
    public boolean onLevelChange(final int level) {
        return this.LIZJ.setLevel(level);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        this.LIZJ.setAlpha(alpha);
    }
    
    public void setAutoMirrored(final boolean autoMirrored) {
        this.LIZJ.setAutoMirrored(autoMirrored);
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        this.LIZJ.setChangingConfigurations(changingConfigurations);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.LIZJ.setColorFilter(colorFilter);
    }
    
    public void setDither(final boolean dither) {
        this.LIZJ.setDither(dither);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.LIZJ.setFilterBitmap(filterBitmap);
    }
    
    public boolean setState(final int[] state) {
        final boolean setState = this.LIZJ.setState(state);
        return this.LIZ(state) || setState;
    }
    
    public void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(final ColorStateList lizj) {
        this.LIZIZ.LIZJ = lizj;
        this.LIZ(this.getState());
    }
    
    public void setTintMode(final PorterDuff$Mode lizlll) {
        this.LIZIZ.LIZLLL = lizlll;
        this.LIZ(this.getState());
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.LIZJ.setVisible(b, b2);
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
