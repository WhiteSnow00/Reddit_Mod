// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import u5.m;
import f8.h;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

public final class d implements Runnable
{
    public final /* synthetic */ View f;
    public final /* synthetic */ View g;
    public final /* synthetic */ List h;
    public final /* synthetic */ List i;
    public final /* synthetic */ List j;
    public final /* synthetic */ j k;
    
    public d(final j k, final View f, final View g, final ArrayList h, final ArrayList i, final ArrayList j) {
        this.k = k;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void run() {
        final m p = this.k.p;
        if (p != null) {
            p.z(this.f);
            final m p2 = this.k.p;
            final View g = this.g;
            final List h = this.h;
            final View f = this.f;
            final ArrayList list = new ArrayList();
            if (g != null) {
                e8.j.q(g, list);
            }
            list.removeAll(h);
            if (!list.isEmpty()) {
                list.add(f);
                f8.h.a(p2, list);
            }
            this.i.addAll(list);
        }
        if (this.j != null) {
            if (this.k.o != null) {
                final ArrayList<View> list2 = new ArrayList<View>();
                list2.add(this.f);
                f8.h.e(this.k.o, this.j, (List)list2);
            }
            this.j.clear();
            this.j.add(this.f);
        }
    }
}
