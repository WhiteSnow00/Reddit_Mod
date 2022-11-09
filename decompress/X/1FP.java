// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class 1fp extends 14j
{
    public static Method LIZLLL;
    
    static {
        Covode.recordClassIndex(898);
    }
    
    public 1fp(final 08Z 08Z, final Resources resources) {
        super(08Z, resources);
        this.LIZJ();
    }
    
    public 1fp(final Drawable drawable) {
        super(drawable);
        this.LIZJ();
    }
    
    private void LIZJ() {
        if (1fp.LIZLLL != null) {
            return;
        }
        try {
            1fp.LIZLLL = Drawable.class.getDeclaredMethod("isProjected", (Class<?>[])new Class[0]);
        }
        catch (final Exception ex) {}
    }
    
    @Override
    public final boolean LIZIZ() {
        if (Build$VERSION.SDK_INT == 21) {
            final Drawable lizj = super.LIZJ;
            return lizj instanceof GradientDrawable || lizj instanceof DrawableContainer || lizj instanceof InsetDrawable || lizj instanceof RippleDrawable;
        }
        return false;
    }
    
    public final Rect getDirtyBounds() {
        return super.LIZJ.getDirtyBounds();
    }
    
    public final void getOutline(final Outline outline) {
        super.LIZJ.getOutline(outline);
    }
    
    public final boolean isProjected() {
        if (super.LIZJ == null) {
            return false;
        }
        final Method lizlll = 1fp.LIZLLL;
        if (lizlll == null) {
            return false;
        }
        try {
            return (boolean)lizlll.invoke(super.LIZJ, new Object[0]);
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final void setHotspot(final float n, final float n2) {
        super.LIZJ.setHotspot(n, n2);
    }
    
    public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        super.LIZJ.setHotspotBounds(n, n2, n3, n4);
    }
    
    @Override
    public final boolean setState(final int[] state) {
        if (super.setState(state)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }
    
    @Override
    public final void setTint(final int n) {
        if (this.LIZIZ()) {
            super.setTint(n);
            return;
        }
        super.LIZJ.setTint(n);
    }
    
    @Override
    public final void setTintList(final ColorStateList list) {
        if (this.LIZIZ()) {
            super.setTintList(list);
            return;
        }
        super.LIZJ.setTintList(list);
    }
    
    @Override
    public final void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.LIZIZ()) {
            super.setTintMode(porterDuff$Mode);
            return;
        }
        super.LIZJ.setTintMode(porterDuff$Mode);
    }
}
