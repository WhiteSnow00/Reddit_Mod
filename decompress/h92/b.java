// 
// Decompiled by Procyon v0.6.0
// 

package h92;

import android.view.View;
import android.widget.Button;
import ng2.e;
import android.widget.CompoundButton;
import mg2.l;
import android.widget.CompoundButton$OnCheckedChangeListener;

public final class b implements CompoundButton$OnCheckedChangeListener
{
    public final l f;
    public final c g;
    
    public b(final l f, final c g) {
        this.f = f;
        this.g = g;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        final l f = this.f;
        final c g = this.g;
        e.f((Object)f, "$onPermissionChanged");
        e.f((Object)g, "this$0");
        f.invoke((Object)b);
        ((View)g.f.e).setEnabled(b);
        ((View)g.f.c).setEnabled(b);
    }
}
