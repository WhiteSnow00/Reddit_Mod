// 
// Decompiled by Procyon v0.6.0
// 

package vj2;

import sg2.h;
import sg2.k;
import sg2.e;
import java.util.List;
import pj2.f;
import rg2.l;
import zg2.d;
import java.util.Map;

public final class b extends android.support.v4.media.b
{
    public final Map<d<?>, a> f;
    public final Map<d<?>, Map<d<?>, pj2.b<?>>> g;
    public final Map<d<?>, l<?, f<?>>> h;
    public final Map<d<?>, Map<String, pj2.b<?>>> i;
    public final Map<d<?>, l<String, pj2.a<?>>> j;
    
    public b(final Map<d<?>, ? extends a> f, final Map<d<?>, ? extends Map<d<?>, ? extends pj2.b<?>>> g, final Map<d<?>, ? extends l<?, ? extends f<?>>> h, final Map<d<?>, ? extends Map<String, ? extends pj2.b<?>>> i, final Map<d<?>, ? extends l<? super String, ? extends pj2.a<?>>> j) {
        this.f = (Map<d<?>, a>)f;
        this.g = (Map<d<?>, Map<d<?>, pj2.b<?>>>)g;
        this.h = (Map<d<?>, l<?, f<?>>>)h;
        this.i = (Map<d<?>, Map<String, pj2.b<?>>>)i;
        this.j = (Map<d<?>, l<String, pj2.a<?>>>)j;
    }
    
    public final <T> pj2.b<T> P(final d<T> d, final List<? extends pj2.b<?>> list) {
        e.f((Object)list, "typeArgumentsSerializers");
        final a a = this.f.get(d);
        pj2.b b = null;
        pj2.b a2;
        if (a != null) {
            a2 = a.a();
        }
        else {
            a2 = null;
        }
        if (a2 instanceof pj2.b) {
            b = a2;
        }
        return (pj2.b<T>)b;
    }
    
    public final pj2.a T(final String s, final d d) {
        e.f((Object)d, "baseClass");
        final Map map = this.i.get(d);
        final pj2.a a = null;
        Object o;
        if (map != null) {
            o = map.get(s);
        }
        else {
            o = null;
        }
        if (!(o instanceof pj2.b)) {
            o = null;
        }
        if (o != null) {
            return (pj2.a)o;
        }
        final l value = this.j.get(d);
        l l;
        if (k.f(1, (Object)value)) {
            l = value;
        }
        else {
            l = null;
        }
        pj2.a a2 = a;
        if (l != null) {
            a2 = (pj2.a)l.invoke(s);
        }
        return a2;
    }
    
    public final f U(final Object o, final d d) {
        e.f((Object)d, "baseClass");
        e.f(o, "value");
        final boolean instance = ml0.a.K(d).isInstance(o);
        final f f = null;
        if (!instance) {
            return null;
        }
        final Map map = this.g.get(d);
        Object o2;
        if (map != null) {
            o2 = map.get(sg2.h.a((Class)o.getClass()));
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
        final l value = this.h.get(d);
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
