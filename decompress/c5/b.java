// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.paging.PagingDataDiffer;
import b5.b0;
import b5.c0;
import java.util.Iterator;
import b5.r;
import java.util.Collection;
import dg2.o;
import b5.a0;
import java.util.ArrayList;
import zi2.g1;
import androidx.paging.compose.a;
import java.util.List;
import b5.j;
import kotlin.collections.EmptyList;
import ej2.m;
import z0.k0;
import b5.t;
import cj2.e;

public final class b<T>
{
    public final e<t<T>> a;
    public final k0 b;
    public final b$b c;
    public final k0 d;
    
    public b(final e<t<T>> a) {
        ng2.e.f((Object)a, "flow");
        this.a = a;
        final ij2.b a2 = zi2.k0.a;
        final g1 a3 = m.a;
        this.b = ah0.b.Z0((Object)new j(0, 0, (List)EmptyList.INSTANCE));
        this.c = new b$b(this, new b$a(this), a3);
        final b5.m a4 = androidx.paging.compose.a.a;
        this.d = ah0.b.Z0((Object)new b5.b(a4.a, a4.b, a4.c, a4, (b5.m)null));
    }
    
    public static final void a(final b b) {
        final r c = ((PagingDataDiffer)b.c).c;
        final int c2 = c.c;
        final int d = c.d;
        final ArrayList a = c.a;
        final ArrayList list = new ArrayList();
        final Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            o.B4((Iterable)((a0)iterator.next()).b, (Collection)list);
        }
        ((SnapshotMutableStateImpl)b.b).setValue((Object)new j(c2, d, (List)list));
    }
    
    public final T b(final int i) {
        final b$b c = this.c;
        ((PagingDataDiffer)c).h = true;
        ((PagingDataDiffer)c).i = i;
        final b0 d = ((PagingDataDiffer)c).d;
        if (d != null) {
            d.b((c0)((PagingDataDiffer)c).c.a(i));
        }
        final r c2 = ((PagingDataDiffer)c).c;
        if (i >= 0) {
            if (i < c2.d()) {
                final int n = i - c2.c;
                if (n >= 0) {
                    if (n < c2.b) {
                        c2.c(n);
                    }
                }
                return (T)((j)((SnapshotMutableStateImpl)this.b).getValue()).get(i);
            }
        }
        else {
            c2.getClass();
        }
        final StringBuilder o = android.support.v4.media.a.o("Index: ", i, ", Size: ");
        o.append(c2.d());
        throw new IndexOutOfBoundsException(o.toString());
    }
    
    public final int c() {
        return ((j)((SnapshotMutableStateImpl)this.b).getValue()).a();
    }
    
    public final b5.b d() {
        return (b5.b)((SnapshotMutableStateImpl)this.d).getValue();
    }
    
    public final void e() {
        final b0 d = ((PagingDataDiffer)this.c).d;
        if (d != null) {
            d.retry();
        }
    }
}
