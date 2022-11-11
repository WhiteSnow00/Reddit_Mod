// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import sg2.e;
import androidx.compose.runtime.Recomposer;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class q1 implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ View f;
    public final /* synthetic */ Recomposer g;
    
    public q1(final View f, final Recomposer g) {
        this.f = f;
        this.g = g;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        e.f((Object)view, "v");
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        e.f((Object)view, "v");
        this.f.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.g.u();
    }
}
