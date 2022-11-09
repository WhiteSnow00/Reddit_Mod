// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import java.util.Set;
import java.io.InputStream;
import java.util.Enumeration;
import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.util.Collection;
import qg2.o;
import kz0.k;
import android.content.Context;
import re.g7;
import java.util.Map;
import java.util.Iterator;
import java.io.File;
import fc.i;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import com.google.android.play.core.splitinstall.SplitInstallException;
import ng.e;
import re.c3;
import id.d;
import de.h;
import re.g4;
import zg2.l;
import yd.a;
import re.h4;
import java.lang.reflect.Field;
import java.util.ArrayList;
import v3.g;
import android.os.Looper;
import java.util.HashSet;
import ah2.f;
import pg.j;
import qg.c;
import re.e3;
import re.u4;
import ke.a5;
import qd.m;
import ec.b;

public class w implements b, m, a5, u4, e3, c, j, mp.b
{
    public Object f = currentThread;
    
    public w(final int n) {
        if (n == 11) {
            this.f = new HashSet();
            return;
        }
        if (n != 17) {
            this.f = g.a(Looper.getMainLooper());
            return;
        }
        this.f = new ArrayList();
    }
    
    public w(final Field f) {
        f.getClass();
        this.f = f;
    }
    
    public final g4 a() {
        throw null;
    }
    
    public final void accept(final Object o, final Object o2) {
        ((h)o).C().H(new de.f((xe.h)o2), ((d)((de.d)this.f).d).f);
    }
    
    public final long b(final long n) {
        return 0L;
    }
    
    public final long c(final long n, final long n2) {
        return n2;
    }
    
    public final long d(final long n, final long n2) {
        return 0L;
    }
    
    public final long e(final long n, final long n2) {
        return -9223372036854775807L;
    }
    
    public final c3 f() {
        throw null;
    }
    
    public final wd.c g() {
        throw null;
    }
    
    public final e h(final ng.c c) {
        final ng.b b = (ng.b)this.f;
        final int p = pg.a.p;
        final int n = 1;
        if (c != null) {
            final int h = c.h();
            if (h != 0 && h != 5 && h != 6 && h != 7) {
                throw new SplitInstallException(-1);
            }
        }
        int n2;
        if (c == null) {
            n2 = n;
        }
        else {
            n2 = 1 + c.g();
        }
        return ng.c.b(n2, 1, 0, 0L, 0L, (List)b.a, (List)new ArrayList());
    }
    
    public final v7.a i() {
        throw null;
    }
    
    public final long k(final long n, final long n2) {
        return 0L;
    }
    
    public final void l(final SQLiteDatabase sqLiteDatabase) {
        final mp.b[] array = (mp.b[])this.f;
        if (array.length == 0) {
            new mp.a().l(sqLiteDatabase);
        }
        else {
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].l(sqLiteDatabase);
            }
        }
    }
    
    public final long m(final long n) {
        return 1L;
    }
    
    public final long n() {
        return 0L;
    }
    
    public final i o(final long n) {
        return (i)this.f;
    }
    
    public final void onSuccess(final Object o) {
        final com.google.android.play.core.assetpacks.c c = (com.google.android.play.core.assetpacks.c)this.f;
        final List list = (List)o;
        final int a = c.b.a();
        for (final File file : c.e()) {
            if (!list.contains(file.getName()) && com.google.android.play.core.assetpacks.c.b(file, true) != a) {
                com.google.android.play.core.assetpacks.c.g(file);
            }
        }
    }
    
    public final void p(final String s, final int n, final Throwable t, final byte[] array, final Map map) {
        ((g7)this.f).k(s, n, t, array, map);
    }
    
    public final Context q() {
        throw null;
    }
    
    public final boolean r() {
        return true;
    }
    
    public final long s(final long n, final long n2) {
        return 1L;
    }
    
    public final void t(final int n, byte[] b) {
        final byte[] n2 = qg2.j.n1(0, 4, b);
        final int d0 = k.D0(n2);
        if (n == 0) {
            ((ArrayList)this.f).add(n2);
        }
        else {
            ((ArrayList)this.f).add(k.d1(d0 - n));
        }
        final List y = ah2.c.Y((Object[])new byte[][] { os.h.y, qg2.j.n1(n + 8, d0 + 8, b) });
        ah2.f.f((Object)y, "items");
        o.W0((Iterable)y, (Collection)this.f);
        b = os.h.b(y);
        ((ArrayList)this.f).add(b);
    }
    
    public final void u(String string, final l l) {
        ah2.f.f((Object)string, "action");
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to ");
        sb.append(string);
        sb.append(" from ");
        sb.append((Object)Thread.currentThread().getName());
        sb.append(" thread when this should be done from ");
        sb.append((Object)((Thread)this.f).getName());
        sb.append(" thread");
        string = sb.toString();
        final boolean a = ah2.f.a((Object)this.f, (Object)Thread.currentThread());
        ah2.f.f((Object)string, "message");
        if (!a) {
            if (l != null) {
                l.invoke((Object)string);
            }
        }
    }
    
    public final SequenceInputStream w() {
        final ArrayList list = (ArrayList)this.f;
        final ArrayList list2 = new ArrayList<ByteArrayInputStream>(qg2.m.P0((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new ByteArrayInputStream((byte[])iterator.next()));
        }
        return new SequenceInputStream((Enumeration<? extends InputStream>)new uu2.a((Iterator)list2.iterator()));
    }
    
    public final void x(final ng.c c) {
        synchronized (this) {
            final Iterator iterator = ((Set)this.f).iterator();
            while (iterator.hasNext()) {
                ((jg.a<ng.c>)iterator.next()).a(c);
            }
        }
    }
    
    public void y() {
        ((h4)this.f).a().y();
    }
    
    public final Object zza() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        u5/w.f:Ljava/lang/Object;
        //     4: checkcast       Landroid/content/Context;
        //     7: astore_1       
        //     8: getstatic       ke/y4.f:Ljava/lang/Object;
        //    11: astore_2       
        //    12: ldc_w           Lke/n4;.class
        //    15: monitorenter   
        //    16: getstatic       ke/n4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //    19: astore_3       
        //    20: aload_3        
        //    21: astore_2       
        //    22: aload_3        
        //    23: ifnonnull       589
        //    26: getstatic       android/os/Build.TYPE:Ljava/lang/String;
        //    29: astore_2       
        //    30: getstatic       android/os/Build.TAGS:Ljava/lang/String;
        //    33: astore_3       
        //    34: aload_2        
        //    35: ldc_w           "eng"
        //    38: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    41: ifne            54
        //    44: aload_2        
        //    45: ldc_w           "userdebug"
        //    48: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    51: ifeq            77
        //    54: aload_3        
        //    55: ldc_w           "dev-keys"
        //    58: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    61: ifne            84
        //    64: aload_3        
        //    65: ldc_w           "test-keys"
        //    68: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    71: ifeq            77
        //    74: goto            84
        //    77: invokestatic    com/google/android/gms/internal/measurement/zzif.zzc:()Lcom/google/android/gms/internal/measurement/zzif;
        //    80: astore_2       
        //    81: goto            575
        //    84: aload_1        
        //    85: astore_2       
        //    86: aload_1        
        //    87: invokevirtual   android/content/Context.isDeviceProtectedStorage:()Z
        //    90: ifne            98
        //    93: aload_1        
        //    94: invokevirtual   android/content/Context.createDeviceProtectedStorageContext:()Landroid/content/Context;
        //    97: astore_2       
        //    98: invokestatic    android/os/StrictMode.allowThreadDiskReads:()Landroid/os/StrictMode$ThreadPolicy;
        //   101: astore_3       
        //   102: invokestatic    android/os/StrictMode.allowThreadDiskWrites:()Landroid/os/StrictMode$ThreadPolicy;
        //   105: pop            
        //   106: new             Ljava/io/File;
        //   109: astore_1       
        //   110: aload_1        
        //   111: aload_2        
        //   112: ldc_w           "phenotype_hermetic"
        //   115: iconst_0       
        //   116: invokevirtual   android/content/Context.getDir:(Ljava/lang/String;I)Ljava/io/File;
        //   119: ldc_w           "overrides.txt"
        //   122: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   125: aload_1        
        //   126: invokevirtual   java/io/File.exists:()Z
        //   129: ifeq            140
        //   132: aload_1        
        //   133: invokestatic    com/google/android/gms/internal/measurement/zzif.zzd:(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzif;
        //   136: astore_2       
        //   137: goto            163
        //   140: invokestatic    com/google/android/gms/internal/measurement/zzif.zzc:()Lcom/google/android/gms/internal/measurement/zzif;
        //   143: astore_2       
        //   144: goto            163
        //   147: astore_2       
        //   148: ldc_w           "HermeticFileOverrides"
        //   151: ldc_w           "no data dir"
        //   154: aload_2        
        //   155: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   158: pop            
        //   159: invokestatic    com/google/android/gms/internal/measurement/zzif.zzc:()Lcom/google/android/gms/internal/measurement/zzif;
        //   162: astore_2       
        //   163: aload_2        
        //   164: invokevirtual   com/google/android/gms/internal/measurement/zzif.zzb:()Z
        //   167: ifeq            564
        //   170: aload_2        
        //   171: invokevirtual   com/google/android/gms/internal/measurement/zzif.zza:()Ljava/lang/Object;
        //   174: checkcast       Ljava/io/File;
        //   177: astore          4
        //   179: new             Ljava/io/BufferedReader;
        //   182: astore          5
        //   184: new             Ljava/io/InputStreamReader;
        //   187: astore_1       
        //   188: new             Ljava/io/FileInputStream;
        //   191: astore_2       
        //   192: aload_2        
        //   193: aload           4
        //   195: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   198: aload_1        
        //   199: aload_2        
        //   200: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   203: aload           5
        //   205: aload_1        
        //   206: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   209: new             Lj0/i;
        //   212: astore          6
        //   214: aload           6
        //   216: invokespecial   j0/i.<init>:()V
        //   219: new             Ljava/util/HashMap;
        //   222: astore          7
        //   224: aload           7
        //   226: invokespecial   java/util/HashMap.<init>:()V
        //   229: aload           5
        //   231: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   234: astore_2       
        //   235: aload_2        
        //   236: ifnull          446
        //   239: aload_2        
        //   240: ldc_w           " "
        //   243: iconst_3       
        //   244: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   247: astore          8
        //   249: aload           8
        //   251: arraylength    
        //   252: iconst_3       
        //   253: if_icmpeq       292
        //   256: new             Ljava/lang/StringBuilder;
        //   259: astore_1       
        //   260: aload_1        
        //   261: invokespecial   java/lang/StringBuilder.<init>:()V
        //   264: aload_1        
        //   265: ldc_w           "Invalid: "
        //   268: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   271: pop            
        //   272: aload_1        
        //   273: aload_2        
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: pop            
        //   278: ldc_w           "HermeticFileOverrides"
        //   281: aload_1        
        //   282: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   285: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   288: pop            
        //   289: goto            229
        //   292: aload           8
        //   294: iconst_0       
        //   295: aaload         
        //   296: astore_2       
        //   297: new             Ljava/lang/String;
        //   300: astore          9
        //   302: aload           9
        //   304: aload_2        
        //   305: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   308: aload           8
        //   310: iconst_1       
        //   311: aaload         
        //   312: astore_2       
        //   313: new             Ljava/lang/String;
        //   316: astore_1       
        //   317: aload_1        
        //   318: aload_2        
        //   319: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   322: aload_1        
        //   323: invokestatic    android/net/Uri.decode:(Ljava/lang/String;)Ljava/lang/String;
        //   326: astore          10
        //   328: aload           7
        //   330: aload           8
        //   332: iconst_2       
        //   333: aaload         
        //   334: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   337: checkcast       Ljava/lang/String;
        //   340: astore_1       
        //   341: aload_1        
        //   342: astore_2       
        //   343: aload_1        
        //   344: ifnonnull       398
        //   347: aload           8
        //   349: iconst_2       
        //   350: aaload         
        //   351: astore_2       
        //   352: new             Ljava/lang/String;
        //   355: astore          8
        //   357: aload           8
        //   359: aload_2        
        //   360: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   363: aload           8
        //   365: invokestatic    android/net/Uri.decode:(Ljava/lang/String;)Ljava/lang/String;
        //   368: astore_1       
        //   369: aload_1        
        //   370: invokevirtual   java/lang/String.length:()I
        //   373: sipush          1024
        //   376: if_icmplt       387
        //   379: aload_1        
        //   380: astore_2       
        //   381: aload_1        
        //   382: aload           8
        //   384: if_acmpne       398
        //   387: aload           7
        //   389: aload           8
        //   391: aload_1        
        //   392: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   395: pop            
        //   396: aload_1        
        //   397: astore_2       
        //   398: aload           6
        //   400: aload           9
        //   402: invokevirtual   j0/i.containsKey:(Ljava/lang/Object;)Z
        //   405: ifne            425
        //   408: new             Lj0/i;
        //   411: astore_1       
        //   412: aload_1        
        //   413: invokespecial   j0/i.<init>:()V
        //   416: aload           6
        //   418: aload           9
        //   420: aload_1        
        //   421: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   424: pop            
        //   425: aload           6
        //   427: aload           9
        //   429: aconst_null    
        //   430: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   433: checkcast       Lj0/i;
        //   436: aload           10
        //   438: aload_2        
        //   439: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   442: pop            
        //   443: goto            229
        //   446: aload           4
        //   448: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   451: astore_2       
        //   452: new             Ljava/lang/StringBuilder;
        //   455: astore_1       
        //   456: aload_1        
        //   457: invokespecial   java/lang/StringBuilder.<init>:()V
        //   460: aload_1        
        //   461: ldc_w           "Parsed "
        //   464: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   467: pop            
        //   468: aload_1        
        //   469: aload_2        
        //   470: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   473: pop            
        //   474: ldc_w           "HermeticFileOverrides"
        //   477: aload_1        
        //   478: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   481: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   484: pop            
        //   485: new             Lke/k4;
        //   488: dup            
        //   489: aload           6
        //   491: invokespecial   ke/k4.<init>:(Lj0/i;)V
        //   494: astore_2       
        //   495: aload           5
        //   497: invokevirtual   java/io/BufferedReader.close:()V
        //   500: aload_2        
        //   501: invokestatic    com/google/android/gms/internal/measurement/zzif.zzd:(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzif;
        //   504: astore_2       
        //   505: goto            568
        //   508: astore_2       
        //   509: aload           5
        //   511: invokevirtual   java/io/BufferedReader.close:()V
        //   514: goto            550
        //   517: astore_1       
        //   518: ldc_w           Ljava/lang/Throwable;.class
        //   521: ldc_w           "addSuppressed"
        //   524: iconst_1       
        //   525: anewarray       Ljava/lang/Class;
        //   528: dup            
        //   529: iconst_0       
        //   530: ldc_w           Ljava/lang/Throwable;.class
        //   533: aastore        
        //   534: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   537: aload_2        
        //   538: iconst_1       
        //   539: anewarray       Ljava/lang/Object;
        //   542: dup            
        //   543: iconst_0       
        //   544: aload_1        
        //   545: aastore        
        //   546: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   549: pop            
        //   550: aload_2        
        //   551: athrow         
        //   552: astore_2       
        //   553: new             Ljava/lang/RuntimeException;
        //   556: astore_1       
        //   557: aload_1        
        //   558: aload_2        
        //   559: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   562: aload_1        
        //   563: athrow         
        //   564: invokestatic    com/google/android/gms/internal/measurement/zzif.zzc:()Lcom/google/android/gms/internal/measurement/zzif;
        //   567: astore_2       
        //   568: aload_3        
        //   569: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   572: goto            81
        //   575: aload_2        
        //   576: putstatic       ke/n4.a:Lcom/google/android/gms/internal/measurement/zzif;
        //   579: goto            589
        //   582: astore_2       
        //   583: aload_3        
        //   584: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   587: aload_2        
        //   588: athrow         
        //   589: ldc_w           Lke/n4;.class
        //   592: monitorexit    
        //   593: aload_2        
        //   594: areturn        
        //   595: astore_2       
        //   596: ldc_w           Lke/n4;.class
        //   599: monitorexit    
        //   600: aload_2        
        //   601: athrow         
        //   602: astore_1       
        //   603: goto            550
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  16     20     595    602    Any
        //  26     54     595    602    Any
        //  54     74     595    602    Any
        //  77     81     595    602    Any
        //  86     98     595    602    Any
        //  98     102    595    602    Any
        //  102    106    582    589    Any
        //  106    125    147    163    Ljava/lang/RuntimeException;
        //  106    125    582    589    Any
        //  125    137    582    589    Any
        //  140    144    582    589    Any
        //  148    163    582    589    Any
        //  163    179    582    589    Any
        //  179    209    552    564    Ljava/io/IOException;
        //  179    209    582    589    Any
        //  209    229    508    552    Any
        //  229    235    508    552    Any
        //  239    289    508    552    Any
        //  297    308    508    552    Any
        //  313    341    508    552    Any
        //  352    379    508    552    Any
        //  387    396    508    552    Any
        //  398    425    508    552    Any
        //  425    443    508    552    Any
        //  446    495    508    552    Any
        //  495    500    552    564    Ljava/io/IOException;
        //  495    500    582    589    Any
        //  500    505    582    589    Any
        //  509    514    517    550    Any
        //  518    550    602    606    Ljava/lang/Exception;
        //  518    550    582    589    Any
        //  550    552    552    564    Ljava/io/IOException;
        //  550    552    582    589    Any
        //  553    564    582    589    Any
        //  564    568    582    589    Any
        //  568    572    595    602    Any
        //  575    579    595    602    Any
        //  583    589    595    602    Any
        //  589    593    595    602    Any
        //  596    600    595    602    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0550:
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
}
