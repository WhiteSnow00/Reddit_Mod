// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import java.util.Iterator;
import sg2.e;
import kotlin.Pair;
import com.reddit.tracking.TrackerParams;
import java.util.Arrays;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class f
{
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    
    public f() {
        this.a = 2;
        this(32, 2);
    }
    
    public f(final int b, final int a) {
        this.a = a;
        if (a == 3) {
            this.c = new char[b];
            return;
        }
        if (a != 4) {
            this.c = new long[b];
            return;
        }
        this.b = b;
        this.c = new ConcurrentLinkedQueue();
    }
    
    public f(final int b, final ImmutableList list) {
        this.a = 1;
        this.b = b;
        this.c = ImmutableList.copyOf((Collection)list);
    }
    
    public f(final int b, final m c) {
        this.a = 0;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final long n) {
        final int b = this.b;
        final Object c = this.c;
        if (b == ((long[])c).length) {
            this.c = Arrays.copyOf((long[])c, b * 2);
        }
        ((long[])this.c)[this.b++] = n;
    }
    
    public final long b(final int n) {
        if (n >= 0 && n < this.b) {
            return ((long[])this.c)[n];
        }
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(n);
        sb.append(", size is ");
        sb.append(b);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final void c(final Object o, final TrackerParams trackerParams) {
        this.d(o);
        if (((ConcurrentLinkedQueue)this.c).size() >= this.b) {
            ((ConcurrentLinkedQueue)this.c).poll();
        }
        ((ConcurrentLinkedQueue)this.c).add(new Pair(o, (Object)trackerParams));
    }
    
    public final boolean d(final Object o) {
        final Iterator iterator = ((ConcurrentLinkedQueue)this.c).iterator();
        while (true) {
            boolean b;
            Pair pair2;
            do {
                final boolean hasNext = iterator.hasNext();
                boolean remove = false;
                if (!hasNext) {
                    final Pair pair = null;
                    if (pair != null) {
                        remove = ((ConcurrentLinkedQueue)this.c).remove(pair);
                    }
                    return remove;
                }
                final Object next = iterator.next();
                e.e(next, "queue");
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
    
    @Override
    public final String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 3: {
                return new String((char[])this.c, 0, this.b);
            }
        }
    }
}
