// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.DialogFragment;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.voiceeffect.LiveVoiceEffectDialogFragment;
import android.view.View$OnClickListener;

public final class 0ig implements View$OnClickListener
{
    public final /* synthetic */ LiveVoiceEffectDialogFragment LIZ;
    
    static {
        Covode.recordClassIndex(6770);
    }
    
    public 0ig(final LiveVoiceEffectDialogFragment liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        ((DialogFragment)this.LIZ).dismiss();
    }
}
