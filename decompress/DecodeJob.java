// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import java.util.List;
import z0.c1;
import java.util.Map;
import java.util.Collection;
import q8.k;
import q8.i;
import java.util.Iterator;
import q8.j;
import j0.b;
import android.os.Build$VERSION;
import android.util.Log;
import android.os.SystemClock;
import q8.l;
import l9.a$c;
import o8.g;
import q8.h;
import com.bumptech.glide.Priority;
import com.bumptech.glide.f;
import z3.e;
import l9.d$a;
import java.util.ArrayList;
import com.bumptech.glide.load.DataSource;
import o8.d;
import l9.a;

public final class DecodeJob<R> implements com.bumptech.glide.load.engine.c.a, Runnable, Comparable<DecodeJob<?>>, l9.a.d
{
    public Object A;
    public Thread B;
    public o8.d C;
    public o8.d D;
    public Object E;
    public DataSource F;
    public com.bumptech.glide.load.data.d<?> G;
    public volatile com.bumptech.glide.load.engine.c H;
    public volatile boolean I;
    public volatile boolean J;
    public boolean K;
    public final com.bumptech.glide.load.engine.d<R> f;
    public final ArrayList g;
    public final d$a h;
    public final e i;
    public final z3.e<DecodeJob<?>> j;
    public final d<?> k;
    public final f l;
    public com.bumptech.glide.f m;
    public o8.d n;
    public Priority o;
    public h p;
    public int q;
    public int r;
    public q8.f s;
    public g t;
    public b<R> u;
    public int v;
    public Stage w;
    public RunReason x;
    public long y;
    public boolean z;
    
    public DecodeJob(final e i, final a$c j) {
        this.f = new com.bumptech.glide.load.engine.d<R>();
        this.g = new ArrayList();
        this.h = new d$a();
        this.k = new d<Object>();
        this.l = new f();
        this.i = i;
        this.j = (z3.e<DecodeJob<?>>)j;
    }
    
    @Override
    public final void a(final o8.d c, final Object e, final com.bumptech.glide.load.data.d<?> g, final DataSource f, final o8.d d) {
        this.C = c;
        this.E = e;
        this.G = g;
        this.F = f;
        this.D = d;
        final ArrayList a = this.f.a();
        boolean k = false;
        if (c != a.get(0)) {
            k = true;
        }
        this.K = k;
        if (Thread.currentThread() != this.B) {
            this.x = RunReason.DECODE_DATA;
            final com.bumptech.glide.load.engine.f f2 = (com.bumptech.glide.load.engine.f)this.u;
            t8.a a2;
            if (f2.s) {
                a2 = f2.n;
            }
            else if (f2.t) {
                a2 = f2.o;
            }
            else {
                a2 = f2.m;
            }
            a2.execute(this);
            return;
        }
        try {
            this.i();
        }
        finally {}
    }
    
    @Override
    public final d$a c() {
        return this.h;
    }
    
    @Override
    public final int compareTo(final Object o) {
        final DecodeJob decodeJob = (DecodeJob)o;
        int n;
        if ((n = this.o.ordinal() - decodeJob.o.ordinal()) == 0) {
            n = this.v - decodeJob.v;
        }
        return n;
    }
    
    @Override
    public final void d(final o8.d d, final Exception ex, final com.bumptech.glide.load.data.d<?> d2, final DataSource dataSource) {
        d2.b();
        final GlideException ex2 = new GlideException("Fetching data failed", ex);
        ex2.setLoggingDetails(d, dataSource, d2.a());
        this.g.add(ex2);
        if (Thread.currentThread() != this.B) {
            this.x = RunReason.SWITCH_TO_SOURCE_SERVICE;
            final com.bumptech.glide.load.engine.f f = (com.bumptech.glide.load.engine.f)this.u;
            t8.a a;
            if (f.s) {
                a = f.n;
            }
            else if (f.t) {
                a = f.o;
            }
            else {
                a = f.m;
            }
            a.execute(this);
        }
        else {
            this.p();
        }
    }
    
    @Override
    public final void e() {
        this.x = RunReason.SWITCH_TO_SOURCE_SERVICE;
        final com.bumptech.glide.load.engine.f f = (com.bumptech.glide.load.engine.f)this.u;
        t8.a a;
        if (f.s) {
            a = f.n;
        }
        else if (f.t) {
            a = f.o;
        }
        else {
            a = f.m;
        }
        a.execute(this);
    }
    
    public final <Data> l<R> f(final com.bumptech.glide.load.data.d<?> d, final Data data, final DataSource dataSource) throws GlideException {
        if (data == null) {
            d.b();
            return null;
        }
        try {
            final int b = k9.f.b;
            final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            final l<R> h = this.h(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(h);
                this.m(elapsedRealtimeNanos, sb.toString(), null);
            }
            return h;
        }
        finally {
            d.b();
        }
    }
    
    public final <Data> l<R> h(Data b, final DataSource dataSource) throws GlideException {
        final q8.j<?, ?, R> c = this.f.c(b.getClass());
        final g t = this.t;
        g g = null;
        Label_0105: {
            if (Build$VERSION.SDK_INT < 26) {
                g = t;
            }
            else {
                final boolean b2 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f.r;
                final o8.f j = com.bumptech.glide.load.resource.bitmap.a.j;
                final Boolean b3 = t.a((o8.f<Boolean>)j);
                if (b3 != null) {
                    g = t;
                    if (!b3) {
                        break Label_0105;
                    }
                    if (b2) {
                        g = t;
                        break Label_0105;
                    }
                }
                g = new g();
                g.a.k((j0.b)this.t.a);
                g.a.put((Object)j, (Object)b2);
            }
        }
        final com.bumptech.glide.load.data.f e = this.m.b.e;
        synchronized (e) {
            Object o;
            final com.bumptech.glide.load.data.e.a<Object> a = (com.bumptech.glide.load.data.e.a<Object>)(o = e.a.get(b.getClass()));
            if (a == null) {
                final Iterator iterator = e.a.values().iterator();
                do {
                    o = a;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    o = iterator.next();
                } while (!((com.bumptech.glide.load.data.e.a<Data>)o).a().isAssignableFrom(b.getClass()));
            }
            Object b4;
            if ((b4 = o) == null) {
                b4 = com.bumptech.glide.load.data.f.b;
            }
            b = (Data)((com.bumptech.glide.load.data.e.a<Data>)b4).b(b);
            monitorexit(e);
            try {
                return (l<R>)c.a(this.q, this.r, g, (com.bumptech.glide.load.data.e)b, new c(dataSource));
            }
            finally {
                ((com.bumptech.glide.load.data.e)b).b();
            }
        }
    }
    
    public final void i() {
        if (Log.isLoggable("DecodeJob", 2)) {
            final long y = this.y;
            final StringBuilder r = a.r("data: ");
            r.append(this.E);
            r.append(", cache key: ");
            r.append(this.C);
            r.append(", fetcher: ");
            r.append(this.G);
            this.m(y, "Retrieved data", r.toString());
        }
        Object o = null;
        q8.l<?> f;
        try {
            f = this.f(this.G, this.E, this.F);
        }
        catch (final GlideException ex) {
            ex.setLoggingDetails(this.D, this.F);
            this.g.add(ex);
            f = null;
        }
        if (f != null) {
            Object f2 = this.F;
            final boolean k = this.K;
            if (f instanceof i) {
                ((i)f).a();
            }
            final q8.k<?> c = this.k.c;
            final int n = 0;
            final boolean b = c != null;
            Object v = f;
            if (b) {
                o = q8.k.j.a();
                ml0.a.l(o);
                ((k)o).i = false;
                ((k)o).h = true;
                ((k)o).g = f;
                v = o;
            }
            this.w();
            Object o2 = (com.bumptech.glide.load.engine.f)this.u;
            synchronized (o2) {
                ((com.bumptech.glide.load.engine.f)o2).v = (l<?>)v;
                ((com.bumptech.glide.load.engine.f)o2).w = (DataSource)f2;
                ((com.bumptech.glide.load.engine.f)o2).D = k;
                monitorexit(o2);
                synchronized (o2) {
                    ((com.bumptech.glide.load.engine.f)o2).g.a();
                    Label_0626: {
                        if (((com.bumptech.glide.load.engine.f)o2).C) {
                            ((com.bumptech.glide.load.engine.f)o2).v.recycle();
                            ((com.bumptech.glide.load.engine.f)o2).g();
                            monitorexit(o2);
                            break Label_0626;
                        }
                        if (((com.bumptech.glide.load.engine.f)o2).f.f.isEmpty()) {
                            throw new IllegalStateException("Received a resource without any callbacks to notify");
                        }
                        if (((com.bumptech.glide.load.engine.f)o2).x) {
                            throw new IllegalStateException("Already have resource");
                        }
                        final com.bumptech.glide.load.engine.f.c j = ((com.bumptech.glide.load.engine.f)o2).j;
                        final l<?> v2 = ((com.bumptech.glide.load.engine.f)o2).v;
                        final boolean r2 = ((com.bumptech.glide.load.engine.f)o2).r;
                        final o8.d q = ((com.bumptech.glide.load.engine.f)o2).q;
                        final com.bumptech.glide.load.engine.g.a h = ((com.bumptech.glide.load.engine.f)o2).h;
                        j.getClass();
                        ((com.bumptech.glide.load.engine.f)o2).A = new com.bumptech.glide.load.engine.g<Object>((q8.l<Object>)v2, r2, true, q, h);
                        ((com.bumptech.glide.load.engine.f)o2).x = true;
                        final com.bumptech.glide.load.engine.f.e f3 = ((com.bumptech.glide.load.engine.f)o2).f;
                        f3.getClass();
                        final ArrayList list = new ArrayList(f3.f);
                        final com.bumptech.glide.load.engine.f.e e = new com.bumptech.glide.load.engine.f.e(list);
                        ((com.bumptech.glide.load.engine.f)o2).e(list.size() + 1);
                        final o8.d q2 = ((com.bumptech.glide.load.engine.f)o2).q;
                        final com.bumptech.glide.load.engine.g<?> a = ((com.bumptech.glide.load.engine.f)o2).A;
                        monitorexit(o2);
                        f2 = ((com.bumptech.glide.load.engine.f)o2).k;
                        monitorenter(f2);
                        Label_0503: {
                            if (a == null) {
                                break Label_0503;
                            }
                            try {
                                if (a.f) {
                                    ((com.bumptech.glide.load.engine.e)f2).g.a(q2, a);
                                }
                                final c1 a2 = ((com.bumptech.glide.load.engine.e)f2).a;
                                a2.getClass();
                                Object o3;
                                if (((com.bumptech.glide.load.engine.f)o2).u) {
                                    o3 = a2.h;
                                }
                                else {
                                    o3 = a2.g;
                                }
                                final Map map = (Map)o3;
                                if (o2.equals(map.get(q2))) {
                                    map.remove(q2);
                                }
                                monitorexit(f2);
                                for (final com.bumptech.glide.load.engine.f.d d : e) {
                                    d.b.execute((com.bumptech.glide.load.engine.f)o2.new b(d.a));
                                }
                                ((com.bumptech.glide.load.engine.f)o2).d();
                                this.w = Stage.ENCODE;
                                try {
                                    final d<?> i = this.k;
                                    int n2 = n;
                                    if (i.c != null) {
                                        n2 = 1;
                                    }
                                    if (n2 != 0) {
                                        o2 = this.i;
                                        final g t = this.t;
                                        i.getClass();
                                        try {
                                            o2 = ((com.bumptech.glide.load.engine.e.c)o2).a();
                                            final o8.d a3 = i.a;
                                            f2 = new q8.d((o8.a)i.b, (Object)i.c, t);
                                            ((s8.a)o2).b(a3, (q8.d)f2);
                                        }
                                        finally {
                                            i.c.a();
                                        }
                                    }
                                    if (o != null) {
                                        ((k)o).a();
                                    }
                                    final f l = this.l;
                                    synchronized (l) {
                                        l.b = true;
                                        final boolean a4 = l.a();
                                        monitorexit(l);
                                        if (a4) {
                                            this.o();
                                        }
                                        return;
                                    }
                                }
                                finally {
                                    if (o != null) {
                                        ((k)o).a();
                                    }
                                }
                            }
                            finally {
                                monitorexit(f2);
                            }
                        }
                    }
                    throw new IllegalStateException("Already have resource");
                }
            }
        }
        this.p();
    }
    
    public final com.bumptech.glide.load.engine.c k() {
        final int n = DecodeJob$a.b[this.w.ordinal()];
        if (n == 1) {
            return new com.bumptech.glide.load.engine.h(this.f, this);
        }
        if (n == 2) {
            final com.bumptech.glide.load.engine.d<R> f = this.f;
            return new com.bumptech.glide.load.engine.b(f.a(), f, this);
        }
        if (n == 3) {
            return new com.bumptech.glide.load.engine.i(this.f, this);
        }
        if (n == 4) {
            return null;
        }
        final StringBuilder r = a.r("Unrecognized stage: ");
        r.append(this.w);
        throw new IllegalStateException(r.toString());
    }
    
    public final Stage l(Stage stage) {
        final int n = DecodeJob$a.b[stage.ordinal()];
        if (n == 1) {
            if (this.s.a()) {
                stage = Stage.DATA_CACHE;
            }
            else {
                stage = this.l(Stage.DATA_CACHE);
            }
            return stage;
        }
        if (n == 2) {
            if (this.z) {
                stage = Stage.FINISHED;
            }
            else {
                stage = Stage.SOURCE;
            }
            return stage;
        }
        if (n == 3 || n == 4) {
            return Stage.FINISHED;
        }
        if (n == 5) {
            if (this.s.b()) {
                stage = Stage.RESOURCE_CACHE;
            }
            else {
                stage = this.l(Stage.RESOURCE_CACHE);
            }
            return stage;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(stage);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void m(final long n, String h, final String s) {
        final StringBuilder q = d.q(h, " in ");
        q.append(k9.f.a(n));
        q.append(", load key: ");
        q.append(this.p);
        if (s != null) {
            h = al0.b.h(", ", s);
        }
        else {
            h = "";
        }
        q.append(h);
        q.append(", thread: ");
        q.append(Thread.currentThread().getName());
        Log.v("DecodeJob", q.toString());
    }
    
    public final void n() {
        this.w();
        final GlideException y = new GlideException("Failed to load resource", new ArrayList<Throwable>(this.g));
        Object l = (com.bumptech.glide.load.engine.f)this.u;
        synchronized (l) {
            ((com.bumptech.glide.load.engine.f)l).y = y;
            monitorexit(l);
            synchronized (l) {
                ((com.bumptech.glide.load.engine.f)l).g.a();
                Label_0276: {
                    if (((com.bumptech.glide.load.engine.f)l).C) {
                        ((com.bumptech.glide.load.engine.f)l).g();
                        monitorexit(l);
                        break Label_0276;
                    }
                    if (((com.bumptech.glide.load.engine.f)l).f.f.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (((com.bumptech.glide.load.engine.f)l).z) {
                        throw new IllegalStateException("Already failed once");
                    }
                    ((com.bumptech.glide.load.engine.f)l).z = true;
                    final o8.d q = ((com.bumptech.glide.load.engine.f)l).q;
                    final com.bumptech.glide.load.engine.f.e f = ((com.bumptech.glide.load.engine.f)l).f;
                    f.getClass();
                    final ArrayList list = new ArrayList(f.f);
                    final com.bumptech.glide.load.engine.f.e e = new com.bumptech.glide.load.engine.f.e(list);
                    ((com.bumptech.glide.load.engine.f)l).e(list.size() + 1);
                    monitorexit(l);
                    final com.bumptech.glide.load.engine.e e2 = (com.bumptech.glide.load.engine.e)((com.bumptech.glide.load.engine.f)l).k;
                    synchronized (e2) {
                        final c1 a = e2.a;
                        a.getClass();
                        Object o;
                        if (((com.bumptech.glide.load.engine.f)l).u) {
                            o = a.h;
                        }
                        else {
                            o = a.g;
                        }
                        final Map map = (Map)o;
                        if (l.equals(map.get(q))) {
                            map.remove(q);
                        }
                        monitorexit(e2);
                        for (final com.bumptech.glide.load.engine.f.d d : e) {
                            d.b.execute((com.bumptech.glide.load.engine.f)l.new a(d.a));
                        }
                        ((com.bumptech.glide.load.engine.f)l).d();
                        l = this.l;
                        synchronized (l) {
                            ((f)l).c = true;
                            final boolean a2 = ((f)l).a();
                            monitorexit(l);
                            if (a2) {
                                this.o();
                            }
                            return;
                        }
                    }
                }
                throw new IllegalStateException("Already failed once");
            }
        }
    }
    
    public final void o() {
        Object o = this.l;
        synchronized (o) {
            ((f)o).b = false;
            ((f)o).a = false;
            ((f)o).c = false;
            monitorexit(o);
            o = this.k;
            ((d)o).a = null;
            ((d)o).b = null;
            ((d)o).c = null;
            o = this.f;
            ((com.bumptech.glide.load.engine.d)o).c = null;
            ((com.bumptech.glide.load.engine.d)o).d = null;
            ((com.bumptech.glide.load.engine.d)o).n = null;
            ((com.bumptech.glide.load.engine.d)o).g = null;
            ((com.bumptech.glide.load.engine.d)o).k = null;
            ((com.bumptech.glide.load.engine.d)o).i = null;
            ((com.bumptech.glide.load.engine.d)o).o = null;
            ((com.bumptech.glide.load.engine.d)o).j = null;
            ((com.bumptech.glide.load.engine.d)o).p = null;
            ((com.bumptech.glide.load.engine.d)o).a.clear();
            ((com.bumptech.glide.load.engine.d)o).l = false;
            ((com.bumptech.glide.load.engine.d)o).b.clear();
            ((com.bumptech.glide.load.engine.d)o).m = false;
            this.I = false;
            this.m = null;
            this.n = null;
            this.t = null;
            this.o = null;
            this.p = null;
            this.u = null;
            this.w = null;
            this.H = null;
            this.B = null;
            this.C = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.y = 0L;
            this.J = false;
            this.A = null;
            this.g.clear();
            this.j.b((Object)this);
        }
    }
    
    public final void p() {
        this.B = Thread.currentThread();
        final int b = k9.f.b;
        this.y = SystemClock.elapsedRealtimeNanos();
        boolean b2 = false;
        do {
            boolean b3 = b2;
            if (!this.J) {
                b3 = b2;
                if (this.H != null) {
                    b2 = this.H.b();
                    if (!(b3 = b2)) {
                        this.w = this.l(this.w);
                        this.H = this.k();
                        continue;
                    }
                }
            }
            if ((this.w == Stage.FINISHED || this.J) && !b3) {
                this.n();
            }
            return;
        } while (this.w != Stage.SOURCE);
        this.e();
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/load/engine/DecodeJob.G:Lcom/bumptech/glide/load/data/d;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        com/bumptech/glide/load/engine/DecodeJob.J:Z
        //     9: ifeq            27
        //    12: aload_0        
        //    13: invokevirtual   com/bumptech/glide/load/engine/DecodeJob.n:()V
        //    16: aload_1        
        //    17: ifnull          26
        //    20: aload_1        
        //    21: invokeinterface com/bumptech/glide/load/data/d.b:()V
        //    26: return         
        //    27: aload_0        
        //    28: invokevirtual   com/bumptech/glide/load/engine/DecodeJob.t:()V
        //    31: aload_1        
        //    32: ifnull          41
        //    35: aload_1        
        //    36: invokeinterface com/bumptech/glide/load/data/d.b:()V
        //    41: return         
        //    42: astore_2       
        //    43: ldc             "DecodeJob"
        //    45: iconst_3       
        //    46: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    49: ifeq            105
        //    52: new             Ljava/lang/StringBuilder;
        //    55: astore_3       
        //    56: aload_3        
        //    57: invokespecial   java/lang/StringBuilder.<init>:()V
        //    60: aload_3        
        //    61: ldc_w           "DecodeJob threw unexpectedly, isCancelled: "
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: aload_3        
        //    69: aload_0        
        //    70: getfield        com/bumptech/glide/load/engine/DecodeJob.J:Z
        //    73: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    76: pop            
        //    77: aload_3        
        //    78: ldc_w           ", stage: "
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: aload_3        
        //    86: aload_0        
        //    87: getfield        com/bumptech/glide/load/engine/DecodeJob.w:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: ldc             "DecodeJob"
        //    96: aload_3        
        //    97: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   100: aload_2        
        //   101: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   104: pop            
        //   105: aload_0        
        //   106: getfield        com/bumptech/glide/load/engine/DecodeJob.w:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;
        //   109: getstatic       com/bumptech/glide/load/engine/DecodeJob$Stage.ENCODE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;
        //   112: if_acmpeq       128
        //   115: aload_0        
        //   116: getfield        com/bumptech/glide/load/engine/DecodeJob.g:Ljava/util/ArrayList;
        //   119: aload_2        
        //   120: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   123: pop            
        //   124: aload_0        
        //   125: invokevirtual   com/bumptech/glide/load/engine/DecodeJob.n:()V
        //   128: aload_0        
        //   129: getfield        com/bumptech/glide/load/engine/DecodeJob.J:Z
        //   132: ifne            137
        //   135: aload_2        
        //   136: athrow         
        //   137: aload_2        
        //   138: athrow         
        //   139: astore_2       
        //   140: aload_2        
        //   141: athrow         
        //   142: astore_2       
        //   143: aload_1        
        //   144: ifnull          153
        //   147: aload_1        
        //   148: invokeinterface com/bumptech/glide/load/data/d.b:()V
        //   153: aload_2        
        //   154: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  5      16     139    142    Lcom/bumptech/glide/load/engine/CallbackException;
        //  5      16     42     139    Any
        //  27     31     139    142    Lcom/bumptech/glide/load/engine/CallbackException;
        //  27     31     42     139    Any
        //  43     105    142    155    Any
        //  105    128    142    155    Any
        //  128    137    142    155    Any
        //  137    139    142    155    Any
        //  140    142    142    155    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0105:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void t() {
        final int n = DecodeJob$a.a[this.x.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    final StringBuilder r = a.r("Unrecognized run reason: ");
                    r.append(this.x);
                    throw new IllegalStateException(r.toString());
                }
                this.i();
            }
            else {
                this.p();
            }
        }
        else {
            this.w = this.l(Stage.INITIALIZE);
            this.H = this.k();
            this.p();
        }
    }
    
    public final void w() {
        this.h.a();
        if (this.I) {
            Throwable t;
            if (this.g.isEmpty()) {
                t = null;
            }
            else {
                final ArrayList g = this.g;
                t = (Throwable)g.get(g.size() - 1);
            }
            throw new IllegalStateException("Already notified", t);
        }
        this.I = true;
    }
    
    public enum RunReason
    {
        DECODE_DATA, 
        INITIALIZE, 
        SWITCH_TO_SOURCE_SERVICE;
    }
    
    public enum Stage
    {
        DATA_CACHE, 
        ENCODE, 
        FINISHED, 
        INITIALIZE, 
        RESOURCE_CACHE, 
        SOURCE;
    }
    
    public interface b<R>
    {
    }
    
    public final class c<Z>
    {
        public final DataSource a;
        
        public c(final DataSource a) {
            this.a = a;
        }
    }
    
    public static final class d<Z>
    {
        public o8.d a;
        public o8.i<Z> b;
        public k<Z> c;
    }
    
    public interface e
    {
    }
    
    public static final class f
    {
        public boolean a;
        public boolean b;
        public boolean c;
        
        public final boolean a() {
            return (this.c || this.b) && this.a;
        }
    }
}
