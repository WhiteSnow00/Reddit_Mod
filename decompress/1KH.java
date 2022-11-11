// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.model.FilterModel;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;

public final class 1KH implements IIsTagNeedUpdatedListener
{
    public final /* synthetic */ FilterModel LIZ;
    public final /* synthetic */ FDm LIZIZ;
    
    static {
        Covode.recordClassIndex(6352);
    }
    
    public 1KH(final FilterModel liz, final FDm liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onTagNeedNotUpdate() {
        this.LIZ.isNew = false;
        ((3t4)this.LIZIZ).onComplete();
    }
    
    public final void onTagNeedUpdate() {
        this.LIZ.isNew = true;
        ((3t4)this.LIZIZ).onComplete();
    }
}
