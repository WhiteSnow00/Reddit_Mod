// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;

public final class 00l implements Callable<Integer>
{
    public ScheduledFuture<Integer> LIZ;
    public final 00f LIZIZ;
    
    static {
        Covode.recordClassIndex(73);
    }
    
    public 00l(final 00f liziz) {
        this.LIZIZ = liziz;
    }
    
    private Integer LIZ() {
        if (this.LIZIZ.LJIIJJI != 00k.USER_CANCEL && this.LIZIZ.LJIIJJI != 00k.USE_PROVIDERS) {
            this.LIZIZ.LJIIIZ = true;
            00O.LIZ().LIZJ(this.LIZIZ);
        }
        00j.a.LIZ.LIZ(this.LIZIZ, true);
        return null;
    }
}
