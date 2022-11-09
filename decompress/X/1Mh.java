// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import java.util.List;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;

public abstract class 1mh extends 1cg<MultiMatchAnchorWidget>
{
    public 1so LJIILIIL;
    public 0nr LJIILJJIL;
    
    static {
        Covode.recordClassIndex(10106);
    }
    
    public abstract void LIZ(final 0kG p0);
    
    public void LIZ(final List<Vwg> list, final List<Vwg> list2) {
    }
    
    public abstract void LIZIZ(final int p0);
    
    public abstract void LIZIZ(final LinkMicBattleMessage p0);
    
    @Override
    public void LJIJI() {
        super.LJIJI();
        final MatchBaseWidget liz = super.LIZ;
        if (liz != null) {
            final View viewById = liz.findViewById(2131363052);
            n.LIZIZ((Object)viewById, "");
            this.LJIILIIL = (1so)viewById;
            final View viewById2 = liz.findViewById(2131363054);
            n.LIZIZ((Object)viewById2, "");
            this.LJIILJJIL = (0nr)viewById2;
        }
    }
    
    public final 1so LJJIIJZLJL() {
        final 1so ljiiliil = this.LJIILIIL;
        if (ljiiliil == null) {
            n.LIZ("");
        }
        return ljiiliil;
    }
    
    public final 0nr LJJIIZ() {
        final 0nr ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            n.LIZ("");
        }
        return ljiiljjil;
    }
    
    public abstract void LJJIIZI();
}
