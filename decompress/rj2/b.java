// 
// Decompiled by Procyon v0.6.0
// 

package rj2;

import ng2.k;
import ng2.e;
import java.util.List;
import lj2.f;
import mg2.l;
import ug2.d;
import java.util.Map;
import b6.h;

public final class b extends h
{
    public final Map<d<?>, a> f;
    public final Map<d<?>, Map<d<?>, lj2.b<?>>> g;
    public final Map<d<?>, l<?, f<?>>> h;
    public final Map<d<?>, Map<String, lj2.b<?>>> i;
    public final Map<d<?>, l<String, lj2.a<?>>> j;
    
    public b(final Map<d<?>, ? extends a> f, final Map<d<?>, ? extends Map<d<?>, ? extends lj2.b<?>>> g, final Map<d<?>, ? extends l<?, ? extends f<?>>> h, final Map<d<?>, ? extends Map<String, ? extends lj2.b<?>>> i, final Map<d<?>, ? extends l<? super String, ? extends lj2.a<?>>> j) {
        this.f = (Map<d<?>, a>)f;
        this.g = (Map<d<?>, Map<d<?>, lj2.b<?>>>)g;
        this.h = (Map<d<?>, l<?, f<?>>>)h;
        this.i = (Map<d<?>, Map<String, lj2.b<?>>>)i;
        this.j = (Map<d<?>, l<String, lj2.a<?>>>)j;
    }
    
    public final <T> lj2.b<T> J(final d<T> d, final List<? extends lj2.b<?>> list) {
        e.f((Object)list, "typeArgumentsSerializers");
        final a a = this.f.get(d);
        lj2.b b = null;
        lj2.b a2;
        if (a != null) {
            a2 = a.a();
        }
        else {
            a2 = null;
        }
        if (a2 instanceof lj2.b) {
            b = a2;
        }
        return (lj2.b<T>)b;
    }
    
    public final lj2.a L(final String s, final d d) {
        e.f((Object)d, "baseClass");
        final Map map = this.i.get(d);
        final lj2.a a = null;
        Object o;
        if (map != null) {
            o = map.get(s);
        }
        else {
            o = null;
        }
        if (!(o instanceof lj2.b)) {
            o = null;
        }
        if (o != null) {
            return (lj2.a)o;
        }
        final l<String, lj2.a<?>> value = this.j.get(d);
        l l;
        if (k.f(1, (Object)value)) {
            l = value;
        }
        else {
            l = null;
        }
        lj2.a a2 = a;
        if (l != null) {
            a2 = (lj2.a)l.invoke((Object)s);
        }
        return a2;
    }
    
    public final f M(final Object o, final d d) {
        e.f((Object)d, "baseClass");
        e.f(o, "value");
        final boolean instance = p7.a.q(d).isInstance(o);
        final f f = null;
        if (!instance) {
            return null;
        }
        final Map map = this.g.get(d);
        Object o2;
        if (map != null) {
            o2 = map.get(ng2.h.a((Class)o.getClass()));
        }
        else {
            o2 = null;
        }
        if (!(o2 instanceof f)) {
            o2 = null;
        }
        if (o2 != null) {
            return (f)o2;
        }
        final l<?, f<?>> value = this.h.get(d);
        l l;
        if (k.f(1, (Object)value)) {
            l = value;
        }
        else {
            l = null;
        }
        f f2 = f;
        if (l != null) {
            f2 = (f)l.invoke(o);
        }
        return f2;
    }
}
