// 
// Decompiled by Procyon v0.6.0
// 

package zg2;

import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import ng2.e;
import yh2.c;
import java.util.ArrayList;
import dg2.m;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import java.util.LinkedHashSet;

public final class b
{
    public static final LinkedHashSet a;
    
    static {
        final Set number_TYPES = PrimitiveType.NUMBER_TYPES;
        final ArrayList list = new ArrayList<c>(m.u4((Iterable)number_TYPES, 10));
        for (final PrimitiveType primitiveType : number_TYPES) {
            e.f((Object)primitiveType, "primitiveType");
            list.add(kotlin.reflect.jvm.internal.impl.builtins.e.j.c(primitiveType.getTypeName()));
        }
        final c i = e$a.f.i();
        e.e((Object)i, "string.toSafe()");
        final ArrayList p5 = CollectionsKt___CollectionsKt.p5((Collection)list, (Object)i);
        final c j = e$a.h.i();
        e.e((Object)j, "_boolean.toSafe()");
        final ArrayList p6 = CollectionsKt___CollectionsKt.p5((Collection)p5, (Object)j);
        final c k = e$a.j.i();
        e.e((Object)k, "_enum.toSafe()");
        final ArrayList p7 = CollectionsKt___CollectionsKt.p5((Collection)p6, (Object)k);
        final LinkedHashSet a2 = new LinkedHashSet();
        final Iterator iterator2 = p7.iterator();
        while (iterator2.hasNext()) {
            a2.add(yh2.b.l((c)iterator2.next()));
        }
        a = a2;
    }
}
