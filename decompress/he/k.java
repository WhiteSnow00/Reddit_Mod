// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.io.IOException;
import com.google.android.gms.internal.firebase_auth_api.zzacf;

public final class k extends l
{
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    public k(final byte[] c, final int d) {
        this.h = Integer.MAX_VALUE;
        this.c = c;
        this.d = d;
        this.f = 0;
    }
    
    public final int a(int h) throws zzacf {
        if (h < 0) {
            throw zzacf.zzf();
        }
        final int h2 = h + this.f;
        if (h2 < 0) {
            throw zzacf.zzg();
        }
        h = this.h;
        if (h2 <= h) {
            this.h = h2;
            final int d = this.d + this.e;
            if ((this.d = d) > h2) {
                final int e = d - h2;
                this.e = e;
                this.d = d - e;
            }
            else {
                this.e = 0;
            }
            return h;
        }
        throw zzacf.zzi();
    }
    
    public final int b() throws IOException {
        if (this.c()) {
            return this.g = 0;
        }
        final int i = this.i();
        this.g = i;
        if (i >>> 3 != 0) {
            return i;
        }
        throw zzacf.zzc();
    }
    
    public final boolean c() throws IOException {
        return this.f == this.d;
    }
    
    public final boolean d() throws IOException {
        return this.k() != 0L;
    }
    
    public final boolean e(int i) throws IOException {
        final int n = i & 0x7;
        final int n2 = 0;
        final int n3 = 0;
        if (n == 0) {
            i = n2;
            if (this.d - this.f >= 10) {
                for (i = n3; i < 10; ++i) {
                    if (this.c[this.f++] >= 0) {
                        return true;
                    }
                }
                throw zzacf.zze();
            }
            while (i < 10) {
                final int f = this.f;
                if (f == this.d) {
                    throw zzacf.zzi();
                }
                final byte[] c = this.c;
                this.f = f + 1;
                if (c[f] >= 0) {
                    return true;
                }
                ++i;
            }
            throw zzacf.zze();
        }
        if (n == 1) {
            this.m(8);
            return true;
        }
        if (n == 2) {
            this.m(this.i());
            return true;
        }
        if (n != 3) {
            if (n == 4) {
                return false;
            }
            if (n == 5) {
                this.m(4);
                return true;
            }
            throw zzacf.zza();
        }
        else {
            int b;
            do {
                b = this.b();
            } while (b != 0 && this.e(b));
            if (this.g == (i >>> 3 << 3 | 0x4)) {
                return true;
            }
            throw zzacf.zzb();
        }
    }
    
    public final int h() throws IOException {
        final int f = this.f;
        if (this.d - f >= 4) {
            final byte[] c = this.c;
            this.f = f + 4;
            return (c[f + 3] & 0xFF) << 24 | ((c[f] & 0xFF) | (c[f + 1] & 0xFF) << 8 | (c[f + 2] & 0xFF) << 16);
        }
        throw zzacf.zzi();
    }
    
    public final int i() throws IOException {
        final int f = this.f;
        final int d = this.d;
        if (d != f) {
            final byte[] c = this.c;
            final int f2 = f + 1;
            final byte b = c[f];
            if (b >= 0) {
                this.f = f2;
                return b;
            }
            if (d - f2 >= 9) {
                int f3 = f2 + 1;
                final int n = b ^ c[f2] << 7;
                int n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final int n3 = f3 + 1;
                    final int n4 = n ^ c[f3] << 14;
                    if (n4 >= 0) {
                        final int n5 = n4 ^ 0x3F80;
                        f3 = n3;
                        n2 = n5;
                    }
                    else {
                        f3 = n3 + 1;
                        final int n6 = n4 ^ c[n3] << 21;
                        if (n6 < 0) {
                            n2 = (n6 ^ 0xFFE03F80);
                        }
                        else {
                            final int n7 = f3 + 1;
                            final byte b2 = c[f3];
                            final int n8 = n2 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                            f3 = n7;
                            if (b2 < 0) {
                                final int n9 = n7 + 1;
                                n2 = n8;
                                f3 = n9;
                                if (c[n7] < 0) {
                                    final int n10 = n9 + 1;
                                    n2 = n8;
                                    f3 = n10;
                                    if (c[n9] < 0) {
                                        final int n11 = n10 + 1;
                                        n2 = n8;
                                        f3 = n11;
                                        if (c[n10] < 0) {
                                            final int n12 = n11 + 1;
                                            n2 = n8;
                                            f3 = n12;
                                            if (c[n11] < 0) {
                                                f3 = n12 + 1;
                                                if (c[n12] < 0) {
                                                    return (int)this.l();
                                                }
                                                n2 = n8;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f = f3;
                return n2;
            }
        }
        return (int)this.l();
    }
    
    public final long j() throws IOException {
        final int f = this.f;
        if (this.d - f >= 8) {
            final byte[] c = this.c;
            this.f = f + 8;
            return ((long)c[f + 7] & 0xFFL) << 56 | (((long)c[f] & 0xFFL) | ((long)c[f + 1] & 0xFFL) << 8 | ((long)c[f + 2] & 0xFFL) << 16 | ((long)c[f + 3] & 0xFFL) << 24 | ((long)c[f + 4] & 0xFFL) << 32 | ((long)c[f + 5] & 0xFFL) << 40 | ((long)c[f + 6] & 0xFFL) << 48);
        }
        throw zzacf.zzi();
    }
    
    public final long k() throws IOException {
        final int f = this.f;
        final int d = this.d;
        if (d != f) {
            final byte[] c = this.c;
            final int f2 = f + 1;
            final byte b = c[f];
            if (b >= 0) {
                this.f = f2;
                return b;
            }
            if (d - f2 >= 9) {
                int f3 = f2 + 1;
                final int n = b ^ c[f2] << 7;
                long n4 = 0L;
                Label_0345: {
                    int n6 = 0;
                    Label_0076: {
                        if (n >= 0) {
                            final int n2 = f3 + 1;
                            final int n3 = n ^ c[f3] << 14;
                            Label_0111: {
                                if (n3 >= 0) {
                                    n4 = (n3 ^ 0x3F80);
                                    f3 = n2;
                                }
                                else {
                                    f3 = n2 + 1;
                                    final int n5 = n3 ^ c[n2] << 21;
                                    if (n5 < 0) {
                                        n6 = (n5 ^ 0xFFE03F80);
                                        break Label_0076;
                                    }
                                    final int n7 = f3 + 1;
                                    long n8 = (long)c[f3] << 28 ^ (long)n5;
                                    long n12 = 0L;
                                    Label_0175: {
                                        if (n8 < 0L) {
                                            f3 = n7 + 1;
                                            long n9 = n8 ^ (long)c[n7] << 35;
                                            Label_0221: {
                                                long n10;
                                                if (n9 < 0L) {
                                                    n10 = -34093383808L;
                                                }
                                                else {
                                                    final int n11 = f3 + 1;
                                                    n8 = (n9 ^ (long)c[f3] << 42);
                                                    if (n8 >= 0L) {
                                                        n12 = 4363953127296L;
                                                        f3 = n11;
                                                        break Label_0175;
                                                    }
                                                    f3 = n11 + 1;
                                                    n9 = (n8 ^ (long)c[n11] << 49);
                                                    if (n9 < 0L) {
                                                        n10 = -558586000294016L;
                                                    }
                                                    else {
                                                        final int n13 = f3 + 1;
                                                        final long n14 = n4 = (n9 ^ (long)c[f3] << 56 ^ 0xFE03F80FE03F80L);
                                                        f3 = n13;
                                                        if (n14 >= 0L) {
                                                            break Label_0111;
                                                        }
                                                        f3 = n13 + 1;
                                                        if (c[n13] >= 0L) {
                                                            n4 = n14;
                                                            break Label_0221;
                                                        }
                                                        return this.l();
                                                    }
                                                }
                                                n4 = (n10 ^ n9);
                                            }
                                            break Label_0345;
                                        }
                                        n12 = 266354560L;
                                        f3 = n7;
                                    }
                                    n4 = (n8 ^ n12);
                                }
                            }
                            break Label_0345;
                        }
                        n6 = (n ^ 0xFFFFFF80);
                    }
                    n4 = n6;
                }
                this.f = f3;
                return n4;
            }
        }
        return this.l();
    }
    
    public final long l() throws IOException {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final int f = this.f;
            if (f == this.d) {
                throw zzacf.zzi();
            }
            final byte[] c = this.c;
            this.f = f + 1;
            final byte b = c[f];
            n |= (long)(b & 0x7F) << i;
            if ((b & 0x80) == 0x0) {
                return n;
            }
        }
        throw zzacf.zze();
    }
    
    public final void m(final int n) throws IOException {
        if (n >= 0) {
            final int d = this.d;
            final int f = this.f;
            if (n <= d - f) {
                this.f = f + n;
                return;
            }
        }
        if (n < 0) {
            throw zzacf.zzf();
        }
        throw zzacf.zzi();
    }
}
