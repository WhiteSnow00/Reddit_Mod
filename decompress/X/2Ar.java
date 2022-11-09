// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.CancellationException;
import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;

public final class 2Ar extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ LifecycleCoroutineScopeImpl LIZIZ;
    public BFk LIZJ;
    
    static {
        Covode.recordClassIndex(1200);
    }
    
    public 2Ar(final LifecycleCoroutineScopeImpl liziz, final Cye cye) {
        this.LIZIZ = liziz;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        final 2Ar 2Ar = new 2Ar(this.LIZIZ, cye);
        2Ar.LIZJ = (BFk)o;
        return (Cye<2P9>)2Ar;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object o) {
        if (this.LIZ == 0) {
            F1j.LIZ(o);
            final BFk lizj = this.LIZJ;
            if (this.LIZIZ.LIZ.LIZ().compareTo(0CC.b.INITIALIZED) >= 0) {
                this.LIZIZ.LIZ.LIZ(this.LIZIZ);
            }
            else {
                F0y.LIZ(lizj.getCoroutineContext(), (CancellationException)null);
            }
            return 2P9.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
