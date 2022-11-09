// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveFixCheckPluginErrorSetting;
import com.bytedance.covode.number.Covode;

public final class 1Vv implements GZi
{
    public final /* synthetic */ 21m LIZ;
    
    static {
        Covode.recordClassIndex(8839);
    }
    
    public 1Vv(final 21m liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final Activity liz = this.LIZ.LIZ.LIZ;
        final int liziz = this.LIZ.LIZIZ;
        final SRS lizj = this.LIZ.LIZ.LIZJ;
        GXS gxs;
        if (LiveFixCheckPluginErrorSetting.INSTANCE.getValue()) {
            gxs = GXS.Camera;
        }
        else {
            gxs = GXS.LiveResource;
        }
        if (gxs.isInstalled()) {
            0jR.LIZ(IBroadcastService.class).init();
            lizj.invoke((Object)liziz);
            return;
        }
        gxs.checkInstall((Context)liz, "interact", (GZi)new 1W3(lizj, liziz));
    }
}
