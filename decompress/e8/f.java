// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import u5.m;
import a4.t1;
import java.util.WeakHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import a4.q0$i;
import a4.q0;
import f8.h;
import j0.b;
import java.util.ArrayList;
import android.graphics.Rect;
import java.util.List;
import android.view.View;

public final class f implements Runnable
{
    public final /* synthetic */ View f;
    public final /* synthetic */ List g;
    public final /* synthetic */ View h;
    public final /* synthetic */ List i;
    public final /* synthetic */ Rect j;
    public final /* synthetic */ j k;
    
    public f(final j k, final View f, final boolean b, final ArrayList g, final View h, final ArrayList i, final Rect j) {
        this.k = k;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void run() {
        final j k = this.k;
        final View f = this.f;
        final boolean empty = k.l.isEmpty();
        final View view = null;
        b b3;
        if (!empty && k.q != null && f != null) {
            final b b = new b();
            f8.h.c(b, f);
            for (final j.b b2 : k.n) {
                final View a = b2.a;
                final WeakHashMap<View, t1> a2 = q0.a;
                b.put((Object)q0$i.k(a), (Object)b2.a);
            }
            j0.h.k((Collection)new ArrayList(k.l.values()), (Map)b);
            int h = k.l.h;
            while (true) {
                final int n = h - 1;
                b3 = b;
                if (n < 0) {
                    break;
                }
                h = n;
                if (b.containsKey((Object)k.l.n(n))) {
                    continue;
                }
                k.l.l(n);
                h = n;
            }
        }
        else {
            k.l.clear();
            b3 = null;
        }
        if (b3 != null) {
            this.g.addAll(b3.values());
            this.g.add(this.h);
        }
        this.k.getClass();
        final m q = this.k.q;
        if (q != null) {
            q.k.clear();
            this.k.q.k.addAll(this.g);
            f8.h.e(this.k.q, this.i, this.g);
            final j i = this.k;
            View view2 = view;
            if (i.p != null) {
                final b l = i.l;
                view2 = view;
                if (l.h > 0) {
                    view2 = view;
                    if (b3 != null) {
                        view2 = (View)b3.getOrDefault(l.n(0), (Object)null);
                    }
                }
            }
            if (view2 != null) {
                final Rect j = this.j;
                if (j != null) {
                    final int[] array = new int[2];
                    view2.getLocationOnScreen(array);
                    final int n2 = array[0];
                    j.set(n2, array[1], view2.getWidth() + n2, view2.getHeight() + array[1]);
                }
            }
        }
    }
}
