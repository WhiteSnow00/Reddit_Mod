// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;

public final class 0lQ implements Runnable
{
    public final /* synthetic */ 10r LIZ;
    public final /* synthetic */ LinkMicAnchorGuideMessage LIZIZ;
    
    static {
        Covode.recordClassIndex(7366);
    }
    
    public 0lQ(final 10r liz, final LinkMicAnchorGuideMessage liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        this.LIZ.LJIJI.LIZ((H31)this.LIZIZ, true);
    }
}
