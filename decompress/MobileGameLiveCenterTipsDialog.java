// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.livecenter;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import X.1ib;
import X.CTM;
import android.view.View$OnClickListener;
import android.app.Dialog;
import kotlin.jvm.internal.n;
import android.content.Context;
import X.0et;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class MobileGameLiveCenterTipsDialog extends LiveDialogFragment
{
    public HashMap LIZ;
    
    static {
        Covode.recordClassIndex(5437);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561864);
        fpL.LJIIJJI = 48;
        fpL.LJI = 17;
        fpL.LJII = -1;
        fpL.LJIIIIZZ = -2;
        fpL.LIZIZ = 2131887286;
        fpL.LJ = false;
        fpL.LJFF = 0.5f;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LIZ == null) {
            this.LIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LIZ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap liz = this.LIZ;
        if (liz != null) {
            liz.clear();
        }
    }
    
    public final LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        final LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(0et.LIZ((Context)((Fragment)this).getActivity()));
        n.LIZIZ((Object)cloneInContext, "");
        return cloneInContext;
    }
    
    public final void onStart() {
        super.onStart();
        final Dialog dialog = ((DialogFragment)this).getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        final Dialog dialog2 = ((DialogFragment)this).getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 0Zh implements View$OnClickListener
        {
            public final /* synthetic */ MobileGameLiveCenterTipsDialog LIZ;
            
            static {
                Covode.recordClassIndex(5438);
            }
            
            public 0Zh(final MobileGameLiveCenterTipsDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
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
        //    10: aload_1        
        //    11: ldc             2131373100
        //    13: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    16: checkcast       LX/1ib;
        //    19: new             LX/0Zh;
        //    22: dup            
        //    23: aload_0        
        //    24: invokespecial   X/0Zh.<init>:(Lcom/bytedance/android/live/broadcast/livecenter/MobileGameLiveCenterTipsDialog;)V
        //    27: invokevirtual   X/1ib.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    30: return         
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
