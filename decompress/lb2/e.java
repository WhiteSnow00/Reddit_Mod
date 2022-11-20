// 
// Decompiled by Procyon v0.6.0
// 

package lb2;

import af2.f;
import kotlin.Pair;
import android.view.View;
import af2.v;
import android.view.View$OnLayoutChangeListener;

public final class e implements View$OnLayoutChangeListener
{
    public final v f;
    
    public e(final v f) {
        this.f = f;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        ng2.e.f((Object)view, "view");
        view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        ((f)this.f).onNext((Object)new Pair((Object)view, (Object)(view.getX() + view.getWidth() / 2)));
    }
}
