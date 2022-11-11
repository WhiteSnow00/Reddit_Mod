// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import j0.b;
import a4.t1;
import java.util.WeakHashMap;
import a4.q0$i;
import a4.q0;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class h implements Runnable
{
    public final /* synthetic */ List f;
    public final /* synthetic */ j g;
    
    public h(final j g, final ArrayList f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
    Label_0118:
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            final View view = this.f.get(i);
            final WeakHashMap<View, t1> a = q0.a;
            final String k = q0$i.k(view);
            if (k != null) {
                final b l = this.g.l;
                while (true) {
                    for (int h = l.h, j = 0; j < h; ++j) {
                        if (k.equals(l.n(j))) {
                            final String s = (String)l.j(j);
                            q0$i.v(view, s);
                            continue Label_0118;
                        }
                    }
                    final String s = null;
                    continue;
                }
            }
        }
    }
}
