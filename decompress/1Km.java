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

public final class 1kM extends G2A
{
    public final /* synthetic */ 1QB LIZ;
    public final /* synthetic */ 1si LIZIZ;
    public final /* synthetic */ 1si LIZJ;
    public final /* synthetic */ 2Bo LIZLLL;
    public final /* synthetic */ 1QA LJ;
    
    static {
        Covode.recordClassIndex(7653);
    }
    
    public 1kM(final 1QB liz, final 1si liziz, final 1si lizj, final 2Bo lizlll, final 1QA lj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
    }
    
    public final void LIZ(final boolean b) {
        public final class 0mo extends AnimatorListenerAdapter
        {
            public final /* synthetic */ 1kM LIZ;
            
            static {
                Covode.recordClassIndex(7655);
            }
            
            public 0mo(final 1kM liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationEnd(final Animator animator) {
                super.onAnimationEnd(animator);
                GlD.LIZJ((View)this.LIZ.LIZLLL);
                GlD.LIZJ((View)this.LIZ.LIZJ);
                this.LIZ.LIZ.LIZIZ(false);
                final 2Bo lizlll = this.LIZ.LIZLLL;
                final 1QA lj = this.LIZ.LJ;
                final 0cd 0cd = new 0cd();
                0cd.LIZ(lizlll);
                0cd.LIZ("tiktok_live_interaction_resource");
                0cd.LIZIZ("interact_request_enhanced.webp");
                0cd.LJ = true;
                0cd.LJI = 2;
                0cd.LJIIJ = true;
                0cd.LIZ(lj);
                0cd.LIZJ();
            }
        }
        public final class 0mn implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 1kM LIZ;
            
            static {
                Covode.recordClassIndex(7654);
            }
            
            public 0mn(final 1kM liz) {
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
                final 2Bo ljff = this.LIZ.LIZ.LJFF;
                if (ljff != null) {
                    final Object animatedValue5 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                    ljff.setScaleX(1.0f - (float)animatedValue5);
                }
                final 2Bo ljff2 = this.LIZ.LIZ.LJFF;
                if (ljff2 != null) {
                    final Object animatedValue6 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue6, "null cannot be cast to non-null type kotlin.Float");
                    ljff2.setScaleY(1.0f - (float)animatedValue6);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifeq            83
        //     4: aload_0        
        //     5: getfield        X/1kM.LIZIZ:LX/1si;
        //     8: fconst_0       
        //     9: invokevirtual   X/1si.setScaleX:(F)V
        //    12: aload_0        
        //    13: getfield        X/1kM.LIZIZ:LX/1si;
        //    16: fconst_0       
        //    17: invokevirtual   X/1si.setScaleY:(F)V
        //    20: aload_0        
        //    21: getfield        X/1kM.LIZIZ:LX/1si;
        //    24: invokestatic    X/GlD.LIZJ:(Landroid/view/View;)V
        //    27: iconst_2       
        //    28: newarray        F
        //    30: dup            
        //    31: iconst_0       
        //    32: fconst_0       
        //    33: fastore        
        //    34: dup            
        //    35: iconst_1       
        //    36: fconst_1       
        //    37: fastore        
        //    38: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //    41: astore_2       
        //    42: aload_2        
        //    43: iconst_0       
        //    44: invokevirtual   android/animation/ValueAnimator.setRepeatCount:(I)V
        //    47: aload_2        
        //    48: ldc2_w          200
        //    51: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    54: pop            
        //    55: aload_2        
        //    56: new             LX/0mn;
        //    59: dup            
        //    60: aload_0        
        //    61: invokespecial   X/0mn.<init>:(LX/1kM;)V
        //    64: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //    67: aload_2        
        //    68: new             LX/0mo;
        //    71: dup            
        //    72: aload_0        
        //    73: invokespecial   X/0mo.<init>:(LX/1kM;)V
        //    76: invokevirtual   android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    79: aload_2        
        //    80: invokevirtual   android/animation/ValueAnimator.start:()V
        //    83: return         
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
