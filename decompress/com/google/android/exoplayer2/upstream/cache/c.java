// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream.cache;

import java.util.Collections;
import android.database.SQLException;
import com.google.android.exoplayer2.database.DatabaseIOException;
import zc.a;
import zc.h;
import ad.d0;
import zc.i;
import java.util.Iterator;
import java.util.TreeSet;
import zc.n;
import zc.f;
import zc.j;
import zc.d;
import java.security.SecureRandom;
import com.google.common.collect.n0;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.io.IOException;
import lg.e0;
import android.util.Log;
import zc.m;
import android.os.ConditionVariable;
import zc.k;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import zc.g;
import java.io.File;
import java.util.HashSet;

public final class c implements Cache
{
    public static final HashSet<File> k;
    public final File a;
    public final b b;
    public final g c;
    public final zc.b d;
    public final HashMap<String, ArrayList<a>> e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public CacheException j;
    
    static {
        k = new HashSet<File>();
    }
    
    public c(final File a, final k b, final ya.c c) {
        final g c2 = new g(c, a);
        final zc.b d = new zc.b(c);
        synchronized (c.class) {
            final boolean add = com.google.android.exoplayer2.upstream.cache.c.k.add(a.getAbsoluteFile());
            monitorexit(c.class);
            if (add) {
                this.a = a;
                this.b = (b)b;
                this.c = c2;
                this.d = d;
                this.e = new HashMap<String, ArrayList<a>>();
                this.f = new Random();
                this.g = true;
                this.h = -1L;
                final ConditionVariable conditionVariable = new ConditionVariable();
                new m(this, conditionVariable).start();
                conditionVariable.block();
                return;
            }
            final String value = String.valueOf(a);
            throw new IllegalStateException(b.d(value.length() + 46, "Another SimpleCache instance uses the folder: ", value));
        }
    }
    
    public static void m(final c ex) {
        if (!((c)ex).a.exists()) {
            try {
                o(((c)ex).a);
            }
            catch (final CacheException j) {
                ((c)ex).j = j;
                return;
            }
        }
        final File[] listFiles = ((c)ex).a.listFiles();
        if (listFiles != null) {
        Label_0228:
            while (true) {
                for (final File file : listFiles) {
                    final String name = file.getName();
                    Label_0217: {
                        if (name.endsWith(".uid")) {
                            try {
                                final long long1 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                                break Label_0228;
                            }
                            catch (final NumberFormatException ex2) {
                                final String value = String.valueOf(file);
                                final StringBuilder sb = new StringBuilder(value.length() + 20);
                                sb.append("Malformed UID file: ");
                                sb.append(value);
                                Log.e("SimpleCache", sb.toString());
                                file.delete();
                            }
                            break Label_0217;
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
                                    e0.I("SimpleCache", string, (Throwable)ex3);
                                    ((c)ex).j = new CacheException(string, ex3);
                                    return;
                                }
                            }
                            try {
                                ((c)ex).c.e(((c)ex).h);
                                final zc.b d = ((c)ex).d;
                                if (d != null) {
                                    d.b(((c)ex).h);
                                    final HashMap a = ((c)ex).d.a();
                                    ((c)ex).q(((c)ex).a, true, listFiles, a);
                                    ((c)ex).d.c(a.keySet());
                                }
                                else {
                                    ((c)ex).q(((c)ex).a, true, listFiles, null);
                                }
                                final g c = ((c)ex).c;
                                final n0 iterator = ImmutableSet.copyOf((Collection)c.a.keySet()).iterator();
                                while (((Iterator)iterator).hasNext()) {
                                    c.f((String)((Iterator)iterator).next());
                                }
                                try {
                                    ((c)ex).c.g();
                                }
                                catch (final IOException ex) {
                                    e0.I("SimpleCache", "Storing index file failed", (Throwable)ex);
                                }
                            }
                            catch (final IOException ex4) {
                                final String value3 = String.valueOf(((c)ex).a);
                                final StringBuilder sb3 = new StringBuilder(value3.length() + 36);
                                sb3.append("Failed to initialize cache indices: ");
                                sb3.append(value3);
                                final String string2 = sb3.toString();
                                e0.I("SimpleCache", string2, (Throwable)ex4);
                                ((c)ex).j = new CacheException(string2, ex4);
                            }
                            return;
                        }
                    }
                }
                final long long1 = -1L;
                continue Label_0228;
            }
        }
        final String value4 = String.valueOf(((c)ex).a);
        final StringBuilder sb4 = new StringBuilder(value4.length() + 38);
        sb4.append("Failed to list cache directory files: ");
        sb4.append(value4);
        final String string3 = sb4.toString();
        Log.e("SimpleCache", string3);
        ((c)ex).j = new CacheException(string3);
    }
    
    public static void o(final File file) throws CacheException {
        if (!file.mkdirs() && !file.isDirectory()) {
            final String value = String.valueOf(file);
            final StringBuilder sb = new StringBuilder(value.length() + 34);
            sb.append("Failed to create cache directory: ");
            sb.append(value);
            final String string = sb.toString();
            Log.e("SimpleCache", string);
            throw new CacheException(string);
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
        throw new IOException(b.d(value2.length() + 27, "Failed to create UID file: ", value2));
    }
    
    @Override
    public final void a(final d d) {
        synchronized (this) {
            this.r(d);
        }
    }
    
    @Override
    public final j b(final String s) {
        synchronized (this) {
            final f c = this.c.c(s);
            j j;
            if (c != null) {
                j = c.e;
            }
            else {
                j = zc.j.c;
            }
            return j;
        }
    }
    
    @Override
    public final n c(final long p0, final long p1, final String p2) throws InterruptedException, CacheException {
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
        //    22: invokevirtual   com/google/android/exoplayer2/upstream/cache/c.j:(JJLjava/lang/String;)Lzc/n;
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
        //  throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException
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
    
    @Override
    public final void d(final d d) {
        synchronized (this) {
            final f c = this.c.c(d.f);
            c.getClass();
            final long g = d.g;
            for (int i = 0; i < c.d.size(); ++i) {
                if (((f.a)c.d.get(i)).a == g) {
                    c.d.remove(i);
                    this.c.f(c.b);
                    this.notifyAll();
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
    
    @Override
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
    
    @Override
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
                                final TreeSet set = new TreeSet(c.c);
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
    
    @Override
    public final void g(final String p0, final i p1) throws CacheException {
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
        //    10: ifnonnull       92
        //    13: aload_0        
        //    14: monitorexit    
        //    15: aload_0        
        //    16: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lzc/g;
        //    19: astore_3       
        //    20: aload_3        
        //    21: aload_1        
        //    22: invokevirtual   zc/g.d:(Ljava/lang/String;)Lzc/f;
        //    25: astore          4
        //    27: aload           4
        //    29: getfield        zc/f.e:Lzc/j;
        //    32: astore_1       
        //    33: aload_1        
        //    34: aload_2        
        //    35: invokevirtual   zc/j.b:(Lzc/i;)Lzc/j;
        //    38: astore_2       
        //    39: aload           4
        //    41: aload_2        
        //    42: putfield        zc/f.e:Lzc/j;
        //    45: aload_2        
        //    46: aload_1        
        //    47: invokevirtual   zc/j.equals:(Ljava/lang/Object;)Z
        //    50: iconst_1       
        //    51: ixor           
        //    52: ifeq            66
        //    55: aload_3        
        //    56: getfield        zc/g.e:Lzc/g$c;
        //    59: aload           4
        //    61: invokeinterface zc/g$c.d:(Lzc/f;)V
        //    66: aload_0        
        //    67: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lzc/g;
        //    70: invokevirtual   zc/g.g:()V
        //    73: aload_0        
        //    74: monitorexit    
        //    75: return         
        //    76: astore_1       
        //    77: new             Lcom/google/android/exoplayer2/upstream/cache/Cache$CacheException;
        //    80: astore_2       
        //    81: aload_2        
        //    82: aload_1        
        //    83: invokespecial   com/google/android/exoplayer2/upstream/cache/Cache$CacheException.<init>:(Ljava/lang/Throwable;)V
        //    86: aload_2        
        //    87: athrow         
        //    88: astore_1       
        //    89: goto            99
        //    92: aload_3        
        //    93: athrow         
        //    94: astore_1       
        //    95: aload_0        
        //    96: monitorexit    
        //    97: aload_1        
        //    98: athrow         
        //    99: aload_0        
        //   100: monitorexit    
        //   101: aload_1        
        //   102: athrow         
        //    Exceptions:
        //  throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      4      88     92     Any
        //  4      9      94     99     Any
        //  13     66     88     92     Any
        //  66     73     76     88     Ljava/io/IOException;
        //  66     73     88     92     Any
        //  77     88     88     92     Any
        //  92     94     94     99     Any
        //  95     99     88     92     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    public final long h() {
        synchronized (this) {
            return this.i;
        }
    }
    
    @Override
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
    
    @Override
    public final n j(final long p0, final long p1, final String p2) throws CacheException {
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
        //    12: ifnonnull       329
        //    15: aload_0        
        //    16: monitorexit    
        //    17: aload_0        
        //    18: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lzc/g;
        //    21: aload           5
        //    23: invokevirtual   zc/g.c:(Ljava/lang/String;)Lzc/f;
        //    26: astore          7
        //    28: aload           7
        //    30: ifnonnull       54
        //    33: new             Lzc/n;
        //    36: astore          6
        //    38: aload           6
        //    40: aload           5
        //    42: lload_1        
        //    43: lload_3        
        //    44: ldc2_w          -9223372036854775807
        //    47: aconst_null    
        //    48: invokespecial   zc/n.<init>:(Ljava/lang/String;JJJLjava/io/File;)V
        //    51: goto            103
        //    54: aload           7
        //    56: lload_1        
        //    57: lload_3        
        //    58: invokevirtual   zc/f.b:(JJ)Lzc/n;
        //    61: astore          8
        //    63: aload           8
        //    65: astore          6
        //    67: aload           8
        //    69: getfield        zc/d.i:Z
        //    72: ifeq            103
        //    75: aload           8
        //    77: astore          6
        //    79: aload           8
        //    81: getfield        zc/d.j:Ljava/io/File;
        //    84: invokevirtual   java/io/File.length:()J
        //    87: aload           8
        //    89: getfield        zc/d.h:J
        //    92: lcmp           
        //    93: ifeq            103
        //    96: aload_0        
        //    97: invokevirtual   com/google/android/exoplayer2/upstream/cache/c.s:()V
        //   100: goto            54
        //   103: aload           6
        //   105: getfield        zc/d.i:Z
        //   108: ifeq            126
        //   111: aload_0        
        //   112: aload           5
        //   114: aload           6
        //   116: invokevirtual   com/google/android/exoplayer2/upstream/cache/c.t:(Ljava/lang/String;Lzc/n;)Lzc/n;
        //   119: astore          5
        //   121: aload_0        
        //   122: monitorexit    
        //   123: aload           5
        //   125: areturn        
        //   126: aload_0        
        //   127: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lzc/g;
        //   130: aload           5
        //   132: invokevirtual   zc/g.d:(Ljava/lang/String;)Lzc/f;
        //   135: astore          5
        //   137: aload           6
        //   139: getfield        zc/d.h:J
        //   142: lstore_3       
        //   143: iconst_0       
        //   144: istore          9
        //   146: aload           5
        //   148: getfield        zc/f.d:Ljava/util/ArrayList;
        //   151: invokevirtual   java/util/ArrayList.size:()I
        //   154: istore          10
        //   156: iconst_1       
        //   157: istore          11
        //   159: iload           9
        //   161: iload           10
        //   163: if_icmpge       280
        //   166: aload           5
        //   168: getfield        zc/f.d:Ljava/util/ArrayList;
        //   171: iload           9
        //   173: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   176: checkcast       Lzc/f$a;
        //   179: astore          8
        //   181: aload           8
        //   183: getfield        zc/f$a.a:J
        //   186: lstore          12
        //   188: lload           12
        //   190: lload_1        
        //   191: lcmp           
        //   192: ifgt            232
        //   195: aload           8
        //   197: getfield        zc/f$a.b:J
        //   200: lstore          14
        //   202: iload           11
        //   204: istore          10
        //   206: lload           14
        //   208: ldc2_w          -1
        //   211: lcmp           
        //   212: ifeq            263
        //   215: lload           12
        //   217: lload           14
        //   219: ladd           
        //   220: lload_1        
        //   221: lcmp           
        //   222: ifle            260
        //   225: iload           11
        //   227: istore          10
        //   229: goto            263
        //   232: iload           11
        //   234: istore          10
        //   236: lload_3        
        //   237: ldc2_w          -1
        //   240: lcmp           
        //   241: ifeq            263
        //   244: lload_1        
        //   245: lload_3        
        //   246: ladd           
        //   247: lload           12
        //   249: lcmp           
        //   250: ifle            260
        //   253: iload           11
        //   255: istore          10
        //   257: goto            263
        //   260: iconst_0       
        //   261: istore          10
        //   263: iload           10
        //   265: ifeq            274
        //   268: iconst_0       
        //   269: istore          9
        //   271: goto            310
        //   274: iinc            9, 1
        //   277: goto            146
        //   280: aload           5
        //   282: getfield        zc/f.d:Ljava/util/ArrayList;
        //   285: astore          5
        //   287: new             Lzc/f$a;
        //   290: astore          8
        //   292: aload           8
        //   294: lload_1        
        //   295: lload_3        
        //   296: invokespecial   zc/f$a.<init>:(JJ)V
        //   299: aload           5
        //   301: aload           8
        //   303: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   306: pop            
        //   307: iconst_1       
        //   308: istore          9
        //   310: iload           9
        //   312: ifeq            320
        //   315: aload_0        
        //   316: monitorexit    
        //   317: aload           6
        //   319: areturn        
        //   320: aload_0        
        //   321: monitorexit    
        //   322: aconst_null    
        //   323: areturn        
        //   324: astore          5
        //   326: goto            339
        //   329: aload           6
        //   331: athrow         
        //   332: astore          5
        //   334: aload_0        
        //   335: monitorexit    
        //   336: aload           5
        //   338: athrow         
        //   339: aload_0        
        //   340: monitorexit    
        //   341: aload           5
        //   343: athrow         
        //    Exceptions:
        //  throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      4      324    329    Any
        //  4      10     332    339    Any
        //  15     28     324    329    Any
        //  33     51     324    329    Any
        //  54     63     324    329    Any
        //  67     75     324    329    Any
        //  79     100    324    329    Any
        //  103    121    324    329    Any
        //  126    143    324    329    Any
        //  146    156    324    329    Any
        //  166    188    324    329    Any
        //  195    202    324    329    Any
        //  280    307    324    329    Any
        //  329    332    332    339    Any
        //  334    339    324    329    Any
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
    
    @Override
    public final File k(final long p0, final long p1, final String p2) throws CacheException {
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
        //    18: getfield        com/google/android/exoplayer2/upstream/cache/c.c:Lzc/g;
        //    21: aload           5
        //    23: invokevirtual   zc/g.c:(Ljava/lang/String;)Lzc/f;
        //    26: astore          5
        //    28: aload           5
        //    30: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    33: pop            
        //    34: aload           5
        //    36: lload_1        
        //    37: lload_3        
        //    38: invokevirtual   zc/f.c:(JJ)Z
        //    41: invokestatic    ad/d0.f:(Z)V
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
        //   123: getfield        zc/f.a:I
        //   126: lload_1        
        //   127: lload_3        
        //   128: invokestatic    zc/n.d:(Ljava/io/File;IJJ)Ljava/io/File;
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
        //  throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException
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
    
    @Override
    public final void l(final File file, long a) throws CacheException {
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
            d0.f(c2.c(((d)c).g, ((d)c).h));
            a = zc.h.a((h)c2.e);
            if (a != -1L) {
                d0.f(((d)c).g + ((d)c).h <= a);
            }
            if (this.d != null) {
                final String name = file.getName();
                try {
                    this.d.d(((d)c).h, ((d)c).k, name);
                }
                catch (final IOException ex) {
                    throw new CacheException(ex);
                }
            }
            this.n(c);
            try {
                this.c.g();
                this.notifyAll();
            }
            catch (final IOException ex2) {
                throw new CacheException(ex2);
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
                ((a)list.get(size)).e(this, (d)n);
            }
        }
        ((a)this.b).e(this, (d)n);
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
                        zc.a a2;
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
                        final zc.b d2 = this.d;
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
                        ((a)list.get(size)).d(d);
                    }
                }
                ((a)this.b).d(d);
            }
        }
    }
    
    public final void s() {
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = (Iterator<Object>)Collections.unmodifiableCollection((Collection<? extends f>)this.c.a.values()).iterator();
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
        final zc.b d = this.d;
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
        d0.f(c.c.remove(n));
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
                Log.w("CachedContent", b.e(value2.length() + (value.length() + 21), "Failed to rename ", value, " to ", value2));
            }
        }
        d0.f(((d)n).i);
        final n n2 = new n(((d)n).f, ((d)n).g, ((d)n).h, currentTimeMillis, i);
        c.c.add(n2);
        final ArrayList list = this.e.get(((d)n).f);
        if (list != null) {
            int size = list.size();
            while (--size >= 0) {
                ((a)list.get(size)).b(this, (d)n, n2);
            }
        }
        ((a)this.b).b(this, (d)n, n2);
        return n2;
    }
}
