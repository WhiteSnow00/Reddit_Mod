// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import androidx.paging.LoadType;
import rg2.l;
import yg2.i;
import java.util.List;
import lw0.b;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import androidx.paging.PageEvent$Insert;
import java.util.ArrayList;

public final class q<T>
{
    public static final q<Object> e;
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    
    static {
        e = new q<Object>((androidx.paging.PageEvent$Insert<Object>)PageEvent$Insert.g);
    }
    
    public q(final PageEvent$Insert<T> pageEvent$Insert) {
        sg2.e.f((Object)pageEvent$Insert, "insertEvent");
        this.a = CollectionsKt___CollectionsKt.r4((Collection)pageEvent$Insert.b);
        final Iterator iterator = pageEvent$Insert.b.iterator();
        int b = 0;
        while (iterator.hasNext()) {
            b += ((z)iterator.next()).b.size();
        }
        this.b = b;
        this.c = pageEvent$Insert.c;
        this.d = pageEvent$Insert.d;
    }
    
    public final b0.a a(final int n) {
        int n2 = n - this.c;
        boolean b = false;
        int n3;
        for (n3 = 0; n2 >= ((z)this.a.get(n3)).b.size() && n3 < lw0.b.L0((List)this.a); n2 -= ((z)this.a.get(n3)).b.size(), ++n3) {}
        final z z = this.a.get(n3);
        final int c = this.c;
        final int d = this.d();
        final int d2 = this.d;
        final Integer l1 = kotlin.collections.b.l1(((z)CollectionsKt___CollectionsKt.A3((List)this.a)).a);
        sg2.e.c((Object)l1);
        final int intValue = l1;
        final Integer k1 = kotlin.collections.b.k1(((z)CollectionsKt___CollectionsKt.K3((List)this.a)).a);
        sg2.e.c((Object)k1);
        final int intValue2 = k1;
        final int c2 = z.c;
        final List<Integer> d3 = z.d;
        if (d3 != null) {
            if (lw0.b.J0((Collection)d3).k(n2)) {
                b = true;
            }
        }
        int intValue3 = n2;
        if (b) {
            intValue3 = z.d.get(n2).intValue();
        }
        return new b0.a(c2, intValue3, n - c, d - n - d2 - 1, intValue, intValue2);
    }
    
    public final int b(final i i) {
        final Iterator iterator = this.a.iterator();
        int n = 0;
    Label_0010:
        while (iterator.hasNext()) {
            final z z = (z)iterator.next();
            final int[] a = z.a;
            final int length = a.length;
            int j = 0;
            while (true) {
                while (j < length) {
                    if (i.k(a[j])) {
                        final boolean b = true;
                        if (b) {
                            n += z.b.size();
                            iterator.remove();
                            continue Label_0010;
                        }
                        continue Label_0010;
                    }
                    else {
                        ++j;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
        return n;
    }
    
    public final T c(int i) {
        final int size = this.a.size();
        final int n = 0;
        int n2 = i;
        int size2;
        for (i = n; i < size; ++i) {
            size2 = this.a.get(i).b.size();
            if (size2 > n2) {
                break;
            }
            n2 -= size2;
        }
        return (T)this.a.get(i).b.get(n2);
    }
    
    public final int d() {
        return this.c + this.b + this.d;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final ArrayList list = new ArrayList<Object>(b);
        for (int i = 0; i < b; ++i) {
            list.add(this.c(i));
        }
        final String i2 = CollectionsKt___CollectionsKt.I3((Iterable)list, (CharSequence)null, (String)null, (String)null, (l)null, 63);
        final StringBuilder r = a.r("[(");
        r.append(this.c);
        r.append(" placeholders), ");
        r.append(i2);
        r.append(", (");
        return al0.a.l(r, this.d, " placeholders)]");
    }
}
