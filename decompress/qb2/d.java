// 
// Decompiled by Procyon v0.6.0
// 

package qb2;

import pk0.d$c;
import pk0.d$i;
import pk0.d$b;
import ng2.e;
import android.view.View;
import com.reddit.widgets.livepill.LiveVideoPillView;
import android.view.View$OnClickListener;

public final class d implements View$OnClickListener
{
    public final int f;
    public final LiveVideoPillView g;
    
    public d(final LiveVideoPillView g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void onClick(final View view) {
        switch (this.f) {
            default: {
                final LiveVideoPillView g = this.g;
                final int i = LiveVideoPillView.i;
                e.f((Object)g, "this$0");
                g.f.invoke((Object)d$b.a);
                return;
            }
            case 1: {
                final LiveVideoPillView g2 = this.g;
                final int j = LiveVideoPillView.i;
                e.f((Object)g2, "this$0");
                g2.f.invoke((Object)d$i.a);
                return;
            }
            case 0: {
                final LiveVideoPillView g3 = this.g;
                final int k = LiveVideoPillView.i;
                e.f((Object)g3, "this$0");
                g3.f.invoke((Object)d$c.a);
            }
        }
    }
}
