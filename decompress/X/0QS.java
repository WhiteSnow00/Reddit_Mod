// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.covode.number.Covode;

public final class 0qs
{
    public 0qq LIZ;
    public final 0qr LIZIZ;
    
    static {
        Covode.recordClassIndex(8484);
    }
    
    public 0qs(final 0qr liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        0qq liz;
        if (LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue()) {
            liz = new 1U0(liziz);
        }
        else {
            liz = new 1Tz(liziz);
        }
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        this.LIZ.LJI();
    }
    
    public final void LIZIZ() {
        this.LIZ.LIZLLL();
    }
}
