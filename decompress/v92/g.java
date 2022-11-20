// 
// Decompiled by Procyon v0.6.0
// 

package v92;

import ng2.e;
import android.view.MotionEvent;
import android.view.View;
import mg2.a;
import com.reddit.vault.feature.vault.coins.PurchaseCoinsScreen;
import android.view.View$OnTouchListener;

public final class g implements View$OnTouchListener
{
    public final PurchaseCoinsScreen f;
    public final a g;
    
    public g(final PurchaseCoinsScreen f, final a g) {
        this.f = f;
        this.g = g;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final PurchaseCoinsScreen f = this.f;
        final a g = this.g;
        e.f((Object)f, "this$0");
        e.f((Object)g, "$listener");
        if (motionEvent.getAction() == 1 && e.a((Object)f.k0, (Object)g)) {
            f.k0 = null;
        }
        return false;
    }
}
