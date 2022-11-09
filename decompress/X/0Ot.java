// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import com.bytedance.covode.number.Covode;

public final class 0ot implements Runnable
{
    public final /* synthetic */ 0oy LIZ;
    
    static {
        Covode.recordClassIndex(8044);
    }
    
    public 0ot(final 0oy liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        public final class 0os implements Animator$AnimatorListener
        {
            public final /* synthetic */ 0ot LIZ;
            
            static {
                Covode.recordClassIndex(8045);
            }
            
            public 0os(final 0ot liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationEnd(final Animator animator) {
                CTM.LIZ((Object)animator);
                if (this.LIZ.LIZ.LIZ) {
                    this.LIZ.LIZ.setVisibility(8);
                }
                final DataChannel ljiiiizz = this.LIZ.LIZ.LJIIIIZZ;
                if (ljiiiizz != null) {
                    ljiiiizz.LIZIZ((Class)2EL.class, (Object)0);
                }
            }
            
            public final void onAnimationRepeat(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationStart(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0ot.LIZ:LX/0oy;
        //     4: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ifnull          16
        //    12: aload_1        
        //    13: invokevirtual   android/animation/ValueAnimator.cancel:()V
        //    16: aload_0        
        //    17: getfield        X/0ot.LIZ:LX/0oy;
        //    20: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //    23: astore_1       
        //    24: aload_1        
        //    25: ifnull          32
        //    28: aload_1        
        //    29: invokevirtual   android/animation/ValueAnimator.removeAllUpdateListeners:()V
        //    32: aload_0        
        //    33: getfield        X/0ot.LIZ:LX/0oy;
        //    36: getfield        X/0oy.LIZLLL:Landroid/view/View;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          50
        //    44: aload_1        
        //    45: bipush          8
        //    47: invokevirtual   android/view/View.setVisibility:(I)V
        //    50: aload_0        
        //    51: getfield        X/0ot.LIZ:LX/0oy;
        //    54: getfield        X/0oy.LJ:Landroid/view/View;
        //    57: astore_1       
        //    58: aload_1        
        //    59: ifnull          68
        //    62: aload_1        
        //    63: bipush          8
        //    65: invokevirtual   android/view/View.setVisibility:(I)V
        //    68: aload_0        
        //    69: getfield        X/0ot.LIZ:LX/0oy;
        //    72: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //    75: iconst_2       
        //    76: newarray        F
        //    78: dup            
        //    79: iconst_0       
        //    80: fconst_1       
        //    81: fastore        
        //    82: dup            
        //    83: iconst_1       
        //    84: fconst_0       
        //    85: fastore        
        //    86: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //    89: astore_1       
        //    90: aload_1        
        //    91: ldc2_w          300
        //    94: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    97: pop            
        //    98: aload_1        
        //    99: new             LX/0os;
        //   102: dup            
        //   103: aload_0        
        //   104: invokespecial   X/0os.<init>:(LX/0ot;)V
        //   107: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   110: aload_1        
        //   111: invokevirtual   android/animation/ObjectAnimator.start:()V
        //   114: return         
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
