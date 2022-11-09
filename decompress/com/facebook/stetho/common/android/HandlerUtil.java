// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import com.facebook.stetho.common.Util;
import com.facebook.stetho.common.UncheckedCallable;
import android.os.Looper;
import android.os.Handler;

public final class HandlerUtil
{
    private HandlerUtil() {
    }
    
    public static boolean checkThreadAccess(final Handler handler) {
        return Looper.myLooper() == handler.getLooper();
    }
    
    public static <V> V postAndWait(final Handler handler, final UncheckedCallable<V> uncheckedCallable) {
        if (checkThreadAccess(handler)) {
            try {
                return uncheckedCallable.call();
            }
            catch (final Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        return ((WaitableRunnable<V>)new HandlerUtil$1((UncheckedCallable)uncheckedCallable)).invoke(handler);
    }
    
    public static void postAndWait(final Handler handler, final Runnable runnable) {
        if (checkThreadAccess(handler)) {
            try {
                runnable.run();
                return;
            }
            catch (final RuntimeException ex) {
                throw new RuntimeException(ex);
            }
        }
        ((WaitableRunnable<Object>)new HandlerUtil$2(runnable)).invoke(handler);
    }
    
    public static void verifyThreadAccess(final Handler handler) {
        Util.throwIfNot(checkThreadAccess(handler));
    }
    
    public abstract static class WaitableRunnable<V> implements Runnable
    {
        private Exception mException;
        private boolean mIsDone;
        private V mValue;
        
        private void join() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: monitorenter   
            //     2: aload_0        
            //     3: getfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mIsDone:Z
            //     6: istore_1       
            //     7: iload_1        
            //     8: ifne            18
            //    11: aload_0        
            //    12: invokevirtual   java/lang/Object.wait:()V
            //    15: goto            2
            //    18: aload_0        
            //    19: monitorexit    
            //    20: return         
            //    21: astore_2       
            //    22: aload_0        
            //    23: monitorexit    
            //    24: aload_2        
            //    25: athrow         
            //    26: astore_2       
            //    27: goto            2
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                            
            //  -----  -----  -----  -----  --------------------------------
            //  2      7      21     26     Any
            //  11     15     26     30     Ljava/lang/InterruptedException;
            //  11     15     21     26     Any
            //  18     20     21     26     Any
            //  22     24     21     26     Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        
        public V invoke(final Handler handler) {
            if (!handler.post((Runnable)this)) {
                throw new RuntimeException("Handler.post() returned false");
            }
            this.join();
            if (this.mException == null) {
                return this.mValue;
            }
            throw new RuntimeException(this.mException);
        }
        
        public abstract V onRun();
        
        @Override
        public final void run() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_0        
            //     2: invokevirtual   com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.onRun:()Ljava/lang/Object;
            //     5: putfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mValue:Ljava/lang/Object;
            //     8: aload_0        
            //     9: aconst_null    
            //    10: putfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mException:Ljava/lang/Exception;
            //    13: aload_0        
            //    14: monitorenter   
            //    15: aload_0        
            //    16: iconst_1       
            //    17: putfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mIsDone:Z
            //    20: aload_0        
            //    21: invokevirtual   java/lang/Object.notifyAll:()V
            //    24: aload_0        
            //    25: monitorexit    
            //    26: goto            62
            //    29: astore_1       
            //    30: aload_0        
            //    31: monitorexit    
            //    32: aload_1        
            //    33: athrow         
            //    34: astore_1       
            //    35: goto            68
            //    38: astore_1       
            //    39: aload_0        
            //    40: aconst_null    
            //    41: putfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mValue:Ljava/lang/Object;
            //    44: aload_0        
            //    45: aload_1        
            //    46: putfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mException:Ljava/lang/Exception;
            //    49: aload_0        
            //    50: monitorenter   
            //    51: aload_0        
            //    52: iconst_1       
            //    53: putfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mIsDone:Z
            //    56: aload_0        
            //    57: invokevirtual   java/lang/Object.notifyAll:()V
            //    60: aload_0        
            //    61: monitorexit    
            //    62: return         
            //    63: astore_1       
            //    64: aload_0        
            //    65: monitorexit    
            //    66: aload_1        
            //    67: athrow         
            //    68: aload_0        
            //    69: monitorenter   
            //    70: aload_0        
            //    71: iconst_1       
            //    72: putfield        com/facebook/stetho/common/android/HandlerUtil$WaitableRunnable.mIsDone:Z
            //    75: aload_0        
            //    76: invokevirtual   java/lang/Object.notifyAll:()V
            //    79: aload_0        
            //    80: monitorexit    
            //    81: aload_1        
            //    82: athrow         
            //    83: astore_1       
            //    84: aload_0        
            //    85: monitorexit    
            //    86: aload_1        
            //    87: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  0      13     38     68     Ljava/lang/Exception;
            //  0      13     34     88     Any
            //  15     26     29     34     Any
            //  30     32     29     34     Any
            //  39     49     34     88     Any
            //  51     62     63     68     Any
            //  64     66     63     68     Any
            //  70     81     83     88     Any
            //  84     86     83     88     Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 62, Size: 62
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
}
