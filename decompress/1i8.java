// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1i8 extends 1Fb
{
    public final /* synthetic */ 1GK LIZ;
    
    static {
        Covode.recordClassIndex(5275);
    }
    
    public 1i8(final 1GK liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final int n, final int n2) {
        final 1GK liz = this.LIZ;
        final 0XM cmd_DRAG_ONGOING = 0XM.CMD_DRAG_ONGOING;
        cmd_DRAG_ONGOING.setParam(new 0X7(false, n, n2));
        liz.LIZ(cmd_DRAG_ONGOING);
    }
    
    @Override
    public final void LIZJ() {
        Gkn.LJFF.LIZ("livesdk_floating_ball_drag").LIZLLL();
        this.LIZ.LIZ(0XM.CMD_DRAG_MOVE_START);
    }
    
    @Override
    public final void LIZLLL() {
        final 1GK liz = this.LIZ;
        final 0XM cmd_DRAG_MOVE_END = 0XM.CMD_DRAG_MOVE_END;
        cmd_DRAG_MOVE_END.setParam(new 0X7(false, 0, 0));
        liz.LIZ(cmd_DRAG_MOVE_END);
    }
}
