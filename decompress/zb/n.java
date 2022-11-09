// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import com.google.android.exoplayer2.q$f;
import ad.e;
import ad.e$a;
import com.google.android.exoplayer2.upstream.cache.a;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import com.google.android.exoplayer2.util.PriorityTaskManager$PriorityTooLowException;
import java.util.Collections;
import java.util.ArrayDeque;
import bd.c0;
import java.util.HashMap;
import java.util.List;
import com.google.android.exoplayer2.upstream.b$a;
import android.net.Uri;
import java.util.Collection;
import com.google.android.exoplayer2.q;
import bd.u;
import java.util.concurrent.Executor;
import sa.k;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.a$b;
import java.util.ArrayList;
import com.google.android.exoplayer2.upstream.i$a;
import com.google.android.exoplayer2.upstream.b;

public abstract class n<M extends j<M>> implements h
{
    public final com.google.android.exoplayer2.upstream.b a;
    public final i$a<M> b;
    public final ArrayList<o> c;
    public final a$b d;
    public final Cache e;
    public final k f;
    public final Executor g;
    public final ArrayList<u<?, ?>> h;
    public volatile boolean i;
    
    public n(final q q, final i$a<M> b, final a$b d, final Executor g) {
        q.g.getClass();
        this.a = c(((q$f)q.g).a);
        this.b = b;
        this.c = new ArrayList<o>(((q$f)q.g).d);
        this.d = d;
        this.g = g;
        final Cache a = d.a;
        a.getClass();
        this.e = a;
        this.f = d.c;
        this.h = new ArrayList<u<?, ?>>();
    }
    
    public static com.google.android.exoplayer2.upstream.b c(final Uri a) {
        final b$a b$a = new b$a();
        b$a.a = a;
        b$a.i = 1;
        return b$a.a();
    }
    
    public static void e(final List list, final k k) {
        final HashMap hashMap = new HashMap();
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final b b = list.get(i);
            final String c = k.c(b.g);
            final Integer n2 = hashMap.get(c);
            b b2;
            if (n2 == null) {
                b2 = null;
            }
            else {
                b2 = list.get(n2);
            }
            Label_0361: {
                if (b2 != null && b.f <= b2.f + 20000000L) {
                    final com.google.android.exoplayer2.upstream.b g = b2.g;
                    final com.google.android.exoplayer2.upstream.b g2 = b.g;
                    boolean b3 = false;
                    Label_0239: {
                        if (g.a.equals((Object)g2.a)) {
                            final long g3 = g.g;
                            if (g3 != -1L && g.f + g3 == g2.f && c0.a(g.h, g2.h) && g.i == g2.i && g.c == g2.c && g.e.equals(g2.e)) {
                                b3 = true;
                                break Label_0239;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        final long g4 = b.g.g;
                        long n3;
                        if (g4 == -1L) {
                            n3 = -1L;
                        }
                        else {
                            n3 = g4 + b2.g.g;
                        }
                        final com.google.android.exoplayer2.upstream.b b4 = b2.g.b(0L, n3);
                        n2.getClass();
                        list.set(n2, new b(b2.f, b4));
                        break Label_0361;
                    }
                }
                hashMap.put(c, n);
                list.set(n, b);
                ++n;
            }
            ++i;
        }
        c0.O(n, list.size(), list);
    }
    
    @Override
    public final void a(final h.a a) throws IOException, InterruptedException {
        final ArrayDeque arrayDeque = new ArrayDeque();
        final ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            final com.google.android.exoplayer2.upstream.cache.a c = this.d.c();
            j j = this.b((u<j, ?>)new m(this, c, this.a), false);
            if (!this.c.isEmpty()) {
                j = (j)j.a(this.c);
            }
            final ArrayList d = this.d(c, j, false);
            Collections.sort((List<Comparable>)d);
            e(d, this.f);
            final int size = d.size();
            int i = d.size() - 1;
            int n = 0;
            long n3;
            long n2 = n3 = 0L;
            final ArrayDeque arrayDeque3 = arrayDeque;
            while (i >= 0) {
                try {
                    final com.google.android.exoplayer2.upstream.b g = ((b)d.get(i)).g;
                    final String c2 = this.f.c(g);
                    long g2;
                    final long n4 = g2 = g.g;
                    if (n4 == -1L) {
                        final long a2 = ad.h.a((ad.h)this.e.a(c2));
                        g2 = n4;
                        if (a2 != -1L) {
                            g2 = a2 - g.f;
                        }
                    }
                    final long e = this.e.e(g.f, g2, c2);
                    final long n5 = n3 + e;
                    if (g2 != -1L) {
                        int n6 = n;
                        if (g2 == e) {
                            n6 = n + 1;
                            d.remove(i);
                        }
                        n3 = n2;
                        n = n6;
                        if (n2 != -1L) {
                            n3 = n2 + g2;
                            n = n6;
                        }
                    }
                    else {
                        n3 = -1L;
                    }
                    --i;
                    n2 = n3;
                    n3 = n5;
                    continue;
                }
                finally {}
                break;
            }
            Object o;
            if (a != null) {
                o = new a(a, n2, size, n3, n);
            }
            else {
                o = null;
            }
            arrayDeque3.addAll(d);
            try {
                while (!this.i && !arrayDeque3.isEmpty()) {
                    com.google.android.exoplayer2.upstream.cache.a a3;
                    byte[] p;
                    if (!arrayDeque2.isEmpty()) {
                        final c c3 = arrayDeque2.removeFirst();
                        a3 = c3.n;
                        p = c3.p;
                    }
                    else {
                        a3 = this.d.c();
                        p = new byte[131072];
                    }
                    final c c4 = new c(arrayDeque3.removeFirst(), a3, (a)o, p);
                    Object h = this.h;
                    synchronized (h) {
                        if (!this.i) {
                            this.h.add(c4);
                            monitorexit(h);
                            this.g.execute(c4);
                            int k = this.h.size() - 1;
                            while (k >= 0) {
                                h = this.h.get(k);
                                Label_0644: {
                                    if (!arrayDeque3.isEmpty()) {
                                        if (!((u)h).isDone()) {
                                            break Label_0644;
                                        }
                                    }
                                    try {
                                        ((u)h).get();
                                        this.f(k);
                                        arrayDeque2.addLast(h);
                                        break Label_0644;
                                    }
                                    catch (final ExecutionException ex) {
                                        final Throwable cause = ex.getCause();
                                        cause.getClass();
                                        if (cause instanceof PriorityTaskManager$PriorityTooLowException) {
                                            arrayDeque3.addFirst(((c)h).m);
                                            this.f(k);
                                            arrayDeque2.addLast(h);
                                            --k;
                                            continue;
                                        }
                                        if (cause instanceof IOException) {
                                            throw (IOException)cause;
                                        }
                                        throw cause;
                                    }
                                }
                                break;
                            }
                            c4.f.c();
                            continue;
                        }
                        throw new InterruptedException();
                    }
                }
            }
            finally {}
            for (int l = 0; l < this.h.size(); ++l) {
                this.h.get(l).cancel(true);
            }
            for (int n7 = this.h.size() - 1; n7 >= 0; --n7) {
                this.h.get(n7).b();
                this.f(n7);
            }
            return;
        }
        finally {}
        for (int n8 = 0; n8 < this.h.size(); ++n8) {
            this.h.get(n8).cancel(true);
        }
        for (int n9 = this.h.size() - 1; n9 >= 0; --n9) {
            this.h.get(n9).b();
            this.f(n9);
        }
    }
    
    public final <T> T b(final u<T, ?> p0, final boolean p1) throws InterruptedException, IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifeq            45
        //     4: aload_1        
        //     5: invokevirtual   bd/u.run:()V
        //     8: aload_1        
        //     9: invokevirtual   bd/u.get:()Ljava/lang/Object;
        //    12: astore_1       
        //    13: aload_1        
        //    14: areturn        
        //    15: astore_1       
        //    16: aload_1        
        //    17: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //    20: astore_3       
        //    21: aload_3        
        //    22: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    25: pop            
        //    26: aload_3        
        //    27: instanceof      Ljava/io/IOException;
        //    30: ifeq            38
        //    33: aload_3        
        //    34: checkcast       Ljava/io/IOException;
        //    37: athrow         
        //    38: getstatic       bd/c0.a:I
        //    41: istore          4
        //    43: aload_1        
        //    44: athrow         
        //    45: aload_0        
        //    46: getfield        zb/n.i:Z
        //    49: ifne            247
        //    52: aload_0        
        //    53: getfield        zb/n.h:Ljava/util/ArrayList;
        //    56: astore_3       
        //    57: aload_3        
        //    58: monitorenter   
        //    59: aload_0        
        //    60: getfield        zb/n.i:Z
        //    63: ifne            232
        //    66: aload_0        
        //    67: getfield        zb/n.h:Ljava/util/ArrayList;
        //    70: aload_1        
        //    71: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    74: pop            
        //    75: aload_3        
        //    76: monitorexit    
        //    77: aload_0        
        //    78: getfield        zb/n.g:Ljava/util/concurrent/Executor;
        //    81: aload_1        
        //    82: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //    87: aload_1        
        //    88: invokevirtual   bd/u.get:()Ljava/lang/Object;
        //    91: astore          5
        //    93: aload_1        
        //    94: invokevirtual   bd/u.b:()V
        //    97: aload_0        
        //    98: getfield        zb/n.h:Ljava/util/ArrayList;
        //   101: astore_3       
        //   102: aload_3        
        //   103: monitorenter   
        //   104: aload_0        
        //   105: getfield        zb/n.h:Ljava/util/ArrayList;
        //   108: aload_1        
        //   109: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   112: pop            
        //   113: aload_3        
        //   114: monitorexit    
        //   115: aload           5
        //   117: areturn        
        //   118: astore_1       
        //   119: aload_3        
        //   120: monitorexit    
        //   121: aload_1        
        //   122: athrow         
        //   123: astore          5
        //   125: goto            202
        //   128: astore_3       
        //   129: aload_3        
        //   130: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   133: astore          5
        //   135: aload           5
        //   137: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   140: pop            
        //   141: aload           5
        //   143: instanceof      Lcom/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException;
        //   146: istore_2       
        //   147: iload_2        
        //   148: ifeq            181
        //   151: aload_1        
        //   152: invokevirtual   bd/u.b:()V
        //   155: aload_0        
        //   156: getfield        zb/n.h:Ljava/util/ArrayList;
        //   159: astore_3       
        //   160: aload_3        
        //   161: monitorenter   
        //   162: aload_0        
        //   163: getfield        zb/n.h:Ljava/util/ArrayList;
        //   166: aload_1        
        //   167: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   170: pop            
        //   171: aload_3        
        //   172: monitorexit    
        //   173: goto            45
        //   176: astore_1       
        //   177: aload_3        
        //   178: monitorexit    
        //   179: aload_1        
        //   180: athrow         
        //   181: aload           5
        //   183: instanceof      Ljava/io/IOException;
        //   186: ifeq            195
        //   189: aload           5
        //   191: checkcast       Ljava/io/IOException;
        //   194: athrow         
        //   195: getstatic       bd/c0.a:I
        //   198: istore          4
        //   200: aload_3        
        //   201: athrow         
        //   202: aload_1        
        //   203: invokevirtual   bd/u.b:()V
        //   206: aload_0        
        //   207: getfield        zb/n.h:Ljava/util/ArrayList;
        //   210: astore_3       
        //   211: aload_3        
        //   212: monitorenter   
        //   213: aload_0        
        //   214: getfield        zb/n.h:Ljava/util/ArrayList;
        //   217: aload_1        
        //   218: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   221: pop            
        //   222: aload_3        
        //   223: monitorexit    
        //   224: aload           5
        //   226: athrow         
        //   227: astore_1       
        //   228: aload_3        
        //   229: monitorexit    
        //   230: aload_1        
        //   231: athrow         
        //   232: new             Ljava/lang/InterruptedException;
        //   235: astore_1       
        //   236: aload_1        
        //   237: invokespecial   java/lang/InterruptedException.<init>:()V
        //   240: aload_1        
        //   241: athrow         
        //   242: astore_1       
        //   243: aload_3        
        //   244: monitorexit    
        //   245: aload_1        
        //   246: athrow         
        //   247: new             Ljava/lang/InterruptedException;
        //   250: dup            
        //   251: invokespecial   java/lang/InterruptedException.<init>:()V
        //   254: athrow         
        //    Exceptions:
        //  throws java.lang.InterruptedException
        //  throws java.io.IOException
        //    Signature:
        //  <T:Ljava/lang/Object;>(Lbd/u<TT;*>;Z)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      13     15     45     Ljava/util/concurrent/ExecutionException;
        //  59     77     242    247    Any
        //  87     93     128    202    Ljava/util/concurrent/ExecutionException;
        //  87     93     123    232    Any
        //  104    115    118    123    Any
        //  119    121    118    123    Any
        //  129    147    123    232    Any
        //  162    173    176    181    Any
        //  177    179    176    181    Any
        //  181    195    123    232    Any
        //  195    202    123    232    Any
        //  213    224    227    232    Any
        //  228    230    227    232    Any
        //  232    242    242    247    Any
        //  243    245    242    247    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 152, Size: 152
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    @Override
    public final void cancel() {
        synchronized (this.h) {
            this.i = true;
            for (int i = 0; i < this.h.size(); ++i) {
                this.h.get(i).cancel(true);
            }
        }
    }
    
    public abstract ArrayList d(final com.google.android.exoplayer2.upstream.cache.a p0, final j p1, final boolean p2) throws IOException, InterruptedException;
    
    public final void f(final int n) {
        synchronized (this.h) {
            this.h.remove(n);
        }
    }
    
    @Override
    public final void remove() {
        final a$b d = this.d;
        final com.google.android.exoplayer2.upstream.cache.a d2 = d.d((com.google.android.exoplayer2.upstream.a)null, d.e | 0x1, -1000);
        try {
            try {
                final ArrayList d3 = this.d(d2, this.b((u<j, ?>)new m(this, d2, this.a), true), true);
                for (int i = 0; i < d3.size(); ++i) {
                    this.e.f(this.f.c(((b)d3.get(i)).g));
                }
            }
            finally {}
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        catch (final Exception ex2) {
            goto Label_0113;
        }
    }
    
    public static final class a implements e$a
    {
        public final h.a f;
        public final long g;
        public final int h;
        public long i;
        public int j;
        
        public a(final h.a f, final long g, final int h, final long i, final int j) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
        
        public final float a() {
            final long g = this.g;
            if (g != -1L && g != 0L) {
                return this.i * 100.0f / g;
            }
            final int h = this.h;
            if (h != 0) {
                return this.j * 100.0f / h;
            }
            return -1.0f;
        }
        
        public final void b(long i, long g, final long n) {
            i = this.i + n;
            this.i = i;
            final h.a f = this.f;
            g = this.g;
            ((d.d)f).b(g, i, this.a());
        }
    }
    
    public static final class b implements Comparable<b>
    {
        public final long f;
        public final com.google.android.exoplayer2.upstream.b g;
        
        public b(final long f, final com.google.android.exoplayer2.upstream.b g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final int compareTo(final Object o) {
            final b b = (b)o;
            final long f = this.f;
            final long f2 = b.f;
            final int a = c0.a;
            final long n = lcmp(f, f2);
            int n2;
            if (n < 0) {
                n2 = -1;
            }
            else if (n == 0) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
    }
    
    public static final class c extends u<Void, IOException>
    {
        public final b m;
        public final com.google.android.exoplayer2.upstream.cache.a n;
        public final a o;
        public final byte[] p;
        public final e q;
        
        public c(final b m, final com.google.android.exoplayer2.upstream.cache.a n, final a o, final byte[] p4) {
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p4;
            this.q = new e(n, m.g, p4, (e$a)o);
        }
        
        @Override
        public final void c() {
            this.q.j = true;
        }
        
        @Override
        public final Object d() throws Exception {
            this.q.a();
            final a o = this.o;
            if (o != null) {
                ++o.j;
                ((d.d)o.f).b(o.g, o.i, o.a());
            }
            return null;
        }
    }
}
