// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;

public final class 0n9
{
    public static 1Qk LIZ;
    public static 1Qk LIZIZ;
    public static BattleResult LIZJ;
    public static BattleResult LIZLLL;
    public static BattleTeamResult LJ;
    public static BattleTeamResult LJFF;
    public static long LJI;
    public static boolean LJII;
    public static final 0n9 LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(7783);
        LJIIIIZZ = new 0n9();
        0n9.LIZ = new 1Qk("data_battle_state");
        0n9.LIZIZ = new 1Qk("data_battle_rematch_state");
    }
    
    public static final boolean LIZIZ() {
        final 0nC lizj = 0n9.LIZ.LIZJ();
        return 0nC.START.compareTo(lizj) <= 0 && lizj.compareTo(0nC.END) < 0;
    }
    
    public final void LIZ() {
        if (0n9.LIZIZ.LJI()) {
            0n9.LIZ.LIZ(false, "replace_data_with_rematch");
            0n9.LIZ.LIZJ = 0n9.LIZIZ.LIZJ;
            0n9.LIZ.LJIILL = 0n9.LIZIZ.LJIILL;
            0n9.LIZ.LIZ(0n9.LIZIZ.LJ());
            0n9.LIZ.LIZ(0n9.LIZIZ.LIZIZ);
            0n9.LIZ.LIZ(0n9.LIZIZ.LIZJ(), true);
            0n9.LIZ.LIZLLL = 0n9.LIZIZ.LIZLLL;
            0n9.LIZ.LJJIIZI = 0n9.LIZIZ.LJJIIZI;
            0n9.LIZ.LJJII = 0n9.LIZIZ.LJJII;
        }
        0n9.LIZIZ.LIZIZ(true, "replace_data");
    }
    
    public final void LIZ(final String s, final int n) {
        CTM.LIZ((Object)s);
        final DataChannel ll = 1NN.LLFF.LIZ().LL;
        if (ll != null) {
            ll.LIZJ((Class)2GK.class, (Object)n);
        }
        if (n == 1) {
            0n9.LIZ.LIZIZ(false, s);
            return;
        }
        if (n != 2) {
            0n9.LIZ.LIZIZ(false, s);
            0n9.LIZIZ.LIZIZ(true, s);
            return;
        }
        0n9.LIZIZ.LIZIZ(true, s);
    }
    
    public final void LIZ(final boolean b) {
        0n9.LIZ.LIZLLL = b;
        0n9.LIZIZ.LIZLLL = b;
    }
    
    public final String LIZJ() {
        if (this.LIZLLL()) {
            return "draw";
        }
        return "not_draw";
    }
    
    public final boolean LIZLLL() {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        Object value = null;
        Long value2;
        if (room != null) {
            value2 = room.getOwnerUserId();
        }
        else {
            value2 = null;
        }
        final long ljff = 1NN.LLFF.LIZ().LJFF;
        final BattleResult lizj = 0n9.LIZJ;
        if (lizj != null) {
            value = lizj.LIZ;
        }
        if (n.LIZ(value, (Object)value2)) {
            final BattleResult lizlll = 0n9.LIZLLL;
            if (lizlll != null && lizlll.LIZ == ljff) {
                final BattleResult lizj2 = 0n9.LIZJ;
                if (lizj2 != null && lizj2.LIZIZ == 2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean LJ() {
        return 0n9.LIZ.LIZJ() == 0nC.INVITED || 0n9.LIZIZ.LIZJ() == 0nC.INVITED;
    }
}
