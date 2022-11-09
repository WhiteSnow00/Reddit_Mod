// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import eg.o0;
import java.util.HashMap;
import java.util.Iterator;
import eg.g1;
import eg.f0;
import eg.m0;
import eg.k1;
import eg.b1;
import eg.q0;
import java.io.IOException;
import eg.c1;
import java.io.File;
import eg.h1;
import eg.y0;
import eg.p0;
import java.util.ArrayList;
import eg.s0;
import gg.b;
import dg.k;

public final class j
{
    public static final k e;
    public final i a;
    public final c b;
    public final e c;
    public final b d;
    
    static {
        e = new k("ExtractorTaskFinder");
    }
    
    public j(final i a, final c b, final e c, final b d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final s0 a() {
        try {
            this.a.f.lock();
            final ArrayList<p0> list = new ArrayList<p0>();
            for (final p0 p0 : this.a.e.values()) {
                if (y0.c(p0.c.d)) {
                    list.add(p0);
                }
            }
            Object o7 = null;
            i j = null;
            Label_1775: {
                if (!list.isEmpty()) {
                    final boolean a = this.d.a();
                    int n = 0;
                    Object o2 = null;
                    i i = null;
                    Label_1786: {
                        Label_1781: {
                            Label_0302: {
                                if (a) {
                                    final HashMap n2 = this.b.n();
                                    while (true) {
                                        for (p0 p2 : list) {
                                            final Long n3 = n2.get(p2.c.a);
                                            if (n3 != null && p2.c.b == n3) {
                                                com.google.android.play.core.assetpacks.j.e.g("Found promote pack task for session %s with pack %s.", new Object[] { p2.a, p2.c.a });
                                                final Object o = new(eg.h1.class)();
                                                final int a2 = p2.a;
                                                final String a3 = p2.c.a;
                                                final c b = this.b;
                                                b.getClass();
                                                new h1(a2, a3, (int)com.google.android.play.core.assetpacks.c.b(new File(b.d(), a3), true), p2.b, p2.c.b);
                                                o2 = o;
                                                if (o == null) {
                                                    break Label_0302;
                                                }
                                                break Label_1781;
                                            }
                                        }
                                        final Object o = null;
                                        continue;
                                    }
                                }
                            }
                        Label_0512:
                            while (true) {
                            Label_0738_Outer:
                                for (p0 p3 : list) {
                                    try {
                                        final c b2 = this.b;
                                        final o0 c = p3.c;
                                        if (b2.h(p3.b, c.a, c.b) == p3.c.f.size()) {
                                            com.google.android.play.core.assetpacks.j.e.g("Found final move task for session %s with pack %s.", new Object[] { p3.a, p3.c.a });
                                            final int a4 = p3.a;
                                            final o0 c2 = p3.c;
                                            final Object o3 = new c1(a4, p3.b, c2.b, c2.a, c2.c);
                                            break Label_0512;
                                        }
                                        continue;
                                    }
                                    catch (final IOException ex) {
                                        throw new zzck(String.format("Failed to check number of completed merges for session %s, pack %s", p3.a, p3.c.a), ex, p3.a);
                                    }
                                    break;
                                    Object o3 = null;
                                    o2 = o3;
                                    if (o3 == null) {
                                    Label_0738:
                                        while (true) {
                                            for (p0 p4 : list) {
                                                if (y0.c(p4.c.d)) {
                                                    for (q0 q0 : p4.c.f) {
                                                        final c b3 = this.b;
                                                        final o0 c3 = p4.c;
                                                        if (b3.l(p4.b, c3.a, q0.a, c3.b).exists()) {
                                                            com.google.android.play.core.assetpacks.j.e.g("Found merge task for session %s with pack %s and slice %s.", new Object[] { p4.a, p4.c.a, q0.a });
                                                            final Object o4 = new(eg.b1.class)();
                                                            final int a5 = p4.a;
                                                            final o0 c4 = p4.c;
                                                            new b1(a5, p4.b, c4.b, c4.a, q0.a);
                                                            break Label_0738;
                                                        }
                                                    }
                                                    continue Label_0738_Outer;
                                                    Object o4 = null;
                                                    o2 = o4;
                                                    if (o4 == null) {
                                                    Label_0978:
                                                        while (true) {
                                                            for (p0 p5 : list) {
                                                                if (y0.c(p5.c.d)) {
                                                                    for (q0 q2 : p5.c.f) {
                                                                        if (this.b(p5, q2)) {
                                                                            final c b4 = this.b;
                                                                            final o0 c5 = p5.c;
                                                                            if (b4.k(p5.b, c5.a, q2.a, c5.b).exists()) {
                                                                                com.google.android.play.core.assetpacks.j.e.g("Found verify task for session %s with pack %s and slice %s.", new Object[] { p5.a, p5.c.a, q2.a });
                                                                                final Object o5 = new(eg.k1.class)();
                                                                                final int a6 = p5.a;
                                                                                final o0 c6 = p5.c;
                                                                                new k1(a6, c6.a, p5.b, c6.b, q2.a, q2.b);
                                                                                break Label_0978;
                                                                            }
                                                                            continue Label_0738_Outer;
                                                                        }
                                                                    }
                                                                    continue Label_0738_Outer;
                                                                    Object o5 = null;
                                                                    o2 = o5;
                                                                    if (o5 == null) {
                                                                    Label_0990:
                                                                        while (true) {
                                                                            for (p0 p6 : list) {
                                                                                if (y0.c(p6.c.d)) {
                                                                                    final Iterator iterator9 = p6.c.f.iterator();
                                                                                    int n4 = n;
                                                                                    q0 q3;
                                                                                    int a7;
                                                                                    while (true) {
                                                                                        n = n4;
                                                                                        if (!iterator9.hasNext()) {
                                                                                            continue Label_0990;
                                                                                        }
                                                                                        q3 = (q0)iterator9.next();
                                                                                        final int f = q3.f;
                                                                                        int n5;
                                                                                        if (f != 1 && f != 2) {
                                                                                            n5 = n4;
                                                                                        }
                                                                                        else {
                                                                                            n5 = 1;
                                                                                        }
                                                                                        if (n5 != 0) {
                                                                                            continue Label_0738_Outer;
                                                                                        }
                                                                                        final c b5 = this.b;
                                                                                        final o0 c7 = p6.c;
                                                                                        final o o6 = new o(b5, c7.a, p6.b, c7.b, q3.a);
                                                                                        try {
                                                                                            a7 = o6.a();
                                                                                        }
                                                                                        catch (final IOException ex2) {
                                                                                            final k e = com.google.android.play.core.assetpacks.j.e;
                                                                                            final Object[] array = { null };
                                                                                            array[n4] = ex2;
                                                                                            e.h("Slice checkpoint corrupt, restarting extraction. %s", array);
                                                                                            a7 = n4;
                                                                                        }
                                                                                        if (a7 != -1 && ((m0)q3.d.get(a7)).a) {
                                                                                            break;
                                                                                        }
                                                                                        n4 = 0;
                                                                                    }
                                                                                    final k e2 = com.google.android.play.core.assetpacks.j.e;
                                                                                    final Object[] array2 = new Object[5];
                                                                                    array2[n4] = q3.e;
                                                                                    array2[1] = p6.a;
                                                                                    array2[2] = p6.c.a;
                                                                                    array2[3] = q3.a;
                                                                                    array2[4] = a7;
                                                                                    e2.g("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", array2);
                                                                                    final ParcelFileDescriptor$AutoCloseInputStream a8 = this.c.a(p6.a, a7, p6.c.a, q3.a);
                                                                                    o7 = new(eg.f0.class)();
                                                                                    final int a9 = p6.a;
                                                                                    final o0 c8 = p6.c;
                                                                                    final String a10 = c8.a;
                                                                                    final int b6 = p6.b;
                                                                                    final long b7 = c8.b;
                                                                                    final String c9 = c8.c;
                                                                                    final String a11 = q3.a;
                                                                                    final int e3 = q3.e;
                                                                                    final int size = q3.d.size();
                                                                                    final o0 c10 = p6.c;
                                                                                    new f0(a9, a10, b6, b7, c9, a11, e3, a7, size, c10.e, c10.d, a8);
                                                                                    if (o7 == null) {
                                                                                    Label_1749:
                                                                                        while (true) {
                                                                                            for (final p0 p7 : list) {
                                                                                                if (y0.c(p7.c.d)) {
                                                                                                    for (final q0 q4 : p7.c.f) {
                                                                                                        final int f2 = q4.f;
                                                                                                        if ((f2 == 1 || f2 == 2) && q4.d.get(0).a && !this.b(p7, q4)) {
                                                                                                            com.google.android.play.core.assetpacks.j.e.g("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", new Object[] { q4.f, p7.a, p7.c.a, q4.a });
                                                                                                            final ParcelFileDescriptor$AutoCloseInputStream a12 = this.c.a(p7.a, 0, p7.c.a, q4.a);
                                                                                                            final int a13 = p7.a;
                                                                                                            final String a14 = p7.c.a;
                                                                                                            final c b8 = this.b;
                                                                                                            b8.getClass();
                                                                                                            o2 = new g1(a13, a14, (int)com.google.android.play.core.assetpacks.c.b(new File(b8.d(), a14), true), this.b.i(p7.c.a), p7.b, p7.c.b, q4.f, q4.a, q4.c, a12);
                                                                                                            break Label_1749;
                                                                                                        }
                                                                                                    }
                                                                                                    continue Label_0738_Outer;
                                                                                                    if (o2 != null) {
                                                                                                        i = this.a;
                                                                                                        break Label_1786;
                                                                                                    }
                                                                                                    return null;
                                                                                                }
                                                                                            }
                                                                                            o2 = null;
                                                                                            continue Label_1749;
                                                                                        }
                                                                                    }
                                                                                    j = this.a;
                                                                                    break Label_1775;
                                                                                }
                                                                            }
                                                                            o7 = null;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    break Label_1781;
                                                                }
                                                            }
                                                            final Object o5 = null;
                                                            continue Label_0978;
                                                        }
                                                    }
                                                    break Label_1781;
                                                }
                                            }
                                            final Object o4 = null;
                                            continue Label_0738;
                                        }
                                    }
                                    break Label_1781;
                                }
                                final Object o3 = null;
                                continue Label_0512;
                            }
                        }
                        i = this.a;
                    }
                    i.b();
                    return (s0)o2;
                }
                j = this.a;
                o7 = null;
            }
            j.b();
            return (s0)o7;
        }
        finally {
            this.a.b();
        }
    }
    
    public final boolean b(final p0 p0, final q0 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: aload_0        
        //     5: getfield        com/google/android/play/core/assetpacks/j.b:Lcom/google/android/play/core/assetpacks/c;
        //     8: astore_3       
        //     9: aload_1        
        //    10: getfield        eg/p0.c:Leg/o0;
        //    13: astore          4
        //    15: aload           4
        //    17: getfield        eg/o0.a:Ljava/lang/String;
        //    20: astore          5
        //    22: aload_1        
        //    23: getfield        eg/p0.b:I
        //    26: istore          6
        //    28: aload           4
        //    30: getfield        eg/o0.b:J
        //    33: lstore          7
        //    35: aload_2        
        //    36: getfield        eg/q0.a:Ljava/lang/String;
        //    39: astore_1       
        //    40: aload_3        
        //    41: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    44: pop            
        //    45: new             Ljava/io/File;
        //    48: dup            
        //    49: new             Ljava/io/File;
        //    52: dup            
        //    53: new             Ljava/io/File;
        //    56: dup            
        //    57: new             Ljava/io/File;
        //    60: dup            
        //    61: aload_3        
        //    62: iload           6
        //    64: aload           5
        //    66: lload           7
        //    68: invokevirtual   com/google/android/play/core/assetpacks/c.c:(ILjava/lang/String;J)Ljava/io/File;
        //    71: ldc_w           "_slices"
        //    74: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    77: ldc_w           "_metadata"
        //    80: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    83: aload_1        
        //    84: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    87: ldc_w           "checkpoint.dat"
        //    90: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    93: astore_2       
        //    94: aload_2        
        //    95: invokevirtual   java/io/File.exists:()Z
        //    98: istore          9
        //   100: iconst_0       
        //   101: istore          10
        //   103: iload           9
        //   105: ifne            111
        //   108: goto            208
        //   111: new             Ljava/io/FileInputStream;
        //   114: astore_1       
        //   115: aload_1        
        //   116: aload_2        
        //   117: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   120: new             Ljava/util/Properties;
        //   123: astore_2       
        //   124: aload_2        
        //   125: invokespecial   java/util/Properties.<init>:()V
        //   128: aload_2        
        //   129: aload_1        
        //   130: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //   133: aload_1        
        //   134: invokevirtual   java/io/InputStream.close:()V
        //   137: aload_2        
        //   138: ldc_w           "fileStatus"
        //   141: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   144: ifnonnull       163
        //   147: getstatic       com/google/android/play/core/assetpacks/o.h:Ldg/k;
        //   150: ldc_w           "Slice checkpoint file corrupt while checking if extraction finished."
        //   153: iconst_0       
        //   154: anewarray       Ljava/lang/Object;
        //   157: invokevirtual   dg/k.h:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   160: goto            208
        //   163: aload_2        
        //   164: ldc_w           "fileStatus"
        //   167: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   170: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   173: iconst_4       
        //   174: if_icmpne       208
        //   177: iconst_1       
        //   178: istore          10
        //   180: goto            208
        //   183: astore_2       
        //   184: aload_1        
        //   185: invokevirtual   java/io/InputStream.close:()V
        //   188: aload_2        
        //   189: athrow         
        //   190: astore_1       
        //   191: getstatic       com/google/android/play/core/assetpacks/o.h:Ldg/k;
        //   194: ldc_w           "Could not read checkpoint while checking if extraction finished. %s"
        //   197: iconst_1       
        //   198: anewarray       Ljava/lang/Object;
        //   201: dup            
        //   202: iconst_0       
        //   203: aload_1        
        //   204: aastore        
        //   205: invokevirtual   dg/k.h:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   208: iload           10
        //   210: ireturn        
        //   211: astore_1       
        //   212: goto            188
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  111    120    190    208    Ljava/io/IOException;
        //  120    133    183    190    Any
        //  133    137    190    208    Ljava/io/IOException;
        //  184    188    211    215    Any
        //  188    190    190    208    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0188:
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
