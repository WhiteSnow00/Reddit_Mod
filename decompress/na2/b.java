// 
// Decompiled by Procyon v0.6.0
// 

package na2;

import android.animation.ObjectAnimator;
import android.widget.ScrollView;
import ng2.e;
import android.view.View;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.view.View$OnLayoutChangeListener;

public final class b implements View$OnLayoutChangeListener
{
    public final Ref$ObjectRef f;
    public final Ref$IntRef g;
    
    public b(final Ref$ObjectRef f, final Ref$IntRef g) {
        this.f = f;
        this.g = g;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        e.f((Object)view, "view");
        view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        final Object element = this.f.element;
        e.d(element, "null cannot be cast to non-null type android.widget.ScrollView");
        ObjectAnimator.ofInt((Object)element, "scrollY", new int[] { this.g.element }).setDuration(300L).start();
    }
}
