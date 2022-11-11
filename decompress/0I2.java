// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchExperimentSetting;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.view.View$OnClickListener;

public final class 0i2 implements View$OnClickListener
{
    public final /* synthetic */ 1jK LIZ;
    public final /* synthetic */ 1jK.a LIZIZ;
    public final /* synthetic */ LiveEffect LIZJ;
    
    static {
        Covode.recordClassIndex(6614);
    }
    
    public 0i2(final 1jK liz, final 1jK.a liziz, final LiveEffect lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onClick(final View view) {
        final int adapterPosition = ((RecyclerView.ViewHolder)this.LIZIZ).getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < this.LIZ.LIZ.size()) {
            if (!1KZ.LIZIZ.LIZ(this.LIZJ) && !0iM.LIZ(this.LIZJ)) {
                return;
            }
            if (0iM.LIZ(this.LIZJ, this.LIZ.LJFF)) {
                Hf4.LIZ(0cB.LJ(), 2131829151);
                return;
            }
            if (LiveBeautySwitchExperimentSetting.INSTANCE.hasNone()) {
                ((RecyclerView.a)this.LIZ).notifyDataSetChanged();
            }
            else {
                final 1jK liz = this.LIZ;
                liz.LIZIZ(liz.LIZJ);
                this.LIZ.LIZ(adapterPosition);
            }
            this.LIZ.LIZJ = adapterPosition;
            final 1jK.b lizlll = this.LIZ.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZ(this.LIZJ, adapterPosition);
            }
        }
    }
}
