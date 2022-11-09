// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0In implements Runnable
{
    public final /* synthetic */ 0Ir.a LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ List LIZJ;
    public final /* synthetic */ List LIZLLL;
    public final /* synthetic */ 0Ir LJ;
    
    static {
        Covode.recordClassIndex(2157);
    }
    
    public 0In(final 0Ir lj, final 0Ir.a liz, final int liziz, final List lizj, final List lizlll) {
        this.LJ = lj;
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final void run() {
        final 0FM.d liz = 0FM.LIZ((0FM.a)this.LIZ, true);
        final 0Ir lj = this.LJ;
        final int liziz = this.LIZIZ;
        final List lizj = this.LIZJ;
        lj.LIZ(liziz, lizj, new 0Ix(this.LIZLLL, lizj, liz));
    }
}
