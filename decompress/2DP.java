// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import java.util.Objects;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

public final class 2Dp extends 1uM
{
    public final Gxi LIZ;
    public final 5DO LIZJ;
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(6952);
    }
    
    public 2Dp(final Gxi liz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: getstatic       X/0je.LJI:I
        //     9: invokespecial   X/1uM.<init>:(LX/Gxi;I)V
        //    12: aload_0        
        //    13: aload_1        
        //    14: putfield        X/2Dp.LIZ:LX/Gxi;
        //    17: aload_0        
        //    18: getstatic       X/1uN.LIZ:LX/1uN;
        //    21: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    24: putfield        X/2Dp.LIZJ:LX/5DO;
        //    27: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
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
    
    private final ValueAnimator LIZJ() {
        return (ValueAnimator)this.LIZJ.getValue();
    }
    
    @Override
    public final void LIZ(final 1JM 1jm) {
        public final class 0jl implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ ConstraintProperty LIZ;
            
            static {
                Covode.recordClassIndex(6953);
            }
            
            public 0jl(final ConstraintProperty liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final ConstraintProperty liz = this.LIZ;
                n.LIZIZ((Object)valueAnimator, "");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                liz.translationY((float)animatedValue);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   X/1uM.LIZ:(LX/1JM;)V
        //     9: getstatic       com/bytedance/android/livesdk/livesetting/publicscreen/LiveGiftTrayPublicScreenTranslateSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/publicscreen/LiveGiftTrayPublicScreenTranslateSetting;
        //    12: aload_1        
        //    13: getfield        X/1JM.LIZ:LX/Gh3;
        //    16: getfield        X/Gh3.LIZLLL:LX/2X1;
        //    19: invokevirtual   com/bytedance/android/livesdk/livesetting/publicscreen/LiveGiftTrayPublicScreenTranslateSetting.giftTrayTranslateWithPublicScreen:(LX/2X1;)Z
        //    22: ifeq            187
        //    25: aload_1        
        //    26: getfield        X/1JM.LIZ:LX/Gh3;
        //    29: getfield        X/Gh3.LIZ:Z
        //    32: ifeq            200
        //    35: aload_0        
        //    36: aload_1        
        //    37: getfield        X/1JM.LIZ:LX/Gh3;
        //    40: getfield        X/Gh3.LIZIZ:I
        //    43: putfield        X/2Dp.LIZLLL:I
        //    46: aload_0        
        //    47: getfield        X/2Dp.LIZLLL:I
        //    50: istore_2       
        //    51: iload_2        
        //    52: ifle            194
        //    55: aload_0        
        //    56: getfield        X/2Dp.LIZ:LX/Gxi;
        //    59: invokevirtual   com/bytedance/ies/sdk/widgets/LayeredElementContext.getContainer:()Landroid/view/ViewGroup;
        //    62: invokevirtual   android/view/ViewGroup.getHeight:()I
        //    65: istore_3       
        //    66: aload_0        
        //    67: getfield        X/2Dp.LIZ:LX/Gxi;
        //    70: getstatic       X/0jh.LJII:I
        //    73: invokevirtual   com/bytedance/ies/sdk/widgets/LayeredElementContext.getConstraintPropertyById:(I)Lcom/bytedance/ies/sdk/widgets/ConstraintProperty;
        //    76: astore_1       
        //    77: aload_1        
        //    78: ifnull          188
        //    81: aload_1        
        //    82: invokevirtual   com/bytedance/ies/sdk/widgets/ConstraintProperty.getView:()Landroid/view/View;
        //    85: astore_1       
        //    86: aload_1        
        //    87: ifnull          188
        //    90: aload_1        
        //    91: invokevirtual   android/view/View.getBottom:()I
        //    94: istore          4
        //    96: iload_2        
        //    97: iload_3        
        //    98: iload           4
        //   100: isub           
        //   101: isub           
        //   102: istore          4
        //   104: iload           4
        //   106: i2f            
        //   107: fneg           
        //   108: fstore          5
        //   110: aload_0        
        //   111: invokespecial   X/2Dp.LIZJ:()Landroid/animation/ValueAnimator;
        //   114: invokevirtual   android/animation/ValueAnimator.cancel:()V
        //   117: aload_0        
        //   118: invokespecial   X/2Dp.LIZJ:()Landroid/animation/ValueAnimator;
        //   121: invokevirtual   android/animation/ValueAnimator.removeAllUpdateListeners:()V
        //   124: aload_0        
        //   125: invokevirtual   X/1ja.LIZ:()Lcom/bytedance/ies/sdk/widgets/ConstraintProperty;
        //   128: astore_1       
        //   129: aload_1        
        //   130: ifnull          187
        //   133: aload_1        
        //   134: invokevirtual   com/bytedance/ies/sdk/widgets/ConstraintProperty.translationY:()F
        //   137: fload           5
        //   139: fcmpg          
        //   140: ifeq            187
        //   143: aload_0        
        //   144: invokespecial   X/2Dp.LIZJ:()Landroid/animation/ValueAnimator;
        //   147: iconst_2       
        //   148: newarray        F
        //   150: dup            
        //   151: iconst_0       
        //   152: aload_1        
        //   153: invokevirtual   com/bytedance/ies/sdk/widgets/ConstraintProperty.translationY:()F
        //   156: fastore        
        //   157: dup            
        //   158: iconst_1       
        //   159: fload           5
        //   161: fastore        
        //   162: invokevirtual   android/animation/ValueAnimator.setFloatValues:([F)V
        //   165: aload_0        
        //   166: invokespecial   X/2Dp.LIZJ:()Landroid/animation/ValueAnimator;
        //   169: new             LX/0jl;
        //   172: dup            
        //   173: aload_1        
        //   174: invokespecial   X/0jl.<init>:(Lcom/bytedance/ies/sdk/widgets/ConstraintProperty;)V
        //   177: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   180: aload_0        
        //   181: invokespecial   X/2Dp.LIZJ:()Landroid/animation/ValueAnimator;
        //   184: invokevirtual   android/animation/ValueAnimator.start:()V
        //   187: return         
        //   188: iconst_0       
        //   189: istore          4
        //   191: goto            96
        //   194: iconst_0       
        //   195: istore          4
        //   197: goto            104
        //   200: aload_0        
        //   201: iconst_0       
        //   202: putfield        X/2Dp.LIZLLL:I
        //   205: aload_1        
        //   206: getfield        X/1JM.LIZIZ:LX/Gh3;
        //   209: astore_1       
        //   210: aload_1        
        //   211: ifnull          46
        //   214: getstatic       com/bytedance/android/livesdk/livesetting/publicscreen/LiveGiftTrayPublicScreenTranslateSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/publicscreen/LiveGiftTrayPublicScreenTranslateSetting;
        //   217: aload_1        
        //   218: getfield        X/Gh3.LIZLLL:LX/2X1;
        //   221: invokevirtual   com/bytedance/android/livesdk/livesetting/publicscreen/LiveGiftTrayPublicScreenTranslateSetting.giftTrayTranslateWithPublicScreen:(LX/2X1;)Z
        //   224: ifeq            46
        //   227: aload_0        
        //   228: aload_1        
        //   229: getfield        X/Gh3.LIZIZ:I
        //   232: putfield        X/2Dp.LIZLLL:I
        //   235: goto            46
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
    
    @Override
    public final boolean LIZIZ(final 1JM 1jm) {
        CTM.LIZ((Object)1jm);
        return LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canStatusWidgetsAlphaXfer(1jm.LIZ.LIZLLL);
    }
}
