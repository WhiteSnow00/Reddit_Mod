// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public final class j0 extends l0
{
    public static final Class c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    public static List d(final Object o, final int n, final long n2) {
        final List list = (List)b2.j(n2, o);
        Object h;
        if (list.isEmpty()) {
            if (list instanceof i0) {
                h = new h0(n);
            }
            else if (list instanceof d1 && list instanceof e0) {
                h = ((e0)list).h(n);
            }
            else {
                h = new ArrayList<Object>(n);
            }
            b2.s(o, n2, h);
        }
        else {
            ArrayList list3;
            if (j0.c.isAssignableFrom(((w1)list).getClass())) {
                final ArrayList list2 = new ArrayList(list.size() + n);
                list2.addAll(list);
                b2.s(o, n2, (Object)list2);
                list3 = list2;
            }
            else if (list instanceof w1) {
                final h0 h2 = new h0(list.size() + n);
                h2.addAll(h2.size(), list);
                b2.s(o, n2, (Object)h2);
                list3 = (ArrayList)h2;
            }
            else {
                h = list;
                if (!(list instanceof d1)) {
                    return (List)h;
                }
                h = list;
                if (!(list instanceof e0)) {
                    return (List)h;
                }
                final e0 e0 = (e0)list;
                if (e0.s()) {
                    h = list;
                    return (List)h;
                }
                final e0 h3 = e0.h(list.size() + n);
                b2.s(o, n2, (Object)h3);
                return (List)h3;
            }
            h = list3;
        }
        return (List)h;
    }
    
    public final List a(final long n, final Object o) {
        return d(o, 10, n);
    }
    
    public final void b(final long n, final Object o) {
        final List list = (List)b2.j(n, o);
        Object o2;
        if (list instanceof i0) {
            o2 = ((i0)list).t();
        }
        else {
            if (j0.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof d1 && list instanceof e0) {
                final e0 e0 = (e0)list;
                if (e0.s()) {
                    e0.r();
                }
                return;
            }
            o2 = Collections.unmodifiableList((List<?>)list);
        }
        b2.s(o, n, o2);
    }
    
    public final void c(final Object o, final long n, final Object o2) {
        List list = (List)b2.j(n, o2);
        final List d = d(o, list.size(), n);
        final int size = d.size();
        final int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        b2.s(o, n, (Object)list);
    }
}
