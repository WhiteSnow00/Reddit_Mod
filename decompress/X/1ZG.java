// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect.MultiGuestEffectViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 1Zg implements b
{
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ 0CH LIZIZ;
    public final /* synthetic */ 0Wg LIZJ;
    
    static {
        Covode.recordClassIndex(9691);
    }
    
    public 1Zg(final DataChannel liz, final 0CH liziz, final 0Wg lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final <T extends 0Bq> T LIZ(final Class<T> clazz) {
        CTM.LIZ((Object)clazz);
        return (T)new MultiGuestEffectViewModel(this.LIZIZ, this.LIZJ);
    }
}
