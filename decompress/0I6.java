// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.DialogFragment;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import android.view.View$OnClickListener;

public final class 0i6 implements View$OnClickListener
{
    public final /* synthetic */ SoundEffectFragment LIZ;
    
    static {
        Covode.recordClassIndex(6630);
    }
    
    public 0i6(final SoundEffectFragment liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        ((DialogFragment)this.LIZ).dismiss();
    }
}
