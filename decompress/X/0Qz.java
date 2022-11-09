// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0qZ implements View$OnClickListener
{
    public final /* synthetic */ 1TV LIZ;
    
    static {
        Covode.recordClassIndex(8431);
    }
    
    public 0qZ(final 1TV liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        if (!(view.getTag(2131366289) instanceof LiveEffect)) {
            return;
        }
        final LiveEffect liveEffect = (LiveEffect)view.getTag(2131366289);
        if (TextUtils.equals((CharSequence)this.LIZ.LIZIZ, (CharSequence)liveEffect.realId)) {
            return;
        }
        this.LIZ.LIZIZ = liveEffect.realId;
        ((RecyclerView.a)this.LIZ).notifyDataSetChanged();
        if (TextUtils.equals((CharSequence)this.LIZ.LIZIZ, (CharSequence)"")) {
            this.LIZ.LIZ.LIZIZ(liveEffect);
            if (!this.LIZ.LIZJ) {
                1NO.LIZ().LIZJ = liveEffect;
            }
            return;
        }
        if (liveEffect.isDownloaded) {
            this.LIZ.LIZ.LIZIZ(liveEffect);
        }
        else if (!liveEffect.isDownloading) {
            this.LIZ.LIZ.LIZ(liveEffect);
        }
        if (!this.LIZ.LIZJ) {
            1NO.LIZ().LIZJ = liveEffect;
        }
    }
}
