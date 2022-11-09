// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;

public final class 1j7 implements IFetchCategoryEffectListener
{
    public final /* synthetic */ 0gQ.b LIZ;
    public final /* synthetic */ String LIZIZ;
    
    static {
        Covode.recordClassIndex(6408);
    }
    
    public 1j7(final 0gQ.b liz, final String liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onFail(final ExceptionResult exceptionResult) {
        1Kj.LIZIZ.LIZIZ(this.LIZIZ, this.LIZ);
    }
}
