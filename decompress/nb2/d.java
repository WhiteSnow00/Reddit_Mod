// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import ng2.e;
import android.widget.ImageView;
import android.view.View;

public final class d implements Runnable
{
    public final View f;
    
    public d(final ImageView f) {
        this.f = (View)f;
    }
    
    @Override
    public final void run() {
        final View f = this.f;
        e.f((Object)f, "$itemView");
        f.setVisibility(0);
    }
}
