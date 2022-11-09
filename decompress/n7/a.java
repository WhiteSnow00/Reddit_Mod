// 
// Decompiled by Procyon v0.6.0
// 

package n7;

import java.util.Iterator;
import qg2.m;
import java.util.ArrayList;
import com.apollographql.apollo.cache.normalized.internal.CacheMissException;
import java.util.List;
import com.apollographql.apollo.api.ResponseField;
import ah2.f;
import aj2.c;
import m7.e;
import h7.k$b;
import m7.j;
import j7.b;

public final class a implements b<j>
{
    public final d f;
    public final k$b g;
    public final e h;
    public final a i;
    public final n7.b j;
    
    public a(final d f, final k$b g, final e h, final a i, final c j) {
        ah2.f.g((Object)f, "readableCache");
        ah2.f.g((Object)g, "variables");
        ah2.f.g((Object)h, "cacheKeyResolver");
        ah2.f.g((Object)i, "cacheHeaders");
        ah2.f.g((Object)j, "cacheKeyBuilder");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = (n7.b)j;
    }
    
    public final Object a(final ResponseField responseField, final Object o) {
        final j j = (j)o;
        ah2.f.g((Object)j, "recordSet");
        ah2.f.g((Object)responseField, "field");
        final int n = a.a[responseField.a.ordinal()];
        Object o2;
        if (n != 1) {
            if (n != 2) {
                o2 = this.b(responseField, j);
            }
            else {
                o2 = this.c((List)this.b(responseField, j));
            }
        }
        else {
            final m7.d a = this.h.a(responseField, this.g);
            m7.f f;
            if (ah2.f.a((Object)a, (Object)m7.d.b)) {
                f = (m7.f)this.b(responseField, j);
            }
            else {
                f = new m7.f(a.a);
            }
            if (f == null) {
                o2 = null;
            }
            else {
                o2 = this.f.e(f.a, this.i);
                if (o2 == null) {
                    throw new IllegalStateException("Cache MISS: failed to find record in cache by reference".toString());
                }
            }
        }
        return o2;
    }
    
    public final Object b(final ResponseField responseField, final j j) {
        final String c = this.j.c(responseField, this.g);
        j.getClass();
        ah2.f.g((Object)c, "fieldKey");
        if (j.b.containsKey(c)) {
            return j.b.get(c);
        }
        throw new CacheMissException(j, responseField.c);
    }
    
    public final ArrayList c(final List list) {
        ArrayList list2;
        if (list == null) {
            list2 = null;
        }
        else {
            final ArrayList list3 = new ArrayList(m.P0((Iterable)list, 10));
            for (final Object next : list) {
                Object o;
                if (next instanceof m7.f) {
                    o = this.f.e(((m7.f)next).a, this.i);
                    if (o == null) {
                        throw new IllegalStateException("Cache MISS: failed to find record in cache by reference".toString());
                    }
                }
                else {
                    o = next;
                    if (next instanceof List) {
                        o = this.c((List)next);
                    }
                }
                list3.add(o);
            }
            list2 = list3;
        }
        return list2;
    }
}
