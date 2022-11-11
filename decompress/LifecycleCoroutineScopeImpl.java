// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import X.0CG;
import X.0CH;
import java.util.concurrent.CancellationException;
import X.F0y;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.F2r;
import X.0CC;
import X.15t;
import X.15r;

public final class LifecycleCoroutineScopeImpl extends 15r implements 15t
{
    public final 0CC LIZ;
    public final F2r LIZIZ;
    
    static {
        Covode.recordClassIndex(1199);
    }
    
    public LifecycleCoroutineScopeImpl(final 0CC liz, final F2r liziz) {
        CTM.LIZ((Object)liz, (Object)liziz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        if (liz.LIZ() == 0CC.b.DESTROYED) {
            F0y.LIZ(this.getCoroutineContext(), (CancellationException)null);
        }
    }
    
    @Override
    public final 0CC LIZ() {
        return this.LIZ;
    }
    
    public final F2r getCoroutineContext() {
        return this.LIZIZ;
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        CTM.LIZ((Object)0ch, (Object)a);
        if (this.LIZ.LIZ().compareTo(0CC.b.DESTROYED) <= 0) {
            this.LIZ.LIZIZ(this);
            F0y.LIZ(this.getCoroutineContext(), (CancellationException)null);
        }
    }
}
