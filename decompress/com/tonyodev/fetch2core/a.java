// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core;

import kotlin.TypeCastException;
import com.android.billingclient.api.c0;
import cg2.j;
import ng2.e;
import android.os.Handler;

public final class a
{
    public final Object a;
    public boolean b;
    public int c;
    public final Handler d;
    public final String e;
    
    public a(Handler d, final String e) {
        ng2.e.g((Object)e, "namespace");
        this.e = e;
        this.a = new Object();
        if (d == null) {
            d = (Handler)((mg2.a)new HandlerWrapper$handler$1(this)).invoke();
        }
        this.d = d;
    }
    
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/tonyodev/fetch2core/a.a:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/tonyodev/fetch2core/a.b:Z
        //    11: ifne            37
        //    14: aload_0        
        //    15: iconst_1       
        //    16: putfield        com/tonyodev/fetch2core/a.b:Z
        //    19: aload_0        
        //    20: getfield        com/tonyodev/fetch2core/a.d:Landroid/os/Handler;
        //    23: aconst_null    
        //    24: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //    27: aload_0        
        //    28: getfield        com/tonyodev/fetch2core/a.d:Landroid/os/Handler;
        //    31: invokevirtual   android/os/Handler.getLooper:()Landroid/os/Looper;
        //    34: invokevirtual   android/os/Looper.quit:()V
        //    37: getstatic       cg2/j.a:Lcg2/j;
        //    40: astore_2       
        //    41: aload_1        
        //    42: monitorexit    
        //    43: return         
        //    44: astore_2       
        //    45: aload_1        
        //    46: monitorexit    
        //    47: aload_2        
        //    48: athrow         
        //    49: astore_2       
        //    50: goto            37
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      19     44     49     Any
        //  19     37     49     53     Ljava/lang/Exception;
        //  19     37     44     49     Any
        //  37     41     44     49     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    public final void b(final mg2.a<j> a) {
        synchronized (this.a) {
            if (!this.b) {
                this.d.post((Runnable)new c0((Object)a, 7));
            }
            final j a2 = j.a;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (ng2.e.a((Object)a.class, (Object)class1) ^ true) {
            return false;
        }
        if (o != null) {
            return !(ng2.e.a((Object)this.e, (Object)((a)o).e) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.HandlerWrapper");
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode();
    }
}
