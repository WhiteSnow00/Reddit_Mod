// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import zg.a;
import com.reddit.domain.model.Link;
import java.util.Comparator;

public final class s<T> implements Comparator
{
    @Override
    public final int compare(final T t, final T t2) {
        return a.k((Comparable)((Link)t2).getCreatedUtc(), (Comparable)((Link)t).getCreatedUtc());
    }
}
