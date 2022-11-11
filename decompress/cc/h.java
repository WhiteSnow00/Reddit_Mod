// 
// Decompiled by Procyon v0.6.0
// 

package cc;

import android.util.Log;
import ad.c0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.dash.d$c;
import ad.d0;
import java.io.IOException;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Collections;
import com.google.android.exoplayer2.drm.d;
import yc.b;
import java.util.List;
import java.util.ArrayList;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.source.q;
import ac.p;

public final class h<T extends i> implements p, q, Loader.a<cc.e>, e
{
    public cc.a A;
    public boolean B;
    public final int f;
    public final int[] g;
    public final n[] h;
    public final boolean[] i;
    public final T j;
    public final q.a<h<T>> k;
    public final j.a l;
    public final com.google.android.exoplayer2.upstream.h m;
    public final Loader n;
    public final g o;
    public final ArrayList<cc.a> p;
    public final List<cc.a> q;
    public final com.google.android.exoplayer2.source.p r;
    public final com.google.android.exoplayer2.source.p[] s;
    public final cc.c t;
    public cc.e u;
    public n v;
    public h.h$b<T> w;
    public long x;
    public long y;
    public int z;
    
    public h(int i, int[] array, final n[] array2, final T j, final q.a<h<T>> k, final yc.b b, final long n, final com.google.android.exoplayer2.drm.d d, final com.google.android.exoplayer2.drm.c.a a, final com.google.android.exoplayer2.upstream.h m, final j.a l) {
        this.f = i;
        final int n2 = 0;
        int[] g = array;
        if (array == null) {
            g = new int[0];
        }
        this.g = g;
        n[] h;
        if ((h = array2) == null) {
            h = new n[0];
        }
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = new Loader("ChunkSampleStream");
        this.o = new g();
        final ArrayList<cc.a> p11 = new ArrayList<cc.a>();
        this.p = p11;
        this.q = (List<cc.a>)Collections.unmodifiableList((List<?>)p11);
        final int length = g.length;
        this.s = new com.google.android.exoplayer2.source.p[length];
        this.i = new boolean[length];
        final int n3 = length + 1;
        array = new int[n3];
        final com.google.android.exoplayer2.source.p[] array3 = new com.google.android.exoplayer2.source.p[n3];
        d.getClass();
        a.getClass();
        final com.google.android.exoplayer2.source.p r = new com.google.android.exoplayer2.source.p(b, d, a);
        this.r = r;
        array[0] = i;
        array3[0] = r;
        com.google.android.exoplayer2.source.p p12;
        int n4;
        for (i = n2; i < length; i = n4) {
            p12 = new com.google.android.exoplayer2.source.p(b, (com.google.android.exoplayer2.drm.d)null, (com.google.android.exoplayer2.drm.c.a)null);
            this.s[i] = p12;
            n4 = i + 1;
            array3[n4] = p12;
            array[n4] = this.g[i];
        }
        this.t = new cc.c(array, array3);
        this.x = n;
        this.y = n;
    }
    
    public final void A(final h.h$b<T> w) {
        this.w = w;
        final com.google.android.exoplayer2.source.p r = this.r;
        r.i();
        final DrmSession h = r.h;
        if (h != null) {
            h.a(r.e);
            r.h = null;
            r.g = null;
        }
        for (final com.google.android.exoplayer2.source.p p : this.s) {
            p.i();
            final DrmSession h2 = p.h;
            if (h2 != null) {
                h2.a(p.e);
                p.h = null;
                p.g = null;
            }
        }
        this.n.e((Loader.e)this);
    }
    
    public final void B(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: lload_1        
        //     2: putfield        cc/h.y:J
        //     5: aload_0        
        //     6: invokevirtual   cc/h.w:()Z
        //     9: ifeq            18
        //    12: aload_0        
        //    13: lload_1        
        //    14: putfield        cc/h.x:J
        //    17: return         
        //    18: iconst_0       
        //    19: istore_3       
        //    20: iconst_0       
        //    21: istore          4
        //    23: iconst_0       
        //    24: istore          5
        //    26: iload           5
        //    28: aload_0        
        //    29: getfield        cc/h.p:Ljava/util/ArrayList;
        //    32: invokevirtual   java/util/ArrayList.size:()I
        //    35: if_icmpge       95
        //    38: aload_0        
        //    39: getfield        cc/h.p:Ljava/util/ArrayList;
        //    42: iload           5
        //    44: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    47: checkcast       Lcc/a;
        //    50: astore          6
        //    52: aload           6
        //    54: getfield        cc/e.g:J
        //    57: lload_1        
        //    58: lcmp           
        //    59: istore          7
        //    61: iload           7
        //    63: ifne            81
        //    66: aload           6
        //    68: getfield        cc/a.k:J
        //    71: ldc2_w          -9223372036854775807
        //    74: lcmp           
        //    75: ifne            81
        //    78: goto            98
        //    81: iload           7
        //    83: ifle            89
        //    86: goto            95
        //    89: iinc            5, 1
        //    92: goto            26
        //    95: aconst_null    
        //    96: astore          6
        //    98: aload           6
        //   100: ifnull          234
        //   103: aload_0        
        //   104: getfield        cc/h.r:Lcom/google/android/exoplayer2/source/p;
        //   107: astore          8
        //   109: aload           6
        //   111: iconst_0       
        //   112: invokevirtual   cc/a.d:(I)I
        //   115: istore          7
        //   117: aload           8
        //   119: monitorenter   
        //   120: aload           8
        //   122: monitorenter   
        //   123: aload           8
        //   125: iconst_0       
        //   126: putfield        com/google/android/exoplayer2/source/p.s:I
        //   129: aload           8
        //   131: getfield        com/google/android/exoplayer2/source/p.a:Lcom/google/android/exoplayer2/source/o;
        //   134: astore          6
        //   136: aload           6
        //   138: aload           6
        //   140: getfield        com/google/android/exoplayer2/source/o.d:Lcom/google/android/exoplayer2/source/o$a;
        //   143: putfield        com/google/android/exoplayer2/source/o.e:Lcom/google/android/exoplayer2/source/o$a;
        //   146: aload           8
        //   148: monitorexit    
        //   149: aload           8
        //   151: getfield        com/google/android/exoplayer2/source/p.q:I
        //   154: istore          5
        //   156: iload           7
        //   158: iload           5
        //   160: if_icmplt       206
        //   163: iload           7
        //   165: aload           8
        //   167: getfield        com/google/android/exoplayer2/source/p.p:I
        //   170: iload           5
        //   172: iadd           
        //   173: if_icmple       179
        //   176: goto            206
        //   179: aload           8
        //   181: ldc2_w          -9223372036854775808
        //   184: putfield        com/google/android/exoplayer2/source/p.t:J
        //   187: aload           8
        //   189: iload           7
        //   191: iload           5
        //   193: isub           
        //   194: putfield        com/google/android/exoplayer2/source/p.s:I
        //   197: aload           8
        //   199: monitorexit    
        //   200: iconst_1       
        //   201: istore          9
        //   203: goto            268
        //   206: aload           8
        //   208: monitorexit    
        //   209: iconst_0       
        //   210: istore          9
        //   212: goto            268
        //   215: astore          6
        //   217: goto            228
        //   220: astore          6
        //   222: aload           8
        //   224: monitorexit    
        //   225: aload           6
        //   227: athrow         
        //   228: aload           8
        //   230: monitorexit    
        //   231: aload           6
        //   233: athrow         
        //   234: aload_0        
        //   235: getfield        cc/h.r:Lcom/google/android/exoplayer2/source/p;
        //   238: astore          6
        //   240: lload_1        
        //   241: aload_0        
        //   242: invokevirtual   cc/h.g:()J
        //   245: lcmp           
        //   246: ifge            255
        //   249: iconst_1       
        //   250: istore          9
        //   252: goto            258
        //   255: iconst_0       
        //   256: istore          9
        //   258: aload           6
        //   260: lload_1        
        //   261: iload           9
        //   263: invokevirtual   com/google/android/exoplayer2/source/p.y:(JZ)Z
        //   266: istore          9
        //   268: iload           9
        //   270: ifeq            336
        //   273: aload_0        
        //   274: getfield        cc/h.r:Lcom/google/android/exoplayer2/source/p;
        //   277: astore          6
        //   279: aload_0        
        //   280: aload_0        
        //   281: aload           6
        //   283: getfield        com/google/android/exoplayer2/source/p.q:I
        //   286: aload           6
        //   288: getfield        com/google/android/exoplayer2/source/p.s:I
        //   291: iadd           
        //   292: iconst_0       
        //   293: invokevirtual   cc/h.z:(II)I
        //   296: putfield        cc/h.z:I
        //   299: aload_0        
        //   300: getfield        cc/h.s:[Lcom/google/android/exoplayer2/source/p;
        //   303: astore          6
        //   305: aload           6
        //   307: arraylength    
        //   308: istore_3       
        //   309: iload           4
        //   311: istore          5
        //   313: iload           5
        //   315: iload_3        
        //   316: if_icmpge       472
        //   319: aload           6
        //   321: iload           5
        //   323: aaload         
        //   324: lload_1        
        //   325: iconst_1       
        //   326: invokevirtual   com/google/android/exoplayer2/source/p.y:(JZ)Z
        //   329: pop            
        //   330: iinc            5, 1
        //   333: goto            313
        //   336: aload_0        
        //   337: lload_1        
        //   338: putfield        cc/h.x:J
        //   341: aload_0        
        //   342: iconst_0       
        //   343: putfield        cc/h.B:Z
        //   346: aload_0        
        //   347: getfield        cc/h.p:Ljava/util/ArrayList;
        //   350: invokevirtual   java/util/ArrayList.clear:()V
        //   353: aload_0        
        //   354: iconst_0       
        //   355: putfield        cc/h.z:I
        //   358: aload_0        
        //   359: getfield        cc/h.n:Lcom/google/android/exoplayer2/upstream/Loader;
        //   362: invokevirtual   com/google/android/exoplayer2/upstream/Loader.d:()Z
        //   365: ifeq            420
        //   368: aload_0        
        //   369: getfield        cc/h.r:Lcom/google/android/exoplayer2/source/p;
        //   372: invokevirtual   com/google/android/exoplayer2/source/p.i:()V
        //   375: aload_0        
        //   376: getfield        cc/h.s:[Lcom/google/android/exoplayer2/source/p;
        //   379: astore          6
        //   381: aload           6
        //   383: arraylength    
        //   384: istore          4
        //   386: iload_3        
        //   387: istore          5
        //   389: iload           5
        //   391: iload           4
        //   393: if_icmpge       410
        //   396: aload           6
        //   398: iload           5
        //   400: aaload         
        //   401: invokevirtual   com/google/android/exoplayer2/source/p.i:()V
        //   404: iinc            5, 1
        //   407: goto            389
        //   410: aload_0        
        //   411: getfield        cc/h.n:Lcom/google/android/exoplayer2/upstream/Loader;
        //   414: invokevirtual   com/google/android/exoplayer2/upstream/Loader.a:()V
        //   417: goto            472
        //   420: aload_0        
        //   421: getfield        cc/h.n:Lcom/google/android/exoplayer2/upstream/Loader;
        //   424: aconst_null    
        //   425: putfield        com/google/android/exoplayer2/upstream/Loader.c:Ljava/io/IOException;
        //   428: aload_0        
        //   429: getfield        cc/h.r:Lcom/google/android/exoplayer2/source/p;
        //   432: iconst_0       
        //   433: invokevirtual   com/google/android/exoplayer2/source/p.x:(Z)V
        //   436: aload_0        
        //   437: getfield        cc/h.s:[Lcom/google/android/exoplayer2/source/p;
        //   440: astore          6
        //   442: aload           6
        //   444: arraylength    
        //   445: istore          4
        //   447: iconst_0       
        //   448: istore          5
        //   450: iload           5
        //   452: iload           4
        //   454: if_icmpge       472
        //   457: aload           6
        //   459: iload           5
        //   461: aaload         
        //   462: iconst_0       
        //   463: invokevirtual   com/google/android/exoplayer2/source/p.x:(Z)V
        //   466: iinc            5, 1
        //   469: goto            450
        //   472: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  120    123    215    220    Any
        //  123    146    220    228    Any
        //  146    156    215    220    Any
        //  163    176    215    220    Any
        //  179    197    215    220    Any
        //  222    228    215    220    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0179:
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
    
    @Override
    public final boolean a() {
        return this.n.d();
    }
    
    @Override
    public final void b() throws IOException {
        this.n.b();
        this.r.t();
        if (!this.n.d()) {
            this.j.b();
        }
    }
    
    @Override
    public final boolean d(long n) {
        final boolean b = this.B;
        final int n2 = 0;
        if (b || this.n.d() || this.n.c()) {
            return false;
        }
        final boolean w = this.w();
        Object o;
        long n3;
        if (w) {
            o = Collections.emptyList();
            n3 = this.x;
        }
        else {
            o = this.q;
            n3 = ((cc.e)this.r()).h;
        }
        this.j.j(n, n3, (List)o, this.o);
        final g o2 = this.o;
        final boolean a = o2.a;
        final Object u = o2.b;
        o2.b = null;
        o2.a = false;
        if (a) {
            this.x = -9223372036854775807L;
            return this.B = true;
        }
        if (u == null) {
            return false;
        }
        this.u = (cc.e)u;
        if (u instanceof cc.a) {
            final cc.a a2 = (cc.a)u;
            if (w) {
                n = ((cc.e)a2).g;
                final long x = this.x;
                if (n != x) {
                    this.r.t = x;
                    final com.google.android.exoplayer2.source.p[] s = this.s;
                    for (int length = s.length, i = 0; i < length; ++i) {
                        s[i].t = this.x;
                    }
                }
                this.x = -9223372036854775807L;
            }
            final cc.c t = this.t;
            a2.m = t;
            final int[] n4 = new int[t.b.length];
            int n5 = n2;
            while (true) {
                final com.google.android.exoplayer2.source.p[] b2 = t.b;
                if (n5 >= b2.length) {
                    break;
                }
                final com.google.android.exoplayer2.source.p p = b2[n5];
                n4[n5] = p.q + p.p;
                ++n5;
            }
            a2.n = n4;
            this.p.add(a2);
        }
        else if (u instanceof l) {
            ((l)u).k = (f$a)this.t;
        }
        n = this.n.f(u, (Loader.a<?>)this, this.m.getMinimumLoadableRetryCount(((cc.e)u).c));
        this.l.n(new ac.h(((cc.e)u).a, ((cc.e)u).b, n), ((cc.e)u).c, this.f, ((cc.e)u).d, ((cc.e)u).e, ((cc.e)u).f, ((cc.e)u).g, ((cc.e)u).h);
        return true;
    }
    
    @Override
    public final long e() {
        if (this.B) {
            return Long.MIN_VALUE;
        }
        if (this.w()) {
            return this.x;
        }
        final long y = this.y;
        Object r = this.r();
        if (!((m)r).c()) {
            if (this.p.size() > 1) {
                final ArrayList<cc.a> p = this.p;
                r = p.get(p.size() - 2);
            }
            else {
                r = null;
            }
        }
        long max = y;
        if (r != null) {
            max = Math.max(y, ((cc.e)r).h);
        }
        final com.google.android.exoplayer2.source.p r2 = this.r;
        synchronized (r2) {
            return Math.max(max, r2.v);
        }
    }
    
    @Override
    public final void f(long h) {
        if (!this.n.c()) {
            if (!this.w()) {
                if (this.n.d()) {
                    final cc.e u = this.u;
                    u.getClass();
                    final boolean b = u instanceof cc.a;
                    if (b && this.u(this.p.size() - 1)) {
                        return;
                    }
                    if (this.j.d(h, u, (List)this.q)) {
                        this.n.a();
                        if (b) {
                            this.A = (cc.a)u;
                        }
                    }
                }
                else {
                    int i = this.j.g(h, (List)this.q);
                    if (i < this.p.size()) {
                        d0.f(this.n.d() ^ true);
                        while (true) {
                            while (i < this.p.size()) {
                                if (!this.u(i)) {
                                    if (i == -1) {
                                        return;
                                    }
                                    h = ((cc.e)this.r()).h;
                                    final cc.a l = this.l(i);
                                    if (this.p.isEmpty()) {
                                        this.x = this.y;
                                    }
                                    this.B = false;
                                    final j.a j = this.l;
                                    j.p(new ac.i(1, this.f, null, 3, null, j.a(((cc.e)l).g), j.a(h)));
                                    return;
                                }
                                else {
                                    ++i;
                                }
                            }
                            i = -1;
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final long g() {
        if (this.w()) {
            return this.x;
        }
        long h;
        if (this.B) {
            h = Long.MIN_VALUE;
        }
        else {
            h = ((cc.e)this.r()).h;
        }
        return h;
    }
    
    @Override
    public final void h() {
        this.r.w();
        final com.google.android.exoplayer2.source.p[] s = this.s;
        for (int length = s.length, i = 0; i < length; ++i) {
            s[i].w();
        }
        this.j.release();
        final h.h$b<T> w = this.w;
        if (w != null) {
            final com.google.android.exoplayer2.source.dash.b b = (com.google.android.exoplayer2.source.dash.b)w;
            synchronized (b) {
                final d$c d$c = b.s.remove(this);
                if (d$c != null) {
                    d$c.a.w();
                }
            }
        }
    }
    
    @Override
    public final int i(final com.android.billingclient.api.d0 d0, final DecoderInputBuffer decoderInputBuffer, final int n) {
        if (this.w()) {
            return -3;
        }
        final cc.a a = this.A;
        if (a != null) {
            final int d2 = a.d(0);
            final com.google.android.exoplayer2.source.p r = this.r;
            if (d2 <= r.q + r.s) {
                return -3;
            }
        }
        this.x();
        return this.r.v(d0, decoderInputBuffer, n, this.B);
    }
    
    @Override
    public final boolean isReady() {
        return !this.w() && this.r.r(this.B);
    }
    
    @Override
    public final int k(final long n) {
        if (this.w()) {
            return 0;
        }
        final int p = this.r.p(n, this.B);
        final cc.a a = this.A;
        int min = p;
        if (a != null) {
            final int d = a.d(0);
            final com.google.android.exoplayer2.source.p r = this.r;
            min = Math.min(p, d - (r.q + r.s));
        }
        this.r.z(min);
        this.x();
        return min;
    }
    
    public final cc.a l(int n) {
        final cc.a a = this.p.get(n);
        final ArrayList<cc.a> p = this.p;
        c0.O(n, p.size(), p);
        this.z = Math.max(this.z, this.p.size());
        final com.google.android.exoplayer2.source.p r = this.r;
        n = 0;
        r.k(a.d(0));
        while (true) {
            final com.google.android.exoplayer2.source.p[] s = this.s;
            if (n >= s.length) {
                break;
            }
            final com.google.android.exoplayer2.source.p p2 = s[n];
            ++n;
            p2.k(a.d(n));
        }
        return a;
    }
    
    @Override
    public final void m(final d d, long a, final long n, final boolean b) {
        final cc.e e = (cc.e)d;
        this.u = null;
        this.A = null;
        a = e.a;
        final yc.q i = e.i;
        final ac.h h = new ac.h(i.c, i.d, i.b);
        this.m.onLoadTaskConcluded(a);
        this.l.e(h, e.c, this.f, e.d, e.e, e.f, e.g, e.h);
        if (!b) {
            if (this.w()) {
                this.r.x(false);
                final com.google.android.exoplayer2.source.p[] s = this.s;
                for (int length = s.length, j = 0; j < length; ++j) {
                    s[j].x(false);
                }
            }
            else if (e instanceof cc.a) {
                this.l(this.p.size() - 1);
                if (this.p.isEmpty()) {
                    this.x = this.y;
                }
            }
            this.k.i(this);
        }
    }
    
    @Override
    public final void o(final d d, long a, final long n) {
        final cc.e e = (cc.e)d;
        this.u = null;
        this.j.h(e);
        a = e.a;
        final yc.q i = e.i;
        final ac.h h = new ac.h(i.c, i.d, i.b);
        this.m.onLoadTaskConcluded(a);
        this.l.h(h, e.c, this.f, e.d, e.e, e.f, e.g, e.h);
        this.k.i(this);
    }
    
    @Override
    public final b q(final d d, long n, final long n2, final IOException ex, final int n3) {
        final cc.e e = (cc.e)d;
        n = e.i.b;
        final boolean b = e instanceof cc.a;
        final int n4 = this.p.size() - 1;
        final boolean b2 = n == 0L || !b || !this.u(n4);
        final yc.q i = e.i;
        final ac.h h = new ac.h(i.c, i.d, n);
        c0.U(e.g);
        c0.U(e.h);
        final com.google.android.exoplayer2.upstream.h.c c = new com.google.android.exoplayer2.upstream.h.c(ex, n3);
        b e2 = null;
        Label_0223: {
            if (this.j.e(e, b2, c, this.m)) {
                if (b2) {
                    final Loader.b b3 = e2 = Loader.e;
                    if (!b) {
                        break Label_0223;
                    }
                    d0.f(this.l(n4) == e);
                    e2 = b3;
                    if (this.p.isEmpty()) {
                        this.x = this.y;
                        e2 = b3;
                    }
                    break Label_0223;
                }
                else {
                    Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                }
            }
            e2 = null;
        }
        Loader.b f;
        if ((f = e2) == null) {
            n = this.m.getRetryDelayMsFor(c);
            if (n != -9223372036854775807L) {
                f = new Loader.b(0, n);
            }
            else {
                f = Loader.f;
            }
        }
        final boolean b4 = f.a() ^ true;
        this.l.j(h, e.c, this.f, e.d, e.e, e.f, e.g, e.h, ex, b4);
        if (b4) {
            this.u = null;
            this.m.onLoadTaskConcluded(e.a);
            this.k.i(this);
        }
        return f;
    }
    
    public final cc.a r() {
        final ArrayList<cc.a> p = this.p;
        return p.get(p.size() - 1);
    }
    
    public final boolean u(int n) {
        final cc.a a = this.p.get(n);
        final com.google.android.exoplayer2.source.p r = this.r;
        if (r.q + r.s > a.d(0)) {
            return true;
        }
        n = 0;
        com.google.android.exoplayer2.source.p p;
        do {
            final com.google.android.exoplayer2.source.p[] s = this.s;
            if (n >= s.length) {
                return false;
            }
            p = s[n];
        } while (p.q + p.s <= a.d(++n));
        return true;
    }
    
    public final boolean w() {
        return this.x != -9223372036854775807L;
    }
    
    public final void x() {
        final com.google.android.exoplayer2.source.p r = this.r;
        final int z = this.z(r.q + r.s, this.z - 1);
        while (true) {
            final int z2 = this.z;
            if (z2 > z) {
                break;
            }
            this.z = z2 + 1;
            final cc.a a = this.p.get(z2);
            final n d = ((cc.e)a).d;
            if (!d.equals((Object)this.v)) {
                this.l.b(this.f, d, ((cc.e)a).e, ((cc.e)a).f, ((cc.e)a).g);
            }
            this.v = d;
        }
    }
    
    public final void y(long n, final boolean b) {
        if (this.w()) {
            return;
        }
        final com.google.android.exoplayer2.source.p r = this.r;
        final int q = r.q;
        r.h(n, b, true);
        Object o = this.r;
        final int q2 = ((com.google.android.exoplayer2.source.p)o).q;
        if (q2 > q) {
            synchronized (o) {
                if (((com.google.android.exoplayer2.source.p)o).p == 0) {
                    n = Long.MIN_VALUE;
                }
                else {
                    n = ((com.google.android.exoplayer2.source.p)o).n[((com.google.android.exoplayer2.source.p)o).r];
                }
                monitorexit(o);
                int n2 = 0;
                while (true) {
                    o = this.s;
                    if (n2 >= ((com.google.android.exoplayer2.source.p)o).length) {
                        break;
                    }
                    o[n2].h(n, b, this.i[n2]);
                    ++n2;
                }
            }
        }
        final int min = Math.min(this.z(q2, 0), this.z);
        if (min > 0) {
            c0.O(0, min, this.p);
            this.z -= min;
        }
    }
    
    public final int z(final int n, int n2) {
        int n3;
        do {
            n3 = n2 + 1;
            if (n3 >= this.p.size()) {
                return this.p.size() - 1;
            }
            n2 = n3;
        } while (this.p.get(n3).d(0) <= n);
        return n3 - 1;
    }
    
    public final class a implements p
    {
        public final h<T> f;
        public final com.google.android.exoplayer2.source.p g;
        public final int h;
        public boolean i;
        
        public a(final h<T> f, final com.google.android.exoplayer2.source.p g, final int h) {
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        public final void a() {
            if (!this.i) {
                final h j = cc.h.this;
                final j.a l = j.l;
                final int[] g = j.g;
                final int h = this.h;
                l.b(g[h], j.h[h], 0, null, j.y);
                this.i = true;
            }
        }
        
        @Override
        public final void b() {
        }
        
        @Override
        public final int i(final com.android.billingclient.api.d0 d0, final DecoderInputBuffer decoderInputBuffer, final int n) {
            if (cc.h.this.w()) {
                return -3;
            }
            final cc.a a = cc.h.this.A;
            if (a != null) {
                final int d2 = a.d(this.h + 1);
                final com.google.android.exoplayer2.source.p g = this.g;
                if (d2 <= g.q + g.s) {
                    return -3;
                }
            }
            this.a();
            return this.g.v(d0, decoderInputBuffer, n, cc.h.this.B);
        }
        
        @Override
        public final boolean isReady() {
            return !cc.h.this.w() && this.g.r(cc.h.this.B);
        }
        
        @Override
        public final int k(final long n) {
            if (cc.h.this.w()) {
                return 0;
            }
            final int p = this.g.p(n, cc.h.this.B);
            final cc.a a = cc.h.this.A;
            int min = p;
            if (a != null) {
                final int d = a.d(this.h + 1);
                final com.google.android.exoplayer2.source.p g = this.g;
                min = Math.min(p, d - (g.q + g.s));
            }
            this.g.z(min);
            if (min > 0) {
                this.a();
            }
            return min;
        }
    }
}
