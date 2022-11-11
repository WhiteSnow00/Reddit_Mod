// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public class 1qp extends 1hx
{
    static {
        Covode.recordClassIndex(4658);
    }
    
    @Override
    public final String LIZ() {
        return "pipo.getStarlingData";
    }
    
    @Override
    public final void LIZ(final Pka pka, final Hya hya, final I0l i0l) {
        public final class 1EE implements a
        {
            public final /* synthetic */ Hya LIZ;
            
            static {
                Covode.recordClassIndex(4659);
            }
            
            public 1EE(final 1qp 1qp, final Hya liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final Map<String, String> map) {
                0U7.LIZ(map, this.LIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: invokespecial   X/1hx.LIZ:(LX/Pka;LX/Hya;LX/I0l;)V
        //     7: aload_1        
        //     8: ldc             "language"
        //    10: invokeinterface X/Pka.LJFF:(Ljava/lang/String;)Ljava/lang/String;
        //    15: astore_3       
        //    16: aload_1        
        //    17: ldc             "url"
        //    19: invokeinterface X/Pka.LJFF:(Ljava/lang/String;)Ljava/lang/String;
        //    24: astore_1       
        //    25: aload_3        
        //    26: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    29: ifeq            39
        //    32: ldc             "language is null!"
        //    34: aload_2        
        //    35: invokestatic    X/0U7.LIZ:(Ljava/lang/String;LX/Hya;)V
        //    38: return         
        //    39: aload_1        
        //    40: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    43: ifeq            53
        //    46: ldc             "url is null!"
        //    48: aload_2        
        //    49: invokestatic    X/0U7.LIZ:(Ljava/lang/String;LX/Hya;)V
        //    52: return         
        //    53: getstatic       X/1EK.LIZ:LX/1EK;
        //    56: invokevirtual   X/1EK.LJII:()LX/0UF;
        //    59: aload_1        
        //    60: new             LX/1EE;
        //    63: dup            
        //    64: aload_0        
        //    65: aload_2        
        //    66: invokespecial   X/1EE.<init>:(LX/1qp;LX/Hya;)V
        //    69: aload_3        
        //    70: invokeinterface X/0UF.LIZ:(Ljava/lang/String;LX/0UE;Ljava/lang/String;)V
        //    75: return         
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
