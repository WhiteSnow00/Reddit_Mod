// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.bytedance.covode.number.Covode;

public final class 1kL extends G2A
{
    public final /* synthetic */ 1Q5 LIZ;
    public final /* synthetic */ 1si LIZIZ;
    public final /* synthetic */ 1si LIZJ;
    public final /* synthetic */ 2Bo LIZLLL;
    public final /* synthetic */ 1Py LJ;
    
    static {
        Covode.recordClassIndex(7621);
    }
    
    public 1kL(final 1Q5 liz, final 1si liziz, final 1si lizj, final 2Bo lizlll, final 1Py lj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
    }
    
    public final void LIZ(final boolean b) {
        public final class 0mh extends AnimatorListenerAdapter
        {
            public final /* synthetic */ 1kL LIZ;
            
            static {
                Covode.recordClassIndex(7623);
            }
            
            public 0mh(final 1kL liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationEnd(final Animator animator) {
                super.onAnimationEnd(animator);
                GlD.LIZJ((View)this.LIZ.LIZLLL);
                GlD.LIZJ((View)this.LIZ.LIZJ);
                final 2Bo lizj = this.LIZ.LIZ.LIZJ;
                if (lizj != null) {
                    GlD.LIZ((View)lizj);
                }
                final 1Q5 liz = this.LIZ.LIZ;
                final 2Bo lizlll = this.LIZ.LIZLLL;
                final 1Py lj = this.LIZ.LJ;
                final 0cd ljiiliil = liz.LJIILIIL;
                if (ljiiliil == null) {
                    n.LIZ("");
                }
                ljiiliil.LIZ(lizlll);
                ljiiliil.LIZ("tiktok_live_interaction_resource");
                ljiiliil.LIZIZ("interact_request_enhanced.webp");
                ljiiliil.LJ = true;
                ljiiliil.LJI = 4;
                ljiiliil.LJIIJ = true;
                ljiiliil.LIZ(lj);
                ljiiliil.LIZJ();
            }
        }
        public final class 0mg implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 1kL LIZ;
            
            static {
                Covode.recordClassIndex(7622);
            }
            
            public 0mg(final 1kL liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final 1si liziz = this.LIZ.LIZIZ;
                n.LIZIZ((Object)valueAnimator, "");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                liziz.setScaleX((float)animatedValue);
                final 1si liziz2 = this.LIZ.LIZIZ;
                final Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                liziz2.setScaleY((float)animatedValue2);
                final 1si lizj = this.LIZ.LIZJ;
                final Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                lizj.setScaleX((float)animatedValue3);
                final 1si lizj2 = this.LIZ.LIZJ;
                final Object animatedValue4 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                lizj2.setScaleY((float)animatedValue4);
                final 2Bo lizj3 = this.LIZ.LIZ.LIZJ;
                if (lizj3 != null) {
                    final Object animatedValue5 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                    lizj3.setScaleX(1.0f - (float)animatedValue5);
                }
                final 2Bo lizj4 = this.LIZ.LIZ.LIZJ;
                if (lizj4 != null) {
                    final Object animatedValue6 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue6, "null cannot be cast to non-null type kotlin.Float");
                    lizj4.setScaleY(1.0f - (float)animatedValue6);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifeq            109
        //     4: aload_0        
        //     5: getfield        X/1kL.LIZIZ:LX/1si;
        //     8: fconst_0       
        //     9: invokevirtual   X/1si.setScaleX:(F)V
        //    12: aload_0        
        //    13: getfield        X/1kL.LIZIZ:LX/1si;
        //    16: fconst_0       
        //    17: invokevirtual   X/1si.setScaleY:(F)V
        //    20: aload_0        
        //    21: getfield        X/1kL.LIZIZ:LX/1si;
        //    24: invokestatic    X/GlD.LIZJ:(Landroid/view/View;)V
        //    27: aload_0        
        //    28: getfield        X/1kL.LIZ:LX/1Q5;
        //    31: getfield        X/1Q5.LJIIJJI:Z
        //    34: ifeq            53
        //    37: aload_0        
        //    38: getfield        X/1kL.LIZ:LX/1Q5;
        //    41: getfield        X/1Q5.LJIIL:LX/2Bo;
        //    44: astore_2       
        //    45: aload_2        
        //    46: ifnull          53
        //    49: aload_2        
        //    50: invokestatic    X/GlD.LIZIZ:(Landroid/view/View;)V
        //    53: iconst_2       
        //    54: newarray        F
        //    56: dup            
        //    57: iconst_0       
        //    58: fconst_0       
        //    59: fastore        
        //    60: dup            
        //    61: iconst_1       
        //    62: fconst_1       
        //    63: fastore        
        //    64: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //    67: astore_2       
        //    68: aload_2        
        //    69: iconst_0       
        //    70: invokevirtual   android/animation/ValueAnimator.setRepeatCount:(I)V
        //    73: aload_2        
        //    74: ldc2_w          200
        //    77: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    80: pop            
        //    81: aload_2        
        //    82: new             LX/0mg;
        //    85: dup            
        //    86: aload_0        
        //    87: invokespecial   X/0mg.<init>:(LX/1kL;)V
        //    90: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //    93: aload_2        
        //    94: new             LX/0mh;
        //    97: dup            
        //    98: aload_0        
        //    99: invokespecial   X/0mh.<init>:(LX/1kL;)V
        //   102: invokevirtual   android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   105: aload_2        
        //   106: invokevirtual   android/animation/ValueAnimator.start:()V
        //   109: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
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
