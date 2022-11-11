// 
// Decompiled by Procyon v0.6.0
// 

package p60;

import kw0.f;
import java.util.Iterator;
import kw0.a$a;
import java.util.List;
import kw0.a$a$a;
import kotlin.collections.EmptyList;
import ig2.m;
import al0.b8;
import java.util.ArrayList;
import javax.inject.Inject;
import sg2.e;
import kw0.a;

public final class h implements p
{
    public final a a;
    
    @Inject
    public h(final a a) {
        e.f((Object)a, "findValidPricePackage");
        this.a = a;
    }
    
    public final b8 a(final ArrayList list) {
        e.f((Object)list, "pricePackages");
        final ArrayList list2 = new ArrayList(m.c3((Iterable)list, 10));
        for (final b8 b8 : list) {
            final String b9 = b8.b;
            Object o;
            if ((o = b8.d) == null) {
                o = EmptyList.INSTANCE;
            }
            list2.add(new a$a$a(b9, (List)o, b8.c, Long.parseLong(b8.f), b8.e.getRawValue(), Long.parseLong(b8.g)));
        }
        final f a = this.a.a(new a$a((List)list2));
        b8 b10 = null;
        final b8 b11 = null;
        if (a != null) {
            final Iterator iterator2 = list.iterator();
            Object next;
            do {
                next = b11;
                if (!iterator2.hasNext()) {
                    break;
                }
                next = iterator2.next();
            } while (!e.a((Object)((b8)next).b, (Object)a.a));
            b10 = (b8)next;
        }
        return b10;
    }
}
