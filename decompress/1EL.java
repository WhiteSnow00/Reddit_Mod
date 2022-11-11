// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.os.Handler;

public abstract class 1eL<T extends 106> extends 0zr<T>
{
    public final Handler LJIIIZ;
    public final SRS<1eL<T>, 2P9> LJIIJ;
    
    static {
        Covode.recordClassIndex(10649);
    }
    
    public 1eL(final Handler ljiiiz, final SRS<? super 1eL<T>, 2P9> ljiij) {
        CTM.LIZ((Object)ljiiiz);
        this.LJIIIZ = ljiiiz;
        this.LJIIJ = (SRS<1eL<T>, 2P9>)ljiij;
    }
    
    public abstract void LJ();
    
    public abstract void LJI();
}
