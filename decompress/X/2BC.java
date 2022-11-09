// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;

public final class 2Bc extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ 1iD LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ long LIZLLL;
    
    static {
        Covode.recordClassIndex(5558);
    }
    
    public 2Bc(final 1iD liziz, final long lizj, final long lizlll, final Cye cye) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Bc(this.LIZIZ, this.LIZJ, this.LIZLLL, cye);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object o) {
        if (this.LIZ == 0) {
            F1j.LIZ(o);
            final 0ar ljii = this.LIZIZ.LJII;
            if (ljii != null) {
                ljii.LIZ(this.LIZJ, this.LIZLLL);
            }
            this.LIZIZ.LJII = null;
            return 2P9.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
