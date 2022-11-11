// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import a4.t1;
import java.util.WeakHashMap;
import java.util.ArrayList;
import android.view.ViewGroup;
import a4.q0$i;
import a4.q0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;

public final class c implements Runnable
{
    public final /* synthetic */ View f;
    public final /* synthetic */ View g;
    public final /* synthetic */ ViewTreeObserver$OnPreDrawListener h;
    public final /* synthetic */ n.a i;
    public final /* synthetic */ j j;
    
    public c(final j j, final View f, final View g, final ViewTreeObserver$OnPreDrawListener h, final n.a i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        final ArrayList m = this.j.m;
        final View f = this.f;
        final WeakHashMap<View, t1> a = q0.a;
        m.remove(q0$i.k(f));
        final ArrayList n = this.j.n;
        final View f2 = this.f;
        n.add(new j.b((ViewGroup)f2.getParent(), f2));
        ((ViewGroup)this.f.getParent()).removeView(this.f);
        if (this.j.m.size() == 0) {
            this.g.getViewTreeObserver().removeOnPreDrawListener(this.h);
            this.g.setVisibility(4);
            this.i.onPrepared();
        }
    }
}
