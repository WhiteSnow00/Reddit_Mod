// 
// Decompiled by Procyon v0.6.0
// 

package d1;

public final class x<K, V> extends t<K, V, V>
{
    @Override
    public final V next() {
        final int h = super.h + 2;
        super.h = h;
        return (V)super.f[h - 1];
    }
}
