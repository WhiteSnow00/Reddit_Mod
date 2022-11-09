// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import java.util.Collection;
import v3.d;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.List;
import java.util.ArrayList;
import android.view.View;
import androidx.fragment.app.u0;

public class f extends u0
{
    @Override
    public final void a(final View view, final Object o) {
        ((m)o).c(view);
    }
    
    @Override
    public final void b(final ArrayList list, final Object o) {
        final m m = (m)o;
        if (m == null) {
            return;
        }
        final boolean b = m instanceof r;
        final int n = 0;
        int i = 0;
        if (b) {
            for (r r = (r)m; i < r.E.size(); ++i) {
                this.b(list, r.N(i));
            }
        }
        else if (u0.h(m.j) && u0.h(null) && u0.h(null) && u0.h(m.k)) {
            for (int size = list.size(), j = n; j < size; ++j) {
                m.c((View)list.get(j));
            }
        }
    }
    
    @Override
    public final void c(final ViewGroup viewGroup, final Object o) {
        q.a(viewGroup, (m)o);
    }
    
    @Override
    public final boolean e(final Object o) {
        return o instanceof m;
    }
    
    @Override
    public final Object f(final Object o) {
        m k;
        if (o != null) {
            k = ((m)o).k();
        }
        else {
            k = null;
        }
        return k;
    }
    
    @Override
    public final Object i(final Object o, Object o2, final Object o3) {
        m m = (m)o;
        final m i = (m)o2;
        final m j = (m)o3;
        if (m != null && i != null) {
            final r r = new r();
            r.M(m);
            r.M(i);
            r.Q(1);
            m = r;
        }
        else if (m == null) {
            if (i != null) {
                m = i;
            }
            else {
                m = null;
            }
        }
        if (j != null) {
            o2 = new r();
            if (m != null) {
                ((r)o2).M(m);
            }
            ((r)o2).M(j);
            return o2;
        }
        return m;
    }
    
    @Override
    public final Object j(final Object o, final Object o2) {
        final r r = new r();
        if (o != null) {
            r.M((m)o);
        }
        r.M((m)o2);
        return r;
    }
    
    @Override
    public final void k(final Object o, final View view, final ArrayList<View> list) {
        ((m)o).a((m.d)new m.d() {
            @Override
            public final void a(final m m) {
                m.y((m.d)this);
                view.setVisibility(8);
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((View)list.get(i)).setVisibility(0);
                }
            }
            
            @Override
            public final void b(final m m) {
            }
            
            @Override
            public final void c(final m m) {
            }
            
            @Override
            public final void d(final m m) {
                m.y((m.d)this);
                m.a((m.d)this);
            }
            
            @Override
            public final void e(final m m) {
            }
        });
    }
    
    @Override
    public final void l(final Object o, final Object o2, final ArrayList list, final Object o3, final ArrayList list2) {
        ((m)o).a((m.d)new g(this, o2, list, o3, list2));
    }
    
    @Override
    public final void m(final View view, final Object o) {
        if (view != null) {
            final m m = (m)o;
            final Rect rect = new Rect();
            u0.g(rect, view);
            m.D((m.c)new e(rect));
        }
    }
    
    @Override
    public final void n(final Object o, final Rect rect) {
        ((m)o).D((m.c)new m.c() {
            @Override
            public final Rect a() {
                final Rect a = rect;
                if (a != null && !a.isEmpty()) {
                    return rect;
                }
                return null;
            }
        });
    }
    
    @Override
    public final void o(final Object o, final d d, final androidx.fragment.app.m m) {
        final m i = (m)o;
        d.b((d.b)new h(i));
        i.a((m.d)new i(m));
    }
    
    @Override
    public final void p(final Object o, final View view, final ArrayList<View> list) {
        final r r = (r)o;
        final ArrayList<View> k = r.k;
        k.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            u0.d((View)list.get(i), k);
        }
        k.add(view);
        list.add(view);
        this.b(list, r);
    }
    
    @Override
    public final void q(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final r r = (r)o;
        if (r != null) {
            r.k.clear();
            r.k.addAll(list2);
            this.s(r, list, list2);
        }
    }
    
    @Override
    public final Object r(final Object o) {
        if (o == null) {
            return null;
        }
        final r r = new r();
        r.M((m)o);
        return r;
    }
    
    public final void s(final Object o, final ArrayList<View> list, final ArrayList<View> list2) {
        final m m = (m)o;
        final boolean b = m instanceof r;
        int i = 0;
        int j = 0;
        if (b) {
            for (r r = (r)m; j < r.E.size(); ++j) {
                this.s(r.N(j), list, list2);
            }
        }
        else if (u0.h(m.j) && u0.h(null) && u0.h(null)) {
            final ArrayList<View> k = m.k;
            if (k.size() == list.size() && k.containsAll(list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    m.c((View)list2.get(i));
                    ++i;
                }
                int size2 = list.size();
                while (--size2 >= 0) {
                    m.z((View)list.get(size2));
                }
            }
        }
    }
}
