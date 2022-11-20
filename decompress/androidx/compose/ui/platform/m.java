// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import android.view.ViewTreeObserver$OnScrollChangedListener;

public final class m implements ViewTreeObserver$OnScrollChangedListener
{
    public final AndroidComposeView a;
    
    public m(final AndroidComposeView a) {
        this.a = a;
    }
    
    public final void onScrollChanged() {
        final AndroidComposeView a = this.a;
        final Class x0 = AndroidComposeView.x0;
        e.f((Object)a, "this$0");
        a.R();
    }
}
