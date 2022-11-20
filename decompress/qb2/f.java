// 
// Decompiled by Procyon v0.6.0
// 

package qb2;

import pk0.d$c;
import pk0.d$a;
import ng2.e;
import android.view.View;
import com.reddit.widgets.livepill.LiveVideoPillView;
import android.view.View$OnClickListener;

public final class f implements View$OnClickListener
{
    public final int f;
    public final LiveVideoPillView g;
    
    public f(final LiveVideoPillView g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final void onClick(final View view) {
        switch (this.f) {
            default: {
                final LiveVideoPillView g = this.g;
                final int i = LiveVideoPillView.i;
                e.f((Object)g, "this$0");
                g.f.invoke((Object)d$a.a);
                return;
            }
            case 0: {
                final LiveVideoPillView g2 = this.g;
                final int j = LiveVideoPillView.i;
                e.f((Object)g2, "this$0");
                g2.f.invoke((Object)d$c.a);
            }
        }
    }
}
