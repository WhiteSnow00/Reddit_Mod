// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import com.reddit.widgets.AwardHeroView;
import ng2.e;
import android.view.View;

public final class a implements Runnable
{
    public final int f;
    public final View g;
    
    public a(final View g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final View g = this.g;
                e.f((Object)g, "$itemView");
                g.setVisibility(8);
                return;
            }
            case 0: {
                AwardHeroView.n((AwardHeroView)this.g);
            }
        }
    }
}
