// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import java.util.Objects;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.game.FloatingBallCancelSnappedStateSetting;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.animation.Animator;
import android.view.View;

public final class 1i3 extends 1Fc
{
    public final float LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public final View LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public Animator LJIIJ;
    public Boolean LJIIJJI;
    
    static {
        Covode.recordClassIndex(5119);
    }
    
    public 1i3(final Context context, final View ljjiii) {
        CTM.LIZ((Object)context, (Object)ljjiii);
        super(context);
        final boolean enable = FloatingBallCancelSnappedStateSetting.INSTANCE.isEnable();
        this.LJII = enable;
        this.LIZ = 28.0f;
        final int liz = 0cB.LIZ(28.0f);
        this.LIZIZ = liz;
        final int ljiiiizz = -liz;
        this.LJIIIIZZ = ljiiiizz;
        this.LJIIIZ = liz;
        this.LIZJ = 1;
        this.LJ = (int)GlD.LIZ(2.0f);
        final View viewById = ljjiii.findViewById(2131366916);
        this.LJI = viewById;
        super.LJJIII = ljjiii;
        this.LIZIZ(liz, liz);
        this.LIZ(8388659, ljiiiizz, liz);
        this.LJI();
        if (enable) {
            GlD.LIZ(ljjiii);
        }
        n.LIZIZ((Object)viewById, "");
        viewById.setAlpha(0.0f);
    }
    
    private final void LIZ(final int n, final int n2, final boolean b) {
        public final class 0XF implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 1i3 LIZ;
            
            static {
                Covode.recordClassIndex(5122);
            }
            
            public 0XF(final 1i3 liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                CTM.LIZ((Object)valueAnimator);
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                final float floatValue = (float)animatedValue;
                final View lji = this.LIZ.LJI;
                n.LIZIZ((Object)lji, "");
                lji.setAlpha(floatValue);
            }
        }
        public final class 0XE implements Animator$AnimatorListener
        {
            public final /* synthetic */ 1i3 LIZ;
            
            static {
                Covode.recordClassIndex(5121);
            }
            
            public 0XE(final 1i3 liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
            }
            
            public final void onAnimationEnd(final Animator animator) {
                this.LIZ.LJFF = false;
            }
            
            public final void onAnimationRepeat(final Animator animator) {
            }
            
            public final void onAnimationStart(final Animator animator) {
                this.LIZ.LJFF = true;
            }
        }
        public final class 0XD implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 1i3 LIZ;
            
            static {
                Covode.recordClassIndex(5120);
            }
            
            public 0XD(final 1i3 liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                CTM.LIZ((Object)valueAnimator);
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this.LIZ.LIZIZ((int)animatedValue);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1i3.LJFF:Z
        //     4: ifeq            83
        //     7: aload_0        
        //     8: getfield        X/1i3.LJIIJJI:Ljava/lang/Boolean;
        //    11: iload_3        
        //    12: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    15: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    18: ifeq            59
        //    21: new             Ljava/lang/StringBuilder;
        //    24: dup            
        //    25: ldc             "Same isSlidingIn = "
        //    27: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    30: astore          4
        //    32: aload           4
        //    34: iload_3        
        //    35: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    38: pop            
        //    39: aload           4
        //    41: ldc             ", returning..."
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: pop            
        //    47: iconst_3       
        //    48: ldc             "TrayView"
        //    50: aload           4
        //    52: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    55: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    58: return         
        //    59: aload_0        
        //    60: getfield        X/1i3.LJIIJ:Landroid/animation/Animator;
        //    63: astore          4
        //    65: aload           4
        //    67: ifnull          75
        //    70: aload           4
        //    72: invokevirtual   android/animation/Animator.cancel:()V
        //    75: iconst_3       
        //    76: ldc             "TrayView"
        //    78: ldc             "isSlidingIn changed, animator are canceled."
        //    80: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    83: aload_0        
        //    84: iload_3        
        //    85: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    88: putfield        X/1i3.LJIIJJI:Ljava/lang/Boolean;
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: ldc             "New isSlidingIn = "
        //    97: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   100: astore          4
        //   102: aload           4
        //   104: iload_3        
        //   105: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   108: pop            
        //   109: aload           4
        //   111: ldc             ", animator are created."
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: pop            
        //   117: iconst_3       
        //   118: ldc             "TrayView"
        //   120: aload           4
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   128: iconst_2       
        //   129: newarray        I
        //   131: dup            
        //   132: iconst_0       
        //   133: iload_1        
        //   134: iastore        
        //   135: dup            
        //   136: iconst_1       
        //   137: iload_2        
        //   138: iastore        
        //   139: invokestatic    android/animation/ObjectAnimator.ofInt:([I)Landroid/animation/ValueAnimator;
        //   142: astore          5
        //   144: aload           5
        //   146: ldc             ""
        //   148: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   151: aload           5
        //   153: new             Landroid/view/animation/AccelerateDecelerateInterpolator;
        //   156: dup            
        //   157: invokespecial   android/view/animation/AccelerateDecelerateInterpolator.<init>:()V
        //   160: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //   163: aload           5
        //   165: new             LX/0XD;
        //   168: dup            
        //   169: aload_0        
        //   170: invokespecial   X/0XD.<init>:(LX/1i3;)V
        //   173: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   176: aload           5
        //   178: new             LX/0XE;
        //   181: dup            
        //   182: aload_0        
        //   183: invokespecial   X/0XE.<init>:(LX/1i3;)V
        //   186: invokevirtual   android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   189: iload_3        
        //   190: ifeq            290
        //   193: iconst_2       
        //   194: newarray        F
        //   196: dup            
        //   197: iconst_0       
        //   198: fconst_0       
        //   199: fastore        
        //   200: dup            
        //   201: iconst_1       
        //   202: fconst_1       
        //   203: fastore        
        //   204: invokestatic    android/animation/ObjectAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //   207: astore          4
        //   209: aload           4
        //   211: ldc             ""
        //   213: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   216: aload           4
        //   218: new             Landroid/view/animation/LinearInterpolator;
        //   221: dup            
        //   222: invokespecial   android/view/animation/LinearInterpolator.<init>:()V
        //   225: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //   228: aload           4
        //   230: new             LX/0XF;
        //   233: dup            
        //   234: aload_0        
        //   235: invokespecial   X/0XF.<init>:(LX/1i3;)V
        //   238: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   241: new             Landroid/animation/AnimatorSet;
        //   244: dup            
        //   245: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   248: astore          6
        //   250: aload           6
        //   252: ldc2_w          200
        //   255: invokevirtual   android/animation/AnimatorSet.setDuration:(J)Landroid/animation/AnimatorSet;
        //   258: pop            
        //   259: aload           6
        //   261: iconst_2       
        //   262: anewarray       Landroid/animation/Animator;
        //   265: dup            
        //   266: iconst_0       
        //   267: aload           5
        //   269: aastore        
        //   270: dup            
        //   271: iconst_1       
        //   272: aload           4
        //   274: aastore        
        //   275: invokevirtual   android/animation/AnimatorSet.playTogether:([Landroid/animation/Animator;)V
        //   278: aload           6
        //   280: invokevirtual   android/animation/AnimatorSet.start:()V
        //   283: aload_0        
        //   284: aload           6
        //   286: putfield        X/1i3.LJIIJ:Landroid/animation/Animator;
        //   289: return         
        //   290: iconst_2       
        //   291: newarray        F
        //   293: dup            
        //   294: iconst_0       
        //   295: fconst_1       
        //   296: fastore        
        //   297: dup            
        //   298: iconst_1       
        //   299: fconst_0       
        //   300: fastore        
        //   301: invokestatic    android/animation/ObjectAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //   304: astore          4
        //   306: goto            209
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
    
    public final int LIZ() {
        return this.LJ - this.LIZLLL;
    }
    
    public final void LIZ(int lizlll) {
        this.LIZJ = lizlll;
        final int liziz = this.LIZIZ;
        int n4;
        if (lizlll == 1) {
            final int n = -liziz;
            lizlll = this.LIZLLL;
            final int n2 = n - lizlll;
            final int n3 = 0 - lizlll;
            final View ljjiii = super.LJJIII;
            lizlll = n3;
            n4 = n2;
            if (ljjiii != null) {
                ljjiii.setRotationY(0.0f);
                n4 = n2;
                lizlll = n3;
            }
        }
        else {
            final int n5 = 0Z8.LIZ() + liziz + this.LIZLLL;
            final int n6 = 0Z8.LIZ() - liziz - this.LIZLLL;
            final View ljjiii2 = super.LJJIII;
            lizlll = n6;
            n4 = n5;
            if (ljjiii2 != null) {
                ljjiii2.setRotationY(180.0f);
                lizlll = n6;
                n4 = n5;
            }
        }
        this.LIZ(n4, lizlll, true);
    }
    
    public final void LIZIZ() {
        final Boolean ljiijji = this.LJIIJJI;
        if (ljiijji != null && !n.LIZ((Object)ljiijji, (Object)false)) {
            final int liziz = this.LIZIZ;
            int n3;
            int n4;
            if (this.LIZJ == 1) {
                final int lizlll = this.LIZLLL;
                final int n = 0 - lizlll;
                final int n2 = -liziz - lizlll;
                final View ljjiii = super.LJJIII;
                n3 = n;
                n4 = n2;
                if (ljjiii != null) {
                    ljjiii.setRotationY(0.0f);
                    n4 = n2;
                    n3 = n;
                }
            }
            else {
                final int n5 = 0Z8.LIZ() - liziz - this.LIZLLL;
                final int n6 = this.LIZLLL + (0Z8.LIZ() + liziz);
                final View ljjiii2 = super.LJJIII;
                n3 = n5;
                n4 = n6;
                if (ljjiii2 != null) {
                    ljjiii2.setRotationY(180.0f);
                    n3 = n5;
                    n4 = n6;
                }
            }
            this.LIZ(n3, n4, false);
        }
    }
}
