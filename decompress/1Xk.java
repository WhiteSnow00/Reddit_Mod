// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.n;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.design.app.LiveDialog;

public final class 1Xk implements b
{
    public final /* synthetic */ 23j LIZ;
    public final /* synthetic */ GG0 LIZIZ;
    
    static {
        Covode.recordClassIndex(9111);
    }
    
    public 1Xk(final 23j liz, final GG0 liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void LIZ(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        dialogInterface.dismiss();
        final DataChannel ljjijl = this.LIZ.LJJIJL;
        if (ljjijl != null) {
            ljjijl.LIZJ((Class)2ER.class);
        }
        final Room lizj = this.LIZ.LIZJ;
        final User liz = this.LIZIZ.LIZ;
        n.LIZIZ((Object)liz, "");
        0xy.LIZ(lizj, liz.getId(), "click", "cancel");
    }
}
