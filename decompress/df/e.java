// 
// Decompiled by Procyon v0.6.0
// 

package df;

import android.os.Bundle;
import b4.c;
import android.view.View;
import a4.a;

public final class e extends a
{
    public final /* synthetic */ com.google.android.material.bottomsheet.a b;
    
    public e(final com.google.android.material.bottomsheet.a b) {
        this.b = b;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
        super.onInitializeAccessibilityNodeInfo(view, c);
        if (this.b.l) {
            c.a(1048576);
            c.a.setDismissable(true);
        }
        else {
            c.a.setDismissable(false);
        }
    }
    
    public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        if (n == 1048576) {
            final com.google.android.material.bottomsheet.a b = this.b;
            if (b.l) {
                b.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, n, bundle);
    }
}
