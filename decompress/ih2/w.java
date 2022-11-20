// 
// Decompiled by Procyon v0.6.0
// 

package ih2;

import rh2.d;
import yh2.b;
import java.util.Iterator;
import rh2.a;
import yh2.c;
import ng2.e;
import java.lang.reflect.Type;

public abstract class w implements rh2.w
{
    public abstract Type P();
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof w && e.a((Object)this.P(), (Object)((w)o).P());
    }
    
    @Override
    public final int hashCode() {
        return this.P().hashCode();
    }
    
    public a l(final c c) {
        e.f((Object)c, "fqName");
        final Iterator iterator = ((d)this).getAnnotations().iterator();
        Object b;
        Object next;
        do {
            final boolean hasNext = iterator.hasNext();
            final a a = null;
            final Object o = null;
            if (!hasNext) {
                return a;
            }
            next = iterator.next();
            final b b2 = ((a)next).b();
            b = o;
            if (b2 == null) {
                continue;
            }
            b = b2.b();
        } while (!e.a(b, (Object)c));
        return (a)next;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(": ");
        sb.append(this.P());
        return sb.toString();
    }
}
