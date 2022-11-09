// 
// Decompiled by Procyon v0.6.0
// 

package t8;

import java.io.File;

public final class d implements a
{
    public final j f;
    public final File g;
    public final long h;
    public final b i;
    public j8.a j;
    
    @Deprecated
    public d(final File g, final long h) {
        this.i = new b();
        this.g = g;
        this.h = h;
        this.f = new j();
    }
    
    @Override
    public final File g(final p8.d p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        t8/d.f:Lt8/j;
        //     4: aload_1        
        //     5: invokevirtual   t8/j.a:(Lp8/d;)Ljava/lang/String;
        //     8: astore_2       
        //     9: ldc             "DiskLruCacheWrapper"
        //    11: iconst_2       
        //    12: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    15: ifeq            62
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: invokespecial   java/lang/StringBuilder.<init>:()V
        //    25: astore_3       
        //    26: aload_3        
        //    27: ldc             "Get: Obtained: "
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: pop            
        //    33: aload_3        
        //    34: aload_2        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: pop            
        //    39: aload_3        
        //    40: ldc             " for for Key: "
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: pop            
        //    46: aload_3        
        //    47: aload_1        
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: ldc             "DiskLruCacheWrapper"
        //    54: aload_3        
        //    55: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    58: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    61: pop            
        //    62: aconst_null    
        //    63: astore_3       
        //    64: aload_0        
        //    65: monitorenter   
        //    66: aload_0        
        //    67: getfield        t8/d.j:Lj8/a;
        //    70: ifnonnull       88
        //    73: aload_0        
        //    74: aload_0        
        //    75: getfield        t8/d.g:Ljava/io/File;
        //    78: aload_0        
        //    79: getfield        t8/d.h:J
        //    82: invokestatic    j8/a.r:(Ljava/io/File;J)Lj8/a;
        //    85: putfield        t8/d.j:Lj8/a;
        //    88: aload_0        
        //    89: getfield        t8/d.j:Lj8/a;
        //    92: astore_1       
        //    93: aload_0        
        //    94: monitorexit    
        //    95: aload_1        
        //    96: aload_2        
        //    97: invokevirtual   j8/a.o:(Ljava/lang/String;)Lj8/a$e;
        //   100: astore_2       
        //   101: aload_3        
        //   102: astore_1       
        //   103: aload_2        
        //   104: ifnull          148
        //   107: aload_2        
        //   108: getfield        j8/a$e.a:[Ljava/io/File;
        //   111: iconst_0       
        //   112: aaload         
        //   113: astore_1       
        //   114: goto            148
        //   117: astore_2       
        //   118: goto            126
        //   121: astore_1       
        //   122: aload_0        
        //   123: monitorexit    
        //   124: aload_1        
        //   125: athrow         
        //   126: aload_3        
        //   127: astore_1       
        //   128: ldc             "DiskLruCacheWrapper"
        //   130: iconst_5       
        //   131: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   134: ifeq            148
        //   137: ldc             "DiskLruCacheWrapper"
        //   139: ldc             "Unable to get from disk cache"
        //   141: aload_2        
        //   142: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   145: pop            
        //   146: aload_3        
        //   147: astore_1       
        //   148: aload_1        
        //   149: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  64     66     117    148    Ljava/io/IOException;
        //  66     88     121    126    Any
        //  88     93     121    126    Any
        //  93     101    117    148    Ljava/io/IOException;
        //  107    114    117    148    Ljava/io/IOException;
        //  122    126    117    148    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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
    public final void l(final p8.d p0, final r8.d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        t8/d.f:Lt8/j;
        //     4: aload_1        
        //     5: invokevirtual   t8/j.a:(Lp8/d;)Ljava/lang/String;
        //     8: astore_3       
        //     9: aload_0        
        //    10: getfield        t8/d.i:Lt8/b;
        //    13: astore          4
        //    15: aload           4
        //    17: monitorenter   
        //    18: aload           4
        //    20: getfield        t8/b.a:Ljava/util/HashMap;
        //    23: aload_3        
        //    24: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    27: checkcast       Lt8/b$a;
        //    30: astore          5
        //    32: aload           5
        //    34: astore          6
        //    36: aload           5
        //    38: ifnonnull       114
        //    41: aload           4
        //    43: getfield        t8/b.b:Lt8/b$b;
        //    46: astore          5
        //    48: aload           5
        //    50: getfield        t8/b$b.a:Ljava/util/ArrayDeque;
        //    53: astore          6
        //    55: aload           6
        //    57: monitorenter   
        //    58: aload           5
        //    60: getfield        t8/b$b.a:Ljava/util/ArrayDeque;
        //    63: invokevirtual   java/util/ArrayDeque.poll:()Ljava/lang/Object;
        //    66: checkcast       Lt8/b$a;
        //    69: astore          5
        //    71: aload           6
        //    73: monitorexit    
        //    74: aload           5
        //    76: astore          6
        //    78: aload           5
        //    80: ifnonnull       93
        //    83: new             Lt8/b$a;
        //    86: astore          6
        //    88: aload           6
        //    90: invokespecial   t8/b$a.<init>:()V
        //    93: aload           4
        //    95: getfield        t8/b.a:Ljava/util/HashMap;
        //    98: aload_3        
        //    99: aload           6
        //   101: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   104: pop            
        //   105: goto            114
        //   108: astore_1       
        //   109: aload           6
        //   111: monitorexit    
        //   112: aload_1        
        //   113: athrow         
        //   114: aload           6
        //   116: aload           6
        //   118: getfield        t8/b$a.b:I
        //   121: iconst_1       
        //   122: iadd           
        //   123: putfield        t8/b$a.b:I
        //   126: aload           4
        //   128: monitorexit    
        //   129: aload           6
        //   131: getfield        t8/b$a.a:Ljava/util/concurrent/locks/ReentrantLock;
        //   134: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //   137: ldc             "DiskLruCacheWrapper"
        //   139: iconst_2       
        //   140: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   143: ifeq            197
        //   146: new             Ljava/lang/StringBuilder;
        //   149: astore          6
        //   151: aload           6
        //   153: invokespecial   java/lang/StringBuilder.<init>:()V
        //   156: aload           6
        //   158: ldc             "Put: Obtained: "
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: pop            
        //   164: aload           6
        //   166: aload_3        
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: pop            
        //   171: aload           6
        //   173: ldc             " for for Key: "
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: pop            
        //   179: aload           6
        //   181: aload_1        
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   185: pop            
        //   186: ldc             "DiskLruCacheWrapper"
        //   188: aload           6
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   196: pop            
        //   197: aload_0        
        //   198: monitorenter   
        //   199: aload_0        
        //   200: getfield        t8/d.j:Lj8/a;
        //   203: ifnonnull       221
        //   206: aload_0        
        //   207: aload_0        
        //   208: getfield        t8/d.g:Ljava/io/File;
        //   211: aload_0        
        //   212: getfield        t8/d.h:J
        //   215: invokestatic    j8/a.r:(Ljava/io/File;J)Lj8/a;
        //   218: putfield        t8/d.j:Lj8/a;
        //   221: aload_0        
        //   222: getfield        t8/d.j:Lj8/a;
        //   225: astore_1       
        //   226: aload_0        
        //   227: monitorexit    
        //   228: aload_1        
        //   229: aload_3        
        //   230: invokevirtual   j8/a.o:(Ljava/lang/String;)Lj8/a$e;
        //   233: astore          6
        //   235: aload           6
        //   237: ifnull          249
        //   240: aload_0        
        //   241: getfield        t8/d.i:Lt8/b;
        //   244: aload_3        
        //   245: invokevirtual   t8/b.a:(Ljava/lang/String;)V
        //   248: return         
        //   249: aload_1        
        //   250: aload_3        
        //   251: invokevirtual   j8/a.h:(Ljava/lang/String;)Lj8/a$c;
        //   254: astore_1       
        //   255: aload_1        
        //   256: ifnull          341
        //   259: aload_1        
        //   260: invokevirtual   j8/a$c.b:()Ljava/io/File;
        //   263: astore          6
        //   265: aload_2        
        //   266: getfield        r8/d.a:Lp8/a;
        //   269: aload_2        
        //   270: getfield        r8/d.b:Ljava/lang/Object;
        //   273: aload           6
        //   275: aload_2        
        //   276: getfield        r8/d.c:Lp8/g;
        //   279: invokeinterface p8/a.b:(Ljava/lang/Object;Ljava/io/File;Lp8/g;)Z
        //   284: ifeq            301
        //   287: aload_1        
        //   288: getfield        j8/a$c.d:Lj8/a;
        //   291: aload_1        
        //   292: iconst_1       
        //   293: invokestatic    j8/a.a:(Lj8/a;Lj8/a$c;Z)V
        //   296: aload_1        
        //   297: iconst_1       
        //   298: putfield        j8/a$c.c:Z
        //   301: aload_1        
        //   302: getfield        j8/a$c.c:Z
        //   305: istore          7
        //   307: iload           7
        //   309: ifne            240
        //   312: aload_1        
        //   313: invokevirtual   j8/a$c.a:()V
        //   316: goto            240
        //   319: astore_1       
        //   320: goto            381
        //   323: astore_2       
        //   324: aload_1        
        //   325: getfield        j8/a$c.c:Z
        //   328: istore          7
        //   330: iload           7
        //   332: ifne            339
        //   335: aload_1        
        //   336: invokevirtual   j8/a$c.a:()V
        //   339: aload_2        
        //   340: athrow         
        //   341: new             Ljava/lang/IllegalStateException;
        //   344: astore_2       
        //   345: new             Ljava/lang/StringBuilder;
        //   348: astore_1       
        //   349: aload_1        
        //   350: invokespecial   java/lang/StringBuilder.<init>:()V
        //   353: aload_1        
        //   354: ldc             "Had two simultaneous puts for: "
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: pop            
        //   360: aload_1        
        //   361: aload_3        
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: pop            
        //   366: aload_2        
        //   367: aload_1        
        //   368: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   371: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   374: aload_2        
        //   375: athrow         
        //   376: astore_1       
        //   377: aload_0        
        //   378: monitorexit    
        //   379: aload_1        
        //   380: athrow         
        //   381: ldc             "DiskLruCacheWrapper"
        //   383: iconst_5       
        //   384: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   387: ifeq            240
        //   390: ldc             "DiskLruCacheWrapper"
        //   392: ldc             "Unable to put to disk cache"
        //   394: aload_1        
        //   395: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   398: pop            
        //   399: goto            240
        //   402: astore_1       
        //   403: aload_0        
        //   404: getfield        t8/d.i:Lt8/b;
        //   407: aload_3        
        //   408: invokevirtual   t8/b.a:(Ljava/lang/String;)V
        //   411: aload_1        
        //   412: athrow         
        //   413: astore_1       
        //   414: aload           4
        //   416: monitorexit    
        //   417: aload_1        
        //   418: athrow         
        //   419: astore_1       
        //   420: goto            240
        //   423: astore_1       
        //   424: goto            339
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     32     413    419    Any
        //  41     58     413    419    Any
        //  58     74     108    114    Any
        //  83     93     413    419    Any
        //  93     105    413    419    Any
        //  109    112    108    114    Any
        //  112    114    413    419    Any
        //  114    129    413    419    Any
        //  137    197    402    413    Any
        //  197    199    319    402    Ljava/io/IOException;
        //  197    199    402    413    Any
        //  199    221    376    381    Any
        //  221    226    376    381    Any
        //  226    235    319    402    Ljava/io/IOException;
        //  226    235    402    413    Any
        //  249    255    319    402    Ljava/io/IOException;
        //  249    255    402    413    Any
        //  259    301    323    341    Any
        //  301    307    319    402    Ljava/io/IOException;
        //  301    307    402    413    Any
        //  312    316    419    423    Ljava/io/IOException;
        //  312    316    402    413    Any
        //  324    330    319    402    Ljava/io/IOException;
        //  324    330    402    413    Any
        //  335    339    423    427    Ljava/io/IOException;
        //  335    339    402    413    Any
        //  339    341    319    402    Ljava/io/IOException;
        //  339    341    402    413    Any
        //  341    376    319    402    Ljava/io/IOException;
        //  341    376    402    413    Any
        //  377    381    319    402    Ljava/io/IOException;
        //  377    381    402    413    Any
        //  381    399    402    413    Any
        //  414    417    413    419    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 220, Size: 220
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
}
