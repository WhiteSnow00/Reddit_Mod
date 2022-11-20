// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import oi2.t;
import kh2.b;
import kh2.q;
import oi2.w0;
import java.util.Iterator;
import java.util.List;
import ri2.j;
import oi2.w;
import oi2.p;
import ri2.f;
import ri2.k;
import java.util.ArrayList;
import dg2.m;
import ri2.d;
import sh2.i;
import ng2.e;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class AbstractSignatureParts$toIndexed$1$1 extends Lambda implements l<a$a, Iterable<? extends a$a>>
{
    public final ri2.l $this_with;
    public final a<Object> this$0;
    
    public AbstractSignatureParts$toIndexed$1$1(final a<Object> this$0, final ri2.l $this_with) {
        this.this$0 = this$0;
        this.$this_with = $this_with;
        super(1);
    }
    
    public final Iterable<a$a> invoke(final a$a a$a) {
        e.f((Object)a$a, "it");
        final boolean e = ((i)this.this$0).e;
        final Iterable<a$a> iterable = null;
        if (e) {
            final f a = a$a.a;
            w l = null;
            Label_0064: {
                if (a != null) {
                    final p j = this.$this_with.j(a);
                    if (j != null) {
                        l = this.$this_with.L((d)j);
                        break Label_0064;
                    }
                }
                l = null;
            }
            if (l != null) {
                return null;
            }
        }
        final f a2 = a$a.a;
        Iterable<a$a> iterable2 = iterable;
        if (a2 != null) {
            final j p = this.$this_with.p(a2);
            iterable2 = iterable;
            if (p != null) {
                final List m = this.$this_with.M(p);
                iterable2 = iterable;
                if (m != null) {
                    final List i0 = this.$this_with.i0(a$a.a);
                    final ri2.l $this_with = this.$this_with;
                    final a<Object> this$0 = this.this$0;
                    final Iterator iterator = m.iterator();
                    final Iterator iterator2 = i0.iterator();
                    final ArrayList list = new ArrayList<a$a>(Math.min(dg2.m.u4((Iterable)m, 10), dg2.m.u4((Iterable)i0, 10)));
                    while (iterator.hasNext() && iterator2.hasNext()) {
                        final Object next = iterator.next();
                        final ri2.i k = (ri2.i)iterator2.next();
                        final k k2 = (k)next;
                        a$a a$a2;
                        if ($this_with.P(k)) {
                            a$a2 = new a$a((f)null, a$a.b, k2);
                        }
                        else {
                            final w0 n0 = $this_with.n0(k);
                            final q b = a$a.b;
                            this$0.getClass();
                            final b q = ((i)this$0).c.a.q;
                            ng2.e.f((Object)n0, "<this>");
                            a$a2 = new a$a((f)n0, q.b(b, (Iterable)((t)n0).getAnnotations()), k2);
                        }
                        list.add(a$a2);
                    }
                    iterable2 = (Iterable<a$a>)list;
                }
            }
        }
        return iterable2;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((a$a)o);
    }
}
