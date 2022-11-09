// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1sp extends 1ib
{
    static {
        Covode.recordClassIndex(6124);
    }
    
    public 1sp(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZ();
        this.LIZIZ();
        this.LIZJ();
    }
    
    private void LIZ() {
        final Drawable background = this.getBackground();
        if (background != null && !background.isAutoMirrored()) {
            background.mutate();
            background.setAutoMirrored(true);
        }
    }
    
    private void LIZIZ() {
        for (final Drawable drawable : this.getCompoundDrawables()) {
            if (drawable != null && !drawable.isAutoMirrored()) {
                drawable.mutate();
                drawable.setAutoMirrored(true);
            }
        }
    }
    
    private void LIZJ() {
        for (final Drawable drawable : this.getCompoundDrawablesRelative()) {
            if (drawable != null && !drawable.isAutoMirrored()) {
                drawable.mutate();
                drawable.setAutoMirrored(true);
            }
        }
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        this.LIZ();
    }
    
    @Override
    public void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        this.LIZIZ();
    }
    
    @Override
    public void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        this.LIZJ();
    }
}
