// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;

public final class 2At extends F5e implements SRT<BFk, Cye<?>, Object>
{
    public Object LIZ;
    public int LIZIZ;
    public final /* synthetic */ 0CC LIZJ;
    public final /* synthetic */ 0CC.b LIZLLL;
    public final /* synthetic */ SRT LJ;
    public BFk LJFF;
    
    static {
        Covode.recordClassIndex(1223);
    }
    
    public 2At(final 0CC lizj, final 0CC.b lizlll, final SRT lj, final Cye cye) {
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        final 2At 2At = new 2At(this.LIZJ, this.LIZLLL, this.LJ, cye);
        2At.LJFF = (BFk)o;
        return (Cye<2P9>)2At;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(Object o) {
        final F1i coroutine_SUSPENDED = F1i.COROUTINE_SUSPENDED;
        final int liziz = this.LIZIZ;
        Throwable t = null;
        Label_0044: {
            if (liziz == 0) {
                break Label_0044;
            }
            Label_0034: {
                if (liziz != 1) {
                    break Label_0034;
                }
                Object o2 = this.LIZ;
                try {
                    F1j.LIZ(o);
                    while (true) {
                        Label_0145: {
                            break Label_0145;
                            o2 = new 2As();
                            final F2K f2K;
                            final 0CD liz = new 0CD(this.LIZJ, this.LIZLLL, ((2As)o2).LIZ, f2K);
                            try {
                                final SRT lj = this.LJ;
                                this.LIZ = liz;
                                this.LIZIZ = 1;
                                final Object liz2 = F0x.LIZ((F2r)o2, lj, (Cye)this);
                                o2 = liz;
                                o = liz2;
                                if (liz2 == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                ((0CD)o2).LIZ();
                                return o;
                            }
                            finally {}
                        }
                        F1j.LIZ(o);
                        final F2K f2K = (F2K)this.LJFF.getCoroutineContext().get((F3H)F2K.LIZIZ);
                        iftrue(Label_0175:)(f2K == null);
                        continue;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    o = o2;
                    final Throwable t2;
                    t = t2;
                }
            }
        }
        ((0CD)o).LIZ();
        throw t;
        Label_0175: {
            throw new IllegalStateException("when[State] methods should have a parent job".toString());
        }
    }
}
