// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import com.bytedance.covode.number.Covode;
import android.app.Dialog;

public abstract class 1T3 implements 0q5
{
    public Dialog LIZ;
    
    static {
        Covode.recordClassIndex(8302);
    }
    
    @Override
    public String LIZ() {
        return "LiveDialog";
    }
    
    @Override
    public final void LIZ(final QgG<2P9> qgG) {
        public final class 0q8 implements DialogInterface$OnDismissListener
        {
            public final /* synthetic */ QgG LIZ;
            
            static {
                Covode.recordClassIndex(8303);
            }
            
            public 0q8(final QgG liz) {
                this.LIZ = liz;
            }
            
            public final void onDismiss(final DialogInterface dialogInterface) {
                this.LIZ.invoke();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: getfield        X/1T3.LIZ:Landroid/app/Dialog;
        //     8: astore_2       
        //     9: aload_2        
        //    10: ifnull          25
        //    13: aload_2        
        //    14: new             LX/0q8;
        //    17: dup            
        //    18: aload_1        
        //    19: invokespecial   X/0q8.<init>:(LX/QgG;)V
        //    22: invokevirtual   android/app/Dialog.setOnDismissListener:(Landroid/content/DialogInterface$OnDismissListener;)V
        //    25: return         
        //    Signature:
        //  (LX/QgG<LX/2P9;>;)V
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
    
    @Override
    public final void LIZJ() {
        final Dialog liz = this.LIZ;
        if (liz != null) {
            liz.dismiss();
        }
        this.LIZ = null;
    }
    
    @Override
    public final boolean LIZLLL() {
        final Dialog liz = this.LIZ;
        return liz != null && liz.isShowing();
    }
}
