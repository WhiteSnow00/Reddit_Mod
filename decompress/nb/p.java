// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.w$a;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import db.j;
import android.util.Log;
import bd.d0;
import db.w;
import bd.s;

public final class p implements k
{
    public final s a;
    public w b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    
    public p() {
        this.a = new s(10);
        this.d = -9223372036854775807L;
    }
    
    public final void b() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        d0.g(this.b);
        if (!this.c) {
            return;
        }
        final int n = s.c - s.b;
        final int f = this.f;
        if (f < 10) {
            final int min = Math.min(n, 10 - f);
            System.arraycopy(s.a, s.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.B(0);
                if (73 != this.a.r() || 68 != this.a.r() || 51 != this.a.r()) {
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
                this.a.C(3);
                this.e = this.a.q() + 10;
            }
        }
        final int min2 = Math.min(n, this.e - this.f);
        this.b.c(min2, s);
        this.f += min2;
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        final w k = j.k(e0$d.d, 5);
        this.b = k;
        final n$a n$a = new n$a();
        e0$d.b();
        n$a.a = e0$d.e;
        n$a.k = "application/id3";
        k.a(new n(n$a));
    }
    
    public final void e() {
        d0.g(this.b);
        if (this.c) {
            final int e = this.e;
            if (e != 0) {
                if (this.f == e) {
                    final long d = this.d;
                    if (d != -9223372036854775807L) {
                        this.b.b(d, 1, e, 0, (w$a)null);
                    }
                    this.c = false;
                }
            }
        }
    }
    
    public final void f(final int n, final long d) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        if (d != -9223372036854775807L) {
            this.d = d;
        }
        this.e = 0;
        this.f = 0;
    }
}
