// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;

public abstract class 1jg extends ElementSpecImpl
{
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final Gxi LIZLLL;
    public final 5DO LJ;
    
    static {
        Covode.recordClassIndex(6968);
    }
    
    public 1jg(final Gxi lizlll, final int n) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: iload_2        
        //     6: invokespecial   com/bytedance/ies/sdk/widgets/ElementSpecImpl.<init>:(I)V
        //     9: aload_0        
        //    10: aload_1        
        //    11: putfield        X/1jg.LIZLLL:LX/Gxi;
        //    14: new             LX/1uU;
        //    17: dup            
        //    18: aload_0        
        //    19: invokespecial   X/1uU.<init>:(LX/1jg;)V
        //    22: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    25: astore_3       
        //    26: aload_0        
        //    27: aload_3        
        //    28: putfield        X/1jg.LJ:LX/5DO;
        //    31: aload_3        
        //    32: invokeinterface X/5DO.getValue:()Ljava/lang/Object;
        //    37: checkcast       Lcom/bytedance/android/live/dialogoeventbserver/LiveDialogStatusEventObserverManager;
        //    40: astore_3       
        //    41: aload_3        
        //    42: ifnull          73
        //    45: aload_3        
        //    46: getfield        com/bytedance/android/live/dialogoeventbserver/LiveDialogStatusEventObserverManager.LIZIZ:LX/15z;
        //    49: astore_3       
        //    50: aload_3        
        //    51: ifnull          73
        //    54: aload_3        
        //    55: aload_1        
        //    56: getfield        X/Gxi.LJIIJJI:Lcom/bytedance/android/livesdk/BaseLayeredElementManager;
        //    59: getfield        com/bytedance/android/livesdk/BaseLayeredElementManager.LIZ:Landroidx/fragment/app/Fragment;
        //    62: new             LX/1NJ;
        //    65: dup            
        //    66: aload_0        
        //    67: invokespecial   X/1NJ.<init>:(LX/1jg;)V
        //    70: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //    73: return         
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
    
    public final int LIZ() {
        return (int)((1.0f - this.LIZLLL.LJFF) * ((LayeredElementContext)this.LIZLLL).getContainer().getHeight()) - this.LIZLLL.LJI - this.LIZLLL.LIZJ * 2;
    }
    
    public abstract void LIZ(final 1JM p0);
}
