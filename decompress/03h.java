// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 03h implements Runnable
{
    public final /* synthetic */ 13R LIZ;
    
    static {
        Covode.recordClassIndex(471);
    }
    
    public 03h(final 13R liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final View ljiiljjil = this.LIZ.LJIILJJIL;
        if (ljiiljjil != null && ljiiljjil.getWindowToken() != null) {
            this.LIZ.a_();
        }
    }
}
