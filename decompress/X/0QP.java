// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0qp
{
    public static final 0qp LIZ;
    public static long LIZIZ;
    
    static {
        Covode.recordClassIndex(8479);
        LIZ = new 0qp();
    }
    
    public final void LIZ() {
        final String string = 0cB.LJ().getString(2131831268);
        n.LIZIZ((Object)string, "");
        this.LIZ(string);
    }
    
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        Hf4.LIZ(0cB.LJ(), s, 0L);
        0qp.LIZIZ = System.nanoTime() / 1000000L;
    }
    
    public final void LIZIZ() {
        final String string = 0cB.LJ().getString(2131830196);
        n.LIZIZ((Object)string, "");
        CTM.LIZ((Object)string);
        final long n = System.nanoTime() / 1000000L;
        final long liziz = 0qp.LIZIZ;
        final long n2 = n - liziz;
        if (liziz == 0L || n2 >= 2000L) {
            Hf4.LIZ(0cB.LJ(), string, 0L);
        }
        else {
            new Handler(Looper.getMainLooper()).postDelayed((Runnable)new 0qo(string), n2);
        }
        0qp.LIZIZ = 0L;
    }
}
