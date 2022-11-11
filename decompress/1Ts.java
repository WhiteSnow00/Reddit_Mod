// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;

public final class 1Ts implements b
{
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ LinkPlayerInfo LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ FH6 LIZLLL;
    public final /* synthetic */ 1XD LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ 1Uo LJI;
    
    static {
        Covode.recordClassIndex(8468);
    }
    
    public 1Ts(final Context liz, final LinkPlayerInfo liziz, final boolean lizj, final FH6 lizlll, final 1XD lj, final int ljff, final 1Uo lji) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
        this.LJI = lji;
    }
    
    @Override
    public final void LIZ(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        dialogInterface.dismiss();
        0ql.LIZ.LIZ(this.LIZ, this.LIZIZ, 3, this.LIZJ, this.LIZLLL);
        final 0uW lizj = 0uW.LIZJ;
        final 1XD lj = this.LJ;
        String liz = null;
        Label_0079: {
            if (lj != null) {
                final LinkPlayerInfo liziz = this.LIZIZ;
                while (true) {
                    Label_0109: {
                        if (liziz == null) {
                            break Label_0109;
                        }
                        final User lizj2 = liziz.LIZJ;
                        if (lizj2 == null) {
                            break Label_0109;
                        }
                        final long id = lizj2.getId();
                        liz = lj.LIZ(id);
                        break Label_0079;
                    }
                    final long id = 0L;
                    continue;
                }
            }
            liz = null;
        }
        lizj.LIZ(liz, this.LJFF, 0ql.LIZ.LIZ(this.LIZIZ, this.LJI), 0uW.LIZIZ, "click", true);
    }
}
