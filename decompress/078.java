// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.os.Handler;
import java.util.concurrent.Callable;

public final class 078 implements Runnable
{
    public final /* synthetic */ Callable LIZ;
    public final /* synthetic */ Handler LIZIZ;
    public final /* synthetic */ 07B.a LIZJ;
    
    static {
        Covode.recordClassIndex(773);
    }
    
    public 078(final Callable liz, final Handler liziz, final 07B.a lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void run() {
        public final class 077 implements Runnable
        {
            public final /* synthetic */ Object LIZ;
            public final /* synthetic */ 078 LIZIZ;
            
            static {
                Covode.recordClassIndex(774);
            }
            
            public 077(final 078 liziz, final Object liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                this.LIZIZ.LIZJ.LIZ(this.LIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/078.LIZ:Ljava/util/concurrent/Callable;
        //     4: invokeinterface java/util/concurrent/Callable.call:()Ljava/lang/Object;
        //     9: astore_1       
        //    10: goto            16
        //    13: astore_1       
        //    14: aconst_null    
        //    15: astore_1       
        //    16: aload_0        
        //    17: getfield        X/078.LIZIZ:Landroid/os/Handler;
        //    20: new             LX/077;
        //    23: dup            
        //    24: aload_0        
        //    25: aload_1        
        //    26: invokespecial   X/077.<init>:(LX/078;Ljava/lang/Object;)V
        //    29: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    32: pop            
        //    33: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      10     13     16     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
