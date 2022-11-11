// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import java.util.Iterator;
import java.util.List;
import com.bumptech.glide.request.SingleRequest;
import z0.c1;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import l9.a$c;
import com.bumptech.glide.load.DataSource;
import q8.l;
import o8.d;
import java.util.concurrent.atomic.AtomicInteger;
import z3.e;
import l9.d$a;
import l9.a;

public final class f<R> implements DecodeJob.b<R>, l9.a.d
{
    public static final c E;
    public g<?> A;
    public DecodeJob<R> B;
    public volatile boolean C;
    public boolean D;
    public final e f;
    public final d$a g;
    public final g.a h;
    public final z3.e<f<?>> i;
    public final c j;
    public final q8.g k;
    public final t8.a l;
    public final t8.a m;
    public final t8.a n;
    public final t8.a o;
    public final AtomicInteger p;
    public o8.d q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public l<?> v;
    public DataSource w;
    public boolean x;
    public GlideException y;
    public boolean z;
    
    static {
        E = new c();
    }
    
    public f() {
        throw null;
    }
    
    public f(final t8.a l, final t8.a m, final t8.a n, final t8.a o, final q8.g k, final g.a h, final a$c i) {
        final c e = com.bumptech.glide.load.engine.f.E;
        this.f = new e(new ArrayList(2));
        this.g = new d$a();
        this.p = new AtomicInteger();
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.k = k;
        this.h = h;
        this.i = (z3.e<f<?>>)i;
        this.j = e;
    }
    
    public final void a(final g9.g g, final Executor executor) {
        synchronized (this) {
            this.g.a();
            this.f.f.add(new d(g, executor));
            final boolean x = this.x;
            boolean b = true;
            if (x) {
                this.e(1);
                executor.execute(new b(g));
            }
            else if (this.z) {
                this.e(1);
                executor.execute(new a(g));
            }
            else {
                if (this.C) {
                    b = false;
                }
                ml0.a.i(b, "Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }
    
    public final void b() {
        if (this.f()) {
            return;
        }
        this.C = true;
        final DecodeJob<R> b = this.B;
        b.J = true;
        final com.bumptech.glide.load.engine.c h = b.H;
        if (h != null) {
            h.cancel();
        }
        final q8.g k = this.k;
        final o8.d q = this.q;
        final com.bumptech.glide.load.engine.e e = (com.bumptech.glide.load.engine.e)k;
        synchronized (e) {
            final c1 a = e.a;
            a.getClass();
            Object o;
            if (this.u) {
                o = a.h;
            }
            else {
                o = a.g;
            }
            final Map map = (Map)o;
            if (this.equals(map.get(q))) {
                map.remove(q);
            }
        }
    }
    
    @Override
    public final d$a c() {
        return this.g;
    }
    
    public final void d() {
        synchronized (this) {
            this.g.a();
            ml0.a.i(this.f(), "Not yet complete!");
            final int decrementAndGet = this.p.decrementAndGet();
            ml0.a.i(decrementAndGet >= 0, "Can't decrement below 0");
            g<?> a;
            if (decrementAndGet == 0) {
                a = this.A;
                this.g();
            }
            else {
                a = null;
            }
            monitorexit(this);
            if (a != null) {
                a.b();
            }
        }
    }
    
    public final void e(final int n) {
        synchronized (this) {
            ml0.a.i(this.f(), "Not yet complete!");
            if (this.p.getAndAdd(n) == 0) {
                final g<?> a = this.A;
                if (a != null) {
                    a.a();
                }
            }
        }
    }
    
    public final boolean f() {
        return this.z || this.x || this.C;
    }
    
    public final void g() {
        synchronized (this) {
            if (this.q != null) {
                this.f.f.clear();
                this.q = null;
                this.A = null;
                this.v = null;
                this.z = false;
                this.C = false;
                this.x = false;
                this.D = false;
                final DecodeJob<R> b = this.B;
                final DecodeJob.f l = b.l;
                synchronized (l) {
                    l.a = true;
                    final boolean a = l.a();
                    monitorexit(l);
                    if (a) {
                        b.o();
                    }
                    this.B = null;
                    this.y = null;
                    this.w = null;
                    this.i.b((Object)this);
                    return;
                }
            }
            throw new IllegalArgumentException();
        }
    }
    
    public final void h(final g9.g g) {
        synchronized (this) {
            this.g.a();
            this.f.f.remove(new d(g, (Executor)k9.e.b));
            if (this.f.f.isEmpty()) {
                this.b();
                if ((this.x || this.z) && this.p.get() == 0) {
                    this.g();
                }
            }
        }
    }
    
    public final class a implements Runnable
    {
        public final g9.g f;
        
        public a(final g9.g f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            final SingleRequest singleRequest = (SingleRequest)this.f;
            singleRequest.b.a();
            synchronized (singleRequest.c) {
                synchronized (com.bumptech.glide.load.engine.f.this) {
                    if (com.bumptech.glide.load.engine.f.this.f.f.contains(new d(this.f, (Executor)k9.e.b))) {
                        final f g = com.bumptech.glide.load.engine.f.this;
                        final g9.g f = this.f;
                        g.getClass();
                        try {
                            ((SingleRequest)f).m(g.y, 5);
                        }
                        finally {
                            final Throwable t;
                            throw new CallbackException(t);
                        }
                    }
                    com.bumptech.glide.load.engine.f.this.d();
                }
            }
        }
    }
    
    public final class b implements Runnable
    {
        public final g9.g f;
        
        public b(final g9.g f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            final SingleRequest singleRequest = (SingleRequest)this.f;
            singleRequest.b.a();
            synchronized (singleRequest.c) {
                synchronized (com.bumptech.glide.load.engine.f.this) {
                    if (com.bumptech.glide.load.engine.f.this.f.f.contains(new d(this.f, (Executor)k9.e.b))) {
                        com.bumptech.glide.load.engine.f.this.A.a();
                        final f g = com.bumptech.glide.load.engine.f.this;
                        final g9.g f = this.f;
                        g.getClass();
                        try {
                            ((SingleRequest)f).n((l)g.A, g.w, g.D);
                            com.bumptech.glide.load.engine.f.this.h(this.f);
                        }
                        finally {
                            final Throwable t;
                            throw new CallbackException(t);
                        }
                    }
                    com.bumptech.glide.load.engine.f.this.d();
                }
            }
        }
    }
    
    public static final class c
    {
    }
    
    public static final class d
    {
        public final g9.g a;
        public final Executor b;
        
        public d(final g9.g a, final Executor b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof d && this.a.equals(((d)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public static final class e implements Iterable<d>
    {
        public final List<d> f;
        
        public e(final ArrayList f) {
            this.f = f;
        }
        
        @Override
        public final Iterator<d> iterator() {
            return this.f.iterator();
        }
    }
}
