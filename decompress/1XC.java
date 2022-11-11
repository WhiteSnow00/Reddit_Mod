// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.PrintStream;
import android.util.Log;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;

public final class 1xc extends F5g implements QgG<2P9>
{
    public final /* synthetic */ 0no LIZ;
    
    static {
        Covode.recordClassIndex(7944);
    }
    
    public 1xc(final 0no liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public static void LIZ(final AnimatorSet set) {
        if (!7rv.LIZ.LIZ()) {
            set.removeAllListeners();
            return;
        }
        final PrintStream err = System.err;
        final StringBuilder sb = new StringBuilder("AnimatorLancet:::");
        sb.append(Log.getStackTraceString((Throwable)new Exception()));
        err.println(sb.toString());
        set.removeAllListeners();
    }
    
    public final void LIZ() {
        final AnimatorSet lizj = this.LIZ.LIZJ;
        if (lizj != null && lizj.isRunning()) {
            final AnimatorSet lizj2 = this.LIZ.LIZJ;
            if (lizj2 != null) {
                LIZ(lizj2);
            }
            final AnimatorSet lizj3 = this.LIZ.LIZJ;
            if (lizj3 != null) {
                lizj3.end();
            }
        }
    }
}
