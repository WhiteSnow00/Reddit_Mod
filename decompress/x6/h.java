// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import ng.s;
import ng.e0;
import ng.h0;
import ng.r;
import java.util.Map;
import java.util.Iterator;
import ke.g;
import ke.e;
import ke.o;
import java.util.HashMap;
import j5.f;
import ig.m0;

public final class h implements m0
{
    public final Object f = f;
    public final Object g = g;
    public final Object h = new HashMap();
    public final Object i = new HashMap();
    
    public final h a() {
        return new h(this, (f)this.g);
    }
    
    public final o b(final o o) {
        return ((f)this.g).c(this, o);
    }
    
    public final o c(final e e) {
        Object o = ke.o.f3;
        final Iterator m = e.m();
        while (m.hasNext()) {
            final o o2 = (o)(o = ((f)this.g).c(this, e.j((int)m.next())));
            if (o2 instanceof g) {
                o = o2;
                break;
            }
        }
        return (o)o;
    }
    
    public final o d(final String s) {
        if (((Map)this.h).containsKey(s)) {
            return ((Map)this.h).get(s);
        }
        final h h = (h)this.f;
        if (h != null) {
            return h.d(s);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", s));
    }
    
    public final void e(final String s, final o o) {
        if (((Map)this.i).containsKey(s)) {
            return;
        }
        if (o == null) {
            ((Map)this.h).remove(s);
            return;
        }
        ((Map)this.h).put(s, o);
    }
    
    public final void f(final String s, final o o) {
        if (!((Map)this.h).containsKey(s)) {
            final h h = (h)this.f;
            if (h != null) {
                if (h.g(s)) {
                    ((h)this.f).f(s, o);
                    return;
                }
            }
        }
        if (((Map)this.i).containsKey(s)) {
            return;
        }
        if (o == null) {
            ((Map)this.h).remove(s);
            return;
        }
        ((Map)this.h).put(s, o);
    }
    
    public final boolean g(final String s) {
        if (((Map)this.h).containsKey(s)) {
            return true;
        }
        final h h = (h)this.f;
        return h != null && h.g(s);
    }
}
