// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import rc2.d;
import java.util.concurrent.RejectedExecutionException;
import gc2.a;
import java.io.IOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import gc2.c;
import gc2.b;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import java.net.Socket;
import e2.h;
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
    public h s;
    public final h t;
    public final Socket u;
    public final o v;
    public final f w;
    public final LinkedHashSet x;
    
    static {
        final TimeUnit seconds = TimeUnit.SECONDS;
        final SynchronousQueue synchronousQueue = new SynchronousQueue();
        final byte[] a = b.a;
        y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, seconds, synchronousQueue, new gc2.c("OkHttp Http2Connection", true));
    }
    
    public e(final c c) {
        this.h = new LinkedHashMap();
        this.q = 0L;
        this.s = new h();
        final h t = new h();
        this.t = t;
        this.x = new LinkedHashSet();
        this.o = lc2.q.a;
        this.f = true;
        this.g = c.e;
        this.k = 3;
        this.s.f(7, 16777216);
        final String b = c.b;
        this.i = b;
        final ScheduledThreadPoolExecutor m = new ScheduledThreadPoolExecutor(1, new gc2.c(gc2.b.l("OkHttp %s Writer", b), false));
        this.m = m;
        if (c.f != 0) {
            final e e = new e(false, 0, 0);
            final long n = c.f;
            m.scheduleAtFixedRate(e, n, n, TimeUnit.MILLISECONDS);
        }
        this.n = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new gc2.c(gc2.b.l("OkHttp %s Push Observer", b), true));
        t.f(7, 65535);
        t.f(5, 16384);
        this.r = t.a();
        this.u = c.a;
        this.v = new o(c.d, true);
        this.w = new f(new m(c.c, true));
    }
    
    public final void a(ErrorCode errorCode, final ErrorCode errorCode2) throws IOException {
        n[] array = null;
        try {
            this.l(errorCode);
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
    
    @Override
    public final void close() throws IOException {
        this.a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
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
    
    public final n h(final int n) {
        synchronized (this) {
            return this.h.get(n);
        }
    }
    
    public final void j(final a a) {
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
                    final a a2 = a;
                    threadPoolExecutor.execute(a2);
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
                    final a a2 = a;
                    threadPoolExecutor.execute(a2);
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
    
    public final n k(final int n) {
        synchronized (this) {
            final n n2 = (n)this.h.remove(n);
            this.notifyAll();
            return n2;
        }
    }
    
    public final void l(final ErrorCode errorCode) throws IOException {
        synchronized (this.v) {
            synchronized (this) {
                if (this.l) {
                    return;
                }
                this.l = true;
                final int j = this.j;
                monitorexit(this);
                this.v.h(j, errorCode, b.a);
            }
        }
    }
    
    public final void n(long q) {
        synchronized (this) {
            q += this.q;
            this.q = q;
            if (q >= this.s.a() / 2) {
                this.q(0, this.q);
                this.q = 0L;
            }
        }
    }
    
    public final void o(final int n, final boolean b, final com.sendbird.android.shadow.okio.a a, long n2) throws IOException {
        long n3 = n2;
        if (n2 == 0L) {
            this.v.b(b, n, a, 0);
            return;
        }
    Label_0023:
        while (n3 > 0L) {
            monitorenter(this);
            try {
                try {
                    while (true) {
                        n2 = this.r;
                        if (n2 > 0L) {
                            final int min = Math.min((int)Math.min(n3, n2), this.v.i);
                            n2 = this.r;
                            final long n4 = min;
                            this.r = n2 - n4;
                            monitorexit(this);
                            n3 -= n4;
                            this.v.b(b && n3 == 0L, n, a, min);
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
            this.m.execute(new a(this, new Object[] { this.i, n }, n, errorCode) {
                public final int g;
                public final ErrorCode h;
                public final e i;
                
                @Override
                public final void a() {
                    try {
                        this.i.v.l(this.g, this.h);
                    }
                    catch (final IOException ex) {
                        this.i.b();
                    }
                }
            });
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    public final void q(final int n, final long n2) {
        try {
            this.m.execute(new a(this, new Object[] { this.i, n }, n, n2) {
                public final int g;
                public final long h;
                public final e i;
                
                @Override
                public final void a() {
                    try {
                        this.i.v.n(this.g, this.h);
                    }
                    catch (final IOException ex) {
                        this.i.b();
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
        public rc2.d d;
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
    
    public final class e extends a
    {
        public final boolean g;
        public final int h;
        public final int i;
        public final lc2.e j;
        
        public e(final lc2.e j, final boolean g, final int h, final int i) {
            this.j = j;
            super("OkHttp %s ping %08x%08x", new Object[] { j.i, h, i });
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        @Override
        public final void a() {
            final lc2.e j = this.j;
            final boolean g = this.g;
            final int h = this.h;
            final int i = this.i;
            Label_0071: {
                if (!g) {
                    synchronized (j) {
                        final boolean p = j.p;
                        j.p = true;
                        monitorexit(j);
                        if (p) {
                            j.b();
                            return;
                        }
                        break Label_0071;
                    }
                }
                j.getClass();
                try {
                    j.v.k(g, h, i);
                }
                catch (final IOException ex) {
                    j.b();
                }
            }
        }
    }
    
    public final class f extends a implements b
    {
        public final m g;
        public final e h;
        
        public f(final e h, final m g) {
            this.h = h;
            super("OkHttp %s", new Object[] { h.i });
            this.g = g;
        }
        
        @Override
        public final void a() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: astore_2       
            //     4: aload_0        
            //     5: getfield        lc2/e$f.g:Llc2/m;
            //     8: aload_0        
            //     9: invokevirtual   lc2/m.d:(Llc2/m$b;)V
            //    12: aload_0        
            //    13: getfield        lc2/e$f.g:Llc2/m;
            //    16: iconst_0       
            //    17: aload_0        
            //    18: invokevirtual   lc2/m.b:(ZLlc2/m$b;)Z
            //    21: ifeq            27
            //    24: goto            12
            //    27: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.NO_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
            //    30: astore_3       
            //    31: aload_3        
            //    32: astore_1       
            //    33: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.CANCEL:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
            //    36: astore          4
            //    38: aload_0        
            //    39: getfield        lc2/e$f.h:Llc2/e;
            //    42: aload_3        
            //    43: aload           4
            //    45: invokevirtual   lc2/e.a:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
            //    48: goto            73
            //    51: astore_3       
            //    52: aload_2        
            //    53: astore_1       
            //    54: goto            82
            //    57: astore_1       
            //    58: aload_2        
            //    59: astore_1       
            //    60: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.PROTOCOL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
            //    63: astore_3       
            //    64: aload_0        
            //    65: getfield        lc2/e$f.h:Llc2/e;
            //    68: aload_3        
            //    69: aload_3        
            //    70: invokevirtual   lc2/e.a:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
            //    73: aload_0        
            //    74: getfield        lc2/e$f.g:Llc2/m;
            //    77: invokestatic    gc2/b.e:(Ljava/io/Closeable;)V
            //    80: return         
            //    81: astore_3       
            //    82: aload_0        
            //    83: getfield        lc2/e$f.h:Llc2/e;
            //    86: aload_1        
            //    87: aload_2        
            //    88: invokevirtual   lc2/e.a:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
            //    91: aload_0        
            //    92: getfield        lc2/e$f.g:Llc2/m;
            //    95: invokestatic    gc2/b.e:(Ljava/io/Closeable;)V
            //    98: aload_3        
            //    99: athrow         
            //   100: astore_1       
            //   101: aload_3        
            //   102: astore_1       
            //   103: goto            60
            //   106: astore_1       
            //   107: goto            73
            //   110: astore_1       
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
