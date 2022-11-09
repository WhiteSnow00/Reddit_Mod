// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.app.Activity;

public final class 05u implements Runnable
{
    public final /* synthetic */ Activity LIZ;
    
    static {
        Covode.recordClassIndex(679);
    }
    
    public 05u(final Activity liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        if (!this.LIZ.isFinishing() && !064.LIZ(this.LIZ)) {
            this.LIZ.recreate();
        }
    }
}
