// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.io.IOException;
import java.util.Arrays;
import com.google.android.gms.internal.firebase_auth_api.e;
import com.google.android.gms.internal.firebase_auth_api.d;
import com.google.android.gms.internal.firebase_auth_api.zzaau;

public final class t1 extends r1
{
    public final int a(final Object o) {
        return ((s1)o).a();
    }
    
    public final int b(final Object o) {
        final s1 s1 = (s1)o;
        int d;
        if ((d = s1.d) == -1) {
            int i = 0;
            d = 0;
            while (i < s1.a) {
                final int n = s1.b[i];
                final zzaau zzaau = (zzaau)s1.c[i];
                final int d2 = com.google.android.gms.internal.firebase_auth_api.d.d(8);
                final int zzd = zzaau.zzd();
                d += com.google.android.gms.internal.firebase_auth_api.d.d(zzd) + zzd + com.google.android.gms.internal.firebase_auth_api.d.d(24) + (com.google.android.gms.internal.firebase_auth_api.d.d(n >>> 3) + com.google.android.gms.internal.firebase_auth_api.d.d(16) + (d2 + d2));
                ++i;
            }
            s1.d = d;
        }
        return d;
    }
    
    public final /* bridge */ s1 c(final Object o) {
        final e e = (e)o;
        s1 zzc;
        if ((zzc = e.zzc) == s1.f) {
            zzc = s1.b();
            e.zzc = zzc;
        }
        return zzc;
    }
    
    public final s1 d(final Object o) {
        return ((e)o).zzc;
    }
    
    public final Object e(final Object o, final Object o2) {
        final s1 f = s1.f;
        final s1 s1 = (s1)o2;
        if (s1.equals((Object)f)) {
            return o;
        }
        final s1 s2 = (s1)o;
        final int n = s2.a + s1.a;
        final int[] copy = Arrays.copyOf(s2.b, n);
        System.arraycopy(s1.b, 0, copy, s2.a, s1.a);
        final Object[] copy2 = Arrays.copyOf(s2.c, n);
        System.arraycopy(s1.c, 0, copy2, s2.a, s1.a);
        return new s1(n, copy, copy2, true);
    }
    
    public final s1 f() {
        return s1.b();
    }
    
    public final Object g(final Object o) {
        ((s1)o).e = false;
        return o;
    }
    
    public final /* bridge */ void h(final int n, final int n2, final Object o) {
        ((s1)o).c(n << 3 | 0x5, (Object)n2);
    }
    
    public final /* bridge */ void i(final Object o, final int n, final long n2) {
        ((s1)o).c(n << 3 | 0x1, (Object)n2);
    }
    
    public final /* bridge */ void j(final int n, final Object o, final Object o2) {
        ((s1)o).c(n << 3 | 0x3, o2);
    }
    
    public final /* bridge */ void k(final Object o, final int n, final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) {
        ((s1)o).c(n << 3 | 0x2, (Object)zzaau);
    }
    
    public final /* bridge */ void l(final Object o, final int n, final long n2) {
        ((s1)o).c(n << 3, (Object)n2);
    }
    
    public final void m(final Object o) {
        ((e)o).zzc.e = false;
    }
    
    public final void n(final Object o, final Object o2) {
        ((e)o).zzc = (s1)o2;
    }
    
    public final void o(final Object o, final Object o2) {
        ((e)o).zzc = (s1)o2;
    }
    
    public final void q() {
    }
    
    public final void r(final Object o, final o o2) throws IOException {
        ((s1)o).d(o2);
    }
}
