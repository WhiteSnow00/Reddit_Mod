// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.Window$Callback;
import android.view.MenuItem;
import android.view.View;
import l.a;
import android.view.View$OnClickListener;

public final class b1 implements View$OnClickListener
{
    public final a f;
    public final /* synthetic */ c1 g;
    
    public b1(final c1 g) {
        this.g = g;
        this.f = new a(((View)g.a).getContext(), g.i);
    }
    
    public final void onClick(final View view) {
        final c1 g = this.g;
        final Window$Callback l = g.l;
        if (l != null && g.m) {
            l.onMenuItemSelected(0, (MenuItem)this.f);
        }
    }
}
