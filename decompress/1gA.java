// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroupOverlay;

public final class 1ga implements 16b
{
    public final ViewGroupOverlay LIZ;
    
    static {
        Covode.recordClassIndex(1468);
    }
    
    public 1ga(final ViewGroup viewGroup) {
        this.LIZ = viewGroup.getOverlay();
    }
    
    @Override
    public final void LIZ(final Drawable drawable) {
        this.LIZ.add(drawable);
    }
    
    @Override
    public final void LIZ(final View view) {
        this.LIZ.add(view);
    }
    
    @Override
    public final void LIZIZ(final Drawable drawable) {
        this.LIZ.remove(drawable);
    }
    
    @Override
    public final void LIZIZ(final View view) {
        this.LIZ.remove(view);
    }
}
