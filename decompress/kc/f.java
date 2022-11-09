// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.util.Iterator;
import kotlin.Pair;
import com.reddit.tracking.TrackerParams;
import java.util.Arrays;
import com.google.android.play.core.assetpacks.i;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ConcurrentLinkedQueue;
import eg.r0;

public final class f implements r0
{
    public int f = f;
    public Object g = g;
    
    public f(final int f, final int n) {
        if (n != 4) {
            this.g = new long[f];
            return;
        }
        this.f = f;
        this.g = new ConcurrentLinkedQueue();
    }
    
    public final void a(final long n) {
        final int f = this.f;
        final Object g = this.g;
        if (f == ((long[])g).length) {
            this.g = Arrays.copyOf((long[])g, f * 2);
        }
        ((long[])this.g)[this.f++] = n;
    }
    
    public final long b(final int n) {
        if (n >= 0 && n < this.f) {
            return ((long[])this.g)[n];
        }
        final int f = this.f;
        final StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(n);
        sb.append(", size is ");
        sb.append(f);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final void c(final Object o, final TrackerParams trackerParams) {
        this.d(o);
        if (((ConcurrentLinkedQueue)this.g).size() >= this.f) {
            ((ConcurrentLinkedQueue)this.g).poll();
        }
        ((ConcurrentLinkedQueue)this.g).add(new Pair(o, (Object)trackerParams));
    }
    
    public final boolean d(final Object o) {
        final Iterator iterator = ((ConcurrentLinkedQueue)this.g).iterator();
        while (true) {
            boolean b;
            Pair pair2;
            do {
                final boolean hasNext = iterator.hasNext();
                boolean remove = false;
                if (!hasNext) {
                    final Pair pair = null;
                    if (pair != null) {
                        remove = ((ConcurrentLinkedQueue)this.g).remove(pair);
                    }
                    return remove;
                }
                final Object next = iterator.next();
                ah2.f.e(next, "queue");
                pair2 = (Pair)next;
                final Object first = pair2.getFirst();
                b = true;
                if (first != null && first.equals(o)) {
                    continue;
                }
                b = false;
            } while (!b);
            final Pair pair = pair2;
            continue;
        }
    }
    
    public final Object zza() {
        ((i)this.g).a(this.f);
        return null;
    }
}
