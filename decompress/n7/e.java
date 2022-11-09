// 
// Decompiled by Procyon v0.6.0
// 

package n7;

import kotlin.Pair;
import java.util.Comparator;

public final class e<T> implements Comparator
{
    @Override
    public final int compare(final T t, final T t2) {
        return mk2.e.t((Comparable)((Pair)t).getFirst(), (Comparable)((Pair)t2).getFirst());
    }
}
