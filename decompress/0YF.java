// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import android.content.DialogInterface$OnDismissListener;

public final class 0Yf implements DialogInterface$OnDismissListener
{
    public final /* synthetic */ 1GK LIZ;
    
    static {
        Covode.recordClassIndex(5282);
    }
    
    public 0Yf(final 1GK liz) {
        this.LIZ = liz;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        this.LIZ.LJI().LIZ(true);
    }
}
