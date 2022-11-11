// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import xc2.d;
import java.util.concurrent.RejectedExecutionException;
import od.g0;
import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import mc2.b;
import mc2.a;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import java.net.Socket;
import z0.w;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.io.Closeable;

public final class e implements Closeable
{
    public static final ThreadPoolExecutor y;
    public final boolean f;
    public final d g;
    public final LinkedHashMap h;
    public final String i;
    public int j;
    public int k;
    public boolean l;
    public final ScheduledThreadPoolExecutor m;
    public final ThreadPoolExecutor n;
    public final q.q$a o;
    public boolean p;
    public long q;
    public long r;
    public w s;
    public final w t;
    public final Socket u;
    public final o v;
    public final f w;
    public final LinkedHashSet x;
    
    static {
        final TimeUnit seconds = TimeUnit.SECONDS;
        final SynchronousQueue synchronousQueue = new SynchronousQueue();
        final byte[] a = mc2.a.a;
        y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, seconds, synchronousQueue, (ThreadFactory)new b("OkHttp Http2Connection", true));
    }
    
    public e(final c c) {
        this.h = new LinkedHashMap();
        this.q = 0L;
        this.s = new w(1);
        final w t = new w(1);
        this.t = t;
        this.x = new LinkedHashSet();
        this.o = rc2.q.a;
        this.f = true;
        this.g = c.e;
        this.k = 3;
        this.s.e(7, 16777216);
        final String b = c.b;
        this.i = b;
        final ScheduledThreadPoolExecutor m = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new b(a.l("OkHttp %s Writer", new Object[] { b }), false));
        this.m = m;
        if (c.f != 0) {
            final e e = new e(false, 0, 0);
            final long n = c.f;
            m.scheduleAtFixedRate(e, n, n, TimeUnit.MILLISECONDS);
        }
        this.n = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new b(a.l("OkHttp %s Push Observer", new Object[] { b }), true));
        t.e(7, 65535);
        t.e(5, 16384);
        this.r = t.b();
        this.u = c.a;
        this.v = new o(c.d, true);
        this.w = new f(new m(c.c, true));
    }
    
    public final void a(ErrorCode errorCode, final ErrorCode errorCode2) throws IOException {
        n[] array = null;
        try {
            this.h(errorCode);
            errorCode = null;
        }
        catch (final IOException ex) {}
        synchronized (this) {
            if (!this.h.isEmpty()) {
                array = (n[])this.h.values().toArray(new n[this.h.size()]);
                this.h.clear();
            }
            monitorexit(this);
            ErrorCode errorCode3 = errorCode;
            if (array != null) {
                final int length = array.length;
                int n = 0;
                while (true) {
                    errorCode3 = errorCode;
                    if (n >= length) {
                        break;
                    }
                    final n n2 = array[n];
                    ErrorCode errorCode4;
                    try {
                        n2.c(errorCode2);
                        errorCode4 = errorCode;
                    }
                    catch (final IOException ex2) {
                        errorCode4 = errorCode;
                        if (errorCode != null) {
                            errorCode4 = (ErrorCode)ex2;
                        }
                    }
                    ++n;
                    errorCode = errorCode4;
                }
            }
            try {
                this.v.close();
                errorCode = errorCode3;
            }
            catch (final IOException errorCode5) {
                errorCode = errorCode3;
                if (errorCode3 == null) {
                    errorCode = errorCode5;
                }
            }
            try {
                this.u.close();
            }
            catch (final IOException ex3) {}
            this.m.shutdown();
            this.n.shutdown();
            if (errorCode == null) {
                return;
            }
            throw errorCode;
        }
    }
    
    public final void b() {
        try {
            final ErrorCode protocol_ERROR = ErrorCode.PROTOCOL_ERROR;
            this.a(protocol_ERROR, protocol_ERROR);
        }
        catch (final IOException ex) {}
    }
    
    public final n c(final int n) {
        synchronized (this) {
            return this.h.get(n);
        }
    }
    
    @Override
    public final void close() throws IOException {
        this.a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }
    
    public final void f(final g0 g0) {
        monitorenter(this);
        Label_0030: {
            try {
                monitorenter(this);
                final e e = this;
                final boolean b = e.l;
                final e e2 = this;
                monitorexit(e2);
                final boolean b2 = b;
                if (!b2) {
                    final e e3 = this;
                    final ThreadPoolExecutor threadPoolExecutor = e3.n;
                    final g0 g2 = g0;
                    threadPoolExecutor.execute(g2);
                    break Label_0030;
                }
                break Label_0030;
            }
            finally {
                break Label_0030;
            }
            try {
                final e e = this;
                final boolean b = e.l;
                final e e2 = this;
                monitorexit(e2);
                final boolean b2 = b;
                if (!b2) {
                    final e e3 = this;
                    final ThreadPoolExecutor threadPoolExecutor = e3.n;
                    final g0 g2 = g0;
                    threadPoolExecutor.execute(g2);
                }
                monitorexit(this);
                return;
            }
            finally {
                monitorexit(this);
            }
        }
        monitorexit(this);
    }
    
    public final void flush() throws IOException {
        final o v = this.v;
        synchronized (v) {
            if (!v.j) {
                v.f.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final n g(final int n) {
        synchronized (this) {
            final n n2 = (n)this.h.remove(n);
            this.notifyAll();
            return n2;
        }
    }
    
    public final void h(final ErrorCode errorCode) throws IOException {
        synchronized (this.v) {
            synchronized (this) {
                if (this.l) {
                    return;
                }
                this.l = true;
                final int j = this.j;
                monitorexit(this);
                this.v.f(j, errorCode, a.a);
            }
        }
    }
    
    public final void j(long q) {
        synchronized (this) {
            q += this.q;
            this.q = q;
            if (q >= this.s.b() / 2) {
                this.q(0, this.q);
                this.q = 0L;
            }
        }
    }
    
    public final void n(final int n, final boolean b, final com.sendbird.android.shadow.okio.a a, long r) throws IOException {
        long n2 = r;
        if (r == 0L) {
            this.v.b(b, n, a, 0);
            return;
        }
    Label_0023:
        while (n2 > 0L) {
            monitorenter(this);
            try {
                try {
                    while (true) {
                        r = this.r;
                        if (r > 0L) {
                            final int min = Math.min((int)Math.min(n2, r), this.v.i);
                            final long r2 = this.r;
                            r = min;
                            this.r = r2 - r;
                            monitorexit(this);
                            n2 -= r;
                            this.v.b(b && n2 == 0L, n, a, min);
                            continue Label_0023;
                        }
                        if (!this.h.containsKey(n)) {
                            throw new IOException("stream closed");
                        }
                        this.wait();
                    }
                }
                finally {
                    monitorexit(this);
                }
            }
            catch (final InterruptedException ex) {}
            break;
        }
    }
    
    public final void p(final int n, final ErrorCode errorCode) {
        try {
            this.m.execute(new g0(new Object[] { this.i, n }) {
                @Override
                public final void a() {
                    try {
                        e.this.v.j(n, errorCode);
                    }
                    catch (final IOException ex) {
                        e.this.b();
                    }
                }
            });
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    public final void q(final int n, final long n2) {
        try {
            this.m.execute(new g0(new Object[] { this.i, n }) {
                @Override
                public final void a() {
                    try {
                        e.this.v.n(n, n2);
                    }
                    catch (final IOException ex) {
                        e.this.b();
                    }
                }
            });
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    public static final class c
    {
        public Socket a;
        public String b;
        public e c;
        public xc2.d d;
        public d e;
        public int f;
        
        public c() {
            this.e = (d)d.a;
        }
    }
    
    public abstract static class d
    {
        public static final e$d$a a;
        
        static {
            a = new d() {
                @Override
                public final void b(final n n) throws IOException {
                    n.c(ErrorCode.REFUSED_STREAM);
                }
            };
        }
        
        public void a(final e e) {
        }
        
        public abstract void b(final n p0) throws IOException;
    }
    
    public final class e extends g0
    {
        public final boolean h;
        public final int i;
        public final int j;
        
        public e(final boolean h, final int i, final int j) {
            super("OkHttp %s ping %08x%08x", new Object[] { rc2.e.this.i, i, j });
            this.h = h;
            this.i = i;
            this.j = j;
        }
        
        @Override
        public final void a() {
            final rc2.e k = rc2.e.this;
            final boolean h = this.h;
            final int i = this.i;
            final int j = this.j;
            Label_0064: {
                if (!h) {
                    synchronized (k) {
                        final boolean p = k.p;
                        k.p = true;
                        monitorexit(k);
                        if (p) {
                            k.b();
                            return;
                        }
                        break Label_0064;
                    }
                }
                k.getClass();
                try {
                    k.v.h(h, i, j);
                }
                catch (final IOException ex) {
                    k.b();
                }
            }
        }
    }
    
    public final class f extends g0 implements b
    {
        public final m h;
        
        public f(final m h) {
            super("OkHttp %s", new Object[] { e.this.i });
            this.h = h;
        }
        
        @Override
        public final void a() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: astore_1       
            //     4: aload_0        
            //     5: getfield        rc2/e$f.h:Lrc2/m;
            //     8: aload_0        
            //     9: invokevirtual   rc2/m.c:(Lrc2/m$b;)V
            //    12: aload_0        
            //    13: getfield        rc2/e$f.h:Lrc2/m;
            //    16: iconst_0       
            //    17: aload_0        
            //    18: invokevirtual   rc2/m.b:(ZLrc2/m$b;)Z
            //    21: ifeq            27
            //    24: goto            12
            //    27: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.NO_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
            //    30: astore_2       
            //    31: aload_2        
            //    32: astore_3       
            //    33: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.CANCEL:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
            //    36: astore          4
            //    38: aload_0        
            //    39: getfield        rc2/e$f.i:Lrc2/e;
            //    42: aload_2        
            //    43: aload           4
            //    45: invokevirtual   rc2/e.a:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
            //    48: goto            73
            //    51: astore_2       
            //    52: aload_1        
            //    53: astore_3       
            //    54: goto            82
            //    57: astore_3       
            //    58: aload_1        
            //    59: astore_3       
            //    60: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.PROTOCOL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
            //    63: astore_2       
            //    64: aload_0        
            //    65: getfield        rc2/e$f.i:Lrc2/e;
            //    68: aload_2        
            //    69: aload_2        
            //    70: invokevirtual   rc2/e.a:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
            //    73: aload_0        
            //    74: getfield        rc2/e$f.h:Lrc2/m;
            //    77: invokestatic    mc2/a.e:(Ljava/io/Closeable;)V
            //    80: return         
            //    81: astore_2       
            //    82: aload_0        
            //    83: getfield        rc2/e$f.i:Lrc2/e;
            //    86: aload_3        
            //    87: aload_1        
            //    88: invokevirtual   rc2/e.a:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
            //    91: aload_0        
            //    92: getfield        rc2/e$f.h:Lrc2/m;
            //    95: invokestatic    mc2/a.e:(Ljava/io/Closeable;)V
            //    98: aload_2        
            //    99: athrow         
            //   100: astore_3       
            //   101: aload_2        
            //   102: astore_3       
            //   103: goto            60
            //   106: astore_3       
            //   107: goto            73
            //   110: astore_3       
            //   111: goto            91
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  4      12     57     60     Ljava/io/IOException;
            //  4      12     51     57     Any
            //  12     24     57     60     Ljava/io/IOException;
            //  12     24     51     57     Any
            //  27     31     57     60     Ljava/io/IOException;
            //  27     31     51     57     Any
            //  33     38     100    106    Ljava/io/IOException;
            //  33     38     81     82     Any
            //  38     48     106    110    Ljava/io/IOException;
            //  60     64     81     82     Any
            //  64     73     106    110    Ljava/io/IOException;
            //  82     91     110    114    Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 62, Size: 62
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    }
}
