// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 0i8
{
    static {
        Covode.recordClassIndex(6655);
    }
    
    public static final void LIZ(final DataChannel dataChannel, final LiveEffect liveEffect) {
        CTM.LIZ((Object)liveEffect);
        final 1N2 1n2 = 1N5.LIZJ.get(liveEffect.effectId);
        if (1n2 != null) {
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_voice_use_time");
            liz.LIZ(dataChannel);
            liz.LIZ("effect_name", liveEffect.nameForEnglish);
            liz.LIZ("effect_id", liveEffect.effectId);
            liz.LIZ("use_time", System.currentTimeMillis() / 1000L - 1n2.LIZ);
            liz.LIZ("resource_id", liveEffect.getResourceId());
            liz.LIZ("select_scene", 0iG.LIZ);
            liz.LIZLLL();
        }
    }
}
