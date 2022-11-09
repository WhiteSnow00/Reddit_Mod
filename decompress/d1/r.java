// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import ah2.f;

public final class r<K, V> extends d<K, V, V>
{
    public r(final s<K, V> s) {
        ah2.f.f((Object)s, "node");
        final t[] array = new t[8];
        for (int i = 0; i < 8; ++i) {
            array[i] = new x();
        }
        super(s, array);
    }
}
