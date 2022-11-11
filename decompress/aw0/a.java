// 
// Decompiled by Procyon v0.6.0
// 

package aw0;

import android.widget.LinearLayout;
import android.view.View;

public final class a implements Runnable
{
    public final /* synthetic */ View f;
    public final /* synthetic */ fg2.a g;
    
    public a(final LinearLayout f, final fg2.a g) {
        this.f = (View)f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.g.onNext((Object)this.f.getTop());
    }
}
