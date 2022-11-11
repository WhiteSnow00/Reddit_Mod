// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import a4.t1;
import java.util.WeakHashMap;
import a4.q0$i;
import a4.q0;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class i implements Runnable
{
    public final /* synthetic */ List f;
    public final /* synthetic */ j g;
    
    public i(final j g, final ArrayList f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final View view = this.f.get(i);
            final WeakHashMap<View, t1> a = q0.a;
            q0$i.v(view, (String)this.g.l.getOrDefault((Object)q0$i.k(view), (Object)null));
        }
    }
}
