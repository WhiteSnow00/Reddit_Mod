// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;

public final class 1tC extends F5g implements QgG<2P9>
{
    public final /* synthetic */ IFetchCategoryEffectListener LIZ;
    
    static {
        Covode.recordClassIndex(6382);
    }
    
    public 1tC(final IFetchCategoryEffectListener liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public final void LIZ() {
        1KZ.LIZ.fetchCategoryEffectFromCache("navi", "head", 50, 0, 0, (String)null, this.LIZ);
    }
}
