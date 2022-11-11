// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class 02e implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final /* synthetic */ 1fW LIZ;
    
    static {
        Covode.recordClassIndex(340);
    }
    
    public 02e(final 1fW liz) {
        this.LIZ = liz;
    }
    
    public final void onGlobalLayout() {
        if (this.LIZ.LJ() && this.LIZ.LIZIZ.size() > 0 && !((1fW.a)this.LIZ.LIZIZ.get(0)).LIZ.LJIJJ) {
            final View lizlll = this.LIZ.LIZLLL;
            if (lizlll == null || !lizlll.isShown()) {
                this.LIZ.LIZLLL();
            }
            else {
                final Iterator<1fW.a> iterator = this.LIZ.LIZIZ.iterator();
                while (iterator.hasNext()) {
                    ((1fW.a)iterator.next()).LIZ.a_();
                }
            }
        }
    }
}
