// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.TimeUnit;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.covode.number.Covode;

public final class 1bD implements F7Q
{
    public final /* synthetic */ 1bJ LIZ;
    
    static {
        Covode.recordClassIndex(9923);
    }
    
    public 1bD(final 1bJ liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        public final class 1bB<T> implements 2d6
        {
            public final /* synthetic */ 1bD LIZ;
            
            static {
                Covode.recordClassIndex(9924);
            }
            
            public 1bB(final 1bD liz) {
                this.LIZ = liz;
            }
        }
        public final class 1bC<T> implements 2d6
        {
            public final /* synthetic */ 1bD LIZ;
            
            static {
                Covode.recordClassIndex(9925);
            }
            
            public 1bC(final 1bD liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        X/1Qk.LIZJ:Z
        //     6: invokestatic    X/1lI.LIZJ:(Z)V
        //     9: iconst_4       
        //    10: ldc             "TwoMatchViewAnchorPrese"
        //    12: ldc             "BattleCountDown, finish"
        //    14: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    17: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting;
        //    20: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting.getValue:()J
        //    23: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //    26: invokestatic    X/FBF.LIZIZ:(JLjava/util/concurrent/TimeUnit;)LX/FBF;
        //    29: getstatic       X/F8V.LIZ:LX/FFV;
        //    32: invokestatic    X/F8U.LIZ:(LX/FFV;)LX/FFV;
        //    35: invokevirtual   X/FBF.LIZ:(LX/FFV;)LX/FBF;
        //    38: aload_0        
        //    39: getfield        X/1bD.LIZ:LX/1bJ;
        //    42: invokevirtual   X/0vy.LJ:()LX/FCn;
        //    45: invokevirtual   X/FBF.LIZ:(LX/FBZ;)Ljava/lang/Object;
        //    48: checkcast       LX/FIc;
        //    51: new             LX/1bB;
        //    54: dup            
        //    55: aload_0        
        //    56: invokespecial   X/1bB.<init>:(LX/1bD;)V
        //    59: new             LX/1bC;
        //    62: dup            
        //    63: aload_0        
        //    64: invokespecial   X/1bC.<init>:(LX/1bD;)V
        //    67: invokeinterface X/FIc.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //    72: pop            
        //    73: return         
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
