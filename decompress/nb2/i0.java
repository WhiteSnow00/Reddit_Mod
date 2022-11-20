// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import com.reddit.ui.premium.a;
import ng2.e;
import android.view.View;
import com.reddit.widgets.FlatPremiumMarketingPerkView;
import android.view.View$OnClickListener;

public final class i0 implements View$OnClickListener
{
    public final FlatPremiumMarketingPerkView f;
    
    public i0(final FlatPremiumMarketingPerkView f) {
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final FlatPremiumMarketingPerkView f = this.f;
        e.f((Object)f, "this$0");
        final a f2 = f.f;
        if (f2 != null) {
            f2.i.invoke((Object)f2);
        }
    }
}
