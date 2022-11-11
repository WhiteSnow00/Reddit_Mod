// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.dialog;

import X.44T;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;
import X.44V;
import X.Hf4;
import X.0cB;
import kotlin.jvm.internal.n;
import X.GST;
import X.0AB;
import android.view.View$OnClickListener;
import android.os.Bundle;
import X.CTM;
import android.content.Context;
import X.0vm;
import X.1JQ;
import X.0ba;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import X.FpL;
import X.1jw;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0kV;
import X.1Uo;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.PreviewDialogFragment;

public final class GuestMediaManagePanel extends PreviewDialogFragment
{
    public GuestMediaManageFragment LIZ;
    @0kV(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public final 1Uo LIZIZ;
    public HashMap LIZJ;
    
    static {
        Covode.recordClassIndex(8756);
    }
    
    public GuestMediaManagePanel() {
        1jw.LIZ.LIZIZ(this);
    }
    
    public static final /* synthetic */ void LIZ(final GuestMediaManagePanel guestMediaManagePanel) {
        guestMediaManagePanel.dismiss();
    }
    
    public final boolean D_() {
        ((DialogFragment)this).dismiss();
        return true;
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561873);
        fpL.LIZIZ = 2131887257;
        fpL.LIZ((Drawable)new ColorDrawable(0));
        fpL.LJI = 80;
        fpL.LJIIIIZZ = -1;
        fpL.LJ = true;
        return fpL;
    }
    
    @Override
    public final View LIZ(final int n) {
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZJ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LIZJ.put(n, viewById);
        }
        return viewById;
    }
    
    @Override
    public final void LIZIZ() {
        final HashMap lizj = this.LIZJ;
        if (lizj != null) {
            lizj.clear();
        }
    }
    
    public final void dismiss() {
        public final class 0rw implements Runnable
        {
            public final /* synthetic */ GuestMediaManagePanel LIZ;
            
            static {
                Covode.recordClassIndex(8757);
            }
            
            public 0rw(final GuestMediaManagePanel liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                GuestMediaManagePanel.LIZ(this.LIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManagePanel.LIZ:Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          81
        //     9: iconst_4       
        //    10: getstatic       com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LIZ:Ljava/lang/String;
        //    13: ldc             "onDialogDismissOrBackPressed"
        //    15: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    18: aload_1        
        //    19: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LIZJ:Landroid/view/View;
        //    22: ifnull          33
        //    25: aload_1        
        //    26: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LIZJ:Landroid/view/View;
        //    29: iconst_0       
        //    30: invokevirtual   android/view/View.setVisibility:(I)V
        //    33: aload_1        
        //    34: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJJ:LX/1Uo;
        //    37: ifnull          76
        //    40: aload_1        
        //    41: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJJIFFI:LX/0g8;
        //    44: instanceof      LX/1JQ;
        //    47: ifeq            76
        //    50: aload_1        
        //    51: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJIILL:Z
        //    54: ifeq            76
        //    57: aload_1        
        //    58: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    61: aload_1        
        //    62: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJIIZILJ:Z
        //    65: aload_1        
        //    66: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJIILLIIL:Z
        //    69: aload_1        
        //    70: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJIIJJI:Z
        //    73: invokestatic    X/0vm.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;ZZZ)V
        //    76: aload_1        
        //    77: iconst_1       
        //    78: putfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LJJI:Z
        //    81: aload_0        
        //    82: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManagePanel.LIZ:Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment;
        //    85: astore_1       
        //    86: aload_1        
        //    87: ifnull          112
        //    90: aload_1        
        //    91: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment.LIZJ:Landroid/view/View;
        //    94: astore_1       
        //    95: aload_1        
        //    96: ifnull          112
        //    99: aload_1        
        //   100: new             LX/0rw;
        //   103: dup            
        //   104: aload_0        
        //   105: invokespecial   X/0rw.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManagePanel;)V
        //   108: invokevirtual   android/view/View.post:(Ljava/lang/Runnable;)Z
        //   111: pop            
        //   112: return         
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
    
    public final void onAttach(final Context context) {
        CTM.LIZ((Object)context);
        super.onAttach(context);
        final 1Uo liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LJ = true;
        }
    }
    
    public final void onDetach() {
        super.onDetach();
        final 1Uo liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LJ = false;
        }
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 0rx implements View$OnClickListener
        {
            public final /* synthetic */ GuestMediaManagePanel LIZ;
            
            static {
                Covode.recordClassIndex(8758);
            }
            
            public 0rx(final GuestMediaManagePanel liz) {
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
        //    10: aload_0        
        //    11: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LJJ:()LX/FpL;
        //    14: fconst_0       
        //    15: putfield        X/FpL.LJFF:F
        //    18: aload_0        
        //    19: ldc             2131369039
        //    21: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    24: new             LX/0rx;
        //    27: dup            
        //    28: aload_0        
        //    29: invokespecial   X/0rx.<init>:(Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManagePanel;)V
        //    32: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    35: aload_0        
        //    36: getfield        com/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManagePanel.LIZ:Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/GuestMediaManageFragment;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          65
        //    44: aload_0        
        //    45: invokevirtual   androidx/fragment/app/Fragment.getChildFragmentManager:()LX/0AB;
        //    48: invokevirtual   X/0AB.LIZ:()LX/0AO;
        //    51: astore_2       
        //    52: aload_2        
        //    53: ldc             2131365523
        //    55: aload_1        
        //    56: invokevirtual   X/0AO.LIZ:(ILandroidx/fragment/app/Fragment;)LX/0AO;
        //    59: pop            
        //    60: aload_2        
        //    61: invokevirtual   X/0AO.LIZIZ:()I
        //    64: pop            
        //    65: return         
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
    
    public final void show(final 0AB 0ab, final String s) {
        CTM.LIZ((Object)0ab);
        final GuestMediaManageFragment liz = this.LIZ;
        if (liz == null || liz.isAdded()) {
            return;
        }
        try {
            super.show(0ab, s);
            final 44V i = GST.i;
            n.LIZIZ((Object)i, "");
            if (n.LIZ((Object)((44T)i).LIZ(), (Object)false)) {
                Hf4.LIZ(0cB.LJ(), 2131831297);
                final 44V j = GST.i;
                n.LIZIZ((Object)j, "");
                ((44T)j).LIZ((Object)true);
            }
        }
        catch (final Exception ex) {}
    }
}
