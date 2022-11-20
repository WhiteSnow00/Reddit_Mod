// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import io.branch.referral.l;
import java.util.concurrent.CountDownLatch;

public final class h implements Runnable
{
    public final CountDownLatch f;
    public final l g;
    
    public h(final l g, final CountDownLatch f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        qe2/h.g:Lio/branch/referral/l;
        //     4: getfield        io/branch/referral/l.a:Ljava/lang/ref/WeakReference;
        //     7: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    10: checkcast       Landroid/content/Context;
        //    13: astore          4
        //    15: aload           4
        //    17: ifnull          198
        //    20: bipush          -19
        //    22: invokestatic    android/os/Process.setThreadPriority:(I)V
        //    25: aload_0        
        //    26: getfield        qe2/h.g:Lio/branch/referral/l;
        //    29: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    32: pop            
        //    33: ldc             Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;.class
        //    35: ldc             "getAdvertisingIdInfo"
        //    37: iconst_1       
        //    38: anewarray       Ljava/lang/Class;
        //    41: dup            
        //    42: iconst_0       
        //    43: ldc             Landroid/content/Context;.class
        //    45: aastore        
        //    46: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    49: aconst_null    
        //    50: iconst_1       
        //    51: anewarray       Ljava/lang/Object;
        //    54: dup            
        //    55: iconst_0       
        //    56: aload           4
        //    58: aastore        
        //    59: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    62: astore_1       
        //    63: goto            69
        //    66: astore_1       
        //    67: aconst_null    
        //    68: astore_1       
        //    69: invokestatic    io/branch/referral/k.c:()Lio/branch/referral/k;
        //    72: astore_3       
        //    73: aload_3        
        //    74: astore_2       
        //    75: aload_3        
        //    76: ifnonnull       89
        //    79: new             Lio/branch/referral/k;
        //    82: dup            
        //    83: aload           4
        //    85: invokespecial   io/branch/referral/k.<init>:(Landroid/content/Context;)V
        //    88: astore_2       
        //    89: aload_2        
        //    90: getfield        io/branch/referral/k.a:Lio/branch/referral/k$a;
        //    93: astore_2       
        //    94: aload_2        
        //    95: ifnull          198
        //    98: aload_0        
        //    99: getfield        qe2/h.g:Lio/branch/referral/l;
        //   102: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   105: pop            
        //   106: aload_1        
        //   107: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   110: ldc             "isLimitAdTrackingEnabled"
        //   112: iconst_0       
        //   113: anewarray       Ljava/lang/Class;
        //   116: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   119: aload_1        
        //   120: iconst_0       
        //   121: anewarray       Ljava/lang/Object;
        //   124: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   127: astore_3       
        //   128: aload_3        
        //   129: instanceof      Ljava/lang/Boolean;
        //   132: ifeq            146
        //   135: aload_2        
        //   136: aload_3        
        //   137: checkcast       Ljava/lang/Boolean;
        //   140: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   143: putfield        io/branch/referral/f0.b:I
        //   146: aload_2        
        //   147: getfield        io/branch/referral/f0.b:I
        //   150: iconst_1       
        //   151: if_icmpne       162
        //   154: aload_2        
        //   155: aconst_null    
        //   156: putfield        io/branch/referral/f0.a:Ljava/lang/String;
        //   159: goto            198
        //   162: aload_0        
        //   163: getfield        qe2/h.g:Lio/branch/referral/l;
        //   166: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   169: pop            
        //   170: aload_2        
        //   171: aload_1        
        //   172: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   175: ldc             "getId"
        //   177: iconst_0       
        //   178: anewarray       Ljava/lang/Class;
        //   181: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   184: aload_1        
        //   185: iconst_0       
        //   186: anewarray       Ljava/lang/Object;
        //   189: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   192: checkcast       Ljava/lang/String;
        //   195: putfield        io/branch/referral/f0.a:Ljava/lang/String;
        //   198: aload_0        
        //   199: getfield        qe2/h.f:Ljava/util/concurrent/CountDownLatch;
        //   202: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   205: return         
        //   206: astore_3       
        //   207: goto            146
        //   210: astore_1       
        //   211: goto            198
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  33     63     66     69     Ljava/lang/Exception;
        //  106    146    206    210    Ljava/lang/Exception;
        //  170    198    210    214    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0198:
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
