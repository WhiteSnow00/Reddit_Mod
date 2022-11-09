// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ae.b;
import java.util.Iterator;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.collections.c;
import yl.a;
import ah2.f;
import java.util.LinkedHashMap;
import kotlin.Pair;
import java.util.Map;

public final class r0<V extends i> implements m0<V>
{
    public final Map<Integer, Pair<V, q>> f;
    public final int g;
    public final int h;
    public V i;
    public V j;
    
    public r0(final LinkedHashMap f, final int g) {
        this.f = f;
        this.g = g;
        this.h = 0;
    }
    
    @Override
    public final V c(final long n, final V v, V v2, V i) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)i, "initialVelocity");
        final int n2 = (int)a.N(n / 1000000L - this.f(), 0L, (long)this.getDurationMillis());
        if (this.f.containsKey(n2)) {
            return (V)((Pair)c.O1((Map)this.f, (Object)n2)).getFirst();
        }
        int g = this.g;
        if (n2 >= g) {
            return v2;
        }
        if (n2 <= 0) {
            return v;
        }
        q a = r.r$a.a;
        final Iterator<Map.Entry<Integer, Pair<V, q>>> iterator = this.f.entrySet().iterator();
        final int n3 = 0;
        i = v;
        int n4 = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Number, V> entry = (Map.Entry<Number, V>)iterator.next();
            final int intValue = entry.getKey().intValue();
            final Pair pair = (Pair)entry.getValue();
            if (n2 > intValue && intValue >= n4) {
                i = (i)pair.getFirst();
                a = (q)pair.getSecond();
                n4 = intValue;
            }
            else {
                if (n2 >= intValue || intValue > g) {
                    continue;
                }
                v2 = (V)pair.getFirst();
                g = intValue;
            }
        }
        final float a2 = a.a((n2 - n4) / (float)(g - n4));
        if (this.i == null) {
            this.i = (V)v.c();
            this.j = (V)v.c();
        }
        for (int b = i.b(), j = n3; j < b; ++j) {
            final i k = this.i;
            if (k == null) {
                ah2.f.n("valueVector");
                throw null;
            }
            final float a3 = i.a(j);
            final float a4 = v2.a(j);
            final h0 a5 = VectorConvertersKt.a;
            k.e(a4 * a2 + (1 - a2) * a3, j);
        }
        final i l = this.i;
        if (l != null) {
            return (V)l;
        }
        ah2.f.n("valueVector");
        throw null;
    }
    
    @Override
    public final int f() {
        return this.h;
    }
    
    @Override
    public final V g(long n, final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        n = a.N(n / 1000000L - this.f(), 0L, (long)this.getDurationMillis());
        if (n <= 0L) {
            return v3;
        }
        final i g = b.G((i0)this, n - 1L, (i)v, (i)v2, (i)v3);
        final i g2 = b.G((i0)this, n, (i)v, (i)v2, (i)v3);
        if (this.i == null) {
            this.i = (V)v.c();
            this.j = (V)v.c();
        }
        for (int i = 0; i < g.b(); ++i) {
            final i j = this.j;
            if (j == null) {
                ah2.f.n("velocityVector");
                throw null;
            }
            j.e((g.a(i) - g2.a(i)) * 1000.0f, i);
        }
        final i k = this.j;
        if (k != null) {
            return (V)k;
        }
        ah2.f.n("velocityVector");
        throw null;
    }
    
    @Override
    public final int getDurationMillis() {
        return this.g;
    }
}
