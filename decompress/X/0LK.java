// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.RandomLinkMicSetting$DisconnectJudge;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import java.util.List;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0lK
{
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    
    static {
        Covode.recordClassIndex(7355);
        0lK.LIZ = 30;
        0lK.LIZIZ = 100;
        0lK.LIZJ = 10;
        0lK.LIZLLL = 10;
    }
    
    public static final boolean LIZ() {
        return 1O2.LJFF() && System.currentTimeMillis() / 1000L - 1O2.LJIIJJI < 0lK.LIZIZ;
    }
    
    public static final boolean LIZIZ() {
        LJ();
        return LIZLLL() > 0L;
    }
    
    public static final void LIZJ() {
        if (LIZ()) {
            final int lizj = 0lK.LIZJ;
            final 44V ljljlll = GST.LJLJLLL;
            n.LIZIZ((Object)ljljlll, "");
            final 5U2 5u2 = new 5U2(Integer.valueOf(lizj), (List)((44T)ljljlll).LIZ());
            5u2.LIZ((Object)(System.currentTimeMillis() / 1000.0));
            while (!5u2.LJ()) {
                final double n = (double)(System.currentTimeMillis() / 1000L);
                final Object lizj2 = 5u2.LIZJ();
                kotlin.jvm.internal.n.LIZIZ(lizj2, "");
                if ((n - ((Number)lizj2).doubleValue()) / 60.0 <= 0lK.LIZLLL) {
                    break;
                }
                5u2.LIZ();
            }
            final 44V ljljlll2 = GST.LJLJLLL;
            n.LIZIZ((Object)ljljlll2, "");
            ((44T)ljljlll2).LIZ((Object)5u2.LIZ);
            if (LIZIZ()) {
                0xg.LIZIZ();
            }
        }
    }
    
    public static final long LIZLLL() {
        final int lizj = 0lK.LIZJ;
        final 44V ljljlll = GST.LJLJLLL;
        n.LIZIZ((Object)ljljlll, "");
        final 5U2 5u2 = new 5U2(Integer.valueOf(lizj), (List)((44T)ljljlll).LIZ());
        final int lizlll = 5u2.LIZLLL();
        final int lizj2 = 0lK.LIZJ;
        long n = 0L;
        if (lizlll < lizj2) {
            return 0L;
        }
        final Double n2 = (Double)5u2.LIZIZ();
        if (n2 != null) {
            n = (long)(double)n2;
        }
        return n + 0lK.LIZ * 60 - System.currentTimeMillis() / 1000L;
    }
    
    public static final void LJ() {
        final RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        final Integer n = null;
        Integer value2;
        if (value != null) {
            value2 = value.banTime;
        }
        else {
            value2 = null;
        }
        0lK.LIZ = value2;
        final RandomLinkMicSetting value3 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        Integer value4 = n;
        if (value3 != null) {
            value4 = value3.disconnectTime;
        }
        0lK.LIZIZ = value4;
        final RandomLinkMicSetting value5 = LiveRandomLinkmicSetting.INSTANCE.getValue();
        final int n2 = 10;
        while (true) {
            Label_0128: {
                if (value5 == null) {
                    break Label_0128;
                }
                final RandomLinkMicSetting$DisconnectJudge disconnectJudge = value5.disconnectJudge;
                if (disconnectJudge == null) {
                    break Label_0128;
                }
                final int frequency = disconnectJudge.frequency;
                0lK.LIZJ = frequency;
                final RandomLinkMicSetting value6 = LiveRandomLinkmicSetting.INSTANCE.getValue();
                int period = n2;
                if (value6 != null) {
                    final RandomLinkMicSetting$DisconnectJudge disconnectJudge2 = value6.disconnectJudge;
                    period = n2;
                    if (disconnectJudge2 != null) {
                        period = disconnectJudge2.period;
                    }
                }
                0lK.LIZLLL = period;
                return;
            }
            final int frequency = 10;
            continue;
        }
    }
}
