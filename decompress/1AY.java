// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.TimeUnit;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.covode.number.Covode;

public final class 1aY implements F7Q
{
    public final /* synthetic */ 1au LIZ;
    
    static {
        Covode.recordClassIndex(9856);
    }
    
    public 1aY(final 1au liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        public final class 1aW<T> implements 2d6
        {
            public final /* synthetic */ 1aY LIZ;
            
            static {
                Covode.recordClassIndex(9857);
            }
            
            public 1aW(final 1aY liz) {
                this.LIZ = liz;
            }
        }
        public final class 1aX<T> implements 2d6
        {
            public final /* synthetic */ 1aY LIZ;
            
            static {
                Covode.recordClassIndex(9858);
            }
            
            public 1aX(final 1aY liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "MultiMatchViewAnchorPre"
        //     3: ldc             "BattleCountDown, finish"
        //     5: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //     8: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting;
        //    11: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting.getValue:()J
        //    14: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //    17: invokestatic    X/FBF.LIZIZ:(JLjava/util/concurrent/TimeUnit;)LX/FBF;
        //    20: getstatic       X/F8V.LIZ:LX/FFV;
        //    23: invokestatic    X/F8U.LIZ:(LX/FFV;)LX/FFV;
        //    26: invokevirtual   X/FBF.LIZ:(LX/FFV;)LX/FBF;
        //    29: aload_0        
        //    30: getfield        X/1aY.LIZ:LX/1au;
        //    33: invokevirtual   X/0vy.LJ:()LX/FCn;
        //    36: invokevirtual   X/FBF.LIZ:(LX/FBZ;)Ljava/lang/Object;
        //    39: checkcast       LX/FIc;
        //    42: new             LX/1aW;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   X/1aW.<init>:(LX/1aY;)V
        //    50: new             LX/1aX;
        //    53: dup            
        //    54: aload_0        
        //    55: invokespecial   X/1aX.<init>:(LX/1aY;)V
        //    58: invokeinterface X/FIc.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //    63: pop            
        //    64: return         
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
