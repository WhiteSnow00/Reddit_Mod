// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0Q9
{
    static {
        Covode.recordClassIndex(4255);
    }
    
    public static final String LIZ(final 1DD 1dd) {
        CTM.LIZ((Object)1dd);
        return 1dd.LIZ;
    }
    
    public static final void LIZ(final String s, final 1DN 1dn) {
        CTM.LIZ((Object)s, (Object)1dn);
        CTM.LIZ((Object)1dn, (Object)s);
        final 1DN 1dn2 = 0Q8.LIZ.LIZJ((X.QgG<? extends 1DN>)new 1pf(s, 1dn));
        if (1dn2 != null) {
            0Pz.LIZ.LIZ(1dn2);
        }
    }
    
    public static final void LIZIZ(final String s, final 1DN 1dn) {
        public final class 1pg extends F5g implements SRS<1DN, Boolean>
        {
            public final /* synthetic */ 1DN LIZ;
            
            static {
                Covode.recordClassIndex(4256);
            }
            
            public 1pg(final 1DN liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: new             LX/1pg;
        //     8: dup            
        //     9: aload_1        
        //    10: invokespecial   X/1pg.<init>:(LX/1DN;)V
        //    13: astore_2       
        //    14: aload_0        
        //    15: aload_2        
        //    16: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    19: getstatic       X/0Q8.LIZ:LX/0Q6;
        //    22: new             LX/1pc;
        //    25: dup            
        //    26: aload_0        
        //    27: aload_2        
        //    28: invokespecial   X/1pc.<init>:(Ljava/lang/String;LX/SRS;)V
        //    31: invokevirtual   X/0Q6.LIZJ:(LX/QgG;)Ljava/lang/Object;
        //    34: pop            
        //    35: getstatic       X/0Pz.LIZ:LX/0Pz;
        //    38: aload_1        
        //    39: invokevirtual   X/0Pz.LIZ:(LX/1DN;)V
        //    42: return         
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
