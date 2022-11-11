// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public abstract class 0Qv
{
    public final QgG<String> LIZ;
    public final Map<String, String> LIZIZ;
    public QgG<String> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final int LJI;
    public final 0RS.a LJII;
    public final 0Qx LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(4368);
    }
    
    public 0Qv() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: getstatic       X/1q6.LIZ:LX/1q6;
        //     8: putfield        X/0Qv.LIZJ:LX/QgG;
        //    11: aload_0        
        //    12: ldc             0.5
        //    14: putfield        X/0Qv.LJFF:F
        //    17: aload_0        
        //    18: sipush          500
        //    21: putfield        X/0Qv.LJI:I
        //    24: aload_0        
        //    25: getstatic       X/0Qx.NORMAL:LX/0Qx;
        //    28: putfield        X/0Qv.LJIIIIZZ:LX/0Qx;
        //    31: return         
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
    
    public QgG<String> LIZ() {
        return this.LIZJ;
    }
    
    public void LIZ(final QgG<String> lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
    
    public QgG<String> LIZIZ() {
        return this.LIZ;
    }
    
    public Map<String, String> LIZJ() {
        return this.LIZIZ;
    }
    
    public 0RS.a LIZLLL() {
        return this.LJII;
    }
    
    public int LJ() {
        return this.LJI;
    }
    
    public float LJFF() {
        return this.LJFF;
    }
    
    public boolean LJI() {
        return this.LIZLLL;
    }
    
    public boolean LJII() {
        return this.LJ;
    }
    
    public 0Qx LJIIIIZZ() {
        return this.LJIIIIZZ;
    }
}
