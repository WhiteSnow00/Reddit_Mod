// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 1Kg implements a
{
    public final /* synthetic */ DataChannel LIZ;
    
    static {
        Covode.recordClassIndex(6402);
    }
    
    public 1Kg(final DataChannel liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final List<1JS> list) {
        public final class 1Kf implements b
        {
            public final /* synthetic */ 1Kg LIZ;
            
            static {
                Covode.recordClassIndex(6403);
            }
            
            public 1Kf(final 1Kg liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ() {
            }
            
            @Override
            public final void LIZ(final List<? extends LiveEffect> list) {
                CTM.LIZ((Object)list);
                final DataChannel liz = this.LIZ.LIZ;
                if (liz != null) {
                    liz.LIZIZ((Class)2C2.class, (Object)list);
                }
            }
            
            @Override
            public final void LIZIZ(final List<? extends LiveEffect> list) {
                CTM.LIZ((Object)list);
                final DataChannel liz = this.LIZ.LIZ;
                if (liz != null) {
                    liz.LIZIZ((Class)2C3.class, (Object)list);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_1        
        //     5: invokestatic    X/Qsi.LJIIJJI:(Ljava/util/List;)Ljava/lang/Object;
        //     8: checkcast       LX/1JS;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnull          34
        //    16: getstatic       X/1Kj.LIZIZ:LX/1Kj;
        //    19: aload_1        
        //    20: getfield        X/1JS.LIZIZ:Ljava/lang/String;
        //    23: new             LX/1Kf;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   X/1Kf.<init>:(LX/1Kg;)V
        //    31: invokevirtual   X/1Kj.LIZ:(Ljava/lang/String;LX/0gP;)V
        //    34: return         
        //    Signature:
        //  (Ljava/util/List<LX/1JS;>;)V
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
