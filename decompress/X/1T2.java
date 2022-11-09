// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 1T2 implements 0q5
{
    public static final a LIZJ;
    public final DataChannel LIZ;
    public InteractDialogFragmentBaseContract.c LIZIZ;
    
    static {
        Covode.recordClassIndex(8299);
        LIZJ = new a((byte)0);
    }
    
    public 1T2(final DataChannel liz, final InteractDialogFragmentBaseContract.c liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public static final void LIZ(final DataChannel dataChannel, final InteractDialogFragmentBaseContract.c c) {
        1T2.LIZJ.LIZ(dataChannel, c);
    }
    
    @Override
    public final String LIZ() {
        return "LinkDialog";
    }
    
    @Override
    public final void LIZ(final QgG<2P9> qgG) {
        public final class 0q7 implements DialogInterface$OnDismissListener
        {
            public final /* synthetic */ QgG LIZ;
            
            static {
                Covode.recordClassIndex(8301);
            }
            
            public 0q7(final QgG liz) {
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
        //     5: getfield        X/1T2.LIZIZ:LX/0l1;
        //     8: new             LX/0q7;
        //    11: dup            
        //    12: aload_1        
        //    13: invokespecial   X/0q7.<init>:(LX/QgG;)V
        //    16: invokeinterface X/0l1.LIZ:(Landroid/content/DialogInterface$OnDismissListener;)V
        //    21: return         
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
    public final void LIZIZ() {
        final DataChannel liz = this.LIZ;
        if (liz != null) {
            final 0AB 0ab = (0AB)liz.LIZIZ((Class)G73.class);
            if (0ab != null) {
                this.LIZIZ.show(0ab, "LinkDialog");
            }
        }
    }
    
    @Override
    public final void LIZJ() {
        this.LIZIZ.dismiss();
    }
    
    @Override
    public final boolean LIZLLL() {
        return this.LIZIZ.isVisible();
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(8300);
        }
        
        public final void LIZ(final DataChannel dataChannel, final InteractDialogFragmentBaseContract.c c) {
            CTM.LIZ((Object)c);
            0q3.LIZ(new 1T2(dataChannel, c));
        }
    }
}
