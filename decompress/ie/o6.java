// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public final class o6 extends q6
{
    public static final Class c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    public final void a(final long n, final Object o) {
        final List list = (List)f8.j(n, o);
        Object o2;
        if (list instanceof n6) {
            o2 = ((n6)list).t();
        }
        else {
            if (o6.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof i7 && list instanceof j6) {
                final j6 j6 = (j6)list;
                if (j6.s()) {
                    j6.r();
                }
                return;
            }
            o2 = Collections.unmodifiableList((List<?>)list);
        }
        f8.q(o, n, o2);
    }
    
    public final void b(final Object o, final long n, final Object o2) {
        final List list = (List)f8.j(n, o2);
        final int size = list.size();
        final List list2 = (List)f8.j(n, o);
        Object o3;
        if (list2.isEmpty()) {
            if (list2 instanceof n6) {
                o3 = new m6(size);
            }
            else if (list2 instanceof i7 && list2 instanceof j6) {
                o3 = ((j6)list2).h(size);
            }
            else {
                o3 = new ArrayList(size);
            }
            f8.q(o, n, o3);
        }
        else if (o6.c.isAssignableFrom(((ArrayList)list2).getClass())) {
            o3 = new ArrayList(list2.size() + size);
            ((ArrayList)o3).addAll(list2);
            f8.q(o, n, o3);
        }
        else if (list2 instanceof a8) {
            o3 = new m6(list2.size() + size);
            ((m6)o3).addAll(((m6)o3).size(), (Collection)list2);
            f8.q(o, n, o3);
        }
        else {
            o3 = list2;
            if (list2 instanceof i7) {
                o3 = list2;
                if (list2 instanceof j6) {
                    final j6 j6 = (j6)list2;
                    o3 = list2;
                    if (!j6.s()) {
                        o3 = j6.h(list2.size() + size);
                        f8.q(o, n, o3);
                    }
                }
            }
        }
        final int size2 = ((List)o3).size();
        final int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            ((List)o3).addAll(list);
        }
        if (size2 <= 0) {
            o3 = list;
        }
        f8.q(o, n, o3);
    }
}
