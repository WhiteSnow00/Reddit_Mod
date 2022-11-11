// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import bg.d;
import lg.e0;
import android.os.Message;
import android.os.Handler;
import a81.e;
import android.os.SystemClock;
import android.os.Looper;
import ad.d0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import androidx.emoji2.text.a;
import ad.c0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import yc.o;

public final class Loader implements o
{
    public static final b d;
    public static final b e;
    public static final b f;
    public final ExecutorService a;
    public c<? extends d> b;
    public IOException c;
    
    static {
        d = new b(0, -9223372036854775807L);
        e = new b(2, -9223372036854775807L);
        f = new b(3, -9223372036854775807L);
    }
    
    public Loader(String s) {
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "ExoPlayer:Loader:".concat(s);
        }
        else {
            s = new String("ExoPlayer:Loader:");
        }
        final int a = c0.a;
        this.a = Executors.newSingleThreadExecutor((ThreadFactory)new androidx.emoji2.text.a(s, 1));
    }
    
    public final void a() {
        final c<? extends d> b = this.b;
        d0.g(b);
        b.a(false);
    }
    
    public final void b() throws IOException {
        final IOException c = this.c;
        if (c == null) {
            final c<? extends d> b = this.b;
            if (b != null) {
                final int f = b.f;
                final IOException j = b.j;
                if (j != null) {
                    if (b.k > f) {
                        throw j;
                    }
                }
            }
            return;
        }
        throw c;
    }
    
    public final boolean c() {
        return this.c != null;
    }
    
    public final boolean d() {
        return this.b != null;
    }
    
    public final void e(final e e) {
        final c<? extends d> b = this.b;
        if (b != null) {
            b.a(true);
        }
        if (e != null) {
            this.a.execute(new f(e));
        }
        this.a.shutdown();
    }
    
    public final <T extends d> long f(final T t, final a<T> a, final int n) {
        final Looper myLooper = Looper.myLooper();
        d0.g(myLooper);
        this.c = null;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(myLooper, (d)t, (a<d>)a, n, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
    
    public static final class UnexpectedLoaderException extends IOException
    {
        public UnexpectedLoaderException(final Throwable t) {
            final String simpleName = t.getClass().getSimpleName();
            final String message = t.getMessage();
            super(b.e(a81.e.h(message, simpleName.length() + 13), "Unexpected ", simpleName, ": ", message), t);
        }
    }
    
    public interface a<T extends d>
    {
        void m(final T p0, final long p1, final long p2, final boolean p3);
        
        void o(final T p0, final long p1, final long p2);
        
        b q(final T p0, final long p1, final long p2, final IOException p3, final int p4);
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public final boolean a() {
            final int a = this.a;
            boolean b = true;
            if (a != 0) {
                b = (a == 1 && b);
            }
            return b;
        }
    }
    
    public final class c<T extends d> extends Handler implements Runnable
    {
        public final int f;
        public final T g;
        public final long h;
        public a<T> i;
        public IOException j;
        public int k;
        public Thread l;
        public boolean m;
        public volatile boolean n;
        
        public c(final Looper looper, final T g, final a<T> i, final int f, final long h) {
            super(looper);
            this.g = g;
            this.i = i;
            this.f = f;
            this.h = h;
        }
        
        public final void a(final boolean n) {
            this.n = n;
            this.j = null;
            Label_0072: {
                if (this.hasMessages(0)) {
                    this.m = true;
                    this.removeMessages(0);
                    if (!n) {
                        this.sendEmptyMessage(1);
                        break Label_0072;
                    }
                    break Label_0072;
                }
                synchronized (this) {
                    this.m = true;
                    this.g.a();
                    final Thread l = this.l;
                    if (l != null) {
                        l.interrupt();
                    }
                    monitorexit(this);
                    if (n) {
                        Loader.this.b = null;
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        final a<T> i = this.i;
                        i.getClass();
                        i.m(this.g, elapsedRealtime, elapsedRealtime - this.h, true);
                        this.i = null;
                    }
                }
            }
        }
        
        public final void b(final long n) {
            d0.f(Loader.this.b == null);
            final Loader o = Loader.this;
            o.b = (c<? extends d>)this;
            if (n > 0L) {
                this.sendEmptyMessageDelayed(0, n);
            }
            else {
                this.j = null;
                o.a.execute(this);
            }
        }
        
        public final void handleMessage(final Message message) {
            if (this.n) {
                return;
            }
            final int what = message.what;
            if (what == 0) {
                this.j = null;
                final Loader o = Loader.this;
                final ExecutorService a = o.a;
                final c<? extends d> b = o.b;
                b.getClass();
                a.execute(b);
                return;
            }
            if (what == 3) {
                throw (Error)message.obj;
            }
            Loader.this.b = null;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long n = elapsedRealtime - this.h;
            final a<T> i = this.i;
            i.getClass();
            if (this.m) {
                i.m(this.g, elapsedRealtime, n, false);
                return;
            }
            final int what2 = message.what;
            if (what2 != 1) {
                if (what2 == 2) {
                    final IOException j = (IOException)message.obj;
                    this.j = j;
                    final int k = this.k + 1;
                    this.k = k;
                    final b q = i.q(this.g, elapsedRealtime, n, j, k);
                    final int a2 = q.a;
                    if (a2 == 3) {
                        Loader.this.c = this.j;
                    }
                    else if (a2 != 2) {
                        if (a2 == 1) {
                            this.k = 1;
                        }
                        long b2 = q.b;
                        if (b2 == -9223372036854775807L) {
                            b2 = Math.min((this.k - 1) * 1000, 5000);
                        }
                        this.b(b2);
                    }
                }
            }
            else {
                try {
                    i.o(this.g, elapsedRealtime, n);
                }
                catch (final RuntimeException ex) {
                    e0.I("LoadTask", "Unexpected exception handling load completed", (Throwable)ex);
                    Loader.this.c = new UnexpectedLoaderException(ex);
                }
            }
        }
        
        public final void run() {
            try {
                synchronized (this) {
                    final boolean b = !this.m;
                    this.l = Thread.currentThread();
                    monitorexit(this);
                    if (b) {
                        final String simpleName = this.g.getClass().getSimpleName();
                        String concat;
                        if (simpleName.length() != 0) {
                            concat = "load:".concat(simpleName);
                        }
                        else {
                            concat = new String("load:");
                        }
                        bg.d.D(concat);
                        try {
                            this.g.load();
                        }
                        finally {
                            bg.d.Y();
                        }
                    }
                    synchronized (this) {
                        this.l = null;
                        Thread.interrupted();
                        monitorexit(this);
                        if (!this.n) {
                            this.sendEmptyMessage(1);
                        }
                    }
                }
            }
            catch (final Error error) {
                if (!this.n) {
                    e0.I("LoadTask", "Unexpected error loading stream", (Throwable)error);
                    this.obtainMessage(3, (Object)error).sendToTarget();
                }
                throw error;
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                if (!this.n) {
                    e0.I("LoadTask", "OutOfMemory error loading stream", (Throwable)outOfMemoryError);
                    this.obtainMessage(2, (Object)new UnexpectedLoaderException(outOfMemoryError)).sendToTarget();
                }
            }
            catch (final Exception ex) {
                if (!this.n) {
                    e0.I("LoadTask", "Unexpected exception loading stream", (Throwable)ex);
                    this.obtainMessage(2, (Object)new UnexpectedLoaderException(ex)).sendToTarget();
                }
            }
            catch (final IOException ex2) {
                if (!this.n) {
                    this.obtainMessage(2, (Object)ex2).sendToTarget();
                }
            }
        }
    }
    
    public interface d
    {
        void a();
        
        void load() throws IOException;
    }
    
    public interface e
    {
        void h();
    }
    
    public static final class f implements Runnable
    {
        public final e f;
        
        public f(final e f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            this.f.h();
        }
    }
}
