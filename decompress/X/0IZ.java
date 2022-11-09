// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.View;

public final class 0iZ implements Runnable
{
    public final /* synthetic */ View LIZ;
    
    static {
        Covode.recordClassIndex(6760);
    }
    
    public 0iZ(final View liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final View liz = this.LIZ;
        if (liz != null) {
            liz.setSelected(false);
        }
    }
}
