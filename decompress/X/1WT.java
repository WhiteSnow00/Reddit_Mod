// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.LinkDialog;

public final class 1wT extends F5g implements SRS<String, 2P9>
{
    public final /* synthetic */ LinkDialog LIZ;
    
    static {
        Covode.recordClassIndex(7495);
    }
    
    public 1wT(final LinkDialog liz) {
        this.LIZ = liz;
        super(1);
    }
    
    public final void LIZ(final String text) {
        CTM.LIZ((Object)text);
        final View liziz = this.LIZ.LIZIZ;
        if (liziz != null) {
            final 1ib 1ib = (1ib)liziz.findViewById(2131373652);
            if (1ib != null) {
                1ib.setText((CharSequence)text);
            }
        }
    }
}
