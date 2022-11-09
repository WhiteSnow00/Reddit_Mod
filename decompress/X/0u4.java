// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.view.View$OnClickListener;

public final class 0u4 implements View$OnClickListener
{
    public final /* synthetic */ 1mL LIZ;
    public final /* synthetic */ LinkPlayerInfo LIZIZ;
    
    static {
        Covode.recordClassIndex(9421);
    }
    
    public 0u4(final 1mL liz, final LinkPlayerInfo liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        this.LIZ.LIZIZ.setEnabled(false);
        this.LIZ.LIZIZ.setText(0cB.LIZ(2131828905));
        final 0tq ljff = this.LIZ.LJFF;
        if (ljff != null) {
            ljff.LIZIZ(this.LIZIZ);
        }
    }
}
