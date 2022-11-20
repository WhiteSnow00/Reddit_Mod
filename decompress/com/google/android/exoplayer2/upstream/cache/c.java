// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream.cache;

import java.util.Collections;
import android.database.SQLException;
import com.google.android.exoplayer2.database.DatabaseIOException;
import ad.a;
import ad.h;
import ad.f$a;
import java.util.Iterator;
import java.util.TreeSet;
import ad.n;
import ad.i;
import ad.d;
import ad.f;
import ad.j;
import java.security.SecureRandom;
import com.google.common.collect.o0;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.io.IOException;
import android.util.Log;
import t5.w;
import ad.m;
import android.os.ConditionVariable;
import ad.k;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import ad.g;
import java.io.File;
import java.util.HashSet;

public final class c implements Cache
{
    public static final HashSet<File> k;
    public final File a;
    public final b b;
    public final g c;
    public final ad.b d;
    public final HashMap<String, ArrayList<Cache$a>> e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public Cache$CacheException j;
    
    static {
        k = new HashSet<File>();
    }
    
    public c(final File a, final k b, final za.c c) {
        final g c2 = new g(c, a);
        final ad.b d = new ad.b(c);
        synchronized (c.class) {
            final boolean add = com.google.android.exoplayer2.upstream.cache.c.k.add(a.getAbsoluteFile());
            monitorexit(c.class);
            if (add) {
                this.a = a;
                this.b = b;
                this.c = c2;
                this.d = d;
                this.e = new HashMap<String, ArrayList<Cache$a>>();
                this.f = new Random();
                this.g = true;
                this.h = -1L;
                final ConditionVariable conditionVariable = new ConditionVariable();
                ((Thread)new m(this, conditionVariable)).start();
                conditionVariable.block();
                return;
            }
            final String value = String.valueOf(a);
            throw new IllegalStateException(w.f(value.length() + 46, "Another SimpleCache instance uses the folder: ", value));
        }
    }
    
    public static void m(final c ex) {
        if (!((c)ex).a.exists()) {
            try {
                o(((c)ex).a);
            }
            catch (final Cache$CacheException j) {
                ((c)ex).j = j;
                return;
            }
        }
        final File[] listFiles = ((c)ex).a.listFiles();
        if (listFiles != null) {
        Label_0243:
            while (true) {
                for (final File file : listFiles) {
                    final String name = file.getName();
                    Label_0233: {
                        if (name.endsWith(".uid")) {
                            try {
                                final long long1 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                                break Label_0243;
                            }
                            catch (final NumberFormatException ex2) {
                                final String value = String.valueOf(file);
                                final StringBuilder sb = new StringBuilder(value.length() + 20);
                                sb.append("Malformed UID file: ");
                                sb.append(value);
                                Log.e("SimpleCache", sb.toString());
                                file.delete();
                            }
                            break Label_0233;
                            long long1 = 0L;
                            ((c)ex).h = long1;
                            if (long1 == -1L) {
                                try {
                                    ((c)ex).h = p(((c)ex).a);
                                }
                                catch (final IOException ex3) {
                                    final String value2 = String.valueOf(((c)ex).a);
                                    final StringBuilder sb2 = new StringBuilder(value2.length() + 28);
                                    sb2.append("Failed to create cache UID: ");
                                    sb2.append(value2);
                                    final String string = sb2.toString();
                                    ah0.b.U("SimpleCache", string, (Throwable)ex3);
                                    ((c)ex).j = new Cache$CacheException(string, (Throwable)ex3);
                                    return;
                                }
                            }
                            try {
                                ((c)ex).c.e(((c)ex).h);
                                final ad.b d = ((c)ex).d;
                                if (d != null) {
                                    d.b(((c)ex).h);
                                    final HashMap a = ((c)ex).d.a();
                                    ((c)ex).q(((c)ex).a, true, listFiles, a);
                                    ((c)ex).d.c((Set)a.keySet());
                                }
                                else {
                                    ((c)ex).q(((c)ex).a, true, listFiles, null);
                                }
                                final g c = ((c)ex).c;
                                final o0 iterator = ImmutableSet.copyOf((Collection)c.a.keySet()).iterator();
                                while (((Iterator)iterator).hasNext()) {
                                    c.f((String)((Iterator)iterator).next());
                                }
                                try {
                                    ((c)ex).c.g();
                                }
                                catch (final IOException ex) {
                                    ah0.b.U("SimpleCache", "Storing index file failed", (Throwable)ex);
                                }
                            }
                            catch (final IOException ex4) {
                                final String value3 = String.valueOf(((c)ex).a);
                                final StringBuilder sb3 = new StringBuilder(value3.length() + 36);
                                sb3.append("Failed to initialize cache indices: ");
                                sb3.append(value3);
                                final String string2 = sb3.toString();
                                ah0.b.U("SimpleCache", string2, (Throwable)ex4);
                                ((c)ex).j = new Cache$CacheException(string2, (Throwable)ex4);
                            }
                            return;
                        }
                    }
                }
                final long long1 = -1L;
                continue Label_0243;
            }
        }
        final String value4 = String.valueOf(((c)ex).a);
        final StringBuilder sb4 = new StringBuilder(value4.length() + 38);
        sb4.append("Failed to list cache directory files: ");
        sb4.append(value4);
        final String string3 = sb4.toString();
        Log.e("SimpleCache", string3);
        ((c)ex).j = new Cache$CacheException(string3);
    }
    
    public static void o(final File file) throws Cache$CacheException {
        if (!file.mkdirs() && !file.isDirectory()) {
            final String value = String.valueOf(file);
            final StringBuilder sb = new StringBuilder(value.length() + 34);
            sb.append("Failed to create cache directory: ");
            sb.append(value);
            final String string = sb.toString();
            Log.e("SimpleCache", string);
            throw new Cache$CacheException(string);
        }
    }
    
    public static long p(final File file) throws IOException {
        final long nextLong = new SecureRandom().nextLong();
        long abs;
        if (nextLong == Long.MIN_VALUE) {
            abs = 0L;
        }
        else {
            abs = Math.abs(nextLong);
        }
        final String value = String.valueOf(Long.toString(abs, 16));
        String concat;
        if (".uid".length() != 0) {
            concat = value.concat(".uid");
        }
        else {
            concat = new String(value);
        }
        final File file2 = new File(file, concat);
        if (file2.createNewFile()) {
            return abs;
        }
        final String value2 = String.valueOf(file2);
        throw new IOException(w.f(value2.length() + 27, "Failed to create UID file: ", value2));
    }
    
    public final j a(final String s) {
        synchronized (this) {
            final f c = this.c.c(s);
            j j;
            if (c != null) {
                j = c.e;
            }
            else {
                j = ad.j.c;
            }
            return j;
        }
    }
    
    public final void b(final d d) {
        synchronized (this) {
            this.r(d);
        }
    }
    
    public final void c(final String p0, final i p1) throws Cache$CacheException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: getfield        com/google/android/exoplayer2/upstream/cache/c.j:Lcom/google/android/exoplayer2/upstream/cache/Cache$CacheException;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnonnull       91
        //    13: aload_0        
        //    14: monitorexit    
        //    15: aload_0        
        //    16: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lad/g;
        //    19: astore_3       
        //    20: aload_3        
        //    21: aload_1        
        //    22: invokevirtual   ad/g.d:(Ljava/lang/String;)Lad/f;
        //    25: astore_1       
        //    26: aload_1        
        //    27: getfield        ad/f.e:Lad/j;
        //    30: astore          4
        //    32: aload           4
        //    34: aload_2        
        //    35: invokevirtual   ad/j.b:(Lad/i;)Lad/j;
        //    38: astore_2       
        //    39: aload_1        
        //    40: aload_2        
        //    41: putfield        ad/f.e:Lad/j;
        //    44: aload_2        
        //    45: aload           4
        //    47: invokevirtual   ad/j.equals:(Ljava/lang/Object;)Z
        //    50: iconst_1       
        //    51: ixor           
        //    52: ifeq            65
        //    55: aload_3        
        //    56: getfield        ad/g.e:Lad/g$c;
        //    59: aload_1        
        //    60: invokeinterface ad/g$c.b:(Lad/f;)V
        //    65: aload_0        
        //    66: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lad/g;
        //    69: invokevirtual   ad/g.g:()V
        //    72: aload_0        
        //    73: monitorexit    
        //    74: return         
        //    75: astore_1       
        //    76: new             Lcom/google/android/exoplayer2/upstream/cache/Cache$CacheException;
        //    79: astore_2       
        //    80: aload_2        
        //    81: aload_1        
        //    82: invokespecial   com/google/android/exoplayer2/upstream/cache/Cache$CacheException.<init>:(Ljava/lang/Throwable;)V
        //    85: aload_2        
        //    86: athrow         
        //    87: astore_1       
        //    88: goto            98
        //    91: aload_3        
        //    92: athrow         
        //    93: astore_1       
        //    94: aload_0        
        //    95: monitorexit    
        //    96: aload_1        
        //    97: athrow         
        //    98: aload_0        
        //    99: monitorexit    
        //   100: aload_1        
        //   101: athrow         
        //    Exceptions:
        //  throws com.google.android.exoplayer2.upstream.cache.Cache$CacheException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      4      87     91     Any
        //  4      9      93     98     Any
        //  13     65     87     91     Any
        //  65     72     75     87     Ljava/io/IOException;
        //  65     72     87     91     Any
        //  76     87     87     91     Any
        //  91     93     93     98     Any
        //  94     98     87     91     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public final n d(final long p0, final long p1, final String p2) throws InterruptedException, Cache$CacheException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: getfield        com/google/android/exoplayer2/upstream/cache/c.j:Lcom/google/android/exoplayer2/upstream/cache/Cache$CacheException;
        //     8: astore          6
        //    10: aload           6
        //    12: ifnonnull       49
        //    15: aload_0        
        //    16: monitorexit    
        //    17: aload_0        
        //    18: lload_1        
        //    19: lload_3        
        //    20: aload           5
        //    22: invokevirtual   com/google/android/exoplayer2/upstream/cache/c.j:(JJLjava/lang/String;)Lad/n;
        //    25: astore          6
        //    27: aload           6
        //    29: ifnull          37
        //    32: aload_0        
        //    33: monitorexit    
        //    34: aload           6
        //    36: areturn        
        //    37: aload_0        
        //    38: invokevirtual   java/lang/Object.wait:()V
        //    41: goto            17
        //    44: astore          5
        //    46: goto            59
        //    49: aload           6
        //    51: athrow         
        //    52: astore          5
        //    54: aload_0        
        //    55: monitorexit    
        //    56: aload           5
        //    58: athrow         
        //    59: aload_0        
        //    60: monitorexit    
        //    61: aload           5
        //    63: athrow         
        //    Exceptions:
        //  throws java.lang.InterruptedException
        //  throws com.google.android.exoplayer2.upstream.cache.Cache$CacheException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      4      44     49     Any
        //  4      10     52     59     Any
        //  15     17     44     49     Any
        //  17     27     44     49     Any
        //  37     41     44     49     Any
        //  49     52     52     59     Any
        //  54     59     44     49     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0017:
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
    
    public final long e(long n, long n2, final String s) {
        monitorenter(this);
        if (n2 == -1L) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 += n;
        }
        if (n2 < 0L) {
            n2 = Long.MAX_VALUE;
        }
        long n3 = 0L;
        while (n < n2) {
            try {
                long i = this.i(n, n2 - n, s);
                if (i > 0L) {
                    n3 += i;
                }
                else {
                    i = -i;
                }
                n += i;
                continue;
            }
            finally {
                monitorexit(this);
            }
            break;
        }
        monitorexit(this);
        return n3;
    }
    
    public final void f(final String s) {
        synchronized (this) {
            monitorenter(this);
            Label_0094: {
                final TreeSet set2;
                Label_0057: {
                    try {
                        final f c = this.c.c(s);
                        if (c != null) {
                            if (!c.c.isEmpty()) {
                                final TreeSet set = new TreeSet((Collection<?>)c.c);
                                break Label_0057;
                            }
                        }
                    }
                    finally {
                        break Label_0094;
                    }
                    set2 = new TreeSet();
                }
                monitorexit(this);
                final Iterator iterator = set2.iterator();
                while (iterator.hasNext()) {
                    this.r((d)iterator.next());
                }
                return;
            }
        }
    }
    
    public final void g(final d d) {
        synchronized (this) {
            final f c = this.c.c(d.f);
            c.getClass();
            final long g = d.g;
            for (int i = 0; i < c.d.size(); ++i) {
                if (((f$a)c.d.get(i)).a == g) {
                    c.d.remove(i);
                    this.c.f(c.b);
                    this.notifyAll();
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
    
    public final long h() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public final long i(long a, final long n, final String s) {
        monitorenter(this);
        long n2 = n;
        if (n == -1L) {
            n2 = Long.MAX_VALUE;
        }
        try {
            final f c = this.c.c(s);
            if (c != null) {
                a = c.a(a, n2);
            }
            else {
                a = -n2;
            }
            return a;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final n j(final long p0, final long p1, final String p2) throws Cache$CacheException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: getfield        com/google/android/exoplayer2/upstream/cache/c.j:Lcom/google/android/exoplayer2/upstream/cache/Cache$CacheException;
        //     8: astore          13
        //    10: aload           13
        //    12: ifnonnull       330
        //    15: aload_0        
        //    16: monitorexit    
        //    17: aload_0        
        //    18: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lad/g;
        //    21: aload           5
        //    23: invokevirtual   ad/g.c:(Ljava/lang/String;)Lad/f;
        //    26: astore          15
        //    28: aload           15
        //    30: ifnonnull       54
        //    33: new             Lad/n;
        //    36: astore          13
        //    38: aload           13
        //    40: aload           5
        //    42: lload_1        
        //    43: lload_3        
        //    44: ldc2_w          -9223372036854775807
        //    47: aconst_null    
        //    48: invokespecial   ad/n.<init>:(Ljava/lang/String;JJJLjava/io/File;)V
        //    51: goto            103
        //    54: aload           15
        //    56: lload_1        
        //    57: lload_3        
        //    58: invokevirtual   ad/f.b:(JJ)Lad/n;
        //    61: astore          14
        //    63: aload           14
        //    65: astore          13
        //    67: aload           14
        //    69: getfield        ad/d.i:Z
        //    72: ifeq            103
        //    75: aload           14
        //    77: astore          13
        //    79: aload           14
        //    81: getfield        ad/d.j:Ljava/io/File;
        //    84: invokevirtual   java/io/File.length:()J
        //    87: aload           14
        //    89: getfield        ad/d.h:J
        //    92: lcmp           
        //    93: ifeq            103
        //    96: aload_0        
        //    97: invokevirtual   com/google/android/exoplayer2/upstream/cache/c.s:()V
        //   100: goto            54
        //   103: aload           13
        //   105: getfield        ad/d.i:Z
        //   108: ifeq            126
        //   111: aload_0        
        //   112: aload           5
        //   114: aload           13
        //   116: invokevirtual   com/google/android/exoplayer2/upstream/cache/c.t:(Ljava/lang/String;Lad/n;)Lad/n;
        //   119: astore          5
        //   121: aload_0        
        //   122: monitorexit    
        //   123: aload           5
        //   125: areturn        
        //   126: aload_0        
        //   127: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lad/g;
        //   130: aload           5
        //   132: invokevirtual   ad/g.d:(Ljava/lang/String;)Lad/f;
        //   135: astore          14
        //   137: aload           13
        //   139: getfield        ad/d.h:J
        //   142: lstore          9
        //   144: iconst_0       
        //   145: istore          6
        //   147: aload           14
        //   149: getfield        ad/f.d:Ljava/util/ArrayList;
        //   152: invokevirtual   java/util/ArrayList.size:()I
        //   155: istore          7
        //   157: iconst_1       
        //   158: istore          8
        //   160: iload           6
        //   162: iload           7
        //   164: if_icmpge       280
        //   167: aload           14
        //   169: getfield        ad/f.d:Ljava/util/ArrayList;
        //   172: iload           6
        //   174: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   177: checkcast       Lad/f$a;
        //   180: astore          5
        //   182: aload           5
        //   184: getfield        ad/f$a.a:J
        //   187: lstore          11
        //   189: lload           11
        //   191: lload_1        
        //   192: lcmp           
        //   193: ifgt            230
        //   196: aload           5
        //   198: getfield        ad/f$a.b:J
        //   201: lstore_3       
        //   202: iload           8
        //   204: istore          7
        //   206: lload_3        
        //   207: ldc2_w          -1
        //   210: lcmp           
        //   211: ifeq            263
        //   214: lload           11
        //   216: lload_3        
        //   217: ladd           
        //   218: lload_1        
        //   219: lcmp           
        //   220: ifle            260
        //   223: iload           8
        //   225: istore          7
        //   227: goto            263
        //   230: iload           8
        //   232: istore          7
        //   234: lload           9
        //   236: ldc2_w          -1
        //   239: lcmp           
        //   240: ifeq            263
        //   243: lload_1        
        //   244: lload           9
        //   246: ladd           
        //   247: lload           11
        //   249: lcmp           
        //   250: ifle            260
        //   253: iload           8
        //   255: istore          7
        //   257: goto            263
        //   260: iconst_0       
        //   261: istore          7
        //   263: iload           7
        //   265: ifeq            274
        //   268: iconst_0       
        //   269: istore          6
        //   271: goto            311
        //   274: iinc            6, 1
        //   277: goto            147
        //   280: aload           14
        //   282: getfield        ad/f.d:Ljava/util/ArrayList;
        //   285: astore          5
        //   287: new             Lad/f$a;
        //   290: astore          14
        //   292: aload           14
        //   294: lload_1        
        //   295: lload           9
        //   297: invokespecial   ad/f$a.<init>:(JJ)V
        //   300: aload           5
        //   302: aload           14
        //   304: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   307: pop            
        //   308: iconst_1       
        //   309: istore          6
        //   311: iload           6
        //   313: ifeq            321
        //   316: aload_0        
        //   317: monitorexit    
        //   318: aload           13
        //   320: areturn        
        //   321: aload_0        
        //   322: monitorexit    
        //   323: aconst_null    
        //   324: areturn        
        //   325: astore          5
        //   327: goto            340
        //   330: aload           13
        //   332: athrow         
        //   333: astore          5
        //   335: aload_0        
        //   336: monitorexit    
        //   337: aload           5
        //   339: athrow         
        //   340: aload_0        
        //   341: monitorexit    
        //   342: aload           5
        //   344: athrow         
        //    Exceptions:
        //  throws com.google.android.exoplayer2.upstream.cache.Cache$CacheException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      4      325    330    Any
        //  4      10     333    340    Any
        //  15     28     325    330    Any
        //  33     51     325    330    Any
        //  54     63     325    330    Any
        //  67     75     325    330    Any
        //  79     100    325    330    Any
        //  103    121    325    330    Any
        //  126    144    325    330    Any
        //  147    157    325    330    Any
        //  167    189    325    330    Any
        //  196    202    325    330    Any
        //  280    308    325    330    Any
        //  330    333    333    340    Any
        //  335    340    325    330    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    public final File k(final long p0, final long p1, final String p2) throws Cache$CacheException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: getfield        com/google/android/exoplayer2/upstream/cache/c.j:Lcom/google/android/exoplayer2/upstream/cache/Cache$CacheException;
        //     8: astore          6
        //    10: aload           6
        //    12: ifnonnull       143
        //    15: aload_0        
        //    16: monitorexit    
        //    17: aload_0        
        //    18: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lad/g;
        //    21: aload           5
        //    23: invokevirtual   ad/g.c:(Ljava/lang/String;)Lad/f;
        //    26: astore          5
        //    28: aload           5
        //    30: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    33: pop            
        //    34: aload           5
        //    36: lload_1        
        //    37: lload_3        
        //    38: invokevirtual   ad/f.c:(JJ)Z
        //    41: invokestatic    ah0/b.H:(Z)V
        //    44: aload_0        
        //    45: getfield        com/google/android/exoplayer2/upstream/cache/c.a:Ljava/io/File;
        //    48: invokevirtual   java/io/File.exists:()Z
        //    51: ifne            65
        //    54: aload_0        
        //    55: getfield        com/google/android/exoplayer2/upstream/cache/c.a:Ljava/io/File;
        //    58: invokestatic    com/google/android/exoplayer2/upstream/cache/c.o:(Ljava/io/File;)V
        //    61: aload_0        
        //    62: invokevirtual   com/google/android/exoplayer2/upstream/cache/c.s:()V
        //    65: aload_0        
        //    66: getfield        com/google/android/exoplayer2/upstream/cache/c.b:Lcom/google/android/exoplayer2/upstream/cache/b;
        //    69: aload_0        
        //    70: lload_3        
        //    71: invokeinterface com/google/android/exoplayer2/upstream/cache/b.a:(Lcom/google/android/exoplayer2/upstream/cache/Cache;J)V
        //    76: new             Ljava/io/File;
        //    79: astore          6
        //    81: aload           6
        //    83: aload_0        
        //    84: getfield        com/google/android/exoplayer2/upstream/cache/c.a:Ljava/io/File;
        //    87: aload_0        
        //    88: getfield        com/google/android/exoplayer2/upstream/cache/c.f:Ljava/util/Random;
        //    91: bipush          10
        //    93: invokevirtual   java/util/Random.nextInt:(I)I
        //    96: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    99: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   102: aload           6
        //   104: invokevirtual   java/io/File.exists:()Z
        //   107: ifne            115
        //   110: aload           6
        //   112: invokestatic    com/google/android/exoplayer2/upstream/cache/c.o:(Ljava/io/File;)V
        //   115: invokestatic    java/lang/System.currentTimeMillis:()J
        //   118: lstore_3       
        //   119: aload           6
        //   121: aload           5
        //   123: getfield        ad/f.a:I
        //   126: lload_1        
        //   127: lload_3        
        //   128: invokestatic    ad/n.d:(Ljava/io/File;IJJ)Ljava/io/File;
        //   131: astore          5
        //   133: aload_0        
        //   134: monitorexit    
        //   135: aload           5
        //   137: areturn        
        //   138: astore          5
        //   140: goto            153
        //   143: aload           6
        //   145: athrow         
        //   146: astore          5
        //   148: aload_0        
        //   149: monitorexit    
        //   150: aload           5
        //   152: athrow         
        //   153: aload_0        
        //   154: monitorexit    
        //   155: aload           5
        //   157: athrow         
        //    Exceptions:
        //  throws com.google.android.exoplayer2.upstream.cache.Cache$CacheException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      4      138    143    Any
        //  4      10     146    153    Any
        //  15     65     138    143    Any
        //  65     115    138    143    Any
        //  115    133    138    143    Any
        //  143    146    146    153    Any
        //  148    153    138    143    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public final void l(final File file, long a) throws Cache$CacheException {
        synchronized (this) {
            if (!file.exists()) {
                return;
            }
            if (a == 0L) {
                file.delete();
                return;
            }
            final n c = n.c(file, a, -9223372036854775807L, this.c);
            c.getClass();
            final f c2 = this.c.c(((d)c).f);
            c2.getClass();
            ah0.b.H(c2.c(((d)c).g, ((d)c).h));
            a = ad.h.a((h)c2.e);
            if (a != -1L) {
                ah0.b.H(((d)c).g + ((d)c).h <= a);
            }
            if (this.d != null) {
                final String name = file.getName();
                try {
                    this.d.d(((d)c).h, ((d)c).k, name);
                }
                catch (final IOException ex) {
                    throw new Cache$CacheException((Throwable)ex);
                }
            }
            this.n(c);
            try {
                this.c.g();
                this.notifyAll();
            }
            catch (final IOException ex2) {
                throw new Cache$CacheException((Throwable)ex2);
            }
        }
    }
    
    public final void n(final n n) {
        this.c.d(((d)n).f).c.add(n);
        this.i += ((d)n).h;
        final ArrayList list = this.e.get(((d)n).f);
        if (list != null) {
            int size = list.size();
            while (--size >= 0) {
                ((Cache$a)list.get(size)).b((Cache)this, (d)n);
            }
        }
        ((Cache$a)this.b).b((Cache)this, (d)n);
    }
    
    public final void q(final File file, final boolean b, final File[] array, final HashMap hashMap) {
        if (array != null && array.length != 0) {
            for (final File file2 : array) {
                final String name = file2.getName();
                Label_0173: {
                    if (b && name.indexOf(46) == -1) {
                        this.q(file2, false, file2.listFiles(), hashMap);
                    }
                    else {
                        if (b) {
                            if (name.startsWith("cached_content_index.exi")) {
                                break Label_0173;
                            }
                            if (name.endsWith(".uid")) {
                                break Label_0173;
                            }
                        }
                        long a = -1L;
                        long b2 = -9223372036854775807L;
                        a a2;
                        if (hashMap != null) {
                            a2 = hashMap.remove(name);
                        }
                        else {
                            a2 = null;
                        }
                        if (a2 != null) {
                            a = a2.a;
                            b2 = a2.b;
                        }
                        final n c = n.c(file2, a, b2, this.c);
                        if (c != null) {
                            this.n(c);
                        }
                        else {
                            file2.delete();
                        }
                    }
                }
            }
            return;
        }
        if (!b) {
            file.delete();
        }
    }
    
    public final void r(final d d) {
        final f c = this.c.c(d.f);
        if (c != null) {
            boolean b;
            if (c.c.remove(d)) {
                final File j = d.j;
                if (j != null) {
                    j.delete();
                }
                b = true;
            }
            else {
                b = false;
            }
            if (b) {
                this.i -= d.h;
                if (this.d != null) {
                    final String name = d.j.getName();
                    try {
                        final ad.b d2 = this.d;
                        d2.b.getClass();
                        try {
                            d2.a.getWritableDatabase().delete(d2.b, "name = ?", new String[] { name });
                        }
                        catch (final SQLException ex) {
                            throw new DatabaseIOException(ex);
                        }
                    }
                    catch (final IOException ex2) {
                        final String value = String.valueOf(name);
                        String concat;
                        if (value.length() != 0) {
                            concat = "Failed to remove file index entry for: ".concat(value);
                        }
                        else {
                            concat = new String("Failed to remove file index entry for: ");
                        }
                        Log.w("SimpleCache", concat);
                    }
                }
                this.c.f(c.b);
                final ArrayList list = this.e.get(d.f);
                if (list != null) {
                    int size = list.size();
                    while (--size >= 0) {
                        ((Cache$a)list.get(size)).d(d);
                    }
                }
                ((Cache$a)this.b).d(d);
            }
        }
    }
    
    public final void s() {
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = (Iterator<Object>)Collections.unmodifiableCollection(this.c.a.values()).iterator();
        while (iterator.hasNext()) {
            for (final d d : iterator.next().c) {
                if (d.j.length() != d.h) {
                    list.add(d);
                }
            }
        }
        for (int i = 0; i < list.size(); ++i) {
            this.r((d)list.get(i));
        }
    }
    
    public final n t(final String s, final n n) {
        if (!this.g) {
            return n;
        }
        final File j = ((d)n).j;
        j.getClass();
        final String name = j.getName();
        final long h = ((d)n).h;
        final long currentTimeMillis = System.currentTimeMillis();
        boolean b = false;
        final ad.b d = this.d;
        if (d != null) {
            try {
                d.d(h, currentTimeMillis, name);
            }
            catch (final IOException ex) {
                Log.w("SimpleCache", "Failed to update index with new touch timestamp.");
            }
        }
        else {
            b = true;
        }
        final f c = this.c.c(s);
        ah0.b.H(c.c.remove(n));
        File i = ((d)n).j;
        i.getClass();
        if (b) {
            final File parentFile = i.getParentFile();
            parentFile.getClass();
            final File d2 = n.d(parentFile, c.a, ((d)n).g, currentTimeMillis);
            if (i.renameTo(d2)) {
                i = d2;
            }
            else {
                final String value = String.valueOf(i);
                final String value2 = String.valueOf(d2);
                Log.w("CachedContent", b.g(value2.length() + (value.length() + 21), "Failed to rename ", value, " to ", value2));
            }
        }
        ah0.b.H(((d)n).i);
        final n n2 = new n(((d)n).f, ((d)n).g, ((d)n).h, currentTimeMillis, i);
        c.c.add(n2);
        final ArrayList list = this.e.get(((d)n).f);
        if (list != null) {
            int size = list.size();
            while (--size >= 0) {
                ((Cache$a)list.get(size)).e((Cache)this, (d)n, n2);
            }
        }
        ((Cache$a)this.b).e((Cache)this, (d)n, n2);
        return n2;
    }
}
