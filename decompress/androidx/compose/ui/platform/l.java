// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class l implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final AndroidComposeView f;
    
    public l(final AndroidComposeView f) {
        this.f = f;
    }
    
    public final void onGlobalLayout() {
        final AndroidComposeView f = this.f;
        final Class x0 = AndroidComposeView.x0;
        e.f((Object)f, "this$0");
        f.R();
    }
}
