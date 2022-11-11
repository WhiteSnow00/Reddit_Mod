// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget;
import android.view.View$OnClickListener;

public final class 0i7 implements View$OnClickListener
{
    public final /* synthetic */ SoundEffectMiniWidget LIZ;
    
    static {
        Covode.recordClassIndex(6637);
    }
    
    public 0i7(final SoundEffectMiniWidget liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        ((Widget)this.LIZ).hide();
        final DataChannel dataChannel = this.LIZ.dataChannel;
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_sound_shortcut_panel_close");
        liz.LIZ(dataChannel);
        liz.LIZLLL();
    }
}
