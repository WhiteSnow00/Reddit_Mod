// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.ViewOverlay;

public final class 16c implements 0Dp
{
    public final ViewOverlay LIZ;
    
    static {
        Covode.recordClassIndex(1471);
    }
    
    public 16c(final View view) {
        this.LIZ = view.getOverlay();
    }
    
    @Override
    public final void LIZ(final Drawable drawable) {
        this.LIZ.add(drawable);
    }
    
    @Override
    public final void LIZIZ(final Drawable drawable) {
        this.LIZ.remove(drawable);
    }
}
