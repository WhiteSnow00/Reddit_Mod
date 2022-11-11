// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import lg.e0;
import android.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import yb.f;
import com.google.common.collect.Iterators;
import ec.b;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import ad.c0;
import java.util.Random;
import java.util.HashMap;

public final class a
{
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;
    
    public a() {
        final Random d = new Random();
        this.c = new HashMap();
        this.d = d;
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public static void a(final Object o, final long n, final HashMap hashMap) {
        long max = n;
        if (hashMap.containsKey(o)) {
            final Long n2 = hashMap.get(o);
            final int a = c0.a;
            max = Math.max(n, n2);
        }
        hashMap.put(o, max);
    }
    
    public static void c(final long n, final HashMap hashMap) {
        final ArrayList list = new ArrayList();
        for (final Map.Entry<K, Long> entry : hashMap.entrySet()) {
            if (entry.getValue() <= n) {
                list.add(entry.getKey());
            }
        }
        for (int i = 0; i < list.size(); ++i) {
            hashMap.remove(list.get(i));
        }
    }
    
    public final ArrayList b(final ImmutableList list) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        c(elapsedRealtime, this.a);
        c(elapsedRealtime, this.b);
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < ((List)list).size(); ++i) {
            final b b = ((List<b>)list).get(i);
            if (!this.a.containsKey(b.b) && !this.b.containsKey(b.c)) {
                list2.add(b);
            }
        }
        return list2;
    }
    
    public final b d(final ImmutableList list) {
        final ArrayList b = this.b(list);
        if (b.size() < 2) {
            return (b)Iterators.d((String)null, (Iterator)b.iterator());
        }
        Collections.sort((List<Object>)b, (Comparator<? super Object>)new f(1));
        final ArrayList list2 = new ArrayList();
        final int n = 0;
        final int c = b.get(0).c;
        int i = 0;
        while (i < b.size()) {
            final b b2 = b.get(i);
            if (c != b2.c) {
                if (list2.size() == 1) {
                    return (b)b.get(0);
                }
                break;
            }
            else {
                list2.add(new Pair((Object)b2.b, (Object)b2.d));
                ++i;
            }
        }
        b b3;
        if ((b3 = this.c.get(list2)) == null) {
            final List subList = b.subList(0, list2.size());
            int n2;
            for (int j = n2 = 0; j < subList.size(); ++j) {
                n2 += ((b)subList.get(j)).d;
            }
            final int nextInt = this.d.nextInt(n2);
            int n3 = 0;
            while (true) {
                for (int k = n; k < subList.size(); ++k) {
                    b3 = (b)subList.get(k);
                    n3 += b3.d;
                    if (nextInt < n3) {
                        this.c.put(list2, b3);
                        return b3;
                    }
                }
                b3 = (b)e0.Q((Iterable)subList);
                continue;
            }
        }
        return b3;
    }
}
