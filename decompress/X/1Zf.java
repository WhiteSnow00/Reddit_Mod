// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect.MultiGuestEffectSwitchFragment;

public final class 1Zf implements SRr
{
    public final /* synthetic */ MultiGuestEffectSwitchFragment LIZ;
    
    static {
        Covode.recordClassIndex(9685);
    }
    
    public 1Zf(final MultiGuestEffectSwitchFragment liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ(final int n, final int n2) {
        if (n == 8 || n == 4) {
            if (n2 == 0) {
                final MultiGuestEffectSwitchFragment.c ljff = this.LIZ.LJFF;
                if (ljff != null) {
                    ljff.LIZ();
                }
            }
        }
        else if (n == 0 && (n2 == 8 || n2 == 4)) {
            final MultiGuestEffectSwitchFragment.c ljff2 = this.LIZ.LJFF;
            if (ljff2 != null) {
                ljff2.LIZIZ();
            }
        }
    }
}
