// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;

public final class 2Bi extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ 1iD LIZIZ;
    public final /* synthetic */ 0al LIZJ;
    
    static {
        Covode.recordClassIndex(5564);
    }
    
    public 2Bi(final 1iD liziz, final 0al lizj, final Cye cye) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Bi(this.LIZIZ, this.LIZJ, cye);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object o) {
        final F1i coroutine_SUSPENDED = F1i.COROUTINE_SUSPENDED;
        final int liz = this.LIZ;
        if (liz != 0) {
            if (liz != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F1j.LIZ(o);
        }
        else {
            F1j.LIZ(o);
            final 0ai ljiiiz = this.LIZJ.LJIIIZ;
            Label_0109: {
                if (ljiiiz != null) {
                    final Long lizj = ljiiiz.LIZJ;
                    if (lizj != null && lizj == 1L) {
                        final 1iD liziz = this.LIZIZ;
                        final 0ai ljiiiz2 = this.LIZJ.LJIIIZ;
                        final long n = 0L;
                        while (true) {
                            Label_0253: {
                                if (ljiiiz2 == null) {
                                    break Label_0253;
                                }
                                final Long liz2 = ljiiiz2.LIZ;
                                if (liz2 == null) {
                                    break Label_0253;
                                }
                                final long longValue = liz2;
                                final 0ai ljiiiz3 = this.LIZJ.LJIIIZ;
                                long longValue2 = n;
                                if (ljiiiz3 != null) {
                                    final Long liziz2 = ljiiiz3.LIZIZ;
                                    longValue2 = n;
                                    if (liziz2 != null) {
                                        longValue2 = liziz2;
                                    }
                                }
                                F0v.LIZ((BFk)Cc0.LIZ, (F2r)EiD.LIZIZ, (SRT)new 2Bc(liziz, longValue, longValue2, null), 2);
                                break Label_0109;
                            }
                            final long longValue = 0L;
                            continue;
                        }
                    }
                }
                this.LIZIZ.LIZJ(0ap.ServerDetectionFailure.getCode(), 0ap.ServerDetectionFailure.getMessage());
            }
            final long lizlll = this.LIZIZ.LIZLLL;
            this.LIZ = 1;
            if (EVu.LIZ(lizlll, (Cye)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        this.LIZIZ.LIZJ(0ao.DisconnectTypeNormalExit.getCode(), 0ao.DisconnectTypeNormalExit.getMessage());
        this.LIZIZ.LIZIZ(0ao.DisconnectTypeNormalExit.getCode(), 0ao.DisconnectTypeNormalExit.getMessage());
        return 2P9.LIZ;
    }
}
