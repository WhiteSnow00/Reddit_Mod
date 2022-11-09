// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import java.util.List;
import androidx.compose.foundation.lazy.LazyListState;

public final class r
{
    public static final float a;
    public static final float b;
    
    static {
        a = 2500;
        b = 1500;
    }
    
    public static final j a(final LazyListState lazyListState, final int n) {
        final List<j> b = lazyListState.h().b();
        for (int size = b.size(), i = 0; i < size; ++i) {
            final Object value = b.get(i);
            if (((j)value).getIndex() == n) {
                return (j)value;
            }
        }
        final Object value = null;
        return (j)value;
    }
}
