// 
// Decompiled by Procyon v0.6.0
// 

package c80;

import mk2.e;
import com.reddit.debug.logging.DataLoggingActivity;
import java.util.Comparator;

public final class c<T> implements Comparator
{
    @Override
    public final int compare(final T t, final T t2) {
        return e.t((Comparable)((DataLoggingActivity.d)t2).d, (Comparable)((DataLoggingActivity.d)t).d);
    }
}
