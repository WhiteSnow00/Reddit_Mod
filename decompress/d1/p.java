// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import ah2.f;

public final class p<K, V> extends d<K, V, K>
{
    public p(final s<K, V> s) {
        ah2.f.f((Object)s, "node");
        final t[] array = new t[8];
        for (int i = 0; i < 8; ++i) {
            array[i] = new v();
        }
        super(s, array);
    }
}
