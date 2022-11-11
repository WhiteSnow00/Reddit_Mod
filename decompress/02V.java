// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class 02v implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final /* synthetic */ 1fY LIZ;
    
    static {
        Covode.recordClassIndex(370);
    }
    
    public 02v(final 1fY liz) {
        this.LIZ = liz;
    }
    
    public final void onGlobalLayout() {
        if (this.LIZ.LJ() && !this.LIZ.LIZ.LJIJJ) {
            final View lizj = this.LIZ.LIZJ;
            if (lizj == null || !lizj.isShown()) {
                this.LIZ.LIZLLL();
            }
            else {
                this.LIZ.LIZ.a_();
            }
        }
    }
}
