// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;

public final class 2Au extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ 15r LIZIZ;
    public final /* synthetic */ SRT LIZJ;
    
    static {
        Covode.recordClassIndex(1273);
    }
    
    public 2Au(final 15r liziz, final SRT lizj, final Cye cye) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Au(this.LIZIZ, this.LIZJ, cye);
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
            final 0CC liz2 = this.LIZIZ.LIZ();
            final SRT lizj = this.LIZJ;
            this.LIZ = 1;
            if (F0x.LIZ((F2r)EiD.LIZIZ.LIZ(), (SRT)new 2At(liz2, 0CC.b.RESUMED, lizj, null), (Cye)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return 2P9.LIZ;
    }
}
