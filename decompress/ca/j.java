// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import android.view.View$OnAttachStateChangeListener;
import sg2.e;
import android.view.View;

public final class j
{
    public final View a;
    public final j$a b;
    public boolean c;
    
    public j(final View a) {
        e.f((Object)a, "view");
        this.a = a;
        this.b = new View$OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(final View view) {
                e.f((Object)view, "v");
                view.requestApplyInsets();
            }
            
            public final void onViewDetachedFromWindow(final View view) {
                e.f((Object)view, "v");
            }
        };
    }
}
