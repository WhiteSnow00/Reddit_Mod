// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;

public final class 2Bm extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ 0bz LIZJ;
    public final /* synthetic */ IAA LIZLLL;
    public final /* synthetic */ ImageModel LJ;
    public final /* synthetic */ ImageView LJFF;
    
    static {
        Covode.recordClassIndex(5763);
    }
    
    public 2Bm(final int liziz, final 0bz lizj, final IAA lizlll, final ImageModel lj, final ImageView ljff, final Cye cye) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Bm(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, cye);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(Object liz) {
        final F1i coroutine_SUSPENDED = F1i.COROUTINE_SUSPENDED;
        final int liz2 = this.LIZ;
        Label_0076: {
            if (liz2 != 0) {
                if (liz2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                F1j.LIZ(liz);
            }
            else {
                F1j.LIZ(liz);
                final int liziz = this.LIZIZ;
                if (liziz <= 0) {
                    break Label_0076;
                }
                this.LIZ = 1;
                if ((liz = GTi.LIZ(liziz, (Cye)this)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            if (liz == null) {
                return 2P9.LIZ;
            }
        }
        if (this.LIZLLL != null) {
            this.LIZJ.LIZIZ = (KFw)new 0ch.b(this.LJ, this.LIZLLL);
        }
        this.LIZJ.LIZ((View)this.LJFF);
        return 2P9.LIZ;
    }
}
