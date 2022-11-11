// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.ui.dialog;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import X.0lK;
import X.1so;
import X.0cB;
import X.0nC;
import X.0n9;
import X.1ib;
import X.1OZ;
import X.CTM;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.view.View;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0l9;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class RandomLinkMicCancelDialog extends LiveDialogFragment implements b
{
    public a LIZ;
    public boolean LIZIZ;
    public HashMap LIZJ;
    
    static {
        Covode.recordClassIndex(7497);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561896);
        fpL.LJI = 80;
        fpL.LJFF = 0.0f;
        fpL.LJII = -1;
        fpL.LJIIIIZZ = -2;
        return fpL;
    }
    
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
    
    public final void LIZIZ() {
        final HashMap lizj = this.LIZJ;
        if (lizj != null) {
            lizj.clear();
        }
    }
    
    public final void onDestroyView() {
        super.onDestroyView();
        this.LIZIZ();
    }
    
    public final void onViewCreated(final View viewById, final Bundle bundle) {
        public final class 0m6 implements View$OnClickListener
        {
            public final /* synthetic */ RandomLinkMicCancelDialog LIZ;
            
            static {
                Covode.recordClassIndex(7500);
            }
            
            public 0m6(final RandomLinkMicCancelDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final a liz = this.LIZ.LIZ;
                if (liz != null) {
                    liz.LIZ();
                }
            }
        }
        public final class 0m5 implements View$OnClickListener
        {
            public final /* synthetic */ RandomLinkMicCancelDialog LIZ;
            
            static {
                Covode.recordClassIndex(7499);
            }
            
            public 0m5(final RandomLinkMicCancelDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final a liz = this.LIZ.LIZ;
                if (liz != null) {
                    liz.LIZIZ();
                }
            }
        }
        public final class 0m4 implements View$OnClickListener
        {
            public final /* synthetic */ RandomLinkMicCancelDialog LIZ;
            
            static {
                Covode.recordClassIndex(7498);
            }
            
            public 0m4(final RandomLinkMicCancelDialog liz) {
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
        //    10: new             LX/1OZ;
        //    13: dup            
        //    14: invokespecial   X/1OZ.<init>:()V
        //    17: astore_2       
        //    18: aload_0        
        //    19: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    22: aload_2        
        //    23: aload_0        
        //    24: putfield        X/1OZ.LIZ:LX/0l8;
        //    27: aload_0        
        //    28: aload_2        
        //    29: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicCancelDialog.LIZ:LX/0l7;
        //    32: aload_1        
        //    33: ldc             2131373446
        //    35: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    38: checkcast       LX/1ib;
        //    41: astore_3       
        //    42: getstatic       X/0n9.LIZ:LX/1Qk;
        //    45: invokevirtual   X/1Qk.LIZJ:()LX/0nC;
        //    48: astore_2       
        //    49: aload_2        
        //    50: getstatic       X/0nC.START:LX/0nC;
        //    53: invokevirtual   X/0nC.compareTo:(Ljava/lang/Enum;)I
        //    56: iflt            190
        //    59: aload_2        
        //    60: getstatic       X/0nC.PUNISH:LX/0nC;
        //    63: invokevirtual   X/0nC.compareTo:(Ljava/lang/Enum;)I
        //    66: ifge            190
        //    69: ldc             2131829247
        //    71: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //    74: astore_2       
        //    75: aload_3        
        //    76: aload_2        
        //    77: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //    80: aload_1        
        //    81: ldc             2131363028
        //    83: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    86: checkcast       LX/1so;
        //    89: astore_2       
        //    90: invokestatic    X/0lK.LIZIZ:()Z
        //    93: ifeq            166
        //    96: aload_2        
        //    97: ldc             2131829528
        //    99: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   102: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   105: aload_2        
        //   106: new             LX/0m4;
        //   109: dup            
        //   110: aload_0        
        //   111: invokespecial   X/0m4.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicCancelDialog;)V
        //   114: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   117: aload_1        
        //   118: ldc             2131363029
        //   120: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   123: checkcast       LX/1so;
        //   126: new             LX/0m6;
        //   129: dup            
        //   130: aload_0        
        //   131: invokespecial   X/0m6.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicCancelDialog;)V
        //   134: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   137: aload_0        
        //   138: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicCancelDialog.LIZIZ:Z
        //   141: ifeq            165
        //   144: aload_1        
        //   145: ldc             2131367499
        //   147: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   150: astore_1       
        //   151: aload_1        
        //   152: ldc             ""
        //   154: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   157: aload_1        
        //   158: checkcast       Landroid/widget/LinearLayout;
        //   161: iconst_0       
        //   162: invokevirtual   android/widget/LinearLayout.setVisibility:(I)V
        //   165: return         
        //   166: aload_2        
        //   167: ldc             2131828966
        //   169: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   172: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   175: aload_2        
        //   176: new             LX/0m5;
        //   179: dup            
        //   180: aload_0        
        //   181: invokespecial   X/0m5.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicCancelDialog;)V
        //   184: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   187: goto            117
        //   190: ldc             2131829225
        //   192: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   195: astore_2       
        //   196: goto            75
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
}
