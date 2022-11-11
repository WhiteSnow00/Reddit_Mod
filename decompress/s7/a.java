// 
// Decompiled by Procyon v0.6.0
// 

package s7;

import h7.k;
import com.apollographql.apollo.c;
import h7.j;
import java.util.HashSet;
import com.apollographql.apollo.d;
import h7.m;
import com.apollographql.apollo.ApolloCall;
import java.util.Set;
import h7.l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

public final class a
{
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final AtomicInteger d;
    
    public a() {
        new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new AtomicInteger();
    }
    
    public static void c(final HashMap hashMap, final l l, final Object o) {
        synchronized (hashMap) {
            final Set set = hashMap.get(l);
            if (set != null && set.remove(o)) {
                if (set.isEmpty()) {
                    hashMap.remove(l);
                }
                return;
            }
            throw new AssertionError((Object)"Call wasn't registered before");
        }
    }
    
    public final void a(final ApolloCall apolloCall) {
        if (apolloCall != null) {
            final k operation = apolloCall.operation();
            if (operation instanceof m) {
                final d d = (d)apolloCall;
                final l name = ((ApolloCall)d).operation().name();
                final HashMap hashMap = this.a;
                synchronized (hashMap) {
                    Set set;
                    if ((set = hashMap.get(name)) == null) {
                        set = new HashSet();
                        hashMap.put(name, set);
                    }
                    set.add(d);
                    monitorexit(hashMap);
                    this.d.incrementAndGet();
                    return;
                }
            }
            if (!(operation instanceof j)) {
                throw new IllegalArgumentException("Unknown call type");
            }
            final c c = (c)apolloCall;
            final l name2 = ((ApolloCall)c).operation().name();
            final HashMap hashMap = this.b;
            synchronized (hashMap) {
                Set set2;
                if ((set2 = hashMap.get(name2)) == null) {
                    set2 = new HashSet();
                    hashMap.put(name2, set2);
                }
                set2.add(c);
                monitorexit(hashMap);
                this.d.incrementAndGet();
                return;
            }
            throw new IllegalArgumentException("Unknown call type");
        }
        throw new NullPointerException("call == null");
    }
    
    public final void b(final ApolloCall apolloCall) {
        if (apolloCall != null) {
            final k operation = apolloCall.operation();
            if (operation instanceof m) {
                final d d = (d)apolloCall;
                c(this.a, ((ApolloCall)d).operation().name(), d);
                this.d.decrementAndGet();
            }
            else {
                if (!(operation instanceof j)) {
                    throw new IllegalArgumentException("Unknown call type");
                }
                final c c = (c)apolloCall;
                c(this.b, ((ApolloCall)c).operation().name(), c);
                this.d.decrementAndGet();
            }
            return;
        }
        throw new NullPointerException("call == null");
    }
}
