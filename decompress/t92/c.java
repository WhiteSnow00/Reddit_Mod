// 
// Decompiled by Procyon v0.6.0
// 

package t92;

import androidx.constraintlayout.widget.ConstraintLayout;
import ng2.e;
import android.view.View;
import android.view.ViewGroup;
import n82.d0;
import com.reddit.vault.feature.toast.a;
import android.view.View$OnClickListener;

public final class c implements View$OnClickListener
{
    public final a f;
    public final d0 g;
    public final ViewGroup h;
    public final int i;
    public final mg2.a j;
    
    public c(final a f, final d0 g, final ViewGroup h, final int i, final mg2.a j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void onClick(final View view) {
        final a f = this.f;
        final d0 g = this.g;
        final ViewGroup h = this.h;
        final int i = this.i;
        final mg2.a j = this.j;
        e.f((Object)f, "this$0");
        e.f((Object)g, "$toast");
        e.f((Object)h, "$contentView");
        final ConstraintLayout a = g.a;
        e.e((Object)a, "toast.root");
        com.reddit.vault.feature.toast.a.b(i, a, h);
        if (j != null) {
            j.invoke();
        }
    }
}
