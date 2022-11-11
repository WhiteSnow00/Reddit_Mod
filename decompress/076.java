// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import android.os.Handler$Callback;

public final class 076 implements Handler$Callback
{
    public final /* synthetic */ 07B LIZ;
    
    static {
        Covode.recordClassIndex(772);
    }
    
    public 076(final 07B liz) {
        this.LIZ = liz;
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                return true;
            }
            final 07B liz = this.LIZ;
            ((Runnable)message.obj).run();
            synchronized (liz.LIZ) {
                liz.LIZJ.removeMessages(0);
                liz.LIZJ.sendMessageDelayed(liz.LIZJ.obtainMessage(0), (long)liz.LIZLLL);
                return true;
            }
        }
        final 07B liz2 = this.LIZ;
        synchronized (liz2.LIZ) {
            if (liz2.LIZJ.hasMessages(1)) {
                monitorexit(liz2.LIZ);
            }
            else {
                liz2.LIZIZ.quit();
                liz2.LIZIZ = null;
                liz2.LIZJ = null;
            }
            return true;
        }
    }
}
