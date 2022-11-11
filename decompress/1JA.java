// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;

public abstract class 1ja extends ElementSpecImpl implements 0Bf<1JM>
{
    public final 5DO LIZ;
    public final 5DO LIZIZ;
    public final 5DO LIZJ;
    
    static {
        Covode.recordClassIndex(6955);
    }
    
    public 1ja(final int n, final Gxi gxi) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: iload_1        
        //     6: invokespecial   com/bytedance/ies/sdk/widgets/ElementSpecImpl.<init>:(I)V
        //     9: aload_0        
        //    10: new             LX/1uR;
        //    13: dup            
        //    14: aload_2        
        //    15: invokespecial   X/1uR.<init>:(LX/Gxi;)V
        //    18: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    21: putfield        X/1ja.LIZIZ:LX/5DO;
        //    24: aload_0        
        //    25: new             LX/1uQ;
        //    28: dup            
        //    29: aload_0        
        //    30: aload_2        
        //    31: invokespecial   X/1uQ.<init>:(LX/1ja;LX/Gxi;)V
        //    34: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    37: putfield        X/1ja.LIZ:LX/5DO;
        //    40: aload_0        
        //    41: new             LX/1uP;
        //    44: dup            
        //    45: aload_2        
        //    46: invokespecial   X/1uP.<init>:(LX/Gxi;)V
        //    49: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    52: putfield        X/1ja.LIZJ:LX/5DO;
        //    55: aload_0        
        //    56: new             LX/1uO;
        //    59: dup            
        //    60: aload_0        
        //    61: aload_2        
        //    62: invokespecial   X/1uO.<init>:(LX/1ja;LX/Gxi;)V
        //    65: invokestatic    com/bytedance/ies/sdk/widgets/ElementSpecImplKt.onAttach:(Lcom/bytedance/ies/sdk/widgets/ElementSpecImpl;LX/SRS;)V
        //    68: return         
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
    
    public final ConstraintProperty LIZ() {
        return (ConstraintProperty)this.LIZ.getValue();
    }
    
    public final ValueAnimator LIZIZ() {
        return (ValueAnimator)this.LIZJ.getValue();
    }
}
