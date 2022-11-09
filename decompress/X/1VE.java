// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public final class 1Ve implements 0s7
{
    public LiveWidget LIZ;
    
    static {
        Covode.recordClassIndex(8799);
    }
    
    public 1Ve(final LiveWidget liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    @Override
    public final boolean LIZ() {
        final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostApp.class);
        n.LIZIZ((Object)liz, "");
        final Activity topActivity = ((IHostApp)liz).getTopActivity();
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        if (!liziz.LJ()) {
            final GIK liziz2 = Fk2.LIZ().LIZIZ();
            final GGR liz2 = GGS.LIZ();
            liz2.LIZ = 0cB.LIZ(2131835907);
            liz2.LIZLLL = "interact";
            liz2.LIZJ = 0;
            liziz2.LIZ((Context)topActivity, liz2.LIZ()).LIZ((FCD)this.LIZ.getAutoUnbindTransformer()).LIZ((Cx6)new Fww());
            return true;
        }
        return false;
    }
}
