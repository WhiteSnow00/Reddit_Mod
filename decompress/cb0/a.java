// 
// Decompiled by Procyon v0.6.0
// 

package cb0;

import zg2.l;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import ah2.c;
import ah2.f;
import java.util.List;
import com.reddit.domain.model.ILink;

public final class a<T extends ILink> implements i<T>
{
    @Override
    public final List<T> a(final List<? extends T> list, final j<T> j) {
        f.f((Object)list, "items");
        List<T> a;
        if (j != null) {
            a = j.a;
        }
        else {
            a = null;
        }
        final int n = 0;
        int n2 = 0;
        Label_0123: {
            if (a != null && !a.isEmpty()) {
                final int l = c.L((List)a);
                final ListIterator listIterator = a.listIterator(a.size());
                while (true) {
                    while (listIterator.hasPrevious()) {
                        if (((ILink)listIterator.previous()).getPromoted()) {
                            final int nextIndex = listIterator.nextIndex();
                            n2 = l - nextIndex;
                            break Label_0123;
                        }
                    }
                    final int nextIndex = -1;
                    continue;
                }
            }
            n2 = 3;
        }
        final int n3 = -n2 - 1;
        final ArrayList list2 = new ArrayList();
        final Iterator<? extends T> iterator = list.iterator();
        int n4 = n;
        int n5 = n3;
        while (iterator.hasNext()) {
            final ILink link = (ILink)iterator.next();
            if (link.getPromoted()) {
                final int n6 = n4 - list2.size();
                if (n6 - n5 <= 3) {
                    list2.add(link);
                }
                else {
                    n5 = n6;
                }
            }
            ++n4;
        }
        for (final ILink link2 : list2) {
            if (j != null) {
                final l<ILink, pg2.j> c = j.c;
                if (c == null) {
                    continue;
                }
                c.invoke((Object)link2);
            }
        }
        return CollectionsKt___CollectionsKt.J1((Iterable)list, (List)list2);
    }
}
