// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import android.util.Log;
import xc.e;
import bc.t;
import com.google.android.exoplayer2.z;
import ah0.b;
import bd.c0;
import zc.j;

public final class c implements y
{
    public final j a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public int j;
    public boolean k;
    
    public c() {
        this(new j(), 50000, 50000, 2500, 5000, -1, false);
    }
    
    public c(final j a, final int n, final int n2, final int n3, final int n4, int n5, final boolean g) {
        a(n3, 0, "bufferForPlaybackMs", "0");
        a(n4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(n, n3, "minBufferMs", "bufferForPlaybackMs");
        a(n, n4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(n2, n, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = a;
        this.b = c0.J((long)n);
        this.c = c0.J((long)n2);
        this.d = c0.J((long)n3);
        this.e = c0.J((long)n4);
        this.f = n5;
        if (n5 == -1) {
            n5 = 13107200;
        }
        this.j = n5;
        this.g = g;
        this.h = c0.J((long)0);
        this.i = false;
    }
    
    public static void a(int length, final int n, final String s, final String s2) {
        final boolean b = length >= n;
        length = s.length();
        final StringBuilder sb = new StringBuilder(s2.length() + (length + 21));
        sb.append(s);
        sb.append(" cannot be less than ");
        sb.append(s2);
        ah0.b.D(b, sb.toString());
    }
    
    public final void b(final boolean b) {
        int f;
        if ((f = this.f) == -1) {
            f = 13107200;
        }
        this.j = f;
        this.k = false;
        if (b) {
            final j a = this.a;
            synchronized (a) {
                if (a.a) {
                    a.a(0);
                }
            }
        }
    }
    
    @Override
    public final zc.b getAllocator() {
        return this.a;
    }
    
    @Override
    public final long getBackBufferDurationUs() {
        return this.h;
    }
    
    @Override
    public final void onPrepared() {
        this.b(false);
    }
    
    @Override
    public final void onReleased() {
        this.b(true);
    }
    
    @Override
    public final void onStopped() {
        this.b(true);
    }
    
    @Override
    public final void onTracksSelected(final z[] array, final t t, final e[] array2) {
        int j;
        if ((j = this.f) == -1) {
            int n = 0;
            int n2 = 0;
            while (true) {
                final int length = array.length;
                final int n3 = 13107200;
                if (n >= length) {
                    j = Math.max(13107200, n2);
                    break;
                }
                int n4 = n2;
                if (array2[n] != null) {
                    int n5 = n3;
                    while (true) {
                        switch (array[n].s()) {
                            default: {
                                throw new IllegalArgumentException();
                            }
                            case 1: {
                                n4 = n2 + n5;
                                break;
                            }
                            case 3:
                            case 4:
                            case 5:
                            case 6: {
                                n5 = 131072;
                                continue;
                            }
                            case 2: {
                                n5 = 131072000;
                                continue;
                            }
                            case 0: {
                                n5 = 144310272;
                                continue;
                            }
                            case -2: {
                                n5 = 0;
                                continue;
                            }
                        }
                        break;
                    }
                }
                ++n;
                n2 = n4;
            }
        }
        this.j = j;
        this.a.a(j);
    }
    
    @Override
    public final boolean retainBackBufferFromKeyframe() {
        return this.i;
    }
    
    @Override
    public final boolean shouldContinueLoading(long n, final long n2, final float n3) {
        final j a = this.a;
        synchronized (a) {
            final int d = a.d;
            final int b = a.b;
            monitorexit(a);
            final int j = this.j;
            final boolean b2 = true;
            final boolean b3 = d * b >= j;
            n = this.b;
            if (n3 > 1.0f) {
                n = Math.min(c0.u(n3, n), this.c);
            }
            if (n2 < Math.max(n, 500000L)) {
                boolean k = b2;
                if (!this.g) {
                    k = (!b3 && b2);
                }
                this.k = k;
                if (!k && n2 < 500000L) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            }
            else if (n2 >= this.c || b3) {
                this.k = false;
            }
            return this.k;
        }
    }
    
    @Override
    public final boolean shouldStartPlayback(long n, final float n2, final boolean b, final long n3) {
        final long y = c0.y(n2, n);
        if (b) {
            n = this.e;
        }
        else {
            n = this.d;
        }
        long min = n;
        if (n3 != -9223372036854775807L) {
            min = Math.min(n3 / 2L, n);
        }
        if (min > 0L && y < min) {
            if (!this.g) {
                final j a = this.a;
                synchronized (a) {
                    final int d = a.d;
                    final int b2 = a.b;
                    monitorexit(a);
                    if (d * b2 >= this.j) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public static final class a
    {
        public j a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;
        
        public a() {
            this.b = 50000;
            this.c = 50000;
            this.d = 2500;
            this.e = 5000;
            this.f = -1;
            this.g = false;
        }
        
        public final c a() {
            ah0.b.H(this.h ^ true);
            this.h = true;
            if (this.a == null) {
                this.a = new j();
            }
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        
        public final void b(final int b, final int c, final int d, final int e) {
            b.H(this.h ^ true);
            c.a(d, 0, "bufferForPlaybackMs", "0");
            c.a(e, 0, "bufferForPlaybackAfterRebufferMs", "0");
            c.a(b, d, "minBufferMs", "bufferForPlaybackMs");
            c.a(b, e, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            c.a(c, b, "maxBufferMs", "minBufferMs");
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
