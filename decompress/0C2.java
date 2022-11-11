// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;

public abstract class 0C2<T>
{
    public final Executor LIZ;
    public final LiveData<T> LIZIZ;
    public final AtomicBoolean LIZJ;
    public final AtomicBoolean LIZLLL;
    public final Runnable LJ;
    public final Runnable LJFF;
    
    static {
        Covode.recordClassIndex(1254);
    }
    
    public 0C2(final Executor liz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //     8: dup            
        //     9: iconst_1       
        //    10: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    13: putfield        X/0C2.LIZJ:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    16: aload_0        
        //    17: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    20: dup            
        //    21: iconst_0       
        //    22: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    25: putfield        X/0C2.LIZLLL:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    28: aload_0        
        //    29: new             LX/0C0;
        //    32: dup            
        //    33: aload_0        
        //    34: invokespecial   X/0C0.<init>:(LX/0C2;)V
        //    37: putfield        X/0C2.LJ:Ljava/lang/Runnable;
        //    40: aload_0        
        //    41: new             LX/0C1;
        //    44: dup            
        //    45: aload_0        
        //    46: invokespecial   X/0C1.<init>:(LX/0C2;)V
        //    49: putfield        X/0C2.LJFF:Ljava/lang/Runnable;
        //    52: aload_0        
        //    53: aload_1        
        //    54: putfield        X/0C2.LIZ:Ljava/util/concurrent/Executor;
        //    57: aload_0        
        //    58: new             LX/15p;
        //    61: dup            
        //    62: aload_0        
        //    63: invokespecial   X/15p.<init>:(LX/0C2;)V
        //    66: putfield        X/0C2.LIZIZ:Landroidx/lifecycle/LiveData;
        //    69: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public abstract T LIZ();
}
