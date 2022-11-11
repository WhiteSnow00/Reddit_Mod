// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multiguestv3.mask.animation.AnimationManagerImpl;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutAnimationSetting;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public final class 0sq
{
    public static final 0sq LIZ;
    
    static {
        Covode.recordClassIndex(9019);
        LIZ = new 0sq();
    }
    
    public final 1XM LIZ(final ViewGroup viewGroup, final 0CH 0ch) {
        CTM.LIZ((Object)0ch);
        if (LinkMicLayoutAnimationSetting.INSTANCE.useAnimation()) {
            return new AnimationManagerImpl(viewGroup, 0ch);
        }
        return null;
    }
}
