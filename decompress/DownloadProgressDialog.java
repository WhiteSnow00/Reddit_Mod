// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.highlight;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import X.CTM;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.app.Dialog;
import android.view.View;
import X.0cB;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.widget.ImageView;
import X.1ib;
import android.widget.ProgressBar;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class DownloadProgressDialog extends LiveDialogFragment
{
    public ProgressBar LIZ;
    public 1ib LIZIZ;
    public a LIZJ;
    public ImageView LIZLLL;
    public HashMap LJ;
    
    static {
        Covode.recordClassIndex(5402);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561796);
        fpL.LJIIIIZZ = 0cB.LIZ(106.0f);
        fpL.LJII = 0cB.LIZ(113.0f);
        fpL.LJI = 17;
        fpL.LJ = false;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap lj = this.LJ;
        if (lj != null) {
            lj.clear();
        }
    }
    
    public final void onStart() {
        super.onStart();
        final Dialog dialog = ((DialogFragment)this).getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 0ZT implements View$OnClickListener
        {
            public final /* synthetic */ DownloadProgressDialog LIZ;
            
            static {
                Covode.recordClassIndex(5404);
            }
            
            public 0ZT(final DownloadProgressDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final a lizj = this.LIZ.LIZJ;
                if (lizj != null) {
                    lizj.LIZ();
                }
                ((DialogFragment)this.LIZ).dismiss();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    10: aload_0        
        //    11: aload_1        
        //    12: ldc             2131369157
        //    14: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    17: checkcast       Landroid/widget/ProgressBar;
        //    20: putfield        com/bytedance/android/live/broadcast/highlight/DownloadProgressDialog.LIZ:Landroid/widget/ProgressBar;
        //    23: aload_0        
        //    24: aload_1        
        //    25: ldc             2131373385
        //    27: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    30: checkcast       LX/1ib;
        //    33: putfield        com/bytedance/android/live/broadcast/highlight/DownloadProgressDialog.LIZIZ:LX/1ib;
        //    36: aload_1        
        //    37: ldc             2131363082
        //    39: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    42: checkcast       Landroid/widget/ImageView;
        //    45: astore_1       
        //    46: aload_0        
        //    47: aload_1        
        //    48: putfield        com/bytedance/android/live/broadcast/highlight/DownloadProgressDialog.LIZLLL:Landroid/widget/ImageView;
        //    51: aload_1        
        //    52: ifnull          67
        //    55: aload_1        
        //    56: new             LX/0ZT;
        //    59: dup            
        //    60: aload_0        
        //    61: invokespecial   X/0ZT.<init>:(Lcom/bytedance/android/live/broadcast/highlight/DownloadProgressDialog;)V
        //    64: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    67: return         
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
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(5403);
        }
        
        void LIZ();
    }
}
