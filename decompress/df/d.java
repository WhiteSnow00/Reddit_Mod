// 
// Decompiled by Procyon v0.6.0
// 

package df;

import android.app.Dialog;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.a;
import android.view.View$OnClickListener;

public final class d implements View$OnClickListener
{
    public final /* synthetic */ a f;
    
    public d(final a f) {
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final a f = this.f;
        if (f.l && ((Dialog)f).isShowing()) {
            final a f2 = this.f;
            if (!f2.n) {
                final TypedArray obtainStyledAttributes = ((Dialog)f2).getContext().obtainStyledAttributes(new int[] { 16843611 });
                f2.m = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                f2.n = true;
            }
            if (f2.m) {
                this.f.cancel();
            }
        }
    }
}
