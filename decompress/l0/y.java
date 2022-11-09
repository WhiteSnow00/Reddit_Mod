// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import zg2.l;
import java.util.Iterator;
import kotlin.Pair;
import java.util.Map;
import java.util.LinkedHashMap;
import a4.u1;
import ah2.f;

public final class y<T> implements p<T>
{
    public final b<T> a;
    
    public y(final b<T> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof y && f.a((Object)this.a, (Object)((y)o).a);
    }
    
    public final <V extends i> r0<V> f(final g0<T, V> g0) {
        f.f((Object)g0, "converter");
        final LinkedHashMap b = this.a.b;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(u1.A0(b.size()));
        for (final Map.Entry<Object, V> entry : b.entrySet()) {
            final Object key = entry.getKey();
            final a a = (a)entry.getValue();
            final zg2.l<T, V> a2 = g0.a();
            a.getClass();
            f.f((Object)a2, "convertToVector");
            linkedHashMap.put(key, (Object)new Pair(a2.invoke((Object)a.a), (Object)a.b));
        }
        return new r0<V>(linkedHashMap, this.a.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public static final class a<T>
    {
        public final T a;
        public q b;
        
        public a() {
            throw null;
        }
        
        public a(final Float a) {
            final q a2 = r.r$a.a;
            this.a = (T)a;
            this.b = a2;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o instanceof a) {
                final a a = (a)o;
                if (f.a((Object)a.a, (Object)this.a) && f.a((Object)a.b, (Object)this.b)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final T a = this.a;
            int hashCode;
            if (a != null) {
                hashCode = a.hashCode();
            }
            else {
                hashCode = 0;
            }
            return this.b.hashCode() + hashCode * 31;
        }
    }
    
    public static final class b<T>
    {
        public int a;
        public final LinkedHashMap b;
        
        public b() {
            this.a = 300;
            this.b = new LinkedHashMap();
        }
        
        public final a a(final int n, final Float n2) {
            final a a = new a(n2);
            this.b.put(n, a);
            return a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o instanceof b) {
                final b b = (b)o;
                b.getClass();
                if (this.a == b.a && f.a((Object)this.b, (Object)b.b)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + (this.a * 31 + 0) * 31;
        }
    }
}
