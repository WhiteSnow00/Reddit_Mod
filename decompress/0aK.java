// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.view.View$OnClickListener;

public final class 0aK implements View$OnClickListener
{
    public final /* synthetic */ G1p LIZ;
    public final /* synthetic */ Context LIZIZ;
    
    static {
        Covode.recordClassIndex(5498);
    }
    
    public 0aK(final G1p liz, final Context liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        public final class 1sK extends F5g implements SRS<String, 2P9>
        {
            public final /* synthetic */ 0aK LIZ;
            
            static {
                Covode.recordClassIndex(5499);
            }
            
            public 1sK(final 0aK liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc             "livesdk_enter_live_appeal_page"
        //     5: invokevirtual   X/Gkq.LIZ:(Ljava/lang/String;)LX/Gkn;
        //     8: astore_1       
        //     9: aload_1        
        //    10: invokevirtual   X/Gkn.LIZ:()LX/Gkn;
        //    13: pop            
        //    14: aload_1        
        //    15: ldc             "enter_from"
        //    17: ldc             "popup"
        //    19: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //    22: pop            
        //    23: aload_1        
        //    24: ldc             "appeal_type"
        //    26: ldc             "general"
        //    28: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //    31: pop            
        //    32: aload_1        
        //    33: invokevirtual   X/Gkn.LIZLLL:()V
        //    36: aload_0        
        //    37: getfield        X/0aK.LIZ:LX/G1p;
        //    40: astore_2       
        //    41: aload_0        
        //    42: getfield        X/0aK.LIZIZ:Landroid/content/Context;
        //    45: astore_1       
        //    46: aload_1        
        //    47: ifnonnull       53
        //    50: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //    53: new             LX/1sK;
        //    56: dup            
        //    57: aload_0        
        //    58: invokespecial   X/1sK.<init>:(LX/0aK;)V
        //    61: astore_3       
        //    62: aload_2        
        //    63: aload_1        
        //    64: aload_2        
        //    65: getfield        X/G1p.LJ:Ljava/lang/String;
        //    68: aload_3        
        //    69: invokevirtual   X/G1p.LIZ:(Landroid/content/Context;Ljava/lang/String;LX/SRS;)V
        //    72: return         
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
