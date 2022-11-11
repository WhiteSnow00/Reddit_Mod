// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.media.b;

public final class w1 extends b
{
    public final /* synthetic */ Dialog f;
    public final /* synthetic */ x1 g;
    
    public w1(final x1 g, final AlertDialog f) {
        this.g = g;
        this.f = (Dialog)f;
    }
    
    public final void a1() {
        this.g.g.l();
        if (this.f.isShowing()) {
            this.f.dismiss();
        }
    }
}
