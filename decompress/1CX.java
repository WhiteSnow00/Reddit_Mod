// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public final class 1cx implements Vvl
{
    public final /* synthetic */ 1cy LIZ;
    
    static {
        Covode.recordClassIndex(10269);
    }
    
    public 1cx(final 1cy liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        if (System.currentTimeMillis() - this.LIZ.LJIIIIZZ > 5000L) {
            final 1cy liz = this.LIZ;
            if (liz.LIZLLL() == 4 || liz.LJIIIZ == 2) {
                liz.LIZJ();
            }
        }
    }
    
    public final void LIZ(final L76 l76) {
        CTM.LIZ((Object)l76);
        this.LIZ.LJIIIIZZ = System.currentTimeMillis();
        final 1cy liz = this.LIZ;
        final L7A ljiiiizz = l76.LJIIIIZZ;
        int liz2;
        if (ljiiiizz != null) {
            liz2 = ljiiiizz.LIZ;
        }
        else {
            liz2 = 0;
        }
        liz.LJIIIZ = liz2;
        if (l76.LIZIZ == 2) {
            final 1cy liz3 = this.LIZ;
            if (liz3.LIZLLL() == 4) {
                liz3.LIZJ();
            }
        }
    }
    
    public final void LIZIZ(final L76 l76) {
        public final class 297 extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1cx LIZ;
            public final /* synthetic */ L76 LIZIZ;
            
            static {
                Covode.recordClassIndex(10270);
            }
            
            public 297(final 1cx liz, final L76 liziz) {
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
        //     4: aload_0        
        //     5: getfield        X/1cx.LIZ:LX/1cy;
        //     8: new             LX/297;
        //    11: dup            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   X/297.<init>:(LX/1cx;LX/L76;)V
        //    17: invokevirtual   X/1cy.LIZ:(LX/QgG;)V
        //    20: return         
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
