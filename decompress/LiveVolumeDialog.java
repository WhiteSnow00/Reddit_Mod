// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.music;

import androidx.fragment.app.DialogFragment;
import X.44T;
import androidx.fragment.app.Fragment;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View$OnClickListener;
import android.os.Bundle;
import X.44V;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.Gkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicDefaultVolumeSetting;
import kotlin.jvm.internal.n;
import X.GST;
import X.0hc;
import X.CTM;
import android.content.DialogInterface;
import android.view.View;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.GK4;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class LiveVolumeDialog extends LiveDialogFragment
{
    public final GK4 LIZ;
    public HashMap LIZIZ;
    
    static {
        Covode.recordClassIndex(6433);
    }
    
    public LiveVolumeDialog() {
        this.LIZ = GK4.PANEL_MUSIC;
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561933);
        fpL.LJI = 80;
        fpL.LJIIIIZZ = -1;
        fpL.LJFF = 0.0f;
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
    
    public final GK4 d_() {
        return this.LIZ;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        super.onDismiss(dialogInterface);
        final DataChannel ljil = super.LJIL;
        final int lizlll = 0hc.LJIILJJIL.LIZLLL();
        final 44V llzllll = GST.LLZLLLL;
        n.LIZIZ((Object)llzllll, "");
        final boolean liz = n.LIZ((Float)((44T)llzllll).LIZ(), LiveBgMusicDefaultVolumeSetting.INSTANCE.getValue());
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_anchor_ksong_volume_select");
        liz2.LIZ(ljil);
        liz2.LIZ("volume_value", lizlll);
        String s;
        if (liz) {
            s = "1";
        }
        else {
            s = "0";
        }
        liz2.LIZ("is_default_value", s);
        liz2.LIZLLL();
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 0hR implements View$OnClickListener
        {
            public final /* synthetic */ LiveVolumeDialog LIZ;
            
            static {
                Covode.recordClassIndex(6436);
            }
            
            public 0hR(final LiveVolumeDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                ((DialogFragment)this.LIZ).dismiss();
            }
        }
        public final class 0hQ implements View$OnClickListener
        {
            public final /* synthetic */ LiveVolumeDialog LIZ;
            
            static {
                Covode.recordClassIndex(6435);
            }
            
            public 0hQ(final LiveVolumeDialog liz) {
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
        //    11: ldc             2131363920
        //    13: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    16: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //    19: astore_1       
        //    20: aload_1        
        //    21: ldc             ""
        //    23: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    26: aload_1        
        //    27: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    30: astore_1       
        //    31: aload_0        
        //    32: invokevirtual   androidx/fragment/app/Fragment.getResources:()Landroid/content/res/Resources;
        //    35: astore_2       
        //    36: aload_2        
        //    37: ldc             ""
        //    39: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    42: aload_1        
        //    43: aload_2        
        //    44: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //    47: getfield        android/util/DisplayMetrics.heightPixels:I
        //    50: bipush          34
        //    52: imul           
        //    53: bipush          100
        //    55: idiv           
        //    56: putfield        android/view/ViewGroup$LayoutParams.height:I
        //    59: aload_0        
        //    60: ldc             2131369029
        //    62: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    65: new             LX/0hQ;
        //    68: dup            
        //    69: aload_0        
        //    70: invokespecial   X/0hQ.<init>:(Lcom/bytedance/android/live/effect/music/LiveVolumeDialog;)V
        //    73: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    76: aload_0        
        //    77: ldc             2131368496
        //    79: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    82: checkcast       LX/SRo;
        //    85: ldc             2131100567
        //    87: invokestatic    X/0cB.LIZIZ:(I)I
        //    90: ldc             2131100565
        //    92: invokestatic    X/0cB.LIZIZ:(I)I
        //    95: ldc             2131100566
        //    97: invokestatic    X/0cB.LIZIZ:(I)I
        //   100: invokevirtual   X/SRo.LIZ:(III)V
        //   103: aload_0        
        //   104: ldc             2131368496
        //   106: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   109: checkcast       LX/SRo;
        //   112: sipush          200
        //   115: iconst_0       
        //   116: iconst_0       
        //   117: iconst_1       
        //   118: invokevirtual   X/SRo.LIZ:(IIIZ)V
        //   121: aload_0        
        //   122: ldc             2131368496
        //   124: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   127: checkcast       LX/SRo;
        //   130: astore_1       
        //   131: aload_1        
        //   132: ldc             ""
        //   134: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   137: aload_1        
        //   138: getstatic       X/0hc.LJIILJJIL:LX/0hc;
        //   141: invokevirtual   X/0hc.LIZLLL:()I
        //   144: invokevirtual   X/SRo.setPercent:(I)V
        //   147: aload_0        
        //   148: ldc             2131368496
        //   150: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   153: checkcast       LX/SRo;
        //   156: new             LX/1jA;
        //   159: dup            
        //   160: invokespecial   X/1jA.<init>:()V
        //   163: invokevirtual   X/SRo.setOnLevelChangeListener:(LX/SRp;)V
        //   166: aload_0        
        //   167: ldc             2131372365
        //   169: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   172: checkcast       LX/1ib;
        //   175: new             LX/0hR;
        //   178: dup            
        //   179: aload_0        
        //   180: invokespecial   X/0hR.<init>:(Lcom/bytedance/android/live/effect/music/LiveVolumeDialog;)V
        //   183: invokevirtual   X/1ib.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   186: return         
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
