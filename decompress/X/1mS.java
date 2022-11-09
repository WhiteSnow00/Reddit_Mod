// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;

public final class 1ms extends 1JE
{
    public int LIZ;
    public final ObjectAnimator LIZIZ;
    public boolean LIZJ;
    public final ValueAnimator LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    
    static {
        Covode.recordClassIndex(10595);
    }
    
    public 1ms(final Context context, final AttributeSet set) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokespecial   X/1JE.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;)V
        //    10: new             Landroid/animation/ValueAnimator;
        //    13: dup            
        //    14: invokespecial   android/animation/ValueAnimator.<init>:()V
        //    17: astore_1       
        //    18: aload_1        
        //    19: ldc2_w          230
        //    22: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    25: pop            
        //    26: aload_1        
        //    27: new             LX/0zg;
        //    30: dup            
        //    31: aload_0        
        //    32: invokespecial   X/0zg.<init>:(LX/1ms;)V
        //    35: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //    38: aload_0        
        //    39: aload_1        
        //    40: putfield        X/1ms.LIZLLL:Landroid/animation/ValueAnimator;
        //    43: aload_0        
        //    44: iconst_1       
        //    45: anewarray       Landroid/animation/PropertyValuesHolder;
        //    48: dup            
        //    49: iconst_0       
        //    50: getstatic       X/1JE.ALPHA:Landroid/util/Property;
        //    53: iconst_3       
        //    54: anewarray       Landroid/animation/Keyframe;
        //    57: dup            
        //    58: iconst_0       
        //    59: fconst_0       
        //    60: fconst_0       
        //    61: invokestatic    android/animation/Keyframe.ofFloat:(FF)Landroid/animation/Keyframe;
        //    64: aastore        
        //    65: dup            
        //    66: iconst_1       
        //    67: ldc             0.6969697
        //    69: ldc             0.3
        //    71: invokestatic    android/animation/Keyframe.ofFloat:(FF)Landroid/animation/Keyframe;
        //    74: aastore        
        //    75: dup            
        //    76: iconst_2       
        //    77: fconst_1       
        //    78: fconst_1       
        //    79: invokestatic    android/animation/Keyframe.ofFloat:(FF)Landroid/animation/Keyframe;
        //    82: aastore        
        //    83: invokestatic    android/animation/PropertyValuesHolder.ofKeyframe:(Landroid/util/Property;[Landroid/animation/Keyframe;)Landroid/animation/PropertyValuesHolder;
        //    86: aastore        
        //    87: invokestatic    android/animation/ObjectAnimator.ofPropertyValuesHolder:(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;
        //    90: astore_1       
        //    91: aload_1        
        //    92: ldc2_w          330
        //    95: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    98: pop            
        //    99: aload_1        
        //   100: ldc             ""
        //   102: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   105: aload_0        
        //   106: aload_1        
        //   107: putfield        X/1ms.LIZIZ:Landroid/animation/ObjectAnimator;
        //   110: aload_0        
        //   111: iconst_1       
        //   112: putfield        X/1ms.LJ:Z
        //   115: aload_0        
        //   116: iconst_1       
        //   117: putfield        X/1ms.LIZJ:Z
        //   120: return         
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
    
    public final void LIZ(final int ljff) {
        this.LJFF = ljff;
        this.LIZLLL.cancel();
        if (this.LJ) {
            this.LIZLLL.setIntValues(new int[] { this.LIZ, this.LJFF });
            this.LIZLLL.start();
        }
    }
    
    public final boolean getHeightAnimationEnabled() {
        return this.LJ;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LIZLLL.cancel();
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.LJI = false;
    }
    
    public final void onMeasure(int measuredHeight, final int n) {
        if (this.LJI) {
            super.onMeasure(measuredHeight, n);
            measuredHeight = this.getMeasuredHeight();
            if (this.LJFF != measuredHeight && this.LIZJ) {
                this.LIZ(measuredHeight);
            }
        }
        if (this.LJ) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.LIZ);
            return;
        }
        this.LIZ = this.LJFF;
        this.setMeasuredDimension(this.getMeasuredWidth(), this.LJFF);
    }
    
    public final void requestLayout() {
        super.requestLayout();
        this.LJI = true;
    }
    
    public final void setHeightAnimationEnabled(final boolean lj) {
        if (this.LJ != lj) {
            this.LJ = lj;
            this.LIZLLL.cancel();
            this.requestLayout();
        }
    }
}
