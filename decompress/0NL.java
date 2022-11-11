// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0nL implements Runnable
{
    public final /* synthetic */ 1RW LIZ;
    
    static {
        Covode.recordClassIndex(7869);
    }
    
    public 0nL(final 1RW liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        if (this.LIZ.LIZJ == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("im_message_eggtask_reward_settle  [delay] , left_time = ");
        sb.append(this.LIZ.LJII);
        sb.append(' ');
        0ba.LIZ(4, "BattleTaskPresenterTag", sb.toString());
        final 1RW liz = this.LIZ;
        liz.LJJI = liz.LJII;
        if (this.LIZ.LJIIIIZZ != 0nE.DISABLED && this.LIZ.LJIIIIZZ != 0nE.BONUS_FINISHED) {
            final 1RW liz2 = this.LIZ;
            liz2.LIZ(liz2.LJII, 0nE.BONUS_FINISHED);
        }
    }
}
