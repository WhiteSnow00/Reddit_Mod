// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import v1.c;
import v1.a;
import ng2.e;
import android.view.ViewTreeObserver$OnTouchModeChangeListener;

public final class n implements ViewTreeObserver$OnTouchModeChangeListener
{
    public final AndroidComposeView f;
    
    public n(final AndroidComposeView f) {
        this.f = f;
    }
    
    public final void onTouchModeChanged(final boolean b) {
        final AndroidComposeView f = this.f;
        final Class x0 = AndroidComposeView.x0;
        e.f((Object)f, "this$0");
        final c i0 = f.i0;
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        ((SnapshotMutableStateImpl)i0.b).setValue((Object)new a(n));
        m1.e.b(f.j.a);
    }
}
