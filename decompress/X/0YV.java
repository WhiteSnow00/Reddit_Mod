// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.broadcast.dialog.GameMessageAlertDialog;
import android.widget.CompoundButton$OnCheckedChangeListener;

public final class 0Yv implements CompoundButton$OnCheckedChangeListener
{
    public final /* synthetic */ GameMessageAlertDialog.b LIZ;
    public final /* synthetic */ GameMessageAlertDialog.c LIZIZ;
    
    static {
        Covode.recordClassIndex(5321);
    }
    
    public 0Yv(final GameMessageAlertDialog.b liz, final GameMessageAlertDialog.c liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        ((44T)this.LIZIZ.LIZIZ).LIZ((Object)b);
        if (n.LIZ((Object)this.LIZIZ.LIZIZ, (Object)GST.q)) {
            final 44V k = GST.K;
            n.LIZIZ((Object)k, "");
            ((44T)k).LIZ((Object)true);
        }
        final Gkn liz = Gkn.LJFF.LIZ(this.LIZIZ.LIZJ);
        liz.LIZ("anchor_id", (String)this.LIZ.LIZIZ.getValue());
        liz.LIZ("live_type", "screen_share");
        liz.LIZ("room_id", ((Number)this.LIZ.LIZ.getValue()).longValue());
        liz.LIZ("to_status", (int)(b ? 1 : 0));
        liz.LIZ("overlay_permission", GTi.LJ(Boolean.valueOf(6JE.LIZ(0cB.LJ()))));
        liz.LIZLLL();
    }
}
