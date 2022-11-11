// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.dialog;

import androidx.fragment.app.Fragment;
import X.0cd;
import X.1ib;
import X.Q6a;
import X.VR3;
import X.1so;
import X.1si;
import X.CTM;
import android.graphics.drawable.Animatable;
import X.0ce;
import X.GIK;
import X.Fk2;
import X.Gkn;
import X.6JE;
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
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class GameFloatWindowTipsDialog extends LiveDialogFragment
{
    public String LIZ;
    public HashMap LIZIZ;
    
    static {
        Covode.recordClassIndex(5314);
    }
    
    public GameFloatWindowTipsDialog() {
        this.LIZ = "";
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561813);
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
    
    public final void onViewCreated(final View viewById, final Bundle bundle) {
        public final class 1GQ extends 0ce
        {
            static {
                Covode.recordClassIndex(5315);
            }
            
            @Override
            public final void LIZ(final Animatable animatable) {
                CTM.LIZ((Object)animatable);
            }
        }
        public final class 0Yu implements View$OnClickListener
        {
            public final /* synthetic */ GameFloatWindowTipsDialog LIZ;
            
            static {
                Covode.recordClassIndex(5316);
            }
            
            public 0Yu(final GameFloatWindowTipsDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                6JE.LIZIZ(((Fragment)this.LIZ).getContext());
                final GameFloatWindowTipsDialog liz = this.LIZ;
                final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_overlay_permission_banner_click");
                final GIK liziz = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz, "");
                liz2.LIZ("anchor_id", liziz.LIZJ());
                liz2.LIZ("scene_type", liz.LIZ);
                liz2.LIZLLL();
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
        //    11: ldc             2131372666
        //    13: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    16: astore_2       
        //    17: aload_2        
        //    18: ldc             ""
        //    20: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: aload_2        
        //    24: checkcast       LX/1si;
        //    27: astore_2       
        //    28: aload_1        
        //    29: ldc             2131372668
        //    31: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    34: astore_1       
        //    35: aload_1        
        //    36: ldc             ""
        //    38: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    41: aload_1        
        //    42: checkcast       LX/1so;
        //    45: astore_1       
        //    46: invokestatic    X/VR3.LIZ:()LX/VR3;
        //    49: ldc             "pm_mt_mobile_gaming_floating_window_title"
        //    51: invokevirtual   X/VR3.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //    54: astore_3       
        //    55: getstatic       X/Q6a.LIZ:LX/Q6a;
        //    58: aload_3        
        //    59: invokevirtual   X/Q6a.LIZ:(Ljava/lang/String;)Z
        //    62: ifeq            89
        //    65: aload_0        
        //    66: ldc             2131372667
        //    68: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    71: checkcast       LX/1ib;
        //    74: astore          4
        //    76: aload           4
        //    78: ldc             ""
        //    80: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    83: aload           4
        //    85: aload_3        
        //    86: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //    89: invokestatic    X/VR3.LIZ:()LX/VR3;
        //    92: ldc             "pm_mt_mobile_gaming_floating_window_text"
        //    94: invokevirtual   X/VR3.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //    97: astore_3       
        //    98: getstatic       X/Q6a.LIZ:LX/Q6a;
        //   101: aload_3        
        //   102: invokevirtual   X/Q6a.LIZ:(Ljava/lang/String;)Z
        //   105: ifeq            132
        //   108: aload_0        
        //   109: ldc             2131372665
        //   111: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   114: checkcast       LX/1ib;
        //   117: astore          4
        //   119: aload           4
        //   121: ldc             ""
        //   123: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   126: aload           4
        //   128: aload_3        
        //   129: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   132: invokestatic    X/VR3.LIZ:()LX/VR3;
        //   135: ldc             "pm_mt_mobile_gaming_floating_window_button"
        //   137: invokevirtual   X/VR3.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //   140: astore          4
        //   142: getstatic       X/Q6a.LIZ:LX/Q6a;
        //   145: aload           4
        //   147: invokevirtual   X/Q6a.LIZ:(Ljava/lang/String;)Z
        //   150: ifeq            175
        //   153: aload_0        
        //   154: ldc             2131372668
        //   156: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   159: checkcast       LX/1so;
        //   162: astore_3       
        //   163: aload_3        
        //   164: ldc             ""
        //   166: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   169: aload_3        
        //   170: aload           4
        //   172: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   175: new             LX/0cd;
        //   178: dup            
        //   179: invokespecial   X/0cd.<init>:()V
        //   182: astore          4
        //   184: aload           4
        //   186: aload_2        
        //   187: invokevirtual   X/0cd.LIZ:(LX/1si;)LX/0cd;
        //   190: pop            
        //   191: aload           4
        //   193: ldc             "tiktok_live_broadcast_resource"
        //   195: invokevirtual   X/0cd.LIZ:(Ljava/lang/String;)LX/0cd;
        //   198: pop            
        //   199: aload           4
        //   201: ldc             "ttlive_float_window_permission_guide.webp"
        //   203: invokevirtual   X/0cd.LIZIZ:(Ljava/lang/String;)LX/0cd;
        //   206: pop            
        //   207: aload           4
        //   209: iconst_1       
        //   210: putfield        X/0cd.LJ:Z
        //   213: aload           4
        //   215: ldc             2147483647
        //   217: putfield        X/0cd.LJI:I
        //   220: aload           4
        //   222: new             LX/1GQ;
        //   225: dup            
        //   226: invokespecial   X/1GQ.<init>:()V
        //   229: invokevirtual   X/0cd.LIZ:(LX/0ce;)LX/0cd;
        //   232: pop            
        //   233: aload           4
        //   235: invokestatic    X/0cb.LIZ:(LX/0cd;)V
        //   238: aload_1        
        //   239: new             LX/0Yu;
        //   242: dup            
        //   243: aload_0        
        //   244: invokespecial   X/0Yu.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameFloatWindowTipsDialog;)V
        //   247: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   250: return         
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
