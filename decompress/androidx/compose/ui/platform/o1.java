// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import java.util.concurrent.CancellationException;
import sg2.e;
import android.view.View;
import ej2.p1;
import ej2.z0;
import android.view.View$OnAttachStateChangeListener;

public final class o1 implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ z0 f;
    
    public o1(final p1 f) {
        this.f = (z0)f;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        e.f((Object)view, "v");
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        e.f((Object)view, "v");
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.f.a((CancellationException)null);
    }
}
