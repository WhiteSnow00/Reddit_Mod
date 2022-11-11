// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.Fragment;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.LinkDialog;
import android.view.View;

public final class 1wQ extends F5g implements QgG<View>
{
    public final /* synthetic */ LinkDialog LIZ;
    
    static {
        Covode.recordClassIndex(7491);
    }
    
    public 1wQ(final LinkDialog liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public final View LIZ() {
        public final class 0m3 implements View$OnClickListener
        {
            public final /* synthetic */ 1wQ LIZ;
            
            static {
                Covode.recordClassIndex(7492);
            }
            
            public 0m3(final 1wQ liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                if (this.LIZ.LIZ.LJI().LIZ()) {
                    ((Fragment)this.LIZ.LIZ).getChildFragmentManager().LIZJ();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: getfield        X/1wQ.LIZ:Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/LinkDialog;
        //     8: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //    11: invokespecial   X/1It.<init>:(Landroid/content/Context;)V
        //    14: astore_1       
        //    15: aload_1        
        //    16: new             Landroid/view/ViewGroup$LayoutParams;
        //    19: dup            
        //    20: ldc             24.0
        //    22: invokestatic    X/0cB.LIZ:(F)I
        //    25: ldc             24.0
        //    27: invokestatic    X/0cB.LIZ:(F)I
        //    30: invokespecial   android/view/ViewGroup$LayoutParams.<init>:(II)V
        //    33: invokevirtual   X/1It.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //    36: aload_1        
        //    37: aload_1        
        //    38: invokevirtual   X/1It.getContext:()Landroid/content/Context;
        //    41: ldc             2130970159
        //    43: invokestatic    X/0eI.LIZIZ:(Landroid/content/Context;I)LX/1Iu;
        //    46: invokevirtual   X/1It.setIcon:(Landroid/graphics/drawable/Drawable;)V
        //    49: aload_1        
        //    50: new             LX/0m3;
        //    53: dup            
        //    54: aload_0        
        //    55: invokespecial   X/0m3.<init>:(LX/1wQ;)V
        //    58: invokevirtual   X/1It.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    61: aload_1        
        //    62: areturn        
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
