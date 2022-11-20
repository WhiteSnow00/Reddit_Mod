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
import ia.c;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.a$b;
import java.util.ArrayList;
import com.google.android.exoplayer2.upstream.i$a;
import com.google.android.exoplayer2.upstream.b;

public abstract class l<M extends h<M>> implements f
{
    public final com.google.android.exoplayer2.upstream.b a;
    public final i$a<M> b;
    public final ArrayList<m> c;
    public final a$b d;
    public final Cache e;
    public final ia.c f;
    public final Executor g;
    public final ArrayList<u<?, ?>> h;
    public volatile boolean i;
    
    public l(final q q, final i$a<M> b, final a$b d, final Executor g) {
        q.g.getClass();
        this.a = c(((q$f)q.g).a);
        this.b = b;
        this.c = new ArrayList<m>(((q$f)q.g).d);
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
    
    public static void e(final List list, final ia.c c) {
        final HashMap hashMap = new HashMap();
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final b b = list.get(i);
            final String b2 = c.b(b.g);
            final Integer n2 = hashMap.get(b2);
            b b3;
            if (n2 == null) {
                b3 = null;
            }
            else {
                b3 = list.get(n2);
            }
            Label_0361: {
                if (b3 != null && b.f <= b3.f + 20000000L) {
                    final com.google.android.exoplayer2.upstream.b g = b3.g;
                    final com.google.android.exoplayer2.upstream.b g2 = b.g;
                    boolean b4 = false;
                    Label_0240: {
                        if (g.a.equals((Object)g2.a)) {
                            final long g3 = g.g;
                            if (g3 != -1L && g.f + g3 == g2.f && c0.a((Object)g.h, (Object)g2.h) && g.i == g2.i && g.c == g2.c && g.e.equals(g2.e)) {
                                b4 = true;
                                break Label_0240;
                            }
                        }
                        b4 = false;
                    }
                    if (b4) {
                        final long g4 = b.g.g;
                        long n3;
                        if (g4 == -1L) {
                            n3 = -1L;
                        }
                        else {
                            n3 = g4 + b3.g.g;
                        }
                        final com.google.android.exoplayer2.upstream.b b5 = b3.g.b(0L, n3);
                        n2.getClass();
                        list.set(n2, new b(b3.f, b5));
                        break Label_0361;
                    }
                }
                hashMap.put(b2, n);
                list.set(n, b);
                ++n;
            }
            ++i;
        }
        c0.O(n, list.size(), list);
    }
    
    @Override
    public final void a(final f.a a) throws IOException, InterruptedException {
        final ArrayDeque arrayDeque = new ArrayDeque();
        final ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            final com.google.android.exoplayer2.upstream.cache.a c = this.d.c();
            h h = this.b((u<h, ?>)new k(this, c, this.a), false);
            if (!this.c.isEmpty()) {
                h = (h)h.a(this.c);
            }
            final ArrayList d = this.d(c, h, false);
            Collections.sort((List<Comparable>)d);
            e(d, this.f);
            final int size = d.size();
            int i = d.size() - 1;
            int n = 0;
            long n2 = 0L;
            long n3 = 0L;
            final ArrayDeque arrayDeque3 = arrayDeque;
            while (i >= 0) {
                try {
                    final com.google.android.exoplayer2.upstream.b g = ((b)d.get(i)).g;
                    final String b = this.f.b(g);
                    long g2;
                    final long n4 = g2 = g.g;
                    if (n4 == -1L) {
                        final long a2 = ad.h.a((ad.h)this.e.a(b));
                        g2 = n4;
                        if (a2 != -1L) {
                            g2 = a2 - g.f;
                        }
                    }
                    final long e = this.e.e(g.f, g2, b);
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
                        final c c2 = arrayDeque2.removeFirst();
                        a3 = c2.n;
                        p = c2.p;
                    }
                    else {
                        a3 = this.d.c();
                        p = new byte[131072];
                    }
                    final c c3 = new c(arrayDeque3.removeFirst(), a3, (a)o, p);
                    Object h2 = this.h;
                    synchronized (h2) {
                        if (!this.i) {
                            this.h.add(c3);
                            monitorexit(h2);
                            this.g.execute(c3);
                            int j = this.h.size() - 1;
                            while (j >= 0) {
                                h2 = this.h.get(j);
                                Label_0655: {
                                    if (!arrayDeque3.isEmpty()) {
                                        if (!((u)h2).isDone()) {
                                            break Label_0655;
                                        }
                                    }
                                    try {
                                        ((u)h2).get();
                                        this.f(j);
                                        arrayDeque2.addLast(h2);
                                        break Label_0655;
                                    }
                                    catch (final ExecutionException ex) {
                                        final Throwable cause = ex.getCause();
                                        cause.getClass();
                                        if (cause instanceof PriorityTaskManager$PriorityTooLowException) {
                                            arrayDeque3.addFirst(((c)h2).m);
                                            this.f(j);
                                            arrayDeque2.addLast(h2);
                                            --j;
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
                            c3.f.c();
                            continue;
                        }
                        throw new InterruptedException();
                    }
                }
            }
            finally {}
            for (int k = 0; k < this.h.size(); ++k) {
                this.h.get(k).cancel(true);
            }
            for (int l = this.h.size() - 1; l >= 0; --l) {
                this.h.get(l).b();
                this.f(l);
            }
            return;
        }
        finally {}
        for (int n7 = 0; n7 < this.h.size(); ++n7) {
            this.h.get(n7).cancel(true);
        }
        for (int n8 = this.h.size() - 1; n8 >= 0; --n8) {
            this.h.get(n8).b();
            this.f(n8);
        }
    }
    
    public final <T> T b(final u<T, ?> p0, final boolean p1) throws InterruptedException, IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifeq            47
        //     4: aload_1        
        //     5: invokevirtual   bd/u.run:()V
        //     8: aload_1        
        //     9: invokevirtual   bd/u.get:()Ljava/lang/Object;
        //    12: astore_1       
        //    13: aload_1        
        //    14: areturn        
        //    15: astore          4
        //    17: aload           4
        //    19: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //    22: astore_1       
        //    23: aload_1        
        //    24: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    27: pop            
        //    28: aload_1        
        //    29: instanceof      Ljava/io/IOException;
        //    32: ifeq            40
        //    35: aload_1        
        //    36: checkcast       Ljava/io/IOException;
        //    39: athrow         
        //    40: getstatic       bd/c0.a:I
        //    43: istore_3       
        //    44: aload           4
        //    46: athrow         
        //    47: aload_0        
        //    48: getfield        zb/l.i:Z
        //    51: ifne            267
        //    54: aload_0        
        //    55: getfield        zb/l.h:Ljava/util/ArrayList;
        //    58: astore          4
        //    60: aload           4
        //    62: monitorenter   
        //    63: aload_0        
        //    64: getfield        zb/l.i:Z
        //    67: ifne            251
        //    70: aload_0        
        //    71: getfield        zb/l.h:Ljava/util/ArrayList;
        //    74: aload_1        
        //    75: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    78: pop            
        //    79: aload           4
        //    81: monitorexit    
        //    82: aload_0        
        //    83: getfield        zb/l.g:Ljava/util/concurrent/Executor;
        //    86: aload_1        
        //    87: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //    92: aload_1        
        //    93: invokevirtual   bd/u.get:()Ljava/lang/Object;
        //    96: astore          5
        //    98: aload_1        
        //    99: invokevirtual   bd/u.b:()V
        //   102: aload_0        
        //   103: getfield        zb/l.h:Ljava/util/ArrayList;
        //   106: astore          4
        //   108: aload           4
        //   110: monitorenter   
        //   111: aload_0        
        //   112: getfield        zb/l.h:Ljava/util/ArrayList;
        //   115: aload_1        
        //   116: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   119: pop            
        //   120: aload           4
        //   122: monitorexit    
        //   123: aload           5
        //   125: areturn        
        //   126: astore_1       
        //   127: aload           4
        //   129: monitorexit    
        //   130: aload_1        
        //   131: athrow         
        //   132: astore          5
        //   134: goto            217
        //   137: astore          4
        //   139: aload           4
        //   141: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   144: astore          5
        //   146: aload           5
        //   148: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   151: pop            
        //   152: aload           5
        //   154: instanceof      Lcom/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException;
        //   157: istore_2       
        //   158: iload_2        
        //   159: ifeq            196
        //   162: aload_1        
        //   163: invokevirtual   bd/u.b:()V
        //   166: aload_0        
        //   167: getfield        zb/l.h:Ljava/util/ArrayList;
        //   170: astore          4
        //   172: aload           4
        //   174: monitorenter   
        //   175: aload_0        
        //   176: getfield        zb/l.h:Ljava/util/ArrayList;
        //   179: aload_1        
        //   180: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   183: pop            
        //   184: aload           4
        //   186: monitorexit    
        //   187: goto            47
        //   190: astore_1       
        //   191: aload           4
        //   193: monitorexit    
        //   194: aload_1        
        //   195: athrow         
        //   196: aload           5
        //   198: instanceof      Ljava/io/IOException;
        //   201: ifeq            210
        //   204: aload           5
        //   206: checkcast       Ljava/io/IOException;
        //   209: athrow         
        //   210: getstatic       bd/c0.a:I
        //   213: istore_3       
        //   214: aload           4
        //   216: athrow         
        //   217: aload_1        
        //   218: invokevirtual   bd/u.b:()V
        //   221: aload_0        
        //   222: getfield        zb/l.h:Ljava/util/ArrayList;
        //   225: astore          4
        //   227: aload           4
        //   229: monitorenter   
        //   230: aload_0        
        //   231: getfield        zb/l.h:Ljava/util/ArrayList;
        //   234: aload_1        
        //   235: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   238: pop            
        //   239: aload           4
        //   241: monitorexit    
        //   242: aload           5
        //   244: athrow         
        //   245: astore_1       
        //   246: aload           4
        //   248: monitorexit    
        //   249: aload_1        
        //   250: athrow         
        //   251: new             Ljava/lang/InterruptedException;
        //   254: astore_1       
        //   255: aload_1        
        //   256: invokespecial   java/lang/InterruptedException.<init>:()V
        //   259: aload_1        
        //   260: athrow         
        //   261: astore_1       
        //   262: aload           4
        //   264: monitorexit    
        //   265: aload_1        
        //   266: athrow         
        //   267: new             Ljava/lang/InterruptedException;
        //   270: dup            
        //   271: invokespecial   java/lang/InterruptedException.<init>:()V
        //   274: athrow         
        //    Exceptions:
        //  throws java.lang.InterruptedException
        //  throws java.io.IOException
        //    Signature:
        //  <T:Ljava/lang/Object;>(Lbd/u<TT;*>;Z)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      13     15     47     Ljava/util/concurrent/ExecutionException;
        //  63     82     261    267    Any
        //  92     98     137    217    Ljava/util/concurrent/ExecutionException;
        //  92     98     132    251    Any
        //  111    123    126    132    Any
        //  127    130    126    132    Any
        //  139    158    132    251    Any
        //  175    187    190    196    Any
        //  191    194    190    196    Any
        //  196    210    132    251    Any
        //  210    217    132    251    Any
        //  230    242    245    251    Any
        //  246    249    245    251    Any
        //  251    261    261    267    Any
        //  262    265    261    267    Any
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
    
    public abstract ArrayList d(final com.google.android.exoplayer2.upstream.cache.a p0, final h p1, final boolean p2) throws IOException, InterruptedException;
    
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
                final ArrayList d3 = this.d(d2, this.b((u<h, ?>)new k(this, d2, this.a), true), true);
                for (int i = 0; i < d3.size(); ++i) {
                    this.e.f(this.f.b(((b)d3.get(i)).g));
                }
            }
            finally {}
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        catch (final Exception ex2) {
            goto Label_0112;
        }
    }
    
    public static final class a implements e$a
    {
        public final f.a f;
        public final long g;
        public final int h;
        public long i;
        public int j;
        
        public a(final f.a f, final long g, final int h, final long i, final int j) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
        
        public final void a(long i, long g, final long n) {
            i = this.i + n;
            this.i = i;
            final f.a f = this.f;
            g = this.g;
            ((d.d)f).b(g, i, this.b());
        }
        
        public final float b() {
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
                ((d.d)o.f).b(o.g, o.i, o.b());
            }
            return null;
        }
    }
}
