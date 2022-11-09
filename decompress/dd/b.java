// 
// Decompiled by Procyon v0.6.0
// 

package dd;

import java.nio.ByteBuffer;
import com.android.billingclient.api.d0;
import bd.c0;
import com.google.android.exoplayer2.ExoPlaybackException;
import wa.e0;
import com.google.android.exoplayer2.n;
import bd.s;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.e;

public final class b extends e
{
    public final DecoderInputBuffer r;
    public final s s;
    public long t;
    public a u;
    public long v;
    
    public b() {
        super(6);
        this.r = new DecoderInputBuffer(1);
        this.s = new s();
    }
    
    public final void B(final long n, final boolean b) {
        this.v = Long.MIN_VALUE;
        final a u = this.u;
        if (u != null) {
            u.e();
        }
    }
    
    public final void F(final n[] array, final long n, final long t) {
        this.t = t;
    }
    
    public final int a(final n n) {
        int n2;
        if ("application/x-camera-motion".equals(n.q)) {
            n2 = e0.l(4, 0, 0);
        }
        else {
            n2 = e0.l(0, 0, 0);
        }
        return n2;
    }
    
    public final boolean b() {
        return this.f();
    }
    
    public final String getName() {
        return "CameraMotionRenderer";
    }
    
    public final void i(final int n, final Object o) throws ExoPlaybackException {
        if (n == 8) {
            this.u = (a)o;
        }
    }
    
    public final boolean isReady() {
        return true;
    }
    
    public final void m(final long n, final long n2) {
        while (!this.f() && this.v < 100000L + n) {
            this.r.p();
            final d0 g = super.g;
            float[] array = null;
            g.g = null;
            g.h = null;
            final DecoderInputBuffer r = this.r;
            int n3 = 0;
            if (this.G(g, r, 0) != -4) {
                break;
            }
            if (((ab.a)this.r).n(4)) {
                break;
            }
            final DecoderInputBuffer r2 = this.r;
            this.v = r2.j;
            if (this.u == null) {
                continue;
            }
            if (((ab.a)r2).o()) {
                continue;
            }
            this.r.w();
            final ByteBuffer h = this.r.h;
            final int a = c0.a;
            if (h.remaining() == 16) {
                this.s.z(h.limit(), h.array());
                this.s.B(h.arrayOffset() + 4);
                final float[] array2 = new float[3];
                while (true) {
                    array = array2;
                    if (n3 >= 3) {
                        break;
                    }
                    array2[n3] = Float.intBitsToFloat(this.s.e());
                    ++n3;
                }
            }
            if (array == null) {
                continue;
            }
            this.u.c(array, this.v - this.t);
        }
    }
    
    public final void z() {
        final a u = this.u;
        if (u != null) {
            u.e();
        }
    }
}
