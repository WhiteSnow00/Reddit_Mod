// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.animation.ObjectAnimator;
import android.view.View;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;

public final class 0n0
{
    public static boolean LIZ;
    public static Runnable LIZIZ;
    public static final 0n0 LIZJ;
    
    static {
        Covode.recordClassIndex(7743);
        LIZJ = new 0n0();
    }
    
    public final void LIZ(final GO3 go3, final Runnable runnable, final a a) {
        public final class 1Qf implements 0n1
        {
            public final /* synthetic */ GO3 LIZ;
            public final /* synthetic */ Runnable LIZIZ;
            
            static {
                Covode.recordClassIndex(7746);
            }
            
            public 1Qf(final GO3 liz, final Runnable liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
            }
            
            public final void onAnimationEnd(final Animator animator) {
                this.LIZ.LIZ(1.0f);
                this.LIZIZ.run();
                0n0.LIZ = false;
                final Runnable liziz = 0n0.LIZIZ;
                if (liziz != null) {
                    liziz.run();
                }
                0n0.LIZIZ = null;
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
        //     1: aload_3        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_1        
        //     6: ifnull          78
        //     9: aload_3        
        //    10: invokevirtual   X/0my.getVisibility:()Z
        //    13: ifeq            78
        //    16: aload_3        
        //    17: iconst_0       
        //    18: invokevirtual   X/0my.setVisibility:(Z)V
        //    21: aload_1        
        //    22: invokeinterface X/GO3.LIZIZ:()Landroid/view/View;
        //    27: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //    30: iconst_2       
        //    31: newarray        F
        //    33: dup            
        //    34: iconst_0       
        //    35: fconst_1       
        //    36: fastore        
        //    37: dup            
        //    38: iconst_1       
        //    39: fconst_0       
        //    40: fastore        
        //    41: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //    44: ldc2_w          200
        //    47: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    50: astore_3       
        //    51: aload_3        
        //    52: ldc             ""
        //    54: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    57: aload_3        
        //    58: new             LX/1Qf;
        //    61: dup            
        //    62: aload_1        
        //    63: aload_2        
        //    64: invokespecial   X/1Qf.<init>:(LX/GO3;Ljava/lang/Runnable;)V
        //    67: invokevirtual   android/animation/ObjectAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    70: iconst_1       
        //    71: putstatic       X/0n0.LIZ:Z
        //    74: aload_3        
        //    75: invokevirtual   android/animation/ObjectAnimator.start:()V
        //    78: return         
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
    
    public final void LIZIZ(final GO3 go3, final Runnable runnable, final a a) {
        public final class 0mz implements Runnable
        {
            public final /* synthetic */ Runnable LIZ;
            public final /* synthetic */ GO3 LIZIZ;
            
            static {
                Covode.recordClassIndex(7745);
            }
            
            public 0mz(final Runnable liz, final GO3 liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZ.run();
                if (this.LIZIZ.LIZJ() == 0) {
                    ObjectAnimator.ofFloat((Object)this.LIZIZ.LIZIZ(), View.ALPHA, new float[] { 0.0f, 1.0f }).setDuration(200L).start();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_3        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_1        
        //     6: ifnull          48
        //     9: aload_3        
        //    10: invokevirtual   X/0my.getVisibility:()Z
        //    13: ifne            48
        //    16: aload_3        
        //    17: iconst_1       
        //    18: invokevirtual   X/0my.setVisibility:(Z)V
        //    21: new             LX/0mz;
        //    24: dup            
        //    25: aload_2        
        //    26: aload_1        
        //    27: invokespecial   X/0mz.<init>:(Ljava/lang/Runnable;LX/GO3;)V
        //    30: astore_1       
        //    31: getstatic       X/0n0.LIZ:Z
        //    34: ifeq            42
        //    37: aload_1        
        //    38: putstatic       X/0n0.LIZIZ:Ljava/lang/Runnable;
        //    41: return         
        //    42: aload_1        
        //    43: invokeinterface java/lang/Runnable.run:()V
        //    48: return         
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
    
    public enum a
    {
        MULTIGUEST(0), 
        PK(1);
        
        public final int LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(7744);
        }
        
        public a(final int liziz) {
            this.LIZIZ = liziz;
            this.LIZJ = false;
        }
        
        public final int getValue() {
            return this.LIZIZ;
        }
        
        public final boolean getVisibility() {
            return this.LIZJ;
        }
        
        public final void setVisibility(final boolean lizj) {
            this.LIZJ = lizj;
        }
    }
}
