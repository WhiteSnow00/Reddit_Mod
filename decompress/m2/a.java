// 
// Decompiled by Procyon v0.6.0
// 

package m2;

import hg2.j;
import sg2.e;
import java.util.Collection;
import sg2.k;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.LinkedHashSet;
import java.util.HashMap;
import v0.i;

public final class a<K, V>
{
    public final i a;
    public final HashMap<K, V> b;
    public final LinkedHashSet<K> c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    public a() {
        this.a = new i(1);
        this.e = 16;
        this.b = new HashMap<K, V>(0, 0.75f);
        this.c = new LinkedHashSet<K>();
    }
    
    public final V a(final K k) {
        synchronized (this.a) {
            final V value = this.b.get(k);
            if (value != null) {
                this.c.remove(k);
                this.c.add(k);
                ++this.f;
                return value;
            }
            ++this.g;
            return null;
        }
    }
    
    public final V b(final K k, final V v) {
        if (k != null && v != null) {
            synchronized (this.a) {
                this.d = this.d() + 1;
                final V put = this.b.put(k, v);
                if (put != null) {
                    this.d = this.d() - 1;
                }
                if (this.c.contains(k)) {
                    this.c.remove(k);
                }
                this.c.add(k);
                monitorexit(this.a);
                final int e = this.e;
                while (true) {
                    final i a = this.a;
                    synchronized (this.a) {
                        if (this.d() < 0 || (this.b.isEmpty() && this.d() != 0) || this.b.isEmpty() != this.c.isEmpty()) {
                            throw new IllegalStateException("map/keySet size inconsistency");
                        }
                        Object z3;
                        V value;
                        if (this.d() > e && !this.b.isEmpty()) {
                            z3 = CollectionsKt___CollectionsKt.z3((Iterable)this.c);
                            value = this.b.get(z3);
                            if (value == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            k.c((Object)this.b).remove(z3);
                            final LinkedHashSet<K> c = this.c;
                            k.a((Collection)c);
                            c.remove(z3);
                            final int d = this.d();
                            sg2.e.c(z3);
                            this.d = d - 1;
                        }
                        else {
                            z3 = (value = null);
                        }
                        final j a2 = j.a;
                        monitorexit(this.a);
                        if (z3 == null && value == null) {
                            return put;
                        }
                        sg2.e.c(z3);
                        sg2.e.c((Object)value);
                        continue;
                    }
                }
            }
        }
        throw null;
    }
    
    public final V c(final K k) {
        k.getClass();
        synchronized (this.a) {
            final V remove = this.b.remove(k);
            this.c.remove(k);
            if (remove != null) {
                this.d = this.d() - 1;
            }
            final j a = j.a;
            return remove;
        }
    }
    
    public final int d() {
        synchronized (this.a) {
            return this.d;
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this.a) {
            final int f = this.f;
            final int n = this.g + f;
            int n2;
            if (n != 0) {
                n2 = f * 100 / n;
            }
            else {
                n2 = 0;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("LruCache[maxSize=");
            sb.append(this.e);
            sb.append(",hits=");
            sb.append(this.f);
            sb.append(",misses=");
            sb.append(this.g);
            sb.append(",hitRate=");
            sb.append(n2);
            sb.append("%]");
            return sb.toString();
        }
    }
}
