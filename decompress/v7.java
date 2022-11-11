// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.io.IOException;
import java.util.Arrays;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.zzjd;

public final class v7
{
    public static final v7 f;
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    
    static {
        f = new v7(0, new int[0], new Object[0], false);
    }
    
    public v7() {
        this(0, new int[8], new Object[8], true);
    }
    
    public v7(final int a, final int[] b, final Object[] c, final boolean e) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    public static v7 b() {
        return new v7(0, new int[8], new Object[8], true);
    }
    
    public final int a() {
        final int d = this.d;
        if (d == -1) {
            int i = 0;
            int d2 = 0;
            while (i < this.a) {
                final int n = this.b[i];
                final int n2 = n >>> 3;
                final int n3 = n & 0x7;
                Label_0242: {
                    int a2 = 0;
                    int n4 = 0;
                    Label_0235: {
                        if (n3 != 0) {
                            int n5;
                            if (n3 != 1) {
                                if (n3 == 2) {
                                    final zzjd zzjd = (zzjd)this.c[i];
                                    final int a = com.google.android.gms.internal.measurement.d.a(n2 << 3);
                                    final int zzd = zzjd.zzd();
                                    d2 += com.google.android.gms.internal.measurement.d.a(zzd) + zzd + a;
                                    break Label_0242;
                                }
                                if (n3 == 3) {
                                    final int u = com.google.android.gms.internal.measurement.d.u(n2);
                                    a2 = u + u;
                                    n4 = ((v7)this.c[i]).a();
                                    break Label_0235;
                                }
                                if (n3 != 5) {
                                    throw new IllegalStateException((Throwable)zzko.zza());
                                }
                                ((Integer)this.c[i]).intValue();
                                n5 = com.google.android.gms.internal.measurement.d.a(n2 << 3) + 4;
                            }
                            else {
                                ((Long)this.c[i]).longValue();
                                n5 = com.google.android.gms.internal.measurement.d.a(n2 << 3) + 8;
                            }
                            d2 += n5;
                            break Label_0242;
                        }
                        final long longValue = (long)this.c[i];
                        a2 = com.google.android.gms.internal.measurement.d.a(n2 << 3);
                        n4 = com.google.android.gms.internal.measurement.d.b(longValue);
                    }
                    d2 += n4 + a2;
                }
                ++i;
            }
            return this.d = d2;
        }
        return d;
    }
    
    public final void c(final int n, final Object o) {
        if (this.e) {
            final int a = this.a;
            final int[] b = this.b;
            if (a == b.length) {
                int n2;
                if (a < 4) {
                    n2 = 8;
                }
                else {
                    n2 = a >> 1;
                }
                final int n3 = a + n2;
                this.b = Arrays.copyOf(b, n3);
                this.c = Arrays.copyOf(this.c, n3);
            }
            final int[] b2 = this.b;
            final int a2 = this.a;
            b2[a2] = n;
            this.c[a2] = o;
            this.a = a2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void d(final m5 m5) throws IOException {
        if (this.a != 0) {
            for (int i = 0; i < this.a; ++i) {
                final int n = this.b[i];
                final Object o = this.c[i];
                final int n2 = n >>> 3;
                final int n3 = n & 0x7;
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 5) {
                                    throw new RuntimeException((Throwable)zzko.zza());
                                }
                                m5.i(n2, (int)o);
                            }
                            else {
                                m5.a.m(n2, 3);
                                ((v7)o).d(m5);
                                m5.a.m(n2, 4);
                            }
                        }
                        else {
                            m5.f(n2, (zzjd)o);
                        }
                    }
                    else {
                        m5.j(n2, (long)o);
                    }
                }
                else {
                    m5.n(n2, (long)o);
                }
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof v7)) {
            return false;
        }
        final v7 v7 = (v7)o;
        final int a = this.a;
        if (a == v7.a) {
            final int[] b = this.b;
            final int[] b2 = v7.b;
            for (int i = 0; i < a; ++i) {
                if (b[i] != b2[i]) {
                    return false;
                }
            }
            final Object[] c = this.c;
            final Object[] c2 = v7.c;
            for (int a2 = this.a, j = 0; j < a2; ++j) {
                if (!c[j].equals(c2[j])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int[] b = this.b;
        final int n = 0;
        int n2 = 17;
        int i = 0;
        int n3 = 17;
        while (i < a) {
            n3 = n3 * 31 + b[i];
            ++i;
        }
        final Object[] c = this.c;
        for (int a2 = this.a, j = n; j < a2; ++j) {
            n2 = n2 * 31 + c[j].hashCode();
        }
        return ((a + 527) * 31 + n3) * 31 + n2;
    }
}
