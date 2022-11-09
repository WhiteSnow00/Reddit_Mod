// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;
import android.os.CountDownTimer;

public final class 0iu extends CountDownTimer
{
    static {
        Covode.recordClassIndex(6810);
    }
    
    public 0iu(final long n) {
        super(n, 1000L);
    }
    
    public final void onFinish() {
        0it.LIZ.LIZIZ(0iv.LIZLLL, false);
        final DataChannel lizlll = 0iv.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZJ((Class)2Cn.class);
        }
        final DataChannel lizlll2 = 0iv.LIZLLL;
        if (lizlll2 != null) {
            lizlll2.LIZIZ((Class)2Cq.class, (Object)false);
        }
    }
    
    public final void onTick(final long n) {
    }
}
