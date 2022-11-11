// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget;
import android.content.DialogInterface$OnClickListener;

public final class 0p6 implements DialogInterface$OnClickListener
{
    public final /* synthetic */ LinkBattleWidget LIZ;
    public final /* synthetic */ 39d LIZIZ;
    
    static {
        Covode.recordClassIndex(8077);
    }
    
    public 0p6(final LinkBattleWidget liz, final 39d liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final 44V ljllillll = GST.LJLLILLLL;
        n.LIZIZ((Object)ljllillll, "");
        ((44T)ljllillll).LIZ(this.LIZIZ.element);
        this.LIZ.LIZJ().LIZLLL();
        final 0xt liziz = 0xt.LIZIZ;
        final Boolean b = (Boolean)this.LIZIZ.element;
        n.LIZIZ((Object)b, "");
        liziz.LIZ(b, true);
    }
}
