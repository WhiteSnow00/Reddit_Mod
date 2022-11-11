// 
// Decompiled by Procyon v0.6.0
// 

package pb;

import com.android.billingclient.api.d0;
import java.util.List;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import android.os.Message;
import va.e0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import com.google.android.exoplayer2.n;
import ad.c0;
import android.os.Looper;
import com.google.android.exoplayer2.k$b;
import android.os.Handler;
import android.os.Handler$Callback;
import com.google.android.exoplayer2.e;

public final class f extends e implements Handler$Callback
{
    public pb.a A;
    public final c r;
    public final pb.e s;
    public final Handler t;
    public final d u;
    public pb.b v;
    public boolean w;
    public boolean x;
    public long y;
    public long z;
    
    public f(final k$b s, final Looper looper) {
        final c$a a = pb.c.a;
        super(5);
        this.s = (pb.e)s;
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
    
    @Override
    public final void B(final long n, final boolean b) {
        this.A = null;
        this.z = -9223372036854775807L;
        this.w = false;
        this.x = false;
    }
    
    @Override
    public final void F(final n[] array, final long n, final long n2) {
        this.v = (pb.b)this.r.b(array[0]);
    }
    
    public final void H(final pb.a a, final ArrayList list) {
        int n = 0;
        while (true) {
            final a$b[] f = a.f;
            if (n >= f.length) {
                break;
            }
            final n s0 = f[n].s0();
            if (s0 != null && this.r.a(s0)) {
                final android.support.v4.media.c b = this.r.b(s0);
                final byte[] k0 = a.f[n].k0();
                k0.getClass();
                this.u.t();
                this.u.v(k0.length);
                final ByteBuffer h = this.u.h;
                final int a2 = c0.a;
                h.put(k0);
                this.u.w();
                final pb.a c = b.C(this.u);
                if (c != null) {
                    this.H(c, list);
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
            return e0.k(n2, 0, 0);
        }
        return e0.k(0, 0, 0);
    }
    
    public final boolean b() {
        return this.x;
    }
    
    public final String getName() {
        return "MetadataRenderer";
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 0) {
            this.s.onMetadata((pb.a)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public final boolean isReady() {
        return true;
    }
    
    public final void l(final long n, final long n2) {
        int i = 1;
        while (i != 0) {
            if (!this.w && this.A == null) {
                this.u.t();
                final d0 g = super.g;
                g.f = null;
                g.g = null;
                final int g2 = this.G(g, this.u, 0);
                if (g2 == -4) {
                    if (((za.a)this.u).o(4)) {
                        this.w = true;
                    }
                    else {
                        final d u = this.u;
                        u.n = this.y;
                        u.w();
                        final pb.b v = this.v;
                        final int a = c0.a;
                        final pb.a c = v.C(this.u);
                        if (c != null) {
                            final ArrayList list = new ArrayList(c.f.length);
                            this.H(c, list);
                            if (!list.isEmpty()) {
                                this.A = new pb.a((List)list);
                                this.z = this.u.j;
                            }
                        }
                    }
                }
                else if (g2 == -5) {
                    final n n3 = (n)g.g;
                    n3.getClass();
                    this.y = n3.u;
                }
            }
            final pb.a a2 = this.A;
            int n4;
            if (a2 != null && this.z <= n) {
                final Handler t = this.t;
                if (t != null) {
                    t.obtainMessage(0, (Object)a2).sendToTarget();
                }
                else {
                    this.s.onMetadata(a2);
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
    
    @Override
    public final void z() {
        this.A = null;
        this.z = -9223372036854775807L;
        this.v = null;
    }
}
