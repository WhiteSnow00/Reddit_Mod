// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import java.util.Map;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import cg.d;
import ci2.i;
import java.util.Collection;
import dg2.o;
import java.util.ArrayList;
import java.util.List;
import ci2.g;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import dh2.c;
import kotlin.reflect.jvm.internal.impl.load.java.a;

public final class b extends a<c>
{
    public b(final JavaTypeEnhancementState javaTypeEnhancementState) {
        e.f((Object)javaTypeEnhancementState, "javaTypeEnhancementState");
        super(javaTypeEnhancementState);
    }
    
    public static List l(final g g) {
        Object o;
        if (g instanceof ci2.b) {
            final Iterable iterable = (Iterable)((g)g).a;
            final ArrayList list = new ArrayList();
            final Iterator iterator = iterable.iterator();
            while (true) {
                o = list;
                if (!iterator.hasNext()) {
                    break;
                }
                dg2.o.B4((Iterable)l((g)iterator.next()), (Collection)list);
            }
        }
        else if (g instanceof i) {
            o = d.l3((Object)((i)g).c.d());
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (List)o;
    }
    
    public final ArrayList a(final Object o, final boolean b) {
        final c c = (c)o;
        e.f((Object)c, "<this>");
        final Map a = c.a();
        final ArrayList list = new ArrayList();
        for (final Map.Entry<yh2.e, V> entry : a.entrySet()) {
            final yh2.e e = entry.getKey();
            final g g = (g)entry.getValue();
            Object o2;
            if (b && !ng2.e.a((Object)e, (Object)s.b)) {
                o2 = EmptyList.INSTANCE;
            }
            else {
                o2 = l(g);
            }
            o.B4((Iterable)o2, (Collection)list);
        }
        return list;
    }
    
    public final yh2.c e(final Object o) {
        final c c = (c)o;
        e.f((Object)c, "<this>");
        return c.d();
    }
    
    public final ch2.c f(final Object o) {
        final c c = (c)o;
        e.f((Object)c, "<this>");
        final ch2.c d = DescriptorUtilsKt.d(c);
        e.c((Object)d);
        return d;
    }
    
    public final Iterable g(final Object o) {
        final c c = (c)o;
        e.f((Object)c, "<this>");
        final ch2.c d = DescriptorUtilsKt.d(c);
        if (d != null) {
            final Object o2 = ((dh2.a)d).getAnnotations();
            if (o2 != null) {
                return (Iterable)o2;
            }
        }
        final Object o2 = EmptyList.INSTANCE;
        return (Iterable)o2;
    }
}
