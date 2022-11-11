// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.R;

public final class 1dU implements 2nz<R>
{
    public final /* synthetic */ E5m LIZ;
    
    static {
        Covode.recordClassIndex(10429);
    }
    
    public 1dU(final E5m liz) {
        this.LIZ = liz;
    }
    
    public final void onFailure(final 7CD<R> 7cd, final Throwable t) {
        CTM.LIZ((Object)7cd, (Object)t);
        this.LIZ.LIZ(t);
    }
    
    public final void onResponse(final 7CD<R> 7cd, final 6yM<R> 6yM) {
        CTM.LIZ((Object)7cd, (Object)6yM);
        if (6yM.LIZ.LIZ()) {
            final E5m liz = this.LIZ;
            final Object liziz = 6yM.LIZIZ;
            n.LIZIZ(liziz, "");
            liz.LIZ(liziz);
            return;
        }
        this.LIZ.LIZ((Throwable)new 6H4((6yM)6yM));
    }
}
