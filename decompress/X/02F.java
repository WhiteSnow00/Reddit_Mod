// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnAttachStateChangeListener;

public final class 02f implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ 1fW LIZ;
    
    static {
        Covode.recordClassIndex(341);
    }
    
    public 02f(final 1fW liz) {
        this.LIZ = liz;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        if (this.LIZ.LJ != null) {
            if (!this.LIZ.LJ.isAlive()) {
                this.LIZ.LJ = view.getViewTreeObserver();
            }
            this.LIZ.LJ.removeGlobalOnLayoutListener(this.LIZ.LIZJ);
        }
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
}
