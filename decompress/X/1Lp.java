// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyFragment;

public final class 1Lp implements b
{
    public final /* synthetic */ LiveSmallItemBeautyFragment LIZ;
    
    static {
        Covode.recordClassIndex(6584);
    }
    
    public 1Lp(final LiveSmallItemBeautyFragment liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final LiveEffect liveEffect, final int n) {
        CTM.LIZ((Object)liveEffect);
        final 44V ljjii = GST.LJJII;
        n.LIZIZ((Object)ljjii, "");
        ((44T)ljjii).LIZ((Object)0iM.LJ(liveEffect));
        final 0gX liz = 0gX.LIZ;
        liz.LIZIZ("LiveSmallItemBeautyFragment");
        liz.LIZJ("onChange");
        final StringBuilder sb = new StringBuilder("index: ");
        sb.append(n);
        sb.append(' ');
        sb.append(liveEffect);
        liz.LIZ(sb.toString());
        final DataChannel liz2 = HAM.LIZ((Fragment)this.LIZ);
        if (liz2 != null) {
            liz2.LIZJ((Class)2CF.class, (Object)liveEffect);
        }
    }
}
