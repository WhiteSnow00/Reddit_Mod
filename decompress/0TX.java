// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.view.View$OnClickListener;

public final class 0tx implements View$OnClickListener
{
    public final /* synthetic */ 1mL LIZ;
    public final /* synthetic */ LinkPlayerInfo LIZIZ;
    
    static {
        Covode.recordClassIndex(9414);
    }
    
    public 0tx(final 1mL liz, final LinkPlayerInfo liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        0uW.LIZJ.LIZLLL("anchor", "go_live_panel");
        final 0tq ljff = this.LIZ.LJFF;
        if (ljff != null) {
            final User lizj = this.LIZIZ.LIZJ;
            n.LIZIZ((Object)lizj, "");
            ljff.LIZ(lizj);
        }
    }
}
