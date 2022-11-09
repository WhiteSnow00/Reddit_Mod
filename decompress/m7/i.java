// 
// Decompiled by Procyon v0.6.0
// 

package m7;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.Collection;
import kotlin.collections.builders.SetBuilder;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.EmptySet;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.c;
import java.util.LinkedHashMap;
import a4.u1;
import qg2.m;
import java.util.ArrayList;
import ah2.f;
import l7.a;
import com.nytimes.android.external.cache.CacheBuilder;
import qt.b;

public final class i extends g
{
    public final b<String, i.i$a> b;
    
    public i() {
        this.b = (b<String, i.i$a>)new CacheBuilder().a();
    }
    
    public final j a(final String s, final a a) {
        f.g((Object)s, "key");
        f.g((Object)a, "cacheHeaders");
        final j j = null;
        try {
            final g a2 = super.a;
            j a3;
            if (a2 == null) {
                a3 = null;
            }
            else {
                a3 = a2.a(s, a);
            }
            return this.e(a3, s);
        }
        catch (final Exception ex) {
            return j;
        }
    }
    
    public final ArrayList b(final ArrayList list, final a a) {
        f.g((Object)a, "cacheHeaders");
        final g a2 = super.a;
        Map<String, j> map = null;
        Label_0114: {
            if (a2 != null) {
                final ArrayList b = a2.b(list, a);
                if (b != null) {
                    int a3;
                    if ((a3 = u1.A0(m.P0((Iterable)b, 10))) < 16) {
                        a3 = 16;
                    }
                    map = new LinkedHashMap<String, j>(a3);
                    for (final Object next : b) {
                        map.put(((j)next).a, (j)next);
                    }
                    break Label_0114;
                }
            }
            map = null;
        }
        Map<String, j> n1;
        if ((n1 = map) == null) {
            n1 = c.N1();
        }
        final ArrayList<j> list2 = new ArrayList<j>();
        for (final String s : list) {
            final j e = this.e(n1.get(s), s);
            if (e != null) {
                list2.add(e);
            }
        }
        return list2;
    }
    
    public final EmptySet d(final j j, final a a) {
        f.g((Object)a, "cacheHeaders");
        return EmptySet.INSTANCE;
    }
    
    public final j e(j a, final String s) {
        final i.i$a i$a = (i.i$a)this.b.getIfPresent((Object)s);
        j a2 = a;
        if (i$a != null) {
            if (a == null) {
                a = null;
            }
            else {
                a = a.b().a();
                a.a(i$a.a);
            }
            a2 = a;
            if (a == null) {
                a2 = i$a.a.b().a();
            }
        }
        return a2;
    }
    
    public final LinkedHashSet f(final UUID uuid) {
        f.g((Object)uuid, "mutationId");
        final LinkedHashSet set = new LinkedHashSet();
        final LinkedHashSet set2 = new LinkedHashSet();
        final ConcurrentMap map = this.b.asMap();
        f.b((Object)map, "lruCache.asMap()");
    Label_0054:
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final i.i$a i$a = (i.i$a)entry.getValue();
            i$a.getClass();
            final Iterator iterator2 = i$a.b.iterator();
            int n = 0;
            while (true) {
                while (iterator2.hasNext()) {
                    if (f.a((Object)uuid, (Object)((j)iterator2.next()).c)) {
                        Object o;
                        if (n == -1) {
                            o = EmptySet.INSTANCE;
                        }
                        else {
                            final SetBuilder setBuilder = new SetBuilder();
                            ((Set)setBuilder).add(((j)i$a.b.remove(n)).a);
                            final int n2 = n - 1;
                            int max = Math.max(0, n2);
                            final int size = i$a.b.size();
                            if (max < size) {
                                while (true) {
                                    final int n3 = max + 1;
                                    final j j = (j)i$a.b.get(max);
                                    if (max == Math.max(0, n2)) {
                                        i$a.a = j.b().a();
                                    }
                                    else {
                                        ((Set)setBuilder).addAll(i$a.a.a(j));
                                    }
                                    if (n3 >= size) {
                                        break;
                                    }
                                    max = n3;
                                }
                            }
                            o = setBuilder.build();
                        }
                        set.addAll((Collection)o);
                        if (i$a.b.isEmpty()) {
                            f.b((Object)s, "cacheKey");
                            set2.add(s);
                            continue Label_0054;
                        }
                        continue Label_0054;
                    }
                    else {
                        ++n;
                    }
                }
                n = -1;
                continue;
            }
        }
        this.b.invalidateAll((Iterable)set2);
        return set;
    }
}
