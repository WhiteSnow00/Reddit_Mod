// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.View;

public final class 03u implements Runnable
{
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ 03x LIZIZ;
    
    static {
        Covode.recordClassIndex(491);
    }
    
    public 03u(final 03x liziz, final View liz) {
        this.LIZIZ = liziz;
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        this.LIZIZ.smoothScrollTo(this.LIZ.getLeft() - (this.LIZIZ.getWidth() - this.LIZ.getWidth()) / 2, 0);
        this.LIZIZ.LIZ = null;
    }
}
