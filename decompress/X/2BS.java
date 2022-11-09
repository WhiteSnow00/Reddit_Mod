// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;

public final class 2BS extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    
    static {
        Covode.recordClassIndex(5360);
    }
    
    public 2BS(final Cye cye) {
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2BS(cye);
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
            this.LIZ = 1;
            if (EVu.LIZ(2000L, (Cye)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131829922), 0L);
        final 44V ljjjj = GST.LJJJJ;
        n.LIZIZ((Object)ljjjj, "");
        ((44T)ljjjj).LIZ((Object)true);
        return 2P9.LIZ;
    }
}
