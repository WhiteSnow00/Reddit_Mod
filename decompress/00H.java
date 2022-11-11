// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.TimerTask;

public final class 00H extends TimerTask
{
    public final /* synthetic */ float LIZ;
    
    static {
        Covode.recordClassIndex(31);
    }
    
    public 00H(final float liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        if (!00J.LIZIZ) {
            00J.LIZ(this.LIZ);
        }
    }
}
