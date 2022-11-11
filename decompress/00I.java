// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.TimerTask;

public final class 00I extends TimerTask
{
    public final /* synthetic */ float LIZ;
    public final /* synthetic */ float LIZIZ;
    
    static {
        Covode.recordClassIndex(32);
    }
    
    public 00I(final float liz, final float liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        if (!00J.LIZIZ) {
            00J.LIZ(this.LIZ, this.LIZIZ);
        }
    }
}
