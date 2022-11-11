// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.AnimatorSet;
import android.widget.HorizontalScrollView;
import java.util.Objects;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.bytedance.covode.number.Covode;

public final class 0o1 implements Runnable
{
    public final /* synthetic */ 0oD LIZ;
    public final /* synthetic */ int LIZIZ;
    
    static {
        Covode.recordClassIndex(7965);
    }
    
    public 0o1(final 0oD liz, final int liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        public final class 0o0 implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 0o1 LIZ;
            public final /* synthetic */ 3tH LIZIZ;
            
            static {
                Covode.recordClassIndex(7966);
            }
            
            public 0o0(final 0o1 liz, final 3tH liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                n.LIZIZ((Object)valueAnimator, "");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                final int intValue = (int)animatedValue;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView)this.LIZ.LIZ.LIZIZ(2131370785);
                n.LIZIZ((Object)horizontalScrollView, "");
                final int scrollX = horizontalScrollView.getScrollX();
                if (0cB.LJI()) {
                    final HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView)this.LIZ.LIZ.LIZIZ(2131370785);
                    final int liziz = this.LIZ.LIZIZ;
                    final Object animatedValue2 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    horizontalScrollView2.scrollTo(liziz - (int)animatedValue2, 0);
                }
                else {
                    ((HorizontalScrollView)this.LIZ.LIZ.LIZIZ(2131370785)).scrollBy(intValue - scrollX, 0);
                }
                final Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                if ((int)animatedValue3 == this.LIZ.LIZIZ && !this.LIZIZ.element) {
                    this.LIZIZ.element = true;
                    if (this.LIZ.LIZ.LJIIJ <= 1 && (this.LIZ.LIZ.getTruthOrDareTips().isEmpty() ^ true)) {
                        this.LIZ.LIZ.postDelayed(this.LIZ.LIZ.LIZJ, 2000L);
                        return;
                    }
                    this.LIZ.LIZ.LJ();
                    this.LIZ.LIZ.LIZ = this.LIZ.LIZ.LJFF();
                    final AnimatorSet liz = this.LIZ.LIZ.LIZ;
                    if (liz != null) {
                        liz.setStartDelay(3000L);
                    }
                    final AnimatorSet liz2 = this.LIZ.LIZ.LIZ;
                    if (liz2 != null) {
                        liz2.start();
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    X/0cB.LIZ:(F)I
        //     5: istore_1       
        //     6: aload_0        
        //     7: getfield        X/0o1.LIZIZ:I
        //    10: iload_1        
        //    11: idiv           
        //    12: sipush          1000
        //    15: imul           
        //    16: i2l            
        //    17: lstore_2       
        //    18: new             LX/3tH;
        //    21: dup            
        //    22: invokespecial   X/3tH.<init>:()V
        //    25: astore          4
        //    27: aload           4
        //    29: iconst_0       
        //    30: putfield        X/3tH.element:Z
        //    33: aload_0        
        //    34: getfield        X/0o1.LIZ:LX/0oD;
        //    37: getfield        X/0oD.LJFF:Landroid/animation/ValueAnimator;
        //    40: astore          5
        //    42: aload           5
        //    44: ifnull          52
        //    47: aload           5
        //    49: invokevirtual   android/animation/ValueAnimator.removeAllUpdateListeners:()V
        //    52: aload_0        
        //    53: getfield        X/0o1.LIZ:LX/0oD;
        //    56: iconst_2       
        //    57: newarray        I
        //    59: dup            
        //    60: iconst_0       
        //    61: iconst_0       
        //    62: iastore        
        //    63: dup            
        //    64: iconst_1       
        //    65: aload_0        
        //    66: getfield        X/0o1.LIZIZ:I
        //    69: iastore        
        //    70: invokestatic    android/animation/ValueAnimator.ofInt:([I)Landroid/animation/ValueAnimator;
        //    73: putfield        X/0oD.LJFF:Landroid/animation/ValueAnimator;
        //    76: aload_0        
        //    77: getfield        X/0o1.LIZ:LX/0oD;
        //    80: getfield        X/0oD.LJFF:Landroid/animation/ValueAnimator;
        //    83: astore          5
        //    85: aload           5
        //    87: ifnull          105
        //    90: aload           5
        //    92: new             LX/0o0;
        //    95: dup            
        //    96: aload_0        
        //    97: aload           4
        //    99: invokespecial   X/0o0.<init>:(LX/0o1;LX/3tH;)V
        //   102: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   105: aload_0        
        //   106: getfield        X/0o1.LIZ:LX/0oD;
        //   109: getfield        X/0oD.LJFF:Landroid/animation/ValueAnimator;
        //   112: astore          4
        //   114: aload           4
        //   116: ifnull          126
        //   119: aload           4
        //   121: lload_2        
        //   122: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   125: pop            
        //   126: aload_0        
        //   127: getfield        X/0o1.LIZ:LX/0oD;
        //   130: getfield        X/0oD.LJFF:Landroid/animation/ValueAnimator;
        //   133: astore          4
        //   135: aload           4
        //   137: ifnull          145
        //   140: aload           4
        //   142: invokevirtual   android/animation/ValueAnimator.start:()V
        //   145: return         
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
