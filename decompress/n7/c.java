// 
// Decompiled by Procyon v0.6.0
// 

package n7;

import kotlin.collections.EmptySet;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.Set;
import m7.b;
import h7.n$a;
import h7.n;
import h7.k$b;
import h7.k$a;
import m7.j;
import j7.h;
import h7.k;
import m7.a;

public final class c implements a, d, i
{
    public final <D extends k$a, T, V extends k$b> m7.c<n<T>> a(final k<D, T, V> k, final h<D> h, final f<j> f, final l7.a a) {
        ah2.f.g((Object)k, "operation");
        ah2.f.g((Object)h, "responseFieldMapper");
        ah2.f.g((Object)f, "responseNormalizer");
        ah2.f.g((Object)a, "cacheHeaders");
        return (m7.c<n<T>>)new b(new n$a((k)k).a(), new h5.d(1));
    }
    
    public final void b(final Set<String> set) {
        ah2.f.g((Object)set, "keys");
    }
    
    public final <R> R c(final n7.h<i, R> h) {
        final R execute = h.execute(this);
        if (execute != null) {
            return execute;
        }
        ah2.f.m();
        throw null;
    }
    
    public final f<j> d() {
        return (f<j>)f.h;
    }
    
    public final j e(final String s, final l7.a a) {
        ah2.f.g((Object)s, "key");
        ah2.f.g((Object)a, "cacheHeaders");
        return null;
    }
    
    public final <D extends k$a, T, V extends k$b> m7.c<Boolean> f(final k<D, T, V> k, final D n, final UUID uuid) {
        ah2.f.g((Object)k, "operation");
        ah2.f.g((Object)n, "operationData");
        ah2.f.g((Object)uuid, "mutationId");
        final Boolean false = Boolean.FALSE;
        ah2.f.b((Object)false, "FALSE");
        return (m7.c<Boolean>)new b(false, new h5.d(1));
    }
    
    public final f<Map<String, Object>> g() {
        return (f<Map<String, Object>>)f.h;
    }
    
    public final Set<String> h(final Collection<j> collection, final l7.a a) {
        ah2.f.g((Object)collection, "recordCollection");
        ah2.f.g((Object)a, "cacheHeaders");
        return (Set<String>)EmptySet.INSTANCE;
    }
    
    public final m7.c<Boolean> i(final UUID uuid) {
        ah2.f.g((Object)uuid, "mutationId");
        final Boolean false = Boolean.FALSE;
        ah2.f.b((Object)false, "FALSE");
        return (m7.c<Boolean>)new b(false, new h5.d(1));
    }
    
    public final m7.c<Set<String>> j(final UUID uuid) {
        ah2.f.g((Object)uuid, "mutationId");
        return (m7.c<Set<String>>)new b(EmptySet.INSTANCE, new h5.d(1));
    }
}
