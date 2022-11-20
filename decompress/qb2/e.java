// 
// Decompiled by Procyon v0.6.0
// 

package qb2;

import pk0.d$h;
import pk0.d$d;
import android.view.View;
import com.reddit.widgets.livepill.LiveVideoPillView;
import android.view.View$OnClickListener;

public final class e implements View$OnClickListener
{
    public final int f;
    public final LiveVideoPillView g;
    
    public e(final LiveVideoPillView g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void onClick(final View view) {
        switch (this.f) {
            default: {
                final LiveVideoPillView g = this.g;
                final int i = LiveVideoPillView.i;
                ng2.e.f((Object)g, "this$0");
                g.f.invoke((Object)d$d.a);
                return;
            }
            case 0: {
                final LiveVideoPillView g2 = this.g;
                final int j = LiveVideoPillView.i;
                ng2.e.f((Object)g2, "this$0");
                g2.f.invoke((Object)d$h.a);
            }
        }
    }
}
