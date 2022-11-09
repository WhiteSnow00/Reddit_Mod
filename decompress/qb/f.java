// 
// Decompiled by Procyon v0.6.0
// 

package qb;

import com.android.billingclient.api.d0;
import java.util.List;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import android.os.Message;
import wa.e0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import com.google.android.exoplayer2.n;
import bd.c0;
import android.os.Looper;
import com.google.android.exoplayer2.k$b;
import android.os.Handler;
import android.os.Handler$Callback;
import com.google.android.exoplayer2.e;

public final class f extends e implements Handler$Callback
{
    public a A;
    public final c r;
    public final qb.e s;
    public final Handler t;
    public final d u;
    public b v;
    public boolean w;
    public boolean x;
    public long y;
    public long z;
    
    public f(final k$b s, final Looper looper) {
        final c a = (c)c.a;
        super(5);
        this.s = (qb.e)s;
        Handler t;
        if (looper == null) {
            t = null;
        }
        else {
            final int a2 = c0.a;
            t = new Handler(looper, (Handler$Callback)this);
        }
        this.t = t;
        this.r = (c)a;
        this.u = new d();
        this.z = -9223372036854775807L;
    }
    
    public final void B(final long n, final boolean b) {
        this.A = null;
        this.z = -9223372036854775807L;
        this.w = false;
        this.x = false;
    }
    
    public final void F(final n[] array, final long n, final long n2) {
        this.v = (b)this.r.b(array[0]);
    }
    
    public final void H(final a a, final ArrayList list) {
        int n = 0;
        while (true) {
            final a$b[] f = a.f;
            if (n >= f.length) {
                break;
            }
            final n p2 = f[n].p0();
            if (p2 != null && this.r.a(p2)) {
                final android.support.v4.media.a b = this.r.b(p2);
                final byte[] i0 = a.f[n].i0();
                i0.getClass();
                this.u.p();
                this.u.v(i0.length);
                final ByteBuffer h = this.u.h;
                final int a2 = c0.a;
                h.put(i0);
                this.u.w();
                final a a3 = b.a(this.u);
                if (a3 != null) {
                    this.H(a3, list);
                }
            }
            else {
                list.add(a.f[n]);
            }
            ++n;
        }
    }
    
    public final int a(final n n) {
        if (this.r.a(n)) {
            int n2;
            if (n.J == 0) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            return e0.l(n2, 0, 0);
        }
        return e0.l(0, 0, 0);
    }
    
    public final boolean b() {
        return this.x;
    }
    
    public final String getName() {
        return "MetadataRenderer";
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 0) {
            this.s.onMetadata((a)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public final boolean isReady() {
        return true;
    }
    
    public final void m(final long n, final long n2) {
        int i = 1;
        while (i != 0) {
            if (!this.w && this.A == null) {
                this.u.p();
                final d0 g = super.g;
                g.g = null;
                g.h = null;
                final int g2 = this.G(g, (DecoderInputBuffer)this.u, 0);
                if (g2 == -4) {
                    if (((ab.a)this.u).n(4)) {
                        this.w = true;
                    }
                    else {
                        final d u = this.u;
                        u.n = this.y;
                        u.w();
                        final b v = this.v;
                        final int a = c0.a;
                        final a a2 = v.a(this.u);
                        if (a2 != null) {
                            final ArrayList list = new ArrayList(a2.f.length);
                            this.H(a2, list);
                            if (!list.isEmpty()) {
                                this.A = new a((List)list);
                                this.z = this.u.j;
                            }
                        }
                    }
                }
                else if (g2 == -5) {
                    final n n3 = (n)g.h;
                    n3.getClass();
                    this.y = n3.u;
                }
            }
            final a a3 = this.A;
            int n4;
            if (a3 != null && this.z <= n) {
                final Handler t = this.t;
                if (t != null) {
                    t.obtainMessage(0, (Object)a3).sendToTarget();
                }
                else {
                    this.s.onMetadata(a3);
                }
                this.A = null;
                this.z = -9223372036854775807L;
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            i = n4;
            if (this.w) {
                i = n4;
                if (this.A != null) {
                    continue;
                }
                this.x = true;
                i = n4;
            }
        }
    }
    
    public final void z() {
        this.A = null;
        this.z = -9223372036854775807L;
        this.v = null;
    }
}
