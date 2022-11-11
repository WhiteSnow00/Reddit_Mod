// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.PrintStream;
import android.util.Log;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;

public final class 1wh extends F5g implements QgG<2P9>
{
    public final /* synthetic */ 0mM LIZ;
    
    static {
        Covode.recordClassIndex(7545);
    }
    
    public 1wh(final 0mM liz) {
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
        final AnimatorSet liz = this.LIZ.LIZ;
        if (liz != null && liz.isRunning()) {
            final AnimatorSet liz2 = this.LIZ.LIZ;
            if (liz2 != null) {
                LIZ(liz2);
            }
            final AnimatorSet liz3 = this.LIZ.LIZ;
            if (liz3 != null) {
                liz3.end();
            }
            this.LIZ.LIZ = null;
        }
    }
}
