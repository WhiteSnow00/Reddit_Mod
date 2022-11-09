// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.model.FilterModel;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;

public final class 1iu implements IFetchEffectListener
{
    public long LIZ;
    public final /* synthetic */ FilterModel LIZIZ;
    public final /* synthetic */ 1KJ LIZJ;
    
    static {
        Covode.recordClassIndex(6353);
    }
    
    public 1iu(final 1KJ lizj, final FilterModel liziz) {
        this.LIZJ = lizj;
        this.LIZIZ = liziz;
        this.LIZ = System.currentTimeMillis();
    }
    
    public final void onFail(final Effect effect, final ExceptionResult exceptionResult) {
        this.LIZJ.LIZ(this.LIZ, false, this.LIZIZ);
    }
    
    public final void onStart(final Effect effect) {
    }
}
