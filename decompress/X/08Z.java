// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;

public final class 08Z extends Drawable$ConstantState
{
    public int LIZ;
    public Drawable$ConstantState LIZIZ;
    public ColorStateList LIZJ;
    public PorterDuff$Mode LIZLLL;
    
    static {
        Covode.recordClassIndex(899);
    }
    
    public 08Z(final 08Z 08Z) {
        this.LIZLLL = 14j.LIZ;
        if (08Z != null) {
            this.LIZ = 08Z.LIZ;
            this.LIZIZ = 08Z.LIZIZ;
            this.LIZJ = 08Z.LIZJ;
            this.LIZLLL = 08Z.LIZLLL;
        }
    }
    
    public final int getChangingConfigurations() {
        final int liz = this.LIZ;
        final Drawable$ConstantState liziz = this.LIZIZ;
        int changingConfigurations;
        if (liziz != null) {
            changingConfigurations = liziz.getChangingConfigurations();
        }
        else {
            changingConfigurations = 0;
        }
        return liz | changingConfigurations;
    }
    
    public final Drawable newDrawable() {
        return this.newDrawable(null);
    }
    
    public final Drawable newDrawable(final Resources resources) {
        return new 1fp(this, resources);
    }
}
