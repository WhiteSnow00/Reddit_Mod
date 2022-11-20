// 
// Decompiled by Procyon v0.6.0
// 

package lc;

import db.j;
import db.w$a;
import android.util.Log;
import bd.c0;
import com.google.android.exoplayer2.ParserException;
import ah0.b;
import bd.q;
import db.w;
import kc.f;
import bd.t;

public final class c implements d
{
    public final t a;
    public final t b;
    public final f c;
    public w d;
    public int e;
    public long f;
    public int g;
    public int h;
    public long i;
    
    public c(final f c) {
        this.b = new t(q.a);
        this.c = c;
        this.a = new t();
        this.f = -9223372036854775807L;
        this.g = -1;
    }
    
    public final void a(final long f, final long i) {
        this.f = f;
        this.h = 0;
        this.i = i;
    }
    
    public final void b(final int g, long p4, t a, final boolean b) throws ParserException {
        try {
            final int n = a.a[0] & 0x1F;
            b.I((Object)this.d);
            final int n2 = 1;
            int e = 1;
            Label_0515: {
                if (n > 0 && n < 24) {
                    final int n3 = a.c - a.b;
                    this.h += this.e();
                    this.d.c(n3, a);
                    this.h += n3;
                    if ((a.a[0] & 0x1F) != 0x5) {
                        e = 0;
                    }
                    this.e = e;
                }
                else if (n == 24) {
                    a.r();
                    while (a.c - a.b > 4) {
                        final int w = a.w();
                        this.h += this.e();
                        this.d.c(w, a);
                        this.h += w;
                    }
                    this.e = 0;
                }
                else {
                    if (n != 28) {
                        throw ParserException.createForMalformedManifest(String.format("RTP H264 packetization mode [%d] not supported.", n), (Throwable)null);
                    }
                    final byte[] a2 = a.a;
                    final byte b2 = a2[0];
                    final byte b3 = a2[1];
                    final int n4 = (b2 & 0xE0) | (b3 & 0x1F);
                    final boolean b4 = (b3 & 0x80) > 0;
                    final boolean b5 = (b3 & 0x40) > 0;
                    if (b4) {
                        this.h += this.e();
                        final byte[] a3 = a.a;
                        a3[1] = (byte)n4;
                        final t a4 = this.a;
                        a4.getClass();
                        a4.z(a3.length, a3);
                        this.a.B(1);
                    }
                    else {
                        final int c = ug.b.c(this.g + 1);
                        if (g != c) {
                            Log.w("RtpH264Reader", c0.n("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", new Object[] { c, g }));
                            break Label_0515;
                        }
                        final t a5 = this.a;
                        final byte[] a6 = a.a;
                        a5.getClass();
                        a5.z(a6.length, a6);
                        this.a.B(2);
                    }
                    a = this.a;
                    final int n5 = a.c - a.b;
                    this.d.c(n5, a);
                    this.h += n5;
                    if (b5) {
                        int e2;
                        if ((n4 & 0x1F) == 0x5) {
                            e2 = n2;
                        }
                        else {
                            e2 = 0;
                        }
                        this.e = e2;
                    }
                }
            }
            if (b) {
                if (this.f == -9223372036854775807L) {
                    this.f = p4;
                }
                final long i = this.i;
                p4 = c0.P(p4 - this.f, 1000000L, 90000L);
                this.d.b(p4 + i, this.e, this.h, 0, (w$a)null);
                this.h = 0;
            }
            this.g = g;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw ParserException.createForMalformedManifest((String)null, (Throwable)ex);
        }
    }
    
    public final void c(final long n) {
    }
    
    public final void d(final j j, int a) {
        final w k = j.k(a, 2);
        this.d = k;
        a = c0.a;
        k.a(this.c.c);
    }
    
    public final int e() {
        this.b.B(0);
        final t b = this.b;
        final int n = b.c - b.b;
        final w d = this.d;
        d.getClass();
        d.c(n, this.b);
        return n;
    }
}
