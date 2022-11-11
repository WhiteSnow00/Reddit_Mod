// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import com.google.android.gms.internal.measurement.o;
import ie.w3;
import ie.d3;
import ie.u3;
import ie.b3;
import ie.x3;
import java.util.Collections;
import ie.e6;
import ie.e3;
import java.util.List;
import ie.c3;
import java.util.Iterator;
import java.util.ArrayList;
import j0.h$c;
import j0.b;
import java.util.Map;
import java.util.BitSet;
import ie.v3;

public final class t7
{
    public String a = a;
    public boolean b = true;
    public v3 c;
    public BitSet d = new BitSet();
    public BitSet e = new BitSet();
    public Map f = new b();
    public b g = new b();
    public final /* synthetic */ pe.b h;
    
    public t7(final pe.b h, final String a, final v3 c, final BitSet d, final BitSet e, final b f, final b b) {
        this.h = h;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new b();
        for (final Integer n : (h$c)b.keySet()) {
            final ArrayList<Object> list = new ArrayList<Object>();
            list.add(b.getOrDefault((Object)n, (Object)null));
            this.g.put((Object)n, (Object)list);
        }
        this.b = false;
        this.c = c;
    }
    
    public final c3 a(int n) {
        final b3 s = c3.s();
        if (s.h) {
            s.l();
            s.h = false;
        }
        c3.w((c3)s.g, n);
        final boolean b = this.b;
        if (s.h) {
            s.l();
            s.h = false;
        }
        c3.z((c3)s.g, b);
        final v3 c = this.c;
        if (c != null) {
            if (s.h) {
                s.l();
                s.h = false;
            }
            c3.y((c3)s.g, c);
        }
        final u3 w = v3.w();
        final ArrayList j0 = i7.j0(this.d);
        if (w.h) {
            w.l();
            w.h = false;
        }
        v3.G((v3)w.g, j0);
        final ArrayList j2 = i7.j0(this.e);
        if (w.h) {
            w.l();
            w.h = false;
        }
        v3.E((v3)w.g, j2);
        final Map f = this.f;
        ArrayList list;
        if (f == null) {
            list = null;
        }
        else {
            final ArrayList list2 = new ArrayList(f.size());
            final Iterator iterator = this.f.keySet().iterator();
            while (true) {
                list = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                n = (int)iterator.next();
                final Long n2 = this.f.get(n);
                if (n2 == null) {
                    continue;
                }
                final d3 t = e3.t();
                if (t.h) {
                    t.l();
                    t.h = false;
                }
                e3.v((e3)t.g, n);
                final long longValue = n2;
                if (t.h) {
                    t.l();
                    t.h = false;
                }
                e3.w((e3)t.g, longValue);
                list2.add((Object)t.j());
            }
        }
        if (list != null) {
            if (w.h) {
                w.l();
                w.h = false;
            }
            v3.I((v3)w.g, list);
        }
        final b g = this.g;
        List<e6> emptyList;
        if (g == null) {
            emptyList = Collections.emptyList();
        }
        else {
            emptyList = new ArrayList<e6>(g.h);
            for (final Integer n3 : (h$c)this.g.keySet()) {
                final w3 u = x3.u();
                n = n3;
                if (u.h) {
                    u.l();
                    u.h = false;
                }
                x3.x((x3)u.g, n);
                final List list3 = (List)this.g.getOrDefault((Object)n3, (Object)null);
                if (list3 != null) {
                    Collections.sort((List<Comparable>)list3);
                    if (u.h) {
                        u.l();
                        u.h = false;
                    }
                    x3.y((x3)u.g, list3);
                }
                ((ArrayList<e6>)emptyList).add(u.j());
            }
        }
        if (w.h) {
            w.l();
            w.h = false;
        }
        v3.L((v3)w.g, emptyList);
        if (s.h) {
            s.l();
            s.h = false;
        }
        c3.x((c3)s.g, (v3)w.j());
        return (c3)s.j();
    }
    
    public final void b(final w7 w7) {
        final int a = w7.a();
        final Boolean c = w7.c;
        if (c != null) {
            this.e.set(a, c);
        }
        final Boolean d = w7.d;
        if (d != null) {
            this.d.set(a, d);
        }
        if (w7.e != null) {
            final Map f = this.f;
            final Integer value = a;
            final Long n = f.get(value);
            final long n2 = w7.e / 1000L;
            if (n == null || n2 > n) {
                this.f.put(value, n2);
            }
        }
        if (w7.f != null) {
            final b g = this.g;
            final Integer value2 = a;
            List list;
            if ((list = (List)g.getOrDefault((Object)value2, (Object)null)) == null) {
                list = new ArrayList();
                this.g.put((Object)value2, (Object)list);
            }
            if (w7.c()) {
                list.clear();
            }
            o.a();
            final f l = ((h4)this.h.f).l;
            final String a2 = this.a;
            final q2 w8 = r2.W;
            if (l.V(a2, w8) && w7.b()) {
                list.clear();
            }
            o.a();
            if (((h4)this.h.f).l.V(this.a, w8)) {
                final Long value3 = w7.f / 1000L;
                if (!list.contains(value3)) {
                    list.add(value3);
                }
            }
            else {
                list.add(w7.f / 1000L);
            }
        }
    }
}
