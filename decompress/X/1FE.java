// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewConfiguration;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import java.io.PrintStream;
import android.util.Log;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View$OnTouchListener;
import com.bytedance.covode.number.Covode;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public final class 1Fe extends 0XO
{
    public 1Fc LIZ;
    public 0Xd.a LIZIZ;
    public ValueAnimator LIZJ;
    public ValueAnimator LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public TimeInterpolator LJIILJJIL;
    public boolean LJIILL;
    
    static {
        Covode.recordClassIndex(5145);
    }
    
    public 1Fe() {
        this.LJIILL = true;
        this.LJIILIIL = true;
    }
    
    public 1Fe(final 0Xd.a liziz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/0XO.<init>:()V
        //     4: aload_0        
        //     5: iconst_1       
        //     6: putfield        X/1Fe.LJIILL:Z
        //     9: aload_0        
        //    10: iconst_1       
        //    11: putfield        X/1Fe.LJIILIIL:Z
        //    14: aload_0        
        //    15: aload_1        
        //    16: putfield        X/1Fe.LIZIZ:LX/0Xc;
        //    19: aload_0        
        //    20: new             LX/1Fc;
        //    23: dup            
        //    24: aload_1        
        //    25: getfield        X/0Xc.LIZ:Landroid/content/Context;
        //    28: invokespecial   X/1Fc.<init>:(Landroid/content/Context;)V
        //    31: putfield        X/1Fe.LIZ:LX/1Fc;
        //    34: aload_0        
        //    35: invokevirtual   X/1Fe.LJ:()Landroid/view/View;
        //    38: new             LX/0XV;
        //    41: dup            
        //    42: aload_0        
        //    43: invokespecial   X/0XV.<init>:(LX/1Fe;)V
        //    46: invokevirtual   android/view/View.setOnTouchListener:(Landroid/view/View$OnTouchListener;)V
        //    49: aload_0        
        //    50: getfield        X/1Fe.LIZ:LX/1Fc;
        //    53: aload_1        
        //    54: getfield        X/0Xc.LIZLLL:I
        //    57: aload_1        
        //    58: getfield        X/0Xc.LJ:I
        //    61: invokevirtual   X/1Fc.LIZIZ:(II)V
        //    64: aload_0        
        //    65: getfield        X/1Fe.LIZ:LX/1Fc;
        //    68: aload_1        
        //    69: getfield        X/0Xc.LJFF:I
        //    72: aload_1        
        //    73: getfield        X/0Xc.LJI:I
        //    76: aload_1        
        //    77: getfield        X/0Xc.LJII:I
        //    80: invokevirtual   X/1Fc.LIZ:(III)V
        //    83: aload_0        
        //    84: getfield        X/1Fe.LIZ:LX/1Fc;
        //    87: aload_1        
        //    88: getfield        X/0Xc.LIZIZ:Landroid/view/View;
        //    91: putfield        X/1Fc.LJJIII:Landroid/view/View;
        //    94: new             LX/0XQ;
        //    97: dup            
        //    98: aload_0        
        //    99: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //   102: getfield        X/0Xc.LIZ:Landroid/content/Context;
        //   105: aload_0        
        //   106: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //   109: getfield        X/0Xc.LJIIIIZZ:Z
        //   112: aload_0        
        //   113: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //   116: getfield        X/0Xc.LJIIIZ:[Ljava/lang/Class;
        //   119: new             LX/1Fd;
        //   122: dup            
        //   123: aload_0        
        //   124: invokespecial   X/1Fd.<init>:(LX/1Fe;)V
        //   127: invokespecial   X/0XQ.<init>:(Landroid/content/Context;Z[Ljava/lang/Class;LX/0XR;)V
        //   130: pop            
        //   131: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    private void LJFF() {
        public final class 0Xa extends AnimatorListenerAdapter
        {
            public final /* synthetic */ 1Fe LIZ;
            
            static {
                Covode.recordClassIndex(5152);
            }
            
            public 0Xa(final 1Fe liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationEnd(final Animator animator) {
                this.LIZ.LIZLLL.removeAllUpdateListeners();
                final ValueAnimator lizlll = this.LIZ.LIZLLL;
                if (!7rv.LIZ.LIZ()) {
                    lizlll.removeAllListeners();
                }
                else {
                    final PrintStream err = System.err;
                    final StringBuilder sb = new StringBuilder("AnimatorLancet:::");
                    sb.append(Log.getStackTraceString((Throwable)new Exception()));
                    err.println(sb.toString());
                    lizlll.removeAllListeners();
                }
                this.LIZ.LIZLLL = null;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //     4: getfield        X/0Xc.LJIL:Landroid/animation/TimeInterpolator;
        //     7: ifnonnull       39
        //    10: aload_0        
        //    11: getfield        X/1Fe.LJIILJJIL:Landroid/animation/TimeInterpolator;
        //    14: ifnonnull       28
        //    17: aload_0        
        //    18: new             Landroid/view/animation/DecelerateInterpolator;
        //    21: dup            
        //    22: invokespecial   android/view/animation/DecelerateInterpolator.<init>:()V
        //    25: putfield        X/1Fe.LJIILJJIL:Landroid/animation/TimeInterpolator;
        //    28: aload_0        
        //    29: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    32: aload_0        
        //    33: getfield        X/1Fe.LJIILJJIL:Landroid/animation/TimeInterpolator;
        //    36: putfield        X/0Xc.LJIL:Landroid/animation/TimeInterpolator;
        //    39: aload_0        
        //    40: getfield        X/1Fe.LIZLLL:Landroid/animation/ValueAnimator;
        //    43: aload_0        
        //    44: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    47: getfield        X/0Xc.LJIL:Landroid/animation/TimeInterpolator;
        //    50: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //    53: aload_0        
        //    54: getfield        X/1Fe.LIZLLL:Landroid/animation/ValueAnimator;
        //    57: new             LX/0Xa;
        //    60: dup            
        //    61: aload_0        
        //    62: invokespecial   X/0Xa.<init>:(LX/1Fe;)V
        //    65: invokevirtual   android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    68: aload_0        
        //    69: getfield        X/1Fe.LIZLLL:Landroid/animation/ValueAnimator;
        //    72: aload_0        
        //    73: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    76: getfield        X/0Xc.LJIJJLI:J
        //    79: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    82: invokevirtual   android/animation/ValueAnimator.start:()V
        //    85: return         
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
    
    @Override
    public final void LIZ() {
        0Xd.LIZ(this.LIZIZ.LJIIZILJ);
        this.LIZ.LJIIIIZZ();
        this.LJIIJ = false;
    }
    
    public final void LIZIZ() {
        public final class 0XZ extends AnimatorListenerAdapter
        {
            public final /* synthetic */ 1Fe LIZ;
            
            static {
                Covode.recordClassIndex(5151);
            }
            
            public 0XZ(final 1Fe liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationEnd(final Animator animator) {
                this.LIZ.LIZJ.removeAllUpdateListeners();
                final ValueAnimator lizj = this.LIZ.LIZJ;
                if (!7rv.LIZ.LIZ()) {
                    lizj.removeAllListeners();
                }
                else {
                    final PrintStream err = System.err;
                    final StringBuilder sb = new StringBuilder("AnimatorLancet:::");
                    sb.append(Log.getStackTraceString((Throwable)new Exception()));
                    err.println(sb.toString());
                    lizj.removeAllListeners();
                }
                this.LIZ.LIZJ = null;
                if (this.LIZ.LIZIZ.LJIJI != null) {
                    this.LIZ.LIZIZ.LJIJI.LIZLLL();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //     4: getfield        X/0Xc.LJIILLIIL:Landroid/animation/TimeInterpolator;
        //     7: ifnonnull       39
        //    10: aload_0        
        //    11: getfield        X/1Fe.LJIILJJIL:Landroid/animation/TimeInterpolator;
        //    14: ifnonnull       28
        //    17: aload_0        
        //    18: new             Landroid/view/animation/DecelerateInterpolator;
        //    21: dup            
        //    22: invokespecial   android/view/animation/DecelerateInterpolator.<init>:()V
        //    25: putfield        X/1Fe.LJIILJJIL:Landroid/animation/TimeInterpolator;
        //    28: aload_0        
        //    29: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    32: aload_0        
        //    33: getfield        X/1Fe.LJIILJJIL:Landroid/animation/TimeInterpolator;
        //    36: putfield        X/0Xc.LJIILLIIL:Landroid/animation/TimeInterpolator;
        //    39: aload_0        
        //    40: getfield        X/1Fe.LIZJ:Landroid/animation/ValueAnimator;
        //    43: aload_0        
        //    44: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    47: getfield        X/0Xc.LJIILLIIL:Landroid/animation/TimeInterpolator;
        //    50: invokevirtual   android/animation/ValueAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //    53: aload_0        
        //    54: getfield        X/1Fe.LIZJ:Landroid/animation/ValueAnimator;
        //    57: new             LX/0XZ;
        //    60: dup            
        //    61: aload_0        
        //    62: invokespecial   X/0XZ.<init>:(LX/1Fe;)V
        //    65: invokevirtual   android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    68: aload_0        
        //    69: getfield        X/1Fe.LIZJ:Landroid/animation/ValueAnimator;
        //    72: aload_0        
        //    73: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    76: getfield        X/0Xc.LJIILL:J
        //    79: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    82: invokevirtual   android/animation/ValueAnimator.start:()V
        //    85: aload_0        
        //    86: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    89: getfield        X/0Xc.LJIJI:LX/0XS;
        //    92: ifnull          107
        //    95: aload_0        
        //    96: getfield        X/1Fe.LIZIZ:LX/0Xc;
        //    99: getfield        X/0Xc.LJIJI:LX/0XS;
        //   102: invokeinterface X/0XS.LIZJ:()V
        //   107: return         
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
    
    public final void LIZJ() {
        if (this.LJIILL) {
            this.LIZ.LJI();
            this.LJIILL = false;
            this.LJIIJ = true;
        }
        else {
            if (this.LJIIJ && this.LJ().getVisibility() == 0) {
                return;
            }
            this.LJ().setVisibility(0);
            this.LJIIJ = true;
        }
        if (this.LIZIZ.LJIJI != null) {
            this.LIZIZ.LJIJI.LIZ();
        }
        if (this.LIZIZ.LJIJJLI > 0L) {
            int lizj;
            if (this.LIZ.LJJIIJ * 2 + this.LIZIZ.LIZLLL > 0cB.LIZJ()) {
                lizj = 0cB.LIZJ();
            }
            else {
                lizj = -this.LIZIZ.LIZLLL;
            }
            (this.LIZLLL = ObjectAnimator.ofInt(new int[] { lizj, this.LIZ.LJJIIJ })).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0Xb(this));
            this.LJFF();
        }
    }
    
    public final void LIZLLL() {
        if (!this.LJIILL && this.LJIIJ) {
            this.LJ().setVisibility(4);
            this.LJIIJ = false;
            if (this.LIZIZ.LJIJI != null) {
                this.LIZIZ.LJIJI.LIZIZ();
            }
        }
    }
    
    public final View LJ() {
        this.LJIIIZ = ViewConfiguration.get(this.LIZIZ.LIZ).getScaledTouchSlop();
        return this.LIZIZ.LIZIZ;
    }
}
