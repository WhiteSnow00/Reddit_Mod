// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import com.reddit.ui.premium.a;
import ng2.e;
import android.view.View;
import com.reddit.widgets.PremiumMarketingPerkView;
import android.view.View$OnClickListener;

public final class m0 implements View$OnClickListener
{
    public final PremiumMarketingPerkView f;
    
    public m0(final PremiumMarketingPerkView f) {
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final PremiumMarketingPerkView f = this.f;
        e.f((Object)f, "this$0");
        final a f2 = f.f;
        if (f2 != null) {
            f2.i.invoke((Object)f2);
        }
    }
}
