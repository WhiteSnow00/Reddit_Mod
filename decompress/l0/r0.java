// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import yd.b;
import java.util.Iterator;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.collections.c;
import lg.e0;
import sg2.e;
import java.util.LinkedHashMap;
import kotlin.Pair;
import java.util.Map;

public final class r0<V extends i> implements m0<V>
{
    public final Map<Integer, Pair<V, q>> a;
    public final int b;
    public final int c;
    public V d;
    public V e;
    
    public r0(final LinkedHashMap a, final int b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }
    
    public final V c(final long n, final V v, V v2, V i) {
        sg2.e.f((Object)v, "initialValue");
        sg2.e.f((Object)v2, "targetValue");
        sg2.e.f((Object)i, "initialVelocity");
        final int n2 = (int)e0.x(n / 1000000L - this.e(), 0L, (long)this.getDurationMillis());
        if (this.a.containsKey(n2)) {
            return (V)((Pair)kotlin.collections.c.W0((Map)this.a, (Object)n2)).getFirst();
        }
        int b = this.b;
        if (n2 >= b) {
            return v2;
        }
        if (n2 <= 0) {
            return v;
        }
        Object a = r$a.a;
        final Iterator<Map.Entry<Integer, Pair<V, q>>> iterator = this.a.entrySet().iterator();
        final int n3 = 0;
        i = v;
        int n4 = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Number, V> entry = (Map.Entry<Number, V>)iterator.next();
            final int intValue = entry.getKey().intValue();
            final Pair pair = (Pair)entry.getValue();
            if (n2 > intValue && intValue >= n4) {
                i = (i)pair.getFirst();
                a = pair.getSecond();
                n4 = intValue;
            }
            else {
                if (n2 >= intValue || intValue > b) {
                    continue;
                }
                v2 = (V)pair.getFirst();
                b = intValue;
            }
        }
        final float a2 = ((q)a).a((n2 - n4) / (float)(b - n4));
        if (this.d == null) {
            this.d = (V)v.c();
            this.e = (V)v.c();
        }
        for (int b2 = i.b(), j = n3; j < b2; ++j) {
            final i d = this.d;
            if (d == null) {
                sg2.e.n("valueVector");
                throw null;
            }
            final float a3 = i.a(j);
            final float a4 = v2.a(j);
            final h0 a5 = VectorConvertersKt.a;
            d.e(a4 * a2 + (1 - a2) * a3, j);
        }
        final i d2 = this.d;
        if (d2 != null) {
            return (V)d2;
        }
        sg2.e.n("valueVector");
        throw null;
    }
    
    public final int e() {
        return this.c;
    }
    
    public final V f(long x, final V v, final V v2, final V v3) {
        sg2.e.f((Object)v, "initialValue");
        sg2.e.f((Object)v2, "targetValue");
        sg2.e.f((Object)v3, "initialVelocity");
        x = e0.x(x / 1000000L - this.e(), 0L, (long)this.getDurationMillis());
        if (x <= 0L) {
            return v3;
        }
        final i g = yd.b.G((i0)this, x - 1L, (i)v, (i)v2, (i)v3);
        final i g2 = yd.b.G((i0)this, x, (i)v, (i)v2, (i)v3);
        if (this.d == null) {
            this.d = (V)v.c();
            this.e = (V)v.c();
        }
        for (int i = 0; i < g.b(); ++i) {
            final i e = this.e;
            if (e == null) {
                sg2.e.n("velocityVector");
                throw null;
            }
            e.e((g.a(i) - g2.a(i)) * 1000.0f, i);
        }
        final i e2 = this.e;
        if (e2 != null) {
            return (V)e2;
        }
        sg2.e.n("velocityVector");
        throw null;
    }
    
    public final int getDurationMillis() {
        return this.b;
    }
}
