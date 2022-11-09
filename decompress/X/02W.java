// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnAttachStateChangeListener;

public final class 02w implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ 1fY LIZ;
    
    static {
        Covode.recordClassIndex(371);
    }
    
    public 02w(final 1fY liz) {
        this.LIZ = liz;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        if (this.LIZ.LIZLLL != null) {
            if (!this.LIZ.LIZLLL.isAlive()) {
                this.LIZ.LIZLLL = view.getViewTreeObserver();
            }
            this.LIZ.LIZLLL.removeGlobalOnLayoutListener(this.LIZ.LIZIZ);
        }
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
}
