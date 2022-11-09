// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import ah2.f;
import android.view.View;
import zg2.l;
import android.view.View$OnLayoutChangeListener;

public final class o1 implements View$OnLayoutChangeListener
{
    public final /* synthetic */ l f;
    
    public o1(final l f) {
        this.f = f;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        ah2.f.f((Object)view, "view");
        view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        this.f.invoke((Object)view);
    }
}
