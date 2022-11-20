// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import java.util.Iterator;
import ng2.e;
import kotlin.collections.EmptyList;
import java.util.List;
import og2.a;

public final class i extends k implements Iterable<k>, a
{
    public final String f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final List<d> n;
    public final List<k> o;
    
    public i() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, (List<? extends d>)s1.j.a, (List<? extends k>)EmptyList.INSTANCE);
    }
    
    public i(final String f, final float g, final float h, final float i, final float j, final float k, final float l, final float m, final List<? extends d> n, final List<? extends k> o) {
        e.f((Object)f, "name");
        e.f((Object)n, "clipPathData");
        e.f((Object)o, "children");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = (List<d>)n;
        this.o = (List<k>)o;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof i) {
            final String f = this.f;
            final i i = (i)o;
            return e.a((Object)f, (Object)i.f) && this.g == i.g && this.h == i.h && this.i == i.i && this.j == i.j && this.k == i.k && this.l == i.l && this.m == i.m && e.a((Object)this.n, (Object)i.n) && e.a((Object)this.o, (Object)i.o);
        }
        return false;
    }
    
    public final int hashCode() {
        return this.o.hashCode() + ph0.a.b((List)this.n, aq2.a.b(this.m, aq2.a.b(this.l, aq2.a.b(this.k, aq2.a.b(this.j, aq2.a.b(this.i, aq2.a.b(this.h, aq2.a.b(this.g, this.f.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
    
    @Override
    public final Iterator<k> iterator() {
        return new Iterator<k>(this) {
            public final Iterator<k> f = i.o.iterator();
            
            @Override
            public final boolean hasNext() {
                return this.f.hasNext();
            }
            
            @Override
            public final Object next() {
                return this.f.next();
            }
            
            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
