// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1i7 extends 1Fb
{
    public final /* synthetic */ 1GK LIZ;
    
    static {
        Covode.recordClassIndex(5271);
    }
    
    public 1i7(final 1GK liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_floating_window_status");
        liz.LIZ("isOpen", "1");
        liz.LIZLLL();
    }
    
    @Override
    public final void LIZ(final int n, final int n2) {
        final 1GK liz = this.LIZ;
        final 0XM cmd_DRAG_ONGOING = 0XM.CMD_DRAG_ONGOING;
        cmd_DRAG_ONGOING.setParam(new 0X7(true, n, n2));
        liz.LIZ(cmd_DRAG_ONGOING);
    }
    
    @Override
    public final void LIZIZ() {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_floating_window_status");
        liz.LIZ("isOpen", "0");
        liz.LIZLLL();
    }
    
    @Override
    public final void LIZJ() {
        this.LIZ.LIZ(0XM.CMD_DRAG_MOVE_START);
        Gkn.LJFF.LIZ("livesdk_floating_ball_drag").LIZLLL();
    }
    
    @Override
    public final void LIZLLL() {
        final 1GK liz = this.LIZ;
        final 0XM cmd_DRAG_MOVE_END = 0XM.CMD_DRAG_MOVE_END;
        cmd_DRAG_MOVE_END.setParam(new 0X7(true, 0, 0));
        liz.LIZ(cmd_DRAG_MOVE_END);
    }
    
    @Override
    public final void LJ() {
        this.LIZ.LIZ(0XM.CMD_CLICK_FLOAT_BALL);
    }
}
