// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable;

public final class 04C extends Drawable
{
    public final 02x LIZ;
    
    static {
        Covode.recordClassIndex(513);
    }
    
    public 04C(final 02x liz) {
        this.LIZ = liz;
    }
    
    public final void draw(final Canvas canvas) {
        if (this.LIZ.LIZLLL) {
            if (this.LIZ.LIZJ != null) {
                this.LIZ.LIZJ.draw(canvas);
            }
        }
        else {
            if (this.LIZ.LIZ != null) {
                this.LIZ.LIZ.draw(canvas);
            }
            if (this.LIZ.LIZIZ != null && this.LIZ.LJ) {
                this.LIZ.LIZIZ.draw(canvas);
            }
        }
    }
    
    public final int getOpacity() {
        return 0;
    }
    
    public final void getOutline(final Outline outline) {
        if (this.LIZ.LIZLLL) {
            if (this.LIZ.LIZJ != null) {
                this.LIZ.LIZJ.getOutline(outline);
            }
        }
        else if (this.LIZ.LIZ != null) {
            this.LIZ.LIZ.getOutline(outline);
        }
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
