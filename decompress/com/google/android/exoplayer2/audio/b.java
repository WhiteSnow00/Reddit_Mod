// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import android.os.SystemClock;
import ad.c0;
import java.lang.reflect.Method;
import xa.j;
import android.media.AudioTrack;

public final class b
{
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final a a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public j f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;
    
    public b(final DefaultAudioSink$j a) {
        this.a = (a)a;
        while (true) {
            if (c0.a < 18) {
                break Label_0029;
            }
            try {
                this.n = AudioTrack.class.getMethod("getLatency", (Class<?>[])null);
                this.b = new long[10];
            }
            catch (final NoSuchMethodException ex) {
                continue;
            }
            break;
        }
    }
    
    public final long a() {
        final AudioTrack c = this.c;
        c.getClass();
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + (SystemClock.elapsedRealtime() * 1000L - this.x) * this.g / 1000000L);
        }
        final int playState = c.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long s;
        final long n = s = (0xFFFFFFFFL & (long)c.getPlaybackHeadPosition());
        if (this.h) {
            if (playState == 2 && n == 0L) {
                this.u = this.s;
            }
            s = n + this.u;
        }
        if (c0.a <= 29) {
            if (s == 0L && this.s > 0L && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > s) {
            ++this.t;
        }
        this.s = s;
        return s + (this.t << 32);
    }
    
    public final boolean b(final long n) {
        final long a = this.a();
        boolean b = false;
        if (n <= a) {
            boolean b2 = false;
            Label_0060: {
                if (this.h) {
                    final AudioTrack c = this.c;
                    c.getClass();
                    if (c.getPlayState() == 2 && this.a() == 0L) {
                        b2 = true;
                        break Label_0060;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public final void c(final AudioTrack c, final boolean b, final int n, final int d, final int e) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new j(c);
        this.g = c.getSampleRate();
        final boolean b2 = true;
        this.h = (b && (c0.a < 23 && (n == 5 || n == 6)) && b2);
        final boolean h = c0.H(n);
        this.q = h;
        long i;
        if (h) {
            i = e / d * 1000000L / this.g;
        }
        else {
            i = -9223372036854775807L;
        }
        this.i = i;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }
    
    public interface a
    {
        void a(final long p0);
        
        void b(final long p0, final long p1, final long p2, final long p3);
        
        void c(final long p0, final long p1, final long p2, final long p3);
        
        void d(final int p0, final long p1);
        
        void e(final long p0);
    }
}
