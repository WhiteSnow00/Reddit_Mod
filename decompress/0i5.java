// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.view.View$OnClickListener;

public final class 0i5 implements View$OnClickListener
{
    public final /* synthetic */ 1jM LIZ;
    public final /* synthetic */ 1jM.a LIZIZ;
    public final /* synthetic */ LiveEffect LIZJ;
    
    static {
        Covode.recordClassIndex(6622);
    }
    
    public 0i5(final 1jM liz, final 1jM.a liziz, final LiveEffect lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onClick(final View view) {
        final int adapterPosition = ((RecyclerView.ViewHolder)this.LIZIZ).getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < this.LIZ.LIZ.size()) {
            if (!1KZ.LIZIZ.LIZ(this.LIZJ)) {
                return;
            }
            if (0iM.LIZIZ(this.LIZJ)) {
                Hf4.LIZ(0cB.LJ(), 2131829151);
                return;
            }
            final 1jM liz = this.LIZ;
            liz.LIZIZ(liz.LIZIZ);
            this.LIZ.LIZ(adapterPosition);
            this.LIZ.LIZIZ = adapterPosition;
            final 1jM.b lizj = this.LIZ.LIZJ;
            if (lizj != null) {
                lizj.LIZ(this.LIZJ);
            }
        }
    }
}
