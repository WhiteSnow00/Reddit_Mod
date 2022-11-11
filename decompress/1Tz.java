// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public final class 1Tz implements 0qq
{
    public final 0qr LIZ;
    public volatile boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(8483);
    }
    
    public 1Tz(final 0qr liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    private final void LJII() {
        synchronized (this) {
            MethodCollector.i(9299);
            ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "initRtc enter");
            if (this.LIZIZ) {
                MethodCollector.o(9299);
                return;
            }
            this.LIZIZ = true;
            this.LIZ.LIZ(true);
            ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "initRtc exit");
            MethodCollector.o(9299);
        }
    }
    
    private final void LJIIIIZZ() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "joinRtc enter");
        if (!this.LIZIZ) {
            ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "joinRtc not init, wait...");
            this.LJII();
        }
        this.LIZ.LJIIIZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "joinRtc exit");
    }
    
    private final void LJIIIZ() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "disposeRtc");
        this.LIZ.LJIIJ();
        this.LIZIZ = false;
    }
    
    @Override
    public final void LIZ() {
        this.LJIIIIZZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "onReceivePermitMsg");
    }
    
    @Override
    public final void LIZIZ() {
        this.LJIIIIZZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "onAcceptInvite");
    }
    
    @Override
    public final void LIZJ() {
        this.LJIIIZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "onRefuseInvite");
    }
    
    @Override
    public final void LIZLLL() {
        this.LJIIIZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "dispose");
    }
    
    @Override
    public final void LJ() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "onApplySucceed");
    }
    
    @Override
    public final void LJFF() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "onCancelApply");
    }
    
    @Override
    public final void LJI() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_NormalInitStrategy", "onReceiveInviteMsg");
    }
}
