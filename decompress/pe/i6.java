// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.concurrent.atomic.AtomicReference;

public final class i6 implements Runnable
{
    public final /* synthetic */ AtomicReference f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ q7 i;
    public final /* synthetic */ l6 j;
    
    public i6(final l6 j, final AtomicReference f, final String g, final String h, final q7 i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        pe/i6.j:Lpe/l6;
        //    11: astore_2       
        //    12: aload_2        
        //    13: getfield        pe/l6.i:Lpe/u2;
        //    16: astore_3       
        //    17: aload_3        
        //    18: ifnonnull       68
        //    21: aload_2        
        //    22: getfield        z0/d1.f:Ljava/lang/Object;
        //    25: checkcast       Lpe/h4;
        //    28: invokevirtual   pe/h4.h:()Lpe/d3;
        //    31: getfield        pe/d3.k:Lpe/b3;
        //    34: aconst_null    
        //    35: ldc             "(legacy) Failed to get conditional properties; not connected to service"
        //    37: aload_0        
        //    38: getfield        pe/i6.g:Ljava/lang/String;
        //    41: aload_0        
        //    42: getfield        pe/i6.h:Ljava/lang/String;
        //    45: invokevirtual   pe/b3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //    48: aload_0        
        //    49: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //    52: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    55: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    58: aload_0        
        //    59: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //    62: invokevirtual   java/lang/Object.notify:()V
        //    65: aload_1        
        //    66: monitorexit    
        //    67: return         
        //    68: aconst_null    
        //    69: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    72: ifeq            110
        //    75: aload_0        
        //    76: getfield        pe/i6.i:Lpe/q7;
        //    79: invokestatic    lw0/b.R:(Ljava/lang/Object;)V
        //    82: aload_0        
        //    83: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //    86: aload_3        
        //    87: aload_0        
        //    88: getfield        pe/i6.g:Ljava/lang/String;
        //    91: aload_0        
        //    92: getfield        pe/i6.h:Ljava/lang/String;
        //    95: aload_0        
        //    96: getfield        pe/i6.i:Lpe/q7;
        //    99: invokeinterface pe/u2.G0:(Ljava/lang/String;Ljava/lang/String;Lpe/q7;)Ljava/util/List;
        //   104: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   107: goto            132
        //   110: aload_0        
        //   111: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //   114: aload_3        
        //   115: aconst_null    
        //   116: aload_0        
        //   117: getfield        pe/i6.g:Ljava/lang/String;
        //   120: aload_0        
        //   121: getfield        pe/i6.h:Ljava/lang/String;
        //   124: invokeinterface pe/u2.g0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
        //   129: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   132: aload_0        
        //   133: getfield        pe/i6.j:Lpe/l6;
        //   136: invokevirtual   pe/l6.X:()V
        //   139: aload_0        
        //   140: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //   143: astore_2       
        //   144: goto            194
        //   147: astore_2       
        //   148: goto            201
        //   151: astore_2       
        //   152: aload_0        
        //   153: getfield        pe/i6.j:Lpe/l6;
        //   156: getfield        z0/d1.f:Ljava/lang/Object;
        //   159: checkcast       Lpe/h4;
        //   162: invokevirtual   pe/h4.h:()Lpe/d3;
        //   165: getfield        pe/d3.k:Lpe/b3;
        //   168: aconst_null    
        //   169: ldc             "(legacy) Failed to get conditional properties; remote exception"
        //   171: aload_0        
        //   172: getfield        pe/i6.g:Ljava/lang/String;
        //   175: aload_2        
        //   176: invokevirtual   pe/b3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   179: aload_0        
        //   180: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //   183: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   186: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   189: aload_0        
        //   190: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //   193: astore_2       
        //   194: aload_2        
        //   195: invokevirtual   java/lang/Object.notify:()V
        //   198: aload_1        
        //   199: monitorexit    
        //   200: return         
        //   201: aload_0        
        //   202: getfield        pe/i6.f:Ljava/util/concurrent/atomic/AtomicReference;
        //   205: invokevirtual   java/lang/Object.notify:()V
        //   208: aload_2        
        //   209: athrow         
        //   210: astore_2       
        //   211: aload_1        
        //   212: monitorexit    
        //   213: aload_2        
        //   214: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      17     151    194    Landroid/os/RemoteException;
        //  7      17     147    151    Any
        //  21     58     151    194    Landroid/os/RemoteException;
        //  21     58     147    151    Any
        //  58     67     210    215    Any
        //  68     107    151    194    Landroid/os/RemoteException;
        //  68     107    147    151    Any
        //  110    132    151    194    Landroid/os/RemoteException;
        //  110    132    147    151    Any
        //  132    139    151    194    Landroid/os/RemoteException;
        //  132    139    147    151    Any
        //  139    144    210    215    Any
        //  152    189    147    151    Any
        //  189    194    210    215    Any
        //  194    200    210    215    Any
        //  201    210    210    215    Any
        //  211    213    210    215    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
