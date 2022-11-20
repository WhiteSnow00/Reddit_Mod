// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import e2.h;
import gc2.a;

public final class k extends a
{
    public final boolean g;
    public final h h;
    public final e.f i;
    
    public k(final e.f i, final Object[] array, final h h) {
        this.i = i;
        this.g = false;
        this.h = h;
        super("OkHttp %s ACK Settings", array);
    }
    
    @Override
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        lc2/k.i:Llc2/e$f;
        //     4: astore          11
        //     6: aload_0        
        //     7: getfield        lc2/k.g:Z
        //    10: istore          8
        //    12: aload_0        
        //    13: getfield        lc2/k.h:Le2/h;
        //    16: astore          9
        //    18: aload           11
        //    20: getfield        lc2/e$f.h:Llc2/e;
        //    23: getfield        lc2/e.v:Llc2/o;
        //    26: astore          10
        //    28: aload           10
        //    30: monitorenter   
        //    31: aload           11
        //    33: getfield        lc2/e$f.h:Llc2/e;
        //    36: astore          12
        //    38: aload           12
        //    40: monitorenter   
        //    41: aload           11
        //    43: getfield        lc2/e$f.h:Llc2/e;
        //    46: getfield        lc2/e.t:Le2/h;
        //    49: invokevirtual   e2/h.a:()I
        //    52: istore_3       
        //    53: iload           8
        //    55: ifeq            83
        //    58: aload           11
        //    60: getfield        lc2/e$f.h:Llc2/e;
        //    63: getfield        lc2/e.t:Le2/h;
        //    66: astore          13
        //    68: aload           13
        //    70: iconst_0       
        //    71: putfield        e2/h.a:I
        //    74: aload           13
        //    76: getfield        e2/h.b:[I
        //    79: iconst_0       
        //    80: invokestatic    java/util/Arrays.fill:([II)V
        //    83: aload           11
        //    85: getfield        lc2/e$f.h:Llc2/e;
        //    88: getfield        lc2/e.t:Le2/h;
        //    91: astore          13
        //    93: aload           13
        //    95: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    98: pop            
        //    99: iconst_0       
        //   100: istore_1       
        //   101: iconst_1       
        //   102: istore_2       
        //   103: iload_1        
        //   104: bipush          10
        //   106: if_icmpge       157
        //   109: iconst_1       
        //   110: iload_1        
        //   111: ishl           
        //   112: aload           9
        //   114: getfield        e2/h.a:I
        //   117: iand           
        //   118: ifeq            124
        //   121: goto            126
        //   124: iconst_0       
        //   125: istore_2       
        //   126: iload_2        
        //   127: ifne            133
        //   130: goto            146
        //   133: aload           13
        //   135: iload_1        
        //   136: aload           9
        //   138: getfield        e2/h.b:[I
        //   141: iload_1        
        //   142: iaload         
        //   143: invokevirtual   e2/h.f:(II)V
        //   146: iinc            1, 1
        //   149: goto            101
        //   152: astore          9
        //   154: goto            392
        //   157: aload           11
        //   159: getfield        lc2/e$f.h:Llc2/e;
        //   162: getfield        lc2/e.t:Le2/h;
        //   165: invokevirtual   e2/h.a:()I
        //   168: istore_1       
        //   169: aconst_null    
        //   170: astore          9
        //   172: iload_1        
        //   173: iconst_m1      
        //   174: if_icmpeq       252
        //   177: iload_1        
        //   178: iload_3        
        //   179: if_icmpeq       252
        //   182: iload_1        
        //   183: iload_3        
        //   184: isub           
        //   185: i2l            
        //   186: lstore          6
        //   188: lload           6
        //   190: lstore          4
        //   192: aload           11
        //   194: getfield        lc2/e$f.h:Llc2/e;
        //   197: getfield        lc2/e.h:Ljava/util/LinkedHashMap;
        //   200: invokeinterface java/util/Map.isEmpty:()Z
        //   205: ifne            255
        //   208: aload           11
        //   210: getfield        lc2/e$f.h:Llc2/e;
        //   213: getfield        lc2/e.h:Ljava/util/LinkedHashMap;
        //   216: invokevirtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //   219: aload           11
        //   221: getfield        lc2/e$f.h:Llc2/e;
        //   224: getfield        lc2/e.h:Ljava/util/LinkedHashMap;
        //   227: invokeinterface java/util/Map.size:()I
        //   232: anewarray       Llc2/n;
        //   235: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   240: checkcast       [Llc2/n;
        //   243: astore          9
        //   245: lload           6
        //   247: lstore          4
        //   249: goto            255
        //   252: lconst_0       
        //   253: lstore          4
        //   255: aload           12
        //   257: monitorexit    
        //   258: aload           11
        //   260: getfield        lc2/e$f.h:Llc2/e;
        //   263: astore          12
        //   265: aload           12
        //   267: getfield        lc2/e.v:Llc2/o;
        //   270: aload           12
        //   272: getfield        lc2/e.t:Le2/h;
        //   275: invokevirtual   lc2/o.a:(Le2/h;)V
        //   278: goto            291
        //   281: astore          12
        //   283: aload           11
        //   285: getfield        lc2/e$f.h:Llc2/e;
        //   288: invokevirtual   lc2/e.b:()V
        //   291: aload           10
        //   293: monitorexit    
        //   294: aload           9
        //   296: ifnull          361
        //   299: aload           9
        //   301: arraylength    
        //   302: istore_2       
        //   303: iconst_0       
        //   304: istore_1       
        //   305: iload_1        
        //   306: iload_2        
        //   307: if_icmpge       361
        //   310: aload           9
        //   312: iload_1        
        //   313: aaload         
        //   314: astore          10
        //   316: aload           10
        //   318: monitorenter   
        //   319: aload           10
        //   321: aload           10
        //   323: getfield        lc2/n.b:J
        //   326: lload           4
        //   328: ladd           
        //   329: putfield        lc2/n.b:J
        //   332: lload           4
        //   334: lconst_0       
        //   335: lcmp           
        //   336: ifle            344
        //   339: aload           10
        //   341: invokevirtual   java/lang/Object.notifyAll:()V
        //   344: aload           10
        //   346: monitorexit    
        //   347: iinc            1, 1
        //   350: goto            305
        //   353: astore          9
        //   355: aload           10
        //   357: monitorexit    
        //   358: aload           9
        //   360: athrow         
        //   361: getstatic       lc2/e.y:Ljava/util/concurrent/ThreadPoolExecutor;
        //   364: new             Llc2/l;
        //   367: dup            
        //   368: aload           11
        //   370: iconst_1       
        //   371: anewarray       Ljava/lang/Object;
        //   374: dup            
        //   375: iconst_0       
        //   376: aload           11
        //   378: getfield        lc2/e$f.h:Llc2/e;
        //   381: getfield        lc2/e.i:Ljava/lang/String;
        //   384: aastore        
        //   385: invokespecial   lc2/l.<init>:(Llc2/e$f;[Ljava/lang/Object;)V
        //   388: invokevirtual   java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //   391: return         
        //   392: aload           12
        //   394: monitorexit    
        //   395: aload           9
        //   397: athrow         
        //   398: astore          9
        //   400: aload           10
        //   402: monitorexit    
        //   403: aload           9
        //   405: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     41     398    406    Any
        //  41     53     152    398    Any
        //  58     83     152    398    Any
        //  83     99     152    398    Any
        //  109    121    152    398    Any
        //  133    146    152    398    Any
        //  157    169    152    398    Any
        //  192    245    152    398    Any
        //  255    258    152    398    Any
        //  258    278    281    291    Ljava/io/IOException;
        //  258    278    398    406    Any
        //  283    291    398    406    Any
        //  291    294    398    406    Any
        //  319    332    353    361    Any
        //  339    344    353    361    Any
        //  344    347    353    361    Any
        //  355    358    353    361    Any
        //  392    395    152    398    Any
        //  395    398    398    406    Any
        //  400    403    398    406    Any
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
