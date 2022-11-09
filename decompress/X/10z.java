// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;

public final class 10z implements Runnable
{
    public final /* synthetic */ 10r LIZ;
    public final /* synthetic */ CapsuleMessage LIZIZ;
    
    static {
        Covode.recordClassIndex(10776);
    }
    
    public 10z(final 10r liz, final CapsuleMessage liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        this.LIZ.LJIJI.LIZ((H31)this.LIZIZ, true);
    }
}
