// 
// Decompiled by Procyon v0.6.0
// 

package sj2;

import java.lang.reflect.Array;
import ml0.a;
import lg.e0;
import java.util.Iterator;
import sg2.e;
import pj2.b;
import zg2.d;
import java.util.ArrayList;

public final class y0<ElementKlass, Element extends ElementKlass> extends p<Element, Element[], ArrayList<Element>>
{
    public final d<ElementKlass> b;
    public final c c;
    
    public y0(final d<ElementKlass> b, final b<Element> b2) {
        super((b)b2);
        this.b = b;
        this.c = new c(b2.getDescriptor());
    }
    
    public final Object a() {
        return new ArrayList();
    }
    
    public final int b(final Object o) {
        final ArrayList list = (ArrayList)o;
        e.f((Object)list, "<this>");
        return list.size();
    }
    
    public final Iterator c(final Object o) {
        final Object[] array = (Object[])o;
        e.f((Object)array, "<this>");
        return (Iterator)e0.X(array);
    }
    
    public final int d(final Object o) {
        final Object[] array = (Object[])o;
        e.f((Object)array, "<this>");
        return array.length;
    }
    
    public final Object g(final Object o) {
        e.f((Object)null, "<this>");
        throw null;
    }
    
    public final qj2.e getDescriptor() {
        return (qj2.e)this.c;
    }
    
    public final Object h(final Object o) {
        final ArrayList list = (ArrayList)o;
        e.f((Object)list, "<this>");
        final d<ElementKlass> b = this.b;
        e.f((Object)b, "eClass");
        final Object instance = Array.newInstance(a.J((d)b), list.size());
        e.d(instance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        final Object[] array = list.toArray((Object[])instance);
        e.e((Object)array, "toArray(java.lang.reflec\u2026.java, size) as Array<E>)");
        return array;
    }
    
    public final void i(final int n, final Object o, final Object o2) {
        final ArrayList list = (ArrayList)o;
        e.f((Object)list, "<this>");
        list.add(n, o2);
    }
}
