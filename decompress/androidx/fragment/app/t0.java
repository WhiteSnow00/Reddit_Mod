// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.WeakHashMap;
import a4.p0;
import android.view.View;
import java.util.ArrayList;

public final class t0 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ ArrayList j;
    
    public t0(final int f, final ArrayList g, final ArrayList h, final ArrayList i, final ArrayList j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void run() {
        for (int i = 0; i < this.f; ++i) {
            final View view = this.g.get(i);
            final String s = this.h.get(i);
            final WeakHashMap a = p0.a;
            p0.i.v(view, s);
            p0.i.v((View)this.i.get(i), (String)this.j.get(i));
        }
    }
}
