// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.n;
import java.util.Collection;
import java.util.ArrayList;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1E2 extends 0TN
{
    public a LIZ;
    
    static {
        Covode.recordClassIndex(4599);
    }
    
    public 1E2(final Context context) {
        CTM.LIZ((Object)context);
        super(context);
    }
    
    @Override
    public final int LIZ() {
        if (Go9.LIZ.LIZ(super.LJII) == 1) {
            return 2131234330;
        }
        return 2131234329;
    }
    
    @Override
    public final View LIZ(final ViewGroup viewGroup) {
        CTM.LIZ((Object)viewGroup);
        final Context ljiiljjil = super.LJIILJJIL;
        final DataChannel ljii = super.LJII;
        final boolean ljiiiz = super.LJIIIZ;
        final a liz = this.LIZ;
        final Gnw lizj = new Gnw(ljiiljjil);
        lizj.setDataChannel(ljii);
        lizj.setOnEmojiSelectListener((0Vn)liz);
        int liziz;
        if (ljiiiz) {
            liziz = 7;
        }
        else {
            liziz = 12;
        }
        lizj.LIZIZ = liziz;
        final RecyclerView recyclerView = (RecyclerView)lizj.findViewById(2131367651);
        lizj.LIZ = new GoE(lizj.getContext());
        lizj.LIZ.LIZ = lizj.LIZJ;
        lizj.LIZ.LIZJ = (GoK)lizj;
        recyclerView.setAdapter((RecyclerView.a)lizj.LIZ);
        lizj.getContext();
        recyclerView.setLayoutManager((RecyclerView.i)new SSGridLayoutManager(lizj.LIZIZ, 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(36);
        final List liziz2 = Goz.LIZ().LIZIZ();
        if (!Fhk.LIZ(liziz2)) {
            final ArrayList list = new ArrayList(liziz2);
            final GoE liz2 = lizj.LIZ;
            liz2.LIZIZ.clear();
            if (!list.isEmpty()) {
                liz2.LIZIZ.addAll(list);
            }
            ((RecyclerView.a)lizj.LIZ).notifyDataSetChanged();
        }
        n.LIZIZ((Object)lizj, "");
        return (View)lizj;
    }
    
    @Override
    public final void LIZ(final int n) {
        final a liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(n);
        }
    }
    
    public final void LIZ(final a liz) {
        this.LIZ((b)(this.LIZ = liz));
    }
    
    @Override
    public final void LIZ(final boolean b) {
        super.LIZ(b);
        if (b) {
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_emoji_show");
            liz.LIZ();
            liz.LIZLLL();
        }
    }
    
    @Override
    public final void LIZJ() {
        final a liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ();
        }
    }
    
    @Override
    public final boolean LIZLLL() {
        final a liz = this.LIZ;
        return liz != null && liz.LIZJ();
    }
}
