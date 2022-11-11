// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;

public final class 1j4 implements IFetchFavoriteList
{
    public final /* synthetic */ 0gL.f LIZ;
    public final /* synthetic */ 0gL.g LIZIZ;
    public final /* synthetic */ 0gL.e LIZJ;
    
    static {
        Covode.recordClassIndex(6401);
    }
    
    public 1j4(final 0gL.f liz, final 0gL.g liziz, final 0gL.e lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onFailed(final ExceptionResult exceptionResult) {
        this.LIZ.LIZ();
    }
}
