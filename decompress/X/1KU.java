// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

public final class 1KU<T> implements 3VJ
{
    public final /* synthetic */ 1KZ.f LIZ;
    public final /* synthetic */ EffectChannelResponse LIZIZ;
    
    static {
        Covode.recordClassIndex(6378);
    }
    
    public 1KU(final 1KZ.f liz, final EffectChannelResponse liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void subscribe(final FDm<List<1Km<T>>> fDm) {
        CTM.LIZ((Object)fDm);
        final 0gL.d<T> lizj = this.LIZ.LIZJ;
        final List<1Km<T>> liz = this.LIZ.LIZIZ.LIZ(this.LIZIZ);
        lizj.LIZ(liz);
        ((3t4)fDm).onNext((Object)liz);
    }
}
