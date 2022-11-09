// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautySetting;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorSet;

public final class 0vt
{
    public AnimatorSet LIZ;
    public AnimatorSet LIZIZ;
    
    static {
        Covode.recordClassIndex(9757);
    }
    
    public final void LIZ(final ViewGroup viewGroup, final ViewGroup viewGroup2) {
        public final class 0vs implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ ViewGroup LIZ;
            
            static {
                Covode.recordClassIndex(9763);
            }
            
            public 0vs(final ViewGroup liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                n.LIZIZ((Object)valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                final boolean b = animatedValue instanceof Float;
                final ConstraintLayout.a a = null;
                if (!b) {
                    animatedValue = null;
                }
                final Float n = (Float)animatedValue;
                if (n != null) {
                    final float floatValue = n;
                    Object layoutParams = this.LIZ.getLayoutParams();
                    if (!(layoutParams instanceof ConstraintLayout.a)) {
                        layoutParams = a;
                    }
                    final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)layoutParams;
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = (int)floatValue;
                        this.LIZ.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                    }
                }
            }
        }
        public final class 0vr implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ ViewGroup LIZ;
            
            static {
                Covode.recordClassIndex(9762);
            }
            
            public 0vr(final ViewGroup liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                n.LIZIZ((Object)valueAnimator, "");
                Object animatedValue;
                if (!((animatedValue = valueAnimator.getAnimatedValue()) instanceof Float)) {
                    animatedValue = null;
                }
                final Float n = (Float)animatedValue;
                if (n != null) {
                    this.LIZ.setAlpha((float)n);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: invokestatic    com/bytedance/android/livesdk/livesetting/linkmic/multilive/MultiGuestBeautySetting.enableSmallItemAndNewPreviewPanel:()Z
        //     7: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    10: invokestatic    X/GTi.LIZIZ:(Ljava/lang/Boolean;)Z
        //    13: ifeq            17
        //    16: return         
        //    17: aload_1        
        //    18: ifnonnull       22
        //    21: return         
        //    22: aload_1        
        //    23: invokestatic    X/GlD.LIZJ:(Landroid/view/View;)V
        //    26: aload_1        
        //    27: fconst_0       
        //    28: invokevirtual   android/view/ViewGroup.setAlpha:(F)V
        //    31: aload_0        
        //    32: getfield        X/0vt.LIZIZ:Landroid/animation/AnimatorSet;
        //    35: astore_3       
        //    36: aload_3        
        //    37: ifnull          44
        //    40: aload_3        
        //    41: invokevirtual   android/animation/AnimatorSet.cancel:()V
        //    44: iconst_2       
        //    45: newarray        F
        //    47: dup            
        //    48: iconst_0       
        //    49: aload_1        
        //    50: invokevirtual   android/view/ViewGroup.getAlpha:()F
        //    53: fastore        
        //    54: dup            
        //    55: iconst_1       
        //    56: fconst_1       
        //    57: fastore        
        //    58: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //    61: astore          4
        //    63: aload           4
        //    65: ldc             ""
        //    67: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    70: aload           4
        //    72: new             Landroid/view/animation/LinearInterpolator;
        //    75: dup            
        //    76: invokespecial   android/view/animation/LinearInterpolator.<init>:()V
        //    79: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //    82: aload           4
        //    84: ldc2_w          600
        //    87: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    90: pop            
        //    91: aload           4
        //    93: new             LX/0vr;
        //    96: dup            
        //    97: aload_1        
        //    98: invokespecial   X/0vr.<init>:(Landroid/view/ViewGroup;)V
        //   101: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   104: aload_2        
        //   105: invokevirtual   android/view/ViewGroup.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   108: astore_3       
        //   109: aload_3        
        //   110: astore_1       
        //   111: aload_3        
        //   112: instanceof      LX/05X;
        //   115: ifne            120
        //   118: aconst_null    
        //   119: astore_1       
        //   120: aload_1        
        //   121: checkcast       LX/05X;
        //   124: astore_1       
        //   125: aload_1        
        //   126: ifnull          233
        //   129: aload_1        
        //   130: getfield        X/05X.bottomMargin:I
        //   133: istore          5
        //   135: ldc             59.0
        //   137: invokestatic    X/0cB.LIZ:(F)I
        //   140: istore          6
        //   142: iconst_2       
        //   143: newarray        F
        //   145: dup            
        //   146: iconst_0       
        //   147: iload           5
        //   149: i2f            
        //   150: fastore        
        //   151: dup            
        //   152: iconst_1       
        //   153: iload           6
        //   155: i2f            
        //   156: fastore        
        //   157: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //   160: astore_1       
        //   161: aload_1        
        //   162: ldc             ""
        //   164: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   167: aload_1        
        //   168: new             Landroid/view/animation/LinearInterpolator;
        //   171: dup            
        //   172: invokespecial   android/view/animation/LinearInterpolator.<init>:()V
        //   175: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //   178: aload_1        
        //   179: ldc2_w          300
        //   182: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   185: pop            
        //   186: aload_1        
        //   187: new             LX/0vs;
        //   190: dup            
        //   191: aload_2        
        //   192: invokespecial   X/0vs.<init>:(Landroid/view/ViewGroup;)V
        //   195: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   198: new             Landroid/animation/AnimatorSet;
        //   201: dup            
        //   202: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   205: astore_2       
        //   206: aload_2        
        //   207: iconst_2       
        //   208: anewarray       Landroid/animation/Animator;
        //   211: dup            
        //   212: iconst_0       
        //   213: aload           4
        //   215: aastore        
        //   216: dup            
        //   217: iconst_1       
        //   218: aload_1        
        //   219: aastore        
        //   220: invokevirtual   android/animation/AnimatorSet.playTogether:([Landroid/animation/Animator;)V
        //   223: aload_0        
        //   224: aload_2        
        //   225: putfield        X/0vt.LIZ:Landroid/animation/AnimatorSet;
        //   228: aload_2        
        //   229: invokevirtual   android/animation/AnimatorSet.start:()V
        //   232: return         
        //   233: ldc             12.0
        //   235: invokestatic    X/0cB.LIZ:(F)I
        //   238: istore          5
        //   240: goto            135
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
    
    public final void LIZIZ(final ViewGroup viewGroup, final ViewGroup viewGroup2) {
        public final class 0vn implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ ViewGroup LIZ;
            
            static {
                Covode.recordClassIndex(9758);
            }
            
            public 0vn(final ViewGroup liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                n.LIZIZ((Object)valueAnimator, "");
                Object animatedValue;
                if (!((animatedValue = valueAnimator.getAnimatedValue()) instanceof Float)) {
                    animatedValue = null;
                }
                final Float n = (Float)animatedValue;
                if (n != null) {
                    this.LIZ.setAlpha((float)n);
                }
            }
        }
        public final class 0vo implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ ViewGroup LIZ;
            
            static {
                Covode.recordClassIndex(9759);
            }
            
            public 0vo(final ViewGroup liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                n.LIZIZ((Object)valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                final boolean b = animatedValue instanceof Float;
                final ConstraintLayout.a a = null;
                if (!b) {
                    animatedValue = null;
                }
                final Float n = (Float)animatedValue;
                if (n != null) {
                    final float floatValue = n;
                    Object layoutParams = this.LIZ.getLayoutParams();
                    if (!(layoutParams instanceof ConstraintLayout.a)) {
                        layoutParams = a;
                    }
                    final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)layoutParams;
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = (int)floatValue;
                        this.LIZ.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: invokestatic    com/bytedance/android/livesdk/livesetting/linkmic/multilive/MultiGuestBeautySetting.enableSmallItemAndNewPreviewPanel:()Z
        //     7: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    10: invokestatic    X/GTi.LIZIZ:(Ljava/lang/Boolean;)Z
        //    13: ifeq            17
        //    16: return         
        //    17: aload_1        
        //    18: ifnonnull       22
        //    21: return         
        //    22: aload_0        
        //    23: getfield        X/0vt.LIZ:Landroid/animation/AnimatorSet;
        //    26: astore_3       
        //    27: aload_3        
        //    28: ifnull          35
        //    31: aload_3        
        //    32: invokevirtual   android/animation/AnimatorSet.cancel:()V
        //    35: iconst_2       
        //    36: newarray        F
        //    38: dup            
        //    39: iconst_0       
        //    40: aload_1        
        //    41: invokevirtual   android/view/ViewGroup.getAlpha:()F
        //    44: fastore        
        //    45: dup            
        //    46: iconst_1       
        //    47: fconst_0       
        //    48: fastore        
        //    49: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //    52: astore          4
        //    54: aload           4
        //    56: ldc             ""
        //    58: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    61: aload           4
        //    63: new             Landroid/view/animation/LinearInterpolator;
        //    66: dup            
        //    67: invokespecial   android/view/animation/LinearInterpolator.<init>:()V
        //    70: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //    73: aload           4
        //    75: ldc2_w          200
        //    78: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    81: pop            
        //    82: aload           4
        //    84: new             LX/0vn;
        //    87: dup            
        //    88: aload_1        
        //    89: invokespecial   X/0vn.<init>:(Landroid/view/ViewGroup;)V
        //    92: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //    95: aload_2        
        //    96: invokevirtual   android/view/ViewGroup.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    99: astore_3       
        //   100: aload_3        
        //   101: astore_1       
        //   102: aload_3        
        //   103: instanceof      LX/05X;
        //   106: ifne            111
        //   109: aconst_null    
        //   110: astore_1       
        //   111: aload_1        
        //   112: checkcast       LX/05X;
        //   115: astore_1       
        //   116: aload_1        
        //   117: ifnull          224
        //   120: aload_1        
        //   121: getfield        X/05X.bottomMargin:I
        //   124: istore          5
        //   126: ldc             12.0
        //   128: invokestatic    X/0cB.LIZ:(F)I
        //   131: istore          6
        //   133: iconst_2       
        //   134: newarray        F
        //   136: dup            
        //   137: iconst_0       
        //   138: iload           5
        //   140: i2f            
        //   141: fastore        
        //   142: dup            
        //   143: iconst_1       
        //   144: iload           6
        //   146: i2f            
        //   147: fastore        
        //   148: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //   151: astore_1       
        //   152: aload_1        
        //   153: ldc             ""
        //   155: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   158: aload_1        
        //   159: new             Landroid/view/animation/LinearInterpolator;
        //   162: dup            
        //   163: invokespecial   android/view/animation/LinearInterpolator.<init>:()V
        //   166: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //   169: aload_1        
        //   170: ldc2_w          300
        //   173: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   176: pop            
        //   177: aload_1        
        //   178: new             LX/0vo;
        //   181: dup            
        //   182: aload_2        
        //   183: invokespecial   X/0vo.<init>:(Landroid/view/ViewGroup;)V
        //   186: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   189: new             Landroid/animation/AnimatorSet;
        //   192: dup            
        //   193: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   196: astore_2       
        //   197: aload_2        
        //   198: iconst_2       
        //   199: anewarray       Landroid/animation/Animator;
        //   202: dup            
        //   203: iconst_0       
        //   204: aload           4
        //   206: aastore        
        //   207: dup            
        //   208: iconst_1       
        //   209: aload_1        
        //   210: aastore        
        //   211: invokevirtual   android/animation/AnimatorSet.playTogether:([Landroid/animation/Animator;)V
        //   214: aload_0        
        //   215: aload_2        
        //   216: putfield        X/0vt.LIZ:Landroid/animation/AnimatorSet;
        //   219: aload_2        
        //   220: invokevirtual   android/animation/AnimatorSet.start:()V
        //   223: return         
        //   224: ldc             12.0
        //   226: invokestatic    X/0cB.LIZ:(F)I
        //   229: istore          5
        //   231: goto            126
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
