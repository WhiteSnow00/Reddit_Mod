// 
// Decompiled by Procyon v0.6.0
// 

package u70;

import zg.a;
import com.reddit.debug.logging.DataLoggingActivity;
import java.util.Comparator;

public final class c<T> implements Comparator
{
    @Override
    public final int compare(final T t, final T t2) {
        return a.k((Comparable)((DataLoggingActivity.d)t2).d, (Comparable)((DataLoggingActivity.d)t).d);
    }
}
