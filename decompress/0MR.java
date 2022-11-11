// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class 0mr
{
    public static final 0mr LIZ;
    
    static {
        Covode.recordClassIndex(7667);
        LIZ = new 0mr();
    }
    
    public static final void LIZ(final Room room, final QgG<2P9> qgG) {
        public final class 1xB extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ Room LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(7668);
            }
            
            public 1xB(final Room liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: getstatic       X/1dP.LIZJ:LX/0yC;
        //     7: invokevirtual   X/0yC.LIZ:()LX/0yA;
        //    10: astore_2       
        //    11: aload_2        
        //    12: ifnull          33
        //    15: aload_2        
        //    16: ldc             "multi_guest_v3_icon"
        //    18: new             LX/1xB;
        //    21: dup            
        //    22: aload_0        
        //    23: aload_1        
        //    24: invokespecial   X/1xB.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;LX/QgG;)V
        //    27: invokeinterface X/0yA.LIZ:(Ljava/lang/String;LX/QgG;)V
        //    32: return         
        //    33: getstatic       X/0mr.LIZ:LX/0mr;
        //    36: aload_0        
        //    37: aload_1        
        //    38: invokevirtual   X/0mr.LIZIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;LX/QgG;)V
        //    41: return         
        //    Signature:
        //  (Lcom/bytedance/android/livesdkapi/depend/model/live/Room;LX/QgG<LX/2P9;>;)V
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
    
    private final boolean LIZ(final Room room) {
        if (!GKz.LIZ()) {
            return false;
        }
        if (!LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC)) {
            Hf4.LIZ(0cB.LJ(), 2131835711);
            return false;
        }
        if (room != null && room.getMosaicStatus() == 1) {
            Hf4.LIZ(0cB.LJ(), 2131835948);
            1ZT.LJ.LIZIZ();
            return false;
        }
        return true;
    }
    
    public final void LIZIZ(final Room room, final QgG<2P9> qgG) {
        if (!this.LIZ(room)) {
            return;
        }
        qgG.invoke();
    }
}
