// 
// Decompiled by Procyon v0.6.0
// 

package pe;

public final class q2
{
    public static final Object g;
    public final String a = a;
    public final p2 b = b;
    public final Object c = c;
    public final Object d = d;
    public final Object e = new Object();
    public volatile Object f = null;
    
    static {
        g = new Object();
    }
    
    public final Object a(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pe/q2.e:Ljava/lang/Object;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_2        
        //     8: monitorexit    
        //     9: aload_1        
        //    10: ifnull          15
        //    13: aload_1        
        //    14: areturn        
        //    15: getstatic       ml0/a.s:Lh3/b;
        //    18: ifnonnull       26
        //    21: aload_0        
        //    22: getfield        pe/q2.c:Ljava/lang/Object;
        //    25: areturn        
        //    26: getstatic       pe/q2.g:Ljava/lang/Object;
        //    29: astore_2       
        //    30: aload_2        
        //    31: monitorenter   
        //    32: invokestatic    h3/b.c:()Z
        //    35: ifeq            62
        //    38: aload_0        
        //    39: getfield        pe/q2.f:Ljava/lang/Object;
        //    42: ifnonnull       53
        //    45: aload_0        
        //    46: getfield        pe/q2.c:Ljava/lang/Object;
        //    49: astore_1       
        //    50: goto            58
        //    53: aload_0        
        //    54: getfield        pe/q2.f:Ljava/lang/Object;
        //    57: astore_1       
        //    58: aload_2        
        //    59: monitorexit    
        //    60: aload_1        
        //    61: areturn        
        //    62: aload_2        
        //    63: monitorexit    
        //    64: getstatic       pe/r2.a:Ljava/util/List;
        //    67: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    72: astore_3       
        //    73: aload_3        
        //    74: invokeinterface java/util/Iterator.hasNext:()Z
        //    79: ifeq            161
        //    82: aload_3        
        //    83: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    88: checkcast       Lpe/q2;
        //    91: astore          4
        //    93: invokestatic    h3/b.c:()Z
        //    96: istore          5
        //    98: iload           5
        //   100: ifne            149
        //   103: aconst_null    
        //   104: astore_2       
        //   105: aload           4
        //   107: getfield        pe/q2.b:Lpe/p2;
        //   110: astore          6
        //   112: aload_2        
        //   113: astore_1       
        //   114: aload           6
        //   116: ifnull          127
        //   119: aload           6
        //   121: invokeinterface pe/p2.zza:()Ljava/lang/Object;
        //   126: astore_1       
        //   127: getstatic       pe/q2.g:Ljava/lang/Object;
        //   130: astore_2       
        //   131: aload_2        
        //   132: monitorenter   
        //   133: aload           4
        //   135: aload_1        
        //   136: putfield        pe/q2.f:Ljava/lang/Object;
        //   139: aload_2        
        //   140: monitorexit    
        //   141: goto            73
        //   144: astore_1       
        //   145: aload_2        
        //   146: monitorexit    
        //   147: aload_1        
        //   148: athrow         
        //   149: new             Ljava/lang/IllegalStateException;
        //   152: astore_1       
        //   153: aload_1        
        //   154: ldc             "Refreshing flag cache must be done on a worker thread."
        //   156: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   159: aload_1        
        //   160: athrow         
        //   161: aload_0        
        //   162: getfield        pe/q2.b:Lpe/p2;
        //   165: astore_1       
        //   166: aload_1        
        //   167: ifnonnull       175
        //   170: aload_0        
        //   171: getfield        pe/q2.c:Ljava/lang/Object;
        //   174: areturn        
        //   175: aload_1        
        //   176: invokeinterface pe/p2.zza:()Ljava/lang/Object;
        //   181: astore_1       
        //   182: aload_1        
        //   183: areturn        
        //   184: astore_1       
        //   185: aload_0        
        //   186: getfield        pe/q2.c:Ljava/lang/Object;
        //   189: areturn        
        //   190: astore_1       
        //   191: aload_0        
        //   192: getfield        pe/q2.c:Ljava/lang/Object;
        //   195: areturn        
        //   196: astore_1       
        //   197: aload_2        
        //   198: monitorexit    
        //   199: aload_1        
        //   200: athrow         
        //   201: astore_1       
        //   202: aload_2        
        //   203: monitorexit    
        //   204: aload_1        
        //   205: athrow         
        //   206: astore_1       
        //   207: goto            161
        //   210: astore_1       
        //   211: aload_2        
        //   212: astore_1       
        //   213: goto            127
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      9      201    206    Any
        //  32     50     196    201    Any
        //  53     58     196    201    Any
        //  58     60     196    201    Any
        //  62     64     196    201    Any
        //  64     73     206    210    Ljava/lang/SecurityException;
        //  73     98     206    210    Ljava/lang/SecurityException;
        //  105    112    210    216    Ljava/lang/IllegalStateException;
        //  105    112    206    210    Ljava/lang/SecurityException;
        //  119    127    210    216    Ljava/lang/IllegalStateException;
        //  119    127    206    210    Ljava/lang/SecurityException;
        //  127    133    206    210    Ljava/lang/SecurityException;
        //  133    141    144    149    Any
        //  145    147    144    149    Any
        //  147    149    206    210    Ljava/lang/SecurityException;
        //  149    161    206    210    Ljava/lang/SecurityException;
        //  175    182    190    196    Ljava/lang/SecurityException;
        //  175    182    184    190    Ljava/lang/IllegalStateException;
        //  197    199    196    201    Any
        //  202    204    201    206    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 123, Size: 123
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
