// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import kotlin.reflect.jvm.internal.impl.descriptors.c;
import ch2.m;
import java.util.Comparator;

public final class e<T> implements Comparator
{
    public static final e<T> f;
    
    static {
        f = new e<T>();
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final Integer b = c.b((m)o, (m)o2);
        int intValue;
        if (b == null) {
            intValue = 0;
        }
        else {
            intValue = b;
        }
        return intValue;
    }
}
