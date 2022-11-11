// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.view.View$OnClickListener;

public final class 0tw implements View$OnClickListener
{
    public final /* synthetic */ 1mL LIZ;
    public final /* synthetic */ LinkPlayerInfo LIZIZ;
    
    static {
        Covode.recordClassIndex(9413);
    }
    
    public 0tw(final 1mL liz, final LinkPlayerInfo liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        final 0tq ljff = this.LIZ.LJFF;
        if (ljff != null) {
            final User lizj = this.LIZIZ.LIZJ;
            n.LIZIZ((Object)lizj, "");
            final FollowInfo followInfo = lizj.getFollowInfo();
            n.LIZIZ((Object)followInfo, "");
            boolean b = false;
            Label_0071: {
                if (followInfo.getFollowStatus() != 1L) {
                    final FollowInfo followInfo2 = lizj.getFollowInfo();
                    n.LIZIZ((Object)followInfo2, "");
                    if (followInfo2.getFollowStatus() != 2L) {
                        b = false;
                        break Label_0071;
                    }
                }
                b = true;
            }
            ljff.LIZ(b, this.LIZIZ);
        }
    }
}
