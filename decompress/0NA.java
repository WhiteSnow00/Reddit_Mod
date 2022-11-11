// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleInviteEachOtherSetting;
import com.bytedance.covode.number.Covode;

public final class 0nA
{
    public static volatile int LIZ;
    public static volatile int LIZIZ;
    public static volatile int LIZJ;
    public static final 0nA LIZLLL;
    
    static {
        Covode.recordClassIndex(7785);
        LIZLLL = new 0nA();
        0nA.LIZ = -1;
        0nA.LIZJ = -1;
    }
    
    private final boolean LIZJ() {
        final 1Qk liz = 0n9.LIZ;
        return liz.LIZLLL && liz.LIZJ().compareTo(0nC.RECEIVED) <= 0 && 0nA.LIZIZ == 0;
    }
    
    private final boolean LIZLLL() {
        final 1Qk liziz = 0n9.LIZIZ;
        return liziz.LIZLLL && liziz.LIZJ().compareTo(0nC.RECEIVED) <= 0 && 0nA.LIZIZ == 1;
    }
    
    private final boolean LJ() {
        return this.LIZJ() || this.LIZLLL();
    }
    
    public final void LIZ() {
        0nA.LIZ = -1;
        0nA.LIZIZ = 0;
        0nA.LIZJ = -1;
    }
    
    public final boolean LIZIZ() {
        if (!LiveBattleInviteEachOtherSetting.INSTANCE.getValue()) {
            return false;
        }
        0nB 0nB;
        if (this.LJ() && 0nA.LIZ == 0 && 0nA.LIZJ == 0) {
            0nB = X.0nB.NORMAL_SEND_NORMAL_RECEIVE;
        }
        else if (this.LJ() && 0nA.LIZ == 1 && 0nA.LIZJ == 0) {
            0nB = X.0nB.NORMAL_SUCCESS_NORMAL_RECEIVE;
        }
        else if (this.LJ() && 0nA.LIZ == -1 && 0nA.LIZJ == 0) {
            0nB = X.0nB.NORMAL_NONE_NORMAL_RECEIVE;
        }
        else if (this.LJ() && 0nA.LIZ == 0 && 0nA.LIZJ == 1) {
            0nB = X.0nB.REMATCH_SEND_REMATCH_RECEIVE;
        }
        else if (this.LJ() && 0nA.LIZ == 1 && 0nA.LIZJ == 1) {
            0nB = X.0nB.REMATCH_SUCCESS_REMATCH_RECEIVE;
        }
        else if (this.LJ() && 0nA.LIZ == -1 && 0nA.LIZJ == 1) {
            0nB = X.0nB.REMATCH_NONE_REMATCH_RECEIVE;
        }
        else {
            0nB = X.0nB.NONE;
        }
        return 0nB == X.0nB.NORMAL_SEND_NORMAL_RECEIVE || 0nB == X.0nB.NORMAL_SUCCESS_NORMAL_RECEIVE || 0nB == X.0nB.REMATCH_SEND_REMATCH_RECEIVE || 0nB == X.0nB.REMATCH_SUCCESS_REMATCH_RECEIVE;
    }
}
