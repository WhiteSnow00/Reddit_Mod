// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import ad.d0;
import android.os.Looper;
import ad.c;

public final class x
{
    public final b a;
    public final a b;
    public final c c;
    public int d;
    public Object e;
    public Looper f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    public x(final m b, final b a, final e0 e0, final int n, final c c, final Looper f) {
        this.b = (a)b;
        this.a = a;
        this.f = f;
        this.c = c;
    }
    
    public final void a(final long n) throws InterruptedException, TimeoutException {
        synchronized (this) {
            d0.f(this.g);
            d0.f(this.f.getThread() != Thread.currentThread());
            final long d = this.c.d();
            long n2 = n;
            boolean i;
            while (true) {
                i = this.i;
                if (i || n2 <= 0L) {
                    break;
                }
                this.c.b();
                this.wait(n2);
                n2 = d + n - this.c.d();
            }
            if (i) {
                return;
            }
            throw new TimeoutException("Message delivery timed out.");
        }
    }
    
    public final void b(final boolean b) {
        synchronized (this) {
            this.h |= b;
            this.i = true;
            this.notifyAll();
        }
    }
    
    public final void c() {
        d0.f(this.g ^ true);
        this.g = true;
        final m m = (m)this.b;
        synchronized (m) {
            if (!m.E && ((Thread)m.n).isAlive()) {
                m.m.d(14, this).a();
                monitorexit(m);
            }
            else {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                this.b(false);
            }
        }
    }
    
    public interface a
    {
    }
    
    public interface b
    {
        void h(final int p0, final Object p1) throws ExoPlaybackException;
    }
}
