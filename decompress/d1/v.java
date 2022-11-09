// 
// Decompiled by Procyon v0.6.0
// 

package d1;

public final class v<K, V> extends t<K, V, K>
{
    @Override
    public final K next() {
        final int h = super.h + 2;
        super.h = h;
        return (K)super.f[h - 2];
    }
}
