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
import bd.d0;
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
import sa.o;
import android.content.Context;
import ac.a;

public final class d
{
    public static final ac.a m;
    public final Context a;
    public final b b;
    public final o c;
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
        final o c3 = new o((Object)this, 3);
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
        public final HandlerThread a;
        public final p b;
        public final i c;
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
            this.b = (p)b;
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
                    wi.b.C("DownloadManager", s, (Throwable)ex);
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
            boolean b3 = true;
            d0.f(b2 != 3 && b2 != 4);
            final int c = this.c(b.a.f);
            if (c == -1) {
                this.e.add(b);
                Collections.sort(this.e, (Comparator<? super zb.b>)new d(2));
            }
            else {
                if (b.c == this.e.get(c).c) {
                    b3 = false;
                }
                this.e.set(c, b);
                if (b3) {
                    Collections.sort(this.e, new e(0));
                }
            }
            try {
                ((com.google.android.exoplayer2.offline.a)this.b).h(b);
            }
            catch (final IOException ex) {
                wi.b.C("DownloadManager", "Failed to update index.", (Throwable)ex);
            }
            this.d.obtainMessage(2, (Object)new a(b, false, new ArrayList((Collection<? extends E>)this.e), null)).sendToTarget();
        }
        
        public final zb.b e(zb.b a, final int n, final int n2) {
            d0.f(n != 3 && n != 4);
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
            int n;
            int n4;
            for (int i = n = 0; i < this.e.size(); ++i, n = n4) {
                final zb.b b = this.e.get(i);
                final d d = this.f.get(b.a.f);
                final int b2 = b.b;
                final int n2 = 1;
                boolean b3 = true;
                h.a a = null;
                Label_0501: {
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
                                d0.f(d.i ^ true);
                                if (this.h || this.g != 0) {
                                    b3 = false;
                                }
                                if (b3) {
                                    a = d;
                                    if (n < this.i) {
                                        break Label_0501;
                                    }
                                }
                                this.e(b, 0, 0);
                                d.a(false);
                                a = d;
                            }
                        }
                        else if ((a = d) != null) {
                            d0.f(d.i ^ true);
                            d.a(false);
                            a = d;
                        }
                    }
                    else if (d != null) {
                        d0.f(d.i ^ true);
                        d.a(false);
                        a = d;
                    }
                    else {
                        int n3;
                        if (!this.h && this.g == 0) {
                            n3 = n2;
                        }
                        else {
                            n3 = 0;
                        }
                        if (n3 != 0 && this.k < this.i) {
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
                n4 = n;
                if (a != null) {
                    n4 = n;
                    if (!((d)a).i) {
                        n4 = n + 1;
                    }
                }
            }
        }
        
        public final void handleMessage(final Message p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/os/Message.what:I
            //     4: istore_2       
            //     5: aconst_null    
            //     6: astore_3       
            //     7: aconst_null    
            //     8: astore          4
            //    10: iconst_0       
            //    11: istore          5
            //    13: iconst_0       
            //    14: istore          6
            //    16: iconst_0       
            //    17: istore          7
            //    19: iconst_0       
            //    20: istore          8
            //    22: iconst_0       
            //    23: istore          9
            //    25: iload_2        
            //    26: tableswitch {
            //                0: 2108
            //                1: 2085
            //                2: 2070
            //                3: 1835
            //                4: 1820
            //                5: 1809
            //                6: 1458
            //                7: 1377
            //                8: 986
            //                9: 394
            //               10: 262
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
            //   139: getfield        zb/d$b.b:Lzb/p;
            //   142: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   145: invokevirtual   com/google/android/exoplayer2/offline/a.j:()V
            //   148: goto            160
            //   151: astore_1       
            //   152: ldc             "DownloadManager"
            //   154: ldc             "Failed to update index."
            //   156: aload_1        
            //   157: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
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
            //   189: iload           9
            //   191: aload_0        
            //   192: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   195: invokevirtual   java/util/ArrayList.size:()I
            //   198: if_icmpge       251
            //   201: aload_0        
            //   202: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   205: iload           9
            //   207: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //   210: checkcast       Lzb/b;
            //   213: astore_1       
            //   214: aload_1        
            //   215: getfield        zb/b.b:I
            //   218: iconst_2       
            //   219: if_icmpne       245
            //   222: aload_0        
            //   223: getfield        zb/d$b.b:Lzb/p;
            //   226: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   229: aload_1        
            //   230: invokevirtual   com/google/android/exoplayer2/offline/a.h:(Lzb/b;)V
            //   233: goto            245
            //   236: astore_1       
            //   237: ldc             "DownloadManager"
            //   239: ldc             "Failed to update index."
            //   241: aload_1        
            //   242: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   245: iinc            9, 1
            //   248: goto            189
            //   251: aload_0        
            //   252: bipush          11
            //   254: ldc2_w          5000
            //   257: invokevirtual   android/os/Handler.sendEmptyMessageDelayed:(IJ)Z
            //   260: pop            
            //   261: return         
            //   262: aload_1        
            //   263: getfield        android/os/Message.obj:Ljava/lang/Object;
            //   266: checkcast       Lzb/d$d;
            //   269: astore          10
            //   271: aload_1        
            //   272: getfield        android/os/Message.arg1:I
            //   275: istore          5
            //   277: aload_1        
            //   278: getfield        android/os/Message.arg2:I
            //   281: istore          8
            //   283: getstatic       bd/c0.a:I
            //   286: istore          9
            //   288: iload           5
            //   290: i2l            
            //   291: lstore          11
            //   293: ldc2_w          4294967295
            //   296: iload           8
            //   298: i2l            
            //   299: land           
            //   300: lload           11
            //   302: ldc2_w          4294967295
            //   305: land           
            //   306: bipush          32
            //   308: lshl           
            //   309: lor            
            //   310: lstore          11
            //   312: aload_0        
            //   313: aload           10
            //   315: getfield        zb/d$d.f:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   318: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   321: iconst_0       
            //   322: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //   325: astore_1       
            //   326: aload_1        
            //   327: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   330: pop            
            //   331: lload           11
            //   333: aload_1        
            //   334: getfield        zb/b.e:J
            //   337: lcmp           
            //   338: ifeq            393
            //   341: lload           11
            //   343: ldc2_w          -1
            //   346: lcmp           
            //   347: ifne            353
            //   350: goto            393
            //   353: aload_0        
            //   354: new             Lzb/b;
            //   357: dup            
            //   358: aload_1        
            //   359: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   362: aload_1        
            //   363: getfield        zb/b.b:I
            //   366: aload_1        
            //   367: getfield        zb/b.c:J
            //   370: invokestatic    java/lang/System.currentTimeMillis:()J
            //   373: lload           11
            //   375: aload_1        
            //   376: getfield        zb/b.f:I
            //   379: aload_1        
            //   380: getfield        zb/b.g:I
            //   383: aload_1        
            //   384: getfield        zb/b.h:Lzb/g;
            //   387: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJJIILzb/g;)V
            //   390: invokevirtual   zb/d$b.d:(Lzb/b;)V
            //   393: return         
            //   394: aload_1        
            //   395: getfield        android/os/Message.obj:Ljava/lang/Object;
            //   398: checkcast       Lzb/d$d;
            //   401: astore          4
            //   403: aload           4
            //   405: getfield        zb/d$d.f:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   408: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   411: astore_1       
            //   412: aload_0        
            //   413: getfield        zb/d$b.f:Ljava/util/HashMap;
            //   416: aload_1        
            //   417: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
            //   420: pop            
            //   421: aload           4
            //   423: getfield        zb/d$d.i:Z
            //   426: istore          7
            //   428: iload           7
            //   430: ifne            458
            //   433: aload_0        
            //   434: getfield        zb/d$b.k:I
            //   437: iconst_1       
            //   438: isub           
            //   439: istore          9
            //   441: aload_0        
            //   442: iload           9
            //   444: putfield        zb/d$b.k:I
            //   447: iload           9
            //   449: ifne            458
            //   452: aload_0        
            //   453: bipush          11
            //   455: invokevirtual   android/os/Handler.removeMessages:(I)V
            //   458: aload           4
            //   460: getfield        zb/d$d.l:Z
            //   463: ifeq            477
            //   466: aload_0        
            //   467: invokevirtual   zb/d$b.g:()V
            //   470: iload           8
            //   472: istore          9
            //   474: goto            2404
            //   477: aload           4
            //   479: getfield        zb/d$d.m:Ljava/lang/Exception;
            //   482: astore          10
            //   484: aload           10
            //   486: ifnull          556
            //   489: aload           4
            //   491: getfield        zb/d$d.f:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   494: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
            //   497: astore          4
            //   499: new             Ljava/lang/StringBuilder;
            //   502: dup            
            //   503: aload           4
            //   505: invokevirtual   java/lang/String.length:()I
            //   508: bipush          20
            //   510: iadd           
            //   511: invokespecial   java/lang/StringBuilder.<init>:(I)V
            //   514: astore_3       
            //   515: aload_3        
            //   516: ldc_w           "Task failed: "
            //   519: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   522: pop            
            //   523: aload_3        
            //   524: aload           4
            //   526: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   529: pop            
            //   530: aload_3        
            //   531: ldc_w           ", "
            //   534: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   537: pop            
            //   538: aload_3        
            //   539: iload           7
            //   541: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
            //   544: pop            
            //   545: ldc             "DownloadManager"
            //   547: aload_3        
            //   548: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   551: aload           10
            //   553: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   556: aload_0        
            //   557: aload_1        
            //   558: iconst_0       
            //   559: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //   562: astore_1       
            //   563: aload_1        
            //   564: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   567: pop            
            //   568: aload_1        
            //   569: getfield        zb/b.b:I
            //   572: istore          9
            //   574: iload           9
            //   576: iconst_2       
            //   577: if_icmpeq       804
            //   580: iload           9
            //   582: iconst_5       
            //   583: if_icmpeq       604
            //   586: iload           9
            //   588: bipush          7
            //   590: if_icmpne       596
            //   593: goto            604
            //   596: new             Ljava/lang/IllegalStateException;
            //   599: dup            
            //   600: invokespecial   java/lang/IllegalStateException.<init>:()V
            //   603: athrow         
            //   604: iload           7
            //   606: invokestatic    bd/d0.f:(Z)V
            //   609: aload_1        
            //   610: getfield        zb/b.b:I
            //   613: bipush          7
            //   615: if_icmpne       655
            //   618: aload_1        
            //   619: getfield        zb/b.f:I
            //   622: istore          5
            //   624: iload           5
            //   626: ifne            635
            //   629: iconst_0       
            //   630: istore          9
            //   632: goto            638
            //   635: iconst_1       
            //   636: istore          9
            //   638: aload_0        
            //   639: aload_1        
            //   640: iload           9
            //   642: iload           5
            //   644: invokevirtual   zb/d$b.e:(Lzb/b;II)Lzb/b;
            //   647: pop            
            //   648: aload_0        
            //   649: invokevirtual   zb/d$b.g:()V
            //   652: goto            975
            //   655: aload_0        
            //   656: aload_1        
            //   657: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   660: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   663: invokevirtual   zb/d$b.c:(Ljava/lang/String;)I
            //   666: istore          9
            //   668: aload_0        
            //   669: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   672: iload           9
            //   674: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
            //   677: pop            
            //   678: aload_0        
            //   679: getfield        zb/d$b.b:Lzb/p;
            //   682: astore          4
            //   684: aload_1        
            //   685: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   688: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   691: astore          10
            //   693: aload           4
            //   695: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   698: astore          4
            //   700: aload           4
            //   702: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //   705: aload           4
            //   707: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //   710: invokeinterface za/a.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //   715: aload           4
            //   717: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //   720: ldc_w           "id = ?"
            //   723: iconst_1       
            //   724: anewarray       Ljava/lang/String;
            //   727: dup            
            //   728: iconst_0       
            //   729: aload           10
            //   731: aastore        
            //   732: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
            //   735: pop            
            //   736: goto            767
            //   739: astore          4
            //   741: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //   744: astore          10
            //   746: aload           10
            //   748: aload           4
            //   750: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //   753: aload           10
            //   755: athrow         
            //   756: astore          10
            //   758: ldc             "DownloadManager"
            //   760: ldc_w           "Failed to remove from database"
            //   763: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
            //   766: pop            
            //   767: new             Lzb/d$a;
            //   770: dup            
            //   771: aload_1        
            //   772: iconst_1       
            //   773: new             Ljava/util/ArrayList;
            //   776: dup            
            //   777: aload_0        
            //   778: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   781: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //   784: aconst_null    
            //   785: invokespecial   zb/d$a.<init>:(Lzb/b;ZLjava/util/ArrayList;Ljava/lang/Exception;)V
            //   788: astore_1       
            //   789: aload_0        
            //   790: getfield        zb/d$b.d:Landroid/os/Handler;
            //   793: iconst_2       
            //   794: aload_1        
            //   795: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //   798: invokevirtual   android/os/Message.sendToTarget:()V
            //   801: goto            975
            //   804: iload           7
            //   806: iconst_1       
            //   807: ixor           
            //   808: invokestatic    bd/d0.f:(Z)V
            //   811: aload_1        
            //   812: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   815: astore          4
            //   817: aload           10
            //   819: ifnonnull       828
            //   822: iconst_3       
            //   823: istore          9
            //   825: goto            831
            //   828: iconst_4       
            //   829: istore          9
            //   831: aload_1        
            //   832: getfield        zb/b.c:J
            //   835: lstore          13
            //   837: invokestatic    java/lang/System.currentTimeMillis:()J
            //   840: lstore          15
            //   842: aload_1        
            //   843: getfield        zb/b.e:J
            //   846: lstore          11
            //   848: aload_1        
            //   849: getfield        zb/b.f:I
            //   852: istore          6
            //   854: aload           10
            //   856: ifnonnull       865
            //   859: iconst_0       
            //   860: istore          5
            //   862: goto            868
            //   865: iconst_1       
            //   866: istore          5
            //   868: new             Lzb/b;
            //   871: dup            
            //   872: aload           4
            //   874: iload           9
            //   876: lload           13
            //   878: lload           15
            //   880: lload           11
            //   882: iload           6
            //   884: iload           5
            //   886: aload_1        
            //   887: getfield        zb/b.h:Lzb/g;
            //   890: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJJIILzb/g;)V
            //   893: astore          4
            //   895: aload_0        
            //   896: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   899: aload_0        
            //   900: aload           4
            //   902: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //   905: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //   908: invokevirtual   zb/d$b.c:(Ljava/lang/String;)I
            //   911: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
            //   914: pop            
            //   915: aload_0        
            //   916: getfield        zb/d$b.b:Lzb/p;
            //   919: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //   922: aload           4
            //   924: invokevirtual   com/google/android/exoplayer2/offline/a.h:(Lzb/b;)V
            //   927: goto            939
            //   930: astore_1       
            //   931: ldc             "DownloadManager"
            //   933: ldc             "Failed to update index."
            //   935: aload_1        
            //   936: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   939: new             Lzb/d$a;
            //   942: dup            
            //   943: aload           4
            //   945: iconst_0       
            //   946: new             Ljava/util/ArrayList;
            //   949: dup            
            //   950: aload_0        
            //   951: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //   954: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //   957: aload           10
            //   959: invokespecial   zb/d$a.<init>:(Lzb/b;ZLjava/util/ArrayList;Ljava/lang/Exception;)V
            //   962: astore_1       
            //   963: aload_0        
            //   964: getfield        zb/d$b.d:Landroid/os/Handler;
            //   967: iconst_2       
            //   968: aload_1        
            //   969: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //   972: invokevirtual   android/os/Message.sendToTarget:()V
            //   975: aload_0        
            //   976: invokevirtual   zb/d$b.g:()V
            //   979: iload           8
            //   981: istore          9
            //   983: goto            2404
            //   986: new             Ljava/util/ArrayList;
            //   989: dup            
            //   990: invokespecial   java/util/ArrayList.<init>:()V
            //   993: astore_1       
            //   994: aload_0        
            //   995: getfield        zb/d$b.b:Lzb/p;
            //   998: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  1001: astore          10
            //  1003: aload           10
            //  1005: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //  1008: iconst_2       
            //  1009: newarray        I
            //  1011: dup            
            //  1012: iconst_0       
            //  1013: iconst_3       
            //  1014: iastore        
            //  1015: dup            
            //  1016: iconst_1       
            //  1017: iconst_4       
            //  1018: iastore        
            //  1019: invokestatic    com/google/android/exoplayer2/offline/a.f:([I)Ljava/lang/String;
            //  1022: astore          4
            //  1024: aload           10
            //  1026: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //  1029: invokeinterface za/a.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //  1034: aload           10
            //  1036: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //  1039: getstatic       com/google/android/exoplayer2/offline/a.f:[Ljava/lang/String;
            //  1042: aload           4
            //  1044: aconst_null    
            //  1045: aconst_null    
            //  1046: aconst_null    
            //  1047: ldc_w           "start_time_ms ASC"
            //  1050: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
            //  1053: astore          4
            //  1055: new             Lcom/google/android/exoplayer2/offline/a$a;
            //  1058: astore          10
            //  1060: aload           10
            //  1062: aload           4
            //  1064: invokespecial   com/google/android/exoplayer2/offline/a$a.<init>:(Landroid/database/Cursor;)V
            //  1067: aload           10
            //  1069: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  1072: invokeinterface android/database/Cursor.getPosition:()I
            //  1077: istore          9
            //  1079: aload           10
            //  1081: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  1084: iload           9
            //  1086: iconst_1       
            //  1087: iadd           
            //  1088: invokeinterface android/database/Cursor.moveToPosition:(I)Z
            //  1093: ifeq            1117
            //  1096: aload_1        
            //  1097: aload           10
            //  1099: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  1102: invokestatic    com/google/android/exoplayer2/offline/a.d:(Landroid/database/Cursor;)Lzb/b;
            //  1105: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  1108: pop            
            //  1109: goto            1067
            //  1112: astore          4
            //  1114: goto            1125
            //  1117: aload           10
            //  1119: invokevirtual   com/google/android/exoplayer2/offline/a$a.close:()V
            //  1122: goto            1173
            //  1125: aload           10
            //  1127: invokevirtual   com/google/android/exoplayer2/offline/a$a.close:()V
            //  1130: goto            1142
            //  1133: astore          10
            //  1135: aload           4
            //  1137: aload           10
            //  1139: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
            //  1142: aload           4
            //  1144: athrow         
            //  1145: astore          4
            //  1147: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //  1150: astore          10
            //  1152: aload           10
            //  1154: aload           4
            //  1156: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //  1159: aload           10
            //  1161: athrow         
            //  1162: astore          10
            //  1164: ldc             "DownloadManager"
            //  1166: ldc_w           "Failed to load downloads."
            //  1169: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
            //  1172: pop            
            //  1173: iconst_0       
            //  1174: istore          9
            //  1176: iload           9
            //  1178: aload_0        
            //  1179: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1182: invokevirtual   java/util/ArrayList.size:()I
            //  1185: if_icmpge       1223
            //  1188: aload_0        
            //  1189: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1192: astore          10
            //  1194: aload           10
            //  1196: iload           9
            //  1198: aload           10
            //  1200: iload           9
            //  1202: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1205: checkcast       Lzb/b;
            //  1208: iconst_5       
            //  1209: iconst_0       
            //  1210: invokestatic    zb/d$b.a:(Lzb/b;II)Lzb/b;
            //  1213: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
            //  1216: pop            
            //  1217: iinc            9, 1
            //  1220: goto            1176
            //  1223: iconst_0       
            //  1224: istore          9
            //  1226: iload           9
            //  1228: aload_1        
            //  1229: invokevirtual   java/util/ArrayList.size:()I
            //  1232: if_icmpge       1263
            //  1235: aload_0        
            //  1236: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1239: aload_1        
            //  1240: iload           9
            //  1242: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1245: checkcast       Lzb/b;
            //  1248: iconst_5       
            //  1249: iconst_0       
            //  1250: invokestatic    zb/d$b.a:(Lzb/b;II)Lzb/b;
            //  1253: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  1256: pop            
            //  1257: iinc            9, 1
            //  1260: goto            1226
            //  1263: aload_0        
            //  1264: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1267: new             Lzb/f;
            //  1270: dup            
            //  1271: iconst_0       
            //  1272: invokespecial   zb/f.<init>:(I)V
            //  1275: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
            //  1278: aload_0        
            //  1279: getfield        zb/d$b.b:Lzb/p;
            //  1282: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  1285: invokevirtual   com/google/android/exoplayer2/offline/a.k:()V
            //  1288: goto            1300
            //  1291: astore_1       
            //  1292: ldc             "DownloadManager"
            //  1294: ldc             "Failed to update index."
            //  1296: aload_1        
            //  1297: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  1300: new             Ljava/util/ArrayList;
            //  1303: dup            
            //  1304: aload_0        
            //  1305: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1308: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //  1311: astore          10
            //  1313: iconst_0       
            //  1314: istore          9
            //  1316: iload           9
            //  1318: aload_0        
            //  1319: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1322: invokevirtual   java/util/ArrayList.size:()I
            //  1325: if_icmpge       1370
            //  1328: new             Lzb/d$a;
            //  1331: dup            
            //  1332: aload_0        
            //  1333: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1336: iload           9
            //  1338: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1341: checkcast       Lzb/b;
            //  1344: iconst_0       
            //  1345: aload           10
            //  1347: aconst_null    
            //  1348: invokespecial   zb/d$a.<init>:(Lzb/b;ZLjava/util/ArrayList;Ljava/lang/Exception;)V
            //  1351: astore_1       
            //  1352: aload_0        
            //  1353: getfield        zb/d$b.d:Landroid/os/Handler;
            //  1356: iconst_2       
            //  1357: aload_1        
            //  1358: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //  1361: invokevirtual   android/os/Message.sendToTarget:()V
            //  1364: iinc            9, 1
            //  1367: goto            1316
            //  1370: aload_0        
            //  1371: invokevirtual   zb/d$b.g:()V
            //  1374: goto            2401
            //  1377: aload_1        
            //  1378: getfield        android/os/Message.obj:Ljava/lang/Object;
            //  1381: checkcast       Ljava/lang/String;
            //  1384: astore_1       
            //  1385: aload_0        
            //  1386: aload_1        
            //  1387: iconst_1       
            //  1388: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //  1391: astore          10
            //  1393: aload           10
            //  1395: ifnonnull       1442
            //  1398: aload_1        
            //  1399: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
            //  1402: astore_1       
            //  1403: aload_1        
            //  1404: invokevirtual   java/lang/String.length:()I
            //  1407: ifeq            1421
            //  1410: ldc_w           "Failed to remove nonexistent download: "
            //  1413: aload_1        
            //  1414: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
            //  1417: astore_1       
            //  1418: goto            1432
            //  1421: new             Ljava/lang/String;
            //  1424: dup            
            //  1425: ldc_w           "Failed to remove nonexistent download: "
            //  1428: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
            //  1431: astore_1       
            //  1432: ldc             "DownloadManager"
            //  1434: aload_1        
            //  1435: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
            //  1438: pop            
            //  1439: goto            2401
            //  1442: aload_0        
            //  1443: aload           10
            //  1445: iconst_5       
            //  1446: iconst_0       
            //  1447: invokevirtual   zb/d$b.e:(Lzb/b;II)Lzb/b;
            //  1450: pop            
            //  1451: aload_0        
            //  1452: invokevirtual   zb/d$b.g:()V
            //  1455: goto            2401
            //  1458: aload_1        
            //  1459: getfield        android/os/Message.obj:Ljava/lang/Object;
            //  1462: checkcast       Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //  1465: astore          4
            //  1467: aload_1        
            //  1468: getfield        android/os/Message.arg1:I
            //  1471: istore          8
            //  1473: aload_0        
            //  1474: aload           4
            //  1476: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1479: iconst_1       
            //  1480: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //  1483: astore_1       
            //  1484: invokestatic    java/lang/System.currentTimeMillis:()J
            //  1487: lstore          15
            //  1489: aload_1        
            //  1490: ifnull          1767
            //  1493: aload_1        
            //  1494: getfield        zb/b.b:I
            //  1497: istore          6
            //  1499: iload           6
            //  1501: iconst_5       
            //  1502: if_icmpeq       1546
            //  1505: iload           6
            //  1507: iconst_3       
            //  1508: if_icmpeq       1526
            //  1511: iload           6
            //  1513: iconst_4       
            //  1514: if_icmpne       1520
            //  1517: goto            1526
            //  1520: iconst_0       
            //  1521: istore          9
            //  1523: goto            1529
            //  1526: iconst_1       
            //  1527: istore          9
            //  1529: iload           9
            //  1531: ifeq            1537
            //  1534: goto            1546
            //  1537: aload_1        
            //  1538: getfield        zb/b.c:J
            //  1541: lstore          11
            //  1543: goto            1550
            //  1546: lload           15
            //  1548: lstore          11
            //  1550: iload           6
            //  1552: iconst_5       
            //  1553: if_icmpeq       1583
            //  1556: iload           6
            //  1558: bipush          7
            //  1560: if_icmpne       1566
            //  1563: goto            1583
            //  1566: iload           8
            //  1568: ifeq            1577
            //  1571: iconst_1       
            //  1572: istore          9
            //  1574: goto            1587
            //  1577: iconst_0       
            //  1578: istore          9
            //  1580: goto            1587
            //  1583: bipush          7
            //  1585: istore          9
            //  1587: aload_1        
            //  1588: getfield        zb/b.a:Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //  1591: astore_3       
            //  1592: aload_3        
            //  1593: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1596: aload           4
            //  1598: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1601: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //  1604: invokestatic    bd/d0.c:(Z)V
            //  1607: aload_3        
            //  1608: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1611: invokeinterface java/util/List.isEmpty:()Z
            //  1616: ifne            1704
            //  1619: aload           4
            //  1621: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1624: invokeinterface java/util/List.isEmpty:()Z
            //  1629: ifeq            1635
            //  1632: goto            1704
            //  1635: new             Ljava/util/ArrayList;
            //  1638: dup            
            //  1639: aload_3        
            //  1640: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1643: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //  1646: astore          10
            //  1648: aload           10
            //  1650: astore_1       
            //  1651: iload           5
            //  1653: aload           4
            //  1655: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1658: invokeinterface java/util/List.size:()I
            //  1663: if_icmpge       1708
            //  1666: aload           4
            //  1668: getfield        com/google/android/exoplayer2/offline/DownloadRequest.i:Ljava/util/List;
            //  1671: iload           5
            //  1673: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
            //  1678: checkcast       Lzb/o;
            //  1681: astore_1       
            //  1682: aload           10
            //  1684: aload_1        
            //  1685: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
            //  1688: ifne            1698
            //  1691: aload           10
            //  1693: aload_1        
            //  1694: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  1697: pop            
            //  1698: iinc            5, 1
            //  1701: goto            1648
            //  1704: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
            //  1707: astore_1       
            //  1708: aload_0        
            //  1709: new             Lzb/b;
            //  1712: dup            
            //  1713: new             Lcom/google/android/exoplayer2/offline/DownloadRequest;
            //  1716: dup            
            //  1717: aload_3        
            //  1718: getfield        com/google/android/exoplayer2/offline/DownloadRequest.f:Ljava/lang/String;
            //  1721: aload           4
            //  1723: getfield        com/google/android/exoplayer2/offline/DownloadRequest.g:Landroid/net/Uri;
            //  1726: aload           4
            //  1728: getfield        com/google/android/exoplayer2/offline/DownloadRequest.h:Ljava/lang/String;
            //  1731: aload_1        
            //  1732: aload           4
            //  1734: getfield        com/google/android/exoplayer2/offline/DownloadRequest.j:[B
            //  1737: aload           4
            //  1739: getfield        com/google/android/exoplayer2/offline/DownloadRequest.k:Ljava/lang/String;
            //  1742: aload           4
            //  1744: getfield        com/google/android/exoplayer2/offline/DownloadRequest.l:[B
            //  1747: invokespecial   com/google/android/exoplayer2/offline/DownloadRequest.<init>:(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;[BLjava/lang/String;[B)V
            //  1750: iload           9
            //  1752: lload           11
            //  1754: lload           15
            //  1756: iload           8
            //  1758: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJI)V
            //  1761: invokevirtual   zb/d$b.d:(Lzb/b;)V
            //  1764: goto            1802
            //  1767: iload           8
            //  1769: ifeq            1778
            //  1772: iconst_1       
            //  1773: istore          9
            //  1775: goto            1781
            //  1778: iconst_0       
            //  1779: istore          9
            //  1781: aload_0        
            //  1782: new             Lzb/b;
            //  1785: dup            
            //  1786: aload           4
            //  1788: iload           9
            //  1790: lload           15
            //  1792: lload           15
            //  1794: iload           8
            //  1796: invokespecial   zb/b.<init>:(Lcom/google/android/exoplayer2/offline/DownloadRequest;IJJI)V
            //  1799: invokevirtual   zb/d$b.d:(Lzb/b;)V
            //  1802: aload_0        
            //  1803: invokevirtual   zb/d$b.g:()V
            //  1806: goto            2401
            //  1809: aload_0        
            //  1810: aload_1        
            //  1811: getfield        android/os/Message.arg1:I
            //  1814: putfield        zb/d$b.j:I
            //  1817: goto            2401
            //  1820: aload_0        
            //  1821: aload_1        
            //  1822: getfield        android/os/Message.arg1:I
            //  1825: putfield        zb/d$b.i:I
            //  1828: aload_0        
            //  1829: invokevirtual   zb/d$b.g:()V
            //  1832: goto            2401
            //  1835: aload_1        
            //  1836: getfield        android/os/Message.obj:Ljava/lang/Object;
            //  1839: checkcast       Ljava/lang/String;
            //  1842: astore          4
            //  1844: aload_1        
            //  1845: getfield        android/os/Message.arg1:I
            //  1848: istore          5
            //  1850: aload           4
            //  1852: ifnonnull       1983
            //  1855: iload           6
            //  1857: istore          9
            //  1859: iload           9
            //  1861: aload_0        
            //  1862: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1865: invokevirtual   java/util/ArrayList.size:()I
            //  1868: if_icmpge       1895
            //  1871: aload_0        
            //  1872: aload_0        
            //  1873: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  1876: iload           9
            //  1878: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
            //  1881: checkcast       Lzb/b;
            //  1884: iload           5
            //  1886: invokevirtual   zb/d$b.f:(Lzb/b;I)V
            //  1889: iinc            9, 1
            //  1892: goto            1859
            //  1895: aload_0        
            //  1896: getfield        zb/d$b.b:Lzb/p;
            //  1899: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  1902: astore_1       
            //  1903: aload_1        
            //  1904: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //  1907: new             Landroid/content/ContentValues;
            //  1910: astore          10
            //  1912: aload           10
            //  1914: invokespecial   android/content/ContentValues.<init>:()V
            //  1917: aload           10
            //  1919: ldc_w           "stop_reason"
            //  1922: iload           5
            //  1924: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1927: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
            //  1930: aload_1        
            //  1931: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //  1934: invokeinterface za/a.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //  1939: aload_1        
            //  1940: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //  1943: aload           10
            //  1945: getstatic       com/google/android/exoplayer2/offline/a.e:Ljava/lang/String;
            //  1948: aconst_null    
            //  1949: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
            //  1952: pop            
            //  1953: goto            2063
            //  1956: astore          10
            //  1958: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //  1961: astore_1       
            //  1962: aload_1        
            //  1963: aload           10
            //  1965: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //  1968: aload_1        
            //  1969: athrow         
            //  1970: astore_1       
            //  1971: ldc             "DownloadManager"
            //  1973: ldc_w           "Failed to set manual stop reason"
            //  1976: aload_1        
            //  1977: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  1980: goto            2063
            //  1983: aload_0        
            //  1984: aload           4
            //  1986: iconst_0       
            //  1987: invokevirtual   zb/d$b.b:(Ljava/lang/String;Z)Lzb/b;
            //  1990: astore_1       
            //  1991: aload_1        
            //  1992: ifnull          2005
            //  1995: aload_0        
            //  1996: aload_1        
            //  1997: iload           5
            //  1999: invokevirtual   zb/d$b.f:(Lzb/b;I)V
            //  2002: goto            2063
            //  2005: aload_0        
            //  2006: getfield        zb/d$b.b:Lzb/p;
            //  2009: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  2012: iload           5
            //  2014: aload           4
            //  2016: invokevirtual   com/google/android/exoplayer2/offline/a.l:(ILjava/lang/String;)V
            //  2019: goto            2063
            //  2022: astore          10
            //  2024: aload           4
            //  2026: invokevirtual   java/lang/String.length:()I
            //  2029: ifeq            2044
            //  2032: ldc_w           "Failed to set manual stop reason: "
            //  2035: aload           4
            //  2037: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
            //  2040: astore_1       
            //  2041: goto            2055
            //  2044: new             Ljava/lang/String;
            //  2047: dup            
            //  2048: ldc_w           "Failed to set manual stop reason: "
            //  2051: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
            //  2054: astore_1       
            //  2055: ldc             "DownloadManager"
            //  2057: aload_1        
            //  2058: aload           10
            //  2060: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  2063: aload_0        
            //  2064: invokevirtual   zb/d$b.g:()V
            //  2067: goto            2401
            //  2070: aload_0        
            //  2071: aload_1        
            //  2072: getfield        android/os/Message.arg1:I
            //  2075: putfield        zb/d$b.g:I
            //  2078: aload_0        
            //  2079: invokevirtual   zb/d$b.g:()V
            //  2082: goto            2401
            //  2085: aload_1        
            //  2086: getfield        android/os/Message.arg1:I
            //  2089: ifeq            2095
            //  2092: iconst_1       
            //  2093: istore          7
            //  2095: aload_0        
            //  2096: iload           7
            //  2098: putfield        zb/d$b.h:Z
            //  2101: aload_0        
            //  2102: invokevirtual   zb/d$b.g:()V
            //  2105: goto            2401
            //  2108: aload_0        
            //  2109: aload_1        
            //  2110: getfield        android/os/Message.arg1:I
            //  2113: putfield        zb/d$b.g:I
            //  2116: aload           4
            //  2118: astore          10
            //  2120: aload_0        
            //  2121: getfield        zb/d$b.b:Lzb/p;
            //  2124: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  2127: invokevirtual   com/google/android/exoplayer2/offline/a.j:()V
            //  2130: aload           4
            //  2132: astore          10
            //  2134: aload_0        
            //  2135: getfield        zb/d$b.b:Lzb/p;
            //  2138: checkcast       Lcom/google/android/exoplayer2/offline/a;
            //  2141: astore_1       
            //  2142: aload           4
            //  2144: astore          10
            //  2146: aload_1        
            //  2147: invokevirtual   com/google/android/exoplayer2/offline/a.b:()V
            //  2150: aload           4
            //  2152: astore          10
            //  2154: iconst_5       
            //  2155: newarray        I
            //  2157: dup            
            //  2158: iconst_0       
            //  2159: iconst_0       
            //  2160: iastore        
            //  2161: dup            
            //  2162: iconst_1       
            //  2163: iconst_1       
            //  2164: iastore        
            //  2165: dup            
            //  2166: iconst_2       
            //  2167: iconst_2       
            //  2168: iastore        
            //  2169: dup            
            //  2170: iconst_3       
            //  2171: iconst_5       
            //  2172: iastore        
            //  2173: dup            
            //  2174: iconst_4       
            //  2175: bipush          7
            //  2177: iastore        
            //  2178: invokestatic    com/google/android/exoplayer2/offline/a.f:([I)Ljava/lang/String;
            //  2181: astore          17
            //  2183: aload           4
            //  2185: astore          10
            //  2187: aload_1        
            //  2188: getfield        com/google/android/exoplayer2/offline/a.b:Lza/a;
            //  2191: invokeinterface za/a.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
            //  2196: aload_1        
            //  2197: getfield        com/google/android/exoplayer2/offline/a.a:Ljava/lang/String;
            //  2200: getstatic       com/google/android/exoplayer2/offline/a.f:[Ljava/lang/String;
            //  2203: aload           17
            //  2205: aconst_null    
            //  2206: aconst_null    
            //  2207: aconst_null    
            //  2208: ldc_w           "start_time_ms ASC"
            //  2211: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
            //  2214: astore          17
            //  2216: aload           4
            //  2218: astore          10
            //  2220: new             Lcom/google/android/exoplayer2/offline/a$a;
            //  2223: astore_1       
            //  2224: aload           4
            //  2226: astore          10
            //  2228: aload_1        
            //  2229: aload           17
            //  2231: invokespecial   com/google/android/exoplayer2/offline/a$a.<init>:(Landroid/database/Cursor;)V
            //  2234: aload_1        
            //  2235: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  2238: invokeinterface android/database/Cursor.getPosition:()I
            //  2243: istore          9
            //  2245: aload_1        
            //  2246: astore          10
            //  2248: aload_1        
            //  2249: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  2252: iload           9
            //  2254: iconst_1       
            //  2255: iadd           
            //  2256: invokeinterface android/database/Cursor.moveToPosition:(I)Z
            //  2261: ifeq            2368
            //  2264: aload_0        
            //  2265: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  2268: aload_1        
            //  2269: getfield        com/google/android/exoplayer2/offline/a$a.f:Landroid/database/Cursor;
            //  2272: invokestatic    com/google/android/exoplayer2/offline/a.d:(Landroid/database/Cursor;)Lzb/b;
            //  2275: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
            //  2278: pop            
            //  2279: goto            2234
            //  2282: astore          4
            //  2284: goto            2292
            //  2287: astore          4
            //  2289: goto            2301
            //  2292: aload_1        
            //  2293: astore          10
            //  2295: aload           4
            //  2297: astore_1       
            //  2298: goto            2425
            //  2301: goto            2342
            //  2304: astore_1       
            //  2305: goto            2425
            //  2308: astore          4
            //  2310: aload_3        
            //  2311: astore_1       
            //  2312: goto            2342
            //  2315: astore_1       
            //  2316: aload           4
            //  2318: astore          10
            //  2320: new             Lcom/google/android/exoplayer2/database/DatabaseIOException;
            //  2323: astore          17
            //  2325: aload           4
            //  2327: astore          10
            //  2329: aload           17
            //  2331: aload_1        
            //  2332: invokespecial   com/google/android/exoplayer2/database/DatabaseIOException.<init>:(Landroid/database/SQLException;)V
            //  2335: aload           4
            //  2337: astore          10
            //  2339: aload           17
            //  2341: athrow         
            //  2342: aload_1        
            //  2343: astore          10
            //  2345: ldc             "DownloadManager"
            //  2347: ldc_w           "Failed to load index."
            //  2350: aload           4
            //  2352: invokestatic    wi/b.C:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //  2355: aload_1        
            //  2356: astore          10
            //  2358: aload_0        
            //  2359: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  2362: invokevirtual   java/util/ArrayList.clear:()V
            //  2365: aload_1        
            //  2366: astore          10
            //  2368: aload           10
            //  2370: invokestatic    bd/c0.g:(Ljava/io/Closeable;)V
            //  2373: new             Ljava/util/ArrayList;
            //  2376: dup            
            //  2377: aload_0        
            //  2378: getfield        zb/d$b.e:Ljava/util/ArrayList;
            //  2381: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
            //  2384: astore_1       
            //  2385: aload_0        
            //  2386: getfield        zb/d$b.d:Landroid/os/Handler;
            //  2389: iconst_0       
            //  2390: aload_1        
            //  2391: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //  2394: invokevirtual   android/os/Message.sendToTarget:()V
            //  2397: aload_0        
            //  2398: invokevirtual   zb/d$b.g:()V
            //  2401: iconst_1       
            //  2402: istore          9
            //  2404: aload_0        
            //  2405: getfield        zb/d$b.d:Landroid/os/Handler;
            //  2408: iconst_1       
            //  2409: iload           9
            //  2411: aload_0        
            //  2412: getfield        zb/d$b.f:Ljava/util/HashMap;
            //  2415: invokevirtual   java/util/HashMap.size:()I
            //  2418: invokevirtual   android/os/Handler.obtainMessage:(III)Landroid/os/Message;
            //  2421: invokevirtual   android/os/Message.sendToTarget:()V
            //  2424: return         
            //  2425: aload           10
            //  2427: invokestatic    bd/c0.g:(Ljava/io/Closeable;)V
            //  2430: aload_1        
            //  2431: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                     
            //  -----  -----  -----  -----  -----------------------------------------
            //  138    148    151    160    Ljava/io/IOException;
            //  177    183    184    189    Any
            //  185    187    184    189    Any
            //  222    233    236    245    Ljava/io/IOException;
            //  678    705    756    767    Ljava/io/IOException;
            //  705    736    739    756    Landroid/database/sqlite/SQLiteException;
            //  705    736    756    767    Ljava/io/IOException;
            //  741    756    756    767    Ljava/io/IOException;
            //  915    927    930    939    Ljava/io/IOException;
            //  994    1024   1162   1173   Ljava/io/IOException;
            //  1024   1055   1145   1162   Landroid/database/sqlite/SQLiteException;
            //  1024   1055   1162   1173   Ljava/io/IOException;
            //  1055   1067   1162   1173   Ljava/io/IOException;
            //  1067   1109   1112   1145   Any
            //  1117   1122   1162   1173   Ljava/io/IOException;
            //  1125   1130   1133   1142   Any
            //  1135   1142   1162   1173   Ljava/io/IOException;
            //  1142   1145   1162   1173   Ljava/io/IOException;
            //  1147   1162   1162   1173   Ljava/io/IOException;
            //  1278   1288   1291   1300   Ljava/io/IOException;
            //  1895   1907   1970   1983   Ljava/io/IOException;
            //  1907   1953   1956   1970   Landroid/database/SQLException;
            //  1907   1953   1970   1983   Ljava/io/IOException;
            //  1958   1970   1970   1983   Ljava/io/IOException;
            //  2005   2019   2022   2063   Ljava/io/IOException;
            //  2120   2130   2308   2315   Ljava/io/IOException;
            //  2120   2130   2304   2308   Any
            //  2134   2142   2308   2315   Ljava/io/IOException;
            //  2134   2142   2304   2308   Any
            //  2146   2150   2308   2315   Ljava/io/IOException;
            //  2146   2150   2304   2308   Any
            //  2154   2183   2308   2315   Ljava/io/IOException;
            //  2154   2183   2304   2308   Any
            //  2187   2216   2315   2342   Landroid/database/sqlite/SQLiteException;
            //  2187   2216   2308   2315   Ljava/io/IOException;
            //  2187   2216   2304   2308   Any
            //  2220   2224   2308   2315   Ljava/io/IOException;
            //  2220   2224   2304   2308   Any
            //  2228   2234   2308   2315   Ljava/io/IOException;
            //  2228   2234   2304   2308   Any
            //  2234   2245   2287   2292   Ljava/io/IOException;
            //  2234   2245   2282   2287   Any
            //  2248   2279   2287   2292   Ljava/io/IOException;
            //  2248   2279   2282   2287   Any
            //  2320   2325   2308   2315   Ljava/io/IOException;
            //  2320   2325   2304   2308   Any
            //  2329   2335   2308   2315   Ljava/io/IOException;
            //  2329   2335   2304   2308   Any
            //  2339   2342   2308   2315   Ljava/io/IOException;
            //  2339   2342   2304   2308   Any
            //  2345   2355   2304   2308   Any
            //  2358   2365   2304   2308   Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_2234:
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
    
    public static final class d extends Thread implements h.a
    {
        public final DownloadRequest f;
        public final h g;
        public final g h;
        public final boolean i;
        public final int j;
        public volatile b k;
        public volatile boolean l;
        public Exception m;
        public long n;
        
        public d(final DownloadRequest f, final h g, final g h, final boolean i, final int j, final b k) {
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
                            this.g.a((h.a)this);
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
