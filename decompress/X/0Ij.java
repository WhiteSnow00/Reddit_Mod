// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.avframework.effect.IAudioStrangeVoice;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceEffectUseVoipModeSetting;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.view.View$OnLongClickListener;

public final class 0ij implements View$OnLongClickListener
{
    public final /* synthetic */ 1N4 LIZ;
    public final /* synthetic */ 1N4.a LIZIZ;
    public final /* synthetic */ LiveEffect LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ boolean LJ;
    
    static {
        Covode.recordClassIndex(6780);
    }
    
    public 0ij(final 1N4 liz, final 1N4.a liziz, final LiveEffect lizj, final boolean lizlll, final boolean lj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
    }
    
    public final boolean onLongClick(final View view) {
        if (!LiveEffect.Companion.LIZ(1N4.LIZ(this.LIZ), this.LIZJ) || this.LIZLLL || !this.LJ) {
            return false;
        }
        this.LIZ.LJ = true;
        this.LIZIZ.LIZ(true);
        final IAudioStrangeVoice liz = 1N5.LIZ;
        if (liz != null) {
            liz.enablePlayerMode(true, LiveVoiceEffectUseVoipModeSetting.INSTANCE.getValue());
        }
        final 1N5.a lj = 1N5.LJ;
        if (lj != null) {
            lj.LIZ(true);
        }
        final DataChannel ljff = this.LIZ.LJFF;
        final LiveEffect lizj = this.LIZJ;
        CTM.LIZ((Object)lizj);
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_live_take_voice_try");
        liz2.LIZ(ljff);
        liz2.LIZ("effect_name", lizj.nameForEnglish);
        liz2.LIZ("effect_id", lizj.effectId);
        liz2.LIZ("resource_id", lizj.getResourceId());
        liz2.LIZLLL();
        return true;
    }
}
