// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.os.CountDownTimer;

public final class 0iv
{
    public static final 5DO LIZ;
    public static CountDownTimer LIZIZ;
    public static boolean LIZJ;
    public static DataChannel LIZLLL;
    public static final 0iv LJ;
    
    static {
        Covode.recordClassIndex(6805);
        LJ = new 0iv();
        LIZ = 3Os.LIZ((QgG)1uG.LIZ);
    }
    
    public final void LIZ() {
        if (!0iv.LIZJ) {
            return;
        }
        final CountDownTimer liziz = 0iv.LIZIZ;
        if (liziz != null) {
            liziz.cancel();
        }
        0iv.LIZJ = false;
    }
}
