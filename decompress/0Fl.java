// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.FrameLayout;

public class 0fl extends FrameLayout
{
    public 1ik LIZ;
    
    static {
        Covode.recordClassIndex(6139);
    }
    
    public 0fl(final Context context, final AttributeSet set) {
        super(context, set);
        MethodCollector.i(7762);
        this.LIZ(set, 0);
        MethodCollector.o(7762);
    }
    
    public 0fl(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        MethodCollector.i(759);
        this.LIZ(set, n);
        MethodCollector.o(759);
    }
    
    private void LIZ(final AttributeSet set, final int n) {
        (this.LIZ = new 1ik((View)this)).LIZ(set, n, 0);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final 1ik liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ();
        }
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final 1ik liz = this.LIZ;
        if (liz == null) {
            return null;
        }
        return liz.LIZJ();
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final 1ik liz = this.LIZ;
        if (liz == null) {
            return null;
        }
        return liz.LIZLLL();
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final 1ik liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(backgroundDrawable);
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final 1ik liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final 1ik liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(porterDuff$Mode);
        }
    }
    
    public boolean verifyDrawable(final Drawable drawable) {
        final 1ik liz = this.LIZ;
        return (liz != null && liz.LIZIZ(drawable)) || super.verifyDrawable(drawable);
    }
}
