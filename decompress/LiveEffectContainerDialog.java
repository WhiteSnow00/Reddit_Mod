// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect;

import androidx.fragment.app.Fragment;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import X.CTM;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import X.0gz;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0gb;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class LiveEffectContainerDialog extends LiveDialogFragment
{
    public 0gb LIZ;
    public HashMap LIZIZ;
    
    static {
        Covode.recordClassIndex(6152);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561945);
        0gz.LIZ(fpL);
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
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final 0gb liz = this.LIZ;
        if (liz != null) {
            liz.LIZ((DialogFragment)this);
        }
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        MethodCollector.i(2768);
        CTM.LIZ((Object)dialogInterface);
        super.onDismiss(dialogInterface);
        final 0gb liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ();
        }
        final View view = ((Fragment)this).getView();
        if (view != null) {
            final FrameLayout frameLayout = (FrameLayout)view.findViewById(2131364731);
            if (frameLayout != null) {
                final 0gb liz2 = this.LIZ;
                View lizj;
                if (liz2 != null) {
                    lizj = liz2.LIZJ();
                }
                else {
                    lizj = null;
                }
                frameLayout.removeView(lizj);
            }
        }
        this.LIZ = null;
        MethodCollector.o(2768);
    }
    
    public final void onStart() {
        super.onStart();
        0gz.LIZ((DialogFragment)this);
        final 0gb liz = this.LIZ;
        if (liz != null) {
            liz.LIZ();
        }
    }
    
    public final void onViewCreated(final View lizj, final Bundle bundle) {
        public final class 0ft implements View$OnClickListener
        {
            public final /* synthetic */ LiveEffectContainerDialog LIZ;
            
            static {
                Covode.recordClassIndex(6153);
            }
            
            public 0ft(final LiveEffectContainerDialog liz) {
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
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_1        
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    10: aload_0        
        //    11: aload_1        
        //    12: aload_2        
        //    13: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    16: aload_1        
        //    17: new             LX/0ft;
        //    20: dup            
        //    21: aload_0        
        //    22: invokespecial   X/0ft.<init>:(Lcom/bytedance/android/live/effect/LiveEffectContainerDialog;)V
        //    25: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    28: aload_0        
        //    29: getfield        com/bytedance/android/live/effect/LiveEffectContainerDialog.LIZ:LX/0gb;
        //    32: astore_3       
        //    33: aconst_null    
        //    34: astore_2       
        //    35: aload_3        
        //    36: ifnull          57
        //    39: aload_3        
        //    40: invokeinterface X/0gb.LIZJ:()Landroid/view/View;
        //    45: astore_3       
        //    46: aload_3        
        //    47: ifnull          57
        //    50: aload_3        
        //    51: invokevirtual   android/view/View.getParent:()Landroid/view/ViewParent;
        //    54: ifnonnull       100
        //    57: aload_1        
        //    58: ldc             2131364731
        //    60: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    63: checkcast       Landroid/widget/FrameLayout;
        //    66: astore_3       
        //    67: aload_0        
        //    68: getfield        com/bytedance/android/live/effect/LiveEffectContainerDialog.LIZ:LX/0gb;
        //    71: astore          4
        //    73: aload_2        
        //    74: astore_1       
        //    75: aload           4
        //    77: ifnull          88
        //    80: aload           4
        //    82: invokeinterface X/0gb.LIZJ:()Landroid/view/View;
        //    87: astore_1       
        //    88: aload_3        
        //    89: aload_1        
        //    90: invokevirtual   android/widget/FrameLayout.addView:(Landroid/view/View;)V
        //    93: sipush          2740
        //    96: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    99: return         
        //   100: aload_0        
        //   101: invokevirtual   androidx/fragment/app/DialogFragment.dismiss:()V
        //   104: sipush          2740
        //   107: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   110: return         
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
