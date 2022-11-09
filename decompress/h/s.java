// 
// Decompiled by Procyon v0.6.0
// 

package h;

import ie.kb;
import ie.g2;
import ie.w4;
import ie.xc;
import ie.fc;
import kotlin.collections.EmptySet;
import java.util.Map;
import m7.j;
import java.util.List;
import kotlin.TypeCastException;
import com.tonyodev.fetch2.Download;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CountDownLatch;
import p8.g;
import java.io.File;
import com.instabug.library.diagnostics.nonfatals.NonFatals;
import com.instabug.library.internal.storage.cache.dbv2.migration.MigrationInterruptedException;
import com.instabug.library.util.InstabugSDKLogger;
import android.os.RemoteException;
import ie.ub;
import ie.db;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import android.text.TextUtils;
import ie.ud;
import ih.y;
import ie.fd;
import ie.nc;
import ie.s5;
import vd2.i;
import s40.e;
import ah2.f;
import ie.hc;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import o1.b;
import java.util.ArrayList;
import xe.c;
import ie.p1;
import p8.a;

public final class s implements a, p1, c
{
    public final /* synthetic */ int f;
    public final Object g;
    
    public s(final int n) {
        this.f = 15;
        this.g = new ArrayList(n);
    }
    
    public s(final int f, final int n) {
        this.f = f;
        if (f == 1) {
            this.g = new b();
            return;
        }
        if (f == 2) {
            this.g = new LinkedHashMap();
            return;
        }
        if (f != 11) {
            this.g = new ArrayDeque();
            return;
        }
        this.g = new ArrayList();
    }
    
    public s(final hc g) {
        this.f = 6;
        this.g = g;
    }
    
    public s(final String g) {
        this.f = 16;
        this.g = g;
    }
    
    public s(final ny.b g) {
        this.f = 10;
        ah2.f.f((Object)g, "country");
        this.g = g;
    }
    
    public s(final e g) {
        this.f = 12;
        ah2.f.f((Object)g, "eventSender");
        this.g = g;
    }
    
    public s(final i g) {
        this.f = 14;
        this.g = g;
    }
    
    public static void p(final s s, final ud ud, final s5 s2, final nc nc) {
        if (ud.f || !TextUtils.isEmpty((CharSequence)ud.q)) {
            final y b = ud.b();
            final String j = ud.j;
            final String s3 = ud.s;
            Status a;
            if (ud.f) {
                a = new Status(17012, (PendingIntent)null, (String)null);
            }
            else {
                a = jh.i.a(ud.q);
            }
            final db db = new db(a, b, j, s3);
            s2.getClass();
            try {
                ((ub)s2.f).d(db);
            }
            catch (final RemoteException ex) {
                ((ud.a)s2.g).b((Exception)ex, "RemoteException when sending failure result with credential", new Object[0]);
            }
            return;
        }
        s.n(new fd(ud.h, ud.g, Long.valueOf(ud.i), "Bearer"), ud.l, ud.k, ud.m, ud.b(), s2, nc);
    }
    
    public final void a() {
        am.a.h().getClass();
        am.a.c(false);
        InstabugSDKLogger.e("IBG-BR", "Failed to migrate bugs encryption state", (Throwable)this.g);
        NonFatals.reportNonFatal((Throwable)new MigrationInterruptedException(((Exception)this.g).getMessage()), "Failed to migrate bugs encryption state");
    }
    
    @Override
    public final boolean b(final Object p0, final File p1, final g p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Ljava/io/InputStream;
        //     4: astore          4
        //     6: aload_0        
        //     7: getfield        h/s.g:Ljava/lang/Object;
        //    10: checkcast       Ls8/b;
        //    13: ldc             [B.class
        //    15: ldc             65536
        //    17: invokeinterface s8/b.b:(Ljava/lang/Class;I)Ljava/lang/Object;
        //    22: checkcast       [B
        //    25: astore          5
        //    27: iconst_0       
        //    28: istore          6
        //    30: iconst_0       
        //    31: istore          7
        //    33: aconst_null    
        //    34: astore          8
        //    36: aconst_null    
        //    37: astore          9
        //    39: aload           9
        //    41: astore_1       
        //    42: new             Ljava/io/FileOutputStream;
        //    45: astore_3       
        //    46: aload           9
        //    48: astore_1       
        //    49: aload_3        
        //    50: aload_2        
        //    51: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    54: aload           4
        //    56: aload           5
        //    58: invokevirtual   java/io/InputStream.read:([B)I
        //    61: istore          10
        //    63: iload           10
        //    65: iconst_m1      
        //    66: if_icmpeq       81
        //    69: aload_3        
        //    70: aload           5
        //    72: iconst_0       
        //    73: iload           10
        //    75: invokevirtual   java/io/OutputStream.write:([BII)V
        //    78: goto            54
        //    81: aload_3        
        //    82: invokevirtual   java/io/OutputStream.close:()V
        //    85: iconst_1       
        //    86: istore          11
        //    88: iconst_1       
        //    89: istore          7
        //    91: aload_3        
        //    92: invokevirtual   java/io/OutputStream.close:()V
        //    95: iload           7
        //    97: istore          11
        //    99: goto            166
        //   102: astore_1       
        //   103: aload_3        
        //   104: astore_2       
        //   105: goto            187
        //   108: astore_1       
        //   109: aload_3        
        //   110: astore_2       
        //   111: aload_1        
        //   112: astore_3       
        //   113: goto            124
        //   116: astore_3       
        //   117: goto            183
        //   120: astore_3       
        //   121: aload           8
        //   123: astore_2       
        //   124: aload_2        
        //   125: astore_1       
        //   126: ldc             "StreamEncoder"
        //   128: iconst_3       
        //   129: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   132: ifeq            146
        //   135: aload_2        
        //   136: astore_1       
        //   137: ldc             "StreamEncoder"
        //   139: ldc             "Failed to encode data onto the OutputStream"
        //   141: aload_3        
        //   142: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   145: pop            
        //   146: iload           7
        //   148: istore          11
        //   150: aload_2        
        //   151: ifnull          166
        //   154: iload           6
        //   156: istore          11
        //   158: aload_2        
        //   159: invokevirtual   java/io/OutputStream.close:()V
        //   162: iload           7
        //   164: istore          11
        //   166: aload_0        
        //   167: getfield        h/s.g:Ljava/lang/Object;
        //   170: checkcast       Ls8/b;
        //   173: aload           5
        //   175: invokeinterface s8/b.a:(Ljava/lang/Object;)V
        //   180: iload           11
        //   182: ireturn        
        //   183: aload_1        
        //   184: astore_2       
        //   185: aload_3        
        //   186: astore_1       
        //   187: aload_2        
        //   188: ifnull          195
        //   191: aload_2        
        //   192: invokevirtual   java/io/OutputStream.close:()V
        //   195: aload_0        
        //   196: getfield        h/s.g:Ljava/lang/Object;
        //   199: checkcast       Ls8/b;
        //   202: aload           5
        //   204: invokeinterface s8/b.a:(Ljava/lang/Object;)V
        //   209: aload_1        
        //   210: athrow         
        //   211: astore_1       
        //   212: goto            166
        //   215: astore_2       
        //   216: goto            195
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  42     46     120    124    Ljava/io/IOException;
        //  42     46     116    120    Any
        //  49     54     120    124    Ljava/io/IOException;
        //  49     54     116    120    Any
        //  54     63     108    116    Ljava/io/IOException;
        //  54     63     102    108    Any
        //  69     78     108    116    Ljava/io/IOException;
        //  69     78     102    108    Any
        //  81     85     108    116    Ljava/io/IOException;
        //  81     85     102    108    Any
        //  91     95     211    215    Ljava/io/IOException;
        //  126    135    116    120    Any
        //  137    146    116    120    Any
        //  158    162    211    215    Ljava/io/IOException;
        //  191    195    215    219    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0195:
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
    
    public final void c(final xe.g g) {
        final CountDownLatch countDownLatch = (CountDownLatch)this.g;
        final com.google.firebase.iid.a j = FirebaseInstanceId.j;
        countDownLatch.countDown();
    }
    
    public final void d(final Object o) {
        ((ArrayList)this.g).add(o);
    }
    
    public final void f(final Object o) {
        if (o == null) {
            return;
        }
        if (o instanceof Object[]) {
            final Object[] array = (Object[])o;
            if (array.length > 0) {
                final Object g = this.g;
                ((ArrayList)g).ensureCapacity(((ArrayList)g).size() + array.length);
                Collections.addAll((Collection<? super Object>)this.g, array);
            }
        }
        else if (o instanceof Collection) {
            ((ArrayList)this.g).addAll((Collection)o);
        }
        else if (o instanceof Iterable) {
            final Iterator iterator = ((Iterable)o).iterator();
            while (iterator.hasNext()) {
                ((ArrayList)this.g).add(iterator.next());
            }
        }
        else {
            if (!(o instanceof Iterator)) {
                final StringBuilder k = a.k("Don't know how to spread ");
                k.append(o.getClass());
                throw new UnsupportedOperationException(k.toString());
            }
            final Iterator iterator2 = (Iterator)o;
            while (iterator2.hasNext()) {
                ((ArrayList)this.g).add(iterator2.next());
            }
        }
    }
    
    public final b g() {
        return (b)this.g;
    }
    
    public final ArrayList h(int n, final Download download) {
        ah2.f.g((Object)download, "download");
        final List j1 = ((i)this.g).j1(n);
        if (j1 != null) {
            final ArrayList list = (ArrayList)j1;
            final Iterator iterator = list.iterator();
            n = 0;
            while (true) {
                while (iterator.hasNext()) {
                    if (((Download)iterator.next()).getId() == download.getId()) {
                        if (n != -1) {
                            list.set(n, download);
                        }
                        return list;
                    }
                    ++n;
                }
                n = -1;
                continue;
            }
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.tonyodev.fetch2.Download>");
    }
    
    public final void i() {
        final Iterator iterator = ((List)this.g).iterator();
        while (iterator.hasNext()) {
            ((w20.a)iterator.next()).invalidate();
        }
    }
    
    public final void j(final j j) {
        final j i = ((Map)this.g).get(j.a);
        if (i == null) {
            ((Map)this.g).put(j.a, j);
            final EmptySet instance = EmptySet.INSTANCE;
        }
        else {
            i.a(j);
        }
    }
    
    public final int k() {
        return ((ArrayList)this.g).size();
    }
    
    public final Object[] l(final Object[] array) {
        return ((ArrayList)this.g).toArray(array);
    }
    
    public final void m(final String s, final nc nc) {
        yd.a.P0(s);
        final fd f = fd.f(s);
        if (f.q()) {
            nc.c((fc)f);
            return;
        }
        ((android.support.v4.media.a)this.g).k2(new xc(f.f), (nc)new w4(nc));
    }
    
    public final void n(final fd fd, final String s, final String s2, final Boolean b, final y y, final s5 s3, final nc nc) {
        yd.a.S0((Object)nc);
        yd.a.S0((Object)s3);
        ((android.support.v4.media.a)this.g).l2(new g2(fd.g), (nc)new kb(s3, nc, fd, y, b, s2, s));
    }
    
    @Override
    public final String toString() {
        switch (this.f) {
            default: {
                return super.toString();
            }
            case 16: {
                return (String)this.g;
            }
        }
    }
}
