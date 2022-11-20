// 
// Decompiled by Procyon v0.6.0
// 

package gk2;

import zg.a;
import java.util.Comparator;

public final class d<T> implements Comparator
{
    @Override
    public final int compare(final T t, final T t2) {
        return a.k((Comparable)((c)t).a, (Comparable)((c)t2).a);
    }
}
