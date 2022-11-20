// 
// Decompiled by Procyon v0.6.0
// 

package u60;

import com.reddit.fragment.a0$b$a;
import com.reddit.fragment.a0$b;
import com.reddit.fragment.a0$a$a;
import com.reddit.fragment.a0$a;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import dl0.m9;
import dg2.m;
import com.reddit.fragment.a0;
import kotlin.collections.builders.ListBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import ng2.e;
import com.reddit.data.snoovatar.repository.usecase.a;

public final class b
{
    public final a a;
    
    @Inject
    public b(final a a) {
        e.f((Object)a, "fetchGooglePlaySkuPrices");
        this.a = a;
    }
    
    public static ArrayList a(List build) {
        e.f((Object)build, "<this>");
        final ListBuilder listBuilder = new ListBuilder(build.size() * 2);
        final Iterator iterator = build.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final m9 m9 = null;
            if (!hasNext) {
                break;
            }
            final a0 a0 = (a0)iterator.next();
            final a0$a b = a0.b;
            m9 a2 = null;
            Label_0085: {
                if (b != null) {
                    final a0$a$a b2 = b.b;
                    if (b2 != null) {
                        a2 = b2.a;
                        break Label_0085;
                    }
                }
                a2 = null;
            }
            ((List<m9>)listBuilder).add(a2);
            final a0$b c = a0.c;
            m9 a3 = m9;
            if (c != null) {
                final a0$b$a b3 = c.b;
                a3 = m9;
                if (b3 != null) {
                    a3 = b3.a;
                }
            }
            ((List<m9>)listBuilder).add(a3);
        }
        build = listBuilder.build();
        final ArrayList list = new ArrayList<String>(m.u4((Iterable)build, 10));
        for (final m9 m10 : build) {
            String c2;
            if (m10 != null) {
                c2 = m10.c;
            }
            else {
                c2 = null;
            }
            list.add(c2);
        }
        return CollectionsKt___CollectionsKt.Q4((Iterable)CollectionsKt___CollectionsKt.L4((Iterable)list));
    }
}
