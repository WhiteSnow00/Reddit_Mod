// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public final class 1U0 implements 0qq
{
    public final 0qr LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    
    static {
        Covode.recordClassIndex(8485);
    }
    
    public 1U0(final 0qr liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    private final void LIZ(final boolean b) {
        synchronized (this) {
            MethodCollector.i(8983);
            ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "initRtc enter");
            if (this.LIZIZ && !this.LIZJ) {
                ((0bf)Fjw.LIZIZ()).LIZJ("Guest_PreInitStrategy", "initRtc is already init");
                MethodCollector.o(8983);
                return;
            }
            this.LIZ.LIZ(b);
            this.LIZIZ = true;
            this.LIZJ = false;
            ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "initRtc exit");
            MethodCollector.o(8983);
        }
    }
    
    private final void LJII() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "disposeRtc");
        this.LIZ.LJIIJ();
        this.LIZIZ = false;
        this.LIZJ = true;
    }
    
    private final void LJIIIIZZ() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "joinRtc enter");
        if (!this.LIZIZ || this.LIZJ) {
            ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "joinRtc not init, wait...");
            this.LIZ(true);
        }
        this.LIZ.LJIIIZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "joinRtc exit");
    }
    
    @Override
    public final void LIZ() {
        this.LIZ.LJIIIIZZ();
        this.LJIIIIZZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "onReceivePermitMsg");
    }
    
    @Override
    public final void LIZIZ() {
        this.LJIIIIZZ();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "onAcceptInvite");
    }
    
    @Override
    public final void LIZJ() {
        this.LJII();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "onRefuseInvite");
    }
    
    @Override
    public final void LIZLLL() {
        this.LJII();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "dispose");
    }
    
    @Override
    public final void LJ() {
        this.LIZ(false);
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "onApplySucceed");
    }
    
    @Override
    public final void LJFF() {
        this.LJII();
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "onCancelApply");
    }
    
    @Override
    public final void LJI() {
        ((0bf)Fjw.LIZIZ()).LIZ("Guest_PreInitStrategy", "onReceiveInviteMsg");
    }
}
