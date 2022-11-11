// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.io.IOException;
import java.util.Arrays;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.zzjd;

public final class y7 extends w7
{
    public final int b(final Object o) {
        final x7 x7 = (x7)o;
        int d;
        if ((d = x7.d) == -1) {
            int i = 0;
            d = 0;
            while (i < x7.a) {
                final int n = x7.b[i];
                final zzjd zzjd = (zzjd)x7.c[i];
                final int a = com.google.android.gms.internal.measurement.d.a(8);
                final int zzd = zzjd.zzd();
                d += com.google.android.gms.internal.measurement.d.a(zzd) + zzd + com.google.android.gms.internal.measurement.d.a(24) + (com.google.android.gms.internal.measurement.d.a(n >>> 3) + com.google.android.gms.internal.measurement.d.a(16) + (a + a));
                ++i;
            }
            x7.d = d;
        }
        return d;
    }
    
    public final Object d(final Object o, final Object o2) {
        final x7 f = x7.f;
        final x7 x7 = (x7)o2;
        if (x7.equals((Object)f)) {
            return o;
        }
        final x7 x8 = (x7)o;
        final int n = x8.a + x7.a;
        final int[] copy = Arrays.copyOf(x8.b, n);
        System.arraycopy(x7.b, 0, copy, x8.a, x7.a);
        final Object[] copy2 = Arrays.copyOf(x8.c, n);
        System.arraycopy(x7.c, 0, copy2, x8.a, x7.a);
        return new x7(n, copy, copy2, true);
    }
    
    public final void g(final Object o) {
        ((e6)o).zzc.e = false;
    }
}
