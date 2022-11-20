// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import com.google.android.exoplayer2.upstream.a$a;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.offline.DownloadRequest;
import android.os.Message;
import java.util.Collection;
import java.util.Comparator;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import android.os.HandlerThread;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.Looper;
import bd.c0;
import java.util.Collections;
import com.google.android.exoplayer2.upstream.cache.a$b;
import java.util.concurrent.ExecutorService;
import com.google.android.exoplayer2.upstream.e$a;
import za.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ra.l;
import android.content.Context;
import ac.a;

public final class d
{
    public static final ac.a m;
    public final Context a;
    public final b b;
    public final l c;
    public final CopyOnWriteArraySet<c> d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public List<zb.b> k;
    public ac.b l;
    
    static {
        m = new ac.a(1);
    }
    
    public d(final Context context, final za.c c, final com.google.android.exoplayer2.upstream.cache.c a, final e$a d, final ExecutorService executorService) {
        final com.google.android.exoplayer2.offline.a a2 = new com.google.android.exoplayer2.offline.a(c);
        final a$b a$b = new a$b();
        a$b.a = (Cache)a;
        a$b.d = (a$a)d;
        final zb.a a3 = new zb.a(a$b, executorService);
        this.a = context.getApplicationContext();
        this.g = 3;
        this.h = 5;
        this.f = true;
        this.k = Collections.emptyList();
        this.d = new CopyOnWriteArraySet<c>();
        final zb.c c2 = new zb.c(this);
        final int a4 = c0.a;
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        final Handler handler = new Handler(looper, (Handler$Callback)c2);
        final HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        ((Thread)handlerThread).start();
        final b b = new b(handlerThread, a2, a3, handler, this.g, this.h, this.f);
        this.b = b;
        final l c3 = new l(this, 4);
        this.c = c3;
        final ac.b l = new ac.b(context, c3, zb.d.m);
        this.l = l;
        final int b2 = l.b();
        this.i = b2;
        this.e = 1;
        b.obtainMessage(0, b2, 0).sendToTarget();
    }
    
    public final void a() {
        final Iterator<c> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
    }
    
    public final void b(final ac.b b, final int i) {
        final ac.a c = b.c;
        if (this.i != i) {
            this.i = i;
            ++this.e;
            this.b.obtainMessage(2, i, 0).sendToTarget();
        }
        final boolean e = this.e();
        final Iterator<c> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
        if (e) {
            this.a();
        }
    }
    
    public final void c(final boolean f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        ++this.e;
        this.b.obtainMessage(1, (int)(f ? 1 : 0), 0).sendToTarget();
        final boolean e = this.e();
        final Iterator<c> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
        if (e) {
            this.a();
        }
    }
    
    public final void d(final int n, final String s) {
        ++this.e;
        this.b.obtainMessage(3, n, 0, (Object)s).sendToTarget();
    }
    
    public final boolean e() {
        final boolean f = this.f;
        boolean b = true;
        boolean j = false;
        Label_0065: {
            if (!f && this.i != 0) {
                for (int i = 0; i < this.k.size(); ++i) {
                    if (this.k.get(i).b == 0) {
                        j = true;
                        break Label_0065;
                    }
                }
            }
            j = false;
        }
        if (this.j == j) {
            b = false;
        }
        this.j = j;
        return b;
    }
    
    public static final class a
    {
        public final boolean a;
        public final List<zb.b> b;
        
        public a(final zb.b b, final boolean a, final ArrayList b2, final Exception ex) {
            this.a = a;
            this.b = b2;
        }
    }
    
    public static final class b extends Handler
    {
        public static final int l = 0;
        public final HandlerThread a;
        public final n b;
        public final g c;
        public final Handler d;
        public final ArrayList<zb.b> e;
        public final HashMap<String, d> f;
        public int g;
        public boolean h;
        public int i;
        public int j;
        public int k;
        
        public b(final HandlerThread a, final com.google.android.exoplayer2.offline.a b, final zb.a c, final Handler d, final int i, final int j, final boolean h) {
            super(a.getLooper());
            this.a = a;
            this.b = (n)b;
            this.c = c;
            this.d = d;
            this.i = i;
            this.j = j;
            this.h = h;
            this.e = new ArrayList<zb.b>();
            this.f = new HashMap<String, d>();
        }
        
        public static zb.b a(final zb.b b, final int n, final int n2) {
            return new zb.b(b.a, n, b.c, System.currentTimeMillis(), b.e, n2, 0, b.h);
        }
        
        public final zb.b b(String s, final boolean b) {
            final int c = this.c(s);
            if (c != -1) {
                return this.e.get(c);
            }
            if (b) {
                try {
                    return ((com.google.android.exoplayer2.offline.a)this.b).c(s);
                }
                catch (final IOException ex) {
                    s = String.valueOf(s);
                    if (s.length() != 0) {
                        s = "Failed to load download: ".concat(s);
                    }
                    else {
                        s = new String("Failed to load download: ");
                    }
                    ah0.b.U("DownloadManager", s, (Throwable)ex);
                }
            }
            return null;
        }
        
        public final int c(final String s) {
            for (int i = 0; i < this.e.size(); ++i) {
                if (this.e.get(i).a.f.equals(s)) {
                    return i;
                }
            }
            return -1;
        }
        
        public final void d(final zb.b b) {
            final int b2 = b.b;
            ah0.b.H(b2 != 3 && b2 != 4);
            final int c = this.c(b.a.f);
            if (c == -1) {
                this.e.add(b);
                Collections.sort(this.e, (Comparator<? super zb.b>)new j2.g(1));
            }
            else {
                final boolean b3 = b.c != this.e.get(c).c;
                this.e.set(c, b);
                if (b3) {
                    Collections.sort(this.e, new d(1));
                }
            }
            try {
                ((com.google.android.exoplayer2.offline.a)this.b).h(b);
            }
            catch (final IOException ex) {
                ah0.b.U("DownloadManager", "Failed to update index.", (Throwable)ex);
            }
            this.d.obtainMessage(2, (Object)new a(b, false, new ArrayList((Collection<? extends E>)this.e), null)).sendToTarget();
        }
        
        public final zb.b e(zb.b a, final int n, final int n2) {
            ah0.b.H(n != 3 && n != 4);
            a = a(a, n, n2);
            this.d(a);
            return a;
        }
        
        public final void f(final zb.b b, final int n) {
            if (n == 0) {
                if (b.b == 1) {
                    this.e(b, 0, 0);
                }
            }
            else if (n != b.f) {
                final int b2 = b.b;
                int n2;
                if (b2 == 0 || (n2 = b2) == 2) {
                    n2 = 1;
                }
                this.d(new zb.b(b.a, n2, b.c, System.currentTimeMillis(), b.e, n, 0, b.h));
            }
        }
        
        public final void g() {
            int i = 0;
            int n = 0;
            while (i < this.e.size()) {
                final zb.b b = this.e.get(i);
                final d d = this.f.get(b.a.f);
                final int b2 = b.b;
                boolean b3 = true;
                final int n2 = 1;
                f.a a = null;
                Label_0503: {
                    if (b2 != 0) {
                        if (b2 != 1) {
                            if (b2 != 2) {
                                if (b2 != 5 && b2 != 7) {
                                    throw new IllegalStateException();
                                }
                                if (d != null) {
                                    a = d;
                                    if (!d.i) {
                                        d.a(false);
                                        a = d;
                                    }
                                }
                                else {
                                    final d d2 = new d(b.a, ((zb.a)this.c).a(b.a), b.h, true, this.j, this);
                                    this.f.put(b.a.f, d2);
                                    d2.start();
                                    a = d;
                                }
                            }
                            else {
                                d.getClass();
                                ah0.b.H(d.i ^ true);
                                int n3;
                                if (!this.h && this.g == 0) {
                                    n3 = n2;
                                }
                                else {
                                    n3 = 0;
                                }
                                if (n3 != 0) {
                                    a = d;
                                    if (n < this.i) {
                                        break Label_0503;
                                    }
                                }
                                this.e(b, 0, 0);
                                d.a(false);
                                a = d;
                            }
                        }
                        else if ((a = d) != null) {
                            ah0.b.H(d.i ^ true);
                            d.a(false);
                            a = d;
                        }
                    }
                    else if (d != null) {
                        ah0.b.H(d.i ^ true);
                        d.a(false);
                        a = d;
                    }
                    else {
                        if (this.h || this.g != 0) {
                            b3 = false;
                        }
                        if (b3 && this.k < this.i) {
                            final zb.b e = this.e(b, 2, 0);
                            a = new d(e.a, ((zb.a)this.c).a(e.a), e.h, false, this.j, this);
                            this.f.put(e.a.f, (d)a);
                            if (this.k++ == 0) {
                                this.sendEmptyMessageDelayed(11, 5000L);
                            }
                            ((Thread)a).start();
                        }
                        else {
                            a = null;
                        }
                    }
                }
                int n4 = n;
                if (a != null) {
                    n4 = n;
                    if (!((d)a).i) {
                        n4 = n + 1;
                    }
                }
                ++i;
                n = n4;
            }
        }
        
        public final void handleMessage(final Message p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/os/Message.what:I
            //     4: istore          6
            //     6: aconst_null    
            //     7: astore          16
            //     9: aconst_null    
            //    10: astore          15
            //    12: iconst_0       
            //    13: istore_3       
            //    14: iconst_0       
            //    15: istore          5
            //    17: iconst_0       
            //    18: istore          7
            //    20: iconst_0       
            //    21: istore          4
            //    23: iconst_0       
            //    24: istore_2       
            //    25: iload           6
            //    27: tableswitch {
            //                0: 2066
            //                1: 2043
            //                2: 2028
            //                3: 1801
            //                4: 1786
            //                5: 1775
            //                6: 1431
            //                7: 1350
            //                8: 971
            //                9: 389
            //               10: 260
            //               11: 189
            //               12: 100
            //          default: 92
            //        }
            //    92: new             Ljava/lang/IllegalStateException;
            //    95: dup            
            //    96: invokespecial   java/lang/IllegalStateException.<init>:()V
            //    99: athrow         
            //   100: aload_0        
            //   101: getfield        zb/d$b.f:Ljava/util/HashMap;
            //   104: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
            //   107: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
            //   112: astore_1       
            //   113: aload_1        
            //   114: invokeinterface java/util/Iterator.hasNext:()Z
            //   119: ifeq            138
            //   122: aload_1        
            //   123: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   128: checkcast       Lzb/d$d;
            //   131: iconst_1       
            //   132: invokevirtual   zb/d$d.a:(Z)V
            //   135: goto            113
            //   138: aload_0        
            //   139: getfield        zb/d$b.b:Lzb/n;
            //   142: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   145: invokevirtual   com/google/android/exoplayer2/offline/a.j:()V
            //   148: goto            160
            //   151: astore_1       
            //   152: ldc             "DownloadManager"
            //   154: ldc             "Failed to update index."
            //   156: aload_1        
            //   157: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   160: aload_0        
            //   161: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   164: invokevirtual   java/util/ArrayList.clear:()V
            //   167: aload_0        
            //   168: getfield        zb/d$b.a:Landroid/os/HandlerThread;
            //   171: invokevirtual   android/os/HandlerThread.quit:()Z
            //   174: pop            
            //   175: aload_0        
            //   176: monitorenter   
            //   177: aload_0        
            //   178: invokevirtual   java/lang/Object.notifyAll:()V
            //   181: aload_0        
            //   182: monitorexit    
            //   183: return         
            //   184: astore_1       
            //   185: aload_0        
            //   186: monitorexit    
            //   187: aload_1        
            //   188: athrow         
            //   189: iload_2        
            //   190: aload_0        
            //   191: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   194: invokevirtual   java/util/ArrayList.size:()I
            //   197: if_icmpge       249
            //   200: aload_0        
            //   201: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   204: iload_2        
            //   205: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //   208: checkcast       Lzb/b;
            //   211: astore_1       
            //   212: aload_1        
            //   213: getfield        zb/b.b:I
            //   216: iconst_2       
            //   217: if_icmpne       243
            //   220: aload_0        
            //   221: getfield        zb/d$b.b:Lzb/n;
            //   224: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   227: aload_1        
            //   228: invokevirtual   com/google/android/exoplayer2/offline/a.h:(Lzb/b;)V
            //   231: goto            243
            //   234: astore_1       
            //   235: ldc             "DownloadManager"
            //   237: ldc             "Failed to update index."
            //   239: aload_1        
            //   240: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   243: iinc            2, 1
            //   246: goto            189
            //   249: aload_0        
            //   250: bipush          11
            //   252: ldc2_w          5000
            //   255: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
            //   258: pop            
            //   259: return         
            //   260: aload_1        
            //   261: getfield        android/os/Message.obj:Ljava/lang/Object;
            //   264: checkcast       Lzb/d$d;
            //   267: astore          14
            //   269: aload_1        
            //   270: getfield        android/os/Message.arg1:I
            //   273: istore_2       
            //   274: aload_1        
            //   275: getfield        android/os/Message.arg2:I
            //   278: istore          4
            //   280: getstatic       bd/c0.a:I
            //   283: istore_3       
            //   284: iload_2        
            //   285: i2l            
            //   286: lstore          8
            //   288: ldc2_w          4294967295
            //   291: iload           4
            //   293: i2l            
            //   294: land           
            //   295: lload           8
            //   297: ldc2_w          4294967295
            //   300: land           
            //   301: bipush          32
            //   303: lshl           
            //   304: lor            
            //   305: lstore          8
            //   307: aload_0        
            //   308: aload           14
            //   310: getfield        zb/d$d.f:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   313: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   316: iconst_0       
            //   317: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //   320: astore_1       
            //   321: aload_1        
            //   322: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   325: pop            
            //   326: lload           8
            //   328: aload_1        
            //   329: getfield        zb/b.e:J
            //   332: lcmp           
            //   333: ifeq            388
            //   336: lload           8
            //   338: ldc2_w          -1
            //   341: lcmp           
            //   342: ifne            348
            //   345: goto            388
            //   348: aload_0        
            //   349: new             Lzb/b;
            //   352: dup            
            //   353: aload_1        
            //   354: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   357: aload_1        
            //   358: getfield        zb/b.b:I
            //   361: aload_1        
            //   362: getfield        zb/b.c:J
            //   365: invokestatic    java/lang/System.currentTimeMillis:()J
            //   368: lload           8
            //   370: aload_1        
            //   371: getfield        zb/b.f:I
            //   374: aload_1        
            //   375: getfield        zb/b.g:I
            //   378: aload_1        
            //   379: getfield        zb/b.h:Lzb/e;
            //   382: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJJIILzb/e;)V
            //   385: invokevirtual   zb/d$b.d:(Lzb/b;)V
            //   388: return         
            //   389: aload_1        
            //   390: getfield        android/os/Message.obj:Ljava/lang/Object;
            //   393: checkcast       Lzb/d$d;
            //   396: astore          15
            //   398: aload           15
            //   400: getfield        zb/d$d.f:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   403: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   406: astore          14
            //   408: aload_0        
            //   409: getfield        zb/d$b.f:Ljava/util/HashMap;
            //   412: aload           14
            //   414: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
            //   417: pop            
            //   418: aload           15
            //   420: getfield        zb/d$d.i:Z
            //   423: istore          7
            //   425: iload           7
            //   427: ifne            452
            //   430: aload_0        
            //   431: getfield        zb/d$b.k:I
            //   434: iconst_1       
            //   435: isub           
            //   436: istore_2       
            //   437: aload_0        
            //   438: iload_2        
            //   439: putfield        zb/d$b.k:I
            //   442: iload_2        
            //   443: ifne            452
            //   446: aload_0        
            //   447: bipush          11
            //   449: invokevirtual   android/os/Handler.removeMessages:(I)V
            //   452: aload           15
            //   454: getfield        zb/d$d.l:Z
            //   457: ifeq            470
            //   460: aload_0        
            //   461: invokevirtual   zb/d$b.g:()V
            //   464: iload           4
            //   466: istore_2       
            //   467: goto            2362
            //   470: aload           15
            //   472: getfield        zb/d$d.m:Ljava/lang/Exception;
            //   475: astore_1       
            //   476: aload_1        
            //   477: ifnull          552
            //   480: aload           15
            //   482: getfield        zb/d$d.f:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   485: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
            //   488: astore          15
            //   490: new             Ljava/lang/StringBuilder;
            //   493: dup            
            //   494: aload           15
            //   496: invokevirtual   java/lang/String.length:()I
            //   499: bipush          20
            //   501: iadd           
            //   502: invokespecial   java/lang/StringBuilder.<init>:(I)V
            //   505: astore          16
            //   507: aload           16
            //   509: ldc_w           "Task failed: "
            //   512: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   515: pop            
            //   516: aload           16
            //   518: aload           15
            //   520: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   523: pop            
            //   524: aload           16
            //   526: ldc_w           ", "
            //   529: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   532: pop            
            //   533: aload           16
            //   535: iload           7
            //   537: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
            //   540: pop            
            //   541: ldc             "DownloadManager"
            //   543: aload           16
            //   545: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   548: aload_1        
            //   549: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   552: aload_0        
            //   553: aload           14
            //   555: iconst_0       
            //   556: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //   559: astore          14
            //   561: aload           14
            //   563: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   566: pop            
            //   567: aload           14
            //   569: getfield        zb/b.b:I
            //   572: istore_2       
            //   573: iload_2        
            //   574: iconst_2       
            //   575: if_icmpeq       792
            //   578: iload_2        
            //   579: iconst_5       
            //   580: if_icmpeq       600
            //   583: iload_2        
            //   584: bipush          7
            //   586: if_icmpne       592
            //   589: goto            600
            //   592: new             Ljava/lang/IllegalStateException;
            //   595: dup            
            //   596: invokespecial   java/lang/IllegalStateException.<init>:()V
            //   599: athrow         
            //   600: iload           7
            //   602: invokestatic    ah0/b.H:(Z)V
            //   605: aload           14
            //   607: getfield        zb/b.b:I
            //   610: bipush          7
            //   612: if_icmpne       648
            //   615: aload           14
            //   617: getfield        zb/b.f:I
            //   620: istore_3       
            //   621: iload_3        
            //   622: ifne            630
            //   625: iconst_0       
            //   626: istore_2       
            //   627: goto            632
            //   630: iconst_1       
            //   631: istore_2       
            //   632: aload_0        
            //   633: aload           14
            //   635: iload_2        
            //   636: iload_3        
            //   637: invokevirtual   zb/d$b.e:(Lzb/b;II)Lzb/b;
            //   640: pop            
            //   641: aload_0        
            //   642: invokevirtual   zb/d$b.g:()V
            //   645: goto            961
            //   648: aload_0        
            //   649: aload           14
            //   651: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   654: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   657: invokevirtual   zb/d$b.c:(Ljava/lang/String;)I
            //   660: istore_2       
            //   661: aload_0        
            //   662: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   665: iload_2        
            //   666: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
            //   669: pop            
            //   670: aload_0        
            //   671: getfield        zb/d$b.b:Lzb/n;
            //   674: astore          15
            //   676: aload           14
            //   678: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   681: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   684: astore_1       
            //   685: aload           15
            //   687: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   690: astore          15
            //   692: aload           15
            //   694: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //   697: aload           15
            //   699: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //   702: invokeinterface za/a.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //   707: aload           15
            //   709: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //   712: ldc_w           "id = ?"
            //   715: iconst_1       
            //   716: anewarray       Ljava/lang/String;
            //   719: dup            
            //   720: iconst_0       
            //   721: aload_1        
            //   722: aastore        
            //   723: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
            //   726: pop            
            //   727: goto            754
            //   730: astore          15
            //   732: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //   735: astore_1       
            //   736: aload_1        
            //   737: aload           15
            //   739: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //   742: aload_1        
            //   743: athrow         
            //   744: astore_1       
            //   745: ldc             "DownloadManager"
            //   747: ldc_w           "Failed to remove from database"
            //   750: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
            //   753: pop            
            //   754: new             Lzb/d$a;
            //   757: dup            
            //   758: aload           14
            //   760: iconst_1       
            //   761: new             Ljava/util/ArrayList;
            //   764: dup            
            //   765: aload_0        
            //   766: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   769: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //   772: aconst_null    
            //   773: invokespecial   zb/d$a.<init>:(Lzb/b;ZLjava/util/ArrayList;Ljava/lang/Exception;)V
            //   776: astore_1       
            //   777: aload_0        
            //   778: getfield        zb/d$b.d:Landroid/os/Handler;
            //   781: iconst_2       
            //   782: aload_1        
            //   783: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //   786: invokevirtual   android/os/Message.sendToTarget:()V
            //   789: goto            961
            //   792: iload           7
            //   794: iconst_1       
            //   795: ixor           
            //   796: invokestatic    ah0/b.H:(Z)V
            //   799: aload           14
            //   801: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   804: astore          15
            //   806: aload_1        
            //   807: ifnonnull       815
            //   810: iconst_3       
            //   811: istore_2       
            //   812: goto            817
            //   815: iconst_4       
            //   816: istore_2       
            //   817: aload           14
            //   819: getfield        zb/b.c:J
            //   822: lstore          12
            //   824: invokestatic    java/lang/System.currentTimeMillis:()J
            //   827: lstore          10
            //   829: aload           14
            //   831: getfield        zb/b.e:J
            //   834: lstore          8
            //   836: aload           14
            //   838: getfield        zb/b.f:I
            //   841: istore          5
            //   843: aload_1        
            //   844: ifnonnull       852
            //   847: iconst_0       
            //   848: istore_3       
            //   849: goto            854
            //   852: iconst_1       
            //   853: istore_3       
            //   854: new             Lzb/b;
            //   857: dup            
            //   858: aload           15
            //   860: iload_2        
            //   861: lload           12
            //   863: lload           10
            //   865: lload           8
            //   867: iload           5
            //   869: iload_3        
            //   870: aload           14
            //   872: getfield        zb/b.h:Lzb/e;
            //   875: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJJIILzb/e;)V
            //   878: astore          14
            //   880: aload_0        
            //   881: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   884: aload_0        
            //   885: aload           14
            //   887: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   890: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   893: invokevirtual   zb/d$b.c:(Ljava/lang/String;)I
            //   896: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
            //   899: pop            
            //   900: aload_0        
            //   901: getfield        zb/d$b.b:Lzb/n;
            //   904: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   907: aload           14
            //   909: invokevirtual   com/google/android/exoplayer2/offline/a.h:(Lzb/b;)V
            //   912: goto            926
            //   915: astore          15
            //   917: ldc             "DownloadManager"
            //   919: ldc             "Failed to update index."
            //   921: aload           15
            //   923: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   926: new             Lzb/d$a;
            //   929: dup            
            //   930: aload           14
            //   932: iconst_0       
            //   933: new             Ljava/util/ArrayList;
            //   936: dup            
            //   937: aload_0        
            //   938: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   941: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //   944: aload_1        
            //   945: invokespecial   zb/d$a.<init>:(Lzb/b;ZLjava/util/ArrayList;Ljava/lang/Exception;)V
            //   948: astore_1       
            //   949: aload_0        
            //   950: getfield        zb/d$b.d:Landroid/os/Handler;
            //   953: iconst_2       
            //   954: aload_1        
            //   955: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //   958: invokevirtual   android/os/Message.sendToTarget:()V
            //   961: aload_0        
            //   962: invokevirtual   zb/d$b.g:()V
            //   965: iload           4
            //   967: istore_2       
            //   968: goto            2362
            //   971: new             Ljava/util/ArrayList;
            //   974: dup            
            //   975: invokespecial   java/util/ArrayList.<init>:()V
            //   978: astore_1       
            //   979: aload_0        
            //   980: getfield        zb/d$b.b:Lzb/n;
            //   983: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   986: astore          15
            //   988: aload           15
            //   990: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //   993: iconst_2       
            //   994: newarray        I
            //   996: dup            
            //   997: iconst_0       
            //   998: iconst_3       
            //   999: iastore        
            //  1000: dup            
            //  1001: iconst_1       
            //  1002: iconst_4       
            //  1003: iastore        
            //  1004: invokestatic    com/google/android/exoplayer2/offline/a.f:([I)Ljava/lang/String;
            //  1007: astore          14
            //  1009: aload           15
            //  1011: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //  1014: invokeinterface za/a.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //  1019: aload           15
            //  1021: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //  1024: getstatic       com/google/android/exoplayer2/offline/a.f:[Ljava/lang/String;
            //  1027: aload           14
            //  1029: aconst_null    
            //  1030: aconst_null    
            //  1031: aconst_null    
            //  1032: ldc_w           "start_time_ms ASC"
            //  1035: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
            //  1038: astore          14
            //  1040: new             Lcom/google/android/exoplayer2/offline/a$a;
            //  1043: astore          15
            //  1045: aload           15
            //  1047: aload           14
            //  1049: invokespecial   com/google/android/exoplayer2/offline/a$a.<init>:(Landroid/database/Cursor;)V
            //  1052: aload           15
            //  1054: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  1057: invokeinterface android/database/Cursor.getPosition:()I
            //  1062: istore_2       
            //  1063: aload           15
            //  1065: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  1068: iload_2        
            //  1069: iconst_1       
            //  1070: iadd           
            //  1071: invokeinterface android/database/Cursor.moveToPosition:(I)Z
            //  1076: ifeq            1100
            //  1079: aload_1        
            //  1080: aload           15
            //  1082: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  1085: invokestatic    com/google/android/exoplayer2/offline/a.d:(Landroid/database/Cursor;)Lzb/b;
            //  1088: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  1091: pop            
            //  1092: goto            1052
            //  1095: astore          14
            //  1097: goto            1108
            //  1100: aload           15
            //  1102: invokevirtual   com/google/android/exoplayer2/offline/a$a.close:()V
            //  1105: goto            1156
            //  1108: aload           15
            //  1110: invokevirtual   com/google/android/exoplayer2/offline/a$a.close:()V
            //  1113: goto            1125
            //  1116: astore          15
            //  1118: aload           14
            //  1120: aload           15
            //  1122: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
            //  1125: aload           14
            //  1127: athrow         
            //  1128: astore          14
            //  1130: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //  1133: astore          15
            //  1135: aload           15
            //  1137: aload           14
            //  1139: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //  1142: aload           15
            //  1144: athrow         
            //  1145: astore          14
            //  1147: ldc             "DownloadManager"
            //  1149: ldc_w           "Failed to load downloads."
            //  1152: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
            //  1155: pop            
            //  1156: iconst_0       
            //  1157: istore_2       
            //  1158: iload_2        
            //  1159: aload_0        
            //  1160: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1163: invokevirtual   java/util/ArrayList.size:()I
            //  1166: if_icmpge       1202
            //  1169: aload_0        
            //  1170: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1173: astore          14
            //  1175: aload           14
            //  1177: iload_2        
            //  1178: aload           14
            //  1180: iload_2        
            //  1181: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1184: checkcast       Lzb/b;
            //  1187: iconst_5       
            //  1188: iconst_0       
            //  1189: invokestatic    zb/d$b.a:(Lzb/b;II)Lzb/b;
            //  1192: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
            //  1195: pop            
            //  1196: iinc            2, 1
            //  1199: goto            1158
            //  1202: iconst_0       
            //  1203: istore_2       
            //  1204: iload_2        
            //  1205: aload_1        
            //  1206: invokevirtual   java/util/ArrayList.size:()I
            //  1209: if_icmpge       1239
            //  1212: aload_0        
            //  1213: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1216: aload_1        
            //  1217: iload_2        
            //  1218: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1221: checkcast       Lzb/b;
            //  1224: iconst_5       
            //  1225: iconst_0       
            //  1226: invokestatic    zb/d$b.a:(Lzb/b;II)Lzb/b;
            //  1229: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  1232: pop            
            //  1233: iinc            2, 1
            //  1236: goto            1204
            //  1239: aload_0        
            //  1240: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1243: new             Le2/n;
            //  1246: dup            
            //  1247: iconst_2       
            //  1248: invokespecial   e2/n.<init>:(I)V
            //  1251: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
            //  1254: aload_0        
            //  1255: getfield        zb/d$b.b:Lzb/n;
            //  1258: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  1261: invokevirtual   com/google/android/exoplayer2/offline/a.k:()V
            //  1264: goto            1276
            //  1267: astore_1       
            //  1268: ldc             "DownloadManager"
            //  1270: ldc             "Failed to update index."
            //  1272: aload_1        
            //  1273: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  1276: new             Ljava/util/ArrayList;
            //  1279: dup            
            //  1280: aload_0        
            //  1281: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1284: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //  1287: astore          14
            //  1289: iconst_0       
            //  1290: istore_2       
            //  1291: iload_2        
            //  1292: aload_0        
            //  1293: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1296: invokevirtual   java/util/ArrayList.size:()I
            //  1299: if_icmpge       1343
            //  1302: new             Lzb/d$a;
            //  1305: dup            
            //  1306: aload_0        
            //  1307: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1310: iload_2        
            //  1311: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1314: checkcast       Lzb/b;
            //  1317: iconst_0       
            //  1318: aload           14
            //  1320: aconst_null    
            //  1321: invokespecial   zb/d$a.<init>:(Lzb/b;ZLjava/util/ArrayList;Ljava/lang/Exception;)V
            //  1324: astore_1       
            //  1325: aload_0        
            //  1326: getfield        zb/d$b.d:Landroid/os/Handler;
            //  1329: iconst_2       
            //  1330: aload_1        
            //  1331: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //  1334: invokevirtual   android/os/Message.sendToTarget:()V
            //  1337: iinc            2, 1
            //  1340: goto            1291
            //  1343: aload_0        
            //  1344: invokevirtual   zb/d$b.g:()V
            //  1347: goto            2360
            //  1350: aload_1        
            //  1351: getfield        android/os/Message.obj:Ljava/lang/Object;
            //  1354: checkcast       Ljava/lang/String;
            //  1357: astore          14
            //  1359: aload_0        
            //  1360: aload           14
            //  1362: iconst_1       
            //  1363: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //  1366: astore_1       
            //  1367: aload_1        
            //  1368: ifnonnull       1416
            //  1371: aload           14
            //  1373: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
            //  1376: astore_1       
            //  1377: aload_1        
            //  1378: invokevirtual   java/lang/String.length:()I
            //  1381: ifeq            1395
            //  1384: ldc_w           "Failed to remove nonexistent download: "
            //  1387: aload_1        
            //  1388: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
            //  1391: astore_1       
            //  1392: goto            1406
            //  1395: new             Ljava/lang/String;
            //  1398: dup            
            //  1399: ldc_w           "Failed to remove nonexistent download: "
            //  1402: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
            //  1405: astore_1       
            //  1406: ldc             "DownloadManager"
            //  1408: aload_1        
            //  1409: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
            //  1412: pop            
            //  1413: goto            2360
            //  1416: aload_0        
            //  1417: aload_1        
            //  1418: iconst_5       
            //  1419: iconst_0       
            //  1420: invokevirtual   zb/d$b.e:(Lzb/b;II)Lzb/b;
            //  1423: pop            
            //  1424: aload_0        
            //  1425: invokevirtual   zb/d$b.g:()V
            //  1428: goto            2360
            //  1431: aload_1        
            //  1432: getfield        android/os/Message.obj:Ljava/lang/Object;
            //  1435: checkcast       Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //  1438: astore          15
            //  1440: aload_1        
            //  1441: getfield        android/os/Message.arg1:I
            //  1444: istore          4
            //  1446: aload_0        
            //  1447: aload           15
            //  1449: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1452: iconst_1       
            //  1453: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //  1456: astore_1       
            //  1457: invokestatic    java/lang/System.currentTimeMillis:()J
            //  1460: lstore          10
            //  1462: aload_1        
            //  1463: ifnull          1736
            //  1466: aload_1        
            //  1467: getfield        zb/b.b:I
            //  1470: istore          5
            //  1472: iload           5
            //  1474: iconst_5       
            //  1475: if_icmpeq       1516
            //  1478: iload           5
            //  1480: iconst_3       
            //  1481: if_icmpeq       1498
            //  1484: iload           5
            //  1486: iconst_4       
            //  1487: if_icmpne       1493
            //  1490: goto            1498
            //  1493: iconst_0       
            //  1494: istore_2       
            //  1495: goto            1500
            //  1498: iconst_1       
            //  1499: istore_2       
            //  1500: iload_2        
            //  1501: ifeq            1507
            //  1504: goto            1516
            //  1507: aload_1        
            //  1508: getfield        zb/b.c:J
            //  1511: lstore          8
            //  1513: goto            1520
            //  1516: lload           10
            //  1518: lstore          8
            //  1520: iload           5
            //  1522: iconst_5       
            //  1523: if_icmpeq       1551
            //  1526: iload           5
            //  1528: bipush          7
            //  1530: if_icmpne       1536
            //  1533: goto            1551
            //  1536: iload           4
            //  1538: ifeq            1546
            //  1541: iconst_1       
            //  1542: istore_2       
            //  1543: goto            1554
            //  1546: iconst_0       
            //  1547: istore_2       
            //  1548: goto            1554
            //  1551: bipush          7
            //  1553: istore_2       
            //  1554: aload_1        
            //  1555: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //  1558: astore          16
            //  1560: aload           16
            //  1562: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1565: aload           15
            //  1567: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1570: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1573: invokestatic    ah0/b.C:(Z)V
            //  1576: aload           16
            //  1578: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1581: invokeinterface java/util/List.isEmpty:()Z
            //  1586: ifne            1673
            //  1589: aload           15
            //  1591: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1594: invokeinterface java/util/List.isEmpty:()Z
            //  1599: ifeq            1605
            //  1602: goto            1673
            //  1605: new             Ljava/util/ArrayList;
            //  1608: dup            
            //  1609: aload           16
            //  1611: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1614: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //  1617: astore          14
            //  1619: aload           14
            //  1621: astore_1       
            //  1622: iload_3        
            //  1623: aload           15
            //  1625: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1628: invokeinterface java/util/List.size:()I
            //  1633: if_icmpge       1677
            //  1636: aload           15
            //  1638: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1641: iload_3        
            //  1642: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
            //  1647: checkcast       Lzb/m;
            //  1650: astore_1       
            //  1651: aload           14
            //  1653: aload_1        
            //  1654: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
            //  1657: ifne            1667
            //  1660: aload           14
            //  1662: aload_1        
            //  1663: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  1666: pop            
            //  1667: iinc            3, 1
            //  1670: goto            1619
            //  1673: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
            //  1676: astore_1       
            //  1677: aload_0        
            //  1678: new             Lzb/b;
            //  1681: dup            
            //  1682: new             Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //  1685: dup            
            //  1686: aload           16
            //  1688: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1691: aload           15
            //  1693: getfield        com/google/android/exoplayer2/offline/DownloadRequest.g:Landroid/net/Uri;
            //  1696: aload           15
            //  1698: getfield        com/google/android/exoplayer2/offline/DownloadRequest.h:Ljava/lang/String;
            //  1701: aload_1        
            //  1702: aload           15
            //  1704: getfield        com/google/android/exoplayer2/offline/DownloadRequest.j:[B
            //  1707: aload           15
            //  1709: getfield        com/google/android/exoplayer2/offline/DownloadRequest.k:Ljava/lang/String;
            //  1712: aload           15
            //  1714: getfield        com/google/android/exoplayer2/offline/DownloadRequest.l:[B
            //  1717: invokespecial   com/google/android/exoplayer2/offline/DownloadRequest.<init>:(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[B)V
            //  1720: iload_2        
            //  1721: lload           8
            //  1723: lload           10
            //  1725: iload           4
            //  1727: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJI)V
            //  1730: invokevirtual   zb/d$b.d:(Lzb/b;)V
            //  1733: goto            1768
            //  1736: iload           4
            //  1738: ifeq            1746
            //  1741: iconst_1       
            //  1742: istore_2       
            //  1743: goto            1748
            //  1746: iconst_0       
            //  1747: istore_2       
            //  1748: aload_0        
            //  1749: new             Lzb/b;
            //  1752: dup            
            //  1753: aload           15
            //  1755: iload_2        
            //  1756: lload           10
            //  1758: lload           10
            //  1760: iload           4
            //  1762: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJI)V
            //  1765: invokevirtual   zb/d$b.d:(Lzb/b;)V
            //  1768: aload_0        
            //  1769: invokevirtual   zb/d$b.g:()V
            //  1772: goto            2360
            //  1775: aload_0        
            //  1776: aload_1        
            //  1777: getfield        android/os/Message.arg1:I
            //  1780: putfield        zb/d$b.j:I
            //  1783: goto            2360
            //  1786: aload_0        
            //  1787: aload_1        
            //  1788: getfield        android/os/Message.arg1:I
            //  1791: putfield        zb/d$b.i:I
            //  1794: aload_0        
            //  1795: invokevirtual   zb/d$b.g:()V
            //  1798: goto            2360
            //  1801: aload_1        
            //  1802: getfield        android/os/Message.obj:Ljava/lang/Object;
            //  1805: checkcast       Ljava/lang/String;
            //  1808: astore          15
            //  1810: aload_1        
            //  1811: getfield        android/os/Message.arg1:I
            //  1814: istore_3       
            //  1815: aload           15
            //  1817: ifnonnull       1943
            //  1820: iload           5
            //  1822: istore_2       
            //  1823: iload_2        
            //  1824: aload_0        
            //  1825: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1828: invokevirtual   java/util/ArrayList.size:()I
            //  1831: if_icmpge       1856
            //  1834: aload_0        
            //  1835: aload_0        
            //  1836: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1839: iload_2        
            //  1840: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1843: checkcast       Lzb/b;
            //  1846: iload_3        
            //  1847: invokevirtual   zb/d$b.f:(Lzb/b;I)V
            //  1850: iinc            2, 1
            //  1853: goto            1823
            //  1856: aload_0        
            //  1857: getfield        zb/d$b.b:Lzb/n;
            //  1860: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  1863: astore_1       
            //  1864: aload_1        
            //  1865: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //  1868: new             Landroid/content/ContentValues;
            //  1871: astore          14
            //  1873: aload           14
            //  1875: invokespecial   android/content/ContentValues.<init>:()V
            //  1878: aload           14
            //  1880: ldc_w           "stop_reason"
            //  1883: iload_3        
            //  1884: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1887: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
            //  1890: aload_1        
            //  1891: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //  1894: invokeinterface za/a.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //  1899: aload_1        
            //  1900: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //  1903: aload           14
            //  1905: getstatic       com/google/android/exoplayer2/offline/a.e:Ljava/lang/String;
            //  1908: aconst_null    
            //  1909: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
            //  1912: pop            
            //  1913: goto            2021
            //  1916: astore          14
            //  1918: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //  1921: astore_1       
            //  1922: aload_1        
            //  1923: aload           14
            //  1925: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //  1928: aload_1        
            //  1929: athrow         
            //  1930: astore_1       
            //  1931: ldc             "DownloadManager"
            //  1933: ldc_w           "Failed to set manual stop reason"
            //  1936: aload_1        
            //  1937: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  1940: goto            2021
            //  1943: aload_0        
            //  1944: aload           15
            //  1946: iconst_0       
            //  1947: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //  1950: astore_1       
            //  1951: aload_1        
            //  1952: ifnull          1964
            //  1955: aload_0        
            //  1956: aload_1        
            //  1957: iload_3        
            //  1958: invokevirtual   zb/d$b.f:(Lzb/b;I)V
            //  1961: goto            2021
            //  1964: aload_0        
            //  1965: getfield        zb/d$b.b:Lzb/n;
            //  1968: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  1971: iload_3        
            //  1972: aload           15
            //  1974: invokevirtual   com/google/android/exoplayer2/offline/a.l:(ILjava/lang/String;)V
            //  1977: goto            2021
            //  1980: astore          14
            //  1982: aload           15
            //  1984: invokevirtual   java/lang/String.length:()I
            //  1987: ifeq            2002
            //  1990: ldc_w           "Failed to set manual stop reason: "
            //  1993: aload           15
            //  1995: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
            //  1998: astore_1       
            //  1999: goto            2013
            //  2002: new             Ljava/lang/String;
            //  2005: dup            
            //  2006: ldc_w           "Failed to set manual stop reason: "
            //  2009: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
            //  2012: astore_1       
            //  2013: ldc             "DownloadManager"
            //  2015: aload_1        
            //  2016: aload           14
            //  2018: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  2021: aload_0        
            //  2022: invokevirtual   zb/d$b.g:()V
            //  2025: goto            2360
            //  2028: aload_0        
            //  2029: aload_1        
            //  2030: getfield        android/os/Message.arg1:I
            //  2033: putfield        zb/d$b.g:I
            //  2036: aload_0        
            //  2037: invokevirtual   zb/d$b.g:()V
            //  2040: goto            2360
            //  2043: aload_1        
            //  2044: getfield        android/os/Message.arg1:I
            //  2047: ifeq            2053
            //  2050: iconst_1       
            //  2051: istore          7
            //  2053: aload_0        
            //  2054: iload           7
            //  2056: putfield        zb/d$b.h:Z
            //  2059: aload_0        
            //  2060: invokevirtual   zb/d$b.g:()V
            //  2063: goto            2360
            //  2066: aload_0        
            //  2067: aload_1        
            //  2068: getfield        android/os/Message.arg1:I
            //  2071: putfield        zb/d$b.g:I
            //  2074: aload           15
            //  2076: astore          14
            //  2078: aload_0        
            //  2079: getfield        zb/d$b.b:Lzb/n;
            //  2082: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  2085: invokevirtual   com/google/android/exoplayer2/offline/a.j:()V
            //  2088: aload           15
            //  2090: astore          14
            //  2092: aload_0        
            //  2093: getfield        zb/d$b.b:Lzb/n;
            //  2096: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  2099: astore          17
            //  2101: aload           15
            //  2103: astore          14
            //  2105: aload           17
            //  2107: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //  2110: aload           15
            //  2112: astore          14
            //  2114: iconst_5       
            //  2115: newarray        I
            //  2117: dup            
            //  2118: iconst_0       
            //  2119: iconst_0       
            //  2120: iastore        
            //  2121: dup            
            //  2122: iconst_1       
            //  2123: iconst_1       
            //  2124: iastore        
            //  2125: dup            
            //  2126: iconst_2       
            //  2127: iconst_2       
            //  2128: iastore        
            //  2129: dup            
            //  2130: iconst_3       
            //  2131: iconst_5       
            //  2132: iastore        
            //  2133: dup            
            //  2134: iconst_4       
            //  2135: bipush          7
            //  2137: iastore        
            //  2138: invokestatic    com/google/android/exoplayer2/offline/a.f:([I)Ljava/lang/String;
            //  2141: astore_1       
            //  2142: aload           15
            //  2144: astore          14
            //  2146: aload           17
            //  2148: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //  2151: invokeinterface za/a.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //  2156: aload           17
            //  2158: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //  2161: getstatic       com/google/android/exoplayer2/offline/a.f:[Ljava/lang/String;
            //  2164: aload_1        
            //  2165: aconst_null    
            //  2166: aconst_null    
            //  2167: aconst_null    
            //  2168: ldc_w           "start_time_ms ASC"
            //  2171: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
            //  2174: astore          17
            //  2176: aload           15
            //  2178: astore          14
            //  2180: new             Lcom/google/android/exoplayer2/offline/a$a;
            //  2183: astore_1       
            //  2184: aload           15
            //  2186: astore          14
            //  2188: aload_1        
            //  2189: aload           17
            //  2191: invokespecial   com/google/android/exoplayer2/offline/a$a.<init>:(Landroid/database/Cursor;)V
            //  2194: aload_1        
            //  2195: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  2198: invokeinterface android/database/Cursor.getPosition:()I
            //  2203: istore_2       
            //  2204: aload_1        
            //  2205: astore          14
            //  2207: aload_1        
            //  2208: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  2211: iload_2        
            //  2212: iconst_1       
            //  2213: iadd           
            //  2214: invokeinterface android/database/Cursor.moveToPosition:(I)Z
            //  2219: ifeq            2327
            //  2222: aload_0        
            //  2223: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  2226: aload_1        
            //  2227: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  2230: invokestatic    com/google/android/exoplayer2/offline/a.d:(Landroid/database/Cursor;)Lzb/b;
            //  2233: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  2236: pop            
            //  2237: goto            2194
            //  2240: astore          15
            //  2242: goto            2250
            //  2245: astore          15
            //  2247: goto            2259
            //  2250: aload_1        
            //  2251: astore          14
            //  2253: aload           15
            //  2255: astore_1       
            //  2256: goto            2382
            //  2259: goto            2301
            //  2262: astore_1       
            //  2263: goto            2382
            //  2266: astore          15
            //  2268: aload           16
            //  2270: astore_1       
            //  2271: goto            2301
            //  2274: astore_1       
            //  2275: aload           15
            //  2277: astore          14
            //  2279: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //  2282: astore          17
            //  2284: aload           15
            //  2286: astore          14
            //  2288: aload           17
            //  2290: aload_1        
            //  2291: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //  2294: aload           15
            //  2296: astore          14
            //  2298: aload           17
            //  2300: athrow         
            //  2301: aload_1        
            //  2302: astore          14
            //  2304: ldc             "DownloadManager"
            //  2306: ldc_w           "Failed to load index."
            //  2309: aload           15
            //  2311: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  2314: aload_1        
            //  2315: astore          14
            //  2317: aload_0        
            //  2318: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  2321: invokevirtual   java/util/ArrayList.clear:()V
            //  2324: aload_1        
            //  2325: astore          14
            //  2327: aload           14
            //  2329: invokestatic    bd/c0.g:(Ljava/io/Closeable;)V
            //  2332: new             Ljava/util/ArrayList;
            //  2335: dup            
            //  2336: aload_0        
            //  2337: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  2340: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //  2343: astore_1       
            //  2344: aload_0        
            //  2345: getfield        zb/d$b.d:Landroid/os/Handler;
            //  2348: iconst_0       
            //  2349: aload_1        
            //  2350: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //  2353: invokevirtual   android/os/Message.sendToTarget:()V
            //  2356: aload_0        
            //  2357: invokevirtual   zb/d$b.g:()V
            //  2360: iconst_1       
            //  2361: istore_2       
            //  2362: aload_0        
            //  2363: getfield        zb/d$b.d:Landroid/os/Handler;
            //  2366: iconst_1       
            //  2367: iload_2        
            //  2368: aload_0        
            //  2369: getfield        zb/d$b.f:Ljava/util/HashMap;
            //  2372: invokevirtual   java/util/HashMap.size:()I
            //  2375: invokevirtual   android/os/Handler.obtainMessage:(III)Landroid/os/Message;
            //  2378: invokevirtual   android/os/Message.sendToTarget:()V
            //  2381: return         
            //  2382: aload           14
            //  2384: invokestatic    bd/c0.g:(Ljava/io/Closeable;)V
            //  2387: aload_1        
            //  2388: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                     
            //  -----  -----  -----  -----  -----------------------------------------
            //  138    148    151    160    Ljava/io/IOException;
            //  177    183    184    189    Any
            //  185    187    184    189    Any
            //  220    231    234    243    Ljava/io/IOException;
            //  670    697    744    754    Ljava/io/IOException;
            //  697    727    730    744    Landroid/database/sqlite/SQLiteException;
            //  697    727    744    754    Ljava/io/IOException;
            //  732    744    744    754    Ljava/io/IOException;
            //  900    912    915    926    Ljava/io/IOException;
            //  979    1009   1145   1156   Ljava/io/IOException;
            //  1009   1040   1128   1145   Landroid/database/sqlite/SQLiteException;
            //  1009   1040   1145   1156   Ljava/io/IOException;
            //  1040   1052   1145   1156   Ljava/io/IOException;
            //  1052   1092   1095   1128   Any
            //  1100   1105   1145   1156   Ljava/io/IOException;
            //  1108   1113   1116   1125   Any
            //  1118   1125   1145   1156   Ljava/io/IOException;
            //  1125   1128   1145   1156   Ljava/io/IOException;
            //  1130   1145   1145   1156   Ljava/io/IOException;
            //  1254   1264   1267   1276   Ljava/io/IOException;
            //  1856   1868   1930   1943   Ljava/io/IOException;
            //  1868   1913   1916   1930   Landroid/database/SQLException;
            //  1868   1913   1930   1943   Ljava/io/IOException;
            //  1918   1930   1930   1943   Ljava/io/IOException;
            //  1964   1977   1980   2021   Ljava/io/IOException;
            //  2078   2088   2266   2274   Ljava/io/IOException;
            //  2078   2088   2262   2266   Any
            //  2092   2101   2266   2274   Ljava/io/IOException;
            //  2092   2101   2262   2266   Any
            //  2105   2110   2266   2274   Ljava/io/IOException;
            //  2105   2110   2262   2266   Any
            //  2114   2142   2266   2274   Ljava/io/IOException;
            //  2114   2142   2262   2266   Any
            //  2146   2176   2274   2301   Landroid/database/sqlite/SQLiteException;
            //  2146   2176   2266   2274   Ljava/io/IOException;
            //  2146   2176   2262   2266   Any
            //  2180   2184   2266   2274   Ljava/io/IOException;
            //  2180   2184   2262   2266   Any
            //  2188   2194   2266   2274   Ljava/io/IOException;
            //  2188   2194   2262   2266   Any
            //  2194   2204   2245   2250   Ljava/io/IOException;
            //  2194   2204   2240   2245   Any
            //  2207   2237   2245   2250   Ljava/io/IOException;
            //  2207   2237   2240   2245   Any
            //  2279   2284   2266   2274   Ljava/io/IOException;
            //  2279   2284   2262   2266   Any
            //  2288   2294   2266   2274   Ljava/io/IOException;
            //  2288   2294   2262   2266   Any
            //  2298   2301   2266   2274   Ljava/io/IOException;
            //  2298   2301   2262   2266   Any
            //  2304   2314   2262   2266   Any
            //  2317   2324   2262   2266   Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_2194:
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
    
    public interface c
    {
    }
    
    public static final class d extends Thread implements f.a
    {
        public final DownloadRequest f;
        public final f g;
        public final e h;
        public final boolean i;
        public final int j;
        public volatile b k;
        public volatile boolean l;
        public Exception m;
        public long n;
        
        public d(final DownloadRequest f, final f g, final e h, final boolean i, final int j, final b k) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.n = -1L;
        }
        
        public final void a(final boolean b) {
            if (b) {
                this.k = null;
            }
            if (!this.l) {
                this.l = true;
                this.g.cancel();
                this.interrupt();
            }
        }
        
        public final void b(final long n, final long a, final float b) {
            this.h.a = a;
            this.h.b = b;
            if (n != this.n) {
                this.n = n;
                final b k = this.k;
                if (k != null) {
                    k.obtainMessage(10, (int)(n >> 32), (int)n, (Object)this).sendToTarget();
                }
            }
        }
        
        @Override
        public final void run() {
            try {
                if (this.i) {
                    this.g.remove();
                }
                else {
                    long n = -1L;
                    int n2 = 0;
                    while (!this.l) {
                        try {
                            this.g.a((f.a)this);
                        }
                        catch (final IOException ex) {
                            if (this.l) {
                                continue;
                            }
                            final long a = this.h.a;
                            long n3 = n;
                            if (a != n) {
                                n2 = 0;
                                n3 = a;
                            }
                            if (++n2 <= this.j) {
                                Thread.sleep(Math.min((n2 - 1) * 1000, 5000));
                                n = n3;
                                continue;
                            }
                            throw ex;
                        }
                    }
                }
            }
            catch (final Exception m) {
                this.m = m;
            }
            catch (final InterruptedException ex2) {
                Thread.currentThread().interrupt();
            }
            final b k = this.k;
            if (k != null) {
                k.obtainMessage(9, (Object)this).sendToTarget();
            }
        }
    }
}
