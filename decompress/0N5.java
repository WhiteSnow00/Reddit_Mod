// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 0n5
{
    public static final 0n5 LIZ;
    
    static {
        Covode.recordClassIndex(7776);
        LIZ = new 0n5();
    }
    
    public final void LIZ(final View view, final View view2, final QgG<2P9> qgG) {
        public final class 0n4 implements Animation$AnimationListener
        {
            public final /* synthetic */ View LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(7778);
            }
            
            public 0n4(final View liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onAnimationEnd(final Animation animation) {
                this.LIZ.setVisibility(8);
                this.LIZIZ.invoke();
            }
            
            public final void onAnimationRepeat(final Animation animation) {
            }
            
            public final void onAnimationStart(final Animation animation) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     6: aload_1        
        //     7: iconst_0       
        //     8: invokevirtual   android/view/View.setVisibility:(I)V
        //    11: new             Landroid/view/animation/TranslateAnimation;
        //    14: dup            
        //    15: iconst_1       
        //    16: fconst_0       
        //    17: iconst_1       
        //    18: fconst_0       
        //    19: iconst_1       
        //    20: fconst_0       
        //    21: iconst_1       
        //    22: ldc             -1.0
        //    24: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //    27: astore          4
        //    29: aload           4
        //    31: new             LX/0n4;
        //    34: dup            
        //    35: aload_1        
        //    36: aload_3        
        //    37: invokespecial   X/0n4.<init>:(Landroid/view/View;LX/QgG;)V
        //    40: invokevirtual   android/view/animation/TranslateAnimation.setAnimationListener:(Landroid/view/animation/Animation$AnimationListener;)V
        //    43: aload           4
        //    45: new             LX/0n2;
        //    48: dup            
        //    49: invokespecial   X/0n2.<init>:()V
        //    52: invokevirtual   android/view/animation/TranslateAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //    55: aload           4
        //    57: ldc2_w          300
        //    60: invokevirtual   android/view/animation/TranslateAnimation.setDuration:(J)V
        //    63: aload_1        
        //    64: aload           4
        //    66: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //    69: new             Landroid/view/animation/TranslateAnimation;
        //    72: dup            
        //    73: iconst_1       
        //    74: fconst_0       
        //    75: iconst_1       
        //    76: fconst_0       
        //    77: iconst_1       
        //    78: fconst_1       
        //    79: iconst_1       
        //    80: fconst_0       
        //    81: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //    84: astore_1       
        //    85: aload_1        
        //    86: ldc2_w          300
        //    89: invokevirtual   android/view/animation/TranslateAnimation.setDuration:(J)V
        //    92: aload_1        
        //    93: new             LX/0n2;
        //    96: dup            
        //    97: invokespecial   X/0n2.<init>:()V
        //   100: invokevirtual   android/view/animation/TranslateAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //   103: aload_2        
        //   104: aload_1        
        //   105: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   108: return         
        //    Signature:
        //  (Landroid/view/View;Landroid/view/View;LX/QgG<LX/2P9;>;)V
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
    
    public final void LIZIZ(final View view, final View view2, final QgG<2P9> qgG) {
        public final class 0n3 implements Animation$AnimationListener
        {
            public final /* synthetic */ View LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(7777);
            }
            
            public 0n3(final View liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onAnimationEnd(final Animation animation) {
                this.LIZ.setVisibility(8);
                this.LIZIZ.invoke();
            }
            
            public final void onAnimationRepeat(final Animation animation) {
            }
            
            public final void onAnimationStart(final Animation animation) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     6: aload_1        
        //     7: iconst_0       
        //     8: invokevirtual   android/view/View.setVisibility:(I)V
        //    11: new             Landroid/view/animation/TranslateAnimation;
        //    14: dup            
        //    15: iconst_1       
        //    16: fconst_0       
        //    17: iconst_1       
        //    18: fconst_0       
        //    19: iconst_1       
        //    20: fconst_0       
        //    21: iconst_1       
        //    22: fconst_1       
        //    23: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //    26: astore          4
        //    28: aload           4
        //    30: new             LX/0n3;
        //    33: dup            
        //    34: aload_1        
        //    35: aload_3        
        //    36: invokespecial   X/0n3.<init>:(Landroid/view/View;LX/QgG;)V
        //    39: invokevirtual   android/view/animation/TranslateAnimation.setAnimationListener:(Landroid/view/animation/Animation$AnimationListener;)V
        //    42: aload           4
        //    44: new             LX/0n2;
        //    47: dup            
        //    48: invokespecial   X/0n2.<init>:()V
        //    51: invokevirtual   android/view/animation/TranslateAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //    54: aload           4
        //    56: ldc2_w          300
        //    59: invokevirtual   android/view/animation/TranslateAnimation.setDuration:(J)V
        //    62: aload_1        
        //    63: aload           4
        //    65: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //    68: new             Landroid/view/animation/TranslateAnimation;
        //    71: dup            
        //    72: iconst_1       
        //    73: fconst_0       
        //    74: iconst_1       
        //    75: fconst_0       
        //    76: iconst_1       
        //    77: ldc             -1.0
        //    79: iconst_1       
        //    80: fconst_0       
        //    81: invokespecial   android/view/animation/TranslateAnimation.<init>:(IFIFIFIF)V
        //    84: astore_1       
        //    85: aload_1        
        //    86: ldc2_w          300
        //    89: invokevirtual   android/view/animation/TranslateAnimation.setDuration:(J)V
        //    92: aload_1        
        //    93: new             LX/0n2;
        //    96: dup            
        //    97: invokespecial   X/0n2.<init>:()V
        //   100: invokevirtual   android/view/animation/TranslateAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //   103: aload_2        
        //   104: aload_1        
        //   105: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //   108: return         
        //    Signature:
        //  (Landroid/view/View;Landroid/view/View;LX/QgG<LX/2P9;>;)V
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
