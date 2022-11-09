// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.dialog;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import X.0cb;
import X.1so;
import X.1ib;
import X.Q6a;
import X.VR3;
import X.CTM;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.n;
import android.content.Context;
import X.0et;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.2P9;
import X.QgG;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class GameScreenShareTipsDialog extends LiveDialogFragment
{
    public QgG<2P9> LIZ;
    public HashMap LIZIZ;
    
    static {
        Covode.recordClassIndex(5332);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561915);
        fpL.LIZIZ = 2131887257;
        fpL.LJIIJJI = 48;
        fpL.LJI = 80;
        fpL.LJIIIIZZ = -2;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZIZ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LIZIZ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.clear();
        }
    }
    
    public final LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        final LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(0et.LIZ((Context)((Fragment)this).getActivity()));
        n.LIZIZ((Object)cloneInContext, "");
        return cloneInContext;
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 0Z1 implements View$OnClickListener
        {
            public final /* synthetic */ GameScreenShareTipsDialog LIZ;
            
            static {
                Covode.recordClassIndex(5333);
            }
            
            public 0Z1(final GameScreenShareTipsDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final QgG<2P9> liz = this.LIZ.LIZ;
                if (liz != null) {
                    liz.invoke();
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
        //    10: invokestatic    X/VR3.LIZ:()LX/VR3;
        //    13: ldc             "pm_mt_mobile_gaming_recording_title"
        //    15: invokevirtual   X/VR3.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //    18: astore_2       
        //    19: getstatic       X/Q6a.LIZ:LX/Q6a;
        //    22: aload_2        
        //    23: invokevirtual   X/Q6a.LIZ:(Ljava/lang/String;)Z
        //    26: ifeq            50
        //    29: aload_0        
        //    30: ldc             2131372671
        //    32: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    35: checkcast       LX/1ib;
        //    38: astore_1       
        //    39: aload_1        
        //    40: ldc             ""
        //    42: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    45: aload_1        
        //    46: aload_2        
        //    47: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //    50: invokestatic    X/VR3.LIZ:()LX/VR3;
        //    53: ldc             "pm_mt_mobile_gaming_recording_text"
        //    55: invokevirtual   X/VR3.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //    58: astore_2       
        //    59: getstatic       X/Q6a.LIZ:LX/Q6a;
        //    62: aload_2        
        //    63: invokevirtual   X/Q6a.LIZ:(Ljava/lang/String;)Z
        //    66: ifeq            90
        //    69: aload_0        
        //    70: ldc             2131372669
        //    72: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    75: checkcast       LX/1ib;
        //    78: astore_1       
        //    79: aload_1        
        //    80: ldc             ""
        //    82: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    85: aload_1        
        //    86: aload_2        
        //    87: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //    90: invokestatic    X/VR3.LIZ:()LX/VR3;
        //    93: ldc             "pm_mt_mobile_gaming_button"
        //    95: invokevirtual   X/VR3.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //    98: astore_2       
        //    99: getstatic       X/Q6a.LIZ:LX/Q6a;
        //   102: aload_2        
        //   103: invokevirtual   X/Q6a.LIZ:(Ljava/lang/String;)Z
        //   106: ifeq            130
        //   109: aload_0        
        //   110: ldc             2131372672
        //   112: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   115: checkcast       LX/1so;
        //   118: astore_1       
        //   119: aload_1        
        //   120: ldc             ""
        //   122: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   125: aload_1        
        //   126: aload_2        
        //   127: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   130: aload_0        
        //   131: ldc             2131372670
        //   133: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   136: ldc             "tiktok_live_broadcast_resource"
        //   138: ldc             "ttlive_screen_share_guide.png"
        //   140: invokestatic    X/0cb.LIZ:(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
        //   143: aload_0        
        //   144: ldc             2131372672
        //   146: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   149: checkcast       LX/1so;
        //   152: new             LX/0Z1;
        //   155: dup            
        //   156: aload_0        
        //   157: invokespecial   X/0Z1.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameScreenShareTipsDialog;)V
        //   160: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   163: return         
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
