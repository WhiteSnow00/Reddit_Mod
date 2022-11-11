// 
// Decompiled by Procyon v0.6.0
// 

package e8;

import java.util.List;
import java.util.Set;
import u5.m$d;
import u5.m$c;
import f8.g;
import android.graphics.Rect;
import java.util.Map;
import java.util.Collection;
import f8.h;
import j0.b;
import java.util.ArrayList;
import u5.m;
import android.view.View;
import android.view.ViewGroup;

public final class a implements n.a
{
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ m d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ n.a f;
    public final /* synthetic */ j g;
    
    public a(final j g, final ViewGroup a, final View b, final View c, final m d, final boolean e, final e8.m f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void onPrepared() {
        final j g = this.g;
        Object a = this.a;
        final View b = this.b;
        final View c = this.c;
        final m d = this.d;
        final boolean e = this.e;
        g.getClass();
        final View view = new View(((View)a).getContext());
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        m m = null;
        View view7 = null;
        View view9 = null;
        Object o2 = null;
        Label_0874: {
            if (c != null) {
                if (b != null) {
                    j0.b b2;
                    if (!g.l.isEmpty() && g.q != null) {
                        b2 = new j0.b();
                        f8.h.c(b2, b);
                        j0.h.k((Collection)new ArrayList(g.l.keySet()), (Map)b2);
                        final j0.b l = g.l;
                        final Set keySet = b2.keySet();
                        l.getClass();
                        j0.h.k((Collection)keySet, (Map)l);
                    }
                    else {
                        g.l.clear();
                        b2 = null;
                    }
                    if (g.l.isEmpty()) {
                        g.q = null;
                    }
                    else if (b2 != null) {
                        list.addAll(b2.values());
                    }
                    if (g.p != null || g.o != null || g.q != null) {
                        Rect rect4;
                        if (g.q != null) {
                            final Rect rect = new Rect();
                            final m q = g.q;
                            final ArrayList k = q.k;
                            k.clear();
                            final int size = list.size();
                            int i = 0;
                        Label_0278:
                            while (i < size) {
                                final View view2 = list.get(i);
                                while (true) {
                                    for (int size2 = k.size(), j = 0; j < size2; ++j) {
                                        if (k.get(j) == view2) {
                                            final boolean b3 = true;
                                            View view3;
                                            if (b3) {
                                                view3 = (View)a;
                                            }
                                            else {
                                                k.add(view2);
                                                int n = size2;
                                                while (true) {
                                                    view3 = (View)a;
                                                    if (n >= k.size()) {
                                                        break;
                                                    }
                                                    final View view4 = k.get(n);
                                                    if (view4 instanceof ViewGroup) {
                                                        final ViewGroup viewGroup = (ViewGroup)view4;
                                                        final int childCount = viewGroup.getChildCount();
                                                        int n2 = 0;
                                                    Label_0414:
                                                        while (n2 < childCount) {
                                                            final View child = viewGroup.getChildAt(n2);
                                                            while (true) {
                                                                for (int n3 = 0; n3 < size2; ++n3) {
                                                                    if (k.get(n3) == child) {
                                                                        final boolean b4 = true;
                                                                        if (!b4) {
                                                                            k.add(child);
                                                                        }
                                                                        ++n2;
                                                                        continue Label_0414;
                                                                    }
                                                                }
                                                                final boolean b4 = false;
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    ++n;
                                                }
                                            }
                                            ++i;
                                            a = view3;
                                            continue Label_0278;
                                        }
                                    }
                                    final boolean b3 = false;
                                    continue;
                                }
                            }
                            final View view5 = b;
                            m = d;
                            k.add(view);
                            list.add(view);
                            f8.h.a(q, list);
                            final j0.b l2 = g.l;
                            if (l2.h > 0 && b2 != null) {
                                final View view6 = (View)b2.getOrDefault(l2.j(0), (Object)null);
                                final m q2 = g.q;
                                if (q2 != null && view6 != null) {
                                    final Rect rect2 = new Rect();
                                    final int[] array = new int[2];
                                    view6.getLocationOnScreen(array);
                                    final int n4 = array[0];
                                    rect2.set(n4, array[1], view6.getWidth() + n4, view6.getHeight() + array[1]);
                                    q2.D((m$c)new g(rect2));
                                }
                                final m o = g.o;
                                if (o != null && view6 != null) {
                                    final Rect rect3 = new Rect();
                                    final int[] array2 = new int[2];
                                    view6.getLocationOnScreen(array2);
                                    final int n5 = array2[0];
                                    rect3.set(n5, array2[1], view6.getWidth() + n5, view6.getHeight() + array2[1]);
                                    o.D((m$c)new g(rect3));
                                }
                            }
                            final m p = g.p;
                            if (p != null) {
                                p.D((m$c)new e(rect));
                            }
                            rect4 = rect;
                            view7 = view5;
                        }
                        else {
                            final View view8 = b;
                            m = d;
                            rect4 = null;
                            view7 = view8;
                        }
                        final ArrayList list3 = null;
                        e8.j.a.a((View)a, new f(g, c, e, list2, view, list, rect4));
                        view9 = (View)a;
                        o2 = list3;
                        break Label_0874;
                    }
                }
            }
            view9 = (View)a;
            final View view10 = b;
            m = d;
            final ArrayList list4 = null;
            view7 = view10;
            o2 = list4;
        }
        final m o3 = g.o;
        Object o4;
        if (o3 != null) {
            final ArrayList list5 = new ArrayList();
            if (view7 != null) {
                e8.j.q(view7, list5);
            }
            list5.removeAll(list);
            if (!list5.isEmpty()) {
                list5.add(view);
                f8.h.a(o3, list5);
            }
            o4 = list5;
        }
        else {
            o4 = o2;
        }
        if (o4 == null || ((List)o4).isEmpty()) {
            g.o = (m)o2;
        }
        final m p2 = g.p;
        if (p2 != null) {
            p2.c(view);
        }
        final ArrayList list6 = new ArrayList();
        m.b((m$d)new e8.g(g.p, list6, g.o, (ArrayList)o4, g.q, list2));
        e8.j.a.a(view9, new e8.d(g, view, c, list2, list6, (ArrayList)o4));
        e8.j.a.a(view9, new e8.h(g, list2));
        e8.j.a.a(view9, new i(g, list2));
        this.f.onPrepared();
    }
}
