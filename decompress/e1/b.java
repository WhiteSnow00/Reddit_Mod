// 
// Decompiled by Procyon v0.6.0
// 

package e1;

import kotlin.collections.AbstractCollection;
import d1.s;
import java.util.Iterator;
import androidx.compose.runtime.Recomposer$b;
import d1.c;
import b1.e;
import qg2.f;

public final class b<E> extends f<E> implements e<E>
{
    public static final b i;
    public final Object f;
    public final Object g;
    public final c<E, a> h;
    
    static {
        final a80.a j = a80.a.j;
        i = new b(j, j, c.h);
    }
    
    public b(final Object f, final Object g, final c<E, a> h) {
        ah2.f.f((Object)h, "hashMap");
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final b R(final Recomposer$b recomposer$b) {
        if (this.h.containsKey(recomposer$b)) {
            return this;
        }
        if (((AbstractCollection)this).isEmpty()) {
            return new b(recomposer$b, recomposer$b, this.h.a(recomposer$b, new a()));
        }
        final Object g = this.g;
        final a value = this.h.get(g);
        ah2.f.c((Object)value);
        return new b(this.f, recomposer$b, (c<Object, a>)this.h.a(g, new a(value.a, (Object)recomposer$b)).a(recomposer$b, new a(g, (Object)a80.a.j)));
    }
    
    public final int a() {
        final c<E, a> h = this.h;
        h.getClass();
        return h.g;
    }
    
    public final boolean contains(final Object o) {
        return this.h.containsKey(o);
    }
    
    public final Iterator<E> iterator() {
        return (Iterator<E>)new e1.c((c)this.h, this.f);
    }
    
    public final b remove(Object o) {
        final a a = this.h.get(o);
        if (a == null) {
            return this;
        }
        final c<E, a> h = this.h;
        final d1.s<E, a> f = h.f;
        final int n = 0;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final s v = f.v(hashCode, 0, o);
        if (h.f == v) {
            o = h;
        }
        else if (v == null) {
            o = c.h;
        }
        else {
            o = new c((d1.s<Object, Object>)v, h.g - 1);
        }
        final Object a2 = a.a;
        final a80.a j = a80.a.j;
        final boolean b = a2 != j;
        Object a3 = o;
        if (b) {
            final Object value = ((c<K, Object>)o).get(a2);
            ah2.f.c(value);
            a3 = ((c<Object, Object>)o).a(a.a, new a(((a)value).a, a.b));
        }
        final Object b2 = a.b;
        final boolean b3 = b2 != j;
        o = a3;
        if (b3) {
            o = ((c)a3).get(b2);
            ah2.f.c(o);
            o = ((c)a3).a(a.b, new a(a.a, ((a)o).b));
        }
        Object o2 = a.a;
        Object o3;
        if (o2 == j) {
            o3 = a.b;
        }
        else {
            o3 = this.f;
        }
        int n2 = n;
        if (a.b != j) {
            n2 = 1;
        }
        if (n2 != 0) {
            o2 = this.g;
        }
        return new b(o3, o2, (c<Object, a>)o);
    }
}
