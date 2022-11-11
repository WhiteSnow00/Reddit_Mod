// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;

public final class 110 implements Runnable
{
    public final /* synthetic */ 10r LIZ;
    public final /* synthetic */ GiftCollectionUpdateMessage LIZIZ;
    
    static {
        Covode.recordClassIndex(10779);
    }
    
    public 110(final 10r liz, final GiftCollectionUpdateMessage liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        this.LIZ.LJIJI.LIZ((H31)this.LIZIZ, true);
    }
}
