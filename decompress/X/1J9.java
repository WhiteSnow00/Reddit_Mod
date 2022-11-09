// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;

public final class 1j9 implements IModFavoriteList
{
    public final /* synthetic */ LiveEffect LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ DataChannel LIZJ;
    
    static {
        Covode.recordClassIndex(6410);
    }
    
    public 1j9(final LiveEffect liz, final boolean liziz, final DataChannel lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onFail(final ExceptionResult exceptionResult) {
        1Kj.LIZIZ.LIZ(this.LIZ, this.LIZIZ ^ true, this.LIZJ);
    }
}
