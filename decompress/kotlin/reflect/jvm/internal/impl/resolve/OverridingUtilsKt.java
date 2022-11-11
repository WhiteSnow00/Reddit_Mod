// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import zi2.d;
import java.util.LinkedList;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import rg2.l;
import java.util.Collection;

public final class OverridingUtilsKt
{
    public static final <H> Collection<H> a(final Collection<? extends H> collection, final l<? super H, ? extends a> l) {
        e.f((Object)collection, "<this>");
        e.f((Object)l, "descriptorByHandle");
        if (collection.size() <= 1) {
            return (Collection<H>)collection;
        }
        final LinkedList list = new LinkedList((Collection<? extends E>)collection);
        final d d = new d();
        while (list.isEmpty() ^ true) {
            final Object a3 = CollectionsKt___CollectionsKt.A3((List)list);
            final d d2 = new d();
            final ArrayList g = OverridingUtil.g(a3, list, l, (l)new OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(d2));
            if (g.size() == 1 && ((AbstractCollection)d2).isEmpty()) {
                final Object a4 = CollectionsKt___CollectionsKt.a4((Collection)g);
                e.e(a4, "overridableGroup.single()");
                d.add(a4);
            }
            else {
                final Object s = OverridingUtil.s(g, (l<Object, a>)l);
                final a a5 = l.invoke(s);
                for (final Object next : g) {
                    e.e(next, "it");
                    if (!OverridingUtil.k(a5, l.invoke(next))) {
                        d2.add(next);
                    }
                }
                if (((AbstractCollection)d2).isEmpty() ^ true) {
                    ((AbstractCollection<Object>)d).addAll((Collection<?>)d2);
                }
                d.add(s);
            }
        }
        return (Collection<H>)d;
    }
}
