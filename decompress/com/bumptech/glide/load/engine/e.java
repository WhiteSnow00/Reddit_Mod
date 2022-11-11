// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import java.lang.ref.Reference;
import java.io.File;
import s8.c;
import l9.a$c;
import k9.g$a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.SingleRequest;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import o8.j;
import java.util.Map;
import com.bumptech.glide.Priority;
import q8.l;
import k9.f;
import o8.d;
import android.util.Log;
import q8.n;
import v0.i;
import z0.c1;
import s8.h;
import q8.g;

public final class e implements q8.g, h.a, g.a
{
    public static final boolean h;
    public final c1 a;
    public final i b;
    public final h c;
    public final b d;
    public final n e;
    public final a f;
    public final com.bumptech.glide.load.engine.a g;
    
    static {
        h = Log.isLoggable("Engine", 2);
    }
    
    public e(final h c, s8.a.a g, final t8.a a, final t8.a a2, final t8.a a3, final t8.a a4) {
        this.c = c;
        final c c2 = new c(g);
        g = (s8.a.a)new com.bumptech.glide.load.engine.a();
        this.g = (com.bumptech.glide.load.engine.a)g;
        synchronized (this) {
            synchronized (g) {
                ((com.bumptech.glide.load.engine.a)g).d = this;
                monitorexit(g);
                monitorexit(this);
                this.b = new i(2);
                this.a = new c1(4);
                this.d = new b(a, a2, a3, a4, (q8.g)this, this);
                this.f = new a(c2);
                this.e = new n();
                ((s8.g)c).d = this;
            }
        }
    }
    
    public static void d(final String s, final long n, final o8.d d) {
        final StringBuilder q = d.q(s, " in ");
        q.append(f.a(n));
        q.append("ms, key: ");
        q.append(d);
        Log.v("Engine", q.toString());
    }
    
    public static void e(final l l) {
        if (l instanceof g) {
            ((g)l).b();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
    
    public final void a(final o8.d d, final g<?> g) {
        final com.bumptech.glide.load.engine.a g2 = this.g;
        synchronized (g2) {
            final com.bumptech.glide.load.engine.a.a a = g2.b.remove(d);
            if (a != null) {
                a.c = null;
                a.clear();
            }
            monitorexit(g2);
            if (g.f) {
                final l l = (l)((k9.g)this.c).d((Object)d, (Object)g);
            }
            else {
                this.e.a((l)g, false);
            }
        }
    }
    
    public final <R> d b(final com.bumptech.glide.f f, final Object o, final o8.d d, final int n, final int n2, final Class<?> clazz, final Class<R> clazz2, final Priority priority, final q8.f f2, final Map<Class<?>, j<?>> map, final boolean b, final boolean b2, final o8.g g, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final g9.g g2, final Executor executor) {
        long elapsedRealtimeNanos;
        if (com.bumptech.glide.load.engine.e.h) {
            final int b7 = f.b;
            elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        }
        else {
            elapsedRealtimeNanos = 0L;
        }
        this.b.getClass();
        final q8.h h = new q8.h(o, d, n, n2, (Map)map, (Class)clazz, (Class)clazz2, g);
        synchronized (this) {
            final g<?> c = this.c(h, b3, elapsedRealtimeNanos);
            if (c == null) {
                return this.f(f, o, d, n, n2, clazz, clazz2, priority, f2, map, b, b2, g, b3, b4, b5, b6, g2, executor, h, elapsedRealtimeNanos);
            }
            monitorexit(this);
            ((SingleRequest)g2).n((l)c, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }
    
    public final g<?> c(final q8.h h, final boolean b, final long n) {
        if (!b) {
            return null;
        }
        Object g = this.g;
        synchronized (g) {
            final com.bumptech.glide.load.engine.a.a a = ((com.bumptech.glide.load.engine.a)g).b.get(h);
            g g2;
            if (a == null) {
                monitorexit(g);
                g2 = null;
            }
            else {
                g2 = ((Reference<g>)a).get();
                if (g2 == null) {
                    ((com.bumptech.glide.load.engine.a)g).b(a);
                }
                monitorexit(g);
            }
            if (g2 != null) {
                g2.a();
            }
            if (g2 != null) {
                if (com.bumptech.glide.load.engine.e.h) {
                    d("Loaded resource from active resources", n, (o8.d)h);
                }
                return g2;
            }
            g = this.c;
            synchronized (g) {
                final g$a g$a = (g$a)((k9.g)g).a.remove(h);
                Object a2;
                if (g$a == null) {
                    monitorexit(g);
                    a2 = null;
                }
                else {
                    ((k9.g)g).c -= g$a.b;
                    a2 = g$a.a;
                    monitorexit(g);
                }
                final l l = (l)a2;
                g g3;
                if (l == null) {
                    g3 = null;
                }
                else if (l instanceof g) {
                    g3 = (g)l;
                }
                else {
                    g3 = new g(l, true, true, (o8.d)h, (g.a)this);
                }
                if (g3 != null) {
                    g3.a();
                    this.g.a((o8.d)h, g3);
                }
                if (g3 != null) {
                    if (com.bumptech.glide.load.engine.e.h) {
                        d("Loaded resource from cache", n, (o8.d)h);
                    }
                    return g3;
                }
                return null;
            }
        }
    }
    
    public final <R> d f(final com.bumptech.glide.f f, final Object o, final o8.d d, int n, final int n2, final Class<?> g, final Class<R> k, final Priority priority, final q8.f f2, final Map<Class<?>, j<?>> j, final boolean q, final boolean r, final o8.g g2, final boolean r2, final boolean s, final boolean t, final boolean b, final g9.g g3, final Executor executor, final q8.h h, final long n3) {
        final c1 a = this.a;
        Object o2;
        if (b) {
            o2 = a.h;
        }
        else {
            o2 = a.g;
        }
        final com.bumptech.glide.load.engine.f f3 = ((Map<K, com.bumptech.glide.load.engine.f>)o2).get(h);
        if (f3 != null) {
            f3.a(g3, executor);
            if (com.bumptech.glide.load.engine.e.h) {
                d("Added to existing load", n3, (o8.d)h);
            }
            return new d(g3, f3);
        }
        final com.bumptech.glide.load.engine.f u = (com.bumptech.glide.load.engine.f)this.d.g.a();
        ml0.a.l((Object)u);
        synchronized (u) {
            u.q = (o8.d)h;
            u.r = r2;
            u.s = s;
            u.t = t;
            u.u = b;
            monitorexit(u);
            final a f4 = this.f;
            final DecodeJob b2 = (DecodeJob)f4.b.a();
            ml0.a.l((Object)b2);
            final int v = f4.c++;
            final com.bumptech.glide.load.engine.d<R> f5 = b2.f;
            final DecodeJob.e i = b2.i;
            f5.c = f;
            f5.d = o;
            f5.n = d;
            f5.e = n;
            f5.f = n2;
            f5.p = f2;
            f5.g = g;
            f5.h = i;
            f5.k = (Class<R>)k;
            f5.o = priority;
            f5.i = g2;
            f5.j = j;
            f5.q = q;
            f5.r = r;
            b2.m = f;
            b2.n = d;
            b2.o = priority;
            b2.p = h;
            b2.q = n;
            b2.r = n2;
            b2.s = f2;
            b2.z = b;
            b2.t = g2;
            b2.u = (DecodeJob.b<R>)u;
            b2.v = v;
            b2.x = DecodeJob.RunReason.INITIALIZE;
            b2.A = o;
            final c1 a2 = this.a;
            a2.getClass();
            Object o3;
            if (u.u) {
                o3 = a2.h;
            }
            else {
                o3 = a2.g;
            }
            ((Map<q8.h, com.bumptech.glide.load.engine.f>)o3).put(h, u);
            u.a(g3, executor);
            synchronized (u) {
                u.B = b2;
                final DecodeJob.Stage l = b2.l(DecodeJob.Stage.INITIALIZE);
                if (l != DecodeJob.Stage.RESOURCE_CACHE && l != DecodeJob.Stage.DATA_CACHE) {
                    n = 0;
                }
                else {
                    n = 1;
                }
                t8.a a3;
                if (n != 0) {
                    a3 = u.l;
                }
                else if (u.s) {
                    a3 = u.n;
                }
                else if (u.t) {
                    a3 = u.o;
                }
                else {
                    a3 = u.m;
                }
                a3.execute(b2);
                monitorexit(u);
                if (com.bumptech.glide.load.engine.e.h) {
                    d("Started new load", n3, (o8.d)h);
                }
                return new d(g3, u);
            }
        }
    }
    
    public static final class a
    {
        public final DecodeJob.e a;
        public final a$c b;
        public int c;
        
        public a(final c a) {
            this.b = l9.a.a(150, (l9.a.b)new l9.a.b<DecodeJob<?>>() {
                @Override
                public final Object create() {
                    final a a = com.bumptech.glide.load.engine.e.a.this;
                    return new DecodeJob(a.a, a.b);
                }
            });
            this.a = a;
        }
    }
    
    public static final class b
    {
        public final t8.a a;
        public final t8.a b;
        public final t8.a c;
        public final t8.a d;
        public final q8.g e;
        public final g.a f;
        public final a$c g;
        
        public b(final t8.a a, final t8.a b, final t8.a c, final t8.a d, final q8.g e, final g.a f) {
            this.g = l9.a.a(150, (l9.a.b)new l9.a.b<com.bumptech.glide.load.engine.f<?>>() {
                @Override
                public final Object create() {
                    final b a = b.this;
                    return new com.bumptech.glide.load.engine.f(a.a, a.b, a.c, a.d, a.e, a.f, a.g);
                }
            });
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class c implements DecodeJob.e
    {
        public final a.a a;
        public volatile s8.a b;
        
        public c(final a.a a) {
            this.a = a;
        }
        
        public final s8.a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        final s8.c c = (s8.c)this.a;
                        final e e = (e)c.b;
                        final File cacheDir = e.a.getCacheDir();
                        Object b = null;
                        File file;
                        if (cacheDir == null) {
                            file = null;
                        }
                        else {
                            file = cacheDir;
                            if (e.b != null) {
                                file = new File(cacheDir, e.b);
                            }
                        }
                        if (file != null) {
                            if (file.isDirectory() || file.mkdirs()) {
                                b = new s8.d(file, c.a);
                            }
                        }
                        this.b = (s8.a)b;
                    }
                    if (this.b == null) {
                        this.b = (s8.a)new mf1.a();
                    }
                }
            }
            return this.b;
        }
    }
    
    public final class d
    {
        public final com.bumptech.glide.load.engine.f<?> a;
        public final g9.g b;
        
        public d(final g9.g b, final com.bumptech.glide.load.engine.f<?> a) {
            this.b = b;
            this.a = a;
        }
    }
}
