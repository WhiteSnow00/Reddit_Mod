// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0he implements View$OnClickListener
{
    public final /* synthetic */ 1L7 LIZ;
    public final /* synthetic */ 1L4 LIZIZ;
    
    static {
        Covode.recordClassIndex(6476);
    }
    
    public 0he(final 1L7 liz, final 1L4 liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        if (this.LIZ.LIZIZ == this.LIZIZ.LIZ) {
            return;
        }
        this.LIZ.LIZIZ = this.LIZIZ.LIZ;
        ((RecyclerView.a)this.LIZ).notifyDataSetChanged();
        if (0hc.LJIILIIL) {
            0hf.LIZ.LIZ(false);
        }
        this.LIZ.LJ.invoke((Object)this.LIZIZ);
        final DataChannel lizlll = this.LIZ.LIZLLL;
        final long liziz = this.LIZ.LIZIZ;
        final String liziz2 = this.LIZIZ.LIZIZ;
        CTM.LIZ((Object)liziz2);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_ksong_tab_click");
        liz.LIZ(lizlll);
        liz.LIZ("collection_id", String.valueOf(liziz));
        liz.LIZ("tab", liziz2);
        liz.LIZLLL();
    }
}
