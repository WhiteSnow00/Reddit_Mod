// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import x6.h;
import java.util.ArrayList;

public final class n extends i
{
    public final ArrayList h;
    public final ArrayList i;
    public h j;
    
    public n(final String s, final ArrayList list, final List list2, final h j) {
        super(s);
        this.h = new ArrayList();
        this.j = j;
        if (!list.isEmpty()) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.h.add(((o)iterator.next()).c());
            }
        }
        this.i = new ArrayList(list2);
    }
    
    public n(final n n) {
        super(n.f);
        (this.h = new ArrayList(n.h.size())).addAll(n.h);
        (this.i = new ArrayList(n.i.size())).addAll(n.i);
        this.j = n.j;
    }
    
    public final o h(final h h, final List list) {
        final h a = this.j.a();
        for (int i = 0; i < this.h.size(); ++i) {
            if (i < list.size()) {
                a.e((String)this.h.get(i), h.b((o)list.get(i)));
            }
            else {
                a.e((String)this.h.get(i), (o)o.f3);
            }
        }
        for (final o o : this.i) {
            o o2;
            if ((o2 = a.b(o)) instanceof p) {
                o2 = a.b(o);
            }
            if (o2 instanceof g) {
                return ((g)o2).f;
            }
        }
        return (o)o.f3;
    }
    
    public final o u() {
        return (o)new n(this);
    }
}
