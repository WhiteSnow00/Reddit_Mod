// 
// Decompiled by Procyon v0.6.0
// 

package qb2;

import android.view.View;
import android.widget.LinearLayout;
import ng2.e;
import com.reddit.widgets.livepill.LiveVideoPillView;

public final class c implements Runnable
{
    public final int f;
    public final LiveVideoPillView g;
    
    public c(final LiveVideoPillView g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final LiveVideoPillView g = this.g;
                final int i = LiveVideoPillView.i;
                e.f((Object)g, "this$0");
                final LinearLayout o = g.g.o;
                e.e((Object)o, "binding.llTooltip");
                ((View)o).setVisibility(8);
                return;
            }
            case 0: {
                final LiveVideoPillView g2 = this.g;
                final int j = LiveVideoPillView.i;
                e.f((Object)g2, "this$0");
                final View h = g2.g.h;
                e.e((Object)h, "binding.dialogOverlay");
                h.setVisibility(0);
            }
        }
    }
}
