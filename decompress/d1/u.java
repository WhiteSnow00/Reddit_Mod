// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Map;

public final class u<K, V> extends t<K, V, Map.Entry<? extends K, ? extends V>>
{
    @Override
    public final Object next() {
        final int h = super.h + 2;
        super.h = h;
        final Object[] f = super.f;
        return new a(f[h - 2], f[h - 1]);
    }
}
