// 
// Decompiled by Procyon v0.6.0
// 

package wf;

import android.view.View;
import wv.b;
import com.google.android.material.snackbar.Snackbar;
import android.view.View$OnClickListener;

public final class i implements View$OnClickListener
{
    public final /* synthetic */ View$OnClickListener f;
    public final /* synthetic */ Snackbar g;
    
    public i(final Snackbar g, final b f) {
        this.g = g;
        this.f = (View$OnClickListener)f;
    }
    
    public final void onClick(final View view) {
        this.f.onClick(view);
        this.g.b(1);
    }
}
