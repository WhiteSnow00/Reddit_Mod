// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.DialogFragment;
import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.input.EffectTextInputFragment;
import android.widget.TextView$OnEditorActionListener;

public final class 0hH implements TextView$OnEditorActionListener
{
    public final /* synthetic */ EffectTextInputFragment LIZ;
    
    static {
        Covode.recordClassIndex(6366);
    }
    
    public 0hH(final EffectTextInputFragment liz) {
        this.LIZ = liz;
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        ((DialogFragment)this.LIZ).dismiss();
        return true;
    }
}
