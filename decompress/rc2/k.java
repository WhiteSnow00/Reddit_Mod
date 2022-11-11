// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import z0.w;
import od.g0;

public final class k extends g0
{
    public final /* synthetic */ boolean h;
    public final /* synthetic */ w i;
    public final /* synthetic */ e.f j;
    
    public k(final e.f j, final Object[] array, final w i) {
        this.j = j;
        this.h = false;
        this.i = i;
        super("OkHttp %s ACK Settings", array);
    }
    
    @Override
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        rc2/k.j:Lrc2/e$f;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        rc2/k.h:Z
        //     9: istore_2       
        //    10: aload_0        
        //    11: getfield        rc2/k.i:Lz0/w;
        //    14: astore_3       
        //    15: aload_1        
        //    16: getfield        rc2/e$f.i:Lrc2/e;
        //    19: getfield        rc2/e.v:Lrc2/o;
        //    22: astore          4
        //    24: aload           4
        //    26: monitorenter   
        //    27: aload_1        
        //    28: getfield        rc2/e$f.i:Lrc2/e;
        //    31: astore          5
        //    33: aload           5
        //    35: monitorenter   
        //    36: aload_1        
        //    37: getfield        rc2/e$f.i:Lrc2/e;
        //    40: getfield        rc2/e.t:Lz0/w;
        //    43: invokevirtual   z0/w.b:()I
        //    46: istore          6
        //    48: iload_2        
        //    49: ifeq            62
        //    52: aload_1        
        //    53: getfield        rc2/e$f.i:Lrc2/e;
        //    56: getfield        rc2/e.t:Lz0/w;
        //    59: invokevirtual   z0/w.a:()V
        //    62: aload_1        
        //    63: getfield        rc2/e$f.i:Lrc2/e;
        //    66: getfield        rc2/e.t:Lz0/w;
        //    69: astore          7
        //    71: aload           7
        //    73: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    76: pop            
        //    77: iconst_0       
        //    78: istore          8
        //    80: iconst_1       
        //    81: istore          9
        //    83: iload           8
        //    85: bipush          10
        //    87: if_icmpge       143
        //    90: iconst_1       
        //    91: iload           8
        //    93: ishl           
        //    94: aload_3        
        //    95: getfield        z0/w.b:I
        //    98: iand           
        //    99: ifeq            105
        //   102: goto            108
        //   105: iconst_0       
        //   106: istore          9
        //   108: iload           9
        //   110: ifne            116
        //   113: goto            133
        //   116: aload           7
        //   118: iload           8
        //   120: aload_3        
        //   121: getfield        z0/w.c:Ljava/lang/Object;
        //   124: checkcast       [I
        //   127: iload           8
        //   129: iaload         
        //   130: invokevirtual   z0/w.e:(II)V
        //   133: iinc            8, 1
        //   136: goto            80
        //   139: astore_3       
        //   140: goto            374
        //   143: aload_1        
        //   144: getfield        rc2/e$f.i:Lrc2/e;
        //   147: getfield        rc2/e.t:Lz0/w;
        //   150: invokevirtual   z0/w.b:()I
        //   153: istore          8
        //   155: aconst_null    
        //   156: astore_3       
        //   157: iload           8
        //   159: iconst_m1      
        //   160: if_icmpeq       238
        //   163: iload           8
        //   165: iload           6
        //   167: if_icmpeq       238
        //   170: iload           8
        //   172: iload           6
        //   174: isub           
        //   175: i2l            
        //   176: lstore          10
        //   178: lload           10
        //   180: lstore          12
        //   182: aload_1        
        //   183: getfield        rc2/e$f.i:Lrc2/e;
        //   186: getfield        rc2/e.h:Ljava/util/LinkedHashMap;
        //   189: invokeinterface java/util/Map.isEmpty:()Z
        //   194: ifne            241
        //   197: aload_1        
        //   198: getfield        rc2/e$f.i:Lrc2/e;
        //   201: getfield        rc2/e.h:Ljava/util/LinkedHashMap;
        //   204: invokevirtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //   207: aload_1        
        //   208: getfield        rc2/e$f.i:Lrc2/e;
        //   211: getfield        rc2/e.h:Ljava/util/LinkedHashMap;
        //   214: invokeinterface java/util/Map.size:()I
        //   219: anewarray       Lrc2/n;
        //   222: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   227: checkcast       [Lrc2/n;
        //   230: astore_3       
        //   231: lload           10
        //   233: lstore          12
        //   235: goto            241
        //   238: lconst_0       
        //   239: lstore          12
        //   241: aload           5
        //   243: monitorexit    
        //   244: aload_1        
        //   245: getfield        rc2/e$f.i:Lrc2/e;
        //   248: astore          5
        //   250: aload           5
        //   252: getfield        rc2/e.v:Lrc2/o;
        //   255: aload           5
        //   257: getfield        rc2/e.t:Lz0/w;
        //   260: invokevirtual   rc2/o.a:(Lz0/w;)V
        //   263: goto            275
        //   266: astore          5
        //   268: aload_1        
        //   269: getfield        rc2/e$f.i:Lrc2/e;
        //   272: invokevirtual   rc2/e.b:()V
        //   275: aload           4
        //   277: monitorexit    
        //   278: aload_3        
        //   279: ifnull          345
        //   282: aload_3        
        //   283: arraylength    
        //   284: istore          9
        //   286: iconst_0       
        //   287: istore          8
        //   289: iload           8
        //   291: iload           9
        //   293: if_icmpge       345
        //   296: aload_3        
        //   297: iload           8
        //   299: aaload         
        //   300: astore          4
        //   302: aload           4
        //   304: monitorenter   
        //   305: aload           4
        //   307: aload           4
        //   309: getfield        rc2/n.b:J
        //   312: lload           12
        //   314: ladd           
        //   315: putfield        rc2/n.b:J
        //   318: lload           12
        //   320: lconst_0       
        //   321: lcmp           
        //   322: ifle            330
        //   325: aload           4
        //   327: invokevirtual   java/lang/Object.notifyAll:()V
        //   330: aload           4
        //   332: monitorexit    
        //   333: iinc            8, 1
        //   336: goto            289
        //   339: astore_3       
        //   340: aload           4
        //   342: monitorexit    
        //   343: aload_3        
        //   344: athrow         
        //   345: getstatic       rc2/e.y:Ljava/util/concurrent/ThreadPoolExecutor;
        //   348: new             Lrc2/l;
        //   351: dup            
        //   352: aload_1        
        //   353: iconst_1       
        //   354: anewarray       Ljava/lang/Object;
        //   357: dup            
        //   358: iconst_0       
        //   359: aload_1        
        //   360: getfield        rc2/e$f.i:Lrc2/e;
        //   363: getfield        rc2/e.i:Ljava/lang/String;
        //   366: aastore        
        //   367: invokespecial   rc2/l.<init>:(Lrc2/e$f;[Ljava/lang/Object;)V
        //   370: invokevirtual   java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //   373: return         
        //   374: aload           5
        //   376: monitorexit    
        //   377: aload_3        
        //   378: athrow         
        //   379: astore_3       
        //   380: aload           4
        //   382: monitorexit    
        //   383: aload_3        
        //   384: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  27     36     379    385    Any
        //  36     48     139    379    Any
        //  52     62     139    379    Any
        //  62     77     139    379    Any
        //  90     102    139    379    Any
        //  116    133    139    379    Any
        //  143    155    139    379    Any
        //  182    231    139    379    Any
        //  241    244    139    379    Any
        //  244    263    266    275    Ljava/io/IOException;
        //  244    263    379    385    Any
        //  268    275    379    385    Any
        //  275    278    379    385    Any
        //  305    318    339    345    Any
        //  325    330    339    345    Any
        //  330    333    339    345    Any
        //  340    343    339    345    Any
        //  374    377    139    379    Any
        //  377    379    379    385    Any
        //  380    383    379    385    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
