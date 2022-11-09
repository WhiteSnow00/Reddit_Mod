// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1e8 extends 43L
{
    public final 5DO LIZ;
    public final 5DO LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(10579);
    }
    
    public 1e8(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 1e8(final Context context, final AttributeSet set, final char c) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: iconst_0       
        //     8: invokespecial   X/43L.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: aload_0        
        //    12: new             LX/2A5;
        //    15: dup            
        //    16: aload_0        
        //    17: invokespecial   X/2A5.<init>:(LX/1e8;)V
        //    20: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    23: putfield        X/1e8.LIZ:LX/5DO;
        //    26: aload_0        
        //    27: new             LX/2A4;
        //    30: dup            
        //    31: aload_0        
        //    32: invokespecial   X/2A4.<init>:(LX/1e8;)V
        //    35: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    38: putfield        X/1e8.LIZIZ:LX/5DO;
        //    41: aload_0        
        //    42: ldc             4.0
        //    44: invokestatic    X/0cB.LIZ:(F)I
        //    47: putfield        X/1e8.LIZJ:I
        //    50: return         
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
    
    public final int getGap() {
        return this.LIZJ;
    }
    
    public final View getLabel() {
        return (View)this.LIZIZ.getValue();
    }
    
    public final View getName() {
        return (View)this.LIZ.getValue();
    }
    
    public final void setGap(final int lizj) {
        this.LIZJ = lizj;
    }
}
