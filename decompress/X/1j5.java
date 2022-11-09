// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;

public final class 1j5 implements IFetchPanelInfoListener
{
    public final /* synthetic */ 0gQ.a LIZ;
    
    static {
        Covode.recordClassIndex(6405);
    }
    
    public 1j5(final 0gQ.a liz) {
        this.LIZ = liz;
    }
    
    public final void onFail(final ExceptionResult exceptionResult) {
        1Kj.LIZIZ.LIZIZ(this.LIZ);
    }
}
