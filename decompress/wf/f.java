// 
// Decompiled by Procyon v0.6.0
// 

package wf;

import android.os.Bundle;
import b4.c;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import a4.a;

public final class f extends a
{
    public final /* synthetic */ BaseTransientBottomBar b;
    
    public f(final BaseTransientBottomBar b) {
        this.b = b;
    }
    
    @Override
    public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
        super.onInitializeAccessibilityNodeInfo(view, c);
        c.a(1048576);
        c.a.setDismissable(true);
    }
    
    @Override
    public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        if (n == 1048576) {
            this.b.a();
            return true;
        }
        return super.performAccessibilityAction(view, n, bundle);
    }
}
