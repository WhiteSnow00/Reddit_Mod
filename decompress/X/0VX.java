// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.TimeInterpolator;
import kotlin.jvm.internal.n;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.animation.Animator;

public final class 0vx
{
    public static Animator LIZ;
    public static final 0vx LIZIZ;
    
    static {
        Covode.recordClassIndex(9840);
        LIZIZ = new 0vx();
    }
    
    public final void LIZ(final View view) {
        public final class 0vv implements Animator$AnimatorListener
        {
            static {
                Covode.recordClassIndex(9841);
            }
            
            public final void onAnimationCancel(final Animator animator) {
                0vx.LIZ = null;
            }
            
            public final void onAnimationEnd(final Animator animator) {
                0vx.LIZ = null;
            }
            
            public final void onAnimationRepeat(final Animator animator) {
            }
            
            public final void onAnimationStart(final Animator animator) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_1        
        //     5: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //     8: iconst_2       
        //     9: newarray        F
        //    11: dup            
        //    12: iconst_0       
        //    13: fconst_0       
        //    14: fastore        
        //    15: dup            
        //    16: iconst_1       
        //    17: fconst_1       
        //    18: fastore        
        //    19: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //    22: astore_1       
        //    23: aload_1        
        //    24: ldc             ""
        //    26: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: aload_1        
        //    30: ldc2_w          260
        //    33: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    36: pop            
        //    37: aload_1        
        //    38: ldc             0.65
        //    40: fconst_0       
        //    41: ldc             0.35
        //    43: fconst_1       
        //    44: invokestatic    X/07s.LIZ:(FFFF)Landroid/view/animation/Interpolator;
        //    47: invokevirtual   android/animation/ObjectAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //    50: aload_1        
        //    51: new             LX/0vv;
        //    54: dup            
        //    55: invokespecial   X/0vv.<init>:()V
        //    58: invokevirtual   android/animation/ObjectAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    61: aload_1        
        //    62: invokevirtual   android/animation/ObjectAnimator.start:()V
        //    65: aload_1        
        //    66: putstatic       X/0vx.LIZ:Landroid/animation/Animator;
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
