// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.HorizontalScrollView;
import java.util.Objects;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import com.bytedance.covode.number.Covode;

public final class 0ox implements Runnable
{
    public final /* synthetic */ 0oy LIZ;
    public final /* synthetic */ int LIZIZ;
    
    static {
        Covode.recordClassIndex(8046);
    }
    
    public 0ox(final 0oy liz, final int liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        public final class 0ou implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 0ox LIZ;
            public final /* synthetic */ 3tH LIZIZ;
            public final /* synthetic */ long LIZJ;
            
            static {
                Covode.recordClassIndex(8047);
            }
            
            public 0ou(final 0ox liz, final 3tH liziz, final long lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                if (this.LIZ.LIZ.LIZIZ == null) {
                    return;
                }
                n.LIZIZ((Object)valueAnimator, "");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                final int intValue = (int)animatedValue;
                final HorizontalScrollView liziz = this.LIZ.LIZ.LIZIZ;
                if (liziz != null) {
                    final int scrollX = liziz.getScrollX();
                    if (0cB.LJI()) {
                        final HorizontalScrollView liziz2 = this.LIZ.LIZ.LIZIZ;
                        if (liziz2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        final int liziz3 = this.LIZ.LIZIZ;
                        final Object animatedValue2 = valueAnimator.getAnimatedValue();
                        Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        liziz2.scrollTo(liziz3 - (int)animatedValue2, 0);
                    }
                    else {
                        final HorizontalScrollView liziz4 = this.LIZ.LIZ.LIZIZ;
                        if (liziz4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        liziz4.scrollBy(intValue - scrollX, 0);
                    }
                    final Object animatedValue3 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                    if ((int)animatedValue3 == this.LIZ.LIZIZ && !this.LIZIZ.element && this.LIZ.LIZ.LIZ) {
                        this.LIZIZ.element = true;
                        final 0oy liz = this.LIZ.LIZ;
                        final Runnable lji = this.LIZ.LIZ.LJI;
                        final long ljiiiz = this.LIZ.LIZ.LJIIIZ;
                        final long lizj = this.LIZJ;
                        long n = 0L;
                        if (ljiiiz - lizj > 0L) {
                            n = this.LIZ.LIZ.LJIIIZ - this.LIZJ;
                        }
                        liz.postDelayed(lji, n);
                    }
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        public final class 0ow implements Animator$AnimatorListener
        {
            public final /* synthetic */ 0ox LIZ;
            
            static {
                Covode.recordClassIndex(8049);
            }
            
            public 0ow(final 0ox liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationEnd(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationRepeat(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationStart(final Animator animator) {
                CTM.LIZ((Object)animator);
                final View lizlll = this.LIZ.LIZ.LIZLLL;
                if (lizlll != null) {
                    lizlll.setVisibility(0);
                }
                final View lj = this.LIZ.LIZ.LJ;
                if (lj != null) {
                    lj.setVisibility(0);
                }
            }
        }
        public final class 0ov implements Animator$AnimatorListener
        {
            public final /* synthetic */ 0ox LIZ;
            
            static {
                Covode.recordClassIndex(8048);
            }
            
            public 0ov(final 0ox liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationEnd(final Animator animator) {
                CTM.LIZ((Object)animator);
                final View lizlll = this.LIZ.LIZ.LIZLLL;
                if (lizlll != null) {
                    lizlll.setVisibility(8);
                }
                final View lj = this.LIZ.LIZ.LJ;
                if (lj != null) {
                    lj.setVisibility(8);
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
        //     2: invokestatic    X/0cB.LIZ:(F)I
        //     5: istore_1       
        //     6: aload_0        
        //     7: getfield        X/0ox.LIZIZ:I
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
        //    34: getfield        X/0ox.LIZ:LX/0oy;
        //    37: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //    40: astore          5
        //    42: aload           5
        //    44: ifnull          52
        //    47: aload           5
        //    49: invokevirtual   android/animation/ValueAnimator.removeAllUpdateListeners:()V
        //    52: aload_0        
        //    53: getfield        X/0ox.LIZ:LX/0oy;
        //    56: iconst_2       
        //    57: newarray        I
        //    59: dup            
        //    60: iconst_0       
        //    61: iconst_0       
        //    62: iastore        
        //    63: dup            
        //    64: iconst_1       
        //    65: aload_0        
        //    66: getfield        X/0ox.LIZIZ:I
        //    69: iastore        
        //    70: invokestatic    android/animation/ValueAnimator.ofInt:([I)Landroid/animation/ValueAnimator;
        //    73: putfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //    76: aload_0        
        //    77: getfield        X/0ox.LIZ:LX/0oy;
        //    80: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //    83: astore          5
        //    85: aload           5
        //    87: ifnull          106
        //    90: aload           5
        //    92: new             LX/0ou;
        //    95: dup            
        //    96: aload_0        
        //    97: aload           4
        //    99: lload_2        
        //   100: invokespecial   X/0ou.<init>:(LX/0ox;LX/3tH;J)V
        //   103: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   106: aload_0        
        //   107: getfield        X/0ox.LIZ:LX/0oy;
        //   110: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //   113: astore          4
        //   115: aload           4
        //   117: ifnull          133
        //   120: aload           4
        //   122: new             LX/0ow;
        //   125: dup            
        //   126: aload_0        
        //   127: invokespecial   X/0ow.<init>:(LX/0ox;)V
        //   130: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   133: aload_0        
        //   134: getfield        X/0ox.LIZ:LX/0oy;
        //   137: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //   140: astore          4
        //   142: aload           4
        //   144: ifnull          160
        //   147: aload           4
        //   149: new             LX/0ov;
        //   152: dup            
        //   153: aload_0        
        //   154: invokespecial   X/0ov.<init>:(LX/0ox;)V
        //   157: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   160: aload_0        
        //   161: getfield        X/0ox.LIZ:LX/0oy;
        //   164: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //   167: astore          4
        //   169: aload           4
        //   171: ifnull          181
        //   174: aload           4
        //   176: lload_2        
        //   177: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   180: pop            
        //   181: aload_0        
        //   182: getfield        X/0ox.LIZ:LX/0oy;
        //   185: getfield        X/0oy.LJII:Landroid/animation/ValueAnimator;
        //   188: astore          4
        //   190: aload           4
        //   192: ifnull          200
        //   195: aload           4
        //   197: invokevirtual   android/animation/ValueAnimator.start:()V
        //   200: return         
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
